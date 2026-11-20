package ee;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class y0 extends u0 {
    public final /* synthetic */ f b;

    public y0(f fVar) {
        this.b = fVar;
    }

    @Override // ee.u0
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        t0 t0Var;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        t0 t0Var2;
        obj = this.b.f15983f;
        synchronized (obj) {
            try {
                atomicInteger = this.b.f15989l;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.b.f15989l;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        t0Var2 = this.b.b;
                        t0Var2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                f fVar = this.b;
                iInterface = fVar.f15991n;
                if (iInterface != null) {
                    t0Var = fVar.b;
                    t0Var.c("Unbind from service.", new Object[0]);
                    f fVar2 = this.b;
                    context = fVar2.f15979a;
                    serviceConnection = fVar2.f15990m;
                    context.unbindService(serviceConnection);
                    this.b.f15984g = false;
                    this.b.f15991n = null;
                    this.b.f15990m = null;
                }
                this.b.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
