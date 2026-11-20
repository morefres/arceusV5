package uk;

import ek.q;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes2.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public CookieJar f32983a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f32984c;

    /* renamed from: d, reason: collision with root package name */
    public String f32985d;

    public class a implements HttpLoggingInterceptor.Logger {
        public a() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
        public void log(String str) {
            q.b("rbx.http", str);
        }
    }

    public c() {
        this(null);
    }

    @Override // uk.f
    public OkHttpClient a() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        String str = this.f32985d;
        if (str != null) {
            builder.addNetworkInterceptor(new wk.a(str));
        }
        builder.addNetworkInterceptor(new wk.b());
        long j10 = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit);
        builder.readTimeout(this.f32984c, timeUnit);
        CookieJar cookieJar = this.f32983a;
        if (cookieJar == null) {
            cookieJar = j.c();
        }
        builder.cookieJar(cookieJar);
        builder.followRedirects(false);
        return builder.build();
    }

    public c(CookieJar cookieJar) {
        this(cookieJar, 30, 30, tk.g.e());
    }

    public c(CookieJar cookieJar, int i10, int i11, String str) {
        this.f32983a = cookieJar;
        this.b = i10;
        this.f32984c = i11;
        this.f32985d = str;
    }
}
