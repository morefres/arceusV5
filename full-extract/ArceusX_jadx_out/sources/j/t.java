package j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a1;
import androidx.core.view.b1;
import androidx.core.view.o0;
import androidx.core.view.y0;
import androidx.core.view.z0;
import j.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.b;
import q.f0;

/* loaded from: classes.dex */
public class t extends j.a implements ActionBarOverlayLayout.d {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public Context f21400a;
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f21401c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f21402d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f21403e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f21404f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f21405g;

    /* renamed from: h, reason: collision with root package name */
    public View f21406h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.c f21407i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21410l;

    /* renamed from: m, reason: collision with root package name */
    public d f21411m;

    /* renamed from: n, reason: collision with root package name */
    public o.b f21412n;

    /* renamed from: o, reason: collision with root package name */
    public b.a f21413o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21414p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21416r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21419u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21420v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21421w;

    /* renamed from: y, reason: collision with root package name */
    public o.h f21423y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21424z;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<Object> f21408j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public int f21409k = -1;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<a.b> f21415q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    public int f21417s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21418t = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21422x = true;
    public final z0 B = new a();
    public final z0 C = new b();
    public final b1 D = new c();

    public class a extends a1 {
        public a() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            View view2;
            t tVar = t.this;
            if (tVar.f21418t && (view2 = tVar.f21406h) != null) {
                view2.setTranslationY(0.0f);
                t.this.f21403e.setTranslationY(0.0f);
            }
            t.this.f21403e.setVisibility(8);
            t.this.f21403e.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.f21423y = null;
            tVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.f21402d;
            if (actionBarOverlayLayout != null) {
                o0.j0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends a1 {
        public b() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            t tVar = t.this;
            tVar.f21423y = null;
            tVar.f21403e.requestLayout();
        }
    }

    public class c implements b1 {
        public c() {
        }

        @Override // androidx.core.view.b1
        public void a(View view) {
            ((View) t.this.f21403e.getParent()).invalidate();
        }
    }

    public class d extends o.b implements e.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f21428c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f21429d;

        /* renamed from: e, reason: collision with root package name */
        public b.a f21430e;

        /* renamed from: f, reason: collision with root package name */
        public WeakReference<View> f21431f;

        public d(Context context, b.a aVar) {
            this.f21428c = context;
            this.f21430e = aVar;
            androidx.appcompat.view.menu.e T = new androidx.appcompat.view.menu.e(context).T(1);
            this.f21429d = T;
            T.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            b.a aVar = this.f21430e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.f21430e == null) {
                return;
            }
            k();
            t.this.f21405g.l();
        }

        @Override // o.b
        public void c() {
            t tVar = t.this;
            if (tVar.f21411m != this) {
                return;
            }
            if (t.w(tVar.f21419u, tVar.f21420v, false)) {
                this.f21430e.b(this);
            } else {
                t tVar2 = t.this;
                tVar2.f21412n = this;
                tVar2.f21413o = this.f21430e;
            }
            this.f21430e = null;
            t.this.v(false);
            t.this.f21405g.g();
            t tVar3 = t.this;
            tVar3.f21402d.setHideOnContentScrollEnabled(tVar3.A);
            t.this.f21411m = null;
        }

