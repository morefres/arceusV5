package nb;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26280a;
    public final /* synthetic */ i8 b;

    public h7(i8 i8Var, String str) {
        this.f26280a = str;
        Objects.requireNonNull(i8Var);
        this.b = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        i8 i8Var = this.b;
        i8Var.z2().E();
        return i8Var.z2().F0().C0(this.f26280a);
    }
}
