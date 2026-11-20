package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.h4 f26145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f26146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, int i10, com.google.android.gms.internal.measurement.h4 h4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f26146h = eVar;
        this.f26145g = h4Var;
    }

    @Override // nb.c
    public final int a() {
        return this.f26145g.G();
    }

    @Override // nb.c
    public final boolean b() {
        return true;
    }

    @Override // nb.c
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.r7 r7Var, boolean z10) {
        com.google.android.gms.internal.measurement.ye.a();
        g7 g7Var = this.f26146h.f26328a;
        boolean H = g7Var.w().H(this.f26080a, z4.E0);
        com.google.android.gms.internal.measurement.h4 h4Var = this.f26145g;
        boolean K = h4Var.K();
        boolean L = h4Var.L();
        boolean O = h4Var.O();
        Object[] objArr = K || L || O;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && objArr != true) {
            g7Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), h4Var.F() ? Integer.valueOf(h4Var.G()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.b4 J = h4Var.J();
        boolean L2 = J.L();
        if (r7Var.L()) {
            if (J.H()) {
                bool = c.e(c.g(r7Var.N(), J.J()), L2);
            } else {
                g7Var.a().r().b("No number filter for long property. property", g7Var.D().c(r7Var.H()));
            }
        } else if (r7Var.Q()) {
            if (J.H()) {
                bool = c.e(c.h(r7Var.R(), J.J()), L2);
            } else {
                g7Var.a().r().b("No number filter for double property. property", g7Var.D().c(r7Var.H()));
            }
        } else if (!r7Var.J()) {
            g7Var.a().r().b("User property has no value, property", g7Var.D().c(r7Var.H()));
        } else if (J.F()) {
            bool = c.e(c.f(r7Var.K(), J.G(), g7Var.a()), L2);
        } else if (!J.H()) {
            g7Var.a().r().b("No string or number filter defined. property", g7Var.D().c(r7Var.H()));
        } else if (re.O(r7Var.K())) {
            bool = c.e(c.i(r7Var.K(), J.J()), L2);
        } else {
            g7Var.a().r().c("Invalid user property value for Numeric number filter. property, value", g7Var.D().c(r7Var.H()), r7Var.K());
        }
        g7Var.a().w().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f26081c = Boolean.TRUE;
        if (O && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || h4Var.K()) {
            this.f26082d = bool;
        }
        if (bool.booleanValue() && objArr != false && r7Var.F()) {
            long G = r7Var.G();
            if (l10 != null) {
                G = l10.longValue();
            }
            if (H && h4Var.K() && !h4Var.L() && l11 != null) {
                G = l11.longValue();
            }
            if (h4Var.L()) {
                this.f26084f = Long.valueOf(G);
            } else {
                this.f26083e = Long.valueOf(G);
            }
        }
        return true;
    }
}
