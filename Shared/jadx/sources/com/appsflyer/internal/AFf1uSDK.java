package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1uSDK extends AFf1tSDK {

    @NotNull
    private final AFi1aSDK AFLoggerLogLevel;

    @NotNull
    private final AFe1wSDK AppsFlyerLib;

    @NotNull
    private final AFa1lSDK afDebugLog;

    @NotNull
    private final AFh1xSDK afErrorLog;

    @NotNull
    private final AFf1hSDK afInfoLog;

    @NotNull
    private final AFc1eSDK afWarnLog;

    @NotNull
    private final AFc1dSDK<AppsFlyerConversionListener> force;

    @NotNull
    private final AFf1aSDK getEntries;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public Map<? extends String, ? extends Object> f5399v;

    @Nullable
    private final AFh1sSDK values;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFLogger;

        static {
            int[] iArr = new int[Referrer.State.values().length];
            try {
                iArr[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Referrer.State.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFLogger = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NotNull AFh1pSDK aFh1pSDK, @NotNull final AFc1bSDK aFc1bSDK) {
        super(aFh1pSDK, aFc1bSDK, null, 4, null);
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.force = new AFc1dSDK<>(new Function0() { // from class: com.appsflyer.internal.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppsFlyerConversionListener AFLogger;
                AFLogger = AFf1uSDK.AFLogger(AFc1bSDK.this);
                return AFLogger;
            }
        });
        AFi1aSDK afDebugLog = aFc1bSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(afDebugLog, "");
        this.AFLoggerLogLevel = afDebugLog;
        AFh1xSDK e10 = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(e10, "");
        this.afErrorLog = e10;
        AFf1hSDK i10 = aFc1bSDK.i();
        Intrinsics.checkNotNullExpressionValue(i10, "");
        this.afInfoLog = i10;
        AFa1lSDK userPhone = aFc1bSDK.setUserPhone();
        Intrinsics.checkNotNullExpressionValue(userPhone, "");
        this.afDebugLog = userPhone;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afWarnLog = androidIdData;
        AFe1wSDK afWarnLog = aFc1bSDK.afWarnLog();
        Intrinsics.checkNotNullExpressionValue(afWarnLog, "");
        this.AppsFlyerLib = afWarnLog;
        AFf1aSDK w5 = aFc1bSDK.w();
        Intrinsics.checkNotNullExpressionValue(w5, "");
        this.getEntries = w5;
        this.values = aFc1bSDK.setUserLastName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.f5307e;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.force;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppsFlyerConversionListener AFLogger(AFc1bSDK aFc1bSDK) {
        return aFc1bSDK.setUserFirstName();
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        super.d(aFh1pSDK);
        int i10 = aFh1pSDK.afWarnLog;
        AFh1xSDK aFh1xSDK = this.afErrorLog;
        if (aFh1xSDK.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            aFh1xSDK.afErrorLog = currentTimeMillis;
            long j10 = aFh1xSDK.f5448e;
            if (j10 != 0) {
                aFh1xSDK.f5447d.put("from_fg", Long.valueOf(currentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.d("first_launch", new JSONObject(aFh1xSDK.f5447d).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics: fg ts is missing");
            }
        }
        Object obj = aFh1pSDK.f5437d.get("meta");
        Map map = kotlin.jvm.internal.h0.l(obj) ? (Map) obj : null;
        if (map == null) {
            map = new HashMap();
            Map<String, Object> map2 = aFh1pSDK.f5437d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            map2.put("meta", map);
        }
        Map<String, ?> unregisterClient = this.afDebugLog.unregisterClient();
        if (!unregisterClient.isEmpty()) {
            aFh1pSDK.AFKeystoreWrapper(unregisterClient);
        }
        AFh1bSDK d10 = this.afInfoLog.d();
        if (d10 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", d10.AFKeystoreWrapper);
            String str = d10.f5427d;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j11 = d10.AFLogger;
            if (j11 > 0) {
                hashMap.put(Payload.LATENCY, Long.valueOf(j11));
            }
            long j12 = d10.unregisterClient;
            if (j12 > 0) {
                hashMap.put("delay", Long.valueOf(j12));
            }
            int i11 = d10.registerClient;
            if (i11 > 0) {
                hashMap.put("res_code", Integer.valueOf(i11));
            }
            if (d10.f5428e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d10.f5428e.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(d10.f5428e.getMessage());
                hashMap.put("error", sb2.toString());
            }
            AFh1dSDK aFh1dSDK = d10.force;
            if (aFh1dSDK != null) {
                hashMap.put("sig", aFh1dSDK.toString());
            }
            String str2 = d10.f5429w;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        AFg1rSDK w5 = getW();
        Map<String, Object> map3 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        w5.registerClient(map3);
        if (i10 == 1) {
            AFh1xSDK aFh1xSDK2 = this.afErrorLog;
            HashMap hashMap2 = new HashMap(aFh1xSDK2.registerClient);
            aFh1xSDK2.registerClient.clear();
            Intrinsics.checkNotNull(hashMap2);
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afErrorLog.f5447d);
            Intrinsics.checkNotNull(hashMap3);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i10 == 2) {
            AFh1xSDK aFh1xSDK3 = this.afErrorLog;
            aFh1xSDK3.AFKeystoreWrapper.AFLogger("first_launch");
            HashMap hashMap4 = new HashMap(aFh1xSDK3.f5447d);
            Intrinsics.checkNotNull(hashMap4);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            if (i10 == 1) {
                aFh1sSDK.d(aFh1pSDK);
            } else if (i10 == 2 && (aFh1pSDK instanceof AFh1kSDK) && !aFh1sSDK.unregisterClient()) {
                aFh1sSDK.unregisterClient(aFh1pSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1pSDK.f5437d.remove("meta");
        }
        if (i10 <= 2) {
            if (i10 == 1) {
                this.AFLoggerLogLevel.AFLogger = true;
            }
            ArrayList arrayList = new ArrayList();
            for (Referrer referrer : (Referrer[]) this.AFLoggerLogLevel.unregisterClient.toArray(new Referrer[0])) {
                boolean z10 = referrer instanceof AFi1gSDK;
                int i12 = AFa1ySDK.AFLogger[referrer.getState().ordinal()];
                if (i12 == 1) {
                    if (z10) {
                        getE().registerClient(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(referrer.map);
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        throw new gt.l();
                    }
                } else if (i10 == 2 && !z10) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put(Payload.SOURCE, referrer.getSource());
                    hashMap5.put(Payload.RESPONSE, Payload.RESPONSE_TIMEOUT);
                    hashMap5.put(Payload.TYPE, referrer.getType());
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1pSDK.AFKeystoreWrapper(Payload.RFRS, arrayList);
            }
            Object obj2 = this.f5399v;
            if (obj2 != null) {
                aFh1pSDK.AFKeystoreWrapper("fb_ddl", obj2);
            }
        }
        AFh1sSDK aFh1sSDK2 = this.values;
        if (aFh1sSDK2 != null && aFh1pSDK.AFKeystoreWrapper() == AFd1bSDK.afErrorLog && aFh1sSDK2.registerClient()) {
            aFh1sSDK2.registerClient(aFh1pSDK);
        }
        getW().unregisterClient(aFh1pSDK);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        AFd1cSDK aFd1cSDK = this.e;
        AFd1cSDK aFd1cSDK2 = AFd1cSDK.f5311d;
        if (aFd1cSDK == aFd1cSDK2) {
            this.afWarnLog.onPause = System.currentTimeMillis();
        }
        AFh1xSDK aFh1xSDK = this.afErrorLog;
        if (aFh1xSDK.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = aFh1xSDK.afErrorLog;
            if (j10 != 0) {
                aFh1xSDK.f5447d.put("net", Long.valueOf(currentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.d("first_launch", new JSONObject(aFh1xSDK.f5447d).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: launch start timestamp not recorded");
            }
        }
        AppsFlyerConversionListener invoke = this.force.AFKeystoreWrapper.invoke();
        if (invoke != null) {
            boolean z10 = getForce() == 1;
            if (this.e == aFd1cSDK2 || z10) {
                this.AppsFlyerLib.d(new AFg1lSDK(this, getE(), invoke));
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            aFh1sSDK.unregisterClient(this, new Function0() { // from class: com.appsflyer.internal.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit d10;
                    d10 = AFf1uSDK.d(AFf1uSDK.this);
                    return d10;
                }
            });
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        if (!super.AFLogger()) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
            boolean z10 = this.e == AFd1cSDK.registerClient && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
            AFe1zSDK aFe1zSDK = this.unregisterClient;
            boolean z11 = aFe1zSDK == AFd1bSDK.registerClient || aFe1zSDK == AFd1bSDK.f5310w;
            if (!z10 || !z11) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(AFf1uSDK aFf1uSDK) {
        aFf1uSDK.getEntries.d(new AFh1kSDK());
        return Unit.f22894a;
    }
}
