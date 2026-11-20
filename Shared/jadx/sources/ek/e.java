package ek;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public String f16039a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f16040c;

    /* renamed from: d, reason: collision with root package name */
    public String f16041d;

    public e(String str) {
        q.h("rbx.baseurl", "Incoming base url: " + str);
        String f10 = f(e(str));
        if (f10.startsWith("www.")) {
            this.f16039a = f10;
            this.f16040c = f10.substring(4);
        } else {
            this.f16039a = "www." + f10;
            this.f16040c = f10;
        }
        this.b = this.f16039a + "/";
        this.f16041d = this.f16040c + "/";
    }

    public String a() {
        return this.f16040c;
    }

    public String b() {
        return this.f16041d;
    }

    public String c() {
        return this.f16039a;
    }

    public String d() {
        return this.b;
    }

    public final String e(String str) {
        return Pattern.compile("^http:/*|^https:/*", 2).matcher(str).replaceFirst("");
    }

    public final String f(String str) {
        return str.replaceAll("/+$", "");
    }

    public String toString() {
        return "BaseUrl{url='" + this.f16039a + "'}";
    }
}
