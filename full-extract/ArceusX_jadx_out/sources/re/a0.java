package re;

import af.f0;
import java.security.GeneralSecurityException;
import qe.e0;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f30187a;
    public static final we.g0<qe.e0, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30188c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<qe.a0, we.l0> f30189d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30190e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30191a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30191a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30191a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30191a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30191a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f30187a = h10;
        b = we.g0.a(new g0.b() { // from class: re.w
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 j10;
                j10 = a0.j((qe.e0) xVar);
                return j10;
            }
        }, qe.e0.class, we.m0.class);
        f30188c = we.f0.a(new f0.b() { // from class: re.x
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                qe.e0 f10;
                f10 = a0.f((we.m0) p0Var);
                return f10;
            }
        }, h10, we.m0.class);
        f30189d = we.n.a(new n.b() { // from class: re.y
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 i10;
                i10 = a0.i((qe.a0) lVar, d0Var);
                return i10;
            }
        }, qe.a0.class, we.l0.class);
        f30190e = we.m.a(new m.b() { // from class: re.z
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                qe.a0 e10;
                e10 = a0.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static qe.a0 e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            af.p e02 = af.p.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return qe.a0.b(l(l0Var.e()), ef.c.a(e02.b0().v(), pe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static qe.e0 f(we.m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                af.q.b0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return qe.e0.b(l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30188c);
        d0Var.k(f30189d);
        d0Var.j(f30190e);
    }

    public static we.l0 i(qe.a0 a0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", af.p.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(a0Var.c().d(pe.d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, k(a0Var.f().c()), a0Var.a());
    }

    public static we.m0 j(qe.e0 e0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").E(af.q.a0().b()).C(k(e0Var.c())).build());
    }

    public static af.p0 k(e0.a aVar) {
        if (e0.a.b.equals(aVar)) {
            return af.p0.TINK;
        }
        if (e0.a.f29656c.equals(aVar)) {
            return af.p0.CRUNCHY;
        }
        if (e0.a.f29657d.equals(aVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static e0.a l(af.p0 p0Var) {
        int i10 = a.f30191a[p0Var.ordinal()];
        if (i10 == 1) {
            return e0.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return e0.a.f29656c;
        }
        if (i10 == 4) {
            return e0.a.f29657d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
