package dn;

/* loaded from: classes3.dex */
public final class o0 implements dt.d<n0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<r0> f15119a;
    public final dt.i<mu.b0<in.c>> b;

    public o0(dt.i<r0> iVar, dt.i<mu.b0<in.c>> iVar2) {
        this.f15119a = iVar;
        this.b = iVar2;
    }

    public static o0 a(dt.i<r0> iVar, dt.i<mu.b0<in.c>> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static n0 c(r0 r0Var, mu.b0<in.c> b0Var) {
        return new n0(r0Var, b0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f15119a.get(), this.b.get());
    }
}
