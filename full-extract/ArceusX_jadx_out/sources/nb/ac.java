package nb;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26039a;
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbg f26040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26041d;

    public ac(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzbg zzbgVar, String str) {
        this.f26039a = zzrVar;
        this.b = z11;
        this.f26040c = zzbgVar;
        Objects.requireNonNull(tcVar);
        this.f26041d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26041d;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f26039a;
        n9.m.l(zzrVar);
        tcVar.b0(N, this.b ? null : this.f26040c, zzrVar);
        tcVar.J();
    }
}
