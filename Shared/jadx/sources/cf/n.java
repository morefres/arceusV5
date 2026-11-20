package cf;

import af.f0;
import af.h0;
import af.p0;
import bf.i;
import java.security.GeneralSecurityException;
import we.f0;
import we.g0;
import we.l0;
import we.m;
import we.m0;
import we.n;
import we.s0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f4878a;
    public static final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.g0<bf.i, m0> f4879c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4880d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.n<bf.o, l0> f4881e;

    /* renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4882f;

    /* renamed from: g, reason: collision with root package name */
    public static final we.n<bf.j, l0> f4883g;

    /* renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4884h;

    /* renamed from: i, reason: collision with root package name */
    public static final we.h<p0, i.a> f4885i;

    static {
        ef.a h10 = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f4878a = h10;
        ef.a h11 = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        b = h11;
        f4879c = we.g0.a(new g0.b() { // from class: cf.h
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                m0 m10;
                m10 = n.m((bf.i) xVar);
                return m10;
            }
        }, bf.i.class, m0.class);
        f4880d = we.f0.a(new f0.b() { // from class: cf.i
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                bf.i h12;
                h12 = n.h((m0) p0Var);
                return h12;
            }
        }, h10, m0.class);
        f4881e = we.n.a(new n.b() { // from class: cf.j
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 o8;
                o8 = n.o((bf.o) lVar, d0Var);
                return o8;
            }
        }, bf.o.class, l0.class);
        f4882f = we.m.a(new m.b() { // from class: cf.k
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                bf.o j10;
                j10 = n.j((l0) p0Var, d0Var);
                return j10;
            }
        }, h11, l0.class);
        f4883g = we.n.a(new n.b() { // from class: cf.l
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                l0 n10;
                n10 = n.n((bf.j) lVar, d0Var);
                return n10;
            }
        }, bf.j.class, l0.class);
        f4884h = we.m.a(new m.b() { // from class: cf.m
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                bf.j i10;
                i10 = n.i((l0) p0Var, d0Var);
                return i10;
            }
        }, h10, l0.class);
        f4885i = we.h.a().a(p0.RAW, i.a.f4057e).a(p0.TINK, i.a.b).a(p0.CRUNCHY, i.a.f4055c).a(p0.LEGACY, i.a.f4056d).b();
    }

    public static af.y g(bf.o oVar) {
        return af.y.e0().C(com.google.crypto.tink.shaded.protobuf.h.e(oVar.f().d())).build();
    }

    public static bf.i h(m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            if (af.w.c0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).b0() == 0) {
                return bf.i.b(f4885i.b(m0Var.d().e0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    public static bf.j i(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            af.x g02 = af.x.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af.y d02 = g02.d0();
            if (d02.d0() == 0) {
                return bf.j.d(bf.o.c(f4885i.b(l0Var.e()), ef.a.a(d02.c0().v()), l0Var.c()), ef.c.a(g02.c0().v(), pe.d0.b(d0Var)));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    public static bf.o j(l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            af.y f02 = af.y.f0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (f02.d0() == 0) {
                return bf.o.c(f4885i.b(l0Var.e()), ef.a.a(f02.c0().v()), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static void k() {
        l(we.d0.c());
    }

    public static void l(we.d0 d0Var) {
        d0Var.m(f4879c);
        d0Var.l(f4880d);
        d0Var.k(f4881e);
        d0Var.j(f4882f);
        d0Var.k(f4883g);
        d0Var.j(f4884h);
    }

    public static m0 m(bf.i iVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").E(af.w.a0().b()).C(f4885i.c(iVar.c())).build());
    }

    public static l0 n(bf.j jVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", af.x.f0().D(g(jVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(jVar.f().d(pe.d0.b(d0Var)))).build().b(), f0.c.ASYMMETRIC_PRIVATE, f4885i.c(jVar.e().c()), jVar.a());
    }

    public static l0 o(bf.o oVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", g(oVar).b(), f0.c.ASYMMETRIC_PUBLIC, f4885i.c(oVar.e().c()), oVar.a());
    }
}
