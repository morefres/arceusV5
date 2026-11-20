package sb;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f31027a;
    public final /* synthetic */ w b;

    public v(w wVar, Task task) {
        this.b = wVar;
        this.f31027a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        c cVar;
        try {
            cVar = this.b.b;
            Task task = (Task) cVar.then(this.f31027a);
            if (task == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            w wVar = this.b;
            Executor executor = l.b;
            task.f(executor, wVar);
            task.d(executor, this.b);
            task.a(executor, this.b);
        } catch (i e10) {
            if (e10.getCause() instanceof Exception) {
                n0Var3 = this.b.f31029c;
                n0Var3.p((Exception) e10.getCause());
            } else {
                n0Var2 = this.b.f31029c;
                n0Var2.p(e10);
            }
        } catch (Exception e11) {
            n0Var = this.b.f31029c;
            n0Var.p(e11);
        }
    }
}
