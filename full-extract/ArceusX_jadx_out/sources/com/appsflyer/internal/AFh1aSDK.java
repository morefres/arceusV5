package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1aSDK {

    @NonNull
    public final String AFKeystoreWrapper;
    private final boolean AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final String f5426d;
    public final AFh1gSDK registerClient;

    @NonNull
    public final AFh1iSDK unregisterClient;

    public AFh1aSDK(@NonNull String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFKeystoreWrapper = string;
            this.AFLogger = jSONObject.optBoolean("test_mode");
            this.f5426d = str;
            this.unregisterClient = string.startsWith("default") ? AFh1iSDK.DEFAULT : AFh1iSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.registerClient = optJSONObject != null ? new AFh1gSDK(optJSONObject) : null;
        } catch (JSONException e10) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Error parsing remote configuration JSON", e10, false, false);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1aSDK.class != obj.getClass()) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        if (this.AFLogger == aFh1aSDK.AFLogger && this.AFKeystoreWrapper.equals(aFh1aSDK.AFKeystoreWrapper)) {
            return this.f5426d.equals(aFh1aSDK.f5426d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.AFLogger ? 1 : 0) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.f5426d.hashCode();
        AFh1gSDK aFh1gSDK = this.registerClient;
        return aFh1gSDK != null ? (hashCode * 31) + aFh1gSDK.hashCode() : hashCode;
    }
}
