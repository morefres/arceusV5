package com.roblox.client;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.h0;
import androidx.annotation.NonNull;
import androidx.core.os.EnvironmentCompat;
import androidx.work.a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.activitylifecyclecallbacks.JNIActivityLifecycleCallbacks;
import com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import ek.w;
import hj.m;
import java.util.Iterator;
import java.util.Locale;
import k6.d0;
import k6.s;
import qh.j;
import rg.a1;
import rg.r;
import rh.f;
import rh.h;
import ug.i;
import uh.p;
import uh.u0;
import uk.e;
import x5.p0;
import yj.p2;
import yj.r0;
import yj.w0;
import yj.x;

/* loaded from: classes2.dex */
public class RobloxApplication extends Application implements d0.a, a.c {

    /* renamed from: c, reason: collision with root package name */
    public static Context f8955c;

    /* renamed from: d, reason: collision with root package name */
    public static Locale f8956d;

    /* renamed from: a, reason: collision with root package name */
    public final long f8957a = SystemClock.elapsedRealtime();
    public long b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8958a;

        static {
            int[] iArr = new int[u0.values().length];
            f8958a = iArr;
            try {
                iArr[u0.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8958a[u0.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RobloxApplication() {
        x m10 = x.m();
        m10.x();
        m10.A();
        m10.o();
    }

    public static Context f() {
        return f8955c;
    }

    public static void g(String str, u0 u0Var, int i10) {
        int i11 = a.f8958a[u0Var.ordinal()];
        String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str3 = i11 != 1 ? i11 != 2 ? EnvironmentCompat.MEDIA_UNKNOWN : "experience" : Payload.TYPE_APP;
        if (i10 == 5) {
            str2 = "TRIM_MEMORY_RUNNING_MODERATE";
        } else if (i10 == 10) {
            str2 = "TRIM_MEMORY_RUNNING_LOW";
        } else if (i10 == 15) {
            str2 = "TRIM_MEMORY_RUNNING_CRITICAL";
        } else if (i10 == 20) {
            str2 = "TRIM_MEMORY_UI_HIDDEN";
        } else if (i10 == 40) {
            str2 = "TRIM_MEMORY_BACKGROUND";
        } else if (i10 == 60) {
            str2 = "TRIM_MEMORY_MODERATE";
        } else if (i10 == 80) {
            str2 = "TRIM_MEMORY_COMPLETE";
        }
        q.k(str, "Mode: " + str3 + ", TrimLevel: " + str2);
    }

    @Override // k6.d0.a
    @NonNull
    public s a(@NonNull Context context) {
        return gk.a.f18474a.a(context);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        this.b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
        if (w0.i(context) && !w0.h(context)) {
            w0.A(context);
        }
        j.a(this);
    }

    @Override // androidx.work.a.c
    @NonNull
    public androidx.work.a b() {
        return new a.C0060a().w(4).v(new x2.a() { // from class: rg.v0
            @Override // x2.a
            public final void accept(Object obj) {
                ek.q.f("rbx.application", "WorkManager failed to initialize", (Throwable) obj);
            }
        }).a();
    }

    public final void d() {
        if (h.a().z3()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<String> it = j.c(this).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                LoggingProtocol.g(it.next() + "_installed");
                i10++;
                if (i10 >= 10) {
                    break;
                }
            }
            LoggingProtocol.h("ondemand_module_check", SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    public final void e() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oi.b.f().q(configuration.getLocales().get(0));
    }

    @Override // android.app.Application
    public void onCreate() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f8955c = getApplicationContext();
        if (mh.b.a()) {
            e();
        }
        f.f30648a.p(a1.U(this));
        m.g();
        i.a(f8955c);
        x m10 = x.m();
        m10.E();
        m10.B();
        zg.c.c(f8955c);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        p2.c(f8955c);
        rg.s.b(f8955c);
        r.c();
        zg.c.h(f8955c);
        registerActivityLifecycleCallbacks(new JNIActivityLifecycleCallbacks());
        if (h.a().X2()) {
            registerActivityLifecycleCallbacks(PlatformSystemDialogHandler.INSTANCE);
        }
        if (h.a().Z4()) {
            h0.m().a().a(ni.m.f27116a);
        } else {
            h0.m().a().a(ni.c.f27099a);
        }
        if (h.a().S1()) {
            e.x(this);
            e.z(a1.g());
            q.h("rbx.application", "NativeCookieStorage context injected, migrationSourceUrl=" + a1.g());
        }
        if (h.a().d4()) {
            LoggingProtocol.k("work_manager_initialization_deferred");
        } else {
            p0.i(this, b());
        }
        if (h.a().M1()) {
            if (h.a().o4()) {
                r0.a(this);
            }
            com.roblox.client.startup.a.I("main");
            JNIAAssetManagerSetup.a(f8955c);
            LocalStorageManager.a(f8955c);
            if (h.a().C2()) {
                LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
            }
            LoggingProtocol.l("application_constructor", Long.valueOf(this.f8957a));
            LoggingProtocol.l("application_oncreate", Long.valueOf(elapsedRealtime));
            w0.k();
            if (!w.a(this).equals("foreground")) {
                q.h("rbx.application", "Background process detected");
                hm.a.i();
            }
            h0.m().a().a(new JNIAppLifecycleNativeAdapter());
            q.h("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        com.roblox.client.startup.a.v(f8955c);
        boolean equals = w.a(this).equals("foreground");
        NativeGLJavaInterface.setDeviceStaticParams(p.e());
        if (h.a().o4()) {
            r0.a(this);
        }
        com.roblox.client.startup.a.I("main");
        JNIAAssetManagerSetup.a(f8955c);
        LocalStorageManager.a(f8955c);
        f8956d = Locale.getDefault();
        if (h.a().C2()) {
            LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
        }
        LoggingProtocol.l("application_constructor", Long.valueOf(this.f8957a));
        LoggingProtocol.l("flag_prefetch_begin", Long.valueOf(elapsedRealtime2));
        LoggingProtocol.l("application_oncreate", Long.valueOf(elapsedRealtime));
        w0.k();
        if (!equals) {
            q.h("rbx.application", "Background process detected");
            hm.a.i();
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        h0.m().a().a(new JNIAppLifecycleNativeAdapter());
        d();
    }
}
