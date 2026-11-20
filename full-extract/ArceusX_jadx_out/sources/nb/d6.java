package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26151a;
    public final /* synthetic */ e6 b;

    public d6(e6 e6Var, boolean z10) {
        this.f26151a = z10;
        Objects.requireNonNull(e6Var);
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().s0(this.f26151a);
    }
}
