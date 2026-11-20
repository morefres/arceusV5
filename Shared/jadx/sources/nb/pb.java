package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26562a;
    public final /* synthetic */ zzr b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f26563c;

    public pb(tc tcVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f26562a = atomicReference;
        this.b = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f26563c = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        tc tcVar;
        g7 g7Var;
        AtomicReference atomicReference2 = this.f26562a;
        synchronized (atomicReference2) {
            try {
                try {
                    tcVar = this.f26563c;
                    g7Var = tcVar.f26328a;
                } catch (RemoteException e10) {
                    this.f26563c.f26328a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f26562a;
                }
                if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
                    d5 N = tcVar.N();
                    if (N != null) {
                        zzr zzrVar = this.b;
                        n9.m.l(zzrVar);
                        atomicReference2.set(N.A0(zzrVar));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            tcVar.f26328a.B().E(str);
                            g7Var.x().f26376h.b(str);
                        }
                        tcVar.J();
                        atomicReference = this.f26562a;
                        atomicReference.notify();
                        return;
                    }
                    g7Var.a().o().a("Failed to get app instance id");
                } else {
                    g7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                    tcVar.f26328a.B().E(null);
                    g7Var.x().f26376h.b(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th2) {
                this.f26562a.notify();
                throw th2;
            }
        }
    }
}
