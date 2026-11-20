package y0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import g0.i0;
import g0.j2;
import g0.k0;
import g0.r1;
import g0.v2;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.c0;
import x0.r0;
import y1.c;
import z0.d;

/* loaded from: classes.dex */
public class o implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final c f36213a;
    public final HandlerThread b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f36214c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f36215d;

    /* renamed from: e, reason: collision with root package name */
    public int f36216e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36217f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f36218g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<j2, Surface> f36219h;

    /* renamed from: i, reason: collision with root package name */
    public SurfaceTexture f36220i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f36221j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static yt.n<k0, i0, i0, r0> f36222a = new yt.n() { // from class: y0.n
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((k0) obj, (i0) obj2, (i0) obj3);
            }
        };

        public static r0 a(k0 k0Var, i0 i0Var, i0 i0Var2) {
            return f36222a.invoke(k0Var, i0Var, i0Var2);
        }
    }

    public o(k0 k0Var, i0 i0Var, i0 i0Var2) {
        this(k0Var, Collections.EMPTY_MAP, i0Var, i0Var2);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f36217f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g(o oVar, SurfaceTexture surfaceTexture, Surface surface, v2.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f36216e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f36217f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, j2 j2Var, j2.b bVar) {
        oVar.getClass();
        j2Var.close();
        Surface remove = oVar.f36219h.remove(j2Var);
        if (remove != null) {
            oVar.f36213a.r(remove);
        }
    }

    public static /* synthetic */ void j(final o oVar, final j2 j2Var) {
        Surface p22 = j2Var.p2(oVar.f36214c, new x2.a() { // from class: y0.j
            @Override // x2.a
            public final void accept(Object obj) {
                o.i(o.this, j2Var, (j2.b) obj);
            }
        });
        oVar.f36213a.j(p22);
        oVar.f36219h.put(j2Var, p22);
    }

    public static /* synthetic */ void k(final o oVar, v2 v2Var) {
        oVar.f36216e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f36213a.t(v2Var.u()));
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v2Var.w(surface, oVar.f36214c, new x2.a() { // from class: y0.m
            @Override // x2.a
            public final void accept(Object obj) {
                o.g(o.this, surfaceTexture, surface, (v2.g) obj);
            }
        });
        if (v2Var.u()) {
            oVar.f36220i = surfaceTexture;
        } else {
            oVar.f36221j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f36215d);
        }
    }

    public static /* synthetic */ void l(o oVar, k0 k0Var, Map map, c.a aVar) {
        oVar.getClass();
        try {
            oVar.f36213a.h(k0Var, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object m(final o oVar, final k0 k0Var, final Map map, final c.a aVar) {
        oVar.getClass();
        oVar.o(new Runnable() { // from class: y0.i
            @Override // java.lang.Runnable
            public final void run() {
                o.l(o.this, k0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f36217f && this.f36216e == 0) {
            Iterator<j2> it = this.f36219h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f36219h.clear();
            this.f36213a.k();
            this.b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: y0.l
            @Override // java.lang.Runnable
            public final void run() {
                o.f();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f36214c.execute(new Runnable() { // from class: y0.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(o.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            r1.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void q(final k0 k0Var, final Map<d.e, c0> map) {
        try {
            y1.c.a(new c.InterfaceC0669c() { // from class: y0.g
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return o.m(o.this, k0Var, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // x0.r0
    public void a() {
        if (this.f36218g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: y0.e
            @Override // java.lang.Runnable
            public final void run() {
                o.h(o.this);
            }
        });
    }

    @Override // g0.k2
    public void b(final v2 v2Var) {
        if (this.f36218g.get()) {
            v2Var.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.f
            @Override // java.lang.Runnable
            public final void run() {
                o.k(o.this, v2Var);
            }
        };
        Objects.requireNonNull(v2Var);
        p(runnable, new x0.p(v2Var));
    }

    @Override // g0.k2
    public void d(final j2 j2Var) {
        if (this.f36218g.get()) {
            j2Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.h
            @Override // java.lang.Runnable
            public final void run() {
                o.j(o.this, j2Var);
            }
        };
        Objects.requireNonNull(j2Var);
        p(runnable, new x0.n(j2Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f36218g.get() || (surfaceTexture2 = this.f36220i) == null || this.f36221j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f36221j.updateTexImage();
        for (Map.Entry<j2, Surface> entry : this.f36219h.entrySet()) {
            Surface value = entry.getValue();
            j2 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f36213a.v(surfaceTexture.getTimestamp(), value, key, this.f36220i, this.f36221j);
                } catch (RuntimeException e10) {
                    r1.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    public o(k0 k0Var, Map<d.e, c0> map, i0 i0Var, i0 i0Var2) {
        this.f36216e = 0;
        this.f36217f = false;
        this.f36218g = new AtomicBoolean(false);
        this.f36219h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f36215d = handler;
        this.f36214c = q0.c.f(handler);
        this.f36213a = new c(i0Var, i0Var2);
        try {
            q(k0Var, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }
}
