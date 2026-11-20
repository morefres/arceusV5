package backtraceio.library;

import android.content.Context;
import backtraceio.library.BacktraceDatabase;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import backtraceio.library.common.FileHelper;
import backtraceio.library.common.TypeHelper;
import backtraceio.library.common.serialization.DebugHelper;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.enums.database.RetryBehavior;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.interfaces.NativeCommunication;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.nativeHandler.CrashHandlerConfiguration;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.nativeCalls.BacktraceCrashHandlerWrapper;
import backtraceio.library.services.BacktraceDatabaseContext;
import backtraceio.library.services.BacktraceDatabaseFileContext;
import j6.b;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class BacktraceDatabase implements Database {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f3924l;

    /* renamed from: m, reason: collision with root package name */
    public static Timer f3925m;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f3926a;
    public Api b;

    /* renamed from: c, reason: collision with root package name */
    public Context f3927c;

    /* renamed from: d, reason: collision with root package name */
    public DatabaseContext f3928d;

    /* renamed from: e, reason: collision with root package name */
    public DatabaseFileContext f3929e;

    /* renamed from: f, reason: collision with root package name */
    public BacktraceDatabaseSettings f3930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3931g;

    /* renamed from: h, reason: collision with root package name */
    public Breadcrumbs f3932h;

    /* renamed from: i, reason: collision with root package name */
    public CrashHandlerConfiguration f3933i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3934j;

    /* renamed from: k, reason: collision with root package name */
    public NativeCommunication f3935k;

    public class a extends TimerTask {

        /* renamed from: backtraceio.library.BacktraceDatabase$a$a, reason: collision with other inner class name */
        public class C0079a implements OnServerResponseEventListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BacktraceDatabaseRecord f3937a;
            public final /* synthetic */ CountDownLatch b;

            public C0079a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f3937a = backtraceDatabaseRecord;
                this.b = countDownLatch;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f3937a);
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - closing record");
                    this.f3937a.close();
                }
                this.b.countDown();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String date = Calendar.getInstance().getTime().toString();
            BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - " + date);
            if (BacktraceDatabase.this.f3928d == null) {
                BacktraceLogger.w(BacktraceDatabase.this.f3926a, "Timer - database context is null: " + date);
                return;
            }
            if (BacktraceDatabase.this.f3928d.isEmpty()) {
                BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - database is empty (no records): " + date);
                return;
            }
            if (BacktraceDatabase.f3924l) {
                BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - another timer works now: " + date);
                return;
            }
            BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - continue working: " + date);
            boolean unused = BacktraceDatabase.f3924l = true;
            BacktraceDatabase.f3925m.cancel();
            BacktraceDatabase.f3925m.purge();
            Timer unused2 = BacktraceDatabase.f3925m = null;
            BacktraceDatabaseRecord first = BacktraceDatabase.this.f3928d.first();
            while (true) {
                if (first == null) {
                    break;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = first.getBacktraceData();
                if (backtraceData != null && backtraceData.getReport() != null) {
                    BacktraceDatabase.this.b.send(backtraceData, new C0079a(first, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        BacktraceLogger.e(BacktraceDatabase.this.f3926a, "Error during waiting for result in Timer", e10);
                    }
                    if (first.valid() && !first.locked) {
                        BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(first);
                }
                first = BacktraceDatabase.this.f3928d.first();
            }
            BacktraceLogger.d(BacktraceDatabase.this.f3926a, "Setup new timer");
            boolean unused3 = BacktraceDatabase.f3924l = false;
            BacktraceDatabase.this.n();
        }
    }

    public BacktraceDatabase() {
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f3926a = simpleName;
        this.f3931g = false;
        this.f3934j = false;
        this.f3935k = new BacktraceCrashHandlerWrapper();
        BacktraceLogger.w(simpleName, "Disabled instance of BacktraceDatabase created, native crashes won't be captured");
    }

    public static /* synthetic */ void a(BacktraceDatabase backtraceDatabase, long j10) {
        backtraceDatabase.getClass();
        backtraceDatabase.addAttribute("breadcrumbs.lastId", Long.toString(j10));
    }

    private native void disable();

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map) {
        return add(backtraceReport, map, false);
    }

    public native void addAttribute(String str, String str2);

    @Override // backtraceio.library.interfaces.Database
    public Boolean addNativeAttribute(String str, Object obj) {
        if (!this.f3934j) {
            return Boolean.FALSE;
        }
        if (str == null || obj == null) {
            return Boolean.FALSE;
        }
        if (!TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(obj.getClass())) {
            return Boolean.FALSE;
        }
        addAttribute(str, obj.toString());
        return Boolean.TRUE;
    }

    @Override // backtraceio.library.interfaces.Database
    public void clear() {
        DatabaseContext databaseContext = this.f3928d;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f3929e;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f3928d;
        if (databaseContext == null || backtraceDatabaseRecord == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.Database
    public void disableNativeIntegration() {
        disable();
        this.f3934j = false;
    }

    @Override // backtraceio.library.interfaces.Database
    public void flush() {
        if (this.b == null) {
            throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
        }
        BacktraceDatabaseRecord first = this.f3928d.first();
        while (first != null) {
            BacktraceData backtraceData = first.getBacktraceData();
            delete(first);
            if (backtraceData != null) {
                this.b.send(backtraceData, null);
            }
            first = this.f3928d.first();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f3928d;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override // backtraceio.library.interfaces.Database
    public Breadcrumbs getBreadcrumbs() {
        return this.f3932h;
    }

    @Override // backtraceio.library.interfaces.Database
    public long getDatabaseSize() {
        return this.f3928d.getDatabaseSize();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseSettings getSettings() {
        return this.f3930f;
    }

    public final String j() {
        return this.f3930f.getDatabasePath();
    }

    public final void k() {
        long currentTimeMillis = System.currentTimeMillis();
        l();
        long currentTimeMillis2 = System.currentTimeMillis();
        BacktraceLogger.d(this.f3926a, "Loading " + this.f3928d.count() + " reports took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
    }

    public final void l() {
        Iterator<File> it = this.f3929e.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord readFromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (readFromFile != null) {
                if (readFromFile.valid()) {
                    this.f3928d.add(readFromFile);
                    o();
                    readFromFile.close();
                } else {
                    readFromFile.delete();
                }
            }
        }
    }

    public final void m() {
        this.f3929e.removeOrphaned(this.f3928d.get());
    }

    public final void n() {
        Timer timer = new Timer();
        f3925m = timer;
        timer.scheduleAtFixedRate(new a(), this.f3930f.getRetryInterval() * 1000, this.f3930f.getRetryInterval() * 1000);
    }

    public final boolean o() {
        if (this.f3928d.count() + 1 > this.f3930f.getMaxRecordCount() && this.f3930f.getMaxRecordCount() != 0 && !this.f3928d.removeOldestRecord()) {
            BacktraceLogger.e(this.f3926a, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f3930f.getMaxDatabaseSize() == 0 || this.f3928d.getDatabaseSize() <= this.f3930f.getMaxDatabaseSize()) {
            return true;
        }
        int i10 = 5;
        while (this.f3928d.getDatabaseSize() > this.f3930f.getMaxDatabaseSize()) {
            this.f3928d.removeOldestRecord();
            i10--;
            if (i10 == 0) {
                break;
            }
        }
        return i10 != 0;
    }

    @Override // backtraceio.library.interfaces.Database
    public void setApi(Api api) {
        this.b = api;
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar) {
        return setupNativeIntegration(backtraceBase, bVar, false);
    }

    @Override // backtraceio.library.interfaces.Database
    public void start() {
        if (this.f3930f == null) {
            return;
        }
        DatabaseContext databaseContext = this.f3928d;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f3931g = true;
            return;
        }
        k();
        m();
        if (this.f3930f.getRetryBehavior() == RetryBehavior.ByInterval || this.f3930f.isAutoSendMode()) {
            n();
        }
        this.f3931g = true;
    }

    @Override // backtraceio.library.interfaces.Database
    public boolean validConsistency() {
        return this.f3929e.validFileConsistency();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10) {
        if (!this.f3931g || backtraceReport == null || !o()) {
            return null;
        }
        return this.f3928d.add(backtraceReport.toBacktraceData(this.f3927c, map, z10));
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10) {
        return setupNativeIntegration(backtraceBase, bVar, z10, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10, UnwindingMode unwindingMode) {
        if (this.f3931g && getSettings() != null) {
            if (!this.f3933i.isSupportedAbi().booleanValue()) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
            String uri = bVar.c().toString();
            if (uri == null) {
                return Boolean.FALSE;
            }
            String useCrashpadDirectory = this.f3933i.useCrashpadDirectory(getSettings().getDatabasePath());
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f3927c, backtraceBase.attributes);
            backtraceAttributes.attributes.put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.CrashAttributeType);
            String[] strArr = (String[]) backtraceAttributes.attributes.keySet().toArray(new String[0]);
            String[] strArr2 = (String[]) backtraceAttributes.attributes.values().toArray(new String[0]);
            int size = backtraceBase.attachments.size();
            String[] strArr3 = new String[size + 1];
            if (backtraceBase.attachments != null) {
                for (int i10 = 0; i10 < backtraceBase.attachments.size(); i10++) {
                    strArr3[i10] = backtraceBase.attachments.get(i10);
                }
            }
            strArr3[size] = this.f3932h.getBreadcrumbLogPath();
            boolean initializeJavaCrashHandler = this.f3935k.initializeJavaCrashHandler(uri, useCrashpadDirectory, this.f3933i.getClassPath(), strArr, strArr2, strArr3, (String[]) this.f3933i.getCrashHandlerEnvironmentVariables(this.f3927c.getApplicationInfo()).toArray(new String[0]));
            this.f3934j = initializeJavaCrashHandler;
            if (initializeJavaCrashHandler && this.f3932h.isEnabled()) {
                this.f3932h.setOnSuccessfulBreadcrumbAddEventListener(new OnSuccessfulBreadcrumbAddEventListener() { // from class: j6.c
                    @Override // backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener
                    public final void onSuccessfulAdd(long j10) {
                        BacktraceDatabase.a(BacktraceDatabase.this, j10);
                    }
                });
            }
            long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
            BacktraceLogger.d(this.f3926a, "Setup native integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return Boolean.valueOf(this.f3934j);
        }
        return Boolean.FALSE;
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f3926a = BacktraceDatabase.class.getSimpleName();
        this.f3931g = false;
        this.f3934j = false;
        this.f3935k = new BacktraceCrashHandlerWrapper();
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f3927c = context;
                this.f3930f = backtraceDatabaseSettings;
                this.f3928d = new BacktraceDatabaseContext(backtraceDatabaseSettings);
                this.f3929e = new BacktraceDatabaseFileContext(j(), this.f3930f.getMaxDatabaseSize(), this.f3930f.getMaxRecordCount());
                this.f3932h = new BacktraceBreadcrumbs(j());
                this.f3933i = new CrashHandlerConfiguration();
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
