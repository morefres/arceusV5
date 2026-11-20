package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;

/* loaded from: classes.dex */
public final class AFb1iSDK {
    public static String AFLogger;
    public static Boolean unregisterClient;

    public static AFb1lSDK h_(ContentResolver contentResolver) {
        String str;
        Boolean bool = unregisterClient;
        if ((bool != null && !bool.booleanValue()) || contentResolver == null || AFa1tSDK.d().AFKeystoreWrapper.registerClient().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i10 == 0) {
            return new AFb1lSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i10 == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.ADVERTISING_ID, "Failed to fetch Amazon Advertising ID: ad tracking may be limited", th2);
            str = "";
        }
        return new AFb1lSDK(str, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFb1lSDK unregisterClient(android.content.Context r6) {
        /*
            com.appsflyer.internal.AFa1tSDK r0 = com.appsflyer.internal.AFa1tSDK.d()
            com.appsflyer.internal.AFc1aSDK r0 = r0.AFKeystoreWrapper
            com.appsflyer.internal.AFc1eSDK r0 = r0.setAndroidIdData()
            java.lang.String r1 = com.appsflyer.internal.AFb1iSDK.AFLogger
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            r5 = 0
            if (r4 == 0) goto L18
        L16:
            r6 = r5
            goto L5a
        L18:
            java.lang.Boolean r1 = com.appsflyer.internal.AFb1iSDK.unregisterClient
            if (r1 == 0) goto L26
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L23
            goto L26
        L23:
            r6 = r5
            r1 = r6
            goto L5a
        L26:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            com.appsflyer.AFLogger$LogLevel r6 = r0.enableTCFDataCollection     // Catch: java.lang.Throwable -> L4f
            int r6 = r6.getLevel()     // Catch: java.lang.Throwable -> L4f
            com.appsflyer.AFLogger$LogLevel r0 = com.appsflyer.AFLogger.LogLevel.NONE     // Catch: java.lang.Throwable -> L4f
            int r0 = r0.getLevel()     // Catch: java.lang.Throwable -> L4f
            if (r6 <= r0) goto L3a
            r2 = r3
        L3a:
            r1.setLogging(r2)     // Catch: java.lang.Throwable -> L4f
            com.appsflyer.oaid.OaidClient$Info r6 = r1.fetch()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L23
            java.lang.String r0 = r6.getId()     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r6 = r6.getLat()     // Catch: java.lang.Throwable -> L4d
            r1 = r0
            goto L5a
        L4d:
            r1 = r0
            goto L50
        L4f:
            r1 = r5
        L50:
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r0 = com.appsflyer.sdk_base.logger.LogTag.ADVERTISING_ID
            java.lang.String r2 = "OAID library not available in application"
            r6.d(r0, r2)
            goto L16
        L5a:
            if (r1 == 0) goto L68
            com.appsflyer.internal.AFb1lSDK r0 = new com.appsflyer.internal.AFb1lSDK
            r0.<init>(r1, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0.unregisterClient = r6
            return r0
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.unregisterClient(android.content.Context):com.appsflyer.internal.AFb1lSDK");
    }
}
