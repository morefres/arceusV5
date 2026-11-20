package n0;

import android.os.SystemClock;
import g0.c2;
import n0.j1;

/* loaded from: classes.dex */
public final class z0 implements c2.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25675a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25676c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f25677d;

    public z0(long j10, int i10, Throwable th2) {
        this.f25676c = SystemClock.elapsedRealtime() - j10;
        this.b = i10;
        if (th2 instanceof j1.b) {
            this.f25675a = 2;
            this.f25677d = th2;
            return;
        }
        if (!(th2 instanceof g0.p1)) {
            this.f25675a = 0;
            this.f25677d = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.f25677d = th2;
        if (th2 instanceof g0.x) {
            this.f25675a = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.f25675a = 1;
        } else {
            this.f25675a = 0;
        }
    }

    @Override // g0.c2.b
    public int m() {
        return this.f25675a;
    }

    @Override // g0.c2.b
    public Throwable n() {
        return this.f25677d;
    }

    @Override // g0.c2.b
    public long o() {
        return this.f25676c;
    }
}
