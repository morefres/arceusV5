package i7;

import android.graphics.Color;
import android.graphics.Matrix;
import i7.a;

/* loaded from: classes3.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final o7.b f20208a;
    public final a.b b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.a<Integer, Integer> f20209c;

    /* renamed from: d, reason: collision with root package name */
    public final d f20210d;

    /* renamed from: e, reason: collision with root package name */
    public final d f20211e;

    /* renamed from: f, reason: collision with root package name */
    public final d f20212f;

    /* renamed from: g, reason: collision with root package name */
    public final d f20213g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f20214h;

    public class a extends t7.c<Float> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t7.c f20215d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f20216e;

        public a(c cVar, t7.c cVar2) {
            this.f20215d = cVar2;
            this.f20216e = cVar;
        }

        @Override // t7.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(t7.b<Float> bVar) {
            Float f10 = (Float) this.f20215d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, o7.b bVar2, q7.j jVar) {
        this.b = bVar;
        this.f20208a = bVar2;
        i7.a<Integer, Integer> a10 = jVar.a().a();
        this.f20209c = a10;
        a10.a(this);
        bVar2.j(a10);
        d a11 = jVar.d().a();
        this.f20210d = a11;
        a11.a(this);
        bVar2.j(a11);
        d a12 = jVar.b().a();
        this.f20211e = a12;
        a12.a(this);
        bVar2.j(a12);
        d a13 = jVar.c().a();
        this.f20212f = a13;
        a13.a(this);
        bVar2.j(a13);
        d a14 = jVar.e().a();
        this.f20213g = a14;
        a14.a(this);
        bVar2.j(a14);
    }

    @Override // i7.a.b
    public void a() {
        this.b.a();
    }

    public s7.b b(Matrix matrix, int i10) {
        float r8 = this.f20211e.r() * 0.017453292f;
        float floatValue = this.f20212f.h().floatValue();
        double d10 = r8;
        float sin = ((float) Math.sin(d10)) * floatValue;
        float cos = ((float) Math.cos(d10 + 3.141592653589793d)) * floatValue;
        float floatValue2 = this.f20213g.h().floatValue();
        int intValue = this.f20209c.h().intValue();
        s7.b bVar = new s7.b(floatValue2 * 0.33f, sin, cos, Color.argb(Math.round((this.f20210d.h().floatValue() * i10) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        bVar.k(matrix);
        if (this.f20214h == null) {
            this.f20214h = new Matrix();
        }
        this.f20208a.f27775x.f().invert(this.f20214h);
        bVar.k(this.f20214h);
        return bVar;
    }

    public void c(t7.c<Integer> cVar) {
        this.f20209c.o(cVar);
    }

    public void d(t7.c<Float> cVar) {
        this.f20211e.o(cVar);
    }

    public void e(t7.c<Float> cVar) {
        this.f20212f.o(cVar);
    }

    public void f(t7.c<Float> cVar) {
        if (cVar == null) {
            this.f20210d.o(null);
        } else {
            this.f20210d.o(new a(this, cVar));
        }
    }

    public void g(t7.c<Float> cVar) {
        this.f20213g.o(cVar);
    }
}
