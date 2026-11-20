package df;

import bf.j0;
import bf.k0;
import df.n;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import ue.b;

/* loaded from: classes2.dex */
public final class v implements pe.z {

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f14706f = b.EnumC0592b.b;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14707g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14708h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14709i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f14710a;
    public final RSAPublicKey b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14711c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14712d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14713e;

    public v(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, byte[] bArr, byte[] bArr2) {
        if (!f14706f.a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        a0.e(oVar);
        a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f14710a = rSAPrivateCrtKey;
        this.f14711c = z.g(oVar);
        this.b = (RSAPublicKey) m.f14683h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f14712d = bArr;
        this.f14713e = bArr2;
    }

    public static pe.z b(k0 k0Var) {
        v vVar = new v((RSAPrivateCrtKey) m.f14683h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(k0Var.c().d(), k0Var.f().e(), k0Var.k().b(pe.j.a()), k0Var.i().b(pe.j.a()), k0Var.j().b(pe.j.a()), k0Var.g().b(pe.j.a()), k0Var.h().b(pe.j.a()), k0Var.e().b(pe.j.a()))), w.f14716d.c(k0Var.f().c()), k0Var.b().d(), k0Var.f().f().equals(j0.d.f4075d) ? f14708h : f14707g);
        pe.a0 b = w.b(k0Var.c());
        try {
            byte[] bArr = f14709i;
            b.a(vVar.a(bArr), bArr);
            return vVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    private byte[] c(byte[] bArr) {
        m<n.g, Signature> mVar = m.f14679d;
        Signature a10 = mVar.a(this.f14711c);
        a10.initSign(this.f14710a);
        a10.update(bArr);
        byte[] bArr2 = this.f14713e;
        if (bArr2.length > 0) {
            a10.update(bArr2);
        }
        byte[] sign = a10.sign();
        Signature a11 = mVar.a(this.f14711c);
        a11.initVerify(this.b);
        a11.update(bArr);
        byte[] bArr3 = this.f14713e;
        if (bArr3.length > 0) {
            a11.update(bArr3);
        }
        if (a11.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        byte[] c10 = c(bArr);
        byte[] bArr2 = this.f14712d;
        return bArr2.length == 0 ? c10 : e.a(bArr2, c10);
    }
}
