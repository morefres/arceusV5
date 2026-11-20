package ib;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i extends e {
    public final /* synthetic */ o b;

    public i(o oVar) {
        Objects.requireNonNull(oVar);
        this.b = oVar;
    }

    @Override // ib.e
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        d dVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        d dVar2;
        o oVar = this.b;
        obj = oVar.f20374f;
        synchronized (obj) {
            try {
                atomicInteger = oVar.f20379k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = oVar.f20379k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        dVar2 = oVar.b;
                        dVar2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                iInterface = oVar.f20381m;
                if (iInterface != null) {
                    dVar = oVar.b;
                    dVar.c("Unbind from service.", new Object[0]);
                    context = oVar.f20370a;
                    serviceConnection = oVar.f20380l;
                    context.unbindService(serviceConnection);
                    oVar.f20375g = false;
                    oVar.f20381m = null;
                    oVar.f20380l = null;
                }
                oVar.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
