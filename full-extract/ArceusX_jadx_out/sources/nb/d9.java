package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26156a;
    public final /* synthetic */ qa b;

    public d9(qa qaVar, boolean z10) {
        this.f26156a = z10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        g7 g7Var = qaVar.f26328a;
        boolean g10 = g7Var.g();
        boolean f10 = g7Var.f();
        boolean z10 = this.f26156a;
        g7Var.P(z10);
        if (f10 == z10) {
            g7Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (g7Var.g() == g10 || g7Var.g() != g7Var.f()) {
            g7Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(g10));
        }
        qaVar.Y();
    }
}
