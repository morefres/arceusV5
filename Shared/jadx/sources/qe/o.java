package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qe.p;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<l, pe.a> f29721a = we.h0.b(new h0.b() { // from class: qe.m
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.b.c((l) lVar);
        }
    }, l.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(c(), pe.a.class, f0.c.SYMMETRIC, af.i.h0());

    /* renamed from: c, reason: collision with root package name */
    public static final w.a<p> f29722c = new w.a() { // from class: qe.n
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            l b10;
            b10 = o.b((p) xVar, num);
            return b10;
        }
    };

    public static l b(p pVar, Integer num) {
        f(pVar);
        return l.b().e(pVar).c(num).d(ef.c.b(pVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", j1.f29677c);
        p.b d10 = p.b().b(16).c(16).d(16);
        p.c cVar = p.c.f29733d;
        hashMap.put("AES128_EAX_RAW", d10.e(cVar).a());
        hashMap.put("AES256_EAX", j1.f29678d);
        hashMap.put("AES256_EAX_RAW", p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        re.j.h();
        we.a0.c().d(f29721a);
        we.z.a().c(d());
        we.w.f().b(f29722c, p.class);
        we.l.d().g(b, z10);
    }

    public static final void f(p pVar) {
        if (pVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
