package rk;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public String f30680a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f30681c;

    /* renamed from: d, reason: collision with root package name */
    public String f30682d;

    public abstract void a(boolean z10, JSONObject jSONObject);

    public String b() {
        return this.f30682d;
    }

    public abstract Context c();

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f30680a;
    }

    public JSONObject f() {
        if (this.f30681c == null) {
            this.f30681c = new JSONObject();
        }
        return this.f30681c;
    }

    public void g(String str) {
        this.f30682d = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.f30680a = str;
    }

    public void j(JSONObject jSONObject) {
        this.f30681c = jSONObject;
    }
}
