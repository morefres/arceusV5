package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f7100a = 100;

    public static int a(byte[] bArr, int i10, f3 f3Var) {
        int i11 = i(bArr, i10, f3Var);
        int i12 = f3Var.f7086a;
        if (i12 < 0) {
            throw new f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - i11) {
            throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            f3Var.f7087c = s3.b;
            return i11;
        }
        f3Var.f7087c = s3.k(bArr, i11, i12);
        return i11 + i12;
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int c(h6 h6Var, byte[] bArr, int i10, int i11, int i12, f3 f3Var) {
        Object zze = h6Var.zze();
        int m10 = m(zze, h6Var, bArr, i10, i11, i12, f3Var);
        h6Var.b(zze);
        f3Var.f7087c = zze;
        return m10;
    }

    public static int d(h6 h6Var, byte[] bArr, int i10, int i11, f3 f3Var) {
        Object zze = h6Var.zze();
        int n10 = n(zze, h6Var, bArr, i10, i11, f3Var);
        h6Var.b(zze);
        f3Var.f7087c = zze;
        return n10;
    }

    public static int e(h6 h6Var, int i10, byte[] bArr, int i11, int i12, y4 y4Var, f3 f3Var) {
        int d10 = d(h6Var, bArr, i11, i12, f3Var);
        y4Var.add(f3Var.f7087c);
        while (d10 < i12) {
            int i13 = i(bArr, d10, f3Var);
            if (i10 != f3Var.f7086a) {
                break;
            }
            d10 = d(h6Var, bArr, i13, i12, f3Var);
            y4Var.add(f3Var.f7087c);
        }
        return d10;
    }

    public static int f(byte[] bArr, int i10, y4 y4Var, f3 f3Var) {
        u4 u4Var = (u4) y4Var;
        int i11 = i(bArr, i10, f3Var);
        int i12 = f3Var.f7086a;
        if (i12 < 0) {
            throw new f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - i11) {
            throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = i12 + i11;
        while (i11 < i13) {
            i11 = i(bArr, i11, f3Var);
            u4Var.x(f3Var.f7086a);
        }
        if (i11 == i13) {
            return i11;
        }
        throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int g(byte[] bArr, int i10, f3 f3Var) {
        int i11;
        int i12 = i(bArr, i10, f3Var);
        int i13 = f3Var.f7086a;
        if (i13 < 0) {
            throw new f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            f3Var.f7087c = "";
            return i12;
        }
        int i14 = e7.f7085a;
        int length = bArr.length;
        if ((((length - i12) - i13) | i12 | i13) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        int i15 = i12 + i13;
        char[] cArr = new char[i13];
        int i16 = 0;
        while (i12 < i15) {
            byte b = bArr[i12];
            if (!b7.d(b)) {
                break;
            }
            i12++;
            cArr[i16] = (char) b;
            i16++;
        }
        int i17 = i16;
        while (i12 < i15) {
            int i18 = i12 + 1;
            byte b10 = bArr[i12];
            if (b7.d(b10)) {
                cArr[i17] = (char) b10;
                i17++;
                i12 = i18;
                while (i12 < i15) {
                    byte b11 = bArr[i12];
                    if (b7.d(b11)) {
                        i12++;
                        cArr[i17] = (char) b11;
                        i17++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i18 >= i15) {
                        throw new f5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i17 + 1;
                    i12 += 2;
                    b7.c(b10, bArr[i18], cArr, i17);
                } else if (b10 < -16) {
                    if (i18 >= i15 - 1) {
                        throw new f5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i17 + 1;
                    int i19 = i12 + 2;
                    i12 += 3;
                    b7.b(b10, bArr[i18], bArr[i19], cArr, i17);
                } else {
                    if (i18 >= i15 - 2) {
                        throw new f5("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i18];
                    int i20 = i12 + 3;
                    byte b13 = bArr[i12 + 2];
                    i12 += 4;
                    b7.a(b10, b12, b13, bArr[i20], cArr, i17);
                    i17 += 2;
                }
                i17 = i11;
            }
        }
        f3Var.f7087c = new String(cArr, 0, i17);
        return i15;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, u6 u6Var, f3 f3Var) {
        if ((i10 >>> 3) == 0) {
            throw new f5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int l10 = l(bArr, i11, f3Var);
            u6Var.j(i10, Long.valueOf(f3Var.b));
            return l10;
        }
        if (i13 == 1) {
            u6Var.j(i10, Long.valueOf(o(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int i14 = i(bArr, i11, f3Var);
            int i15 = f3Var.f7086a;
            if (i15 < 0) {
                throw new f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - i14) {
                throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                u6Var.j(i10, s3.b);
            } else {
                u6Var.j(i10, s3.k(bArr, i14, i15));
            }
            return i14 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new f5("Protocol message contained an invalid tag (zero).");
            }
            u6Var.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        u6 f10 = u6.f();
        int i17 = f3Var.f7089e + 1;
        f3Var.f7089e = i17;
        p(i17);
        int i18 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int i19 = i(bArr, i11, f3Var);
            int i20 = f3Var.f7086a;
            if (i20 == i16) {
                i18 = i20;
                i11 = i19;
                break;
            }
            i11 = h(i20, bArr, i19, i12, f10, f3Var);
            i18 = i20;
        }
        f3Var.f7089e--;
        if (i11 > i12 || i18 != i16) {
            throw new f5("Failed to parse the message.");
        }
        u6Var.j(i10, f10);
        return i11;
    }

    public static int i(byte[] bArr, int i10, f3 f3Var) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return j(b, bArr, i11, f3Var);
        }
        f3Var.f7086a = b;
        return i11;
    }

    public static int j(int i10, byte[] bArr, int i11, f3 f3Var) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            f3Var.f7086a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            f3Var.f7086a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            f3Var.f7086a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            f3Var.f7086a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                f3Var.f7086a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, y4 y4Var, f3 f3Var) {
        u4 u4Var = (u4) y4Var;
        int i13 = i(bArr, i11, f3Var);
        u4Var.x(f3Var.f7086a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, f3Var);
            if (i10 != f3Var.f7086a) {
                break;
            }
            i13 = i(bArr, i14, f3Var);
            u4Var.x(f3Var.f7086a);
        }
        return i13;
    }

    public static int l(byte[] bArr, int i10, f3 f3Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            f3Var.b = j10;
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
        f3Var.b = j11;
        return i12;
    }

    public static int m(Object obj, h6 h6Var, byte[] bArr, int i10, int i11, int i12, f3 f3Var) {
        int i13 = f3Var.f7089e + 1;
        f3Var.f7089e = i13;
        p(i13);
        int v5 = ((a6) h6Var).v(obj, bArr, i10, i11, i12, f3Var);
        f3Var.f7089e--;
        f3Var.f7087c = obj;
        return v5;
    }

    public static int n(Object obj, h6 h6Var, byte[] bArr, int i10, int i11, f3 f3Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = j(i13, bArr, i12, f3Var);
            i13 = f3Var.f7086a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = f3Var.f7089e + 1;
        f3Var.f7089e = i15;
        p(i15);
        int i16 = i14 + i13;
        h6Var.f(obj, bArr, i14, i16, f3Var);
        f3Var.f7089e--;
        f3Var.f7087c = obj;
        return i16;
    }

    public static long o(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static void p(int i10) {
        if (i10 >= f7100a) {
            throw new f5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
