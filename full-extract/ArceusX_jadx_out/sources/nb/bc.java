package nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26073a;
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzah f26074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26075d;

    public bc(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f26073a = zzrVar;
        this.b = z11;
        this.f26074c = zzahVar;
        Objects.requireNonNull(tcVar);
        this.f26075d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26075d;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f26073a;
        n9.m.l(zzrVar);
        tcVar.b0(N, this.b ? null : this.f26074c, zzrVar);
        tcVar.J();
    }
}
