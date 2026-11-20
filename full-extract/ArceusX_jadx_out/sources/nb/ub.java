package nb;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ub implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26718a;
    public final /* synthetic */ tc b;

    public ub(tc tcVar, bb bbVar) {
        this.f26718a = bbVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            bb bbVar = this.f26718a;
            if (bbVar == null) {
                N.V0(0L, null, null, tcVar.f26328a.d().getPackageName());
            } else {
                N.V0(bbVar.f26069c, bbVar.f26068a, bbVar.b, tcVar.f26328a.d().getPackageName());
            }
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f26328a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
