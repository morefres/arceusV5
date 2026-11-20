package be;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class v1 extends r1 {
    public final /* synthetic */ g b;

    public v1(g gVar) {
        this.b = gVar;
    }

    @Override // be.r1
    public final void c() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        q1 q1Var;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        q1 q1Var2;
        obj = this.b.f3965f;
        synchronized (obj) {
            try {
                atomicInteger = this.b.f3970k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.b.f3970k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        q1Var2 = this.b.b;
                        q1Var2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                g gVar = this.b;
                iInterface = gVar.f3972m;
                if (iInterface != null) {
                    q1Var = gVar.b;
                    q1Var.d("Unbind from service.", new Object[0]);
                    g gVar2 = this.b;
                    context = gVar2.f3961a;
                    serviceConnection = gVar2.f3971l;
                    context.unbindService(serviceConnection);
                    this.b.f3966g = false;
                    this.b.f3972m = null;
                    this.b.f3971l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
