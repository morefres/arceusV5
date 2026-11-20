package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q8.a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0015J\u000f\u0010\u000f\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u000f\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010'\u001a\u00020$8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010\u0019\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\u001c\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "Lcom/appsflyer/internal/AFe1ySDK;", "Lcom/appsflyer/internal/AFh1qSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;)V", "Landroid/content/Context;", "", rl.d.f30696a, "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "p1", "", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;)Z", "registerClient", "AFLogger", "(I)Z", "", "", "(Lcom/appsflyer/internal/AFh1qSDK;Ljava/lang/String;)V", "()Z", "Lcom/appsflyer/internal/AFd1cSDK;", "()Lcom/appsflyer/internal/AFd1cSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "i", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "v", "Lcom/appsflyer/internal/AFc1iSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "e", "Lcom/appsflyer/internal/AFc1eSDK;", "force", "Lcom/appsflyer/internal/AFh1qSDK;", "unregisterClient", "", "afErrorLog", "Lgt/h;", "AFKeystoreWrapper", "afInfoLog", "AFa1vSDK", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1iSDK extends AFe1ySDK<AdvertisingIdData> {

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final gt.h AFKeystoreWrapper;

    /* renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final gt.h i;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFc1eSDK d;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AdvertisingIdData unregisterClient;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFd1zSDK registerClient;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFc1iSDK AFLogger;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1iSDK$AFa1tSDK, reason: from toString */
    public static final /* data */ class FetchGaidData {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i10 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i10 & 4) != 0) {
                z10 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i10 & 8) != 0) {
                sb2 = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z10, sb2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final FetchGaidData copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.c(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.c(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.c(this.gaidError, fetchGaidData.gaidError);
        }

        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            return ((((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.advertisingIdWithGps)) * 31) + this.gaidError.hashCode();
        }

        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public FetchGaidData(@Nullable String str, @Nullable Boolean bool, boolean z10, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = gaidError;
        }

        public /* synthetic */ FetchGaidData(String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ FetchGaidData $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1zSDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1iSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.AFKeystoreWrapper, new AFe1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFd1zSDK valueOf = aFc1bSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        this.registerClient = valueOf;
        AFc1iSDK AFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.AFLogger = AFLogger;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.d = androidIdData;
        this.unregisterClient = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.AFKeystoreWrapper = gt.i.b(new Function0() { // from class: com.appsflyer.internal.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long registerClient;
                registerClient = AFe1iSDK.registerClient(AFe1iSDK.this);
                return Long.valueOf(registerClient);
            }
        });
        this.i = gt.i.b(new Function0() { // from class: com.appsflyer.internal.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean d10;
                d10 = AFe1iSDK.d(AFe1iSDK.this);
                return Boolean.valueOf(d10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AFe1iSDK aFe1iSDK) {
        return Boolean.parseBoolean(aFe1iSDK.AFLogger.AFLogger("com.appsflyer.enable_instant_plays"));
    }

    private static boolean e() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th2.getMessage();
            }
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long registerClient(AFe1iSDK aFe1iSDK) {
        Long t8;
        String AFLogger = aFe1iSDK.AFLogger.AFLogger("com.appsflyer.fetch_ids.timeout");
        if (AFLogger == null || (t8 = StringsKt.t(AFLogger)) == null) {
            return 1000L;
        }
        return t8.longValue();
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        d(r20.unregisterClient, r9.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        r0 = r9.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
        if (r0.length() != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
    
        r0 = r20.unregisterClient;
        r0.advertisingId = r9.getAdvertisingId();
        r3 = java.lang.Boolean.FALSE;
        r0.isLimited = r3;
        r4 = java.lang.Boolean.TRUE;
        r0.isEnabled = r4;
        r0.isGaidWithGps = r3;
        r0.isGaidWithSamsungCloudDev = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        if (r21 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        r0.retry = java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0103, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (r9.getGaidError().length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if (r9.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFLogger(int r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1iSDK.AFLogger(int):boolean");
    }

    private static int d(Context p02) {
        try {
            return j9.c.o().g(p02);
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0134 A[LOOP:0: B:7:0x001f->B:15:0x0134, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138 A[EDGE_INSN: B:16:0x0138->B:17:0x0138 BREAK  A[LOOP:0: B:7:0x001f->B:15:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    @Override // com.appsflyer.internal.AFe1ySDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1cSDK registerClient() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1iSDK.registerClient():com.appsflyer.internal.AFd1cSDK");
    }

    private static boolean d(Context p02, FetchGaidData p12) {
        try {
            AFb1kSDK.AFa1tSDK registerClient = AFb1kSDK.registerClient(p02);
            p12.setAdvertisingId(registerClient.f5272d);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(registerClient.AFLogger));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                return true;
            }
            p12.getGaidError().append("emptyOrNull (bypass) |");
            return true;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, "Failed to fetch GAID: " + th2.getMessage(), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFLoggerBase.i$default(aFLogger, logTag, localizedMessage, false, 4, null);
            return false;
        }
    }

    private static void d(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final /* synthetic */ long d() {
        return ((Number) this.AFKeystoreWrapper.getValue()).longValue();
    }

    private final boolean registerClient(Context p02, FetchGaidData p12) {
        try {
            a.C0516a a10 = q8.a.a(p02);
            if (a10 != null) {
                p12.setAdvertisingId(a10.a());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(a10.b()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    return true;
                }
                p12.getGaidError().append("emptyOrNull |");
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, "Google Play Services is missing " + th2.getMessage(), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFLoggerBase.i$default(aFLogger, logTag, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
