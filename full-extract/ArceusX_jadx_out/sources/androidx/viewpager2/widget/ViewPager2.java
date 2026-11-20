package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import y2.p;
import y2.s;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public static boolean f3199u = true;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3200a;
    public final Rect b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.viewpager2.widget.a f3201c;

    /* renamed from: d, reason: collision with root package name */
    public int f3202d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3203e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView.j f3204f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayoutManager f3205g;

    /* renamed from: h, reason: collision with root package name */
    public int f3206h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f3207i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f3208j;

    /* renamed from: k, reason: collision with root package name */
    public o f3209k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.viewpager2.widget.c f3210l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.a f3211m;

    /* renamed from: n, reason: collision with root package name */
    public u5.b f3212n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.b f3213o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView.n f3214p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3215q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3216r;

    /* renamed from: s, reason: collision with root package name */
    public int f3217s;

    /* renamed from: t, reason: collision with root package name */
    public e f3218t;

    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3203e = true;
            viewPager2.f3210l.l();
        }
    }

    public class b extends i {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3202d != i10) {
                viewPager2.f3202d = i10;
                viewPager2.f3218t.r();
            }
        }
    }

    public class c extends i {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3208j.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.s {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(@NonNull View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) rVar).width != -1 || ((ViewGroup.MarginLayoutParams) rVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i10) {
            return false;
        }

        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(RecyclerView.h<?> hVar) {
        }

        public void f(RecyclerView.h<?> hVar) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@NonNull androidx.viewpager2.widget.a aVar, @NonNull RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@NonNull p pVar) {
        }

        public void k(@NonNull View view, @NonNull p pVar) {
        }

        public boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void n() {
        }

        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public void t() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    public class f extends e {
        public f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@NonNull p pVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            pVar.d0(p.a.f36280r);
            pVar.d0(p.a.f36279q);
            pVar.G0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.j {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
        public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull p pVar) {
            super.R0(xVar, b0Var, pVar);
            ViewPager2.this.f3218t.j(pVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.R1(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull View view, @NonNull p pVar) {
            ViewPager2.this.f3218t.k(view, pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean m1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, int i10, Bundle bundle) {
            return ViewPager2.this.f3218t.b(i10) ? ViewPager2.this.f3218t.l(i10) : super.m1(xVar, b0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    public class j extends e {
        public final s b;

        /* renamed from: c, reason: collision with root package name */
        public final s f3226c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView.j f3227d;

        public class a implements s {
            public a() {
            }

            @Override // y2.s
            public boolean a(@NonNull View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements s {
            public b() {
            }

            @Override // y2.s
            public boolean a(@NonNull View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        public j() {
            super(ViewPager2.this, null);
            this.b = new a();
            this.f3226c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.z(this.f3227d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.B(this.f3227d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@NonNull androidx.viewpager2.widget.a aVar, @NonNull RecyclerView recyclerView) {
            o0.w0(recyclerView, 2);
            this.f3227d = new c();
            if (o0.x(ViewPager2.this) == 0) {
                o0.w0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            p O0 = p.O0(accessibilityNodeInfo);
            u(O0);
            w(O0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void k(@NonNull View view, @NonNull p pVar) {
            v(view, pVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        public final void u(p pVar) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() != null) {
                i11 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i11 = ViewPager2.this.getAdapter().e();
                    i10 = 1;
                } else {
                    i10 = ViewPager2.this.getAdapter().e();
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            pVar.n0(p.f.b(i11, i10, false, 0));
        }

        public final void v(View view, p pVar) {
            pVar.o0(p.g.b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f3205g.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f3205g.l0(view) : 0, 1, false, false));
        }

        public final void w(p pVar) {
            int e10;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (e10 = adapter.e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f3202d > 0) {
                pVar.a(8192);
            }
            if (ViewPager2.this.f3202d < e10 - 1) {
                pVar.a(4096);
            }
            pVar.G0(true);
        }

        public void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        public void y() {
            int e10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            o0.g0(viewPager2, R.id.accessibilityActionPageLeft);
            o0.g0(viewPager2, R.id.accessibilityActionPageRight);
            o0.g0(viewPager2, R.id.accessibilityActionPageUp);
            o0.g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (e10 = ViewPager2.this.getAdapter().e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f3202d < e10 - 1) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageDown, null), null, this.b);
                }
                if (ViewPager2.this.f3202d > 0) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageUp, null), null, this.f3226c);
                    return;
                }
                return;
            }
            boolean d10 = ViewPager2.this.d();
            int i11 = d10 ? 16908360 : 16908361;
            if (d10) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f3202d < e10 - 1) {
                o0.i0(viewPager2, new p.a(i11, null), null, this.b);
            }
            if (ViewPager2.this.f3202d > 0) {
                o0.i0(viewPager2, new p.a(i10, null), null, this.f3226c);
            }
        }
    }

    public interface k {
    }

    public class l extends o {
        public l() {
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.s
        public View f(RecyclerView.q qVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(qVar);
        }
    }

    public class m extends RecyclerView {
        public m(@NonNull Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3218t.d() ? ViewPager2.this.f3218t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3202d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3202d);
            ViewPager2.this.f3218t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    public static class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3233a;
        public final RecyclerView b;

        public n(int i10, RecyclerView recyclerView) {
            this.f3233a = i10;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.C1(this.f3233a);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3200a = new Rect();
        this.b = new Rect();
        this.f3201c = new androidx.viewpager2.widget.a(3);
        this.f3203e = false;
        this.f3204f = new a();
        this.f3206h = -1;
        this.f3214p = null;
        this.f3215q = false;
        this.f3216r = true;
        this.f3217s = -1;
        b(context, attributeSet);
    }

    public final RecyclerView.s a() {
        return new d();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f3218t = f3199u ? new j() : new f();
        m mVar = new m(context);
        this.f3208j = mVar;
        mVar.setId(o0.k());
        this.f3208j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f3205g = hVar;
        this.f3208j.setLayoutManager(hVar);
        this.f3208j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f3208j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f3208j.l(a());
        androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
        this.f3210l = cVar;
        this.f3212n = new u5.b(this, cVar, this.f3208j);
        l lVar = new l();
        this.f3209k = lVar;
        lVar.b(this.f3208j);
        this.f3208j.n(this.f3210l);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
        this.f3211m = aVar;
        this.f3210l.o(aVar);
        b bVar = new b();
        c cVar2 = new c();
        this.f3211m.d(bVar);
        this.f3211m.d(cVar2);
        this.f3218t.h(this.f3211m, this.f3208j);
        this.f3211m.d(this.f3201c);
        androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f3205g);
        this.f3213o = bVar2;
        this.f3211m.d(bVar2);
        RecyclerView recyclerView = this.f3208j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public boolean c() {
        return this.f3212n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f3208j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f3208j.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f3205g.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f3219a;
            sparseArray.put(this.f3208j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f3216r;
    }

    public final void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.z(this.f3204f);
        }
    }

    public void g(@NonNull i iVar) {
        this.f3201c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f3218t.a() ? this.f3218t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f3208j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3202d;
    }

    public int getItemDecorationCount() {
        return this.f3208j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3217s;
    }

    public int getOrientation() {
        return this.f3205g.q2() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f3208j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3210l.h();
    }

    public void h() {
        this.f3213o.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        RecyclerView.h adapter;
        if (this.f3206h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f3207i;
        if (parcelable != null) {
            if (adapter instanceof t5.a) {
                ((t5.a) adapter).b(parcelable);
            }
            this.f3207i = null;
        }
        int max = Math.max(0, Math.min(this.f3206h, adapter.e() - 1));
        this.f3202d = max;
        this.f3206h = -1;
        this.f3208j.t1(max);
        this.f3218t.n();
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    public void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f3206h != -1) {
                this.f3206h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
        if (min == this.f3202d && this.f3210l.j()) {
            return;
        }
        int i11 = this.f3202d;
        if (min == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f3202d = min;
        this.f3218t.r();
        if (!this.f3210l.j()) {
            d10 = this.f3210l.g();
        }
        this.f3210l.m(min, z10);
        if (!z10) {
            this.f3208j.t1(min);
            return;
        }
        double d11 = min;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f3208j.C1(min);
            return;
        }
        this.f3208j.t1(d11 > d10 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f3208j;
        recyclerView.post(new n(min, recyclerView));
    }

    public final void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f30883a);
        o0.k0(this, context, s5.a.f30883a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(s5.a.b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.B(this.f3204f);
        }
    }

    public void n(@NonNull i iVar) {
        this.f3201c.e(iVar);
    }

    public void o() {
        o oVar = this.f3209k;
        if (oVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View f10 = oVar.f(this.f3205g);
        if (f10 == null) {
            return;
        }
        int l02 = this.f3205g.l0(f10);
        if (l02 != this.f3202d && getScrollState() == 0) {
            this.f3211m.c(l02);
        }
        this.f3203e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3218t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3208j.getMeasuredWidth();
        int measuredHeight = this.f3208j.getMeasuredHeight();
        this.f3200a.left = getPaddingLeft();
        this.f3200a.right = (i12 - i10) - getPaddingRight();
        this.f3200a.top = getPaddingTop();
        this.f3200a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3200a, this.b);
        RecyclerView recyclerView = this.f3208j;
        Rect rect = this.b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3203e) {
            o();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f3208j, i10, i11);
        int measuredWidth = this.f3208j.getMeasuredWidth();
        int measuredHeight = this.f3208j.getMeasuredHeight();
        int measuredState = this.f3208j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3206h = savedState.b;
        this.f3207i = savedState.f3220c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3219a = this.f3208j.getId();
        int i10 = this.f3206h;
        if (i10 == -1) {
            i10 = this.f3202d;
        }
        savedState.b = i10;
        Parcelable parcelable = this.f3207i;
        if (parcelable != null) {
            savedState.f3220c = parcelable;
            return savedState;
        }
        Object adapter = this.f3208j.getAdapter();
        if (adapter instanceof t5.a) {
            savedState.f3220c = ((t5.a) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f3218t.c(i10, bundle) ? this.f3218t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f3208j.getAdapter();
        this.f3218t.f(adapter);
        m(adapter);
        this.f3208j.setAdapter(hVar);
        this.f3202d = 0;
        i();
        this.f3218t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f3218t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f3217s = i10;
        this.f3208j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3205g.E2(i10);
        this.f3218t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f3215q) {
                this.f3214p = this.f3208j.getItemAnimator();
                this.f3215q = true;
            }
            this.f3208j.setItemAnimator(null);
        } else if (this.f3215q) {
            this.f3208j.setItemAnimator(this.f3214p);
            this.f3214p = null;
            this.f3215q = false;
        }
        this.f3213o.d();
        if (kVar == null) {
            return;
        }
        this.f3213o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3216r = z10;
        this.f3218t.t();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f3219a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f3220c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
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

        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f3219a = parcel.readInt();
            this.b = parcel.readInt();
            this.f3220c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3219a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.f3220c, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
