package xk;

import iv.e;
import iv.y;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public String f35597a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public OkHttpClient f35598c;

    /* renamed from: d, reason: collision with root package name */
    public e.a f35599d;

    public l(String str, String str2) {
        this.b = str;
        this.f35597a = str2 == null ? c() : str2;
    }

    public T a(Class<T> cls) {
        try {
            return (T) b(d(this.b, this.f35597a)).b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) b(d(this.b, c())).b(cls);
        }
    }

    public y b(String str) {
        y.b bVar = new y.b();
        bVar.c(str);
        bVar.g(this.f35598c);
        e.a aVar = this.f35599d;
        if (aVar != null) {
            bVar.a(aVar);
        }
        bVar.b(jv.a.f());
        return bVar.e();
    }

    public String c() {
        return "roblox.com";
    }

    public String d(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    public l<T> e(e.a aVar) {
        this.f35599d = aVar;
        return this;
    }

    public l<T> f(OkHttpClient okHttpClient) {
        this.f35598c = okHttpClient;
        return this;
    }
}
