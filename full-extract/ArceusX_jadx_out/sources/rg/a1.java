package rg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.RobloxApplication;
import com.roblox.client.analytics.CrashpadHandler;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.qe;
import qm.c;
import uk.e;

/* loaded from: classes2.dex */
public class a1 {
    public static ek.e b;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f30248g;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f30253l;

    /* renamed from: q, reason: collision with root package name */
    public static Pattern f30258q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f30259r;

    /* renamed from: s, reason: collision with root package name */
    public static SharedPreferences f30260s;

    /* renamed from: t, reason: collision with root package name */
    public static String f30261t;

    /* renamed from: u, reason: collision with root package name */
    public static long f30262u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f30263v;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f30243a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static String f30244c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f30245d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f30246e = "";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f30247f = false;

    /* renamed from: h, reason: collision with root package name */
    public static String f30249h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f30250i = false;

    /* renamed from: j, reason: collision with root package name */
    public static String f30251j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f30252k = false;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f30254m = false;

    /* renamed from: n, reason: collision with root package name */
    public static String f30255n = null;

    /* renamed from: o, reason: collision with root package name */
    public static String f30256o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f30257p = false;

    static {
        f30248g = false;
        K0(BuildConfig.BASE_URL);
        P0("");
        if (!f30244c.isEmpty()) {
            f30248g = true;
        }
        f30259r = false;
        f30260s = null;
        f30261t = "";
        f30262u = 0L;
        f30263v = false;
    }

    public static String A(String str) {
        return g() + "games/?SortFilter=" + str;
    }

    public static String A0(long j10) {
        return g() + "my/messages/#!/inbox?conversationId=" + j10;
    }

    public static String B(Context context) {
        return U(context).getString("moduleName", "");
    }

    public static String B0() {
        return d0("profile");
    }

    public static String C(Context context) {
        SharedPreferences U = U(context);
        String string = U.getString("engine", "");
        U.edit().remove("engine").apply();
        return string;
    }

    public static void C0() {
        Set a10;
        e.b q10 = uk.e.q();
        try {
            a10 = qe.a(new Object[]{TelemetryBackend.COUNTER});
            qm.c.d(new c.a("cookie_versionb_webview_pull", a10).j(2026, 10, 13).d(), new c.b().b("result", q10.name()).l());
        } catch (UnsatisfiedLinkError e10) {
            ek.q.k("roblox.config", "pullSecurityCookieFromWebView: telemetry failed: " + e10);
        }
    }

    public static String D(Context context) {
        SharedPreferences U = U(context);
        String string = U.getString("channel", "");
        if (s.c(context)) {
            U.edit().remove("channel").apply();
        }
        return string;
    }

    public static String D0() {
        return "https://ecsv2." + P() + "mobile/pbe";
    }

    public static String E() {
        return BuildConfig.APP_UPGRADE_KEY;
    }

    public static boolean E0() {
        return false;
    }

    public static String F() {
        return f30249h;
    }

    public static String F0() {
        return g() + "upgrades/robux";
    }

    public static String G() {
        return b.c();
    }

    public static String G0(String str) {
        return g() + "catalog?Keyword=" + str;
    }

    public static String H() {
        return b.d();
    }

    public static String H0(String str) {
        return g() + "games/?Keyword=" + str;
    }

    public static String I() {
        return f30246e;
    }

    public static String I0(String str) {
        return g() + "search/groups?keyword=" + str;
    }

    public static String J() {
        return f30245d;
    }

    public static String J0(String str) {
        return g() + "users/search?keyword=" + str;
    }

    public static String K() {
        return "Development";
    }

    public static void K0(String str) {
        ek.q.h("roblox.config", "setBaseUrl() " + b + " => " + str);
        b = new ek.e(str);
        f30258q = Pattern.compile(u0(), 2);
    }

    public static SharedPreferences L(Context context) {
        return ek.z.e(context).c("cached_app_settings_prefs");
    }

    public static boolean L0(fh.c cVar) {
        if (cVar == null) {
            return false;
        }
        String a10 = cVar.a();
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        K0(a10);
        return true;
    }

    public static String M() {
        return BuildConfig.CLIENT_SETTINGS_GROUPNAME;
    }

    public static void M0(String str) {
        if (str != null) {
            f30249h = new ek.f().d(str);
        } else {
            f30249h = null;
        }
    }

