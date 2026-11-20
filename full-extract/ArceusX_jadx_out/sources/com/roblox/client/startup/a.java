package com.roblox.client.startup;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import ci.s;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.util.Native;
import com.roblox.client.RobloxApplication;
import com.roblox.client.flags.a;
import com.roblox.client.scheduledwork.FlagFetchWorker;
import com.roblox.client.scheduledwork.OtaConfigHandler;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.client.startup.a;
import com.roblox.client.startup.b;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import ek.a;
import ek.q;
import ek.w;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.e0;
import ne.x;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import qh.k;
import rg.a1;
import rh.f;
import rh.h;
import rh.i;
import ug.g;
import uk.j;
import x5.d;
import x5.g0;
import x5.p0;
import yj.o2;

/* loaded from: classes2.dex */
public class a {
    public static x<b.C0154b> b;

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference<b> f9511a = new AtomicReference<>(b.UNINITIALIZED);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f9512c = true;

    /* renamed from: d, reason: collision with root package name */
    public static String f9513d = "roblox";

    /* renamed from: e, reason: collision with root package name */
    public static long f9514e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f9515f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final Object f9516g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f9517h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public static boolean f9518i = false;

    /* renamed from: j, reason: collision with root package name */
    public static JSONObject f9519j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final C0153a f9520k = new C0153a();

    /* renamed from: com.roblox.client.startup.a$a, reason: collision with other inner class name */
    public static class C0153a {

        /* renamed from: a, reason: collision with root package name */
        public JSONObject f9521a;
        public final Handler b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f9522c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f9523d;

        public void a() {
            if (this.f9523d.getAndSet(true)) {
                return;
            }
            this.b.removeCallbacks(this.f9522c);
            if (this.f9521a == null) {
                return;
            }
            a1.L(RobloxApplication.f()).edit().putString("AndroidAppSettingsCache", this.f9521a.toString()).apply();
            this.f9521a = null;
        }

        public synchronized void b(JSONObject jSONObject) {
            this.f9521a = jSONObject;
            this.b.removeCallbacks(this.f9522c);
            this.b.postDelayed(this.f9522c, h.a().R2());
        }

        public C0153a() {
            this.b = new Handler(Looper.getMainLooper());
            this.f9522c = new Runnable() { // from class: yj.k
                @Override // java.lang.Runnable
                public final void run() {
                    a.C0153a.this.a();
                }
            };
            this.f9523d = new AtomicBoolean(false);
        }
    }

    public enum b {
        UNINITIALIZED,
        PREFETCHED,
        REQUEST_SENT,
        ENGINE_FLAG_LOADED
    }

    public static void A(e0<b.C0154b> e0Var, b.C0154b c0154b, Context context) {
        E(c0154b, context);
        h();
        x();
        e0Var.D(c0154b);
        if (j.c() instanceof s) {
            ((s) j.c()).k();
        }
    }

    public static void B(Context context) {
        com.roblox.client.flags.b.f9086a.f(a1.U(context));
        f9511a.set(b.ENGINE_FLAG_LOADED);
        if (h.a().D1()) {
            Iterator<String> it = OtaConfigHandler.getActiveBehaviorNames(OtaConfigHandler.getOtaPrefs(context)).iterator();
            while (it.hasNext()) {
                OtaConfigHandler.checkAndPromoteWorkerBlob(context, it.next());
            }
        }
        OtaPollingWorker.B(context);
    }

    public static void C(String str) {
        f9513d = str;
    }

    public static void D() {
        try {
            i a10 = h.a();
            if (!a10.V() || Process.is64Bit()) {
                return;
            }
            int i10 = a10.Y2() ? 512 : a10.k() ? 768 : a10.u2() ? 1024 : 0;
            if (i10 != 0) {
                Os.setenv("MIMALLOC_RESERVE_OS_MEMORY", i10 + "M", true);
            }
            if (a10.Q3()) {
                Os.setenv("MIMALLOC_DISALLOW_OS_ALLOC", "1", true);
                Os.setenv("MIMALLOC_LIMIT_OS_ALLOC", "1", true);
            }
            if (a10.f2()) {
                Os.setenv("MIMALLOC_EAGER_COMMIT", "0", true);
            }
            if (a10.j3()) {
                Os.setenv("MIMALLOC_ARENA_EAGER_COMMIT", "0", true);
            }
        } catch (ErrnoException e10) {
            q.k("AndroidAppSettings", "tuneMimalloc failed " + e10.getMessage());
        }
    }

