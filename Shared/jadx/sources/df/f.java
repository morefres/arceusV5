package df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import re.f0;
import we.s0;

/* loaded from: classes2.dex */
public final class f implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f14637a;
    public final byte[] b;

    public f(byte[] bArr, byte[] bArr2) {
        this.f14637a = new f0(bArr);
        this.b = bArr2;
    }

    public static pe.a c(qe.a0 a0Var) {
        return new f(a0Var.c().d(pe.j.a()), a0Var.d().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f14637a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a10 = u.a(12);
        allocate.put(a10);
        this.f14637a.b(allocate, a10, bArr, bArr2);
        return allocate.array();
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] e10 = e(bArr, bArr2);
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? e10 : e.a(bArr3, e10);
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (s0.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
