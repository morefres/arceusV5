package nq;

import ju.p0;

/* loaded from: classes3.dex */
public final class d implements dt.d<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<e> f27293a;
    public final dt.i<p0> b;

    public d(dt.i<e> iVar, dt.i<p0> iVar2) {
        this.f27293a = iVar;
        this.b = iVar2;
    }

    public static d a(dt.i<e> iVar, dt.i<p0> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(e eVar, p0 p0Var) {
        return new c(eVar, p0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f27293a.get(), this.b.get());
    }
}
