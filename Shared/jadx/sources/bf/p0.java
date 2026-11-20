package bf;

import af.f0;
import bf.j0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<k0, pe.z> f4103a = we.h0.b(new h0.b() { // from class: bf.m0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.v.b((k0) lVar);
        }
    }, k0.class, pe.z.class);
    public static final we.h0<l0, pe.a0> b = we.h0.b(new h0.b() { // from class: bf.n0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.w.b((l0) lVar);
        }
    }, l0.class, pe.a0.class);

    /* renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4104c = we.o.f(c(), pe.z.class, af.t0.s0());

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4105d = we.o.e(q0.a(), pe.a0.class, f0.c.ASYMMETRIC_PUBLIC, af.u0.k0());

    /* renamed from: e, reason: collision with root package name */
    public static final w.a<j0> f4106e = new w.a() { // from class: bf.o0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            k0 b10;
            b10 = p0.b((j0) xVar, num);
            return b10;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f4107f = b.EnumC0592b.b;

    public static k0 b(j0 j0Var, Integer num) {
        KeyPairGenerator a10 = df.m.f14682g.a("RSA");
        a10.initialize(new RSAKeyGenParameterSpec(j0Var.d(), new BigInteger(1, j0Var.e().toByteArray())));
        KeyPair generateKeyPair = a10.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        return k0.d().f(l0.c().e(j0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(ef.b.a(rSAPrivateCrtKey.getPrimeP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeQ(), pe.j.a())).e(ef.b.a(rSAPrivateCrtKey.getPrivateExponent(), pe.j.a())).c(ef.b.a(rSAPrivateCrtKey.getPrimeExponentP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), pe.j.a())).b(ef.b.a(rSAPrivateCrtKey.getCrtCoefficient(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", e0.f4042j);
        j0.b c10 = j0.b().b(j0.c.b).c(3072);
        BigInteger bigInteger = j0.f4062e;
        j0.b d10 = c10.d(bigInteger);
        j0.d dVar = j0.d.f4076e;
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", d10.e(dVar).a());
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", e0.f4043k);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", e0.f4044l);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", j0.b().b(j0.c.f4072d).c(4096).d(bigInteger).e(dVar).a());
        return hashMap;
    }

    public static void e(boolean z10) {
        b.EnumC0592b enumC0592b = f4107f;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.w.p();
        we.z.a().c(d());
        we.a0.c().d(f4103a);
        we.a0.c().d(b);
        we.w.f().b(f4106e, j0.class);
        we.l.d().h(f4104c, enumC0592b, z10);
        we.l.d().h(f4105d, enumC0592b, false);
    }
}
