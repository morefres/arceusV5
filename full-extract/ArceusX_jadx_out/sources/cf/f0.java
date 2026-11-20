package cf;

import bf.r0;
import bf.s0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import ue.b;

/* loaded from: classes2.dex */
public final class f0 implements pe.z {

    /* renamed from: g, reason: collision with root package name */
    public static final b.EnumC0592b f4852g = b.EnumC0592b.b;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4853h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f4854i = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f4855a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f4856c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4857d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4858e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f4859f;

    public f0(RSAPrivateCrtKey rSAPrivateCrtKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!f4852g.a()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        df.a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        df.a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f4855a = rSAPrivateCrtKey;
        this.b = g0.d(cVar);
        this.f4856c = g0.g(cVar, cVar2, i10);
        this.f4857d = bArr;
        this.f4858e = bArr2;
        this.f4859f = provider;
    }

    public static pe.z b(s0 s0Var) {
        Provider b = g0.b();
        if (b == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", b);
        r0 f10 = s0Var.f();
        return new f0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), f10.e(), s0Var.k().b(pe.j.a()), s0Var.i().b(pe.j.a()), s0Var.j().b(pe.j.a()), s0Var.g().b(pe.j.a()), s0Var.h().b(pe.j.a()), s0Var.e().b(pe.j.a()))), f10.g(), f10.c(), f10.f(), s0Var.b().d(), f10.h().equals(r0.d.f4125d) ? f4854i : f4853h, b);
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        Signature signature = Signature.getInstance(this.b, this.f4859f);
        signature.initSign(this.f4855a);
        signature.setParameter(this.f4856c);
        signature.update(bArr);
        byte[] bArr2 = this.f4858e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.f4857d;
        return bArr3.length == 0 ? sign : df.e.a(bArr3, sign);
    }
}
