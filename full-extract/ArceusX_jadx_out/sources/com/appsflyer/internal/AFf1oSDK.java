package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFf1oSDK extends AFe1ySDK<AFf1pSDK> {

    @NotNull
    private final AFc1iSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1eSDK AppsFlyerLib;

    @NotNull
    private final AFf1jSDK afDebugLog;

    @NotNull
    private final AFd1sSDK afErrorLog;

    @NotNull
    private final AFf1fSDK afInfoLog;

    @NotNull
    private final AFf1kSDK afWarnLog;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public AFh1bSDK f5392e;

    @Nullable
    public final AFf1mSDK force;

    @NotNull
    private final String getLevel;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public AFf1pSDK f5393i;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFf1nSDK f5394v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(@NotNull AFf1nSDK aFf1nSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFf1jSDK aFf1jSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFf1kSDK aFf1kSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull String str, @Nullable AFf1mSDK aFf1mSDK) {
        super(AFd1bSDK.f5306d, new AFe1zSDK[0], "UpdateRemoteConfiguration");
        Intrinsics.checkNotNullParameter(aFf1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f5394v = aFf1nSDK;
        this.AFLoggerLogLevel = aFc1iSDK;
        this.afInfoLog = aFf1fSDK;
        this.afDebugLog = aFf1jSDK;
        this.afErrorLog = aFd1sSDK;
        this.afWarnLog = aFf1kSDK;
        this.AppsFlyerLib = aFc1eSDK;
        this.getLevel = str;
        this.force = aFf1mSDK;
    }

    private final void AFKeystoreWrapper(AFf1xSDK aFf1xSDK) {
        long j10;
        int i10;
        Throwable th2;
        long j11;
        AFd1fSDK<?> aFd1fSDK = aFf1xSDK.f5401d;
        if (aFd1fSDK != null) {
            j10 = aFd1fSDK.AFKeystoreWrapper.registerClient;
            i10 = aFd1fSDK.getStatusCode();
        } else {
            j10 = 0;
            i10 = 0;
        }
        int i11 = i10;
        Throwable th3 = aFf1xSDK.f5403v;
        if (th3 instanceof HttpException) {
            HttpException httpException = (HttpException) th3;
            th2 = httpException.getCause();
            j11 = httpException.getMetrics().registerClient;
        } else {
            th2 = th3;
            j11 = j10;
        }
        AFh1aSDK aFh1aSDK = aFf1xSDK.unregisterClient;
        this.f5392e = new AFh1bSDK(aFh1aSDK != null ? aFh1aSDK.AFKeystoreWrapper : null, aFf1xSDK.AFLogger, j11, System.currentTimeMillis() - aFf1xSDK.registerClient, i11, aFf1xSDK.AFKeystoreWrapper, aFf1xSDK.f5402e, th2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.appsflyer.internal.AFf1pSDK e() {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1oSDK.e():com.appsflyer.internal.AFf1pSDK");
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        try {
            AFf1pSDK e10 = e();
            this.f5393i = e10;
            return e10 == AFf1pSDK.FAILURE ? AFd1cSDK.registerClient : AFd1cSDK.f5311d;
        } catch (InterruptedIOException e11) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e11, false, false, false, false, 64, null);
            this.f5393i = AFf1pSDK.FAILURE;
            return AFd1cSDK.unregisterClient;
        } catch (InterruptedException e12) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e12, false, false, false, false, 64, null);
            this.f5393i = AFf1pSDK.FAILURE;
            return AFd1cSDK.unregisterClient;
        } catch (SocketTimeoutException unused) {
            this.f5393i = AFf1pSDK.FAILURE;
            return AFd1cSDK.unregisterClient;
        }
    }

    private final void d(String str, long j10, IOException iOException, AFd1fSDK<?> aFd1fSDK) {
        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "failed to fetch remote config: " + iOException.getMessage(), iOException, true, false, false, false, 64, null);
        AFKeystoreWrapper(new AFf1xSDK(str, j10, aFd1fSDK, null, null, null, iOException));
    }
}
