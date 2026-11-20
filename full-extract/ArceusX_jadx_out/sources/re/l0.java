package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import qe.k1;

/* loaded from: classes2.dex */
public final class l0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f30210a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final ze.a f30211c;

    public l0(byte[] bArr, ef.a aVar, int i10) {
        this.f30211c = new df.r(bArr);
        this.f30210a = aVar.d();
        this.b = i10;
    }

    public static pe.a c(k1 k1Var) {
        if (k1Var.f().c() < 8 || k1Var.f().c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new l0(k1Var.c().d(pe.j.a()), k1Var.d(), k1Var.f().c());
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a10 = df.u.a(this.b + 12);
        byte[] copyOf = Arrays.copyOf(a10, this.b);
        int i10 = this.b;
        byte[] copyOfRange = Arrays.copyOfRange(a10, i10, i10 + 12);
        byte[] b = new c0(d(copyOf)).b(copyOfRange, bArr, this.f30210a.length + this.b + copyOfRange.length, bArr2);
        byte[] bArr3 = this.f30210a;
        System.arraycopy(bArr3, 0, b, 0, bArr3.length);
        System.arraycopy(a10, 0, b, this.f30210a.length, a10.length);
        return b;
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f30210a;
        if (length < bArr3.length + this.b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!we.s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f30210a.length + this.b;
        int i10 = length2 + 12;
        return new c0(d(Arrays.copyOfRange(bArr, this.f30210a.length, length2))).a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    public final byte[] d(byte[] bArr) {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f30211c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f30211c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
