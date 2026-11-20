package df;

import bf.r0;
import bf.s0;
import cf.f0;
import df.n;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import ue.b;

/* loaded from: classes2.dex */
public final class x implements pe.z {

    /* renamed from: a, reason: collision with root package name */
    public static final b.EnumC0592b f14721a = b.EnumC0592b.b;
    public static final byte[] b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14722c = {0};

    public static final class b implements pe.z {

        /* renamed from: a, reason: collision with root package name */
        public final RSAPrivateCrtKey f14723a;
        public final RSAPublicKey b;

        /* renamed from: c, reason: collision with root package name */
        public final o f14724c;

        /* renamed from: d, reason: collision with root package name */
        public final o f14725d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14726e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f14727f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f14728g;

        private byte[] c(byte[] bArr) {
            return d(b(bArr, this.b.getModulus().bitLength() - 1));
        }

        @Override // pe.z
        public byte[] a(byte[] bArr) {
            byte[] c10 = c(bArr);
            byte[] bArr2 = this.f14727f;
            return bArr2.length == 0 ? c10 : e.a(bArr2, c10);
        }

        public final byte[] b(byte[] bArr, int i10) {
            a0.e(this.f14724c);
            MessageDigest a10 = m.f14680e.a(z.e(this.f14724c));
            a10.update(bArr);
            byte[] bArr2 = this.f14728g;
            if (bArr2.length != 0) {
                a10.update(bArr2);
            }
            byte[] digest = a10.digest();
            int digestLength = a10.getDigestLength();
            int i11 = 1;
            int i12 = ((i10 - 1) / 8) + 1;
            int i13 = this.f14726e;
            if (i12 < digestLength + i13 + 2) {
                throw new GeneralSecurityException("encoding error");
            }
            byte[] a11 = u.a(i13);
            int i14 = digestLength + 8;
            byte[] bArr3 = new byte[this.f14726e + i14];
            System.arraycopy(digest, 0, bArr3, 8, digestLength);
            System.arraycopy(a11, 0, bArr3, i14, a11.length);
            byte[] digest2 = a10.digest(bArr3);
            int i15 = (i12 - digestLength) - 1;
            byte[] bArr4 = new byte[i15];
            int i16 = this.f14726e;
            bArr4[((i12 - i16) - digestLength) - 2] = 1;
            System.arraycopy(a11, 0, bArr4, ((i12 - i16) - digestLength) - 1, a11.length);
            byte[] d10 = z.d(digest2, i15, this.f14725d);
            byte[] bArr5 = new byte[i15];
            for (int i17 = 0; i17 < i15; i17++) {
                bArr5[i17] = (byte) (bArr4[i17] ^ d10[i17]);
            }
            int i18 = 0;
            while (true) {
                int i19 = i11;
                if (i18 >= (i12 * 8) - i10) {
                    int i20 = digestLength + i15;
                    byte[] bArr6 = new byte[i20 + 1];
                    System.arraycopy(bArr5, 0, bArr6, 0, i15);
                    System.arraycopy(digest2, 0, bArr6, i15, digest2.length);
                    bArr6[i20] = -68;
                    return bArr6;
                }
                int i21 = i18 / 8;
                bArr5[i21] = (byte) ((~(i19 << (7 - (i18 % 8)))) & bArr5[i21]);
                i18++;
                i11 = i19;
            }
        }

        public final byte[] d(byte[] bArr) {
            m<n.a, Cipher> mVar = m.b;
            Cipher a10 = mVar.a("RSA/ECB/NOPADDING");
            a10.init(2, this.f14723a);
            byte[] doFinal = a10.doFinal(bArr);
            Cipher a11 = mVar.a("RSA/ECB/NOPADDING");
            a11.init(1, this.b);
            if (new BigInteger(1, bArr).equals(new BigInteger(1, a11.doFinal(doFinal)))) {
                return doFinal;
            }
            throw new IllegalStateException("Security bug: RSA signature computation error");
        }

        public b(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, o oVar2, int i10, byte[] bArr, byte[] bArr2) {
            if (ue.b.c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            a0.e(oVar);
            if (!oVar.equals(oVar2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            a0.c(rSAPrivateCrtKey.getModulus().bitLength());
            a0.d(rSAPrivateCrtKey.getPublicExponent());
            this.f14723a = rSAPrivateCrtKey;
            this.b = (RSAPublicKey) m.f14683h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.f14724c = oVar;
            this.f14725d = oVar2;
            this.f14726e = i10;
            this.f14727f = bArr;
            this.f14728g = bArr2;
        }
    }

    public static pe.z b(s0 s0Var) {
        try {
            return f0.b(s0Var);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) m.f14683h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), s0Var.f().e(), s0Var.k().b(pe.j.a()), s0Var.i().b(pe.j.a()), s0Var.j().b(pe.j.a()), s0Var.g().b(pe.j.a()), s0Var.h().b(pe.j.a()), s0Var.e().b(pe.j.a())));
            r0 f10 = s0Var.f();
            return new b(rSAPrivateCrtKey, y.b.c(f10.g()), y.b.c(f10.c()), f10.f(), s0Var.b().d(), s0Var.f().h().equals(r0.d.f4125d) ? f14722c : b);
        }
    }
}
