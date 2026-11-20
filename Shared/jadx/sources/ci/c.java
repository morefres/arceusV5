package ci;

import android.content.Context;
import ci.j;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static uk.j f4947a;

    public static class a {
    }

    public static void a() {
        f4947a = null;
        CookieHandler.setDefault(null);
    }

    public static j b(String str, String str2, a[] aVarArr, String str3) {
        return d(tk.g.b(), str, str2, aVarArr, str3);
    }

    public static j c(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        OkHttpClient b = tk.g.b();
        if (i10 >= 0 || i11 >= 0) {
            OkHttpClient.Builder newBuilder = b.newBuilder();
            if (i10 >= 0) {
                newBuilder.connectTimeout(i10, TimeUnit.MILLISECONDS);
            }
            if (i11 >= 0) {
                newBuilder.readTimeout(i11, TimeUnit.MILLISECONDS);
            }
            b = newBuilder.build();
        }
        return d(b, str, str2, aVarArr, str3);
    }

    public static j d(OkHttpClient okHttpClient, String str, String str2, a[] aVarArr, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        if (aVarArr != null && aVarArr.length > 0) {
            a aVar = aVarArr[0];
            throw null;
        }
        j jVar = new j();
        jVar.f4949a = str2 == null ? j.a.GET : j.a.POST;
        jVar.f4950c = str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                str4 = str;
            } catch (NullPointerException unused) {
                ek.q.k("rbx.httpagent", "null url in newCall()");
            }
        } catch (SSLHandshakeException e10) {
            e = e10;
            str4 = str;
        } catch (IOException e11) {
            e = e11;
            str4 = str;
        }
        try {
            Response a10 = new uk.g().a(okHttpClient, str4, str2, hashMap, str3);
            jVar.f4952e = a10.code();
            jVar.d(a10.body().string());
            jVar.c(a10.header("Last-Modified", ""));
        } catch (SSLHandshakeException e12) {
            e = e12;
            ek.q.k("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str4 + ", exception = " + e);
            jVar.f4954g = true;
            jVar.f4953f = System.currentTimeMillis() - currentTimeMillis;
            return jVar;
        } catch (IOException e13) {
            e = e13;
            ek.q.k("rbx.httpagent", "IOException initial newCall(): url = " + str4 + ", exception = " + e);
            jVar.f4953f = System.currentTimeMillis() - currentTimeMillis;
            return jVar;
        }
        jVar.f4953f = System.currentTimeMillis() - currentTimeMillis;
        return jVar;
    }

    public static void e(Context context) {
        if (f4947a == null) {
            uk.j c10 = uk.j.c();
            f4947a = c10;
            CookieHandler.setDefault(c10);
        }
    }

    public static void f(File file, String str) {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static j i(String str, String str2, a[] aVarArr) {
        return k(str, str2, aVarArr, null);
    }

    public static j j(String str, String str2, a[] aVarArr, String str3) {
        return k(str, str2, aVarArr, str3);
    }

    public static j k(String str, String str2, a[] aVarArr, String str3) {
        return b(str, str2, aVarArr, str3);
    }

    public static j l(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        return c(str, str2, aVarArr, str3, i10, i11);
    }
}
