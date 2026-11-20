package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.g0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import androidx.core.view.r0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import y2.p;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements g0, androidx.core.view.t {
    public static boolean F0;
    public static boolean G0;
    public static final int[] H0 = {R.attr.nestedScrollingEnabled};
    public static final float I0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean J0 = false;
    public static final boolean K0 = true;
    public static final boolean L0 = true;
    public static final Class<?>[] M0;
    public static final Interpolator N0;
    public static final c0 O0;
    public boolean A;
    public int A0;
    public int B;
    public boolean B0;
    public boolean C;
    public final u.b C0;
    public final AccessibilityManager D;
    public final androidx.core.view.i D0;
    public List<s> E;
    public androidx.core.view.h E0;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    @NonNull
    public m J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public n O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final float f2734a;

    /* renamed from: a0, reason: collision with root package name */
    public t f2735a0;
    public final z b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f2736b0;

    /* renamed from: c, reason: collision with root package name */
    public final x f2737c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f2738c0;

    /* renamed from: d, reason: collision with root package name */
    public SavedState f2739d;

    /* renamed from: d0, reason: collision with root package name */
    public float f2740d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.a f2741e;

    /* renamed from: e0, reason: collision with root package name */
    public float f2742e0;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.e f2743f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f2744f0;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.u f2745g;

    /* renamed from: g0, reason: collision with root package name */
    public final e0 f2746g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2747h;

    /* renamed from: h0, reason: collision with root package name */
    public androidx.recyclerview.widget.j f2748h0;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f2749i;

    /* renamed from: i0, reason: collision with root package name */
    public j.b f2750i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f2751j;

    /* renamed from: j0, reason: collision with root package name */
    public final b0 f2752j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2753k;

    /* renamed from: k0, reason: collision with root package name */
    public v f2754k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f2755l;

    /* renamed from: l0, reason: collision with root package name */
    public List<v> f2756l0;

    /* renamed from: m, reason: collision with root package name */
    public h f2757m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2758m0;

    /* renamed from: n, reason: collision with root package name */
    public q f2759n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2760n0;

    /* renamed from: o, reason: collision with root package name */
    public y f2761o;

    /* renamed from: o0, reason: collision with root package name */
    public n.b f2762o0;

    /* renamed from: p, reason: collision with root package name */
    public final List<y> f2763p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2764p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<p> f2765q;

    /* renamed from: q0, reason: collision with root package name */
    public androidx.recyclerview.widget.p f2766q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<u> f2767r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f2768r0;

    /* renamed from: s, reason: collision with root package name */
    public u f2769s;

    /* renamed from: s0, reason: collision with root package name */
    public androidx.core.view.u f2770s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2771t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f2772t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2773u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f2774u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2775v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f2776v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2777w;

    /* renamed from: w0, reason: collision with root package name */
    public final List<f0> f2778w0;

    /* renamed from: x, reason: collision with root package name */
    public int f2779x;

    /* renamed from: x0, reason: collision with root package name */
    public Runnable f2780x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2781y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2782y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2783z;

    /* renamed from: z0, reason: collision with root package name */
    public int f2784z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2777w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f2771t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f2783z) {
                recyclerView2.f2781y = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    public static abstract class a0 {
        public RecyclerView b;

        /* renamed from: c, reason: collision with root package name */
        public q f2788c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2789d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2790e;

        /* renamed from: f, reason: collision with root package name */
        public View f2791f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2793h;

        /* renamed from: a, reason: collision with root package name */
        public int f2787a = -1;

        /* renamed from: g, reason: collision with root package name */
        public final a f2792g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f2794a;
            public int b;

            /* renamed from: c, reason: collision with root package name */
            public int f2795c;

            /* renamed from: d, reason: collision with root package name */
            public int f2796d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f2797e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f2798f;

            /* renamed from: g, reason: collision with root package name */
            public int f2799g;

            public a(int i10, int i11) {
                this(i10, i11, EditorInfoCompat.IME_FLAG_FORCE_ASCII, null);
            }

            public boolean a() {
                return this.f2796d >= 0;
            }

            public void b(int i10) {
                this.f2796d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f2796d;
                if (i10 >= 0) {
                    this.f2796d = -1;
                    recyclerView.F0(i10);
                    this.f2798f = false;
                } else {
                    if (!this.f2798f) {
                        this.f2799g = 0;
                        return;
                    }
                    e();
                    recyclerView.f2746g0.e(this.f2794a, this.b, this.f2795c, this.f2797e);
                    int i11 = this.f2799g + 1;
                    this.f2799g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2798f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2794a = i10;
                this.b = i11;
                this.f2795c = i12;
                this.f2797e = interpolator;
                this.f2798f = true;
            }

            public final void e() {
                if (this.f2797e != null && this.f2795c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f2795c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2796d = -1;
                this.f2798f = false;
                this.f2799g = 0;
                this.f2794a = i10;
                this.b = i11;
                this.f2795c = i12;
                this.f2797e = interpolator;
            }
        }

        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.b.f2759n.H(i10);
        }

        public int c() {
            return this.b.f2759n.O();
        }

        public int d(View view) {
            return this.b.l0(view);
        }

        public q e() {
            return this.f2788c;
        }

        public int f() {
            return this.f2787a;
        }

        public boolean g() {
            return this.f2789d;
        }

        public boolean h() {
            return this.f2790e;
        }

        public void i(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.b;
            if (this.f2787a == -1 || recyclerView == null) {
                r();
            }
            if (this.f2789d && this.f2791f == null && this.f2788c != null && (a10 = a(this.f2787a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.s1((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f2789d = false;
            View view = this.f2791f;
            if (view != null) {
                if (d(view) == this.f2787a) {
                    o(this.f2791f, recyclerView.f2752j0, this.f2792g);
                    this.f2792g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2791f = null;
                }
            }
            if (this.f2790e) {
                l(i10, i11, recyclerView.f2752j0, this.f2792g);
                boolean a11 = this.f2792g.a();
                this.f2792g.c(recyclerView);
                if (a11 && this.f2790e) {
                    this.f2789d = true;
                    recyclerView.f2746g0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f2791f = view;
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void l(int i10, int i11, @NonNull b0 b0Var, @NonNull a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(@NonNull View view, @NonNull b0 b0Var, @NonNull a aVar);

        public void p(int i10) {
            this.f2787a = i10;
        }

        public void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f2746g0.f();
            if (this.f2793h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.f2788c = qVar;
            int i10 = this.f2787a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f2752j0.f2801a = i10;
            this.f2790e = true;
            this.f2789d = true;
            this.f2791f = b(f());
            m();
            this.b.f2746g0.d();
            this.f2793h = true;
        }

        public final void r() {
            if (this.f2790e) {
                this.f2790e = false;
                n();
                this.b.f2752j0.f2801a = -1;
                this.f2791f = null;
                this.f2787a = -1;
                this.f2789d = false;
                this.f2788c.k1(this);
                this.f2788c = null;
                this.b = null;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.O;
            if (nVar != null) {
                nVar.u();
            }
            RecyclerView.this.f2764p0 = false;
        }
    }

    public static class b0 {
        public SparseArray<Object> b;

        /* renamed from: m, reason: collision with root package name */
        public int f2812m;

        /* renamed from: n, reason: collision with root package name */
        public long f2813n;

        /* renamed from: o, reason: collision with root package name */
        public int f2814o;

        /* renamed from: p, reason: collision with root package name */
        public int f2815p;

        /* renamed from: q, reason: collision with root package name */
        public int f2816q;

        /* renamed from: a, reason: collision with root package name */
        public int f2801a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f2802c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f2803d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f2804e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f2805f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2806g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2807h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2808i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2809j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2810k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2811l = false;

        public void a(int i10) {
            if ((this.f2804e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2804e));
        }

        public int b() {
            return this.f2807h ? this.f2802c - this.f2803d : this.f2805f;
        }

        public int c() {
            return this.f2801a;
        }

        public boolean d() {
            return this.f2801a != -1;
        }

        public boolean e() {
            return this.f2807h;
        }

        public void f(h hVar) {
            this.f2804e = 1;
            this.f2805f = hVar.e();
            this.f2807h = false;
            this.f2808i = false;
            this.f2809j = false;
        }

        public boolean g() {
            return this.f2811l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2801a + ", mData=" + this.b + ", mItemCount=" + this.f2805f + ", mIsMeasuring=" + this.f2809j + ", mPreviousLayoutItemCount=" + this.f2802c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2803d + ", mStructureChanged=" + this.f2806g + ", mInPreLayout=" + this.f2807h + ", mRunSimpleAnimations=" + this.f2810k + ", mRunPredictiveAnimations=" + this.f2811l + '}';
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static class c0 extends m {
        @Override // androidx.recyclerview.widget.RecyclerView.m
        @NonNull
        public EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class d implements u.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.u.b
        public void a(f0 f0Var, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void b(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2759n.r1(f0Var.f2827a, recyclerView.f2737c);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void c(f0 f0Var, @NonNull n.c cVar, n.c cVar2) {
            RecyclerView.this.f2737c.O(f0Var);
            RecyclerView.this.q(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.u.b
        public void d(f0 f0Var, @NonNull n.c cVar, @NonNull n.c cVar2) {
            f0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.F) {
                if (recyclerView.O.b(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.W0();
                }
            } else if (recyclerView.O.d(f0Var, cVar, cVar2)) {
                RecyclerView.this.W0();
            }
        }
    }

    public static abstract class d0 {
    }

    public class e implements androidx.core.view.i {
        public e() {
        }

        @Override // androidx.core.view.i
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f2759n.q()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f2759n.p()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.J1();
            return RecyclerView.this.i0(i10, i11);
        }

        @Override // androidx.core.view.i
        public float b() {
            float f10;
            if (RecyclerView.this.f2759n.q()) {
                f10 = RecyclerView.this.f2742e0;
            } else {
                if (!RecyclerView.this.f2759n.p()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f2740d0;
            }
            return -f10;
        }

        @Override // androidx.core.view.i
        public void c() {
            RecyclerView.this.J1();
        }
    }

    public class e0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f2819a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f2820c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f2821d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2822e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2823f;

        public e0() {
            Interpolator interpolator = RecyclerView.N0;
            this.f2821d = interpolator;
            this.f2822e = false;
            this.f2823f = false;
            this.f2820c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.f2819a = 0;
            Interpolator interpolator = this.f2821d;
            Interpolator interpolator2 = RecyclerView.N0;
            if (interpolator != interpolator2) {
                this.f2821d = interpolator2;
                this.f2820c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2820c.fling(0, 0, i10, i11, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            o0.e0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f2822e) {
                this.f2823f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.N0;
            }
            if (this.f2821d != interpolator) {
                this.f2821d = interpolator;
                this.f2820c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.f2819a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2820c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f2820c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2759n == null) {
                f();
                return;
            }
            this.f2823f = false;
            this.f2822e = true;
            recyclerView.A();
            OverScroller overScroller = this.f2820c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f2819a;
                int i13 = currY - this.b;
                this.f2819a = currX;
                this.b = currY;
                int x10 = RecyclerView.this.x(i12);
                int z10 = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f2776v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x10, z10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f2776v0;
                    x10 -= iArr2[0];
                    z10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x10, z10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2757m != null) {
                    int[] iArr3 = recyclerView3.f2776v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.s1(x10, z10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f2776v0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    x10 -= i14;
                    z10 -= i15;
                    a0 a0Var = recyclerView4.f2759n.f2865g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int b = RecyclerView.this.f2752j0.b();
                        if (b == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= b) {
                            a0Var.p(b - 1);
                            a0Var.j(i14, i15);
                        } else {
                            a0Var.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = x10;
                int i17 = z10;
                if (!RecyclerView.this.f2765q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f2776v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f2776v0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                a0 a0Var2 = RecyclerView.this.f2759n.f2865g;
                if ((a0Var2 == null || !a0Var2.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i20, currVelocity);
                    }
                    if (RecyclerView.L0) {
                        RecyclerView.this.f2750i0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.f2748h0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            a0 a0Var3 = RecyclerView.this.f2759n.f2865g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f2822e = false;
            if (this.f2823f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.I1(1);
            }
        }
    }

    public class f implements e.b {
        public f() {
        }

        @Override // androidx.recyclerview.widget.e.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void b(View view) {
            f0 n02 = RecyclerView.n0(view);
            if (n02 != null) {
                n02.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.e.b
        public f0 d(View view) {
            return RecyclerView.n0(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void e(int i10) {
            View a10 = a(i10);
            if (a10 != null) {
                f0 n02 = RecyclerView.n0(a10);
                if (n02 != null) {
                    if (n02.y() && !n02.K()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + n02 + RecyclerView.this.V());
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "tmpDetach " + n02);
                    }
                    n02.b(256);
                }
            } else if (RecyclerView.F0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void f() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.F(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.e.b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void h(View view) {
            f0 n02 = RecyclerView.n0(view);
            if (n02 != null) {
                n02.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            f0 n02 = RecyclerView.n0(view);
            if (n02 != null) {
                if (!n02.y() && !n02.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + n02 + RecyclerView.this.V());
                }
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "reAttach " + n02);
                }
                n02.f();
            } else if (RecyclerView.F0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public static abstract class f0 {

        /* renamed from: t, reason: collision with root package name */
        public static final List<Object> f2826t = Collections.EMPTY_LIST;

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final View f2827a;
        public WeakReference<RecyclerView> b;

        /* renamed from: j, reason: collision with root package name */
        public int f2835j;

        /* renamed from: r, reason: collision with root package name */
        public RecyclerView f2843r;

        /* renamed from: s, reason: collision with root package name */
        public h<? extends f0> f2844s;

        /* renamed from: c, reason: collision with root package name */
        public int f2828c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f2829d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f2830e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f2831f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f2832g = -1;

        /* renamed from: h, reason: collision with root package name */
        public f0 f2833h = null;

        /* renamed from: i, reason: collision with root package name */
        public f0 f2834i = null;

        /* renamed from: k, reason: collision with root package name */
        public List<Object> f2836k = null;

        /* renamed from: l, reason: collision with root package name */
        public List<Object> f2837l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f2838m = 0;

        /* renamed from: n, reason: collision with root package name */
        public x f2839n = null;

        /* renamed from: o, reason: collision with root package name */
        public boolean f2840o = false;

        /* renamed from: p, reason: collision with root package name */
        public int f2841p = 0;

        /* renamed from: q, reason: collision with root package name */
        public int f2842q = -1;

        public f0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2827a = view;
        }

        public boolean A() {
            return (this.f2835j & 2) != 0;
        }

        public void B(int i10, boolean z10) {
            if (this.f2829d == -1) {
                this.f2829d = this.f2828c;
            }
            if (this.f2832g == -1) {
                this.f2832g = this.f2828c;
            }
            if (z10) {
                this.f2832g += i10;
            }
            this.f2828c += i10;
            if (this.f2827a.getLayoutParams() != null) {
                ((r) this.f2827a.getLayoutParams()).f2883c = true;
            }
        }

        public void C(RecyclerView recyclerView) {
            int i10 = this.f2842q;
            if (i10 != -1) {
                this.f2841p = i10;
            } else {
                this.f2841p = this.f2827a.getImportantForAccessibility();
            }
            recyclerView.v1(this, 4);
        }

        public void D(RecyclerView recyclerView) {
            recyclerView.v1(this, this.f2841p);
            this.f2841p = 0;
        }

        public void E() {
            if (RecyclerView.F0 && y()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f2835j = 0;
            this.f2828c = -1;
            this.f2829d = -1;
            this.f2830e = -1L;
            this.f2832g = -1;
            this.f2838m = 0;
            this.f2833h = null;
            this.f2834i = null;
            d();
            this.f2841p = 0;
            this.f2842q = -1;
            RecyclerView.u(this);
        }

        public void F() {
            if (this.f2829d == -1) {
                this.f2829d = this.f2828c;
            }
        }

        public void G(int i10, int i11) {
            this.f2835j = (i10 & i11) | (this.f2835j & (~i11));
        }

        public final void H(boolean z10) {
            int i10 = this.f2838m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2838m = i11;
            if (i11 < 0) {
                this.f2838m = 0;
                if (RecyclerView.F0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2835j |= 16;
            } else if (z10 && i11 == 0) {
                this.f2835j &= -17;
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        public void I(x xVar, boolean z10) {
            this.f2839n = xVar;
            this.f2840o = z10;
        }

        public boolean J() {
            return (this.f2835j & 16) != 0;
        }

        public boolean K() {
            return (this.f2835j & 128) != 0;
        }

        public void L() {
            this.f2839n.O(this);
        }

        public boolean M() {
            return (this.f2835j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f2835j) == 0) {
                g();
                this.f2836k.add(obj);
            }
        }

        public void b(int i10) {
            this.f2835j = i10 | this.f2835j;
        }

        public void c() {
            this.f2829d = -1;
            this.f2832g = -1;
        }

        public void d() {
            List<Object> list = this.f2836k;
            if (list != null) {
                list.clear();
            }
            this.f2835j &= -1025;
        }

        public void e() {
            this.f2835j &= -33;
        }

        public void f() {
            this.f2835j &= -257;
        }

        public final void g() {
            if (this.f2836k == null) {
                ArrayList arrayList = new ArrayList();
                this.f2836k = arrayList;
                this.f2837l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.f2835j & 16) == 0 && o0.O(this.f2827a);
        }

        public void i(int i10, int i11, boolean z10) {
            b(8);
            B(i11, z10);
            this.f2828c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f2843r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.j0(this);
        }

        public final int k() {
            RecyclerView recyclerView;
            h adapter;
            int j02;
            if (this.f2844s == null || (recyclerView = this.f2843r) == null || (adapter = recyclerView.getAdapter()) == null || (j02 = this.f2843r.j0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f2844s, this, j02);
        }

        public final long l() {
            return this.f2830e;
        }

        public final int m() {
            return this.f2831f;
        }

        public final int n() {
            int i10 = this.f2832g;
            return i10 == -1 ? this.f2828c : i10;
        }

        public final int o() {
            return this.f2829d;
        }

        public List<Object> p() {
            if ((this.f2835j & 1024) != 0) {
                return f2826t;
            }
            List<Object> list = this.f2836k;
            return (list == null || list.size() == 0) ? f2826t : this.f2837l;
        }

        public boolean q(int i10) {
            return (i10 & this.f2835j) != 0;
        }

        public boolean r() {
            return (this.f2835j & 512) != 0 || u();
        }

        public boolean s() {
            return (this.f2827a.getParent() == null || this.f2827a.getParent() == this.f2843r) ? false : true;
        }

        public boolean t() {
            return (this.f2835j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2828c + " id=" + this.f2830e + ", oldPos=" + this.f2829d + ", pLpos:" + this.f2832g);
            if (x()) {
                sb2.append(" scrap ");
                sb2.append(this.f2840o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb2.append(" invalid");
            }
            if (!t()) {
                sb2.append(" unbound");
            }
            if (A()) {
                sb2.append(" update");
            }
            if (w()) {
                sb2.append(" removed");
            }
            if (K()) {
                sb2.append(" ignored");
            }
            if (y()) {
                sb2.append(" tmpDetached");
            }
            if (!v()) {
                sb2.append(" not recyclable(" + this.f2838m + ")");
            }
            if (r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2827a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public boolean u() {
            return (this.f2835j & 4) != 0;
        }

        public final boolean v() {
            return (this.f2835j & 16) == 0 && !o0.O(this.f2827a);
        }

        public boolean w() {
            return (this.f2835j & 8) != 0;
        }

        public boolean x() {
            return this.f2839n != null;
        }

        public boolean y() {
            return (this.f2835j & 256) != 0;
        }

        public boolean z() {
            return (this.f2835j & 2) != 0;
        }
    }

    public class g implements a.InterfaceC0049a {
        public g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void a(int i10, int i11) {
            RecyclerView.this.M0(i10, i11);
            RecyclerView.this.f2758m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void d(int i10, int i11) {
            RecyclerView.this.N0(i10, i11, false);
            RecyclerView.this.f2758m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.L1(i10, i11, obj);
            RecyclerView.this.f2760n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public f0 f(int i10) {
            f0 f02 = RecyclerView.this.f0(i10, true);
            if (f02 == null) {
                return null;
            }
            if (!RecyclerView.this.f2743f.n(f02.f2827a)) {
                return f02;
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void g(int i10, int i11) {
            RecyclerView.this.L0(i10, i11);
            RecyclerView.this.f2758m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0049a
        public void h(int i10, int i11) {
            RecyclerView.this.N0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2758m0 = true;
            recyclerView.f2752j0.f2803d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f2940a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f2759n.W0(recyclerView, bVar.b, bVar.f2942d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f2759n.Z0(recyclerView2, bVar.b, bVar.f2942d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f2759n.b1(recyclerView3, bVar.b, bVar.f2942d, bVar.f2941c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f2759n.Y0(recyclerView4, bVar.b, bVar.f2942d, 1);
            }
        }
    }

    public static abstract class h<VH extends f0> {

        /* renamed from: a, reason: collision with root package name */
        public final i f2846a = new i();
        public boolean b = false;

        /* renamed from: c, reason: collision with root package name */
        public a f2847c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(boolean z10) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z10;
        }

        public void B(@NonNull j jVar) {
            this.f2846a.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NonNull VH vh2, int i10) {
            boolean z10 = vh2.f2844s == null;
            if (z10) {
                vh2.f2828c = i10;
                if (i()) {
                    vh2.f2830e = f(i10);
                }
                vh2.G(1, 519);
                if (u2.o.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh2.f2831f)));
                }
            }
            vh2.f2844s = this;
            if (RecyclerView.F0) {
                if (vh2.f2827a.getParent() == null && vh2.f2827a.isAttachedToWindow() != vh2.y()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.y() + ", attached to window: " + vh2.f2827a.isAttachedToWindow() + ", holder: " + vh2);
                }
                if (vh2.f2827a.getParent() == null && vh2.f2827a.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            s(vh2, i10, vh2.p());
            if (z10) {
                vh2.d();
                ViewGroup.LayoutParams layoutParams = vh2.f2827a.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f2883c = true;
                }
                Trace.endSection();
            }
        }

        public boolean b() {
            int ordinal = this.f2847c.ordinal();
            return ordinal != 1 ? ordinal != 2 : e() > 0;
        }

        @NonNull
        public final VH c(@NonNull ViewGroup viewGroup, int i10) {
            try {
                if (u2.o.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                VH t8 = t(viewGroup, i10);
                if (t8.f2827a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                t8.f2831f = i10;
                Trace.endSection();
                return t8;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int d(@NonNull h<? extends f0> hVar, @NonNull f0 f0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f2846a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.f2846a.b();
        }

        public final void k(int i10) {
            this.f2846a.d(i10, 1);
        }

        public final void l(int i10, Object obj) {
            this.f2846a.e(i10, 1, obj);
        }

        public final void m(int i10, int i11) {
            this.f2846a.c(i10, i11);
        }

        public final void n(int i10, int i11, Object obj) {
            this.f2846a.e(i10, i11, obj);
        }

        public final void o(int i10, int i11) {
            this.f2846a.f(i10, i11);
        }

        public final void p(int i10, int i11) {
            this.f2846a.g(i10, i11);
        }

        public void q(@NonNull RecyclerView recyclerView) {
        }

        public abstract void r(@NonNull VH vh2, int i10);

        public void s(@NonNull VH vh2, int i10, @NonNull List<Object> list) {
            r(vh2, i10);
        }

        @NonNull
        public abstract VH t(@NonNull ViewGroup viewGroup, int i10);

        public void u(@NonNull RecyclerView recyclerView) {
        }

        public boolean v(@NonNull VH vh2) {
            return false;
        }

        public void w(@NonNull VH vh2) {
        }

        public void x(@NonNull VH vh2) {
        }

        public void y(@NonNull VH vh2) {
        }

        public void z(@NonNull j jVar) {
            this.f2846a.registerObserver(jVar);
        }
    }

    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }
    }

    public static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
    }

    public static class m {
        @NonNull
        public EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    public static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public b f2851a = null;
        public ArrayList<a> b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public long f2852c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f2853d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f2854e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f2855f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(@NonNull f0 f0Var);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f2856a;
            public int b;

            /* renamed from: c, reason: collision with root package name */
            public int f2857c;

            /* renamed from: d, reason: collision with root package name */
            public int f2858d;

            @NonNull
            public c a(@NonNull f0 f0Var) {
                return b(f0Var, 0);
            }

            @NonNull
            public c b(@NonNull f0 f0Var, int i10) {
                View view = f0Var.f2827a;
                this.f2856a = view.getLeft();
                this.b = view.getTop();
                this.f2857c = view.getRight();
                this.f2858d = view.getBottom();
                return this;
            }
        }

        public static int e(f0 f0Var) {
            int i10 = f0Var.f2835j;
            int i11 = i10 & 14;
            if (f0Var.u()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int o8 = f0Var.o();
                int j10 = f0Var.j();
                if (o8 != -1 && j10 != -1 && o8 != j10) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(@NonNull f0 f0Var, c cVar, @NonNull c cVar2);

        public abstract boolean b(@NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean c(@NonNull f0 f0Var, @NonNull c cVar, c cVar2);

        public abstract boolean d(@NonNull f0 f0Var, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean f(@NonNull f0 f0Var);

        public boolean g(@NonNull f0 f0Var, @NonNull List<Object> list) {
            return f(f0Var);
        }

        public final void h(@NonNull f0 f0Var) {
            r(f0Var);
            b bVar = this.f2851a;
            if (bVar != null) {
                bVar.a(f0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.b.get(i10).a();
            }
            this.b.clear();
        }

        public abstract void j(@NonNull f0 f0Var);

        public abstract void k();

        public long l() {
            return this.f2852c;
        }

        public long m() {
            return this.f2855f;
        }

        public long n() {
            return this.f2854e;
        }

        public long o() {
            return this.f2853d;
        }

        public abstract boolean p();

        @NonNull
        public c q() {
            return new c();
        }

        public void r(@NonNull f0 f0Var) {
        }

        @NonNull
        public c s(@NonNull b0 b0Var, @NonNull f0 f0Var) {
            return q().a(f0Var);
        }

        @NonNull
        public c t(@NonNull b0 b0Var, @NonNull f0 f0Var, int i10, @NonNull List<Object> list) {
            return q().a(f0Var);
        }

        public abstract void u();

        public void v(b bVar) {
            this.f2851a = bVar;
        }
    }

    public class o implements n.b {
        public o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.b
        public void a(f0 f0Var) {
            f0Var.H(true);
            if (f0Var.f2833h != null && f0Var.f2834i == null) {
                f0Var.f2833h = null;
            }
            f0Var.f2834i = null;
            if (f0Var.J() || RecyclerView.this.h1(f0Var.f2827a) || !f0Var.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.f2827a, false);
        }
    }

    public static abstract class p {
        @Deprecated
        public void d(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            d(rect, ((r) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void f(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull b0 b0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.e f2860a;
        public RecyclerView b;

        /* renamed from: c, reason: collision with root package name */
        public final t.b f2861c;

        /* renamed from: d, reason: collision with root package name */
        public final t.b f2862d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.t f2863e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.t f2864f;

        /* renamed from: g, reason: collision with root package name */
        public a0 f2865g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2866h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2867i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2868j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2869k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2870l;

        /* renamed from: m, reason: collision with root package name */
        public int f2871m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2872n;

        /* renamed from: o, reason: collision with root package name */
        public int f2873o;

        /* renamed from: p, reason: collision with root package name */
        public int f2874p;

        /* renamed from: q, reason: collision with root package name */
        public int f2875q;

        /* renamed from: r, reason: collision with root package name */
        public int f2876r;

        public class a implements t.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.t.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.t.b
            public int b(View view) {
                return q.this.V(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.t.b
            public int c() {
                return q.this.i0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int d() {
                return q.this.s0() - q.this.j0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int e(View view) {
                return q.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements t.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.t.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.t.b
            public int b(View view) {
                return q.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.t.b
            public int c() {
                return q.this.k0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int d() {
                return q.this.b0() - q.this.h0();
            }

            @Override // androidx.recyclerview.widget.t.b
            public int e(View view) {
                return q.this.T(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f2879a;
            public int b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f2880c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2881d;
        }

        public q() {
            a aVar = new a();
            this.f2861c = aVar;
            b bVar = new b();
            this.f2862d = bVar;
            this.f2863e = new androidx.recyclerview.widget.t(aVar);
            this.f2864f = new androidx.recyclerview.widget.t(bVar);
            this.f2866h = false;
            this.f2867i = false;
            this.f2868j = false;
            this.f2869k = true;
            this.f2870l = true;
        }

        public static boolean B0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q.P(int, int, int, int, boolean):int");
        }

        public static d m0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4.c.f33230a, i10, i11);
            dVar.f2879a = obtainStyledAttributes.getInt(v4.c.b, 1);
            dVar.b = obtainStyledAttributes.getInt(v4.c.f33240l, 1);
            dVar.f2880c = obtainStyledAttributes.getBoolean(v4.c.f33239k, false);
            dVar.f2881d = obtainStyledAttributes.getBoolean(v4.c.f33241m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public int A(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean A0() {
            return false;
        }

        public final void A1(x xVar, int i10, View view) {
            f0 n02 = RecyclerView.n0(view);
            if (n02.K()) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "ignoring view " + n02);
                    return;
                }
                return;
            }
            if (n02.u() && !n02.w() && !this.b.f2757m.i()) {
                v1(i10);
                xVar.H(n02);
            } else {
                C(i10);
                xVar.I(view);
                this.b.f2745g.k(n02);
            }
        }

        public void B(@NonNull x xVar) {
            for (int O = O() - 1; O >= 0; O--) {
                A1(xVar, O, N(O));
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int B1(int i10, x xVar, b0 b0Var) {
            return 0;
        }

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0() {
            a0 a0Var = this.f2865g;
            return a0Var != null && a0Var.h();
        }

        public void C1(int i10) {
            if (RecyclerView.G0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public final void D(int i10, @NonNull View view) {
            this.f2860a.d(i10);
        }

        public boolean D0(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.f2863e.b(view, 24579) && this.f2864f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        @SuppressLint({"UnknownNullness"})
        public int D1(int i10, x xVar, b0 b0Var) {
            return 0;
        }

        public void E(RecyclerView recyclerView) {
            this.f2867i = true;
            L0(recyclerView);
        }

        public void E0(@NonNull View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        public void E1(RecyclerView recyclerView) {
            F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void F(RecyclerView recyclerView, x xVar) {
            this.f2867i = false;
            N0(recyclerView, xVar);
        }

        public void F0(@NonNull View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect s02 = this.b.s0(view);
            int i12 = i10 + s02.left + s02.right;
            int i13 = i11 + s02.top + s02.bottom;
            int P = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, p());
            int P2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, q());
            if (K1(view, P, P2, rVar)) {
                view.measure(P, P2);
            }
        }

        public void F1(int i10, int i11) {
            this.f2875q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2873o = mode;
            if (mode == 0 && !RecyclerView.K0) {
                this.f2875q = 0;
            }
            this.f2876r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2874p = mode2;
            if (mode2 != 0 || RecyclerView.K0) {
                return;
            }
            this.f2876r = 0;
        }

        public View G(@NonNull View view) {
            View X;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (X = recyclerView.X(view)) == null || this.f2860a.n(X)) {
                return null;
            }
            return X;
        }

        public void G0(int i10, int i11) {
            View N = N(i10);
            if (N != null) {
                C(i10);
                m(N, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.b.toString());
            }
        }

        public void G1(int i10, int i11) {
            this.b.setMeasuredDimension(i10, i11);
        }

        public View H(int i10) {
            int O = O();
            for (int i11 = 0; i11 < O; i11++) {
                View N = N(i11);
                f0 n02 = RecyclerView.n0(N);
                if (n02 != null && n02.n() == i10 && !n02.K() && (this.b.f2752j0.e() || !n02.w())) {
                    return N;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.J0(i10);
            }
        }

        public void H1(Rect rect, int i10, int i11) {
            G1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract r I();

        public void I0(int i10) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.K0(i10);
            }
        }

        public void I1(int i10, int i11) {
            int O = O();
            if (O == 0) {
                this.b.C(i10, i11);
                return;
            }
            int i12 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < O; i16++) {
                View N = N(i16);
                Rect rect = this.b.f2751j;
                U(N, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.b.f2751j.set(i15, i13, i12, i14);
            H1(this.b.f2751j, i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public r J(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void J0(h hVar, h hVar2) {
        }

        public void J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.f2860a = null;
                this.f2875q = 0;
                this.f2876r = 0;
            } else {
                this.b = recyclerView;
                this.f2860a = recyclerView.f2743f;
                this.f2875q = recyclerView.getWidth();
                this.f2876r = recyclerView.getHeight();
            }
            this.f2873o = 1073741824;
            this.f2874p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public r K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof r ? new r((r) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public boolean K0(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public boolean K1(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.f2869k && B0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        public boolean L1() {
            return false;
        }

        public int M(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void M0(RecyclerView recyclerView) {
        }

        public boolean M1(View view, int i10, int i11, r rVar) {
            return (this.f2869k && B0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public View N(int i10) {
            androidx.recyclerview.widget.e eVar = this.f2860a;
            if (eVar != null) {
                return eVar.f(i10);
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void N0(RecyclerView recyclerView, x xVar) {
            M0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void N1(RecyclerView recyclerView, b0 b0Var, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int O() {
            androidx.recyclerview.widget.e eVar = this.f2860a;
            if (eVar != null) {
                return eVar.g();
            }
            return 0;
        }

        public View O0(@NonNull View view, int i10, @NonNull x xVar, @NonNull b0 b0Var) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void O1(a0 a0Var) {
            a0 a0Var2 = this.f2865g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f2865g.r();
            }
            this.f2865g = a0Var;
            a0Var.q(this.b, this);
        }

        public void P0(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            Q0(recyclerView.f2737c, recyclerView.f2752j0, accessibilityEvent);
        }

        public void P1() {
            a0 a0Var = this.f2865g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public final int[] Q(View view, Rect rect) {
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - i02;
            int min = Math.min(0, i10);
            int i11 = top - k02;
            int min2 = Math.min(0, i11);
            int i12 = width - s02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - b02);
            if (d0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{max, min2};
        }

        public void Q0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.b.f2757m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public boolean Q1() {
            return false;
        }

        public boolean R() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.f2747h;
        }

        public void R0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull y2.p pVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.G0(true);
                pVar.v0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                pVar.a(4096);
                pVar.G0(true);
                pVar.v0(true);
            }
            pVar.n0(p.f.b(o0(xVar, b0Var), S(xVar, b0Var), z0(xVar, b0Var), p0(xVar, b0Var)));
        }

        public int S(@NonNull x xVar, @NonNull b0 b0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.f2757m == null || !p()) {
                return 1;
            }
            return this.b.f2757m.e();
        }

        public void S0(y2.p pVar) {
            RecyclerView recyclerView = this.b;
            R0(recyclerView.f2737c, recyclerView.f2752j0, pVar);
        }

        public int T(@NonNull View view) {
            return view.getBottom() + M(view);
        }

        public void T0(View view, y2.p pVar) {
            f0 n02 = RecyclerView.n0(view);
            if (n02 == null || n02.w() || this.f2860a.n(n02.f2827a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            U0(recyclerView.f2737c, recyclerView.f2752j0, view, pVar);
        }

        public void U(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.p0(view, rect);
        }

        public void U0(@NonNull x xVar, @NonNull b0 b0Var, @NonNull View view, @NonNull y2.p pVar) {
            pVar.o0(p.g.b(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public int V(@NonNull View view) {
            return view.getLeft() - e0(view);
        }

        public View V0(@NonNull View view, int i10) {
            return null;
        }

        public int W(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public int X(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(@NonNull RecyclerView recyclerView) {
        }

        public int Y(@NonNull View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int Z(@NonNull View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2860a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public int b0() {
            return this.f2876r;
        }

        public void b1(@NonNull RecyclerView recyclerView, int i10, int i11, Object obj) {
            a1(recyclerView, i10, i11);
        }

        public int c0() {
            return this.f2874p;
        }

        @SuppressLint({"UnknownNullness"})
        public void c1(x xVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d0() {
            return this.b.getLayoutDirection();
        }

        @SuppressLint({"UnknownNullness"})
        public void d1(b0 b0Var) {
        }

        public int e() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public int e0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.left;
        }

        public void e1(@NonNull x xVar, @NonNull b0 b0Var, int i10, int i11) {
            this.b.C(i10, i11);
        }

        public int f0() {
            return o0.A(this.b);
        }

        @Deprecated
        public boolean f1(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return C0() || recyclerView.D0();
        }

        @SuppressLint({"UnknownNullness"})
        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return o0.B(this.b);
        }

        public boolean g1(@NonNull RecyclerView recyclerView, @NonNull b0 b0Var, @NonNull View view, View view2) {
            return f1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void j1(int i10) {
        }

        public final void k(View view, int i10, boolean z10) {
            f0 n02 = RecyclerView.n0(view);
            if (z10 || n02.w()) {
                this.b.f2745g.b(n02);
            } else {
                this.b.f2745g.p(n02);
            }
            r rVar = (r) view.getLayoutParams();
            if (n02.M() || n02.x()) {
                if (n02.x()) {
                    n02.L();
                } else {
                    n02.e();
                }
                this.f2860a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m10 = this.f2860a.m(view);
                if (i10 == -1) {
                    i10 = this.f2860a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.V());
                }
                if (m10 != i10) {
                    this.b.f2759n.G0(m10, i10);
                }
            } else {
                this.f2860a.a(view, i10, false);
                rVar.f2883c = true;
                a0 a0Var = this.f2865g;
                if (a0Var != null && a0Var.h()) {
                    this.f2865g.k(view);
                }
            }
            if (rVar.f2884d) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f2882a);
                }
                n02.f2827a.invalidate();
                rVar.f2884d = false;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void k1(a0 a0Var) {
            if (this.f2865g == a0Var) {
                this.f2865g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void l(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b();
        }

        public boolean l1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return m1(recyclerView.f2737c, recyclerView.f2752j0, i10, bundle);
        }

        public void m(@NonNull View view, int i10) {
            n(view, i10, (r) view.getLayoutParams());
        }

        public boolean m1(@NonNull x xVar, @NonNull b0 b0Var, int i10, Bundle bundle) {
            int k02;
            int i02;
            float f10;
            if (this.b == null) {
                return false;
            }
            int b02 = b0();
            int s02 = s0();
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                b02 = rect.height();
                s02 = rect.width();
            }
            if (i10 == 4096) {
                k02 = this.b.canScrollVertically(1) ? (b02 - k0()) - h0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    i02 = (s02 - i0()) - j0();
                }
                i02 = 0;
            } else if (i10 != 8192) {
                k02 = 0;
                i02 = 0;
            } else {
                k02 = this.b.canScrollVertically(-1) ? -((b02 - k0()) - h0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    i02 = -((s02 - i0()) - j0());
                }
                i02 = 0;
            }
            if (k02 == 0 && i02 == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.F0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    i02 = (int) (i02 * f10);
                    k02 = (int) (k02 * f10);
                }
                this.b.B1(i02, k02, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII, true);
                return true;
            }
            RecyclerView recyclerView = this.b;
            h hVar = recyclerView.f2757m;
            if (hVar == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.C1(hVar.e() - 1);
            } else if (i10 == 8192) {
                recyclerView.C1(0);
            }
            return true;
        }

        public void n(@NonNull View view, int i10, r rVar) {
            f0 n02 = RecyclerView.n0(view);
            if (n02.w()) {
                this.b.f2745g.b(n02);
            } else {
                this.b.f2745g.p(n02);
            }
            this.f2860a.c(view, i10, rVar, n02.w());
        }

        public int n0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.right;
        }

        public boolean n1(@NonNull View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return o1(recyclerView.f2737c, recyclerView.f2752j0, view, i10, bundle);
        }

        public void o(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.s0(view));
            }
        }

        public int o0(@NonNull x xVar, @NonNull b0 b0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.f2757m == null || !q()) {
                return 1;
            }
            return this.b.f2757m.e();
        }

        public boolean o1(@NonNull x xVar, @NonNull b0 b0Var, @NonNull View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean p() {
            return false;
        }

        public int p0(@NonNull x xVar, @NonNull b0 b0Var) {
            return 0;
        }

        public void p1(@NonNull x xVar) {
            for (int O = O() - 1; O >= 0; O--) {
                if (!RecyclerView.n0(N(O)).K()) {
                    s1(O, xVar);
                }
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(@NonNull View view) {
            return ((r) view.getLayoutParams()).b.top;
        }

        public void q1(x xVar) {
            int j10 = xVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = xVar.n(i10);
                f0 n02 = RecyclerView.n0(n10);
                if (!n02.K()) {
                    n02.H(false);
                    if (n02.y()) {
                        this.b.removeDetachedView(n10, false);
                    }
                    n nVar = this.b.O;
                    if (nVar != null) {
                        nVar.j(n02);
                    }
                    n02.H(true);
                    xVar.D(n10);
                }
            }
            xVar.e();
            if (j10 > 0) {
                this.b.invalidate();
            }
        }

        public boolean r(r rVar) {
            return rVar != null;
        }

        public void r0(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.f2755l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(@NonNull View view, @NonNull x xVar) {
            u1(view);
            xVar.G(view);
        }

        public int s0() {
            return this.f2875q;
        }

        public void s1(int i10, @NonNull x xVar) {
            View N = N(i10);
            v1(i10);
            xVar.G(N);
        }

        @SuppressLint({"UnknownNullness"})
        public void t(int i10, int i11, b0 b0Var, c cVar) {
        }

        public int t0() {
            return this.f2873o;
        }

        public boolean t1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i10, c cVar) {
        }

        public boolean u0() {
            int O = O();
            for (int i10 = 0; i10 < O; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u1(View view) {
            this.f2860a.p(view);
        }

        public int v(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean v0() {
            return this.f2867i;
        }

        public void v1(int i10) {
            if (N(i10) != null) {
                this.f2860a.q(i10);
            }
        }

        public int w(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean w0() {
            return this.f2868j;
        }

        public boolean w1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return x1(recyclerView, view, rect, z10, false);
        }

        public int x(@NonNull b0 b0Var) {
            return 0;
        }

        public final boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            Rect rect = this.b.f2751j;
            U(focusedChild, rect);
            return rect.left - i10 < s02 && rect.right - i10 > i02 && rect.top - i11 < b02 && rect.bottom - i11 > k02;
        }

        public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int[] Q = Q(view, rect);
            int i10 = Q[0];
            int i11 = Q[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.y1(i10, i11);
            }
            return true;
        }

        public int y(@NonNull b0 b0Var) {
            return 0;
        }

        public final boolean y0() {
            return this.f2870l;
        }

        public void y1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int z(@NonNull b0 b0Var) {
            return 0;
        }

        public boolean z0(@NonNull x xVar, @NonNull b0 b0Var) {
            return false;
        }

        public void z1() {
            this.f2866h = true;
        }
    }

    public interface s {
        void a(@NonNull View view);

        void b(@NonNull View view);
    }

    public static abstract class t {
        public abstract boolean a(int i10, int i11);
    }

    public interface u {
        void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class v {
        public void a(@NonNull RecyclerView recyclerView, int i10) {
        }

        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class w {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<a> f2885a = new SparseArray<>();
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public Set<h<?>> f2886c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<f0> f2887a = new ArrayList<>();
            public int b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f2888c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f2889d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b(@NonNull h<?> hVar) {
            this.f2886c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f2885a.size(); i10++) {
                a valueAt = this.f2885a.valueAt(i10);
                ArrayList<f0> arrayList = valueAt.f2887a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    f0 f0Var = arrayList.get(i11);
                    i11++;
                    q3.a.a(f0Var.f2827a);
                }
                valueAt.f2887a.clear();
            }
        }

        public void d() {
            this.b--;
        }

        public void e(@NonNull h<?> hVar, boolean z10) {
            this.f2886c.remove(hVar);
            if (this.f2886c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f2885a.size(); i10++) {
                SparseArray<a> sparseArray = this.f2885a;
                ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f2887a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q3.a.a(arrayList.get(i11).f2827a);
                }
            }
        }

        public void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f2889d = l(i11.f2889d, j10);
        }

        public void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f2888c = l(i11.f2888c, j10);
        }

        public f0 h(int i10) {
            a aVar = this.f2885a.get(i10);
            if (aVar == null || aVar.f2887a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f2887a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a i(int i10) {
            a aVar = this.f2885a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2885a.put(i10, aVar2);
            return aVar2;
        }

        public void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int m10 = f0Var.m();
            ArrayList<f0> arrayList = i(m10).f2887a;
            if (this.f2885a.get(m10).b <= arrayList.size()) {
                q3.a.a(f0Var.f2827a);
            } else {
                if (RecyclerView.F0 && arrayList.contains(f0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f0Var.E();
                arrayList.add(f0Var);
            }
        }

        public long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f2889d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f2888c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class x {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<f0> f2890a;
        public ArrayList<f0> b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<f0> f2891c;

        /* renamed from: d, reason: collision with root package name */
        public final List<f0> f2892d;

        /* renamed from: e, reason: collision with root package name */
        public int f2893e;

        /* renamed from: f, reason: collision with root package name */
        public int f2894f;

        /* renamed from: g, reason: collision with root package name */
        public w f2895g;

        public x() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f2890a = arrayList;
            this.b = null;
            this.f2891c = new ArrayList<>();
            this.f2892d = Collections.unmodifiableList(arrayList);
            this.f2893e = 2;
            this.f2894f = 2;
        }

        public void A() {
            for (int i10 = 0; i10 < this.f2891c.size(); i10++) {
                q3.a.a(this.f2891c.get(i10).f2827a);
            }
            B(RecyclerView.this.f2757m);
        }

        public final void B(h<?> hVar) {
            C(hVar, false);
        }

        public final void C(h<?> hVar, boolean z10) {
            w wVar = this.f2895g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        public void D(View view) {
            f0 n02 = RecyclerView.n0(view);
            n02.f2839n = null;
            n02.f2840o = false;
            n02.e();
            H(n02);
        }

        public void E() {
            for (int size = this.f2891c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f2891c.clear();
            if (RecyclerView.L0) {
                RecyclerView.this.f2750i0.b();
            }
        }

        public void F(int i10) {
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            f0 f0Var = this.f2891c.get(i10);
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f0Var);
            }
            a(f0Var, true);
            this.f2891c.remove(i10);
        }

        public void G(@NonNull View view) {
            f0 n02 = RecyclerView.n0(view);
            if (n02.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (n02.x()) {
                n02.L();
            } else if (n02.M()) {
                n02.e();
            }
            H(n02);
            if (RecyclerView.this.O == null || n02.v()) {
                return;
            }
            RecyclerView.this.O.j(n02);
        }

        public void H(f0 f0Var) {
            boolean z10;
            boolean z11 = true;
            if (f0Var.x() || f0Var.f2827a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f0Var.x());
                sb2.append(" isAttached:");
                sb2.append(f0Var.f2827a.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f0Var.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.V());
            }
            if (f0Var.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean h10 = f0Var.h();
            h hVar = RecyclerView.this.f2757m;
            boolean z12 = hVar != null && h10 && hVar.v(f0Var);
            if (RecyclerView.F0 && this.f2891c.contains(f0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.V());
            }
            if (z12 || f0Var.v()) {
                if (this.f2894f <= 0 || f0Var.q(526)) {
                    z10 = false;
                } else {
                    int size = this.f2891c.size();
                    if (size >= this.f2894f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.L0 && size > 0 && !RecyclerView.this.f2750i0.d(f0Var.f2828c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f2750i0.d(this.f2891c.get(i10).f2828c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f2891c.add(size, f0Var);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(f0Var, true);
                }
                r1 = z10;
            } else {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z11 = false;
            }
            RecyclerView.this.f2745g.q(f0Var);
            if (r1 || z11 || !h10) {
                return;
            }
            q3.a.a(f0Var.f2827a);
            f0Var.f2844s = null;
            f0Var.f2843r = null;
        }

        public void I(View view) {
            f0 n02 = RecyclerView.n0(view);
            if (!n02.q(12) && n02.z() && !RecyclerView.this.s(n02)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                n02.I(this, true);
                this.b.add(n02);
                return;
            }
            if (!n02.u() || n02.w() || RecyclerView.this.f2757m.i()) {
                n02.I(this, false);
                this.f2890a.add(n02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        public void J(w wVar) {
            B(RecyclerView.this.f2757m);
            w wVar2 = this.f2895g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f2895g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f2895g.a();
            }
            u();
        }

        public void K(d0 d0Var) {
        }

        public void L(int i10) {
            this.f2893e = i10;
            P();
        }

        public final boolean M(@NonNull f0 f0Var, int i10, int i11, long j10) {
            f0Var.f2844s = null;
            f0Var.f2843r = RecyclerView.this;
            int m10 = f0Var.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f2895g.m(m10, nanoTime, j10)) {
                return false;
            }
            if (f0Var.y()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.f2827a, recyclerView.getChildCount(), f0Var.f2827a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f2757m.a(f0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f0Var.f2827a);
            }
            this.f2895g.f(f0Var.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (RecyclerView.this.f2752j0.e()) {
                f0Var.f2832g = i11;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.f0 N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        public void O(f0 f0Var) {
            if (f0Var.f2840o) {
                this.b.remove(f0Var);
            } else {
                this.f2890a.remove(f0Var);
            }
            f0Var.f2839n = null;
            f0Var.f2840o = false;
            f0Var.e();
        }

        public void P() {
            q qVar = RecyclerView.this.f2759n;
            this.f2894f = this.f2893e + (qVar != null ? qVar.f2871m : 0);
            for (int size = this.f2891c.size() - 1; size >= 0 && this.f2891c.size() > this.f2894f; size--) {
                F(size);
            }
        }

        public boolean Q(f0 f0Var) {
            if (f0Var.w()) {
                if (!RecyclerView.F0 || RecyclerView.this.f2752j0.e()) {
                    return RecyclerView.this.f2752j0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = f0Var.f2828c;
            if (i10 >= 0 && i10 < RecyclerView.this.f2757m.e()) {
                if (RecyclerView.this.f2752j0.e() || RecyclerView.this.f2757m.g(f0Var.f2828c) == f0Var.m()) {
                    return !RecyclerView.this.f2757m.i() || f0Var.l() == RecyclerView.this.f2757m.f(f0Var.f2828c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.V());
        }

        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f2891c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2891c.get(size);
                if (f0Var != null && (i12 = f0Var.f2828c) >= i10 && i12 < i13) {
                    f0Var.b(2);
                    F(size);
                }
            }
        }

        public void a(@NonNull f0 f0Var, boolean z10) {
            RecyclerView.u(f0Var);
            View view = f0Var.f2827a;
            androidx.recyclerview.widget.p pVar = RecyclerView.this.f2766q0;
            if (pVar != null) {
                androidx.core.view.a n10 = pVar.n();
                o0.m0(view, n10 instanceof p.a ? ((p.a) n10).n(view) : null);
            }
            if (z10) {
                g(f0Var);
            }
            f0Var.f2844s = null;
            f0Var.f2843r = null;
            i().k(f0Var);
        }

        public final void b(f0 f0Var) {
            if (RecyclerView.this.C0()) {
                View view = f0Var.f2827a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.p pVar = RecyclerView.this.f2766q0;
                if (pVar == null) {
                    return;
                }
                androidx.core.view.a n10 = pVar.n();
                if (n10 instanceof p.a) {
                    ((p.a) n10).o(view);
                }
                o0.m0(view, n10);
            }
        }

        public void c() {
            this.f2890a.clear();
            E();
        }

        public void d() {
            int size = this.f2891c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2891c.get(i10).c();
            }
            int size2 = this.f2890a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f2890a.get(i11).c();
            }
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.b.get(i12).c();
                }
            }
        }

        public void e() {
            this.f2890a.clear();
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f2752j0.b()) {
                return !RecyclerView.this.f2752j0.e() ? i10 : RecyclerView.this.f2741e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f2752j0.b() + RecyclerView.this.V());
        }

        public void g(@NonNull f0 f0Var) {
            y yVar = RecyclerView.this.f2761o;
            if (yVar != null) {
                yVar.a(f0Var);
            }
            int size = RecyclerView.this.f2763p.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f2763p.get(i10).a(f0Var);
            }
            h hVar = RecyclerView.this.f2757m;
            if (hVar != null) {
                hVar.y(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2752j0 != null) {
                recyclerView.f2745g.q(f0Var);
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f0Var);
            }
        }

        public f0 h(int i10) {
            int size;
            int m10;
            ArrayList<f0> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = this.b.get(i11);
                    if (!f0Var.M() && f0Var.n() == i10) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f2757m.i() && (m10 = RecyclerView.this.f2741e.m(i10)) > 0 && m10 < RecyclerView.this.f2757m.e()) {
                    long f10 = RecyclerView.this.f2757m.f(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        f0 f0Var2 = this.b.get(i12);
                        if (!f0Var2.M() && f0Var2.l() == f10) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public w i() {
            if (this.f2895g == null) {
                this.f2895g = new w();
                u();
            }
            return this.f2895g;
        }

        public int j() {
            return this.f2890a.size();
        }

        @NonNull
        public List<f0> k() {
            return this.f2892d;
        }

        public f0 l(long j10, int i10, boolean z10) {
            for (int size = this.f2890a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2890a.get(size);
                if (f0Var.l() == j10 && !f0Var.M()) {
                    if (i10 == f0Var.m()) {
                        f0Var.b(32);
                        if (f0Var.w() && !RecyclerView.this.f2752j0.e()) {
                            f0Var.G(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z10) {
                        this.f2890a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f2827a, false);
                        D(f0Var.f2827a);
                    }
                }
            }
            int size2 = this.f2891c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f2891c.get(size2);
                if (f0Var2.l() == j10 && !f0Var2.s()) {
                    if (i10 == f0Var2.m()) {
                        if (!z10) {
                            this.f2891c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        public f0 m(int i10, boolean z10) {
            View e10;
            int size = this.f2890a.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = this.f2890a.get(i11);
                if (!f0Var.M() && f0Var.n() == i10 && !f0Var.u() && (RecyclerView.this.f2752j0.f2807h || !f0Var.w())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (!z10 && (e10 = RecyclerView.this.f2743f.e(i10)) != null) {
                f0 n02 = RecyclerView.n0(e10);
                RecyclerView.this.f2743f.s(e10);
                int m10 = RecyclerView.this.f2743f.m(e10);
                if (m10 != -1) {
                    RecyclerView.this.f2743f.d(m10);
                    I(e10);
                    n02.b(8224);
                    return n02;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + n02 + RecyclerView.this.V());
            }
            int size2 = this.f2891c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                f0 f0Var2 = this.f2891c.get(i12);
                if (!f0Var2.u() && f0Var2.n() == i10 && !f0Var2.s()) {
                    if (!z10) {
                        this.f2891c.remove(i12);
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f0Var2);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        public View n(int i10) {
            return this.f2890a.get(i10).f2827a;
        }

        @NonNull
        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f2827a;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(f0 f0Var) {
            View view = f0Var.f2827a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f2891c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) this.f2891c.get(i10).f2827a.getLayoutParams();
                if (rVar != null) {
                    rVar.f2883c = true;
                }
            }
        }

        public void t() {
            int size = this.f2891c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0Var = this.f2891c.get(i10);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.f2757m;
            if (hVar == null || !hVar.i()) {
                E();
            }
        }

        public final void u() {
            if (this.f2895g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2757m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f2895g.b(RecyclerView.this.f2757m);
            }
        }

        public void v(int i10, int i11) {
            int size = this.f2891c.size();
            for (int i12 = 0; i12 < size; i12++) {
                f0 f0Var = this.f2891c.get(i12);
                if (f0Var != null && f0Var.f2828c >= i10) {
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + f0Var + " now at position " + (f0Var.f2828c + i11));
                    }
                    f0Var.B(i11, false);
                }
            }
        }

        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f2891c.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = this.f2891c.get(i16);
                if (f0Var != null && (i15 = f0Var.f2828c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f0Var.B(i11 - i10, false);
                    } else {
                        f0Var.B(i12, false);
                    }
                    if (RecyclerView.G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + f0Var);
                    }
                }
            }
        }

        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f2891c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f2891c.get(size);
                if (f0Var != null) {
                    int i13 = f0Var.f2828c;
                    if (i13 >= i12) {
                        if (RecyclerView.G0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.f2828c - i11));
                        }
                        f0Var.B(-i11, z10);
                    } else if (i13 >= i10) {
                        f0Var.b(8);
                        F(size);
                    }
                }
            }
        }

        public void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        public void z() {
            u();
        }
    }

    public interface y {
        void a(@NonNull f0 f0Var);
    }

    public class z extends j {
        public z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2752j0.f2806g = true;
            recyclerView.Z0(true);
            if (RecyclerView.this.f2741e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2741e.r(i10, i11, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2741e.s(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2741e.t(i10, i11, i12)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f2741e.u(i10, i11)) {
                g();
            }
        }

        public void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2773u && recyclerView.f2771t) {
                o0.e0(recyclerView, recyclerView.f2749i);
            } else {
                recyclerView.C = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        N0 = new c();
        O0 = new c0();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private boolean G1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            d3.e.d(this.K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            d3.e.d(this.M, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && d3.e.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            d3.e.d(this.L, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 == null || d3.e.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        d3.e.d(this.N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView b0(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView b02 = b0(viewGroup.getChildAt(i10));
            if (b02 != null) {
                return b02;
            }
        }
        return null;
    }

    private int f1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.L;
        float f11 = 0.0f;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.N;
            if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.N.onRelease();
                } else {
                    float d10 = d3.e.d(this.N, height, 1.0f - width);
                    if (d3.e.b(this.N) == 0.0f) {
                        this.N.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                float f12 = -d3.e.d(this.L, -height, width);
                if (d3.e.b(this.L) == 0.0f) {
                    this.L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private androidx.core.view.u getScrollingChildHelper() {
        if (this.f2770s0 == null) {
            this.f2770s0 = new androidx.core.view.u(this);
        }
        return this.f2770s0;
    }

    public static f0 n0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f2882a;
    }

    public static void p0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        F0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        G0 = z10;
    }

    private float t0(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f2734a * 0.015f));
        float f10 = I0;
        return (float) (this.f2734a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    public static void u(@NonNull f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.f2827a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.b = null;
        }
    }

    public void A() {
        if (!this.f2777w || this.F) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.f2741e.p()) {
            if (!this.f2741e.o(4) || this.f2741e.o(11)) {
                if (this.f2741e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            D1();
            Q0();
            this.f2741e.w();
            if (!this.f2781y) {
                if (w0()) {
                    H();
                } else {
                    this.f2741e.i();
                }
            }
            H1(true);
            R0();
            Trace.endSection();
        }
    }

    public void A0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(v4.b.f33228a), resources.getDimensionPixelSize(v4.b.f33229c), resources.getDimensionPixelOffset(v4.b.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void A1(int i10, int i11, Interpolator interpolator, int i12) {
        B1(i10, i11, interpolator, i12, false);
    }

    public final void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String r02 = r0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(r02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = asSubclass.getConstructor(M0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + r02, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + r02, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + r02, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + r02, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r02, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r02, e16);
            }
        }
    }

    public void B0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void B1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f2759n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2783z) {
            return;
        }
        if (!qVar.p()) {
            i10 = 0;
        }
        if (!this.f2759n.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            E1(i13, 1);
        }
        this.f2746g0.e(i10, i11, i12, interpolator);
    }

    public void C(int i10, int i11) {
        setMeasuredDimension(q.s(i10, getPaddingLeft() + getPaddingRight(), o0.B(this)), q.s(i11, getPaddingTop() + getPaddingBottom(), o0.A(this)));
    }

    public boolean C0() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void C1(int i10) {
        if (this.f2783z) {
            return;
        }
        q qVar = this.f2759n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.N1(this, this.f2752j0, i10);
        }
    }

    public final boolean D(int i10, int i11) {
        a0(this.f2768r0);
        int[] iArr = this.f2768r0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public boolean D0() {
        return this.H > 0;
    }

    public void D1() {
        int i10 = this.f2779x + 1;
        this.f2779x = i10;
        if (i10 != 1 || this.f2783z) {
            return;
        }
        this.f2781y = false;
    }

    public void E(View view) {
        f0 n02 = n0(view);
        O0(view);
        h hVar = this.f2757m;
        if (hVar != null && n02 != null) {
            hVar.w(n02);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).b(view);
            }
        }
    }

    public final boolean E0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f2751j.set(0, 0, view.getWidth(), view.getHeight());
        this.f2753k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2751j);
        offsetDescendantRectToMyCoords(view2, this.f2753k);
        char c10 = 65535;
        int i12 = this.f2759n.d0() == 1 ? -1 : 1;
        Rect rect = this.f2751j;
        int i13 = rect.left;
        Rect rect2 = this.f2753k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    public boolean E1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    public void F(View view) {
        f0 n02 = n0(view);
        P0(view);
        h hVar = this.f2757m;
        if (hVar != null && n02 != null) {
            hVar.x(n02);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).a(view);
            }
        }
    }

    public void F0(int i10) {
        if (this.f2759n == null) {
            return;
        }
        setScrollState(2);
        this.f2759n.C1(i10);
        awakenScrollBars();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F1(int i10) {
        boolean p8 = this.f2759n.p();
        int i11 = p8;
        if (this.f2759n.q()) {
            i11 = (p8 ? 1 : 0) | 2;
        }
        E1(i11, i10);
    }

    public final void G() {
        int i10 = this.B;
        this.B = 0;
        if (i10 == 0 || !C0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        y2.b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void G0() {
        int j10 = this.f2743f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((r) this.f2743f.i(i10).getLayoutParams()).f2883c = true;
        }
        this.f2737c.s();
    }

    public void H() {
        if (this.f2757m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2759n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f2752j0.f2809j = false;
        boolean z10 = this.f2782y0 && !(this.f2784z0 == getWidth() && this.A0 == getHeight());
        this.f2784z0 = 0;
        this.A0 = 0;
        this.f2782y0 = false;
        if (this.f2752j0.f2804e == 1) {
            I();
            this.f2759n.E1(this);
            J();
        } else if (this.f2741e.q() || z10 || this.f2759n.s0() != getWidth() || this.f2759n.b0() != getHeight()) {
            this.f2759n.E1(this);
            J();
        } else {
            this.f2759n.E1(this);
        }
        K();
    }

    public void H0() {
        int j10 = this.f2743f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 n02 = n0(this.f2743f.i(i10));
            if (n02 != null && !n02.K()) {
                n02.b(6);
            }
        }
        G0();
        this.f2737c.t();
    }

    public void H1(boolean z10) {
        if (this.f2779x < 1) {
            if (F0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f2779x = 1;
        }
        if (!z10 && !this.f2783z) {
            this.f2781y = false;
        }
        if (this.f2779x == 1) {
            if (z10 && this.f2781y && !this.f2783z && this.f2759n != null && this.f2757m != null) {
                H();
            }
            if (!this.f2783z) {
                this.f2781y = false;
            }
        }
        this.f2779x--;
    }

    public final void I() {
        this.f2752j0.a(1);
        W(this.f2752j0);
        this.f2752j0.f2809j = false;
        D1();
        this.f2745g.f();
        Q0();
        Y0();
        p1();
        b0 b0Var = this.f2752j0;
        b0Var.f2808i = b0Var.f2810k && this.f2760n0;
        this.f2760n0 = false;
        this.f2758m0 = false;
        b0Var.f2807h = b0Var.f2811l;
        b0Var.f2805f = this.f2757m.e();
        a0(this.f2768r0);
        if (this.f2752j0.f2810k) {
            int g10 = this.f2743f.g();
            for (int i10 = 0; i10 < g10; i10++) {
                f0 n02 = n0(this.f2743f.f(i10));
                if (!n02.K() && (!n02.u() || this.f2757m.i())) {
                    this.f2745g.e(n02, this.O.t(this.f2752j0, n02, n.e(n02), n02.p()));
                    if (this.f2752j0.f2808i && n02.z() && !n02.w() && !n02.K() && !n02.u()) {
                        this.f2745g.c(k0(n02), n02);
                    }
                }
            }
        }
        if (this.f2752j0.f2811l) {
            q1();
            b0 b0Var2 = this.f2752j0;
            boolean z10 = b0Var2.f2806g;
            b0Var2.f2806g = false;
            this.f2759n.c1(this.f2737c, b0Var2);
            this.f2752j0.f2806g = z10;
            for (int i11 = 0; i11 < this.f2743f.g(); i11++) {
                f0 n03 = n0(this.f2743f.f(i11));
                if (!n03.K() && !this.f2745g.i(n03)) {
                    int e10 = n.e(n03);
                    boolean q10 = n03.q(8192);
                    if (!q10) {
                        e10 |= 4096;
                    }
                    n.c t8 = this.O.t(this.f2752j0, n03, e10, n03.p());
                    if (q10) {
                        b1(n03, t8);
                    } else {
                        this.f2745g.a(n03, t8);
                    }
                }
            }
            v();
        } else {
            v();
        }
        R0();
        H1(false);
        this.f2752j0.f2804e = 2;
    }

    public final void I0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f2759n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2783z) {
            return;
        }
        int[] iArr = this.f2776v0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean p8 = qVar.p();
        boolean q10 = this.f2759n.q();
        int i13 = q10 ? (p8 ? 1 : 0) | 2 : p8 ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int e12 = i10 - e1(i10, height);
        int f12 = i11 - f1(i11, width);
        E1(i13, i12);
        if (L(p8 ? e12 : 0, q10 ? f12 : 0, this.f2776v0, this.f2772t0, i12)) {
            int[] iArr2 = this.f2776v0;
            e12 -= iArr2[0];
            f12 -= iArr2[1];
        }
        r1(p8 ? e12 : 0, q10 ? f12 : 0, motionEvent, i12);
        androidx.recyclerview.widget.j jVar = this.f2748h0;
        if (jVar != null && (e12 != 0 || f12 != 0)) {
            jVar.f(this, e12, f12);
        }
        I1(i12);
    }

    public void I1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public final void J() {
        D1();
        Q0();
        this.f2752j0.a(6);
        this.f2741e.j();
        this.f2752j0.f2805f = this.f2757m.e();
        this.f2752j0.f2803d = 0;
        if (this.f2739d != null && this.f2757m.b()) {
            Parcelable parcelable = this.f2739d.f2785c;
            if (parcelable != null) {
                this.f2759n.h1(parcelable);
            }
            this.f2739d = null;
        }
        b0 b0Var = this.f2752j0;
        b0Var.f2807h = false;
        this.f2759n.c1(this.f2737c, b0Var);
        b0 b0Var2 = this.f2752j0;
        b0Var2.f2806g = false;
        b0Var2.f2810k = b0Var2.f2810k && this.O != null;
        b0Var2.f2804e = 4;
        R0();
        H1(false);
    }

    public void J0(int i10) {
        int g10 = this.f2743f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f2743f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void J1() {
        setScrollState(0);
        K1();
    }

    public final void K() {
        RecyclerView recyclerView;
        this.f2752j0.a(4);
        D1();
        Q0();
        b0 b0Var = this.f2752j0;
        b0Var.f2804e = 1;
        if (b0Var.f2810k) {
            for (int g10 = this.f2743f.g() - 1; g10 >= 0; g10--) {
                f0 n02 = n0(this.f2743f.f(g10));
                if (!n02.K()) {
                    long k02 = k0(n02);
                    n.c s8 = this.O.s(this.f2752j0, n02);
                    f0 g11 = this.f2745g.g(k02);
                    if (g11 == null || g11.K()) {
                        this.f2745g.d(n02, s8);
                    } else {
                        boolean h10 = this.f2745g.h(g11);
                        boolean h11 = this.f2745g.h(n02);
                        if (h10 && g11 == n02) {
                            this.f2745g.d(n02, s8);
                        } else {
                            n.c n10 = this.f2745g.n(g11);
                            this.f2745g.d(n02, s8);
                            n.c m10 = this.f2745g.m(n02);
                            if (n10 == null) {
                                u0(k02, n02, g11);
                            } else {
                                p(g11, n02, n10, m10, h10, h11);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f2745g.o(recyclerView.C0);
        } else {
            recyclerView = this;
        }
        recyclerView.f2759n.q1(recyclerView.f2737c);
        b0 b0Var2 = recyclerView.f2752j0;
        b0Var2.f2802c = b0Var2.f2805f;
        recyclerView.F = false;
        recyclerView.G = false;
        b0Var2.f2810k = false;
        b0Var2.f2811l = false;
        recyclerView.f2759n.f2866h = false;
        ArrayList<f0> arrayList = recyclerView.f2737c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f2759n;
        if (qVar.f2872n) {
            qVar.f2871m = 0;
            qVar.f2872n = false;
            recyclerView.f2737c.P();
        }
        recyclerView.f2759n.d1(recyclerView.f2752j0);
        R0();
        H1(false);
        recyclerView.f2745g.f();
        int[] iArr = recyclerView.f2768r0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        c1();
        n1();
    }

    public void K0(int i10) {
        int g10 = this.f2743f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f2743f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void K1() {
        this.f2746g0.f();
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.P1();
        }
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void L0(int i10, int i11) {
        int j10 = this.f2743f.j();
        for (int i12 = 0; i12 < j10; i12++) {
            f0 n02 = n0(this.f2743f.i(i12));
            if (n02 != null && !n02.K() && n02.f2828c >= i10) {
                if (G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + n02 + " now at position " + (n02.f2828c + i11));
                }
                n02.B(i11, false);
                this.f2752j0.f2806g = true;
            }
        }
        this.f2737c.v(i10, i11);
        requestLayout();
    }

    public void L1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f2743f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f2743f.i(i14);
            f0 n02 = n0(i15);
            if (n02 != null && !n02.K() && (i12 = n02.f2828c) >= i10 && i12 < i13) {
                n02.b(2);
                n02.a(obj);
                ((r) i15.getLayoutParams()).f2883c = true;
            }
        }
        this.f2737c.R(i10, i11);
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f2743f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            f0 n02 = n0(this.f2743f.i(i16));
            if (n02 != null && (i15 = n02.f2828c) >= i13 && i15 <= i12) {
                if (G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + n02);
                }
                if (n02.f2828c == i10) {
                    n02.B(i11 - i10, false);
                } else {
                    n02.B(i14, false);
                }
                this.f2752j0.f2806g = true;
            }
        }
        this.f2737c.w(i10, i11);
        requestLayout();
    }

    public void N(int i10) {
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.j1(i10);
        }
        U0(i10);
        v vVar = this.f2754k0;
        if (vVar != null) {
            vVar.a(this, i10);
        }
        List<v> list = this.f2756l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2756l0.get(size).a(this, i10);
            }
        }
    }

    public void N0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f2743f.j();
        for (int i13 = 0; i13 < j10; i13++) {
            f0 n02 = n0(this.f2743f.i(i13));
            if (n02 != null && !n02.K()) {
                int i14 = n02.f2828c;
                if (i14 >= i12) {
                    if (G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + n02 + " now at position " + (n02.f2828c - i11));
                    }
                    n02.B(-i11, z10);
                    this.f2752j0.f2806g = true;
                } else if (i14 >= i10) {
                    if (G0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + n02 + " now REMOVED");
                    }
                    n02.i(i10 - 1, -i11, z10);
                    this.f2752j0.f2806g = true;
                }
            }
        }
        this.f2737c.x(i10, i11, z10);
        requestLayout();
    }

    public void O(int i10, int i11) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        V0(i10, i11);
        v vVar = this.f2754k0;
        if (vVar != null) {
            vVar.b(this, i10, i11);
        }
        List<v> list = this.f2756l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2756l0.get(size).b(this, i10, i11);
            }
        }
        this.I--;
    }

    public void O0(@NonNull View view) {
    }

    public void P() {
        int i10;
        for (int size = this.f2778w0.size() - 1; size >= 0; size--) {
            f0 f0Var = this.f2778w0.get(size);
            if (f0Var.f2827a.getParent() == this && !f0Var.K() && (i10 = f0Var.f2842q) != -1) {
                f0Var.f2827a.setImportantForAccessibility(i10);
                f0Var.f2842q = -1;
            }
        }
        this.f2778w0.clear();
    }

    public void P0(@NonNull View view) {
    }

    public final boolean Q(MotionEvent motionEvent) {
        u uVar = this.f2769s;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f2769s = null;
        }
        return true;
    }

    public void Q0() {
        this.H++;
    }

    public void R() {
        if (this.N != null) {
            return;
        }
        EdgeEffect a10 = this.J.a(this, 3);
        this.N = a10;
        if (this.f2747h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void R0() {
        S0(true);
    }

    public void S() {
        if (this.K != null) {
            return;
        }
        EdgeEffect a10 = this.J.a(this, 0);
        this.K = a10;
        if (this.f2747h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void S0(boolean z10) {
        int i10 = this.H - 1;
        this.H = i10;
        if (i10 < 1) {
            if (F0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.H = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    public void T() {
        if (this.M != null) {
            return;
        }
        EdgeEffect a10 = this.J.a(this, 2);
        this.M = a10;
        if (this.f2747h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void T0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.V = y10;
            this.T = y10;
        }
    }

    public void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect a10 = this.J.a(this, 1);
        this.L = a10;
        if (this.f2747h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void U0(int i10) {
    }

    public String V() {
        return " " + super.toString() + ", adapter:" + this.f2757m + ", layout:" + this.f2759n + ", context:" + getContext();
    }

    public void V0(int i10, int i11) {
    }

    public final void W(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f2815p = 0;
            b0Var.f2816q = 0;
        } else {
            OverScroller overScroller = this.f2746g0.f2820c;
            b0Var.f2815p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f2816q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0() {
        if (this.f2764p0 || !this.f2771t) {
            return;
        }
        o0.e0(this, this.f2780x0);
        this.f2764p0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View X(@androidx.annotation.NonNull android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.X(android.view.View):android.view.View");
    }

    public final boolean X0() {
        return this.O != null && this.f2759n.Q1();
    }

    public f0 Y(@NonNull View view) {
        View X = X(view);
        if (X == null) {
            return null;
        }
        return m0(X);
    }

    public final void Y0() {
        boolean z10;
        if (this.F) {
            this.f2741e.y();
            if (this.G) {
                this.f2759n.X0(this);
            }
        }
        if (X0()) {
            this.f2741e.w();
        } else {
            this.f2741e.j();
        }
        boolean z11 = this.f2758m0 || this.f2760n0;
        this.f2752j0.f2810k = this.f2777w && this.O != null && ((z10 = this.F) || z11 || this.f2759n.f2866h) && (!z10 || this.f2757m.i());
        b0 b0Var = this.f2752j0;
        b0Var.f2811l = b0Var.f2810k && z11 && !this.F && X0();
    }

    public final boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2767r.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = this.f2767r.get(i10);
            if (uVar.b(this, motionEvent) && action != 3) {
                this.f2769s = uVar;
                return true;
            }
        }
        return false;
    }

    public void Z0(boolean z10) {
        this.G = z10 | this.G;
        this.F = true;
        H0();
    }

    public final void a0(int[] iArr) {
        int g10 = this.f2743f.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i12 = 0; i12 < g10; i12++) {
            f0 n02 = n0(this.f2743f.f(i12));
            if (!n02.K()) {
                int n10 = n02.n();
                if (n10 < i10) {
                    i10 = n10;
                }
                if (n10 > i11) {
                    i11 = n10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.S()
            android.widget.EdgeEffect r1 = r6.K
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            d3.e.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.T()
            android.widget.EdgeEffect r1 = r6.M
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            d3.e.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.U()
            android.widget.EdgeEffect r9 = r6.L
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            d3.e.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.R()
            android.widget.EdgeEffect r9 = r6.N
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            d3.e.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a1(float, float, float, float):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        q qVar = this.f2759n;
        if (qVar == null || !qVar.K0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void b1(f0 f0Var, n.c cVar) {
        f0Var.G(0, 8192);
        if (this.f2752j0.f2808i && f0Var.z() && !f0Var.w() && !f0Var.K()) {
            this.f2745g.c(k0(f0Var), f0Var);
        }
        this.f2745g.e(f0Var, cVar);
    }

    public final View c0() {
        f0 d02;
        b0 b0Var = this.f2752j0;
        int i10 = b0Var.f2812m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = b0Var.b();
        for (int i11 = i10; i11 < b10; i11++) {
            f0 d03 = d0(i11);
            if (d03 == null) {
                break;
            }
            if (d03.f2827a.hasFocusable()) {
                return d03.f2827a;
            }
        }
        int min = Math.min(b10, i10);
        do {
            min--;
            if (min < 0 || (d02 = d0(min)) == null) {
                return null;
            }
        } while (!d02.f2827a.hasFocusable());
        return d02.f2827a;
    }

    public final void c1() {
        View findViewById;
        if (!this.f2744f0 || this.f2757m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f2743f.n(getFocusedChild())) {
                return;
            }
        }
        View view = null;
        f0 e02 = (this.f2752j0.f2813n == -1 || !this.f2757m.i()) ? null : e0(this.f2752j0.f2813n);
        if (e02 != null && !this.f2743f.n(e02.f2827a) && e02.f2827a.hasFocusable()) {
            view = e02.f2827a;
        } else if (this.f2743f.g() > 0) {
            view = c0();
        }
        if (view != null) {
            int i10 = this.f2752j0.f2814o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f2759n.r((r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.p()) {
            return this.f2759n.v(this.f2752j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.p()) {
            return this.f2759n.w(this.f2752j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.p()) {
            return this.f2759n.x(this.f2752j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.q()) {
            return this.f2759n.y(this.f2752j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.q()) {
            return this.f2759n.z(this.f2752j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        q qVar = this.f2759n;
        if (qVar != null && qVar.q()) {
            return this.f2759n.A(this.f2752j0);
        }
        return 0;
    }

    public f0 d0(int i10) {
        f0 f0Var = null;
        if (this.F) {
            return null;
        }
        int j10 = this.f2743f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            f0 n02 = n0(this.f2743f.i(i11));
            if (n02 != null && !n02.w() && j0(n02) == i10) {
                if (!this.f2743f.n(n02.f2827a)) {
                    return n02;
                }
                f0Var = n02;
            }
        }
        return f0Var;
    }

    public final void d1() {
        boolean z10;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.K.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.N.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int i10 = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.q()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    A1(0, measuredHeight, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                } else {
                    A1(0, -measuredHeight, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean A0 = layoutManager.A0();
                if (keyCode == 122) {
                    if (A0) {
                        i10 = getAdapter().e();
                    }
                } else if (!A0) {
                    i10 = getAdapter().e();
                }
                C1(i10);
                return true;
            }
        } else if (layoutManager.p()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    A1(measuredWidth, 0, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                } else {
                    A1(-measuredWidth, 0, null, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean A02 = layoutManager.A0();
                if (keyCode2 == 122) {
                    if (A02) {
                        i10 = getAdapter().e();
                    }
                } else if (!A02) {
                    i10 = getAdapter().e();
                }
                C1(i10);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f2765q.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f2765q.get(i10).i(canvas, this, this.f2752j0);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2747h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2747h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2747h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2747h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.O == null || this.f2765q.size() <= 0 || !this.O.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public f0 e0(long j10) {
        h hVar = this.f2757m;
        f0 f0Var = null;
        if (hVar != null && hVar.i()) {
            int j11 = this.f2743f.j();
            for (int i10 = 0; i10 < j11; i10++) {
                f0 n02 = n0(this.f2743f.i(i10));
                if (n02 != null && !n02.w() && n02.l() == j10) {
                    if (!this.f2743f.n(n02.f2827a)) {
                        return n02;
                    }
                    f0Var = n02;
                }
            }
        }
        return f0Var;
    }

    public final int e1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.K;
        float f11 = 0.0f;
        if (edgeEffect == null || d3.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && d3.e.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.M.onRelease();
                } else {
                    float d10 = d3.e.d(this.M, width, height);
                    if (d3.e.b(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                float f12 = -d3.e.d(this.K, -width, 1.0f - height);
                if (d3.e.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.f0 f0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.e r0 = r5.f2743f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.e r3 = r5.f2743f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = n0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.w()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f2828c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.n()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.e r1 = r5.f2743f
            android.view.View r4 = r3.f2827a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f0(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public boolean g0(int i10, int i11) {
        return h0(i10, i11, this.f2736b0, this.f2738c0);
    }

    public void g1() {
        n nVar = this.O;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.p1(this.f2737c);
            this.f2759n.q1(this.f2737c);
        }
        this.f2737c.c();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f2759n;
        if (qVar != null) {
            return qVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f2759n;
        if (qVar != null) {
            return qVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f2757m;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f2759n;
        return qVar != null ? qVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2747h;
    }

    public androidx.recyclerview.widget.p getCompatAccessibilityDelegate() {
        return this.f2766q0;
    }

    @NonNull
    public m getEdgeEffectFactory() {
        return this.J;
    }

    public n getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.f2765q.size();
    }

    public q getLayoutManager() {
        return this.f2759n;
    }

    public int getMaxFlingVelocity() {
        return this.f2738c0;
    }

    public int getMinFlingVelocity() {
        return this.f2736b0;
    }

    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.f2735a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2744f0;
    }

    @NonNull
    public w getRecycledViewPool() {
        return this.f2737c.i();
    }

    public int getScrollState() {
        return this.P;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int, int, int):boolean");
    }

    public boolean h1(View view) {
        D1();
        boolean r8 = this.f2743f.r(view);
        if (r8) {
            f0 n02 = n0(view);
            this.f2737c.O(n02);
            this.f2737c.H(n02);
            if (G0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        H1(!r8);
        return r8;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public final void i(f0 f0Var) {
        View view = f0Var.f2827a;
        boolean z10 = view.getParent() == this;
        this.f2737c.O(m0(view));
        if (f0Var.y()) {
            this.f2743f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f2743f.k(view);
        } else {
            this.f2743f.b(view, true);
        }
    }

    public boolean i0(int i10, int i11) {
        return h0(i10, i11, 0, Integer.MAX_VALUE);
    }

    public void i1(@NonNull p pVar) {
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2765q.remove(pVar);
        if (this.f2765q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        G0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f2771t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2783z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(@NonNull p pVar) {
        k(pVar, -1);
    }

    public int j0(f0 f0Var) {
        if (f0Var.q(524) || !f0Var.t()) {
            return -1;
        }
        return this.f2741e.e(f0Var.f2828c);
    }

    public void j1(@NonNull u uVar) {
        this.f2767r.remove(uVar);
        if (this.f2769s == uVar) {
            this.f2769s = null;
        }
    }

    public void k(@NonNull p pVar, int i10) {
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2765q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f2765q.add(pVar);
        } else {
            this.f2765q.add(i10, pVar);
        }
        G0();
        requestLayout();
    }

    public long k0(f0 f0Var) {
        return this.f2757m.i() ? f0Var.l() : f0Var.f2828c;
    }

    public void k1(@NonNull v vVar) {
        List<v> list = this.f2756l0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    public void l(@NonNull s sVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(sVar);
    }

    public int l0(@NonNull View view) {
        f0 n02 = n0(view);
        if (n02 != null) {
            return n02.n();
        }
        return -1;
    }

    public void l1() {
        f0 f0Var;
        int g10 = this.f2743f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.f2743f.f(i10);
            f0 m02 = m0(f10);
            if (m02 != null && (f0Var = m02.f2834i) != null) {
                View view = f0Var.f2827a;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void m(@NonNull u uVar) {
        this.f2767r.add(uVar);
    }

    public f0 m0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return n0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void m1(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2751j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f2883c) {
                Rect rect = rVar.b;
                Rect rect2 = this.f2751j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2751j);
            offsetRectIntoDescendantCoords(view, this.f2751j);
        }
        this.f2759n.x1(this, view, this.f2751j, !this.f2777w, view2 == null);
    }

    public void n(@NonNull v vVar) {
        if (this.f2756l0 == null) {
            this.f2756l0 = new ArrayList();
        }
        this.f2756l0.add(vVar);
    }

    public final void n1() {
        b0 b0Var = this.f2752j0;
        b0Var.f2813n = -1L;
        b0Var.f2812m = -1;
        b0Var.f2814o = -1;
    }

    public void o(@NonNull f0 f0Var, n.c cVar, @NonNull n.c cVar2) {
        f0Var.H(false);
        if (this.O.a(f0Var, cVar, cVar2)) {
            W0();
        }
    }

    public void o0(@NonNull View view, @NonNull Rect rect) {
        p0(view, rect);
    }

    public final void o1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        I1(0);
        d1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.H = r0
            r1 = 1
            r5.f2771t = r1
            boolean r2 = r5.f2777w
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f2777w = r1
            androidx.recyclerview.widget.RecyclerView$x r1 = r5.f2737c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$q r1 = r5.f2759n
            if (r1 == 0) goto L23
            r1.E(r5)
        L23:
            r5.f2764p0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.L0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.j> r0 = androidx.recyclerview.widget.j.f3061e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.j r1 = (androidx.recyclerview.widget.j) r1
            r5.f2748h0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.j r1 = new androidx.recyclerview.widget.j
            r1.<init>()
            r5.f2748h0 = r1
            android.view.Display r1 = androidx.core.view.o0.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.j r2 = r5.f2748h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3064c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.j r0 = r5.f2748h0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        n nVar = this.O;
        if (nVar != null) {
            nVar.k();
        }
        J1();
        this.f2771t = false;
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.F(this, this.f2737c);
        }
        this.f2778w0.clear();
        removeCallbacks(this.f2780x0);
        this.f2745g.j();
        this.f2737c.A();
        q3.a.b(this);
        if (!L0 || (jVar = this.f2748h0) == null) {
            return;
        }
        jVar.j(this);
        this.f2748h0 = null;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2765q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2765q.get(i10).g(canvas, this, this.f2752j0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float f10;
        RecyclerView recyclerView;
        if (this.f2759n != null && !this.f2783z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f2759n.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                f10 = this.f2759n.p() ? motionEvent.getAxisValue(10) : 0.0f;
                r2 = f11;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                f10 = motionEvent.getAxisValue(26);
                if (this.f2759n.q()) {
                    float f12 = -f10;
                    f10 = 0.0f;
                    r2 = f12;
                } else if (!this.f2759n.p()) {
                    f10 = 0.0f;
                }
                z10 = this.B0;
            } else {
                i10 = 0;
                z10 = false;
                f10 = 0.0f;
            }
            int i11 = (int) (r2 * this.f2742e0);
            int i12 = (int) (f10 * this.f2740d0);
            if (z10) {
                OverScroller overScroller = this.f2746g0.f2820c;
                recyclerView = this;
                recyclerView.B1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, EditorInfoCompat.IME_FLAG_FORCE_ASCII, true);
            } else {
                recyclerView = this;
                I0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.E0.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f2783z) {
            return false;
        }
        this.f2769s = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f2759n;
        if (qVar == null) {
            return false;
        }
        boolean p8 = qVar.p();
        boolean q10 = this.f2759n.q();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.V = y10;
            this.T = y10;
            if (G1(motionEvent) || this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                I1(1);
            }
            int[] iArr = this.f2774u0;
            iArr[1] = 0;
            iArr[0] = 0;
            F1(0);
        } else if (actionMasked == 1) {
            this.R.clear();
            I1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i10 = x11 - this.S;
                int i11 = y11 - this.T;
                if (!p8 || Math.abs(i10) <= this.W) {
                    z10 = false;
                } else {
                    this.U = x11;
                    z10 = true;
                }
                if (q10 && Math.abs(i11) > this.W) {
                    this.V = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x12;
            this.S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y12;
            this.T = y12;
        } else if (actionMasked == 6) {
            T0(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f2777w = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        q qVar = this.f2759n;
        if (qVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2759n.e1(this.f2737c, this.f2752j0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f2782y0 = z10;
            if (z10 || this.f2757m == null) {
                return;
            }
            if (this.f2752j0.f2804e == 1) {
                I();
            }
            this.f2759n.F1(i10, i11);
            this.f2752j0.f2809j = true;
            J();
            this.f2759n.I1(i10, i11);
            if (this.f2759n.L1()) {
                this.f2759n.F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2752j0.f2809j = true;
                J();
                this.f2759n.I1(i10, i11);
            }
            this.f2784z0 = getMeasuredWidth();
            this.A0 = getMeasuredHeight();
            return;
        }
        if (this.f2773u) {
            this.f2759n.e1(this.f2737c, this.f2752j0, i10, i11);
            return;
        }
        if (this.C) {
            D1();
            Q0();
            Y0();
            R0();
            b0 b0Var = this.f2752j0;
            if (b0Var.f2811l) {
                b0Var.f2807h = true;
            } else {
                this.f2741e.j();
                this.f2752j0.f2807h = false;
            }
            this.C = false;
            H1(false);
        } else if (this.f2752j0.f2811l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f2757m;
        if (hVar != null) {
            this.f2752j0.f2805f = hVar.e();
        } else {
            this.f2752j0.f2805f = 0;
        }
        D1();
        this.f2759n.e1(this.f2737c, this.f2752j0, i10, i11);
        H1(false);
        this.f2752j0.f2807h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (D0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f2739d = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2739d;
        if (savedState2 != null) {
            savedState.f(savedState2);
            return savedState;
        }
        q qVar = this.f2759n;
        if (qVar != null) {
            savedState.f2785c = qVar.i1();
            return savedState;
        }
        savedState.f2785c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(@NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull n.c cVar, @NonNull n.c cVar2, boolean z10, boolean z11) {
        f0Var.H(false);
        if (z10) {
            i(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z11) {
                i(f0Var2);
            }
            f0Var.f2833h = f0Var2;
            i(f0Var);
            this.f2737c.O(f0Var);
            f0Var2.H(false);
            f0Var2.f2834i = f0Var;
        }
        if (this.O.b(f0Var, f0Var2, cVar, cVar2)) {
            W0();
        }
    }

    public final void p1() {
        View focusedChild = (this.f2744f0 && hasFocus() && this.f2757m != null) ? getFocusedChild() : null;
        f0 Y = focusedChild != null ? Y(focusedChild) : null;
        if (Y == null) {
            n1();
            return;
        }
        this.f2752j0.f2813n = this.f2757m.i() ? Y.l() : -1L;
        this.f2752j0.f2812m = this.F ? -1 : Y.w() ? Y.f2829d : Y.j();
        this.f2752j0.f2814o = q0(Y.f2827a);
    }

    public void q(@NonNull f0 f0Var, @NonNull n.c cVar, n.c cVar2) {
        i(f0Var);
        f0Var.H(false);
        if (this.O.c(f0Var, cVar, cVar2)) {
            W0();
        }
    }

    public final int q0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public void q1() {
        int j10 = this.f2743f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 n02 = n0(this.f2743f.i(i10));
            if (F0 && n02.f2828c == -1 && !n02.w()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!n02.K()) {
                n02.F();
            }
        }
    }

    public void r(String str) {
        if (D0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    public final String r0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public boolean r1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f2757m != null) {
            int[] iArr = this.f2776v0;
            iArr[0] = 0;
            iArr[1] = 0;
            s1(i10, i11, iArr);
            int[] iArr2 = this.f2776v0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f2765q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f2776v0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i13, i14, i15, i16, this.f2772t0, i12, iArr3);
        int[] iArr4 = this.f2776v0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.U;
        int[] iArr5 = this.f2772t0;
        int i24 = iArr5[0];
        this.U = i23 - i24;
        int i25 = this.V;
        int i26 = iArr5[1];
        this.V = i25 - i26;
        int[] iArr6 = this.f2774u0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.s.a(motionEvent, InputDeviceCompat.SOURCE_MOUSE)) {
                a1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && androidx.core.view.s.a(motionEvent, 4194304)) {
                    d1();
                }
            }
            w(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            O(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        f0 n02 = n0(view);
        if (n02 != null) {
            if (n02.y()) {
                n02.f();
            } else if (!n02.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + n02 + V());
            }
        } else if (F0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2759n.g1(this, this.f2752j0, view, view2) && view2 != null) {
            m1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2759n.w1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f2767r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2767r.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2779x != 0 || this.f2783z) {
            this.f2781y = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(f0 f0Var) {
        n nVar = this.O;
        return nVar == null || nVar.g(f0Var, f0Var.p());
    }

    public Rect s0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f2883c) {
            return rVar.b;
        }
        if (this.f2752j0.e() && (rVar.c() || rVar.e())) {
            return rVar.b;
        }
        Rect rect = rVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.f2765q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2751j.set(0, 0, 0, 0);
            this.f2765q.get(i10).e(this.f2751j, view, this, this.f2752j0);
            int i11 = rect.left;
            Rect rect2 = this.f2751j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f2883c = false;
        return rect;
    }

    public void s1(int i10, int i11, int[] iArr) {
        D1();
        Q0();
        Trace.beginSection("RV Scroll");
        W(this.f2752j0);
        int B1 = i10 != 0 ? this.f2759n.B1(i10, this.f2737c, this.f2752j0) : 0;
        int D1 = i11 != 0 ? this.f2759n.D1(i11, this.f2737c, this.f2752j0) : 0;
        Trace.endSection();
        l1();
        R0();
        H1(false);
        if (iArr != null) {
            iArr[0] = B1;
            iArr[1] = D1;
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f2759n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2783z) {
            return;
        }
        boolean p8 = qVar.p();
        boolean q10 = this.f2759n.q();
        if (p8 || q10) {
            if (!p8) {
                i10 = 0;
            }
            if (!q10) {
                i11 = 0;
            }
            r1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (x1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.p pVar) {
        this.f2766q0 = pVar;
        o0.m0(this, pVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        u1(hVar, false, true);
        Z0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2747h) {
            B0();
        }
        this.f2747h = z10;
        super.setClipToPadding(z10);
        if (this.f2777w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull m mVar) {
        x2.g.g(mVar);
        this.J = mVar;
        B0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f2773u = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.O;
        if (nVar2 != null) {
            nVar2.k();
            this.O.v(null);
        }
        this.O = nVar;
        if (nVar != null) {
            nVar.v(this.f2762o0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f2737c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f2759n) {
            return;
        }
        J1();
        if (this.f2759n != null) {
            n nVar = this.O;
            if (nVar != null) {
                nVar.k();
            }
            this.f2759n.p1(this.f2737c);
            this.f2759n.q1(this.f2737c);
            this.f2737c.c();
            if (this.f2771t) {
                this.f2759n.F(this, this.f2737c);
            }
            this.f2759n.J1(null);
            this.f2759n = null;
        } else {
            this.f2737c.c();
        }
        this.f2743f.o();
        this.f2759n = qVar;
        if (qVar != null) {
            if (qVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.b.V());
            }
            qVar.J1(this);
            if (this.f2771t) {
                this.f2759n.E(this);
            }
        }
        this.f2737c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.f2735a0 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f2754k0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2744f0 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f2737c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.f2761o = yVar;
    }

    public void setScrollState(int i10) {
        if (i10 == this.P) {
            return;
        }
        if (G0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.P, new Exception());
        }
        this.P = i10;
        if (i10 != 2) {
            K1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f2737c.K(d0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f2783z) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f2783z = true;
                this.A = true;
                J1();
                return;
            }
            this.f2783z = false;
            if (this.f2781y && this.f2759n != null && this.f2757m != null) {
                requestLayout();
            }
            this.f2781y = false;
        }
    }

    public final void t() {
        o1();
        setScrollState(0);
    }

    public void t1(int i10) {
        if (this.f2783z) {
            return;
        }
        J1();
        q qVar = this.f2759n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.C1(i10);
            awakenScrollBars();
        }
    }

    public final void u0(long j10, f0 f0Var, f0 f0Var2) {
        int g10 = this.f2743f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            f0 n02 = n0(this.f2743f.f(i10));
            if (n02 != f0Var && k0(n02) == j10) {
                h hVar = this.f2757m;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + n02 + " \n View Holder 2:" + f0Var + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + n02 + " \n View Holder 2:" + f0Var + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + V());
    }

    public final void u1(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.f2757m;
        if (hVar2 != null) {
            hVar2.B(this.b);
            this.f2757m.u(this);
        }
        if (!z10 || z11) {
            g1();
        }
        this.f2741e.y();
        h<?> hVar3 = this.f2757m;
        this.f2757m = hVar;
        if (hVar != null) {
            hVar.z(this.b);
            hVar.q(this);
        }
        q qVar = this.f2759n;
        if (qVar != null) {
            qVar.J0(hVar3, this.f2757m);
        }
        this.f2737c.y(hVar3, this.f2757m, z10);
        this.f2752j0.f2806g = true;
    }

    public void v() {
        int j10 = this.f2743f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 n02 = n0(this.f2743f.i(i10));
            if (!n02.K()) {
                n02.c();
            }
        }
        this.f2737c.d();
    }

    public boolean v0() {
        return !this.f2777w || this.F || this.f2741e.p();
    }

    public boolean v1(f0 f0Var, int i10) {
        if (!D0()) {
            f0Var.f2827a.setImportantForAccessibility(i10);
            return true;
        }
        f0Var.f2842q = i10;
        this.f2778w0.add(f0Var);
        return false;
    }

    public void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.K.onRelease();
            z10 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.M.onRelease();
            z10 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.L.onRelease();
            z10 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.N.onRelease();
            z10 |= this.N.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean w0() {
        int g10 = this.f2743f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            f0 n02 = n0(this.f2743f.f(i10));
            if (n02 != null && !n02.K() && n02.z()) {
                return true;
            }
        }
        return false;
    }

    public final boolean w1(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return t0(-i10) < d3.e.b(edgeEffect) * ((float) i11);
    }

    public int x(int i10) {
        return y(i10, this.K, this.M, getWidth());
    }

    public void x0() {
        this.f2741e = new androidx.recyclerview.widget.a(new g());
    }

    public boolean x1(AccessibilityEvent accessibilityEvent) {
        if (!D0()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? y2.b.a(accessibilityEvent) : 0;
        this.B |= a10 != 0 ? a10 : 0;
        return true;
    }

    public final int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && d3.e.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i11) / 4.0f) * d3.e.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || edgeEffect2 == null || d3.e.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int round2 = Math.round((f10 / 4.0f) * d3.e.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - round2;
    }

    @SuppressLint({"InlinedApi"})
    public final void y0() {
        if (o0.y(this) == 0) {
            o0.y0(this, 8);
        }
    }

    public void y1(int i10, int i11) {
        z1(i10, i11, null);
    }

    public int z(int i10) {
        return y(i10, this.L, this.N, getHeight());
    }

    public final void z0() {
        this.f2743f = new androidx.recyclerview.widget.e(new f());
    }

    public void z1(int i10, int i11, Interpolator interpolator) {
        A1(i10, i11, interpolator, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v4.a.f33227a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f2785c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2785c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        public void f(SavedState savedState) {
            this.f2785c = savedState.f2785c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f2785c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = new z();
        this.f2737c = new x();
        this.f2745g = new androidx.recyclerview.widget.u();
        this.f2749i = new a();
        this.f2751j = new Rect();
        this.f2753k = new Rect();
        this.f2755l = new RectF();
        this.f2763p = new ArrayList();
        this.f2765q = new ArrayList<>();
        this.f2767r = new ArrayList<>();
        this.f2779x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = O0;
        this.O = new androidx.recyclerview.widget.f();
        this.P = 0;
        this.Q = -1;
        this.f2740d0 = Float.MIN_VALUE;
        this.f2742e0 = Float.MIN_VALUE;
        this.f2744f0 = true;
        this.f2746g0 = new e0();
        this.f2750i0 = L0 ? new j.b() : null;
        this.f2752j0 = new b0();
        this.f2758m0 = false;
        this.f2760n0 = false;
        this.f2762o0 = new o();
        this.f2764p0 = false;
        this.f2768r0 = new int[2];
        this.f2772t0 = new int[2];
        this.f2774u0 = new int[2];
        this.f2776v0 = new int[2];
        this.f2778w0 = new ArrayList();
        this.f2780x0 = new b();
        this.f2784z0 = 0;
        this.A0 = 0;
        this.C0 = new d();
        e eVar = new e();
        this.D0 = eVar;
        this.E0 = new androidx.core.view.h(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f2740d0 = r0.e(viewConfiguration, context);
        this.f2742e0 = r0.h(viewConfiguration, context);
        this.f2736b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2738c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2734a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.v(this.f2762o0);
        x0();
        z0();
        y0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.p(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4.c.f33230a, i10, 0);
        o0.k0(this, context, v4.c.f33230a, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(v4.c.f33238j);
        if (obtainStyledAttributes.getInt(v4.c.f33232d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2747h = obtainStyledAttributes.getBoolean(v4.c.f33231c, true);
        boolean z10 = obtainStyledAttributes.getBoolean(v4.c.f33233e, false);
        this.f2775v = z10;
        if (z10) {
            A0((StateListDrawable) obtainStyledAttributes.getDrawable(v4.c.f33236h), obtainStyledAttributes.getDrawable(v4.c.f33237i), (StateListDrawable) obtainStyledAttributes.getDrawable(v4.c.f33234f), obtainStyledAttributes.getDrawable(v4.c.f33235g));
        }
        obtainStyledAttributes.recycle();
        this.B0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i10, 0);
        int[] iArr = H0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        q3.a.d(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public f0 f2882a;
        public final Rect b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2883c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2884d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.f2883c = true;
            this.f2884d = false;
        }

        public int a() {
            return this.f2882a.k();
        }

        public int b() {
            return this.f2882a.n();
        }

        public boolean c() {
            return this.f2882a.z();
        }

        public boolean d() {
            return this.f2882a.w();
        }

        public boolean e() {
            return this.f2882a.u();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.b = new Rect();
            this.f2883c = true;
            this.f2884d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.f2883c = true;
            this.f2884d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.f2883c = true;
            this.f2884d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.b = new Rect();
            this.f2883c = true;
            this.f2884d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f2759n;
        if (qVar != null) {
            return qVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
