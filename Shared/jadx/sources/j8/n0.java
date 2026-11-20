package j8;

/* loaded from: classes.dex */
public final class n0 implements d8.b<m0> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<l8.a> f21558a;
    public final ft.a<l8.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.a<e> f21559c;

    /* renamed from: d, reason: collision with root package name */
    public final ft.a<t0> f21560d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.a<String> f21561e;

    public n0(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<e> aVar3, ft.a<t0> aVar4, ft.a<String> aVar5) {
        this.f21558a = aVar;
        this.b = aVar2;
        this.f21559c = aVar3;
        this.f21560d = aVar4;
        this.f21561e = aVar5;
    }

    public static n0 a(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<e> aVar3, ft.a<t0> aVar4, ft.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(l8.a aVar, l8.a aVar2, Object obj, Object obj2, ft.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f21558a.get(), this.b.get(), this.f21559c.get(), this.f21560d.get(), this.f21561e);
    }
}
