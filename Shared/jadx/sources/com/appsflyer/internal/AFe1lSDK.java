package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AFe1lSDK extends AFe1kSDK<String> {

    @NotNull
    private final AFf1eSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1eSDK afDebugLog;

    @NotNull
    private final AFg1rSDK afInfoLog;

    @NotNull
    private final AFc1iSDK afWarnLog;

    @NotNull
    private final AFe1zSDK force;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f5357v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1lSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1bSDK aFc1bSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1zSDK, aFe1zSDKArr, aFc1bSDK, null);
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.force = aFe1zSDK;
        this.f5357v = map;
        AFc1iSDK AFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.afWarnLog = AFLogger;
        AFg1rSDK force = aFc1bSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.afInfoLog = force;
        AFf1eSDK oaidData = aFc1bSDK.setOaidData();
        Intrinsics.checkNotNullExpressionValue(oaidData, "");
        this.AFLoggerLogLevel = oaidData;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afDebugLog = androidIdData;
    }

    @Nullable
    public String AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        AFd1oSDK aFd1oSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> x10 = kotlin.collections.k0.x(this.f5357v);
        String registerClient = registerClient(x10);
        String AFKeystoreWrapper = AFKeystoreWrapper(x10);
        Map<String, Object> x11 = kotlin.collections.k0.x(x10);
        registerClient(x11, registerClient);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String AFLogger = this.afWarnLog.AFLogger();
        if (AFLogger != null && !StringsKt.p0(AFLogger)) {
            linkedHashMap.put("advertising_id", AFLogger);
        }
        AFb1lSDK unregisterClient = AFb1iSDK.unregisterClient(this.afWarnLog.f5296d.f5343d);
        String str2 = null;
        String str3 = unregisterClient != null ? unregisterClient.f5273d : null;
        if (str3 != null && !StringsKt.p0(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1lSDK h_ = AFb1iSDK.h_(this.afWarnLog.f5296d.f5343d.getContentResolver());
        String str4 = h_ != null ? h_.f5273d : null;
        if (str4 != null && !StringsKt.p0(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        AFc1eSDK aFc1eSDK = this.afDebugLog;
        if (aFc1eSDK.afInfoLog) {
            x11.put("deviceTrackingDisabled", "true");
        } else {
            String str5 = aFc1eSDK.AFLoggerLogLevel;
            if (str5 != null && !StringsKt.p0(str5)) {
                linkedHashMap.put("imei", str5);
            }
        }
        String AFLogger2 = AFb1jSDK.AFLogger(this.afWarnLog.AFKeystoreWrapper);
        if (AFLogger2 == null) {
            AFLogger2 = "";
        }
        linkedHashMap.put("appsflyer_id", AFLogger2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "7.0.1");
        if (AFKeystoreWrapper != null && !StringsKt.p0(AFKeystoreWrapper)) {
            linkedHashMap.put("sdk_connector_version", AFKeystoreWrapper);
        }
        this.afInfoLog.unregisterClient(linkedHashMap, this.force);
        x11.put("device_data", linkedHashMap);
        this.AFLoggerLogLevel.d(x11, this.force);
        this.afInfoLog.unregisterClient(x11);
        AFd1pSDK<String> d10 = d(x11, str);
        if (d10 != null && (aFd1oSDK = d10.unregisterClient) != null) {
            str2 = aFd1oSDK.f5319d;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(x11);
            AFg1bSDK.registerClient(this + ": preparing data: ", jSONObject);
            AFd1uSDK aFKeystoreWrapper = getAFKeystoreWrapper();
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFKeystoreWrapper.AFKeystoreWrapper(str2, jSONObject2);
        }
        return d10;
    }

    public boolean AFLoggerLogLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Nullable
    public abstract AFd1pSDK<String> d(@NotNull Map<String, Object> map, @NotNull String str);

    @Nullable
    public String registerClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void registerClient(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afWarnLog.f5296d.f5343d.getPackageName());
        String str2 = this.afWarnLog.registerClient.valueOf;
        if (str2 != null) {
            map.put("cuid", str2);
        }
        map.put("app_version_name", this.afWarnLog.r_().versionName);
        if (AFLoggerLogLevel()) {
            map.put("event_timestamp", Long.valueOf(this.afInfoLog.unregisterClient()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
