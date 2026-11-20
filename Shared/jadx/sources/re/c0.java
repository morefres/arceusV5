package re;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import ue.b;

/* loaded from: classes2.dex */
public final class c0 {
    public static final b.EnumC0592b b = b.EnumC0592b.b;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f30193a;

    public c0(byte[] bArr) {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f30193a = k.c(bArr);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec a10 = k.a(bArr);
        Cipher d10 = k.d();
        d10.init(2, this.f30193a, a10);
        if (bArr3 != null && bArr3.length != 0) {
            d10.updateAAD(bArr3);
        }
        return d10.doFinal(bArr2, i10, bArr2.length - i10);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec a10 = k.a(bArr);
        Cipher d10 = k.d();
        d10.init(1, this.f30193a, a10);
        if (bArr3 != null && bArr3.length != 0) {
            d10.updateAAD(bArr3);
        }
        int outputSize = d10.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i10 + outputSize];
        if (d10.doFinal(bArr2, 0, bArr2.length, bArr4, i10) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
