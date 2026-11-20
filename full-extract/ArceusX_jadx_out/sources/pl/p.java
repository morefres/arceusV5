package pl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public q f28665a;
    public r b;

    /* renamed from: c, reason: collision with root package name */
    public Connection f28666c;

    /* renamed from: d, reason: collision with root package name */
    public Connection f28667d;

    /* renamed from: e, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f28668e;

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            p.this.f();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    public enum b {
        ACTIVE,
        INACTIVE,
        PAUSED
    }

    public p(MessageBus messageBus) {
        this.f28666c = messageBus.t(lm.a.n(), new Callback() { // from class: pl.n
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                p.this.d(jSONObject);
            }
        });
        this.f28667d = messageBus.t("ConnectivityProtocol.NetworkStatusChanged.Broadcast", new Callback() { // from class: pl.o
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                p.this.e(jSONObject);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final /* synthetic */ void d(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(lm.a.l());
            switch (string.hashCode()) {
                case -2132901938:
                    if (string.equals("stopDiscovery")) {
                        this.f28665a.k();
                        break;
                    }
                    break;
                case -688395069:
                    if (string.equals("startAdvertisement")) {
                        this.b.h();
                        break;
                    }
                    break;
                case -475549842:
                    if (string.equals("startDiscovery")) {
                        this.f28665a.j();
                        break;
                    }
                    break;
                case 488548045:
                    if (string.equals("requestConnection")) {
                        this.f28665a.g(jSONObject.getString(lm.a.g()), jSONObject.getString(lm.a.c()), jSONObject.getString(lm.a.a()));
                        break;
                    }
                    break;
                case 1636797731:
                    if (string.equals("stopAdvertisement")) {
                        this.b.i();
                        break;
                    }
                    break;
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLogin request: " + e10.toString());
        }
    }

    public final /* synthetic */ void e(JSONObject jSONObject) {
        try {
            int i10 = jSONObject.getInt("networkStatus");
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                f();
                return;
            }
            q qVar = this.f28665a;
            if (qVar != null) {
                qVar.h();
            }
            r rVar = this.b;
            if (rVar != null) {
                rVar.f();
            }
        } catch (JSONException e10) {
            Log.e("MagicLoginManager", "JSONException while handling MagicLoginNetwork request: " + e10.toString());
        }
    }

    public final void f() {
        q qVar = this.f28665a;
        if (qVar != null) {
            qVar.f();
        }
        r rVar = this.b;
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void g(Application application) {
        a aVar = new a();
        this.f28668e = aVar;
        application.registerActivityLifecycleCallbacks(aVar);
    }

    public void h(Application application) {
        if (this.f28665a == null) {
            this.f28665a = new q(application);
        }
        if (this.b == null) {
            this.b = new r(application);
        }
        if (this.f28668e == null) {
            g(application);
        }
    }
}
