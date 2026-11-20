package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7085a = 0;

    static {
        int i10 = e3.f7081a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r10, byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.e7.a(java.lang.String, byte[], int, int):int");
    }

    public static boolean b(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return true;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b >= 0) {
                i10 = i12;
            } else {
                if (b < -32) {
                    if (i12 < i11 && b >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (b >= -16) {
                    if (i12 >= i11 - 2) {
                        return false;
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && (((b << 28) + (b10 + 112)) >> 30) == 0) {
                        int i14 = i10 + 3;
                        if (bArr[i13] <= -65) {
                            i10 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i12 >= i11 - 1) {
                    return false;
                }
                int i15 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 > -65 || (b == -32 && b11 < -96)) {
                    return false;
                }
                if (b == -19 && b11 >= -96) {
                    return false;
                }
                i10 += 3;
                if (bArr[i15] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
