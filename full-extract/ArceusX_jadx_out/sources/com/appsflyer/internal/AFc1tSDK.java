package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1tSDK implements AFb1aSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFf1fSDK f5303d;

    @NotNull
    private final AFd1zSDK unregisterClient;

    public AFc1tSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1fSDK aFf1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        this.AFLogger = aFc1eSDK;
        this.unregisterClient = aFd1zSDK;
        this.f5303d = aFf1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFc1tSDK aFc1tSDK, x8.c cVar) {
        AFc1eSDK aFc1eSDK = aFc1tSDK.AFLogger;
        int b = cVar.b();
        String a10 = cVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "");
        aFc1eSDK.setUserEmail = new AFc1rSDK(b, a10);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean AFLogger() {
        return !this.f5303d.AFLogger() && !this.AFLogger.setCustomerUserId && AFj1qSDK.AFLogger(this.unregisterClient.f5343d) && AFj1qSDK.registerClient(this.unregisterClient.f5343d);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void unregisterClient() {
        Context context = this.unregisterClient.f5343d;
        if (context != null) {
            try {
                x8.a.a(context).j().g(new sb.g() { // from class: com.appsflyer.internal.b0
                    @Override // sb.g
                    public final void onSuccess(Object obj) {
                        AFc1tSDK.registerClient(AFc1tSDK.this, (x8.c) obj);
                    }
                });
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f22894a;
            }
        }
    }
}
