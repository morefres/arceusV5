package ye;

import af.b0;
import af.c0;
import af.e0;
import af.f0;
import af.h0;
import af.p0;
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
import xe.o;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ef.a f36588a;
    public static final we.h<p0, o.d> b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.h<b0, o.c> f36589c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0<o, m0> f36590d;

    /* renamed from: e, reason: collision with root package name */
    public static final f0<m0> f36591e;

    /* renamed from: f, reason: collision with root package name */
    public static final we.n<xe.i, l0> f36592f;

    /* renamed from: g, reason: collision with root package name */
    public static final we.m<l0> f36593g;

    static {
        ef.a h10 = s0.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f36588a = h10;
        b = we.h.a().a(p0.RAW, o.d.f35564e).a(p0.TINK, o.d.b).a(p0.LEGACY, o.d.f35563d).a(p0.CRUNCHY, o.d.f35562c).b();
        f36589c = we.h.a().a(b0.SHA1, o.c.b).a(b0.SHA224, o.c.f35557c).a(b0.SHA256, o.c.f35558d).a(b0.SHA384, o.c.f35559e).a(b0.SHA512, o.c.f35560f).b();
        f36590d = g0.a(new g0.b() { // from class: ye.i
            @Override // we.g0.b
            public final we.p0 a(x xVar) {
                m0 k10;
                k10 = m.k((o) xVar);
                return k10;
            }
        }, o.class, m0.class);
        f36591e = f0.a(new f0.b() { // from class: ye.j
            @Override // we.f0.b
            public final x a(we.p0 p0Var) {
                o g10;
                g10 = m.g((m0) p0Var);
                return g10;
            }
        }, h10, m0.class);
        f36592f = we.n.a(new n.b() { // from class: ye.k
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, d0 d0Var) {
                l0 j10;
                j10 = m.j((xe.i) lVar, d0Var);
                return j10;
            }
        }, xe.i.class, l0.class);
        f36593g = we.m.a(new m.b() { // from class: ye.l
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, d0 d0Var) {
                xe.i f10;
                f10 = m.f((l0) p0Var, d0Var);
                return f10;
            }
        }, h10, l0.class);
    }

    public static e0 e(o oVar) {
        return e0.f0().D(oVar.c()).C(f36589c.c(oVar.d())).build();
    }

    public static xe.i f(l0 l0Var, d0 d0Var) {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            c0 h02 = c0.h0(l0Var.g(), p.b());
            if (h02.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return xe.i.b().e(o.b().c(h02.d0().size()).d(h02.e0().e0()).b(f36589c.b(h02.e0().d0())).e(b.b(l0Var.e())).a()).d(ef.c.a(h02.d0().v(), d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static o g(m0 m0Var) {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.d0 h02 = af.d0.h0(m0Var.d().g0(), p.b());
            if (h02.f0() == 0) {
                return o.b().c(h02.d0()).d(h02.e0().e0()).b(f36589c.b(h02.e0().d0())).e(b.b(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + h02.f0());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(f36590d);
        d0Var.l(f36591e);
        d0Var.k(f36592f);
        d0Var.j(f36593g);
    }

    public static l0 j(xe.i iVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.HmacKey", c0.g0().D(e(iVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(iVar.c().d(d0.b(d0Var)))).build().b(), f0.c.SYMMETRIC, b.c(iVar.e().g()), iVar.a());
    }

    public static m0 k(o oVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.HmacKey").E(af.d0.g0().D(e(oVar)).C(oVar.e()).build().b()).C(b.c(oVar.g())).build());
    }
}
