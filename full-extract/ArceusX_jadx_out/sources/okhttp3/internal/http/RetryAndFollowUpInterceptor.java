package okhttp3.internal.http;

import androidx.core.app.NotificationCompat;
import com.google.mlkit.common.MlKitException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "recover", "", "e", "Ljava/io/IOException;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "userRequest", "Lokhttp3/Request;", "requestIsOneShot", "isRecoverable", "requestSendStarted", "followUpRequest", "userResponse", "exchange", "Lokhttp3/internal/connection/Exchange;", "buildRedirectRequest", "method", "", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;

    @NotNull
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.c(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z10 = httpMethod.redirectsWithBody(method) || code == 308 || code == 307;
            if (!httpMethod.redirectsToGet(method) || code == 308 || code == 307) {
                newBuilder.method(method, z10 ? userResponse.request().body() : null);
            } else {
                newBuilder.method("GET", null);
            }
            if (!z10) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (code == 421) {
                RequestBody body = userResponse.request().body();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (code == 503) {
                Response priorResponse = userResponse.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (code == 407) {
                Intrinsics.checkNotNull(route);
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody body2 = userResponse.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = userResponse.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (code) {
                case MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE /* 300 */:
                case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final boolean isRecoverable(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        return e10 instanceof InterruptedIOException ? (e10 instanceof SocketTimeoutException) && !requestSendStarted : (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException e10, RealCall call, Request userRequest) {
        boolean z10 = e10 instanceof ConnectionShutdownException;
        boolean z11 = !z10;
        if (this.client.retryOnConnectionFailure()) {
            return (z10 || !requestIsOneShot(e10, userRequest)) && isRecoverable(e10, z11) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e10, Request userRequest) {
        RequestBody body = userRequest.body();
        return (body != null && body.isOneShot()) || (e10 instanceof FileNotFoundException);
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").f(header$default)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(header$default);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r12.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.priorResponse(r6).build();
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r7.body());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r8 > 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r0.getIsDuplex() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        r6 = null;
     */
    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r12) {
        /*
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.http.RealInterceptorChain r12 = (okhttp3.internal.http.RealInterceptorChain) r12
            okhttp3.Request r0 = r12.getRequest()
            okhttp3.internal.connection.RealCall r1 = r12.getCall()
            java.util.List r2 = kotlin.collections.p.k()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.enterNetworkInterceptorExchange(r0, r6, r12)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Ld2
            okhttp3.Response r6 = r12.proceed(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> Lb3
            okhttp3.Response$Builder r6 = r6.newBuilder()     // Catch: java.lang.Throwable -> L35
            okhttp3.Response$Builder r0 = r6.request(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L39
            okhttp3.Response r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r12 = move-exception
            r3 = r5
            goto Lda
        L39:
            r6 = r4
        L3a:
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L35
            okhttp3.Response r7 = r0.build()     // Catch: java.lang.Throwable -> L35
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L35
            okhttp3.Request r6 = r11.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L65
            if (r0 == 0) goto L57
            boolean r12 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L57
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L35
        L57:
            okhttp3.EventListener r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L62
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L62:
            r12 = move-exception
            goto Lda
        L65:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            okhttp3.EventListener r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L62
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L7c:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L35
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L95
            okhttp3.EventListener r0 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r0.followUpDecision(r1, r7, r6)     // Catch: java.lang.Throwable -> L35
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r0 = r6
            goto L18
        L95:
            okhttp3.EventListener r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L35
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            r0.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lb3:
            r6 = move-exception
            boolean r9 = r11.recover(r6, r1, r0)     // Catch: java.lang.Throwable -> L35
            okhttp3.EventListener r10 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r10.retryDecision(r1, r6, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto Lcd
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L35
            java.util.List r2 = kotlin.collections.CollectionsKt.x0(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r6 = r3
            goto L19
        Lcd:
            java.lang.Throwable r12 = okhttp3.internal._UtilCommonKt.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld2:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lda:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
