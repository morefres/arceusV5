package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFe1nSDK extends AFe1kSDK<String> {

    @NotNull
    private final AFc1iSDK afWarnLog;

    @Nullable
    private final AFj1bSDK force;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final String f5358v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1nSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull String str, @Nullable AFj1bSDK aFj1bSDK) {
        super(AFd1bSDK.AppsFlyerLib, new AFe1zSDK[]{AFd1bSDK.f5306d, AFd1bSDK.AFKeystoreWrapper}, aFc1bSDK, str);
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f5358v = str;
        this.force = aFj1bSDK;
        AFc1iSDK AFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.afWarnLog = AFLogger;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        AFj1bSDK aFj1bSDK;
        super.force();
        AFd1fSDK<Result> aFd1fSDK = ((AFe1kSDK) this).v;
        if (aFd1fSDK == 0) {
            return;
        }
        int statusCode = aFd1fSDK.getStatusCode();
        if (statusCode == 200) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "Cross promotion impressions success: " + this.f5358v, false);
            return;
        }
        if (statusCode != 301 && statusCode != 302) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "call to " + this.f5358v + " failed: " + aFd1fSDK.getStatusCode(), true);
            return;
        }
        AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "Cross promotion redirection success: " + this.f5358v, false);
        String AFKeystoreWrapper = aFd1fSDK.AFKeystoreWrapper("Location");
        if (AFKeystoreWrapper == null || (aFj1bSDK = this.force) == null) {
            return;
        }
        aFj1bSDK.unregisterClient = AFKeystoreWrapper;
        Context context = aFj1bSDK.AFKeystoreWrapper.get();
        if (context != null) {
            try {
                if (aFj1bSDK.unregisterClient != null) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1bSDK.unregisterClient)).setFlags(268435456));
                }
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(LogTag.CROSS_PROMOTION, "Failed to open cross promotion URL; is a browser app installed?", e10);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        AFd1sSDK aFd1sSDK = getRl.d.a java.lang.String();
        String AFLogger = this.afWarnLog.AFLogger();
        if (AFLogger == null || AFLogger.length() == 0) {
            str2 = this.f5358v;
        } else {
            str2 = Uri.parse(this.f5358v).buildUpon().appendQueryParameter("advertising_id", AFLogger).build().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        AFd1pSDK<String> d10 = aFd1sSDK.d(str2);
        Intrinsics.checkNotNullExpressionValue(d10, "");
        return d10;
    }
}
