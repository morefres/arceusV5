package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.k;
import androidx.core.view.o;
import androidx.core.view.o0;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.customview.view.AbsSavedState;
import i.j;
import j.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q.a1;
import q.b0;
import q.e1;
import q.f0;
import q.g1;
import q.q;
import q.t0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements o {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final p G;
    public ArrayList<MenuItem> H;
    public final ActionMenuView.e I;
    public androidx.appcompat.widget.d J;
    public androidx.appcompat.widget.a K;
    public f L;
    public i.a M;
    public e.a N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final Runnable S;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1055a;
    public TextView b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f1056c;

    /* renamed from: d, reason: collision with root package name */
    public ImageButton f1057d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1058e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1059f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1060g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f1061h;

    /* renamed from: i, reason: collision with root package name */
    public View f1062i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1063j;

    /* renamed from: k, reason: collision with root package name */
    public int f1064k;

    /* renamed from: l, reason: collision with root package name */
    public int f1065l;

    /* renamed from: m, reason: collision with root package name */
    public int f1066m;

    /* renamed from: n, reason: collision with root package name */
    public int f1067n;

    /* renamed from: o, reason: collision with root package name */
    public int f1068o;

    /* renamed from: p, reason: collision with root package name */
    public int f1069p;

    /* renamed from: q, reason: collision with root package name */
    public int f1070q;

    /* renamed from: r, reason: collision with root package name */
    public int f1071r;

    /* renamed from: s, reason: collision with root package name */
    public int f1072s;

    /* renamed from: t, reason: collision with root package name */
    public t0 f1073t;

    /* renamed from: u, reason: collision with root package name */
    public int f1074u;

    /* renamed from: v, reason: collision with root package name */
    public int f1075v;

    /* renamed from: w, reason: collision with root package name */
    public int f1076w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1077x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1078y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1079z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            e.a aVar = Toolbar.this.N;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f1055a.H()) {
                Toolbar.this.G.e(eVar);
            }
            e.a aVar = Toolbar.this.N;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: q.d1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements i {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1086a;
        public androidx.appcompat.view.menu.g b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1061h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1061h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1061h);
            }
            Toolbar.this.f1062i = gVar.getActionView();
            this.b = gVar;
            ViewParent parent2 = Toolbar.this.f1062i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1062i);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f21294a = (toolbar4.f1067n & 112) | GravityCompat.START;
                generateDefaultLayoutParams.b = 2;
                toolbar4.f1062i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1062i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1062i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewExpanded();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(boolean z10) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1086a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1086a.getItem(i10) == this.b) {
                            return;
                        }
                    }
                }
                h(this.f1086a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1062i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1062i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1061h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1062i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1086a;
            if (eVar2 != null && (gVar = this.b) != null) {
                eVar2.f(gVar);
            }
            this.f1086a = eVar;
        }
    }

    public interface h {
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.Q);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new o.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1055a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1055a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.S);
        post(this.S);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.f1055a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1073t.e(i10, i11);
    }

    public void K(int i10, int i11) {
        h();
        this.f1073t.g(i10, i11);
    }

    public void L(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f1055a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e L = this.f1055a.L();
        if (L == eVar) {
            return;
        }
        if (L != null) {
            L.P(this.K);
            L.P(this.L);
        }
        if (this.L == null) {
            this.L = new f();
        }
        aVar.H(true);
        if (eVar != null) {
            eVar.c(aVar, this.f1063j);
            eVar.c(this.L, this.f1063j);
        } else {
            aVar.i(this.f1063j, null);
            this.L.i(this.f1063j, null);
            aVar.f(true);
            this.L.f(true);
        }
        this.f1055a.setPopupTheme(this.f1064k);
        this.f1055a.setPresenter(aVar);
        this.K = aVar;
        S();
    }

    public void M(Context context, int i10) {
        this.f1066m = i10;
        TextView textView = this.f1056c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1065l = i10;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean O() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // androidx.core.view.o
    public void Q(@NonNull r rVar) {
        this.G.f(rVar);
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f1055a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && isAttachedToWindow() && this.R;
            if (z10 && this.Q == null) {
                if (this.P == null) {
                    this.P = e.b(new Runnable() { // from class: q.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.P);
                this.Q = a10;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.Q) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.P);
            this.Q = null;
        }
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    public final void b(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b10 = k.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && P(childAt) && p(gVar.f21294a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && P(childAt2) && p(gVar2.f21294a) == b10) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.b = 1;
        if (!z10 || this.f1062i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1055a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.L;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1055a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f1061h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, i.a.P);
            this.f1061h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1059f);
            this.f1061h.setContentDescription(this.f1060g);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f21294a = (this.f1067n & 112) | GravityCompat.START;
            generateDefaultLayoutParams.b = 2;
            this.f1061h.setLayoutParams(generateDefaultLayoutParams);
            this.f1061h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1061h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1061h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t0 t0Var = this.f1073t;
        if (t0Var != null) {
            return t0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1075v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t0 t0Var = this.f1073t;
        if (t0Var != null) {
            return t0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        t0 t0Var = this.f1073t;
        if (t0Var != null) {
            return t0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        t0 t0Var = this.f1073t;
        if (t0Var != null) {
            return t0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1074u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e L;
        ActionMenuView actionMenuView = this.f1055a;
        return (actionMenuView == null || (L = actionMenuView.L()) == null || !L.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1075v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1074u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1058e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1058e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1055a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1057d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1057d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1057d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1055a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1063j;
    }

    public int getPopupTheme() {
        return this.f1064k;
    }

    public CharSequence getSubtitle() {
        return this.f1078y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1056c;
    }

    public CharSequence getTitle() {
        return this.f1077x;
    }

    public int getTitleMarginBottom() {
        return this.f1072s;
    }

    public int getTitleMarginEnd() {
        return this.f1070q;
    }

    public int getTitleMarginStart() {
        return this.f1069p;
    }

    public int getTitleMarginTop() {
        return this.f1071r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public f0 getWrapper() {
        if (this.J == null) {
            this.J = new androidx.appcompat.widget.d(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.f1073t == null) {
            this.f1073t = new t0();
        }
    }

    public final void i() {
        if (this.f1058e == null) {
            this.f1058e = new q(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1055a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1055a.getMenu();
            if (this.L == null) {
                this.L = new f();
            }
            this.f1055a.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f1063j);
            S();
        }
    }

    public final void k() {
        if (this.f1055a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1055a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1064k);
            this.f1055a.setOnMenuItemClickListener(this.I);
            this.f1055a.M(this.M, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f21294a = (this.f1067n & 112) | GravityCompat.END;
            this.f1055a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1055a, false);
        }
    }

    public final void l() {
        if (this.f1057d == null) {
            this.f1057d = new AppCompatImageButton(getContext(), null, i.a.P);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f21294a = (this.f1067n & 112) | GravityCompat.START;
            this.f1057d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // androidx.core.view.o
    public void l0(@NonNull r rVar) {
        this.G.a(rVar);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0371a ? new g((a.C0371a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0297 A[LOOP:0: B:40:0x0295->B:41:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ec A[LOOP:2: B:53:0x02ea->B:54:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int[] iArr2 = this.F;
        boolean b10 = g1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f1057d)) {
            F(this.f1057d, i10, 0, i11, 0, this.f1068o);
            i12 = this.f1057d.getMeasuredWidth() + s(this.f1057d);
            i13 = Math.max(0, this.f1057d.getMeasuredHeight() + t(this.f1057d));
            i14 = View.combineMeasuredStates(0, this.f1057d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f1061h)) {
            F(this.f1061h, i10, 0, i11, 0, this.f1068o);
            i12 = this.f1061h.getMeasuredWidth() + s(this.f1061h);
            i13 = Math.max(i13, this.f1061h.getMeasuredHeight() + t(this.f1061h));
            i14 = View.combineMeasuredStates(i14, this.f1061h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        iArr2[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f1055a)) {
            F(this.f1055a, i10, max, i11, 0, this.f1068o);
            i15 = this.f1055a.getMeasuredWidth() + s(this.f1055a);
            i13 = Math.max(i13, this.f1055a.getMeasuredHeight() + t(this.f1055a));
            i14 = View.combineMeasuredStates(i14, this.f1055a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr2[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1062i)) {
            iArr = iArr2;
            max2 += E(this.f1062i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1062i.getMeasuredHeight() + t(this.f1062i));
            i14 = View.combineMeasuredStates(i14, this.f1062i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f1058e)) {
            max2 += E(this.f1058e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1058e.getMeasuredHeight() + t(this.f1058e));
            i14 = View.combineMeasuredStates(i14, this.f1058e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                int max3 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
                i13 = max3;
            } else {
                max2 = max2;
            }
        }
        int i21 = max2;
        int i22 = this.f1071r + this.f1072s;
        int i23 = this.f1069p + this.f1070q;
        if (P(this.b)) {
            E(this.b, i10, i21 + i23, i11, i22, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + s(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + t(this.b);
            i16 = measuredWidth;
            i17 = View.combineMeasuredStates(i14, this.b.getMeasuredState());
            i18 = measuredHeight;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (P(this.f1056c)) {
            i16 = Math.max(i16, E(this.f1056c, i10, i21 + i23, i11, i22 + i18, iArr));
            i18 += this.f1056c.getMeasuredHeight() + t(this.f1056c);
            i17 = View.combineMeasuredStates(i17, this.f1056c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i21 + i16 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i18) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1055a;
        androidx.appcompat.view.menu.e L = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = savedState.f1080c;
        if (i10 != 0 && this.L != null && L != null && (findItem = L.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1081d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1073t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.L;
        if (fVar != null && (gVar = fVar.b) != null) {
            savedState.f1080c = gVar.getItemId();
        }
        savedState.f1081d = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int b10 = k.b(i10, layoutDirection) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : layoutDirection == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r8 = r(gVar.f21294a);
        if (r8 == 48) {
            return getPaddingTop() - i11;
        }
        if (r8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1076w & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            S();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(k.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.O = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 != this.f1075v) {
            this.f1075v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 != this.f1074u) {
            this.f1074u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(k.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(k.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1057d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1055a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1064k != i10) {
            this.f1064k = i10;
            if (i10 == 0) {
                this.f1063j = getContext();
            } else {
                this.f1063j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1072s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1070q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1069p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1071r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    public boolean v() {
        f fVar = this.L;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1055a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        ArrayList<MenuItem> arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MenuItem menuItem = arrayList.get(i10);
            i10++;
            getMenu().removeItem(menuItem.getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public static class g extends a.C0371a {
        public int b;

        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.b = 0;
            this.f21294a = 8388627;
        }

        public g(g gVar) {
            super((a.C0371a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(a.C0371a c0371a) {
            super(c0371a);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1076w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new p(new Runnable() { // from class: q.c1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.H = new ArrayList<>();
        this.I = new a();
        this.S = new b();
        a1 v5 = a1.v(getContext(), attributeSet, j.f19958f3, i10, 0);
        o0.k0(this, context, j.f19958f3, attributeSet, v5.r(), i10, 0);
        this.f1065l = v5.n(j.H3, 0);
        this.f1066m = v5.n(j.f20053y3, 0);
        this.f1076w = v5.l(j.f19963g3, this.f1076w);
        this.f1067n = v5.l(j.f19968h3, 48);
        int e10 = v5.e(j.B3, 0);
        e10 = v5.s(j.G3) ? v5.e(j.G3, e10) : e10;
        this.f1072s = e10;
        this.f1071r = e10;
        this.f1070q = e10;
        this.f1069p = e10;
        int e11 = v5.e(j.E3, -1);
        if (e11 >= 0) {
            this.f1069p = e11;
        }
        int e12 = v5.e(j.D3, -1);
        if (e12 >= 0) {
            this.f1070q = e12;
        }
        int e13 = v5.e(j.F3, -1);
        if (e13 >= 0) {
            this.f1071r = e13;
        }
        int e14 = v5.e(j.C3, -1);
        if (e14 >= 0) {
            this.f1072s = e14;
        }
        this.f1068o = v5.f(j.f20023s3, -1);
        int e15 = v5.e(j.f20003o3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int e16 = v5.e(j.f19983k3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int f10 = v5.f(j.f19993m3, 0);
        int f11 = v5.f(j.f19998n3, 0);
        h();
        this.f1073t.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f1073t.g(e15, e16);
        }
        this.f1074u = v5.e(j.f20008p3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.f1075v = v5.e(j.f19988l3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.f1059f = v5.g(j.f19978j3);
        this.f1060g = v5.p(j.f19973i3);
        CharSequence p8 = v5.p(j.A3);
        if (!TextUtils.isEmpty(p8)) {
            setTitle(p8);
        }
        CharSequence p10 = v5.p(j.f20048x3);
        if (!TextUtils.isEmpty(p10)) {
            setSubtitle(p10);
        }
        this.f1063j = getContext();
        setPopupTheme(v5.n(j.f20043w3, 0));
        Drawable g10 = v5.g(j.f20038v3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p11 = v5.p(j.f20033u3);
        if (!TextUtils.isEmpty(p11)) {
            setNavigationContentDescription(p11);
        }
        Drawable g11 = v5.g(j.f20013q3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p12 = v5.p(j.f20018r3);
        if (!TextUtils.isEmpty(p12)) {
            setLogoDescription(p12);
        }
        if (v5.s(j.I3)) {
            setTitleTextColor(v5.c(j.I3));
        }
        if (v5.s(j.f20058z3)) {
            setSubtitleTextColor(v5.c(j.f20058z3));
        }
        if (v5.s(j.f20028t3)) {
            x(v5.n(j.f20028t3, 0));
        }
        v5.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1061h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1061h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1061h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1059f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1058e)) {
                c(this.f1058e, true);
            }
        } else {
            ImageView imageView = this.f1058e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1058e);
                this.E.remove(this.f1058e);
            }
        }
        ImageView imageView2 = this.f1058e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1058e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1057d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f1057d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1057d)) {
                c(this.f1057d, true);
            }
        } else {
            ImageButton imageButton = this.f1057d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1057d);
                this.E.remove(this.f1057d);
            }
        }
        ImageButton imageButton2 = this.f1057d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1056c;
            if (textView != null && z(textView)) {
                removeView(this.f1056c);
                this.E.remove(this.f1056c);
            }
        } else {
            if (this.f1056c == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.f1056c = b0Var;
                b0Var.setSingleLine();
                this.f1056c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1066m;
                if (i10 != 0) {
                    this.f1056c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1056c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1056c)) {
                c(this.f1056c, true);
            }
        }
        TextView textView2 = this.f1056c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1078y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1056c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && z(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.b = b0Var;
                b0Var.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1065l;
                if (i10 != 0) {
                    this.b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1079z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!z(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1077x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1079z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f1080c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1081d;

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
            this.f1080c = parcel.readInt();
            this.f1081d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1080c);
            parcel.writeInt(this.f1081d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
