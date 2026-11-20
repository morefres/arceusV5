package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e.BackEventCompat;
import hd.g;
import hd.k;
import ic.i;
import id.d;
import id.e;
import id.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import r3.c;
import y2.p;
import y2.s;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements cd.b {

    /* renamed from: a, reason: collision with root package name */
    public d f8164a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public g f8165c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8166d;

    /* renamed from: e, reason: collision with root package name */
    public k f8167e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f8168f;

    /* renamed from: g, reason: collision with root package name */
    public float f8169g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8170h;

    /* renamed from: i, reason: collision with root package name */
    public int f8171i;

    /* renamed from: j, reason: collision with root package name */
    public int f8172j;

    /* renamed from: k, reason: collision with root package name */
    public r3.c f8173k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8174l;

    /* renamed from: m, reason: collision with root package name */
    public float f8175m;

    /* renamed from: n, reason: collision with root package name */
    public int f8176n;

    /* renamed from: o, reason: collision with root package name */
    public int f8177o;

    /* renamed from: p, reason: collision with root package name */
    public int f8178p;

    /* renamed from: q, reason: collision with root package name */
    public int f8179q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference<V> f8180r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference<View> f8181s;

    /* renamed from: t, reason: collision with root package name */
    public int f8182t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f8183u;

    /* renamed from: v, reason: collision with root package name */
    public cd.g f8184v;

    /* renamed from: w, reason: collision with root package name */
    public int f8185w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final Set<j> f8186x;

    /* renamed from: y, reason: collision with root package name */
    public final c.AbstractC0532c f8187y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f8163z = i.f20548w;
    public static final int A = ic.j.f20561n;

    public class a extends c.AbstractC0532c {
        public a() {
        }

        @Override // r3.c.AbstractC0532c
        public int a(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, SideSheetBehavior.this.f8164a.g(), SideSheetBehavior.this.f8164a.f());
        }

        @Override // r3.c.AbstractC0532c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // r3.c.AbstractC0532c
        public int d(@NonNull View view) {
            return SideSheetBehavior.this.f8176n + SideSheetBehavior.this.k0();
        }

        @Override // r3.c.AbstractC0532c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f8170h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // r3.c.AbstractC0532c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View f02 = SideSheetBehavior.this.f0();
            if (f02 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) != null) {
                SideSheetBehavior.this.f8164a.p(marginLayoutParams, view.getLeft(), view.getRight());
                f02.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // r3.c.AbstractC0532c
        public void l(@NonNull View view, float f10, float f11) {
            int W = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, W, sideSheetBehavior.K0());
        }

        @Override // r3.c.AbstractC0532c
        public boolean m(@NonNull View view, int i10) {
            return (SideSheetBehavior.this.f8171i == 1 || SideSheetBehavior.this.f8180r == null || SideSheetBehavior.this.f8180r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f8180r == null || SideSheetBehavior.this.f8180r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f8180r.get()).requestLayout();
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f8191a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f8192c = new Runnable() { // from class: id.i
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(SideSheetBehavior.c.this);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.b = false;
            if (SideSheetBehavior.this.f8173k != null && SideSheetBehavior.this.f8173k.k(true)) {
                cVar.b(cVar.f8191a);
            } else if (SideSheetBehavior.this.f8171i == 2) {
                SideSheetBehavior.this.G0(cVar.f8191a);
            }
        }

        public void b(int i10) {
            if (SideSheetBehavior.this.f8180r == null || SideSheetBehavior.this.f8180r.get() == null) {
                return;
            }
            this.f8191a = i10;
            if (this.b) {
                return;
            }
            o0.e0((View) SideSheetBehavior.this.f8180r.get(), this.f8192c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f8168f = new c();
        this.f8170h = true;
        this.f8171i = 5;
        this.f8172j = 5;
        this.f8175m = 0.1f;
        this.f8182t = -1;
        this.f8186x = new LinkedHashSet();
        this.f8187y = new a();
    }

    private void A0(@NonNull V v5, Runnable runnable) {
        if (v0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean H0() {
        if (this.f8173k != null) {
            return this.f8170h || this.f8171i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, s.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v5 = sideSheetBehavior.f8180r.get();
        if (v5 != null) {
            sideSheetBehavior.L0(v5, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f8164a.o(marginLayoutParams, jc.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f8168f.b(i10);
        }
    }

    private void M0() {
        V v5;
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        o0.g0(v5, 262144);
        o0.g0(v5, 1048576);
        if (this.f8171i != 5) {
            y0(v5, p.a.f36287y, 5);
        }
        if (this.f8171i != 3) {
            y0(v5, p.a.f36285w, 3);
        }
    }

    private s Y(final int i10) {
        return new s() { // from class: id.g
            @Override // y2.s
            public final boolean a(View view, s.a aVar) {
                return SideSheetBehavior.I(SideSheetBehavior.this, i10, view, aVar);
            }
        };
    }

    private void Z(@NonNull Context context) {
        if (this.f8167e == null) {
            return;
        }
        g gVar = new g(this.f8167e);
        this.f8165c = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f8166d;
        if (colorStateList != null) {
            this.f8165c.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f8165c.setTint(typedValue.data);
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    private void y0(V v5, p.a aVar, int i10) {
        o0.i0(v5, aVar, null, Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.B(coordinatorLayout, v5, savedState.a());
        }
        int i10 = savedState.f8188c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f8171i = i10;
        this.f8172j = i10;
    }

    public void B0(int i10) {
        this.f8182t = i10;
        X();
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference != null) {
            V v5 = weakReference.get();
            if (i10 == -1 || !o0.R(v5)) {
                return;
            }
            v5.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.C(coordinatorLayout, v5), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z10) {
        this.f8170h = z10;
    }

    public final void D0(int i10) {
        d dVar = this.f8164a;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f8164a = new id.b(this);
                if (this.f8167e == null || s0()) {
                    return;
                }
                k.b v5 = this.f8167e.v();
                v5.E(0.0f).w(0.0f);
                O0(v5.m());
                return;
            }
            if (i10 == 1) {
                this.f8164a = new id.a(this);
                if (this.f8167e == null || r0()) {
                    return;
                }
                k.b v10 = this.f8167e.v();
                v10.A(0.0f).s(0.0f);
                O0(v10.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    public final void E0(@NonNull V v5, int i10) {
        D0(androidx.core.view.k.b(((CoordinatorLayout.f) v5.getLayoutParams()).f1574c, i10) == 3 ? 1 : 0);
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0(this.f8180r.get(), new Runnable() { // from class: id.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(SideSheetBehavior.this, i10);
                }
            });
        }
    }

    public void G0(int i10) {
        V v5;
        if (this.f8171i == i10) {
            return;
        }
        this.f8171i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f8172j = i10;
        }
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        P0(v5);
        Iterator<j> it = this.f8186x.iterator();
        while (it.hasNext()) {
            it.next().a(v5, i10);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8171i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f8173k.z(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8183u == null) {
            this.f8183u = VelocityTracker.obtain();
        }
        this.f8183u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f8174l && t0(motionEvent)) {
            this.f8173k.b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8174l;
    }

    public boolean I0(@NonNull View view, float f10) {
        return this.f8164a.n(view, f10);
    }

    public final boolean J0(@NonNull V v5) {
        return (v5.isShown() || o0.o(v5) != null) && this.f8170h;
    }

    public boolean K0() {
        return true;
    }

    public final void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v5 = this.f8180r.get();
        View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return;
        }
        this.f8164a.o(marginLayoutParams, (int) ((this.f8176n * v5.getScaleX()) + this.f8179q));
        f02.requestLayout();
    }

    public final void O0(@NonNull k kVar) {
        g gVar = this.f8165c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    public final void P0(@NonNull View view) {
        int i10 = this.f8171i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public final int U(int i10, V v5) {
        int i11 = this.f8171i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f8164a.h(v5);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f8164a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f8171i);
    }

    public final float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    public final int W(@NonNull View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f8164a.m(f10, f11) || this.f8164a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && e.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f8164a.e()) ? 3 : 5;
    }

    public final void X() {
        WeakReference<View> weakReference = this.f8181s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8181s = null;
    }

    @Override // cd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        cd.g gVar = this.f8184v;
        if (gVar == null) {
            return;
        }
        gVar.l(backEventCompat, h0());
        N0();
    }

    public final void a0(@NonNull View view, int i10) {
        if (this.f8186x.isEmpty()) {
            return;
        }
        float b10 = this.f8164a.b(i10);
        Iterator<j> it = this.f8186x.iterator();
        while (it.hasNext()) {
            it.next().b(view, b10);
        }
    }

    @Override // cd.b
    public void b() {
        cd.g gVar = this.f8184v;
        if (gVar == null) {
            return;
        }
        gVar.f();
    }

    public final void b0(View view) {
        if (o0.o(view) == null) {
            o0.p0(view, view.getResources().getString(f8163z));
        }
    }

    @Override // cd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        cd.g gVar = this.f8184v;
        if (gVar == null) {
            return;
        }
        gVar.j(backEventCompat);
    }

    @Override // cd.b
    public void d() {
        cd.g gVar = this.f8184v;
        if (gVar == null) {
            return;
        }
        BackEventCompat c10 = gVar.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f8184v.h(c10, h0(), new b(), e0());
        }
    }

    public int d0() {
        return this.f8176n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return null;
        }
        final int c10 = this.f8164a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: id.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(SideSheetBehavior.this, marginLayoutParams, c10, f02, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference<View> weakReference = this.f8181s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f8164a.d();
    }

    public final int h0() {
        d dVar = this.f8164a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f8175m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f8180r = null;
        this.f8173k = null;
        this.f8184v = null;
    }

    public int k0() {
        return this.f8179q;
    }

    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f8164a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    public int m0() {
        return this.f8178p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f8180r = null;
        this.f8173k = null;
        this.f8184v = null;
    }

    public int n0() {
        return this.f8177o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        r3.c cVar;
        if (!J0(v5)) {
            this.f8174l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f8183u == null) {
            this.f8183u = VelocityTracker.obtain();
        }
        this.f8183u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f8185w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f8174l) {
            this.f8174l = false;
            return false;
        }
        return (this.f8174l || (cVar = this.f8173k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.f8180r == null) {
            this.f8180r = new WeakReference<>(v5);
            this.f8184v = new cd.g(v5);
            g gVar = this.f8165c;
            if (gVar != null) {
                o0.q0(v5, gVar);
                g gVar2 = this.f8165c;
                float f10 = this.f8169g;
                if (f10 == -1.0f) {
                    f10 = o0.u(v5);
                }
                gVar2.Z(f10);
            } else {
                ColorStateList colorStateList = this.f8166d;
                if (colorStateList != null) {
                    o0.r0(v5, colorStateList);
                }
            }
            P0(v5);
            M0();
            if (o0.x(v5) == 0) {
                o0.w0(v5, 1);
            }
            b0(v5);
        }
        E0(v5, i10);
        if (this.f8173k == null) {
            this.f8173k = r3.c.m(coordinatorLayout, this.f8187y);
        }
        int h10 = this.f8164a.h(v5);
        coordinatorLayout.I(v5, i10);
        this.f8177o = coordinatorLayout.getWidth();
        this.f8178p = this.f8164a.i(coordinatorLayout);
        this.f8176n = v5.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        this.f8179q = marginLayoutParams != null ? this.f8164a.a(marginLayoutParams) : 0;
        o0.W(v5, U(h10, v5));
        x0(coordinatorLayout);
        for (j jVar : this.f8186x) {
            if (jVar instanceof j) {
                jVar.c(v5);
            }
        }
        return true;
    }

    public r3.c p0() {
        return this.f8173k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.f q0() {
        V v5;
        WeakReference<V> weakReference = this.f8180r;
        if (weakReference == null || (v5 = weakReference.get()) == null || !(v5.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v5.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && ((ViewGroup.MarginLayoutParams) q02).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && ((ViewGroup.MarginLayoutParams) q02).rightMargin > 0;
    }

    public final boolean t0(@NonNull MotionEvent motionEvent) {
        return H0() && V((float) this.f8185w, motionEvent.getX()) > ((float) this.f8173k.u());
    }

    public final boolean u0(float f10) {
        return this.f8164a.k(f10);
    }

    public final boolean v0(@NonNull V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v5);
    }

    public final boolean w0(View view, int i10, boolean z10) {
        int l02 = l0(i10);
        r3.c p02 = p0();
        if (p02 != null) {
            return z10 ? p02.F(l02, view.getTop()) : p02.H(view, l02, view.getTop());
        }
        return false;
    }

    public final void x0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f8181s != null || (i10 = this.f8182t) == -1 || (findViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f8181s = new WeakReference<>(findViewById);
    }

    public final void z0() {
        VelocityTracker velocityTracker = this.f8183u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8183u = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f8188c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8188c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f8188c);
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f8188c = sideSheetBehavior.f8171i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8168f = new c();
        this.f8170h = true;
        this.f8171i = 5;
        this.f8172j = 5;
        this.f8175m = 0.1f;
        this.f8182t = -1;
        this.f8186x = new LinkedHashSet();
        this.f8187y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.D5);
        if (obtainStyledAttributes.hasValue(ic.k.F5)) {
            this.f8166d = ed.c.a(context, obtainStyledAttributes, ic.k.F5);
        }
        if (obtainStyledAttributes.hasValue(ic.k.I5)) {
            this.f8167e = k.e(context, attributeSet, 0, A).m();
        }
        if (obtainStyledAttributes.hasValue(ic.k.H5)) {
            B0(obtainStyledAttributes.getResourceId(ic.k.H5, -1));
        }
        Z(context);
        this.f8169g = obtainStyledAttributes.getDimension(ic.k.E5, -1.0f);
        C0(obtainStyledAttributes.getBoolean(ic.k.G5, true));
        obtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
