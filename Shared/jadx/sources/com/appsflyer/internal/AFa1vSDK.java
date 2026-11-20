package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1vSDK implements AppsFlyerProperties {

    @NotNull
    private final AFc1kSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f5268d;
    private boolean registerClient;

    public AFa1vSDK(@NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.AFLogger = aFc1kSDK;
        this.f5268d = new LinkedHashMap();
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void clear() {
        this.f5268d.clear();
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final boolean getBoolean(@Nullable String str, boolean z10) {
        String string = getString(str);
        return string != null ? Boolean.parseBoolean(string) : z10;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final int getInt(@Nullable String str, int i10) {
        String string = getString(str);
        return string != null ? Integer.parseInt(string) : i10;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final long getLong(@Nullable String str, long j10) {
        String string = getString(str);
        return string != null ? Long.parseLong(string) : j10;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    @Nullable
    public final synchronized String getString(@Nullable String str) {
        Object obj = this.f5268d.get(str);
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void loadProperties() {
        try {
            if (this.registerClient) {
                return;
            }
            String d10 = this.AFLogger.d("savedProperties");
            if (d10 == null) {
                return;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Loading properties..", false, 4, null);
            try {
                JSONObject jSONObject = new JSONObject(d10);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.f5268d.get(next) == null) {
                        this.f5268d.put(next, jSONObject.getString(next));
                    }
                }
                String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                for (int i10 = 0; i10 < 5; i10++) {
                    this.f5268d.remove(strArr[i10]);
                }
                saveProperties();
                this.registerClient = true;
            } catch (JSONException e10) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Failed loading properties", e10, false, false, false, false, 120, null);
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Done loading properties: " + this.registerClient, false, 4, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void remove(@Nullable String str) {
        this.f5268d.remove(str);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void saveProperties() {
        this.f5268d.remove("AppsFlyerKey");
        this.AFLogger.d("savedProperties", new JSONObject(this.f5268d).toString());
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, @Nullable String str2) {
        this.f5268d.put(str, str2);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, @Nullable String[] strArr) {
        this.f5268d.put(str, strArr);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, int i10) {
        this.f5268d.put(str, String.valueOf(i10));
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, long j10) {
        this.f5268d.put(str, String.valueOf(j10));
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, boolean z10) {
        this.f5268d.put(str, String.valueOf(z10));
    }
}
