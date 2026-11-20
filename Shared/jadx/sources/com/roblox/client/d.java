package com.roblox.client;

import android.content.Context;
import androidx.annotation.NonNull;
import ci.g;
import ci.j;
import ci.l;
import ek.c0;
import ek.d0;
import ek.q;
import ek.t;
import org.json.JSONObject;
import rg.a1;

/* loaded from: classes2.dex */
public class d {
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f9056c;

    /* renamed from: a, reason: collision with root package name */
    public e f9055a = new e();

    /* renamed from: d, reason: collision with root package name */
    public f f9057d = f.UnKnown;

    /* renamed from: e, reason: collision with root package name */
    public String f9058e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f9059f = "";

    public class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0141d f9060a;

        public a(InterfaceC0141d interfaceC0141d) {
            this.f9060a = interfaceC0141d;
        }

        @Override // ci.l
        public void a(j jVar) {
        }

        @Override // ci.l
        public void b(j jVar) {
            d.this.c(jVar);
            InterfaceC0141d interfaceC0141d = this.f9060a;
            if (interfaceC0141d != null) {
                interfaceC0141d.a(d.this.f9055a);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9061a = new d(new d0());
    }

    public static abstract class c implements InterfaceC0141d {
        @Override // com.roblox.client.d.InterfaceC0141d
        public void b(e eVar) {
        }
    }

    /* renamed from: com.roblox.client.d$d, reason: collision with other inner class name */
    public interface InterfaceC0141d {
        void a(e eVar);

        void b(e eVar);
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public f f9062a = f.UnKnown;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f9063c;

        public boolean a() {
            return this.f9062a == f.NewAppRequired;
        }

        public boolean b() {
            return this.f9062a == f.Recommended;
        }

        public boolean c() {
            return this.f9062a == f.Required;
        }

        public void d() {
            this.f9062a = f.Recommended;
        }

        public void e() {
            this.f9062a = f.Required;
        }

        public void f() {
            this.f9062a = f.NotRequired;
        }
    }

    public enum f {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    public d(c0 c0Var) {
        this.f9056c = c0Var;
    }

    public static d e() {
        return b.f9061a;
    }

    public void b(InterfaceC0141d interfaceC0141d) {
        Context f10;
        if (t.j() && interfaceC0141d != null && (f10 = RobloxApplication.f()) != null && mh.b.a()) {
            ah.b bVar = new ah.b();
            bVar.c(f10);
            if (bVar.getEnabled()) {
                interfaceC0141d.a(bVar.getUpgradeCheckResult());
                return;
            }
        }
        f fVar = this.f9057d;
        f fVar2 = f.UnKnown;
        if (fVar != fVar2) {
            q.h("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f9057d);
            e eVar = this.f9055a;
            eVar.f9062a = this.f9057d;
            this.f9057d = fVar2;
            eVar.b = this.f9058e;
            this.f9058e = "";
            eVar.f9063c = this.f9059f;
            this.f9059f = "";
            this.b = this.f9056c.b();
            if (interfaceC0141d != null) {
                interfaceC0141d.a(this.f9055a);
                return;
            }
            return;
        }
        long b10 = this.f9056c.b() - this.b;
        if (t.j()) {
            e eVar2 = this.f9055a;
            if (eVar2.f9062a == f.NewAppRequired) {
                if (b10 < 3600000) {
                    if (interfaceC0141d != null) {
                        interfaceC0141d.a(eVar2);
                        return;
                    }
                    return;
                }
                this.f9055a.f9062a = fVar2;
                q.h("UpgradeCheckHelper", "Perform upgrade check with the server...");
                ci.d b11 = g.a().b(a1.Z0(), null, new a(interfaceC0141d));
                b11.g(new fi.b());
                b11.b();
            }
        }
        if (this.f9055a.f9062a != fVar2 && b10 < 3600000) {
            q.b("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + b10 + " ms.");
            if (interfaceC0141d != null) {
                interfaceC0141d.b(this.f9055a);
                return;
            }
            return;
        }
        this.f9055a.f9062a = fVar2;
        q.h("UpgradeCheckHelper", "Perform upgrade check with the server...");
        ci.d b112 = g.a().b(a1.Z0(), null, new a(interfaceC0141d));
        b112.g(new fi.b());
        b112.b();
    }

    public final void c(j jVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject(jVar.a());
            jSONObject2 = jSONObject.getJSONObject("data");
        } catch (Exception e10) {
            q.k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
        }
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("UpgradeAction");
        int hashCode = string.hashCode();
        if (hashCode == -1189181893) {
            if (string.equals("Recommended")) {
                this.f9055a.f9062a = f.Recommended;
                this.f9055a.b = jSONObject.optString("upgradeSource", "");
                this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
                this.b = this.f9056c.b();
                return;
            }
            this.f9055a.f9062a = f.NotRequired;
            this.f9055a.b = jSONObject.optString("upgradeSource", "");
            this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
            this.b = this.f9056c.b();
            return;
        }
        if (hashCode == -328495169) {
            if (string.equals("Required")) {
                this.f9055a.f9062a = f.Required;
                this.f9055a.b = jSONObject.optString("upgradeSource", "");
                this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
                this.b = this.f9056c.b();
                return;
            }
            this.f9055a.f9062a = f.NotRequired;
            this.f9055a.b = jSONObject.optString("upgradeSource", "");
            this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
            this.b = this.f9056c.b();
            return;
        }
        if (hashCode == -144187584 && string.equals("NewAppRequired")) {
            this.f9055a.f9062a = f.NewAppRequired;
            this.f9055a.b = jSONObject.optString("upgradeSource", "");
            this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
            this.b = this.f9056c.b();
            return;
        }
        this.f9055a.f9062a = f.NotRequired;
        this.f9055a.b = jSONObject.optString("upgradeSource", "");
        this.f9055a.f9063c = jSONObject.optString("MD5Sum", "");
        this.b = this.f9056c.b();
        return;
        q.k("UpgradeCheckHelper", "evaluateResponse: Exception caught: " + e10);
    }

    @NonNull
    public e d() {
        return this.f9055a;
    }

    public boolean f() {
        f fVar = this.f9057d;
        f fVar2 = f.Required;
        boolean z10 = fVar == fVar2;
        boolean z11 = this.f9055a.f9062a == fVar2;
        q.i("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    public void g(e eVar) {
        q.h("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + eVar.f9062a);
        this.f9057d = eVar.f9062a;
        this.f9058e = eVar.b;
        this.f9059f = eVar.f9063c;
    }
}
