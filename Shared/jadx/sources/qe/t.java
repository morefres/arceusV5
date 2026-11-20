package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qe.u;
import ue.b;
import we.h0;
import we.w;
import we.x;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<q, pe.a> f29751a = we.h0.b(new h0.b() { // from class: qe.r
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.c.c((q) lVar);
        }
    }, q.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(c(), pe.a.class, f0.c.SYMMETRIC, af.l.f0());

    /* renamed from: c, reason: collision with root package name */
    public static final x.a<u> f29752c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final w.a<u> f29753d = new w.a() { // from class: qe.s
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            q b10;
            b10 = t.b((u) xVar, num);
            return b10;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0592b f29754e = b.EnumC0592b.b;

    public static q b(u uVar, Integer num) {
        f(uVar);
        return q.b().e(uVar).c(num).d(ef.c.b(uVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", j1.f29676a);
        u.b d10 = u.b().b(12).c(16).d(16);
        u.c cVar = u.c.f29768d;
        hashMap.put("AES128_GCM_RAW", d10.e(cVar).a());
        hashMap.put("AES256_GCM", j1.b);
        hashMap.put("AES256_GCM_RAW", u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        b.EnumC0592b enumC0592b = f29754e;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        re.p.g();
        we.a0.c().d(f29751a);
        we.z.a().c(d());
        we.x.b().a(f29752c, u.class);
        we.w.f().b(f29753d, u.class);
        we.l.d().h(b, enumC0592b, z10);
    }

    public static final void f(u uVar) {
        if (uVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
