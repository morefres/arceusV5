package com.appsflyer.internal;

import com.appsflyer.share.AppsFlyerConsent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1gSDK implements AFf1eSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFg1xSDK f5379d;

    public AFf1gSDK(@NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.f5379d = aFg1xSDK;
        this.AFLogger = aFc1eSDK;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void d(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        AFg1ySDK registerClient = this.f5379d.registerClient();
        AppsFlyerConsent appsFlyerConsent = this.AFLogger.setImeiData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean isUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (isUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", isUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (registerClient != null) {
            boolean z10 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(registerClient.unregisterClient));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(registerClient.registerClient));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(registerClient.AFLogger));
            if (z10) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(registerClient.f5425d));
                linkedHashMap3.put("tcstring", registerClient.AFKeystoreWrapper);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1zSDK != AFd1bSDK.registerClient || this.AFLogger.afDebugLog == null) {
            return;
        }
        AFj1iSDK.AFLogger(map).put("api", kotlin.collections.j0.g(gt.s.a("enableTCFDataCollection", this.AFLogger.afDebugLog)));
    }
}
