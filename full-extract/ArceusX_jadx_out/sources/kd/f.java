package kd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f22510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22511f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22512g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22513h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f22514i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f22515j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f22516k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f22517l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f22518m;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.b.a0(true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.b.a0(false);
        }
    }

    public f(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f22515j = new View.OnClickListener() { // from class: kd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(f.this, view);
            }
        };
        this.f22516k = new View.OnFocusChangeListener() { // from class: kd.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                r0.A(f.this.E());
            }
        };
        this.f22510e = cd.h.f(aVar.getContext(), ic.b.L, 100);
        this.f22511f = cd.h.f(aVar.getContext(), ic.b.L, 150);
        this.f22512g = cd.h.g(aVar.getContext(), ic.b.Q, jc.a.f21659a);
        this.f22513h = cd.h.g(aVar.getContext(), ic.b.P, jc.a.f21661d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f22514i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f22548d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f22548d.setScaleX(floatValue);
        fVar.f22548d.setScaleY(floatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.b.F() == z10;
        if (z10 && !this.f22517l.isRunning()) {
            this.f22518m.cancel();
            this.f22517l.start();
            if (z11) {
                this.f22517l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f22517l.cancel();
        this.f22518m.start();
        if (z11) {
            this.f22518m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f22512g);
        ofFloat.setDuration(this.f22510e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f22513h);
        ofFloat.setDuration(this.f22511f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22517l = animatorSet;
        animatorSet.playTogether(C, B);
        this.f22517l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f22518m = B2;
        B2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f22514i;
        if (editText != null) {
            return (editText.hasFocus() || this.f22548d.hasFocus()) && this.f22514i.getText().length() > 0;
        }
        return false;
    }

    @Override // kd.r
    public void a(@NonNull Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // kd.r
    public int c() {
        return ic.i.f20530e;
    }

    @Override // kd.r
    public int d() {
        return ic.e.f20476l;
    }

    @Override // kd.r
    public View.OnFocusChangeListener e() {
        return this.f22516k;
    }

    @Override // kd.r
    public View.OnClickListener f() {
        return this.f22515j;
    }

    @Override // kd.r
    public View.OnFocusChangeListener g() {
        return this.f22516k;
    }

    @Override // kd.r
    public void n(EditText editText) {
        this.f22514i = editText;
        this.f22546a.setEndIconVisible(E());
    }

    @Override // kd.r
    public void q(boolean z10) {
        if (this.b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // kd.r
    public void s() {
        D();
    }

    @Override // kd.r
    public void u() {
        EditText editText = this.f22514i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: kd.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.A(true);
                }
            });
        }
    }
}
