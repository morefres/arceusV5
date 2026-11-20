package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ob implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26525a;
    public final /* synthetic */ tc b;

    public ob(tc tcVar, zzr zzrVar) {
        this.f26525a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f26525a;
            n9.m.l(zzrVar);
            N.W0(zzrVar);
        } catch (RemoteException e10) {
            this.b.f26328a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.b.J();
    }
}
