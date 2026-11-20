package xo;

/* loaded from: classes3.dex */
public final class j implements dt.d<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f35868a;
    public final dt.i<sm.w> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<lp.b> f35869c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<ju.p0> f35870d;

    public j(dt.i<ep.w> iVar, dt.i<sm.w> iVar2, dt.i<lp.b> iVar3, dt.i<ju.p0> iVar4) {
        this.f35868a = iVar;
        this.b = iVar2;
        this.f35869c = iVar3;
        this.f35870d = iVar4;
    }

    public static j a(dt.i<ep.w> iVar, dt.i<sm.w> iVar2, dt.i<lp.b> iVar3, dt.i<ju.p0> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(ep.w wVar, sm.w wVar2, lp.b bVar, ju.p0 p0Var) {
        return new i(wVar, wVar2, bVar, p0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f35868a.get(), this.b.get(), this.f35869c.get(), this.f35870d.get());
    }
}
