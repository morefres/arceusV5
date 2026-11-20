package fb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f17101a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f17103d;

    public /* synthetic */ i(j jVar, Application application, byte[] bArr) {
        Objects.requireNonNull(jVar);
        this.f17103d = jVar;
        this.b = false;
        this.f17101a = application;
    }

    public final /* synthetic */ void a() {
        if (this.b) {
            return;
        }
        this.f17101a.registerActivityLifecycleCallbacks(this);
        this.b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.f17102c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && k.f17109c.a(activity)) {
            this.f17102c = true;
            return;
        }
        this.f17101a.unregisterActivityLifecycleCallbacks(this);
        if (this.b) {
            this.b = false;
            s0.a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.f17103d.c().zzd();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }
}
