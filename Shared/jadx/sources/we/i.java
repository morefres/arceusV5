package we;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34234a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f34235c = {67108863, 33554431};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f34236d = {26, 25};

    public static byte[] a(long[] jArr) {
        int i10;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j10 = copyOf[i13];
                int i14 = -((int) (((j10 >> 31) & j10) >> f34236d[i13 & 1]));
                copyOf[i13] = j10 + (i14 << r14);
                i13++;
                copyOf[i13] = copyOf[i13] - i14;
            }
            long j11 = copyOf[9];
            copyOf[9] = j11 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j11 >> 31) & j11) >> 25))) * 19);
            i12++;
        }
        long j12 = copyOf[0];
        copyOf[0] = j12 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        int i15 = 0;
        while (i15 < 2) {
            int i16 = i11;
            while (i16 < 9) {
                long j13 = copyOf[i16];
                int i17 = i11;
                int i18 = (int) (j13 >> f34236d[i16 & 1]);
                copyOf[i16] = j13 & f34235c[r14];
                i16++;
                copyOf[i16] = copyOf[i16] + i18;
                i11 = i17;
                i15 = i15;
            }
            i15++;
        }
        int i19 = i11;
        copyOf[9] = copyOf[9] & 33554431;
        long j14 = copyOf[i19] + (((int) (r2 >> 25)) * 19);
        copyOf[i19] = j14;
        int d10 = d((int) j14, 67108845);
        for (int i20 = 1; i20 < 10; i20++) {
            d10 &= b((int) copyOf[i20], f34235c[i20 & 1]);
        }
        copyOf[i19] = copyOf[i19] - (67108845 & d10);
        long j15 = 33554431 & d10;
        copyOf[1] = copyOf[1] - j15;
        for (i10 = 2; i10 < 10; i10 += 2) {
            copyOf[i10] = copyOf[i10] - (67108863 & d10);
            int i21 = i10 + 1;
            copyOf[i21] = copyOf[i21] - j15;
        }
        for (int i22 = i19; i22 < 10; i22++) {
            copyOf[i22] = copyOf[i22] << b[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i19; i23 < 10; i23++) {
            int i24 = f34234a[i23];
            long j16 = bArr[i24];
            long j17 = copyOf[i23];
            bArr[i24] = (byte) (j16 | (j17 & 255));
            bArr[i24 + 1] = (byte) (bArr[r5] | ((j17 >> 8) & 255));
            bArr[i24 + 2] = (byte) (bArr[r5] | ((j17 >> 16) & 255));
            bArr[i24 + 3] = (byte) (bArr[r4] | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    public static int b(int i10, int i11) {
        int i12 = ~(i10 ^ i11);
        int i13 = i12 & (i12 << 16);
        int i14 = i13 & (i13 << 8);
        int i15 = i14 & (i14 << 4);
        int i16 = i15 & (i15 << 2);
        return (i16 & (i16 << 1)) >> 31;
    }

    public static long[] c(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f34234a[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> b[i10]) & f34235c[i10 & 1];
        }
        return jArr;
    }

    public static int d(int i10, int i11) {
        return ~((i10 - i11) >> 31);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        k(jArr3, jArr2);
        k(jArr12, jArr3);
        k(jArr11, jArr12);
        f(jArr4, jArr11, jArr2);
        f(jArr5, jArr4, jArr3);
        k(jArr11, jArr5);
        f(jArr6, jArr11, jArr4);
        k(jArr11, jArr6);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        f(jArr7, jArr11, jArr6);
        k(jArr11, jArr7);
        k(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr8, jArr12, jArr7);
        k(jArr11, jArr8);
        k(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr11, jArr12, jArr8);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            k(jArr12, jArr11);
            k(jArr11, jArr12);
        }
        f(jArr9, jArr11, jArr7);
        k(jArr11, jArr9);
        k(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr10, jArr12, jArr9);
        k(jArr12, jArr10);
        k(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            k(jArr12, jArr11);
            k(jArr11, jArr12);
        }
        f(jArr12, jArr11, jArr10);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr11, jArr12, jArr9);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        f(jArr, jArr12, jArr5);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        g(jArr4, jArr2, jArr3);
        h(jArr4, jArr);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        jArr[1] = j11 + (j12 * j13);
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        jArr[2] = (j14 * 2 * j15) + (jArr3[2] * j10) + (jArr2[2] * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        jArr[3] = (j14 * j16) + (j17 * j15) + (jArr3[3] * j10) + (jArr2[3] * j13);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        jArr[4] = (j17 * j16) + (((j14 * j18) + (j19 * j15)) * 2) + (jArr3[4] * j10) + (jArr2[4] * j13);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        jArr[5] = (j17 * j18) + (j19 * j16) + (j14 * j20) + (j21 * j15) + (jArr3[5] * j10) + (jArr2[5] * j13);
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        jArr[6] = (((j19 * j18) + (j14 * j22) + (j23 * j15)) * 2) + (j17 * j20) + (j21 * j16) + (jArr3[6] * j10) + (jArr2[6] * j13);
        long j24 = jArr3[6];
        long j25 = jArr2[6];
        jArr[7] = (j19 * j20) + (j21 * j18) + (j17 * j22) + (j23 * j16) + (j14 * j24) + (j25 * j15) + (jArr3[7] * j10) + (jArr2[7] * j13);
        long j26 = jArr3[7];
        long j27 = jArr2[7];
        jArr[8] = (j21 * j20) + (((j19 * j22) + (j23 * j18) + (j14 * j26) + (j27 * j15)) * 2) + (j17 * j24) + (j25 * j16) + (jArr3[8] * j10) + (jArr2[8] * j13);
        long j28 = jArr3[8];
        long j29 = jArr2[8];
        jArr[9] = (j21 * j22) + (j23 * j20) + (j19 * j24) + (j25 * j18) + (j17 * j26) + (j27 * j16) + (j14 * j28) + (j29 * j15) + (j10 * jArr3[9]) + (jArr2[9] * j13);
        long j30 = jArr3[9];
        long j31 = jArr2[9];
        jArr[10] = (((j23 * j22) + (j19 * j26) + (j27 * j18) + (j14 * j30) + (j15 * j31)) * 2) + (j21 * j24) + (j25 * j20) + (j17 * j28) + (j29 * j16);
        jArr[11] = (j23 * j24) + (j25 * j22) + (j21 * j26) + (j27 * j20) + (j19 * j28) + (j29 * j18) + (j17 * j30) + (j16 * j31);
        jArr[12] = (j25 * j24) + (((j23 * j26) + (j27 * j22) + (j19 * j30) + (j18 * j31)) * 2) + (j21 * j28) + (j29 * j20);
        jArr[13] = (j25 * j26) + (j27 * j24) + (j23 * j28) + (j29 * j22) + (j21 * j30) + (j20 * j31);
        jArr[14] = (((j27 * j26) + (j23 * j30) + (j22 * j31)) * 2) + (j25 * j28) + (j29 * j24);
        jArr[15] = (j27 * j28) + (j29 * j26) + (j25 * j30) + (j24 * j31);
        jArr[16] = (j29 * j28) + (((j27 * j30) + (j26 * j31)) * 2);
        jArr[17] = (j29 * j30) + (j28 * j31);
        jArr[18] = j31 * 2 * j30;
    }

    public static void h(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        j(jArr);
        i(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void i(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void j(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    public static void k(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        l(jArr3, jArr2);
        h(jArr3, jArr);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        jArr[0] = j10 * j10;
        long j11 = jArr2[0];
        jArr[1] = j11 * 2 * jArr2[1];
        long j12 = jArr2[1];
        jArr[2] = ((j12 * j12) + (jArr2[2] * j11)) * 2;
        long j13 = jArr2[2];
        jArr[3] = ((j12 * j13) + (jArr2[3] * j11)) * 2;
        long j14 = jArr2[3];
        jArr[4] = (j13 * j13) + (j12 * 4 * j14) + (j11 * 2 * jArr2[4]);
        long j15 = jArr2[4];
        jArr[5] = ((j13 * j14) + (j12 * j15) + (jArr2[5] * j11)) * 2;
        long j16 = (j14 * j14) + (j13 * j15) + (jArr2[6] * j11);
        long j17 = jArr2[5];
        jArr[6] = (j16 + (j12 * 2 * j17)) * 2;
        long j18 = jArr2[6];
        jArr[7] = ((j14 * j15) + (j13 * j17) + (j12 * j18) + (jArr2[7] * j11)) * 2;
        long j19 = (j13 * j18) + (jArr2[8] * j11);
        long j20 = jArr2[7];
        jArr[8] = (j15 * j15) + ((j19 + (((j12 * j20) + (j14 * j17)) * 2)) * 2);
        long j21 = jArr2[8];
        jArr[9] = ((j15 * j17) + (j14 * j18) + (j13 * j20) + (j12 * j21) + (j11 * jArr2[9])) * 2;
        long j22 = jArr2[9];
        jArr[10] = ((j17 * j17) + (j15 * j18) + (j13 * j21) + (((j14 * j20) + (j12 * j22)) * 2)) * 2;
        jArr[11] = ((j17 * j18) + (j15 * j20) + (j14 * j21) + (j13 * j22)) * 2;
        jArr[12] = (j18 * j18) + (((j15 * j21) + (((j17 * j20) + (j14 * j22)) * 2)) * 2);
        jArr[13] = ((j18 * j20) + (j17 * j21) + (j15 * j22)) * 2;
        jArr[14] = ((j20 * j20) + (j18 * j21) + (j17 * 2 * j22)) * 2;
        jArr[15] = ((j20 * j21) + (j18 * j22)) * 2;
        jArr[16] = (j21 * j21) + (j20 * 4 * j22);
        jArr[17] = j21 * 2 * j22;
        jArr[18] = 2 * j22 * j22;
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void n(long[] jArr, long[] jArr2) {
        o(jArr, jArr, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }
}
