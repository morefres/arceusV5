package com.roblox.client;

import am.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import ci.m;
import cm.a;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.c;
import com.roblox.client.captcha.ActivityFunCaptcha;
import com.roblox.client.captcha.CaptchaConfig;
import com.roblox.client.captcha.LoginCaptchaConfig;
import com.roblox.client.captcha.SignUpCaptchaConfig;
import com.roblox.client.d;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.feature.FeatureState;
import com.roblox.client.game.ExperienceSession;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.client.startup.c;
import com.roblox.client.startup.d;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.protocols.webview.a;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import dj.a0;
import ek.t;
import ek.v;
import ek.w;
import ek.x;
import hj.r;
import hm.a;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import qh.ExpBackOffRetryPolicy;
import rg.c2;
import rg.e2;
import rg.g0;
import rg.m0;
import rg.q0;
import rg.y;
import rg.y0;
import rg.y1;
import ti.b;
import ti.e;
import ug.c0;
import uh.a;
import uh.a1;
import uh.p;
import uh.q;
import uh.t0;
import uh.u0;
import uh.v0;
import vg.b;
import yj.k0;
import yj.n0;
import yj.q2;
import yj.s2;

/* loaded from: classes2.dex */
public class ActivityNativeMain extends com.roblox.client.a implements e.InterfaceC0582e, ph.d, n0, b.d, a.g, c.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, NativeGLJavaInterface.WebViewUserAgentGetter, NativeGLJavaInterface.MobileAdvertisingIdGetter, xj.c, a.f, ExperienceSession.d, a.d, q {

    /* renamed from: q0, reason: collision with root package name */
    public static boolean f8908q0 = true;
    public boolean S;
    public ph.a T;
    public View U;
    public View V;
    public boolean W;
    public long X;
    public String Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public oi.f f8909a0;

    /* renamed from: c0, reason: collision with root package name */
    public WebViewProtocol f8911c0;

    /* renamed from: d0, reason: collision with root package name */
    public AppHangMonitor f8912d0;

    /* renamed from: e0, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f8913e0;

    /* renamed from: f0, reason: collision with root package name */
    public t0 f8914f0;

    /* renamed from: g0, reason: collision with root package name */
    public g.c<IntentSenderRequest> f8915g0;

    /* renamed from: i0, reason: collision with root package name */
    public bk.h f8917i0;

    /* renamed from: j0, reason: collision with root package name */
    public uh.i f8918j0;

    /* renamed from: k0, reason: collision with root package name */
    public a1 f8919k0;

    /* renamed from: l0, reason: collision with root package name */
    public ImageView f8920l0;

    /* renamed from: o0, reason: collision with root package name */
    public sg.a f8923o0;

    /* renamed from: b0, reason: collision with root package name */
    public vg.b f8910b0 = null;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f8916h0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public final Runnable f8921m0 = new Runnable() { // from class: rg.j
        @Override // java.lang.Runnable
        public final void run() {
            ActivityNativeMain.this.J2();
        }
    };

    /* renamed from: n0, reason: collision with root package name */
    public final Runnable f8922n0 = new Runnable() { // from class: rg.k
        @Override // java.lang.Runnable
        public final void run() {
            ActivityNativeMain.this.K2();
        }
    };

    /* renamed from: p0, reason: collision with root package name */
    public final m f8924p0 = new g();

    public class a implements c.i {
        public a() {
        }

