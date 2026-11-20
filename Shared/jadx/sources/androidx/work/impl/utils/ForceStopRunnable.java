package androidx.work.impl.utils;

import a6.f;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import f6.d0;
import f6.j0;
import f6.k0;
import g6.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u2.p;
import x5.o0;
import x5.w;
import y5.f1;
import y5.i0;
import y5.x;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3347e = w.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f3348f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3349a;
    public final f1 b;

    /* renamed from: c, reason: collision with root package name */
    public final g6.w f3350c;

    /* renamed from: d, reason: collision with root package name */
    public int f3351d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3352a = w.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            w.e().j(f3352a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, f1 f1Var) {
        this.f3349a = context.getApplicationContext();
        this.b = f1Var;
        this.f3350c = f1Var.q();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f3348f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = f.i(this.f3349a, this.b.u());
        WorkDatabase u8 = this.b.u();
        k0 c02 = u8.c0();
        d0 b02 = u8.b0();
        u8.i();
        try {
            List<j0> w5 = c02.w();
            boolean z10 = (w5 == null || w5.isEmpty()) ? false : true;
            if (z10) {
                for (j0 j0Var : w5) {
                    c02.c(o0.c.f35307a, j0Var.id);
                    c02.e(j0Var.id, -512);
                    c02.q(j0Var.id, -1L);
                }
            }
            b02.c();
            u8.V();
            u8.p();
            return z10 || i10;
        } catch (Throwable th2) {
            u8.p();
            throw th2;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            w.e().a(f3347e, "Rescheduling Workers.");
            this.b.x();
            this.b.q().e(false);
        } else if (e()) {
            w.e().a(f3347e, "Application was force-stopped, rescheduling.");
            this.b.x();
            this.f3350c.d(this.b.n().getClock().a());
        } else if (a10) {
            w.e().a(f3347e, "Found unfinished work, scheduling it.");
            x.f(this.b.n(), this.b.u(), this.b.s());
        }
    }

    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f3349a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f3349a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a10 = this.f3350c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo a11 = l.a(historicalProcessExitReasons.get(i11));
                        if (a11.getReason() == 10 && a11.getTimestamp() >= a10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f3349a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            w.e().l(f3347e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            w.e().l(f3347e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a n10 = this.b.n();
        if (TextUtils.isEmpty(n10.getDefaultProcessName())) {
            w.e().a(f3347e, "The default process name was not specified.");
            return true;
        }
        boolean b = g6.x.b(this.f3349a, n10);
        w.e().a(f3347e, "Is default app process = " + b);
        return b;
    }

    public boolean h() {
        return this.b.q().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        i0.c(this.f3349a);
                        w.e().a(f3347e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f3351d + 1;
                            this.f3351d = i10;
                            if (i10 >= 3) {
                                String str = p.a(this.f3349a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                w e11 = w.e();
                                String str2 = f3347e;
                                e11.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                x2.a<Throwable> e12 = this.b.n().e();
                                if (e12 == null) {
                                    throw illegalStateException;
                                }
                                w.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                e12.accept(illegalStateException);
                            } else {
                                w.e().b(f3347e, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f3351d) * 300);
                            }
                        }
                        w.e().b(f3347e, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f3351d) * 300);
                    } catch (SQLiteException e13) {
                        w.e().c(f3347e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                        x2.a<Throwable> e14 = this.b.n().e();
                        if (e14 == null) {
                            throw illegalStateException2;
                        }
                        e14.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.b.w();
        }
    }
}
