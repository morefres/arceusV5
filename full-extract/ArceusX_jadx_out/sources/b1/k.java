package b1;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import b1.g;
import g0.a2;
import g0.f1;
import g0.k0;
import g0.r1;
import g0.w2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.e0;
import n0.h2;
import n0.i2;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.p0;
import n0.t3;
import n0.u;
import n0.u1;
import p0.a0;
import p0.z;
import x0.n0;

/* loaded from: classes.dex */
public class k implements w2.c {

    /* renamed from: a, reason: collision with root package name */
    public final Set<w2> f3669a;

    /* renamed from: e, reason: collision with root package name */
    public final j4 f3672e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f3673f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f3674g;

    /* renamed from: i, reason: collision with root package name */
    public final Set<i4<?>> f3676i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<w2, i4<?>> f3677j;

    /* renamed from: k, reason: collision with root package name */
    public final c f3678k;

    /* renamed from: l, reason: collision with root package name */
    public c f3679l;
    public final Map<w2, n0> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<w2, j> f3670c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map<w2, Boolean> f3671d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final u f3675h = v();

    public static class a extends u {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f3680a;

        public a(k kVar) {
            this.f3680a = new WeakReference<>(kVar);
        }

        @Override // n0.u
        public void b(int i10, e0 e0Var) {
            k kVar = this.f3680a.get();
            if (kVar != null) {
                Iterator<w2> it = kVar.f3669a.iterator();
                while (it.hasNext()) {
                    k.S(e0Var, it.next().z(), i10);
                }
            }
        }
    }

    public k(p0 p0Var, p0 p0Var2, Set<w2> set, j4 j4Var, g.a aVar) {
        this.f3673f = p0Var;
        this.f3674g = p0Var2;
        this.f3672e = j4Var;
        this.f3669a = set;
        Map<w2, i4<?>> U = U(p0Var, set, j4Var);
        this.f3677j = U;
        HashSet hashSet = new HashSet(U.values());
        this.f3676i = hashSet;
        this.f3678k = new c(p0Var, hashSet);
        if (p0Var2 != null) {
            this.f3679l = new c(p0Var2, hashSet);
        }
        for (w2 w2Var : set) {
            this.f3671d.put(w2Var, Boolean.FALSE);
            this.f3670c.put(w2Var, new j(p0Var, this, aVar));
        }
    }

    public static t3 A(w2 w2Var, t3 t3Var, Map<w2, Size> map) {
        t3.a i10 = t3Var.i();
        Size size = map.get(w2Var);
        if (size != null) {
            i10.e(size);
        }
        return i10.a();
    }

    public static u1 B(w2 w2Var) {
        List<u1> p8 = w2Var instanceof f1 ? w2Var.z().p() : w2Var.z().l().i();
        x2.g.i(p8.size() <= 1);
        if (p8.size() == 1) {
            return p8.get(0);
        }
        return null;
    }

    public static int C(w2 w2Var) {
        if (w2Var instanceof a2) {
            return 1;
        }
        return w2Var instanceof f1 ? 4 : 2;
    }

