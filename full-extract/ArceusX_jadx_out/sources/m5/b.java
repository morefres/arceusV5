package m5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import x2.g;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final Interpolator f24290g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final Interpolator f24291h = new g4.b();

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f24292i = {ViewCompat.MEASURED_STATE_MASK};

    /* renamed from: a, reason: collision with root package name */
    public final c f24293a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f24294c;

    /* renamed from: d, reason: collision with root package name */
    public Animator f24295d;

    /* renamed from: e, reason: collision with root package name */
    public float f24296e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24297f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f24298a;

        public a(c cVar) {
            this.f24298a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f24298a);
            b.this.b(floatValue, this.f24298a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: m5.b$b, reason: collision with other inner class name */
    public class C0425b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f24299a;

        public C0425b(c cVar) {
            this.f24299a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f24299a, true);
            this.f24299a.A();
            this.f24299a.l();
            b bVar = b.this;
            if (!bVar.f24297f) {
                bVar.f24296e += 1.0f;
                return;
            }
            bVar.f24297f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f24299a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f24296e = 0.0f;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f24300a = new RectF();
        public final Paint b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f24301c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f24302d;

        /* renamed from: e, reason: collision with root package name */
        public float f24303e;

        /* renamed from: f, reason: collision with root package name */
        public float f24304f;

        /* renamed from: g, reason: collision with root package name */
        public float f24305g;

        /* renamed from: h, reason: collision with root package name */
        public float f24306h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f24307i;

        /* renamed from: j, reason: collision with root package name */
        public int f24308j;

        /* renamed from: k, reason: collision with root package name */
        public float f24309k;

        /* renamed from: l, reason: collision with root package name */
        public float f24310l;

        /* renamed from: m, reason: collision with root package name */
        public float f24311m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f24312n;

        /* renamed from: o, reason: collision with root package name */
        public Path f24313o;

        /* renamed from: p, reason: collision with root package name */
        public float f24314p;

        /* renamed from: q, reason: collision with root package name */
        public float f24315q;

        /* renamed from: r, reason: collision with root package name */
        public int f24316r;

        /* renamed from: s, reason: collision with root package name */
        public int f24317s;

        /* renamed from: t, reason: collision with root package name */
        public int f24318t;

        /* renamed from: u, reason: collision with root package name */
        public int f24319u;

        public c() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.f24301c = paint2;
            Paint paint3 = new Paint();
            this.f24302d = paint3;
            this.f24303e = 0.0f;
            this.f24304f = 0.0f;
            this.f24305g = 0.0f;
            this.f24306h = 5.0f;
            this.f24314p = 1.0f;
            this.f24318t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f24309k = this.f24303e;
            this.f24310l = this.f24304f;
            this.f24311m = this.f24305g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f24300a;
            float f10 = this.f24315q;
            float f11 = (this.f24306h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f24316r * this.f24314p) / 2.0f, this.f24306h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f24303e;
            float f13 = this.f24305g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f24304f + f13) * 360.0f) - f14;
            this.b.setColor(this.f24319u);
            this.b.setAlpha(this.f24318t);
            float f16 = this.f24306h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24302d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.b);
            b(canvas, f14, f15, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f24312n) {
                Path path = this.f24313o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f24313o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f24316r * this.f24314p) / 2.0f;
                this.f24313o.moveTo(0.0f, 0.0f);
                this.f24313o.lineTo(this.f24316r * this.f24314p, 0.0f);
                Path path3 = this.f24313o;
                float f13 = this.f24316r;
                float f14 = this.f24314p;
                path3.lineTo((f13 * f14) / 2.0f, this.f24317s * f14);
                this.f24313o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f24306h / 2.0f));
                this.f24313o.close();
                this.f24301c.setColor(this.f24319u);
                this.f24301c.setAlpha(this.f24318t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f24313o, this.f24301c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f24318t;
        }

        public float d() {
            return this.f24304f;
        }

        public int e() {
            return this.f24307i[f()];
        }

        public int f() {
            return (this.f24308j + 1) % this.f24307i.length;
        }

        public float g() {
            return this.f24303e;
        }

        public int h() {
            return this.f24307i[this.f24308j];
        }

        public float i() {
            return this.f24310l;
        }

        public float j() {
            return this.f24311m;
        }

        public float k() {
            return this.f24309k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f24309k = 0.0f;
            this.f24310l = 0.0f;
            this.f24311m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f24318t = i10;
        }

        public void o(float f10, float f11) {
            this.f24316r = (int) f10;
            this.f24317s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f24314p) {
                this.f24314p = f10;
            }
        }

        public void q(float f10) {
            this.f24315q = f10;
        }

        public void r(int i10) {
            this.f24319u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f24308j = i10;
            this.f24319u = this.f24307i[i10];
        }

        public void u(int[] iArr) {
            this.f24307i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f24304f = f10;
        }

        public void w(float f10) {
            this.f24305g = f10;
        }

        public void x(boolean z10) {
            if (this.f24312n != z10) {
                this.f24312n = z10;
            }
        }

        public void y(float f10) {
            this.f24303e = f10;
        }

        public void z(float f10) {
            this.f24306h = f10;
            this.b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f24294c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f24293a = cVar;
        cVar.u(f24292i);
        k(2.5f);
        m();
    }

    public final void a(float f10, c cVar) {
        n(f10, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f24297f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f24291h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f24291h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            float f12 = j10 + (0.20999998f * f10);
            float f13 = (f10 + this.f24296e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(f12);
            h(f13);
        }
    }

    public final int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    public void d(boolean z10) {
        this.f24293a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f24293a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f24293a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f24293a.u(iArr);
        this.f24293a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f24293a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24293a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.b = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f24293a;
        float f14 = this.f24294c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f24295d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f24293a.y(f10);
        this.f24293a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f24293a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f24293a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f24290g);
        ofFloat.addListener(new C0425b(cVar));
        this.f24295d = ofFloat;
    }

    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f24293a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24293a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f24295d.cancel();
        this.f24293a.A();
        if (this.f24293a.d() != this.f24293a.g()) {
            this.f24297f = true;
            this.f24295d.setDuration(666L);
            this.f24295d.start();
        } else {
            this.f24293a.t(0);
            this.f24293a.m();
            this.f24295d.setDuration(1332L);
            this.f24295d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f24295d.cancel();
        h(0.0f);
        this.f24293a.x(false);
        this.f24293a.t(0);
        this.f24293a.m();
        invalidateSelf();
    }
}
