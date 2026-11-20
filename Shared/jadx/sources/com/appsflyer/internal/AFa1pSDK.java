package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFa1pSDK implements Runnable {

    @NotNull
    private final AFc1bSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Map<String, Object> f5261d;

    @NotNull
    private final AFh1pSDK unregisterClient;

    public AFa1pSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFh1pSDK aFh1pSDK, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        this.AFLogger = aFc1bSDK;
        this.unregisterClient = aFh1pSDK;
        this.f5261d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1tSDK aFf1tSDK;
        AFh1pSDK aFh1pSDK = this.unregisterClient;
        if (aFh1pSDK.f5440v == null && aFh1pSDK.f5441w == null) {
            AFf1uSDK aFf1uSDK = new AFf1uSDK(this.unregisterClient, this.AFLogger);
            aFf1uSDK.f5399v = this.f5261d;
            aFf1tSDK = aFf1uSDK;
        } else {
            aFf1tSDK = aFh1pSDK instanceof AFh1lSDK ? new AFf1vSDK((AFh1lSDK) this.unregisterClient, this.AFLogger) : new AFf1tSDK(this.unregisterClient, this.AFLogger, null, 4, null);
        }
        this.AFLogger.afWarnLog().d(aFf1tSDK);
    }
}
