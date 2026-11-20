package s7;

import android.view.Choreographer;

/* loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public f7.i f30927l;

    /* renamed from: d, reason: collision with root package name */
    public float f30919d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30920e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f30921f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f30922g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f30923h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f30924i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f30925j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    public float f30926k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30928m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30929n = false;

    public void A() {
        C(true);
    }

    public void C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f30928m = false;
        }
    }

    public void D() {
        this.f30928m = true;
        z();
        this.f30921f = 0L;
        if (v() && p() == s()) {
            J(r());
        } else if (!v() && p() == r()) {
            J(s());
        }
        f();
    }

    public void E() {
        P(-t());
    }

    public void G(f7.i iVar) {
        boolean z10 = this.f30927l == null;
        this.f30927l = iVar;
        if (z10) {
            N(Math.max(this.f30925j, iVar.p()), Math.min(this.f30926k, iVar.f()));
        } else {
            N((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f30923h;
        this.f30923h = 0.0f;
        this.f30922g = 0.0f;
        J((int) f10);
        i();
    }

    public void J(float f10) {
        if (this.f30922g == f10) {
            return;
        }
        float b = j.b(f10, s(), r());
        this.f30922g = b;
        if (this.f30929n) {
            b = (float) Math.floor(b);
        }
        this.f30923h = b;
        this.f30921f = 0L;
        i();
    }

    public void K(float f10) {
        N(this.f30925j, f10);
    }

    public void N(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        f7.i iVar = this.f30927l;
        float p8 = iVar == null ? -3.4028235E38f : iVar.p();
        f7.i iVar2 = this.f30927l;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float b = j.b(f10, p8, f12);
        float b10 = j.b(f11, p8, f12);
        if (b == this.f30925j && b10 == this.f30926k) {
            return;
        }
        this.f30925j = b;
        this.f30926k = b10;
        J((int) j.b(this.f30923h, b, b10));
    }

    public void O(int i10) {
        N(i10, (int) this.f30926k);
    }

    public void P(float f10) {
        this.f30919d = f10;
    }

    public void Q(boolean z10) {
        this.f30929n = z10;
    }

    public final void R() {
        if (this.f30927l == null) {
            return;
        }
        float f10 = this.f30923h;
        if (f10 < this.f30925j || f10 > this.f30926k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f30925j), Float.valueOf(this.f30926k), Float.valueOf(this.f30923h)));
        }
    }

    @Override // s7.a
    public void a() {
        super.a();
        b(v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        A();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        z();
        if (this.f30927l == null || !isRunning()) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("LottieValueAnimator#doFrame");
        }
        float q10 = (this.f30921f != 0 ? j10 - r2 : 0L) / q();
        float f10 = this.f30922g;
        if (v()) {
            q10 = -q10;
        }
        float f11 = f10 + q10;
        boolean d10 = j.d(f11, s(), r());
        float f12 = this.f30922g;
        float b = j.b(f11, s(), r());
        this.f30922g = b;
        if (this.f30929n) {
            b = (float) Math.floor(b);
        }
        this.f30923h = b;
        this.f30921f = j10;
        if (d10) {
            j(f12);
        } else if (getRepeatCount() == -1 || this.f30924i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f30920e = !this.f30920e;
                E();
            } else {
                float r8 = v() ? r() : s();
                this.f30922g = r8;
                this.f30923h = r8;
            }
            this.f30921f = j10;
            j(f12);
            e();
            this.f30924i++;
        } else {
            float s8 = this.f30919d < 0.0f ? s() : r();
            this.f30922g = s8;
            this.f30923h = s8;
            A();
            j(f12);
            b(v());
        }
        R();
        if (f7.e.h()) {
            f7.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float s8;
        float r8;
        float s10;
        if (this.f30927l == null) {
            return 0.0f;
        }
        if (v()) {
            s8 = r() - this.f30923h;
            r8 = r();
            s10 = s();
        } else {
            s8 = this.f30923h - s();
            r8 = r();
            s10 = s();
        }
        return s8 / (r8 - s10);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        f7.i iVar = this.f30927l;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f30928m;
    }

    public final void j(float f10) {
        if (this.f30929n && this.f30922g == f10) {
            return;
        }
        i();
    }

    public void k() {
        this.f30927l = null;
        this.f30925j = -2.1474836E9f;
        this.f30926k = 2.1474836E9f;
    }

    public void n() {
        A();
        b(v());
    }

    public float o() {
        f7.i iVar = this.f30927l;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f30923h - iVar.p()) / (this.f30927l.f() - this.f30927l.p());
    }

    public float p() {
        return this.f30923h;
    }

    public final float q() {
        f7.i iVar = this.f30927l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f30919d);
    }

    public float r() {
        f7.i iVar = this.f30927l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f30926k;
        return f10 == 2.1474836E9f ? iVar.f() : f10;
    }

    public float s() {
        f7.i iVar = this.f30927l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f30925j;
        return f10 == -2.1474836E9f ? iVar.p() : f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f30920e) {
            return;
        }
        this.f30920e = false;
        E();
    }

    public float t() {
        return this.f30919d;
    }

    public final boolean v() {
        return t() < 0.0f;
    }

    public void w() {
        A();
        c();
    }

    public void x() {
        this.f30928m = true;
        h(v());
        J((int) (v() ? r() : s()));
        this.f30921f = 0L;
        this.f30924i = 0;
        z();
    }

    public void z() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