        @Override // com.roblox.client.c.i
        public void a(String str) {
            if (ActivityNativeMain.this.f8911c0 != null) {
                ActivityNativeMain.this.f8911c0.s(str);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityNativeMain f8926a;

        public b(ActivityNativeMain activityNativeMain) {
            this.f8926a = activityNativeMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            ti.b.p();
            new l(this.f8926a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ek.q.b("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.A2(false);
        }
    }

    public class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8928a;

        public d(ViewGroup viewGroup) {
            this.f8928a = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            SurfaceView surfaceView;
            if (kk.h.f22809a.b() && view2 == null && (surfaceView = (SurfaceView) this.f8928a.findViewById(m0.f30372j0)) != null) {
                surfaceView.requestFocus();
            }
        }
    }

    public class e implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        public Bitmap f8929a = null;
        public boolean b = false;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8930c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f8931d;

        public e(ViewGroup viewGroup, SurfaceView surfaceView) {
            this.f8930c = viewGroup;
            this.f8931d = surfaceView;
        }

        public final /* synthetic */ void b(int i10) {
            this.b = i10 == 0;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8920l0 == null || this.f8929a == null || !this.b) {
                return;
            }
            ActivityNativeMain.this.f8920l0.setVisibility(0);
            ActivityNativeMain.this.f8920l0.setImageBitmap(this.f8929a);
            ActivityNativeMain.this.i3(3000L);
            this.f8929a = null;
            this.b = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8920l0 != null) {
                long width = this.f8930c.getWidth() * this.f8930c.getHeight() * 4;
                long freeMemory = Runtime.getRuntime().freeMemory();
                if (freeMemory < width) {
                    ek.q.h("rbx.main", "surfaceDestroyed: Not enough memory for screenshot. Available: " + freeMemory + ", Required: " + width);
                    return;
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(this.f8930c.getWidth(), this.f8930c.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f8929a = createBitmap;
                    PixelCopy.request(this.f8931d, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: rg.p
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            ActivityNativeMain.e.this.b(i10);
                        }
                    }, new Handler(Looper.getMainLooper()));
                } catch (OutOfMemoryError e10) {
                    ek.q.f("rbx.main", "surfaceDestroyed: Out of memory while creating screenshot.", e10);
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class g implements m {
        public g() {
        }

        @Override // ci.m
        public void a(ci.j jVar) {
            if (jVar.b() == 401) {
                ek.q.k("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                ti.b.f().i(ActivityNativeMain.this, b.d.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    public class h extends d.c {
        public h() {
        }

        @Override // com.roblox.client.d.InterfaceC0141d
        public void a(d.e eVar) {
            if (eVar.b()) {
                ActivityNativeMain.this.f2(false);
                return;
            }
            if (eVar.c()) {
                ActivityNativeMain.this.f2(true);
            } else if (t.j() && eVar.a()) {
                ti.b.f().i(ActivityNativeMain.this, b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.c, com.roblox.client.d.InterfaceC0141d
        public void b(d.e eVar) {
            if (rg.a1.q0() && eVar.c()) {
                ActivityNativeMain.this.f2(true);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain activityNativeMain = ActivityNativeMain.this;
            e2.i(activityNativeMain, activityNativeMain.U);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain.this.V.setVisibility(8);
        }
    }

    public class k extends d.c {
        public k() {
        }

        @Override // com.roblox.client.d.InterfaceC0141d
        public void a(d.e eVar) {
            if (eVar.b()) {
                ActivityNativeMain.this.f2(false);
            } else if (eVar.c()) {
                ActivityNativeMain.this.f2(true);
            }
        }
    }

    public static class l extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<ActivityNativeMain> f8939a;

        public l(ActivityNativeMain activityNativeMain) {
            ek.q.h("rbx.main", "Reloading lua app.");
            this.f8939a = new WeakReference<>(activityNativeMain);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            uh.a d10;
            Surface I2;
            ActivityNativeMain activityNativeMain = this.f8939a.get();
            if (activityNativeMain == null || (d10 = activityNativeMain.F2().d()) == null || (I2 = d10.I2()) == null) {
                return Boolean.FALSE;
            }
            ti.b.e();
            if (rg.a1.E0()) {
                uh.f.j().y(activityNativeMain, I2, activityNativeMain);
            } else {
                uh.f.j().x(activityNativeMain, I2);
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f8939a.get()) == null || activityNativeMain.V == null) {
                return;
            }
            activityNativeMain.V.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f8939a.get();
            if (activityNativeMain == null || activityNativeMain.V == null) {
                return;
            }
            activityNativeMain.V.setVisibility(0);
        }
    }

    private void E2() {
        com.roblox.client.startup.c.v2(this);
    }

    private void Y2(String str, String str2) {
        rg.q.f(this, ek.f.c(str2), str);
    }

    private void d3() {
        ek.q.h("rbx.main", "processPushNotification.");
        Bundle i10 = r.k().i();
        if (i10 == null || r.k().t(i10)) {
            return;
        }
        try {
            String string = i10.getString("EXTRA_NOTIFICATION_TYPE", "");
            switch (string.hashCode()) {
                case 624927928:
                    if (!string.equals("FriendRequestAccepted")) {
                        return;
                    }
                    break;
                case 929482719:
                    if (string.equals("ChatNewMessage")) {
                        long j10 = i10.getLong("EXTRA_CONVERSATION_ID", -1L);
                        if (j10 != -1) {
                            W2(j10);
                            return;
                        }
                        return;
                    }
                    return;
                case 1050705701:
                    if (string.equals("PrivateMessageReceived")) {
                        S2(i10);
                        return;
                    }
                    return;
                case 1715544492:
                    if (string.equals("DefaultNotification")) {
                        rj.a.a().b(i10.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
                        return;
                    }
                    return;
                case 1962733298:
                    if (string.equals("FriendRequestReceived")) {
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            R2(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void g3(ActivityNativeMain activityNativeMain, boolean z10) {
        uh.a d10 = activityNativeMain.F2().d();
        if (d10 != null && z10) {
            activityNativeMain.l1().r().m(d10).h();
        }
        ek.q.b("rbx.appshell", "removeGlApp() clearing app shell");
        uh.f.j().f();
    }

    private void o3(int i10) {
        LoggingProtocol.g("retry_during_main");
        com.roblox.client.startup.c.y2(this, i10);
    }

    public final void A2(boolean z10) {
        if (rh.h.a().a5()) {
            IAPPurchaseManager.M(this, z10);
            return;
        }
        if (!t.g()) {
            if (t.i()) {
                dk.c c10 = dk.c.c();
                String k10 = c10.k();
                long j10 = c10.j();
                if (TextUtils.isEmpty(k10)) {
                    return;
                }
                if (rh.h.a().D5()) {
                    gj.b.a(this);
                    throw null;
                }
                if (j10 > 0) {
                    gj.a.a(this);
                    throw null;
                }
                gj.a.a(this);
                throw null;
            }
            return;
        }
        String k11 = dk.c.c().k();
        long j11 = dk.c.c().j();
        if (TextUtils.isEmpty(k11)) {
            return;
        }
        if (rh.h.a().H1()) {
            if (j11 > 0) {
                a0.R(this).K(j11, z10);
                return;
            } else {
                a0.R(this).L(z10);
                return;
            }
        }
        if (rh.h.a().n3() && rh.h.a().q()) {
            dj.m.F0(this).m1(j11, k11, z10);
        } else if (j11 > 0) {
            dj.m.F0(this).A0(j11, k11, z10);
        } else {
            dj.m.F0(this).B0(k11, z10);
        }
    }

    public final void B2() {
        this.U.post(new i());
    }

    public final void C2() {
        View rootView = this.U.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView;
        rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(new d(viewGroup));
        this.Z = m0.F;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(m0.F);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i10 = rh.h.a().L0() ? rg.n0.f30416k : rh.h.a().D4() ? rg.n0.f30417l : rg.n0.f30415j;
        if (rh.h.a().n2()) {
            LoggingProtocol.g("fragment_shared_inflate_begin");
        }
        getLayoutInflater().inflate(i10, (ViewGroup) frameLayout, true);
        if (rh.h.a().n2()) {
            LoggingProtocol.g("fragment_shared_inflate_end");
        }
        this.f8914f0 = new t0(this, (SurfaceView) frameLayout.findViewById(m0.f30372j0));
        a().a(this.f8914f0);
        kk.h.f22809a.c(getResources().getConfiguration());
        ek.q.h("rbx.main", "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
        if (l3()) {
            SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(m0.f30372j0);
            surfaceView.getHolder().addCallback(new e(viewGroup, surfaceView));
        }
    }

    @Override // uh.q
    public void D() {
        E1();
    }

    public final void D2() {
        if (this.f8920l0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.U.getRootView();
        this.f8920l0 = new ImageView(this);
        new FrameLayout.LayoutParams(-1, -1);
        this.f8920l0.setVisibility(8);
        this.f8920l0.setOnTouchListener(new f());
        viewGroup.addView(this.f8920l0);
        NativeGLInterface.nativeScheduleOnFirstFrame(this.f8922n0);
    }

    @Override // ph.d
    public void E(int i10, androidx.fragment.app.c cVar, String str) {
        if (cVar != null) {
            androidx.fragment.app.h r8 = l1().r();
            if (cVar.p0()) {
                r8.t(cVar);
            } else {
                r8.b(i10, cVar, str);
            }
            r8.h();
        }
    }

    @Override // yj.n0
    public void F() {
        ek.q.h("rbx.main", "updateViewAppSettingsLoaded:");
        k3();
    }

    public final ph.a F2() {
        if (this.T == null) {
            this.T = new ph.a(this, this.Z);
        }
        return this.T;
    }

    public final oh.g G2() {
        oh.g b10 = oh.g.b("CUSTOM_WEBVIEW_TAG");
        b10.g(rg.a1.Q(this));
        b10.j(true);
        return b10;
    }

    @Override // rg.f0
    public void H() {
        E1();
    }

    public final void H2() {
        ek.q.h("rbx.main", "internalOnResume:");
        A2(true);
        com.roblox.client.d.e().b(new h());
        if ((t.j() || ti.h.e().i()) && e2.j(this)) {
            ti.h.e().d(this.f8924p0);
        }
        ek.q.h("rbx.main", "internalOnResume: NotificationManager addObserver");
        ti.e.c().b(this);
        if (r.k().u() && e2.j(this)) {
            if (this.W) {
                this.W = false;
            }
            d3();
        }
        if (this.W) {
            ek.q.h("rbx.main", "Back from game. Resuming Lua App.");
            a3();
        }
        ph.a F2 = F2();
        l1().j0();
        if (F2.d() == null) {
            F2.g(new FeatureState("CUSTOM_LUAVIEW_TAG"));
        }
    }

    @Override // yj.n0
    public void I() {
        ek.q.h("rbx.main", "showRetryUI:");
        if (rg.a1.q0()) {
            x.a(this, q0.S);
            finish();
        } else if (J1()) {
            o3(q0.S);
        }
    }

    public final /* synthetic */ void I2(JSONObject jSONObject) {
        rg.q.b(jSONObject, this);
    }

    public final /* synthetic */ void J2() {
        ImageView imageView = this.f8920l0;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.f8920l0.setImageBitmap(null);
        }
    }

    public final /* synthetic */ void K2() {
        i3(500L);
    }

    public final /* synthetic */ void L2() {
        this.V.setVisibility(8);
    }

    @Override // com.roblox.client.startup.c.b
    public void M() {
        E2();
        q3();
    }

    public final /* synthetic */ void M2(final String str) {
        runOnUiThread(new Runnable() { // from class: rg.e
            @Override // java.lang.Runnable
            public final void run() {
                dk.c.c().u(ml.a.b(str));
            }
        });
    }

    @Override // yj.n0
    public void N() {
        ek.q.h("rbx.main", "navigateToLandingScreen:");
        Intent o8 = y.h().o(this);
        o8.putExtra("send_app_input_focus_to_lua", true);
        startActivity(o8);
        finish();
    }

    public final /* synthetic */ void N2(boolean z10) {
        ni.c.f27099a.j(z10);
        ni.b.f27098a.b(this, z10);
    }

    public final /* synthetic */ void O2() {
        this.W = true;
        k0();
    }

    @Override // com.roblox.client.a
    public boolean P1() {
        return true;
    }

    public final /* synthetic */ void P2(ActivityResult activityResult) {
        y.h().g().r(this, activityResult.getData());
    }

    @Override // com.roblox.client.a
    public ki.c Q1() {
        return new ki.d();
    }

    public final void Q2(FeatureState featureState) {
        ek.q.h("rbx.appshell", "loadDataModel()");
        uh.f.j().F(this);
        uh.f.j().k(p.a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && ti.h.h()) {
            am.a.a().b(new a.b() { // from class: rg.h
                @Override // am.a.b
                public final void a(JSONObject jSONObject) {
                    ActivityNativeMain.this.I2(jSONObject);
                }
            });
            k0.G(this, ti.h.l().toString());
        }
        if (y.h().f().i()) {
            return;
        }
        m3(featureState);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    @Override // ti.e.InterfaceC0582e
    public void R(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                return;
            }
            rg.q.j(uh.k0.c(bundle.getBundle("game_init_params")), this);
        } else {
            ek.q.h("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (uj.c.a()) {
                new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                X1(ti.b.g(bundle));
            }
        }
    }

    public final void R2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_NOTIFICATION_USER_ID", -1L);
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE");
        boolean z10 = bundle.getBoolean("EXTRA_STACKED_NOTIFICATION", false);
        String str = null;
        if (string == null) {
            finish();
        } else if (z10) {
            if (string.equals("FriendRequestAccepted")) {
                str = rg.a1.b0(ti.h.e().g());
            } else if (string.equals("FriendRequestReceived")) {
                str = rg.a1.a0(ti.h.e().g());
            }
        } else if (string.equals("FriendRequestAccepted")) {
            str = j10 == -1 ? rg.a1.b0(ti.h.e().g()) : rg.a1.c0(j10);
        } else if (string.equals("FriendRequestReceived")) {
            str = j10 == -1 ? rg.a1.a0(ti.h.e().g()) : rg.a1.c0(j10);
        }
        p3(str);
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
    public void S() {
        if (isFinishing()) {
            return;
        }
        NativeGLInterface.setMobileAdvertisingId(ek.c.d());
    }

    public final void S2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        p3(j10 == -1 ? rg.a1.w0() : rg.a1.A0(j10));
    }

    public final boolean T2() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("loginAfterSignup", false);
        }
        return false;
    }

    public final void U2(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("FEATURE_EXTRA")) == null) {
            return;
        }
        if ("CHAT_TAG".equals(stringExtra)) {
            long longExtra = intent.getLongExtra("USER_ID_EXTRA", -1L);
            if (longExtra != -1) {
                Z2(longExtra);
                return;
            } else {
                W2(intent.getLongExtra("CONVERSATION_ID_EXTRA", -1L));
                return;
            }
        }
        if ("PROFILE_TAG".equals(stringExtra)) {
            rg.q.i(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.I), false, false, true);
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            rg.q.f(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.L));
        } else {
            rg.q.f(this, intent.getStringExtra("PATH_EXTRA"), ph.b.a(this, stringExtra));
        }
    }

    public final String V2() {
        return "OVERLAY_" + l1().u0();
    }

    public final void W2(long j10) {
        ek.q.b("rbx.main", "navigateToConversation() conversation:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.g("CHAT_CONVERSATION_ID", j10);
        X2(featureState);
    }

    public final void X2(FeatureState featureState) {
        ek.q.i("rbx.main", "navigateToFeature:" + featureState.getName() + " bundle:" + featureState.a());
        m3(featureState);
    }

    @Override // uh.a.g
    public void Z() {
        ek.q.h("rbx.main", "onAppStarted: ");
        if (J1() && ti.b.e()) {
            new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void Z2(long j10) {
        ek.q.b("rbx.main", "navigateToUserConversation() user:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.g("USER_ID_EXTRA", j10);
        X2(featureState);
    }

    public final void a3() {
        n3();
        this.W = false;
    }

    @Override // rg.f0
    public boolean b() {
        return this.f8914f0.b();
    }

    public void b3(String str, String str2) {
        xj.a.c(str, str2);
    }

    @Override // uh.a.g
    public void c(String str) {
        ek.q.h("rbx.main", "onAppReady: " + str);
        View view = this.V;
        if (view != null && view.getVisibility() != 8) {
            this.V.post(new j());
        }
        if ("Landing".equals(str) || "Home".equals(str)) {
            com.roblox.client.d.e().b(new k());
        } else if ("Push".equals(str)) {
            y.h().k().b0(getApplicationContext());
        }
        if (rh.h.a().i2()) {
            final Context applicationContext = getApplicationContext();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: rg.f
                @Override // java.lang.Runnable
                public final void run() {
                    s2.b(applicationContext);
                }
            });
        }
    }

    public final void c3(String str) {
        JSONObject jSONObject;
        CaptchaConfig signUpCaptchaConfig;
        String optString;
        LoginCaptchaConfig.c cVar;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            ek.q.k("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString("captchaType").equals("login")) {
                optString = jSONObject.optString("cvalueType");
                String optString2 = jSONObject.optString("cvalue");
                optString.getClass();
                switch (optString) {
                    case "phone_number":
                        cVar = LoginCaptchaConfig.c.PHONE_NUMBER;
                        break;
                    case "username":
                        cVar = LoginCaptchaConfig.c.USERNAME;
                        break;
                    case "email":
                        cVar = LoginCaptchaConfig.c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + optString + ".");
                }
                signUpCaptchaConfig = new LoginCaptchaConfig(cVar, optString2);
            } else {
                signUpCaptchaConfig = new SignUpCaptchaConfig();
            }
            ek.q.h("rbx.main", "openFunCaptchaActivity: config = " + signUpCaptchaConfig);
            startActivityForResult(ActivityFunCaptcha.i2(this, signUpCaptchaConfig), 20115);
        }
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void d(ll.a aVar) {
        B2();
        Boolean bool = aVar.f23487d;
        boolean z10 = false;
        boolean z11 = bool != null && bool.booleanValue();
        Boolean bool2 = aVar.f23486c;
        boolean booleanValue = bool2 == null ? true : bool2.booleanValue();
        Boolean bool3 = aVar.f23488e;
        boolean z12 = bool3 != null && bool3.booleanValue();
        Boolean bool4 = aVar.f23489f;
        boolean z13 = bool4 != null && bool4.booleanValue();
        Boolean bool5 = aVar.f23490g;
        if (bool5 != null && bool5.booleanValue()) {
            z10 = true;
        }
        com.roblox.client.c y0Var = z11 ? new y0() : new th.k();
        y0Var.a().a(new vg.a());
        Bundle bundle = new Bundle();
        bundle.putString("DEFAULT_URL", aVar.f23485a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", booleanValue);
        bundle.putBoolean("BACK_NAVIGATION_DISABLED", z12);
        bundle.putString("TITLE_STRING", aVar.b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", z13);
        bundle.putBoolean("hideNativeHeader", z10);
        y0Var.O1(bundle);
        y0Var.B3(new a());
        androidx.fragment.app.h r8 = l1().r();
        r8.b(m0.f30371j, y0Var, V2());
        r8.f(null);
        r8.h();
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void e() {
        WebViewProtocol webViewProtocol;
        if (!h3() || (webViewProtocol = this.f8911c0) == null) {
            return;
        }
        webViewProtocol.t();
    }

    public void e3() {
        new com.roblox.client.startup.d().c(this, new d.a() { // from class: rg.l
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                ActivityNativeMain.this.finish();
            }
        });
    }

    @Override // vg.b.d, com.roblox.protocols.webview.a.d
    public void f(ll.a aVar) {
        if (l1().u0() > 0) {
            androidx.fragment.app.c m02 = l1().m0(m0.f30371j);
            if (m02 instanceof com.roblox.client.c) {
                ((com.roblox.client.c) m02).H3(aVar);
            }
        }
    }

    public void f3() {
        ek.q.h("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f8915g0 = h(new h.j(), new g.a() { // from class: rg.d
            @Override // g.a
            public final void a(Object obj) {
                ActivityNativeMain.this.P2((ActivityResult) obj);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (rh.h.a().N2() && rg.a1.q0()) {
            Process.killProcess(Process.myPid());
        }
    }

    @Override // rg.f0
    public void g(boolean z10) {
        this.f8914f0.g(z10);
    }

    public final boolean h3() {
        int i10 = 0;
        if (l1().U0()) {
            return false;
        }
        int u02 = l1().u0();
        boolean z10 = false;
        while (i10 < u02) {
            l1().a1();
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        E2();
        q3();
    }

    @Override // yj.n0
    public void i0() {
    }

    public final void i3(long j10) {
        this.f8920l0.removeCallbacks(this.f8921m0);
        this.f8920l0.postDelayed(this.f8921m0, j10);
    }

    public void j3(boolean z10) {
        mk.a aVar = new mk.a(z10);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f24587a, aVar.b, aVar.f24588c);
    }

    @Override // xj.c
    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            ek.q.b("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            xj.a.c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            j3(false);
            startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
        } catch (JSONException unused) {
            ek.q.b("rbx.main", "Error parsing share data.");
        }
    }

    @Override // yj.n0
    public void k0() {
        ek.q.h("rbx.main", "navigateToMainScreen: IsLoggedIn = " + ti.h.e().f());
        k3();
        if (!y.h().f().i() && J1() && ti.h.e().f()) {
            H2();
        }
    }

    public final void k3() {
        ek.q.b("rbx.main", "setupMainTabs: tabs-loaded = " + this.S);
        if (this.S) {
            return;
        }
        this.S = true;
        Q2((!T2() || t.j()) ? new FeatureState("CUSTOM_LUAVIEW_TAG") : new FeatureState("GAMES_TAG"));
        if (this.f8910b0 == null) {
            vg.b bVar = new vg.b(this, new Handler(Looper.getMainLooper()));
            this.f8910b0 = bVar;
            bVar.c();
        }
        if (rg.a1.q0()) {
            return;
        }
        this.f8911c0 = new WebViewProtocol(this);
    }

    @Override // rg.f0
    public void l() {
        this.f8914f0.l();
    }

    public final boolean l3() {
        return !rg.a1.q0();
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public void m(Bundle bundle) {
        ek.q.h("rbx.main", "Request to end the game. Performing app restoration.");
        if (rh.h.a().l0()) {
            this.X = bundle.getLong(PinShortcutHandler.EXTRA_PLACE_ID);
            this.Y = bundle.getString("gameId");
        }
        y.h().f().l(null);
        r3(u0.APP);
        FragmentManager l12 = l1();
        if (!J1() || l12.U0()) {
            ek.q.h("rbx.main", "Experience has been ended in the background.");
            this.f8916h0 = true;
        } else {
            rg.a1.U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            uh.f.j().z();
            uh.f.j().B(true);
            runOnUiThread(new Runnable() { // from class: rg.g
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityNativeMain.this.O2();
                }
            });
        }
    }

    public void m3(FeatureState featureState) {
        ek.q.h("rbx.main", "ANM.showFeature: " + featureState.getName());
        F2().g(featureState);
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.OnAppShellReloadNeededListener
    public void n() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new b(this));
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
    public void n0() {
        if (rh.h.a().i2()) {
            NativeGLInterface.setWebviewUserAgent(s2.c(this));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(this));
        }
    }

    public final void n3() {
        if (rh.h.a().h3() || rh.h.a().j2() || ch.b.b().c() < rh.h.a().t()) {
            return;
        }
        wg.a.e().i(this, this.X, this.Y);
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public e4.q o0() {
        return this;
    }

    @Override // com.roblox.client.a, e4.q, e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        ek.q.b("rbx.main", "onActivityResult: requestCode = " + i10 + " resultCode = " + i11 + " Intent data = " + intent);
        if (i10 != -1) {
            if (i10 == 20104) {
                this.W = true;
                return;
            }
            if (i10 == 20110) {
                if (i11 == -1) {
                    U2(intent);
                    return;
                }
                return;
            }
            if (i10 != 20115) {
                if (i10 != 20124) {
                    super.onActivityResult(i10, i11, intent);
                    return;
                }
                xj.a.a();
                j3(true);
                if (rh.h.a().c3()) {
                    cm.a.k().e(intent);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityResult from FunCaptcha: code:");
            sb2.append(i11);
            sb2.append(", result:");
            sb2.append(i11 == 101 ? "success" : "dismiss");
            ek.q.h("rbx.main", sb2.toString());
            uh.f.j().A(new mk.a(true));
            m3(new FeatureState("HOME_TAG"));
        }
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(oh.c cVar) {
        e3();
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        if (l1().u0() <= 0) {
            if (F2().f()) {
                return;
            }
            e3();
            return;
        }
        androidx.fragment.app.c m02 = l1().m0(m0.f30371j);
        if (m02 instanceof com.roblox.client.c) {
            com.roblox.client.c cVar = (com.roblox.client.c) m02;
            if (this.f8911c0 != null) {
                if (cVar.h3() || !cVar.e3()) {
                    this.f8911c0.t();
                    return;
                }
                return;
            }
            if (cVar.h3() || cVar.e3()) {
                return;
            }
            l1().a1();
            return;
        }
        if (!(m02 instanceof y1)) {
            if (pj.f.d(this)) {
                ek.q.h("rbx.main", "onBackPressed: BACK button is handled for QrCodeScanner.");
                return;
            } else {
                l1().a1();
                return;
            }
        }
        y1 y1Var = (y1) m02;
        if (y1Var.J2() || y1Var.G2()) {
            return;
        }
        l1().a1();
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(oh.j jVar) {
        ek.q.h("rbx.main", "SMS code received.");
        ek.q.h("rbx.main", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(jVar.f27862a);
    }

    @Override // j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kk.h.f22809a.d(configuration);
        if (l3()) {
            this.f8921m0.run();
        }
        SystemThemeProtocol.f9874a.C();
        if (rg.a1.l0()) {
            z2(configuration);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Map a10;
        if (!ActivitySplash.r2() && !com.roblox.client.startup.a.m() && bundle != null) {
            k0.x(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (k0.B()) {
                ek.q.h("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        if (rh.h.a().L3()) {
            if (f8908q0) {
                f8908q0 = false;
            } else {
                ek.q.k("rbx.main", "onCreate: Activity recreated");
                LoggingProtocol.g("activity_recreated");
            }
        }
        if (!w.a(this).equals("foreground")) {
            LoggingProtocol.g("background_process_detected");
        }
        LoggingProtocol.g("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate NativeMain. savedInstanceState is null: ");
        sb2.append(bundle == null);
        ek.q.h("rbx.main", sb2.toString());
        if (this.f8912d0 == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            this.f8912d0 = appHangMonitor;
            appHangMonitor.c();
        }
        if (rh.h.a().v3() && Build.VERSION.SDK_INT >= 29) {
            LoggingProtocol.h("android_thermal_throttling", ((PowerManager) getSystemService("power")).getCurrentThermalStatus() + 1000);
        }
        this.f8909a0 = oi.b.f().j();
        k0.s(this).N(this);
        setContentView(rg.n0.f30409d);
        if (bundle != null) {
            this.W = bundle.getBoolean("BACK_FROM_GAME");
        }
        hm.a.c(this);
        if (!this.W) {
            hm.a.j().a(a.EnumC0347a.MAIN, bundle);
        }
        this.U = findViewById(m0.f30369i);
        this.V = findViewById(m0.W);
        if (q2.b()) {
            this.V.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            ((ViewStub) findViewById(m0.S)).inflate();
        }
        if (y.h().f().h()) {
            this.V.post(new Runnable() { // from class: rg.m
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityNativeMain.this.L2();
                }
            });
        } else {
            this.V.setVisibility(0);
        }
        C2();
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        NativeGLJavaInterface.setWebviewUserAgentGetter(this);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(this);
        if (this.f8913e0 == null && rh.h.a().p0()) {
            long E3 = rh.h.a().E3();
            ek.q.b("rbx.main", "Setup mPendingPurchaseExecutor to run every " + E3 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f8913e0 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new c(), E3, E3, TimeUnit.SECONDS);
        }
        if (rh.h.a().b2()) {
            y.h().g().n(this);
        } else {
            f3();
        }
        if (rh.h.a().W1() && this.f8917i0 == null) {
            bk.h hVar = new bk.h(new Handler(Looper.getMainLooper()));
            this.f8917i0 = hVar;
            hVar.a();
        }
        if (r.k().u()) {
            d3();
        }
        if (rh.h.a().h3()) {
            a().a(AppRatingPromptHandler.f9830a);
        }
        if (rh.h.a().X0()) {
            a().a(PinShortcutHandler.INSTANCE);
        }
        if (rh.h.a().F5()) {
            a().a(RecentlyPlayedWidgetHandler.INSTANCE);
        }
        if (rh.h.a().Q() || rh.h.a().c5()) {
            a().a(DeviceDisplayHandler.INSTANCE);
        }
        android.view.l a11 = a();
        SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9874a;
        a11.a(systemThemeProtocol);
        systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: rg.n
            @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
            public final void a(String str) {
                ActivityNativeMain.this.M2(str);
            }
        });
        if (rh.h.a().Z4()) {
            final ni.m mVar = ni.m.f27116a;
            Objects.requireNonNull(mVar);
            systemThemeProtocol.H(new SystemThemeProtocol.a() { // from class: rg.o
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
                public final void a(String str) {
                    ni.m.this.g(str);
                }
            });
        } else if (rh.h.a().V0()) {
            systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: rg.c
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                public final void a(boolean z10) {
                    ActivityNativeMain.this.N2(z10);
                }
            });
        }
        if (qh.k.a()) {
            a10 = rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))});
            qh.h.r(a10);
            ek.q.h("rbx.main", "Requesting WebRTC SDK module download immediately.");
            qh.h.m("webrtcsdk");
        }
        if (v.b()) {
            v.a(qh.h.f29840a, "rbx.main");
            a().a(FacialAgeEstimationProtocol.INSTANCE);
        }
        if (rh.h.a().r5()) {
            if (rh.h.a().p2()) {
                a().a(dl.g.f14974a);
            } else {
                a().a(dl.d.f14970a);
            }
        }
        a().a(MediaPickerProtocolV2.INSTANCE);
        sg.a aVar = new sg.a();
        this.f8923o0 = aVar;
        aVar.d(this);
        if (this.f8918j0 == null) {
            uh.i iVar = new uh.i(getApplicationContext());
            this.f8918j0 = iVar;
            iVar.o();
        }
        if (this.f8919k0 == null) {
            a1 a1Var = new a1(getApplicationContext());
            this.f8919k0 = a1Var;
            a1Var.a();
        }
        if (rh.h.a().V2()) {
            a().a(v0.f32965a);
        }
        a().a(gl.b.a());
        if (rh.h.a().k1()) {
            a().a(ExternalIdentityHandler.INSTANCE);
        }
        if (ti.h.e().i()) {
            ArrayList arrayList = new ArrayList(r.l());
            arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(ti.h.e().g())));
            ug.m.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        com.roblox.client.startup.a.g(getApplicationContext());
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        bk.h hVar;
        if (k0.B()) {
            ek.q.h("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        ek.q.h("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener(null);
        NativeGLJavaInterface.setWebviewUserAgentGetter(null);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
        if (this.f8914f0.f32951a == u0.EXPERIENCE) {
            y.h().f().g(true);
        } else {
            g3(this, isFinishing());
        }
        this.S = false;
        k0.s(this).S(this);
        vg.b bVar = this.f8910b0;
        if (bVar != null) {
            bVar.e();
            this.f8910b0 = null;
        }
        if (rh.h.a().W1() && (hVar = this.f8917i0) != null) {
            hVar.b();
            this.f8917i0 = null;
        }
        this.f8923o0.e();
        uh.i iVar = this.f8918j0;
        if (iVar != null) {
            iVar.q();
            this.f8918j0 = null;
        }
        a1 a1Var = this.f8919k0;
        if (a1Var != null) {
            a1Var.b();
            this.f8919k0 = null;
        }
        super.onDestroy();
    }

    @Override // j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return kk.h.f22809a.e(keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return kk.h.f22809a.f(keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(oh.f fVar) {
        long j10 = fVar.b;
        if (j10 != -1) {
            Z2(j10);
        } else {
            W2(fVar.f27855a);
        }
    }

    @ev.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(oh.g gVar) {
        JSONObject jSONObject;
        String str;
        ek.q.b("rbx.main", "NavigateToFeature: " + gVar.f27856a);
        if ("FRIEND_FINDER_TAG".equals(gVar.f27856a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f27856a)) {
            gVar = G2();
        }
        if ("PROFILE_TAG".equals(gVar.f27856a)) {
            rg.q.i(this, gVar.b, getString(q0.I), gVar.f27859e, gVar.f(), true);
            return;
        }
        if ("GAME_DETAILS_TAG".equals(gVar.f27856a)) {
            rg.q.e(this, rg.a1.g() + "games/" + gVar.b, q0.f30506v, gVar.f27859e, gVar.f());
            return;
        }
        if ("CUSTOM_WEBVIEW_TAG".equals(gVar.f27856a) || "YOUTUBE_TAG".equals(gVar.f27856a)) {
            try {
                jSONObject = new JSONObject(gVar.d());
            } catch (JSONException unused) {
                ek.q.k("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString(Title.type);
                String optString2 = jSONObject.optString("url");
                if (optString2.isEmpty()) {
                    ek.q.k("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                    return;
                }
                if ("YOUTUBE_TAG".equals(gVar.f27856a) && rg.a1.q0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(optString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        ek.q.k("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!gVar.f27859e) {
                    rg.q.h(this, optString2, optString, false, true);
                    return;
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("searchParams");
                    rg.q.g(this, optString2, optString, optJSONObject != null ? optJSONObject.toString() : null);
                    return;
                }
            }
            return;
        }
        if ("SOCIAL_MEDIA_TAG".equals(gVar.f27856a)) {
            new im.a("rbx.main").h(this, gVar.d());
            return;
        }
        if ("MY_FEED_TAG".equals(gVar.f27856a)) {
            rg.q.e(this, rg.a1.g() + "feeds/inapp", q0.G, gVar.f27859e, gVar.f());
            return;
        }
        if ("SEARCH_GAMES_TAG".equals(gVar.f27856a)) {
            rg.q.e(this, rg.a1.H0(gVar.b), q0.J, gVar.f27859e, gVar.f());
            return;
        }
        if ("GAMES_SEE_ALL_TAG".equals(gVar.f27856a)) {
            rg.q.e(this, rg.a1.A(gVar.b), q0.D, gVar.f27859e, gVar.f());
            return;
        }
        if ("ABUSE_REPORT_TAG".equals(gVar.f27856a)) {
            rg.q.d(this, gVar.b, gVar.f());
            return;
        }
        if (!"ANIMATED_ASSET_DETAILS_TAG".equals(gVar.f27856a)) {
            if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f27856a)) {
                ek.q.h("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
                return;
            }
            if ("CAPTCHA_TAG".equals(gVar.f27856a)) {
                c3(gVar.d());
                return;
            } else if ("SCAN_QR_CODE".equals(gVar.f27856a)) {
                pj.f.f(this, this.Z);
                return;
            } else {
                Y2(ph.b.a(this, gVar.f27856a), gVar.b);
                return;
            }
        }
        if (gVar.b != null) {
            str = rg.a1.g() + "catalog/" + gVar.b;
        } else {
            str = rg.a1.g() + "games/";
        }
        rg.q.i(this, str, getString(q0.M), gVar.f27859e, true, false);
    }

    @ev.j
    public void onNavigateToLuaEvent(c.h hVar) {
        e();
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        Bundle extras;
        super.onNewIntent(intent);
        if (rh.h.a().t2()) {
            setIntent(intent);
            if (!intent.hasExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION") || (extras = intent.getExtras()) == null) {
                return;
            }
            ek.q.h("rbx.main", "onNewIntent: received notification intent.");
            r.k().G(extras);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
        ek.q.h("rbx.main", "onPause");
        cm.a.k().m();
        hm.a.j().b(a.EnumC0347a.MAIN);
        if (l3()) {
            D2();
        }
        if (!rh.h.a().g4()) {
            ek.q.h("rbx.main", "onPause: NotificationManager removerObserver");
            ti.e.c().g(this);
        }
        wl.c.i().k(this);
        rg.t0.k("onAppBackground");
    }

    @Override // e4.q, e.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        y.h().k().Q(i10, strArr, iArr);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        ek.q.h("rbx.main", "onResume: IsLoggedIn = " + ti.h.e().f());
        wl.c.i().j(this);
        oi.f j10 = oi.b.f().j();
        if (this.f8909a0 != j10) {
            this.f8909a0 = j10;
            ek.q.h("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        k0.s(this).N(this);
        if (!y.h().f().i()) {
            q3();
        } else if (this.f8914f0.f32951a == u0.EXPERIENCE && r.k().u()) {
            y.h().f().g(false);
        }
        if (this.f8916h0) {
            uh.f.j().B(true);
            this.f8916h0 = false;
        }
        if (rg.a1.l0()) {
            z2(getResources().getConfiguration());
        }
        y.h().k().d0(this);
        y.h().k().c0();
        cm.a.k().l(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new a.g() { // from class: rg.i
            @Override // cm.a.g
            public final void a(String str, String str2) {
                ActivityNativeMain.this.b3(str, str2);
            }
        });
        if (!rh.h.a().b2()) {
            ek.q.h("rbx.main", "Setting result launcher for IdentityProtocol");
            y.h().g().y(this.f8915g0);
        }
        if (t.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.roblox.client.b, e.p, k2.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.W);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        hm.a.j().g();
        this.f8912d0.b();
        e2.f30289a = getResources().getDisplayMetrics();
        if (com.roblox.client.a.R == 1 && this.f8914f0.f32951a == u0.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        if (rh.h.a().x5()) {
            ek.q.h("rbx.main", "onStart: App is going to foreground. setAppSuspended(false)");
            NativeReportingInterface.setAppSuspended(false);
        }
        ev.c.d().n(this);
        uk.h.j().k(uh.f.j());
        rg.t0.v("main");
        fm.b.h().e();
        if (this.f8914f0.f32951a == u0.EXPERIENCE) {
            y.h().f().p();
        }
        nm.a.c().a();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        ev.c.d().p(this);
        this.f8912d0.a();
        if (com.roblox.client.a.R == 1 && this.f8914f0.f32951a == u0.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        if (rh.h.a().x5() && this.f8914f0.f32951a == u0.APP) {
            ek.q.h("rbx.main", "onStop: App is going to background. setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        uk.h.j().m(uh.f.j());
        fm.b.h().f();
        if (this.f8914f0.f32951a == u0.EXPERIENCE) {
            y.h().f().n();
        }
        nm.a.c().b();
        if (rh.h.a().g4()) {
            ek.q.h("rbx.main", "onStop: NotificationManager removerObserver");
            ti.e.c().g(this);
        }
        super.onStop();
        ek.q.h("rbx.main", "onStop");
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (rh.h.a().Q2()) {
            c0.s(i10);
        }
        this.f8914f0.j(i10);
    }

    public final void p3(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(g0.b, g0.f30296c);
    }

    public final void q3() {
        ek.q.h("rbx.main", "startup:");
        if (k0.s(this).v() || ti.h.e().f() || com.roblox.client.startup.a.m() || !t.f()) {
            k0.s(this).Q();
            return;
        }
        ek.q.e("rbx.main", "Incomplete initialization, restarting app");
        startActivity(ActivitySplash.o2(this, StartedForEnum.SHELL_PROCESS_RESTART));
        finish();
    }

    @Override // ph.d
    public androidx.fragment.app.c r(String str) {
        return l1().n0(str);
    }

    public void r3(u0 u0Var) {
        this.f8914f0.k(u0Var);
    }

    public final void z2(Configuration configuration) {
        t0 t0Var = this.f8914f0;
        if (t0Var == null || t0Var.f32951a != u0.EXPERIENCE) {
            c2.a(getWindow(), configuration);
        }
    }
}
