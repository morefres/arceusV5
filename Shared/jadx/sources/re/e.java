package re;

import af.f0;
import java.security.GeneralSecurityException;
import qe.k;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30194a;
    public static final we.g0<qe.k, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30195c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<qe.f, we.l0> f30196d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30197e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30198a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[af.b0.values().length];
            b = iArr;
            try {
                iArr[af.b0.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[af.b0.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[af.b0.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[af.b0.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[af.b0.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[af.p0.values().length];
            f30198a = iArr2;
            try {
                iArr2[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30198a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30198a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30198a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f30194a = h10;
        b = we.g0.a(new g0.b() { // from class: re.a
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 k10;
                k10 = e.k((qe.k) xVar);
                return k10;
            }
        }, qe.k.class, we.m0.class);
        f30195c = we.f0.a(new f0.b() { // from class: re.b
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                qe.k g10;
                g10 = e.g((we.m0) p0Var);
                return g10;
            }
        }, h10, we.m0.class);
        f30196d = we.n.a(new n.b() { // from class: re.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 j10;
                j10 = e.j((qe.f) lVar, d0Var);
                return j10;
            }
        }, qe.f.class, we.l0.class);
        f30197e = we.m.a(new m.b() { // from class: re.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                qe.f f10;
                f10 = e.f((we.l0) p0Var, d0Var);
                return f10;
            }
        }, h10, we.l0.class);
    }

    public static af.e0 e(qe.k kVar) {
        return af.e0.f0().D(kVar.g()).C(m(kVar.d())).build();
    }

    public static qe.f f(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            af.d g02 = af.d.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (g02.c0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (g02.d0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return qe.f.b().f(qe.k.b().b(g02.c0().d0().size()).d(g02.d0().d0().size()).e(g02.c0().e0().c0()).f(g02.d0().e0().e0()).c(l(g02.d0().e0().d0())).g(o(l0Var.e())).a()).c(ef.c.a(g02.c0().d0().v(), pe.d0.b(d0Var))).d(ef.c.a(g02.d0().d0().v(), pe.d0.b(d0Var))).e(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static qe.k g(we.m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.e f02 = af.e.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (f02.d0().f0() == 0) {
                return qe.k.b().b(f02.c0().d0()).d(f02.d0().d0()).e(f02.c0().e0().c0()).f(f02.d0().e0().e0()).c(l(f02.d0().e0().d0())).g(o(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30195c);
        d0Var.k(f30196d);
        d0Var.j(f30197e);
    }

    public static we.l0 j(qe.f fVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", af.d.f0().C(af.f.g0().D(af.h.d0().C(fVar.f().f()).build()).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.c().d(pe.d0.b(d0Var)))).build()).D(af.c0.g0().D(e(fVar.f())).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.d().d(pe.d0.b(d0Var)))).build()).build().b(), f0.c.SYMMETRIC, n(fVar.f().h()), fVar.a());
    }

    public static we.m0 k(qe.k kVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").E(af.e.e0().C(af.g.f0().D(af.h.d0().C(kVar.f()).build()).C(kVar.c()).build()).D(af.d0.g0().D(e(kVar)).C(kVar.e()).build()).build().b()).C(n(kVar.h())).build());
    }

    public static k.c l(af.b0 b0Var) {
        int i10 = a.b[b0Var.ordinal()];
        if (i10 == 1) {
            return k.c.b;
        }
        if (i10 == 2) {
            return k.c.f29697c;
        }
        if (i10 == 3) {
            return k.c.f29698d;
        }
        if (i10 == 4) {
            return k.c.f29699e;
        }
        if (i10 == 5) {
            return k.c.f29700f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static af.b0 m(k.c cVar) {
        if (k.c.b.equals(cVar)) {
            return af.b0.SHA1;
        }
        if (k.c.f29697c.equals(cVar)) {
            return af.b0.SHA224;
        }
        if (k.c.f29698d.equals(cVar)) {
            return af.b0.SHA256;
        }
        if (k.c.f29699e.equals(cVar)) {
            return af.b0.SHA384;
        }
        if (k.c.f29700f.equals(cVar)) {
            return af.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    public static af.p0 n(k.d dVar) {
        if (k.d.b.equals(dVar)) {
            return af.p0.TINK;
        }
        if (k.d.f29702c.equals(dVar)) {
            return af.p0.CRUNCHY;
        }
        if (k.d.f29703d.equals(dVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static k.d o(af.p0 p0Var) {
        int i10 = a.f30198a[p0Var.ordinal()];
        if (i10 == 1) {
            return k.d.b;
        }
        if (i10 == 2 || i10 == 3) {
            return k.d.f29702c;
        }
        if (i10 == 4) {
            return k.d.f29703d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
