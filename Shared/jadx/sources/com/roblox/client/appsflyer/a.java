package com.roblox.client.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import ci.k;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.b0;
import ek.q;
import im.f;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nb.qe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import qm.c;
import rg.a1;
import rg.t0;
import rh.h;
import ti.g;

/* loaded from: classes2.dex */
public class a extends ti.d {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f8996l = Pattern.compile("[A-Za-z0-9_-]+");
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8997c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8998d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8999e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9000f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9001g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9002h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f9003i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9004j = false;

    /* renamed from: k, reason: collision with root package name */
    public String f9005k = null;

    /* renamed from: com.roblox.client.appsflyer.a$a, reason: collision with other inner class name */
    public class C0138a implements AppsFlyerConversionListener {
        public C0138a() {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            a.this.N(map);
        }
    }

    public class b implements DeepLinkListener {
        public b() {
        }

        @Override // com.appsflyer.share.deeplink.DeepLinkListener
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            a.this.P(deepLinkResult);
        }
    }

    public class c implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9008a;

        public c(Context context) {
            this.f9008a = context;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            a.this.a0(this.f9008a, null);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            a.this.a0(this.f9008a, a.j0(response));
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9009a = new a();
    }

    public a() {
        q.h("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    public static String F0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String G(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    public static String G0(Object obj) {
        if (obj == null) {
            return "";
        }
        String obj2 = obj.toString();
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat2.format(simpleDateFormat.parse(obj2));
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static boolean H0(Map<String, Object> map) {
        return (map.containsKey("af_ad") || map.containsKey("af_adset")) ? false : true;
    }

    public static a I() {
        return d.f9009a;
    }

    public static long J(Context context, String str, long j10) {
        return K(context).getLong(str, j10);
    }

    public static SharedPreferences K(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    public static String L(long j10) {
        return "signupReportedTimeInSeconds_" + j10;
    }

    public static boolean Q(long j10, long j11, long j12) {
        return j10 != 0 && j11 - j10 <= j12;
    }

    public static String W(String str, String str2) {
        if (str == null || str2 == null || !str.contains("://navigation/crossdevice") || !f8996l.matcher(str2).matches() || str.indexOf(35) >= 0) {
            return str;
        }
        int indexOf = str.indexOf(63);
        String str3 = "";
        String substring = indexOf < 0 ? "" : str.substring(indexOf + 1);
        if (substring.startsWith("code=") || substring.contains("&code=")) {
            return str;
        }
        if (indexOf < 0) {
            str3 = "?";
        } else if (!substring.isEmpty() && !substring.endsWith("&")) {
            str3 = "&";
        }
        return str + str3 + "code=" + str2;
    }

    public static String X() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    public static JSONObject c0(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Boolean d0(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Object opt = new JSONObject(str).opt("isAdConsentRequired");
                if (opt instanceof Boolean) {
                    return (Boolean) opt;
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static Boolean j0(Response response) {
        try {
            ResponseBody body = response.body();
            try {
                if (!response.getIsSuccessful() || body == null) {
                    if (body != null) {
                        body.close();
                    }
                    return null;
                }
                Boolean d02 = d0(body.string());
                body.close();
                return d02;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean n(boolean z10, Boolean bool) {
        return z10 || !Boolean.FALSE.equals(bool);
    }

    public static void s0(Context context, String str, long j10) {
        SharedPreferences.Editor edit = K(context).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public static String u0(Map<String, Object> map) {
        String z02 = z0(map, "af_ad");
        return H0(map) ? G(z02, z0(map, "adgroup")) : z02;
    }

    public static String v0(Map<String, Object> map) {
        return G(z0(map, "af_adset"), z0(map, "adset"));
    }

    public static String w0(String str, String str2, String str3, String str4) {
        return G(str, str2, str3, str4);
    }

    public static String x0(Map<String, Object> map) {
        return w0(F0(map, "af_ad"), F0(map, "af_adset"), F0(map, "adgroup"), F0(map, "adset"));
    }

    public static String y0(Map<String, Object> map) {
        return G(z0(map, "af_c_id"), z0(map, Payload.CAMPAIGN_ID));
    }

    public static Request z() {
        return new Request.Builder().url(a1.e()).get().build();
    }

    public static String z0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return b0.c(obj);
    }

    public final long A() {
        return h.a().K5() * 1000;
    }

    public void A0(Context context, boolean z10) {
        r0(context, "disableDeeplinkTracking", !z10);
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    if (z10 && AppsFlyerLib.getInstance().isStopped()) {
                        f0(context, null, false);
                    } else if (!z10 && !AppsFlyerLib.getInstance().isStopped()) {
                        AppsFlyerLib.getInstance().stop(true, context);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B() {
        if (!h.a().v5() || dk.c.c().n()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    public final boolean B0() {
        synchronized (this.f8998d) {
            try {
                if (!this.f8999e) {
                    return false;
                }
                if (!h.a().u0()) {
                    return false;
                }
                m0("Android-AppsFlyer-DeferredRoute-Skip-ConsentHeld");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(Context context) {
        k.a().b().newCall(z()).enqueue(new c(context));
    }

    public final void C0(Context context, String str) {
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return;
                }
                boolean S = S(context);
                this.f8997c = true;
                f0(context, str, S);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void D(Context context) {
        E0(context, null);
    }

    public final void D0(Context context) {
        if (S(context)) {
            e0();
        } else {
            C0(context, "Android-AppsFlyer-Start-AtInit");
        }
    }

    public void E() {
        if (this.b == null) {
            return;
        }
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return;
                }
                long j10 = K(this.b).getLong("delayedStartBackstopDeadline", 0L);
                if (j10 == 0 || System.currentTimeMillis() < j10) {
                    return;
                }
                F(this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void E0(Context context, Boolean bool) {
        boolean z10;
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return;
                }
                if (bool != null) {
                    boolean z11 = K(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                    if (!z11) {
                        t(context, bool.booleanValue());
                    }
                    z10 = n(z11, bool);
                } else {
                    z10 = true;
                }
                if (z10) {
                    AppsFlyerLib.getInstance().setSharingFilterForPartners("all");
                    s(context, true, null);
                }
                boolean S = S(context);
                this.f8997c = true;
                f0(context, z10 ? "Android-AppsFlyer-Start-Backstop" : "Android-AppsFlyer-Start-BackstopGeoResolved", S);
                v(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(Context context) {
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return;
                }
                boolean z10 = K(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                if (z10) {
                    m0("Android-AppsFlyer-Eligibility-Recheck-Skipped");
                    D(context);
                } else {
                    m0("Android-AppsFlyer-Eligibility-Recheck-Attempted");
                    Z(context, p0());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean H(Context context, String str, boolean z10) {
        return K(context).getBoolean(str, z10);
    }

    public void M(Map<String, String> map) {
        JSONObject jSONObject;
        String str = map.get("af_dp");
        if (str != null) {
            if (h.a().d1()) {
                jSONObject = f.F().h(str, "android_appsflyer_re_engagement", false);
            } else {
                f.F().f(str, "android_appsflyer_re_engagement", false);
                jSONObject = null;
            }
            String str2 = map.get("link");
            String w02 = w0(map.get("af_ad"), map.get("af_adset"), map.get("adgroup"), map.get("adset"));
            if (h.a().Q5()) {
                str = W(str, map.get("code"));
                if (jSONObject != null) {
                    f.F().K(jSONObject, str);
                }
            }
            if (str2 != null) {
                f.F().l(str, str2, w02);
            } else {
                q.e("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                f.F().l(str, null, w02);
            }
        }
    }

    public void N(Map<String, Object> map) {
        String x02;
        JSONObject jSONObject;
        q.h("AppsFlyerManager", "media-source: " + ((String) map.get("media_source")));
        boolean equals = Boolean.TRUE.equals(map.get("is_first_launch"));
        if (equals) {
            g0(map);
        }
        if (equals && map.containsKey("af_dp")) {
            if (!B0() && u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
                boolean Q5 = h.a().Q5();
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    hashMap.put(entry.getKey(), (value == null && Q5 && "code".equals(entry.getKey())) ? null : String.valueOf(value));
                }
                String str = hashMap.get("af_dp");
                if (str != null) {
                    if (h.a().d1()) {
                        f.F().h(str, "android_appsflyer_gcd", false);
                    } else {
                        f.F().f(str, "android_appsflyer_gcd", true);
                    }
                }
                M(hashMap);
                return;
            }
            return;
        }
        if (!equals || !(map.get("deep_link_value") instanceof String) || ((String) map.get("deep_link_value")).isEmpty()) {
            if (!equals || !h.a().R() || (x02 = x0(map)) == null || B0()) {
                return;
            }
            h0(x02);
            return;
        }
        String str2 = (String) map.get("deep_link_value");
        if (!B0() && u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
            if (h.a().d1()) {
                jSONObject = f.F().h(str2, "android_appsflyer_gcd", false);
            } else {
                f.F().f(str2, "android_appsflyer_gcd", true);
                jSONObject = null;
            }
            String x03 = x0(map);
            if (h.a().Q5()) {
                Object obj = map.get("code");
                str2 = W(str2, obj instanceof String ? (String) obj : null);
                if (jSONObject != null) {
                    f.F().K(jSONObject, str2);
                }
            }
            f.F().l(str2, null, x03);
        }
    }

    public final void O(boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    public void P(DeepLinkResult deepLinkResult) {
        String deepLinkValue;
        JSONObject jSONObject;
        if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND || deepLinkResult.getDeepLink() == null || (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) == null || deepLinkValue.isEmpty()) {
            return;
        }
        Boolean isDeferred = deepLinkResult.getDeepLink().isDeferred();
        if (!Boolean.TRUE.equals(isDeferred) || (!B0() && u("Android-AppsFlyer-DeferredRoute-Skip-Udl"))) {
            if (h.a().d1()) {
                jSONObject = f.F().h(deepLinkValue, "android_appsflyer_udl", false);
            } else {
                if (isDeferred != null) {
                    f.F().f(deepLinkValue, "android_appsflyer_udl", isDeferred.booleanValue());
                } else {
                    f.F().e(deepLinkValue, "android_appsflyer_udl");
                }
                jSONObject = null;
            }
            String w02 = w0(deepLinkResult.getDeepLink().getStringValue("af_ad"), deepLinkResult.getDeepLink().getStringValue("af_adset"), deepLinkResult.getDeepLink().getStringValue("adgroup"), deepLinkResult.getDeepLink().getStringValue("adset"));
            if (h.a().Q5()) {
                deepLinkValue = W(deepLinkValue, deepLinkResult.getDeepLink().getStringValue("code"));
                if (jSONObject != null) {
                    f.F().K(jSONObject, deepLinkValue);
                }
            }
            f.F().l(deepLinkValue, null, w02);
        }
    }

    public final boolean R() {
        return (dk.c.c().n() || mh.b.a()) ? false : true;
    }

    public final boolean S(Context context) {
        return h.a().F4() && H(context, "disableDeeplinkTracking", false);
    }

    public final /* synthetic */ void T(boolean z10) {
        A0(this.b, z10);
    }

    public final void U(Context context) {
        SharedPreferences K = K(context);
        if (K.getLong("delayedStartBackstopDeadline", 0L) != 0) {
            K.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
        }
    }

    public final boolean V(Context context) {
        SharedPreferences K = K(context);
        if (!Q(K.getLong("delayedStartConsentTs", 0L), System.currentTimeMillis(), A())) {
            return false;
        }
        boolean z10 = K.getBoolean("delayedStartConsentApplySharingFilter", true);
        JSONObject c02 = c0(K.getString("delayedStartConsentDma", null));
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return true;
                }
                o(AppsFlyerLib.getInstance(), c02, z10);
                boolean S = S(context);
                this.f8997c = true;
                v(context);
                f0(context, "Android-AppsFlyer-Start-CachedConsent", S);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void Y(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        synchronized (this.f8998d) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("dmaConsent");
                boolean optBoolean = jSONObject.optBoolean("applySharingFilter", true);
                o(appsFlyerLib, optJSONObject, optBoolean);
                s(this.b, optBoolean, optJSONObject);
                z10 = this.f8997c;
                if (z10) {
                    z11 = false;
                } else {
                    z11 = S(this.b);
                    this.f8997c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        v(this.b);
        f0(this.b, "Android-AppsFlyer-Start-Attribution", z11);
    }

    public void Z(Context context, Boolean bool) {
        if (bool == null) {
            m0("Android-AppsFlyer-Eligibility-Recheck-Unresolved");
        } else {
            m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Recheck-Flagged" : "Android-AppsFlyer-Eligibility-Recheck-NotFlagged");
        }
        E0(context, bool);
    }

    @Override // ti.d
    public void a(Context context) {
        boolean a10 = mh.b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init: initEnabled=");
        sb2.append(!a10);
        q.h("AppsFlyerManager", sb2.toString());
        if (a10) {
            return;
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.setMinTimeBetweenSessions(90);
        appsFlyerLib.setOneLinkCustomDomain("roblox.onelink.me", "ro.blox.com", "go.roblox.com");
        O(H(context, "enableTracking", true));
        C0138a c0138a = new C0138a();
        appsFlyerLib.setCollectAndroidID(false);
        if (h.a().v5()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", c0138a, context);
        appsFlyerLib.registerSessionReadyListener(new SessionReadyListener() { // from class: xg.a
            @Override // com.appsflyer.share.SessionReadyListener
            public final void onSessionReady() {
                com.roblox.client.appsflyer.a.this.b0();
            }
        });
        appsFlyerLib.subscribeForDeepLink(new b());
        this.b = context;
        f.F().w(new f.h() { // from class: xg.b
            @Override // im.f.h
            public final void a(JSONObject jSONObject) {
                com.roblox.client.appsflyer.a.this.Y(jSONObject);
            }
        });
        q0(context);
        if (h.a().i4()) {
            f.F().x(new f.i() { // from class: xg.c
                @Override // im.f.i
                public final void a(boolean z10) {
                    com.roblox.client.appsflyer.a.this.T(z10);
                }
            });
        }
        f.F().E(appsFlyerLib.getAppsFlyerUID(context));
    }

    public final void a0(Context context, Boolean bool) {
        if (bool == null) {
            m0("Android-AppsFlyer-Eligibility-Unresolved");
            p(context, true, false);
            return;
        }
        synchronized (this.f8998d) {
            try {
                t(context, bool.booleanValue());
                if (bool.booleanValue()) {
                    U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Flagged" : "Android-AppsFlyer-Eligibility-NotFlagged");
        p(context, bool.booleanValue(), true);
    }

    @Override // ti.d
    public void b() {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
    }

    public void b0() {
        synchronized (this.f8998d) {
            try {
                this.f9003i = true;
                if (this.f9004j) {
                    String str = this.f9005k;
                    this.f9004j = false;
                    this.f9005k = null;
                    x(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void c(Context context) {
        boolean R = R();
        q.h("AppsFlyerManager", "first play: enabled=" + R);
        if (R) {
            String str = "firstPlayReported_" + dk.c.c().j();
            if (H(context, str, false)) {
                return;
            }
            r0(context, str, true);
            if (!h.a().M3()) {
                AppsFlyerLib.getInstance().logEvent(this.b, AFInAppEventType.LEVEL_ACHIEVED, null);
            }
            o0("firstPlayReported", null);
            n0("Android-AppsFlyer-FirstPlay");
        }
    }

    @Override // ti.d
    public void d(Context context) {
        boolean R = R();
        q.h("AppsFlyerManager", "login: enabled=" + R);
        if (!R) {
            m(context);
            return;
        }
        B();
        o0("loginReported", null);
        n0("Android-AppsFlyer-Login");
        l0(context);
        y(context);
    }

    @Override // ti.d
    public void e(Context context, long j10) {
        boolean R = R();
        q.h("AppsFlyerManager", "playtime: enabled=" + R);
        if (R) {
            String str = "experiencePlaytimeReported_" + dk.c.c().j();
            if (H(context, str, false) || j10 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            if (!h.a().H5()) {
                AppsFlyerLib.getInstance().logEvent(this.b, String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15), null);
            }
            o0("experiencePlaytimeReported", null);
            n0("Android-AppsFlyer-ExperiencePlaytime");
            r0(context, str, true);
        }
    }

    public final void e0() {
        String dataString;
        Intent intent = this.f32252a;
        if (intent == null || (dataString = intent.getDataString()) == null) {
            return;
        }
        AppsFlyerLib.getInstance().performDeepLinking(dataString, false);
    }

    @Override // ti.d
    public void f(@NonNull String str, String str2, String str3, long j10, boolean z10) {
        boolean R = R();
        q.h("AppsFlyerManager", "Purchase. enabled=" + R + ". Price: " + str2 + ".");
        if (R) {
            k0(str, str2, str3);
        }
    }

    public final void f0(Context context, String str, boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().stop(true, context);
            return;
        }
        synchronized (this.f8998d) {
            try {
                if (this.f9003i) {
                    x(str);
                } else {
                    this.f9004j = true;
                    this.f9005k = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void g(Context context) {
        boolean R = R();
        q.h("AppsFlyerManager", "signup: enabled=" + R);
        if (!R) {
            m(context);
            return;
        }
        B();
        o0("signUpReported", null);
        n0("Android-AppsFlyer-Registration");
        s0(context, L(dk.c.c().j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        y(context);
    }

    public void g0(Map<String, Object> map) {
        boolean equals = "Organic".equals(map.get("af_status"));
        long j10 = a1.f30262u;
        if (j10 == 0) {
            n0("Android-AppsFlyer-AttributionContext-Skip-BtidNotReady");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("body", r(j10, map).toString());
            MessageBus.f().l(km.f.f22861a.a("Linking", "recordAttributionContext"), jSONObject);
            n0(equals ? "Android-AppsFlyer-AttributionContext-Published-Organic" : "Android-AppsFlyer-AttributionContext-Published");
        } catch (Exception e10) {
            q.e("AppsFlyerManager", "Failed to publish recordAttributionContext: " + e10.getMessage());
            n0("Android-AppsFlyer-AttributionContext-Skip-JsonError");
        }
    }

    public void h0(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this.f9002h) {
            try {
                if (this.f9001g) {
                    m0("Android-AppsFlyer-DDR-Publish-Skip-Duplicate");
                    return;
                }
                this.f9001g = true;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attributionAdName", str);
                    MessageBus.f().l(km.f.f22861a.a("Linking", "resolveAttributionAdName"), jSONObject);
                } catch (JSONException e10) {
                    q.e("AppsFlyerManager", "Failed to publish resolveAttributionAdName: " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void i(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    public final Boolean i0(Context context) {
        long j10 = K(context).getLong("delayedStartEligibilityTs", 0L);
        if (j10 == 0 || System.currentTimeMillis() - j10 > A()) {
            return null;
        }
        return Boolean.valueOf(H(context, "delayedStartFlagged", true));
    }

    public final void k0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair("currencyCode", str3));
        o0("purchaseReported", arrayList);
        n0("Android-AppsFlyer-Purchase");
    }

    public final void l0(Context context) {
        boolean R = R();
        q.h("AppsFlyerManager", "Login retention: enabled=" + R);
        if (R) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long convert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long j10 = dk.c.c().j();
            long J = J(context, L(j10), 0L);
            if (J > 0) {
                long convert2 = TimeUnit.DAYS.convert(convert - J, timeUnit);
                if (convert2 < 1 || convert2 > 3) {
                    return;
                }
                Locale locale = Locale.ENGLISH;
                String format = String.format(locale, "af_retention_d%d", Long.valueOf(convert2));
                String format2 = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(convert2));
                String format3 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(convert2));
                String str = format3 + "_" + j10;
                if (H(context, str, false)) {
                    return;
                }
                r0(context, str, true);
                if (!h.a().U5()) {
                    AppsFlyerLib.getInstance().logEvent(this.b, format, null);
                }
                o0(format3, null);
                n0(format2);
            }
        }
    }

    public final void m(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        r0(context, "enableTracking", false);
    }

    public final void m0(String str) {
        Set a10;
        a10 = qe.a(new Object[]{TelemetryBackend.COUNTER});
        qm.c.b(new c.a(str, a10).j(2026, 7, 30).d());
    }

    public final void n0(String str) {
        g.b().q(str);
    }

    public final void o(AppsFlyerLib appsFlyerLib, JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Boolean valueOf = jSONObject.has("consented") ? Boolean.valueOf(jSONObject.optBoolean("consented")) : null;
            appsFlyerLib.setConsentData(new AppsFlyerConsent(jSONObject.has("isSubjectToGdpr") ? Boolean.valueOf(jSONObject.optBoolean("isSubjectToGdpr")) : null, valueOf, valueOf, valueOf));
        }
        if (z10) {
            appsFlyerLib.setSharingFilterForPartners("all");
            m0("Android-AppsFlyer-Sharing-Filter-Applied");
        } else {
            appsFlyerLib.setSharingFilterForPartners("");
            m0("Android-AppsFlyer-Sharing-Filter-Cleared");
        }
    }

    public final void o0(String str, List<NameValuePair> list) {
        t0.i(str, "appsFlyer", list);
    }

    public void p(Context context, boolean z10, boolean z11) {
        if (z10) {
            if (V(context)) {
                return;
            }
            q(context, z11);
        } else {
            D0(context);
            if (K(context).getLong("delayedStartBackstopDeadline", 0L) != 0) {
                v(context);
            }
        }
    }

    public final Boolean p0() {
        try {
            Response execute = k.a().b().newCall(z()).execute();
            try {
                Boolean j02 = j0(execute);
                if (execute != null) {
                    execute.close();
                }
                return j02;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final void q(Context context, boolean z10) {
        synchronized (this.f8998d) {
            try {
                if (this.f8997c) {
                    return;
                }
                SharedPreferences K = K(context);
                long j10 = K.getLong("delayedStartBackstopDeadline", 0L);
                boolean z11 = true;
                if (j10 == 0) {
                    j10 = System.currentTimeMillis() + w();
                    K.edit().putLong("delayedStartBackstopDeadline", j10).putBoolean("delayedStartBackstopEligibilityResolved", z10).apply();
                } else if (z10) {
                    K.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
                }
                if (j10 <= System.currentTimeMillis()) {
                    z11 = false;
                }
                this.f8999e = z11;
                t0(context, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q0(Context context) {
        Boolean i02;
        synchronized (this.f8998d) {
            try {
                i02 = i0(context);
                if (Boolean.TRUE.equals(i02)) {
                    U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i02 == null) {
            C(context);
        } else {
            m0("Android-AppsFlyer-Eligibility-CacheHit");
            p(context, i02.booleanValue(), true);
        }
    }

    public JSONObject r(long j10, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("btid", String.valueOf(j10));
        jSONObject.put("afAd", b0.c(u0(map)));
        jSONObject.put("afAdset", b0.c(v0(map)));
        jSONObject.put("mediaSource", b0.c(map.get("media_source")));
        jSONObject.put("country", b0.c(map.get("country_code")));
        jSONObject.put("campaign", b0.c(map.get("campaign")));
        jSONObject.put("campaignId", b0.c(y0(map)));
        jSONObject.put("isRetargeting", Boolean.parseBoolean(String.valueOf(map.get("is_retargeting"))));
        jSONObject.put("retargetingConversionType", b0.c(map.get("retargeting_conversion_type")));
        jSONObject.put("siteId", b0.c(map.get("af_siteid")));
        jSONObject.put("channel", b0.c(map.get(AFInAppEventParameterName.AF_CHANNEL)));
        jSONObject.put("appsflyerId", b0.c(AppsFlyerLib.getInstance().getAppsFlyerUID(this.b)));
        jSONObject.put("deepLinkValue", b0.c(map.get("deep_link_value")));
        jSONObject.put("afDp", b0.c(map.get("af_dp")));
        jSONObject.put("installTime", G0(map.get("install_time")));
        jSONObject.put("platform", "ANDROID");
        jSONObject.put("requestId", UUID.randomUUID().toString());
        jSONObject.put("clientTime", X());
        return jSONObject;
    }

    public final void r0(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = K(context).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public final void s(Context context, boolean z10, JSONObject jSONObject) {
        SharedPreferences.Editor edit = K(context).edit();
        edit.putBoolean("delayedStartConsentApplySharingFilter", z10);
        if (jSONObject != null) {
            edit.putString("delayedStartConsentDma", jSONObject.toString());
        } else {
            edit.remove("delayedStartConsentDma");
        }
        edit.putLong("delayedStartConsentTs", System.currentTimeMillis());
        edit.apply();
    }

    public final void t(Context context, boolean z10) {
        K(context).edit().putBoolean("delayedStartFlagged", z10).putLong("delayedStartEligibilityTs", System.currentTimeMillis()).apply();
    }

    public final void t0(Context context, long j10) {
        Context applicationContext = context.getApplicationContext();
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (currentTimeMillis <= 0) {
            D(applicationContext);
        } else {
            ConsentBackstopWorker.INSTANCE.b(applicationContext, currentTimeMillis);
        }
    }

    public boolean u(String str) {
        synchronized (this.f9002h) {
            try {
                if (this.f9000f) {
                    m0(str);
                    return false;
                }
                this.f9000f = true;
                m0("Android-AppsFlyer-DeferredRoute");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(Context context) {
        synchronized (this.f8998d) {
            K(context).edit().remove("delayedStartBackstopDeadline").remove("delayedStartBackstopEligibilityResolved").apply();
        }
        ConsentBackstopWorker.INSTANCE.a(context);
    }

    public final long w() {
        return h.a().z4() * 1000;
    }

    public final void x(String str) {
        AppsFlyerLib.getInstance().start();
        if (str != null) {
            m0(str);
        }
        e0();
    }

    public final void y(Context context) {
        r0(context, "enableTracking", true);
        O(true);
    }
}
