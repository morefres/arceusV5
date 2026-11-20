package com.appsflyer.internal;

import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0018\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0014\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020,8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00106\u001a\u0002018\u0005X\u0085\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0019\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00108"}, d2 = {"Lcom/appsflyer/internal/AFf1tSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "Lcom/appsflyer/internal/AFh1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "p2", "<init>", "(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1pSDK;", "AFLogger", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "e", "()Z", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "", rl.d.f30696a, "(Lcom/appsflyer/internal/AFh1pSDK;)V", "registerClient", "unregisterClient", "AFKeystoreWrapper", "v", "force", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFf1hSDK;", "Lcom/appsflyer/internal/AFf1hSDK;", "Lcom/appsflyer/internal/AFd1jSDK;", "afInfoLog", "Lcom/appsflyer/internal/AFd1jSDK;", "Lcom/appsflyer/internal/AFf1eSDK;", "Lcom/appsflyer/internal/AFf1eSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "afDebugLog", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFc1iSDK;", "AppsFlyerLib", "()Lcom/appsflyer/internal/AFc1iSDK;", "i", "Lcom/appsflyer/internal/AFc1kSDK;", "afErrorLog", "Lcom/appsflyer/internal/AFc1kSDK;", "getLevel", "()Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFg1rSDK;", "valueOf", "Lcom/appsflyer/internal/AFg1rSDK;", "values", "()Lcom/appsflyer/internal/AFg1rSDK;", "w", "Lcom/appsflyer/internal/AFe1cSDK;", "Lcom/appsflyer/internal/AFe1cSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class AFf1tSDK extends AFe1kSDK<String> {

    /* renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK i;

    /* renamed from: afDebugLog, reason: from kotlin metadata */
    @NotNull
    private final AFd1zSDK d;

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK e;

    /* renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final AFd1jSDK unregisterClient;

    /* renamed from: afWarnLog, reason: from kotlin metadata */
    @NotNull
    private final AFf1eSDK AFKeystoreWrapper;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFh1pSDK registerClient;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFf1hSDK AFLogger;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final AFg1rSDK w;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final AFe1cSDK v;

    public /* synthetic */ AFf1tSDK(AFh1pSDK aFh1pSDK, AFc1bSDK aFc1bSDK, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFh1pSDK, aFc1bSDK, (i10 & 4) != 0 ? null : str);
    }

    public void AFKeystoreWrapper(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.w.registerClient(p02);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String p02) {
        AFh1gSDK aFh1gSDK;
        AFi1zSDK aFi1zSDK;
        Intrinsics.checkNotNullParameter(p02, "");
        d(this.registerClient);
        if (this.registerClient.f5437d.containsKey("meta")) {
            AFh1aSDK aFh1aSDK = this.AFLogger.unregisterClient.AFLogger;
            if (AFh1pSDK.unregisterClient((aFh1aSDK == null || (aFh1gSDK = aFh1aSDK.registerClient) == null || (aFi1zSDK = aFh1gSDK.AFKeystoreWrapper) == null) ? 1.0d : aFi1zSDK.AFLogger)) {
                this.registerClient.f5437d.remove("meta");
            }
        }
        AFd1pSDK<String> AFLogger = getD().AFLogger(this.registerClient, p02, this.d);
        AFe1cSDK aFe1cSDK = this.v;
        String obj = toString();
        Map<String, ? extends Object> map = this.registerClient.f5437d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFe1cSDK.registerClient(obj, AFLogger, map);
        return AFLogger;
    }

    @NotNull
    /* renamed from: AppsFlyerLib, reason: from getter */
    public final AFc1iSDK getI() {
        return this.i;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return this.registerClient.AFLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:4:0x002a, B:6:0x0030, B:7:0x0070, B:9:0x0086, B:13:0x0094, B:16:0x009c, B:17:0x00a9, B:19:0x00af, B:21:0x00ca, B:22:0x00cf, B:24:0x00e4, B:25:0x00eb, B:27:0x00ef, B:30:0x00f6, B:31:0x00fd, B:32:0x00cd, B:33:0x0100, B:35:0x010a, B:37:0x0110, B:38:0x0120, B:46:0x001a, B:3:0x0005), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:4:0x002a, B:6:0x0030, B:7:0x0070, B:9:0x0086, B:13:0x0094, B:16:0x009c, B:17:0x00a9, B:19:0x00af, B:21:0x00ca, B:22:0x00cf, B:24:0x00e4, B:25:0x00eb, B:27:0x00ef, B:30:0x00f6, B:31:0x00fd, B:32:0x00cd, B:33:0x0100, B:35:0x010a, B:37:0x0110, B:38:0x0120, B:46:0x001a, B:3:0x0005), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:4:0x002a, B:6:0x0030, B:7:0x0070, B:9:0x0086, B:13:0x0094, B:16:0x009c, B:17:0x00a9, B:19:0x00af, B:21:0x00ca, B:22:0x00cf, B:24:0x00e4, B:25:0x00eb, B:27:0x00ef, B:30:0x00f6, B:31:0x00fd, B:32:0x00cd, B:33:0x0100, B:35:0x010a, B:37:0x0110, B:38:0x0120, B:46:0x001a, B:3:0x0005), top: B:2:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1pSDK r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.d(com.appsflyer.internal.AFh1pSDK):void");
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public boolean e() {
        return true;
    }

    @NotNull
    /* renamed from: getLevel, reason: from getter */
    public final AFc1kSDK getE() {
        return this.e;
    }

    public void registerClient(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        AFg1rSDK aFg1rSDK = this.w;
        Map<String, Object> map = p02.f5437d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFg1rSDK.d(map);
    }

    public void unregisterClient(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.w.AFKeystoreWrapper(p02);
    }

    public void v(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.w.d(p02);
    }

    @NotNull
    /* renamed from: values, reason: from getter */
    public final AFg1rSDK getW() {
        return this.w;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFf1tSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1pSDK r4, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFc1bSDK r5, @org.jetbrains.annotations.Nullable java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.appsflyer.internal.AFe1zSDK r1 = r4.AFKeystoreWrapper()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            com.appsflyer.internal.AFe1zSDK[] r2 = com.appsflyer.internal.AFf1rSDK.d()
            r3.<init>(r1, r2, r5, r6)
            r3.registerClient = r4
            com.appsflyer.internal.AFf1hSDK r6 = r5.i()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.AFLogger = r6
            com.appsflyer.internal.AFd1jSDK r6 = r5.getLevel()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.unregisterClient = r6
            com.appsflyer.internal.AFf1eSDK r6 = r5.setOaidData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.AFKeystoreWrapper = r6
            com.appsflyer.internal.AFd1zSDK r6 = r5.valueOf()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.d = r6
            com.appsflyer.internal.AFc1iSDK r6 = r5.AFLogger()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.i = r6
            com.appsflyer.internal.AFc1kSDK r6 = r5.AFKeystoreWrapper()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r3.e = r6
            com.appsflyer.internal.AFg1rSDK r5 = r5.force()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r3.w = r5
            com.appsflyer.internal.AFe1cSDK r5 = new com.appsflyer.internal.AFe1cSDK
            com.appsflyer.internal.AFd1uSDK r6 = r3.getAFKeystoreWrapper()
            r5.<init>(r6)
            r3.v = r5
            com.appsflyer.internal.AFe1zSDK[] r5 = com.appsflyer.internal.AFf1rSDK.AFLogger()
            com.appsflyer.internal.AFe1zSDK r6 = r3.unregisterClient
            boolean r5 = kotlin.collections.m.G(r5, r6)
            if (r5 != 0) goto L9c
            int r4 = r4.afWarnLog
            if (r4 > 0) goto L81
            com.appsflyer.internal.AFe1zSDK r4 = r3.unregisterClient
            com.appsflyer.internal.AFd1bSDK r5 = com.appsflyer.internal.AFd1bSDK.registerClient
            if (r4 == r5) goto L9c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Set<com.appsflyer.internal.AFe1zSDK> r4 = r3.AFLogger
            r4.add(r5)
            return
        L81:
            com.appsflyer.internal.AFe1zSDK r4 = r3.unregisterClient
            com.appsflyer.internal.AFd1bSDK r5 = com.appsflyer.internal.AFd1bSDK.f5310w
            if (r4 != r5) goto L92
            com.appsflyer.internal.AFd1bSDK r4 = com.appsflyer.internal.AFd1bSDK.registerClient
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Set<com.appsflyer.internal.AFe1zSDK> r5 = r3.AFLogger
            r5.add(r4)
            return
        L92:
            com.appsflyer.internal.AFd1bSDK r4 = com.appsflyer.internal.AFd1bSDK.registerClient
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Set<com.appsflyer.internal.AFe1zSDK> r5 = r3.AFKeystoreWrapper
            r5.add(r4)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.<init>(com.appsflyer.internal.AFh1pSDK, com.appsflyer.internal.AFc1bSDK, java.lang.String):void");
    }

    public void e(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        AFg1rSDK aFg1rSDK = this.w;
        Map<String, Object> map = p02.f5437d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFg1rSDK.unregisterClient(map);
    }

    public void AFLogger(@NotNull AFh1pSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.w.AFLogger(p02);
    }
}
