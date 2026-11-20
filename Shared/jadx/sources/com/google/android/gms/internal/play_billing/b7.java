package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class b7 {
    public static /* bridge */ /* synthetic */ void a(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (e(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || e(b11) || e(b12)) {
            throw new f5("Protocol message had invalid UTF-8.");
        }
        int i11 = ((b & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    public static /* bridge */ /* synthetic */ void b(byte b, byte b10, byte b11, char[] cArr, int i10) {
        if (!e(b10)) {
            if (b == -32) {
                if (b10 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b10 < -96) {
                    b = -19;
                }
            }
            if (!e(b11)) {
                cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                return;
            }
        }
        throw new f5("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void c(byte b, byte b10, char[] cArr, int i10) {
        if (b < -62 || e(b10)) {
            throw new f5("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b & 31) << 6) | (b10 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b) {
        return b >= 0;
    }

    public static boolean e(byte b) {
        return b > -65;
    }
}
