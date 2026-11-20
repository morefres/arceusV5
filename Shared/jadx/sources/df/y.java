package df;

import bf.r0;
import bf.t0;
import cf.g0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class y implements pe.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b.EnumC0592b f14729a = b.EnumC0592b.b;
    public static final we.h<o, r0.c> b = we.h.a().a(o.SHA256, r0.c.b).a(o.SHA384, r0.c.f4121c).a(o.SHA512, r0.c.f4122d).b();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14730c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14731d = {0};

    public static final class b implements pe.a0 {

        /* renamed from: a, reason: collision with root package name */
        public final RSAPublicKey f14732a;
        public final o b;

        /* renamed from: c, reason: collision with root package name */
        public final o f14733c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14734d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f14735e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f14736f;

        private void c(byte[] bArr, byte[] bArr2) {
            BigInteger publicExponent = this.f14732a.getPublicExponent();
            BigInteger modulus = this.f14732a.getModulus();
            int bitLength = (modulus.bitLength() + 7) / 8;
            int bitLength2 = (modulus.bitLength() + 6) / 8;
            if (bitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger a10 = z.a(bArr);
            if (a10.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            b(bArr2, z.b(a10.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
        }

        @Override // pe.a0
        public void a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = this.f14735e;
            if (bArr3.length == 0) {
                c(bArr, bArr2);
            } else {
                if (!s0.e(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                c(Arrays.copyOfRange(bArr, this.f14735e.length, bArr.length), bArr2);
            }
        }

        public final void b(byte[] bArr, byte[] bArr2, int i10) {
            a0.e(this.b);
            MessageDigest a10 = m.f14680e.a(z.e(this.b));
            a10.update(bArr);
            byte[] bArr3 = this.f14736f;
            if (bArr3.length != 0) {
                a10.update(bArr3);
            }
            byte[] digest = a10.digest();
            int digestLength = a10.getDigestLength();
            int length = bArr2.length;
            if (length < this.f14734d + digestLength + 2) {
                throw new GeneralSecurityException("inconsistent");
            }
            byte b = 1;
            if (bArr2[bArr2.length - 1] != -68) {
                throw new GeneralSecurityException("inconsistent");
            }
            int i11 = (length - digestLength) - 1;
            byte[] copyOf = Arrays.copyOf(bArr2, i11);
            byte[] copyOfRange = Arrays.copyOfRange(bArr2, copyOf.length, copyOf.length + digestLength);
            int i12 = 0;
            while (true) {
                int i13 = i12;
                byte b10 = b;
                int i14 = i11;
                long j10 = (length * 8) - i10;
                if (i12 < j10) {
                    if (((copyOf[i13 / 8] >> (7 - (i13 % 8))) & 1) != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i12 = i13 + 1;
                    b = b10;
                    i11 = i14;
                } else {
                    byte[] d10 = z.d(copyOfRange, i14, this.f14733c);
                    int length2 = d10.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr4[i15] = (byte) (d10[i15] ^ copyOf[i15]);
                    }
                    for (int i16 = 0; i16 <= j10; i16++) {
                        int i17 = i16 / 8;
                        bArr4[i17] = (byte) ((~(b10 << (7 - (i16 % 8)))) & bArr4[i17]);
                    }
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f14734d;
                        if (i18 >= (r6 - i19) - 2) {
                            if (bArr4[(r6 - i19) - 2] != b10) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i19, length2);
                            int i20 = digestLength + 8;
                            byte[] bArr5 = new byte[this.f14734d + i20];
                            System.arraycopy(digest, 0, bArr5, 8, digest.length);
                            System.arraycopy(copyOfRange2, 0, bArr5, i20, copyOfRange2.length);
                            if (!e.b(a10.digest(bArr5), copyOfRange)) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            return;
                        }
                        if (bArr4[i18] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i18++;
                    }
                }
            }
        }

        public b(RSAPublicKey rSAPublicKey, o oVar, o oVar2, int i10, byte[] bArr, byte[] bArr2) {
            if (ue.b.c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            a0.e(oVar);
            if (!oVar.equals(oVar2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            a0.c(rSAPublicKey.getModulus().bitLength());
            a0.d(rSAPublicKey.getPublicExponent());
            this.f14732a = rSAPublicKey;
            this.b = oVar;
            this.f14733c = oVar2;
            this.f14734d = i10;
            this.f14735e = bArr;
            this.f14736f = bArr2;
        }
    }

    public static pe.a0 b(t0 t0Var) {
        try {
            return g0.c(t0Var);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) m.f14683h.a("RSA").generatePublic(new RSAPublicKeySpec(t0Var.d(), t0Var.e().e()));
            r0 e10 = t0Var.e();
            return new b(rSAPublicKey, b.c(e10.g()), b.c(e10.c()), e10.f(), t0Var.b().d(), t0Var.e().h().equals(r0.d.f4125d) ? f14731d : f14730c);
        }
    }
}
