package n0;

import android.util.Range;

/* loaded from: classes.dex */
public class c extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final l0 f25317c;

    /* renamed from: d, reason: collision with root package name */
    public final q3 f25318d;

    public c(l0 l0Var, q3 q3Var) {
        super(l0Var);
        this.f25317c = l0Var;
        this.f25318d = q3Var;
    }

    @Override // n0.c2, g0.m
    public ne.x<Void> c(boolean z10) {
        return !p0.x.b(this.f25318d, 6) ? r0.n.n(new IllegalStateException("Torch is not supported")) : this.f25317c.c(z10);
    }

    @Override // n0.c2, g0.m
    public ne.x<Void> e(float f10) {
        Range<Float> j10;
        if (!p0.x.b(this.f25318d, 0)) {
            return r0.n.n(new IllegalStateException("Zoom is not supported"));
        }
        q3 q3Var = this.f25318d;
        if (q3Var != null && (j10 = q3Var.j()) != null) {
            if (f10 <= 1.0f && f10 >= 0.0f) {
                return this.f25317c.g(e.F(f10, j10.getLower().floatValue(), j10.getUpper().floatValue()));
            }
            return r0.n.n(new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]"));
        }
        return this.f25317c.e(f10);
    }

    @Override // n0.c2, g0.m
    public ne.x<Void> g(float f10) {
        Range<Float> j10;
        if (!p0.x.b(this.f25318d, 0)) {
            return r0.n.n(new IllegalStateException("Zoom is not supported"));
        }
        q3 q3Var = this.f25318d;
        if (q3Var == null || (j10 = q3Var.j()) == null || (f10 >= j10.getLower().floatValue() && f10 <= j10.getUpper().floatValue())) {
            return this.f25317c.g(f10);
        }
        return r0.n.n(new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + j10.getLower() + " , " + j10.getUpper() + "]"));
    }

    @Override // n0.c2, g0.m
    public ne.x<g0.n0> o(g0.m0 m0Var) {
        g0.m0 a10 = p0.x.a(this.f25318d, m0Var);
        return a10 == null ? r0.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f25317c.o(a10);
    }
}
