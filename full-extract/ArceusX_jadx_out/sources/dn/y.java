package dn;

/* loaded from: classes3.dex */
public final class y implements dt.d<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<mu.b0<gt.n<j0>>> f15192a;

    public y(dt.i<mu.b0<gt.n<j0>>> iVar) {
        this.f15192a = iVar;
    }

    public static y a(dt.i<mu.b0<gt.n<j0>>> iVar) {
        return new y(iVar);
    }

    public static x c(mu.b0<gt.n<j0>> b0Var) {
        return new x(b0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f15192a.get());
    }
}
