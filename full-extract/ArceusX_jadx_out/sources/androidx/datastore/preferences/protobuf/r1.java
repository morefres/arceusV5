package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2093a;

    public static class a {
        public static void h(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || m(b11) || m(b12)) {
                throw a0.d();
            }
            int r8 = ((b & 7) << 18) | (r(b10) << 12) | (r(b11) << 6) | r(b12);
            cArr[i10] = l(r8);
            cArr[i10 + 1] = q(r8);
        }

        public static void i(byte b, char[] cArr, int i10) {
            cArr[i10] = (char) b;
        }

        public static void j(byte b, byte b10, byte b11, char[] cArr, int i10) {
            if (m(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m(b11)))) {
                throw a0.d();
            }
            cArr[i10] = (char) (((b & 15) << 12) | (r(b10) << 6) | r(b11));
        }

        public static void k(byte b, byte b10, char[] cArr, int i10) {
            if (b < -62 || m(b10)) {
                throw a0.d();
            }
            cArr[i10] = (char) (((b & 31) << 6) | r(b10));
        }

        public static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        public static boolean m(byte b) {
            return b > -65;
        }

        public static boolean n(byte b) {
            return b >= 0;
        }

        public static boolean o(byte b) {
            return b < -16;
        }

        public static boolean p(byte b) {
            return b < -32;
        }

        public static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        public static int r(byte b) {
            return b & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(String str, byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.r1.b
        public String a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b = bArr[i10];
                if (!a.n(b)) {
                    break;
                }
                i10++;
                a.i(b, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (a.n(b10)) {
                    int i16 = i14 + 1;
                    a.i(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = bArr[i17];
                        if (!a.n(b11)) {
                            break;
                        }
                        i17++;
                        a.i(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (a.p(b10)) {
                    if (i15 >= i12) {
                        throw a0.d();
                    }
                    i10 += 2;
                    a.k(b10, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.o(b10)) {
                    if (i15 >= i12 - 1) {
                        throw a0.d();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.j(b10, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw a0.d();
                    }
                    byte b12 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b13 = bArr[i10 + 2];
                    i10 += 4;
                    a.h(b10, b12, b13, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int b(java.lang.String r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r1.c.b(java.lang.String, byte[], int, int):int");
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static final class e extends b {
        public static boolean c() {
            return q1.B() && q1.C();
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        public String a(byte[] bArr, int i10, int i11) {
            Charset charset = z.b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw a0.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        public int b(String str, byte[] bArr, int i10, int i11) {
            long j10;
            long j11;
            long j12;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (charAt = str.charAt(i13)) >= 128) {
                    break;
                }
                q1.H(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = str.charAt(i13);
                if (charAt2 < 128 && j13 < j14) {
                    q1.H(bArr, j13, (byte) charAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (charAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                q1.H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                q1.H(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                q1.H(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                q1.H(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    q1.H(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    q1.H(bArr, j13 + j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    q1.H(bArr, j16, (byte) ((charAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    q1.H(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                    j13 += 2;
                    q1.H(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }
    }

    static {
        f2093a = (!e.c() || androidx.datastore.preferences.protobuf.d.c()) ? new c() : new e();
    }

    public static String a(byte[] bArr, int i10, int i11) {
        return f2093a.a(bArr, i10, i11);
    }

    public static int b(String str, byte[] bArr, int i10, int i11) {
        return f2093a.b(str, bArr, i10, i11);
    }

    public static int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt >= 2048) {
                    i11 += d(str, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int d(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }
}