    public static int G(Set<i4<?>> set) {
        Iterator<i4<?>> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().B(0));
        }
        return i10;
    }

    public static Range<Integer> R(Set<i4<?>> set) {
        Range<Integer> range = t3.f25564a;
        Iterator<i4<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> z10 = it.next().z(range);
            Objects.requireNonNull(z10);
            if (t3.f25564a.equals(range)) {
                range = z10;
            } else {
                try {
                    range = range.intersect(z10);
                } catch (IllegalArgumentException unused) {
                    r1.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + range + " <<>> " + z10);
                    return range.extend(z10);
                }
            }
        }
        return range;
    }

    public static void S(e0 e0Var, o3 o3Var, int i10) {
        Iterator<u> it = o3Var.k().iterator();
        while (it.hasNext()) {
            it.next().b(i10, new l(o3Var.l().j(), e0Var));
        }
    }

    public static Map<w2, i4<?>> U(p0 p0Var, Set<w2> set, j4 j4Var) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : set) {
            hashMap.put(w2Var, w2Var.I(p0Var.k(), null, w2Var.m(true, j4Var)));
        }
        return hashMap;
    }

    public static void w(n0 n0Var, u1 u1Var, o3 o3Var) {
        n0Var.v();
        try {
            n0Var.y(u1Var);
        } catch (u1.a unused) {
            if (o3Var.d() != null) {
                o3Var.d().a(o3Var, o3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static int x(w2 w2Var) {
        return w2Var instanceof f1 ? 256 : 34;
    }

    public Set<w2> D() {
        return this.f3669a;
    }

    public Map<w2, z0.f> E(n0 n0Var, int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : this.f3669a) {
            n0 n0Var2 = n0Var;
            z0.f u8 = u(w2Var, this.f3678k, this.f3673f, n0Var2, i10, z10, z11);
            W(w2Var);
            hashMap.put(w2Var, u8);
            n0Var = n0Var2;
        }
        return hashMap;
    }

    public Map<w2, y0.d> F(n0 n0Var, n0 n0Var2, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : this.f3669a) {
            n0 n0Var3 = n0Var;
            int i11 = i10;
            boolean z11 = z10;
            z0.f u8 = u(w2Var, this.f3678k, this.f3673f, n0Var3, i11, z11, false);
            c cVar = this.f3679l;
            Objects.requireNonNull(cVar);
            p0 p0Var = this.f3674g;
            Objects.requireNonNull(p0Var);
            n0 n0Var4 = n0Var2;
            z0.f u10 = u(w2Var, cVar, p0Var, n0Var4, i11, z11, false);
            W(w2Var);
            hashMap.put(w2Var, y0.d.c(u8, u10));
            n0Var = n0Var3;
            n0Var2 = n0Var4;
            i10 = i11;
            z10 = z11;
        }
        return hashMap;
    }

    public u H() {
        return this.f3675h;
    }

    public final a2 I() {
        for (w2 w2Var : this.f3669a) {
            if (w2Var instanceof a2) {
                return (a2) w2Var;
            }
        }
        return null;
    }

    public Map<w2, Size> J(n0 n0Var, boolean z10) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : this.f3669a) {
            c cVar = this.f3678k;
            i4<?> i4Var = this.f3677j.get(w2Var);
            Objects.requireNonNull(i4Var);
            PreferredChildSize r8 = cVar.r(i4Var, n0Var.n(), a0.g(n0Var.r()), z10);
            hashMap.put(w2Var, r8.getOriginalSelectedChildSize());
            r1.a("VirtualCameraAdapter", "Selected child size: " + r8.getOriginalSelectedChildSize() + ", useCase: " + w2Var);
        }
        return hashMap;
    }

    public final n0 K(w2 w2Var) {
        n0 n0Var = this.b.get(w2Var);
        Objects.requireNonNull(n0Var);
        return n0Var;
    }

    public final boolean L(w2 w2Var) {
        Boolean bool = this.f3671d.get(w2Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public void M(n0.w2 w2Var) {
        w2Var.G(i2.f25396v, this.f3678k.o(w2Var));
        w2Var.G(i4.A, Integer.valueOf(G(this.f3676i)));
        k0 d10 = b1.a.d(this.f3676i);
        if (d10 == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        w2Var.G(h2.f25375l, d10);
        w2Var.G(i4.C, R(this.f3676i));
        Iterator<w2> it = this.f3669a.iterator();
        while (it.hasNext()) {
            i4<?> i4Var = this.f3677j.get(it.next());
            Objects.requireNonNull(i4Var);
            i4<?> i4Var2 = i4Var;
            if (i4Var2.x() != 0) {
                w2Var.G(i4.I, Integer.valueOf(i4Var2.x()));
            }
            if (i4Var2.E() != 0) {
                w2Var.G(i4.H, Integer.valueOf(i4Var2.E()));
            }
        }
    }

    public void N() {
        Iterator<w2> it = this.f3669a.iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    public void O() {
        Iterator<w2> it = this.f3669a.iterator();
        while (it.hasNext()) {
            it.next().R();
        }
    }

    public void P() {
        Iterator<w2> it = this.f3669a.iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    public void Q() {
        z.b();
        Iterator<w2> it = this.f3669a.iterator();
        while (it.hasNext()) {
            n(it.next());
        }
    }

    public void T(Map<w2, n0> map, Map<w2, Size> map2) {
        this.b.clear();
        this.b.putAll(map);
        for (Map.Entry<w2, n0> entry : this.b.entrySet()) {
            w2 key = entry.getKey();
            n0 value = entry.getValue();
            key.b0(value.n());
            key.Z(value.r());
            key.e0(A(key, value.s(), map2), null);
            key.M();
        }
    }

    public void V() {
        for (w2 w2Var : this.f3669a) {
            j jVar = this.f3670c.get(w2Var);
            Objects.requireNonNull(jVar);
            w2Var.c0(jVar);
        }
    }

    public final void W(w2 w2Var) {
        int z10 = z(w2Var, this.f3673f);
        j jVar = this.f3670c.get(w2Var);
        Objects.requireNonNull(jVar);
        jVar.t(z10);
    }

    @Override // g0.w2.c
    public void f(w2 w2Var) {
        z.b();
        if (L(w2Var)) {
            n0 K = K(w2Var);
            u1 B = B(w2Var);
            if (B != null) {
                w(K, B, w2Var.z());
            } else {
                K.m();
            }
        }
    }

    @Override // g0.w2.c
    public void m(w2 w2Var) {
        z.b();
        if (L(w2Var)) {
            this.f3671d.put(w2Var, Boolean.FALSE);
            K(w2Var).m();
        }
    }

    @Override // g0.w2.c
    public void n(w2 w2Var) {
        u1 B;
        z.b();
        n0 K = K(w2Var);
        if (L(w2Var) && (B = B(w2Var)) != null) {
            w(K, B, w2Var.z());
        }
    }

    @Override // g0.w2.c
    public void s(w2 w2Var) {
        z.b();
        if (L(w2Var)) {
            return;
        }
        this.f3671d.put(w2Var, Boolean.TRUE);
        u1 B = B(w2Var);
        if (B != null) {
            w(K(w2Var), B, w2Var.z());
        }
    }

    public void t() {
        for (w2 w2Var : this.f3669a) {
            j jVar = this.f3670c.get(w2Var);
            Objects.requireNonNull(jVar);
            w2Var.d(jVar, null, null, w2Var.m(true, this.f3672e));
        }
    }

    public final z0.f u(w2 w2Var, c cVar, p0 p0Var, n0 n0Var, int i10, boolean z10, boolean z11) {
        int w5 = p0Var.d().w(i10);
        boolean l10 = a0.l(n0Var.r());
        i4<?> i4Var = this.f3677j.get(w2Var);
        Objects.requireNonNull(i4Var);
        PreferredChildSize r8 = cVar.r(i4Var, n0Var.n(), a0.g(n0Var.r()), z10);
        Rect cropRectBeforeScaling = r8.getCropRectBeforeScaling();
        Size childSizeToScale = r8.getChildSizeToScale();
        int w10 = a0.w((n0Var.q() + z(w2Var, p0Var)) - w5);
        return z0.f.h(C(w2Var), x(w2Var), cropRectBeforeScaling, a0.q(childSizeToScale, w10), w10, z11 ? false : w2Var.H(p0Var) ^ l10);
    }

    public u v() {
        return new a(this);
    }

    public y0.d y(n0 n0Var, n0 n0Var2, int i10, boolean z10) {
        a2 a2Var = (a2) x2.g.g(I());
        return y0.d.c(u(a2Var, this.f3678k, this.f3673f, n0Var, i10, z10, false), u(a2Var, this.f3678k, this.f3674g, n0Var2, i10, z10, false));
    }

    public final int z(w2 w2Var, p0 p0Var) {
        return p0Var.d().w(((i2) w2Var.l()).J(0));
    }
}
