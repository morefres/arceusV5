package z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import g0.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n0.l1;
import y.a;
import y1.c;
import z.g1;
import z.y;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final y f37124a;
    public final d0.b0 b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37125c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.k3 f37126d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37127e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f37128f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37129g;

    /* renamed from: h, reason: collision with root package name */
    public int f37130h = 1;

    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final y f37131a;
        public final d0.n b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37132c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37133d = false;

        public a(y yVar, int i10, d0.n nVar) {
            this.f37131a = yVar;
            this.f37132c = i10;
            this.b = nVar;
        }

        public static /* synthetic */ Object e(a aVar, c.a aVar2) {
            aVar.f37131a.I().R(aVar2);
            aVar.b.b();
            return "AePreCapture";
        }

        @Override // z.g1.e
        public ne.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (this.f37131a.b0() || !g1.e(this.f37132c, totalCaptureResult)) {
                return r0.n.p(Boolean.FALSE);
            }
            g0.r1.a("Camera2CapturePipeline", "Trigger AE");
            this.f37133d = true;
            return r0.d.c(y1.c.a(new c.InterfaceC0669c() { // from class: z.e1
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return g1.a.e(g1.a.this, aVar);
                }
            })).f(new t.a() { // from class: z.f1
                @Override // t.a
                public final Object apply(Object obj) {
                    Boolean bool;
                    bool = Boolean.TRUE;
                    return bool;
                }
            }, q0.c.b());
        }

        @Override // z.g1.e
        public boolean b() {
            return this.f37132c == 0;
        }

        @Override // z.g1.e
        public void c() {
            if (this.f37133d) {
                g0.r1.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f37131a.I().o(false, true);
                this.b.a();
            }
        }
    }

    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final y f37134a;
        public boolean b = false;

        public b(y yVar) {
            this.f37134a = yVar;
        }

        @Override // z.g1.e
        public ne.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int intValue;
            ne.x<Boolean> p8 = r0.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
                g0.r1.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    g0.r1.a("Camera2CapturePipeline", "Trigger AF");
                    this.b = true;
                    this.f37134a.I().S(null, false);
                }
            }
            return p8;
        }

        @Override // z.g1.e
        public boolean b() {
            return true;
        }

        @Override // z.g1.e
        public void c() {
            if (this.b) {
                g0.r1.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f37134a.I().o(true, false);
            }
        }
    }

    public static class c implements m0.m {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f37135a;
        public final d b;

        /* renamed from: c, reason: collision with root package name */
        public int f37136c;

        public c(d dVar, Executor executor, int i10) {
            this.b = dVar;
            this.f37135a = executor;
            this.f37136c = i10;
        }

        public static /* synthetic */ Object c(c cVar, c.a aVar) {
            cVar.b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // m0.m
        public ne.x<Void> a() {
            g0.r1.a("Camera2CapturePipeline", "invokePreCapture");
            return r0.d.c(this.b.k(this.f37136c)).f(new t.a() { // from class: z.i1
                @Override // t.a
                public final Object apply(Object obj) {
                    return g1.c.d((TotalCaptureResult) obj);
                }
            }, this.f37135a);
        }

        @Override // m0.m
        public ne.x<Void> b() {
            return y1.c.a(new c.InterfaceC0669c() { // from class: z.h1
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return g1.c.c(g1.c.this, aVar);
                }
            });
        }
    }

    public static class d {

        /* renamed from: j, reason: collision with root package name */
        public static final long f37137j;

        /* renamed from: k, reason: collision with root package name */
        public static final long f37138k;

        /* renamed from: a, reason: collision with root package name */
        public final int f37139a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f37140c;

        /* renamed from: d, reason: collision with root package name */
        public final y f37141d;

        /* renamed from: e, reason: collision with root package name */
        public final d0.n f37142e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f37143f;

        /* renamed from: g, reason: collision with root package name */
        public long f37144g = f37137j;

        /* renamed from: h, reason: collision with root package name */
        public final List<e> f37145h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public final e f37146i = new a();

        public class a implements e {
            public a() {
            }

            @Override // z.g1.e
            public ne.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f37145h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return r0.n.x(r0.n.k(arrayList), new t.a() { // from class: z.p1
                    @Override // t.a
                    public final Object apply(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                        return valueOf;
                    }
                }, q0.c.b());
            }

            @Override // z.g1.e
            public boolean b() {
                Iterator<e> it = d.this.f37145h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // z.g1.e
            public void c() {
                Iterator<e> it = d.this.f37145h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        public class b extends n0.u {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.a f37148a;

            public b(c.a aVar) {
                this.f37148a = aVar;
            }

            @Override // n0.u
            public void a(int i10) {
                this.f37148a.f(new g0.h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // n0.u
            public void b(int i10, n0.e0 e0Var) {
                this.f37148a.c(null);
            }

            @Override // n0.u
            public void c(int i10, n0.w wVar) {
                this.f37148a.f(new g0.h1(2, "Capture request failed with reason " + wVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f37137j = timeUnit.toNanos(1L);
            f37138k = timeUnit.toNanos(5L);
        }

        public d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, y yVar, boolean z10, d0.n nVar) {
            this.f37139a = i10;
            this.b = executor;
            this.f37140c = scheduledExecutorService;
            this.f37141d = yVar;
            this.f37143f = z10;
            this.f37142e = nVar;
        }

        public static /* synthetic */ ne.x a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f37141d.b0() && g1.e(i10, totalCaptureResult)) {
                dVar.l(f37138k);
            }
            return dVar.f37146i.a(totalCaptureResult);
        }

        public static /* synthetic */ ne.x d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? g1.i(dVar.f37144g, dVar.f37140c, dVar.f37141d, new f.a() { // from class: z.o1
                @Override // z.g1.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean d10;
                    d10 = g1.d(totalCaptureResult, false);
                    return d10;
                }
            }) : r0.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, l1.a aVar, c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        public void f(e eVar) {
            this.f37145h.add(eVar);
        }

        public final void g(l1.a aVar) {
            a.C0666a c0666a = new a.C0666a();
            c0666a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0666a.b());
        }

        public final void h(l1.a aVar, n0.l1 l1Var) {
            int i10 = (this.f37139a != 3 || this.f37143f) ? (l1Var.k() == -1 || l1Var.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.v(i10);
            }
            g0.r1.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i10);
        }

        public ne.x<List<Void>> i(final List<n0.l1> list, final int i10) {
            r0.d g10 = r0.d.c(k(i10)).g(new r0.a() { // from class: z.j1
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x m10;
                    m10 = g1.d.this.m(list, i10);
                    return m10;
                }
            }, this.b);
            g10.a(new Runnable() { // from class: z.k1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.d.this.j();
                }
            }, this.b);
            return g10;
        }

        public void j() {
            this.f37146i.c();
        }

        public ne.x<TotalCaptureResult> k(final int i10) {
            ne.x<TotalCaptureResult> p8 = r0.n.p(null);
            if (this.f37145h.isEmpty()) {
                return p8;
            }
            return r0.d.c(this.f37146i.b() ? g1.j(this.f37141d, null) : r0.n.p(null)).g(new r0.a() { // from class: z.m1
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return g1.d.a(g1.d.this, i10, (TotalCaptureResult) obj);
                }
            }, this.b).g(new r0.a() { // from class: z.n1
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return g1.d.d(g1.d.this, (Boolean) obj);
                }
            }, this.b);
        }

        public final void l(long j10) {
            this.f37144g = j10;
        }

        public ne.x<List<Void>> m(List<n0.l1> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (n0.l1 l1Var : list) {
                final l1.a k10 = l1.a.k(l1Var);
                n0.e0 e0Var = null;
                if (l1Var.k() == 5 && !this.f37141d.X().h() && !this.f37141d.X().c()) {
                    androidx.camera.core.d f10 = this.f37141d.X().f();
                    if (f10 != null) {
                        if (this.f37141d.X().g(f10)) {
                            e0Var = n0.f0.a(f10.I2());
                        } else {
                            g0.r1.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (e0Var == null) {
                            f10.close();
                        }
                    } else {
                        g0.r1.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (e0Var != null) {
                    k10.p(e0Var);
                } else {
                    h(k10, l1Var);
                }
                if (this.f37142e.c(i10)) {
                    g(k10);
                }
                arrayList.add(y1.c.a(new c.InterfaceC0669c() { // from class: z.l1
                    @Override // y1.c.InterfaceC0669c
                    public final Object a(c.a aVar) {
                        return g1.d.e(g1.d.this, k10, aVar);
                    }
                }));
                arrayList2.add(k10.h());
            }
            this.f37141d.q0(arrayList2);
            return r0.n.k(arrayList);
        }
    }

    public interface e {
        ne.x<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class f implements y.c {

        /* renamed from: a, reason: collision with root package name */
        public c.a<TotalCaptureResult> f37149a;
        public final ne.x<TotalCaptureResult> b = y1.c.a(new c.InterfaceC0669c() { // from class: z.q1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g1.f.b(g1.f.this, aVar);
            }
        });

        /* renamed from: c, reason: collision with root package name */
        public final a f37150c;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f37150c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, c.a aVar) {
            fVar.f37149a = aVar;
            return "waitFor3AResult";
        }

        @Override // z.y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f37150c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f37149a.c(totalCaptureResult);
            return true;
        }

        public ne.x<TotalCaptureResult> c() {
            return this.b;
        }
    }

    public static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        public static final long f37151f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        public final y f37152a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f37153c;

        /* renamed from: d, reason: collision with root package name */
        public final f1.j f37154d;

        /* renamed from: e, reason: collision with root package name */
        public final d0.a0 f37155e;

        public g(y yVar, Executor executor, ScheduledExecutorService scheduledExecutorService, d0.a0 a0Var) {
            this.f37152a = yVar;
            this.b = executor;
            this.f37153c = scheduledExecutorService;
            this.f37155e = a0Var;
            f1.j N = yVar.N();
            Objects.requireNonNull(N);
            this.f37154d = N;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, c.a aVar) {
            gVar.getClass();
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f37154d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (f1.k) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ ne.x h(final g gVar, Void r12) {
            gVar.getClass();
            return y1.c.a(new c.InterfaceC0669c() { // from class: z.s1
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return g1.g.l(g1.g.this, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final c.a aVar) {
            gVar.getClass();
            q0.c.e().execute(new Runnable() { // from class: z.t1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.g.d(g1.g.this, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(c.a aVar) {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, c.a aVar) {
            if (!gVar.f37155e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f37152a.F(2);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new f1.k() { // from class: z.v1
                @Override // g0.f1.k
                public final void a() {
                    g1.g.k(c.a.this);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ ne.x p(g gVar, ne.x xVar, Object obj) {
            gVar.getClass();
            return r0.n.q(TimeUnit.SECONDS.toMillis(3L), gVar.f37153c, null, true, xVar);
        }

        @Override // z.g1.e
        public ne.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final ne.x a10 = y1.c.a(new c.InterfaceC0669c() { // from class: z.x1
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return g1.g.n(atomicReference, aVar);
                }
            });
            return r0.d.c(y1.c.a(new c.InterfaceC0669c() { // from class: z.y1
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return g1.g.j(g1.g.this, atomicReference, aVar);
                }
            })).g(new r0.a() { // from class: z.z1
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x v5;
                    v5 = g1.g.this.f37152a.I().v(true);
                    return v5;
                }
            }, this.b).g(new r0.a() { // from class: z.a2
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return g1.g.h(g1.g.this, (Void) obj);
                }
            }, this.b).g(new r0.a() { // from class: z.b2
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return g1.g.p(g1.g.this, a10, obj);
                }
            }, this.b).g(new r0.a() { // from class: z.c2
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x Q;
                    Q = g1.g.this.f37152a.I().Q();
                    return Q;
                }
            }, this.b).g(new r0.a() { // from class: z.d2
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    ne.x i10;
                    i10 = g1.i(g1.g.f37151f, r0.f37153c, g1.g.this.f37152a, new g1.f.a() { // from class: z.u1
                        @Override // z.g1.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            boolean d10;
                            d10 = g1.d(totalCaptureResult2, false);
                            return d10;
                        }
                    });
                    return i10;
                }
            }, this.b).f(new t.a() { // from class: z.e2
                @Override // t.a
                public final Object apply(Object obj) {
                    Boolean bool;
                    bool = Boolean.FALSE;
                    return bool;
                }
            }, q0.c.b());
        }

        @Override // z.g1.e
        public boolean b() {
            return false;
        }

        @Override // z.g1.e
        public void c() {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f37155e.a()) {
                this.f37152a.F(0);
            }
            this.f37152a.I().v(false).a(new Runnable() { // from class: z.r1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.b);
            this.f37152a.I().o(false, true);
            ScheduledExecutorService e10 = q0.c.e();
            final f1.j jVar = this.f37154d;
            Objects.requireNonNull(jVar);
            e10.execute(new Runnable() { // from class: z.w1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.j.this.clear();
                }
            });
        }
    }

    public static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        public static final long f37156g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        public final y f37157a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37158c = false;

        /* renamed from: d, reason: collision with root package name */
        public final Executor f37159d;

        /* renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f37160e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f37161f;

        public h(y yVar, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f37157a = yVar;
            this.b = i10;
            this.f37159d = executor;
            this.f37160e = scheduledExecutorService;
            this.f37161f = z10;
        }

        public static /* synthetic */ ne.x d(h hVar, Void r12) {
            return hVar.f37161f ? hVar.f37157a.I().Q() : r0.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, c.a aVar) {
            hVar.f37157a.U().e(aVar, 2);
            return "TorchOn";
        }

        @Override // z.g1.e
        public ne.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            g0.r1.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + g1.e(this.b, totalCaptureResult));
            if (g1.e(this.b, totalCaptureResult)) {
                if (this.f37157a.b0()) {
                    g0.r1.a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f37157a.f0()) {
                        g0.r1.a("Camera2CapturePipeline", "Turn on torch");
                        this.f37158c = true;
                        return r0.d.c(y1.c.a(new c.InterfaceC0669c() { // from class: z.f2
                            @Override // y1.c.InterfaceC0669c
                            public final Object a(c.a aVar) {
                                return g1.h.e(g1.h.this, aVar);
                            }
                        })).g(new r0.a() { // from class: z.g2
                            @Override // r0.a
                            public final ne.x apply(Object obj) {
                                return g1.h.d(g1.h.this, (Void) obj);
                            }
                        }, this.f37159d).g(new r0.a() { // from class: z.h2
                            @Override // r0.a
                            public final ne.x apply(Object obj) {
                                ne.x i10;
                                i10 = g1.i(g1.h.f37156g, r0.f37160e, g1.h.this.f37157a, new g1.f.a() { // from class: z.j2
                                    @Override // z.g1.f.a
                                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                        boolean d10;
                                        d10 = g1.d(totalCaptureResult2, true);
                                        return d10;
                                    }
                                });
                                return i10;
                            }
                        }, this.f37159d).f(new t.a() { // from class: z.i2
                            @Override // t.a
                            public final Object apply(Object obj) {
                                Boolean bool;
                                bool = Boolean.FALSE;
                                return bool;
                            }
                        }, q0.c.b());
                    }
                    g0.r1.a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return r0.n.p(Boolean.FALSE);
        }

        @Override // z.g1.e
        public boolean b() {
            return this.b == 0;
        }

        @Override // z.g1.e
        public void c() {
            if (this.f37158c) {
                this.f37157a.U().e(null, 0);
                g0.r1.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f37161f) {
                    this.f37157a.I().o(false, true);
                }
            }
        }
    }

    public g1(y yVar, a0.c0 c0Var, n0.k3 k3Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f37124a = yVar;
        Integer num = (Integer) c0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f37129g = num != null && num.intValue() == 2;
        this.f37127e = executor;
        this.f37128f = scheduledExecutorService;
        this.f37126d = k3Var;
        this.b = new d0.b0(k3Var);
        this.f37125c = d0.g.a(new d1(c0Var));
    }

    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return n0.q1.a(new z.h(totalCaptureResult), z10);
    }

    public static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        g0.r1.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        g0.r1.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    public static ne.x<TotalCaptureResult> i(long j10, ScheduledExecutorService scheduledExecutorService, y yVar, f.a aVar) {
        return r0.n.q(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(yVar, aVar));
    }

    public static ne.x<TotalCaptureResult> j(final y yVar, f.a aVar) {
        final f fVar = new f(aVar);
        yVar.B(fVar);
        ne.x<TotalCaptureResult> c10 = fVar.c();
        c10.a(new Runnable() { // from class: z.c1
            @Override // java.lang.Runnable
            public final void run() {
                y.this.g0(fVar);
            }
        }, yVar.f37546c);
        return c10;
    }

    public d b(int i10, int i11, int i12) {
        int i13;
        d0.n nVar = new d0.n(this.f37126d);
        d dVar = new d(this.f37130h, this.f37127e, this.f37128f, this.f37124a, this.f37129g, nVar);
        if (i10 == 0) {
            dVar.f(new b(this.f37124a));
        }
        if (i11 == 3) {
            dVar.f(new g(this.f37124a, this.f37127e, this.f37128f, new d0.a0(this.f37126d)));
        } else if (this.f37125c) {
            if (f(i12)) {
                i13 = i11;
                dVar.f(new h(this.f37124a, i13, this.f37127e, this.f37128f, (this.b.a() || this.f37124a.a0()) ? false : true));
            } else {
                i13 = i11;
                dVar.f(new a(this.f37124a, i13, nVar));
            }
            g0.r1.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f37145h);
            return dVar;
        }
        i13 = i11;
        g0.r1.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f37145h);
        return dVar;
    }

    public m0.m c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f37127e, i11);
    }

    public final boolean f(int i10) {
        return this.b.a() || this.f37130h == 3 || i10 == 1;
    }

    public void g(int i10) {
        this.f37130h = i10;
    }

    public ne.x<List<Void>> h(List<n0.l1> list, int i10, int i11, int i12) {
        return r0.n.s(b(i10, i11, i12).i(list, i11));
    }
}
