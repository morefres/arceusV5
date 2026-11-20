package com.roblox.client.game;

import android.text.TextUtils;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ek.q;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.q0;
import rh.h;
import uh.k;
import uh.x0;
import yj.q2;

/* loaded from: classes2.dex */
public class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f9129a = "rbx.game.callback";
    public final InterfaceC0144a b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f9130c;

    /* renamed from: com.roblox.client.game.a$a, reason: collision with other inner class name */
    public interface InterfaceC0144a {
        void g(boolean z10);

        void h(long j10, String str, NativePurchaseContext nativePurchaseContext);

        void i(int i10);

        void j(long j10, String str, String str2);

        void k(String str, String str2, String str3);

        void l(long j10, String str, String str2);

        void m(long j10, String str, String str2);

        void n(long j10, String str, String str2, String str3);

        default void q() {
        }

        void r(long j10);

        void s(long j10, String str);

        void t(int i10);
    }

    public a(InterfaceC0144a interfaceC0144a, x0 x0Var) {
        this.b = interfaceC0144a;
        this.f9130c = x0Var;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void a(int i10) {
        q.h("rbx.game.callback", "exitGameWithError: errorID = " + i10);
        this.b.t(w(i10));
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void b(long j10) {
        q.h("rbx.game.callback", "gameLoadedCallback() " + j10);
        this.b.r(j10);
        com.roblox.client.startup.a.n();
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void e(String str) {
        this.b.g(true);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void f(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        q.h("rbx.game.callback", sb2.toString());
        if (!"OPEN_CUSTOM_WEBVIEW".equals(str)) {
            if (h.a().x3() && "NATIVE_EXIT".equals(str) && q2.b()) {
                this.b.q();
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("url");
            if (optString.isEmpty()) {
                q.k("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                return;
            }
            String optString2 = jSONObject.optString(Title.type);
            JSONObject optJSONObject = jSONObject.optJSONObject("searchParams");
            this.b.k(optString, optString2, optJSONObject != null ? optJSONObject.toString() : null);
        } catch (JSONException unused) {
            q.k("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void j(long j10, String str) {
        this.b.s(j10, str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void k(long j10, String str, String str2) {
        this.b.l(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void l(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        this.b.h(j10, str, nativePurchaseContext);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void m(long j10, String str, String str2) {
        this.b.j(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void n(long j10, String str, String str2) {
        this.b.m(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void o(long j10, String str, String str2, String str3) {
        this.b.n(j10, str, str2, str3);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void q(int i10) {
        if (a1.q0()) {
            q.b("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i10 == 0) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.b.i(8);
            return;
        }
        if (i10 == 1) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.b.i(0);
            return;
        }
        if (i10 == 2) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.b.i(6);
            return;
        }
        if (i10 == 3) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.b.i(7);
        } else if (i10 == 4) {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.b.i(2);
        } else {
            q.b("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i10);
        }
    }

    @Override // uh.k
    public x0 s() {
        return this.f9130c;
    }

    public final int w(int i10) {
        if (i10 == 3) {
            return q0.f30516y0;
        }
        if (i10 == 4) {
            return q0.f30519z0;
        }
        if (i10 == 5) {
            return q0.A0;
        }
        if (i10 == 6) {
            return q0.B0;
        }
        switch (i10) {
            case 10:
                return q0.F0;
            case 11:
                return q0.D0;
            case 12:
                return q0.C0;
            default:
                q.k("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i10 + "].");
                return q0.E0;
        }
    }
}
