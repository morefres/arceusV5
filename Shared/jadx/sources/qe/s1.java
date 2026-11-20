package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qe.t1;
import ue.b;
import we.h0;
import we.w;
import we.x;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<p1, pe.a> f29748a = we.h0.b(new h0.b() { // from class: qe.q1
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            pe.a b10;
            b10 = s1.b((p1) lVar);
            return b10;
        }
    }, p1.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(d(), pe.a.class, f0.c.SYMMETRIC, af.c1.f0());

    /* renamed from: c, reason: collision with root package name */
    public static final x.a<t1> f29749c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final w.a<t1> f29750d = new w.a() { // from class: qe.r1
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return s1.c((t1) xVar, num);
        }
    };

    public static pe.a b(p1 p1Var) {
        return re.r0.e() ? re.r0.c(p1Var) : df.b0.c(p1Var);
    }

    public static p1 c(t1 t1Var, Integer num) {
        return p1.b(t1Var.c(), ef.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static Map<String, pe.x> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", t1.b(t1.a.b));
        hashMap.put("XCHACHA20_POLY1305_RAW", t1.b(t1.a.f29759d));
        return Collections.unmodifiableMap(hashMap);
    }

    public static void f(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        re.w0.g();
        we.a0.c().d(f29748a);
        we.z.a().c(e());
        we.w.f().b(f29750d, t1.class);
        we.x.b().a(f29749c, t1.class);
        we.l.d().g(b, z10);
    }
}
