package uh;

import am.a;
import android.text.TextUtils;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import org.json.JSONException;
import org.json.JSONObject;
import rg.c2;
import ti.b;

/* loaded from: classes2.dex */
public class n extends OnAppBridgeNotificationListener {

    /* renamed from: c, reason: collision with root package name */
    public a f32936c;

    /* renamed from: d, reason: collision with root package name */
    public b f32937d;

    /* renamed from: a, reason: collision with root package name */
    public final String f32935a = "rbx.datamodel";
    public final String b = "OPEN_YOUTUBE_VIDEO";

    /* renamed from: e, reason: collision with root package name */
    public vg.a f32938e = new vg.a();

    public interface a {
        void c(String str);
    }

    public interface b {
        rg.x0 a();
    }

    public n(a aVar, b bVar) {
        this.f32936c = aVar;
        this.f32937d = bVar;
    }

    public static /* synthetic */ void c(boolean z10, com.roblox.client.a aVar) {
        if (z10) {
            c2.b(aVar.getWindow());
            aVar.W1().o(u0.EXPERIENCE);
            if (rh.h.a().C3()) {
                aVar.getWindow().addFlags(128);
                return;
            }
            return;
        }
        aVar.W1().o(u0.APP);
        if (!rg.a1.R0(aVar.getResources().getConfiguration())) {
            c2.c(aVar.getWindow());
        }
        if (rh.h.a().C3()) {
            aVar.getWindow().clearFlags(128);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
    public void a(String str, String str2) {
        String str3;
        long j10;
        e4.q p8;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        ek.q.h("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            oh.g b10 = oh.g.b("PROFILE_TAG");
            b10.i(str2);
            b10.j(true);
            ev.c.d().j(b10);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            ev.c.d().j(new oh.g("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            oh.g gVar = new oh.g("ABUSE_REPORT_TAG");
            gVar.i(str2);
            gVar.j(true);
            ev.c.d().j(gVar);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            ev.c.d().j(new oh.c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new vi.e(this.f32937d.a(), "tabAvatar").g(this.f32938e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new vi.d(this.f32937d.a()).f(this.f32938e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f32936c.c(str2);
            if (rh.h.a().g2()) {
                d(str2);
            }
            if (TextUtils.isEmpty(str2) || !str2.equals("landing")) {
                return;
            }
            ek.q.h("rbx.datamodel", "Got callback to Java landing page, going to flush the client settings");
            com.roblox.client.startup.a.n();
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            oh.g b11 = oh.g.b("CUSTOM_WEBVIEW_TAG");
            b11.g(str2);
            b11.j(true);
            ev.c.d().j(b11);
            return;
        }
        if (rh.h.a().r1() && str.equals("POST_PURCHASE")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                oh.g b12 = oh.g.b("CUSTOM_WEBVIEW_TAG");
                b12.g(jSONObject.toString());
                b12.j(true);
                ev.c.d().j(b12);
                return;
            } catch (JSONException e10) {
                ek.q.e("rbx.datamodel", "POST_PURCHASE: failed to build JSON url=" + str2 + " error=" + e10.getMessage());
                return;
            }
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new vi.b(this.f32937d.a(), "tabMore").c(this.f32938e);
            return;
        }
        if (str.equals("SEARCH_GAMES")) {
            oh.g b13 = oh.g.b("SEARCH_GAMES_TAG");
            b13.i(str2);
            b13.j(true);
            ev.c.d().j(b13);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new vi.c(this.f32937d.a()).c(this.f32938e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            if (rh.h.a().g2()) {
                e();
            }
            FlagCacheUtils.flushPendingVersionBWrite(RobloxApplication.f());
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (rh.h.a().Z0()) {
                qh.b.c();
            }
            if (!rh.h.a().O5() || (p8 = this.f32937d.a().p()) == null) {
                return;
            }
            bi.i.p(p8);
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                ek.q.k("rbx.datamodel", "could not parse data");
                j10 = -1;
            }
            if (j10 != -1) {
                ev.c.d().j(new oh.f(j10));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            ev.c.d().j(new oh.g("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            oh.g a10 = oh.g.a("YOUTUBE_TAG", str2);
            a10.j(true);
            ev.c.d().j(a10);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            e4.q p10 = this.f32937d.a().p();
            if (p10 != null) {
                yj.k0.s(p10).J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            e4.q p11 = this.f32937d.a().p();
            if (p11 != null) {
                yj.k0.G(p11, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            e4.q p12 = this.f32937d.a().p();
            if (p12 != null) {
                yj.k0.s(p12).I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            if (rh.h.a().S1() && !ti.h.e().f()) {
                ti.b.f().o(b.d.LOGOUT_BY_USER_IN_LUA);
                uk.j.c().e(rg.a1.O(), rg.a1.g());
            }
            e4.q p13 = this.f32937d.a().p();
            if (p13 == null || !ti.h.e().f()) {
                return;
            }
            ti.b.f().i(p13, b.d.LOGOUT_BY_USER_IN_LUA);
            am.a.a().c();
            if (rh.h.a().w3()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            e4.q p14 = this.f32937d.a().p();
            if (p14 != null) {
                ti.b.f().j(p14);
                am.a.a().c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            e4.q p15 = this.f32937d.a().p();
            if (p15 == 0 || p15.isFinishing() || !(p15 instanceof xj.c)) {
                return;
            }
            ((xj.c) p15).k(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            e4.q p16 = this.f32937d.a().p();
            if (p16 != null) {
                p16.recreate();
                return;
            } else {
                ek.q.k("rbx.datamodel", "could not restart lua app");
                return;
            }
        }
        if (rh.h.a().f5() && str.equals("SET_STATUS_BAR_STYLE")) {
            try {
                final boolean optBoolean = new JSONObject(str2).optBoolean("hidden", false);
                e4.q p17 = this.f32937d.a().p();
                if (p17 instanceof com.roblox.client.a) {
                    final com.roblox.client.a aVar = (com.roblox.client.a) p17;
                    aVar.runOnUiThread(new Runnable() { // from class: uh.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c(optBoolean, aVar);
                        }
                    });
                    return;
                }
                return;
            } catch (JSONException e11) {
                ek.q.e("rbx.datamodel", "Failed to parse SET_STATUS_BAR_STYLE data: " + e11.getMessage());
                return;
            }
        }
        if (str.equals("HOME_PAGE_INTERACTIVE")) {
            ek.q.h("rbx.datamodel", "Got callback to Java for home page is ready to interact.");
            e4.q p18 = this.f32937d.a().p();
            if (p18 != null) {
                p18.reportFullyDrawn();
            }
            if (rh.h.a().O5() && p18 != null) {
                bi.i.o(p18);
            }
            com.roblox.client.startup.a.n();
            if (rh.h.a().s1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
                return;
            }
            return;
        }
        if (rh.h.a().T1() && str.equals("GAME_STREAMING_STATUS_CHANGED")) {
            try {
                boolean optBoolean2 = new JSONObject(str2).optBoolean("inGameStreaming", false);
                e4.q p19 = this.f32937d.a().p();
                if (p19 != null) {
                    if (optBoolean2) {
                        q0.f(p19);
                    } else {
                        q0.i(p19);
                    }
                }
            } catch (JSONException e12) {
                ek.q.e("rbx.datamodel", "Failed to parse GAME_STREAMING_STATUS_CHANGED data: " + e12.getMessage());
            }
        }
    }

    public final void d(String str) {
        str.getClass();
        if (str.equals("Startup")) {
            ug.j.q().k("luaStartup");
        } else if (str.equals("Landing")) {
            ug.j.q().k("luaLandingScreen");
        }
    }

    public final void e() {
        ug.j.q().k("luaHomeScreen");
    }

    public final void f(JSONObject jSONObject) {
        rg.q.b(jSONObject, this.f32937d.a().p());
    }

    public void g() {
        if (this.f32937d.a().p() != null) {
            am.a.a().b(new a.b() { // from class: uh.l
                @Override // am.a.b
                public final void a(JSONObject jSONObject) {
                    n.this.f(jSONObject);
                }
            });
        }
    }
}
