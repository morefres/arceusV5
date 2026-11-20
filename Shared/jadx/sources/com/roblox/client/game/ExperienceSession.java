package com.roblox.client.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.Keep;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.RobloxApplication;
import com.roblox.client.game.ExperienceSession;
import com.roblox.client.game.a;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.engine.jni.EngineExitJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import okhttp3.internal.http.HttpStatusCodesKt;
import rg.a1;
import rg.c2;
import rg.f0;
import rg.m0;
import rg.q0;
import rg.y;
import rh.h;
import uh.j0;
import uh.u0;
import uh.w0;
import uh.y0;
import uh.z0;
import vl.g;

/* loaded from: classes2.dex */
public class ExperienceSession implements w0, cj.a, a.InterfaceC0144a, g.a {

    /* renamed from: x, reason: collision with root package name */
    public static boolean f9101x;

    /* renamed from: a, reason: collision with root package name */
    public y0 f9102a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9104d;

    /* renamed from: e, reason: collision with root package name */
    public CountDownTimer f9105e;

    /* renamed from: f, reason: collision with root package name */
    public d f9106f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9107g;

    /* renamed from: j, reason: collision with root package name */
    public j0 f9110j;

    /* renamed from: l, reason: collision with root package name */
    public Handler f9112l;

    /* renamed from: m, reason: collision with root package name */
    public IAPPurchaseManager f9113m;

    /* renamed from: n, reason: collision with root package name */
    public y f9114n;

    /* renamed from: o, reason: collision with root package name */
    public int f9115o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9116p;

    /* renamed from: q, reason: collision with root package name */
    public long f9117q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f9118r;

    /* renamed from: s, reason: collision with root package name */
    public ViewGroup f9119s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f9120t;

    /* renamed from: u, reason: collision with root package name */
    public long f9121u;
    public final String b = "ExperienceSession";

    /* renamed from: c, reason: collision with root package name */
    public boolean f9103c = false;

    /* renamed from: h, reason: collision with root package name */
    public final long f9108h = 30000;

    /* renamed from: i, reason: collision with root package name */
    public final f f9109i = new f();

