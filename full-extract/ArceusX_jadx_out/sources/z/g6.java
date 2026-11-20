package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import g0.m;
import java.util.concurrent.Executor;
import y.a;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final y f37194a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final h6 f37195c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.d0<g0.z2> f37196d;

    /* renamed from: e, reason: collision with root package name */
    public final b f37197e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37198f = false;

    /* renamed from: g, reason: collision with root package name */
    public y.c f37199g = new a();

    public class a implements y.c {
        public a() {
        }

        @Override // z.y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            g6.this.f37197e.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c();

        float d();

        void e(float f10, c.a<Void> aVar);

        Rect f();

        void g(a.C0666a c0666a);
    }

    public g6(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37194a = yVar;
        this.b = executor;
        b f10 = f(c0Var);
        this.f37197e = f10;
        h6 h6Var = new h6(f10.d(), f10.b());
        this.f37195c = h6Var;
        h6Var.f(1.0f);
        this.f37196d = new android.view.d0<>(s0.h.f(h6Var));
        yVar.B(this.f37199g);
    }

    public static /* synthetic */ Object c(final g6 g6Var, final g0.z2 z2Var, final c.a aVar) {
        g6Var.b.execute(new Runnable() { // from class: z.d6
            @Override // java.lang.Runnable
            public final void run() {
                g6.this.o(aVar, z2Var);
            }
        });
        return "setLinearZoom";
    }

    public static /* synthetic */ Object d(final g6 g6Var, final g0.z2 z2Var, final c.a aVar) {
        g6Var.b.execute(new Runnable() { // from class: z.c6
            @Override // java.lang.Runnable
            public final void run() {
                g6.this.o(aVar, z2Var);
            }
        });
        return "setZoomRatio";
    }

    public static b f(a0.c0 c0Var) {
        return k(c0Var) ? new c(c0Var) : new p3(c0Var);
    }

    public static g0.z2 h(a0.c0 c0Var) {
        b f10 = f(c0Var);
        h6 h6Var = new h6(f10.d(), f10.b());
        h6Var.f(1.0f);
        return s0.h.f(h6Var);
    }

    public static Range<Float> i(a0.c0 c0Var) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c0Var.a(key);
        } catch (AssertionError e10) {
            g0.r1.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    public static boolean k(a0.c0 c0Var) {
        return Build.VERSION.SDK_INT >= 30 && i(c0Var) != null;
    }

    public void e(a.C0666a c0666a) {
        this.f37197e.g(c0666a);
    }

    public Rect g() {
        return this.f37197e.f();
    }

    public android.view.a0<g0.z2> j() {
        return this.f37196d;
    }

    public void l(boolean z10) {
        g0.z2 f10;
        if (this.f37198f == z10) {
            return;
        }
        this.f37198f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f37195c) {
            this.f37195c.f(1.0f);
            f10 = s0.h.f(this.f37195c);
        }
        p(f10);
        this.f37197e.c();
        this.f37194a.s0();
    }

    public ne.x<Void> m(float f10) {
        final g0.z2 f11;
        synchronized (this.f37195c) {
            try {
                this.f37195c.e(f10);
                f11 = s0.h.f(this.f37195c);
            } catch (IllegalArgumentException e10) {
                return r0.n.n(e10);
            }
        }
        p(f11);
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.f6
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g6.c(g6.this, f11, aVar);
            }
        });
    }

    public ne.x<Void> n(float f10) {
        final g0.z2 f11;
        synchronized (this.f37195c) {
            try {
                this.f37195c.f(f10);
                f11 = s0.h.f(this.f37195c);
            } catch (IllegalArgumentException e10) {
                return r0.n.n(e10);
            }
        }
        p(f11);
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.e6
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g6.d(g6.this, f11, aVar);
            }
        });
    }

    public final void o(c.a<Void> aVar, g0.z2 z2Var) {
        g0.z2 f10;
        if (this.f37198f) {
            this.f37197e.e(z2Var.d(), aVar);
            this.f37194a.s0();
            return;
        }
        synchronized (this.f37195c) {
            this.f37195c.f(1.0f);
            f10 = s0.h.f(this.f37195c);
        }
        p(f10);
        aVar.f(new m.a("Camera is not active."));
    }

    public final void p(g0.z2 z2Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f37196d.o(z2Var);
        } else {
            this.f37196d.m(z2Var);
        }
    }
}
