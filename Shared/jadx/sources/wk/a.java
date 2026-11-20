package wk;

import ek.q;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class a implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f34351a;

    public a(String str) {
        this.f34351a = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        q.b("rbx.platform", "UserAgentInterceptor.intercept()");
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f34351a).build());
    }
}
