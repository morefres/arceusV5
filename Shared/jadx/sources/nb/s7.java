package nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26648a;
    public final /* synthetic */ i8 b;

    public s7(i8 i8Var, zzr zzrVar) {
        this.f26648a = zzrVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        i8Var.z2().b0(this.f26648a);
    }
}
