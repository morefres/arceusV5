package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.c1;
import android.view.l;
import androidx.annotation.NonNull;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.o0;
import androidx.fragment.app.i;
import e4.g0;
import e4.t;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f2478a;
    public final g0 b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f2479c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2480d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f2481e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2482a;

        public a(View view) {
            this.f2482a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2482a.removeOnAttachStateChangeListener(this);
            o0.j0(this.f2482a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2483a;

        static {
            int[] iArr = new int[l.b.values().length];
            f2483a = iArr;
            try {
                iArr[l.b.f2630e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2483a[l.b.f2629d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2483a[l.b.f2628c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2483a[l.b.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull c cVar) {
        this.f2478a = fVar;
        this.b = g0Var;
        this.f2479c = cVar;
    }

    public void a() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2479c);
        }
        Bundle bundle = this.f2479c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f2479c.g1(bundle2);
        this.f2478a.a(this.f2479c, bundle2, false);
    }

    public void b() {
        c q02 = FragmentManager.q0(this.f2479c.J);
        c J = this.f2479c.J();
        if (q02 != null && !q02.equals(J)) {
            c cVar = this.f2479c;
            f4.c.l(cVar, q02, cVar.A);
        }
        int j10 = this.b.j(this.f2479c);
        c cVar2 = this.f2479c;
        cVar2.J.addView(cVar2.K, j10);
    }

    public void c() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2479c);
        }
        c cVar = this.f2479c;
        c cVar2 = cVar.f2417h;
        g gVar = null;
        if (cVar2 != null) {
            g n10 = this.b.n(cVar2.f2415f);
            if (n10 == null) {
                throw new IllegalStateException("Fragment " + this.f2479c + " declared target fragment " + this.f2479c.f2417h + " that does not belong to this FragmentManager!");
            }
            c cVar3 = this.f2479c;
            cVar3.f2418i = cVar3.f2417h.f2415f;
            cVar3.f2417h = null;
            gVar = n10;
        } else {
            String str = cVar.f2418i;
            if (str != null && (gVar = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2479c + " declared target fragment " + this.f2479c.f2418i + " that does not belong to this FragmentManager!");
            }
        }
        if (gVar != null) {
            gVar.m();
        }
        c cVar4 = this.f2479c;
        cVar4.f2432w = cVar4.f2431v.A0();
        c cVar5 = this.f2479c;
        cVar5.f2434y = cVar5.f2431v.D0();
        this.f2478a.g(this.f2479c, false);
        this.f2479c.h1();
        this.f2478a.b(this.f2479c, false);
    }

    public int d() {
        c cVar = this.f2479c;
        if (cVar.f2431v == null) {
            return cVar.f2407a;
        }
        int i10 = this.f2481e;
        int i11 = b.f2483a[cVar.U.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        c cVar2 = this.f2479c;
        if (cVar2.f2425p) {
            if (cVar2.f2426q) {
                i10 = Math.max(this.f2481e, 2);
                View view = this.f2479c.K;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2481e < 4 ? Math.min(i10, cVar2.f2407a) : Math.min(i10, 1);
            }
        }
        c cVar3 = this.f2479c;
        if (cVar3.f2427r && cVar3.J == null) {
            i10 = Math.min(i10, 4);
        }
        if (!this.f2479c.f2421l) {
            i10 = Math.min(i10, 1);
        }
        c cVar4 = this.f2479c;
        ViewGroup viewGroup = cVar4.J;
        i.d.a s8 = viewGroup != null ? i.u(viewGroup, cVar4.L()).s(this) : null;
        if (s8 == i.d.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (s8 == i.d.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            c cVar5 = this.f2479c;
            if (cVar5.f2422m) {
                i10 = cVar5.s0() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        c cVar6 = this.f2479c;
        if (cVar6.L && cVar6.f2407a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (this.f2479c.f2423n) {
            i10 = Math.max(i10, 3);
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f2479c);
        }
        return i10;
    }

    public void e() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2479c);
        }
        Bundle bundle = this.f2479c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        c cVar = this.f2479c;
        if (cVar.S) {
            cVar.f2407a = 1;
            cVar.K1();
        } else {
            this.f2478a.h(cVar, bundle2, false);
            this.f2479c.k1(bundle2);
            this.f2478a.c(this.f2479c, bundle2, false);
        }
    }

    public void f() {
        String str;
        if (this.f2479c.f2425p) {
            return;
        }
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2479c);
        }
        Bundle bundle = this.f2479c.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater q12 = this.f2479c.q1(bundle2);
        c cVar = this.f2479c;
        ViewGroup viewGroup2 = cVar.J;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = cVar.A;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2479c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) cVar.f2431v.w0().d(this.f2479c.A);
                if (viewGroup == null) {
                    c cVar2 = this.f2479c;
                    if (!cVar2.f2428s && !cVar2.f2427r) {
                        try {
                            str = cVar2.S().getResourceName(this.f2479c.A);
                        } catch (Resources.NotFoundException unused) {
                            str = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2479c.A) + " (" + str + ") for fragment " + this.f2479c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    f4.c.k(this.f2479c, viewGroup);
                }
            }
        }
        c cVar3 = this.f2479c;
        cVar3.J = viewGroup;
        cVar3.m1(q12, viewGroup, bundle2);
        if (this.f2479c.K != null) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f2479c);
            }
            this.f2479c.K.setSaveFromParentEnabled(false);
            c cVar4 = this.f2479c;
            cVar4.K.setTag(d4.b.f14378a, cVar4);
            if (viewGroup != null) {
                b();
            }
            c cVar5 = this.f2479c;
            if (cVar5.C) {
                cVar5.K.setVisibility(8);
            }
            if (this.f2479c.K.isAttachedToWindow()) {
                o0.j0(this.f2479c.K);
            } else {
                View view = this.f2479c.K;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f2479c.D1();
            f fVar = this.f2478a;
            c cVar6 = this.f2479c;
            fVar.m(cVar6, cVar6.K, bundle2, false);
            int visibility = this.f2479c.K.getVisibility();
            this.f2479c.U1(this.f2479c.K.getAlpha());
            c cVar7 = this.f2479c;
            if (cVar7.J != null && visibility == 0) {
                View findFocus = cVar7.K.findFocus();
                if (findFocus != null) {
                    this.f2479c.R1(findFocus);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2479c);
                    }
                }
                this.f2479c.K.setAlpha(0.0f);
            }
        }
        this.f2479c.f2407a = 2;
    }

    public void g() {
        c f10;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2479c);
        }
        c cVar = this.f2479c;
        boolean z10 = true;
        boolean z11 = cVar.f2422m && !cVar.s0();
        if (z11) {
            c cVar2 = this.f2479c;
            if (!cVar2.f2424o) {
                this.b.B(cVar2.f2415f, null);
            }
        }
        if (!z11 && !this.b.p().q(this.f2479c)) {
            String str = this.f2479c.f2418i;
            if (str != null && (f10 = this.b.f(str)) != null && f10.E) {
                this.f2479c.f2417h = f10;
            }
            this.f2479c.f2407a = 0;
            return;
        }
        t<?> tVar = this.f2479c.f2432w;
        if (tVar instanceof c1) {
            z10 = this.b.p().n();
        } else if (tVar.getContext() instanceof Activity) {
            z10 = true ^ ((Activity) tVar.getContext()).isChangingConfigurations();
        }
        if ((z11 && !this.f2479c.f2424o) || z10) {
            this.b.p().f(this.f2479c, false);
        }
        this.f2479c.n1();
        this.f2478a.d(this.f2479c, false);
        for (g gVar : this.b.k()) {
            if (gVar != null) {
                c k10 = gVar.k();
                if (this.f2479c.f2415f.equals(k10.f2418i)) {
                    k10.f2417h = this.f2479c;
                    k10.f2418i = null;
                }
            }
        }
        c cVar3 = this.f2479c;
        String str2 = cVar3.f2418i;
        if (str2 != null) {
            cVar3.f2417h = this.b.f(str2);
        }
        this.b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2479c);
        }
        c cVar = this.f2479c;
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null && (view = cVar.K) != null) {
            viewGroup.removeView(view);
        }
        this.f2479c.o1();
        this.f2478a.n(this.f2479c, false);
        c cVar2 = this.f2479c;
        cVar2.J = null;
        cVar2.K = null;
        cVar2.W = null;
        cVar2.X.o(null);
        this.f2479c.f2426q = false;
    }

    public void i() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2479c);
        }
        this.f2479c.p1();
        this.f2478a.e(this.f2479c, false);
        c cVar = this.f2479c;
        cVar.f2407a = -1;
        cVar.f2432w = null;
        cVar.f2434y = null;
        cVar.f2431v = null;
        if ((!cVar.f2422m || cVar.s0()) && !this.b.p().q(this.f2479c)) {
            return;
        }
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f2479c);
        }
        this.f2479c.n0();
    }

    public void j() {
        c cVar = this.f2479c;
        if (cVar.f2425p && cVar.f2426q && !cVar.f2429t) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2479c);
            }
            Bundle bundle = this.f2479c.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            c cVar2 = this.f2479c;
            cVar2.m1(cVar2.q1(bundle2), null, bundle2);
            View view = this.f2479c.K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c cVar3 = this.f2479c;
                cVar3.K.setTag(d4.b.f14378a, cVar3);
                c cVar4 = this.f2479c;
                if (cVar4.C) {
                    cVar4.K.setVisibility(8);
                }
                this.f2479c.D1();
                f fVar = this.f2478a;
                c cVar5 = this.f2479c;
                fVar.m(cVar5, cVar5.K, bundle2, false);
                this.f2479c.f2407a = 2;
            }
        }
    }

    @NonNull
    public c k() {
        return this.f2479c;
    }

    public final boolean l(@NonNull View view) {
        if (view == this.f2479c.K) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2479c.K) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2480d) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2480d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                c cVar = this.f2479c;
                int i10 = cVar.f2407a;
                if (d10 == i10) {
                    if (!z10 && i10 == -1 && cVar.f2422m && !cVar.s0() && !this.f2479c.f2424o) {
                        if (FragmentManager.N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f2479c);
                        }
                        this.b.p().f(this.f2479c, true);
                        this.b.s(this);
                        if (FragmentManager.N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f2479c);
                        }
                        this.f2479c.n0();
                    }
                    c cVar2 = this.f2479c;
                    if (cVar2.Q) {
                        if (cVar2.K != null && (viewGroup = cVar2.J) != null) {
                            i u8 = i.u(viewGroup, cVar2.L());
                            if (this.f2479c.C) {
                                u8.k(this);
                            } else {
                                u8.m(this);
                            }
                        }
                        c cVar3 = this.f2479c;
                        FragmentManager fragmentManager = cVar3.f2431v;
                        if (fragmentManager != null) {
                            fragmentManager.L0(cVar3);
                        }
                        c cVar4 = this.f2479c;
                        cVar4.Q = false;
                        cVar4.P0(cVar4.C);
                        this.f2479c.f2433x.N();
                    }
                    this.f2480d = false;
                    return;
                }
                if (d10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (cVar.f2424o && this.b.q(cVar.f2415f) == null) {
                                this.b.B(this.f2479c.f2415f, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f2479c.f2407a = 1;
                            break;
                        case 2:
                            cVar.f2426q = false;
                            cVar.f2407a = 2;
                            break;
                        case 3:
                            if (FragmentManager.N0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2479c);
                            }
                            c cVar5 = this.f2479c;
                            if (cVar5.f2424o) {
                                this.b.B(cVar5.f2415f, q());
                            } else if (cVar5.K != null && cVar5.f2410c == null) {
                                r();
                            }
                            c cVar6 = this.f2479c;
                            if (cVar6.K != null && (viewGroup2 = cVar6.J) != null) {
                                i.u(viewGroup2, cVar6.L()).l(this);
                            }
                            this.f2479c.f2407a = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            cVar.f2407a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (cVar.K != null && (viewGroup3 = cVar.J) != null) {
                                i.u(viewGroup3, cVar.L()).j(i.d.b.c(this.f2479c.K.getVisibility()), this);
                            }
                            this.f2479c.f2407a = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            cVar.f2407a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f2480d = false;
            throw th2;
        }
    }

    public void n() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2479c);
        }
        this.f2479c.v1();
        this.f2478a.f(this.f2479c, false);
    }

    public void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f2479c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f2479c.b.getBundle("savedInstanceState") == null) {
            this.f2479c.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            c cVar = this.f2479c;
            cVar.f2410c = cVar.b.getSparseParcelableArray("viewState");
            c cVar2 = this.f2479c;
            cVar2.f2412d = cVar2.b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f2479c.b.getParcelable("state");
            if (fragmentState != null) {
                c cVar3 = this.f2479c;
                cVar3.f2418i = fragmentState.f2355m;
                cVar3.f2419j = fragmentState.f2356n;
                Boolean bool = cVar3.f2414e;
                if (bool != null) {
                    cVar3.M = bool.booleanValue();
                    this.f2479c.f2414e = null;
                } else {
                    cVar3.M = fragmentState.f2357o;
                }
            }
            c cVar4 = this.f2479c;
            if (cVar4.M) {
                return;
            }
            cVar4.L = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    public void p() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2479c);
        }
        View E = this.f2479c.E();
        if (E != null && l(E)) {
            boolean requestFocus = E.requestFocus();
            if (FragmentManager.N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(E);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2479c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2479c.K.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2479c.R1(null);
        this.f2479c.z1();
        this.f2478a.i(this.f2479c, false);
        this.b.B(this.f2479c.f2415f, null);
        c cVar = this.f2479c;
        cVar.b = null;
        cVar.f2410c = null;
        cVar.f2412d = null;
    }

    @NonNull
    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        c cVar = this.f2479c;
        if (cVar.f2407a == -1 && (bundle = cVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f2479c));
        if (this.f2479c.f2407a > 0) {
            Bundle bundle3 = new Bundle();
            this.f2479c.A1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2478a.j(this.f2479c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f2479c.Z.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle p12 = this.f2479c.f2433x.p1();
            if (!p12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", p12);
            }
            if (this.f2479c.K != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f2479c.f2410c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f2479c.f2412d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f2479c.f2416g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f2479c.K == null) {
            return;
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f2479c + " with view " + this.f2479c.K);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2479c.K.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2479c.f2410c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2479c.W.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2479c.f2412d = bundle;
    }

    public void s(int i10) {
        this.f2481e = i10;
    }

    public void t() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2479c);
        }
        this.f2479c.B1();
        this.f2478a.k(this.f2479c, false);
    }

    public void u() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2479c);
        }
        this.f2479c.C1();
        this.f2478a.l(this.f2479c, false);
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull ClassLoader classLoader, @NonNull e eVar, @NonNull Bundle bundle) {
        this.f2478a = fVar;
        this.b = g0Var;
        c a10 = ((FragmentState) bundle.getParcelable("state")).a(eVar, classLoader);
        this.f2479c = a10;
        a10.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.O1(bundle2);
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull c cVar, @NonNull Bundle bundle) {
        this.f2478a = fVar;
        this.b = g0Var;
        this.f2479c = cVar;
        cVar.f2410c = null;
        cVar.f2412d = null;
        cVar.f2430u = 0;
        cVar.f2426q = false;
        cVar.f2421l = false;
        c cVar2 = cVar.f2417h;
        cVar.f2418i = cVar2 != null ? cVar2.f2415f : null;
        cVar.f2417h = null;
        cVar.b = bundle;
        cVar.f2416g = bundle.getBundle("arguments");
    }
}
