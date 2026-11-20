package qe;

import af.f0;
import java.security.GeneralSecurityException;
import qe.u0;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f29797a;
    public static final we.g0<u0, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f29798c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<t0, we.l0> f29799d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f29800e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29801a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f29801a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29801a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f29797a = h10;
        b = we.g0.a(new g0.b() { // from class: qe.v0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 k10;
                k10 = z0.k((u0) xVar);
                return k10;
            }
        }, u0.class, we.m0.class);
        f29798c = we.f0.a(new f0.b() { // from class: qe.w0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                u0 g10;
                g10 = z0.g((we.m0) p0Var);
                return g10;
            }
        }, h10, we.m0.class);
        f29799d = we.n.a(new n.b() { // from class: qe.x0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 j10;
                j10 = z0.j((t0) lVar, d0Var);
                return j10;
            }
        }, t0.class, we.l0.class);
        f29800e = we.m.a(new m.b() { // from class: qe.y0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                t0 e10;
                e10 = z0.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static t0 e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            af.n0 e02 = af.n0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return t0.b(f(e02.b0(), l0Var.e()), l0Var.c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + e02);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    public static u0 f(af.o0 o0Var, af.p0 p0Var) {
        u0.c cVar;
        pe.x a10 = pe.h0.a(af.h0.h0().D(o0Var.d0().f0()).E(o0Var.d0().g0()).C(af.p0.RAW).build().n());
        if (a10 instanceof u) {
            cVar = u0.c.b;
        } else if (a10 instanceof e0) {
            cVar = u0.c.f29777d;
        } else if (a10 instanceof t1) {
            cVar = u0.c.f29776c;
        } else if (a10 instanceof k) {
            cVar = u0.c.f29778e;
        } else if (a10 instanceof p) {
            cVar = u0.c.f29779f;
        } else {
            if (!(a10 instanceof z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + a10);
            }
            cVar = u0.c.f29780g;
        }
        return u0.b().f(n(p0Var)).e(o0Var.e0()).c((c) a10).d(cVar).a();
    }

    public static u0 g(we.m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(af.o0.g0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()), m0Var.d().e0());
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29798c);
        d0Var.k(f29799d);
        d0Var.j(f29800e);
    }

    public static we.l0 j(t0 t0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", af.n0.d0().C(l(t0Var.d())).build().b(), f0.c.REMOTE, m(t0Var.d().e()), t0Var.a());
    }

    public static we.m0 k(u0 u0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").E(l(u0Var).b()).C(m(u0Var.e())).build());
    }

    public static af.o0 l(u0 u0Var) {
        try {
            return af.o0.f0().D(u0Var.d()).C(af.h0.j0(pe.h0.b(u0Var.c()), com.google.crypto.tink.shaded.protobuf.p.b())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static af.p0 m(u0.d dVar) {
        if (u0.d.b.equals(dVar)) {
            return af.p0.TINK;
        }
        if (u0.d.f29782c.equals(dVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static u0.d n(af.p0 p0Var) {
        int i10 = a.f29801a[p0Var.ordinal()];
        if (i10 == 1) {
            return u0.d.b;
        }
        if (i10 == 2) {
            return u0.d.f29782c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
