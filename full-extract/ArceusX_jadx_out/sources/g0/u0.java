package g0;

import a1.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import g0.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c3;
import n0.i2;
import n0.i4;
import n0.j4;
import n0.n1;
import n0.o3;
import n0.t3;

/* loaded from: classes.dex */
public final class u0 extends w2 {
    public static final d B = new d();
    public static final Boolean C = null;
    public o3.c A;

    /* renamed from: s, reason: collision with root package name */
    public final Object f17969s;

    /* renamed from: t, reason: collision with root package name */
    public x0 f17970t;

    /* renamed from: u, reason: collision with root package name */
    public Executor f17971u;

    /* renamed from: v, reason: collision with root package name */
    public a f17972v;

    /* renamed from: w, reason: collision with root package name */
    public Rect f17973w;

    /* renamed from: x, reason: collision with root package name */
    public Matrix f17974x;

    /* renamed from: y, reason: collision with root package name */
    public o3.b f17975y;

    /* renamed from: z, reason: collision with root package name */
    public n0.u1 f17976z;

    public interface a {
        default Size c() {
            return null;
        }

        default int d() {
            return 0;
        }

        default void e(Matrix matrix) {
        }

        void k(androidx.camera.core.d dVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements i2.a<c>, i4.b<u0, n0.f2, c> {

        /* renamed from: a, reason: collision with root package name */
        public final n0.x2 f17977a;

        public c() {
            this(n0.x2.k0());
        }

        public static c g(n0.n1 n1Var) {
            return new c(n0.x2.l0(n1Var));
        }

        @Override // g0.l0
        public n0.w2 a() {
            return this.f17977a;
        }

        public u0 f() {
            n0.f2 e10 = e();
            n0.i2.Y(e10);
            return new u0(e10);
        }

        @Override // n0.i4.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public n0.f2 e() {
            return new n0.f2(c3.j0(this.f17977a));
        }

        public c i(Executor executor) {
            a().G(s0.r.O, executor);
            return this;
        }

        public c j(int i10) {
            a().G(n0.f2.Q, Integer.valueOf(i10));
            return this;
        }

        public c k(j4.b bVar) {
            a().G(i4.G, bVar);
            return this;
        }

        public c l(Size size) {
            a().G(n0.i2.f25392r, size);
            return this;
        }

        public c m(k0 k0Var) {
            if (!Objects.equals(k0.f17922d, k0Var)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().G(n0.h2.f25375l, k0Var);
            return this;
        }

        public c n(int i10) {
            a().G(n0.f2.R, Integer.valueOf(i10));
            return this;
        }

        public c o(int i10) {
            a().G(n0.f2.T, Integer.valueOf(i10));
            return this;
        }

        @Override // n0.i2.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public c b(a1.c cVar) {
            a().G(n0.i2.f25395u, cVar);
            return this;
        }

        public c q(int i10) {
            a().G(i4.A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public c r(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().G(n0.i2.f25387m, Integer.valueOf(i10));
            return this;
        }

        public c s(Class<u0> cls) {
            a().G(s0.q.N, cls);
            if (a().h(s0.q.M, null) == null) {
                t(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c t(String str) {
            a().G(s0.q.M, str);
            return this;
        }

        @Override // n0.i2.a
        @Deprecated
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public c d(Size size) {
            a().G(n0.i2.f25391q, size);
            return this;
        }

        @Override // n0.i2.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c c(int i10) {
            a().G(n0.i2.f25388n, Integer.valueOf(i10));
            return this;
        }

        public c(n0.x2 x2Var) {
            this.f17977a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(u0.class)) {
                k(j4.b.IMAGE_ANALYSIS);
                s(u0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Size f17978a;
        public static final k0 b;

        /* renamed from: c, reason: collision with root package name */
        public static final a1.c f17979c;

        /* renamed from: d, reason: collision with root package name */
        public static final n0.f2 f17980d;

        static {
            Size size = new Size(640, 480);
            f17978a = size;
            k0 k0Var = k0.f17922d;
            b = k0Var;
            a1.c a10 = new c.a().d(a1.a.f68c).f(new a1.d(w0.d.f33613c, 1)).a();
            f17979c = a10;
            f17980d = new c().l(size).q(1).r(0).b(a10).m(k0Var).e();
        }

        public n0.f2 a() {
            return f17980d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public u0(n0.f2 f2Var) {
        super(f2Var);
        this.f17969s = new Object();
    }

    public static /* synthetic */ void g0(androidx.camera.core.f fVar, androidx.camera.core.f fVar2) {
        fVar.j();
        if (fVar2 != null) {
            fVar2.j();
        }
    }

    public static /* synthetic */ void h0(u0 u0Var, x0 x0Var, o3 o3Var, o3.g gVar) {
        List<o3> a10;
        if (u0Var.i() == null) {
            return;
        }
        u0Var.k0();
        x0Var.f();
        o3.b l02 = u0Var.l0(u0Var.k(), (n0.f2) u0Var.l(), (t3) x2.g.g(u0Var.g()));
        u0Var.f17975y = l02;
        a10 = o0.a(new Object[]{l02.p()});
        u0Var.d0(a10);
        u0Var.L();
    }

    public static /* synthetic */ List j0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n0.n1 n1Var) {
        return c.g(n1Var);
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [n0.i4, n0.i4<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [n0.i4, n0.l3] */
    /* JADX WARN: Type inference failed for: r6v6, types: [n0.i4, n0.l3] */
    /* JADX WARN: Type inference failed for: r6v8, types: [n0.i4, n0.i4<?>] */
    @Override // g0.w2
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        final Size c10;
        synchronized (this.f17969s) {
            try {
                a aVar = this.f17972v;
                c10 = aVar != null ? aVar.c() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c10 == null) {
            return bVar.e();
        }
        if (o0Var.w(((Integer) bVar.a().h(n0.i2.f25388n, 0)).intValue()) % 180 == 90) {
            c10 = new Size(c10.getHeight(), c10.getWidth());
        }
        ?? e10 = bVar.e();
        n1.a<Size> aVar2 = n0.i2.f25391q;
        if (!e10.a(aVar2)) {
            bVar.a().G(aVar2, c10);
        }
        ?? e11 = bVar.e();
        n1.a aVar3 = n0.i2.f25395u;
        if (e11.a(aVar3)) {
            a1.c cVar = (a1.c) e().h(aVar3, null);
            c.a aVar4 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new a1.d(c10, 1));
            }
            if (cVar == null) {
                aVar4.e(new a1.b() { // from class: g0.t0
                    @Override // a1.b
                    public final List a(List list, int i10) {
                        return u0.j0(c10, list, i10);
                    }
                });
            }
            bVar.a().G(aVar3, aVar4.a());
        }
        return bVar.e();
    }

    @Override // g0.w2
    public t3 T(n0.n1 n1Var) {
        List<o3> a10;
        this.f17975y.g(n1Var);
        a10 = o0.a(new Object[]{this.f17975y.p()});
        d0(a10);
        return g().i().d(n1Var).a();
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        List<o3> a10;
        r1.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        o3.b l02 = l0(k(), (n0.f2) l(), t3Var);
        this.f17975y = l02;
        a10 = o0.a(new Object[]{l02.p()});
        d0(a10);
        return t3Var;
    }

    @Override // g0.w2
    public void V() {
        k0();
        synchronized (this.f17969s) {
            this.f17970t.i();
            this.f17970t = null;
        }
    }

    @Override // g0.w2
    public void Z(Matrix matrix) {
        super.Z(matrix);
        synchronized (this.f17969s) {
            try {
                x0 x0Var = this.f17970t;
                if (x0Var != null) {
                    x0Var.u(matrix);
                }
                this.f17974x = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.w2
    public void b0(Rect rect) {
        super.b0(rect);
        synchronized (this.f17969s) {
            try {
                x0 x0Var = this.f17970t;
                if (x0Var != null) {
                    x0Var.v(rect);
                }
                this.f17973w = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k0() {
        p0.z.b();
        o3.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
            this.A = null;
        }
        n0.u1 u1Var = this.f17976z;
        if (u1Var != null) {
            u1Var.d();
            this.f17976z = null;
        }
    }

    public o3.b l0(String str, n0.f2 f2Var, t3 t3Var) {
        final x0 x0Var;
        p0.z.b();
        Size f10 = t3Var.f();
        Executor executor = (Executor) x2.g.g(f2Var.e0(q0.c.c()));
        boolean z10 = true;
        int n02 = m0() == 1 ? n0() : 4;
        final androidx.camera.core.f fVar = f2Var.j0() != null ? new androidx.camera.core.f(f2Var.j0().a(f10.getWidth(), f10.getHeight(), p(), n02, 0L)) : new androidx.camera.core.f(n1.a(f10.getWidth(), f10.getHeight(), p(), n02));
        synchronized (this.f17969s) {
            s0();
            x0Var = this.f17970t;
        }
        boolean q02 = i() != null ? q0(i()) : false;
        int height = q02 ? f10.getHeight() : f10.getWidth();
        int width = q02 ? f10.getWidth() : f10.getHeight();
        int i10 = p0() == 2 ? 1 : 35;
        boolean z11 = p() == 35 && p0() == 2;
        boolean z12 = p() == 35 && p0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(o0()))) {
            z10 = false;
        }
        final androidx.camera.core.f fVar2 = (z11 || (z10 && !z12)) ? new androidx.camera.core.f(n1.a(height, width, i10, fVar.e())) : null;
        if (fVar2 != null) {
            x0Var.s(fVar2);
        }
        v0();
        fVar.f(x0Var, executor);
        o3.b r8 = o3.b.r(f2Var, t3Var.f());
        if (t3Var.d() != null) {
            r8.g(t3Var.d());
        }
        n0.u1 u1Var = this.f17976z;
        if (u1Var != null) {
            u1Var.d();
        }
        n0.k2 k2Var = new n0.k2(fVar.getSurface(), f10, p());
        this.f17976z = k2Var;
        k2Var.k().a(new Runnable() { // from class: g0.q0
            @Override // java.lang.Runnable
            public final void run() {
                u0.g0(androidx.camera.core.f.this, fVar2);
            }
        }, q0.c.e());
        r8.A(t3Var.g());
        b(r8, t3Var);
        r8.n(this.f17976z, t3Var.b(), null, -1);
        o3.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: g0.r0
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                u0.h0(u0.this, x0Var, o3Var, gVar);
            }
        });
        this.A = cVar2;
        r8.u(cVar2);
        return r8;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [n0.i4, n0.i4<?>] */
    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        d dVar = B;
        n0.n1 a10 = j4Var.a(dVar.a().X(), 1);
        if (z10) {
            a10 = n0.n1.L(a10, dVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return D(a10).e();
    }

    public int m0() {
        return ((n0.f2) l()).h0(0);
    }

    public int n0() {
        return ((n0.f2) l()).i0(6);
    }

    public Boolean o0() {
        return ((n0.f2) l()).k0(C);
    }

    public int p0() {
        return ((n0.f2) l()).l0(1);
    }

    public final boolean q0(n0.p0 p0Var) {
        return r0() && t(p0Var) % 180 != 0;
    }

    public boolean r0() {
        return ((n0.f2) l()).m0(Boolean.FALSE).booleanValue();
    }

    public final void s0() {
        a aVar;
        synchronized (this.f17969s) {
            try {
                n0.f2 f2Var = (n0.f2) l();
                if (f2Var.h0(0) == 1) {
                    this.f17970t = new y0();
                } else {
                    this.f17970t = new androidx.camera.core.c(f2Var.e0(q0.c.c()));
                }
                this.f17970t.q(p0());
                this.f17970t.r(r0());
                n0.p0 i10 = i();
                Boolean o02 = o0();
                boolean a10 = i10 != null ? i10.k().l().a(OnePixelShiftQuirk.class) : false;
                x0 x0Var = this.f17970t;
                if (o02 != null) {
                    a10 = o02.booleanValue();
                }
                x0Var.p(a10);
                if (i10 != null) {
                    this.f17970t.t(t(i10));
                }
                Rect rect = this.f17973w;
                if (rect != null) {
                    this.f17970t.v(rect);
                }
                Matrix matrix = this.f17974x;
                if (matrix != null) {
                    this.f17970t.u(matrix);
                }
                Executor executor = this.f17971u;
                if (executor != null && (aVar = this.f17972v) != null) {
                    this.f17970t.o(executor, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t0(Executor executor, final a aVar) {
        synchronized (this.f17969s) {
            try {
                x0 x0Var = this.f17970t;
                if (x0Var != null) {
                    x0Var.o(executor, new a() { // from class: g0.s0
                        @Override // g0.u0.a
                        public final void k(androidx.camera.core.d dVar) {
                            u0.a.this.k(dVar);
                        }
                    });
                }
                if (this.f17972v == null) {
                    J();
                }
                this.f17971u = executor;
                this.f17972v = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }

    public void u0(int i10) {
        if (a0(i10)) {
            v0();
        }
    }

    public final void v0() {
        synchronized (this.f17969s) {
            try {
                n0.p0 i10 = i();
                if (i10 != null) {
                    this.f17970t.t(t(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
