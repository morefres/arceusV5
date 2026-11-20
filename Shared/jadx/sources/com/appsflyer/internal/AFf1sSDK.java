package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\n\u001a\u00020\fH\u0010¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFf1sSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "Lcom/appsflyer/internal/AFh1nSDK;", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V", "Lcom/appsflyer/internal/AFd1pSDK;", "AFLogger", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "e", "()Z", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "v", "Lcom/appsflyer/internal/AFh1nSDK;", "registerClient", "AFa1vSDK_"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1sSDK extends AFe1kSDK<String> {

    /* renamed from: AFa1vSDK_, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFh1nSDK registerClient;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1nSDK;", "p0", "", "AFLogger", "(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1sSDK$AFa1vSDK_, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String AFLogger(AFh1nSDK p02) {
            try {
                return new URL(p02.f5439i).getHost();
            } catch (MalformedURLException unused) {
                return "";
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFf1sSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1nSDK r9, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFc1bSDK r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.appsflyer.internal.AFe1zSDK r1 = r9.AFLoggerLogLevel
            if (r1 == 0) goto Le
        Lc:
            r3 = r1
            goto L11
        Le:
            com.appsflyer.internal.AFd1bSDK r1 = com.appsflyer.internal.AFd1bSDK.AFLogger
            goto Lc
        L11:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = 1
            com.appsflyer.internal.AFe1zSDK[] r4 = new com.appsflyer.internal.AFe1zSDK[r0]
            com.appsflyer.internal.AFd1bSDK r0 = com.appsflyer.internal.AFd1bSDK.f5306d
            r1 = 0
            r4[r1] = r0
            java.lang.String r0 = r9.f5441w
            java.lang.String r1 = com.appsflyer.internal.AFf1sSDK.Companion.AFKeystoreWrapper(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = r9.f5441w
            r2 = r8
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2.registerClient = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1sSDK.<init>(com.appsflyer.internal.AFh1nSDK, com.appsflyer.internal.AFc1bSDK):void");
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        String encodeToString = Base64.encodeToString(this.registerClient.force, 2);
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "cached data: " + encodeToString, false, 4, null);
        AFd1uSDK aFKeystoreWrapper = getAFKeystoreWrapper();
        String str = this.registerClient.f5439i;
        Intrinsics.checkNotNull(encodeToString);
        aFKeystoreWrapper.AFKeystoreWrapper(str, encodeToString);
        return getRl.d.a java.lang.String().unregisterClient(this.registerClient);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return this.registerClient.AFLogger;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0.getStatusCode() == 424) goto L33;
     */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFLogger() {
        /*
            r5 = this;
            boolean r0 = super.AFLogger()
            r1 = 1
            if (r0 != 0) goto L4e
            com.appsflyer.internal.AFh1nSDK r0 = r5.registerClient
            com.appsflyer.internal.AFe1zSDK r0 = r0.AFLoggerLogLevel
            if (r0 == 0) goto Le
            goto L10
        Le:
            com.appsflyer.internal.AFd1bSDK r0 = com.appsflyer.internal.AFd1bSDK.AFLogger
        L10:
            com.appsflyer.internal.AFd1bSDK r2 = com.appsflyer.internal.AFd1bSDK.getLevel
            if (r0 != r2) goto L24
            com.appsflyer.internal.AFd1fSDK<Result> r0 = r5.v
            if (r0 == 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.getStatusCode()
            r2 = 424(0x1a8, float:5.94E-43)
            if (r0 != r2) goto L24
            goto L4e
        L24:
            com.appsflyer.internal.AFd1fSDK<Result> r0 = r5.v
            com.appsflyer.internal.AFd1cSDK r2 = r5.e
            com.appsflyer.internal.AFd1cSDK r3 = com.appsflyer.internal.AFd1cSDK.registerClient
            r4 = 0
            if (r2 != r3) goto L39
            if (r0 == 0) goto L39
            int r0 = r0.getStatusCode()
            int r0 = r0 / 500
            if (r0 != r1) goto L39
            r0 = r1
            goto L3a
        L39:
            r0 = r4
        L3a:
            com.appsflyer.internal.AFe1zSDK r2 = r5.unregisterClient
            com.appsflyer.internal.AFd1bSDK r3 = com.appsflyer.internal.AFd1bSDK.registerClient
            if (r2 == r3) goto L47
            com.appsflyer.internal.AFd1bSDK r3 = com.appsflyer.internal.AFd1bSDK.f5310w
            if (r2 != r3) goto L45
            goto L47
        L45:
            r2 = r4
            goto L48
        L47:
            r2 = r1
        L48:
            if (r0 == 0) goto L4d
            if (r2 == 0) goto L4d
            goto L4e
        L4d:
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1sSDK.AFLogger():boolean");
    }
}
