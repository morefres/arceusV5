package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class o extends g<l7.b> {

    public class a extends t7.c<l7.b> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t7.b f20240d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t7.c f20241e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l7.b f20242f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o f20243g;

        public a(o oVar, t7.b bVar, t7.c cVar, l7.b bVar2) {
            this.f20240d = bVar;
            this.f20241e = cVar;
            this.f20242f = bVar2;
            this.f20243g = oVar;
        }

        @Override // t7.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public l7.b a(t7.b<l7.b> bVar) {
            this.f20240d.h(bVar.f(), bVar.a(), bVar.g().f23245a, bVar.b().f23245a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f20241e.a(this.f20240d);
            l7.b b = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f20242f.a(str, b.b, b.f23246c, b.f23247d, b.f23248e, b.f23249f, b.f23250g, b.f23251h, b.f23252i, b.f23253j, b.f23254k, b.f23255l, b.f23256m);
            return this.f20242f;
        }
    }

    public o(List<t7.a<l7.b>> list) {
        super(list);
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public l7.b i(t7.a<l7.b> aVar, float f10) {
        l7.b bVar;
        t7.c<A> cVar = this.f20200e;
        if (cVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f32052c) == null) ? aVar.b : bVar;
        }
        float f11 = aVar.f32056g;
        Float f12 = aVar.f32057h;
        float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        l7.b bVar2 = aVar.b;
        l7.b bVar3 = bVar2;
        l7.b bVar4 = aVar.f32052c;
        return (l7.b) cVar.b(f11, floatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(t7.c<String> cVar) {
        super.o(new a(this, new t7.b(), cVar, new l7.b()));
    }
}
