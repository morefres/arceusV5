package ti;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ci.i;
import ci.j;
import ci.m;
import ek.q;
import hj.u;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.t0;
import rg.y;
import si.a;
import vi.c;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public long f32263a = -1;
    public boolean b = false;

    public class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f32264a;

        public a(d dVar) {
            this.f32264a = dVar;
        }

        @Override // ci.l
        public void b(j jVar) {
            dk.c c10 = dk.c.c();
            int f10 = c10.f();
            boolean z10 = false;
            if (!jVar.a().isEmpty()) {
                try {
                    f10 = new JSONObject(jVar.a()).optInt("robux");
                    c10.t(f10);
                    z10 = true;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            d dVar = this.f32264a;
            if (dVar != null) {
                dVar.a(z10, f10);
            }
        }
    }

    public class b implements a.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f32265a;

        public b(f fVar) {
            this.f32265a = fVar;
        }

        @Override // si.a.d
        public void a() {
            this.f32265a.a();
        }
    }

    public class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.b f32266a;

        public c(c.b bVar) {
            this.f32266a = bVar;
        }

        @Override // ci.l
        public void b(j jVar) {
            q.h("rbx.login", "Logout: " + jVar);
            if (jVar.b() != 200) {
                t0.g("logout", jVar.e(), jVar.b(), -1);
                uk.j.c().e(a1.O(), a1.g());
            }
            c.b bVar = this.f32266a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface d {
        void a(boolean z10, int i10);
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final h f32267a = new h();
    }

    public interface f {
        void a();
    }

    public h() {
        k();
    }

    public static h e() {
        return e.f32267a;
    }

    public static boolean h() {
        return a1.T().getLong("userid_long", -1L) != -1;
    }

    public static JSONObject l() {
        SharedPreferences T = a1.T();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", T.getLong("userid_long", -1L));
            jSONObject.put("isUnder13", T.getBoolean("under13", true));
            jSONObject.put("username", T.getString("username", ""));
            jSONObject.put("displayName", T.getString("displayName", ""));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    public final void a(c.b bVar) {
        c cVar = new c(bVar);
        ci.g.a().a(a1.v0(), null, null, cVar).b();
    }

    public final void b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    public void c(Context context, boolean z10, c.b bVar) {
        if (z10) {
            a(bVar);
        }
        n(context);
        if (!z10 && rh.h.a().S1()) {
            uk.j.c().e(a1.O(), a1.g());
        }
        y.h().p().c();
    }

    public void d(m mVar) {
        dk.a aVar = new dk.a(mVar);
        aVar.b();
        g.a("activeSession");
        aVar.c();
    }

    public boolean f() {
        return this.b;
    }

    public long g() {
        return this.f32263a;
    }

    public boolean i() {
        return this.f32263a != -1;
    }

    public void j(Context context, String str, f fVar) {
        q.h("SessionManager", "didLoggedIn");
        this.b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f32263a = jSONObject.optLong("userId", this.f32263a);
                dk.c.c().v(this.f32263a);
                dk.c.c().q(jSONObject.optBoolean("isUnder13"));
                dk.c.c().w(jSONObject.optString("username", dk.c.c().k()));
                dk.c.c().o(jSONObject.optString("displayName", ""));
                r(false);
                dk.c.c().r(jSONObject.optInt("membershipType", 0));
                if (rh.h.a().l1()) {
                    dk.c.c().p(jSONObject.optBoolean("hasRobloxSubscription", false));
                }
                jSONObject.optString("countryCode", "");
                if (rh.h.a().u1()) {
                    y.h().d().i(Long.toString(this.f32263a));
                }
            } catch (JSONException e10) {
                q.j("onAccountInfoFromLua: Exception: + " + e10.getMessage());
            }
        }
        si.a aVar = new si.a(context, "PostLogin", this.f32263a, dk.c.c().k());
        aVar.g(new b(fVar));
        aVar.e();
    }

    public final void k() {
        SharedPreferences T = a1.T();
        String string = T.getString("username", "");
        String string2 = T.getString("displayName", "");
        long j10 = T.getLong("userid_long", -1L);
        this.f32263a = j10;
        if (j10 == -1) {
            this.f32263a = T.getInt("userid", -1);
        }
        dk.c.c().q(T.getBoolean("under13", true));
        dk.c.c().w(string);
        dk.c.c().o(string2);
    }

    public void m(d dVar, ci.f fVar) {
        fVar.b(a1.f(), null, new a(dVar)).b();
    }

    public final void n(Context context) {
        this.b = false;
        o(-1L);
        q();
        p();
        r(true);
        ch.b.b().a();
        dk.c.c().a();
        u.c().a();
        b(context);
    }

    public void o(long j10) {
        this.f32263a = j10;
    }

    public final void p() {
        a1.T().edit().remove("last_auth_cookie_expir_key").apply();
    }

    public final void q() {
        a1.T().edit().remove("user_logged_in_time").apply();
    }

    public final void r(boolean z10) {
        SharedPreferences.Editor edit = a1.T().edit();
        edit.remove("userid");
        if (z10) {
            edit.remove("userid_long");
            edit.remove("displayName");
            edit.remove("under13");
        } else {
            edit.putString("username", dk.c.c().k());
            edit.putString("displayName", dk.c.c().b());
            edit.putLong("userid_long", this.f32263a);
            edit.putBoolean("under13", dk.c.c().n());
        }
        edit.apply();
    }
}
