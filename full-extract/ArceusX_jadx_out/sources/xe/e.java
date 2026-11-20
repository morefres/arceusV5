package xe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.a0;
import we.h0;
import we.w;
import xe.f;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final w.a<f> f35528a = new w.a() { // from class: xe.b
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            a d10;
            d10 = e.d((f) xVar, num);
            return d10;
        }
    };
    public static final h0<a, g> b = h0.b(new h0.b() { // from class: xe.c
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            g e10;
            e10 = e.e((a) lVar);
            return e10;
        }
    }, a.class, g.class);

    /* renamed from: c, reason: collision with root package name */
    public static final h0<a, pe.w> f35529c = h0.b(new h0.b() { // from class: xe.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            pe.w f10;
            f10 = e.f((a) lVar);
            return f10;
        }
    }, a.class, pe.w.class);

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.w> f35530d = we.o.e("type.googleapis.com/google.crypto.tink.AesCmacKey", pe.w.class, f0.c.SYMMETRIC, af.a.h0());

    public static a d(f fVar, Integer num) {
        i(fVar);
        return a.b().e(fVar).c(ef.c.b(fVar.d())).d(num).a();
    }

    public static g e(a aVar) {
        i(aVar.e());
        return new ye.g(aVar);
    }

    public static pe.w f(a aVar) {
        i(aVar.e());
        return df.t.c(aVar);
    }

    public static Map<String, pe.x> g() {
        HashMap hashMap = new HashMap();
        f fVar = z.f35575e;
        hashMap.put("AES_CMAC", fVar);
        hashMap.put("AES256_CMAC", fVar);
        hashMap.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f35537e).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void h(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        ye.e.h();
        we.w.f().b(f35528a, f.class);
        a0.c().d(b);
        a0.c().d(f35529c);
        we.z.a().c(g());
        we.l.d().g(f35530d, z10);
    }

    public static void i(f fVar) {
        if (fVar.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
