package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qe.k;
import ue.b;
import we.h0;
import we.w;
import we.x;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<f, pe.a> f29672a = we.h0.b(new h0.b() { // from class: qe.g
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.l.c((f) lVar);
        }
    }, f.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(b(), pe.a.class, f0.c.SYMMETRIC, af.d.h0());

    /* renamed from: c, reason: collision with root package name */
    public static final x.a<k> f29673c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final w.a<k> f29674d = new w.a() { // from class: qe.i
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return j.a((k) xVar, num);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0592b f29675e = b.EnumC0592b.b;

    public static f a(k kVar, Integer num) {
        e(kVar);
        return f.b().f(kVar).e(num).c(ef.c.b(kVar.c())).d(ef.c.b(kVar.e())).a();
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static Map<String, pe.x> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", j1.f29679e);
        k.b e10 = k.b().b(16).d(32).f(16).e(16);
        k.c cVar = k.c.f29698d;
        k.b c10 = e10.c(cVar);
        k.d dVar = k.d.f29703d;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", c10.g(dVar).a());
        hashMap.put("AES256_CTR_HMAC_SHA256", j1.f29680f);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void d(boolean z10) {
        b.EnumC0592b enumC0592b = f29675e;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        re.e.h();
        we.a0.c().d(f29672a);
        we.z.a().c(c());
        we.x.b().a(f29673c, k.class);
        we.w.f().b(f29674d, k.class);
        we.l.d().h(b, enumC0592b, z10);
    }

    public static void e(k kVar) {
        if (kVar.c() != 16 && kVar.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
