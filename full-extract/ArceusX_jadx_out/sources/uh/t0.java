package uh;

import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.l;
import androidx.annotation.NonNull;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.util.AssertDialogUtil;
import java.lang.ref.WeakReference;
import kk.f;
import uh.a;

/* loaded from: classes2.dex */
public class t0 implements android.view.p, a.f, f.InterfaceC0401f, SurfaceHolder.Callback {

    /* renamed from: c, reason: collision with root package name */
    public yg.a f32952c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<com.roblox.client.a> f32954e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.f f32955f;

    /* renamed from: g, reason: collision with root package name */
    public final SurfaceView f32956g;

    /* renamed from: h, reason: collision with root package name */
    public DisplayManager f32957h;

    /* renamed from: i, reason: collision with root package name */
    public DisplayManager.DisplayListener f32958i;

    /* renamed from: a, reason: collision with root package name */
    public u0 f32951a = u0.APP;
    public final String b = "MainScreenController";

    /* renamed from: d, reason: collision with root package name */
    public Boolean f32953d = Boolean.FALSE;

    public class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 != 0 || t0.this.f32957h == null) {
                return;
            }
            t0 t0Var = t0.this;
            t0Var.n(t0Var.f32957h.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32960a;

        static {
            int[] iArr = new int[l.a.values().length];
            f32960a = iArr;
            try {
                iArr[l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32960a[l.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32960a[l.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32960a[l.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32960a[l.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public t0(com.roblox.client.a aVar, SurfaceView surfaceView) {
        this.f32954e = new WeakReference<>(aVar);
        this.f32956g = surfaceView;
        kk.f fVar = new kk.f(aVar, surfaceView, this);
        this.f32955f = fVar;
        surfaceView.setOnTouchListener(fVar);
        surfaceView.getHolder().addCallback(this);
    }

    @Override // rg.f0
    public void H() {
    }

    @Override // rg.f0
    public boolean b() {
        return this.f32953d.booleanValue();
    }

    public final void d() {
        DisplayManager.DisplayListener displayListener;
        DisplayManager displayManager = this.f32957h;
        if (displayManager != null && (displayListener = this.f32958i) != null) {
            displayManager.unregisterDisplayListener(displayListener);
        }
        this.f32958i = null;
        this.f32957h = null;
    }

    public final void e() {
        ek.q.h("MainScreenController", "Disposing RTC audio manager.");
        yg.a aVar = this.f32952c;
        if (aVar != null) {
            aVar.a();
            this.f32952c = null;
        }
    }

    @Override // android.view.p
    public void f(@NonNull android.view.s sVar, @NonNull l.a aVar) {
        ek.q.b("MainScreenController", "onStateChanged: event: " + aVar);
        int i10 = b.f32960a[aVar.ordinal()];
        if (i10 == 1) {
            i((j.b) sVar);
            h();
            if (!rh.h.a().R3() || ti.b.m()) {
                return;
            }
            this.f32954e.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i10 == 2) {
            this.f32955f.H(false);
            rg.y.h().k().k("POST_NOTIFICATIONS", hj.t.g());
            rg.y.h().k().k("MEDIA_PICKER", ui.a.e());
            if (rh.h.a().h4() && AssertDialogUtil.b()) {
                AssertDialogUtil.c(this.f32954e.get());
                return;
            }
            return;
        }
        if (i10 == 3) {
            this.f32955f.I();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return;
            }
            e();
            d();
            return;
        }
        rg.y.h().k().Y("POST_NOTIFICATIONS");
        rg.y.h().k().Y("MEDIA_PICKER");
        if (rh.h.a().h4() && AssertDialogUtil.b()) {
            AssertDialogUtil.c(null);
        }
    }

    @Override // rg.f0
    public void g(boolean z10) {
        this.f32955f.H(z10);
    }

    public final void h() {
        com.roblox.client.a aVar = this.f32954e.get();
        if (aVar == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) aVar.getApplicationContext().getSystemService("display");
        this.f32957h = displayManager;
        if (displayManager == null) {
            return;
        }
        a aVar2 = new a();
        this.f32958i = aVar2;
        this.f32957h.registerDisplayListener(aVar2, null);
        Display display = this.f32957h.getDisplay(0);
        if (display == null) {
            return;
        }
        n(display);
        NativeGLInterface.nativePassSupportedRefreshRates(cl.a.k(display));
    }

    public final void i(j.b bVar) {
        ek.q.h("MainScreenController", "Initializing RTC audio manager.");
        yg.a c10 = rg.y.h().c(bVar.getApplicationContext());
        this.f32952c = c10;
        if (c10 != null) {
            c10.b(bVar);
        }
    }

    public void j(int i10) {
        if (this.f32951a == u0.EXPERIENCE) {
            ek.q.h("MainScreenController", "Handling onTrimMemory level: " + i10);
            if (i10 == 15) {
                ek.q.k("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
        RobloxApplication.g("MainScreenController", this.f32951a, i10);
        NativeGLInterface.nativeAppBridgeV2OnLowMemoryForRenderView(this.f32951a.ordinal(), i10);
    }

    public void k(u0 u0Var) {
        ek.q.h("MainScreenController", "Roblox has entered " + u0Var.name() + " mode.");
        this.f32951a = u0Var;
    }

    @Override // rg.f0
    public void l() {
        this.f32955f.I();
    }

    public final void n(Display display) {
        if (this.f32954e.get() == null) {
            return;
        }
        NativeGLInterface.nativePassCurrentDisplayRefreshRate(cl.a.a(display));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ek.q.h("MainScreenController", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        ek.q.h("MainScreenController", "surfaceCreated");
        this.f32953d = Boolean.TRUE;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        ek.q.h("MainScreenController", "surfaceDestroyed");
        this.f32953d = Boolean.FALSE;
    }
}
