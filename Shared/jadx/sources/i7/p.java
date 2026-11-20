package i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import f7.o0;
import i7.a;
import java.util.Collections;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f20244a = new Matrix();
    public final Matrix b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f20245c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f20246d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f20247e;

    /* renamed from: f, reason: collision with root package name */
    public a<PointF, PointF> f20248f;

    /* renamed from: g, reason: collision with root package name */
    public a<?, PointF> f20249g;

    /* renamed from: h, reason: collision with root package name */
    public a<t7.d, t7.d> f20250h;

    /* renamed from: i, reason: collision with root package name */
    public a<Float, Float> f20251i;

    /* renamed from: j, reason: collision with root package name */
    public a<Integer, Integer> f20252j;

    /* renamed from: k, reason: collision with root package name */
    public d f20253k;

    /* renamed from: l, reason: collision with root package name */
    public d f20254l;

    /* renamed from: m, reason: collision with root package name */
    public a<?, Float> f20255m;

    /* renamed from: n, reason: collision with root package name */
    public a<?, Float> f20256n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20257o;

    public p(m7.n nVar) {
        this.f20248f = nVar.c() == null ? null : nVar.c().a();
        this.f20249g = nVar.f() == null ? null : nVar.f().a();
        this.f20250h = nVar.h() == null ? null : nVar.h().a();
        this.f20251i = nVar.g() == null ? null : nVar.g().a();
        this.f20253k = nVar.i() == null ? null : nVar.i().a();
        this.f20257o = nVar.l();
        if (this.f20253k != null) {
            this.b = new Matrix();
            this.f20245c = new Matrix();
            this.f20246d = new Matrix();
            this.f20247e = new float[9];
        } else {
            this.b = null;
            this.f20245c = null;
            this.f20246d = null;
            this.f20247e = null;
        }
        this.f20254l = nVar.j() == null ? null : nVar.j().a();
        if (nVar.e() != null) {
            this.f20252j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f20255m = nVar.k().a();
        } else {
            this.f20255m = null;
        }
        if (nVar.d() != null) {
            this.f20256n = nVar.d().a();
        } else {
            this.f20256n = null;
        }
    }

    public void a(o7.b bVar) {
        bVar.j(this.f20252j);
        bVar.j(this.f20255m);
        bVar.j(this.f20256n);
        bVar.j(this.f20248f);
        bVar.j(this.f20249g);
        bVar.j(this.f20250h);
        bVar.j(this.f20251i);
        bVar.j(this.f20253k);
        bVar.j(this.f20254l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f20252j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f20255m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f20256n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f20248f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f20249g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<t7.d, t7.d> aVar6 = this.f20250h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f20251i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f20253k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f20254l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t8, t7.c<T> cVar) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (t8 == o0.f16986f) {
            a<PointF, PointF> aVar = this.f20248f;
            if (aVar == null) {
                this.f20248f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (t8 == o0.f16987g) {
            a<?, PointF> aVar2 = this.f20249g;
            if (aVar2 == null) {
                this.f20249g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (t8 == o0.f16988h) {
            a<?, PointF> aVar3 = this.f20249g;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (t8 == o0.f16989i) {
            a<?, PointF> aVar4 = this.f20249g;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (t8 == o0.f16995o) {
            a<t7.d, t7.d> aVar5 = this.f20250h;
            if (aVar5 == null) {
                this.f20250h = new q(cVar, new t7.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (t8 == o0.f16996p) {
            a<Float, Float> aVar6 = this.f20251i;
            if (aVar6 == null) {
                this.f20251i = new q(cVar, valueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (t8 == o0.f16983c) {
            a<Integer, Integer> aVar7 = this.f20252j;
            if (aVar7 == null) {
                this.f20252j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (t8 == o0.C) {
            a<?, Float> aVar8 = this.f20255m;
            if (aVar8 == null) {
                this.f20255m = new q(cVar, valueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (t8 == o0.D) {
            a<?, Float> aVar9 = this.f20256n;
            if (aVar9 == null) {
                this.f20256n = new q(cVar, valueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (t8 == o0.f16997q) {
            if (this.f20253k == null) {
                this.f20253k = new d(Collections.singletonList(new t7.a(valueOf2)));
            }
            this.f20253k.o(cVar);
            return true;
        }
        if (t8 != o0.f16998r) {
            return false;
        }
        if (this.f20254l == null) {
            this.f20254l = new d(Collections.singletonList(new t7.a(valueOf2)));
        }
        this.f20254l.o(cVar);
        return true;
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f20247e[i10] = 0.0f;
        }
    }

    public a<?, Float> e() {
        return this.f20256n;
    }

    public Matrix f() {
        PointF h10;
        t7.d h11;
        PointF h12;
        this.f20244a.reset();
        a<?, PointF> aVar = this.f20249g;
        if (aVar != null && (h12 = aVar.h()) != null) {
            float f10 = h12.x;
            if (f10 != 0.0f || h12.y != 0.0f) {
                this.f20244a.preTranslate(f10, h12.y);
            }
        }
        if (!this.f20257o) {
            a<Float, Float> aVar2 = this.f20251i;
            if (aVar2 != null) {
                float floatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).r();
                if (floatValue != 0.0f) {
                    this.f20244a.preRotate(floatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF h13 = aVar.h();
            float f12 = h13.x;
            float f13 = h13.y;
            aVar.n(1.0E-4f + f11);
            PointF h14 = aVar.h();
            aVar.n(f11);
            this.f20244a.preRotate((float) Math.toDegrees(Math.atan2(h14.y - f13, h14.x - f12)));
        }
        if (this.f20253k != null) {
            float cos = this.f20254l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.r()) + 90.0f));
            float sin = this.f20254l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.r()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.r()));
            d();
            float[] fArr = this.f20247e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.f20247e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f20245c.setValues(fArr2);
            d();
            float[] fArr3 = this.f20247e;
            fArr3[0] = cos;
            fArr3[1] = f14;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f20246d.setValues(fArr3);
            this.f20245c.preConcat(this.b);
            this.f20246d.preConcat(this.f20245c);
            this.f20244a.preConcat(this.f20246d);
        }
        a<t7.d, t7.d> aVar3 = this.f20250h;
        if (aVar3 != null && (h11 = aVar3.h()) != null && (h11.b() != 1.0f || h11.c() != 1.0f)) {
            this.f20244a.preScale(h11.b(), h11.c());
        }
        a<PointF, PointF> aVar4 = this.f20248f;
        if (aVar4 != null && (h10 = aVar4.h()) != null) {
            float f15 = h10.x;
            if (f15 != 0.0f || h10.y != 0.0f) {
                this.f20244a.preTranslate(-f15, -h10.y);
            }
        }
        return this.f20244a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f20249g;
        PointF h10 = aVar == null ? null : aVar.h();
        a<t7.d, t7.d> aVar2 = this.f20250h;
        t7.d h11 = aVar2 == null ? null : aVar2.h();
        this.f20244a.reset();
        if (h10 != null) {
            this.f20244a.preTranslate(h10.x * f10, h10.y * f10);
        }
        if (h11 != null) {
            double d10 = f10;
            this.f20244a.preScale((float) Math.pow(h11.b(), d10), (float) Math.pow(h11.c(), d10));
        }
        a<Float, Float> aVar3 = this.f20251i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f20248f;
            PointF h12 = aVar4 != null ? aVar4.h() : null;
            this.f20244a.preRotate(floatValue * f10, h12 == null ? 0.0f : h12.x, h12 != null ? h12.y : 0.0f);
        }
        return this.f20244a;
    }

    public a<?, Integer> h() {
        return this.f20252j;
    }

    public a<?, Float> i() {
        return this.f20255m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f20252j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a<?, Float> aVar2 = this.f20255m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a<?, Float> aVar3 = this.f20256n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a<PointF, PointF> aVar4 = this.f20248f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a<?, PointF> aVar5 = this.f20249g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a<t7.d, t7.d> aVar6 = this.f20250h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a<Float, Float> aVar7 = this.f20251i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f20253k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f20254l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
