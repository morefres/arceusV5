package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1xSDK {
    public final AFc1kSDK AFKeystoreWrapper;
    public long afInfoLog;
    public final AFc1iSDK unregisterClient;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f5447d = new ConcurrentHashMap();
    public final Map<String, Object> registerClient = new ConcurrentHashMap();
    public final Map<String, Object> AFLogger = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public long f5449i = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f5448e = 0;
    public final long[] force = new long[2];

    /* renamed from: v, reason: collision with root package name */
    public final long[] f5450v = new long[2];

    /* renamed from: w, reason: collision with root package name */
    public final long[] f5451w = new long[2];
    public long afErrorLog = 0;
    public long afDebugLog = 0;

    public AFh1xSDK(AFc1kSDK aFc1kSDK, AFc1iSDK aFc1iSDK) {
        this.AFKeystoreWrapper = aFc1kSDK;
        this.unregisterClient = aFc1iSDK;
    }

    public final void AFLogger() {
        this.f5448e = System.currentTimeMillis();
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            long j10 = this.f5449i;
            if (j10 == 0) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: initialization timestamp not recorded");
                return;
            }
            this.f5447d.put("init_to_fg", Long.valueOf(this.f5448e - j10));
            this.AFKeystoreWrapper.d("first_launch", new JSONObject(this.f5447d).toString());
        }
    }

    public final void registerClient(DeepLinkResult deepLinkResult, long j10) {
        this.registerClient.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.registerClient.put("timeout_value", Long.valueOf(j10));
    }

    public final void unregisterClient(AFh1uSDK aFh1uSDK) {
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            this.f5447d.put("api_name", aFh1uSDK.toString());
            this.AFKeystoreWrapper.d("first_launch", new JSONObject(this.f5447d).toString());
        }
    }

    public final void AFLogger(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.afDebugLog;
        if (j10 != 0) {
            this.AFLogger.put("net", Long.valueOf(currentTimeMillis - j10));
        } else {
            AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: GCD start timestamp not recorded");
        }
        this.AFLogger.put("retries", Integer.valueOf(i10));
        this.AFKeystoreWrapper.d("gcd", new JSONObject(this.AFLogger).toString());
    }

    public final Map<String, Object> AFLogger(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String d10 = this.AFKeystoreWrapper.d(str);
        if (d10 != null) {
            try {
                return AFg1dSDK.unregisterClient(new JSONObject(d10));
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Error while parsing cached JSON data for metrics", e10);
            }
        }
        return map;
    }
}
