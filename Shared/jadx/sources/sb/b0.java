package sb;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f30993a;
    public final /* synthetic */ c0 b;

    public b0(c0 c0Var, Task task) {
        this.b = c0Var;
        this.f30993a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                c0 c0Var = this.b;
                fVar = c0Var.f30995c;
                if (fVar != null) {
                    fVar2 = c0Var.f30995c;
                    fVar2.onFailure((Exception) n9.m.l(this.f30993a.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
