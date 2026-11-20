package com.roblox.client.startup;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import ci.n;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import nb.qe;
import ne.e0;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import rg.a1;
import yj.d0;
import yj.o2;
import yj.x;

/* loaded from: classes2.dex */
public class b {
    public static Cache b;

    /* renamed from: c, reason: collision with root package name */
    public static X509TrustManager f9529c;

    /* renamed from: d, reason: collision with root package name */
    public static SSLSocketFactory f9530d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9531e;

    /* renamed from: j, reason: collision with root package name */
    public static OkHttpClient f9536j;

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f9528a = new d0();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f9532f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final Object f9533g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f9534h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f9535i = false;

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReference<String> f9537k = new AtomicReference<>(null);

    /* renamed from: l, reason: collision with root package name */
    public static final e0<Boolean> f9538l = e0.H();

    /* renamed from: m, reason: collision with root package name */
    public static final a f9539m = new a();

    public static class a extends d0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Set<String> f9540c;

        static {
            Set<String> a10;
            a10 = qe.a(new Object[]{"dnsStart", "dnsEnd", "connectStart", "secureConnectStart", "secureConnectEnd", "connectEnd"});
            f9540c = a10;
        }

        @Override // okhttp3.EventListener
        public void connectFailed(@NonNull Call call, @NonNull InetSocketAddress inetSocketAddress, @NonNull Proxy proxy, Protocol protocol, @NonNull IOException iOException) {
            b.f9538l.D(Boolean.FALSE);
        }

        @Override // yj.d0, okhttp3.EventListener
        public void connectionAcquired(@NonNull Call call, @NonNull Connection connection) {
            if (connection.getProtocol() == Protocol.HTTP_2) {
                b.f9538l.D(Boolean.TRUE);
            }
        }

        @Override // yj.d0, okhttp3.EventListener
        public void connectionReleased(@NonNull Call call, @NonNull Connection connection) {
            b.f9538l.D(Boolean.TRUE);
        }

        @Override // yj.d0
        public void k(Pair<String, Long> pair) {
            if (f9540c.contains(pair.first)) {
                super.k(pair);
            }
        }

