package re;

import af.f0;
import java.security.GeneralSecurityException;
import qe.p;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30202a;
    public static final we.g0<qe.p, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30203c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<qe.l, we.l0> f30204d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30205e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30206a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30206a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30206a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30206a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30206a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f30202a = h10;
        b = we.g0.a(new g0.b() { // from class: re.f
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 k10;
                k10 = j.k((qe.p) xVar);
                return k10;
            }
        }, qe.p.class, we.m0.class);
        f30203c = we.f0.a(new f0.b() { // from class: re.g
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                qe.p g10;
                g10 = j.g((we.m0) p0Var);
                return g10;
            }
        }, h10, we.m0.class);
        f30204d = we.n.a(new n.b() { // from class: re.h
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 j10;
                j10 = j.j((qe.l) lVar, d0Var);
                return j10;
            }
        }, qe.l.class, we.l0.class);
        f30205e = we.m.a(new m.b() { // from class: re.i
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                qe.l f10;
                f10 = j.f((we.l0) p0Var, d0Var);
                return f10;
            }
        }, h10, we.l0.class);
    }

    public static af.k e(qe.p pVar) {
        if (pVar.e() == 16) {
            return af.k.d0().C(pVar.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(pVar.e())));
    }

    public static qe.l f(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            af.i g02 = af.i.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.l.b().e(qe.p.b().c(g02.c0().size()).b(g02.d0().c0()).d(16).e(m(l0Var.e())).a()).d(ef.c.a(g02.c0().v(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static qe.p g(we.m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                af.j f02 = af.j.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return qe.p.b().c(f02.c0()).b(f02.d0().c0()).d(16).e(m(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30203c);
        d0Var.k(f30204d);
        d0Var.j(f30205e);
    }

    public static we.l0 j(qe.l lVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesEaxKey", af.i.f0().D(e(lVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(lVar.c().d(pe.d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, l(lVar.e().f()), lVar.a());
    }

    public static we.m0 k(qe.p pVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesEaxKey").E(af.j.e0().D(e(pVar)).C(pVar.d()).build().b()).C(l(pVar.f())).build());
    }

    public static af.p0 l(p.c cVar) {
        if (p.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (p.c.f29732c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (p.c.f29733d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static p.c m(af.p0 p0Var) {
        int i10 = a.f30206a[p0Var.ordinal()];
        if (i10 == 1) {
            return p.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return p.c.f29732c;
        }
        if (i10 == 4) {
            return p.c.f29733d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
