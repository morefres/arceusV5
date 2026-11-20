package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* loaded from: classes.dex */
public final class AFi1cSDK extends Referrer {
    private final AFc1bSDK AFKeystoreWrapper;
    final ProviderInfo registerClient;

    public AFi1cSDK(ProviderInfo providerInfo, ReferrerProp referrerProp, AFc1bSDK aFc1bSDK) {
        super(Payload.TYPE_AF_REFERRER, providerInfo.authority, referrerProp);
        this.AFKeystoreWrapper = aFc1bSDK;
        this.registerClient = providerInfo;
    }

    public static ContentProviderClient N_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void start(final Context context) {
        this.AFKeystoreWrapper.d().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1cSDK.1
            /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1cSDK.AnonymousClass1.run():void");
            }
        });
    }
}
