package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.t;
import androidx.customview.view.AbsSavedState;
import hd.g;
import hd.h;
import ic.j;
import ic.k;
import java.lang.ref.WeakReference;
import java.util.List;
import kc.e;
import y2.p;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: y, reason: collision with root package name */
    public static final int f7525y = j.f20553f;

    /* renamed from: a, reason: collision with root package name */
    public int f7526a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f7527c;

    /* renamed from: d, reason: collision with root package name */
    public int f7528d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7529e;

    /* renamed from: f, reason: collision with root package name */
    public int f7530f;

    /* renamed from: g, reason: collision with root package name */
    public WindowInsetsCompat f7531g;

    /* renamed from: h, reason: collision with root package name */
    public List<a> f7532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7533i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7534j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7535k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7536l;

    /* renamed from: m, reason: collision with root package name */
    public int f7537m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<View> f7538n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7539o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f7540p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f7541q;

    /* renamed from: r, reason: collision with root package name */
    public final long f7542r;

    /* renamed from: s, reason: collision with root package name */
    public final TimeInterpolator f7543s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f7544t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f7545u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f7546v;

    /* renamed from: w, reason: collision with root package name */
    public final float f7547w;

    /* renamed from: x, reason: collision with root package name */
    public Behavior f7548x;

    public static class BaseBehavior<T extends AppBarLayout> extends kc.a<T> {

        /* renamed from: k, reason: collision with root package name */
        public int f7549k;

        /* renamed from: l, reason: collision with root package name */
        public int f7550l;

        /* renamed from: m, reason: collision with root package name */
        public ValueAnimator f7551m;

        /* renamed from: n, reason: collision with root package name */
        public SavedState f7552n;

        /* renamed from: o, reason: collision with root package name */
        public WeakReference<View> f7553o;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f7559a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7559a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f7559a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f7561d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f7562e;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f7561d = appBarLayout;
                this.f7562e = coordinatorLayout;
            }

            @Override // androidx.core.view.a
            public void g(View view, @NonNull p pVar) {
                View j02;
                super.g(view, pVar);
                pVar.l0(ScrollView.class.getName());
                if (this.f7561d.getTotalScrollRange() == 0 || (j02 = BaseBehavior.this.j0(this.f7562e)) == null || !BaseBehavior.this.f0(this.f7561d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f7561d.getTotalScrollRange())) {
                    pVar.b(p.a.f36279q);
                    pVar.G0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!j02.canScrollVertically(-1)) {
                        pVar.b(p.a.f36280r);
                        pVar.G0(true);
                    } else if ((-this.f7561d.getDownNestedPreScrollRange()) != 0) {
                        pVar.b(p.a.f36280r);
                        pVar.G0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f7561d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View j02 = BaseBehavior.this.j0(this.f7562e);
                    if (!j02.canScrollVertically(-1)) {
                        this.f7561d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f7561d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f7562e, this.f7561d, j02, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public static View h0(@NonNull AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            int topInset = t8.getTopInset() + t8.getPaddingTop();
            int Q = Q() - topInset;
            int i02 = i0(t8, Q);
            if (i02 >= 0) {
                View childAt = t8.getChildAt(i02);
                d dVar = (d) childAt.getLayoutParams();
                int c10 = dVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (i02 == 0 && o0.w(t8) && o0.w(childAt)) {
                        i10 -= t8.getTopInset();
                    }
                    if (e0(c10, 2)) {
                        i11 += o0.A(childAt);
                    } else if (e0(c10, 5)) {
                        int A = o0.A(childAt) + i11;
                        if (Q < A) {
                            i10 = A;
                        } else {
                            i11 = A;
                        }
                    }
                    if (e0(c10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t8, s2.a.c(b0(Q, i11, i10) + topInset, -t8.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, boolean z10) {
            View h02 = h0(t8, i10);
            boolean z11 = false;
            if (h02 != null) {
                int c10 = ((d) h02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int A = o0.A(h02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (h02.getBottom() - A) - t8.getTopInset()) : (-i10) >= (h02.getBottom() - A) - t8.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (t8.k()) {
                z11 = t8.u(g0(coordinatorLayout));
            }
            boolean r8 = t8.r(z11);
            if (z10 || (r8 && z0(coordinatorLayout, t8))) {
                if (t8.getBackground() != null) {
                    t8.getBackground().jumpToCurrentState();
                }
                if (t8.getForeground() != null) {
                    t8.getForeground().jumpToCurrentState();
                }
                if (t8.getStateListAnimator() != null) {
                    t8.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // kc.a
        public int Q() {
            return I() + this.f7549k;
        }

        public final void Y(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            if (o0.M(coordinatorLayout)) {
                return;
            }
            o0.m0(coordinatorLayout, new b(t8, coordinatorLayout));
        }

        public final void Z(CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, float f10) {
            int abs = Math.abs(Q() - i10);
            float abs2 = Math.abs(f10);
            a0(coordinatorLayout, t8, i10, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t8.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, T t8, int i10, int i11) {
            int Q = Q();
            if (Q == i10) {
                ValueAnimator valueAnimator = this.f7551m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f7551m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f7551m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7551m = valueAnimator3;
                valueAnimator3.setInterpolator(jc.a.f21662e);
                this.f7551m.addUpdateListener(new a(coordinatorLayout, t8));
            } else {
                valueAnimator2.cancel();
            }
            this.f7551m.setDuration(Math.min(i11, 600));
            this.f7551m.setIntValues(Q, i10);
            this.f7551m.start();
        }

        public final int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        @Override // kc.a
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t8) {
            WeakReference<View> weakReference = this.f7553o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view) {
            return t8.i() && coordinatorLayout.getHeight() - view.getHeight() <= t8.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f7565a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof t) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(@NonNull T t8, int i10) {
            int childCount = t8.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t8.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (e0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // kc.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(@NonNull T t8) {
            return (-t8.getDownNestedScrollRange()) + t8.getTopInset();
        }

        @Override // kc.a
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(@NonNull T t8) {
            return t8.getTotalScrollRange();
        }

        public final int m0(@NonNull T t8, int i10) {
            int abs = Math.abs(i10);
            int childCount = t8.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t8.getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator d10 = dVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = dVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= o0.A(childAt);
                        }
                    }
                    if (o0.w(childAt)) {
                        i11 -= t8.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        @Override // kc.a
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            A0(coordinatorLayout, t8);
            if (t8.k()) {
                t8.r(t8.u(g0(coordinatorLayout)));
            }
        }

        @Override // kc.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10) {
            boolean p8 = super.p(coordinatorLayout, t8, i10);
            int pendingAction = t8.getPendingAction();
            SavedState savedState = this.f7552n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t8.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, t8, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, t8, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, t8, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, t8, 0);
                        }
                    }
                }
            } else if (savedState.f7554c) {
                T(coordinatorLayout, t8, -t8.getTotalScrollRange());
            } else if (savedState.f7555d) {
                T(coordinatorLayout, t8, 0);
            } else {
                View childAt = t8.getChildAt(savedState.f7556e);
                T(coordinatorLayout, t8, (-childAt.getBottom()) + (this.f7552n.f7558g ? o0.A(childAt) + t8.getTopInset() : Math.round(childAt.getHeight() * this.f7552n.f7557f)));
            }
            t8.n();
            this.f7552n = null;
            K(s2.a.c(I(), -t8.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t8, I(), 0, true);
            t8.m(I());
            Y(coordinatorLayout, t8);
            return p8;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t8.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t8, i10, i11, i12, i13);
            }
            coordinatorLayout.J(t8, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u(androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.S(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.k()
                if (r7 == 0) goto L34
                boolean r7 = r2.u(r9)
                r2.r(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, t10, i15, -t8.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                w0((SavedState) parcelable, true);
                super.B(coordinatorLayout, t8, this.f7552n.a());
            } else {
                super.B(coordinatorLayout, t8, parcelable);
                this.f7552n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            Parcelable C = super.C(coordinatorLayout, t8);
            SavedState x02 = x0(C, t8);
            return x02 == null ? C : x02;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t8.k() || d0(coordinatorLayout, t8, view));
            if (z10 && (valueAnimator = this.f7551m) != null) {
                valueAnimator.cancel();
            }
            this.f7553o = null;
            this.f7550l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i10) {
            if (this.f7550l == 0 || i10 == 1) {
                A0(coordinatorLayout, t8);
                if (t8.k()) {
                    t8.r(t8.u(view));
                }
            }
            this.f7553o = new WeakReference<>(view);
        }

        public void w0(SavedState savedState, boolean z10) {
            if (this.f7552n == null || z10) {
                this.f7552n = savedState;
            }
        }

        public SavedState x0(Parcelable parcelable, @NonNull T t8) {
            int I = I();
            int childCount = t8.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t8.getChildAt(i10);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = I == 0;
                    savedState.f7555d = z10;
                    savedState.f7554c = !z10 && (-I) >= t8.getTotalScrollRange();
                    savedState.f7556e = i10;
                    savedState.f7558g = bottom == o0.A(childAt) + t8.getTopInset();
                    savedState.f7557f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // kc.a
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            T t10;
            int Q = Q();
            int i13 = 0;
            if (i11 == 0 || Q < i11 || Q > i12) {
                coordinatorLayout2 = coordinatorLayout;
                t10 = t8;
                this.f7549k = 0;
            } else {
                int c10 = s2.a.c(i10, i11, i12);
                if (Q != c10) {
                    int m02 = t8.g() ? m0(t8, c10) : c10;
                    boolean K = K(m02);
                    int i14 = Q - c10;
                    this.f7549k = c10 - m02;
                    if (K) {
                        while (i13 < t8.getChildCount()) {
                            d dVar = (d) t8.getChildAt(i13).getLayoutParams();
                            b b10 = dVar.b();
                            if (b10 != null && (dVar.c() & 1) != 0) {
                                b10.a(t8, t8.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!K && t8.g()) {
                        coordinatorLayout.f(t8);
                    }
                    t8.m(I());
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                    B0(coordinatorLayout2, t10, c10, c10 < Q ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t10 = t8;
                }
            }
            Y(coordinatorLayout2, t10);
            return i13;
        }

        public final boolean z0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            List<View> s8 = coordinatorLayout.s(t8);
            int size = s8.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s8.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public boolean f7554c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f7555d;

            /* renamed from: e, reason: collision with root package name */
            public int f7556e;

            /* renamed from: f, reason: collision with root package name */
            public float f7557f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f7558g;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
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
                this.f7554c = parcel.readByte() != 0;
                this.f7555d = parcel.readByte() != 0;
                this.f7556e = parcel.readInt();
                this.f7557f = parcel.readFloat();
                this.f7558g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f7554c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f7555d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f7556e);
                parcel.writeFloat(this.f7557f);
                parcel.writeByte(this.f7558g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // kc.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // kc.c
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // kc.c
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // kc.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends kc.b {
        public ScrollingViewBehavior() {
        }

        public static int V(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout L = L(coordinatorLayout.r(view));
            if (L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f22492d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    L.o(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // kc.b
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int V = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + V > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (V / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // kc.b
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // kc.b
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(@NonNull List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void W(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                o0.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f7549k) + Q()) - M(view2));
            }
        }

        public final void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.k()) {
                    appBarLayout.r(appBarLayout.u(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                o0.m0(coordinatorLayout, null);
            }
        }

        @Override // kc.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // kc.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f20618e5);
            S(obtainStyledAttributes.getDimensionPixelSize(k.f20627f5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t8, int i10);
    }

    public static abstract class b {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f7564a = new Rect();
        public final Rect b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10) {
            b(this.f7564a, appBarLayout, view);
            float abs = this.f7564a.top - Math.abs(f10);
            if (abs > 0.0f) {
                o0.t0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float b = 1.0f - s2.a.b(Math.abs(abs / this.f7564a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f7564a.height() * 0.3f) * (1.0f - (b * b)));
            view.setTranslationY(height);
            view.getDrawingRect(this.b);
            this.b.offset(0, (int) (-height));
            if (height >= this.b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            o0.t0(view, this.b);
        }
    }

    public final void a() {
        WeakReference<View> weakReference = this.f7538n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7538n = null;
    }

    public final Integer b() {
        Drawable drawable = this.f7545u;
        if (drawable instanceof g) {
            return Integer.valueOf(((g) drawable).A());
        }
        ColorStateList g10 = wc.c.g(drawable);
        if (g10 != null) {
            return Integer.valueOf(g10.getDefaultColor());
        }
        return null;
    }

    public final View c(View view) {
        int i10;
        if (this.f7538n == null && (i10 = this.f7537m) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f7537m);
            }
            if (findViewById != null) {
                this.f7538n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f7538n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f7526a);
            this.f7545u.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7545u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public boolean g() {
        return this.f7529e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f7548x = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int A;
        int i11 = this.f7527c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = dVar.f7565a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        A = o0.A(childAt);
                    } else if ((i13 & 2) != 0) {
                        A = measuredHeight - o0.A(childAt);
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && o0.w(childAt)) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = i14 + A;
                    if (childCount == 0) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f7527c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f7528d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i13 = dVar.f7565a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= o0.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f7528d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f7537m;
    }

    public g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g) {
            return (g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int A = o0.A(this);
        if (A == 0) {
            int childCount = getChildCount();
            A = childCount >= 1 ? o0.A(getChildAt(childCount - 1)) : 0;
            if (A == 0) {
                return getHeight() / 3;
            }
        }
        return (A * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f7530f;
    }

    public Drawable getStatusBarForeground() {
        return this.f7545u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f7531g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = dVar.f7565a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && o0.w(childAt)) {
                    i12 -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    i12 -= o0.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return getTotalScrollRange() != 0;
    }

    public final void j() {
        Behavior behavior = this.f7548x;
        BaseBehavior.SavedState x02 = (behavior == null || this.b == -1 || this.f7530f != 0) ? null : behavior.x0(AbsSavedState.b, this);
        this.b = -1;
        this.f7527c = -1;
        this.f7528d = -1;
        if (x02 != null) {
            this.f7548x.w0(x02, false);
        }
    }

    public boolean k() {
        return this.f7536l;
    }

    public final boolean l() {
        return getBackground() instanceof g;
    }

    public void m(int i10) {
        this.f7526a = i10;
        if (!willNotDraw()) {
            o0.d0(this);
        }
        List<a> list = this.f7532h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f7532h.get(i11);
                if (aVar != null) {
                    aVar.a(this, i10);
                }
            }
        }
    }

    public void n() {
        this.f7530f = 0;
    }

    public void o(boolean z10, boolean z11) {
        p(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f7544t == null) {
            this.f7544t = new int[4];
        }
        int[] iArr = this.f7544t;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f7534j;
        int i11 = ic.b.f20390c0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f7535k) ? ic.b.f20392d0 : -ic.b.f20392d0;
        int i12 = ic.b.Y;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f7535k) ? ic.b.X : -ic.b.X;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (o0.w(this) && v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o0.X(getChildAt(childCount), topInset);
            }
        }
        j();
        this.f7529e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f7529e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f7545u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f7533i) {
            return;
        }
        if (!this.f7536l && !h()) {
            z11 = false;
        }
        q(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && o0.w(this) && v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = s2.a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        j();
    }

    public final void p(boolean z10, boolean z11, boolean z12) {
        this.f7530f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public final boolean q(boolean z10) {
        if (this.f7534j == z10) {
            return false;
        }
        this.f7534j = z10;
        refreshDrawableState();
        return true;
    }

    public boolean r(boolean z10) {
        return s(z10, !this.f7533i);
    }

    public boolean s(boolean z10, boolean z11) {
        if (!z11 || this.f7535k == z10) {
            return false;
        }
        this.f7535k = z10;
        refreshDrawableState();
        if (!l()) {
            return true;
        }
        if (this.f7539o) {
            w(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f7536l) {
            return true;
        }
        w(z10 ? 0.0f : this.f7547w, z10 ? this.f7547w : 0.0f);
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        o(z10, o0.R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f7536l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f7537m = -1;
        if (view == null) {
            a();
        } else {
            this.f7538n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f7537m = i10;
        a();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f7533i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f7545u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f7545u = drawable != null ? drawable.mutate() : null;
            this.f7546v = b();
            Drawable drawable3 = this.f7545u;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7545u.setState(getDrawableState());
                }
                q2.a.m(this.f7545u, o0.z(this));
                this.f7545u.setVisible(getVisibility() == 0, false);
                this.f7545u.setCallback(this);
            }
            x();
            o0.d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(k.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        e.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f7545u;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean t() {
        return this.f7545u != null && getTopInset() > 0;
    }

    public boolean u(View view) {
        View c10 = c(view);
        if (c10 != null) {
            view = c10;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean v() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !o0.w(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7545u;
    }

    public final void w(float f10, float f11) {
        ValueAnimator valueAnimator = this.f7540p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f7540p = ofFloat;
        ofFloat.setDuration(this.f7542r);
        this.f7540p.setInterpolator(this.f7543s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f7541q;
        if (animatorUpdateListener != null) {
            this.f7540p.addUpdateListener(animatorUpdateListener);
        }
        this.f7540p.start();
    }

    public final void x() {
        setWillNotDraw(!t());
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f7565a;
        public b b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f7566c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7565a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f20684m);
            this.f7565a = obtainStyledAttributes.getInt(k.f20702o, 0);
            f(obtainStyledAttributes.getInt(k.f20693n, 0));
            if (obtainStyledAttributes.hasValue(k.f20711p)) {
                this.f7566c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.f20711p, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public final b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.b;
        }

        public int c() {
            return this.f7565a;
        }

        public Interpolator d() {
            return this.f7566c;
        }

        public boolean e() {
            int i10 = this.f7565a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.b = a(i10);
        }

        public void g(int i10) {
            this.f7565a = i10;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f7565a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7565a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7565a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7565a = 1;
        }
    }
}
