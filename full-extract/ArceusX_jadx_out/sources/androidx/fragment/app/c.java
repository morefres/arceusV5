package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.C0702e1;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.a1;
import android.view.animation.Animation;
import android.view.b1;
import android.view.c1;
import android.view.d0;
import android.view.l;
import android.view.o0;
import android.view.p;
import android.view.s;
import android.view.t0;
import android.view.u;
import androidx.annotation.NonNull;
import androidx.core.view.m;
import e4.c0;
import e4.k0;
import e4.q;
import e4.q0;
import e4.r;
import e4.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k4.CreationExtras;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks, View.OnCreateContextMenuListener, s, c1, android.view.j, d5.i, g.b {

    /* renamed from: e0, reason: collision with root package name */
    public static final Object f2406e0 = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean I;
    public ViewGroup J;
    public View K;
    public boolean L;
    public j N;
    public Handler O;
    public boolean Q;
    public LayoutInflater R;
    public boolean S;
    public String T;
    public u V;
    public k0 W;
    public a1.c Y;
    public d5.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f2408a0;
    public Bundle b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray<Parcelable> f2410c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f2412d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f2414e;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f2416g;

    /* renamed from: h, reason: collision with root package name */
    public c f2417h;

    /* renamed from: j, reason: collision with root package name */
    public int f2419j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2421l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2422m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2423n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2424o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2425p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2426q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2427r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2428s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2429t;

    /* renamed from: u, reason: collision with root package name */
    public int f2430u;

    /* renamed from: v, reason: collision with root package name */
    public FragmentManager f2431v;

    /* renamed from: w, reason: collision with root package name */
    public t<?> f2432w;

    /* renamed from: y, reason: collision with root package name */
    public c f2434y;

    /* renamed from: z, reason: collision with root package name */
    public int f2435z;

    /* renamed from: a, reason: collision with root package name */
    public int f2407a = -1;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public String f2415f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public String f2418i = null;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f2420k = null;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public FragmentManager f2433x = new c0();
    public boolean H = true;
    public boolean M = true;
    public Runnable P = new b();
    public l.b U = l.b.f2630e;
    public d0<s> X = new d0<>();

    /* renamed from: b0, reason: collision with root package name */
    public final AtomicInteger f2409b0 = new AtomicInteger();

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList<l> f2411c0 = new ArrayList<>();

    /* renamed from: d0, reason: collision with root package name */
    public final l f2413d0 = new C0038c();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends g.c<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2436a;
        public final /* synthetic */ h.a b;

        public a(AtomicReference atomicReference, h.a aVar) {
            this.f2436a = atomicReference;
            this.b = aVar;
        }

        @Override // g.c
        @NonNull
        public h.a<I, ?> a() {
            return this.b;
        }

        @Override // g.c
        public void c(I i10, k2.c cVar) {
            g.c cVar2 = (g.c) this.f2436a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.c(i10, cVar);
        }

        @Override // g.c
        public void d() {
            g.c cVar = (g.c) this.f2436a.getAndSet(null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a2();
        }
    }

    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class C0038c extends l {
        public C0038c() {
            super(null);
        }

        @Override // androidx.fragment.app.c.l
        public void a() {
            c.this.Z.c();
            o0.c(c.this);
            Bundle bundle = c.this.b;
            c.this.Z.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j(false);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.i f2441a;

        public e(androidx.fragment.app.i iVar) {
            this.f2441a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2441a.y()) {
                this.f2441a.n();
            }
        }
    }

    public class f extends r {
        public f() {
        }

        @Override // e4.r
        public View d(int i10) {
            View view = c.this.K;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + c.this + " does not have a view");
        }

        @Override // e4.r
        public boolean e() {
            return c.this.K != null;
        }
    }

    public class g implements p {
        public g() {
        }

        @Override // android.view.p
        public void f(@NonNull s sVar, @NonNull l.a aVar) {
            View view;
            if (aVar != l.a.ON_STOP || (view = c.this.K) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements t.a<Void, g.f> {
        public h() {
        }

        @Override // t.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.f apply(Void r32) {
            c cVar = c.this;
            Object obj = cVar.f2432w;
            return obj instanceof g.g ? ((g.g) obj).getActivityResultRegistry() : cVar.H1().getActivityResultRegistry();
        }
    }

    public class i extends l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f2445a;
        public final /* synthetic */ AtomicReference b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h.a f2446c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g.a f2447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(t.a aVar, AtomicReference atomicReference, h.a aVar2, g.a aVar3) {
            super(null);
            this.f2445a = aVar;
            this.b = atomicReference;
            this.f2446c = aVar2;
            this.f2447d = aVar3;
        }

        @Override // androidx.fragment.app.c.l
        public void a() {
            String o8 = c.this.o();
            this.b.set(((g.f) this.f2445a.apply(null)).n(o8, c.this, this.f2446c, this.f2447d));
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public View f2449a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public int f2450c;

        /* renamed from: d, reason: collision with root package name */
        public int f2451d;

        /* renamed from: e, reason: collision with root package name */
        public int f2452e;

        /* renamed from: f, reason: collision with root package name */
        public int f2453f;

        /* renamed from: g, reason: collision with root package name */
        public int f2454g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList<String> f2455h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList<String> f2456i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2457j = null;

        /* renamed from: k, reason: collision with root package name */
        public Object f2458k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2459l;

        /* renamed from: m, reason: collision with root package name */
        public Object f2460m;

        /* renamed from: n, reason: collision with root package name */
        public Object f2461n;

        /* renamed from: o, reason: collision with root package name */
        public Object f2462o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f2463p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f2464q;

        /* renamed from: r, reason: collision with root package name */
        public k2.u f2465r;

        /* renamed from: s, reason: collision with root package name */
        public k2.u f2466s;

        /* renamed from: t, reason: collision with root package name */
        public float f2467t;

        /* renamed from: u, reason: collision with root package name */
        public View f2468u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f2469v;

        public j() {
            Object obj = c.f2406e0;
            this.f2458k = obj;
            this.f2459l = null;
            this.f2460m = obj;
            this.f2461n = null;
            this.f2462o = obj;
            this.f2465r = null;
            this.f2466s = null;
            this.f2467t = 1.0f;
            this.f2468u = null;
        }
    }

    public static class k extends RuntimeException {
        public k(@NonNull String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class l {
        public l() {
        }

        public abstract void a();

        public /* synthetic */ l(b bVar) {
            this();
        }
    }

    public c() {
        m0();
    }

    public static /* synthetic */ void i(c cVar) {
        cVar.W.e(cVar.f2412d);
        cVar.f2412d = null;
    }

    @NonNull
    @Deprecated
    public static c o0(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            c newInstance = androidx.fragment.app.e.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return newInstance;
            }
            bundle.setClassLoader(newInstance.getClass().getClassLoader());
            newInstance.O1(bundle);
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public k2.u A() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2465r;
    }

    @Deprecated
    public void A0(int i10, int i11, Intent intent) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void A1(Bundle bundle) {
        b1(bundle);
    }

    public int B() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2451d;
    }

    @Deprecated
    public void B0(@NonNull Activity activity) {
        this.I = true;
    }

    public void B1() {
        this.f2433x.X0();
        this.f2433x.f0(true);
        this.f2407a = 5;
        this.I = false;
        c1();
        if (!this.I) {
            throw new q0("Fragment " + this + " did not call through to super.onStart()");
        }
        u uVar = this.V;
        l.a aVar = l.a.ON_START;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f2433x.W();
    }

    public Object C() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2459l;
    }

    public void C0(@NonNull Context context) {
        this.I = true;
        t<?> tVar = this.f2432w;
        Activity activity = tVar == null ? null : tVar.getActivity();
        if (activity != null) {
            this.I = false;
            B0(activity);
        }
    }

    public void C1() {
        this.f2433x.Y();
        if (this.K != null) {
            this.W.b(l.a.ON_STOP);
        }
        this.V.j(l.a.ON_STOP);
        this.f2407a = 4;
        this.I = false;
        d1();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onStop()");
    }

    public k2.u D() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2466s;
    }

    @Deprecated
    public void D0(@NonNull c cVar) {
    }

    public void D1() {
        Bundle bundle = this.b;
        e1(this.K, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f2433x.Z();
    }

    public View E() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2468u;
    }

    public boolean E0(@NonNull MenuItem menuItem) {
        return false;
    }

    public void E1() {
        m().f2469v = true;
    }

    public final Object F() {
        t<?> tVar = this.f2432w;
        if (tVar == null) {
            return null;
        }
        return tVar.l();
    }

    public void F0(Bundle bundle) {
        this.I = true;
        K1();
        if (this.f2433x.T0(1)) {
            return;
        }
        this.f2433x.G();
    }

    @NonNull
    public final <I, O> g.c<I> F1(@NonNull h.a<I, O> aVar, @NonNull t.a<Void, g.f> aVar2, @NonNull g.a<O> aVar3) {
        if (this.f2407a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            G1(new i(aVar2, atomicReference, aVar, aVar3));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @NonNull
    @Deprecated
    public LayoutInflater G(Bundle bundle) {
        t<?> tVar = this.f2432w;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater m10 = tVar.m();
        m.a(m10, this.f2433x.B0());
        return m10;
    }

    public Animation G0(int i10, boolean z10, int i11) {
        return null;
    }

    public final void G1(@NonNull l lVar) {
        if (this.f2407a >= 0) {
            lVar.a();
        } else {
            this.f2411c0.add(lVar);
        }
    }

    public final int H() {
        l.b bVar = this.U;
        return (bVar == l.b.b || this.f2434y == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f2434y.H());
    }

    public Animator H0(int i10, boolean z10, int i11) {
        return null;
    }

    @NonNull
    public final q H1() {
        q p8 = p();
        if (p8 != null) {
            return p8;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public int I() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2454g;
    }

    @Deprecated
    public void I0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @NonNull
    public final Context I1() {
        Context w5 = w();
        if (w5 != null) {
            return w5;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final c J() {
        return this.f2434y;
    }

    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2408a0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @NonNull
    public final View J1() {
        View j02 = j0();
        if (j02 != null) {
            return j02;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void K0() {
        this.I = true;
    }

    public void K1() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f2433x.n1(bundle);
        this.f2433x.G();
    }

    @NonNull
    public final FragmentManager L() {
        FragmentManager fragmentManager = this.f2431v;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public void L0() {
    }

    public final void L1() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.K != null) {
            Bundle bundle = this.b;
            M1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.b = null;
    }

    public boolean M() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.b;
    }

    public void M0() {
        this.I = true;
    }

    public final void M1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2410c;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f2410c = null;
        }
        this.I = false;
        f1(bundle);
        if (this.I) {
            if (this.K != null) {
                this.W.b(l.a.ON_CREATE);
            }
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public int N() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2452e;
    }

    public void N0() {
        this.I = true;
    }

    public void N1(int i10, int i11, int i12, int i13) {
        if (this.N == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().f2450c = i10;
        m().f2451d = i11;
        m().f2452e = i12;
        m().f2453f = i13;
    }

    public int O() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2453f;
    }

    @NonNull
    public LayoutInflater O0(Bundle bundle) {
        return G(bundle);
    }

    public void O1(Bundle bundle) {
        if (this.f2431v != null && w0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2416g = bundle;
    }

    public void P0(boolean z10) {
    }

    public void P1(Object obj) {
        m().f2457j = obj;
    }

    public float Q() {
        j jVar = this.N;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f2467t;
    }

    @Deprecated
    public void Q0(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    public void Q1(Object obj) {
        m().f2459l = obj;
    }

    public Object R() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2460m;
        return obj == f2406e0 ? C() : obj;
    }

    public void R0(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        t<?> tVar = this.f2432w;
        Activity activity = tVar == null ? null : tVar.getActivity();
        if (activity != null) {
            this.I = false;
            Q0(activity, attributeSet, bundle);
        }
    }

    public void R1(View view) {
        m().f2468u = view;
    }

    @NonNull
    public final Resources S() {
        return I1().getResources();
    }

    public void S0(boolean z10) {
    }

    public void S1(int i10) {
        if (this.N == null && i10 == 0) {
            return;
        }
        m();
        this.N.f2454g = i10;
    }

    @Deprecated
    public boolean T0(@NonNull MenuItem menuItem) {
        return false;
    }

    public void T1(boolean z10) {
        if (this.N == null) {
            return;
        }
        m().b = z10;
    }

    @Deprecated
    public final boolean U() {
        f4.c.h(this);
        return this.E;
    }

    @Deprecated
    public void U0(@NonNull Menu menu) {
    }

    public void U1(float f10) {
        m().f2467t = f10;
    }

    public void V0() {
        this.I = true;
    }

    @Deprecated
    public void V1(boolean z10) {
        f4.c.j(this);
        this.E = z10;
        FragmentManager fragmentManager = this.f2431v;
        if (fragmentManager == null) {
            this.F = true;
        } else if (z10) {
            fragmentManager.n(this);
        } else {
            fragmentManager.l1(this);
        }
    }

    @Override // android.view.j
    @NonNull
    public a1.c W() {
        Application application;
        if (this.f2431v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.Y == null) {
            Context applicationContext = I1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.N0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.Y = new t0(application, this, t());
        }
        return this.Y;
    }

    public void W0(boolean z10) {
    }

    public void W1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m();
        j jVar = this.N;
        jVar.f2455h = arrayList;
        jVar.f2456i = arrayList2;
    }

    public Object X() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2458k;
        return obj == f2406e0 ? y() : obj;
    }

    @Deprecated
    public void X0(@NonNull Menu menu) {
    }

    public void X1(@NonNull Intent intent) {
        Y1(intent, null);
    }

    @Override // android.view.j
    @NonNull
    public CreationExtras Y() {
        Application application;
        Context applicationContext = I1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k4.b bVar = new k4.b();
        if (application != null) {
            bVar.c(a1.a.f2563h, application);
        }
        bVar.c(o0.f2645a, this);
        bVar.c(o0.b, this);
        if (t() != null) {
            bVar.c(o0.f2646c, t());
        }
        return bVar;
    }

    public void Y0(boolean z10) {
    }

    public void Y1(@NonNull Intent intent, Bundle bundle) {
        t<?> tVar = this.f2432w;
        if (tVar != null) {
            tVar.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object Z() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2461n;
    }

    @Deprecated
    public void Z0(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Deprecated
    public void Z1(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.f2432w != null) {
            L().V0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // android.view.s
    @NonNull
    public android.view.l a() {
        return this.V;
    }

    public void a1() {
        this.I = true;
    }

    public void a2() {
        if (this.N == null || !m().f2469v) {
            return;
        }
        if (this.f2432w == null) {
            m().f2469v = false;
        } else if (Looper.myLooper() != this.f2432w.getHandler().getLooper()) {
            this.f2432w.getHandler().postAtFrontOfQueue(new d());
        } else {
            j(true);
        }
    }

    public Object b0() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2462o;
        return obj == f2406e0 ? Z() : obj;
    }

    public void b1(@NonNull Bundle bundle) {
    }

    @NonNull
    public ArrayList<String> c0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f2455h) == null) ? new ArrayList<>() : arrayList;
    }

    public void c1() {
        this.I = true;
    }

    @NonNull
    public ArrayList<String> d0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f2456i) == null) ? new ArrayList<>() : arrayList;
    }

    public void d1() {
        this.I = true;
    }

    @NonNull
    public final String e0(int i10) {
        return S().getString(i10);
    }

    public void e1(@NonNull View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f1(Bundle bundle) {
        this.I = true;
    }

    @NonNull
    public final String g0(int i10, Object... objArr) {
        return S().getString(i10, objArr);
    }

    public void g1(Bundle bundle) {
        this.f2433x.X0();
        this.f2407a = 3;
        this.I = false;
        z0(bundle);
        if (this.I) {
            L1();
            this.f2433x.C();
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    @Override // g.b
    @NonNull
    public final <I, O> g.c<I> h(@NonNull h.a<I, O> aVar, @NonNull g.a<O> aVar2) {
        return F1(aVar, new h(), aVar2);
    }

    public final String h0() {
        return this.B;
    }

    public void h1() {
        ArrayList<l> arrayList = this.f2411c0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            lVar.a();
        }
        this.f2411c0.clear();
        this.f2433x.p(this.f2432w, k(), this);
        this.f2407a = 0;
        this.I = false;
        C0(this.f2432w.getContext());
        if (this.I) {
            this.f2431v.M(this);
            this.f2433x.D();
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final c i0(boolean z10) {
        String str;
        if (z10) {
            f4.c.i(this);
        }
        c cVar = this.f2417h;
        if (cVar != null) {
            return cVar;
        }
        FragmentManager fragmentManager = this.f2431v;
        if (fragmentManager == null || (str = this.f2418i) == null) {
            return null;
        }
        return fragmentManager.k0(str);
    }

    public void i1(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void j(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.N;
        if (jVar != null) {
            jVar.f2469v = false;
        }
        if (this.K == null || (viewGroup = this.J) == null || (fragmentManager = this.f2431v) == null) {
            return;
        }
        androidx.fragment.app.i u8 = androidx.fragment.app.i.u(viewGroup, fragmentManager);
        u8.z();
        if (z10) {
            this.f2432w.getHandler().post(new e(u8));
        } else {
            u8.n();
        }
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacks(this.P);
            this.O = null;
        }
    }

    public View j0() {
        return this.K;
    }

    public boolean j1(@NonNull MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (E0(menuItem)) {
            return true;
        }
        return this.f2433x.F(menuItem);
    }

    @NonNull
    public r k() {
        return new f();
    }

    @NonNull
    public s k0() {
        k0 k0Var = this.W;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void k1(Bundle bundle) {
        this.f2433x.X0();
        this.f2407a = 1;
        this.I = false;
        this.V.a(new g());
        F0(bundle);
        this.S = true;
        if (this.I) {
            this.V.j(l.a.ON_CREATE);
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void l(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2435z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2407a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2415f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2430u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2421l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2422m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2425p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2426q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.f2431v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2431v);
        }
        if (this.f2432w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2432w);
        }
        if (this.f2434y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2434y);
        }
        if (this.f2416g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2416g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.f2410c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2410c);
        }
        if (this.f2412d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2412d);
        }
        c i02 = i0(false);
        if (i02 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(i02);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2419j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(M());
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(x());
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(B());
        }
        if (N() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(N());
        }
        if (O() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(O());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(s());
        }
        if (w() != null) {
            m4.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2433x + ":");
        this.f2433x.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public a0<s> l0() {
        return this.X;
    }

    public boolean l1(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            I0(menu, menuInflater);
            z10 = true;
        }
        return this.f2433x.H(menu, menuInflater) | z10;
    }

    public final j m() {
        if (this.N == null) {
            this.N = new j();
        }
        return this.N;
    }

    public final void m0() {
        this.V = new u(this);
        this.Z = d5.h.a(this);
        this.Y = null;
        if (this.f2411c0.contains(this.f2413d0)) {
            return;
        }
        G1(this.f2413d0);
    }

    public void m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2433x.X0();
        this.f2429t = true;
        this.W = new k0(this, v(), new Runnable() { // from class: e4.l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.c.i(androidx.fragment.app.c.this);
            }
        });
        View J0 = J0(layoutInflater, viewGroup, bundle);
        this.K = J0;
        if (J0 == null) {
            if (this.W.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.W = null;
            return;
        }
        this.W.c();
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.K + " for Fragment " + this);
        }
        android.view.View.b(this.K, this.W);
        C0702e1.a(this.K, this.W);
        d5.m.b(this.K, this.W);
        this.X.o(this.W);
    }

    public c n(@NonNull String str) {
        return str.equals(this.f2415f) ? this : this.f2433x.o0(str);
    }

    public void n0() {
        m0();
        this.T = this.f2415f;
        this.f2415f = UUID.randomUUID().toString();
        this.f2421l = false;
        this.f2422m = false;
        this.f2425p = false;
        this.f2426q = false;
        this.f2428s = false;
        this.f2430u = 0;
        this.f2431v = null;
        this.f2433x = new c0();
        this.f2432w = null;
        this.f2435z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    public void n1() {
        this.f2433x.I();
        this.V.j(l.a.ON_DESTROY);
        this.f2407a = 0;
        this.I = false;
        this.S = false;
        K0();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @NonNull
    public String o() {
        return "fragment_" + this.f2415f + "_rq#" + this.f2409b0.getAndIncrement();
    }

    public void o1() {
        this.f2433x.J();
        if (this.K != null && this.W.a().getState().b(l.b.f2628c)) {
            this.W.b(l.a.ON_DESTROY);
        }
        this.f2407a = 1;
        this.I = false;
        M0();
        if (this.I) {
            m4.a.b(this).d();
            this.f2429t = false;
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        H1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.I = true;
    }

    public final q p() {
        t<?> tVar = this.f2432w;
        if (tVar == null) {
            return null;
        }
        return (q) tVar.getActivity();
    }

    public final boolean p0() {
        return this.f2432w != null && this.f2421l;
    }

    public void p1() {
        this.f2407a = -1;
        this.I = false;
        N0();
        this.R = null;
        if (this.I) {
            if (this.f2433x.M0()) {
                return;
            }
            this.f2433x.I();
            this.f2433x = new c0();
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public boolean q() {
        Boolean bool;
        j jVar = this.N;
        if (jVar == null || (bool = jVar.f2464q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @NonNull
    public LayoutInflater q1(Bundle bundle) {
        LayoutInflater O0 = O0(bundle);
        this.R = O0;
        return O0;
    }

    public boolean r() {
        Boolean bool;
        j jVar = this.N;
        if (jVar == null || (bool = jVar.f2463p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean r0() {
        if (this.C) {
            return true;
        }
        FragmentManager fragmentManager = this.f2431v;
        return fragmentManager != null && fragmentManager.Q0(this.f2434y);
    }

    public void r1() {
        onLowMemory();
    }

    public View s() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2449a;
    }

    public final boolean s0() {
        return this.f2430u > 0;
    }

    public void s1(boolean z10) {
        S0(z10);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        Z1(intent, i10, null);
    }

    public final Bundle t() {
        return this.f2416g;
    }

    public final boolean t0() {
        if (!this.H) {
            return false;
        }
        FragmentManager fragmentManager = this.f2431v;
        return fragmentManager == null || fragmentManager.R0(this.f2434y);
    }

    public boolean t1(@NonNull MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (this.G && this.H && T0(menuItem)) {
            return true;
        }
        return this.f2433x.O(menuItem);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2415f);
        if (this.f2435z != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2435z));
        }
        if (this.B != null) {
            sb2.append(" tag=");
            sb2.append(this.B);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public final FragmentManager u() {
        if (this.f2432w != null) {
            return this.f2433x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public boolean u0() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.f2469v;
    }

    public void u1(@NonNull Menu menu) {
        if (this.C) {
            return;
        }
        if (this.G && this.H) {
            U0(menu);
        }
        this.f2433x.P(menu);
    }

    @Override // android.view.c1
    @NonNull
    public b1 v() {
        if (this.f2431v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (H() != l.b.b.ordinal()) {
            return this.f2431v.I0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean v0() {
        return this.f2422m;
    }

    public void v1() {
        this.f2433x.R();
        if (this.K != null) {
            this.W.b(l.a.ON_PAUSE);
        }
        this.V.j(l.a.ON_PAUSE);
        this.f2407a = 6;
        this.I = false;
        V0();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onPause()");
    }

    public Context w() {
        t<?> tVar = this.f2432w;
        if (tVar == null) {
            return null;
        }
        return tVar.getContext();
    }

    public final boolean w0() {
        FragmentManager fragmentManager = this.f2431v;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.U0();
    }

    public void w1(boolean z10) {
        W0(z10);
    }

    public int x() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2450c;
    }

    public final boolean x0() {
        View view;
        return (!p0() || r0() || (view = this.K) == null || view.getWindowToken() == null || this.K.getVisibility() != 0) ? false : true;
    }

    public boolean x1(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            X0(menu);
            z10 = true;
        }
        return this.f2433x.T(menu) | z10;
    }

    public Object y() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2457j;
    }

    public void y0() {
        this.f2433x.X0();
    }

    public void y1() {
        boolean S0 = this.f2431v.S0(this);
        Boolean bool = this.f2420k;
        if (bool == null || bool.booleanValue() != S0) {
            this.f2420k = Boolean.valueOf(S0);
            Y0(S0);
            this.f2433x.U();
        }
    }

    @Override // d5.i
    @NonNull
    public final d5.f z() {
        return this.Z.getSavedStateRegistry();
    }

    @Deprecated
    public void z0(Bundle bundle) {
        this.I = true;
    }

    public void z1() {
        this.f2433x.X0();
        this.f2433x.f0(true);
        this.f2407a = 7;
        this.I = false;
        a1();
        if (!this.I) {
            throw new q0("Fragment " + this + " did not call through to super.onResume()");
        }
        u uVar = this.V;
        l.a aVar = l.a.ON_RESUME;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f2433x.V();
    }
}
