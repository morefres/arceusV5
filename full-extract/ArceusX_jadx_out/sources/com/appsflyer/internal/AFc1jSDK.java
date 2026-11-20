package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1jSDK {

    @NotNull
    private static final gt.h unregisterClient = gt.i.b(new Function0() { // from class: com.appsflyer.internal.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExecutorService registerClient;
            registerClient = AFc1jSDK.registerClient();
            return registerClient;
        }
    });

    @NotNull
    public static final ScheduledExecutorService AFKeystoreWrapper() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
        return newScheduledThreadPool;
    }

    @NotNull
    public static final ScheduledExecutorService AFLogger() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "");
        return newSingleThreadScheduledExecutor;
    }

    @NotNull
    public static final ExecutorService d() {
        Object value = unregisterClient.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService registerClient() {
        return Executors.newSingleThreadExecutor();
    }

    @NotNull
    public static final ExecutorService unregisterClient() {
        AFc1oSDK aFc1oSDK = new AFc1oSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1oSDK.allowCoreThreadTimeOut(true);
        return aFc1oSDK;
    }
}
