package oh;

import org.json.JSONObject;
import rg.a1;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public String f27856a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f27857c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f27858d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27859e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27860f;

    public g(String str) {
        this.f27856a = str;
    }

    public static g a(String str, String str2) {
        g gVar = new g(str);
        gVar.g(str2);
        return gVar;
    }

    public static g b(String str) {
        g gVar = new g(str);
        gVar.f27859e = true;
        return gVar;
    }

    public static String c(long j10) {
        if (j10 == -1) {
            return a1.B0();
        }
        return a1.g() + "users/" + j10 + "/profile/";
    }

    public String d() {
        return this.f27857c;
    }

    public JSONObject e() {
        return this.f27858d;
    }

    public boolean f() {
        return this.f27860f;
    }

    public void g(String str) {
        this.f27857c = str;
    }

    public void h(JSONObject jSONObject) {
        this.f27858d = jSONObject;
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(boolean z10) {
        this.f27860f = z10;
    }
}
