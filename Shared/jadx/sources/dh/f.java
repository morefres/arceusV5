package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.mlkit.common.MlKitException;
import rg.s0;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public View f14751a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public float f14752c;

    /* renamed from: d, reason: collision with root package name */
    public float f14753d;

    /* renamed from: e, reason: collision with root package name */
    public float f14754e;

    /* renamed from: f, reason: collision with root package name */
    public int f14755f;

    /* renamed from: g, reason: collision with root package name */
    public int f14756g;

    /* renamed from: h, reason: collision with root package name */
    public int f14757h;

    /* renamed from: i, reason: collision with root package name */
    public int f14758i;

    /* renamed from: j, reason: collision with root package name */
    public int f14759j;

    /* renamed from: k, reason: collision with root package name */
    public int f14760k;

    /* renamed from: l, reason: collision with root package name */
    public int f14761l;

    /* renamed from: m, reason: collision with root package name */
    public int f14762m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14763n = false;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f14764o = null;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f14765p = null;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f14766q = null;

    /* renamed from: r, reason: collision with root package name */
    public Rect f14767r = null;

    /* renamed from: s, reason: collision with root package name */
    public final int f14768s = 60;

    /* renamed from: t, reason: collision with root package name */
    public final int f14769t = 10;

    /* renamed from: u, reason: collision with root package name */
    public final int f14770u = 12105912;

    /* renamed from: v, reason: collision with root package name */
    public final int f14771v = 3500;

    /* renamed from: w, reason: collision with root package name */
    public final int f14772w = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;

    /* renamed from: x, reason: collision with root package name */
    public final float f14773x = 50.0f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14753d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.f14751a.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14757h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14757h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.f14751a.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f14763n = false;
            f.this.h();
        }
    }

    public f(View view, AttributeSet attributeSet) {
        this.f14751a = null;
        if (view != null) {
            this.f14751a = view;
            if (attributeSet == null) {
                this.f14753d = 50.0f;
                this.f14754e = 50.0f;
                this.f14758i = 3500;
                this.f14759j = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
                this.f14755f = 60;
                this.f14756g = 10;
                this.f14760k = 12105912;
                this.f14762m = 12105912;
                return;
            }
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, s0.D0);
            float f10 = obtainStyledAttributes.getFloat(s0.K0, 50.0f);
            this.f14753d = f10;
            this.f14754e = f10;
            this.f14758i = obtainStyledAttributes.getInt(s0.G0, 3500);
            this.f14759j = obtainStyledAttributes.getInt(s0.H0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
            this.f14755f = obtainStyledAttributes.getInt(s0.I0, 60);
            this.f14756g = obtainStyledAttributes.getInt(s0.E0, 10);
            this.f14760k = obtainStyledAttributes.getColor(s0.J0, 12105912);
            this.f14762m = obtainStyledAttributes.getColor(s0.F0, 12105912);
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f14764o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f14765p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f14766q) != null && valueAnimator2.isRunning();
    }

    public final float g(int i10, int i11) {
        int i12;
        int i13;
        Rect rect = this.f14767r;
        if (rect != null) {
            int i14 = rect.left;
            int i15 = i10 - i14;
            int i16 = rect.right;
            i12 = i15 > i16 - i10 ? i10 - i14 : i16 - i10;
            int i17 = rect.top;
            int i18 = i11 - i17;
            int i19 = rect.bottom;
            i13 = i18 > i19 - i11 ? i11 - i17 : i19 - i11;
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (i13 > i12) {
            i12 = i13;
        }
        return i12 + 300.0f;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.f14764o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14764o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f14765p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f14765p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f14766q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f14766q.removeAllListeners();
        }
    }

    public void i(Canvas canvas) {
        if (this.f14763n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f14761l);
            paint.setAlpha(this.f14757h);
            canvas.drawCircle(this.b, this.f14752c, this.f14753d, paint);
        }
    }

    public final void j() {
        if (f()) {
            h();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f14757h, 0);
        this.f14765p = ofInt;
        ofInt.addUpdateListener(new c());
        this.f14765p.addListener(new d());
        this.f14765p.setDuration(this.f14759j);
        this.f14765p.setInterpolator(new DecelerateInterpolator());
        this.f14765p.start();
    }

    public final boolean k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f14751a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f14751a.getWidth() && i11 >= i13 && i11 <= i13 + this.f14751a.getHeight();
    }

    public void l(MotionEvent motionEvent) {
        if (this.f14767r == null) {
            Rect rect = new Rect();
            this.f14767r = rect;
            this.f14751a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14763n = true;
            this.b = motionEvent.getX();
            this.f14752c = motionEvent.getY();
            m();
            return;
        }
        if (action == 1) {
            j();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            j();
        } else {
            if (k((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            j();
        }
    }

    public final void m() {
        if (f()) {
            h();
        }
        float f10 = this.f14754e;
        this.f14753d = f10;
        this.f14757h = this.f14755f;
        this.f14761l = this.f14760k;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, g((int) this.b, (int) this.f14752c));
        this.f14764o = ofFloat;
        ofFloat.addUpdateListener(new a());
        this.f14764o.setDuration(this.f14758i);
        this.f14764o.setInterpolator(new g4.c());
        this.f14764o.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f14757h, this.f14756g);
        this.f14765p = ofInt;
        ofInt.addUpdateListener(new b());
        this.f14765p.setDuration(this.f14758i);
        this.f14765p.setInterpolator(new g4.a());
        this.f14765p.start();
    }
}
