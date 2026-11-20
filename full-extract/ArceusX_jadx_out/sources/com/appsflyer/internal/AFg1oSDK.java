package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import gt.n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1oSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AppsFlyerLib = 0;
    private static int getLevel = 1;

    @NotNull
    private final AFg1qSDK AFKeystoreWrapper;

    @NotNull
    private final Context AFLogger;

    @NotNull
    private final AFc1eSDK AFLoggerLogLevel;

    @NotNull
    private final gt.h afDebugLog;

    @NotNull
    private final AppsFlyerProperties afErrorLog;

    @NotNull
    private final AFf1bSDK afInfoLog;

    @NotNull
    private final AFd1zSDK afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFj1cSDK f5415d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f5416e;

    @NotNull
    private final AFi1vSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFc1iSDK f5417i;

    @NotNull
    private final AFj1ySDK registerClient;

    @NotNull
    private final AFg1wSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFh1xSDK f5418v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFf1fSDK f5419w;
    private static char[] valueOf = {13891, 31402, 44955, 53476, 1481, 46615, 64288, 11290, 20859, 33360, 14001, 31619, 44172, 53759, 724, 17751, 2465, 56472, 41961, 30409};
    private static long getEntries = 8025551254644932716L;

    public AFg1oSDK(@NotNull Context context, @NotNull AFj1cSDK aFj1cSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFj1ySDK aFj1ySDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFh1xSDK aFh1xSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1vSDK aFi1vSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFj1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1vSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1bSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFLogger = context;
        this.f5415d = aFj1cSDK;
        this.unregisterClient = aFg1wSDK;
        this.registerClient = aFj1ySDK;
        this.AFKeystoreWrapper = aFg1qSDK;
        this.f5418v = aFh1xSDK;
        this.f5416e = aFc1kSDK;
        this.f5417i = aFc1iSDK;
        this.force = aFi1vSDK;
        this.f5419w = aFf1fSDK;
        this.afWarnLog = aFd1zSDK;
        this.afInfoLog = aFf1bSDK;
        this.AFLoggerLogLevel = aFc1eSDK;
        this.afErrorLog = appsFlyerProperties;
        this.afDebugLog = gt.i.b(new Function0() { // from class: com.appsflyer.internal.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SimpleDateFormat AFLoggerLogLevel;
                AFLoggerLogLevel = AFg1oSDK.AFLoggerLogLevel();
                return AFLoggerLogLevel;
            }
        });
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = aFg1oSDK.AFLoggerLogLevel.getOutOfStore;
        if (str != null) {
            map.put("net_token", str);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Network token added to event", false, 4, null);
            return null;
        }
        int i10 = AppsFlyerLib + 17;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void AFLoggerLogLevel(@NotNull Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 119) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (char) (18880 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 5 - View.MeasureSpec.getMode(0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i10 = AppsFlyerLib + 29;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private void AppsFlyerLib(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 291205159, -291205155, System.identityHashCode(this));
    }

    private static List<AFd1bSDK> afDebugLog() {
        return (List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis());
    }

    @SuppressLint({"HardwareIds"})
    private final String afErrorLog() {
        String d10 = this.f5416e.d("androidIdCached");
        try {
            String string = Settings.Secure.getString(this.AFLogger.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = e10.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 45) % 128;
                message = "Failed to retrieve Android ID from Settings.Secure";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, e10, false, false, false, false, 120, null);
            AppsFlyerLib = (getLevel + 9) % 128;
        }
        if (d10 == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 87) % 128;
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Using cached Android ID (current retrieval failed): " + d10, false, 4, null);
        return d10;
    }

    private final boolean afInfoLog() {
        if (this.AFLoggerLogLevel.afWarnLog) {
            return true;
        }
        int i10 = AppsFlyerLib + 21;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
            if (!AFj1qSDK.AFLogger(this.AFLogger)) {
                return true;
            }
        } else if (!AFj1qSDK.AFLogger(this.AFLogger)) {
            return true;
        }
        AppsFlyerLib = (getLevel + 11) % 128;
        return false;
    }

    private final void afWarnLog(Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 65) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.AFLogger.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i10 = getLevel + 117;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("tv", Boolean.TRUE);
            int i11 = 93 / 0;
        } else {
            map.put("tv", Boolean.TRUE);
        }
        getLevel = (AppsFlyerLib + 61) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        if (r8.f5417i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
    
        r0.putAll(r8.registerClient.AFLogger());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        if (r8.f5417i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "ro.product.cpu.abi"
            java.lang.String r1 = AFLogger(r1)
            java.lang.String r2 = "cpu_abi"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.product.cpu.abi2"
            java.lang.String r1 = AFLogger(r1)
            java.lang.String r2 = "cpu_abi2"
            r0.put(r2, r1)
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = AFLogger(r1)
            java.lang.String r2 = "arch"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.build.display.id"
            java.lang.String r1 = AFLogger(r1)
            java.lang.String r2 = "build_display_id"
            r0.put(r2, r1)
            r1 = 2
            if (r10 == 0) goto L81
            int r10 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            r2 = 5
            int r10 = r10 + r2
            int r3 = r10 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r3
            int r10 = r10 % r1
            r3 = 0
            java.lang.String r4 = "appsFlyerCount"
            r5 = -1798824476(0xffffffff94c81de4, float:-2.0206629E-26)
            r6 = 1798824484(0x6b37e224, float:2.2230134E26)
            if (r10 != 0) goto L63
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r0}
            int r7 = java.lang.System.identityHashCode(r8)
            unregisterClient(r10, r6, r5, r7)
            com.appsflyer.internal.AFc1iSDK r10 = r8.f5417i
            com.appsflyer.internal.AFc1kSDK r10 = r10.AFKeystoreWrapper
            int r10 = r10.AFLogger(r4, r3)
            if (r10 > r2) goto L81
            goto L78
        L63:
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r0}
            int r2 = java.lang.System.identityHashCode(r8)
            unregisterClient(r10, r6, r5, r2)
            com.appsflyer.internal.AFc1iSDK r10 = r8.f5417i
            com.appsflyer.internal.AFc1kSDK r10 = r10.AFKeystoreWrapper
            int r10 = r10.AFLogger(r4, r3)
            if (r10 > r1) goto L81
        L78:
            com.appsflyer.internal.AFj1ySDK r10 = r8.registerClient
            java.util.Map r10 = r10.AFLogger()
            r0.putAll(r10)
        L81:
            com.appsflyer.internal.AFg1qSDK r10 = r8.AFKeystoreWrapper
            android.content.Context r2 = r8.AFLogger
            java.util.Map r10 = r10.registerClient(r2)
            java.lang.String r2 = "dim"
            r0.put(r2, r10)
            java.lang.String r10 = "deviceData"
            r9.put(r10, r0)
            int r9 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r9 = r9 + 35
            int r10 = r9 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r10
            int r9 = r9 % r1
            if (r9 == 0) goto L9f
            return
        L9f:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.d(java.util.Map, boolean):void");
    }

    private void e(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = this.f5418v;
        HashMap hashMap = new HashMap(aFh1xSDK.AFLogger);
        aFh1xSDK.AFLogger.clear();
        aFh1xSDK.AFKeystoreWrapper.AFLogger("gcd");
        Intrinsics.checkNotNull(hashMap);
        if (hashMap.isEmpty()) {
            getLevel = (AppsFlyerLib + 13) % 128;
        } else {
            AppsFlyerLib = (getLevel + 39) % 128;
            AFj1iSDK.AFLogger(map).put("gcd", hashMap);
        }
    }

    private void enableTCFDataCollection(@NotNull Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 9) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.f5417i.AFKeystoreWrapper(this.AFLogger)));
        getLevel = (AppsFlyerLib + 115) % 128;
    }

    private static /* synthetic */ Object force(Object[] objArr) {
        AFd1nSDK aFd1nSDK;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        AFc1eSDK aFc1eSDK = aFg1oSDK.f5417i.registerClient;
        if (aFc1eSDK.setAndroidIdData) {
            int i10 = getLevel + 45;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                Map<String, Object> map = aFh1pSDK.f5437d;
                Intrinsics.checkNotNullExpressionValue(map, "");
                AFj1iSDK.AFLogger(map).put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> map2 = aFh1pSDK.f5437d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            AFj1iSDK.AFLogger(map2).put("ad_ids_disabled", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 63) % 128;
        } else {
            AdvertisingIdData advertisingIdData = aFc1eSDK.updateServerUninstallToken;
            if (advertisingIdData == null) {
                return null;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFh1pSDK.AFKeystoreWrapper("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null) {
                getLevel = (AppsFlyerLib + 75) % 128;
                if (advertisingIdData.isEnabled != null) {
                    aFh1pSDK.AFKeystoreWrapper("advertiserId", str2);
                    aFh1pSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                    aFh1pSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                }
            }
        }
        AdvertisingIdData advertisingIdData2 = aFg1oSDK.f5417i.registerClient.updateServerUninstallToken;
        aFh1pSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(advertisingIdData2 != null ? Intrinsics.c(advertisingIdData2.retry, Boolean.TRUE) : false));
        if (CollectionsKt.W(kotlin.collections.p.n(AFd1bSDK.registerClient, AFd1bSDK.afErrorLog), aFh1pSDK.AFKeystoreWrapper()) && (aFd1nSDK = aFg1oSDK.AFLoggerLogLevel.setOaidData) != null) {
            Map<String, Object> map3 = aFh1pSDK.f5437d;
            Intrinsics.checkNotNullExpressionValue(map3, "");
            AFj1iSDK.AFLogger(map3).put("fetchAdIdLatency", Long.valueOf(aFd1nSDK.registerClient));
        }
        return null;
    }

    private void getEntries(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.f5418v.afInfoLog;
        if (j10 != 0) {
            getLevel = (AppsFlyerLib + 71) % 128;
            map.put("prev_session_dur", Long.valueOf(j10));
        }
        getLevel = (AppsFlyerLib + 85) % 128;
    }

    private void getInstance(@NotNull Map<String, Object> map) {
        int i10 = AppsFlyerLib + 29;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.f5416e.registerClient("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.f5416e.registerClient("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.f5416e.AFKeystoreWrapper("is_stop_tracking_used")));
        }
        int i11 = getLevel + 19;
        AppsFlyerLib = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002f, code lost:
    
        if (r0.equals("") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = (com.appsflyer.internal.AFg1oSDK.getLevel + 29) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getLevel(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            java.lang.String r1 = "CHANNEL"
            r2 = 0
            java.lang.String r3 = ""
            if (r0 == 0) goto L20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            com.appsflyer.internal.AFc1iSDK r0 = r6.f5417i
            java.lang.String r0 = r0.AFLogger(r1)
            r1 = 94
            int r1 = r1 / r2
            if (r0 == 0) goto L3a
            goto L2b
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            com.appsflyer.internal.AFc1iSDK r0 = r6.f5417i
            java.lang.String r0 = r0.AFLogger(r1)
            if (r0 == 0) goto L3a
        L2b:
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L3a
            int r0 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r0 = r0 + 29
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r0
            r0 = 0
        L3a:
            com.appsflyer.internal.AFc1kSDK r1 = r6.f5416e
            java.lang.String r1 = registerClient(r1, r0)
            r4 = 1
            if (r1 == 0) goto L53
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r1, r0)
            if (r5 != 0) goto L53
            int r5 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r5 = r5 + 71
            int r5 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r5
            r5 = r4
            goto L54
        L53:
            r5 = r2
        L54:
            if (r1 != 0) goto L59
            if (r0 == 0) goto L59
            r2 = r4
        L59:
            if (r5 != 0) goto L65
            int r1 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r1 = r1 + 23
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r1
            if (r2 == 0) goto L6a
        L65:
            java.lang.String r1 = "af_latestchannel"
            r7.put(r1, r0)
        L6a:
            java.lang.String r0 = r6.force()
            if (r0 == 0) goto L81
            java.util.Locale r1 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r1 = "af_installstore"
            r7.put(r1, r0)
        L81:
            java.lang.String r0 = r6.w()
            if (r0 == 0) goto L98
            java.util.Locale r1 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r1 = "af_preinstall_name"
            r7.put(r1, r0)
        L98:
            java.lang.String r0 = r6.e()
            if (r0 == 0) goto Laf
            java.util.Locale r1 = java.util.Locale.ROOT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r1 = "af_currentstore"
            r7.put(r1, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getLevel(java.util.Map):void");
    }

    private void getSdkVersion(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1lSDK h_ = AFb1iSDK.h_(this.AFLogger.getContentResolver());
        if (h_ != null) {
            int i10 = AppsFlyerLib + 107;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("amazon_aid", h_.f5273d);
                map.put("amazon_aid_limit", String.valueOf(h_.AFLogger));
                throw null;
            }
            map.put("amazon_aid", h_.f5273d);
            map.put("amazon_aid_limit", String.valueOf(h_.AFLogger));
            int i11 = getLevel + 63;
            AppsFlyerLib = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AppsFlyerLib;
        String string = this.afErrorLog.getString(AppsFlyerProperties.ONELINK_VERSION);
        if (str != null) {
            int i10 = getLevel + 91;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("onelink_id", str);
                int i11 = 59 / 0;
            } else {
                map.put("onelink_id", str);
            }
        }
        if (string != null) {
            getLevel = (AppsFlyerLib + 83) % 128;
            map.put("onelink_ver", string);
            AppsFlyerLib = (getLevel + 15) % 128;
        }
        int i12 = AppsFlyerLib + 47;
        getLevel = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        r9.put("tokenRefreshConfigured", java.lang.Boolean.FALSE);
        r0 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        r9.put("tokenRefreshConfigured", java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        r0 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib + 69;
        com.appsflyer.internal.AFg1oSDK.getLevel = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onPause(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r1
            int r0 = r0 % 2
            java.lang.String r1 = "didConfigureTokenRefreshService="
            java.lang.String r2 = ""
            if (r0 != 0) goto L35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            android.content.Context r0 = r8.AFLogger
            boolean r0 = com.appsflyer.internal.AFg1vSDK.registerClient(r0)
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r3 = com.appsflyer.sdk_base.logger.LogTag.UNINSTALL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 4
            r7 = 0
            r5 = 0
            com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L76
            goto L59
        L35:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            android.content.Context r0 = r8.AFLogger
            boolean r0 = com.appsflyer.internal.AFg1vSDK.registerClient(r0)
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r3 = com.appsflyer.sdk_base.logger.LogTag.UNINSTALL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 4
            r7 = 0
            r5 = 0
            com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L76
        L59:
            int r0 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r1
            int r0 = r0 % 2
            java.lang.String r1 = "tokenRefreshConfigured"
            if (r0 != 0) goto L71
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.put(r1, r0)
            r0 = 11
            int r0 = r0 / 0
            goto L76
        L71:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.put(r1, r0)
        L76:
            com.appsflyer.internal.AFc1kSDK r0 = r8.f5416e
            java.lang.String r1 = "sentRegisterRequestToAF"
            boolean r0 = r0.AFKeystoreWrapper(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "registeredUninstall"
            r9.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.onPause(java.util.Map):void");
    }

    private void setImeiData(@NotNull Map<String, Object> map) {
        String str;
        Intrinsics.checkNotNullParameter(map, "");
        String AFLogger = this.f5417i.AFLogger("AF_COLLECT_FACEBOOK_ATTR_ID");
        if (AFLogger != null ? Boolean.parseBoolean(AFLogger) : true) {
            try {
                this.AFLogger.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = this.f5417i.registerClient(this.AFLogger);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                AppsFlyerLib = (getLevel + 19) % 128;
                map.put("fb", str);
            }
        }
        AppsFlyerLib = (getLevel + 31) % 128;
    }

    private void setOaidData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFf1fSDK aFf1fSDK = this.f5419w;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str != null && str.length() != 0) {
            int i10 = AppsFlyerLib + 109;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("appsflyerKey", str);
                throw null;
            }
            map.put("appsflyerKey", str);
        }
        getLevel = (AppsFlyerLib + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void stop(@NotNull Map<String, Object> map) {
        Locale locale;
        int i10 = getLevel + 35;
        AppsFlyerLib = i10 % 128;
        String str = "";
        try {
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device display language name", e10, false, false, false, false, 120, null);
            map.put("lang", "".getLanguage());
            locale = str;
        }
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Locale locale2 = Locale.getDefault();
        map.put("lang", locale2.getDisplayLanguage());
        locale = locale2;
        try {
            map.put("lang_code", locale.getLanguage());
        } catch (Exception e11) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device language code", e11, false, false, false, false, 120, null);
        }
        try {
            map.put("country", locale.getCountry());
        } catch (Exception e12) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device country code", e12, false, false, false, false, 120, null);
        }
    }

    private final void v(Map<String, Object> map) {
        try {
            long longValue = registerClient().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i10 = getLevel + 107;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve or format app install date", e10, false, false, false, false, 120, null);
        }
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        Object registerClient;
        String AFLogger;
        int i10 = AppsFlyerLib + 75;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK = AFa1uSDK.INSTANCE;
            registerClient = AFa1uSDK.registerClient(this.afErrorLog);
            AFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            int i11 = 62 / 0;
            if (registerClient == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK2 = AFa1uSDK.INSTANCE;
            registerClient = AFa1uSDK.registerClient(this.afErrorLog);
            AFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            if (registerClient == null) {
                return;
            }
        }
        if (AFLogger != null) {
            int i12 = AppsFlyerLib + 55;
            getLevel = i12 % 128;
            if (i12 % 2 == 0) {
                Integer.parseInt(AFLogger);
                throw null;
            }
            if (Integer.parseInt(AFLogger) > 0) {
                map.put("reinstallCounter", AFLogger);
                map.put("originalAppsflyerId", registerClient);
            }
        }
    }

    private void values(@NotNull Map<String, Object> map) {
        int i10 = getLevel + 91;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
            int i11 = 55 / 0;
        }
    }

    @Nullable
    private String w() {
        String string = this.afErrorLog.getString("preInstallName");
        if (string != null) {
            AppsFlyerLib = (getLevel + 67) % 128;
            return string;
        }
        String d10 = this.f5416e.d("preInstallName");
        if (d10 != null) {
            this.afErrorLog.set("preInstallName", d10);
            getLevel = (AppsFlyerLib + 23) % 128;
            return d10;
        }
        String afWarnLog = afWarnLog();
        if (afWarnLog == null) {
            int i10 = getLevel + 15;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                afWarnLog = registerClient("AF_PRE_INSTALL_NAME");
                int i11 = 42 / 0;
            } else {
                afWarnLog = registerClient("AF_PRE_INSTALL_NAME");
            }
        }
        if (afWarnLog != null) {
            this.f5416e.d("preInstallName", afWarnLog);
            this.afErrorLog.set("preInstallName", afWarnLog);
            getLevel = (AppsFlyerLib + 115) % 128;
        }
        return afWarnLog;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1ySDK aFi1ySDK = this.force.f5467d;
        AFi1xSDK unregisterClient = aFi1ySDK != null ? aFi1ySDK.unregisterClient() : null;
        if (unregisterClient != null) {
            map.put("network", unregisterClient.unregisterClient);
            map.put("ivc", Boolean.valueOf(unregisterClient.f5468d));
            if (this.AFLoggerLogLevel.afErrorLog) {
                return;
            }
            String str = unregisterClient.registerClient;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = unregisterClient.AFKeystoreWrapper;
            if (str2 == null) {
                getLevel = (AppsFlyerLib + 53) % 128;
                return;
            }
            int i10 = getLevel + 33;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("carrier", str2);
            } else {
                map.put("carrier", str2);
                int i11 = 22 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    @Override // com.appsflyer.internal.AFg1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerClient(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1pSDK r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.registerClient(com.appsflyer.internal.AFh1pSDK):void");
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AFLogger;
        if (str != null) {
            map.put("email_hashed", str);
            getLevel = (AppsFlyerLib + 27) % 128;
        }
        String str2 = this.AFLoggerLogLevel.f5285d;
        if (str2 != null) {
            map.put("phone_number_hashed", str2);
        }
        String str3 = this.AFLoggerLogLevel.registerClient;
        if (str3 != null) {
            map.put("phone_number_e164_hashed", str3);
            getLevel = (AppsFlyerLib + 45) % 128;
        }
        String str4 = this.AFLoggerLogLevel.AFKeystoreWrapper;
        if (str4 != null) {
            getLevel = (AppsFlyerLib + 53) % 128;
            map.put("first_name_hashed", str4);
        }
        String str5 = this.AFLoggerLogLevel.f5286e;
        if (str5 != null) {
            int i10 = AppsFlyerLib + 99;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("last_name_hashed", str5);
                int i11 = 21 / 0;
            } else {
                map.put("last_name_hashed", str5);
            }
        }
        Long l10 = this.AFLoggerLogLevel.f5287i;
        if (l10 != null) {
            map.put("fb_login_id", Long.valueOf(l10.longValue()));
        }
    }

    private static void a(int i10, char c10, int i11, Object[] objArr) {
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        long[] jArr = new long[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i12 = aFk1qSDK.unregisterClient;
            if (i12 >= i11) {
                break;
            }
            $11 = ($10 + 5) % 128;
            jArr[i12] = (((char) (valueOf[i10 + i12] ^ 7057235384081779850L)) ^ (i12 * (7057235384081779850L ^ getEntries))) ^ c10;
            aFk1qSDK.unregisterClient = i12 + 1;
        }
        char[] cArr = new char[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i13 = aFk1qSDK.unregisterClient;
            if (i13 >= i11) {
                String str = new String(cArr);
                $11 = ($10 + 45) % 128;
                objArr[0] = str;
                return;
            } else {
                cArr[i13] = (char) jArr[i13];
                aFk1qSDK.unregisterClient = i13 + 1;
                $11 = ($10 + 115) % 128;
            }
        }
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
    }

    private final void afInfoLog(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 884869374, -884869365, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK) {
        boolean z10;
        int i10 = getLevel + 95;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.f5437d;
            Intrinsics.checkNotNull(map);
            if (aFh1pSDK.f5440v == null) {
                getLevel = (AppsFlyerLib + 99) % 128;
                if (aFh1pSDK.f5441w == null) {
                    z10 = true;
                    d(map, z10);
                    AFLoggerLogLevel(map);
                    stop(map);
                    AFLogger(map);
                    registerClient(map, this.AFLoggerLogLevel.force);
                    getSdkVersion(map);
                    map.put("cell", kotlin.collections.k0.m(gt.s.a("mcc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mcc)), gt.s.a("mnc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mnc))));
                    map.put("sig", d());
                    map.put("last_boot_time", Long.valueOf(AFKeystoreWrapper()));
                    map.put("disk", (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis()));
                    AppsFlyerLib = (getLevel + 121) % 128;
                    return;
                }
            }
            z10 = false;
            d(map, z10);
            AFLoggerLogLevel(map);
            stop(map);
            AFLogger(map);
            registerClient(map, this.AFLoggerLogLevel.force);
            getSdkVersion(map);
            map.put("cell", kotlin.collections.k0.m(gt.s.a("mcc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mcc)), gt.s.a("mnc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mnc))));
            map.put("sig", d());
            map.put("last_boot_time", Long.valueOf(AFKeystoreWrapper()));
            map.put("disk", (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis()));
            AppsFlyerLib = (getLevel + 121) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNull(aFh1pSDK.f5437d);
        throw null;
    }

    private final void afErrorLog(Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 111) % 128;
        map.put("batteryLevel", String.valueOf(this.unregisterClient.registerClient(this.AFLogger).unregisterClient));
        int i10 = AppsFlyerLib + 47;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final String afWarnLog() {
        File AFKeystoreWrapper = AFKeystoreWrapper(AFLogger("ro.appsflyer.preinstall.path"));
        if (AFLogger(AFKeystoreWrapper)) {
            AFKeystoreWrapper = AFKeystoreWrapper(registerClient("AF_PRE_INSTALL_PATH"));
            getLevel = (AppsFlyerLib + 111) % 128;
        }
        if (AFLogger(AFKeystoreWrapper)) {
            AFKeystoreWrapper = AFKeystoreWrapper("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFLogger(AFKeystoreWrapper)) {
            AFKeystoreWrapper = AFKeystoreWrapper("/etc/pre_install.appsflyer");
        }
        if (AFLogger(AFKeystoreWrapper)) {
            AppsFlyerLib = (getLevel + 49) % 128;
            return null;
        }
        String packageName = this.AFLogger.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) unregisterClient(new Object[]{AFKeystoreWrapper, packageName}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat AFLoggerLogLevel() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        int i10 = getLevel + 125;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        String str;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = getLevel + 71;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            AFg1wSDK.AFa1vSDK registerClient = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f10 = registerClient.unregisterClient;
            str = registerClient.AFLogger;
            map.put("btl", String.valueOf(f10));
            int i11 = 14 / 0;
            if (str == null) {
                return null;
            }
        } else {
            AFg1wSDK.AFa1vSDK registerClient2 = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f11 = registerClient2.unregisterClient;
            String str2 = registerClient2.AFLogger;
            map.put("btl", String.valueOf(f11));
            if (str2 == null) {
                return null;
            }
            str = str2;
        }
        map.put("btch", str);
        AppsFlyerLib = (getLevel + 19) % 128;
        return null;
    }

    @Nullable
    private String e() {
        int i10 = getLevel + 29;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            String str = this.AFLoggerLogLevel.getLevel;
            if (str == null) {
                str = registerClient("AF_STORE");
            }
            int i11 = AppsFlyerLib + 41;
            getLevel = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 85 / 0;
            }
            return str;
        }
        String str2 = this.AFLoggerLogLevel.getLevel;
        throw null;
    }

    private final void w(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1429136643, -1429136643, System.identityHashCode(this));
    }

    private boolean i() {
        int i10 = getLevel + 93;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.parseBoolean(this.f5416e.d("sentSuccessfully"));
        }
        Boolean.parseBoolean(this.f5416e.d("sentSuccessfully"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.e(java.lang.Object[]):java.lang.Object");
    }

    private final SimpleDateFormat AFLogger() {
        int i10 = getLevel + 121;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afDebugLog.getValue();
        AppsFlyerLib = (getLevel + 51) % 128;
        return simpleDateFormat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0025, code lost:
    
        r11.put("appid", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0023, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // com.appsflyer.internal.AFg1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r10 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            if (r0 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            java.lang.String r0 = r0.values
            r2 = 25
            int r2 = r2 / 0
            if (r0 == 0) goto L2a
            goto L25
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            java.lang.String r0 = r0.values
            if (r0 == 0) goto L2a
        L25:
            java.lang.String r2 = "appid"
            r11.put(r2, r0)
        L2a:
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            java.lang.String r0 = r0.stop
            if (r0 == 0) goto L5c
            int r2 = r0.length()
            r3 = 3
            if (r2 == r3) goto L57
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r5 = com.appsflyer.sdk_base.logger.LogTag.GENERAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "WARNING: currency code should be 3 characters!!! '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "' is not a legal value."
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r8 = 4
            r9 = 0
            r7 = 0
            com.appsflyer.sdk_base.logger.AFLoggerBase.w$default(r4, r5, r6, r7, r8, r9)
        L57:
            java.lang.String r1 = "currency"
            r11.put(r1, r0)
        L5c:
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            boolean r0 = r0.getEntries
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "isUpdate"
            r11.put(r1, r0)
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            java.lang.String r0 = r0.getSdkVersion
            if (r0 == 0) goto L74
            java.lang.String r1 = "customData"
            r11.put(r1, r0)
        L74:
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            java.lang.String r0 = r0.valueOf
            if (r0 == 0) goto L91
            int r1 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r2
            int r1 = r1 % 2
            java.lang.String r2 = "appUserId"
            if (r1 == 0) goto L8c
            r11.put(r2, r0)
            goto L91
        L8c:
            r11.put(r2, r0)
            r11 = 0
            throw r11
        L91:
            com.appsflyer.internal.AFc1eSDK r0 = r10.AFLoggerLogLevel
            com.appsflyer.internal.AFb1rSDK r0 = r0.f5289w
            if (r0 == 0) goto Lb5
            int r1 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r2
            int r1 = r1 % 2
            if (r1 == 0) goto Lac
            java.lang.String[] r0 = r0.AFKeystoreWrapper
            r1 = 69
            int r1 = r1 / 0
            if (r0 == 0) goto Lb5
            goto Lb0
        Lac:
            java.lang.String[] r0 = r0.AFKeystoreWrapper
            if (r0 == 0) goto Lb5
        Lb0:
            java.lang.String r1 = "sharing_filter"
            r11.put(r1, r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.d(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull AFh1pSDK aFh1pSDK) {
        getLevel = (AppsFlyerLib + 43) % 128;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        v(map);
        Map<String, Object> map2 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        unregisterClient(map2, aFh1pSDK.afWarnLog);
        Map<String, Object> map3 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        getLevel(map3);
        Map<String, Object> map4 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        enableTCFDataCollection(map4);
        Map<String, Object> map5 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        setImeiData(map5);
        Map<String, Object> map6 = aFh1pSDK.f5437d;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1zSDK AFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        unregisterClient(map6, AFKeystoreWrapper);
        int i10 = getLevel + 63;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    private static String v() {
        return (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        switch ((i10 * (-661)) + (i11 * (-661)) + ((i13 | (~(i14 | i15))) * 1324) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + (((~(i10 | i15)) | (~(i11 | i14))) * 662)) {
            case 1:
                return unregisterClient(objArr);
            case 2:
                return d(objArr);
            case 3:
                return registerClient(objArr);
            case 4:
                AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
                Map map = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 5) % 128;
                Intrinsics.checkNotNullParameter(map, "");
                long unregisterClient = aFg1oSDK.f5416e.unregisterClient("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                aFg1oSDK.f5416e.AFLogger("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
                if (unregisterClient > 0) {
                    j10 = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - unregisterClient);
                    AppsFlyerLib = (getLevel + 1) % 128;
                } else {
                    AppsFlyerLib = (getLevel + 97) % 128;
                    j10 = -1;
                }
                map.put("timepassedsincelastlaunch", String.valueOf(j10));
                return null;
            case 5:
                return AFLogger(objArr);
            case 6:
                return force(objArr);
            case 7:
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                double pow = Math.pow(2.0d, 20.0d);
                String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
                getLevel = (AppsFlyerLib + 47) % 128;
                return str;
            case 8:
                return v(objArr);
            case 9:
                AFg1oSDK aFg1oSDK2 = (AFg1oSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 75) % 128;
                if (AFg1iSDK.registerClient(aFg1oSDK2.AFLogger)) {
                    map2.put("inst_app", Boolean.TRUE);
                    getLevel = (AppsFlyerLib + 39) % 128;
                }
                return null;
            case 10:
                return e(objArr);
            case 11:
                AppsFlyerLib = (getLevel + 125) % 128;
                List n10 = kotlin.collections.p.n(AFd1bSDK.registerClient, AFd1bSDK.afErrorLog, AFd1bSDK.AFLoggerLogLevel, AFd1bSDK.afWarnLog, AFd1bSDK.getLevel, AFd1bSDK.values, AFd1bSDK.valueOf);
                AppsFlyerLib = (getLevel + 67) % 128;
                return n10;
            default:
                return AFKeystoreWrapper(objArr);
        }
    }

    private static long AFKeystoreWrapper() {
        int i10 = getLevel + 99;
        AppsFlyerLib = i10 % 128;
        int i11 = i10 % 2;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        getLevel = (AppsFlyerLib + 23) % 128;
        return currentTimeMillis;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z10) {
        int i10 = AppsFlyerLib + 47;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f5415d.unregisterClient());
            int i11 = 65 / 0;
            if (!z10) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f5415d.unregisterClient());
            if (!z10) {
                return;
            }
        }
        map.put("platform_extension_v2", this.f5415d.AFLogger());
        getLevel = (AppsFlyerLib + 109) % 128;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void registerClient(@NotNull Map<String, Object> map) {
        Object b;
        AFLogger aFLogger;
        LogTag logTag;
        int i10;
        Object obj;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.AFLoggerLogLevel.unregisterClient;
        if (str2 != null) {
            int i11 = getLevel + 43;
            AppsFlyerLib = i11 % 128;
            if (i11 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GENERAL, "Skipping push payload processing: deeplink already extracted from intent", false, 4, null);
                } else {
                    try {
                        n.Companion companion = gt.n.INSTANCE;
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        b = gt.n.b(Unit.f22894a);
                    } catch (Throwable th2) {
                        n.Companion companion2 = gt.n.INSTANCE;
                        b = gt.n.b(gt.o.a(th2));
                    }
                    Throwable e10 = gt.n.e(b);
                    if (e10 != null) {
                        int i12 = AppsFlyerLib + 17;
                        getLevel = i12 % 128;
                        if (i12 % 2 == 0) {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            i10 = 27;
                            obj = null;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z10 = true;
                            z11 = false;
                            z12 = false;
                            z13 = true;
                        } else {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            i10 = 120;
                            obj = null;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                        }
                        AFLoggerBase.e$default(aFLogger, logTag, str, e10, z10, z11, z12, z13, i10, obj);
                    }
                    gt.n.a(b);
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        } else {
            getLevel = (AppsFlyerLib + 87) % 128;
        }
        this.AFLoggerLogLevel.unregisterClient = null;
    }

    @NotNull
    private String AFLogger(@NotNull SimpleDateFormat simpleDateFormat, int i10) {
        int i11 = AppsFlyerLib + 91;
        getLevel = i11 % 128;
        String str = "";
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String d10 = this.f5416e.d("appsFlyerFirstInstall");
            if (d10 == null || d10.length() == 0) {
                if (i10 <= 1) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "First app launch detected, recording install timestamp", false, 4, null);
                    str = simpleDateFormat.format(new Date());
                    getLevel = (AppsFlyerLib + 29) % 128;
                } else {
                    AppsFlyerLib = (getLevel + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
                }
                this.f5416e.d("appsFlyerFirstInstall", str);
                d10 = str;
            }
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "AppsFlyer: first launch date: " + d10, false, 4, null);
            Intrinsics.checkNotNull(d10);
            return d10;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.f5416e.d("appsFlyerFirstInstall");
        throw null;
    }

    @Nullable
    private String force() {
        String d10 = this.f5416e.d("INSTALL_STORE");
        if (d10 != null) {
            getLevel = (AppsFlyerLib + 27) % 128;
            return d10;
        }
        String e10 = e();
        if (e10 != null) {
            int i10 = AppsFlyerLib + 123;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                this.f5416e.d("INSTALL_STORE", e10);
                int i11 = 97 / 0;
                return e10;
            }
            this.f5416e.d("INSTALL_STORE", e10);
        }
        return e10;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str) {
        int i10 = AppsFlyerLib + 13;
        getLevel = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String d10 = this.f5416e.d("prev_event_name");
                if (d10 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.f5416e.unregisterClient("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", d10);
                    map.put("prev_event", jSONObject);
                    AppsFlyerLib = (getLevel + 31) % 128;
                }
                this.f5416e.d("prev_event_name", str);
                this.f5416e.AFLogger("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.f5416e.d("prev_event_name");
            throw null;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Failed to save previous event metadata to preferences", e10, false, false, false, false, 120, null);
        }
    }

    private final void force(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1798824484, -1798824476, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = getLevel + 49;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    private void registerClient(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
        if (aFc1eSDK.afInfoLog) {
            int i10 = AppsFlyerLib + 7;
            getLevel = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("deviceTrackingDisabled", "true");
                return;
            } else {
                map.put("deviceTrackingDisabled", "true");
                int i11 = 41 / 0;
                return;
            }
        }
        String str2 = aFc1eSDK.AFLoggerLogLevel;
        if (str2 != null && str2.length() != 0) {
            AppsFlyerLib = (getLevel + 39) % 128;
            map.put("imei", str2);
        }
        String d10 = d(str);
        if (d10 != null) {
            AppsFlyerLib = (getLevel + 47) % 128;
            this.f5416e.d("androidIdCached", d10);
            map.put("android_id", d10);
        } else {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Android ID collection skipped: not available or not permitted", false, 4, null);
        }
        AFb1lSDK unregisterClient = AFb1iSDK.unregisterClient(this.AFLogger);
        if (unregisterClient != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", unregisterClient.unregisterClient);
            linkedHashMap.put("val", unregisterClient.f5273d);
            Boolean bool = unregisterClient.AFLogger;
            if (bool != null) {
                int i12 = AppsFlyerLib + HttpStatusCodesKt.HTTP_EARLY_HINTS;
                getLevel = i12 % 128;
                if (i12 % 2 != 0) {
                    linkedHashMap.put("isLat", bool);
                } else {
                    linkedHashMap.put("isLat", bool);
                    throw null;
                }
            }
            map.put("oaid", linkedHashMap);
            int i13 = AppsFlyerLib + 43;
            getLevel = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        String AFLogger;
        int i10 = getLevel + 83;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger = AFb1jSDK.AFLogger(this.f5417i.AFKeystoreWrapper);
            int i11 = 2 / 0;
            if (AFLogger == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger = AFb1jSDK.AFLogger(this.f5417i.AFKeystoreWrapper);
            if (AFLogger == null) {
                return;
            }
        }
        map.put("uid", AFLogger);
        if (this.f5417i.AFKeystoreWrapper.AFKeystoreWrapper("CUSTOM_INSTALL_ID_APPLIED")) {
            map.put("custom_install_id", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 119) % 128;
        }
    }

    @Nullable
    private String d() {
        int i10 = AppsFlyerLib + 55;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            PackageManager packageManager = this.AFLogger.getApplicationContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            String packageName = this.AFLogger.getApplicationContext().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AndroidExtensionsKt.signature(packageManager, packageName);
        }
        PackageManager packageManager2 = this.AFLogger.getApplicationContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager2, "");
        String packageName2 = this.AFLogger.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "");
        AndroidExtensionsKt.signature(packageManager2, packageName2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r4.length() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String d(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r0 = r0 + 49
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L52
            com.appsflyer.internal.AFc1eSDK r0 = r3.AFLoggerLogLevel
            boolean r0 = r0.afWarnLog
            if (r0 == 0) goto L47
            if (r4 == 0) goto L2a
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L26
            int r0 = r4.length()
            if (r0 != 0) goto L47
            goto L2a
        L26:
            r4.length()
            throw r2
        L2a:
            int r4 = com.appsflyer.internal.AFg1oSDK.AppsFlyerLib
            int r4 = r4 + 79
            int r0 = r4 % 128
            com.appsflyer.internal.AFg1oSDK.getLevel = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L43
            boolean r4 = r3.afInfoLog()
            if (r4 == 0) goto L41
            java.lang.String r4 = r3.afErrorLog()
            goto L49
        L41:
            r4 = r2
            goto L49
        L43:
            r3.afInfoLog()
            throw r2
        L47:
            if (r4 == 0) goto L41
        L49:
            int r0 = com.appsflyer.internal.AFg1oSDK.getLevel
            int r0 = r0 + 103
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.AppsFlyerLib = r0
            return r4
        L52:
            com.appsflyer.internal.AFc1eSDK r4 = r3.AFLoggerLogLevel
            boolean r4 = r4.afWarnLog
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.d(java.lang.String):java.lang.String");
    }

    private final void unregisterClient(Map<String, Object> map, int i10) {
        String obj;
        Integer intOrNull;
        getLevel = (AppsFlyerLib + 17) % 128;
        try {
            if (this.f5417i.r_().versionCode > this.f5416e.AFLogger("versionCode", 0)) {
                this.f5416e.d("versionCode", this.f5417i.r_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.f5417i.r_().versionCode));
            map.put("app_version_name", this.f5417i.r_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.f5417i.f5296d.f5343d.getApplicationInfo().targetSdkVersion));
            map.put("date1", AFLogger().format(new Date(registerClient().longValue())));
            map.put("date2", AFLogger().format(new Date(this.f5417i.r_().lastUpdateTime)));
            Object obj2 = map.get("counter");
            if (obj2 == null || (obj = obj2.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj)) == null) {
                AppsFlyerLib = (getLevel + 125) % 128;
            } else {
                int i11 = getLevel + 9;
                AppsFlyerLib = i11 % 128;
                if (i11 % 2 != 0) {
                    i10 = intOrNull.intValue();
                    int i12 = 25 / 0;
                } else {
                    i10 = intOrNull.intValue();
                }
                getLevel = (AppsFlyerLib + 33) % 128;
            }
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777216, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15023), (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat AFLogger = AFLogger();
            Intrinsics.checkNotNullExpressionValue(AFLogger, "");
            map.put(intern, AFLogger(AFLogger, i10));
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to collect app version and update date information", th2, false, true, false, false, 104, null);
        }
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String AFLogger(@Nullable String str) {
        getLevel = (AppsFlyerLib + 69) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.d(invoke, "");
            return (String) invoke;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = th2.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 113) % 128;
                message = "Failed to retrieve system property via reflection";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th2, false, false, false, false, 120, null);
            return null;
        }
    }

    private static File AFKeystoreWrapper(String str) {
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 77) % 128;
        try {
            if (StringsKt.p1(str).toString().length() > 0) {
                int i10 = AppsFlyerLib;
                int i11 = i10 + 55;
                getLevel = i11 % 128;
                r1 = i11 % 2 != 0;
                getLevel = (i10 + 21) % 128;
            }
            if (r1) {
                return new File(StringsKt.p1(str).toString());
            }
            return null;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.PREINSTALL;
            String message = th2.getMessage();
            if (message == null) {
                message = "Failed to create File object from path";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th2, false, false, false, false, 120, null);
            return null;
        }
    }

    private static boolean AFLogger(File file) {
        int i10 = AppsFlyerLib + 29;
        int i11 = i10 % 128;
        getLevel = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i12 = i11 + 115;
        AppsFlyerLib = i12 % 128;
        if (i12 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    private static void AFLogger(@NotNull Map<String, Object> map, @NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        String str = aFh1pSDK.f5440v;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1pSDK.AFKeystoreWrapper;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5437d;
        Intrinsics.checkNotNull(map);
        map.put("open_referrer", aFh1pSDK.f5438e);
        String str = aFh1pSDK.afInfoLog;
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 35) % 128;
        if (StringsKt.p0(str)) {
            return null;
        }
        int i10 = getLevel + 33;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("af_web_referrer", aFh1pSDK.afInfoLog);
            int i11 = 75 / 0;
            return null;
        }
        map.put("af_web_referrer", aFh1pSDK.afInfoLog);
        return null;
    }

    private void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK, @Nullable AFb1qSDK aFb1qSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK, aFb1qSDK}, -2092575724, 2092575725, System.identityHashCode(this));
    }

    @NotNull
    private Long registerClient() {
        int i10 = AppsFlyerLib + 15;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return Long.valueOf(this.f5417i.r_().firstInstallTime);
        }
        int i11 = 28 / 0;
        return Long.valueOf(this.f5417i.r_().firstInstallTime);
    }

    private static String d(File file, String str) {
        return (String) unregisterClient(new Object[]{file, str}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AppsFlyerLib = (getLevel + 83) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = AppsFlyerLib + 45;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return Long.valueOf(currentTimeMillis);
        }
        throw null;
    }

    private static String registerClient(AFc1kSDK aFc1kSDK, String str) {
        AppsFlyerLib = (getLevel + 81) % 128;
        String d10 = aFc1kSDK.d("CACHED_CHANNEL");
        if (d10 != null) {
            AppsFlyerLib = (getLevel + 89) % 128;
            return d10;
        }
        aFc1kSDK.d("CACHED_CHANNEL", str);
        int i10 = AppsFlyerLib + 15;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 34 / 0;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 102039780, -102039774, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, int i10, int i11) {
        getLevel = (AppsFlyerLib + 97) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        boolean z10 = false;
        if (!i()) {
            int i12 = getLevel + 27;
            AppsFlyerLib = i12 % 128;
            if (i12 % 2 == 0) {
                z10 = true;
            }
        }
        map.put("isFirstCall", String.valueOf(z10));
        getLevel = (AppsFlyerLib + 125) % 128;
    }

    private final String registerClient(String str) {
        AppsFlyerLib = (getLevel + 125) % 128;
        String AFLogger = this.f5417i.AFLogger(str);
        AppsFlyerLib = (getLevel + 69) % 128;
        return AFLogger;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        AFb1qSDK aFb1qSDK = (AFb1qSDK) objArr[2];
        int i10 = AppsFlyerLib + 89;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.f5437d;
            if (aFh1pSDK.AFKeystoreWrapper() == AFd1bSDK.registerClient) {
                int i11 = AppsFlyerLib + 9;
                getLevel = i11 % 128;
                if (i11 % 2 != 0) {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.f5417i, aFg1oSDK.afErrorLog);
                } else {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.f5417i, aFg1oSDK.afErrorLog);
                    throw null;
                }
            }
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{aFg1oSDK, map}, 291205159, -291205155, System.identityHashCode(aFg1oSDK));
            aFg1oSDK.i(map);
            aFg1oSDK.e(map);
            aFg1oSDK.getEntries(map);
            if (aFb1qSDK != null) {
                AppsFlyerLib = (getLevel + 109) % 128;
                aFb1qSDK.AFLogger(map);
                getLevel = (AppsFlyerLib + 53) % 128;
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map2 = aFh1pSDK.f5437d;
        aFh1pSDK.AFKeystoreWrapper();
        AFd1bSDK.Companion companion = AFd1bSDK.INSTANCE;
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        getLevel = (AppsFlyerLib + 19) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        if (CollectionsKt.W((List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis()), aFe1zSDK)) {
            AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
            if (aFc1eSDK.setCustomerUserId) {
                map.put("app_set_id", kotlin.collections.j0.g(gt.s.a("app_set_id_disabled", Boolean.TRUE)));
                if (this.AFLoggerLogLevel.setUserEmail != null) {
                    getLevel = (AppsFlyerLib + 59) % 128;
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                } else {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                    return;
                }
            }
            AFc1rSDK aFc1rSDK = aFc1eSDK.setUserEmail;
            if (aFc1rSDK != null) {
                map.put("app_set_id", kotlin.collections.k0.m(gt.s.a("scope", Integer.valueOf(aFc1rSDK.AFKeystoreWrapper)), gt.s.a("id", aFc1rSDK.unregisterClient)));
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 1765853168, -1765853166, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long unregisterClient() {
        return ((Long) unregisterClient(new Object[]{this}, -2087428651, 2087428654, System.identityHashCode(this))).longValue();
    }
}
