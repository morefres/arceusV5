package sb;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f31024a;
    public final /* synthetic */ u b;

    public t(u uVar, Task task) {
        this.b = uVar;
        this.f31024a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        c cVar;
        n0 n0Var4;
        n0 n0Var5;
        if (this.f31024a.l()) {
            n0Var5 = this.b.f31026c;
            n0Var5.r();
            return;
        }
        try {
            cVar = this.b.b;
            Object then = cVar.then(this.f31024a);
            n0Var4 = this.b.f31026c;
            n0Var4.q(then);
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                n0Var3 = this.b.f31026c;
                n0Var3.p((Exception) e10.getCause());
            } else {
                n0Var2 = this.b.f31026c;
                n0Var2.p(e10);
            }
        } catch (Exception e11) {
            n0Var = this.b.f31026c;
            n0Var.p(e11);
        }
    }
}