        @Override // o.b
        public View d() {
            WeakReference<View> weakReference = this.f21431f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.b
        public Menu e() {
            return this.f21429d;
        }

        @Override // o.b
        public MenuInflater f() {
            return new o.g(this.f21428c);
        }

        @Override // o.b
        public CharSequence g() {
            return t.this.f21405g.getSubtitle();
        }

        @Override // o.b
        public CharSequence i() {
            return t.this.f21405g.getTitle();
        }

        @Override // o.b
        public void k() {
            if (t.this.f21411m != this) {
                return;
            }
            this.f21429d.e0();
            try {
                this.f21430e.d(this, this.f21429d);
            } finally {
                this.f21429d.d0();
            }
        }

        @Override // o.b
        public boolean l() {
            return t.this.f21405g.j();
        }

        @Override // o.b
        public void m(View view) {
            t.this.f21405g.setCustomView(view);
            this.f21431f = new WeakReference<>(view);
        }

        @Override // o.b
        public void n(int i10) {
            o(t.this.f21400a.getResources().getString(i10));
        }

        @Override // o.b
        public void o(CharSequence charSequence) {
            t.this.f21405g.setSubtitle(charSequence);
        }

        @Override // o.b
        public void q(int i10) {
            r(t.this.f21400a.getResources().getString(i10));
        }

        @Override // o.b
        public void r(CharSequence charSequence) {
            t.this.f21405g.setTitle(charSequence);
        }

        @Override // o.b
        public void s(boolean z10) {
            super.s(z10);
            t.this.f21405g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f21429d.e0();
            try {
                return this.f21430e.a(this, this.f21429d);
            } finally {
                this.f21429d.d0();
            }
        }
    }

    public t(Activity activity, boolean z10) {
        this.f21401c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f21406h = decorView.findViewById(R.id.content);
    }

