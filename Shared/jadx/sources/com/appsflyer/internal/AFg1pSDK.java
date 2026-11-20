package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.sdk_base.logger.LogTag;

/* loaded from: classes.dex */
public final class AFg1pSDK implements AFg1wSDK {
    private static IntentFilter unregisterClient = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1wSDK
    @NonNull
    public final AFg1wSDK.AFa1vSDK registerClient(@NonNull Context context) {
        String str;
        String str2 = null;
        float f10 = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, unregisterClient);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f10 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.DEVICE_DATA, "Failed to register receiver for battery status", th2, false, false);
        }
        return new AFg1wSDK.AFa1vSDK(f10, str2);
    }
}