        public a() {
        }
    }

    public static C0154b b(Context context) {
        X509TrustManager x509TrustManager;
        Cache g10 = g(context);
        j();
        OkHttpClient.Builder newBuilder = h().newBuilder();
        d0 d0Var = f9528a;
        OkHttpClient.Builder cache = newBuilder.eventListener(d0Var).cache(g10);
        f(cache);
        SSLSocketFactory sSLSocketFactory = f9530d;
        if (sSLSocketFactory != null && (x509TrustManager = f9529c) != null) {
            cache.sslSocketFactory(sSLSocketFactory, x509TrustManager);
        }
        OkHttpClient build = cache.build();
        n();
        C0154b k10 = k(build);
        d0Var.j();
        e();
        return k10;
    }

    public static String c(Response response) {
        ResponseBody body;
        return (response == null || (body = response.body()) == null) ? "" : body.string();
    }

    public static Request d(String str) {
        Request.Builder url = new Request.Builder().url(str);
        url.addHeader("Pragma", "akamai-x-cache-on");
        return url.build();
    }

    public static void e() {
        synchronized (f9534h) {
            f9530d = null;
            f9529c = null;
        }
    }

    public static void f(OkHttpClient.Builder builder) {
        f9535i = false;
        if (x.m().H(o2.ZSTD)) {
            builder.addInterceptor(new di.b());
            builder.addInterceptor(new di.a());
            f9535i = true;
        }
        builder.dns(n.c());
    }

    public static Cache g(Context context) {
        Cache cache;
        synchronized (f9532f) {
            try {
                if (b == null) {
                    b = new Cache(context.getCacheDir(), 2097152L);
                }
                cache = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cache;
    }

    public static OkHttpClient h() {
        X509TrustManager x509TrustManager;
        synchronized (f9533g) {
            try {
                if (f9536j == null) {
                    a aVar = f9539m;
                    aVar.i();
                    OkHttpClient.Builder eventListener = new OkHttpClient.Builder().eventListener(aVar);
                    eventListener.dns(n.c());
                    SSLSocketFactory sSLSocketFactory = f9530d;
                    if (sSLSocketFactory != null && (x509TrustManager = f9529c) != null) {
                        eventListener.sslSocketFactory(sSLSocketFactory, x509TrustManager);
                    }
                    f9536j = eventListener.build();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9536j;
    }

    public static String i() {
        AtomicReference<String> atomicReference = f9537k;
        t.a(atomicReference, null, a1.d(false));
        return atomicReference.get();
    }

    public static void j() {
        synchronized (f9534h) {
            try {
                try {
                } finally {
                }
            } catch (IllegalStateException e10) {
                e = e10;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9531e = true;
                f9530d = null;
                f9529c = null;
            } catch (KeyManagementException e11) {
                e = e11;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9531e = true;
                f9530d = null;
                f9529c = null;
            } catch (KeyStoreException e12) {
                e = e12;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9531e = true;
                f9530d = null;
                f9529c = null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                q.f("ClientSettingsRequest", "Error initializing the SSL Socket Factory: " + e.getLocalizedMessage(), e);
                f9531e = true;
                f9530d = null;
                f9529c = null;
            }
            if (!f9531e && (f9530d == null || f9529c == null)) {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                int length = trustManagers.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    TrustManager trustManager = trustManagers[i10];
                    if (trustManagers[0] instanceof X509TrustManager) {
                        f9529c = (X509TrustManager) trustManager;
                        break;
                    }
                    i10++;
                }
                if (f9529c == null) {
                    throw new IllegalStateException("Could not find X509TrustManager in TrustManagerFactory");
                }
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{f9529c}, null);
                f9530d = sSLContext.getSocketFactory();
            }
        }
    }

    public static C0154b k(OkHttpClient okHttpClient) {
        C0154b c0154b;
        Response m10;
        try {
            try {
                m10 = m(okHttpClient.newCall(d(a1.d(f9535i))).execute());
                try {
                } catch (Throwable th2) {
                    if (m10 != null) {
                        try {
                            m10.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } finally {
                ci.b.b().c();
            }
        } catch (IOException unused) {
            c0154b = new C0154b("", "");
        }
        if (!f9535i || (m10 != null && m10.getIsSuccessful())) {
            c0154b = new C0154b(c(m10), m10.header("X-Signature-Ed25519", ""));
            m10.close();
            return c0154b;
        }
        f9528a.i();
        Response m11 = m(okHttpClient.newCall(d(a1.d(false))).execute());
        try {
            C0154b c0154b2 = new C0154b(c(m11), m11.header("X-Signature-Ed25519", ""));
            m11.close();
            if (m10 != null) {
                m10.close();
            }
            return c0154b2;
        } finally {
        }
    }

    public static void l() {
        q.h("ClientSettingsRequest", "Pre-warm connection failed");
        f9538l.D(Boolean.FALSE);
    }

    public static Response m(Response response) {
        if (response == null) {
            return null;
        }
        if (response.cacheResponse() != null && response.networkResponse() != null && response.networkResponse().code() == 304) {
            f9528a.a();
        } else if (response.cacheResponse() != null && response.networkResponse() == null) {
            f9528a.b();
        } else if (response.networkResponse() != null && response.getIsSuccessful()) {
            f9528a.c();
        }
        String header = response.header("Content-Encoding");
        if ("dcz".equals(header)) {
            f9528a.l();
        } else if ("zst".equals(header)) {
            f9528a.m();
        }
        if (response.networkResponse() != null) {
            String header2 = response.networkResponse().header("X-Cache");
            if (!TextUtils.isEmpty(header2)) {
                String lowerCase = header2.toLowerCase();
                if (lowerCase.startsWith("tcp_hit") || lowerCase.startsWith("tcp_ims_hit") || lowerCase.startsWith("tcm_mem_hit") || lowerCase.startsWith("hit from cloudfront")) {
                    f9528a.e();
                } else if (lowerCase.startsWith("tcp_refresh_hit") || lowerCase.startsWith("refreshhit from cloudfront")) {
                    f9528a.g();
                } else if (lowerCase.startsWith("tcp_miss") || lowerCase.startsWith("tcp_refresh_miss") || lowerCase.startsWith("miss from cloudfront")) {
                    f9528a.f();
                }
                if (lowerCase.contains("cloudfront")) {
                    f9528a.h();
                    return response;
                }
                if (lowerCase.startsWith("tcp")) {
                    f9528a.d();
                }
            }
        }
        return response;
    }

    public static void n() {
        try {
            try {
                String str = f9537k.get();
                if (str != null && str.startsWith(a1.c())) {
                    d0 d0Var = f9528a;
                    d0Var.n();
                    if (f9538l.get(2147483647L, TimeUnit.MILLISECONDS).booleanValue()) {
                        LoggingProtocol.k("tlsPreWarmSuccess");
                        f9539m.j();
                    }
                    d0Var.o();
                    return;
                }
                q.h("ClientSettingsRequest", "Not waiting for connection, as flag URL has changed: " + a1.c());
            } finally {
                f9528a.o();
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            q.k("ClientSettingsRequest", "Timed out waiting to establish connection: " + e10);
        }
    }

    /* renamed from: com.roblox.client.startup.b$b, reason: collision with other inner class name */
    public static class C0154b {

        /* renamed from: a, reason: collision with root package name */
        public final String f9541a;
        public JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        public final String f9542c;

        /* renamed from: d, reason: collision with root package name */
        public final long f9543d;

        public C0154b(String str, String str2, long j10) {
            this.f9541a = str;
            this.f9542c = str2;
            this.f9543d = j10;
        }

        public static JSONObject a(String str) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                q.k("ClientSettingsRequest", "can't parse flag json.");
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("applicationSettings")) {
                return null;
            }
            return jSONObject.optJSONObject("applicationSettings");
        }

        public long b() {
            return this.f9543d;
        }

        public JSONObject c() {
            if (this.b == null) {
                this.b = a(d());
            }
            return this.b;
        }

        public String d() {
            return this.f9541a;
        }

        public String e() {
            return this.f9542c;
        }

        public C0154b(String str, String str2) {
            this(str, str2, 0L);
        }
    }
}
