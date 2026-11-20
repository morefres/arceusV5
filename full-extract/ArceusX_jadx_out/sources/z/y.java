package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import f0.l;
import g0.f1;
import g0.m;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import n0.l0;
import n0.l1;
import n0.n1;
import n0.o3;
import y.a;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public class y implements n0.l0 {
    public int A;
    public long B;
    public final a C;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37546c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37547d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final a0.c0 f37548e;

    /* renamed from: f, reason: collision with root package name */
    public final l0.d f37549f;

    /* renamed from: g, reason: collision with root package name */
    public final o3.b f37550g;

    /* renamed from: h, reason: collision with root package name */
    public final h4 f37551h;

    /* renamed from: i, reason: collision with root package name */
    public final g6 f37552i;

    /* renamed from: j, reason: collision with root package name */
    public final x5 f37553j;

    /* renamed from: k, reason: collision with root package name */
    public final q4 f37554k;

    /* renamed from: l, reason: collision with root package name */
    public final s3 f37555l;

    /* renamed from: m, reason: collision with root package name */
    public i6 f37556m;

    /* renamed from: n, reason: collision with root package name */
    public final f0.g f37557n;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f37558o;

    /* renamed from: p, reason: collision with root package name */
    public final b6 f37559p;

    /* renamed from: q, reason: collision with root package name */
    public int f37560q;

    /* renamed from: r, reason: collision with root package name */
    public f1.j f37561r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f37562s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f37563t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f37564u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f37565v;

    /* renamed from: w, reason: collision with root package name */
    public final d0.a f37566w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37567x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicLong f37568y;

    /* renamed from: z, reason: collision with root package name */
    public volatile ne.x<Void> f37569z;

    public static final class a extends n0.u {

        /* renamed from: a, reason: collision with root package name */
        public Set<n0.u> f37570a = new HashSet();
        public Map<n0.u, Executor> b = new ArrayMap();

        @Override // n0.u
        public void a(final int i10) {
            for (final n0.u uVar : this.f37570a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            n0.u.this.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // n0.u
        public void b(final int i10, final n0.e0 e0Var) {
            for (final n0.u uVar : this.f37570a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            n0.u.this.b(i10, e0Var);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // n0.u
        public void c(final int i10, final n0.w wVar) {
            for (final n0.u uVar : this.f37570a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            n0.u.this.c(i10, wVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        public void h(Executor executor, n0.u uVar) {
            this.f37570a.add(uVar);
            this.b.put(uVar, executor);
        }

        public void i(n0.u uVar) {
            this.f37570a.remove(uVar);
            this.b.remove(uVar);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Set<c> f37571a = new HashSet();
        public final Executor b;

        public b(Executor executor) {
            this.b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f37571a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f37571a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f37571a.add(cVar);
        }

        public void c(c cVar) {
            this.f37571a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: z.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.b.a(y.b.this, totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public y(a0.c0 c0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, l0.d dVar, n0.k3 k3Var) {
        o3.b bVar = new o3.b();
        this.f37550g = bVar;
        this.f37560q = 0;
        this.f37562s = 0;
        this.f37564u = false;
        this.f37565v = 2;
        this.f37567x = true;
        this.f37568y = new AtomicLong(0L);
        this.f37569z = r0.n.p(null);
        this.A = 1;
        this.B = 0L;
        a aVar = new a();
        this.C = aVar;
        this.f37548e = c0Var;
        this.f37549f = dVar;
        this.f37546c = executor;
        this.f37559p = new b6(executor);
        b bVar2 = new b(executor);
        this.b = bVar2;
        bVar.B(this.A);
        bVar.j(c3.e(bVar2));
        bVar.j(aVar);
        this.f37555l = new s3(this, c0Var, executor);
        this.f37551h = new h4(this, scheduledExecutorService, executor, k3Var);
        this.f37552i = new g6(this, c0Var, executor);
        this.f37553j = new x5(this, c0Var, executor);
        this.f37563t = c0Var.c();
        this.f37554k = new q4(this, c0Var, executor);
        this.f37556m = new m6(c0Var, executor);
        this.f37566w = new d0.a(k3Var);
        this.f37557n = new f0.g(this, executor);
        this.f37558o = new g1(this, c0Var, k3Var, executor, scheduledExecutorService);
    }

    public static /* synthetic */ boolean A(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!e0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public static int R(a0.c0 c0Var, int i10) {
        int[] iArr = (int[]) c0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return c0(i10, iArr) ? i10 : c0(1, iArr) ? 1 : 0;
    }

    public static boolean c0(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean e0(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof n0.z3) && (l10 = (Long) ((n0.z3) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static /* synthetic */ Object p(final y yVar, final c.a aVar) {
        yVar.getClass();
        try {
            yVar.f37546c.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(y.this.f37567x));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ Object v(y yVar, final long j10, final c.a aVar) {
        yVar.getClass();
        yVar.B(new c() { // from class: z.p
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return y.A(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public static /* synthetic */ Object x(final y yVar, final c.a aVar) {
        yVar.f37546c.execute(new Runnable() { // from class: z.m
            @Override // java.lang.Runnable
            public final void run() {
                r0.n.t(r0.t0(y.this.s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public void B(c cVar) {
        this.b.b(cVar);
    }

    public void C(final Executor executor, final n0.u uVar) {
        this.f37546c.execute(new Runnable() { // from class: z.t
            @Override // java.lang.Runnable
            public final void run() {
                y.this.C.h(executor, uVar);
            }
        });
    }

    public void D() {
        synchronized (this.f37547d) {
            try {
                int i10 = this.f37560q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f37560q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(boolean z10) {
        if (this.f37564u == z10) {
            return;
        }
        if (z10 && f0()) {
            i0();
            this.f37562s = 0;
            this.f37553j.f();
        }
        this.f37564u = z10;
        s0();
    }

    public void F(int i10) {
        if (this.f37564u) {
            return;
        }
        this.f37562s = i10;
        if (i10 == 0) {
            i0();
        }
        s0();
    }

    public Rect G() {
        return this.f37552i.g();
    }

    public int H() {
        return this.f37565v;
    }

    public h4 I() {
        return this.f37551h;
    }

    public q4 J() {
        return this.f37554k;
    }

    public int K() {
        Integer num = (Integer) this.f37548e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int L() {
        Integer num = (Integer) this.f37548e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int M() {
        Integer num = (Integer) this.f37548e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public f1.j N() {
        return this.f37561r;
    }

    public n0.o3 O() {
        this.f37550g.B(this.A);
        this.f37550g.w(P());
        this.f37550g.o("CameraControlSessionUpdateId", Long.valueOf(this.B));
        return this.f37550g.p();
    }

    public n0.n1 P() {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        a.C0666a c0666a = new a.C0666a();
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_MODE;
        n1.c cVar = n1.c.REQUIRED;
        c0666a.g(key3, 1, cVar);
        this.f37551h.n(c0666a);
        this.f37552i.e(c0666a);
        int i10 = this.f37551h.G() ? 5 : 1;
        if (this.f37564u) {
            i10 = 6;
        } else if (f0()) {
            c0666a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f37562s == 1) {
                    key2 = CaptureRequest.FLASH_STRENGTH_LEVEL;
                    c0666a.g(key2, Integer.valueOf(this.f37563t), cVar);
                } else if (this.f37562s == 2) {
                    key = CaptureRequest.FLASH_STRENGTH_LEVEL;
                    c0666a.g(key, Integer.valueOf(this.f37548e.c()), cVar);
                }
            }
        } else {
            int i11 = this.f37565v;
            if (i11 == 0) {
                i10 = this.f37566w.a(2);
            } else if (i11 == 1) {
                i10 = 3;
            } else if (i11 == 2) {
                i10 = 1;
            }
        }
        c0666a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(i10)), cVar);
        c0666a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(T(1)), cVar);
        this.f37555l.c(c0666a);
        this.f37557n.i(c0666a);
        return c0666a.b();
    }

    public int Q(int i10) {
        return R(this.f37548e, i10);
    }

    public int S(int i10) {
        int[] iArr = (int[]) this.f37548e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        if (c0(4, iArr)) {
            return 4;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public final int T(int i10) {
        int[] iArr = (int[]) this.f37548e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return c0(i10, iArr) ? i10 : c0(1, iArr) ? 1 : 0;
    }

    public x5 U() {
        return this.f37553j;
    }

    public int V() {
        int i10;
        synchronized (this.f37547d) {
            i10 = this.f37560q;
        }
        return i10;
    }

    public g6 W() {
        return this.f37552i;
    }

    public i6 X() {
        return this.f37556m;
    }

    public void Y() {
        synchronized (this.f37547d) {
            this.f37560q++;
        }
    }

    public final boolean Z() {
        return V() > 0;
    }

    @Override // n0.l0
    public void a(o3.b bVar) {
        this.f37556m.a(bVar);
    }

    public boolean a0() {
        int e10 = this.f37559p.e();
        g0.r1.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + e10);
        return e10 > 0;
    }

    @Override // n0.l0
    public void b() {
        this.f37556m.b();
    }

    public boolean b0() {
        return this.f37564u;
    }

    @Override // g0.m
    public ne.x<Void> c(boolean z10) {
        return !Z() ? r0.n.n(new m.a("Camera is not active.")) : r0.n.s(this.f37553j.d(z10));
    }

    @Override // n0.l0
    public void d() {
        this.f37559p.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d0() {
        try {
            return ((Boolean) y1.c.a(new c.InterfaceC0669c() { // from class: z.s
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return y.p(y.this, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // g0.m
    public ne.x<Void> e(float f10) {
        return !Z() ? r0.n.n(new m.a("Camera is not active.")) : r0.n.s(this.f37552i.m(f10));
    }

    @Override // n0.l0
    public ne.x<List<Void>> f(final List<n0.l1> list, final int i10, final int i11) {
        if (Z()) {
            final int H = H();
            return r0.d.c(r0.n.s(this.f37569z)).g(new r0.a() { // from class: z.q
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x h10;
                    h10 = y.this.f37558o.h(list, i10, H, i11);
                    return h10;
                }
            }, this.f37546c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new m.a("Camera is not active."));
    }

    public boolean f0() {
        return this.f37562s != 0;
    }

    @Override // g0.m
    public ne.x<Void> g(float f10) {
        return !Z() ? r0.n.n(new m.a("Camera is not active.")) : r0.n.s(this.f37552i.n(f10));
    }

    public void g0(c cVar) {
        this.b.c(cVar);
    }

    @Override // n0.l0
    public void h(f1.j jVar) {
        this.f37561r = jVar;
    }

    public void h0(final n0.u uVar) {
        this.f37546c.execute(new Runnable() { // from class: z.j
            @Override // java.lang.Runnable
            public final void run() {
                y.this.C.i(uVar);
            }
        });
    }

    @Override // n0.l0
    public void i(int i10) {
        if (!Z()) {
            g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f37565v = i10;
        g0.r1.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f37565v);
        i6 i6Var = this.f37556m;
        boolean z10 = true;
        if (this.f37565v != 1 && this.f37565v != 0) {
            z10 = false;
        }
        i6Var.d(z10);
        this.f37569z = r0();
    }

    public final void i0() {
        l1.a aVar = new l1.a();
        aVar.v(this.A);
        aVar.w(true);
        a.C0666a c0666a = new a.C0666a();
        c0666a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(1)));
        c0666a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0666a.b());
        q0(Collections.singletonList(aVar.h()));
    }

    @Override // n0.l0
    public n0.n1 j() {
        return this.f37557n.n();
    }

    public void j0() {
        o0(1);
    }

    @Override // n0.l0
    public void k() {
        this.f37559p.f();
    }

    public void k0(boolean z10) {
        g0.r1.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f37551h.J(z10);
        this.f37552i.l(z10);
        this.f37554k.d(z10);
        this.f37553j.i(z10);
        this.f37555l.b(z10);
        this.f37557n.o(z10);
        if (z10) {
            return;
        }
        this.f37561r = null;
        this.f37559p.h();
    }

    @Override // n0.l0
    public void l(n0.n1 n1Var) {
        this.f37557n.g(l.a.d(n1Var).c()).a(new Runnable() { // from class: z.u
            @Override // java.lang.Runnable
            public final void run() {
                y.q();
            }
        }, q0.c.b());
    }

    public void l0(boolean z10) {
        this.f37567x = z10;
    }

    @Override // n0.l0
    public ne.x<m0.m> m(final int i10, final int i11) {
        if (Z()) {
            final int H = H();
            return r0.d.c(r0.n.s(this.f37569z)).g(new r0.a() { // from class: z.r
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x p8;
                    p8 = r0.n.p(y.this.f37558o.c(i10, H, i11));
                    return p8;
                }
            }, this.f37546c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new m.a("Camera is not active."));
    }

    public void m0(boolean z10) {
        this.f37554k.f(z10);
    }

    @Override // n0.l0
    public void n() {
        this.f37557n.j().a(new Runnable() { // from class: z.l
            @Override // java.lang.Runnable
            public final void run() {
                y.r();
            }
        }, q0.c.b());
    }

    public void n0(Rational rational) {
        this.f37551h.K(rational);
    }

    @Override // g0.m
    public ne.x<g0.n0> o(g0.m0 m0Var) {
        return !Z() ? r0.n.n(new m.a("Camera is not active.")) : !d0() ? r0.n.n(new m.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : r0.n.s(this.f37551h.N(m0Var));
    }

    public void o0(int i10) {
        this.A = i10;
        this.f37551h.L(i10);
        this.f37558o.g(this.A);
    }

    public void p0(boolean z10) {
        this.f37556m.e(z10);
    }

    public void q0(List<n0.l1> list) {
        this.f37549f.b(list);
    }

    public ne.x<Void> r0() {
        return r0.n.s(y1.c.a(new c.InterfaceC0669c() { // from class: z.k
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return y.x(y.this, aVar);
            }
        }));
    }

    public long s0() {
        this.B = this.f37568y.getAndIncrement();
        this.f37549f.a();
        return this.B;
    }

    public final ne.x<Void> t0(final long j10) {
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.o
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return y.v(y.this, j10, aVar);
            }
        });
    }
}
