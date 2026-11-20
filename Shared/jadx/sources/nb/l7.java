package nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f26429a;
    public final /* synthetic */ zzr b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26430c;

    public l7(i8 i8Var, zzah zzahVar, zzr zzrVar) {
        this.f26429a = zzahVar;
        this.b = zzrVar;
        Objects.requireNonNull(i8Var);
        this.f26430c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.f26430c;
        i8Var.z2().E();
        zzah zzahVar = this.f26429a;
        if (zzahVar.f7460h.zza() == null) {
            i8Var.z2().m0(zzahVar, this.b);
        } else {
            i8Var.z2().k0(zzahVar, this.b);
        }
    }
}
