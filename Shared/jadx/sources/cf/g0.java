package cf;

import bf.r0;
import bf.t0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class g0 implements pe.a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final b.EnumC0592b f4870g = b.EnumC0592b.b;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4871h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f4872i = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f4873a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f4874c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4875d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4876e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f4877f;

    public g0(RSAPublicKey rSAPublicKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!f4870g.a()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!cVar.equals(cVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        df.a0.c(rSAPublicKey.getModulus().bitLength());
        df.a0.d(rSAPublicKey.getPublicExponent());
        this.f4873a = rSAPublicKey;
        this.b = d(cVar);
        this.f4874c = g(cVar, cVar2, i10);
        this.f4875d = bArr;
        this.f4876e = bArr2;
        this.f4877f = provider;
    }

    public static Provider b() {
        if (!s0.d() || s0.c().intValue() > 23) {
            return we.c.a();
        }
        return null;
    }

    public static pe.a0 c(t0 t0Var) {
        Provider b = b();
        if (b == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", b).generatePublic(new RSAPublicKeySpec(t0Var.d(), t0Var.e().e()));
        r0 e10 = t0Var.e();
        return new g0(rSAPublicKey, e10.g(), e10.c(), e10.f(), t0Var.b().d(), t0Var.e().h().equals(r0.d.f4125d) ? f4872i : f4871h, b);
    }

    public static String d(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA256withRSA/PSS";
        }
        if (cVar == r0.c.f4121c) {
            return "SHA384withRSA/PSS";
        }
        if (cVar == r0.c.f4122d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + cVar);
    }

    public static String e(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA-256";
        }
        if (cVar == r0.c.f4121c) {
            return "SHA-384";
        }
        if (cVar == r0.c.f4122d) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unsupported MD hash: " + cVar);
    }

    public static MGF1ParameterSpec f(r0.c cVar) {
        if (cVar == r0.c.b) {
            return MGF1ParameterSpec.SHA256;
        }
        if (cVar == r0.c.f4121c) {
            return MGF1ParameterSpec.SHA384;
        }
        if (cVar == r0.c.f4122d) {
            return MGF1ParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("Unsupported MGF1 hash: " + cVar);
    }

    public static PSSParameterSpec g(r0.c cVar, r0.c cVar2, int i10) {
        return new PSSParameterSpec(e(cVar), "MGF1", f(cVar2), i10, 1);
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) {
        if (!s0.e(this.f4875d, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f4877f);
        signature.initVerify(this.f4873a);
        signature.setParameter(this.f4874c);
        signature.update(bArr2);
        byte[] bArr3 = this.f4876e;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f4875d;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
