package nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26517a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8 f26519d;

    public o7(i8 i8Var, String str, String str2, String str3) {
        this.f26517a = str;
        this.b = str2;
        this.f26518c = str3;
        Objects.requireNonNull(i8Var);
        this.f26519d = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.f26519d;
        i8Var.z2().E();
        return i8Var.z2().F0().D0(this.f26517a, this.b, this.f26518c);
    }
}
