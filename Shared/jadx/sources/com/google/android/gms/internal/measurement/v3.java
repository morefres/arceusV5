package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: j, reason: collision with root package name */
    public static volatile v3 f6888j;

    /* renamed from: a, reason: collision with root package name */
    public final String f6889a = "FA";
    public final u9.e b = u9.h.c();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f6890c;

    /* renamed from: d, reason: collision with root package name */
    public final AppMeasurementSdk f6891d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6892e;

    /* renamed from: f, reason: collision with root package name */
    public int f6893f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6894g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6895h;

    /* renamed from: i, reason: collision with root package name */
    public volatile u1 f6896i;

    public v3(Context context, Bundle bundle) {
        p1.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b3(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6890c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6891d = new AppMeasurementSdk(this);
        this.f6892e = new ArrayList();
        try {
            if (nb.ab.a(context, "google_app_id", nb.y6.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, v3.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f6895h = null;
                    this.f6894g = true;
                    Log.w(this.f6889a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f6895h = "fa";
        i(new o2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f6889a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new u3(this));
        }
    }

    public static v3 r(Context context, Bundle bundle) {
        n9.m.l(context);
        if (f6888j == null) {
            synchronized (v3.class) {
                try {
                    if (f6888j == null) {
                        f6888j = new v3(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f6888j;
    }

    public final void A(Bundle bundle) {
        i(new k2(this, bundle));
    }

    public final void B(String str, String str2, Bundle bundle) {
        i(new l2(this, str, str2, bundle));
    }

    public final List C(String str, String str2) {
        r1 r1Var = new r1();
        i(new m2(this, str, str2, r1Var));
        List list = (List) r1.v2(r1Var.u2(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void D(zzdf zzdfVar, String str, String str2) {
        i(new n2(this, zzdfVar, str, str2));
    }

    public final void E(String str) {
        i(new p2(this, str));
    }

    public final void F(String str) {
        i(new q2(this, str));
    }

    public final void G(Runnable runnable) {
        i(new s2(this, runnable));
    }

    public final String H() {
        r1 r1Var = new r1();
        i(new t2(this, r1Var));
        return r1Var.s2(500L);
    }

    public final String I() {
        r1 r1Var = new r1();
        i(new u2(this, r1Var));
        return r1Var.s2(50L);
    }

    public final long J() {
        r1 r1Var = new r1();
        i(new v2(this, r1Var));
        Long t22 = r1Var.t2(500L);
        if (t22 != null) {
            return t22.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i10 = this.f6893f + 1;
        this.f6893f = i10;
        return nextLong + i10;
    }

    public final String a() {
        r1 r1Var = new r1();
        i(new w2(this, r1Var));
        return r1Var.s2(500L);
    }

    public final String b() {
        r1 r1Var = new r1();
        i(new y2(this, r1Var));
        return r1Var.s2(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        r1 r1Var = new r1();
        i(new z2(this, str, str2, z10, r1Var));
        Bundle u22 = r1Var.u2(5000L);
        if (u22 == null || u22.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(u22.size());
        for (String str3 : u22.keySet()) {
            Object obj = u22.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        i(new a3(this, false, 5, str, obj, null, null));
    }

    public final Bundle e(Bundle bundle, boolean z10) {
        r1 r1Var = new r1();
        i(new c3(this, bundle, r1Var));
        if (z10) {
            return r1Var.u2(5000L);
        }
        return null;
    }

    public final int f(String str) {
        r1 r1Var = new r1();
        i(new d3(this, str, r1Var));
        Integer num = (Integer) r1.v2(r1Var.u2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String g() {
        return this.f6895h;
    }

    public final void h(boolean z10) {
        i(new e3(this, z10));
    }

    public final /* synthetic */ String k() {
        return this.f6889a;
    }

    public final /* synthetic */ boolean l() {
        return this.f6894g;
    }

    public final /* synthetic */ u1 m() {
        return this.f6896i;
    }

    public final /* synthetic */ void n(u1 u1Var) {
        this.f6896i = u1Var;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i(j3 j3Var) {
        this.f6890c.execute(j3Var);
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(Exception exc, boolean z10, boolean z11) {
        v3 v3Var;
        Exception exc2;
        this.f6894g |= z10;
        if (z10) {
            Log.w(this.f6889a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            v3Var = this;
            exc2 = exc;
            v3Var.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            v3Var = this;
            exc2 = exc;
        }
        Log.w(v3Var.f6889a, "Error with data collection. Data lost.", exc2);
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        i(new i3(this, l10, str, str2, bundle, z10, z11));
    }

    public final AppMeasurementSdk s() {
        return this.f6891d;
    }

    public final u1 t(Context context, boolean z10) {
        try {
            return t1.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f5913e : DynamiteModule.f5911c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            j(e10, true, false);
            return null;
        }
    }

    public final void u(nb.u8 u8Var) {
        k3 k3Var = new k3(u8Var);
        if (this.f6896i != null) {
            try {
                this.f6896i.setEventInterceptor(k3Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f6889a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        i(new f3(this, k3Var));
    }

    public final void v(nb.v8 v8Var) {
        n9.m.l(v8Var);
        List list = this.f6892e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (v8Var.equals(((Pair) list.get(i10)).first)) {
                        Log.w(this.f6889a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            l3 l3Var = new l3(v8Var);
            list.add(new Pair(v8Var, l3Var));
            if (this.f6896i != null) {
                try {
                    this.f6896i.registerOnMeasurementEventListener(l3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f6889a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i(new g3(this, l3Var));
        }
    }

    public final void w(nb.v8 v8Var) {
        Pair pair;
        n9.m.l(v8Var);
        List list = this.f6892e;
        synchronized (list) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (v8Var.equals(((Pair) list.get(i10)).first)) {
                            pair = (Pair) list.get(i10);
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                Log.w(this.f6889a, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            l3 l3Var = (l3) pair.second;
            if (this.f6896i != null) {
                try {
                    this.f6896i.unregisterOnMeasurementEventListener(l3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f6889a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i(new h3(this, l3Var));
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, null);
    }

    public final void y(String str, String str2, Bundle bundle, long j10) {
        q(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    public final void z(String str, String str2, Object obj, boolean z10) {
        i(new j2(this, str, str2, obj, z10));
    }
}
