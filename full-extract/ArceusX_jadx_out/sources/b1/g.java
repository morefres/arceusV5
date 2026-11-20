package b1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import g0.i0;
import g0.k0;
import g0.r1;
import g0.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.c3;
import n0.h2;
import n0.i2;
import n0.i4;
import n0.j4;
import n0.n1;
import n0.o0;
import n0.o3;
import n0.p0;
import n0.t3;
import n0.u3;
import n0.x2;
import ne.x;
import p0.a0;
import p0.z;
import x0.n0;
import x0.t;
import x0.v0;
import y0.o;
import y0.r;

/* loaded from: classes.dex */
public class g extends w2 {
    public n0 A;
    public n0 B;
    public n0 C;
    public n0 D;
    public n0 E;
    public n0 F;
    public o3.b G;
    public o3.b H;
    public o3.c I;

    /* renamed from: s, reason: collision with root package name */
    public final i f3657s;

    /* renamed from: t, reason: collision with root package name */
    public final k f3658t;

    /* renamed from: u, reason: collision with root package name */
    public final i0 f3659u;

    /* renamed from: v, reason: collision with root package name */
    public final i0 f3660v;

    /* renamed from: w, reason: collision with root package name */
    public v0 f3661w;

    /* renamed from: x, reason: collision with root package name */
    public v0 f3662x;

    /* renamed from: y, reason: collision with root package name */
    public r f3663y;

    /* renamed from: z, reason: collision with root package name */
    public v0 f3664z;

    public interface a {
        x<Void> a(int i10, int i11);
    }

    public g(p0 p0Var, p0 p0Var2, i0 i0Var, i0 i0Var2, Set<w2> set, j4 j4Var) {
        super(v0(set));
        this.f3657s = v0(set);
        this.f3659u = i0Var;
        this.f3660v = i0Var2;
        this.f3658t = new k(p0Var, p0Var2, set, j4Var, new a() { // from class: b1.f
            @Override // b1.g.a
            public final x a(int i10, int i11) {
                return g.h0(g.this, i10, i11);
            }
        });
        F0(set);
    }

    public static boolean A0(w2 w2Var) {
        return w2Var instanceof g;
    }

    public static /* synthetic */ void g0(g gVar, String str, String str2, i4 i4Var, t3 t3Var, t3 t3Var2, o3 o3Var, o3.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.j0();
        gVar.d0(gVar.m0(str, str2, i4Var, t3Var, t3Var2));
        gVar.L();
        gVar.f3658t.Q();
    }

    public static /* synthetic */ x h0(g gVar, int i10, int i11) {
        v0 v0Var = gVar.f3662x;
        return v0Var != null ? v0Var.e().c(i10, i11) : r0.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void j0() {
        o3.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
            this.I = null;
        }
        n0 n0Var = this.A;
        if (n0Var != null) {
            n0Var.i();
            this.A = null;
        }
        n0 n0Var2 = this.B;
        if (n0Var2 != null) {
            n0Var2.i();
            this.B = null;
        }
        n0 n0Var3 = this.C;
        if (n0Var3 != null) {
            n0Var3.i();
            this.C = null;
        }
        n0 n0Var4 = this.D;
        if (n0Var4 != null) {
            n0Var4.i();
            this.D = null;
        }
        n0 n0Var5 = this.E;
        if (n0Var5 != null) {
            n0Var5.i();
            this.E = null;
        }
        n0 n0Var6 = this.F;
        if (n0Var6 != null) {
            n0Var6.i();
            this.F = null;
        }
        v0 v0Var = this.f3662x;
        if (v0Var != null) {
            v0Var.f();
            this.f3662x = null;
        }
        r rVar = this.f3663y;
        if (rVar != null) {
            rVar.d();
            this.f3663y = null;
        }
        v0 v0Var2 = this.f3661w;
        if (v0Var2 != null) {
            v0Var2.f();
            this.f3661w = null;
        }
        v0 v0Var3 = this.f3664z;
        if (v0Var3 != null) {
            v0Var3.f();
            this.f3664z = null;
        }
    }

