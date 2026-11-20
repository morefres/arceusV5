package cf;

import af.f0;
import af.h0;
import af.p0;
import af.r0;
import af.t0;
import af.u0;
import bf.j0;
import bf.k0;
import bf.l0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import we.f0;
import we.g0;
import we.m;
import we.m0;
import we.n;
import we.s0;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f4891a;
    public static final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.g0<j0, m0> f4892c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4893d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.n<l0, we.l0> f4894e;

    /* renamed from: f, reason: collision with root package name */
    public static final we.m<we.l0> f4895f;

    /* renamed from: g, reason: collision with root package name */
    public static final we.n<k0, we.l0> f4896g;

    /* renamed from: h, reason: collision with root package name */
    public static final we.m<we.l0> f4897h;

    /* renamed from: i, reason: collision with root package name */
    public static final we.h<p0, j0.d> f4898i;

    /* renamed from: j, reason: collision with root package name */
    public static final we.h<af.b0, j0.c> f4899j;

    static {
        ef.a h10 = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f4891a = h10;
        ef.a h11 = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        b = h11;
        f4892c = we.g0.a(new g0.b() { // from class: cf.q
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                m0 r8;
                r8 = w.r((j0) xVar);
                return r8;
            }
        }, j0.class, m0.class);
        f4893d = we.f0.a(new f0.b() { // from class: cf.r
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                j0 m10;
                m10 = w.m((m0) p0Var);
                return m10;
            }
        }, h10, m0.class);
        f4894e = we.n.a(new n.b() { // from class: cf.s
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 t8;
                t8 = w.t((l0) lVar, d0Var);
                return t8;
            }
        }, l0.class, we.l0.class);
        f4895f = we.m.a(new m.b() { // from class: cf.t
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                l0 o8;
                o8 = w.o((we.l0) p0Var, d0Var);
                return o8;
            }
        }, h11, we.l0.class);
        f4896g = we.n.a(new n.b() { // from class: cf.u
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 s8;
                s8 = w.s((k0) lVar, d0Var);
                return s8;
            }
        }, k0.class, we.l0.class);
        f4897h = we.m.a(new m.b() { // from class: cf.v
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                k0 n10;
                n10 = w.n((we.l0) p0Var, d0Var);
                return n10;
            }
        }, h10, we.l0.class);
        f4898i = we.h.a().a(p0.RAW, j0.d.f4076e).a(p0.TINK, j0.d.b).a(p0.CRUNCHY, j0.d.f4074c).a(p0.LEGACY, j0.d.f4075d).b();
        f4899j = we.h.a().a(af.b0.SHA256, j0.c.b).a(af.b0.SHA384, j0.c.f4071c).a(af.b0.SHA512, j0.c.f4072d).b();
    }

    public static BigInteger g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return we.a.a(hVar.v());
    }

    public static ef.b h(com.google.crypto.tink.shaded.protobuf.h hVar, pe.d0 d0Var) {
        return ef.b.a(we.a.a(hVar.v()), d0Var);
    }

    public static com.google.crypto.tink.shaded.protobuf.h i(BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.h.e(we.a.b(bigInteger));
    }

    public static com.google.crypto.tink.shaded.protobuf.h j(ef.b bVar, pe.d0 d0Var) {
        return i(bVar.b(d0Var));
    }

    public static af.s0 k(j0 j0Var) {
        return af.s0.d0().C(f4899j.c(j0Var.c())).build();
    }

    public static u0 l(l0 l0Var) {
        return u0.i0().E(k(l0Var.e())).D(i(l0Var.d())).C(i(l0Var.e().e())).build();
    }

    public static j0 m(m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                r0 h02 = r0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return j0.b().b(f4899j.b(h02.e0().c0())).d(g(h02.f0())).c(h02.d0()).e(f4898i.b(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static k0 n(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            t0 r02 = t0.r0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (r02.p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            u0 n02 = r02.n0();
            if (n02.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger g10 = g(n02.f0());
            l0 a10 = l0.c().e(j0.b().b(f4899j.b(n02.g0().c0())).d(g(n02.e0())).c(g10.bitLength()).e(f4898i.b(l0Var.e())).a()).d(g10).c(l0Var.c()).a();
            pe.d0 b10 = pe.d0.b(d0Var);
            return k0.d().f(a10).d(h(r02.m0(), b10), h(r02.o0(), b10)).e(h(r02.j0(), b10)).c(h(r02.k0(), b10), h(r02.l0(), b10)).b(h(r02.i0(), b10)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    public static l0 o(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            u0 j02 = u0.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (j02.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger g10 = g(j02.f0());
            return l0.c().e(j0.b().b(f4899j.b(j02.g0().c0())).d(g(j02.e0())).c(g10.bitLength()).e(f4898i.b(l0Var.e())).a()).d(g10).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static void p() {
        q(we.d0.c());
    }

    public static void q(we.d0 d0Var) {
        d0Var.m(f4892c);
        d0Var.l(f4893d);
        d0Var.k(f4894e);
        d0Var.j(f4895f);
        d0Var.k(f4896g);
        d0Var.j(f4897h);
    }

    public static m0 r(j0 j0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").E(r0.g0().D(k(j0Var)).C(j0Var.d()).E(i(j0Var.e())).build().b()).C(f4898i.c(j0Var.f())).build());
    }

    public static we.l0 s(k0 k0Var, pe.d0 d0Var) {
        pe.d0 b10 = pe.d0.b(d0Var);
        return we.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", t0.q0().O(0).K(l(k0Var.c())).D(j(k0Var.k(), b10)).J(j(k0Var.i(), b10)).N(j(k0Var.j(), b10)).E(j(k0Var.g(), b10)).G(j(k0Var.h(), b10)).C(j(k0Var.e(), b10)).build().b(), f0.c.ASYMMETRIC_PRIVATE, f4898i.c(k0Var.f().f()), k0Var.a());
    }

    public static we.l0 t(l0 l0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", l(l0Var).b(), f0.c.ASYMMETRIC_PUBLIC, f4898i.c(l0Var.e().f()), l0Var.a());
    }
}
