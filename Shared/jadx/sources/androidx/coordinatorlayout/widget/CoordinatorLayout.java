package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.k;
import androidx.core.view.o0;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements v, w {

    /* renamed from: u, reason: collision with root package name */
    public static final String f1546u;

    /* renamed from: v, reason: collision with root package name */
    public static final Class<?>[] f1547v;

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1548w;

    /* renamed from: x, reason: collision with root package name */
    public static final Comparator<View> f1549x;

    /* renamed from: y, reason: collision with root package name */
    public static final x2.d<Rect> f1550y;

    /* renamed from: a, reason: collision with root package name */
    public final List<View> f1551a;
    public final i2.a<View> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<View> f1552c;

    /* renamed from: d, reason: collision with root package name */
    public final List<View> f1553d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1554e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1555f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1556g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1557h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1558i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1559j;

    /* renamed from: k, reason: collision with root package name */
    public View f1560k;

    /* renamed from: l, reason: collision with root package name */
    public View f1561l;

    /* renamed from: m, reason: collision with root package name */
    public g f1562m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1563n;

    /* renamed from: o, reason: collision with root package name */
    public WindowInsetsCompat f1564o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1565p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1566q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1567r;

    /* renamed from: s, reason: collision with root package name */
    public y f1568s;

    /* renamed from: t, reason: collision with root package name */
    public final x f1569t;

    public class a implements y {
        public a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.W(windowInsetsCompat);
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect, boolean z10) {
            return false;
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        }

        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v5, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v5, view);
            }
        }

        public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return h(coordinatorLayout, v5) > 0.0f;
        }

        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect) {
            return false;
        }

        public int g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        public float h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return 0.0f;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void k(@NonNull f fVar) {
        }

        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        public void n() {
        }

        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
            return false;
        }

        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v5, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v5, view, i10, i11, i12, i13);
            }
        }

        public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v5, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
        }

        public void z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v5, view, view2, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1567r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1567r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float L = o0.L(view);
            float L2 = o0.L(view2);
            if (L > L2) {
                return -1;
            }
            return L < L2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1546u = r02 != null ? r02.getName() : null;
        f1549x = new h();
        f1547v = new Class[]{Context.class, AttributeSet.class};
        f1548w = new ThreadLocal<>();
        f1550y = new x2.f(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h2.a.f18949a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1546u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f1548w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1547v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void O(@NonNull Rect rect) {
        rect.setEmpty();
        f1550y.a(rect);
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= GravityCompat.START;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    @NonNull
    public static Rect a() {
        Rect b10 = f1550y.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public final boolean A(View view) {
        return this.b.j(view);
    }

    public boolean B(@NonNull View view, int i10, int i11) {
        Rect a10 = a();
        t(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            O(a10);
        }
    }

    public final void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f1564o != null && o0.w(this) && !o0.w(view)) {
            a10.left += this.f1564o.getSystemWindowInsetLeft();
            a10.top += this.f1564o.getSystemWindowInsetTop();
            a10.right -= this.f1564o.getSystemWindowInsetRight();
            a10.bottom -= this.f1564o.getSystemWindowInsetBottom();
        }
        Rect a11 = a();
        k.a(S(fVar.f1574c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        O(a10);
        O(a11);
    }

    public final void D(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            t(view2, a10);
            u(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            O(a10);
            O(a11);
        }
    }

    public final void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = k.b(T(fVar.f1574c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int w5 = w(i10) - measuredWidth;
        if (i12 == 1) {
            w5 += measuredWidth / 2;
        } else if (i12 == 5) {
            w5 += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w5, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (o0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.f(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            O(a11);
            if (a10.isEmpty()) {
                O(a10);
                return;
            }
            int b10 = k.b(fVar.f1579h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f1581j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f1581j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f1580i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f1580i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(a10);
        }
    }

    public void G(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f1582k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            t(fVar.f1582k, a10);
            q(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            boolean z10 = (a12.left == a11.left && a12.top == a11.top) ? false : true;
            d(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                o0.W(view, i11);
            }
            if (i12 != 0) {
                o0.X(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.l(this, view, fVar.f1582k);
            }
            O(a10);
            O(a11);
            O(a12);
        }
    }

    public final void H(int i10) {
        boolean z10;
        int z11 = o0.z(this);
        int size = this.f1551a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f1551a.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f1583l == this.f1551a.get(i12)) {
                        G(view, z11);
                    }
                }
                q(view, true, a11);
                if (fVar.f1578g != 0 && !a11.isEmpty()) {
                    int b10 = k.b(fVar.f1578g, z11);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f1579h != 0 && view.getVisibility() == 0) {
                    F(view, a10, z11);
                }
                if (i10 != 2) {
                    x(view, a12);
                    if (!a12.equals(a11)) {
                        N(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f1551a.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.i(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.l(this, view2, view);
                            } else {
                                f10.m(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        O(a10);
        O(a11);
        O(a12);
    }

    public void I(@NonNull View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f1582k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = fVar.f1576e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1552c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i10 == 0) {
                        z10 = f10.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z10 = f10.H(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f1560k = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i12 = fVar.i(this, view);
                z11 = i12 && !c10;
                if (i12 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    f10.o(this, view, motionEvent2);
                } else if (i10 == 1) {
                    f10.H(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z10;
    }

    public final void M() {
        this.f1551a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f y10 = y(childAt);
            y10.d(this, childAt);
            this.b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (y10.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1551a.addAll(this.b.i());
        Collections.reverse(this.f1551a);
    }

    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void P() {
        if (this.f1558i && this.f1562m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1562m);
        }
        this.f1563n = false;
    }

    public final void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.o(this, childAt, obtain);
                } else {
                    f10.H(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f1560k = null;
        this.f1557h = false;
    }

    public final void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1580i;
        if (i11 != i10) {
            o0.W(view, i10 - i11);
            fVar.f1580i = i10;
        }
    }

    public final void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1581j;
        if (i11 != i10) {
            o0.X(view, i10 - i11);
            fVar.f1581j = i10;
        }
    }

    public final WindowInsetsCompat W(WindowInsetsCompat windowInsetsCompat) {
        if (x2.b.a(this.f1564o, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f1564o = windowInsetsCompat;
        boolean z10 = false;
        boolean z11 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.f1565p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        WindowInsetsCompat e10 = e(windowInsetsCompat);
        requestLayout();
        return e10;
    }

    public final void X() {
        if (!o0.w(this)) {
            o0.A0(this, null);
            return;
        }
        if (this.f1568s == null) {
            this.f1568s = new a();
        }
        o0.A0(this, this.f1568s);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.f1558i) {
            if (this.f1562m == null) {
                this.f1562m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1562m);
        }
        this.f1563n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1573a;
        if (cVar != null) {
            float h10 = cVar.h(this, view);
            if (h10 > 0.0f) {
                if (this.f1554e == null) {
                    this.f1554e = new Paint();
                }
                this.f1554e.setColor(fVar.f1573a.g(this, view));
                this.f1554e.setAlpha(c(Math.round(h10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1554e);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j10);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1566q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat) {
        c f10;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (o0.w(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = f10.j(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void f(@NonNull View view) {
        List g10 = this.b.g(view);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g10.size(); i10++) {
            View view2 = (View) g10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.l(this, view2, view);
            }
        }
    }

    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f1563n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f1551a);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f1564o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1569t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1566q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.v
    public void i(View view, View view2, int i10, int i11) {
        c f10;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f1569t.c(view, view2, i10, i11);
        this.f1561l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                f10.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.v
    public void j(View view, int i10) {
        this.f1569t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f1561l = null;
    }

    @Override // androidx.core.view.v
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f1555f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1555f;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f1555f;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.w
    public void m(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f1555f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f1555f;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    int[] iArr4 = this.f1555f;
                    i16 = i13 > 0 ? Math.max(i16, iArr4[1]) : Math.min(i16, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            H(1);
        }
    }

    @Override // androidx.core.view.v
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1556g);
    }

    @Override // androidx.core.view.v
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean E = f10.E(this, childAt, view, view2, i10, i11);
                    z10 |= E;
                    fVar.r(i11, E);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f1563n) {
            if (this.f1562m == null) {
                this.f1562m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1562m);
        }
        if (this.f1564o == null && o0.w(this)) {
            o0.j0(this);
        }
        this.f1558i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f1563n && this.f1562m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1562m);
        }
        View view = this.f1561l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1558i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1565p || this.f1566q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f1564o;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1566q.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1566q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return L;
        }
        Q(true);
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int z11 = o0.z(this);
        int size = this.f1551a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f1551a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.p(this, view, z11))) {
                I(view, z11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        View view2;
        float f13;
        float f14;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z12 = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    view2 = view;
                    f13 = f10;
                    f14 = f11;
                    z11 = z10;
                    z12 |= f12.r(this, childAt, view2, f13, f14, z11);
                    i10++;
                    view = view2;
                    f10 = f13;
                    f11 = f14;
                    z10 = z11;
                }
            }
            view2 = view;
            f13 = f10;
            f14 = f11;
            z11 = z10;
            i10++;
            view = view2;
            f10 = f13;
            f11 = f14;
            z10 = z11;
        }
        if (z12) {
            H(1);
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        View view2;
        float f13;
        float f14;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    view2 = view;
                    f13 = f10;
                    f14 = f11;
                    z10 |= f12.s(this, childAt, view2, f13, f14);
                    i10++;
                    view = view2;
                    f10 = f13;
                    f11 = f14;
                }
            }
            view2 = view;
            f13 = f10;
            f14 = f11;
            i10++;
            view = view2;
            f10 = f13;
            f11 = f14;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f1570c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = y(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f10.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable C;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (C = f10.C(this, childAt)) != null) {
                sparseArray.append(id2, C);
            }
        }
        savedState.f1570c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f1560k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1560k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1560k
            boolean r6 = r6.H(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f1560k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.Q(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> r(@NonNull View view) {
        List<View> h10 = this.b.h(view);
        this.f1553d.clear();
        if (h10 != null) {
            this.f1553d.addAll(h10);
        }
        return this.f1553d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f1557h) {
            return;
        }
        Q(false);
        this.f1557h = true;
    }

    @NonNull
    public List<View> s(@NonNull View view) {
        List g10 = this.b.g(view);
        this.f1553d.clear();
        if (g10 != null) {
            this.f1553d.addAll(g10);
        }
        return this.f1553d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1567r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1566q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1566q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1566q.setState(getDrawableState());
                }
                q2.a.m(this.f1566q, o0.z(this));
                this.f1566q.setVisible(getVisibility() == 0, false);
                this.f1566q.setCallback(this);
            }
            o0.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? l2.b.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1566q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f1566q.setVisible(z10, false);
    }

    public void t(View view, Rect rect) {
        i2.b.a(this, view, rect);
    }

    public void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public final void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int b10 = k.b(R(fVar.f1574c), i10);
        int b11 = k.b(S(fVar.f1575d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1566q;
    }

    public final int w(int i10) {
        int[] iArr = this.f1559j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public final void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f1549x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.f1551a = new ArrayList();
        this.b = new i2.a<>();
        this.f1552c = new ArrayList();
        this.f1553d = new ArrayList();
        this.f1555f = new int[2];
        this.f1556g = new int[2];
        this.f1569t = new x(this);
        TypedArray obtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, h2.c.b, 0, h2.b.f18950a) : context.obtainStyledAttributes(attributeSet, h2.c.b, i10, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h2.c.b, attributeSet, obtainStyledAttributes, 0, h2.b.f18950a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h2.c.b, attributeSet, obtainStyledAttributes, i10, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(h2.c.f18952c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f1559j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f1559j.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f1559j[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f1566q = obtainStyledAttributes.getDrawable(h2.c.f18953d);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (o0.x(this) == 0) {
            o0.w0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray<Parcelable> f1570c;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1570c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1570c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f1570c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1570c.keyAt(i11);
                parcelableArr[i11] = this.f1570c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f1573a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public int f1574c;

        /* renamed from: d, reason: collision with root package name */
        public int f1575d;

        /* renamed from: e, reason: collision with root package name */
        public int f1576e;

        /* renamed from: f, reason: collision with root package name */
        public int f1577f;

        /* renamed from: g, reason: collision with root package name */
        public int f1578g;

        /* renamed from: h, reason: collision with root package name */
        public int f1579h;

        /* renamed from: i, reason: collision with root package name */
        public int f1580i;

        /* renamed from: j, reason: collision with root package name */
        public int f1581j;

        /* renamed from: k, reason: collision with root package name */
        public View f1582k;

        /* renamed from: l, reason: collision with root package name */
        public View f1583l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f1584m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f1585n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f1586o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f1587p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f1588q;

        /* renamed from: r, reason: collision with root package name */
        public Object f1589r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.b = false;
            this.f1574c = 0;
            this.f1575d = 0;
            this.f1576e = -1;
            this.f1577f = -1;
            this.f1578g = 0;
            this.f1579h = 0;
            this.f1588q = new Rect();
        }

        public boolean a() {
            return this.f1582k == null && this.f1577f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f1583l || s(view2, o0.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f1573a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f1573a == null) {
                this.f1584m = false;
            }
            return this.f1584m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1577f == -1) {
                this.f1583l = null;
                this.f1582k = null;
                return null;
            }
            if (this.f1582k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f1582k;
        }

        public int e() {
            return this.f1577f;
        }

        public c f() {
            return this.f1573a;
        }

        public boolean g() {
            return this.f1587p;
        }

        public Rect h() {
            return this.f1588q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f1584m;
            if (z10) {
                return true;
            }
            c cVar = this.f1573a;
            boolean e10 = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f1584m = e10;
            return e10;
        }

        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f1585n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1586o;
        }

        public void k() {
            this.f1587p = false;
        }

        public void l(int i10) {
            r(i10, false);
        }

        public void m() {
            this.f1584m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1577f);
            this.f1582k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f1583l = null;
                    this.f1582k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1577f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f1583l = null;
                this.f1582k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f1583l = null;
                    this.f1582k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f1583l = findViewById;
        }

        public void o(c cVar) {
            c cVar2 = this.f1573a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f1573a = cVar;
                this.f1589r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        public void p(boolean z10) {
            this.f1587p = z10;
        }

        public void q(Rect rect) {
            this.f1588q.set(rect);
        }

        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f1585n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f1586o = z10;
            }
        }

        public final boolean s(View view, int i10) {
            int b = k.b(((f) view.getLayoutParams()).f1578g, i10);
            return b != 0 && (k.b(this.f1579h, i10) & b) == b;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1582k.getId() != this.f1577f) {
                return false;
            }
            View view2 = this.f1582k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1583l = null;
                    this.f1582k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1583l = view2;
            return true;
        }

        public f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.f1574c = 0;
            this.f1575d = 0;
            this.f1576e = -1;
            this.f1577f = -1;
            this.f1578g = 0;
            this.f1579h = 0;
            this.f1588q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h2.c.f18954e);
            this.f1574c = obtainStyledAttributes.getInteger(h2.c.f18955f, 0);
            this.f1577f = obtainStyledAttributes.getResourceId(h2.c.f18956g, -1);
            this.f1575d = obtainStyledAttributes.getInteger(h2.c.f18957h, 0);
            this.f1576e = obtainStyledAttributes.getInteger(h2.c.f18961l, -1);
            this.f1578g = obtainStyledAttributes.getInt(h2.c.f18960k, 0);
            this.f1579h = obtainStyledAttributes.getInt(h2.c.f18959j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(h2.c.f18958i);
            this.b = hasValue;
            if (hasValue) {
                this.f1573a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(h2.c.f18958i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1573a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.f1574c = 0;
            this.f1575d = 0;
            this.f1576e = -1;
            this.f1577f = -1;
            this.f1578g = 0;
            this.f1579h = 0;
            this.f1588q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.f1574c = 0;
            this.f1575d = 0;
            this.f1576e = -1;
            this.f1577f = -1;
            this.f1578g = 0;
            this.f1579h = 0;
            this.f1588q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.f1574c = 0;
            this.f1575d = 0;
            this.f1576e = -1;
            this.f1577f = -1;
            this.f1578g = 0;
            this.f1579h = 0;
            this.f1588q = new Rect();
        }
    }
}
