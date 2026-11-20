package bf;

import af.f0;
import bf.i;
import df.i;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.h0;
import we.w;
import we.x;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<j, pe.z> f4095a = we.h0.b(new h0.b() { // from class: bf.k
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.i.b((j) lVar);
        }
    }, j.class, pe.z.class);
    public static final we.h0<o, pe.a0> b = we.h0.b(new h0.b() { // from class: bf.l
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.j.b((o) lVar);
        }
    }, o.class, pe.a0.class);

    /* renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4096c = we.o.f(b(), pe.z.class, af.x.h0());

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4097d = we.o.e(p.a(), pe.a0.class, f0.c.ASYMMETRIC_PUBLIC, af.y.g0());

    /* renamed from: e, reason: collision with root package name */
    public static final x.a<i> f4098e = new qe.h();

    /* renamed from: f, reason: collision with root package name */
    public static final w.a<i> f4099f = new w.a() { // from class: bf.m
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return n.a((i) xVar, num);
        }
    };

    public static j a(i iVar, Integer num) {
        i.a c10 = i.a.c();
        return j.d(o.c(iVar.c(), ef.a.a(c10.b()), num), ef.c.a(c10.a(), pe.j.a()));
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public static Map<String, pe.x> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", i.b(i.a.b));
        i.a aVar = i.a.f4057e;
        hashMap.put("ED25519_RAW", i.b(aVar));
        hashMap.put("ED25519WithRawOutput", i.b(aVar));
        return Collections.unmodifiableMap(hashMap);
    }

    public static void d(boolean z10) {
        if (!b.EnumC0592b.f32672a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        cf.n.k();
        we.z.a().c(c());
        we.w.f().b(f4099f, i.class);
        we.x.b().a(f4098e, i.class);
        we.a0.c().d(f4095a);
        we.a0.c().d(b);
        we.l.d().g(f4096c, z10);
        we.l.d().g(f4097d, false);
    }
}
