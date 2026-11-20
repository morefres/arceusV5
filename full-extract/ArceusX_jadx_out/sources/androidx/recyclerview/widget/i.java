package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i extends RecyclerView.p implements RecyclerView.u {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.v C;

    /* renamed from: a, reason: collision with root package name */
    public final int f3032a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3033c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f3034d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3035e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3036f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3037g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f3038h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3039i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3040j;

    /* renamed from: k, reason: collision with root package name */
    public int f3041k;

    /* renamed from: l, reason: collision with root package name */
    public int f3042l;

    /* renamed from: m, reason: collision with root package name */
    public float f3043m;

    /* renamed from: n, reason: collision with root package name */
    public int f3044n;

    /* renamed from: o, reason: collision with root package name */
    public int f3045o;

    /* renamed from: p, reason: collision with root package name */
    public float f3046p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f3049s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3056z;

    /* renamed from: q, reason: collision with root package name */
    public int f3047q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3048r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3050t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3051u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3052v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3053w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3054x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f3055y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.q(500);
        }
    }

    public class b extends RecyclerView.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3059a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3059a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3059a) {
                this.f3059a = false;
                return;
            }
            if (((Float) i.this.f3056z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.A = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.A = 2;
                iVar2.v();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f3033c.setAlpha(floatValue);
            i.this.f3034d.setAlpha(floatValue);
            i.this.v();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3056z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3033c = stateListDrawable;
        this.f3034d = drawable;
        this.f3037g = stateListDrawable2;
        this.f3038h = drawable2;
        this.f3035e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3036f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3039i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3040j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3032a = i11;
        this.b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f3056z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3056z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3056z.setDuration(500L);
        this.f3056z.setStartDelay(0L);
        this.f3056z.start();
    }

    public void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f3049s.computeVerticalScrollRange();
        int i12 = this.f3048r;
        this.f3050t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f3032a;
        int computeHorizontalScrollRange = this.f3049s.computeHorizontalScrollRange();
        int i13 = this.f3047q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f3032a;
        this.f3051u = z10;
        boolean z11 = this.f3050t;
        if (!z11 && !z10) {
            if (this.f3052v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3042l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f3041k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f3051u) {
            float f11 = i13;
            this.f3045o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f3044n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f3052v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    public final void C(float f10) {
        int[] p8 = p();
        float max = Math.max(p8[0], Math.min(p8[1], f10));
        if (Math.abs(this.f3042l - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f3043m, max, p8, this.f3049s.computeVerticalScrollRange(), this.f3049s.computeVerticalScrollOffset(), this.f3048r);
        if (x10 != 0) {
            this.f3049s.scrollBy(0, x10);
        }
        this.f3043m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f3052v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u8 = u(motionEvent.getX(), motionEvent.getY());
            boolean t8 = t(motionEvent.getX(), motionEvent.getY());
            if (u8 || t8) {
                if (t8) {
                    this.f3053w = 1;
                    this.f3046p = (int) motionEvent.getX();
                } else if (u8) {
                    this.f3053w = 2;
                    this.f3043m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3052v == 2) {
            this.f3043m = 0.0f;
            this.f3046p = 0.0f;
            y(1);
            this.f3053w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3052v == 2) {
            A();
            if (this.f3053w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3053w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f3052v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean u8 = u(motionEvent.getX(), motionEvent.getY());
        boolean t8 = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!u8 && !t8)) {
            return false;
        }
        if (t8) {
            this.f3053w = 1;
            this.f3046p = (int) motionEvent.getX();
        } else if (u8) {
            this.f3053w = 2;
            this.f3043m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3047q != this.f3049s.getWidth() || this.f3048r != this.f3049s.getHeight()) {
            this.f3047q = this.f3049s.getWidth();
            this.f3048r = this.f3049s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3050t) {
                n(canvas);
            }
            if (this.f3051u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3049s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3049s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    public final void k() {
        this.f3049s.removeCallbacks(this.B);
    }

    public final void l() {
        this.f3049s.i1(this);
        this.f3049s.j1(this);
        this.f3049s.k1(this.C);
        k();
    }

    public final void m(Canvas canvas) {
        int i10 = this.f3048r;
        int i11 = this.f3039i;
        int i12 = this.f3045o;
        int i13 = this.f3044n;
        this.f3037g.setBounds(0, 0, i13, i11);
        this.f3038h.setBounds(0, 0, this.f3047q, this.f3040j);
        canvas.translate(0.0f, i10 - i11);
        this.f3038h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f3037g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void n(Canvas canvas) {
        int i10 = this.f3047q;
        int i11 = this.f3035e;
        int i12 = i10 - i11;
        int i13 = this.f3042l;
        int i14 = this.f3041k;
        int i15 = i13 - (i14 / 2);
        this.f3033c.setBounds(0, 0, i11, i14);
        this.f3034d.setBounds(0, 0, this.f3036f, this.f3048r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f3034d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3033c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3034d.draw(canvas);
        canvas.translate(this.f3035e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3033c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3035e, -i15);
    }

    public final int[] o() {
        int[] iArr = this.f3055y;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3047q - i10;
        return iArr;
    }

    public final int[] p() {
        int[] iArr = this.f3054x;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3048r - i10;
        return iArr;
    }

    public void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3056z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3056z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3056z.setDuration(i10);
        this.f3056z.start();
    }

    public final void r(float f10) {
        int[] o8 = o();
        float max = Math.max(o8[0], Math.min(o8[1], f10));
        if (Math.abs(this.f3045o - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f3046p, max, o8, this.f3049s.computeHorizontalScrollRange(), this.f3049s.computeHorizontalScrollOffset(), this.f3047q);
        if (x10 != 0) {
            this.f3049s.scrollBy(x10, 0);
        }
        this.f3046p = max;
    }

    public final boolean s() {
        return this.f3049s.getLayoutDirection() == 1;
    }

    public boolean t(float f10, float f11) {
        if (f11 < this.f3048r - this.f3039i) {
            return false;
        }
        int i10 = this.f3045o;
        int i11 = this.f3044n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f3035e) {
                return false;
            }
        } else if (f10 < this.f3047q - this.f3035e) {
            return false;
        }
        int i10 = this.f3042l;
        int i11 = this.f3041k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    public void v() {
        this.f3049s.invalidate();
    }

    public final void w(int i10) {
        k();
        this.f3049s.postDelayed(this.B, i10);
    }

    public final int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void y(int i10) {
        if (i10 == 2 && this.f3052v != 2) {
            this.f3033c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3052v == 2 && i10 != 2) {
            this.f3033c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f3052v = i10;
    }

    public final void z() {
        this.f3049s.j(this);
        this.f3049s.m(this);
        this.f3049s.n(this.C);
    }
}
