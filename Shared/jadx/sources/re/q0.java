package re;

import af.a1;
import af.b1;
import af.f0;
import af.z0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import qe.k1;
import qe.o1;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30217a;
    public static final we.g0<o1, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30218c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<k1, we.l0> f30219d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30220e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30221a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30221a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30221a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f30217a = h10;
        b = we.g0.a(new g0.b() { // from class: re.m0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 j10;
                j10 = q0.j((o1) xVar);
                return j10;
            }
        }, o1.class, we.m0.class);
        f30218c = we.f0.a(new f0.b() { // from class: re.n0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                o1 f10;
                f10 = q0.f((we.m0) p0Var);
                return f10;
            }
        }, h10, we.m0.class);
        f30219d = we.n.a(new n.b() { // from class: re.o0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 i10;
                i10 = q0.i((k1) lVar, d0Var);
                return i10;
            }
        }, k1.class, we.l0.class);
        f30220e = we.m.a(new m.b() { // from class: re.p0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                k1 e10;
                e10 = q0.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static k1 e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            z0 g02 = z0.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (g02.c0().size() == 32) {
                return k1.b(o1.b(l(l0Var.e()), g02.d0().c0()), ef.c.a(g02.c0().v(), pe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static o1 f(we.m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            a1 e02 = a1.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return o1.b(l(m0Var.d().e0()), e02.b0().c0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30218c);
        d0Var.k(f30219d);
        d0Var.j(f30220e);
    }

    public static we.l0 i(k1 k1Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", z0.f0().C(com.google.crypto.tink.shaded.protobuf.h.e(k1Var.c().d(pe.d0.b(d0Var)))).D(b1.d0().C(k1Var.f().c()).build()).build().b(), f0.c.SYMMETRIC, k(k1Var.f().d()), k1Var.a());
    }

    public static we.m0 j(o1 o1Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.XAesGcmKey").E(a1.d0().C(b1.d0().C(o1Var.c()).build()).build().b()).C(k(o1Var.d())).build());
    }

    public static af.p0 k(o1.a aVar) {
        if (Objects.equals(aVar, o1.a.b)) {
            return af.p0.TINK;
        }
        if (Objects.equals(aVar, o1.a.f29724c)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static o1.a l(af.p0 p0Var) {
        int i10 = a.f30221a[p0Var.ordinal()];
        if (i10 == 1) {
            return o1.a.b;
        }
        if (i10 == 2) {
            return o1.a.f29724c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
