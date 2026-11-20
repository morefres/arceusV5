package q7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import r7.c;

/* loaded from: classes3.dex */
public class t {
    public static w1.k<WeakReference<Interpolator>> b;

    /* renamed from: a, reason: collision with root package name */
    public static final Interpolator f29593a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static c.a f29594c = c.a.a(zl.t.f38095d, "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static c.a f29595d = c.a.a("x", "y");

    public static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> e10;
        synchronized (t.class) {
            e10 = g().e(i10);
        }
        return e10;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator a10;
        pointF.x = s7.j.b(pointF.x, -1.0f, 1.0f);
        pointF.y = s7.j.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = s7.j.b(pointF2.x, -1.0f, 1.0f);
        float b10 = s7.j.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = s7.m.i(pointF.x, pointF.y, pointF2.x, b10);
        WeakReference<Interpolator> a11 = f7.e.e() ? null : a(i10);
        Interpolator interpolator = a11 != null ? a11.get() : null;
        if (a11 != null && interpolator != null) {
            return interpolator;
        }
        try {
            a10 = z2.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            a10 = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? z2.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!f7.e.e()) {
            try {
                h(i10, new WeakReference(a10));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return a10;
    }

    public static <T> t7.a<T> c(r7.c cVar, f7.i iVar, float f10, n0<T> n0Var, boolean z10, boolean z11) {
        return (z10 && z11) ? e(iVar, cVar, f10, n0Var) : z10 ? d(iVar, cVar, f10, n0Var) : f(cVar, f10, n0Var);
    }

    public static <T> t7.a<T> d(f7.i iVar, r7.c cVar, float f10, n0<T> n0Var) {
        Interpolator b10;
        T t8;
        cVar.c();
        PointF pointF = null;
        T t10 = null;
        T t11 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (cVar.f()) {
            switch (cVar.r(f29594c)) {
                case 0:
                    f11 = (float) cVar.h();
                    break;
                case 1:
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    t10 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.j() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.u();
                    break;
            }
        }
        cVar.e();
        if (z10) {
            b10 = f29593a;
            t8 = t11;
        } else {
            b10 = (pointF == null || pointF4 == null) ? f29593a : b(pointF, pointF4);
            t8 = t10;
        }
        t7.a<T> aVar = new t7.a<>(iVar, t11, t8, b10, f11, null);
        aVar.f32064o = pointF2;
        aVar.f32065p = pointF3;
        return aVar;
    }

    public static <T> t7.a<T> e(f7.i iVar, r7.c cVar, float f10, n0<T> n0Var) {
        Interpolator interpolator;
        Interpolator b10;
        Interpolator b11;
        T t8;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        t7.a<T> aVar;
        PointF pointF3;
        boolean z10;
        float f11;
        cVar.c();
        boolean z11 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t10 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f12 = 0.0f;
        T t11 = null;
        while (cVar.f()) {
            switch (cVar.r(f29594c)) {
                case 0:
                    f12 = (float) cVar.h();
                    break;
                case 1:
                    t10 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (cVar.o() == c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.f()) {
                            int r8 = cVar.r(f29595d);
                            if (r8 == 0) {
                                pointF3 = pointF8;
                                c.b o8 = cVar.o();
                                c.b bVar = c.b.NUMBER;
                                if (o8 == bVar) {
                                    f15 = (float) cVar.h();
                                    f13 = f15;
                                } else {
                                    cVar.b();
                                    f13 = (float) cVar.h();
                                    f15 = cVar.o() == bVar ? (float) cVar.h() : f13;
                                    cVar.d();
                                }
                            } else if (r8 != 1) {
                                cVar.u();
                            } else {
                                c.b o10 = cVar.o();
                                c.b bVar2 = c.b.NUMBER;
                                if (o10 == bVar2) {
                                    pointF3 = pointF8;
                                    f16 = (float) cVar.h();
                                    f14 = f16;
                                } else {
                                    pointF3 = pointF8;
                                    cVar.b();
                                    f14 = (float) cVar.h();
                                    f16 = cVar.o() == bVar2 ? (float) cVar.h() : f14;
                                    cVar.d();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f13, f14);
                        pointF7 = new PointF(f15, f16);
                        cVar.e();
                    } else {
                        pointF4 = s.e(cVar, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (cVar.o() != c.b.BEGIN_OBJECT) {
                        pointF5 = s.e(cVar, f10);
                        break;
                    } else {
                        cVar.c();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (cVar.f()) {
                            int r10 = cVar.r(f29595d);
                            if (r10 != 0) {
                                z10 = z11;
                                if (r10 != 1) {
                                    cVar.u();
                                } else {
                                    c.b o11 = cVar.o();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (o11 == bVar3) {
                                        f20 = (float) cVar.h();
                                        f18 = f20;
                                    } else {
                                        cVar.b();
                                        PointF pointF12 = pointF10;
                                        float h10 = (float) cVar.h();
                                        f20 = cVar.o() == bVar3 ? (float) cVar.h() : h10;
                                        cVar.d();
                                        pointF10 = pointF12;
                                        f18 = h10;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF13 = pointF10;
                                c.b o12 = cVar.o();
                                c.b bVar4 = c.b.NUMBER;
                                if (o12 == bVar4) {
                                    pointF10 = pointF13;
                                    f19 = (float) cVar.h();
                                    f17 = f19;
                                } else {
                                    pointF10 = pointF13;
                                    cVar.b();
                                    float h11 = (float) cVar.h();
                                    if (cVar.o() == bVar4) {
                                        f11 = h11;
                                        f19 = (float) cVar.h();
                                    } else {
                                        f11 = h11;
                                        f19 = f11;
                                    }
                                    cVar.d();
                                    f17 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF14 = new PointF(f17, f18);
                        PointF pointF15 = new PointF(f19, f20);
                        cVar.e();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    }
                case 5:
                    if (cVar.j() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 6:
                    pointF10 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF11 = s.e(cVar, f10);
                    break;
                default:
                    cVar.u();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF16 = pointF8;
        cVar.e();
        if (z13) {
            interpolator2 = f29593a;
            t8 = t10;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = b(pointF4, pointF5);
            } else {
                if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                    b10 = b(pointF6, pointF16);
                    b11 = b(pointF7, pointF9);
                    t8 = t11;
                    interpolator2 = null;
                    if (b10 != null || b11 == null) {
                        pointF = pointF10;
                        pointF2 = pointF11;
                        aVar = new t7.a<>(iVar, t10, t8, interpolator2, f12, null);
                    } else {
                        pointF2 = pointF11;
                        pointF = pointF10;
                        aVar = new t7.a<>(iVar, t10, t8, b10, b11, f12, null);
                    }
                    aVar.f32064o = pointF;
                    aVar.f32065p = pointF2;
                    return aVar;
                }
                interpolator = f29593a;
            }
            interpolator2 = interpolator;
            t8 = t11;
        }
        b10 = null;
        b11 = null;
        if (b10 != null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        aVar = new t7.a<>(iVar, t10, t8, interpolator2, f12, null);
        aVar.f32064o = pointF;
        aVar.f32065p = pointF2;
        return aVar;
    }

    public static <T> t7.a<T> f(r7.c cVar, float f10, n0<T> n0Var) {
        return new t7.a<>(n0Var.a(cVar, f10));
    }

    public static w1.k<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new w1.k<>();
        }
        return b;
    }

    public static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            b.i(i10, weakReference);
        }
    }
}
