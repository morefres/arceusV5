package df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import ue.b;

/* loaded from: classes2.dex */
public final class r implements ze.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0592b f14693d = b.EnumC0592b.f32672a;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f14694e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f14695a;
    public byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14696c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public r(byte[] bArr) {
        a0.a(bArr.length);
        this.f14695a = new SecretKeySpec(bArr, "AES");
        c();
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return ((i10 - 1) / 16) + 1;
    }

    public static Cipher d() {
        if (f14693d.a()) {
            return f14694e.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public static void e(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // ze.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher d10 = d();
        d10.init(1, this.f14695a);
        int b = b(bArr.length);
        byte[] d11 = b * 16 == bArr.length ? e.d(bArr, (b - 1) * 16, this.b, 0, 16) : e.e(ye.f.a(Arrays.copyOfRange(bArr, (b - 1) * 16, bArr.length)), this.f14696c);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < b - 1; i11++) {
            e(bArr2, bArr, i11 * 16, bArr3);
            if (d10.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        e(bArr2, d11, 0, bArr3);
        if (d10.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public final void c() {
        Cipher d10 = d();
        d10.init(1, this.f14695a);
        byte[] b = ye.f.b(d10.doFinal(new byte[16]));
        this.b = b;
        this.f14696c = ye.f.b(b);
    }
}