    public static List<j4.b> q0(w2 w2Var) {
        ArrayList arrayList = new ArrayList();
        if (!A0(w2Var)) {
            arrayList.add(w2Var.l().X());
            return arrayList;
        }
        Iterator<w2> it = ((g) w2Var).s0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l().X());
        }
        return arrayList;
    }

    public static int r0(w2 w2Var) {
        return w2Var.l().S().q();
    }

    private Rect t0(Size size) {
        return E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static i v0(Set<w2> set) {
        n0.w2 a10 = new h().a();
        a10.G(h2.f25373j, 34);
        ArrayList arrayList = new ArrayList();
        for (w2 w2Var : set) {
            if (w2Var.l().a(i4.G)) {
                arrayList.add(w2Var.l().X());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        a10.G(i.Q, arrayList);
        a10.G(i2.f25390p, 2);
        a10.G(i4.K, u3.f25587g);
        return new i(c3.j0(a10));
    }

    @Override // g0.w2
    public Set<k0> A(o0 o0Var) {
        Set<w2> s02 = s0();
        HashSet hashSet = null;
        if (s02.isEmpty()) {
            return null;
        }
        Iterator<w2> it = s02.iterator();
        while (it.hasNext()) {
            Set<k0> A = it.next().A(o0Var);
            if (A != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(A);
                } else {
                    hashSet.retainAll(A);
                }
            }
        }
        return hashSet;
    }

    @Override // g0.w2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final void B0(Size size, o3.b bVar) {
        Iterator<w2> it = s0().iterator();
        while (it.hasNext()) {
            o3 p8 = o3.b.r(it.next().l(), size).p();
            bVar.c(p8.k());
            bVar.a(p8.o());
            bVar.d(p8.m());
            bVar.b(p8.c());
            bVar.g(p8.g());
        }
    }

    public final void C0(o3.b bVar) {
        Iterator<w2> it = s0().iterator();
        int i10 = -1;
        while (it.hasNext()) {
            i10 = o3.f(i10, r0(it.next()));
        }
        if (i10 != -1) {
            bVar.B(i10);
        }
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n1 n1Var) {
        return new h(x2.l0(n1Var));
    }

    public final void D0(n0 n0Var, v0 v0Var, boolean z10) {
        boolean z11 = E() != null;
        Map<w2, z0.f> E = this.f3658t.E(n0Var, C(), z11, z10);
        v0.c j10 = v0Var.j(v0.b.c(n0Var, new ArrayList(E.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry<w2, z0.f> entry : E.entrySet()) {
            hashMap.put(entry.getKey(), j10.get(entry.getValue()));
        }
        this.f3658t.T(hashMap, this.f3658t.J(n0Var, z11));
    }

    public final void E0(n0 n0Var, n0 n0Var2, r rVar, t3 t3Var) {
        if (n() == null) {
            boolean z10 = E() != null;
            Map<w2, y0.d> F = this.f3658t.F(n0Var, n0Var2, C(), z10);
            r.c g10 = this.f3663y.g(r.b.d(n0Var, n0Var2, new ArrayList(F.values())));
            HashMap hashMap = new HashMap();
            for (Map.Entry<w2, y0.d> entry : F.entrySet()) {
                hashMap.put(entry.getKey(), g10.get(entry.getValue()));
            }
            this.f3658t.T(hashMap, this.f3658t.J(n0Var, z10));
            return;
        }
        this.E = rVar.g(r.b.d(n0Var, n0Var2, Arrays.asList(this.f3658t.y(n0Var, n0Var2, C(), E() != null)))).values().iterator().next();
        if (n().e() == 1) {
            this.F = this.E;
        } else {
            n0 n0Var3 = this.E;
            Objects.requireNonNull(n0Var3);
            p0 i10 = i();
            Objects.requireNonNull(i10);
            this.F = w0(n0Var3, i10);
        }
        p0 i11 = i();
        Objects.requireNonNull(i11);
        v0 l02 = l0(i11, t3Var);
        this.f3664z = l02;
        D0(this.F, l02, true);
    }

    public void F0(Set<w2> set) {
        Y(set.iterator().next().o());
    }

    @Override // g0.w2
    public void O() {
        super.O();
        this.f3658t.t();
    }

    @Override // g0.w2
    public void P() {
        super.P();
        this.f3658t.N();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [n0.i4, n0.i4<?>] */
    @Override // g0.w2
    public i4<?> Q(o0 o0Var, i4.b<?, ?, ?> bVar) {
        this.f3658t.M(bVar.a());
        return bVar.e();
    }

    @Override // g0.w2
    public void R() {
        super.R();
        this.f3658t.O();
    }

    @Override // g0.w2
    public void S() {
        super.S();
        this.f3658t.P();
    }

    @Override // g0.w2
    public t3 T(n1 n1Var) {
        List<o3> a10;
        this.G.g(n1Var);
        a10 = g0.o0.a(new Object[]{this.G.p()});
        d0(a10);
        return g().i().d(n1Var).a();
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        r1.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        d0(m0(k(), w(), l(), t3Var, t3Var2));
        J();
        return t3Var;
    }

    @Override // g0.w2
    public void V() {
        super.V();
        j0();
        this.f3658t.V();
    }

    public final void i0(o3.b bVar, final String str, final String str2, final i4<?> i4Var, final t3 t3Var, final t3 t3Var2) {
        o3.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: b1.e
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                g.g0(g.this, str, str2, i4Var, t3Var, t3Var2, o3Var, gVar);
            }
        });
        this.I = cVar2;
        bVar.u(cVar2);
    }

    public final r k0(p0 p0Var, p0 p0Var2, t3 t3Var, i0 i0Var, i0 i0Var2) {
        return new r(p0Var, p0Var2, o.a.a(t3Var.b(), i0Var, i0Var2));
    }

    public final v0 l0(p0 p0Var, t3 t3Var) {
        if (n() == null || n().e() != 1) {
            return new v0(p0Var, t.a.a(t3Var.b()));
        }
        v0 v0Var = new v0(p0Var, n().a());
        this.f3661w = v0Var;
        return v0Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [n0.i4, n0.i4<?>] */
    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        n1 a10 = j4Var.a(this.f3657s.X(), 1);
        if (z10) {
            a10 = n1.L(a10, this.f3657s.n());
        }
        if (a10 == null) {
            return null;
        }
        return D(a10).e();
    }

    public final List<o3> m0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        List<o3> a10;
        List<o3> a11;
        z.b();
        if (t3Var2 != null) {
            n0 n02 = n0(str, str2, i4Var, t3Var, t3Var2);
            n0 o02 = o0(str, str2, i4Var, t3Var, t3Var2);
            r k02 = k0(i(), v(), t3Var, this.f3659u, this.f3660v);
            this.f3663y = k02;
            E0(n02, o02, k02, t3Var);
            a10 = g0.o0.a(new Object[]{this.G.p(), this.H.p()});
            return a10;
        }
        n0 n03 = n0(str, str2, i4Var, t3Var, null);
        p0 i10 = i();
        Objects.requireNonNull(i10);
        v0 l02 = l0(i10, t3Var);
        this.f3662x = l02;
        D0(n03, l02, false);
        a11 = g0.o0.a(new Object[]{this.G.p()});
        return a11;
    }

    public final n0 n0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        Matrix y10 = y();
        p0 i10 = i();
        Objects.requireNonNull(i10);
        boolean q10 = i10.q();
        Rect t02 = t0(t3Var.f());
        Objects.requireNonNull(t02);
        p0 i11 = i();
        Objects.requireNonNull(i11);
        int t8 = t(i11);
        p0 i12 = i();
        Objects.requireNonNull(i12);
        n0 n0Var = new n0(3, 34, t3Var, y10, q10, t02, t8, -1, H(i12));
        this.A = n0Var;
        boolean z10 = str2 != null;
        p0 i13 = i();
        Objects.requireNonNull(i13);
        this.C = z0(n0Var, i13, z10);
        o3.b p02 = p0(this.A, i4Var, t3Var);
        this.G = p02;
        i0(p02, str, str2, i4Var, t3Var, t3Var2);
        return this.C;
    }

    public final n0 o0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        Matrix y10 = y();
        p0 v5 = v();
        Objects.requireNonNull(v5);
        boolean q10 = v5.q();
        Rect t02 = t0(t3Var2.f());
        Objects.requireNonNull(t02);
        p0 v10 = v();
        Objects.requireNonNull(v10);
        int t8 = t(v10);
        p0 v11 = v();
        Objects.requireNonNull(v11);
        n0 n0Var = new n0(3, 34, t3Var2, y10, q10, t02, t8, -1, H(v11));
        this.B = n0Var;
        p0 v12 = v();
        Objects.requireNonNull(v12);
        this.D = z0(n0Var, v12, true);
        o3.b p02 = p0(this.B, i4Var, t3Var2);
        this.H = p02;
        i0(p02, str, str2, i4Var, t3Var, t3Var2);
        return this.D;
    }

    public final o3.b p0(n0 n0Var, i4<?> i4Var, t3 t3Var) {
        o3.b r8 = o3.b.r(i4Var, t3Var.f());
        C0(r8);
        B0(t3Var.f(), r8);
        r8.n(n0Var.o(), t3Var.b(), null, -1);
        r8.j(this.f3658t.H());
        if (t3Var.d() != null) {
            r8.g(t3Var.d());
        }
        r8.A(t3Var.g());
        b(r8, t3Var);
        return r8;
    }

    public Set<w2> s0() {
        return this.f3658t.D();
    }

    public final Rect u0(n0 n0Var) {
        return ((g0.n) x2.g.g(n())).h() == 1 ? a0.r(n0Var.s().f()) : n0Var.n();
    }

    public final n0 w0(n0 n0Var, p0 p0Var) {
        this.f3661w = new v0(p0Var, n().a());
        int y02 = y0();
        Rect u02 = u0(n0Var);
        z0.f i10 = z0.f.i(n0Var.t(), n0Var.p(), u02, a0.f(u02, y02), y02, x0(), true);
        n0 n0Var2 = this.f3661w.j(v0.b.c(n0Var, Collections.singletonList(i10))).get(i10);
        Objects.requireNonNull(n0Var2);
        return n0Var2;
    }

    public final boolean x0() {
        if (((g0.n) x2.g.g(n())).h() == 1) {
            p0 p0Var = (p0) x2.g.g(i());
            if (p0Var.l() && p0Var.q()) {
                return true;
            }
        }
        return false;
    }

    public final int y0() {
        if (((g0.n) x2.g.g(n())).h() == 1) {
            return t((p0) x2.g.g(i()));
        }
        return 0;
    }

    public final n0 z0(n0 n0Var, p0 p0Var, boolean z10) {
        return (n() == null || n().h() == 2 || z10 || n().e() == 1) ? n0Var : w0(n0Var, p0Var);
    }
}
