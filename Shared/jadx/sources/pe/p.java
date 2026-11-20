package pe;

import af.f0;
import af.j0;
import af.k0;
import af.p0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import we.j0;
import we.l0;
import we.s0;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f28600a;
    public final List<c> b;

    /* renamed from: c, reason: collision with root package name */
    public final we.r f28601c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28602a;

        static {
            int[] iArr = new int[af.g0.values().length];
            f28602a = iArr;
            try {
                iArr[af.g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28602a[af.g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28602a[af.g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f28603a = new ArrayList();
        public GeneralSecurityException b = null;

        /* renamed from: c, reason: collision with root package name */
        public we.r f28604c = we.r.b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28605d = false;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f28606a;
            public n b;

            /* renamed from: c, reason: collision with root package name */
            public final l f28607c;

            /* renamed from: d, reason: collision with root package name */
            public final x f28608d;

            /* renamed from: e, reason: collision with root package name */
            public C0505b f28609e;

            /* renamed from: f, reason: collision with root package name */
            public b f28610f;

            public /* synthetic */ a(x xVar, a aVar) {
                this(xVar);
            }

            public a i() {
                b bVar = this.f28610f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f28606a = true;
                return this;
            }

            public a j() {
                this.f28609e = C0505b.e();
                return this;
            }

            public a(x xVar) {
                this.b = n.b;
                this.f28609e = null;
                this.f28610f = null;
                this.f28607c = null;
                this.f28608d = xVar;
            }
        }

        /* renamed from: pe.p$b$b, reason: collision with other inner class name */
        public static class C0505b {
            public static final C0505b b = new C0505b();

            /* renamed from: a, reason: collision with root package name */
            public final int f28611a = 0;

            public static C0505b e() {
                return b;
            }

            public final int d() {
                return this.f28611a;
            }
        }

        public static void d(List<a> list) {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f28609e == C0505b.b && list.get(i10 + 1).f28609e != C0505b.b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        public static int f(a aVar, Set<Integer> set) {
            if (aVar.f28609e != null) {
                return aVar.f28609e == C0505b.b ? g(set) : aVar.f28609e.d();
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public static int g(Set<Integer> set) {
            int i10 = 0;
            while (true) {
                if (i10 != 0 && !set.contains(Integer.valueOf(i10))) {
                    return i10;
                }
                i10 = s0.f();
            }
        }

        public b b(a aVar) {
            if (aVar.f28610f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if (aVar.f28606a) {
                e();
            }
            aVar.f28610f = this;
            this.f28603a.add(aVar);
            return this;
        }

        public p c() {
            c cVar;
            j0.c f10;
            if (this.b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.b);
            }
            if (this.f28605d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f28605d = true;
            j0.b i02 = j0.i0();
            ArrayList arrayList = new ArrayList(this.f28603a.size());
            d(this.f28603a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer num = null;
            for (a aVar2 : this.f28603a) {
                if (aVar2.b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int f11 = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(f11))) {
                    throw new GeneralSecurityException("Id " + f11 + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(f11));
                if (aVar2.f28607c != null) {
                    cVar = new c(aVar2.f28607c, aVar2.b, f11, aVar2.f28606a, null);
                    f10 = p.f(aVar2.f28607c, aVar2.b, f11);
                } else {
                    l c10 = we.w.f().c(aVar2.f28608d, aVar2.f28608d.a() ? Integer.valueOf(f11) : null);
                    cVar = new c(c10, aVar2.b, f11, aVar2.f28606a, null);
                    f10 = p.f(c10, aVar2.b, f11);
                }
                i02.C(f10);
                if (aVar2.f28606a) {
                    if (num != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    num = Integer.valueOf(f11);
                    if (aVar2.b != n.b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (num == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            i02.D(num.intValue());
            j0 build = i02.build();
            p.d(build);
            return new p(build, arrayList, this.f28604c, aVar);
        }

        public final void e() {
            Iterator<a> it = this.f28603a.iterator();
            while (it.hasNext()) {
                it.next().f28606a = false;
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final l f28612a;
        public final n b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28613c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f28614d;

        public /* synthetic */ c(l lVar, n nVar, int i10, boolean z10, a aVar) {
            this(lVar, nVar, i10, z10);
        }

        public l a() {
            return this.f28612a;
        }

        public c(l lVar, n nVar, int i10, boolean z10) {
            this.f28612a = lVar;
            this.b = nVar;
            this.f28613c = i10;
            this.f28614d = z10;
        }
    }

    public /* synthetic */ p(j0 j0Var, List list, we.r rVar, a aVar) {
        this(j0Var, list, rVar);
    }

    public static j0.c A(int i10, af.g0 g0Var, l0 l0Var) {
        return j0.c.j0().C(af.f0.h0().D(l0Var.f()).E(l0Var.g()).C(l0Var.d())).J(g0Var).E(i10).G(l0Var.e()).build();
    }

    public static l0 B(j0.c cVar) {
        return l0.b(cVar.e0().f0(), cVar.e0().g0(), cVar.e0().e0(), cVar.g0(), cVar.g0() == p0.RAW ? null : Integer.valueOf(cVar.f0()));
    }

    public static void c(af.a0 a0Var) {
        if (a0Var == null || a0Var.e0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void d(j0 j0Var) {
        if (j0Var == null || j0Var.f0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void e(j0 j0Var) {
        for (j0.c cVar : j0Var.g0()) {
            if (cVar.e0().e0() == f0.c.UNKNOWN_KEYMATERIAL || cVar.e0().e0() == f0.c.SYMMETRIC || cVar.e0().e0() == f0.c.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", cVar.e0().e0().name(), cVar.e0().f0()));
            }
        }
    }

    public static j0.c f(l lVar, n nVar, int i10) {
        l0 l0Var = (l0) we.d0.c().n(lVar, l0.class, j.a());
        Integer c10 = l0Var.c();
        if (c10 == null || c10.intValue() == i10) {
            return A(i10, x(nVar), l0Var);
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    public static j0 g(af.a0 a0Var, pe.a aVar, byte[] bArr) {
        try {
            j0 k02 = j0.k0(aVar.b(a0Var.e0().v(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            d(k02);
            return k02;
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static af.a0 h(j0 j0Var, pe.a aVar, byte[] bArr) {
        return af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(aVar.a(j0Var.n(), bArr))).E(i0.b(j0Var)).build();
    }

    public static final p i(j0 j0Var) {
        d(j0Var);
        return new p(j0Var, m(j0Var));
    }

    public static b.a j(x xVar) {
        return new b.a(xVar, null);
    }

    public static final p k(o oVar) {
        return l(oVar.d());
    }

    public static final p l(x xVar) {
        return s().b(j(xVar).j().i()).c();
    }

    public static List<c> m(j0 j0Var) {
        ArrayList arrayList = new ArrayList(j0Var.f0());
        for (j0.c cVar : j0Var.g0()) {
            int f02 = cVar.f0();
            try {
                arrayList.add(new c(z(cVar), t(cVar.h0()), f02, f02 == j0Var.h0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static b s() {
        return new b();
    }

    public static n t(af.g0 g0Var) {
        int i10 = a.f28602a[g0Var.ordinal()];
        if (i10 == 1) {
            return n.b;
        }
        if (i10 == 2) {
            return n.f28596c;
        }
        if (i10 == 3) {
            return n.f28597d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Deprecated
    public static final p u(r rVar) {
        try {
            return v(rVar.read().n());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final p v(byte[] bArr) {
        try {
            j0 k02 = j0.k0(bArr, com.google.crypto.tink.shaded.protobuf.p.b());
            e(k02);
            return i(k02);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final p w(r rVar, pe.a aVar, byte[] bArr) {
        af.a0 a10 = rVar.a();
        c(a10);
        return i(g(a10, aVar, bArr));
    }

    public static af.g0 x(n nVar) {
        if (n.b.equals(nVar)) {
            return af.g0.ENABLED;
        }
        if (n.f28596c.equals(nVar)) {
            return af.g0.DISABLED;
        }
        if (n.f28597d.equals(nVar)) {
            return af.g0.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static l z(j0.c cVar) {
        return we.d0.c().g(B(cVar), j.a());
    }

    @Deprecated
    public void C(s sVar, pe.a aVar, byte[] bArr) {
        sVar.b(h(this.f28600a, aVar, bArr));
    }

    public j0 n() {
        return this.f28600a;
    }

    @Deprecated
    public k0 o() {
        return i0.b(this.f28600a);
    }

    @Deprecated
    public <P> P p(Class<P> cls) {
        return (P) q(c0.a(), cls);
    }

    public <P> P q(e eVar, Class<P> cls) {
        if (!(eVar instanceof we.j)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        we.j jVar = (we.j) eVar;
        Class<?> a10 = jVar.a(cls);
        if (a10 != null) {
            return (P) r(jVar, cls, a10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <B, P> P r(we.j jVar, Class<P> cls, Class<B> cls2) {
        i0.e(this.f28600a);
        j0.b i10 = we.j0.i(cls2);
        i10.e(this.f28601c);
        for (int i11 = 0; i11 < y(); i11++) {
            j0.c e02 = this.f28600a.e0(i11);
            if (e02.h0().equals(af.g0.ENABLED)) {
                c cVar = this.b.get(i11);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i11 + " and type_url " + e02.e0().f0() + " failed, unable to get primitive");
                }
                l a10 = cVar.a();
                try {
                    Object b10 = jVar.b(a10, cls2);
                    if (e02.f0() == this.f28600a.h0()) {
                        i10.c(b10, a10, e02);
                    } else {
                        i10.b(b10, a10, e02);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2 + " for key of type " + e02.e0().f0() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return (P) jVar.c(i10.d(), cls);
    }

    public String toString() {
        return o().toString();
    }

    public int y() {
        return this.b.size();
    }

    public p(af.j0 j0Var, List<c> list) {
        this.f28600a = j0Var;
        this.b = list;
        this.f28601c = we.r.b;
    }

    public p(af.j0 j0Var, List<c> list, we.r rVar) {
        this.f28600a = j0Var;
        this.b = list;
        this.f28601c = rVar;
    }
}
