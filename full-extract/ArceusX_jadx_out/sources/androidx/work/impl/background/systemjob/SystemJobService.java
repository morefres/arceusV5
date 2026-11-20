package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import f6.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x5.w;
import y5.b1;
import y5.d1;
import y5.e;
import y5.f1;
import y5.s;
import y5.y;
import y5.z;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3327e = w.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public f1 f3328a;
    public final Map<WorkGenerationalId, JobParameters> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final z f3329c = z.b(false);

    /* renamed from: d, reason: collision with root package name */
    public b1 f3330d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public static int b(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    public static WorkGenerationalId c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        a("onExecuted");
        w.e().a(f3327e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters remove = this.b.remove(workGenerationalId);
        this.f3329c.c(workGenerationalId);
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            f1 p8 = f1.p(getApplicationContext());
            this.f3328a = p8;
            s r8 = p8.r();
            this.f3330d = new d1(r8, this.f3328a.v());
            r8.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            w.e().k(f3327e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f1 f1Var = this.f3328a;
        if (f1Var != null) {
            f1Var.r().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f3328a == null) {
            w.e().a(f3327e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId c10 = c(jobParameters);
        if (c10 == null) {
            w.e().c(f3327e, "WorkSpec id not found!");
            return false;
        }
        if (this.b.containsKey(c10)) {
            w.e().a(f3327e, "Job is already being executed by SystemJobService: " + c10);
            return false;
        }
        w.e().a(f3327e, "onStartJob for " + c10);
        this.b.put(c10, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f3268a = Arrays.asList(a.a(jobParameters));
        }
        if (i10 >= 28) {
            aVar.f3269c = b.a(jobParameters);
        }
        this.f3330d.e(this.f3329c.f(c10), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f3328a == null) {
            w.e().a(f3327e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId c10 = c(jobParameters);
        if (c10 == null) {
            w.e().c(f3327e, "WorkSpec id not found!");
            return false;
        }
        w.e().a(f3327e, "onStopJob for " + c10);
        this.b.remove(c10);
        y c11 = this.f3329c.c(c10);
        if (c11 != null) {
            this.f3330d.c(c11, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f3328a.r().j(c10.getWorkSpecId());
    }
}
