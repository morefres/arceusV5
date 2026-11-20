package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public final class AFg1vSDK {
    public final AFc1kSDK registerClient = AFa1tSDK.d().AFKeystoreWrapper.AFKeystoreWrapper();
    private final AppsFlyerProperties AFKeystoreWrapper = AFa1tSDK.d().AFKeystoreWrapper.registerClient();

    public static boolean registerClient(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th2);
        }
        return context.getPackageManager().queryIntentServices(new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class), 0).size() > 0;
    }

    public final AFg1sSDK d() {
        String string;
        String string2;
        String d10 = this.registerClient.d("afUninstallToken");
        long unregisterClient = this.registerClient.unregisterClient("afUninstallToken_received_time", 0L);
        boolean AFKeystoreWrapper = this.registerClient.AFKeystoreWrapper("afUninstallToken_queued");
        this.registerClient.registerClient("afUninstallToken_queued", false);
        if (d10 == null && (string2 = this.AFKeystoreWrapper.getString("afUninstallToken")) != null) {
            d10 = string2.split(",")[r0.length - 1];
        }
        if (unregisterClient == 0 && (string = this.AFKeystoreWrapper.getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    unregisterClient = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (d10 != null) {
            return new AFg1sSDK(d10, unregisterClient, AFKeystoreWrapper);
        }
        return null;
    }
}
