package df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import we.s0;

/* loaded from: classes2.dex */
public final class l implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f14675a;
    public final pe.w b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14676c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14677d;

    public l(q qVar, pe.w wVar, int i10, byte[] bArr) {
        this.f14675a = qVar;
        this.b = wVar;
        this.f14676c = i10;
        this.f14677d = bArr;
    }

    public static pe.a c(qe.f fVar) {
        return new l(new a(fVar.c().d(pe.j.a()), fVar.f().f()), new t(new s("HMAC" + fVar.f().d(), new SecretKeySpec(fVar.d().d(pe.j.a()), "HMAC")), fVar.f().g()), fVar.f().g(), fVar.e().d());
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f14675a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return e.a(this.f14677d, a10, this.b.b(e.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f14676c;
        byte[] bArr3 = this.f14677d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f14677d.length, bArr.length - this.f14676c);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f14676c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, e.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f14675a.b(copyOfRange);
    }
}
