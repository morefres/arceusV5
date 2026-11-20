package xo;

/* loaded from: classes3.dex */
public final class g implements dt.d<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<wn.d> f35840a;
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<ju.l0> f35841c;

    public g(dt.i<wn.d> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, dt.i<ju.l0> iVar3) {
        this.f35840a = iVar;
        this.b = iVar2;
        this.f35841c = iVar3;
    }

    public static g a(dt.i<wn.d> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, dt.i<ju.l0> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(wn.d dVar, com.withpersona.sdk2.inquiry.internal.network.e eVar, ju.l0 l0Var) {
        return new f(dVar, eVar, l0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f35840a.get(), this.b.get(), this.f35841c.get());
    }
}
