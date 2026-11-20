package fh;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f17245a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f17246c;

    /* renamed from: d, reason: collision with root package name */
    public String f17247d;

    /* renamed from: e, reason: collision with root package name */
    public String f17248e;

    /* renamed from: f, reason: collision with root package name */
    public String f17249f;

    /* renamed from: g, reason: collision with root package name */
    public String f17250g;

    /* renamed from: h, reason: collision with root package name */
    public String f17251h;

    /* renamed from: i, reason: collision with root package name */
    public String f17252i;

    /* renamed from: j, reason: collision with root package name */
    public String f17253j;

    /* renamed from: k, reason: collision with root package name */
    public String f17254k;

    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);

        c read();
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.b = str;
        this.f17246c = str2;
        this.f17247d = str3;
        this.f17248e = str4;
        l(str5);
        this.f17249f = str6;
        this.f17250g = str7;
        this.f17251h = str8;
        this.f17252i = str9;
        this.f17253j = str10;
    }

    public String a() {
        return this.f17247d;
    }

    public String b() {
        return this.f17248e;
    }

    public String c() {
        return this.f17246c;
    }

    public String d() {
        return this.f17250g;
    }

    public String e() {
        return this.f17252i;
    }

    public String f() {
        return this.f17253j;
    }

    public String g() {
        return this.f17251h;
    }

    public String h() {
        return this.b;
    }

    public JSONObject i() {
        return this.f17245a;
    }

    public String j() {
        return this.f17245a.toString();
    }

    public String k() {
        return this.f17249f;
    }

    public void l(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f17245a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f17245a == null) {
            this.f17245a = new JSONObject();
        }
    }

    public void m(String str) {
        this.f17247d = str;
    }

    public void n(String str) {
        this.f17254k = str;
    }

    public void o(String str) {
        this.f17252i = str;
    }

    public void p(String str) {
        this.f17253j = str;
    }

    public void q(String str) {
        this.f17251h = str;
    }

    public void r(String str) {
        this.b = str;
    }

    public void s(String str) {
        this.f17249f = str;
    }
}
