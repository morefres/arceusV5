package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1rSDK {
    public static JSONObject AFKeystoreWrapper(String str, AppsFlyerProperties appsFlyerProperties) {
        JSONObject registerClient = AFg1dSDK.registerClient(str);
        if (registerClient != null) {
            try {
                if (registerClient.has("ol_id")) {
                    String optString = registerClient.optString("ol_scheme", null);
                    String optString2 = registerClient.optString("ol_domain", null);
                    String optString3 = registerClient.optString("ol_ver", null);
                    if (optString != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return registerClient;
                    }
                }
            } catch (Throwable th2) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                aFLogger.e(logTag, sb2.toString(), th2, false, false);
                AFa1tSDK.d().AFKeystoreWrapper.AFLoggerLogLevel().registerClient();
                AFa1tSDK.d().AFKeystoreWrapper.AFLoggerLogLevel().d();
            }
        }
        return registerClient;
    }
}
