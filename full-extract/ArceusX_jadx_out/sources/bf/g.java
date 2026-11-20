package bf;

import af.f0;
import bf.a;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<b, pe.z> f4047a = we.h0.b(new h0.b() { // from class: bf.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.g.b((b) lVar);
        }
    }, b.class, pe.z.class);
    public static final we.h0<c, pe.a0> b = we.h0.b(new h0.b() { // from class: bf.e
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.h.b((c) lVar);
        }
    }, c.class, pe.a0.class);

    /* renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4048c = we.o.f(c(), pe.z.class, af.t.h0());

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4049d = we.o.e(h.a(), pe.a0.class, f0.c.ASYMMETRIC_PUBLIC, af.u.k0());

    /* renamed from: e, reason: collision with root package name */
    public static final w.a<a> f4050e = new w.a() { // from class: bf.f
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            b b10;
            b10 = g.b((a) xVar, num);
            return b10;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f4051f = b.EnumC0592b.b;

    public static b b(a aVar, Integer num) {
        KeyPair f10 = df.k.f(aVar.c().a());
        ECPublicKey eCPublicKey = (ECPublicKey) f10.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) f10.getPrivate();
        return b.d().c(c.c().d(aVar).c(num).e(eCPublicKey.getW()).a()).b(ef.b.a(eCPrivateKey.getS(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", e0.f4034a);
        hashMap.put("ECDSA_P256_IEEE_P1363", e0.f4036d);
        hashMap.put("ECDSA_P256_RAW", a.b().c(a.d.b).b(a.c.f4014c).d(a.e.b).e(a.f.f4025e).a());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", e0.f4038f);
        hashMap.put("ECDSA_P384", e0.b);
        hashMap.put("ECDSA_P384_IEEE_P1363", e0.f4037e);
        a.b c10 = a.b().c(a.d.f4019d);
        a.c cVar = a.c.f4015d;
        a.b b10 = c10.b(cVar);
        a.e eVar = a.e.f4021c;
        a.b d10 = b10.d(eVar);
        a.f fVar = a.f.b;
        hashMap.put("ECDSA_P384_SHA512", d10.e(fVar).a());
        hashMap.put("ECDSA_P384_SHA384", a.b().c(a.d.f4018c).b(cVar).d(eVar).e(fVar).a());
        hashMap.put("ECDSA_P521", e0.f4035c);
        hashMap.put("ECDSA_P521_IEEE_P1363", e0.f4039g);
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        b.EnumC0592b enumC0592b = f4051f;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.g.m();
        we.z.a().c(d());
        we.a0.c().d(f4047a);
        we.a0.c().d(b);
        we.w.f().b(f4050e, a.class);
        we.l.d().h(f4048c, enumC0592b, z10);
        we.l.d().h(f4049d, enumC0592b, false);
    }
}
