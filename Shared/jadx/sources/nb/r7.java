package nb;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26629a;
    public final /* synthetic */ i8 b;

    public r7(i8 i8Var, zzr zzrVar) {
        this.f26629a = zzrVar;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        me z22 = i8Var.z2();
        z22.b().h();
        z22.O0();
        zzr zzrVar = this.f26629a;
        n9.m.f(zzrVar.f7494f);
        z22.o0(zzrVar);
    }
}
