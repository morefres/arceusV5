package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b'\u0018\u0000 D*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001DBS\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B1\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0017B;\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u0010H%¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H%¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH$¢\u0006\u0004\b(\u0010!J\u000f\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J\u000f\u0010#\u001a\u00020\u001fH\u0010¢\u0006\u0004\b#\u0010!J\u0017\u0010-\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020,H\u0015¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0015¢\u0006\u0004\b/\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u000200H\u0015¢\u0006\u0004\b*\u00101J\u000f\u00102\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u0010\u001bR\u001a\u0010*\u001a\u00020\b8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\u00020\n8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010-\u001a\u00020\f8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010#\u001a\u00020\u000e8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b(\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010@R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010C"}, d2 = {"Lcom/appsflyer/internal/AFe1kSDK;", "Result", "Lcom/appsflyer/internal/AFe1ySDK;", "Lcom/appsflyer/internal/AFd1fSDK;", "Lcom/appsflyer/internal/AFe1zSDK;", "p0", "", "p1", "Lcom/appsflyer/internal/AFd1sSDK;", "p2", "Lcom/appsflyer/internal/AFf1fSDK;", "p3", "Lcom/appsflyer/internal/AFd1uSDK;", "p4", "Lcom/appsflyer/internal/AFc1vSDK;", "p5", "", "p6", "Lcom/appsflyer/internal/AFi1vSDK;", "p7", "<init>", "(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFd1uSDK;Lcom/appsflyer/internal/AFc1vSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFi1vSDK;)V", "Lcom/appsflyer/internal/AFc1bSDK;", "(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V", "(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;Ljava/lang/String;)V", "", "w", "()V", "Lcom/appsflyer/internal/AFd1cSDK;", "registerClient", "()Lcom/appsflyer/internal/AFd1cSDK;", "", "a_", "()Z", "Lcom/appsflyer/internal/AFd1pSDK;", "AFLogger", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "e", "", rl.d.f30696a, "()J", "", "AFKeystoreWrapper", "(Ljava/lang/Throwable;)V", "force", "Lcom/appsflyer/internal/AFd1oSDK;", "(Lcom/appsflyer/internal/AFd1oSDK;)V", "AppsFlyerLib", "Lcom/appsflyer/internal/AFd1sSDK;", "afDebugLog", "()Lcom/appsflyer/internal/AFd1sSDK;", "v", "Lcom/appsflyer/internal/AFf1fSDK;", "afInfoLog", "()Lcom/appsflyer/internal/AFf1fSDK;", "unregisterClient", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFd1uSDK;", "afErrorLog", "()Lcom/appsflyer/internal/AFd1uSDK;", "Lcom/appsflyer/internal/AFc1vSDK;", "Lcom/appsflyer/internal/AFi1vSDK;", "i", "Lcom/appsflyer/internal/AFd1fSDK;", "Ljava/lang/String;", "AFa1vSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFe1kSDK<Result> extends AFe1ySDK<AFd1fSDK<Result>> {

    /* renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFd1uSDK AFKeystoreWrapper;

    /* renamed from: afDebugLog, reason: from kotlin metadata */
    @Nullable
    private final AFi1vSDK registerClient;

    /* renamed from: afWarnLog, reason: from kotlin metadata */
    @Nullable
    private String i;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    protected AFc1vSDK AFLogger;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK d;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AFd1fSDK<Result> v;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFf1fSDK unregisterClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1kSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFd1uSDK aFd1uSDK, @NotNull AFc1vSDK aFc1vSDK, @Nullable String str, @Nullable AFi1vSDK aFi1vSDK) {
        super(aFe1zSDK, aFe1zSDKArr, str);
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        this.d = aFd1sSDK;
        this.unregisterClient = aFf1fSDK;
        this.AFKeystoreWrapper = aFd1uSDK;
        this.AFLogger = aFc1vSDK;
        this.registerClient = aFi1vSDK;
    }

    private static void AppsFlyerLib() {
        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false, false, false, 96, null);
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final void AFKeystoreWrapper(@NotNull Throwable p02) {
        String str = "";
        Intrinsics.checkNotNullParameter(p02, "");
        boolean z10 = p02 instanceof HttpException;
        boolean z11 = !z10;
        if (p02 instanceof AFe1qSDK) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", p02, true, false, false, false, 96, null);
        } else {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.HTTP_CLIENT;
            AFLoggerBase.e$default(aFLogger, logTag, "Error while sending request to server: " + p02, p02, false, false, z11, false, 64, null);
            AFLoggerBase.w$default(aFLogger, logTag, "Error while sending request to server: " + p02, false, 4, null);
        }
        AppsFlyerRequestListener afWarnLog = afWarnLog();
        if (afWarnLog == null) {
            return;
        }
        if (z10) {
            str = AFe1hSDK.unregisterClient((HttpException) p02, this.registerClient);
        } else {
            String message = p02.getMessage();
            if (message != null) {
                str = message;
            }
        }
        afWarnLog.onError(40, str);
    }

    @Nullable
    public abstract AFd1pSDK<Result> AFLogger(@NotNull String p02);

    @Override // com.appsflyer.internal.AFe1ySDK
    public boolean AFLogger() {
        if (getV() instanceof AFe1qSDK) {
            return false;
        }
        if (this.e == AFd1cSDK.unregisterClient) {
            return true;
        }
        Throwable v5 = getV();
        return (v5 instanceof IOException) && !(v5 instanceof ParsingException);
    }

    public boolean a_() {
        return true;
    }

    @NotNull
    /* renamed from: afDebugLog, reason: from getter */
    public final AFd1sSDK getD() {
        return this.d;
    }

    @NotNull
    /* renamed from: afErrorLog, reason: from getter */
    public final AFd1uSDK getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    @NotNull
    /* renamed from: afInfoLog, reason: from getter */
    public final AFf1fSDK getUnregisterClient() {
        return this.unregisterClient;
    }

    @Nullable
    public abstract AppsFlyerRequestListener afWarnLog();

    @Override // com.appsflyer.internal.AFe1ySDK
    public long d() {
        return RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
    }

    public abstract boolean e();

    @Override // com.appsflyer.internal.AFe1ySDK
    public void force() {
        String str;
        if ((this.e == AFd1cSDK.f5311d || !AFLogger()) && (str = this.i) != null) {
            this.AFLogger.AFLogger(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public AFd1cSDK registerClient() {
        if (a_() && this.unregisterClient.AFLogger()) {
            AppsFlyerRequestListener afWarnLog = afWarnLog();
            if (afWarnLog != null) {
                afWarnLog.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1qSDK();
        }
        AFf1fSDK aFf1fSDK = this.unregisterClient;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str == null || StringsKt.p0(str)) {
            AppsFlyerRequestListener afWarnLog2 = afWarnLog();
            if (afWarnLog2 != null) {
                afWarnLog2.onError(41, "No dev key");
            }
            throw new AFe1uSDK();
        }
        AFd1pSDK<Result> AFLogger = AFLogger(str);
        if (AFLogger == null) {
            AppsFlyerLib();
            return AFd1cSDK.registerClient;
        }
        if (e()) {
            AFd1oSDK aFd1oSDK = AFLogger.unregisterClient;
            Intrinsics.checkNotNullExpressionValue(aFd1oSDK, "");
            d(aFd1oSDK);
        }
        AFd1fSDK<Result> AFKeystoreWrapper = AFLogger.AFKeystoreWrapper();
        Intrinsics.checkNotNull(AFKeystoreWrapper);
        this.v = AFKeystoreWrapper;
        String obj = AFKeystoreWrapper.getBody().toString();
        AFd1uSDK aFd1uSDK = this.AFKeystoreWrapper;
        String str2 = AFLogger.unregisterClient.f5319d;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        aFd1uSDK.AFKeystoreWrapper(str2, AFKeystoreWrapper.getStatusCode(), obj);
        AppsFlyerRequestListener afWarnLog3 = afWarnLog();
        if (afWarnLog3 != null) {
            if (AFKeystoreWrapper.isSuccessful()) {
                afWarnLog3.onSuccess();
            } else {
                afWarnLog3.onError(50, "Status code failure " + AFKeystoreWrapper.getStatusCode());
            }
        }
        return AFKeystoreWrapper.isSuccessful() ? AFd1cSDK.f5311d : AFd1cSDK.registerClient;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final void w() {
        super.w();
        if (e()) {
            AFf1fSDK aFf1fSDK = this.unregisterClient;
            String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
            if (str == null || StringsKt.p0(str)) {
                return;
            }
            AFd1pSDK<Result> AFLogger = AFLogger(str);
            if (AFLogger == null) {
                AppsFlyerLib();
                return;
            }
            AFd1oSDK aFd1oSDK = AFLogger.unregisterClient;
            Intrinsics.checkNotNullExpressionValue(aFd1oSDK, "");
            d(aFd1oSDK);
        }
    }

    private void d(@NotNull AFd1oSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        String str = this.i;
        this.i = this.AFLogger.registerClient(new AFc1sSDK(p02.f5319d, p02.unregisterClient, "7.0.1", this.unregisterClient, p02.AFLogger));
        if (str != null) {
            this.AFLogger.AFLogger(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFe1kSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFe1zSDK r11, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFe1zSDK[] r12, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFc1bSDK r13, @org.jetbrains.annotations.Nullable java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.appsflyer.internal.AFd1sSDK r4 = r13.unregisterClient()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            com.appsflyer.internal.AFf1fSDK r5 = r13.AppsFlyerLib()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.appsflyer.internal.AFd1uSDK r6 = r13.AFLoggerLogLevel()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            com.appsflyer.internal.AFc1vSDK r7 = r13.values()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            com.appsflyer.internal.AFi1vSDK r9 = r13.getInstance()
            r1 = r10
            r2 = r11
            r3 = r12
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1kSDK.<init>(com.appsflyer.internal.AFe1zSDK, com.appsflyer.internal.AFe1zSDK[], com.appsflyer.internal.AFc1bSDK, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1kSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1bSDK aFc1bSDK, @Nullable String str, @Nullable String str2) {
        this(aFe1zSDK, aFe1zSDKArr, aFc1bSDK, str);
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.i = str2;
    }
}
