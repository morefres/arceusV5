package ye;

import af.f0;
import af.h0;
import af.p0;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import pe.d0;
import pe.x;
import we.f0;
import we.g0;
import we.l0;
import we.m;
import we.m0;
import we.n;
import we.s0;
import xe.f;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f36581a;
    public static final g0<xe.f, m0> b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0<m0> f36582c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.n<xe.a, l0> f36583d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.m<l0> f36584e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36585a;

        static {
            int[] iArr = new int[p0.values().length];
            f36585a = iArr;
            try {
                iArr[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36585a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36585a[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36585a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a h10 = s0.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f36581a = h10;
        b = g0.a(new g0.b() { // from class: ye.a
            @Override // we.g0.b
            public final we.p0 a(x xVar) {
                m0 k10;
                k10 = e.k((xe.f) xVar);
                return k10;
            }
        }, xe.f.class, m0.class);
        f36582c = f0.a(new f0.b() { // from class: ye.b
            @Override // we.f0.b
            public final x a(we.p0 p0Var) {
                xe.f g10;
                g10 = e.g((m0) p0Var);
                return g10;
            }
        }, h10, m0.class);
        f36583d = we.n.a(new n.b() { // from class: ye.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, d0 d0Var) {
                l0 j10;
                j10 = e.j((xe.a) lVar, d0Var);
                return j10;
            }
        }, xe.a.class, l0.class);
        f36584e = we.m.a(new m.b() { // from class: ye.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, d0 d0Var) {
                xe.a f10;
                f10 = e.f((l0) p0Var, d0Var);
                return f10;
            }
        }, h10, l0.class);
    }

    public static af.c e(xe.f fVar) {
        return af.c.d0().C(fVar.c()).build();
    }

    public static xe.a f(l0 l0Var, d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            af.a g02 = af.a.g0(l0Var.g(), p.b());
            if (g02.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return xe.a.b().e(xe.f.b().b(g02.c0().size()).c(g02.d0().c0()).d(m(l0Var.e())).a()).c(ef.c.a(g02.c0().v(), d0.b(d0Var))).d(l0Var.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static xe.f g(m0 m0Var) {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                af.b f02 = af.b.f0(m0Var.d().g0(), p.b());
                return xe.f.b().b(f02.c0()).c(f02.d0().c0()).d(m(m0Var.d().e0())).a();
            } catch (b0 e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f36582c);
        d0Var.k(f36583d);
        d0Var.j(f36584e);
    }

    public static l0 j(xe.a aVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.AesCmacKey", af.a.f0().D(e(aVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(aVar.c().d(d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, l(aVar.e().f()), aVar.a());
    }

    public static m0 k(xe.f fVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.AesCmacKey").E(af.b.e0().D(e(fVar)).C(fVar.d()).build().b()).C(l(fVar.f())).build());
    }

    public static p0 l(f.c cVar) {
        if (f.c.b.equals(cVar)) {
            return p0.TINK;
        }
        if (f.c.f35535c.equals(cVar)) {
            return p0.CRUNCHY;
        }
        if (f.c.f35537e.equals(cVar)) {
            return p0.RAW;
        }
        if (f.c.f35536d.equals(cVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static f.c m(p0 p0Var) {
        int i10 = a.f36585a[p0Var.ordinal()];
        if (i10 == 1) {
            return f.c.b;
        }
        if (i10 == 2) {
            return f.c.f35535c;
        }
        if (i10 == 3) {
            return f.c.f35536d;
        }
        if (i10 == 4) {
            return f.c.f35537e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
