package cf;

import af.f0;
import af.h0;
import af.p0;
import bf.a;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import we.f0;
import we.g0;
import we.l0;
import we.m;
import we.m0;
import we.n;
import we.s0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f4860a;
    public static final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.g0<bf.a, m0> f4861c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4862d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.n<bf.c, l0> f4863e;

    /* renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4864f;

    /* renamed from: g, reason: collision with root package name */
    public static final we.n<bf.b, l0> f4865g;

    /* renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4866h;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4867a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4868c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f4869d;

        static {
            int[] iArr = new int[af.v.values().length];
            f4869d = iArr;
            try {
                iArr[af.v.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4869d[af.v.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[af.z.values().length];
            f4868c = iArr2;
            try {
                iArr2[af.z.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4868c[af.z.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4868c[af.z.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[p0.values().length];
            b = iArr3;
            try {
                iArr3[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[af.b0.values().length];
            f4867a = iArr4;
            try {
                iArr4[af.b0.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4867a[af.b0.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4867a[af.b0.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ef.a h10 = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f4860a = h10;
        ef.a h11 = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        b = h11;
        f4861c = we.g0.a(new g0.b() { // from class: cf.a
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                m0 o8;
                o8 = g.o((bf.a) xVar);
                return o8;
            }
        }, bf.a.class, m0.class);
        f4862d = we.f0.a(new f0.b() { // from class: cf.b
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                bf.a j10;
                j10 = g.j((m0) p0Var);
                return j10;
            }
        }, h10, m0.class);
        f4863e = we.n.a(new n.b() { // from class: cf.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 q10;
                q10 = g.q((bf.c) lVar, d0Var);
                return q10;
            }
        }, bf.c.class, l0.class);
        f4864f = we.m.a(new m.b() { // from class: cf.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                bf.c l10;
                l10 = g.l((l0) p0Var, d0Var);
                return l10;
            }
        }, h11, l0.class);
        f4865g = we.n.a(new n.b() { // from class: cf.e
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 p8;
                p8 = g.p((bf.b) lVar, d0Var);
                return p8;
            }
        }, bf.b.class, l0.class);
        f4866h = we.m.a(new m.b() { // from class: cf.f
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                bf.b k10;
                k10 = g.k((l0) p0Var, d0Var);
                return k10;
            }
        }, h10, l0.class);
    }

    public static int g(a.c cVar) {
        if (a.c.f4014c.equals(cVar)) {
            return 33;
        }
        if (a.c.f4015d.equals(cVar)) {
            return 49;
        }
        if (a.c.f4016e.equals(cVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static af.s h(bf.a aVar) {
        return af.s.h0().E(u(aVar.d())).C(t(aVar.c())).D(w(aVar.e())).build();
    }

    public static af.u i(bf.c cVar) {
        int g10 = g(cVar.d().c());
        ECPoint e10 = cVar.e();
        return af.u.i0().C(h(cVar.d())).D(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(e10.getAffineX(), g10))).E(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(e10.getAffineY(), g10))).build();
    }

    public static bf.a j(m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                af.r d02 = af.r.d0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return bf.a.b().c(s(d02.b0().g0())).d(x(d02.b0().f0())).b(r(d02.b0().d0())).e(y(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static bf.b k(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            af.t g02 = af.t.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af.u d02 = g02.d0();
            if (d02.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return bf.b.d().c(bf.c.c().d(bf.a.b().c(s(d02.e0().g0())).d(x(d02.e0().f0())).b(r(d02.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(we.a.a(d02.g0().v()), we.a.a(d02.h0().v()))).c(l0Var.c()).a()).b(ef.b.a(we.a.a(g02.c0().v()), pe.d0.b(d0Var))).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static bf.c l(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            af.u j02 = af.u.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (j02.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return bf.c.c().d(bf.a.b().c(s(j02.e0().g0())).d(x(j02.e0().f0())).b(r(j02.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(we.a.a(j02.g0().v()), we.a.a(j02.h0().v()))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static void m() {
        n(we.d0.c());
    }

    public static void n(we.d0 d0Var) {
        d0Var.m(f4861c);
        d0Var.l(f4862d);
        d0Var.k(f4863e);
        d0Var.j(f4864f);
        d0Var.k(f4865g);
        d0Var.j(f4866h);
    }

    public static m0 o(bf.a aVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").E(af.r.c0().C(h(aVar)).build().b()).C(v(aVar.f())).build());
    }

    public static l0 p(bf.b bVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", af.t.f0().D(i(bVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(bVar.f().b(pe.d0.b(d0Var)), g(bVar.e().c())))).build().b(), f0.c.ASYMMETRIC_PRIVATE, v(bVar.e().f()), bVar.a());
    }

    public static l0 q(bf.c cVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", i(cVar).b(), f0.c.ASYMMETRIC_PUBLIC, v(cVar.d().f()), cVar.a());
    }

    public static a.c r(af.z zVar) {
        int i10 = a.f4868c[zVar.ordinal()];
        if (i10 == 1) {
            return a.c.f4014c;
        }
        if (i10 == 2) {
            return a.c.f4015d;
        }
        if (i10 == 3) {
            return a.c.f4016e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + zVar.getNumber());
    }

    public static a.d s(af.b0 b0Var) {
        int i10 = a.f4867a[b0Var.ordinal()];
        if (i10 == 1) {
            return a.d.b;
        }
        if (i10 == 2) {
            return a.d.f4018c;
        }
        if (i10 == 3) {
            return a.d.f4019d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static af.z t(a.c cVar) {
        if (a.c.f4014c.equals(cVar)) {
            return af.z.NIST_P256;
        }
        if (a.c.f4015d.equals(cVar)) {
            return af.z.NIST_P384;
        }
        if (a.c.f4016e.equals(cVar)) {
            return af.z.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static af.b0 u(a.d dVar) {
        if (a.d.b.equals(dVar)) {
            return af.b0.SHA256;
        }
        if (a.d.f4018c.equals(dVar)) {
            return af.b0.SHA384;
        }
        if (a.d.f4019d.equals(dVar)) {
            return af.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + dVar);
    }

    public static p0 v(a.f fVar) {
        if (a.f.b.equals(fVar)) {
            return p0.TINK;
        }
        if (a.f.f4023c.equals(fVar)) {
            return p0.CRUNCHY;
        }
        if (a.f.f4025e.equals(fVar)) {
            return p0.RAW;
        }
        if (a.f.f4024d.equals(fVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + fVar);
    }

    public static af.v w(a.e eVar) {
        if (a.e.b.equals(eVar)) {
            return af.v.IEEE_P1363;
        }
        if (a.e.f4021c.equals(eVar)) {
            return af.v.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + eVar);
    }

    public static a.e x(af.v vVar) {
        int i10 = a.f4869d[vVar.ordinal()];
        if (i10 == 1) {
            return a.e.b;
        }
        if (i10 == 2) {
            return a.e.f4021c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + vVar.getNumber());
    }

    public static a.f y(p0 p0Var) {
        int i10 = a.b[p0Var.ordinal()];
        if (i10 == 1) {
            return a.f.b;
        }
        if (i10 == 2) {
            return a.f.f4023c;
        }
        if (i10 == 3) {
            return a.f.f4024d;
        }
        if (i10 == 4) {
            return a.f.f4025e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
