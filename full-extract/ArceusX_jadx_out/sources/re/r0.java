package re;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import qe.p1;
import ue.b;

/* loaded from: classes2.dex */
public final class r0 implements pe.a {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0592b f30222c = b.EnumC0592b.f32672a;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f30223a;
    public final byte[] b;

    public r0(byte[] bArr, byte[] bArr2) {
        if (!f30222c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!e()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f30223a = bArr;
        this.b = bArr2;
    }

    public static pe.a c(p1 p1Var) {
        return new r0(p1Var.c().d(pe.j.a()), p1Var.d().d());
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    public static boolean e() {
        return v.e() != null;
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a10 = df.u.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(b0.a(this.f30223a, a10), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(a10));
        Cipher e10 = v.e();
        e10.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            e10.updateAAD(bArr2);
        }
        int outputSize = e10.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(a10, 0, copyOf, this.b.length, 24);
        if (e10.doFinal(bArr, 0, bArr.length, copyOf, this.b.length + 24) == outputSize) {
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
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!we.s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.b.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(b0.a(this.f30223a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher e10 = v.e();
        e10.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            e10.updateAAD(bArr2);
        }
        byte[] bArr5 = this.b;
        return e10.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }
}
