package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1bSDK extends Referrer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1bSDK(@NotNull ReferrerProp referrerProp) {
        super(Payload.TYPE_PRELOAD, Payload.SOURCE_SAMSUNG, referrerProp);
        Intrinsics.checkNotNullParameter(referrerProp, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0114, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AFKeystoreWrapper(com.appsflyer.internal.AFi1bSDK r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1bSDK.AFKeystoreWrapper(com.appsflyer.internal.AFi1bSDK, android.content.Context):void");
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void addLatency() {
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    @SuppressLint({"NewApi"})
    public final void start(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null) {
            getProp().getBackgroundExecutor().execute(new Runnable() { // from class: com.appsflyer.internal.a1
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1bSDK.AFKeystoreWrapper(AFi1bSDK.this, context);
                }
            });
        } else {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        }
    }
}
