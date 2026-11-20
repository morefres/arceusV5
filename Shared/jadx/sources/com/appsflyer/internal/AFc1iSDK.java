package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AFc1iSDK {
    private static String AFLogger = "386";
    public final AFc1kSDK AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    public final AFd1zSDK f5296d;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f5297i;
    public final AFc1eSDK registerClient;

    /* renamed from: w, reason: collision with root package name */
    private PackageInfo f5298w;
    private Bundle force = null;
    public String unregisterClient = "";

    public AFc1iSDK(AFd1zSDK aFd1zSDK, AFc1kSDK aFc1kSDK, AFc1eSDK aFc1eSDK, Executor executor) {
        this.f5296d = aFd1zSDK;
        this.AFKeystoreWrapper = aFc1kSDK;
        this.registerClient = aFc1eSDK;
        this.f5297i = executor;
    }

    public static String d() {
        StringBuilder sb2 = new StringBuilder("version: 7.0.1 (build ");
        sb2.append(AFLogger);
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public static String unregisterClient() {
        return "7.0.1";
    }

    @SuppressLint({"DiscouragedApi"})
    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.f5296d.f5343d.getResources().getIdentifier(str, InquiryField.StringField.TYPE, this.f5296d.f5343d.getPackageName());
            if (identifier != 0) {
                return this.f5296d.f5343d.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb2 = new StringBuilder("Could not load string resource: ");
            sb2.append(e10.getMessage() != null ? e10.getMessage() : "resource not found");
            aFLogger.e(logTag, sb2.toString(), e10);
            return null;
        }
    }

    public final String AFLogger(String str) {
        Object obj;
        try {
            if (this.force == null) {
                this.force = ((PackageItemInfo) this.f5296d.f5343d.getPackageManager().getApplicationInfo(this.f5296d.f5343d.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.force;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata: ");
            sb2.append(th2.getMessage() != null ? th2.getMessage() : "unknown error");
            aFLogger.e(logTag, sb2.toString(), th2);
            return null;
        }
    }

    @NonNull
    public final PackageInfo r_() {
        if (this.f5298w == null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.f5298w = this.f5296d.f5343d.getPackageManager().getPackageInfo(this.f5296d.f5343d.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.f5298w = this.f5296d.f5343d.getPackageManager().getPackageInfo(this.f5296d.f5343d.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception while trying fo get PackageInfo", e10, false, false, true, false);
            }
        }
        return this.f5298w;
    }

    public final String registerClient(Context context) {
        try {
            return new AFb1mSDK(context, this.f5297i).registerClient();
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th2, true, false, false);
            return null;
        }
    }

    public final long unregisterClient(String str, long j10) {
        String AFLogger2 = AFLogger(str);
        if (AFLogger2 != null) {
            try {
                return Long.parseLong(AFLogger2);
            } catch (NumberFormatException unused) {
            }
        }
        return j10;
    }

    public final boolean AFKeystoreWrapper(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(LogTag.PUBLIC_API, "Could not check if app is pre installed", e10);
        }
        return (this.f5296d.f5343d.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    public final String AFLogger() {
        AdvertisingIdData advertisingIdData = this.registerClient.updateServerUninstallToken;
        AFb1lSDK aFb1lSDK = advertisingIdData != null ? new AFb1lSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
        if (aFb1lSDK != null) {
            return aFb1lSDK.f5273d;
        }
        return null;
    }
}
