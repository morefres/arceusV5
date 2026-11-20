package df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class z {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14737a;

        static {
            int[] iArr = new int[o.values().length];
            f14737a = iArr;
            try {
                iArr[o.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14737a[o.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14737a[o.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14737a[o.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14737a[o.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static BigInteger a(byte[] bArr) {
        return we.a.a(bArr);
    }

    public static byte[] b(BigInteger bigInteger, int i10) {
        return we.a.c(bigInteger, i10);
    }

    public static boolean c() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] d(byte[] bArr, int i10, o oVar) {
        MessageDigest a10 = m.f14680e.a(e(oVar));
        int digestLength = a10.getDigestLength();
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 <= (i10 - 1) / digestLength; i12++) {
            a10.reset();
            a10.update(bArr);
            a10.update(b(BigInteger.valueOf(i12), 4));
            byte[] digest = a10.digest();
            System.arraycopy(digest, 0, bArr2, i11, Math.min(digest.length, i10 - i11));
            i11 += digest.length;
        }
        return bArr2;
    }

    public static String e(o oVar) {
        int i10 = a.f14737a[oVar.ordinal()];
        if (i10 == 1) {
            return "SHA-1";
        }
        if (i10 == 2) {
            return "SHA-224";
        }
        if (i10 == 3) {
            return "SHA-256";
        }
        if (i10 == 4) {
            return "SHA-384";
        }
        if (i10 == 5) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + oVar);
    }

    public static String f(o oVar) {
        a0.e(oVar);
        return oVar + "withECDSA";
    }

    public static String g(o oVar) {
        a0.e(oVar);
        return oVar + "withRSA";
    }
}
