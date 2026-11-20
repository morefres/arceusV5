package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.b1;
import android.view.c1;
import android.view.l;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import d5.f;
import e.BackEventCompat;
import e.m0;
import e.p0;
import e.r0;
import e4.d0;
import e4.e0;
import e4.f0;
import e4.g0;
import e4.r;
import e4.t;
import e4.v;
import f4.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k2.s;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean U = false;
    public static boolean V = true;
    public androidx.fragment.app.c A;
    public g.c<Intent> F;
    public g.c<IntentSenderRequest> G;
    public g.c<String[]> H;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ArrayList<androidx.fragment.app.a> O;
    public ArrayList<Boolean> P;
    public ArrayList<androidx.fragment.app.c> Q;
    public d0 R;
    public c.C0306c S;
    public boolean b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.c> f2298e;

    /* renamed from: g, reason: collision with root package name */
    public p0 f2300g;

    /* renamed from: x, reason: collision with root package name */
    public t<?> f2317x;

    /* renamed from: y, reason: collision with root package name */
    public r f2318y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.fragment.app.c f2319z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<o> f2295a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final g0 f2296c = new g0();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f2297d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final v f2299f = new v(this);

    /* renamed from: h, reason: collision with root package name */
    public androidx.fragment.app.a f2301h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2302i = false;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f2303j = new b(false);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2304k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, BackStackState> f2305l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f2306m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map<String, m> f2307n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<n> f2308o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public final androidx.fragment.app.f f2309p = new androidx.fragment.app.f(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<e0> f2310q = new CopyOnWriteArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    public final x2.a<Configuration> f2311r = new x2.a() { // from class: e4.w
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.f(FragmentManager.this, (Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final x2.a<Integer> f2312s = new x2.a() { // from class: e4.x
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.a(FragmentManager.this, (Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final x2.a<k2.h> f2313t = new x2.a() { // from class: e4.y
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.e(FragmentManager.this, (k2.h) obj);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final x2.a<s> f2314u = new x2.a() { // from class: e4.z
        @Override // x2.a
        public final void accept(Object obj) {
            FragmentManager.d(FragmentManager.this, (k2.s) obj);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final androidx.core.view.r f2315v = new c();

    /* renamed from: w, reason: collision with root package name */
    public int f2316w = -1;
    public androidx.fragment.app.e B = null;
    public androidx.fragment.app.e C = new d();
    public e4.p0 D = null;
    public e4.p0 E = new e();
    public ArrayDeque<LaunchedFragmentInfo> I = new ArrayDeque<>();
    public Runnable T = new f();

    public class a implements g.a<Map<String, Boolean>> {
        public a() {
        }

        @Override // g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.I.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f2320a;
            int i11 = pollFirst.b;
            androidx.fragment.app.c i12 = FragmentManager.this.f2296c.i(str);
            if (i12 != null) {
                i12.Z0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends m0 {
        public b(boolean z10) {
            super(z10);
        }

        @Override // e.m0
        public void handleOnBackCancelled() {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.s();
            }
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.J0();
        }

        @Override // e.m0
        public void handleOnBackProgressed(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f2301h != null) {
                int i10 = 0;
                Iterator<androidx.fragment.app.i> it = fragmentManager.z(new ArrayList<>(Collections.singletonList(FragmentManager.this.f2301h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(backEventCompat);
                }
                ArrayList<n> arrayList = FragmentManager.this.f2308o;
                int size = arrayList.size();
                while (i10 < size) {
                    n nVar = arrayList.get(i10);
                    i10++;
                    nVar.b(backEventCompat);
                }
            }
        }

        @Override // e.m0
        public void handleOnBackStarted(@NonNull BackEventCompat backEventCompat) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.c0();
                FragmentManager.this.i1();
            }
        }
    }

    public class c implements androidx.core.view.r {
        public c() {
        }

        @Override // androidx.core.view.r
        public void a(@NonNull Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // androidx.core.view.r
        public void b(@NonNull Menu menu) {
            FragmentManager.this.T(menu);
        }

        @Override // androidx.core.view.r
        public boolean c(@NonNull MenuItem menuItem) {
            return FragmentManager.this.O(menuItem);
        }

        @Override // androidx.core.view.r
        public void d(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.H(menu, menuInflater);
        }
    }

    public class d extends androidx.fragment.app.e {
        public d() {
        }

        @Override // androidx.fragment.app.e
        @NonNull
        public androidx.fragment.app.c a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.A0().c(FragmentManager.this.A0().getContext(), str, null);
        }
    }

    public class e implements e4.p0 {
        public e() {
        }

        @Override // e4.p0
        @NonNull
        public androidx.fragment.app.i a(@NonNull ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.f0(true);
        }
    }

    public class g implements android.view.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2325a;
        public final /* synthetic */ f0 b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ android.view.l f2326c;

        public g(String str, f0 f0Var, android.view.l lVar) {
            this.f2325a = str;
            this.b = f0Var;
            this.f2326c = lVar;
        }

        @Override // android.view.p
        public void f(@NonNull android.view.s sVar, @NonNull l.a aVar) {
            Bundle bundle;
            if (aVar == l.a.ON_START && (bundle = (Bundle) FragmentManager.this.f2306m.get(this.f2325a)) != null) {
                this.b.a(this.f2325a, bundle);
                FragmentManager.this.x(this.f2325a);
            }
            if (aVar == l.a.ON_DESTROY) {
                this.f2326c.d(this);
                FragmentManager.this.f2307n.remove(this.f2325a);
            }
        }
    }

    public class h implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f2328a;

        public h(androidx.fragment.app.c cVar) {
            this.f2328a = cVar;
        }

        @Override // e4.e0
        public void b(@NonNull FragmentManager fragmentManager, @NonNull androidx.fragment.app.c cVar) {
            this.f2328a.D0(cVar);
        }
    }

    public class i implements g.a<ActivityResult> {
        public i() {
        }

        @Override // g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollLast = FragmentManager.this.I.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.f2320a;
            int i10 = pollLast.b;
            androidx.fragment.app.c i11 = FragmentManager.this.f2296c.i(str);
            if (i11 != null) {
                i11.A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class j implements g.a<ActivityResult> {
        public j() {
        }

        @Override // g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.I.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2320a;
            int i10 = pollFirst.b;
            androidx.fragment.app.c i11 = FragmentManager.this.f2296c.i(str);
            if (i11 != null) {
                i11.A0(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends h.a<IntentSenderRequest, ActivityResult> {
        @Override // h.a
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.a
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class l {
    }

    public static class m implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final android.view.l f2331a;
        public final f0 b;

        /* renamed from: c, reason: collision with root package name */
        public final android.view.p f2332c;

        public m(@NonNull android.view.l lVar, @NonNull f0 f0Var, @NonNull android.view.p pVar) {
            this.f2331a = lVar;
            this.b = f0Var;
            this.f2332c = pVar;
        }

        @Override // e4.f0
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(l.b bVar) {
            return this.f2331a.getState().b(bVar);
        }

        public void c() {
            this.f2331a.d(this.f2332c);
        }
    }

    public interface n {
        default void a(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        }

        default void b(@NonNull BackEventCompat backEventCompat) {
        }

        default void c(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    public interface o {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class p implements o {

        /* renamed from: a, reason: collision with root package name */
        public final String f2333a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2334c;

        public p(String str, int i10, int i11) {
            this.f2333a = str;
            this.b = i10;
            this.f2334c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.c cVar = FragmentManager.this.A;
            if (cVar == null || this.b >= 0 || this.f2333a != null || !cVar.u().d1()) {
                return FragmentManager.this.g1(arrayList, arrayList2, this.f2333a, this.b, this.f2334c);
            }
            return false;
        }
    }

    public class q implements o {
        public q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean h12 = FragmentManager.this.h1(arrayList, arrayList2);
            if (!FragmentManager.this.f2308o.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    androidx.fragment.app.a aVar = arrayList.get(i11);
                    i11++;
                    linkedHashSet.addAll(FragmentManager.this.s0(aVar));
                }
                ArrayList<n> arrayList3 = FragmentManager.this.f2308o;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    n nVar = arrayList3.get(i10);
                    i10++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.c((androidx.fragment.app.c) it.next(), booleanValue);
                    }
                }
            }
            return h12;
        }
    }

    public static androidx.fragment.app.c H0(@NonNull View view) {
        Object tag = view.getTag(d4.b.f14378a);
        if (tag instanceof androidx.fragment.app.c) {
            return (androidx.fragment.app.c) tag;
        }
        return null;
    }

    public static boolean N0(int i10) {
        return U || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.P0() && num.intValue() == 80) {
            fragmentManager.K(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        ArrayList<n> arrayList = fragmentManager.f2308o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            n nVar = arrayList.get(i10);
            i10++;
            nVar.d();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, s sVar) {
        if (fragmentManager.P0()) {
            fragmentManager.S(sVar.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, k2.h hVar) {
        if (fragmentManager.P0()) {
            fragmentManager.L(hVar.getIsInMultiWindowMode(), false);
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.P0()) {
            fragmentManager.E(configuration, false);
        }
    }

    public static void h0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.u(-1);
                aVar.A();
            } else {
                aVar.u(1);
                aVar.z();
            }
            i10++;
        }
    }

    public static int o1(int i10) {
        if (i10 == 4097) {
            return InputDeviceCompat.SOURCE_MOUSE;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    @NonNull
    public static FragmentManager p0(@NonNull View view) {
        e4.q qVar;
        androidx.fragment.app.c q02 = q0(view);
        if (q02 != null) {
            if (q02.p0()) {
                return q02.u();
            }
            throw new IllegalStateException("The Fragment " + q02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                qVar = null;
                break;
            }
            if (context instanceof e4.q) {
                qVar = (e4.q) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (qVar != null) {
            return qVar.l1();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static androidx.fragment.app.c q0(@NonNull View view) {
        while (view != null) {
            androidx.fragment.app.c H0 = H0(view);
            if (H0 != null) {
                return H0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @NonNull
    public androidx.fragment.app.g A(@NonNull androidx.fragment.app.c cVar) {
        androidx.fragment.app.g n10 = this.f2296c.n(cVar.f2415f);
        if (n10 != null) {
            return n10;
        }
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(this.f2309p, this.f2296c, cVar);
        gVar.o(this.f2317x.getContext().getClassLoader());
        gVar.s(this.f2316w);
        return gVar;
    }

    @NonNull
    public t<?> A0() {
        return this.f2317x;
    }

    public final void A1() {
        synchronized (this.f2295a) {
            try {
                if (!this.f2295a.isEmpty()) {
                    this.f2303j.setEnabled(true);
                    if (N0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = u0() > 0 && S0(this.f2319z);
                if (N0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f2303j.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "detach: " + cVar);
        }
        if (cVar.D) {
            return;
        }
        cVar.D = true;
        if (cVar.f2421l) {
            if (N0(2)) {
                Log.v("FragmentManager", "remove from detach: " + cVar);
            }
            this.f2296c.u(cVar);
            if (O0(cVar)) {
                this.J = true;
            }
            w1(cVar);
        }
    }

    @NonNull
    public LayoutInflater.Factory2 B0() {
        return this.f2299f;
    }

    public void C() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(4);
    }

    @NonNull
    public androidx.fragment.app.f C0() {
        return this.f2309p;
    }

    public void D() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(0);
    }

    public androidx.fragment.app.c D0() {
        return this.f2319z;
    }

    public void E(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f2317x instanceof l2.e)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.i1(configuration);
                if (z10) {
                    cVar.f2433x.E(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.c E0() {
        return this.A;
    }

    public boolean F(@NonNull MenuItem menuItem) {
        if (this.f2316w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null && cVar.j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public e4.p0 F0() {
        e4.p0 p0Var = this.D;
        if (p0Var != null) {
            return p0Var;
        }
        androidx.fragment.app.c cVar = this.f2319z;
        return cVar != null ? cVar.f2431v.F0() : this.E;
    }

    public void G() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(1);
    }

    public c.C0306c G0() {
        return this.S;
    }

    public boolean H(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f2316w < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.c> arrayList = null;
        boolean z10 = false;
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null && R0(cVar) && cVar.l1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(cVar);
                z10 = true;
            }
        }
        if (this.f2298e != null) {
            for (int i10 = 0; i10 < this.f2298e.size(); i10++) {
                androidx.fragment.app.c cVar2 = this.f2298e.get(i10);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.L0();
                }
            }
        }
        this.f2298e = arrayList;
        return z10;
    }

    public void I() {
        this.M = true;
        f0(true);
        c0();
        w();
        X(-1);
        Object obj = this.f2317x;
        if (obj instanceof l2.f) {
            ((l2.f) obj).j(this.f2312s);
        }
        Object obj2 = this.f2317x;
        if (obj2 instanceof l2.e) {
            ((l2.e) obj2).p0(this.f2311r);
        }
        Object obj3 = this.f2317x;
        if (obj3 instanceof k2.o) {
            ((k2.o) obj3).x(this.f2313t);
        }
        Object obj4 = this.f2317x;
        if (obj4 instanceof k2.p) {
            ((k2.p) obj4).h0(this.f2314u);
        }
        Object obj5 = this.f2317x;
        if ((obj5 instanceof androidx.core.view.o) && this.f2319z == null) {
            ((androidx.core.view.o) obj5).Q(this.f2315v);
        }
        this.f2317x = null;
        this.f2318y = null;
        this.f2319z = null;
        if (this.f2300g != null) {
            this.f2303j.remove();
            this.f2300g = null;
        }
        g.c<Intent> cVar = this.F;
        if (cVar != null) {
            cVar.d();
            this.G.d();
            this.H.d();
        }
    }

    @NonNull
    public b1 I0(@NonNull androidx.fragment.app.c cVar) {
        return this.R.m(cVar);
    }

    public void J() {
        X(1);
    }

    public void J0() {
        this.f2302i = true;
        f0(true);
        int i10 = 0;
        this.f2302i = false;
        if (!V || this.f2301h == null) {
            if (this.f2303j.getIsEnabled()) {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                d1();
                return;
            } else {
                if (N0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f2300g.i();
                return;
            }
        }
        if (!this.f2308o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s0(this.f2301h));
            ArrayList<n> arrayList = this.f2308o;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                n nVar = arrayList.get(i11);
                i11++;
                n nVar2 = nVar;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    nVar2.a((androidx.fragment.app.c) it.next(), true);
                }
            }
        }
        ArrayList<h.a> arrayList2 = this.f2301h.f2485c;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            h.a aVar = arrayList2.get(i12);
            i12++;
            androidx.fragment.app.c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2423n = false;
            }
        }
        Iterator<androidx.fragment.app.i> it2 = z(new ArrayList<>(Collections.singletonList(this.f2301h)), 0, 1).iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        ArrayList<h.a> arrayList3 = this.f2301h.f2485c;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            h.a aVar2 = arrayList3.get(i10);
            i10++;
            androidx.fragment.app.c cVar2 = aVar2.b;
            if (cVar2 != null && cVar2.J == null) {
                A(cVar2).m();
            }
        }
        this.f2301h = null;
        A1();
        if (N0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f2303j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    public void K(boolean z10) {
        if (z10 && (this.f2317x instanceof l2.f)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.r1();
                if (z10) {
                    cVar.f2433x.K(true);
                }
            }
        }
    }

    public void K0(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "hide: " + cVar);
        }
        if (cVar.C) {
            return;
        }
        cVar.C = true;
        cVar.Q = true ^ cVar.Q;
        w1(cVar);
    }

    public void L(boolean z10, boolean z11) {
        if (z11 && (this.f2317x instanceof k2.o)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.s1(z10);
                if (z11) {
                    cVar.f2433x.L(z10, true);
                }
            }
        }
    }

    public void L0(@NonNull androidx.fragment.app.c cVar) {
        if (cVar.f2421l && O0(cVar)) {
            this.J = true;
        }
    }

    public void M(@NonNull androidx.fragment.app.c cVar) {
        Iterator<e0> it = this.f2310q.iterator();
        while (it.hasNext()) {
            it.next().b(this, cVar);
        }
    }

    public boolean M0() {
        return this.M;
    }

    public void N() {
        for (androidx.fragment.app.c cVar : this.f2296c.l()) {
            if (cVar != null) {
                cVar.P0(cVar.r0());
                cVar.f2433x.N();
            }
        }
    }

    public boolean O(@NonNull MenuItem menuItem) {
        if (this.f2316w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null && cVar.t1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean O0(@NonNull androidx.fragment.app.c cVar) {
        return (cVar.G && cVar.H) || cVar.f2433x.t();
    }

    public void P(@NonNull Menu menu) {
        if (this.f2316w < 1) {
            return;
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.u1(menu);
            }
        }
    }

    public final boolean P0() {
        androidx.fragment.app.c cVar = this.f2319z;
        if (cVar == null) {
            return true;
        }
        return cVar.p0() && this.f2319z.L().P0();
    }

    public final void Q(androidx.fragment.app.c cVar) {
        if (cVar == null || !cVar.equals(k0(cVar.f2415f))) {
            return;
        }
        cVar.y1();
    }

    public boolean Q0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return false;
        }
        return cVar.r0();
    }

    public void R() {
        X(5);
    }

    public boolean R0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        return cVar.t0();
    }

    public void S(boolean z10, boolean z11) {
        if (z11 && (this.f2317x instanceof k2.p)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.w1(z10);
                if (z11) {
                    cVar.f2433x.S(z10, true);
                }
            }
        }
    }

    public boolean S0(androidx.fragment.app.c cVar) {
        if (cVar == null) {
            return true;
        }
        FragmentManager fragmentManager = cVar.f2431v;
        return cVar.equals(fragmentManager.E0()) && S0(fragmentManager.f2319z);
    }

    public boolean T(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f2316w < 1) {
            return false;
        }
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null && R0(cVar) && cVar.x1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean T0(int i10) {
        return this.f2316w >= i10;
    }

    public void U() {
        A1();
        Q(this.A);
    }

    public boolean U0() {
        return this.K || this.L;
    }

    public void V() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(7);
    }

    public void V0(@NonNull androidx.fragment.app.c cVar, @NonNull Intent intent, int i10, Bundle bundle) {
        if (this.F == null) {
            this.f2317x.n(cVar, intent, i10, bundle);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(cVar.f2415f, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.b(intent);
    }

    public void W() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        X(5);
    }

    public void W0(int i10, boolean z10) {
        t<?> tVar;
        if (this.f2317x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2316w) {
            this.f2316w = i10;
            this.f2296c.t();
            y1();
            if (this.J && (tVar = this.f2317x) != null && this.f2316w == 7) {
                tVar.o();
                this.J = false;
            }
        }
    }

    public final void X(int i10) {
        try {
            this.b = true;
            this.f2296c.d(i10);
            W0(i10, false);
            Iterator<androidx.fragment.app.i> it = y().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.b = false;
            f0(true);
        } catch (Throwable th2) {
            this.b = false;
            throw th2;
        }
    }

    public void X0() {
        if (this.f2317x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.p(false);
        for (androidx.fragment.app.c cVar : this.f2296c.o()) {
            if (cVar != null) {
                cVar.y0();
            }
        }
    }

    public void Y() {
        this.L = true;
        this.R.p(true);
        X(4);
    }

    public final void Y0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.g gVar : this.f2296c.k()) {
            androidx.fragment.app.c k10 = gVar.k();
            if (k10.A == fragmentContainerView.getId() && (view = k10.K) != null && view.getParent() == null) {
                k10.J = fragmentContainerView;
                gVar.b();
                gVar.m();
            }
        }
    }

    public void Z() {
        X(2);
    }

    public void Z0(@NonNull androidx.fragment.app.g gVar) {
        androidx.fragment.app.c k10 = gVar.k();
        if (k10.L) {
            if (this.b) {
                this.N = true;
            } else {
                k10.L = false;
                gVar.m();
            }
        }
    }

    public final void a0() {
        if (this.N) {
            this.N = false;
            y1();
        }
    }

    public void a1() {
        d0(new p(null, -1, 0), false);
    }

    public void b0(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f2296c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<androidx.fragment.app.c> arrayList = this.f2298e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.c cVar = this.f2298e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
            }
        }
        int size2 = this.f2297d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.fragment.app.a aVar = this.f2297d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2304k.get());
        synchronized (this.f2295a) {
            try {
                int size3 = this.f2295a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        o oVar = this.f2295a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(oVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2317x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2318y);
        if (this.f2319z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2319z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2316w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    public void b1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            d0(new p(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void c0() {
        Iterator<androidx.fragment.app.i> it = y().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public void c1(String str, int i10) {
        d0(new p(str, -1, i10), false);
    }

    public void d0(@NonNull o oVar, boolean z10) {
        if (!z10) {
            if (this.f2317x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f2295a) {
            try {
                if (this.f2317x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2295a.add(oVar);
                    q1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d1() {
        return f1(null, -1, 0);
    }

    public final void e0(boolean z10) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2317x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2317x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            u();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    public boolean e1(int i10, int i11) {
        if (i10 >= 0) {
            return f1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean f0(boolean z10) {
        androidx.fragment.app.a aVar;
        e0(z10);
        boolean z11 = false;
        if (!this.f2302i && (aVar = this.f2301h) != null) {
            aVar.f2359u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2301h + " as part of execPendingActions for actions " + this.f2295a);
            }
            this.f2301h.w(false, false);
            this.f2295a.add(0, this.f2301h);
            ArrayList<h.a> arrayList = this.f2301h.f2485c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                h.a aVar2 = arrayList.get(i10);
                i10++;
                androidx.fragment.app.c cVar = aVar2.b;
                if (cVar != null) {
                    cVar.f2423n = false;
                }
            }
            this.f2301h = null;
        }
        while (t0(this.O, this.P)) {
            z11 = true;
            this.b = true;
            try {
                k1(this.O, this.P);
            } finally {
                v();
            }
        }
        A1();
        a0();
        this.f2296c.b();
        return z11;
    }

    public final boolean f1(String str, int i10, int i11) {
        f0(false);
        e0(true);
        androidx.fragment.app.c cVar = this.A;
        if (cVar != null && i10 < 0 && str == null && cVar.u().d1()) {
            return true;
        }
        boolean g12 = g1(this.O, this.P, str, i10, i11);
        if (g12) {
            this.b = true;
            try {
                k1(this.O, this.P);
            } finally {
                v();
            }
        }
        A1();
        a0();
        this.f2296c.b();
        return g12;
    }

    public void g0(@NonNull o oVar, boolean z10) {
        if (z10 && (this.f2317x == null || this.M)) {
            return;
        }
        e0(z10);
        androidx.fragment.app.a aVar = this.f2301h;
        boolean z11 = false;
        if (aVar != null) {
            aVar.f2359u = false;
            aVar.v();
            if (N0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2301h + " as part of execSingleAction for action " + oVar);
            }
            this.f2301h.w(false, false);
            boolean a10 = this.f2301h.a(this.O, this.P);
            ArrayList<h.a> arrayList = this.f2301h.f2485c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                h.a aVar2 = arrayList.get(i10);
                i10++;
                androidx.fragment.app.c cVar = aVar2.b;
                if (cVar != null) {
                    cVar.f2423n = false;
                }
            }
            this.f2301h = null;
            z11 = a10;
        }
        boolean a11 = oVar.a(this.O, this.P);
        if (z11 || a11) {
            this.b = true;
            try {
                k1(this.O, this.P);
            } finally {
                v();
            }
        }
        A1();
        a0();
        this.f2296c.b();
    }

    public boolean g1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int l02 = l0(str, i10, (i11 & 1) != 0);
        if (l02 < 0) {
            return false;
        }
        for (int size = this.f2297d.size() - 1; size >= l02; size--) {
            arrayList.add(this.f2297d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean h1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (N0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f2295a);
        }
        int i10 = 0;
        if (this.f2297d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2297d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f2301h = aVar;
        ArrayList<h.a> arrayList4 = aVar.f2485c;
        int size = arrayList4.size();
        while (i10 < size) {
            h.a aVar2 = arrayList4.get(i10);
            i10++;
            androidx.fragment.app.c cVar = aVar2.b;
            if (cVar != null) {
                cVar.f2423n = true;
            }
        }
        return g1(arrayList, arrayList2, null, -1, 0);
    }

    public final void i0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f2500r;
        ArrayList<androidx.fragment.app.c> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f2296c.o());
        androidx.fragment.app.c E0 = E0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            E0 = !arrayList2.get(i12).booleanValue() ? aVar.B(this.Q, E0) : aVar.E(this.Q, E0);
            z11 = z11 || aVar.f2491i;
        }
        this.Q.clear();
        if (!z10 && this.f2316w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<h.a> arrayList4 = arrayList.get(i13).f2485c;
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    h.a aVar2 = arrayList4.get(i14);
                    i14++;
                    androidx.fragment.app.c cVar = aVar2.b;
                    if (cVar != null && cVar.f2431v != null) {
                        this.f2296c.r(A(cVar));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f2308o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                androidx.fragment.app.a aVar3 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(s0(aVar3));
            }
            if (this.f2301h == null) {
                ArrayList<n> arrayList5 = this.f2308o;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    n nVar = arrayList5.get(i16);
                    i16++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.c((androidx.fragment.app.c) it.next(), booleanValue);
                    }
                }
                ArrayList<n> arrayList6 = this.f2308o;
                int size4 = arrayList6.size();
                int i17 = 0;
                while (i17 < size4) {
                    n nVar3 = arrayList6.get(i17);
                    i17++;
                    n nVar4 = nVar3;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        nVar4.a((androidx.fragment.app.c) it2.next(), booleanValue);
                    }
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            androidx.fragment.app.a aVar4 = arrayList.get(i18);
            if (booleanValue) {
                for (int size5 = aVar4.f2485c.size() - 1; size5 >= 0; size5--) {
                    androidx.fragment.app.c cVar2 = aVar4.f2485c.get(size5).b;
                    if (cVar2 != null) {
                        A(cVar2).m();
                    }
                }
            } else {
                ArrayList<h.a> arrayList7 = aVar4.f2485c;
                int size6 = arrayList7.size();
                int i19 = 0;
                while (i19 < size6) {
                    h.a aVar5 = arrayList7.get(i19);
                    i19++;
                    androidx.fragment.app.c cVar3 = aVar5.b;
                    if (cVar3 != null) {
                        A(cVar3).m();
                    }
                }
            }
        }
        W0(this.f2316w, true);
        for (androidx.fragment.app.i iVar : z(arrayList, i10, i11)) {
            iVar.D(booleanValue);
            iVar.z();
            iVar.n();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar6 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar6.f2360v >= 0) {
                aVar6.f2360v = -1;
            }
            aVar6.D();
            i10++;
        }
        if (z11) {
            m1();
        }
    }

    public void i1() {
        d0(new q(), false);
    }

    public boolean j0() {
        boolean f02 = f0(true);
        r0();
        return f02;
    }

    public void j1(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "remove: " + cVar + " nesting=" + cVar.f2430u);
        }
        boolean s02 = cVar.s0();
        if (cVar.D && s02) {
            return;
        }
        this.f2296c.u(cVar);
        if (O0(cVar)) {
            this.J = true;
        }
        cVar.f2422m = true;
        w1(cVar);
    }

    public void k(androidx.fragment.app.a aVar) {
        this.f2297d.add(aVar);
    }

    public androidx.fragment.app.c k0(@NonNull String str) {
        return this.f2296c.f(str);
    }

    public final void k1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2500r) {
                if (i11 != i10) {
                    i0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2500r) {
                        i11++;
                    }
                }
                i0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            i0(arrayList, arrayList2, i11, size);
        }
    }

    public androidx.fragment.app.g l(@NonNull androidx.fragment.app.c cVar) {
        String str = cVar.T;
        if (str != null) {
            f4.c.f(cVar, str);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "add: " + cVar);
        }
        androidx.fragment.app.g A = A(cVar);
        cVar.f2431v = this;
        this.f2296c.r(A);
        if (!cVar.D) {
            this.f2296c.a(cVar);
            cVar.f2422m = false;
            if (cVar.K == null) {
                cVar.Q = false;
            }
            if (O0(cVar)) {
                this.J = true;
            }
        }
        return A;
    }

    public final int l0(String str, int i10, boolean z10) {
        if (this.f2297d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f2297d.size() - 1;
        }
        int size = this.f2297d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f2297d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f2360v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f2297d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f2297d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f2360v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void l1(@NonNull androidx.fragment.app.c cVar) {
        this.R.o(cVar);
    }

    public void m(@NonNull e0 e0Var) {
        this.f2310q.add(e0Var);
    }

    public androidx.fragment.app.c m0(int i10) {
        return this.f2296c.g(i10);
    }

    public final void m1() {
        for (int i10 = 0; i10 < this.f2308o.size(); i10++) {
            this.f2308o.get(i10).onBackStackChanged();
        }
    }

    public void n(@NonNull androidx.fragment.app.c cVar) {
        this.R.e(cVar);
    }

    public androidx.fragment.app.c n0(String str) {
        return this.f2296c.h(str);
    }

    public void n1(Parcelable parcelable) {
        androidx.fragment.app.g gVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2317x.getContext().getClassLoader());
                this.f2306m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> hashMap = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2317x.getContext().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f2296c.x(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f2296c.v();
        ArrayList<String> arrayList = fragmentManagerState.f2337a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = arrayList.get(i10);
            i10++;
            Bundle B = this.f2296c.B(str3, null);
            if (B != null) {
                androidx.fragment.app.c i11 = this.R.i(((FragmentState) B.getParcelable("state")).b);
                if (i11 != null) {
                    if (N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + i11);
                    }
                    gVar = new androidx.fragment.app.g(this.f2309p, this.f2296c, i11, B);
                } else {
                    gVar = new androidx.fragment.app.g(this.f2309p, this.f2296c, this.f2317x.getContext().getClassLoader(), y0(), B);
                }
                androidx.fragment.app.c k10 = gVar.k();
                k10.b = B;
                k10.f2431v = this;
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.f2415f + "): " + k10);
                }
                gVar.o(this.f2317x.getContext().getClassLoader());
                this.f2296c.r(gVar);
                gVar.s(this.f2316w);
            }
        }
        for (androidx.fragment.app.c cVar : this.R.l()) {
            if (!this.f2296c.c(cVar.f2415f)) {
                if (N0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + cVar + " that was not found in the set of active Fragments " + fragmentManagerState.f2337a);
                }
                this.R.o(cVar);
                cVar.f2431v = this;
                androidx.fragment.app.g gVar2 = new androidx.fragment.app.g(this.f2309p, this.f2296c, cVar);
                gVar2.s(1);
                gVar2.m();
                cVar.f2422m = true;
                gVar2.m();
            }
        }
        this.f2296c.w(fragmentManagerState.b);
        if (fragmentManagerState.f2338c != null) {
            this.f2297d = new ArrayList<>(fragmentManagerState.f2338c.length);
            int i12 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f2338c;
                if (i12 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a f10 = backStackRecordStateArr[i12].f(this);
                if (N0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i12 + " (index " + f10.f2360v + "): " + f10);
                    PrintWriter printWriter = new PrintWriter(new e4.m0("FragmentManager"));
                    f10.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2297d.add(f10);
                i12++;
            }
        } else {
            this.f2297d = new ArrayList<>();
        }
        this.f2304k.set(fragmentManagerState.f2339d);
        String str4 = fragmentManagerState.f2340e;
        if (str4 != null) {
            androidx.fragment.app.c k02 = k0(str4);
            this.A = k02;
            Q(k02);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f2341f;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                this.f2305l.put(arrayList2.get(i13), fragmentManagerState.f2342g.get(i13));
            }
        }
        this.I = new ArrayDeque<>(fragmentManagerState.f2343h);
    }

    public int o() {
        return this.f2304k.getAndIncrement();
    }

    public androidx.fragment.app.c o0(@NonNull String str) {
        return this.f2296c.i(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(@NonNull t<?> tVar, @NonNull r rVar, androidx.fragment.app.c cVar) {
        String str;
        if (this.f2317x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2317x = tVar;
        this.f2318y = rVar;
        this.f2319z = cVar;
        if (cVar != null) {
            m(new h(cVar));
        } else if (tVar instanceof e0) {
            m((e0) tVar);
        }
        if (this.f2319z != null) {
            A1();
        }
        if (tVar instanceof r0) {
            r0 r0Var = (r0) tVar;
            p0 P = r0Var.P();
            this.f2300g = P;
            android.view.s sVar = r0Var;
            if (cVar != null) {
                sVar = cVar;
            }
            P.d(sVar, this.f2303j);
        }
        if (cVar != null) {
            this.R = cVar.f2431v.v0(cVar);
        } else if (tVar instanceof c1) {
            this.R = d0.k(((c1) tVar).v());
        } else {
            this.R = new d0(false);
        }
        this.R.p(U0());
        this.f2296c.A(this.R);
        Object obj = this.f2317x;
        if ((obj instanceof d5.i) && cVar == null) {
            d5.f z10 = ((d5.i) obj).z();
            z10.c("android:support:fragments", new f.b() { // from class: e4.a0
                @Override // d5.f.b
                public final Bundle a() {
                    Bundle p12;
                    p12 = FragmentManager.this.p1();
                    return p12;
                }
            });
            Bundle a10 = z10.a("android:support:fragments");
            if (a10 != null) {
                n1(a10);
            }
        }
        Object obj2 = this.f2317x;
        if (obj2 instanceof g.g) {
            g.f activityResultRegistry = ((g.g) obj2).getActivityResultRegistry();
            if (cVar != null) {
                str = cVar.f2415f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = activityResultRegistry.o(str2 + "StartActivityForResult", new h.i(), new i());
            this.G = activityResultRegistry.o(str2 + "StartIntentSenderForResult", new k(), new j());
            this.H = activityResultRegistry.o(str2 + "RequestPermissions", new h.g(), new a());
        }
        Object obj3 = this.f2317x;
        if (obj3 instanceof l2.e) {
            ((l2.e) obj3).g0(this.f2311r);
        }
        Object obj4 = this.f2317x;
        if (obj4 instanceof l2.f) {
            ((l2.f) obj4).d0(this.f2312s);
        }
        Object obj5 = this.f2317x;
        if (obj5 instanceof k2.o) {
            ((k2.o) obj5).e0(this.f2313t);
        }
        Object obj6 = this.f2317x;
        if (obj6 instanceof k2.p) {
            ((k2.p) obj6).y(this.f2314u);
        }
        Object obj7 = this.f2317x;
        if ((obj7 instanceof androidx.core.view.o) && cVar == null) {
            ((androidx.core.view.o) obj7).l0(this.f2315v);
        }
    }

    @NonNull
    public Bundle p1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        r0();
        c0();
        f0(true);
        this.K = true;
        this.R.p(true);
        ArrayList<String> y10 = this.f2296c.y();
        HashMap<String, Bundle> m10 = this.f2296c.m();
        if (!m10.isEmpty()) {
            ArrayList<String> z10 = this.f2296c.z();
            int size = this.f2297d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f2297d.get(i10));
                    if (N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2297d.get(i10));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f2337a = y10;
            fragmentManagerState.b = z10;
            fragmentManagerState.f2338c = backStackRecordStateArr;
            fragmentManagerState.f2339d = this.f2304k.get();
            androidx.fragment.app.c cVar = this.A;
            if (cVar != null) {
                fragmentManagerState.f2340e = cVar.f2415f;
            }
            fragmentManagerState.f2341f.addAll(this.f2305l.keySet());
            fragmentManagerState.f2342g.addAll(this.f2305l.values());
            fragmentManagerState.f2343h = new ArrayList<>(this.I);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f2306m.keySet()) {
                bundle.putBundle("result_" + str, this.f2306m.get(str));
            }
            for (String str2 : m10.keySet()) {
                bundle.putBundle("fragment_" + str2, m10.get(str2));
            }
        } else if (N0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void q(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "attach: " + cVar);
        }
        if (cVar.D) {
            cVar.D = false;
            if (cVar.f2421l) {
                return;
            }
            this.f2296c.a(cVar);
            if (N0(2)) {
                Log.v("FragmentManager", "add from attach: " + cVar);
            }
            if (O0(cVar)) {
                this.J = true;
            }
        }
    }

    public void q1() {
        synchronized (this.f2295a) {
            try {
                if (this.f2295a.size() == 1) {
                    this.f2317x.getHandler().removeCallbacks(this.T);
                    this.f2317x.getHandler().post(this.T);
                    A1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public androidx.fragment.app.h r() {
        return new androidx.fragment.app.a(this);
    }

    public final void r0() {
        Iterator<androidx.fragment.app.i> it = y().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public void r1(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        ViewGroup x02 = x0(cVar);
        if (x02 == null || !(x02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) x02).setDrawDisappearingViewsLast(!z10);
    }

    public void s() {
        if (N0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f2301h);
        }
        androidx.fragment.app.a aVar = this.f2301h;
        if (aVar != null) {
            aVar.f2359u = false;
            aVar.v();
            this.f2301h.p(true, new Runnable() { // from class: e4.b0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(FragmentManager.this);
                }
            });
            this.f2301h.g();
            this.f2302i = true;
            j0();
            this.f2302i = false;
            this.f2301h = null;
        }
    }

    public Set<androidx.fragment.app.c> s0(@NonNull androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f2485c.size(); i10++) {
            androidx.fragment.app.c cVar = aVar.f2485c.get(i10).b;
            if (cVar != null && aVar.f2491i) {
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public final void s1(@NonNull String str, @NonNull Bundle bundle) {
        m mVar = this.f2307n.get(str);
        if (mVar == null || !mVar.b(l.b.f2629d)) {
            this.f2306m.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public boolean t() {
        boolean z10 = false;
        for (androidx.fragment.app.c cVar : this.f2296c.l()) {
            if (cVar != null) {
                z10 = O0(cVar);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f2295a) {
            if (this.f2295a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f2295a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.f2295a.get(i10).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f2295a.clear();
                this.f2317x.getHandler().removeCallbacks(this.T);
            }
        }
    }

    public final void t1(@NonNull String str, @NonNull android.view.s sVar, @NonNull f0 f0Var) {
        android.view.l a10 = sVar.a();
        if (a10.getState() == l.b.f2627a) {
            return;
        }
        g gVar = new g(str, f0Var, a10);
        m put = this.f2307n.put(str, new m(a10, f0Var, gVar));
        if (put != null) {
            put.c();
        }
        if (N0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + a10 + " and listener " + f0Var);
        }
        a10.a(gVar);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.fragment.app.c cVar = this.f2319z;
        if (cVar != null) {
            sb2.append(cVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2319z)));
            sb2.append("}");
        } else {
            t<?> tVar = this.f2317x;
            if (tVar != null) {
                sb2.append(tVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2317x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (U0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public int u0() {
        return this.f2297d.size() + (this.f2301h != null ? 1 : 0);
    }

    public void u1(@NonNull androidx.fragment.app.c cVar, @NonNull l.b bVar) {
        if (cVar.equals(k0(cVar.f2415f)) && (cVar.f2432w == null || cVar.f2431v == this)) {
            cVar.U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void v() {
        this.b = false;
        this.P.clear();
        this.O.clear();
    }

    @NonNull
    public final d0 v0(@NonNull androidx.fragment.app.c cVar) {
        return this.R.j(cVar);
    }

    public void v1(androidx.fragment.app.c cVar) {
        if (cVar == null || (cVar.equals(k0(cVar.f2415f)) && (cVar.f2432w == null || cVar.f2431v == this))) {
            androidx.fragment.app.c cVar2 = this.A;
            this.A = cVar;
            Q(cVar2);
            Q(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void w() {
        t<?> tVar = this.f2317x;
        if (tVar instanceof c1 ? this.f2296c.p().n() : tVar.getContext() instanceof Activity ? !((Activity) this.f2317x.getContext()).isChangingConfigurations() : true) {
            Iterator<BackStackState> it = this.f2305l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f2290a.iterator();
                while (it2.hasNext()) {
                    this.f2296c.p().g(it2.next(), false);
                }
            }
        }
    }

    @NonNull
    public r w0() {
        return this.f2318y;
    }

    public final void w1(@NonNull androidx.fragment.app.c cVar) {
        ViewGroup x02 = x0(cVar);
        if (x02 == null || cVar.x() + cVar.B() + cVar.N() + cVar.O() <= 0) {
            return;
        }
        if (x02.getTag(d4.b.f14379c) == null) {
            x02.setTag(d4.b.f14379c, cVar);
        }
        ((androidx.fragment.app.c) x02.getTag(d4.b.f14379c)).T1(cVar.M());
    }

    public final void x(@NonNull String str) {
        this.f2306m.remove(str);
        if (N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final ViewGroup x0(@NonNull androidx.fragment.app.c cVar) {
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cVar.A > 0 && this.f2318y.e()) {
            View d10 = this.f2318y.d(cVar.A);
            if (d10 instanceof ViewGroup) {
                return (ViewGroup) d10;
            }
        }
        return null;
    }

    public void x1(@NonNull androidx.fragment.app.c cVar) {
        if (N0(2)) {
            Log.v("FragmentManager", "show: " + cVar);
        }
        if (cVar.C) {
            cVar.C = false;
            cVar.Q = !cVar.Q;
        }
    }

    public final Set<androidx.fragment.app.i> y() {
        HashSet hashSet = new HashSet();
        Iterator<androidx.fragment.app.g> it = this.f2296c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().J;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.i.v(viewGroup, F0()));
            }
        }
        return hashSet;
    }

    @NonNull
    public androidx.fragment.app.e y0() {
        androidx.fragment.app.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        androidx.fragment.app.c cVar = this.f2319z;
        return cVar != null ? cVar.f2431v.y0() : this.C;
    }

    public final void y1() {
        Iterator<androidx.fragment.app.g> it = this.f2296c.k().iterator();
        while (it.hasNext()) {
            Z0(it.next());
        }
    }

    public Set<androidx.fragment.app.i> z(@NonNull ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<h.a> arrayList2 = arrayList.get(i10).f2485c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                h.a aVar = arrayList2.get(i12);
                i12++;
                androidx.fragment.app.c cVar = aVar.b;
                if (cVar != null && (viewGroup = cVar.J) != null) {
                    hashSet.add(androidx.fragment.app.i.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @NonNull
    public List<androidx.fragment.app.c> z0() {
        return this.f2296c.o();
    }

    public final void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e4.m0("FragmentManager"));
        t<?> tVar = this.f2317x;
        if (tVar != null) {
            try {
                tVar.k("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            b0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f2320a;
        public int b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.f2320a = str;
            this.b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2320a);
            parcel.writeInt(this.b);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f2320a = parcel.readString();
            this.b = parcel.readInt();
        }
    }
}
