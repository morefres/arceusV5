package sb;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f31014a;
    public final /* synthetic */ Callable b;

    public o0(n0 n0Var, Callable callable) {
        this.f31014a = n0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31014a.q(this.b.call());
        } catch (Exception e10) {
            this.f31014a.p(e10);
        } catch (Throwable th2) {
            this.f31014a.p(new RuntimeException(th2));
        }
    }
}
