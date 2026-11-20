package kd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import y2.c;

/* loaded from: classes2.dex */
public class p extends r {

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f22530s = true;

    /* renamed from: e, reason: collision with root package name */
    public final int f22531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22532f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22533g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f22534h;

    /* renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f22535i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f22536j;

    /* renamed from: k, reason: collision with root package name */
    public final c.a f22537k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22538l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22539m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22540n;

    /* renamed from: o, reason: collision with root package name */
    public long f22541o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f22542p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f22543q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f22544r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f22544r.start();
        }
    }

    public p(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f22535i = new View.OnClickListener() { // from class: kd.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.J();
            }
        };
        this.f22536j = new View.OnFocusChangeListener() { // from class: kd.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(p.this, view, z10);
            }
        };
        this.f22537k = new c.a() { // from class: kd.n
            @Override // y2.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(p.this, z10);
            }
        };
        this.f22541o = Long.MAX_VALUE;
        this.f22532f = cd.h.f(aVar.getContext(), ic.b.L, 67);
        this.f22531e = cd.h.f(aVar.getContext(), ic.b.L, 50);
        this.f22533g = cd.h.g(aVar.getContext(), ic.b.Q, jc.a.f21659a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    @NonNull
    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f22544r = E(this.f22532f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f22531e, 1.0f, 0.0f);
        this.f22543q = E;
        E.addListener(new a());
    }

    public static /* synthetic */ void v(p pVar) {
        boolean isPopupShowing = pVar.f22534h.isPopupShowing();
        pVar.H(isPopupShowing);
        pVar.f22539m = isPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f22534h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        o0.w0(pVar.f22548d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f22548d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f22538l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f22539m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f22539m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f22533g);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(p.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f22541o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f22540n != z10) {
            this.f22540n = z10;
            this.f22544r.cancel();
            this.f22543q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.f22534h.setOnTouchListener(new View.OnTouchListener() { // from class: kd.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(p.this, view, motionEvent);
            }
        });
        if (f22530s) {
            this.f22534h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kd.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(p.this);
                }
            });
        }
        this.f22534h.setThreshold(0);
    }

    public final void J() {
        if (this.f22534h == null) {
            return;
        }
        if (G()) {
            this.f22539m = false;
        }
        if (this.f22539m) {
            this.f22539m = false;
            return;
        }
        if (f22530s) {
            H(!this.f22540n);
        } else {
            this.f22540n = !this.f22540n;
            r();
        }
        if (!this.f22540n) {
            this.f22534h.dismissDropDown();
        } else {
            this.f22534h.requestFocus();
            this.f22534h.showDropDown();
        }
    }

    public final void K() {
        this.f22539m = true;
        this.f22541o = System.currentTimeMillis();
    }

    @Override // kd.r
    public void a(Editable editable) {
        if (this.f22542p.isTouchExplorationEnabled() && q.a(this.f22534h) && !this.f22548d.hasFocus()) {
            this.f22534h.dismissDropDown();
        }
        this.f22534h.post(new Runnable() { // from class: kd.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(p.this);
            }
        });
    }

    @Override // kd.r
    public int c() {
        return ic.i.f20532g;
    }

    @Override // kd.r
    public int d() {
        return f22530s ? ic.e.f20474j : ic.e.f20475k;
    }

    @Override // kd.r
    public View.OnFocusChangeListener e() {
        return this.f22536j;
    }

    @Override // kd.r
    public View.OnClickListener f() {
        return this.f22535i;
    }

    @Override // kd.r
    public c.a h() {
        return this.f22537k;
    }

    @Override // kd.r
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // kd.r
    public boolean j() {
        return true;
    }

    @Override // kd.r
    public boolean k() {
        return this.f22538l;
    }

    @Override // kd.r
    public boolean l() {
        return true;
    }

    @Override // kd.r
    public boolean m() {
        return this.f22540n;
    }

    @Override // kd.r
    public void n(EditText editText) {
        this.f22534h = D(editText);
        I();
        this.f22546a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f22542p.isTouchExplorationEnabled()) {
            o0.w0(this.f22548d, 2);
        }
        this.f22546a.setEndIconVisible(true);
    }

    @Override // kd.r
    public void o(View view, @NonNull y2.p pVar) {
        if (!q.a(this.f22534h)) {
            pVar.l0(Spinner.class.getName());
        }
        if (pVar.V()) {
            pVar.x0(null);
        }
    }

    @Override // kd.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f22542p.isEnabled() || q.a(this.f22534h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f22540n && !this.f22534h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // kd.r
    public void s() {
        F();
        this.f22542p = (AccessibilityManager) this.f22547c.getSystemService("accessibility");
    }

    @Override // kd.r
    public boolean t() {
        return true;
    }

    @Override // kd.r
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f22534h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f22530s) {
                this.f22534h.setOnDismissListener(null);
            }
        }
    }
}
