package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n0.u1;
import y1.c;
import z.h5;

/* loaded from: classes.dex */
public class n5 extends h5.c implements h5, h5.a {
    public final o3 b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f37334c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f37335d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f37336e;

    /* renamed from: f, reason: collision with root package name */
    public h5.c f37337f;

    /* renamed from: g, reason: collision with root package name */
    public a0.g f37338g;

    /* renamed from: h, reason: collision with root package name */
    public ne.x<Void> f37339h;

    /* renamed from: i, reason: collision with root package name */
    public c.a<Void> f37340i;

    /* renamed from: j, reason: collision with root package name */
    public ne.x<List<Surface>> f37341j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f37333a = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List<n0.u1> f37342k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37343l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f37344m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37345n = false;

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            n5.this.c();
            n5 n5Var = n5.this;
            n5Var.b.i(n5Var);
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.p(n5Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.q(n5Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.r(n5Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                n5.this.C(cameraCaptureSession);
                n5 n5Var = n5.this;
                n5Var.s(n5Var);
                synchronized (n5.this.f37333a) {
                    x2.g.h(n5.this.f37340i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f37340i;
                    n5Var2.f37340i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (n5.this.f37333a) {
                    x2.g.h(n5.this.f37340i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    c.a<Void> aVar2 = n5Var3.f37340i;
                    n5Var3.f37340i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                n5.this.C(cameraCaptureSession);
                n5 n5Var = n5.this;
                n5Var.t(n5Var);
                synchronized (n5.this.f37333a) {
                    x2.g.h(n5.this.f37340i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f37340i;
                    n5Var2.f37340i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (n5.this.f37333a) {
                    x2.g.h(n5.this.f37340i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    c.a<Void> aVar2 = n5Var3.f37340i;
                    n5Var3.f37340i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.u(n5Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.w(n5Var, surface);
        }
    }

    public static class c {
        public static List<CaptureRequest> a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    public n5(o3 o3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = o3Var;
        this.f37334c = handler;
        this.f37335d = executor;
        this.f37336e = scheduledExecutorService;
    }

    public static /* synthetic */ ne.x A(n5 n5Var, List list, List list2) {
        n5Var.getClass();
        g0.r1.a("SyncCaptureSessionBase", "[" + n5Var + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? r0.n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? r0.n.n(new u1.a("Surface closed", (n0.u1) list.get(list2.indexOf(null)))) : r0.n.p(list2);
    }

    public static /* synthetic */ void x(n5 n5Var, h5 h5Var) {
        n5Var.b.g(n5Var);
        n5Var.B(h5Var);
        if (n5Var.f37338g != null) {
            Objects.requireNonNull(n5Var.f37337f);
            n5Var.f37337f.r(h5Var);
            return;
        }
        g0.r1.l("SyncCaptureSessionBase", "[" + n5Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object y(n5 n5Var, List list, a0.d0 d0Var, b0.o oVar, c.a aVar) {
        String str;
        synchronized (n5Var.f37333a) {
            n5Var.D(list);
            x2.g.j(n5Var.f37340i == null, "The openCaptureSessionCompleter can only set once!");
            n5Var.f37340i = aVar;
            d0Var.a(oVar);
            str = "openCaptureSession[session=" + n5Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void z(n5 n5Var, h5 h5Var) {
        Objects.requireNonNull(n5Var.f37337f);
        n5Var.f37337f.B(h5Var);
    }

    public void C(CameraCaptureSession cameraCaptureSession) {
        if (this.f37338g == null) {
            this.f37338g = a0.g.e(cameraCaptureSession, this.f37334c);
        }
    }

    public void D(List<n0.u1> list) {
        synchronized (this.f37333a) {
            F();
            n0.x1.d(list);
            this.f37342k = list;
        }
    }

    public boolean E() {
        boolean z10;
        synchronized (this.f37333a) {
            z10 = this.f37339h != null;
        }
        return z10;
    }

    public void F() {
        synchronized (this.f37333a) {
            try {
                List<n0.u1> list = this.f37342k;
                if (list != null) {
                    n0.x1.c(list);
                    this.f37342k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public void a() {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        this.f37338g.d().stopRepeating();
    }

    @Override // z.h5
    public h5.c b() {
        return this;
    }

    @Override // z.h5
    public void c() {
        F();
    }

    @Override // z.h5
    public void close() {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        this.b.h(this);
        this.f37338g.d().close();
        getExecutor().execute(new Runnable() { // from class: z.l5
            @Override // java.lang.Runnable
            public final void run() {
                n5.this.B(r0);
            }
        });
    }

    @Override // z.h5
    public void d(int i10) {
    }

    @Override // z.h5
    public void e() {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        this.f37338g.d().abortCaptures();
    }

    @Override // z.h5
    public CameraDevice f() {
        x2.g.g(this.f37338g);
        return this.f37338g.d().getDevice();
    }

    @Override // z.h5
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        return this.f37338g.c(captureRequest, getExecutor(), captureCallback);
    }

    @Override // z.h5.a
    public Executor getExecutor() {
        return this.f37335d;
    }

    @Override // z.h5.a
    public ne.x<Void> h(CameraDevice cameraDevice, final b0.o oVar, final List<n0.u1> list) {
        synchronized (this.f37333a) {
            try {
                if (this.f37344m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                this.b.k(this);
                final a0.d0 b10 = a0.d0.b(cameraDevice, this.f37334c);
                ne.x<Void> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: z.m5
                    @Override // y1.c.InterfaceC0669c
                    public final Object a(c.a aVar) {
                        return n5.y(n5.this, list, b10, oVar, aVar);
                    }
                });
                this.f37339h = a10;
                r0.n.j(a10, new a(), q0.c.b());
                return r0.n.s(this.f37339h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public List<CaptureRequest> i(CaptureRequest captureRequest) {
        CameraCaptureSession d10 = ((a0.g) x2.g.g(this.f37338g)).d();
        return d10 instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) d10, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // z.h5.a
    public ne.x<List<Surface>> j(final List<n0.u1> list, long j10) {
        synchronized (this.f37333a) {
            try {
                if (this.f37344m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                r0.d g10 = r0.d.c(n0.x1.e(list, false, j10, getExecutor(), this.f37336e)).g(new r0.a() { // from class: z.j5
                    @Override // r0.a
                    public final ne.x apply(Object obj) {
                        return n5.A(n5.this, list, (List) obj);
                    }
                }, getExecutor());
                this.f37341j = g10;
                return r0.n.s(g10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5.a
    public b0.o k(int i10, List<b0.i> list, h5.c cVar) {
        this.f37337f = cVar;
        return new b0.o(i10, list, getExecutor(), new b());
    }

    @Override // z.h5
    public int l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        return this.f37338g.b(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37338g, "Need to call openCaptureSession before using this API.");
        return this.f37338g.a(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public a0.g n() {
        x2.g.g(this.f37338g);
        return this.f37338g;
    }

    @Override // z.h5.c
    public void p(h5 h5Var) {
        Objects.requireNonNull(this.f37337f);
        this.f37337f.p(h5Var);
    }

    @Override // z.h5.c
    public void q(h5 h5Var) {
        Objects.requireNonNull(this.f37337f);
        this.f37337f.q(h5Var);
    }

    @Override // z.h5.c
    public void r(final h5 h5Var) {
        ne.x<Void> xVar;
        synchronized (this.f37333a) {
            try {
                if (this.f37343l) {
                    xVar = null;
                } else {
                    this.f37343l = true;
                    x2.g.h(this.f37339h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f37339h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c();
        if (xVar != null) {
            xVar.a(new Runnable() { // from class: z.i5
                @Override // java.lang.Runnable
                public final void run() {
                    n5.x(n5.this, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void s(h5 h5Var) {
        Objects.requireNonNull(this.f37337f);
        c();
        this.b.i(this);
        this.f37337f.s(h5Var);
    }

    @Override // z.h5.a
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f37333a) {
                try {
                    if (!this.f37344m) {
                        ne.x<List<Surface>> xVar = this.f37341j;
                        r1 = xVar != null ? xVar : null;
                        this.f37344m = true;
                    }
                    z10 = !E();
                } finally {
                }
            }
            return z10;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // z.h5.c
    public void t(h5 h5Var) {
        Objects.requireNonNull(this.f37337f);
        this.b.j(this);
        this.f37337f.t(h5Var);
    }

    @Override // z.h5.c
    public void u(h5 h5Var) {
        Objects.requireNonNull(this.f37337f);
        this.f37337f.u(h5Var);
    }

    @Override // z.h5.c
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void B(final h5 h5Var) {
        ne.x<Void> xVar;
        synchronized (this.f37333a) {
            try {
                if (this.f37345n) {
                    xVar = null;
                } else {
                    this.f37345n = true;
                    x2.g.h(this.f37339h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f37339h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVar != null) {
            xVar.a(new Runnable() { // from class: z.k5
                @Override // java.lang.Runnable
                public final void run() {
                    n5.z(n5.this, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void w(h5 h5Var, Surface surface) {
        Objects.requireNonNull(this.f37337f);
        this.f37337f.w(h5Var, surface);
    }
}
