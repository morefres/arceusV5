package nb;

import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26772a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26773c;

    public w7(i8 i8Var, zzbg zzbgVar, String str) {
        this.f26772a = zzbgVar;
        this.b = str;
        Objects.requireNonNull(i8Var);
        this.f26773c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.f26773c;
        i8Var.z2().E();
        i8Var.z2().i(this.f26772a, this.b);
    }
}