    public static String N() {
        return ek.t.j() ? "Android-TENCENTPlayer-Crash" : q0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    public static void N0(String str) {
        ek.q.h("roblox.config", "setBinaryChannelEngineLibName() " + f30246e + " => " + str);
        if (str == null) {
            str = "";
        }
        f30246e = str;
    }

    public static String O() {
        return b.a();
    }

    public static void O0(String str) {
        ek.q.h("roblox.config", "setBinaryChannelModuleName() " + f30245d + " => " + str);
        if (str == null) {
            str = "";
        }
        f30245d = str;
    }

    public static String P() {
        return b.b();
    }

    public static void P0(String str) {
        if (str == null || zg.c.e(str)) {
            return;
        }
        ek.q.h("roblox.config", "setChannel() " + f30244c + " => " + str);
        f30244c = str.trim();
    }

    public static String Q(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + R() + "\",\"title\":\"" + context.getString(q0.C) + "\",\"animated\":true}";
    }

    public static void Q0(boolean z10) {
        f30259r = z10;
    }

    public static String R() {
        return g() + "/users/friends#!/friend-requests";
    }

    public static boolean R0(Configuration configuration) {
        return l0() && configuration.orientation == 2;
    }

    public static String S() {
        return "application/json;charset=UTF-8";
    }

    public static void S0(Context context) {
        f30252k = context.getResources().getBoolean(i0.f30301a);
        f30253l = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        f30254m = context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static SharedPreferences T() {
        return f30260s;
    }

    public static void T0() {
        Set a10;
        Set a11;
        boolean G2 = rh.h.a().G2();
        if (G2) {
            LoggingProtocol.g("cookie_read_begin");
        }
        String b10 = uk.j.c().b(g());
        if (G2) {
            LoggingProtocol.g("cookie_read_end");
        }
        yj.w0.l();
        if (b10 == null) {
            b10 = "";
        }
        NativeSettingsInterface.nativeSetMultipleCookies(g(), b10);
        if (rh.h.a().S1() && f30243a.compareAndSet(false, true)) {
            boolean contains = b10.contains(".ROBLOSECURITY=_");
            boolean h10 = ti.h.h();
            String j10 = uk.e.j();
            boolean u8 = u();
            TelemetryBackend telemetryBackend = TelemetryBackend.COUNTER;
            a10 = qe.a(new Object[]{telemetryBackend});
            qm.c.d(new c.a("cookie_versionb_migration_result", a10).j(2026, 6, 24).d(), new c.b().b("has_roblosecurity", String.valueOf(contains)).b("has_cached_user", String.valueOf(h10)).b("webview_state", j10).l());
            a11 = qe.a(new Object[]{telemetryBackend});
            qm.c.d(new c.a("cookie_versionb_engine_push", a11).j(2026, 6, 24).d(), new c.b().b("has_roblosecurity", String.valueOf(contains)).b("has_cached_user", String.valueOf(h10)).b("engine_has_roblosecurity", String.valueOf(u8)).l());
            ek.q.h("roblox.config", "updateNativeCookies: pushed len=" + b10.length() + " shellHasRoblosecurity=" + contains + " engineHasRoblosecurity=" + u8 + " webviewState=" + j10);
        }
    }

    public static SharedPreferences U(Context context) {
        return ek.z.a(context, "prefs");
    }

    public static void U0() {
        NativeSettingsInterface.nativeSetCacheDirectory(f30255n);
        NativeSettingsInterface.nativeSetFilesDirectory(f30256o);
    }

    public static String V(String str) {
        Matcher matcher = f30258q.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void V0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", ""), Long.getLong("http.proxyPort", 0L).longValue());
    }

    public static String W() {
        return f30244c;
    }

    public static void W0() {
        X0(true);
    }

    public static String X() {
        return "my/account#!/notifications";
    }

    public static void X0(boolean z10) {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(z());
        NativeSettingsInterface.nativeSetBaseUrl(g(), h());
        NativeSettingsInterface.nativeSetRobloxChannel(W());
        if (rh.h.a().M0()) {
            NativeSettingsInterface.nativeOverrideChannelPlatformName2(M());
        } else {
            NativeSettingsInterface.nativeOverrideChannelPlatformName(M());
        }
        if (f30255n == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        U0();
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(e1());
        ek.c.f16036c.a(new Runnable() { // from class: rg.z0
            @Override // java.lang.Runnable
            public final void run() {
                a1.a();
            }
        }, ne.a0.a());
        h0();
        if (yj.k0.T()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        if (z10) {
            T0();
        }
    }

    public static boolean Y() {
        return f30247f;
    }

    public static void Y0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f30261t, "googleplay", ek.c.d());
    }

    public static String Z(long j10) {
        return ek.b0.b("%sv1/users/%d", k(), Long.valueOf(j10));
    }

    public static String Z0() {
        return c() + "v1/mobile-client-version?appVersion=" + E() + e1();
    }

    public static /* synthetic */ void a() {
        Y0();
        LoggingProtocol.g("get_advertisingid_end");
    }

    public static String a0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friend-requests";
    }

    public static String a1() {
        return f30251j;
    }

    public static String b() {
        return g().replace("www.", "apis.");
    }

    public static String b0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friends";
    }

