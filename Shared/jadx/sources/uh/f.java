package uh;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.Surface;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.b;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.EngineJavaCallbackWrapper;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import org.fmod.FMOD;
import uk.h;
import yj.r2;

/* loaded from: classes2.dex */
public class f implements h.d {

    /* renamed from: f, reason: collision with root package name */
    public boolean f32853f;

    /* renamed from: h, reason: collision with root package name */
    public d f32855h;

    /* renamed from: i, reason: collision with root package name */
    public AsyncTaskC0598f f32856i;

    /* renamed from: k, reason: collision with root package name */
    public e f32858k;

    /* renamed from: a, reason: collision with root package name */
    public final String f32849a = "rbx.appshell";
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32850c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32851d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32852e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32854g = false;

    /* renamed from: j, reason: collision with root package name */
    public Vector<mk.b> f32857j = new Vector<>();

    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32859a;

        public a(h hVar) {
            this.f32859a = hVar;
        }

        @Override // uh.f.h
        public void a(int i10) {
            LoggingProtocol.g("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                this.f32859a.a(0);
            } else {
                this.f32859a.a(1);
            }
        }
    }

    public class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32860a;

        public b(h hVar) {
            this.f32860a = hVar;
        }

        @Override // uh.f.h
        public void a(int i10) {
            if (i10 == 0) {
                f.this.f32850c = true;
            }
            h hVar = this.f32860a;
            if (hVar != null) {
                hVar.a(i10);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f32861a;

        public c(d dVar) {
            this.f32861a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f32861a.f32862a);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public Activity f32862a;
        public PlatformParams b;

        /* renamed from: c, reason: collision with root package name */
        public DeviceParams f32863c;

        /* renamed from: d, reason: collision with root package name */
        public String f32864d;

        /* renamed from: e, reason: collision with root package name */
        public String f32865e;

        /* renamed from: f, reason: collision with root package name */
        public long f32866f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f32867g;

        /* renamed from: h, reason: collision with root package name */
        public String f32868h;

        /* renamed from: i, reason: collision with root package name */
        public int f32869i;

        /* renamed from: j, reason: collision with root package name */
        public String f32870j;

        public DeviceParams a() {
            return this.f32863c;
        }

        public PlatformParams b() {
            return this.b;
        }
    }

    public class e extends EngineJavaCallbackWrapper {
        public e(EngineJavaCallback2 engineJavaCallback2) {
            super(engineJavaCallback2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
        public void f(String str, String str2) {
            if (str.equals("APP_READY")) {
                f.this.q(str2);
            }
            super.f(str, str2);
        }
    }

    /* renamed from: uh.f$f, reason: collision with other inner class name */
    public static class AsyncTaskC0598f extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public h f32871a;
        public final String b = "rbx.appshell";

        public AsyncTaskC0598f(h hVar) {
            this.f32871a = hVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String o8;
            b.C0154b u8 = com.roblox.client.startup.a.u();
            String d10 = u8.d();
            String e10 = u8.e();
            if (d10 == null || d10.isEmpty()) {
                return 1;
            }
            if (mh.b.a()) {
                o8 = com.roblox.client.startup.a.o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("overridePayload = ");
                sb2.append(o8);
                ek.q.b("rbx.appshell", sb2.toString() != null ? o8 : "no overrides");
            } else {
                o8 = new uj.a(RobloxApplication.f()).a();
            }
            return rh.h.a().W5() ? Integer.valueOf(NativeGLInterface.nativeInitClientSettingsSigned(d10, e10, o8, rg.a1.M())) : Integer.valueOf(NativeGLInterface.nativeInitClientSettings(d10, o8, rg.a1.M()));
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(r2.a(RobloxApplication.f()));
                ek.q.h("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f32871a;
            if (hVar != null) {
                hVar.a(num.intValue());
            }
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static final f f32872a = new f();
    }

    public interface h {
        void a(int i10);
    }

    public static /* synthetic */ void b(ne.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static /* synthetic */ void d(ne.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static f j() {
        return g.f32872a;
    }

    public void A(mk.c cVar) {
        if (this.b || (this.f32851d && rh.h.a().k2())) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(cVar.f24587a, cVar.b, cVar.f24588c);
        } else {
            ek.q.k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    public void B(boolean z10) {
        A(new mk.a(z10));
    }

    public void C(mk.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f32857j.add(bVar);
        if (l()) {
            u(this.f32857j);
        }
    }

    public void D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f32858k = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    public void E() {
        this.f32853f = true;
    }

    public void F(Context context) {
        ek.q.b("rbx.appshell", "ASMA.setup() " + this.b);
        if (this.b) {
            rg.a1.T0();
            return;
        }
        this.b = true;
        boolean G2 = rh.h.a().G2();
        if (G2) {
            LoggingProtocol.g("update_native_settings_begin");
        }
        rg.a1.W0();
        if (G2) {
            LoggingProtocol.g("update_native_settings_end");
        }
        if (G2) {
            LoggingProtocol.g("fmod_init_begin");
        }
        FMOD.init(context);
        if (G2) {
            LoggingProtocol.g("fmod_init_end");
        }
        if (G2) {
            LoggingProtocol.g("game_global_init_begin");
        }
        NativeGLInterface.nativeGameGlobalInit();
        if (G2) {
            LoggingProtocol.g("game_global_init_end");
        }
        rg.a1.V0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    public void G(Surface surface) {
        if (this.f32851d) {
            this.f32854g = true;
            z();
            d i10 = i();
            StartAppParams.Builder selectedTheme = StartAppParams.builder().setSurface(surface).setPlatformParams(i10.b).setAppStarterPlace(i10.f32864d).setAppStarterScript(i10.f32865e).setAppUserId(i10.f32866f).setIsUnder13(i10.f32867g).setUsername(i10.f32868h).setMembershipType(i10.f32869i).setSelectedTheme(i10.f32870j);
            if (rg.a1.E0()) {
                selectedTheme.setVrContext(i10.f32862a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(selectedTheme.build());
            if (rg.a1.E0()) {
                Executors.newSingleThreadExecutor().execute(new c(i10));
            }
        }
    }

    public void H() {
        ek.q.b("rbx.appshell", "ASMA.stop");
        if (this.f32851d && this.f32854g) {
            this.f32854g = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (rg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    public void I(Surface surface, float f10, int i10, int i11) {
        ek.q.b("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f32851d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f10;
            platformParams.viewportWidthMm = i10;
            platformParams.viewportHeightMm = i11;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    @Override // uk.h.d
    public void a() {
        ek.q.h("rbx.appshell", "onCookieChanged.");
        if (rh.h.a().S1()) {
            rg.a1.C0();
        }
        rg.a1.T0();
    }

    public void f() {
        synchronized (this) {
            g();
        }
    }

    public final void g() {
        if (this.f32851d) {
            ek.q.h("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        v();
    }

    public final void h() {
        e eVar = this.f32858k;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    public d i() {
        return this.f32855h;
    }

    public void k(d dVar) {
        ek.q.h("rbx.appshell", "ASMA.initializeDataModel: hasSettings:" + this.f32850c + ", isInitialized:" + this.f32851d + ", CrashWhenAppBridgeNotStarted:" + rh.h.a().p3() + ", appBridgeStarted:" + this.f32853f);
        if (!this.f32850c || this.f32851d) {
            return;
        }
        h();
        ek.q.b("rbx.appshell", "ASMA.initializeDataModel()");
        this.f32855h = dVar;
        this.f32851d = true;
        String g10 = rg.a1.g();
        InitParams.Builder pioneerPlaceId = InitParams.builder().setPlatformParams(dVar.b).setDeviceParams(dVar.f32863c).setBaseURL(g10).setUserAgent(rg.a1.a1()).setIsTablet(rg.a1.r0()).setPioneerPlaceId(0L);
        if (rh.h.a().g1()) {
            pioneerPlaceId.setBuildVariant(ek.h.a());
        }
        pioneerPlaceId.setIsVrDevice(rg.a1.q0());
        pioneerPlaceId.setIsPotato(rg.a1.t0());
        if (dVar.b.assetFolderPath == null) {
            ek.q.e("rbx.appshell", "Asset folder path is null");
        } else {
            ek.q.h("rbx.appshell", "Asset folder path: " + dVar.b.assetFolderPath);
        }
        if (dVar.b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        if (rh.h.a().p3() && !this.f32853f) {
            throw new RuntimeException("AppBridge is not yet started");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(pioneerPlaceId.build());
    }

    public boolean l() {
        return this.f32852e;
    }

    public boolean m() {
        return this.f32851d;
    }

    public final /* synthetic */ Object n(Context context, h hVar) {
        s(context, hVar, true);
        return null;
    }

    public void o(final Context context, final h hVar) {
        ek.q.h("rbx.appshell", "ASMA.loadAllAppSettings()");
        LoggingProtocol.g("asset_unpack_begin");
        final ne.e0 H = ne.e0.H();
        if (rh.h.a().y2()) {
            kk.c.p().q().thenAccept(new Consumer() { // from class: uh.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.d(ne.e0.this, (String) obj);
                }
            });
        } else {
            kk.c.p().s(new Consumer() { // from class: uh.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.b(ne.e0.this, (String) obj);
                }
            });
        }
        ne.s.o(com.roblox.client.startup.a.i(context), H).a(new Callable() { // from class: uh.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object n10;
                n10 = f.this.n(context, hVar);
                return n10;
            }
        }, ne.a0.a());
    }

    public void p(h hVar) {
        ek.q.b("rbx.appshell", "ASMA.loadSettings() " + this.f32850c);
        if (this.f32850c) {
            ek.q.b("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.a(0);
                return;
            }
            return;
        }
        w();
        AsyncTaskC0598f asyncTaskC0598f = new AsyncTaskC0598f(new b(hVar));
        this.f32856i = asyncTaskC0598f;
        asyncTaskC0598f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void q(String str) {
        ek.q.b("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f32852e = true;
        u(this.f32857j);
    }

    public void r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    public final void s(Context context, h hVar, boolean z10) {
        if (rh.h.a().G2()) {
            LoggingProtocol.g("settings_join_resolved");
        }
        if (!z10) {
            hVar.a(1);
            return;
        }
        F(context);
        LoggingProtocol.g("update_setting_to_app_bridge_start");
        p(new a(hVar));
    }

    public void t() {
        ek.q.b("rbx.appshell", "ASMA.pause");
        if (this.f32851d) {
            ek.q.h("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (rg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    public final void u(Vector<mk.b> vector) {
        while (!vector.isEmpty()) {
            mk.b remove = vector.remove(0);
            ek.q.b("rbx.appshell", "publishPendingReadyEvents() " + remove.f24587a + ", " + remove.b + ", " + remove.f24588c + ", " + remove.f24586d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(remove.f24587a, remove.b, remove.f24588c, remove.f24586d);
        }
    }

    public void v() {
        ek.q.b("rbx.appshell", "ASMA.reset()");
        this.b = false;
        this.f32851d = false;
        this.f32852e = false;
        this.f32855h = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        w();
        am.a.a().c();
    }

    public final void w() {
        AsyncTaskC0598f asyncTaskC0598f = this.f32856i;
        if (asyncTaskC0598f != null && !asyncTaskC0598f.isCancelled()) {
            ek.q.h("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            asyncTaskC0598f.cancel(true);
        }
        this.f32856i = null;
    }

    public void x(Context context, Surface surface) {
        y(context, surface, null);
    }

    public void y(Context context, Surface surface, Activity activity) {
        ek.q.h("rbx.appshell", "ASMA.restart");
        f();
        k(rg.a1.E0() ? p.b(context, activity) : p.a(context));
        G(surface);
    }

    public void z() {
        h();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
