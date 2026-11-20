package m0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.b1;
import m0.x;
import n0.g2;
import n0.h2;
import n0.l1;
import n0.m1;
import n0.o3;
import n0.u1;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static int f23937f;

    /* renamed from: g, reason: collision with root package name */
    public static final v0.b f23938g = new v0.b();

    /* renamed from: a, reason: collision with root package name */
    public final g2 f23939a;
    public final n0.l1 b;

    /* renamed from: c, reason: collision with root package name */
    public final x f23940c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f23941d;

    /* renamed from: e, reason: collision with root package name */
    public final x.c f23942e;

    public d0(g2 g2Var, Size size, CameraCharacteristics cameraCharacteristics, g0.n nVar, boolean z10, k0 k0Var) {
        p0.z.b();
        this.f23939a = g2Var;
        this.b = l1.a.j(g2Var).h();
        x xVar = new x();
        this.f23940c = xVar;
        Executor m02 = g2Var.m0(q0.c.d());
        Objects.requireNonNull(m02);
        u0 u0Var = new u0(m02, cameraCharacteristics, nVar != null ? new x0.y(nVar) : null);
        this.f23941d = u0Var;
        ArrayList arrayList = new ArrayList();
        if (g2Var.Z() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        x.c n10 = x.c.n(size, g2Var.p(), arrayList, z10, g2Var.l0(), k0Var);
        this.f23942e = n10;
        u0Var.r(xVar.s(n10));
    }

    public void a() {
        p0.z.b();
        this.f23940c.n();
        this.f23941d.n();
    }

    public final n b(int i10, n0.k1 k1Var, l1 l1Var, a1 a1Var) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(k1Var.hashCode());
        List<m1> a10 = k1Var.a();
        Objects.requireNonNull(a10);
        for (m1 m1Var : a10) {
            l1.a aVar = new l1.a();
            aVar.v(this.b.k());
            aVar.e(this.b.g());
            aVar.a(l1Var.q());
            aVar.f(this.f23942e.l());
            if (this.f23942e.e().size() > 1 && this.f23942e.j() != null) {
                aVar.f(this.f23942e.j());
            }
            boolean l10 = l();
            if (l10) {
                u1 g10 = this.f23942e.g();
                Objects.requireNonNull(g10);
                aVar.f(g10);
            }
            aVar.t(l10);
            if (w0.b.j(this.f23942e.d()) || w0.b.k(this.f23942e.d())) {
                if (f23938g.a()) {
                    aVar.d(n0.l1.f25431i, Integer.valueOf(l1Var.n()));
                }
                aVar.d(n0.l1.f25432j, Integer.valueOf(g(l1Var)));
            }
            aVar.e(m1Var.a().g());
            aVar.g(valueOf, Integer.valueOf(m1Var.getId()));
            aVar.r(i10);
            aVar.c(this.f23942e.a());
            if (this.f23942e.e().size() > 1 && this.f23942e.i() != null) {
                aVar.c(this.f23942e.i());
            }
            arrayList.add(aVar.h());
        }
        return new n(arrayList, a1Var);
    }

    public final n0.k1 c() {
        n0.k1 h02 = this.f23939a.h0(g0.h0.b());
        Objects.requireNonNull(h02);
        return h02;
    }

    public final v0 d(int i10, n0.k1 k1Var, l1 l1Var, a1 a1Var, ne.x<Void> xVar) {
        return new v0(k1Var, l1Var, a1Var, xVar, i10);
    }

    public x2.c<n, v0> e(l1 l1Var, a1 a1Var, ne.x<Void> xVar) {
        p0.z.b();
        n0.k1 c10 = c();
        int i10 = f23937f;
        f23937f = i10 + 1;
        return new x2.c<>(b(i10, c10, l1Var, a1Var), d(i10, c10, l1Var, a1Var, xVar));
    }

    public o3.b f(Size size) {
        o3.b r8 = o3.b.r(this.f23939a, size);
        r8.h(this.f23942e.l());
        if (this.f23942e.e().size() > 1 && this.f23942e.j() != null) {
            r8.h(this.f23942e.j());
        }
        if (this.f23942e.g() != null) {
            r8.y(this.f23942e.g());
        }
        return r8;
    }

    public int g(l1 l1Var) {
        return ((l1Var.l() != null) && p0.a0.h(l1Var.i(), this.f23942e.k())) ? l1Var.h() == 0 ? 100 : 95 : l1Var.k();
    }

    public int h() {
        p0.z.b();
        return this.f23940c.i();
    }

    public final int i() {
        Integer num = (Integer) this.f23939a.h(g2.T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f23939a.h(h2.f25373j, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    public void j(b1.a aVar) {
        p0.z.b();
        this.f23942e.b().accept(aVar);
    }

    public void k(b.a aVar) {
        p0.z.b();
        this.f23940c.r(aVar);
    }

    public final boolean l() {
        return this.f23942e.g() != null;
    }

    public void m(v0 v0Var) {
        p0.z.b();
        this.f23942e.h().accept(v0Var);
    }
}
