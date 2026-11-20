package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qe.e0;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<a0, pe.a> f29650a = we.h0.b(new h0.b() { // from class: qe.b0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            pe.a b10;
            b10 = d0.b((a0) lVar);
            return b10;
        }
    }, a0.class, pe.a.class);
    public static final w.a<e0> b = new w.a() { // from class: qe.c0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return d0.c((e0) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final pe.m<pe.a> f29651c = we.o.e(d(), pe.a.class, f0.c.SYMMETRIC, af.p.f0());

    public static pe.a b(a0 a0Var) {
        return re.v.f() ? re.v.d(a0Var) : df.f.c(a0Var);
    }

    public static a0 c(e0 e0Var, Integer num) {
        return a0.b(e0Var.c(), ef.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static Map<String, pe.x> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", e0.b(e0.a.b));
        hashMap.put("CHACHA20_POLY1305_RAW", e0.b(e0.a.f29657d));
        return Collections.unmodifiableMap(hashMap);
    }

    public static void f(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        re.a0.g();
        we.a0.c().d(f29650a);
        we.w.f().b(b, e0.class);
        we.z.a().c(e());
        we.l.d().g(f29651c, z10);
    }
}
