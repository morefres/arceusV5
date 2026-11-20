package nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26500a;
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpl f26501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26502d;

    public nb(tc tcVar, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f26500a = zzrVar;
        this.b = z10;
        this.f26501c = zzplVar;
        Objects.requireNonNull(tcVar);
        this.f26502d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26502d;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f26500a;
        n9.m.l(zzrVar);
        tcVar.b0(N, this.b ? null : this.f26501c, zzrVar);
        tcVar.J();
    }
}
