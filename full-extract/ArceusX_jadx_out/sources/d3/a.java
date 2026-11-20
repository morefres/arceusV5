package d3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.o0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f14339r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    public final View f14341c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f14342d;

    /* renamed from: g, reason: collision with root package name */
    public int f14345g;

    /* renamed from: h, reason: collision with root package name */
    public int f14346h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14350l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14351m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14352n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14353o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14354p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14355q;

    /* renamed from: a, reason: collision with root package name */
    public final C0279a f14340a = new C0279a();
    public final Interpolator b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public float[] f14343e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    public float[] f14344f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    public float[] f14347i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public float[] f14348j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    public float[] f14349k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: d3.a$a, reason: collision with other inner class name */
    public static class C0279a {

        /* renamed from: a, reason: collision with root package name */
        public int f14356a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public float f14357c;

        /* renamed from: d, reason: collision with root package name */
        public float f14358d;

        /* renamed from: j, reason: collision with root package name */
        public float f14364j;

        /* renamed from: k, reason: collision with root package name */
        public int f14365k;

        /* renamed from: e, reason: collision with root package name */
        public long f14359e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f14363i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f14360f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f14361g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f14362h = 0;

        public void a() {
            if (this.f14360f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f14360f;
            this.f14360f = currentAnimationTimeMillis;
            float f10 = j10 * g10;
            this.f14361g = (int) (this.f14357c * f10);
            this.f14362h = (int) (f10 * this.f14358d);
        }

        public int b() {
            return this.f14361g;
        }

        public int c() {
            return this.f14362h;
        }

        public int d() {
            float f10 = this.f14357c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            if (j10 < this.f14359e) {
                return 0.0f;
            }
            long j11 = this.f14363i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f14356a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f14364j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f14365k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f14358d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f14363i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f14363i + ((long) this.f14365k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14365k = a.f((int) (currentAnimationTimeMillis - this.f14359e), 0, this.b);
            this.f14364j = e(currentAnimationTimeMillis);
            this.f14363i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.b = i10;
        }

        public void k(int i10) {
            this.f14356a = i10;
        }

        public void l(float f10, float f11) {
            this.f14357c = f10;
            this.f14358d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14359e = currentAnimationTimeMillis;
            this.f14363i = -1L;
            this.f14360f = currentAnimationTimeMillis;
            this.f14364j = 0.5f;
            this.f14361g = 0;
            this.f14362h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f14353o) {
                if (aVar.f14351m) {
                    aVar.f14351m = false;
                    aVar.f14340a.m();
                }
                C0279a c0279a = a.this.f14340a;
                if (c0279a.h() || !a.this.u()) {
                    a.this.f14353o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f14352n) {
                    aVar2.f14352n = false;
                    aVar2.c();
                }
                c0279a.a();
                a.this.j(c0279a.b(), c0279a.c());
                o0.e0(a.this.f14341c, this);
            }
        }
    }

    public a(View view) {
        this.f14341c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f14339r);
        r(500);
        q(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f14341c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f14343e[i10], f11, this.f14344f[i10], f10);
        if (h10 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f14347i[i10];
        float f14 = this.f14348j[i10];
        float f15 = this.f14349k[i10];
        float f16 = f13 * f12;
        return h10 > 0.0f ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f14345g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f14353o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.b.getInterpolation(-g10);
        } else {
            if (g10 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f14351m) {
            this.f14353o = false;
        } else {
            this.f14340a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f14346h = i10;
        return this;
    }

    public a l(int i10) {
        this.f14345g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f14354p && !z10) {
            i();
        }
        this.f14354p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f14344f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f14349k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f14354p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f14352n = r2
            r5.f14350l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f14341c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f14341c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            d3.a$a r7 = r5.f14340a
            r7.l(r0, r6)
            boolean r6 = r5.f14353o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f14355q
            if (r6 == 0) goto L61
            boolean r6 = r5.f14353o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f14348j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f14340a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f14340a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f14343e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f14347i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0279a c0279a = this.f14340a;
        int f10 = c0279a.f();
        int d10 = c0279a.d();
        if (f10 == 0 || !b(f10)) {
            return d10 != 0 && a(d10);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f14342d == null) {
            this.f14342d = new b();
        }
        this.f14353o = true;
        this.f14351m = true;
        if (this.f14350l || (i10 = this.f14346h) <= 0) {
            this.f14342d.run();
        } else {
            o0.f0(this.f14341c, this.f14342d, i10);
        }
        this.f14350l = true;
    }
}
