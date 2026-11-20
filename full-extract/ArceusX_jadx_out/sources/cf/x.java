package cf;

import bf.j0;
import bf.l0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class x implements pe.a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f4900f = b.EnumC0592b.b;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4901g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4902h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f4903a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4904c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4905d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f4906e;

    public x(RSAPublicKey rSAPublicKey, j0.c cVar, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!f4900f.a()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        df.a0.c(rSAPublicKey.getModulus().bitLength());
        df.a0.d(rSAPublicKey.getPublicExponent());
        this.f4903a = rSAPublicKey;
        this.b = d(cVar);
        this.f4904c = bArr;
        this.f4905d = bArr2;
        this.f4906e = provider;
    }

    private static Provider b() {
        if (!s0.d() || s0.c().intValue() > 21) {
            return we.c.a();
        }
        return null;
    }

    public static pe.a0 c(l0 l0Var) {
        Provider b = b();
        if (b != null) {
            return new x((RSAPublicKey) KeyFactory.getInstance("RSA", b).generatePublic(new RSAPublicKeySpec(l0Var.d(), l0Var.e().e())), l0Var.e().c(), l0Var.b().d(), l0Var.e().f().equals(j0.d.f4075d) ? f4902h : f4901g, b);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static String d(j0.c cVar) {
        if (cVar == j0.c.b) {
            return "SHA256withRSA";
        }
        if (cVar == j0.c.f4071c) {
            return "SHA384withRSA";
        }
        if (cVar == j0.c.f4072d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) {
        boolean z10;
        if (!s0.e(this.f4904c, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f4906e);
        signature.initVerify(this.f4903a);
        signature.update(bArr2);
        byte[] bArr3 = this.f4905d;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            z10 = signature.verify(Arrays.copyOfRange(bArr, this.f4904c.length, bArr.length));
        } catch (RuntimeException unused) {
            z10 = false;
        }
        if (!z10) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
