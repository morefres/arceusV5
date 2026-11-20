package qe;

import af.f0;
import java.security.GeneralSecurityException;
import qe.n0;
import we.f0;
import we.g0;
import we.m;
import we.n;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f29743a;
    public static final we.g0<n0, we.m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f29744c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<m0, we.l0> f29745d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f29746e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29747a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f29747a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29747a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a h10 = we.s0.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f29743a = h10;
        b = we.g0.a(new g0.b() { // from class: qe.o0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                we.m0 j10;
                j10 = s0.j((n0) xVar);
                return j10;
            }
        }, n0.class, we.m0.class);
        f29744c = we.f0.a(new f0.b() { // from class: qe.p0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                n0 f10;
                f10 = s0.f((we.m0) p0Var);
                return f10;
            }
        }, h10, we.m0.class);
        f29745d = we.n.a(new n.b() { // from class: qe.q0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                we.l0 i10;
                i10 = s0.i((m0) lVar, d0Var);
                return i10;
            }
        }, m0.class, we.l0.class);
        f29746e = we.m.a(new m.b() { // from class: qe.r0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                m0 e10;
                e10 = s0.e((we.l0) p0Var, d0Var);
                return e10;
            }
        }, h10, we.l0.class);
    }

    public static m0 e(we.l0 l0Var, pe.d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            af.l0 e02 = af.l0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() == 0) {
                return m0.b(n0.b(e02.b0().c0(), l(l0Var.e())), l0Var.c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + e02);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    public static n0 f(we.m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return n0.b(af.m0.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).c0(), l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29744c);
        d0Var.k(f29745d);
        d0Var.j(f29746e);
    }

    public static we.l0 i(m0 m0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", af.l0.d0().C(af.m0.d0().C(m0Var.d().c()).build()).build().b(), f0.c.REMOTE, k(m0Var.d().d()), m0Var.a());
    }

    public static we.m0 j(n0 n0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsAeadKey").E(af.m0.d0().C(n0Var.c()).build().b()).C(k(n0Var.d())).build());
    }

    public static af.p0 k(n0.a aVar) {
        if (n0.a.b.equals(aVar)) {
            return af.p0.TINK;
        }
        if (n0.a.f29718c.equals(aVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static n0.a l(af.p0 p0Var) {
        int i10 = a.f29747a[p0Var.ordinal()];
        if (i10 == 1) {
            return n0.a.b;
        }
        if (i10 == 2) {
            return n0.a.f29718c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
