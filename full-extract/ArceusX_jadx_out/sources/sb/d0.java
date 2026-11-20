package sb;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30996a;
    public final /* synthetic */ e0 b;

    public d0(e0 e0Var, Task task) {
        this.b = e0Var;
        this.f30996a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        g gVar;
        g gVar2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                e0 e0Var = this.b;
                gVar = e0Var.f30998c;
                if (gVar != null) {
                    gVar2 = e0Var.f30998c;
                    gVar2.onSuccess(this.f30996a.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
