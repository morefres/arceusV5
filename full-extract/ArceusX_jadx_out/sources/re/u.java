package re;

import af.f0;
import java.security.GeneralSecurityException;
import qe.z;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30224a;
    public static final we.g0<qe.z, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30225c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<qe.v, we.l0> f30226d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30227e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30228a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30228a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30228a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30228a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30228a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f30224a = h10;
        b = we.g0.a(new g0.b() { // from class: re.q
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 j10;
                j10 = u.j((qe.z) xVar);
                return j10;
            }
        }, qe.z.class, we.m0.class);
        f30225c = we.f0.a(new f0.b() { // from class: re.r
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                qe.z f10;
                f10 = u.f((we.m0) p0Var);
                return f10;
            }
        }, h10, we.m0.class);
        f30226d = we.n.a(new n.b() { // from class: re.s
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 i10;
                i10 = u.i((qe.v) lVar, d0Var);
                return i10;
            }
        }, qe.v.class, we.l0.class);
        f30227e = we.m.a(new m.b() { // from class: re.t
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                qe.v e10;
                e10 = u.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static qe.v e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            af.n e02 = af.n.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.v.b().e(qe.z.b().b(e02.b0().size()).c(l(l0Var.e())).a()).d(ef.c.a(e02.b0().v(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static qe.z f(we.m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.o e02 = af.o.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return qe.z.b().b(e02.b0()).c(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30225c);
        d0Var.k(f30226d);
        d0Var.j(f30227e);
    }

    public static we.l0 i(qe.v vVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", af.n.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(vVar.c().d(pe.d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, k(vVar.e().d()), vVar.a());
    }

    public static we.m0 j(qe.z zVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmSivKey").E(af.o.d0().C(zVar.c()).build().b()).C(k(zVar.d())).build());
    }

    public static af.p0 k(z.c cVar) {
        if (z.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (z.c.f29794c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (z.c.f29795d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static z.c l(af.p0 p0Var) {
        int i10 = a.f30228a[p0Var.ordinal()];
        if (i10 == 1) {
            return z.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return z.c.f29794c;
        }
        if (i10 == 4) {
            return z.c.f29795d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
