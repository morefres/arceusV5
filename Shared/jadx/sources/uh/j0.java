package uh;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.roblox.client.game.ExperienceSession;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import yj.q2;

/* loaded from: classes2.dex */
public class j0 implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public m0 f32885a;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f32886c;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceView f32890g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f32891h;

    /* renamed from: j, reason: collision with root package name */
    public cj.k f32893j;

    /* renamed from: k, reason: collision with root package name */
    public ExecutorService f32894k;

    /* renamed from: l, reason: collision with root package name */
    public w0 f32895l;

    /* renamed from: m, reason: collision with root package name */
    public ExperienceSession f32896m;
    public final String b = "rbx.game";

    /* renamed from: d, reason: collision with root package name */
    public long f32887d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f32888e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f32889f = false;

    /* renamed from: i, reason: collision with root package name */
    public int f32892i = -1;

    public j0(ExperienceSession experienceSession, m0 m0Var) {
        this.f32896m = experienceSession;
        this.f32895l = experienceSession;
        this.f32885a = m0Var;
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ek.q.b("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f32892i);
        if (!com.roblox.client.startup.a.m() && bundle != null) {
            ek.q.k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f32895l.c();
            return null;
        }
        this.f32893j = rh.h.a().H1() ? dj.a0.R(l()) : dj.m.F0(l());
        this.f32891h = (FrameLayout) q().findViewById(rg.m0.f30361e);
        if (rg.a1.k0() && bundle != null && this.f32892i == 2) {
            ek.q.h("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f32892i = 0;
        }
        if (rh.h.a().L0()) {
            ViewStub viewStub = (ViewStub) this.f32891h.findViewById(rg.m0.U);
            if (viewStub != null) {
                this.f32886c = (FrameLayout) viewStub.inflate();
            } else {
                this.f32886c = (FrameLayout) this.f32891h.findViewById(rg.m0.T);
            }
        } else {
            this.f32886c = (FrameLayout) this.f32891h.findViewById(rg.m0.T);
        }
        s(null);
        kk.c.p().s(new Consumer() { // from class: uh.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j0.this.u((String) obj);
            }
        });
        return null;
    }

    public final void B(final Runnable runnable) {
        o().execute(new Runnable() { // from class: uh.g0
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public final void C(m0 m0Var) {
        ek.q.h("rbx.game", "startGame");
        Surface surface = this.f32890g.getHolder().getSurface();
        ok.a aVar = new ok.a(p());
        aVar.isTablet = rg.a1.r0();
        this.f32895l.a(m0Var.f32919c);
        StartGameParams.Builder referredByPlayerId = StartGameParams.builder().setSurface(surface).setPlatformParams(aVar).setDeviceParams(null).setPlaceId(m0Var.f32919c).setUserId(m0Var.b).setAccessCode(m0Var.f32920d).setLinkCode(m0Var.f32921e).setGameId(m0Var.f32922f).setIsUnder13(dk.c.c().n()).setUsername(dk.c.c().k()).setConversationId(m0Var.f32923g).setReservedServerAccessCode(m0Var.f32924h).setCallId(m0Var.f32925i).setJoinRequestType(m0Var.f32918a).setReferralPage(m0Var.f32926j).setLaunchData(m0Var.f32927k).setJoinAttemptId(m0Var.f32930n).setJoinAttemptOrigin(m0Var.f32931o).setIsoContext(m0Var.f32932p).setReferredByPlayerId(m0Var.f32933q);
        if (rg.a1.E0()) {
            referredByPlayerId.setVrContext(q());
        }
        referredByPlayerId.setGameJoinContext(m0Var.f32928l);
        referredByPlayerId.setEventId(m0Var.f32929m);
        if (rh.h.a().A3()) {
            referredByPlayerId.setGameIdToExclude(m0Var.f32934r);
        }
        q().runOnUiThread(new Runnable() { // from class: uh.h0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(referredByPlayerId.build());
        q().runOnUiThread(new Runnable() { // from class: uh.i0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.w();
            }
        });
        this.f32895l.b(m0Var.f32919c);
    }

    public void D() {
        B(new Runnable() { // from class: uh.e0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.x();
            }
        });
    }

    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void x() {
        ek.q.h("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f32892i + ", graphicsStarted = " + this.f32889f);
        this.f32890g.getHolder().removeCallback(this);
        this.f32892i = -1;
    }

    public final void F() {
        ek.q.h("rbx.game", "surfaceDestroyed: surfaceState = " + this.f32892i + ", graphicsStarted = " + this.f32889f);
        if (this.f32892i != 2) {
            return;
        }
        if (this.f32889f) {
            this.f32889f = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        com.roblox.client.a q10 = q();
        if (q10 == null || q10.isFinishing()) {
            return;
        }
        ek.q.h("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f32896m.b0();
    }

    public final void G() {
        ek.q.h("rbx.game", "updateSurface() surfaceState = " + this.f32892i);
        com.roblox.client.a q10 = q();
        if (q10 == null || q10.isFinishing() || q10.isDestroyed()) {
            ek.q.h("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i10 = this.f32892i;
        if (i10 == 0) {
            this.f32892i = 2;
            this.f32889f = true;
            C(this.f32885a);
            return;
        }
        if (i10 == 2) {
            Surface surface = this.f32890g.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            float m10 = m();
            Point i11 = cl.a.i(n().L());
            platformParams.dpiScale = m10;
            platformParams.viewportWidthMm = i11.x;
            platformParams.viewportHeightMm = i11.y;
            if (this.f32889f) {
                ek.q.h("rbx.game", "updateSurface: nativeUpdateGraphics");
                NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, rg.a1.q0() ? q() : null);
            } else {
                ek.q.h("rbx.game", "updateSurface: nativeStartUpGraphics");
                this.f32889f = true;
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, rg.a1.q0() ? q() : null);
            }
        }
    }

    public void j(final boolean z10) {
        B(new Runnable() { // from class: uh.c0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.t(z10);
            }
        });
    }

    public FrameLayout k() {
        return this.f32891h;
    }

    public Context l() {
        return n().L();
    }

    public float m() {
        return cl.a.e(n().L());
    }

    public ExperienceSession n() {
        return this.f32896m;
    }

    public final ExecutorService o() {
        if (this.f32894k == null) {
            this.f32894k = Executors.newSingleThreadExecutor();
        }
        return this.f32894k;
    }

    public final PlatformParams p() {
        String r8 = kk.c.p().r();
        ek.q.b("rbx.game", "getPlatformParams: assetFolderPath = " + r8);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = r8;
        platformParams.isTouchDevice = q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m();
        Point i10 = cl.a.i(n().L());
        platformParams.viewportWidthMm = i10.x;
        platformParams.viewportHeightMm = i10.y;
        return platformParams;
    }

    public com.roblox.client.a q() {
        return (com.roblox.client.a) this.f32896m.K();
    }

    public SurfaceView r() {
        return this.f32890g;
    }

    public final void s(View view) {
        ek.q.b("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) q().findViewById(rg.m0.f30372j0);
        this.f32890g = surfaceView;
        surfaceView.setFocusable(true);
        this.f32890g.setFocusableInTouchMode(true);
        this.f32890g.getHolder().addCallback(this);
        if (n().P()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ek.q.h("rbx.game", "surfaceChanged: ...");
        B(new Runnable() { // from class: uh.f0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ek.q.h("rbx.game", "surfaceCreated: ...");
        B(new Runnable() { // from class: uh.a0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f32894k.submit(new Runnable() { // from class: uh.d0
                @Override // java.lang.Runnable
                public final void run() {
                    j0.this.z();
                }
            }).get();
        } catch (Exception unused) {
            ek.q.h("rbx.game", "game thread times out");
        }
    }

    public final /* synthetic */ void t(boolean z10) {
        x();
        if (rh.h.a().S5() && z10 && q2.b()) {
            NativeGLInterface.nativeAppBridgeV2LeaveGameAfterIdle();
        } else {
            NativeGLInterface.nativeAppBridgeV2LeaveGame();
        }
    }

    public final /* synthetic */ void u(String str) {
        this.f32890g.setVisibility(0);
    }

    public final /* synthetic */ void v() {
        FrameLayout frameLayout = this.f32886c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final /* synthetic */ void w() {
        FrameLayout frameLayout;
        if (q().isDestroyed() || (frameLayout = this.f32886c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final /* synthetic */ void y() {
        this.f32896m.a0();
    }

    public final /* synthetic */ void z() {
        if (q() == null) {
            return;
        }
        F();
    }
}
