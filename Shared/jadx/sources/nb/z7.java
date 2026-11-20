package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class z7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26921a;
    public final /* synthetic */ Bundle b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26922c;

    public z7(i8 i8Var, zzr zzrVar, Bundle bundle) {
        this.f26921a = zzrVar;
        this.b = bundle;
        Objects.requireNonNull(i8Var);
        this.f26922c = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f26922c;
        i8Var.z2().E();
        return i8Var.z2().q0(this.f26921a, this.b);
    }
}
