package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.a;
import com.android.billingclient.api.c;
import com.android.billingclient.api.f;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.play_billing.c0;
import com.google.android.gms.internal.play_billing.d2;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.l8;
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.n0;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.n9;
import com.google.android.gms.internal.play_billing.o8;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p9;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.v9;
import com.google.android.gms.internal.play_billing.y9;
import com.google.android.gms.internal.play_billing.z;
import com.google.android.gms.internal.play_billing.z7;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import v7.g2;
import v7.h1;
import v7.i0;
import v7.i1;
import v7.j0;
import v7.l;
import v7.l1;
import v7.m;
import v7.m1;
import v7.n;
import v7.o;
import v7.p;
import v7.p0;
import v7.p1;
import v7.r0;
import v7.t;
import v7.x1;

/* loaded from: classes.dex */
public class b extends a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public v7.i F;
    public boolean G;
    public boolean H;
    public s0 I;
    public volatile v7.d J;
    public ExecutorService K;
    public final Long L;
    public final c0 M;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5108a;
    public volatile int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5109c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5110d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f5111e;

    /* renamed from: f, reason: collision with root package name */
    public volatile t f5112f;

    /* renamed from: g, reason: collision with root package name */
    public Context f5113g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f5114h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.f f5115i;

    /* renamed from: j, reason: collision with root package name */
    public volatile p0 f5116j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5117k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5118l;

    /* renamed from: m, reason: collision with root package name */
    public int f5119m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5120n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5121o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5122p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5123q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5124r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5125s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5126t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5127u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5128v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5129w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5130x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5131y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5132z;

    public b(String str, Context context, i1 i1Var, ExecutorService executorService, a.C0113a c0113a) {
        this.f5108a = new Object();
        this.b = 0;
        this.f5111e = new Handler(Looper.getMainLooper());
        this.f5119m = 0;
        this.I = s0.k();
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.L = valueOf;
        this.M = r.a();
        this.f5109c = u7.a.f32646a;
        String B = B();
        this.f5110d = B;
        this.f5113g = context.getApplicationContext();
        e8 L = h8.L();
        L.E(u7.a.f32646a);
        if (B != null) {
            L.G(B);
        }
        L.v(this.f5113g.getPackageName());
        L.r(valueOf.longValue());
        L.D(c0113a.f5107j);
        L.o(Build.VERSION.SDK_INT);
        L.t(912213584L);
        m0(L, context);
        try {
            L.p(this.f5113g.getPackageManager().getPackageInfo(this.f5113g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f5114h = new m1(this.f5113g, (h8) L.i());
        this.f5113g.getPackageName();
        this.G = c0113a.f5107j;
    }

    @SuppressLint({"PrivateApi"})
    public static String B() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ d F0(Exception exc) {
        return exc instanceof DeadObjectException ? h.f5211j : h.f5209h;
    }

    public static /* synthetic */ Object M0(b bVar, int i10, t9 t9Var) {
        bVar.g0(new v7.m0(bVar, t9Var), i10);
        return "reconnectIfNeeded";
    }

    public static /* bridge */ /* synthetic */ void N(b bVar, int i10) {
        bVar.f5119m = i10;
        bVar.E = i10 >= 28;
        bVar.D = i10 >= 27;
        bVar.C = i10 >= 26;
        bVar.B = i10 >= 24;
        bVar.A = i10 >= 23;
        bVar.f5132z = i10 >= 22;
        bVar.f5131y = i10 >= 21;
        bVar.f5130x = i10 >= 20;
        bVar.f5129w = i10 >= 19;
        bVar.f5128v = i10 >= 18;
        bVar.f5127u = i10 >= 17;
        bVar.f5126t = i10 >= 16;
        bVar.f5125s = i10 >= 15;
        bVar.f5124r = i10 >= 14;
        bVar.f5123q = i10 >= 12;
        bVar.f5122p = i10 >= 9;
        bVar.f5121o = i10 >= 8;
        bVar.f5120n = i10 >= 6;
    }

    public static /* synthetic */ Object N0(b bVar, v7.f fVar, v7.e eVar) {
        if (bVar.j0(l1.b())) {
            bVar.C(eVar, fVar);
            return null;
        }
        s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
        d dVar = h.f5211j;
        bVar.q0(s7Var, 4, dVar);
        fVar.a(dVar, eVar.a());
        return null;
    }

    public static /* synthetic */ Object O0(b bVar, v7.j jVar, f fVar) {
        if (!bVar.j0(l1.b())) {
            s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
            d dVar = h.f5211j;
            bVar.q0(s7Var, 7, dVar);
            jVar.a(dVar, new n(n0.k(), n0.k()));
            return null;
        }
        if (bVar.f5127u) {
            r0 A0 = bVar.A0(fVar);
            jVar.a(h.a(A0.a(), A0.b()), new n(A0.c(), A0.d()));
            return null;
        }
        m0.m("BillingClient", "Querying product details is not supported.");
        s7 s7Var2 = s7.PRODUCT_DETAILS_NOT_SUPPORTED;
        d dVar2 = h.f5220s;
        bVar.q0(s7Var2, 7, dVar2);
        jVar.a(dVar2, new n(n0.k(), n0.k()));
        return null;
    }

    public static /* bridge */ /* synthetic */ void P(b bVar, int i10) {
        if (i10 != 0) {
            bVar.f0(0);
            return;
        }
        synchronized (bVar.f5108a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                bVar.f0(2);
                t tVar = bVar.f5112f != null ? bVar.f5112f : null;
                if (tVar != null) {
                    tVar.h(bVar.f5131y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object P0(b bVar, v7.c cVar, v7.b bVar2) {
        bVar.z(cVar, bVar2);
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean T(b bVar) {
        boolean z10;
        synchronized (bVar.f5108a) {
            z10 = true;
            if (bVar.b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static final String l0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static final void m0(e8 e8Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                e8Var.C((int) (memoryInfo.totalMem / 1048576));
                e8Var.w(Build.BRAND);
                e8Var.A(Build.MODEL);
                e8Var.z(Build.MANUFACTURER);
                e8Var.x(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            m0.n("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    public static Future o(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: v7.d0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            m0.n("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* synthetic */ void p(b bVar, v7.f fVar, v7.e eVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5212k;
        bVar.q0(s7Var, 4, dVar);
        fVar.a(dVar, eVar.a());
    }

    public static /* synthetic */ void q(b bVar, l lVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5212k;
        bVar.q0(s7Var, 9, dVar);
        lVar.a(dVar, n0.k());
    }

    public static /* synthetic */ void r(b bVar, v7.c cVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5212k;
        bVar.q0(s7Var, 3, dVar);
        cVar.a(dVar);
    }

    public static /* synthetic */ void s(b bVar, v7.j jVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5212k;
        bVar.q0(s7Var, 7, dVar);
        jVar.a(dVar, new n(n0.k(), n0.k()));
    }

    public static /* synthetic */ void t(b bVar, d dVar) {
        if (bVar.f5112f.e() != null) {
            bVar.f5112f.e().a(dVar, null);
        } else {
            m0.m("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final String A(f fVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f5113g.getPackageName();
        }
        return null;
    }

    public final r0 A0(f fVar) {
        com.google.android.gms.internal.play_billing.f fVar2;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String c10 = fVar.c();
        n0 b = fVar.b();
        int size = b.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(b.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList4.add(((f.b) arrayList3.get(i14)).c());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f5109c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f5108a) {
                    fVar2 = this.f5115i;
                }
                if (fVar2 == null) {
                    return v(h.f5211j, s7.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.f5129w && this.F.b();
                A(fVar);
                A(fVar);
                A(fVar);
                A(fVar);
                Bundle a22 = fVar2.a2(true != this.f5130x ? 17 : 20, this.f5113g.getPackageName(), c10, bundle, m0.g(str, this.f5110d, arrayList3, null, null, com.google.android.gms.internal.play_billing.a.a(z10, true, true, true, false, true), this.L.longValue()));
                if (a22 == null) {
                    return v(h.B, s7.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!a22.containsKey("DETAILS_LIST")) {
                    int b10 = m0.b(a22, "BillingClient");
                    String i15 = m0.i(a22, "BillingClient");
                    if (b10 == 0) {
                        return v(h.a(6, i15), s7.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return v(h.a(b10, i15), s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + b10, null);
                }
                ArrayList<String> stringArrayList = a22.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return v(h.B, s7.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    try {
                        e eVar = new e(stringArrayList.get(i16));
                        m0.l("BillingClient", "Got product details: ".concat(eVar.toString()));
                        arrayList5.add(eVar);
                    } catch (JSONException e10) {
                        return v(h.a(6, "Error trying to decode SkuDetails."), s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = a22.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i17 = 0;
                        while (i17 < size4) {
                            String str2 = stringArrayList2.get(i17);
                            i17++;
                            p pVar = new p(str2);
                            m0.l("BillingClient", "Got unfetchedProduct: ".concat(pVar.toString()));
                            arrayList6.add(pVar);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj = arrayList3.get(i18);
                            int i19 = i18 + 1;
                            f.b bVar = (f.b) obj;
                            int size6 = arrayList5.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size6) {
                                    i10 = size5;
                                    i11 = i19;
                                    arrayList6.add(new p(new JSONObject().put("productId", bVar.c()).put(Payload.TYPE, bVar.d()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i20);
                                i20++;
                                e eVar2 = (e) obj2;
                                i10 = size5;
                                i11 = i19;
                                if (!bVar.c().equals(eVar2.d()) || !bVar.d().equals(eVar2.e())) {
                                    size5 = i10;
                                    i19 = i11;
                                }
                            }
                            size5 = i10;
                            i18 = i11;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i12 = i13;
                } catch (JSONException e11) {
                    return v(h.a(6, "Error trying to decode SkuDetails."), s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return v(h.f5211j, s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return v(h.f5209h, s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new r0(0, "", arrayList, arrayList2);
    }

    /* JADX WARN: Finally extract failed */
    public final void C(v7.e eVar, v7.f fVar) {
        com.google.android.gms.internal.play_billing.f fVar2;
        int u8;
        String str;
        String a10 = eVar.a();
        try {
            m0.l("BillingClient", "Consuming purchase with token: " + a10);
            synchronized (this.f5108a) {
                try {
                    try {
                        fVar2 = this.f5115i;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    E(fVar, a10, h.f5211j, s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    E(fVar, a10, h.f5209h, s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (fVar2 == null) {
                try {
                    E(fVar, a10, h.f5211j, s7.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e12) {
                    e = e12;
                    E(fVar, a10, h.f5211j, s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    E(fVar, a10, h.f5209h, s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.f5122p) {
                String packageName = this.f5113g.getPackageName();
                boolean z10 = this.f5122p;
                String str2 = this.f5110d;
                long longValue = this.L.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    m0.c(bundle, u7.a.f32646a, str2, longValue);
                }
                Bundle O0 = fVar2.O0(9, packageName, a10, bundle);
                u8 = O0.getInt("RESPONSE_CODE");
                str = m0.i(O0, "BillingClient");
            } else {
                u8 = fVar2.u(3, this.f5113g.getPackageName(), a10);
                str = "";
            }
            d a11 = h.a(u8, str);
            if (u8 == 0) {
                m0.l("BillingClient", "Successfully consumed purchase.");
                fVar.a(a11, a10);
                return;
            }
            E(fVar, a10, a11, s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + u8, null);
        } catch (DeadObjectException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    public final void D(v7.c cVar, d dVar, s7 s7Var, Exception exc) {
        m0.n("BillingClient", "Error in acknowledge purchase!", exc);
        s0(s7Var, 3, dVar, h1.a(exc));
        cVar.a(dVar);
    }

    public final i1 D0() {
        return this.f5114h;
    }

    public final void E(v7.f fVar, String str, d dVar, s7 s7Var, String str2, Exception exc) {
        m0.n("BillingClient", str2, exc);
        s0(s7Var, 4, dVar, h1.a(exc));
        fVar.a(dVar, str);
    }

    public final d G0(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f5111e.post(new Runnable() { // from class: v7.a0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.t(com.android.billingclient.api.b.this, dVar);
            }
        });
        return dVar;
    }

    public final void R(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f5111e.post(runnable);
        }
    }

    public final /* synthetic */ Bundle W(int i10, String str, String str2, c cVar, Bundle bundle) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            synchronized (this.f5108a) {
                fVar = this.f5115i;
            }
            return fVar == null ? m0.d(h.f5211j, s7.SERVICE_RESET_TO_NULL) : fVar.l0(i10, this.f5113g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return m0.e(h.f5211j, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e10));
        } catch (Exception e11) {
            return m0.e(h.f5209h, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e11));
        }
    }

    public final /* synthetic */ Bundle X(String str, String str2) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            synchronized (this.f5108a) {
                fVar = this.f5115i;
            }
            return fVar == null ? m0.d(h.f5211j, s7.SERVICE_RESET_TO_NULL) : fVar.e1(3, this.f5113g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return m0.e(h.f5211j, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e10));
        } catch (Exception e11) {
            return m0.e(h.f5209h, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e11));
        }
    }

    public final Handler Y() {
        return Looper.myLooper() == null ? this.f5111e : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.a
    public void a(final v7.b bVar, final v7.c cVar) {
        if (o(new Callable() { // from class: v7.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.P0(com.android.billingclient.api.b.this, cVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.b0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.r(com.android.billingclient.api.b.this, cVar);
            }
        }, Y(), n()) == null) {
            d x10 = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, x10);
            cVar.a(x10);
        }
    }

    public final void a0(int i10) {
        try {
            int i11 = h1.f33265a;
            d0(h1.c(i10, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.a
    public void b(final v7.e eVar, final v7.f fVar) {
        if (o(new Callable() { // from class: v7.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.N0(com.android.billingclient.api.b.this, fVar, eVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.f0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.p(com.android.billingclient.api.b.this, fVar, eVar);
            }
        }, Y(), n()) == null) {
            d x10 = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, x10);
            fVar.a(x10, eVar.a());
        }
    }

    public final void b0(l7 l7Var) {
        try {
            this.f5114h.k(l7Var, this.f5119m);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.android.billingclient.api.a
    public final d c(String str) {
        if (!i0(l1.c())) {
            d dVar = h.f5211j;
            s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
            if (dVar.c() != 0) {
                q0(s7Var, 5, dVar);
                return dVar;
            }
            a0(5);
            return dVar;
        }
        d dVar2 = h.f5203a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    d dVar3 = this.f5118l ? h.f5210i : h.f5214m;
                    p0(dVar3, s7.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                    return dVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    d dVar4 = this.f5125s ? h.f5210i : h.f5216o;
                    p0(dVar4, s7.CROSS_APP_NOT_SUPPORTED, 6);
                    return dVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    d dVar5 = this.f5123q ? h.f5210i : h.f5221t;
                    p0(dVar5, s7.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                    return dVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    d dVar6 = this.f5126t ? h.f5210i : h.f5217p;
                    p0(dVar6, s7.MULTI_ITEM_NOT_SUPPORTED, 8);
                    return dVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    d dVar7 = this.f5124r ? h.f5210i : h.f5218q;
                    p0(dVar7, s7.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                    return dVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    d dVar8 = this.f5126t ? h.f5210i : h.f5217p;
                    p0(dVar8, s7.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                    return dVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    d dVar9 = this.f5127u ? h.f5210i : h.f5220s;
                    p0(dVar9, s7.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                    return dVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    d dVar10 = this.f5128v ? h.f5210i : h.f5227z;
                    p0(dVar10, s7.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                    return dVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    d dVar11 = this.f5128v ? h.f5210i : h.A;
                    p0(dVar11, s7.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                    return dVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    d dVar12 = this.f5130x ? h.f5210i : h.C;
                    p0(dVar12, s7.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                    return dVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    d dVar13 = this.f5131y ? h.f5210i : h.D;
                    p0(dVar13, s7.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                    return dVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    d dVar14 = this.B ? h.f5210i : h.f5222u;
                    p0(dVar14, s7.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                    return dVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    d dVar15 = this.A ? h.f5210i : h.f5223v;
                    p0(dVar15, s7.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                    return dVar15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    d dVar16 = this.B ? h.f5210i : h.f5224w;
                    p0(dVar16, s7.AUTO_PAY_NOT_SUPPORTED, 20);
                    return dVar16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    d dVar17 = this.C ? h.f5210i : h.f5225x;
                    p0(dVar17, s7.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                    return dVar17;
                }
                break;
            case 110223:
                if (str.equals("ooo")) {
                    d dVar18 = this.E ? h.f5210i : h.f5219r;
                    p0(dVar18, s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED, 22);
                    return dVar18;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    d dVar19 = this.f5121o ? h.f5210i : h.f5215n;
                    p0(dVar19, s7.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                    return dVar19;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    d dVar20 = this.f5117k ? h.f5210i : h.f5213l;
                    p0(dVar20, s7.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                    return dVar20;
                }
                break;
        }
        m0.m("BillingClient", "Unsupported feature: ".concat(str));
        d dVar21 = h.f5226y;
        p0(dVar21, s7.UNKNOWN_FEATURE, 1);
        return dVar21;
    }

    public final void c0(l7 l7Var, long j10, boolean z10) {
        try {
            this.f5114h.b(l7Var, this.f5119m, j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.a
    public final boolean d() {
        if (this.G) {
            return true;
        }
        return k0();
    }

    public final void d0(p7 p7Var) {
        try {
            this.f5114h.e(p7Var, this.f5119m);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.a
    public d e(Activity activity, c cVar) {
        boolean g10;
        Activity activity2;
        String str;
        long j10;
        Future o8;
        long j11;
        long j12;
        long j13;
        s7 s7Var;
        s7 s7Var2;
        long j14;
        String str2;
        long j15;
        boolean z10;
        long nextLong = new Random().nextLong();
        if (this.f5112f == null || this.f5112f.e() == null) {
            s7 s7Var3 = s7.MISSING_LISTENER;
            d dVar = h.E;
            r0(s7Var3, 2, dVar, nextLong);
            return dVar;
        }
        cVar.a();
        if (!i0(l1.c())) {
            s7 s7Var4 = s7.SERVICE_CONNECTION_NOT_READY;
            d dVar2 = h.f5211j;
            r0(s7Var4, 2, dVar2, nextLong);
            G0(dVar2);
            return dVar2;
        }
        synchronized (this.f5108a) {
            try {
                g10 = this.f5116j != null ? this.f5116j.g() : false;
            } finally {
            }
        }
        ArrayList l10 = cVar.l();
        List m10 = cVar.m();
        g2 g2Var = (g2) t0.a(l10, null);
        c.b bVar = (c.b) t0.a(m10, null);
        if (g2Var != null) {
            throw null;
        }
        final String d10 = bVar.c().d();
        final String e10 = bVar.c().e();
        if (e10.equals("subs") && !this.f5117k) {
            m0.m("BillingClient", "Current client doesn't support subscriptions.");
            s7 s7Var5 = s7.SUBSCRIPTIONS_NOT_SUPPORTED;
            d dVar3 = h.f5213l;
            t0(s7Var5, 2, dVar3, nextLong, g10);
            G0(dVar3);
            return dVar3;
        }
        if (cVar.w() && !this.f5120n) {
            m0.m("BillingClient", "Current client doesn't support extra params for buy intent.");
            s7 s7Var6 = s7.EXTRA_PARAMS_NOT_SUPPORTED;
            d dVar4 = h.f5207f;
            t0(s7Var6, 2, dVar4, nextLong, g10);
            G0(dVar4);
            return dVar4;
        }
        if (l10.size() > 1 && !this.f5126t) {
            m0.m("BillingClient", "Current client doesn't support multi-item purchases.");
            s7 s7Var7 = s7.MULTI_ITEM_NOT_SUPPORTED;
            d dVar5 = h.f5217p;
            t0(s7Var7, 2, dVar5, nextLong, g10);
            G0(dVar5);
            return dVar5;
        }
        if (!m10.isEmpty() && !this.f5127u) {
            m0.m("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            s7 s7Var8 = s7.PRODUCT_DETAILS_NOT_SUPPORTED;
            d dVar6 = h.f5220s;
            t0(s7Var8, 2, dVar6, nextLong, g10);
            G0(dVar6);
            return dVar6;
        }
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            String d11 = ((c.b) it.next()).d();
            if (d11 != null && d11.contains(":") && !this.E) {
                m0.m("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                s7 s7Var9 = s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                d dVar7 = h.f5219r;
                t0(s7Var9, 2, dVar7, nextLong, g10);
                G0(dVar7);
                return dVar7;
            }
        }
        d f10 = cVar.f();
        if (f10 != h.f5210i) {
            t0(s7.INVALID_BILLING_FLOW_PARAMS, 2, f10, nextLong, g10);
            G0(f10);
            return f10;
        }
        boolean z11 = g10;
        if (this.f5120n) {
            j10 = nextLong;
            final Bundle f11 = m0.f(cVar, this.f5122p, this.f5129w, this.F.a(), this.F.b(), this.H, this.f5109c, this.f5110d, this.L.longValue(), this.f5113g.getPackageName(), j10);
            if (l10.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(m10.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(m10.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i10 = 0; i10 < m10.size(); i10++) {
                    c.b bVar2 = (c.b) m10.get(i10);
                    e c10 = bVar2.c();
                    if (!c10.h().isEmpty()) {
                        arrayList3.add(c10.h());
                    }
                    String d12 = bVar2.d();
                    arrayList4.add(d12);
                    String i11 = c10.i(d12);
                    if (!TextUtils.isEmpty(i11)) {
                        arrayList5.add(i11);
                    }
                    if (i10 > 0) {
                        arrayList.add(((c.b) m10.get(i10)).c().d());
                        arrayList2.add(((c.b) m10.get(i10)).c().e());
                    }
                }
                f11.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    f11.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    f11.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    f11.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    f11.putStringArrayList("additionalSkus", arrayList);
                    f11.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = l10.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    f11.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (l10.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(l10.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(l10.size() - 1);
                    if (l10.size() > 1) {
                        throw null;
                    }
                    f11.putStringArrayList("additionalSkus", arrayList8);
                    f11.putStringArrayList("additionalSkuTypes", arrayList9);
                }
            }
            if (f11.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f5124r) {
                s7 s7Var10 = s7.OFFER_ID_TOKEN_NOT_SUPPORTED;
                d dVar8 = h.f5218q;
                t0(s7Var10, 2, dVar8, j10, z11);
                G0(dVar8);
                return dVar8;
            }
            if (TextUtils.isEmpty(bVar.c().g())) {
                z10 = false;
            } else {
                f11.putString("skuPackageName", bVar.c().g());
                z10 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                f11.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                m0.m("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                f11.putString("proxyPackage", stringExtra);
                try {
                    f11.putString("proxyPackageVersion", this.f5113g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    f11.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i12 = this.E ? 28 : (!this.f5127u || m10.isEmpty()) ? (this.f5125s && z10) ? 15 : this.f5122p ? 9 : 6 : 17;
            activity2 = activity;
            str = null;
            final c cVar2 = cVar;
            o8 = o(new Callable() { // from class: v7.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle W;
                    W = com.android.billingclient.api.b.this.W(i12, d10, e10, cVar2, f11);
                    return W;
                }
            }, 5000L, null, this.f5111e, n());
            j11 = cVar2;
        } else {
            activity2 = activity;
            str = null;
            j10 = nextLong;
            o8 = o(new Callable() { // from class: v7.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle X;
                    X = com.android.billingclient.api.b.this.X(d10, e10);
                    return X;
                }
            }, 5000L, null, this.f5111e, n());
            j11 = nextLong;
        }
        try {
            if (o8 == null) {
                try {
                    s7 s7Var11 = s7.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    d dVar9 = h.f5204c;
                    t0(s7Var11, 2, dVar9, j10, z11);
                    G0(dVar9);
                    return dVar9;
                } catch (CancellationException e11) {
                    e = e11;
                    j13 = j10;
                    m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    s7 s7Var12 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar10 = h.f5212k;
                    u0(s7Var12, 2, dVar10, h1.a(e), j13, z11);
                    G0(dVar10);
                    return dVar10;
                } catch (TimeoutException e12) {
                    e = e12;
                    j13 = j10;
                    m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    s7 s7Var122 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar102 = h.f5212k;
                    u0(s7Var122, 2, dVar102, h1.a(e), j13, z11);
                    G0(dVar102);
                    return dVar102;
                } catch (Exception e13) {
                    e = e13;
                    j12 = j10;
                    m0.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    s7 s7Var13 = s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                    d dVar11 = h.f5211j;
                    u0(s7Var13, 2, dVar11, h1.a(e), j12, z11);
                    G0(dVar11);
                    return dVar11;
                }
            }
            long j16 = j10;
            Bundle bundle = (Bundle) o8.get(5000L, TimeUnit.MILLISECONDS);
            int b = m0.b(bundle, "BillingClient");
            String i13 = m0.i(bundle, "BillingClient");
            if (b == 0) {
                Intent intent2 = new Intent(activity2, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j16);
                intent2.putExtra("wasServiceAutoReconnected", z11);
                activity2.startActivity(intent2);
                return h.f5210i;
            }
            m0.m("BillingClient", "Unable to buy item, Error response code: " + b);
            d a10 = h.a(b, i13);
            try {
                if (bundle == null) {
                    s7Var = s7.REASON_UNSPECIFIED;
                } else {
                    Object obj = bundle.get("LOG_REASON");
                    if (obj == null) {
                        s7Var = s7.REASON_UNSPECIFIED;
                    } else if (obj instanceof Integer) {
                        s7Var = s7.a(((Integer) obj).intValue());
                    } else {
                        m0.m("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        s7Var = s7.REASON_UNSPECIFIED;
                    }
                }
            } catch (Throwable th2) {
                m0.m("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                s7Var = s7.REASON_UNSPECIFIED;
            }
            if (s7Var == s7.REASON_UNSPECIFIED) {
                s7Var = s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            s7 s7Var14 = s7Var;
            try {
                if (bundle != null) {
                    try {
                        String string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                        s7Var2 = s7Var14;
                        j14 = j16;
                        str2 = string;
                    } catch (Throwable th3) {
                        m0.m("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    }
                    j15 = j14;
                    u0(s7Var2, 2, a10, str2, j15, z11);
                    G0(a10);
                    return a10;
                }
                u0(s7Var2, 2, a10, str2, j15, z11);
                G0(a10);
                return a10;
            } catch (CancellationException e14) {
                e = e14;
                j13 = j15;
                z11 = z11;
                m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                s7 s7Var1222 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar1022 = h.f5212k;
                u0(s7Var1222, 2, dVar1022, h1.a(e), j13, z11);
                G0(dVar1022);
                return dVar1022;
            } catch (TimeoutException e15) {
                e = e15;
                j13 = j15;
                z11 = z11;
                m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                s7 s7Var12222 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar10222 = h.f5212k;
                u0(s7Var12222, 2, dVar10222, h1.a(e), j13, z11);
                G0(dVar10222);
                return dVar10222;
            } catch (Exception e16) {
                e = e16;
                j12 = j15;
                z11 = z11;
                m0.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                s7 s7Var132 = s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                d dVar112 = h.f5211j;
                u0(s7Var132, 2, dVar112, h1.a(e), j12, z11);
                G0(dVar112);
                return dVar112;
            }
            s7Var2 = s7Var14;
            j14 = j16;
            str2 = str;
            j15 = j14;
        } catch (CancellationException e17) {
            e = e17;
        } catch (TimeoutException e18) {
            e = e18;
            j13 = j11;
        } catch (Exception e19) {
            e = e19;
        }
    }

    public final void e0(s7 s7Var, d dVar, int i10) {
        try {
            int i11 = h1.f33265a;
            j7 j7Var = (j7) h1.b(s7Var, 6, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED).s();
            n9 B = p9.B();
            B.o(i10 > 0);
            B.p(i10);
            j7Var.s(B);
            b0((l7) j7Var.i());
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void f0(int i10) {
        synchronized (this.f5108a) {
            try {
                if (this.b == 3) {
                    return;
                }
                m0.l("BillingClient", "Setting clientState from " + l0(this.b) + " to " + l0(i10));
                this.b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public void g(final f fVar, final v7.j jVar) {
        if (o(new Callable() { // from class: v7.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.O0(com.android.billingclient.api.b.this, jVar, fVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.h0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.s(com.android.billingclient.api.b.this, jVar);
            }
        }, Y(), n()) == null) {
            d x10 = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, x10);
            jVar.a(x10, new n(n0.k(), n0.k()));
        }
    }

    public final void g0(v7.d dVar, int i10) {
        s7 s7Var;
        d dVar2;
        d dVar3;
        synchronized (this.f5108a) {
            try {
                if (k0()) {
                    dVar2 = w(i10);
                } else {
                    if (this.b == 1) {
                        m0.m("BillingClient", "Client is already in the process of connecting to billing service.");
                        s7 s7Var2 = s7.BILLING_CLIENT_CONNECTING;
                        dVar3 = h.f5205d;
                        e0(s7Var2, dVar3, i10);
                    } else if (this.b == 3) {
                        m0.m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        s7 s7Var3 = s7.BILLING_CLIENT_CLOSED;
                        dVar3 = h.f5211j;
                        e0(s7Var3, dVar3, i10);
                    } else {
                        f0(1);
                        if (i10 == 0) {
                            this.J = dVar;
                            i10 = 0;
                        }
                        h0();
                        m0.l("BillingClient", "Starting in-app billing setup.");
                        this.f5116j = new p0(this, dVar, i10, null);
                        this.f5116j.f();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage(BuildConfig.STORE_PACKAGE);
                        List<ResolveInfo> queryIntentServices = this.f5113g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            s7Var = s7.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, BuildConfig.STORE_PACKAGE) || str2 == null) {
                                    s7Var = s7.INVALID_PHONESKY_PACKAGE;
                                    m0.m("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f5109c);
                                    synchronized (this.f5108a) {
                                        try {
                                            if (this.b == 2) {
                                                dVar2 = w(i10);
                                            } else if (this.b != 1) {
                                                m0.m("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                s7 s7Var4 = s7.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                dVar3 = h.f5211j;
                                                e0(s7Var4, dVar3, i10);
                                            } else {
                                                p0 p0Var = this.f5116j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f5113g.bindService(intent2, p0Var, 1) : this.f5113g.bindService(intent2, 1, n(), p0Var)) {
                                                    m0.l("BillingClient", "Service was bonded successfully.");
                                                    dVar2 = null;
                                                } else {
                                                    s7Var = s7.BILLING_SERVICE_BLOCKED;
                                                    m0.m("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                s7Var = s7.INVALID_PHONESKY_PACKAGE;
                                m0.m("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        f0(0);
                        m0.l("BillingClient", "Billing service unavailable on device.");
                        d dVar4 = h.b;
                        e0(s7Var, dVar4, i10);
                        dVar2 = dVar4;
                    }
                    dVar2 = dVar3;
                }
            } finally {
            }
        }
        if (dVar2 != null) {
            dVar.a(dVar2);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void h(o oVar, final l lVar) {
        if (o(new j0(this, lVar, oVar.c(), oVar.a()), 30000L, new Runnable() { // from class: v7.w
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.q(com.android.billingclient.api.b.this, lVar);
            }
        }, Y(), n()) == null) {
            d x10 = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, x10);
            lVar.a(x10, n0.k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        synchronized (this.f5108a) {
            if (this.f5116j != null) {
                try {
                    this.f5113g.unbindService(this.f5116j);
                } catch (Throwable th2) {
                    try {
                        m0.n("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f5115i = null;
                        this.f5116j = null;
                    } finally {
                        this.f5115i = null;
                        this.f5116j = null;
                    }
                }
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public void i(v7.d dVar) {
        g0(dVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i0(long j10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j10 = 0;
            }
            d dVar = (d) y(1).get(j10, TimeUnit.MILLISECONDS);
            if (dVar.c() == 0) {
                m0.l("BillingClient", "Reconnection succeeded with result: " + dVar.c());
            } else {
                m0.m("BillingClient", "Reconnection failed with result: " + dVar.c());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m0.n("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return k0();
    }

    public final void j(Context context, m mVar, v7.i iVar, v7.c0 c0Var, String str, i1 i1Var, a.C0113a c0113a) {
        this.f5113g = context.getApplicationContext();
        e8 L = h8.L();
        L.E(str);
        String str2 = this.f5110d;
        if (str2 != null) {
            L.G(str2);
        }
        L.v(this.f5113g.getPackageName());
        L.r(this.L.longValue());
        L.D(c0113a.f5107j);
        L.o(Build.VERSION.SDK_INT);
        L.t(912213584L);
        m0(L, context);
        try {
            L.p(this.f5113g.getPackageManager().getPackageInfo(this.f5113g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        if (i1Var != null) {
            this.f5114h = i1Var;
        } else {
            this.f5114h = new m1(this.f5113g, (h8) L.i());
        }
        if (mVar == null) {
            m0.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5112f = new t(this.f5113g, mVar, null, c0Var, null, null, this.f5114h);
        this.F = iVar;
        this.H = c0Var != null;
        this.f5113g.getPackageName();
        this.G = c0113a.f5107j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j0(long j10) {
        long max;
        z b = z.b(this.M);
        int a10 = l1.a();
        long j11 = j10;
        for (int i10 = 1; i10 <= a10; i10++) {
            try {
                max = Math.max(0L, j11);
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m0.n("BillingClient", "Error during reconnection attempt: ", e10);
            }
            if (max <= 0) {
                m0.m("BillingClient", "No time remaining for reconnection attempt.");
                return k0();
            }
            d dVar = (d) y(i10).get(max, TimeUnit.MILLISECONDS);
            if (dVar.c() == 0) {
                m0.l("BillingClient", "Reconnection succeeded with result: " + dVar.c());
                return k0();
            }
            m0.m("BillingClient", "Reconnection failed with result: " + dVar.c());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j11 = j10 - b.a(timeUnit);
            long pow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (j11 < pow) {
                m0.m("BillingClient", "Reconnection failed due to timeout limit reached.");
                return k0();
            }
            if (i10 < a10 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j11 = j10 - b.a(timeUnit);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    m0.n("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                }
            }
        }
        m0.m("BillingClient", "Max retries reached.");
        return k0();
    }

    public final boolean k0() {
        boolean z10;
        synchronized (this.f5108a) {
            try {
                z10 = false;
                if (this.b == 2 && this.f5115i != null && this.f5116j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final synchronized ExecutorService n() {
        try {
            if (this.K == null) {
                this.K = Executors.newFixedThreadPool(m0.f7225a, new i0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.K;
    }

    public final x1 n0(int i10, d dVar, s7 s7Var, String str, Exception exc) {
        s0(s7Var, 9, dVar, h1.a(exc));
        m0.n("BillingClient", str, exc);
        return new x1(dVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v7.x1 o0(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.o0(java.lang.String, boolean, int):v7.x1");
    }

    public final void p0(d dVar, s7 s7Var, int i10) {
        p7 p7Var = null;
        l7 l7Var = null;
        if (dVar.c() == 0) {
            int i11 = h1.f33265a;
            try {
                n7 C = p7.C();
                C.s(5);
                l8 B = o8.B();
                B.o(i10);
                C.p((o8) B.i());
                p7Var = (p7) C.i();
            } catch (Exception e10) {
                m0.n("BillingLogger", "Unable to create logging payload", e10);
            }
            d0(p7Var);
            return;
        }
        int i12 = h1.f33265a;
        try {
            j7 E = l7.E();
            q7 C2 = u7.C();
            C2.t(dVar.c());
            C2.p(dVar.a());
            C2.s(s7Var);
            E.p(C2);
            E.t(5);
            l8 B2 = o8.B();
            B2.o(i10);
            E.q((o8) B2.i());
            l7Var = (l7) E.i();
        } catch (Exception e11) {
            m0.n("BillingLogger", "Unable to create logging payload", e11);
        }
        b0(l7Var);
    }

    public final void q0(s7 s7Var, int i10, d dVar) {
        try {
            int i11 = h1.f33265a;
            b0(h1.b(s7Var, i10, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void r0(s7 s7Var, int i10, d dVar, long j10) {
        try {
            int i11 = h1.f33265a;
            try {
                this.f5114h.n(h1.b(s7Var, 2, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED), this.f5119m, j10);
            } catch (Throwable th2) {
                m0.n("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            m0.n("BillingClient", "Unable to log.", th3);
        }
    }

    public final void s0(s7 s7Var, int i10, d dVar, String str) {
        try {
            int i11 = h1.f33265a;
            b0(h1.b(s7Var, i10, dVar, str, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t0(s7 s7Var, int i10, d dVar, long j10, boolean z10) {
        try {
            int i11 = h1.f33265a;
            c0(h1.b(s7Var, 2, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void u0(s7 s7Var, int i10, d dVar, String str, long j10, boolean z10) {
        try {
            int i11 = h1.f33265a;
            c0(h1.b(s7Var, 2, dVar, str, z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final r0 v(d dVar, s7 s7Var, String str, Exception exc) {
        m0.n("BillingClient", str, exc);
        s0(s7Var, 7, dVar, h1.a(exc));
        return new r0(dVar.c(), dVar.a(), new ArrayList(), new ArrayList());
    }

    public final d w(int i10) {
        m0.l("BillingClient", "Service connection is valid. No need to re-initialize.");
        n7 C = p7.C();
        C.s(6);
        n9 B = p9.B();
        B.s(true);
        B.o(i10 > 0);
        B.p(i10);
        C.r(B);
        d0((p7) C.i());
        return h.f5210i;
    }

    public final d x() {
        int[] iArr = {0, 3};
        synchronized (this.f5108a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.b == iArr[i10]) {
                    return h.f5211j;
                }
            }
            return h.f5209h;
        }
    }

    public final i2 y(final int i10) {
        if (this.G && !k0()) {
            return y9.a(new v9() { // from class: v7.v
                @Override // com.google.android.gms.internal.play_billing.v9
                public final Object a(t9 t9Var) {
                    return com.android.billingclient.api.b.M0(com.android.billingclient.api.b.this, i10, t9Var);
                }
            });
        }
        m0.l("BillingClient", "Already connected or not opted into auto reconnection.");
        return d2.a(h.f5210i);
    }

    public final /* synthetic */ Object z(v7.c cVar, v7.b bVar) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            if (!j0(l1.b())) {
                s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
                d dVar = h.f5211j;
                q0(s7Var, 3, dVar);
                cVar.a(dVar);
            } else if (TextUtils.isEmpty(bVar.a())) {
                m0.m("BillingClient", "Please provide a valid purchase token.");
                s7 s7Var2 = s7.EMPTY_PURCHASE_TOKEN;
                d dVar2 = h.f5208g;
                q0(s7Var2, 3, dVar2);
                cVar.a(dVar2);
            } else if (this.f5122p) {
                synchronized (this.f5108a) {
                    fVar = this.f5115i;
                }
                if (fVar != null) {
                    String packageName = this.f5113g.getPackageName();
                    String a10 = bVar.a();
                    String str = this.f5110d;
                    long longValue = this.L.longValue();
                    int i10 = m0.f7225a;
                    Bundle bundle = new Bundle();
                    m0.c(bundle, u7.a.f32646a, str, longValue);
                    Bundle o22 = fVar.o2(9, packageName, a10, bundle);
                    cVar.a(h.a(m0.b(o22, "BillingClient"), m0.i(o22, "BillingClient")));
                    return null;
                }
                D(cVar, h.f5211j, s7.SERVICE_RESET_TO_NULL, null);
            } else {
                s7 s7Var3 = s7.API_VERSION_NOT_V9;
                d dVar3 = h.f5203a;
                q0(s7Var3, 3, dVar3);
                cVar.a(dVar3);
            }
            return null;
        } catch (DeadObjectException e10) {
            D(cVar, h.f5211j, s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            D(cVar, h.f5209h, s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    public b(String str, v7.i iVar, Context context, p1 p1Var, i1 i1Var, ExecutorService executorService, a.C0113a c0113a) {
        this.f5108a = new Object();
        this.b = 0;
        this.f5111e = new Handler(Looper.getMainLooper());
        this.f5119m = 0;
        this.I = s0.k();
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.L = valueOf;
        this.M = r.a();
        this.f5109c = u7.a.f32646a;
        String B = B();
        this.f5110d = B;
        this.f5113g = context.getApplicationContext();
        e8 L = h8.L();
        L.E(u7.a.f32646a);
        if (B != null) {
            L.G(B);
        }
        L.v(this.f5113g.getPackageName());
        L.r(valueOf.longValue());
        L.D(c0113a.f5107j);
        L.o(Build.VERSION.SDK_INT);
        L.t(912213584L);
        m0(L, context);
        try {
            L.p(this.f5113g.getPackageManager().getPackageInfo(this.f5113g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f5114h = new m1(this.f5113g, (h8) L.i());
        m0.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f5112f = new t(this.f5113g, null, null, null, null, null, this.f5114h);
        this.F = iVar;
        this.f5113g.getPackageName();
        this.G = c0113a.f5107j;
    }

    public b(String str, v7.i iVar, Context context, m mVar, v7.c0 c0Var, i1 i1Var, ExecutorService executorService, a.C0113a c0113a) {
        this.f5108a = new Object();
        this.b = 0;
        this.f5111e = new Handler(Looper.getMainLooper());
        this.f5119m = 0;
        this.I = s0.k();
        this.L = Long.valueOf(new Random().nextLong());
        this.M = r.a();
        this.f5109c = u7.a.f32646a;
        this.f5110d = B();
        j(context, mVar, iVar, null, u7.a.f32646a, null, c0113a);
    }
}
