package z;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import g0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n0.l0;
import n0.l1;
import n0.n1;
import y.a;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public class h4 {

    /* renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f37206x = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final y f37207a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f37208c;

    /* renamed from: f, reason: collision with root package name */
    public final d0.l f37211f;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture<?> f37214i;

    /* renamed from: j, reason: collision with root package name */
    public ScheduledFuture<?> f37215j;

    /* renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f37222q;

    /* renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f37223r;

    /* renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f37224s;

    /* renamed from: t, reason: collision with root package name */
    public c.a<g0.n0> f37225t;

    /* renamed from: u, reason: collision with root package name */
    public c.a<Void> f37226u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37227v;

    /* renamed from: w, reason: collision with root package name */
    public y.c f37228w;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f37209d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile Rational f37210e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37212g = false;

    /* renamed from: h, reason: collision with root package name */
    public Integer f37213h = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f37216k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37217l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f37218m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f37219n = 1;

    /* renamed from: o, reason: collision with root package name */
    public y.c f37220o = null;

    /* renamed from: p, reason: collision with root package name */
    public y.c f37221p = null;

    public class a extends n0.u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f37229a;

        public a(c.a aVar) {
            this.f37229a = aVar;
        }

        @Override // n0.u
        public void a(int i10) {
            c.a aVar = this.f37229a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override // n0.u
        public void b(int i10, n0.e0 e0Var) {
            c.a aVar = this.f37229a;
            if (aVar != null) {
                aVar.c(e0Var);
            }
        }

        @Override // n0.u
        public void c(int i10, n0.w wVar) {
            c.a aVar = this.f37229a;
            if (aVar != null) {
                aVar.f(new l0.c(wVar));
            }
        }
    }

    public class b extends n0.u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f37230a;

        public b(c.a aVar) {
            this.f37230a = aVar;
        }

        @Override // n0.u
        public void a(int i10) {
            c.a aVar = this.f37230a;
            if (aVar != null) {
                aVar.f(new m.a("Camera is closed"));
            }
        }

        @Override // n0.u
        public void b(int i10, n0.e0 e0Var) {
            if (this.f37230a != null) {
                g0.r1.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f37230a.c(null);
            }
        }

        @Override // n0.u
        public void c(int i10, n0.w wVar) {
            c.a aVar = this.f37230a;
            if (aVar != null) {
                aVar.f(new l0.c(wVar));
            }
        }
    }

    public h4(y yVar, ScheduledExecutorService scheduledExecutorService, Executor executor, n0.k3 k3Var) {
        MeteringRectangle[] meteringRectangleArr = f37206x;
        this.f37222q = meteringRectangleArr;
        this.f37223r = meteringRectangleArr;
        this.f37224s = meteringRectangleArr;
        this.f37225t = null;
        this.f37226u = null;
        this.f37227v = false;
        this.f37228w = null;
        this.f37207a = yVar;
        this.b = executor;
        this.f37208c = scheduledExecutorService;
        this.f37211f = new d0.l(k3Var);
    }

    public static PointF C(g0.u1 u1Var, Rational rational, Rational rational2, int i10, d0.l lVar) {
        if (u1Var.b() != null) {
            rational2 = u1Var.b();
        }
        PointF a10 = lVar.a(u1Var, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a10.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a10.y) * (1.0f / doubleValue);
                return a10;
            }
            float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            a10.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a10.x) * (1.0f / doubleValue2);
        }
        return a10;
    }

    public static MeteringRectangle D(g0.u1 u1Var, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a10 = ((int) (u1Var.a() * rect.width())) / 2;
        int a11 = ((int) (u1Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a10, height - a11, width + a10, height + a11);
        rect2.left = I(rect2.left, rect.right, rect.left);
        rect2.right = I(rect2.right, rect.right, rect.left);
        rect2.top = I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    public static boolean H(g0.u1 u1Var) {
        return u1Var.c() >= 0.0f && u1Var.c() <= 1.0f && u1Var.d() >= 0.0f && u1Var.d() <= 1.0f;
    }

    public static int I(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    public static /* synthetic */ boolean a(h4 h4Var, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !y.e0(totalCaptureResult, j10)) {
            return false;
        }
        h4Var.t();
        return true;
    }

    public static /* synthetic */ void b(h4 h4Var, boolean z10, c.a aVar) {
        h4Var.f37207a.g0(h4Var.f37228w);
        h4Var.f37227v = z10;
        h4Var.w(aVar);
    }

    public static /* synthetic */ Object c(final h4 h4Var, final g0.m0 m0Var, final long j10, final c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.u3
            @Override // java.lang.Runnable
            public final void run() {
                h4.this.P(aVar, m0Var, j10);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ Object f(final h4 h4Var, final boolean z10, final c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.g4
            @Override // java.lang.Runnable
            public final void run() {
                h4.b(h4.this, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean h(h4 h4Var, long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        g0.r1.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != h4Var.f37227v || !y.e0(totalCaptureResult, j10)) {
            return false;
        }
        g0.r1.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object i(final h4 h4Var, final c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.v3
            @Override // java.lang.Runnable
            public final void run() {
                h4.this.R(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void j(h4 h4Var, long j10) {
        if (j10 == h4Var.f37216k) {
            h4Var.f37218m = false;
            h4Var.s(false);
        }
    }

    public static /* synthetic */ boolean k(h4 h4Var, boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (h4Var.M()) {
            if (!z10 || num == null) {
                h4Var.f37218m = true;
                h4Var.f37217l = true;
            } else if (h4Var.f37213h.intValue() == 3) {
                if (num.intValue() == 4) {
                    h4Var.f37218m = true;
                    h4Var.f37217l = true;
                } else if (num.intValue() == 5) {
                    h4Var.f37218m = false;
                    h4Var.f37217l = true;
                }
            }
        }
        if (h4Var.f37217l && y.e0(totalCaptureResult, j10)) {
            h4Var.s(h4Var.f37218m);
            return true;
        }
        if (!h4Var.f37213h.equals(num) && num != null) {
            h4Var.f37213h = num;
        }
        return false;
    }

    public static /* synthetic */ void l(h4 h4Var, long j10) {
        if (j10 == h4Var.f37216k) {
            h4Var.q();
        }
    }

    public int A() {
        return this.f37219n != 3 ? 4 : 3;
    }

    public final Rational B() {
        if (this.f37210e != null) {
            return this.f37210e;
        }
        Rect G = this.f37207a.G();
        return new Rational(G.width(), G.height());
    }

    public final List<MeteringRectangle> E(List<g0.u1> list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (g0.u1 u1Var : list) {
            if (arrayList.size() == i10) {
                break;
            }
            if (H(u1Var)) {
                MeteringRectangle D = D(u1Var, C(u1Var, rational2, rational, i11, this.f37211f), rect);
                if (D.getWidth() != 0 && D.getHeight() != 0) {
                    arrayList.add(D);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean F() {
        return this.f37207a.S(1) == 1;
    }

    public boolean G() {
        return this.f37227v;
    }

    public void J(boolean z10) {
        if (z10 == this.f37209d) {
            return;
        }
        this.f37209d = z10;
        if (this.f37209d) {
            return;
        }
        q();
    }

    public void K(Rational rational) {
        this.f37210e = rational;
    }

    public void L(int i10) {
        this.f37219n = i10;
    }

    public final boolean M() {
        return this.f37222q.length > 0;
    }

    public ne.x<g0.n0> N(g0.m0 m0Var) {
        return O(m0Var, 5000L);
    }

    public ne.x<g0.n0> O(final g0.m0 m0Var, final long j10) {
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.x3
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return h4.c(h4.this, m0Var, j10, aVar);
            }
        });
    }

    public void P(c.a<g0.n0> aVar, g0.m0 m0Var, long j10) {
        if (!this.f37209d) {
            aVar.f(new m.a("Camera is not active."));
            return;
        }
        Rect G = this.f37207a.G();
        Rational B = B();
        List<MeteringRectangle> E = E(m0Var.c(), this.f37207a.L(), B, G, 1);
        List<MeteringRectangle> E2 = E(m0Var.b(), this.f37207a.K(), B, G, 2);
        List<MeteringRectangle> E3 = E(m0Var.d(), this.f37207a.M(), B, G, 4);
        if (E.isEmpty() && E2.isEmpty() && E3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        y("Cancelled by another startFocusAndMetering()");
        z("Cancelled by another startFocusAndMetering()");
        u();
        this.f37225t = aVar;
        MeteringRectangle[] meteringRectangleArr = f37206x;
        x((MeteringRectangle[]) E.toArray(meteringRectangleArr), (MeteringRectangle[]) E2.toArray(meteringRectangleArr), (MeteringRectangle[]) E3.toArray(meteringRectangleArr), m0Var, j10);
    }

    public ne.x<Void> Q() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.f4
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return h4.i(h4.this, aVar);
            }
        });
    }

    public void R(c.a<Void> aVar) {
        g0.r1.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f37209d) {
            if (aVar != null) {
                aVar.f(new m.a("Camera is not active."));
                return;
            }
            return;
        }
        l1.a aVar2 = new l1.a();
        aVar2.v(this.f37219n);
        aVar2.w(true);
        a.C0666a c0666a = new a.C0666a();
        c0666a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0666a.b());
        aVar2.c(new b(aVar));
        this.f37207a.q0(Collections.singletonList(aVar2.h()));
    }

    public void S(c.a<n0.e0> aVar, boolean z10) {
        if (!this.f37209d) {
            if (aVar != null) {
                aVar.f(new m.a("Camera is not active."));
                return;
            }
            return;
        }
        l1.a aVar2 = new l1.a();
        aVar2.v(this.f37219n);
        aVar2.w(true);
        a.C0666a c0666a = new a.C0666a();
        c0666a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0666a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f37207a.Q(1)), n1.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0666a.b());
        aVar2.c(new a(aVar));
        this.f37207a.q0(Collections.singletonList(aVar2.h()));
    }

    public void n(a.C0666a c0666a) {
        int A = this.f37212g ? 1 : A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer valueOf = Integer.valueOf(this.f37207a.S(A));
        n1.c cVar = n1.c.REQUIRED;
        c0666a.g(key, valueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f37222q;
        if (meteringRectangleArr.length != 0) {
            c0666a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f37223r;
        if (meteringRectangleArr2.length != 0) {
            c0666a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f37224s;
        if (meteringRectangleArr3.length != 0) {
            c0666a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    public void o(boolean z10, boolean z11) {
        if (this.f37209d) {
            l1.a aVar = new l1.a();
            aVar.w(true);
            aVar.v(this.f37219n);
            a.C0666a c0666a = new a.C0666a();
            if (z10) {
                c0666a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0666a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0666a.b());
            this.f37207a.q0(Collections.singletonList(aVar.h()));
        }
    }

    public void p(c.a<Void> aVar) {
        z("Cancelled by another cancelFocusAndMetering()");
        y("Cancelled by cancelFocusAndMetering()");
        this.f37226u = aVar;
        u();
        r();
        if (M()) {
            o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f37206x;
        this.f37222q = meteringRectangleArr;
        this.f37223r = meteringRectangleArr;
        this.f37224s = meteringRectangleArr;
        this.f37212g = false;
        final long s02 = this.f37207a.s0();
        if (this.f37226u != null) {
            final int S = this.f37207a.S(A());
            y.c cVar = new y.c() { // from class: z.y3
                @Override // z.y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return h4.a(h4.this, S, s02, totalCaptureResult);
                }
            };
            this.f37221p = cVar;
            this.f37207a.B(cVar);
        }
    }

    public void q() {
        p(null);
    }

    public final void r() {
        ScheduledFuture<?> scheduledFuture = this.f37215j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f37215j = null;
        }
    }

    public void s(boolean z10) {
        r();
        c.a<g0.n0> aVar = this.f37225t;
        if (aVar != null) {
            aVar.c(g0.n0.a(z10));
            this.f37225t = null;
        }
    }

    public final void t() {
        c.a<Void> aVar = this.f37226u;
        if (aVar != null) {
            aVar.c(null);
            this.f37226u = null;
        }
    }

    public final void u() {
        ScheduledFuture<?> scheduledFuture = this.f37214i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f37214i = null;
        }
    }

    public ne.x<Void> v(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return r0.n.p(null);
        }
        if (this.f37207a.Q(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return r0.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.e4
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return h4.f(h4.this, z10, aVar);
            }
        });
    }

    public final void w(final c.a<Void> aVar) {
        if (!this.f37209d) {
            if (aVar != null) {
                aVar.f(new m.a("Camera is not active."));
            }
        } else {
            final long s02 = this.f37207a.s0();
            y.c cVar = new y.c() { // from class: z.w3
                @Override // z.y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return h4.h(h4.this, s02, aVar, totalCaptureResult);
                }
            };
            this.f37228w = cVar;
            this.f37207a.B(cVar);
        }
    }

    public final void x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, g0.m0 m0Var, long j10) {
        final long s02;
        this.f37207a.g0(this.f37220o);
        u();
        r();
        this.f37222q = meteringRectangleArr;
        this.f37223r = meteringRectangleArr2;
        this.f37224s = meteringRectangleArr3;
        if (M()) {
            this.f37212g = true;
            this.f37217l = false;
            this.f37218m = false;
            s02 = this.f37207a.s0();
            S(null, true);
        } else {
            this.f37212g = false;
            this.f37217l = true;
            this.f37218m = false;
            s02 = this.f37207a.s0();
        }
        this.f37213h = 0;
        final boolean F = F();
        y.c cVar = new y.c() { // from class: z.z3
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return h4.k(h4.this, F, s02, totalCaptureResult);
            }
        };
        this.f37220o = cVar;
        this.f37207a.B(cVar);
        final long j11 = this.f37216k + 1;
        this.f37216k = j11;
        Runnable runnable = new Runnable() { // from class: z.a4
            @Override // java.lang.Runnable
            public final void run() {
                r0.b.execute(new Runnable() { // from class: z.d4
                    @Override // java.lang.Runnable
                    public final void run() {
                        h4.j(h4.this, r2);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f37208c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37215j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (m0Var.e()) {
            this.f37214i = this.f37208c.schedule(new Runnable() { // from class: z.b4
                @Override // java.lang.Runnable
                public final void run() {
                    r0.b.execute(new Runnable() { // from class: z.c4
                        @Override // java.lang.Runnable
                        public final void run() {
                            h4.l(h4.this, r2);
                        }
                    });
                }
            }, m0Var.a(), timeUnit);
        }
    }

    public final void y(String str) {
        this.f37207a.g0(this.f37220o);
        c.a<g0.n0> aVar = this.f37225t;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f37225t = null;
        }
    }

    public final void z(String str) {
        this.f37207a.g0(this.f37221p);
        c.a<Void> aVar = this.f37226u;
        if (aVar != null) {
            aVar.f(new m.a(str));
            this.f37226u = null;
        }
    }
}
