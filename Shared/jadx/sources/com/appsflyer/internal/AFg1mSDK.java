package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFg1mSDK extends AFe1kSDK<Map<String, ? extends Object>> {

    @Nullable
    private final AppsFlyerConversionListener AFLoggerLogLevel;

    @NotNull
    private final AFh1xSDK afDebugLog;

    @Nullable
    private String afInfoLog;

    @Nullable
    private Map<String, ? extends Object> afWarnLog;

    @NotNull
    private final AFc1iSDK force;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f5414v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFg1mSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.afDebugLog, new AFe1zSDK[]{AFd1bSDK.f5306d}, aFc1bSDK, "GCD-FETCH");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFc1iSDK AFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.force = AFLogger;
        AFc1kSDK AFKeystoreWrapper = aFc1bSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        this.f5414v = AFKeystoreWrapper;
        AFh1xSDK e10 = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(e10, "");
        this.afDebugLog = e10;
        this.AFLoggerLogLevel = aFc1bSDK.setUserFirstName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.registerClient;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.afErrorLog;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        Map<String, ? extends Object> map = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.d(map, this.AFLoggerLogLevel);
            return;
        }
        String str = this.afInfoLog;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            str = "Unknown error";
        }
        AFg1kSDK.registerClient(str, this.AFLoggerLogLevel);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[Catch: all -> 0x006a, Exception -> 0x006d, AFe1uSDK -> 0x0071, TryCatch #3 {AFe1uSDK -> 0x0071, Exception -> 0x006d, blocks: (B:11:0x0028, B:23:0x0030, B:29:0x0040, B:36:0x0053, B:37:0x0074, B:39:0x0085, B:40:0x009d, B:42:0x00ab, B:43:0x00b6, B:45:0x00bc, B:47:0x00c2, B:49:0x00ef, B:50:0x00d9, B:51:0x00fb, B:53:0x0118, B:54:0x011d), top: B:10:0x0028, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x006a, Exception -> 0x006d, AFe1uSDK -> 0x0071, TryCatch #3 {AFe1uSDK -> 0x0071, Exception -> 0x006d, blocks: (B:11:0x0028, B:23:0x0030, B:29:0x0040, B:36:0x0053, B:37:0x0074, B:39:0x0085, B:40:0x009d, B:42:0x00ab, B:43:0x00b6, B:45:0x00bc, B:47:0x00c2, B:49:0x00ef, B:50:0x00d9, B:51:0x00fb, B:53:0x0118, B:54:0x011d), top: B:10:0x0028, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: all -> 0x006a, Exception -> 0x006d, AFe1uSDK -> 0x0071, TryCatch #3 {AFe1uSDK -> 0x0071, Exception -> 0x006d, blocks: (B:11:0x0028, B:23:0x0030, B:29:0x0040, B:36:0x0053, B:37:0x0074, B:39:0x0085, B:40:0x009d, B:42:0x00ab, B:43:0x00b6, B:45:0x00bc, B:47:0x00c2, B:49:0x00ef, B:50:0x00d9, B:51:0x00fb, B:53:0x0118, B:54:0x011d), top: B:10:0x0028, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: all -> 0x006a, Exception -> 0x006d, AFe1uSDK -> 0x0071, TryCatch #3 {AFe1uSDK -> 0x0071, Exception -> 0x006d, blocks: (B:11:0x0028, B:23:0x0030, B:29:0x0040, B:36:0x0053, B:37:0x0074, B:39:0x0085, B:40:0x009d, B:42:0x00ab, B:43:0x00b6, B:45:0x00bc, B:47:0x00c2, B:49:0x00ef, B:50:0x00d9, B:51:0x00fb, B:53:0x0118, B:54:0x011d), top: B:10:0x0028, outer: #2 }] */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1cSDK registerClient() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1mSDK.registerClient():com.appsflyer.internal.AFd1cSDK");
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<Map<String, ? extends Object>> AFLogger(@NotNull String str) {
        List list;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        AFc1kSDK aFc1kSDK = this.f5414v;
        String AFLogger = this.force.AFLogger("CHANNEL");
        if (AFLogger != null && AFLogger.equals("")) {
            AFLogger = null;
        }
        String d10 = AFa1tSDK.d(aFc1kSDK, AFLogger);
        if (d10 != null && !StringsKt.p0(d10)) {
            list = AFg1jSDK.AFKeystoreWrapper;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = d10.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (list.contains(lowerCase)) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD] AF detected using redundant Google-Play channel for attribution - " + d10 + ". Using without channel postfix.", false, 4, null);
            } else {
                str2 = "-" + d10;
            }
        }
        AFd1pSDK<Map<String, ? extends Object>> AFKeystoreWrapper = getRl.d.a java.lang.String().AFKeystoreWrapper(str2, str);
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-B01] URL: " + AFKeystoreWrapper.unregisterClient.f5319d, false, 4, null);
        Intrinsics.checkNotNull(AFKeystoreWrapper);
        return AFKeystoreWrapper;
    }
}
