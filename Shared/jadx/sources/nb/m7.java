package nb;

import com.google.android.gms.measurement.internal.zzah;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f26450a;
    public final /* synthetic */ i8 b;

    public m7(i8 i8Var, zzah zzahVar) {
        this.f26450a = zzahVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        zzah zzahVar = this.f26450a;
        if (zzahVar.f7460h.zza() == null) {
            i8Var.z2().l0(zzahVar);
        } else {
            i8Var.z2().j0(zzahVar);
        }
    }
}