    public static boolean w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 A(View view) {
        if (view instanceof f0) {
            return (f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int B() {
        return this.f21404f.j();
    }

    public final void C() {
        if (this.f21421w) {
            this.f21421w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f21402d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f19881q);
        this.f21402d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f21404f = A(view.findViewById(i.f.f19866a));
        this.f21405g = (ActionBarContextView) view.findViewById(i.f.f19870f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f19867c);
        this.f21403e = actionBarContainer;
        f0 f0Var = this.f21404f;
        if (f0Var == null || this.f21405g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f21400a = f0Var.getContext();
        boolean z10 = (this.f21404f.s() & 4) != 0;
        if (z10) {
            this.f21410l = true;
        }
        o.a b10 = o.a.b(this.f21400a);
        J(b10.a() || z10);
        H(b10.g());
        TypedArray obtainStyledAttributes = this.f21400a.obtainStyledAttributes(null, i.j.f19930a, i.a.f19799c, 0);
        if (obtainStyledAttributes.getBoolean(i.j.f19979k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i.j.f19969i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int s8 = this.f21404f.s();
        if ((i11 & 4) != 0) {
            this.f21410l = true;
        }
        this.f21404f.i((i10 & i11) | ((~i11) & s8));
    }

    public void G(float f10) {
        o0.u0(this.f21403e, f10);
    }

    public final void H(boolean z10) {
        this.f21416r = z10;
        if (z10) {
            this.f21403e.setTabContainer(null);
            this.f21404f.p(this.f21407i);
        } else {
            this.f21404f.p(null);
            this.f21403e.setTabContainer(this.f21407i);
        }
        boolean z11 = B() == 2;
        androidx.appcompat.widget.c cVar = this.f21407i;
        if (cVar != null) {
            if (z11) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21402d;
                if (actionBarOverlayLayout != null) {
                    o0.j0(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f21404f.n(!this.f21416r && z11);
        this.f21402d.setHasNonEmbeddedTabs(!this.f21416r && z11);
    }

    public void I(boolean z10) {
        if (z10 && !this.f21402d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f21402d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f21404f.l(z10);
    }

    public final boolean K() {
        return this.f21403e.isLaidOut();
    }

    public final void L() {
        if (this.f21421w) {
            return;
        }
        this.f21421w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21402d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    public final void M(boolean z10) {
        if (w(this.f21419u, this.f21420v, this.f21421w)) {
            if (this.f21422x) {
                return;
            }
            this.f21422x = true;
            z(z10);
            return;
        }
        if (this.f21422x) {
            this.f21422x = false;
            y(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f21420v) {
            this.f21420v = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f21418t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f21420v) {
            return;
        }
        this.f21420v = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        o.h hVar = this.f21423y;
        if (hVar != null) {
            hVar.a();
            this.f21423y = null;
        }
    }

    @Override // j.a
    public boolean g() {
        f0 f0Var = this.f21404f;
        if (f0Var == null || !f0Var.h()) {
            return false;
        }
        this.f21404f.collapseActionView();
        return true;
    }

    @Override // j.a
    public void h(boolean z10) {
        if (z10 == this.f21414p) {
            return;
        }
        this.f21414p = z10;
        int size = this.f21415q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21415q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // j.a
    public int i() {
        return this.f21404f.s();
    }

    @Override // j.a
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f21400a.getTheme().resolveAttribute(i.a.f19803g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.b = new ContextThemeWrapper(this.f21400a, i10);
            } else {
                this.b = this.f21400a;
            }
        }
        return this.b;
    }

    @Override // j.a
    public void k() {
        if (this.f21419u) {
            return;
        }
        this.f21419u = true;
        M(false);
    }

    @Override // j.a
    public void m(Configuration configuration) {
        H(o.a.b(this.f21400a).g());
    }

    @Override // j.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f21411m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f21417s = i10;
    }

    @Override // j.a
    public void r(boolean z10) {
        if (this.f21410l) {
            return;
        }
        E(z10);
    }

    @Override // j.a
    public void s(boolean z10) {
        o.h hVar;
        this.f21424z = z10;
        if (z10 || (hVar = this.f21423y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // j.a
    public void t(CharSequence charSequence) {
        this.f21404f.setWindowTitle(charSequence);
    }

    @Override // j.a
    public o.b u(b.a aVar) {
        d dVar = this.f21411m;
        if (dVar != null) {
            dVar.c();
        }
        this.f21402d.setHideOnContentScrollEnabled(false);
        this.f21405g.k();
        d dVar2 = new d(this.f21405g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f21411m = dVar2;
        dVar2.k();
        this.f21405g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z10) {
        y0 k10;
        y0 f10;
        if (z10) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z10) {
                this.f21404f.r(4);
                this.f21405g.setVisibility(0);
                return;
            } else {
                this.f21404f.r(0);
                this.f21405g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f10 = this.f21404f.k(4, 100L);
            k10 = this.f21405g.f(0, 200L);
        } else {
            k10 = this.f21404f.k(0, 200L);
            f10 = this.f21405g.f(8, 100L);
        }
        o.h hVar = new o.h();
        hVar.d(f10, k10);
        hVar.h();
    }

    public void x() {
        b.a aVar = this.f21413o;
        if (aVar != null) {
            aVar.b(this.f21412n);
            this.f21412n = null;
            this.f21413o = null;
        }
    }

    public void y(boolean z10) {
        View view;
        o.h hVar = this.f21423y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f21417s != 0 || (!this.f21424z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f21403e.setAlpha(1.0f);
        this.f21403e.setTransitioning(true);
        o.h hVar2 = new o.h();
        float f10 = -this.f21403e.getHeight();
        if (z10) {
            this.f21403e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        y0 l10 = o0.e(this.f21403e).l(f10);
        l10.j(this.D);
        hVar2.c(l10);
        if (this.f21418t && (view = this.f21406h) != null) {
            hVar2.c(o0.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f21423y = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        o.h hVar = this.f21423y;
        if (hVar != null) {
            hVar.a();
        }
        this.f21403e.setVisibility(0);
        if (this.f21417s == 0 && (this.f21424z || z10)) {
            this.f21403e.setTranslationY(0.0f);
            float f10 = -this.f21403e.getHeight();
            if (z10) {
                this.f21403e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f21403e.setTranslationY(f10);
            o.h hVar2 = new o.h();
            y0 l10 = o0.e(this.f21403e).l(0.0f);
            l10.j(this.D);
            hVar2.c(l10);
            if (this.f21418t && (view2 = this.f21406h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(o0.e(this.f21406h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f21423y = hVar2;
            hVar2.h();
        } else {
            this.f21403e.setAlpha(1.0f);
            this.f21403e.setTranslationY(0.0f);
            if (this.f21418t && (view = this.f21406h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21402d;
        if (actionBarOverlayLayout != null) {
            o0.j0(actionBarOverlayLayout);
        }
    }

    public t(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
