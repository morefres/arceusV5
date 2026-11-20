package re;

import af.f0;
import java.security.GeneralSecurityException;
import qe.u;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30212a;
    public static final we.g0<qe.u, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30213c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<qe.q, we.l0> f30214d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30215e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30216a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30216a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30216a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30216a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30216a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f30212a = h10;
        b = we.g0.a(new g0.b() { // from class: re.l
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 j10;
                j10 = p.j((qe.u) xVar);
                return j10;
            }
        }, qe.u.class, we.m0.class);
        f30213c = we.f0.a(new f0.b() { // from class: re.m
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                qe.u f10;
                f10 = p.f((we.m0) p0Var);
                return f10;
            }
        }, h10, we.m0.class);
        f30214d = we.n.a(new n.b() { // from class: re.n
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 i10;
                i10 = p.i((qe.q) lVar, d0Var);
                return i10;
            }
        }, qe.q.class, we.l0.class);
        f30215e = we.m.a(new m.b() { // from class: re.o
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                qe.q e10;
                e10 = p.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static qe.q e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            af.l e02 = af.l.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.q.b().e(qe.u.b().c(e02.b0().size()).b(12).d(16).e(l(l0Var.e())).a()).d(ef.c.a(e02.b0().v(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static qe.u f(we.m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.m e02 = af.m.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return qe.u.b().c(e02.b0()).b(12).d(16).e(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30213c);
        d0Var.k(f30214d);
        d0Var.j(f30215e);
    }

    public static we.l0 i(qe.q qVar, pe.d0 d0Var) {
        m(qVar.e());
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesGcmKey", af.l.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(qVar.c().d(pe.d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, k(qVar.e().f()), qVar.a());
    }

    public static we.m0 j(qe.u uVar) {
        m(uVar);
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmKey").E(af.m.d0().C(uVar.d()).build().b()).C(k(uVar.f())).build());
    }

    public static af.p0 k(u.c cVar) {
        if (u.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (u.c.f29767c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (u.c.f29768d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static u.c l(af.p0 p0Var) {
        int i10 = a.f30216a[p0Var.ordinal()];
        if (i10 == 1) {
            return u.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return u.c.f29767c;
        }
        if (i10 == 4) {
            return u.c.f29768d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }

    public static void m(qe.u uVar) {
        if (uVar.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(uVar.e())));
        }
        if (uVar.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(uVar.c())));
        }
    }
}
