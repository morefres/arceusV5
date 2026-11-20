package bf;

import af.f0;
import bf.r0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final we.h0<s0, pe.z> f4145a = we.h0.b(new h0.b() { // from class: bf.u0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.x.b((s0) lVar);
        }
    }, s0.class, pe.z.class);
    public static final we.h0<t0, pe.a0> b = we.h0.b(new h0.b() { // from class: bf.v0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.y.b((t0) lVar);
        }
    }, t0.class, pe.a0.class);

    /* renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4146c = we.o.f(c(), pe.z.class, af.x0.s0());

    /* renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4147d = we.o.e(y0.a(), pe.a0.class, f0.c.ASYMMETRIC_PUBLIC, af.y0.l0());

    /* renamed from: e, reason: collision with root package name */
    public static final w.a<r0> f4148e = new w.a() { // from class: bf.w0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            s0 b10;
            b10 = x0.b((r0) xVar, num);
            return b10;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f4149f = b.EnumC0592b.b;

    public static s0 b(r0 r0Var, Integer num) {
        KeyPairGenerator a10 = df.m.f14682g.a("RSA");
        a10.initialize(new RSAKeyGenParameterSpec(r0Var.d(), new BigInteger(1, r0Var.e().toByteArray())));
        KeyPair generateKeyPair = a10.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        return s0.d().f(t0.c().e(r0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(ef.b.a(rSAPrivateCrtKey.getPrimeP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeQ(), pe.j.a())).e(ef.b.a(rSAPrivateCrtKey.getPrivateExponent(), pe.j.a())).c(ef.b.a(rSAPrivateCrtKey.getPrimeExponentP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), pe.j.a())).b(ef.b.a(rSAPrivateCrtKey.getCrtCoefficient(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        r0.b b10 = r0.b();
        r0.c cVar = r0.c.b;
        r0.b c10 = b10.f(cVar).b(cVar).e(32).c(3072);
        BigInteger bigInteger = r0.f4108g;
        r0.b d10 = c10.d(bigInteger);
        r0.d dVar = r0.d.b;
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", d10.g(dVar).a());
        r0.b d11 = r0.b().f(cVar).b(cVar).e(32).c(3072).d(bigInteger);
        r0.d dVar2 = r0.d.f4126e;
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", d11.g(dVar2).a());
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", e0.f4045m);
        r0.b b11 = r0.b();
        r0.c cVar2 = r0.c.f4122d;
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", b11.f(cVar2).b(cVar2).e(64).c(4096).d(bigInteger).g(dVar).a());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", r0.b().f(cVar2).b(cVar2).e(64).c(4096).d(bigInteger).g(dVar2).a());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", e0.f4046n);
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        b.EnumC0592b enumC0592b = f4149f;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.e0.p();
        we.z.a().c(d());
        we.a0.c().d(f4145a);
        we.a0.c().d(b);
        we.w.f().b(f4148e, r0.class);
        we.l.d().h(f4146c, enumC0592b, z10);
        we.l.d().h(f4147d, enumC0592b, false);
    }
}
