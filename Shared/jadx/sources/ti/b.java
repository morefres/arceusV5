package ti;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import backtraceio.library.models.json.BacktraceReport;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.user.NativeUserJavaInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import ek.z;
import hj.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import nb.qe;
import oi.h;
import org.webrtc.ContextUtils;
import qm.c;
import rg.a1;
import rg.t;
import rg.t0;
import rg.u;
import rg.y;
import uk.e;
import uk.j;
import vi.c;
import yj.k0;
import yj.p2;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f32235d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f32236e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f32237f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public static boolean f32238g;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f32239a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32240c;

    public class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f32241a;
        public final /* synthetic */ com.roblox.client.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f32242c;

        /* renamed from: ti.b$a$a, reason: collision with other inner class name */
        public class C0580a implements h.c {
            public C0580a() {
            }

            @Override // oi.h.c
            public void a(boolean z10) {
                q.b("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                com.roblox.client.a aVar = a.this.b;
                if (aVar != null && !aVar.isFinishing()) {
                    a.this.b.T1();
                }
                e.c().f(2, a.this.f32242c);
                b.f32235d = false;
            }
        }

        public a(Activity activity, com.roblox.client.a aVar, Bundle bundle) {
            this.f32241a = activity;
            this.b = aVar;
            this.f32242c = bundle;
        }

        @Override // vi.c.b
        public void a() {
            q.b("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new oi.h().a(this.f32241a, new C0580a());
        }
    }

    /* renamed from: ti.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0581b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32245a;

        static {
            int[] iArr = new int[d.values().length];
            f32245a = iArr;
            try {
                iArr[d.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32245a[d.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32245a[d.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32245a[d.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32245a[d.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32246a = new b();
    }

    public enum d {
        LOGOUT_BY_USER_IN_NATIVE,
        LOGOUT_BY_USER_IN_LUA,
        LOGOUT_BY_401_ERROR_IN_NATIVE,
        LOGOUT_BY_401_ERROR_IN_WEB,
        LOGOUT_BY_401_ERROR_IN_LUA
    }

    public static /* synthetic */ void a(Context context, String str) {
        t.c(context);
        NativeSettingsInterface.nativeSetDefaultAppPolicyFile("content/guac/defaultConfigs/GuacDefaultPolicy-" + a1.t() + ".json");
    }

    public static boolean e() {
        if (!f32236e) {
            return false;
        }
        f32236e = false;
        return true;
    }

    public static b f() {
        return c.f32246a;
    }

    public static d g(Bundle bundle) {
        d dVar;
        if (bundle != null && (dVar = (d) bundle.getSerializable("logout_type")) != null) {
            return dVar;
        }
        q.e("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return d.LOGOUT_BY_USER_IN_NATIVE;
    }

    public static boolean m() {
        return f32238g;
    }

    public static void p() {
        f32236e = true;
    }

    public void c(Context context) {
        SharedPreferences a10 = z.a(context, "DeviceInstallPreferences");
        boolean z10 = a10.getBoolean("AppFirstLaunch", true);
        this.b = z10;
        if (z10) {
            q.h("rbx.AppManager", "First App launch!");
            g.b().f();
            SharedPreferences.Editor edit = a10.edit();
            edit.putBoolean("AppFirstLaunch", false);
            edit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            edit.apply();
        }
    }

    public final void d(d dVar) {
        int i10 = C0581b.f32245a[dVar.ordinal()];
        if (i10 == 1) {
            t0.j("manual", "manual");
            return;
        }
        if (i10 == 2) {
            t0.j("manual", "luaapp");
            return;
        }
        if (i10 == 3) {
            t0.j("failedSessionCheck", "native");
            return;
        }
        if (i10 == 4) {
            t0.j("failedSessionCheck", "webview");
            return;
        }
        if (i10 == 5) {
            t0.j("failedSessionCheck", "luaapp");
            return;
        }
        q.k("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + dVar);
    }

    public void h() {
        f32238g = true;
    }

    public void i(Activity activity, d dVar) {
        q.h("rbx.AppManager", "handleLogout: logoutType = " + dVar + ", activity = " + activity.getLocalClassName());
        if (rh.h.a().S1() && (dVar == d.LOGOUT_BY_401_ERROR_IN_NATIVE || dVar == d.LOGOUT_BY_401_ERROR_IN_WEB || dVar == d.LOGOUT_BY_401_ERROR_IN_LUA)) {
            o(dVar);
        }
        f32235d = true;
        d(dVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", dVar);
        if (rh.h.a().v5()) {
            ek.c.g().c();
            a1.Y0();
            y.h().d().b();
        }
        com.roblox.client.ossearch.b.f(activity);
        if (dVar == d.LOGOUT_BY_USER_IN_NATIVE) {
            com.roblox.client.a aVar = activity instanceof com.roblox.client.a ? (com.roblox.client.a) activity : null;
            if (aVar != null) {
                aVar.d2(aVar);
            }
            k0.s(activity).C(activity, true, new a(activity, aVar, bundle));
        } else {
            k0.s(activity).C(activity, false, null);
            e.c().f(2, bundle);
            f32235d = false;
        }
        if (rh.h.a().R3()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f32238g = false;
    }

    public void j(Activity activity) {
        q.h("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f32235d = true;
        t0.z();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", d.LOGOUT_BY_USER_IN_LUA);
        if (rh.h.a().v5()) {
            ek.c.g().c();
            a1.Y0();
            y.h().d().b();
        }
        com.roblox.client.ossearch.b.f(activity);
        k0.s(activity).C(activity, false, null);
        e.c().f(2, bundle);
        f32235d = false;
        f32238g = false;
    }

    public void k(@NonNull Context context) {
        synchronized (b.class) {
            try {
                q.h("rbx.AppManager", "initialize: Start...");
                if (this.f32239a) {
                    n();
                    q.h("rbx.AppManager", "initialize: Already initialized.");
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    l(context);
                    f32238g = false;
                    this.f32239a = true;
                    n();
                    q.h("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(@NonNull final Context context) {
        z.e(context.getApplicationContext());
        a1.g0(context);
        NativeSettingsInterface.nativeSetBaseUrl(a1.g(), a1.h());
        NativeSettingsInterface.nativeSetRobloxChannel(a1.W());
        if (rh.h.a().S1()) {
            e.a e10 = uk.e.e();
            if (e10 == e.a.f33001c) {
                LoggingProtocol.g("cookie_migrated");
                q.h("rbx.AppManager", "VersionB: cookies migrated from WebView to native storage.");
            } else if (e10 == e.a.b) {
                LoggingProtocol.g("cookie_loaded");
                q.h("rbx.AppManager", "VersionB: cookies loaded from native storage.");
            }
        }
        NativeUserJavaInterface.setImplementation(new li.c());
        p2.b(context);
        tk.g.i(y.h().l());
        y.h().p();
        h.e();
        u.g().d(null);
        wg.a.e().g(context);
        mh.d.b();
        oi.b.f().q(Locale.getDefault());
        r.k().x(context);
        kk.d.c(new uj.b());
        ContextUtils.initialize(context.getApplicationContext());
        kk.c.p().s(new Consumer() { // from class: ti.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b.a(context, (String) obj);
            }
        });
        kk.c.p().x();
    }

    public final void n() {
        String a12 = a1.a1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ROBLOX\n| User-Agent = ");
        sb2.append(a12);
        sb2.append("\n| Build = ");
        sb2.append(ek.h.a());
        sb2.append(", ID = ");
        sb2.append(a1.K());
        sb2.append("\n| Version = ");
        sb2.append("2.746.1266");
        sb2.append(", Code = ");
        sb2.append(20836);
        sb2.append("\n| BaseUrl = ");
        sb2.append(a1.H());
        sb2.append("\n| OS Ver. = ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", Lvl = ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n| Arch = ");
        sb2.append(u.g().i().toString());
        sb2.append("\n| Is domain set = ");
        sb2.append(tk.g.c() != null);
        q.h("rbx.AppManager", sb2.toString());
    }

    public void o(d dVar) {
        Set a10;
        boolean z10;
        boolean z11;
        boolean z12;
        if (rh.h.a().S1()) {
            try {
                boolean f10 = h.e().f();
                boolean h10 = h.h();
                boolean u8 = a1.u();
                String b = j.c().b(a1.g());
                boolean z13 = b != null && b.contains(".ROBLOSECURITY=_");
                String j10 = uk.e.j();
                String name = uk.e.e().name();
                long i10 = uk.e.i();
                long currentTimeMillis = i10 > 0 ? (System.currentTimeMillis() - i10) / 1000 : -1L;
                String h11 = uk.e.h();
                long g10 = uk.e.g();
                long currentTimeMillis2 = g10 > 0 ? (System.currentTimeMillis() - g10) / 1000 : -1L;
                String f11 = uk.e.f();
                a10 = qe.a(new Object[]{TelemetryBackend.COUNTER});
                boolean z14 = z13;
                qm.c.d(new c.a("cookie_versionb_did_logout", a10).j(2026, 10, 13).d(), new c.b().b("logout_type", dVar.name()).b("was_logged_in", String.valueOf(f10)).b("has_cached_user", String.valueOf(h10)).b("shell_has_roblosecurity", String.valueOf(z14)).b("engine_has_roblosecurity", String.valueOf(u8)).b("webview_state", j10).b("migration_result", name).b("native_cookie_age_bucket", uk.e.a(i10)).b("native_cookie_write_source", h11).b("native_cookie_delete_age_bucket", uk.e.a(g10)).b("native_cookie_delete_source", f11).l());
                boolean z15 = Math.random() * 100.0d < ((double) rh.h.a().J4());
                j6.a g11 = ug.e.h().g();
                if (!z15 || g11 == null) {
                    z10 = z15;
                    z11 = true;
                    z12 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                    z12 = false;
                    if (f32237f.compareAndSet(false, true)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("logout_type", dVar.name());
                        hashMap.put("was_logged_in", String.valueOf(f10));
                        hashMap.put("has_cached_user", String.valueOf(h10));
                        hashMap.put("shell_has_roblosecurity", String.valueOf(z14));
                        hashMap.put("cookie_webview_state", j10);
                        hashMap.put("cookie_migration_result", name);
                        hashMap.put("engine_has_roblosecurity", String.valueOf(u8));
                        hashMap.put("native_cookie_age_seconds", String.valueOf(currentTimeMillis));
                        hashMap.put("native_cookie_write_source", h11);
                        hashMap.put("native_cookie_delete_age_seconds", String.valueOf(currentTimeMillis2));
                        hashMap.put("native_cookie_delete_source", f11);
                        g11.send(new BacktraceReport("involuntary_logout:" + dVar.name(), hashMap));
                        q.h("rbx.AppManager", "reportInvoluntaryLogout: sent Backtrace report for " + dVar.name());
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportInvoluntaryLogout: counter only (inUploadSample=");
                sb2.append(z10);
                sb2.append(", clientReady=");
                sb2.append(g11 != null ? z11 : z12);
                sb2.append(", alreadyUploadedThisProcess=");
                sb2.append(f32237f.get());
                sb2.append(")");
                q.h("rbx.AppManager", sb2.toString());
            } catch (Throwable th2) {
                q.k("rbx.AppManager", "reportInvoluntaryLogout: failed: " + th2);
            }
        }
    }

    public void q(boolean z10) {
        this.f32240c = z10;
    }

    public b() {
        this.f32239a = false;
        q.h("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
