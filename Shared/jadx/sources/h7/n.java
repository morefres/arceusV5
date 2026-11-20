package h7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.List;
import n7.k;
import n7.t;

/* loaded from: classes3.dex */
public class n implements m, a.b, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f19099e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f19100f;

    /* renamed from: g, reason: collision with root package name */
    public final k.a f19101g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19102h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19103i;

    /* renamed from: j, reason: collision with root package name */
    public final i7.a<?, Float> f19104j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.a<?, PointF> f19105k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.a<?, Float> f19106l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.a<?, Float> f19107m;

    /* renamed from: n, reason: collision with root package name */
    public final i7.a<?, Float> f19108n;

    /* renamed from: o, reason: collision with root package name */
    public final i7.a<?, Float> f19109o;

    /* renamed from: p, reason: collision with root package name */
    public final i7.a<?, Float> f19110p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19112r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f19096a = new Path();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f19097c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f19098d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final b f19111q = new b();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19113a;

        static {
            int[] iArr = new int[k.a.values().length];
            f19113a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19113a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(h0 h0Var, o7.b bVar, n7.k kVar) {
        this.f19100f = h0Var;
        this.f19099e = kVar.d();
        k.a j10 = kVar.j();
        this.f19101g = j10;
        this.f19102h = kVar.k();
        this.f19103i = kVar.l();
        i7.d a10 = kVar.g().a();
        this.f19104j = a10;
        i7.a<PointF, PointF> a11 = kVar.h().a();
        this.f19105k = a11;
        i7.d a12 = kVar.i().a();
        this.f19106l = a12;
        i7.d a13 = kVar.e().a();
        this.f19108n = a13;
        i7.d a14 = kVar.f().a();
        this.f19110p = a14;
        k.a aVar = k.a.STAR;
        if (j10 == aVar) {
            this.f19107m = kVar.b().a();
            this.f19109o = kVar.c().a();
        } else {
            this.f19107m = null;
            this.f19109o = null;
        }
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        bVar.j(a13);
        bVar.j(a14);
        if (j10 == aVar) {
            bVar.j(this.f19107m);
            bVar.j(this.f19109o);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (j10 == aVar) {
            this.f19107m.a(this);
            this.f19109o.a(this);
        }
    }

    private void k() {
        this.f19112r = false;
        this.f19100f.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        k();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f19111q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.a<?, Float> aVar;
        i7.a<?, Float> aVar2;
        if (t8 == o0.f17003w) {
            this.f19104j.o(cVar);
            return;
        }
        if (t8 == o0.f17004x) {
            this.f19106l.o(cVar);
            return;
        }
        if (t8 == o0.f16994n) {
            this.f19105k.o(cVar);
            return;
        }
        if (t8 == o0.f17005y && (aVar2 = this.f19107m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t8 == o0.f17006z) {
            this.f19108n.o(cVar);
            return;
        }
        if (t8 == o0.A && (aVar = this.f19109o) != null) {
            aVar.o(cVar);
        } else if (t8 == o0.B) {
            this.f19110p.o(cVar);
        }
    }

    public final void f() {
        double d10;
        float f10;
        float f11;
        float f12;
        int floor = (int) Math.floor(this.f19104j.h().floatValue());
        double radians = Math.toRadians((this.f19106l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d11 = floor;
        float floatValue = this.f19110p.h().floatValue() / 100.0f;
        float floatValue2 = this.f19108n.h().floatValue();
        double d12 = floatValue2;
        float cos = (float) (Math.cos(radians) * d12);
        float sin = (float) (Math.sin(radians) * d12);
        this.f19096a.moveTo(cos, sin);
        double d13 = (float) (6.283185307179586d / d11);
        double ceil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= ceil) {
                PointF h10 = this.f19105k.h();
                this.f19096a.offset(h10.x, h10.y);
                this.f19096a.close();
                return;
            }
            float cos2 = (float) (d12 * Math.cos(d14));
            float sin2 = (float) (Math.sin(d14) * d12);
            if (floatValue != 0.0f) {
                d10 = ceil;
                f10 = floatValue;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f13 = floatValue2 * f10 * 0.25f;
                float f14 = f13 * cos3;
                float f15 = f13 * sin3;
                float cos4 = ((float) Math.cos(atan22)) * f13;
                float sin4 = f13 * ((float) Math.sin(atan22));
                if (d15 == d10 - 1.0d) {
                    this.b.reset();
                    this.b.moveTo(cos, sin);
                    float f16 = cos - f14;
                    float f17 = sin - f15;
                    float f18 = cos2 + cos4;
                    float f19 = sin2 + sin4;
                    f11 = cos2;
                    f12 = sin2;
                    this.b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f19097c.setPath(this.b, false);
                    PathMeasure pathMeasure = this.f19097c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f19098d, null);
                    Path path = this.f19096a;
                    float[] fArr = this.f19098d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = cos2;
                    f12 = sin2;
                    this.f19096a.cubicTo(cos - f14, sin - f15, f11 + cos4, f12 + sin4, f11, f12);
                }
                cos = f11;
                sin = f12;
            } else {
                cos = cos2;
                sin = sin2;
                d10 = ceil;
                f10 = floatValue;
                if (d15 == d10 - 1.0d) {
                    i10++;
                    ceil = d10;
                    floatValue = f10;
                } else {
                    this.f19096a.lineTo(cos, sin);
                }
            }
            d14 += d13;
            i10++;
            ceil = d10;
            floatValue = f10;
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f19099e;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f19112r) {
            return this.f19096a;
        }
        this.f19096a.reset();
        if (this.f19102h) {
            this.f19112r = true;
            return this.f19096a;
        }
        int i10 = a.f19113a[this.f19101g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            f();
        }
        this.f19096a.close();
        this.f19111q.b(this.f19096a);
        this.f19112r = true;
        return this.f19096a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    public final void j() {
        float f10;
        float f11;
        int i10;
        float cos;
        float sin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float floatValue = this.f19104j.h().floatValue();
        double radians = Math.toRadians((this.f19106l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d13 = floatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.f19103i) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = floatValue - ((int) floatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float floatValue2 = this.f19108n.h().floatValue();
        float floatValue3 = this.f19107m.h().floatValue();
        i7.a<?, Float> aVar = this.f19109o;
        float floatValue4 = aVar != null ? aVar.h().floatValue() / 100.0f : 0.0f;
        i7.a<?, Float> aVar2 = this.f19110p;
        float floatValue5 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((floatValue2 - floatValue3) * f22) + floatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float cos2 = (float) (d14 * Math.cos(radians));
            sin = (float) (d14 * Math.sin(radians));
            this.f19096a.moveTo(cos2, sin);
            d10 = radians + ((f20 * f22) / 2.0f);
            f12 = f22;
            cos = cos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = floatValue2;
            cos = (float) (Math.cos(radians) * d15);
            sin = (float) (d15 * Math.sin(radians));
            this.f19096a.moveTo(cos, sin);
            f12 = f22;
            f13 = f21;
            d10 = radians + f13;
            f14 = 0.0f;
        }
        double ceil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = sin;
        float f24 = cos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= ceil) {
                PointF h10 = this.f19105k.h();
                this.f19096a.offset(h10.x, h10.y);
                this.f19096a.close();
                return;
            }
            float f25 = z10 ? floatValue2 : floatValue3;
            if (f14 == f11 || d18 != ceil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != ceil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float cos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float sin2 = (float) (d19 * Math.sin(d17));
            if (floatValue4 == f11 && floatValue5 == f11) {
                this.f19096a.lineTo(cos3, sin2);
                f19 = cos3;
                f18 = sin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double atan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                float f27 = f24;
                float f28 = f23;
                f18 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f29 = z10 ? floatValue4 : floatValue5;
                float f30 = z10 ? floatValue5 : floatValue4;
                float f31 = (z10 ? floatValue3 : floatValue2) * f29 * 0.47829f;
                float f32 = cos4 * f31;
                float f33 = f31 * sin3;
                float f34 = (z10 ? floatValue2 : floatValue3) * f30 * 0.47829f;
                float f35 = cos5 * f34;
                float f36 = f34 * sin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == ceil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = cos3;
                this.f19096a.cubicTo(f27 - f32, f28 - f33, cos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + f15;
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }
}
