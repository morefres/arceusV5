package com.google.android.material.bottomsheet;

import ad.r;
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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import e.BackEventCompat;
import hd.k;
import ic.i;
import ic.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r3.c;
import y2.p;
import y2.s;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements cd.b {

    /* renamed from: i0, reason: collision with root package name */
    public static final int f7637i0 = j.f20554g;
    public boolean A;
    public final BottomSheetBehavior<V>.h B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public r3.c O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public WeakReference<V> W;
    public WeakReference<View> X;
    public WeakReference<View> Y;

    @NonNull
    public final ArrayList<g> Z;

    /* renamed from: a, reason: collision with root package name */
    public int f7638a;

    /* renamed from: a0, reason: collision with root package name */
    public VelocityTracker f7639a0;
    public boolean b;

    /* renamed from: b0, reason: collision with root package name */
    public cd.e f7640b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7641c;

    /* renamed from: c0, reason: collision with root package name */
    public int f7642c0;

    /* renamed from: d, reason: collision with root package name */
    public float f7643d;

    /* renamed from: d0, reason: collision with root package name */
    public int f7644d0;

    /* renamed from: e, reason: collision with root package name */
    public int f7645e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f7646e0;

    /* renamed from: f, reason: collision with root package name */
    public int f7647f;

    /* renamed from: f0, reason: collision with root package name */
    public Map<View, Integer> f7648f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7649g;

    /* renamed from: g0, reason: collision with root package name */
    public final SparseIntArray f7650g0;

    /* renamed from: h, reason: collision with root package name */
    public int f7651h;

    /* renamed from: h0, reason: collision with root package name */
    public final c.AbstractC0532c f7652h0;

    /* renamed from: i, reason: collision with root package name */
    public int f7653i;

    /* renamed from: j, reason: collision with root package name */
    public hd.g f7654j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f7655k;

    /* renamed from: l, reason: collision with root package name */
    public int f7656l;

    /* renamed from: m, reason: collision with root package name */
    public int f7657m;

    /* renamed from: n, reason: collision with root package name */
    public int f7658n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7659o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7660p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7661q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7662r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7663s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7664t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7665u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7666v;

    /* renamed from: w, reason: collision with root package name */
    public int f7667w;

    /* renamed from: x, reason: collision with root package name */
    public int f7668x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7669y;

    /* renamed from: z, reason: collision with root package name */
    public k f7670z;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7676a;
        public final /* synthetic */ int b;

        public a(View view, int i10) {
            this.f7676a = view;
            this.b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.g1(this.f7676a, this.b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.W.get().requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7654j != null) {
                BottomSheetBehavior.this.f7654j.b0(floatValue);
            }
        }
    }

    public class d implements r.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7680a;

        public d(boolean z10) {
            this.f7680a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // ad.r.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.WindowInsetsCompat a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, ad.r.d r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                androidx.core.graphics.Insets r0 = r12.getInsets(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
                androidx.core.graphics.Insets r1 = r12.getInsets(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.top
                com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2, r3)
                boolean r2 = ad.r.h(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.getSystemWindowInsetBottom()
                com.google.android.material.bottomsheet.BottomSheetBehavior.W(r3, r6)
                int r3 = r13.f401d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f400c
                goto L50
            L4e:
                int r4 = r13.f399a
            L50:
                int r6 = r0.left
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f399a
                goto L62
            L60:
                int r13 = r13.f400c
            L62:
                int r2 = r0.right
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.Z(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.left
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.a0(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.right
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.top
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f7680a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.bottom
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f7680a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.L(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, androidx.core.view.WindowInsetsCompat, ad.r$d):androidx.core.view.WindowInsetsCompat");
        }
    }

    public class e extends c.AbstractC0532c {

        /* renamed from: a, reason: collision with root package name */
        public long f7681a;

        public e() {
        }

        @Override // r3.c.AbstractC0532c
        public int a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // r3.c.AbstractC0532c
        public int b(@NonNull View view, int i10, int i11) {
            return s2.a.c(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // r3.c.AbstractC0532c
        public int e(@NonNull View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // r3.c.AbstractC0532c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        @Override // r3.c.AbstractC0532c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.b.b1(r0, (r9 * 100.0f) / r10.V) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.b.F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.b.s0()) < java.lang.Math.abs(r8.getTop() - r7.b.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r7.b.e1() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        
            if (java.lang.Math.abs(r9 - r7.b.E) < java.lang.Math.abs(r9 - r7.b.H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
        
            if (r7.b.e1() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (r7.b.e1() == false) goto L63;
         */
        @Override // r3.c.AbstractC0532c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // r3.c.AbstractC0532c
        public boolean m(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.M;
            if (i11 == 1 || bottomSheetBehavior.f7646e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f7642c0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7681a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.s0()) / 2;
        }
    }

    public class f implements s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7682a;

        public f(int i10) {
            this.f7682a = i10;
        }

        @Override // y2.s
        public boolean a(@NonNull View view, s.a aVar) {
            BottomSheetBehavior.this.X0(this.f7682a);
            return true;
        }
    }

    public static abstract class g {
        public void a(@NonNull View view) {
        }

        public abstract void b(@NonNull View view, float f10);

        public abstract void c(@NonNull View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f7638a = 0;
        this.b = true;
        this.f7641c = false;
        this.f7656l = -1;
        this.f7657m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7644d0 = -1;
        this.f7650g0 = new SparseIntArray();
        this.f7652h0 = new e();
    }

    private void H0() {
        this.f7642c0 = -1;
        this.f7644d0 = -1;
        VelocityTracker velocityTracker = this.f7639a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7639a0 = null;
        }
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> q0(@NonNull V v5) {
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
        if (f10 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f10;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public boolean A0() {
        return this.f7659o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.B(coordinatorLayout, v5, savedState.a());
        I0(savedState);
        int i10 = savedState.f7671c;
        if (i10 == 1 || i10 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i10;
            this.N = i10;
        }
    }

    public boolean B0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.C(coordinatorLayout, v5), (BottomSheetBehavior<?>) this);
    }

    public boolean C0() {
        return true;
    }

    public final boolean D0(V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && o0.Q(v5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public void F0(@NonNull g gVar) {
        this.Z.remove(gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (e1() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Y0(r0)
            return
        Lf:
            boolean r3 = r2.E0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.x0()
            boolean r3 = r2.d1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.e1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.g1(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final void G0(View view, p.a aVar, int i10) {
        o0.i0(view, aVar, null, l0(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (c1()) {
            this.O.z(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.f7639a0 == null) {
            this.f7639a0 = VelocityTracker.obtain();
        }
        this.f7639a0.addMovement(motionEvent);
        if (c1() && actionMasked == 2 && !this.P && Math.abs(this.f7644d0 - motionEvent.getY()) > this.O.u()) {
            this.O.b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final void I0(@NonNull SavedState savedState) {
        int i10 = this.f7638a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f7647f = savedState.f7672d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.b = savedState.f7673e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = savedState.f7674f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = savedState.f7675g;
        }
    }

    public final void J0(V v5, Runnable runnable) {
        if (D0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void K0(boolean z10) {
        this.L = z10;
    }

    public void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i10;
        j1(this.M, true);
    }

    public void M0(boolean z10) {
        if (this.b == z10) {
            return;
        }
        this.b = z10;
        if (this.W != null) {
            d0();
        }
        Y0((this.b && this.M == 6) ? 3 : this.M);
        j1(this.M, true);
        h1();
    }

    public void N0(boolean z10) {
        this.f7659o = z10;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f10;
        if (this.W != null) {
            f0();
        }
    }

    public void P0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.M == 5) {
                X0(4);
            }
            h1();
        }
    }

    public void Q0(int i10) {
        this.f7657m = i10;
    }

    public void R0(int i10) {
        this.f7656l = i10;
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f7649g) {
                return;
            } else {
                this.f7649g = true;
            }
        } else {
            if (!this.f7649g && this.f7647f == i10) {
                return;
            }
            this.f7649g = false;
            this.f7647f = Math.max(0, i10);
        }
        l1(z10);
    }

    public void U0(int i10) {
        this.f7638a = i10;
    }

    public void V0(int i10) {
        this.f7645e = i10;
    }

    public void W0(boolean z10) {
        this.K = z10;
    }

    public void X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.b && w0(i10) <= this.E) ? 3 : i10;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i10);
        } else {
            V v5 = this.W.get();
            J0(v5, new a(v5, i11));
        }
    }

    public void Y0(int i10) {
        V v5;
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.N = i10;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            k1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            k1(false);
        }
        j1(i10, true);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).c(v5, i10);
        }
        h1();
    }

    public void Z0(boolean z10) {
        this.f7641c = z10;
    }

    @Override // cd.b
    public void a(@NonNull BackEventCompat backEventCompat) {
        cd.e eVar = this.f7640b0;
        if (eVar == null) {
            return;
        }
        eVar.l(backEventCompat);
    }

    public final void a1(@NonNull View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || A0() || this.f7649g) ? false : true;
        if (this.f7660p || this.f7661q || this.f7662r || this.f7664t || this.f7665u || this.f7666v || z10) {
            r.c(view, new d(z10));
        }
    }

    @Override // cd.b
    public void b() {
        cd.e eVar = this.f7640b0;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    public final int b0(View view, int i10, int i11) {
        return o0.c(view, view.getResources().getString(i10), l0(i11));
    }

    public boolean b1(long j10, float f10) {
        return false;
    }

    @Override // cd.b
    public void c(@NonNull BackEventCompat backEventCompat) {
        cd.e eVar = this.f7640b0;
        if (eVar == null) {
            return;
        }
        eVar.j(backEventCompat);
    }

    public void c0(@NonNull g gVar) {
        if (this.Z.contains(gVar)) {
            return;
        }
        this.Z.add(gVar);
    }

    public final boolean c1() {
        if (this.O != null) {
            return this.L || this.M == 1;
        }
        return false;
    }

    @Override // cd.b
    public void d() {
        cd.e eVar = this.f7640b0;
        if (eVar == null) {
            return;
        }
        BackEventCompat c10 = eVar.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            X0(this.J ? 5 : 4);
        } else if (this.J) {
            this.f7640b0.h(c10, new b());
        } else {
            this.f7640b0.i(c10, null);
            X0(4);
        }
    }

    public final void d0() {
        int h02 = h0();
        if (this.b) {
            this.H = Math.max(this.V - h02, this.E);
        } else {
            this.H = this.V - h02;
        }
    }

    public boolean d1(@NonNull View view, float f10) {
        if (this.K) {
            return true;
        }
        if (C0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.S)) - ((float) this.H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public final float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    public boolean e1() {
        return false;
    }

    public final void f0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public boolean f1() {
        return true;
    }

    public final float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f7654j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v5 = this.W.get();
        if (!y0() || (rootWindowInsets = v5.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f7654j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f7654j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    public final void g1(View view, int i10, boolean z10) {
        int w02 = w0(i10);
        r3.c cVar = this.O;
        if (cVar == null || (!z10 ? cVar.H(view, view.getLeft(), w02) : cVar.F(view.getLeft(), w02))) {
            Y0(i10);
            return;
        }
        Y0(2);
        j1(i10, true);
        this.B.c(i10);
    }

    public final int h0() {
        int i10;
        return this.f7649g ? Math.min(Math.max(this.f7651h, this.V - ((this.U * 9) / 16)), this.T) + this.f7667w : (this.f7659o || this.f7660p || (i10 = this.f7658n) <= 0) ? this.f7647f + this.f7667w : Math.max(this.f7647f, i10 + this.f7653i);
    }

    public final void h1() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            i1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            i1(weakReference2.get(), 1);
        }
    }

    public final float i0(int i10) {
        float f10;
        float f11;
        int i11 = this.H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.H;
            f10 = i12 - i10;
            f11 = this.V - i12;
        } else {
            int i13 = this.H;
            f10 = i13 - i10;
            f11 = i13 - s0();
        }
        return f10 / f11;
    }

    public final void i1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.b && this.M != 6) {
            this.f7650g0.put(i10, b0(view, i.f20527a, 6));
        }
        if (this.J && C0() && this.M != 5) {
            G0(view, p.a.f36287y, 5);
        }
        int i11 = this.M;
        if (i11 == 3) {
            G0(view, p.a.f36286x, this.b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            G0(view, p.a.f36285w, this.b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            G0(view, p.a.f36286x, 4);
            G0(view, p.a.f36285w, 3);
        }
    }

    public final boolean j0() {
        return B0() && C0();
    }

    public final void j1(int i10, boolean z10) {
        boolean z02;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.A == (z02 = z0()) || this.f7654j == null) {
            return;
        }
        this.A = z02;
        if (!z10 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f7654j.b0(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f7654j.y(), z02 ? g0() : 1.0f);
            this.C.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.W = null;
        this.O = null;
        this.f7640b0 = null;
    }

    public final void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        o0.g0(view, 524288);
        o0.g0(view, 262144);
        o0.g0(view, 1048576);
        int i11 = this.f7650g0.get(i10, -1);
        if (i11 != -1) {
            o0.g0(view, i11);
            this.f7650g0.delete(i10);
        }
    }

    public final void k1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f7648f0 != null) {
                    return;
                } else {
                    this.f7648f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.W.get()) {
                    if (z10) {
                        this.f7648f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f7641c) {
                            o0.w0(childAt, 4);
                        }
                    } else if (this.f7641c && (map = this.f7648f0) != null && map.containsKey(childAt)) {
                        o0.w0(childAt, this.f7648f0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f7648f0 = null;
            } else if (this.f7641c) {
                this.W.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final s l0(int i10) {
        return new f(i10);
    }

    public final void l1(boolean z10) {
        V v5;
        if (this.W != null) {
            d0();
            if (this.M != 4 || (v5 = this.W.get()) == null) {
                return;
            }
            if (z10) {
                X0(4);
            } else {
                v5.requestLayout();
            }
        }
    }

    public final void m0(@NonNull Context context) {
        if (this.f7670z == null) {
            return;
        }
        hd.g gVar = new hd.g(this.f7670z);
        this.f7654j = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f7655k;
        if (colorStateList != null) {
            this.f7654j.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7654j.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.W = null;
        this.O = null;
        this.f7640b0 = null;
    }

    public final void n0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int i10;
        r3.c cVar;
        if (!v5.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.f7639a0 == null) {
            this.f7639a0 = VelocityTracker.obtain();
        }
        this.f7639a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f7644d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x10, this.f7644d0)) {
                    this.f7642c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f7646e0 = true;
                }
            }
            this.P = this.f7642c0 == -1 && !coordinatorLayout.B(v5, x10, this.f7644d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7646e0 = false;
            this.f7642c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (cVar = this.O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f7644d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.O.u())) ? false : true;
    }

    public void o0(int i10) {
        V v5 = this.W.get();
        if (v5 == null || this.Z.isEmpty()) {
            return;
        }
        float i02 = i0(i10);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).b(v5, i02);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (o0.w(coordinatorLayout) && !o0.w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f7651h = coordinatorLayout.getResources().getDimensionPixelSize(ic.d.f20429a);
            a1(v5);
            o0.H0(v5, new mc.a(v5));
            this.W = new WeakReference<>(v5);
            this.f7640b0 = new cd.e(v5);
            hd.g gVar = this.f7654j;
            if (gVar != null) {
                o0.q0(v5, gVar);
                hd.g gVar2 = this.f7654j;
                float f10 = this.I;
                if (f10 == -1.0f) {
                    f10 = o0.u(v5);
                }
                gVar2.Z(f10);
            } else {
                ColorStateList colorStateList = this.f7655k;
                if (colorStateList != null) {
                    o0.r0(v5, colorStateList);
                }
            }
            h1();
            if (o0.x(v5) == 0) {
                o0.w0(v5, 1);
            }
        }
        if (this.O == null) {
            this.O = r3.c.m(coordinatorLayout, this.f7652h0);
        }
        int top = v5.getTop();
        coordinatorLayout.I(v5, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v5.getHeight();
        this.T = height;
        int i11 = this.V;
        int i12 = i11 - height;
        int i13 = this.f7668x;
        if (i12 < i13) {
            if (this.f7663s) {
                int i14 = this.f7657m;
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.T = i11;
            } else {
                int i15 = i11 - i13;
                int i16 = this.f7657m;
                if (i16 != -1) {
                    i15 = Math.min(i15, i16);
                }
                this.T = i15;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        f0();
        d0();
        int i17 = this.M;
        if (i17 == 3) {
            o0.X(v5, s0());
        } else if (i17 == 6) {
            o0.X(v5, this.F);
        } else if (this.J && i17 == 5) {
            o0.X(v5, this.V);
        } else if (i17 == 4) {
            o0.X(v5, this.H);
        } else if (i17 == 1 || i17 == 2) {
            o0.X(v5, top - v5.getTop());
        }
        j1(this.M, false);
        this.Y = new WeakReference<>(p0(v5));
        for (int i18 = 0; i18 < this.Z.size(); i18++) {
            this.Z.get(i18).a(v5);
        }
        return true;
    }

    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (o0.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View p02 = p0(viewGroup.getChildAt(i10));
                if (p02 != null) {
                    return p02;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f7656l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f7657m, marginLayoutParams.height));
        return true;
    }

    public final int r0(int i10, int i11, int i12, int i13) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return E0() && (weakReference = this.Y) != null && view == weakReference.get() && (this.M != 3 || super.s(coordinatorLayout, v5, view, f10, f11));
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.f7663s ? 0 : this.f7668x);
    }

    public hd.g t0() {
        return this.f7654j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!E0() || view == view2) {
            int top = v5.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int s02 = top - s0();
                    iArr[1] = s02;
                    o0.X(v5, -s02);
                    Y0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v5, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.H && !j0()) {
                    int i14 = top - this.H;
                    iArr[1] = i14;
                    o0.X(v5, -i14);
                    Y0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(v5, -i11);
                    Y0(1);
                }
            }
            o0(v5.getTop());
            this.Q = i11;
            this.R = true;
        }
    }

    public int u0() {
        if (this.f7649g) {
            return -1;
        }
        return this.f7647f;
    }

    public int v0() {
        return this.M;
    }

    public final int w0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.H;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    public final float x0() {
        VelocityTracker velocityTracker = this.f7639a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7643d);
        return this.f7639a0.getYVelocity(this.f7642c0);
    }

    public final boolean y0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean z0() {
        if (this.M == 3) {
            return this.f7669y || y0();
        }
        return false;
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public int f7683a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f7684c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.b = false;
                r3.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f7683a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Y0(hVar2.f7683a);
                }
            }
        }

        public h() {
            this.f7684c = new a();
        }

        public void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f7683a = i10;
            if (this.b) {
                return;
            }
            o0.e0(BottomSheetBehavior.this.W.get(), this.f7684c);
            this.b = true;
        }

        public /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f7671c;

        /* renamed from: d, reason: collision with root package name */
        public int f7672d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7673e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7674f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7675g;

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
            this.f7671c = parcel.readInt();
            this.f7672d = parcel.readInt();
            this.f7673e = parcel.readInt() == 1;
            this.f7674f = parcel.readInt() == 1;
            this.f7675g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7671c);
            parcel.writeInt(this.f7672d);
            parcel.writeInt(this.f7673e ? 1 : 0);
            parcel.writeInt(this.f7674f ? 1 : 0);
            parcel.writeInt(this.f7675g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7671c = bottomSheetBehavior.M;
            this.f7672d = bottomSheetBehavior.f7647f;
            this.f7673e = bottomSheetBehavior.b;
            this.f7674f = bottomSheetBehavior.J;
            this.f7675g = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f7638a = 0;
        this.b = true;
        this.f7641c = false;
        this.f7656l = -1;
        this.f7657m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f7644d0 = -1;
        this.f7650g0 = new SparseIntArray();
        this.f7652h0 = new e();
        this.f7653i = context.getResources().getDimensionPixelSize(ic.d.f20433c0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.J);
        if (obtainStyledAttributes.hasValue(ic.k.N)) {
            this.f7655k = ed.c.a(context, obtainStyledAttributes, ic.k.N);
        }
        if (obtainStyledAttributes.hasValue(ic.k.f20622f0)) {
            this.f7670z = k.e(context, attributeSet, ic.b.f20389c, f7637i0).m();
        }
        m0(context);
        n0();
        this.I = obtainStyledAttributes.getDimension(ic.k.M, -1.0f);
        if (obtainStyledAttributes.hasValue(ic.k.K)) {
            R0(obtainStyledAttributes.getDimensionPixelSize(ic.k.K, -1));
        }
        if (obtainStyledAttributes.hasValue(ic.k.L)) {
            Q0(obtainStyledAttributes.getDimensionPixelSize(ic.k.L, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(ic.k.T);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            S0(i10);
        } else {
            S0(obtainStyledAttributes.getDimensionPixelSize(ic.k.T, -1));
        }
        P0(obtainStyledAttributes.getBoolean(ic.k.S, false));
        N0(obtainStyledAttributes.getBoolean(ic.k.X, false));
        M0(obtainStyledAttributes.getBoolean(ic.k.Q, true));
        W0(obtainStyledAttributes.getBoolean(ic.k.W, false));
        K0(obtainStyledAttributes.getBoolean(ic.k.O, true));
        U0(obtainStyledAttributes.getInt(ic.k.U, 0));
        O0(obtainStyledAttributes.getFloat(ic.k.R, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(ic.k.P);
        if (peekValue2 != null && peekValue2.type == 16) {
            L0(peekValue2.data);
        } else {
            L0(obtainStyledAttributes.getDimensionPixelOffset(ic.k.P, 0));
        }
        V0(obtainStyledAttributes.getInt(ic.k.V, 500));
        this.f7660p = obtainStyledAttributes.getBoolean(ic.k.f20584b0, false);
        this.f7661q = obtainStyledAttributes.getBoolean(ic.k.f20594c0, false);
        this.f7662r = obtainStyledAttributes.getBoolean(ic.k.f20604d0, false);
        this.f7663s = obtainStyledAttributes.getBoolean(ic.k.f20613e0, true);
        this.f7664t = obtainStyledAttributes.getBoolean(ic.k.Y, false);
        this.f7665u = obtainStyledAttributes.getBoolean(ic.k.Z, false);
        this.f7666v = obtainStyledAttributes.getBoolean(ic.k.f20575a0, false);
        this.f7669y = obtainStyledAttributes.getBoolean(ic.k.f20631g0, true);
        obtainStyledAttributes.recycle();
        this.f7643d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
