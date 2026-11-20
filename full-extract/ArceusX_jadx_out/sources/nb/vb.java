package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26732a;
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f26733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f26734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26735e;

    public vb(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f26732a = zzrVar;
        this.b = z11;
        this.f26733c = zzbeVar;
        this.f26734d = bundle;
        Objects.requireNonNull(tcVar);
        this.f26735e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26735e;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (tcVar.f26328a.w().H(null, z4.f26859c1)) {
            zzr zzrVar = this.f26732a;
            n9.m.l(zzrVar);
            this.f26735e.b0(N, this.b ? null : this.f26733c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f26732a;
            n9.m.l(zzrVar2);
            N.E1(this.f26734d, zzrVar2);
            tcVar.J();
        } catch (RemoteException e10) {
            this.f26735e.f26328a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
