package g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import g0.v2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n0.t3;
import n0.u1;
import y1.c;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: q, reason: collision with root package name */
    public static final Range<Integer> f17996q = t3.f25564a;

    /* renamed from: a, reason: collision with root package name */
    public final Object f17997a = new Object();
    public final Size b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f17998c;

    /* renamed from: d, reason: collision with root package name */
    public final Range<Integer> f17999d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.p0 f18000e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18001f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18002g;

    /* renamed from: h, reason: collision with root package name */
    public final ne.x<Surface> f18003h;

    /* renamed from: i, reason: collision with root package name */
    public final c.a<Surface> f18004i;

    /* renamed from: j, reason: collision with root package name */
    public final ne.x<Void> f18005j;

    /* renamed from: k, reason: collision with root package name */
    public final c.a<Void> f18006k;

    /* renamed from: l, reason: collision with root package name */
    public final c.a<Void> f18007l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.u1 f18008m;

    /* renamed from: n, reason: collision with root package name */
    public h f18009n;

    /* renamed from: o, reason: collision with root package name */
    public i f18010o;

    /* renamed from: p, reason: collision with root package name */
    public Executor f18011p;

    public class a implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f18012a;
        public final /* synthetic */ ne.x b;

        public a(c.a aVar, ne.x xVar) {
            this.f18012a = aVar;
            this.b = xVar;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            x2.g.i(this.f18012a.c(null));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof f) {
                x2.g.i(this.b.cancel(false));
            } else {
                x2.g.i(this.f18012a.c(null));
            }
        }
    }

    public class b extends n0.u1 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // n0.u1
        public ne.x<Surface> o() {
            return v2.this.f18003h;
        }
    }

    public class c implements r0.c<Surface> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ne.x f18015a;
        public final /* synthetic */ c.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18016c;

        public c(ne.x xVar, c.a aVar, String str) {
            this.f18015a = xVar;
            this.b = aVar;
            this.f18016c = str;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            r0.n.t(this.f18015a, this.b);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.b.c(null);
                return;
            }
            x2.g.i(this.b.f(new f(this.f18016c + " cancelled.", th2)));
        }
    }

    public class d implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f18018a;
        public final /* synthetic */ Surface b;

        public d(x2.a aVar, Surface surface) {
            this.f18018a = aVar;
            this.b = surface;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f18018a.accept(g.c(0, this.b));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f18018a.accept(g.c(1, this.b));
        }
    }

    public class e implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f18020a;

        public e(Runnable runnable) {
            this.f18020a = runnable;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f18020a.run();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
        }
    }

    public static final class f extends RuntimeException {
        public f(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static abstract class g {
        public static g c(int i10, Surface surface) {
            return new j(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new k(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public v2(Size size, n0.p0 p0Var, boolean z10, k0 k0Var, int i10, Range<Integer> range, Runnable runnable) {
        this.b = size;
        this.f18000e = p0Var;
        this.f18001f = z10;
        x2.g.b(k0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f17998c = k0Var;
        this.f18002g = i10;
        this.f17999d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ne.x a10 = y1.c.a(new c.InterfaceC0669c() { // from class: g0.m2
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return v2.a(atomicReference, str, aVar);
            }
        });
        c.a<Void> aVar = (c.a) x2.g.g((c.a) atomicReference.get());
        this.f18007l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ne.x<Void> a11 = y1.c.a(new c.InterfaceC0669c() { // from class: g0.n2
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar2) {
                return v2.j(atomicReference2, str, aVar2);
            }
        });
        this.f18005j = a11;
        r0.n.j(a11, new a(aVar, a10), q0.c.b());
        c.a aVar2 = (c.a) x2.g.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ne.x<Surface> a12 = y1.c.a(new c.InterfaceC0669c() { // from class: g0.o2
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar3) {
                return v2.c(atomicReference3, str, aVar3);
            }
        });
        this.f18003h = a12;
        this.f18004i = (c.a) x2.g.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f18008m = bVar;
        ne.x<Void> k10 = bVar.k();
        r0.n.j(a12, new c(k10, aVar2, str), q0.c.b());
        k10.a(new Runnable() { // from class: g0.p2
            @Override // java.lang.Runnable
            public final void run() {
                v2.this.f18003h.cancel(true);
            }
        }, q0.c.b());
        this.f18006k = s(q0.c.b(), runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(v2 v2Var, AtomicReference atomicReference, c.a aVar) {
        v2Var.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + v2Var.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    @SuppressLint({"PairedRegistration"})
    public void k(Executor executor, Runnable runnable) {
        this.f18007l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f17997a) {
            this.f18010o = null;
            this.f18011p = null;
        }
    }

    public n0.p0 m() {
        return this.f18000e;
    }

    public n0.u1 n() {
        return this.f18008m;
    }

    public k0 o() {
        return this.f17998c;
    }

    public Range<Integer> p() {
        return this.f17999d;
    }

    public Size q() {
        return this.b;
    }

    public int r() {
        return this.f18002g;
    }

    public final c.a<Void> s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        r0.n.j(y1.c.a(new c.InterfaceC0669c() { // from class: g0.r2
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return v2.g(v2.this, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) x2.g.g((c.a) atomicReference.get());
    }

    public boolean t() {
        z();
        return this.f18006k.c(null);
    }

    public boolean u() {
        return this.f18001f;
    }

    public boolean v() {
        return this.f18003h.isDone();
    }

    public void w(final Surface surface, Executor executor, final x2.a<g> aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: g0.s2
                @Override // java.lang.Runnable
                public final void run() {
                    x2.a.this.accept(v2.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f18004i.c(surface) || this.f18003h.isCancelled()) {
            r0.n.j(this.f18005j, new d(aVar, surface), executor);
            return;
        }
        x2.g.i(this.f18003h.isDone());
        try {
            this.f18003h.get();
            executor.execute(new Runnable() { // from class: g0.t2
                @Override // java.lang.Runnable
                public final void run() {
                    x2.a.this.accept(v2.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: g0.u2
                @Override // java.lang.Runnable
                public final void run() {
                    x2.a.this.accept(v2.g.c(4, surface));
                }
            });
        }
    }

    public void x(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f17997a) {
            this.f18010o = iVar;
            this.f18011p = executor;
            hVar = this.f18009n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: g0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    v2.i.this.a(hVar);
                }
            });
        }
    }

    public void y(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f17997a) {
            this.f18009n = hVar;
            iVar = this.f18010o;
            executor = this.f18011p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: g0.l2
            @Override // java.lang.Runnable
            public final void run() {
                v2.i.this.a(hVar);
            }
        });
    }

    public boolean z() {
        return this.f18004i.f(new u1.b("Surface request will not complete."));
    }
}
