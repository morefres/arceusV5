package df;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class b implements pe.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f14620f = b.EnumC0592b.f32672a;

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f14621g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f14622h = new C0285b();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14623a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14624c;

    /* renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f14625d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14626e;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: df.b$b, reason: collision with other inner class name */
    public class C0285b extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10, byte[] bArr2) {
        if (!f14620f.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f14626e = i10;
        a0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f14625d = secretKeySpec;
        Cipher cipher = f14621g.get();
        cipher.init(1, secretKeySpec);
        byte[] d10 = d(cipher.doFinal(new byte[16]));
        this.f14623a = d10;
        this.b = d(d10);
        this.f14624c = bArr2;
    }

    public static pe.a c(qe.l lVar) {
        if (!f14620f.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (lVar.e().e() == 16) {
            return new b(lVar.c().d(pe.j.a()), lVar.e().c(), lVar.d().d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + lVar.e().e());
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static void g(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f14624c;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.f14626e;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] a10 = u.a(this.f14626e);
        System.arraycopy(a10, 0, copyOf, this.f14624c.length, this.f14626e);
        Cipher cipher = f14621g.get();
        cipher.init(1, this.f14625d);
        byte[] e10 = e(cipher, 0, a10, 0, a10.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] e11 = e(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f14622h.get();
        cipher2.init(1, this.f14625d, new IvParameterSpec(e10));
        cipher2.doFinal(bArr, 0, bArr.length, copyOf, this.f14624c.length + this.f14626e);
        byte[] e12 = e(cipher, 2, copyOf, this.f14624c.length + this.f14626e, bArr.length);
        int length3 = this.f14624c.length + bArr.length + this.f14626e;
        for (int i11 = 0; i11 < 16; i11++) {
            copyOf[length3 + i11] = (byte) ((e11[i11] ^ e10[i11]) ^ e12[i11]);
        }
        return copyOf;
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f14624c;
        int length2 = ((length - bArr3.length) - this.f14626e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f14621g.get();
        cipher.init(1, this.f14625d);
        byte[] e10 = e(cipher, 0, bArr, this.f14624c.length, this.f14626e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] e11 = e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] e12 = e(cipher, 2, bArr, this.f14624c.length + this.f14626e, length2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b = (byte) (b | (((bArr[length3 + i10] ^ e11[i10]) ^ e10[i10]) ^ e12[i10]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f14622h.get();
        cipher2.init(1, this.f14625d, new IvParameterSpec(e10));
        return cipher2.doFinal(bArr, this.f14624c.length + this.f14626e, length2);
    }

    public final byte[] e(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            g(bArr2, this.f14623a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArr4[i14] = (byte) (bArr4[i14] ^ bArr[(i11 + i13) + i14]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i13 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        g(bArr4, f(bArr, i13 + i11, i11 + i12));
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    public final byte[] f(byte[] bArr, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        if (copyOfRange.length == 16) {
            g(copyOfRange, this.f14623a);
            return copyOfRange;
        }
        byte[] copyOf = Arrays.copyOf(this.b, 16);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
        }
        copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        return copyOf;
    }
}
