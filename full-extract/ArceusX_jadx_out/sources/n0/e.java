package n0;

import android.util.Range;

/* loaded from: classes.dex */
public class e extends d2 {
    public final o0 b;

    /* renamed from: c, reason: collision with root package name */
    public final q3 f25337c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25338d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25339e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f25340f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.a0<g0.z2> f25341g;

    public e(o0 o0Var, h0 h0Var) {
        super(o0Var);
        this.f25338d = false;
        this.f25339e = false;
        this.f25341g = null;
        this.b = o0Var;
        this.f25340f = h0Var;
        this.f25337c = h0Var.w(null);
        H(h0Var.U());
        G(h0Var.c0());
    }

    public static float D(float f10, float f11, float f12) {
        if (f12 == f11) {
            return 0.0f;
        }
        if (f10 == f12) {
            return 1.0f;
        }
        if (f10 == f11) {
            return 0.0f;
        }
        float f13 = 1.0f / f11;
        return ((1.0f / f10) - f13) / ((1.0f / f12) - f13);
    }

    public static float F(float f10, float f11, float f12) {
        if (f10 == 1.0f) {
            return f12;
        }
        if (f10 == 0.0f) {
            return f11;
        }
        double d10 = 1.0f / f11;
        return (float) s2.a.a(1.0d / (d10 + (((1.0f / f12) - d10) * f10)), f11, f12);
    }

    public h0 C() {
        return this.f25340f;
    }

    public q3 E() {
        return this.f25337c;
    }

    public void G(boolean z10) {
        this.f25339e = z10;
    }

    public void H(boolean z10) {
        this.f25338d = z10;
    }

    @Override // n0.d2, n0.o0
    public boolean o() {
        int[] m10;
        q3 q3Var = this.f25337c;
        if (q3Var == null || (m10 = q3Var.m()) == null) {
            return super.o();
        }
        for (int i10 : m10) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.d2, g0.t
    public android.view.a0<Integer> p() {
        return !p0.x.b(this.f25337c, 6) ? new android.view.d0(0) : this.b.p();
    }

    @Override // n0.d2, n0.o0
    public o0 q() {
        return this.b;
    }

    @Override // n0.d2, g0.t
    public android.view.a0<g0.z2> z() {
        if (!p0.x.b(this.f25337c, 0)) {
            return new android.view.d0(s0.h.e(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.f25337c != null) {
            g0.z2 f10 = this.b.z().f();
            final Range<Float> j10 = this.f25337c.j();
            if (j10 != null && (j10.getLower().floatValue() != f10.c() || j10.getUpper().floatValue() != f10.a())) {
                if (this.f25341g == null) {
                    this.f25341g = p0.m.a(this.b.z(), new t.a() { // from class: n0.d
                        @Override // t.a
                        public final Object apply(Object obj) {
                            g0.z2 e10;
                            e10 = s0.h.e(r2.d(), ((Float) r0.getUpper()).floatValue(), ((Float) r0.getLower()).floatValue(), e.D(((g0.z2) obj).d(), ((Float) r0.getLower()).floatValue(), ((Float) j10.getUpper()).floatValue()));
                            return e10;
                        }
                    });
                }
                return this.f25341g;
            }
        }
        return this.b.z();
    }
}
