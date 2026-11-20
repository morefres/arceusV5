package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26634a;
    public final /* synthetic */ tc b;

    public rb(tc tcVar, zzr zzrVar, boolean z10) {
        this.f26634a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f26634a;
            n9.m.l(zzrVar);
            g7 g7Var = tcVar.f26328a;
            k w5 = g7Var.w();
            y4 y4Var = z4.f26859c1;
            if (w5.H(null, y4Var)) {
                tcVar.b0(N, null, zzrVar);
            }
            N.K1(zzrVar);
            tcVar.f26328a.E().v();
            g7Var.w().H(null, y4Var);
            tcVar.b0(N, null, zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f26328a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
