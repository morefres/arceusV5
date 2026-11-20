package cf;

import af.f0;
import af.h0;
import af.p0;
import af.v0;
import af.w0;
import af.x0;
import af.y0;
import bf.r0;
import bf.s0;
import bf.t0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import we.f0;
import we.g0;
import we.l0;
import we.m;
import we.m0;
import we.n;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f4843a;
    public static final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.g0<r0, m0> f4844c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4845d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.n<t0, l0> f4846e;

    /* renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4847f;

    /* renamed from: g, reason: collision with root package name */
    public static final we.n<s0, l0> f4848g;

    /* renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4849h;

    /* renamed from: i, reason: collision with root package name */
    public static final we.h<p0, r0.d> f4850i;

    /* renamed from: j, reason: collision with root package name */
    public static final we.h<af.b0, r0.c> f4851j;

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f4843a = h10;
        ef.a h11 = we.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        b = h11;
        f4844c = we.g0.a(new g0.b() { // from class: cf.y
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                m0 r8;
                r8 = e0.r((r0) xVar);
                return r8;
            }
        }, r0.class, m0.class);
        f4845d = we.f0.a(new f0.b() { // from class: cf.z
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                r0 m10;
                m10 = e0.m((m0) p0Var);
                return m10;
            }
        }, h10, m0.class);
        f4846e = we.n.a(new n.b() { // from class: cf.a0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 t8;
                t8 = e0.t((t0) lVar, d0Var);
                return t8;
            }
        }, t0.class, l0.class);
        f4847f = we.m.a(new m.b() { // from class: cf.b0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                t0 o8;
                o8 = e0.o((l0) p0Var, d0Var);
                return o8;
            }
        }, h11, l0.class);
        f4848g = we.n.a(new n.b() { // from class: cf.c0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 s8;
                s8 = e0.s((s0) lVar, d0Var);
                return s8;
            }
        }, s0.class, l0.class);
        f4849h = we.m.a(new m.b() { // from class: cf.d0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                s0 n10;
                n10 = e0.n((l0) p0Var, d0Var);
                return n10;
            }
        }, h10, l0.class);
        f4850i = we.h.a().a(p0.RAW, r0.d.f4126e).a(p0.TINK, r0.d.b).a(p0.CRUNCHY, r0.d.f4124c).a(p0.LEGACY, r0.d.f4125d).b();
        f4851j = we.h.a().a(af.b0.SHA256, r0.c.b).a(af.b0.SHA384, r0.c.f4121c).a(af.b0.SHA512, r0.c.f4122d).b();
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

    public static w0 k(r0 r0Var) {
        w0.b h02 = w0.h0();
        we.h<af.b0, r0.c> hVar = f4851j;
        return h02.E(hVar.c(r0Var.g())).C(hVar.c(r0Var.c())).D(r0Var.f()).build();
    }

    public static y0 l(t0 t0Var) {
        return y0.j0().E(k(t0Var.e())).D(i(t0Var.d())).C(i(t0Var.e().e())).G(0).build();
    }

    public static r0 m(m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            v0 h02 = v0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            r0.b b10 = r0.b();
            we.h<af.b0, r0.c> hVar = f4851j;
            return b10.f(hVar.b(h02.e0().g0())).b(hVar.b(h02.e0().e0())).d(g(h02.f0())).c(h02.d0()).e(h02.e0().f0()).g(f4850i.b(m0Var.d().e0())).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static s0 n(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            x0 r02 = x0.r0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (r02.p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            y0 n02 = r02.n0();
            if (n02.i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger g10 = g(n02.g0());
            int bitLength = g10.bitLength();
            BigInteger g11 = g(n02.f0());
            r0.b b10 = r0.b();
            we.h<af.b0, r0.c> hVar = f4851j;
            t0 a10 = t0.c().e(b10.f(hVar.b(n02.h0().g0())).b(hVar.b(n02.h0().e0())).d(g11).c(bitLength).e(n02.h0().f0()).g(f4850i.b(l0Var.e())).a()).d(g10).c(l0Var.c()).a();
            pe.d0 b11 = pe.d0.b(d0Var);
            return s0.d().f(a10).d(h(r02.m0(), b11), h(r02.o0(), b11)).e(h(r02.j0(), b11)).c(h(r02.k0(), b11), h(r02.l0(), b11)).b(h(r02.i0(), b11)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    public static t0 o(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            y0 k02 = y0.k0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (k02.i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger g10 = g(k02.g0());
            int bitLength = g10.bitLength();
            r0.b b10 = r0.b();
            we.h<af.b0, r0.c> hVar = f4851j;
            return t0.c().e(b10.f(hVar.b(k02.h0().g0())).b(hVar.b(k02.h0().e0())).d(g(k02.f0())).c(bitLength).e(k02.h0().f0()).g(f4850i.b(l0Var.e())).a()).d(g10).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static void p() {
        q(we.d0.c());
    }

    public static void q(we.d0 d0Var) {
        d0Var.m(f4844c);
        d0Var.l(f4845d);
        d0Var.k(f4846e);
        d0Var.j(f4847f);
        d0Var.k(f4848g);
        d0Var.j(f4849h);
    }

    public static m0 r(r0 r0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").E(v0.g0().D(k(r0Var)).C(r0Var.d()).E(i(r0Var.e())).build().b()).C(f4850i.c(r0Var.h())).build());
    }

    public static l0 s(s0 s0Var, pe.d0 d0Var) {
        pe.d0 b10 = pe.d0.b(d0Var);
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", x0.q0().O(0).K(l(s0Var.c())).D(j(s0Var.k(), b10)).J(j(s0Var.i(), b10)).N(j(s0Var.j(), b10)).E(j(s0Var.g(), b10)).G(j(s0Var.h(), b10)).C(j(s0Var.e(), b10)).build().b(), f0.c.ASYMMETRIC_PRIVATE, f4850i.c(s0Var.f().h()), s0Var.a());
    }

    public static l0 t(t0 t0Var, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", l(t0Var).b(), f0.c.ASYMMETRIC_PUBLIC, f4850i.c(t0Var.e().h()), t0Var.a());
    }
}
