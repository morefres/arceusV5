package com.appsflyer.internal;

import com.appsflyer.share.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1jSDK implements AFd1iSDK<DdlResponse> {
    @Override // com.appsflyer.internal.AFd1iSDK
    public final /* synthetic */ DdlResponse registerClient(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str == null || str.length() == 0) {
            return new DdlResponse(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("found", false);
        boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLink = DeepLink.parse(optJSONObject).setDeferred(true);
        }
        return new DdlResponse(optBoolean2, deepLink);
    }
}