    public static boolean E(b.C0154b c0154b, Context context) {
        JSONObject c10 = c0154b.c();
        boolean z10 = false;
        if (c10 != null) {
            boolean H = H(c10, 1);
            G(context, c10, false);
            f9517h.set(H);
            y(H);
            z10 = H;
        } else {
            k(context);
        }
        l(context);
        f.f30648a.h(a1.U(context));
        g.a(context);
        return z10;
    }

    public static void F(String str, Context context) {
        JSONObject a10 = b.C0154b.a(str);
        if (a10 != null) {
            G(context, a10, true);
            H(a10, 1);
        } else {
            k(context);
        }
        l(context);
        f.f30648a.h(a1.U(context));
        g.a(context);
    }

    public static void G(final Context context, final JSONObject jSONObject, boolean z10) {
        if (!z10 && h.a().Y0() && w.a(context).equals("foreground")) {
            f9520k.b(jSONObject);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.g
                @Override // java.lang.Runnable
                public final void run() {
                    rg.a1.L(context.getApplicationContext()).edit().putString("AndroidAppSettingsCache", jSONObject.toString()).apply();
                }
            });
        }
    }

    public static boolean H(JSONObject jSONObject, int i10) {
        Object valueOf;
        boolean z10 = false;
        for (Map.Entry<String, com.roblox.client.flags.a> entry : h.a().U3()) {
            String key = entry.getKey();
            com.roblox.client.flags.a value = entry.getValue();
            String p8 = p(jSONObject, key, value);
            if (p8 != null) {
                try {
                    if (!(value instanceof a.C0142a) && !(value instanceof a.d)) {
                        if (value instanceof a.c) {
                            valueOf = Long.valueOf(jSONObject.getLong(p8));
                        } else {
                            if (!(value instanceof a.b) && !(value instanceof a.f)) {
                                valueOf = jSONObject.getString(p8);
                            }
                            valueOf = Integer.valueOf(jSONObject.getInt(p8));
                        }
                        value.f(valueOf, i10);
                        z10 = true;
                    }
                    valueOf = Boolean.valueOf(jSONObject.getBoolean(p8));
                    value.f(valueOf, i10);
                    z10 = true;
                } catch (JSONException unused) {
                    value.c(i10);
                    q.k("AndroidAppSettings", "Error reading value for setting: " + key);
                }
            } else {
                value.c(i10);
            }
        }
        return z10;
    }

    public static void I(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        t();
        LoggingProtocol.l("native_lib_wait_" + str + "_begin", Long.valueOf(elapsedRealtime));
        LoggingProtocol.k("native_lib_wait_" + str + "_end");
    }

    public static /* synthetic */ void a(final Context context, final e0 e0Var) {
        t.a(f9511a, b.PREFETCHED, b.REQUEST_SENT);
        w();
        LoggingProtocol.k("vb_flag_enabled");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.j
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.b(context, atomicBoolean, e0Var);
            }
        });
        b.C0154b b10 = com.roblox.client.startup.b.b(context);
        if (atomicBoolean.compareAndSet(false, true)) {
            q.h("AndroidAppSettings", "[VersionB] Network won the race.");
            A(e0Var, b10, context);
        } else {
            q.h("AndroidAppSettings", "[VersionB] Network fetch complete; cache already won.");
        }
        FlagCacheUtils.storePendingVersionBWrite(b10, context);
    }

    public static /* synthetic */ void b(Context context, AtomicBoolean atomicBoolean, e0 e0Var) {
        try {
            b.C0154b tryLoadVersionBCache = FlagCacheUtils.tryLoadVersionBCache(context);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (tryLoadVersionBCache == null) {
                String lastCacheOutcomeValue = FlagCacheUtils.getLastCacheOutcomeValue();
                LoggingProtocol.l("vb_cache_" + lastCacheOutcomeValue, Long.valueOf(elapsedRealtime));
                q.h("AndroidAppSettings", "[VersionB] Cache miss (" + lastCacheOutcomeValue + "); waiting for network.");
                return;
            }
            if (!atomicBoolean.compareAndSet(false, true)) {
                LoggingProtocol.l("vb_network_faster", Long.valueOf(elapsedRealtime));
                q.h("AndroidAppSettings", "[VersionB] Cache hit, but network already won.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.f9458i);
            } else {
                LoggingProtocol.l("vb_cache_applied", Long.valueOf(elapsedRealtime));
                if (h.a().u3()) {
                    LoggingProtocol.l(FlagCacheUtils.wasVersionBCacheWrittenByWorker(context) ? "vb_cache_source_worker" : "vb_cache_source_previous_launch", Long.valueOf(elapsedRealtime));
                }
                q.h("AndroidAppSettings", "[VersionB] Cache won the race.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.b);
                A(e0Var, tryLoadVersionBCache, context);
            }
        } catch (Exception e10) {
            q.f("AndroidAppSettings", "Failed to read cache", e10);
        }
    }

    public static /* synthetic */ void c(Context context) {
        boolean k02 = h.a().k0();
        if (k02) {
            LoggingProtocol.k("cookie_manager_init_begin");
        }
        j.c();
        if (k02) {
            LoggingProtocol.k("cookie_manager_init_end");
        }
        ek.c.g().f(context, new a.InterfaceC0298a() { // from class: yj.h
            @Override // ek.a.InterfaceC0298a
            public final void a(String str) {
                ek.c.f16036c.D(str);
            }
        });
    }

    public static /* synthetic */ x d(Context context, b.C0154b c0154b) {
        f.f30648a.q();
        return j(context);
    }

    public static synchronized void g(Context context) {
        synchronized (a.class) {
            if (!h.a().u3()) {
                SharedPreferences U = a1.U(context);
                if (U.getBoolean("flag_task_scheduled", false)) {
                    p0.h(context).a("fetch_flags");
                    U.edit().putBoolean("flag_task_scheduled", false).apply();
                }
                return;
            }
            p0 h10 = p0.h(context);
            SharedPreferences.Editor edit = a1.U(context).edit();
            edit.putLong("last_startup_time", System.currentTimeMillis());
            edit.putBoolean("flag_task_scheduled", true);
            edit.apply();
            x5.d a10 = new d.a().b(x5.x.b).d(false).c(true).f(false).e(false).a();
            long C4 = h.a().C4();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            g0 b10 = new g0.a(FlagFetchWorker.class, C4, timeUnit, h.a().v1(), timeUnit).a("fetch_flags").k(a10).i(x5.a.f35237a, 60L, TimeUnit.SECONDS).b();
            q.e("fetch_flags", "requested periodic work");
            h10.e("fetch_flags", x5.i.f35280a, b10);
        }
    }

    public static void h() {
        LoggingProtocol.l("fetch_flag_begin", Long.valueOf(f9514e));
    }

    public static synchronized x<b.C0154b> i(Context context) {
        synchronized (a.class) {
            x<b.C0154b> xVar = b;
            if (xVar != null && f9512c) {
                f9512c = false;
                return xVar;
            }
            x<b.C0154b> j10 = j(context);
            b = j10;
            return j10;
        }
    }

    public static x<b.C0154b> j(final Context context) {
        final e0 H = e0.H();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.i
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.a(context, H);
            }
        });
        return H;
    }

    public static void k(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(a1.L(context).getString("AndroidAppSettingsCache", "{}"));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        H(jSONObject, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(android.content.Context r7) {
        /*
            org.json.JSONObject r0 = mh.a.b(r7)
            if (r0 == 0) goto L10
            int r1 = r0.length()
            if (r1 <= 0) goto L10
            r1 = 2
            H(r0, r1)
        L10:
            java.lang.String r1 = "fetch"
            I(r1)
            com.roblox.engine.jni.model.ClientLocalFlags r1 = com.roblox.engine.jni.NativeGLInterface.readLocalFlags()
            org.json.JSONObject r2 = r1.getAll()
            boolean r3 = r1.isEmpty()
            r4 = 3
            java.lang.String r5 = "AndroidAppSettings"
            if (r3 != 0) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "localFlags size:"
            r3.append(r6)
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            ek.q.b(r5, r1)
            H(r2, r4)
        L41:
            boolean r1 = mh.b.a()
            r3 = 0
            if (r1 != 0) goto L49
            goto L6b
        L49:
            uj.a r1 = new uj.a
            r1.<init>(r7)
            java.lang.String r7 = r1.h()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L6b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L65
            r1.<init>(r7)     // Catch: org.json.JSONException -> L65
            H(r1, r4)     // Catch: org.json.JSONException -> L62
            r3 = r1
            goto L6b
        L62:
            r7 = move-exception
            r3 = r1
            goto L66
        L65:
            r7 = move-exception
        L66:
            java.lang.String r1 = "Failed to parse external dev app settings JSON"
            ek.q.c(r5, r1, r7)
        L6b:
            boolean r7 = mh.b.a()
            if (r7 != 0) goto L72
            goto L86
        L72:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            com.roblox.client.startup.a.f9519j = r7
            ek.o.a(r7, r0)
            org.json.JSONObject r7 = com.roblox.client.startup.a.f9519j
            ek.o.a(r7, r2)
            org.json.JSONObject r7 = com.roblox.client.startup.a.f9519j
            ek.o.a(r7, r3)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.startup.a.l(android.content.Context):void");
    }

    public static boolean m() {
        return f9511a.get() == b.ENGINE_FLAG_LOADED;
    }

    public static void n() {
        if (h.a().Y0()) {
            f9520k.a();
        }
    }

    public static String o() {
        JSONObject jSONObject = f9519j;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public static String p(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        return mh.a.c(jSONObject, str, aVar);
    }

    public static boolean q(b.C0154b c0154b) {
        return c0154b == null || c0154b.d() == null || c0154b.d().isEmpty();
    }

    public static void r() {
        yj.x m10 = yj.x.m();
        synchronized (f9515f) {
            try {
                if (!Native.isLoaded()) {
                    o2 o2Var = o2.ZSTD;
                    if (!m10.n(o2Var).isDone()) {
                        Native.load();
                        ZstdInputStream zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(new byte[]{40, -75, 47, -3, 32, 11, 89, 0, 0, 84, 101, 115, 116, 105, 110, 103, 32, 49, 50, 51}));
                        try {
                            String str = new String(ke.d.d(zstdInputStream), StandardCharsets.UTF_8);
                            zstdInputStream.setDict(new byte[0]);
                            m10.G(o2Var, "Testing 123".equals(str));
                            zstdInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                zstdInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e10) {
                q.f("AndroidAppSettings", "Failed to initialize ZSTD library", e10);
                m10.G(o2.ZSTD, false);
            }
        }
    }

    public static void s(Context context) {
        k(context);
        l(context);
    }

    public static void t() {
        String e10;
        try {
            synchronized (f9515f) {
                try {
                    r();
                    if (!f9518i) {
                        D();
                        System.loadLibrary(f9513d);
                        if (k.b() && (e10 = qh.b.e(RobloxApplication.f(), "robloxwebrtc", "android_app_settings")) != null) {
                            WebRtcLoader.initialize(e10);
                        }
                        f9518i = true;
                        yj.x.m().G(o2.ROBLOX, true);
                    }
                } finally {
                }
            }
        } catch (UnsatisfiedLinkError e11) {
            q.h("AndroidAppSettings", e11.getLocalizedMessage());
        }
    }

    public static b.C0154b u() {
        Context f10;
        try {
            b.C0154b c0154b = b.get();
            if (h.a().Q4() && q(c0154b) && (f10 = RobloxApplication.f()) != null) {
                q.k("AndroidAppSettings", "Initial prefetch returned empty; retrying before popping.");
                LoggingProtocol.g("automatic_retry_applied");
                b.C0154b b10 = com.roblox.client.startup.b.b(f10);
                if (q(b10)) {
                    q.e("AndroidAppSettings", "popFetchedResponse retry still returned empty.");
                    LoggingProtocol.g("flag_fetch_retry_empty_payload");
                } else {
                    E(b10, f10);
                    FlagCacheUtils.storePendingVersionBWrite(b10, f10);
                    c0154b = b10;
                }
            }
            b = null;
            return c0154b;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void v(final Context context) {
        b = i(context);
        f9511a.set(b.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.f
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.c(context);
            }
        });
    }

    public static void w() {
        f9514e = SystemClock.elapsedRealtime();
    }

    public static void x() {
        LoggingProtocol.k("fetch_flag_end");
    }

    public static void y(boolean z10) {
        if (z10) {
            LoggingProtocol.k("fastflag_load_success");
        } else {
            LoggingProtocol.k("fastflag_load_failure");
        }
    }

    public static synchronized void z(final Context context) {
        synchronized (a.class) {
            b bVar = f9511a.get();
            if (bVar != b.UNINITIALIZED && bVar != b.PREFETCHED) {
                b = ne.s.m(b, new ne.i() { // from class: yj.e
                    @Override // ne.i
                    public final ne.x apply(Object obj) {
                        return com.roblox.client.startup.a.d(context, (b.C0154b) obj);
                    }
                }, l2.b.i(context));
            }
        }
    }
}
