package qe;

import af.f0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import qe.z;
import ue.b;
import we.h0;
import we.w;
import we.x;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<v, pe.a> f29789a = we.h0.b(new h0.b() { // from class: qe.w
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return se.a.d((v) lVar);
        }
    }, v.class, pe.a.class);
    public static final w.a<z> b = new w.a() { // from class: qe.x
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            v c10;
            c10 = y.c((z) xVar, num);
            return c10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final x.a<z> f29790c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a> f29791d = we.o.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", pe.a.class, f0.c.SYMMETRIC, af.n.f0());

    public static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static v c(z zVar, Integer num) {
        return v.b().e(zVar).c(num).d(ef.c.b(zVar.c())).a();
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        z.b b10 = z.b().b(16);
        z.c cVar = z.c.b;
        hashMap.put("AES128_GCM_SIV", b10.c(cVar).a());
        z.b b11 = z.b().b(16);
        z.c cVar2 = z.c.f29795d;
        hashMap.put("AES128_GCM_SIV_RAW", b11.c(cVar2).a());
        hashMap.put("AES256_GCM_SIV", z.b().b(32).c(cVar).a());
        hashMap.put("AES256_GCM_SIV_RAW", z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        re.u.g();
        if (b()) {
            we.a0.c().d(f29789a);
            we.z.a().c(d());
            we.x.b().a(f29790c, z.class);
            we.w.f().b(b, z.class);
            we.l.d().g(f29791d, z10);
        }
    }
}
