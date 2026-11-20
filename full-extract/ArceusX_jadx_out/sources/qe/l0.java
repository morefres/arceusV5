package qe;

import af.f0;
import java.security.GeneralSecurityException;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pe.m<pe.a> f29713a = we.o.e(d(), pe.a.class, f0.c.SYMMETRIC, af.n0.f0());
    public static final w.a<u0> b = new w.a() { // from class: qe.j0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            t0 e10;
            e10 = l0.e((u0) xVar, num);
            return e10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final we.h0<t0, pe.a> f29714c = we.h0.b(new h0.b() { // from class: qe.k0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            pe.a c10;
            c10 = l0.c((t0) lVar);
            return c10;
        }
    }, t0.class, pe.a.class);

    public static pe.a c(t0 t0Var) {
        String d10 = t0Var.d().d();
        return re.j0.c(i0.d(t0Var.d().c(), pe.u.a(d10).b(d10)), t0Var.c());
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public static t0 e(u0 u0Var, Integer num) {
        return t0.b(u0Var, num);
    }

    public static void f(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        z0.h();
        we.w.f().b(b, u0.class);
        we.a0.c().d(f29714c);
        we.l.d().g(f29713a, z10);
    }
}