    /* renamed from: k, reason: collision with root package name */
    public com.roblox.client.game.b f9111k = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9122v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9123w = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperienceSession.this.c0();
        }
    }

    public class b extends EngineExitJavaCallback2 {
        public b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        public void a() {
            q.h("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            ExperienceSession.this.J();
            ExperienceSession.this.Z(true);
        }
    }

    public class c extends CountDownTimer {
        public c(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            q.h("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            ExperienceSession.this.E();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public interface d extends f0 {
        void m(Bundle bundle);

        e4.q o0();
    }

    public class e extends z0 {
        @Override // uh.z0
        public void h(int i10) {
            q.h("rbx.game.orientation", "setting orientation: " + i10);
            ExperienceSession.this.K().setRequestedOrientation(i10);
        }

        public e() {
        }
    }

    public class f {
        public f() {
        }

        public lk.b a() {
            if (ExperienceSession.this.K() == null) {
                return null;
            }
            return lk.b.a(ExperienceSession.this.f9119s.getRootView(), ExperienceSession.this.K().getWindowManager(), null, ((com.roblox.client.a) ExperienceSession.this.K()).G1().c());
        }
    }

    public ExperienceSession(Bundle bundle) {
        this.f9107g = bundle;
    }

    private void O(View view) {
        ViewStub viewStub;
        if (h.a().L0() && (viewStub = (ViewStub) view.findViewById(m0.R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setBackgroundColor(0);
        dh.e.d(rbxKeyboard, L(), "SourceSansPro-Regular.ttf");
        this.f9111k = new com.roblox.client.game.b(rbxKeyboard, this.f9110j, this.f9109i);
        RobloxApplication.f().registerComponentCallbacks(this.f9111k);
    }

    private void o0() {
        Window window;
        if (Build.VERSION.SDK_INT < 28 || this.f9106f == null || (window = K().getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        q0().G1().e(window.getDecorView());
        if (this.f9102a == null) {
            this.f9102a = new y0(L());
        }
        this.f9102a.i(q0(), q0().G1().a());
    }

    @Keep
    public static boolean shouldDisableExperienceIdleTimer() {
        if (g.x().h() || MediaPickerProtocolV2.isCapturingMedia()) {
            return true;
        }
        return h.a().B3() && FacialAgeEstimationProtocol.INSTANCE.isInInquiryFlow();
    }

    @Override // vl.g.a
    public void B(String str, boolean z10) {
    }

    public final void D() {
        q.h("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f9105e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f9105e = null;
        }
    }

    public final void E() {
        if (K() != null) {
            q.h("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            G(true, true);
        }
        if (h.a().x5()) {
            q.h("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        Z(true);
    }

    public void F(boolean z10) {
        G(z10, false);
    }

    public final void G(boolean z10, boolean z11) {
        q.h("ExperienceSession", "Ending game session with place ID " + this.f9121u);
        this.f9123w = false;
        D();
        g.x().w(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        k0(false);
        if (this.f9103c) {
            q.k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f9103c = true;
        g0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        if (h.a().l0()) {
            bundle.putLong(PinShortcutHandler.EXTRA_PLACE_ID, this.f9107g.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f9107g.getString("roblox_gameId"));
        }
        boolean isChangingConfigurations = K().isChangingConfigurations();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroy: shutdown = ");
        sb2.append(!isChangingConfigurations);
        sb2.append(", hasGameStarted = ");
        sb2.append(this.f9104d);
        q.h("ExperienceSession", sb2.toString());
        if (!isChangingConfigurations && this.f9104d) {
            q.h("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f9110j.j(z11);
            } else {
                this.f9110j.D();
            }
        }
        K().runOnUiThread(new Runnable() { // from class: uh.r
            @Override // java.lang.Runnable
            public final void run() {
                ExperienceSession.this.Q();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f9106f.m(bundle);
        RobloxApplication.f().unregisterComponentCallbacks(this.f9111k);
    }

    public final void H() {
        q.h("ExperienceSession", "Entering immersive mode");
        if (this.f9116p) {
            c2.b(K().getWindow());
        } else {
            q.h("ExperienceSession", "System visibility " + this.f9115o);
            if (this.f9115o == 0) {
                this.f9115o = K().getWindow().getDecorView().getSystemUiVisibility();
            }
            K().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        ((ActivityNativeMain) K()).W1().o(u0.EXPERIENCE);
    }

    public final void I() {
        q.h("ExperienceSession", "Exiting immersive mode");
        Activity K = K();
        if (K == null || K.isFinishing()) {
            return;
        }
        ((com.roblox.client.a) K).W1().o(u0.APP);
        if (this.f9116p) {
            c2.c(K.getWindow());
        } else {
            K.getWindow().getDecorView().setSystemUiVisibility(this.f9115o);
        }
        if (a1.R0(K.getResources().getConfiguration())) {
            K.getWindow().getDecorView().post(new Runnable() { // from class: uh.s
                @Override // java.lang.Runnable
                public final void run() {
                    ExperienceSession.this.R();
                }
            });
        }
    }

    public final void J() {
        q.h("ExperienceSession", "finishGame:");
        if (((e4.q) K()) != null) {
            e0();
            F(false);
        }
    }

    public Activity K() {
        return this.f9106f.o0();
    }

    public Context L() {
        return this.f9106f.o0();
    }

    public final void M() {
        J();
        Z(false);
    }

    public final void N() {
        final View findViewById = K().findViewById(m0.W);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return;
        }
        findViewById.post(new Runnable() { // from class: uh.u
            @Override // java.lang.Runnable
            public final void run() {
                findViewById.setVisibility(8);
            }
        });
    }

    public boolean P() {
        d dVar = this.f9106f;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    public final /* synthetic */ void Q() {
        if (!h.a().c5()) {
            K().getWindow().clearFlags(128);
        }
        e0();
        if (!this.f9116p) {
            K().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        I();
    }

    public final /* synthetic */ void R() {
        Activity K = K();
        if (K == null || K.isFinishing()) {
            return;
        }
        c2.b(K.getWindow());
    }

    public final /* synthetic */ void S(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        M();
    }

    @Override // cj.a
    public void T(int i10) {
        ((com.roblox.client.b) K()).T(i10);
    }

    @Override // vl.g.a
    public void U(String str) {
    }

    @Override // cj.a
    public void V(String str) {
        ((com.roblox.client.b) K()).V(str);
    }

    public final /* synthetic */ void W(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        M();
    }

    public final /* synthetic */ void X(int i10) {
        oi.b.f().u(L());
        new AlertDialog.Builder(L()).setMessage(i10).setNegativeButton(K().getString(q0.N), new DialogInterface.OnClickListener() { // from class: uh.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ExperienceSession.this.S(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: uh.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ExperienceSession.this.W(dialogInterface);
            }
        }).create().show();
    }

    public final /* synthetic */ void Y(int i10) {
        if (this.f9103c || (i10 & 4) != 0) {
            return;
        }
        H();
    }

    public void Z(boolean z10) {
        q.h("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f9104d);
        this.f9104d = false;
    }

    @Override // uh.w0
    public void a(long j10) {
        q.h("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f9114n.p().b();
    }

    public void a0() {
        q.b("ExperienceSession", "onSurfaceCreated: finished = " + this.f9103c);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    @Override // uh.w0
    public void b(long j10) {
        q.h("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f9104d = true;
        this.f9114n.p().a();
        com.roblox.client.ossearch.b.b(L(), j10);
    }

    public void b0() {
        q.b("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f9103c);
    }

    @Override // uh.w0
    public void c() {
        q.h("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (K().isFinishing()) {
            return;
        }
        K().setResult(HttpStatusCodesKt.HTTP_EARLY_HINTS);
        F(false);
    }

    public void c0() {
        if (shouldDisableExperienceIdleTimer()) {
            q.h("ExperienceSession", "Not pausing game session, user is in a call or capturing media or in a persona session");
            this.f9123w = true;
            return;
        }
        q.h("ExperienceSession", "Pause game session");
        this.f9114n.p().d();
        k0(true);
        i0();
        e0();
    }

    public void d0(Runnable runnable) {
        this.f9112l.post(runnable);
    }

    public final void e0() {
        if (this.f9120t != null) {
            q.b("rbx.screen", "removing GlobalLayoutListener");
            this.f9119s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f9120t);
            this.f9120t = null;
        }
    }

    @Override // cj.a
    public Activity f0() {
        return K();
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void g(boolean z10) {
        this.f9106f.g(z10);
    }

    public final void g0() {
        if (this.f9117q > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9117q;
            q.h("ExperienceSession", "Game duration: " + elapsedRealtime + "ms.");
            ti.g.b().k(L(), elapsedRealtime);
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void h(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        this.f9113m.H(j10, str, nativePurchaseContext);
    }

    public void h0() {
        q.h("ExperienceSession", "Resume game session");
        this.f9123w = false;
        j0(true);
        D();
        this.f9114n.p().e();
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void i(int i10) {
        if (this.f9118r == null) {
            this.f9118r = new e();
        }
        this.f9118r.e(Integer.valueOf(i10));
    }

    public final void i0() {
        long a10 = h.a().P0() ? new bm.a(bm.b.i().d("Backgrounding.General"), 30000L).a() : 30000L;
        q.h("ExperienceSession", "CountDownTimer constructed with delay:" + a10);
        this.f9105e = new c(a10, 1000L).start();
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void j(long j10, String str, String str2) {
        this.f9113m.I(j10, str, str2);
    }

    public final synchronized void j0(boolean z10) {
        try {
            if (this.f9122v) {
                return;
            }
            this.f9122v = true;
            NativeReportingInterface.gameForegrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            fm.b.h().e();
            if (this.f9120t == null && this.f9111k != null) {
                q.b("rbx.screen", "adding GlobalLayoutListener");
                this.f9120t = this.f9111k;
                this.f9119s.getViewTreeObserver().addOnGlobalLayoutListener(this.f9120t);
            }
            com.roblox.client.game.b bVar = this.f9111k;
            if (bVar != null) {
                bVar.y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void k(String str, String str2, String str3) {
        rg.q.g(this.f9106f.o0(), str, str2, str3);
    }

    public final synchronized void k0(boolean z10) {
        try {
            if (this.f9122v) {
                this.f9122v = false;
                NativeReportingInterface.gameBackgrounded();
                if (z10) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                fm.b.h().f();
                com.roblox.client.game.b bVar = this.f9111k;
                if (bVar != null) {
                    bVar.G();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void l(long j10, String str, String str2) {
        this.f9113m.G(j10, str, str2);
    }

    public void l0(d dVar) {
        this.f9106f = dVar;
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void m(long j10, String str, String str2) {
        this.f9113m.J(j10, str, str2);
    }

    @Override // vl.g.a
    public void m0(String str) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void n(long j10, String str, String str2, String str3) {
        this.f9113m.K(j10, str, str2, str3);
    }

    public final void n0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f9112l, new com.roblox.client.game.a(this, this.f9111k)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    @Override // vl.g.a
    public void o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // vl.g.a
    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void p0() {
        q.h("ExperienceSession", "Start game session");
        if (h.a().m4()) {
            LoggingProtocol.g("native_experience_start");
        }
        D();
        this.f9112l = new Handler(Looper.getMainLooper());
        this.f9113m = new IAPPurchaseManager(this, false);
        this.f9116p = h.a().L5();
        H();
        if (!this.f9116p) {
            K().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: uh.t
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    ExperienceSession.this.Y(i10);
                }
            });
        }
        N();
        Bundle bundle = this.f9107g;
        this.f9119s = (ViewGroup) K().findViewById(m0.f30361e);
        o0();
        if (!z0.j()) {
            this.f9106f.H();
        }
        this.f9114n = y.h();
        uh.m0 m0Var = new uh.m0(bundle);
        this.f9121u = bundle.getLong("roblox_placeId", 0L);
        a1.W0();
        if (!f9101x) {
            f9101x = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        a1.V0();
        j0 j0Var = new j0(this, m0Var);
        this.f9110j = j0Var;
        j0Var.A(null, null, null);
        O(this.f9119s);
        n0(this.f9121u);
        j0(false);
        NativeReportingInterface.applicationBackgrounded();
        if (!h.a().c5()) {
            K().getWindow().addFlags(128);
        }
        g.x().g(this);
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void q() {
        final e4.q o02 = this.f9106f.o0();
        if (o02 == null) {
            q.k("ExperienceSession", "exitApp: no activity to finish");
        } else {
            q.h("ExperienceSession", "exitApp: finishing task at the user's request");
            o02.runOnUiThread(new Runnable() { // from class: uh.v
                @Override // java.lang.Runnable
                public final void run() {
                    o02.finishAndRemoveTask();
                }
            });
        }
    }

    @Override // cj.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.a) K();
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void r(long j10) {
        q.h("ExperienceSession", "onGameLoaded: placeId = " + j10);
        com.roblox.client.game.b bVar = this.f9111k;
        if (bVar != null) {
            bVar.K(j10);
        }
        this.f9117q = SystemClock.elapsedRealtime();
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void s(long j10, String str) {
        this.f9113m.F(j10, str);
    }

    @Override // com.roblox.client.game.a.InterfaceC0144a
    public void t(final int i10) {
        d0(new Runnable() { // from class: uh.w
            @Override // java.lang.Runnable
            public final void run() {
                ExperienceSession.this.X(i10);
            }
        });
    }

    @Override // vl.g.a
    public void u(String str, String str2) {
        if (this.f9123w) {
            this.f9112l.post(new a());
            this.f9123w = false;
        }
    }
}
