package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import g0.j2;
import g0.v2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n0.t3;
import n0.u1;
import x0.n0;
import y1.c;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34929a;
    public final Matrix b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34930c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f34931d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34933f;

    /* renamed from: g, reason: collision with root package name */
    public final t3 f34934g;

    /* renamed from: h, reason: collision with root package name */
    public int f34935h;

    /* renamed from: i, reason: collision with root package name */
    public int f34936i;

    /* renamed from: k, reason: collision with root package name */
    public v2 f34938k;

    /* renamed from: l, reason: collision with root package name */
    public a f34939l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34937j = false;

    /* renamed from: m, reason: collision with root package name */
    public final Set<Runnable> f34940m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public boolean f34941n = false;

    /* renamed from: o, reason: collision with root package name */
    public final List<x2.a<v2.h>> f34942o = new ArrayList();

    public static class a extends u1 {

        /* renamed from: o, reason: collision with root package name */
        public final ne.x<Surface> f34943o;

        /* renamed from: p, reason: collision with root package name */
        public c.a<Surface> f34944p;

        /* renamed from: q, reason: collision with root package name */
        public u1 f34945q;

        /* renamed from: r, reason: collision with root package name */
        public q0 f34946r;

        public a(Size size, int i10) {
            super(size, i10);
            this.f34943o = y1.c.a(new c.InterfaceC0669c() { // from class: x0.l0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return n0.a.r(n0.a.this, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            q0 q0Var = aVar.f34946r;
            if (q0Var != null) {
                q0Var.f();
            }
            if (aVar.f34945q == null) {
                aVar.f34944p.d();
            }
            aVar.f34945q = null;
        }

        public static /* synthetic */ Object r(a aVar, c.a aVar2) {
            aVar.f34944p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // n0.u1
        public void d() {
            super.d();
            p0.z.e(new Runnable() { // from class: x0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.q(n0.a.this);
                }
            });
        }

        @Override // n0.u1
        public ne.x<Surface> o() {
            return this.f34943o;
        }

        public boolean s() {
            p0.z.b();
            return this.f34945q == null && !m();
        }

        public void t(q0 q0Var) {
            x2.g.j(this.f34946r == null, "Consumer can only be linked once.");
            this.f34946r = q0Var;
        }

        public boolean u(final u1 u1Var, Runnable runnable) {
            p0.z.b();
            x2.g.g(u1Var);
            u1 u1Var2 = this.f34945q;
            if (u1Var2 == u1Var) {
                return false;
            }
            x2.g.j(u1Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            x2.g.b(h().equals(u1Var.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), u1Var.h()));
            x2.g.b(i() == u1Var.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(u1Var.i())));
            x2.g.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f34945q = u1Var;
            r0.n.t(u1Var.j(), this.f34944p);
            u1Var.l();
            k().a(new Runnable() { // from class: x0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    u1.this.e();
                }
            }, q0.c.b());
            u1Var.f().a(runnable, q0.c.e());
            return true;
        }
    }

    public n0(int i10, int i11, t3 t3Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f34933f = i10;
        this.f34929a = i11;
        this.f34934g = t3Var;
        this.b = matrix;
        this.f34930c = z10;
        this.f34931d = rect;
        this.f34936i = i12;
        this.f34935h = i13;
        this.f34932e = z11;
        this.f34939l = new a(t3Var.f(), i11);
    }

    public static /* synthetic */ void a(final n0 n0Var) {
        n0Var.getClass();
        q0.c.e().execute(new Runnable() { // from class: x0.i0
            @Override // java.lang.Runnable
            public final void run() {
                n0.b(n0.this);
            }
        });
    }

    public static /* synthetic */ void b(n0 n0Var) {
        if (n0Var.f34941n) {
            return;
        }
        n0Var.v();
    }

    public static /* synthetic */ void c(n0 n0Var, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (n0Var.f34936i != i10) {
            n0Var.f34936i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n0Var.f34935h != i11) {
            n0Var.f34935h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            n0Var.x();
        }
    }

    public static /* synthetic */ ne.x d(n0 n0Var, final a aVar, int i10, j2.a aVar2, j2.a aVar3, Surface surface) {
        n0Var.getClass();
        x2.g.g(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, n0Var.t(), i10, n0Var.f34934g.f(), aVar2, aVar3, n0Var.b);
            q0Var.e().a(new Runnable() { // from class: x0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.this.e();
                }
            }, q0.c.b());
            aVar.t(q0Var);
            return r0.n.p(q0Var);
        } catch (u1.a e10) {
            return r0.n.n(e10);
        }
    }

    public void e(Runnable runnable) {
        p0.z.b();
        h();
        this.f34940m.add(runnable);
    }

    public void f(x2.a<v2.h> aVar) {
        x2.g.g(aVar);
        this.f34942o.add(aVar);
    }

    public final void g() {
        x2.g.j(!this.f34937j, "Consumer can only be linked once.");
        this.f34937j = true;
    }

    public final void h() {
        x2.g.j(!this.f34941n, "Edge is already closed.");
    }

    public final void i() {
        p0.z.b();
        this.f34939l.d();
        this.f34941n = true;
        this.f34942o.clear();
        this.f34940m.clear();
    }

    public ne.x<j2> j(final int i10, final j2.a aVar, final j2.a aVar2) {
        p0.z.b();
        h();
        g();
        final a aVar3 = this.f34939l;
        return r0.n.y(aVar3.j(), new r0.a() { // from class: x0.g0
            @Override // r0.a
            public final ne.x apply(Object obj) {
                return n0.d(n0.this, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, q0.c.e());
    }

    public v2 k(n0.p0 p0Var) {
        return l(p0Var, true);
    }

    public v2 l(n0.p0 p0Var, boolean z10) {
        p0.z.b();
        h();
        v2 v2Var = new v2(this.f34934g.f(), p0Var, z10, this.f34934g.b(), this.f34934g.g(), this.f34934g.c(), new Runnable() { // from class: x0.e0
            @Override // java.lang.Runnable
            public final void run() {
                n0.a(n0.this);
            }
        });
        try {
            final u1 n10 = v2Var.n();
            a aVar = this.f34939l;
            Objects.requireNonNull(aVar);
            if (aVar.u(n10, new d0(aVar))) {
                ne.x<Void> k10 = aVar.k();
                Objects.requireNonNull(n10);
                k10.a(new Runnable() { // from class: x0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u1.this.d();
                    }
                }, q0.c.b());
            }
            this.f34938k = v2Var;
            x();
            return v2Var;
        } catch (RuntimeException e10) {
            v2Var.z();
            throw e10;
        } catch (u1.a e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        }
    }

    public final void m() {
        p0.z.b();
        h();
        this.f34939l.d();
    }

    public Rect n() {
        return this.f34931d;
    }

    public u1 o() {
        p0.z.b();
        h();
        g();
        return this.f34939l;
    }

    public int p() {
        return this.f34929a;
    }

    public int q() {
        return this.f34936i;
    }

    public Matrix r() {
        return this.b;
    }

    public t3 s() {
        return this.f34934g;
    }

    public int t() {
        return this.f34933f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f34933f + ", format=" + this.f34929a + ", resolution=" + this.f34934g.f() + ", cropRect=" + this.f34931d + ", rotationDegrees=" + this.f34936i + ", mirroring=" + this.f34932e + ", sensorToBufferTransform= " + this.b + ", rotationInTransform= " + p0.a0.g(this.b) + ", isMirrorInTransform= " + p0.a0.l(this.b) + ", isClosed=" + this.f34941n + '}';
    }

    public boolean u() {
        return this.f34930c;
    }

    public void v() {
        p0.z.b();
        h();
        if (this.f34939l.s()) {
            return;
        }
        this.f34937j = false;
        this.f34939l.d();
        this.f34939l = new a(this.f34934g.f(), this.f34929a);
        Iterator<Runnable> it = this.f34940m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f34932e;
    }

    public final void x() {
        p0.z.b();
        v2.h g10 = v2.h.g(this.f34931d, this.f34936i, this.f34935h, u(), this.b, this.f34932e);
        v2 v2Var = this.f34938k;
        if (v2Var != null) {
            v2Var.y(g10);
        }
        Iterator<x2.a<v2.h>> it = this.f34942o.iterator();
        while (it.hasNext()) {
            it.next().accept(g10);
        }
    }

    public void y(u1 u1Var) {
        p0.z.b();
        h();
        a aVar = this.f34939l;
        Objects.requireNonNull(aVar);
        aVar.u(u1Var, new d0(aVar));
    }

    public void z(final int i10, final int i11) {
        p0.z.e(new Runnable() { // from class: x0.h0
            @Override // java.lang.Runnable
            public final void run() {
                n0.c(n0.this, i10, i11);
            }
        });
    }
}
