package wk;

import ek.q;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class b implements Interceptor {
    public static String b;

    /* renamed from: a, reason: collision with root package name */
    public final String f34352a = "rbx.platform";

    public static String a() {
        return b;
    }

    public static void c(String str) {
        b = str;
    }

    public final Request b(Request request, String str) {
        if (str == null || !request.method().equals("POST")) {
            return request;
        }
        q.b("rbx.platform", "XSRFTokenInterceptor.putXSRFTokenInRequest() token:" + a());
        return request.newBuilder().header("X-CSRF-TOKEN", str).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String header;
        Response proceed = chain.proceed(b(chain.request(), a()));
        if (proceed.code() == 403 && (header = proceed.header("X-CSRF-TOKEN")) != null) {
            q.b("rbx.platform", "XSRFTokenInterceptor.intercept() new token:" + header);
            c(header);
        }
        return proceed;
    }
}
