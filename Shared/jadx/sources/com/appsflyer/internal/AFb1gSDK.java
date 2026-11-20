package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import gt.n;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
final class AFb1gSDK implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private ScheduledFuture<?> AFKeystoreWrapper;

    @NotNull
    final AFb1bSDK.AFa1zSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFa1qSDK f5269d;

    @NotNull
    private final ScheduledExecutorService registerClient;
    private volatile boolean unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final Runnable f5270v;

    public AFb1gSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.registerClient = scheduledExecutorService;
        this.AFLogger = aFa1zSDK;
        this.f5269d = aFa1qSDK;
        this.f5270v = new Runnable() { // from class: com.appsflyer.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                AFb1gSDK.registerClient(AFb1gSDK.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.m_(intent);
            b = gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", e10, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.n_(intent);
            b = gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", e10, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFb1gSDK aFb1gSDK) {
        Object b;
        aFb1gSDK.unregisterClient = false;
        try {
            n.Companion companion = gt.n.INSTANCE;
            aFb1gSDK.AFLogger.registerClient();
            b = gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", e10, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            return;
        }
        final Intent intent = activity.getIntent();
        if (this.f5269d.e_(intent)) {
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.i_(AFb1gSDK.this, intent);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            ScheduledExecutorService scheduledExecutorService = this.registerClient;
            Runnable runnable = this.f5270v;
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            this.AFKeystoreWrapper = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.unregisterClient(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.unregisterClient) {
            this.unregisterClient = true;
            final Intent intent = activity.getIntent();
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.j_(AFb1gSDK.this, intent);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.AFKeystoreWrapper;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
