package sb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f31033a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, Task task) {
        this.b = a0Var;
        this.f31033a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                a0 a0Var = this.b;
                onCompleteListener = a0Var.f30991c;
                if (onCompleteListener != null) {
                    onCompleteListener2 = a0Var.f30991c;
                    onCompleteListener2.onComplete(this.f31033a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
