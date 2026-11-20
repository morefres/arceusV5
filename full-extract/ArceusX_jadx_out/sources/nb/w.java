package nb;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Handler f26751d;

    /* renamed from: a, reason: collision with root package name */
    public final l8 f26752a;
    public final Runnable b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f26753c;

    public w(l8 l8Var) {
        n9.m.l(l8Var);
        this.f26752a = l8Var;
        this.b = new v(this, l8Var);
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            l8 l8Var = this.f26752a;
            this.f26753c = l8Var.e().a();
            if (f().postDelayed(this.b, j10)) {
                return;
            }
            l8Var.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f26753c != 0;
    }

    public final void d() {
        this.f26753c = 0L;
        f().removeCallbacks(this.b);
    }

    public final /* synthetic */ void e(long j10) {
        this.f26753c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (f26751d != null) {
            return f26751d;
        }
        synchronized (w.class) {
            try {
                if (f26751d == null) {
                    f26751d = new com.google.android.gms.internal.measurement.q1(this.f26752a.d().getMainLooper());
                }
                handler = f26751d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
