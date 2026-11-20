package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.GravityCompat;
import androidx.core.view.b;
import java.util.ArrayList;
import q.e1;
import q.n0;
import q.q;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements b.a {
    public c A;
    public b B;
    public final f C;
    public int D;

    /* renamed from: k, reason: collision with root package name */
    public d f1091k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1092l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1093m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1094n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1095o;

    /* renamed from: p, reason: collision with root package name */
    public int f1096p;

    /* renamed from: q, reason: collision with root package name */
    public int f1097q;

    /* renamed from: r, reason: collision with root package name */
    public int f1098r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1099s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1100t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1101u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1102v;

    /* renamed from: w, reason: collision with root package name */
    public int f1103w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f1104x;

    /* renamed from: y, reason: collision with root package name */
    public e f1105y;

    /* renamed from: z, reason: collision with root package name */
    public C0011a f1106z;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0011a extends h {
        public C0011a(Context context, l lVar, View view) {
            super(context, lVar, view, false, i.a.f19809m);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f1091k;
                f(view2 == null ? (View) a.this.f711i : view2);
            }
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.f1106z = null;
            aVar.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p.f a() {
            C0011a c0011a = a.this.f1106z;
            if (c0011a != null) {
                return c0011a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e f1109a;

        public c(e eVar) {
            this.f1109a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f705c != null) {
                a.this.f705c.d();
            }
            View view = (View) a.this.f711i;
            if (view != null && view.getWindowToken() != null && this.f1109a.m()) {
                a.this.f1105y = this.f1109a;
            }
            a.this.A = null;
        }
    }

    public class d extends q implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0012a extends n0 {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f1111j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0012a(View view, a aVar) {
                super(view);
                this.f1111j = aVar;
            }

            @Override // q.n0
            public p.f b() {
                e eVar = a.this.f1105y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // q.n0
            public boolean c() {
                a.this.L();
                return true;
            }

            @Override // q.n0
            public boolean d() {
                a aVar = a.this;
                if (aVar.A != null) {
                    return false;
                }
                aVar.C();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.f19808l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new C0012a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.L();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                q2.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, i.a.f19809m);
            h(GravityCompat.END);
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.f705c != null) {
                a.this.f705c.close();
            }
            a.this.f1105y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a n10 = a.this.n();
            if (n10 != null) {
                n10.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f705c) {
                return false;
            }
            a.this.D = ((l) eVar).getItem().getItemId();
            i.a n10 = a.this.n();
            if (n10 != null) {
                return n10.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, i.g.f19892c, i.g.b);
        this.f1104x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f711i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable B() {
        d dVar = this.f1091k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1093m) {
            return this.f1092l;
        }
        return null;
    }

    public boolean C() {
        Object obj;
        c cVar = this.A;
        if (cVar != null && (obj = this.f711i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.f1105y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean D() {
        C0011a c0011a = this.f1106z;
        if (c0011a == null) {
            return false;
        }
        c0011a.b();
        return true;
    }

    public boolean E() {
        return this.A != null || F();
    }

    public boolean F() {
        e eVar = this.f1105y;
        return eVar != null && eVar.d();
    }

    public void G(Configuration configuration) {
        if (!this.f1099s) {
            this.f1098r = o.a.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f705c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void H(boolean z10) {
        this.f1102v = z10;
    }

    public void I(ActionMenuView actionMenuView) {
        this.f711i = actionMenuView;
        actionMenuView.a(this.f705c);
    }

    public void J(Drawable drawable) {
        d dVar = this.f1091k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1093m = true;
            this.f1092l = drawable;
        }
    }

    public void K(boolean z10) {
        this.f1094n = z10;
        this.f1095o = true;
    }

    public boolean L() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1094n || F() || (eVar = this.f705c) == null || this.f711i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.f705c, this.f1091k, true));
        this.A = cVar;
        ((View) this.f711i).post(cVar);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void a(boolean z10) {
        if (z10) {
            super.e(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.f705c;
        if (eVar != null) {
            eVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        z();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.f0() != this.f705c) {
            lVar2 = (l) lVar2.f0();
        }
        View A = A(lVar2.getItem());
        if (A == null) {
            return false;
        }
        this.D = lVar.getItem().getItemId();
        int size = lVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        C0011a c0011a = new C0011a(this.b, lVar, A);
        this.f1106z = c0011a;
        c0011a.g(z10);
        this.f1106z.k();
        super.e(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f711i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f705c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<g> s8 = eVar.s();
            int size = s8.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b a10 = s8.get(i10).a();
                if (a10 != null) {
                    a10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f705c;
        ArrayList<g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1094n && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1091k == null) {
                this.f1091k = new d(this.f704a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1091k.getParent();
            if (viewGroup != this.f711i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1091k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f711i;
                actionMenuView.addView(this.f1091k, actionMenuView.D());
            }
        } else {
            d dVar = this.f1091k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f711i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1091k);
                }
            }
        }
        ((ActionMenuView) this.f711i).setOverflowReserved(this.f1094n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        ArrayList<g> arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f705c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = aVar.f1098r;
        int i15 = aVar.f1097q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f711i;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            g gVar = arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (aVar.f1102v && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (aVar.f1094n && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = aVar.f1104x;
        sparseBooleanArray.clear();
        if (aVar.f1100t) {
            int i20 = aVar.f1103w;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            g gVar2 = arrayList.get(i21);
            if (gVar2.o()) {
                View o8 = aVar.o(gVar2, view, viewGroup);
                if (aVar.f1100t) {
                    i12 -= ActionMenuView.J(o8, i11, i12, makeMeasureSpec, r32);
                } else {
                    o8.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = o8.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!aVar.f1100t || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View o10 = aVar.o(gVar2, null, viewGroup);
                    if (aVar.f1100t) {
                        int J = ActionMenuView.J(o10, i11, i12, makeMeasureSpec, 0);
                        i12 -= J;
                        if (J == 0) {
                            z14 = false;
                        }
                    } else {
                        o10.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = o10.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!aVar.f1100t ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        g gVar3 = arrayList.get(i23);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(@NonNull Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        o.a b10 = o.a.b(context);
        if (!this.f1095o) {
            this.f1094n = b10.h();
        }
        if (!this.f1101u) {
            this.f1096p = b10.c();
        }
        if (!this.f1099s) {
            this.f1098r = b10.d();
        }
        int i10 = this.f1096p;
        if (this.f1094n) {
            if (this.f1091k == null) {
                d dVar = new d(this.f704a);
                this.f1091k = dVar;
                if (this.f1093m) {
                    dVar.setImageDrawable(this.f1092l);
                    this.f1092l = null;
                    this.f1093m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1091k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1091k.getMeasuredWidth();
        } else {
            this.f1091k = null;
        }
        this.f1097q = i10;
        this.f1103w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void k(g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f711i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean m(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1091k) {
            return false;
        }
        return super.m(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View o(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.o(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j p(ViewGroup viewGroup) {
        j jVar = this.f711i;
        j p8 = super.p(viewGroup);
        if (jVar != p8) {
            ((ActionMenuView) p8).setPresenter(this);
        }
        return p8;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean r(int i10, g gVar) {
        return gVar.l();
    }

    public boolean z() {
        return C() | D();
    }
}
