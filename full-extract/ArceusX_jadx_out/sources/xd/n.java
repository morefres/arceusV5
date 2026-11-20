package xd;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class n extends j {
    public final /* synthetic */ t b;

    public n(t tVar) {
        this.b = tVar;
    }

    @Override // xd.j
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        i iVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        i iVar2;
        obj = this.b.f35514f;
        synchronized (obj) {
            try {
                atomicInteger = this.b.f35519k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.b.f35519k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        iVar2 = this.b.b;
                        iVar2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                t tVar = this.b;
                iInterface = tVar.f35521m;
                if (iInterface != null) {
                    iVar = tVar.b;
                    iVar.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.b;
                    context = tVar2.f35510a;
                    serviceConnection = tVar2.f35520l;
                    context.unbindService(serviceConnection);
                    this.b.f35515g = false;
                    this.b.f35521m = null;
                    this.b.f35520l = null;
                }
                this.b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
