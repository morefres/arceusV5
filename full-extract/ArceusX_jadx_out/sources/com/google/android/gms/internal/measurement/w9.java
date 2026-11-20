package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f6914a = 100;

    public static int a(byte[] bArr, int i10, v9 v9Var) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return b(b, bArr, i11, v9Var);
        }
        v9Var.f6898a = b;
        return i11;
    }

    public static int b(int i10, byte[] bArr, int i11, v9 v9Var) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            v9Var.f6898a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            v9Var.f6898a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            v9Var.f6898a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            v9Var.f6898a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                v9Var.f6898a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int c(byte[] bArr, int i10, v9 v9Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            v9Var.b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b = bArr[i11];
        long j11 = (j10 & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b = bArr[i12];
            i12 = i14;
        }
        v9Var.b = j11;
        return i12;
    }

    public static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long e(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static int f(byte[] bArr, int i10, v9 v9Var) {
        int i11;
        int a10 = a(bArr, i10, v9Var);
        int i12 = v9Var.f6898a;
        if (i12 < 0) {
            throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            v9Var.f6899c = "";
            return a10;
        }
        int i13 = vd.f6903a;
        int length = bArr.length;
        if ((((length - a10) - i12) | a10 | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(a10), Integer.valueOf(i12)));
        }
        int i14 = a10 + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (a10 < i14) {
            byte b = bArr[a10];
            if (!td.a(b)) {
                break;
            }
            a10++;
            cArr[i15] = (char) b;
            i15++;
        }
        int i16 = i15;
        while (a10 < i14) {
            int i17 = a10 + 1;
            byte b10 = bArr[a10];
            if (td.a(b10)) {
                cArr[i16] = (char) b10;
                i16++;
                a10 = i17;
                while (a10 < i14) {
                    byte b11 = bArr[a10];
                    if (td.a(b11)) {
                        a10++;
                        cArr[i16] = (char) b11;
                        i16++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i17 >= i14) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    a10 += 2;
                    td.b(b10, bArr[i17], cArr, i16);
                } else if (b10 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = a10 + 2;
                    a10 += 3;
                    td.c(b10, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i17];
                    int i19 = a10 + 3;
                    byte b13 = bArr[a10 + 2];
                    a10 += 4;
                    td.d(b10, b12, b13, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        v9Var.f6899c = new String(cArr, 0, i16);
        return i14;
    }

    public static int g(byte[] bArr, int i10, v9 v9Var) {
        int a10 = a(bArr, i10, v9Var);
        int i11 = v9Var.f6898a;
        if (i11 < 0) {
            throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - a10) {
            throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            v9Var.f6899c = ha.b;
            return a10;
        }
        v9Var.f6899c = ha.h(bArr, a10, i11);
        return a10 + i11;
    }

    public static int h(zc zcVar, byte[] bArr, int i10, int i11, v9 v9Var) {
        Object zza = zcVar.zza();
        int j10 = j(zza, zcVar, bArr, i10, i11, v9Var);
        zcVar.c(zza);
        v9Var.f6899c = zza;
        return j10;
    }

    public static int i(zc zcVar, byte[] bArr, int i10, int i11, int i12, v9 v9Var) {
        Object zza = zcVar.zza();
        int k10 = k(zza, zcVar, bArr, i10, i11, i12, v9Var);
        zcVar.c(zza);
        v9Var.f6899c = zza;
        return k10;
    }

    public static int j(Object obj, zc zcVar, byte[] bArr, int i10, int i11, v9 v9Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = b(i13, bArr, i12, v9Var);
            i13 = v9Var.f6898a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = v9Var.f6901e + 1;
        v9Var.f6901e = i15;
        q(i15);
        int i16 = i14 + i13;
        zcVar.d(obj, bArr, i14, i16, v9Var);
        v9Var.f6901e--;
        v9Var.f6899c = obj;
        return i16;
    }

    public static int k(Object obj, zc zcVar, byte[] bArr, int i10, int i11, int i12, v9 v9Var) {
        int i13 = v9Var.f6901e + 1;
        v9Var.f6901e = i13;
        q(i13);
        int x10 = ((rc) zcVar).x(obj, bArr, i10, i11, i12, v9Var);
        v9Var.f6901e--;
        v9Var.f6899c = obj;
        return x10;
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, pb pbVar, v9 v9Var) {
        hb hbVar = (hb) pbVar;
        int a10 = a(bArr, i11, v9Var);
        hbVar.x(v9Var.f6898a);
        while (a10 < i12) {
            int a11 = a(bArr, a10, v9Var);
            if (i10 != v9Var.f6898a) {
                break;
            }
            a10 = a(bArr, a11, v9Var);
            hbVar.x(v9Var.f6898a);
        }
        return a10;
    }

    public static int m(byte[] bArr, int i10, pb pbVar, v9 v9Var) {
        hb hbVar = (hb) pbVar;
        int a10 = a(bArr, i10, v9Var);
        int i11 = v9Var.f6898a + a10;
        while (a10 < i11) {
            a10 = a(bArr, a10, v9Var);
            hbVar.x(v9Var.f6898a);
        }
        if (a10 == i11) {
            return a10;
        }
        throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int n(zc zcVar, int i10, byte[] bArr, int i11, int i12, pb pbVar, v9 v9Var) {
        int h10 = h(zcVar, bArr, i11, i12, v9Var);
        pbVar.add(v9Var.f6899c);
        while (h10 < i12) {
            int a10 = a(bArr, h10, v9Var);
            if (i10 != v9Var.f6898a) {
                break;
            }
            h10 = h(zcVar, bArr, a10, i12, v9Var);
            pbVar.add(v9Var.f6899c);
        }
        return h10;
    }

    public static int o(int i10, byte[] bArr, int i11, int i12, md mdVar, v9 v9Var) {
        if ((i10 >>> 3) == 0) {
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int c10 = c(bArr, i11, v9Var);
            mdVar.k(i10, Long.valueOf(v9Var.b));
            return c10;
        }
        if (i13 == 1) {
            mdVar.k(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int a10 = a(bArr, i11, v9Var);
            int i14 = v9Var.f6898a;
            if (i14 < 0) {
                throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - a10) {
                throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                mdVar.k(i10, ha.b);
            } else {
                mdVar.k(i10, ha.h(bArr, a10, i14));
            }
            return a10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new sb("Protocol message contained an invalid tag (zero).");
            }
            mdVar.k(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        md b = md.b();
        int i16 = v9Var.f6901e + 1;
        v9Var.f6901e = i16;
        q(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int a11 = a(bArr, i11, v9Var);
            int i18 = v9Var.f6898a;
            if (i18 == i15) {
                i17 = i18;
                i11 = a11;
                break;
            }
            i11 = o(i18, bArr, a11, i12, b, v9Var);
            i17 = i18;
        }
        v9Var.f6901e--;
        if (i11 > i12 || i17 != i15) {
            throw new sb("Failed to parse the message.");
        }
        mdVar.k(i10, b);
        return i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, v9 v9Var) {
        if ((i10 >>> 3) == 0) {
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, v9Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, v9Var) + v9Var.f6898a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, v9Var);
            i15 = v9Var.f6898a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, v9Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new sb("Failed to parse the message.");
        }
        return i11;
    }

    public static void q(int i10) {
        if (i10 >= f6914a) {
            throw new sb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
