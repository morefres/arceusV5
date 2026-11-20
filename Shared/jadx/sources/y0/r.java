package y0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import g0.j2;
import g0.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import n0.p0;
import p0.a0;
import p0.z;
import x0.n0;
import x0.r0;
import x0.z0;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f36229a;
    public final p0 b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f36230c;

    /* renamed from: d, reason: collision with root package name */
    public c f36231d;

    /* renamed from: e, reason: collision with root package name */
    public b f36232e;

    public class a implements r0.c<j2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f36233a;

        public a(n0 n0Var) {
            this.f36233a = n0Var;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(j2 j2Var) {
            x2.g.g(j2Var);
            r.this.f36229a.d(j2Var);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (this.f36233a.t() == 2 && (th2 instanceof CancellationException)) {
                r1.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            r1.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.b(this.f36233a.t()), th2);
        }
    }

    public static abstract class b {
        public static b d(n0 n0Var, n0 n0Var2, List<d> list) {
            return new y0.b(n0Var, n0Var2, list);
        }

        public abstract List<d> a();

        public abstract n0 b();

        public abstract n0 c();
    }

    public static class c extends HashMap<d, n0> {
    }

    public r(p0 p0Var, p0 p0Var2, r0 r0Var) {
        this.b = p0Var;
        this.f36230c = p0Var2;
        this.f36229a = r0Var;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f36231d;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public final void c(p0 p0Var, p0 p0Var2, n0 n0Var, n0 n0Var2, Map.Entry<d, n0> entry) {
        n0 value = entry.getValue();
        r1.a("DualSurfaceProcessorNode", "     -> outputEdge = " + value);
        Size f10 = n0Var.s().f();
        Rect a10 = entry.getKey().a().a();
        if (!n0Var.u()) {
            p0Var = null;
        }
        j2.a f11 = j2.a.f(f10, a10, p0Var, entry.getKey().a().c(), entry.getKey().a().g());
        Size f12 = n0Var2.s().f();
        Rect a11 = entry.getKey().b().a();
        if (!n0Var2.u()) {
            p0Var2 = null;
        }
        r0.n.j(value.j(entry.getKey().a().b(), f11, j2.a.f(f12, a11, p0Var2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), q0.c.e());
    }

    public void d() {
        this.f36229a.a();
        z.e(new Runnable() { // from class: y0.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this);
            }
        });
    }

    public final void e(p0 p0Var, p0 p0Var2, n0 n0Var, n0 n0Var2, Map<d, n0> map) {
        for (final Map.Entry<d, n0> entry : map.entrySet()) {
            final p0 p0Var3 = p0Var;
            final p0 p0Var4 = p0Var2;
            final n0 n0Var3 = n0Var;
            final n0 n0Var4 = n0Var2;
            c(p0Var3, p0Var4, n0Var3, n0Var4, entry);
            entry.getValue().e(new Runnable() { // from class: y0.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.this.c(p0Var3, p0Var4, n0Var3, n0Var4, entry);
                }
            });
            p0Var = p0Var3;
            p0Var2 = p0Var4;
            n0Var = n0Var3;
            n0Var2 = n0Var4;
        }
    }

    public final void f(p0 p0Var, n0 n0Var, boolean z10) {
        this.f36229a.b(n0Var.l(p0Var, z10));
    }

    public c g(b bVar) {
        z.b();
        r1.a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f36229a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator<d> it = bVar.a().iterator();
        while (it.hasNext()) {
            r1.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f36232e = bVar;
        this.f36231d = new c();
        n0 b10 = this.f36232e.b();
        n0 c10 = this.f36232e.c();
        for (d dVar : this.f36232e.a()) {
            this.f36231d.put(dVar, h(b10, dVar.a()));
        }
        f(this.b, b10, true);
        f(this.f36230c, c10, false);
        e(this.b, this.f36230c, b10, c10, this.f36231d);
        return this.f36231d;
    }

    public final n0 h(n0 n0Var, z0.f fVar) {
        Rect a10 = fVar.a();
        int c10 = fVar.c();
        boolean g10 = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        matrix.postConcat(a0.e(new RectF(a10), a0.t(fVar.d()), c10, g10));
        x2.g.a(a0.j(a0.f(a10, c10), fVar.d()));
        Rect r8 = a0.r(fVar.d());
        return new n0(fVar.e(), fVar.b(), n0Var.s().i().f(fVar.d()).a(), matrix, false, r8, n0Var.q() - c10, -1, n0Var.w() != g10);
    }
}
