package b8;

/* loaded from: classes.dex */
public final class v implements d8.b<t> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<l8.a> f3916a;
    public final ft.a<l8.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.a<h8.e> f3917c;

    /* renamed from: d, reason: collision with root package name */
    public final ft.a<i8.r> f3918d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.a<i8.v> f3919e;

    public v(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<h8.e> aVar3, ft.a<i8.r> aVar4, ft.a<i8.v> aVar5) {
        this.f3916a = aVar;
        this.b = aVar2;
        this.f3917c = aVar3;
        this.f3918d = aVar4;
        this.f3919e = aVar5;
    }

    public static v a(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<h8.e> aVar3, ft.a<i8.r> aVar4, ft.a<i8.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(l8.a aVar, l8.a aVar2, h8.e eVar, i8.r rVar, i8.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f3916a.get(), this.b.get(), this.f3917c.get(), this.f3918d.get(), this.f3919e.get());
    }
}
