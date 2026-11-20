package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0097\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFe1ySDK;", "", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;)V", "Lcom/appsflyer/internal/AFd1cSDK;", "registerClient", "()Lcom/appsflyer/internal/AFd1cSDK;", "Lcom/appsflyer/internal/AFc1sSDK;", "", "unregisterClient", "(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;", "", rl.d.f30696a, "()J", "AFLogger", "()Z", "Lcom/appsflyer/internal/AFc1vSDK;", "e", "Lcom/appsflyer/internal/AFc1vSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFe1wSDK;", "v", "Lcom/appsflyer/internal/AFe1wSDK;", "afErrorLog", "Lcom/appsflyer/internal/AFc1bSDK;", "i", "Ljava/lang/Boolean;", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1jSDK extends AFe1ySDK<Boolean> {
    public static volatile boolean force;

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFc1bSDK d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFc1vSDK AFKeystoreWrapper;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean unregisterClient;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFe1wSDK registerClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.unregisterClient, new AFe1zSDK[0], "LoadCachedRequests");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFc1vSDK values = aFc1bSDK.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        this.AFKeystoreWrapper = values;
        AFe1wSDK afWarnLog = aFc1bSDK.afWarnLog();
        Intrinsics.checkNotNullExpressionValue(afWarnLog, "");
        this.registerClient = afWarnLog;
        this.d = aFc1bSDK;
    }

    private static String unregisterClient(AFc1sSDK p02) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = p02.registerClient;
        Intrinsics.checkNotNull(str);
        long parseLong = Long.parseLong(str, CharsKt.checkRadix(10));
        String str2 = p02.unregisterClient;
        try {
            str2 = Uri.parse(str2).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Couldn't parse the uri", e10, false, false, false, false, 96, null);
        }
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        for (AFc1sSDK aFc1sSDK : this.AFKeystoreWrapper.AFKeystoreWrapper()) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "resending request: " + aFc1sSDK.unregisterClient, false, 4, null);
            try {
                this.registerClient.d(new AFf1sSDK(new AFh1nSDK(unregisterClient(aFc1sSDK), aFc1sSDK.f5301d, aFc1sSDK.registerClient, aFc1sSDK.AFLogger, aFc1sSDK.f5302e), this.d));
            } catch (Exception e10) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.QUEUE, "Failed to resend cached request", e10, false, false, false, false, 120, null);
            }
        }
        this.unregisterClient = Boolean.TRUE;
        force = true;
        return AFd1cSDK.f5311d;
    }
}
