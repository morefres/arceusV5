package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1fSDK extends AFe1kSDK<DdlResponse> {

    @NotNull
    private final AFa1qSDK AFLoggerLogLevel;
    private int AppsFlyerLib;

    @NotNull
    private final AFh1xSDK afDebugLog;

    @NotNull
    private final AFi1aSDK afErrorLog;

    @NotNull
    private final AFc1eSDK afInfoLog;
    private int afWarnLog;

    @NotNull
    private final AFc1iSDK force;

    @NotNull
    private final CountDownLatch getLevel;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFa1oSDK f5347v;

    @NotNull
    private final List<Referrer> valueOf;
    private int values;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;
        public static final /* synthetic */ int[] registerClient;

        static {
            int[] iArr = new int[AFd1cSDK.values().length];
            try {
                iArr[AFd1cSDK.f5311d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFd1cSDK.registerClient.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            registerClient = iArr;
            int[] iArr2 = new int[Referrer.State.values().length];
            try {
                iArr2[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFKeystoreWrapper = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1fSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.force, new AFe1zSDK[]{AFd1bSDK.f5306d, AFd1bSDK.AFKeystoreWrapper}, aFc1bSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        int i10 = 0;
        this.f5347v = new AFa1oSDK();
        AFc1iSDK AFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.force = AFLogger;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afInfoLog = androidIdData;
        AFa1qSDK enableTCFDataCollection = aFc1bSDK.enableTCFDataCollection();
        Intrinsics.checkNotNullExpressionValue(enableTCFDataCollection, "");
        this.AFLoggerLogLevel = enableTCFDataCollection;
        AFh1xSDK e10 = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(e10, "");
        this.afDebugLog = e10;
        AFi1aSDK afDebugLog = aFc1bSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(afDebugLog, "");
        this.afErrorLog = afDebugLog;
        this.getLevel = new CountDownLatch(1);
        this.valueOf = new ArrayList();
        Referrer[] referrerArr = (Referrer[]) afDebugLog.unregisterClient.toArray(new Referrer[0]);
        Intrinsics.checkNotNullExpressionValue(referrerArr, "");
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : referrerArr) {
            if (referrer != null && referrer.getState() != Referrer.State.NOT_STARTED) {
                arrayList.add(referrer);
            }
        }
        this.AppsFlyerLib = arrayList.size();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final Referrer referrer2 = (Referrer) obj;
            int i11 = AFa1tSDK.AFKeystoreWrapper[referrer2.getState().ordinal()];
            if (i11 == 1) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer2.map.get(Payload.SOURCE) + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNull(referrer2);
                AFKeystoreWrapper(referrer2);
            } else if (i11 == 2) {
                referrer2.setAdditionalReferrerDataCollectionFinishedCallback(new Runnable() { // from class: com.appsflyer.internal.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1fSDK.unregisterClient(Referrer.this, this);
                    }
                });
            }
        }
    }

    private final void AFKeystoreWrapper(Referrer referrer) {
        if (!unregisterClient(referrer)) {
            int i10 = this.values + 1;
            this.values = i10;
            if (i10 == this.AppsFlyerLib) {
                this.getLevel.countDown();
                return;
            }
            return;
        }
        this.valueOf.add(referrer);
        this.getLevel.countDown();
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Added non-organic " + referrer.getClass().getSimpleName(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(Referrer referrer, AFe1fSDK aFe1fSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer.map.get(Payload.SOURCE) + " referrer collected via callback", false, 4, null);
        Intrinsics.checkNotNull(referrer);
        aFe1fSDK.AFKeystoreWrapper(referrer);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return this.AFLoggerLogLevel.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:3:0x0005, B:7:0x0016, B:9:0x0027, B:10:0x0070, B:15:0x007d, B:17:0x0085, B:18:0x008f, B:21:0x00bc, B:23:0x00d0, B:25:0x00e4, B:27:0x00e8, B:29:0x00ec, B:31:0x00f8, B:34:0x00ff, B:35:0x0105, B:37:0x0109, B:39:0x0113, B:41:0x0132, B:42:0x0146, B:44:0x014c, B:46:0x0162, B:48:0x013f, B:51:0x0167, B:53:0x003b, B:54:0x0056), top: B:2:0x0005 }] */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1cSDK registerClient() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1fSDK.registerClient():com.appsflyer.internal.AFd1cSDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1kSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1pSDK<com.appsflyer.internal.DdlResponse> AFLogger(@org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1fSDK.AFLogger(java.lang.String):com.appsflyer.internal.AFd1pSDK");
    }

    private static boolean unregisterClient(Referrer referrer) {
        Object obj = referrer.map.get(Payload.CLICK_TS);
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> unregisterClient(AFb1lSDK aFb1lSDK) {
        String str;
        if (aFb1lSDK == null || (str = aFb1lSDK.f5273d) == null) {
            return null;
        }
        Boolean bool = aFb1lSDK.AFLogger;
        if (bool == null || !bool.booleanValue()) {
            return kotlin.collections.k0.m(gt.s.a(Payload.TYPE, "unhashed"), gt.s.a("value", str));
        }
        return null;
    }
}
