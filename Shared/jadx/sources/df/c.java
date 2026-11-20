package df;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class c implements pe.a {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0592b f14628c = b.EnumC0592b.b;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f14629a;
    public final byte[] b;

    public c(byte[] bArr, ef.a aVar) {
        if (!f14628c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14629a = re.k.c(bArr);
        this.b = aVar.d();
    }

    public static pe.a c(qe.q qVar) {
        if (qVar.e().c() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + qVar.e().c());
        }
        if (qVar.e().e() == 16) {
            return new c(qVar.c().d(pe.j.a()), qVar.d());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + qVar.e().e());
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a10 = u.a(12);
        AlgorithmParameterSpec a11 = re.k.a(a10);
        Cipher d10 = re.k.d();
        d10.init(1, this.f14629a, a11);
        if (bArr2 != null && bArr2.length != 0) {
            d10.updateAAD(bArr2);
        }
        int outputSize = d10.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(a10, 0, copyOf, this.b.length, 12);
        if (d10.doFinal(bArr, 0, bArr.length, copyOf, this.b.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec b = re.k.b(bArr, this.b.length, 12);
        Cipher d10 = re.k.d();
        d10.init(2, this.f14629a, b);
        if (bArr2 != null && bArr2.length != 0) {
            d10.updateAAD(bArr2);
        }
        byte[] bArr4 = this.b;
        return d10.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