    public static String b1() {
        return k() + "v1/users/authenticated";
    }

    public static String c() {
        return "https://clientsettingscdn." + P();
    }

    public static String c0(long j10) {
        return g() + "users/" + j10 + "/profile";
    }

    public static String c1() {
        return l() + "v1/google/validate";
    }

    public static String d(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c());
        sb2.append("v2/settings");
        if (z10) {
            sb2.append("-compressed");
        }
        sb2.append("/application/");
        sb2.append(M());
        String W = W();
        if (!W.isEmpty()) {
            sb2.append("/bucket/");
            sb2.append(W);
        }
        if (z10) {
            sb2.append("/");
            sb2.append("b80a8016163ae58891a14b51aec71f7e307963255b4ac92d955644daeda6bf85");
            sb2.append(".dcz");
        }
        return sb2.toString();
    }

    public static String d0(String str) {
        long g10 = ti.h.e().g();
        if (g10 == -1) {
            return g() + "users/" + str;
        }
        return g() + "users/" + g10 + "/" + str;
    }

    public static String d1() {
        return l() + "v1/google/purchase";
    }

    public static String e() {
        return b() + "v1/attribution-eligibility";
    }

    public static String e0() {
        return g() + "home";
    }

    public static String e1() {
        return "2.746.1266";
    }

    public static String f() {
        return j() + "v1/user/currency";
    }

    public static boolean f0() {
        return f30244c.isEmpty();
    }

    public static String g() {
        return "https://" + b.d();
    }

    public static void g0(Context context) {
        f30256o = context.getFilesDir().getAbsolutePath();
        f30255n = context.getCacheDir().getAbsolutePath();
        f30261t = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String h() {
        if (f30249h == null) {
            return "https://api." + P();
        }
        return "https://" + f30249h;
    }

    public static void h0() {
        if (f30250i) {
            return;
        }
        ApplicationInfo applicationInfo = RobloxApplication.f().getApplicationInfo();
        if (NativeSettingsInterface.nativeInitCrashpad(NativeInitCrashpadParams.builder().c(e1()).d(g()).g(N()).l(rh.h.a().K2()).k(rh.h.a().S3()).i(CrashpadHandler.class.getCanonicalName()).h(Arrays.asList("ANDROID_DATA=" + System.getenv("ANDROID_DATA"), "ANDROID_ROOT=" + System.getenv("ANDROID_ROOT"), "ANDROID_STORAGE=" + System.getenv("ANDROID_STORAGE"), "LIBRARYPATH=" + applicationInfo.nativeLibraryDir, "CLASSPATH=.:" + applicationInfo.sourceDir)).j(j0()).e(ek.h.a()).f(rh.h.a().E5()).b())) {
            f30250i = true;
            ek.q.h("roblox.config", "Crashpad monitoring with API unification is ON");
        }
    }

    public static String i() {
        return "https://auth." + P();
    }

    public static void i0(Context context, fh.c cVar) {
        String string = Settings.Global.getString(context.getContentResolver(), "roblox_channel_override");
        if (string != null) {
            string = string.trim();
        }
        boolean z10 = (f30248g || TextUtils.isEmpty(string)) ? false : true;
        if (z10) {
            ek.q.h("roblox.config", "Using channel from launch override: " + string);
            P0(string);
        }
        if (cVar != null) {
            if (!f30248g && !z10) {
                P0(cVar.h());
            }
            String a10 = cVar.a();
            if (L0(cVar)) {
                ek.q.h("roblox.config", "initConfig: Set base-URL from: " + b + " => " + a10);
            }
        }
        M0(ek.z.b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f30260s = U(context);
        if (rh.h.a().q3()) {
            O0(B(context));
            N0(C(context));
            f30247f = U(context).getString("supportsAndroidBinaries", "").equals("true");
        }
        String D = D(context);
        if (!f30248g && !z10 && !D.isEmpty()) {
            ek.q.h("roblox.config", "Found channel from preferences: " + D);
            P0(D);
        }
        S0(context);
        if (cVar == null || TextUtils.isEmpty(cVar.k())) {
            f30251j = m(context);
            return;
        }
        f30251j = cVar.k();
        f30257p = true;
        ek.q.k("roblox.config", "Using a custom user agent: " + f30251j);
    }

    public static String j() {
        return "https://economy." + P();
    }

    public static boolean j0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static String k() {
        return "https://users." + P();
    }

    public static boolean k0() {
        return f30253l;
    }

    public static String l() {
        return g().replace("www.", "billing.");
    }

    public static boolean l0() {
        return (!rh.h.a().P4() || k0() || q0()) ? false : true;
    }

    public static String m(Context context) {
        return n(context, "google");
    }

    public static boolean m0(String str) {
        String V = V(str);
        return (!n0(str)) & ((V == null || V.isEmpty()) ? false : true);
    }

    public static String n(Context context, String str) {
        return tk.g.a(context, e1(), "AppleWebKit/537.36", BuildConfig.DISTRIBUTOR_TYPE, BuildConfig.STORE_TYPE, "questvr".equals(str), p0(), k0(), t0());
    }

    public static boolean n0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    public static String o() {
        return g() + "mobile-app-upgrades/native-ios/bc";
    }

    public static boolean o0() {
        if (rh.h.a().H4()) {
            return true;
        }
        return rh.h.a().u5() && r0();
    }

    public static String p(String str, String str2) {
        return ek.b0.b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", g(), str, str2);
    }

    public static boolean p0() {
        return !f30252k;
    }

    public static String q() {
        return ek.b0.b("%scaptcha/app/signup?hybrid-return-token=1", g());
    }

    public static boolean q0() {
        return false;
    }

    public static boolean r(Context context) {
        return U(context).getBoolean("under13", true);
    }

    public static boolean r0() {
        return f30252k;
    }

    public static void s(Context context) {
        U(context).edit().remove("moduleName").apply();
    }

    public static boolean s0() {
        return b.c().contains(".robloxlabs.com");
    }

    public static String t() {
        if (!f30257p) {
            return BuildConfig.DISTRIBUTOR_TYPE;
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f30251j);
        if (matcher.find()) {
            return matcher.group();
        }
        ek.q.e("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return BuildConfig.DISTRIBUTOR_TYPE;
    }

    public static boolean t0() {
        return f30254m;
    }

    public static boolean u() {
        if (!rh.h.a().S1()) {
            return false;
        }
        try {
            String nativeGetCookiesInNetscapeFormat = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(g());
            if (nativeGetCookiesInNetscapeFormat != null) {
                if (nativeGetCookiesInNetscapeFormat.contains(".ROBLOSECURITY")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            ek.q.k("roblox.config", "engineHasSecurityCookie: read-back failed: " + th2);
            return false;
        }
    }

    public static String u0() {
        return "^(https?://" + Pattern.quote(H()) + "(?:login|newlogin))(?!/reset-password).*";
    }

    public static String v(String str, int i10) {
        return "&counterName=" + str + "&amount=" + i10;
    }

    public static String v0() {
        return i() + "/v2/logout";
    }

    public static String w() {
        return "https://ephemeralcounters.api." + P() + "v1.1/Counters/Increment/?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String w0() {
        return g() + "my/messages/#!/inbox";
    }

    public static String x(String str, long j10) {
        return "&sequenceName=" + str + "&value=" + j10;
    }

    public static boolean x0() {
        return f30259r;
    }

    public static String y() {
        return "https://ephemeralcounters.api." + P() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String y0() {
        return g() + rh.h.a().X1();
    }

    public static String z() {
        return "exception_reason.txt";
    }

    public static String z0() {
        return g() + "login/resetpasswordrequest/success";
    }
}
