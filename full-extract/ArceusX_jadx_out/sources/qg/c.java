package qg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f29805a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29806a;

        static {
            int[] iArr = new int[pg.b.values().length];
            f29806a = iArr;
            try {
                iArr[pg.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29806a[pg.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29806a[pg.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29806a[pg.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, mg.a aVar, Charset charset) {
        for (byte b10 : str.getBytes(charset)) {
            aVar.c(b10, 8);
        }
    }

    public static void b(CharSequence charSequence, mg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p8 = p(charSequence.charAt(i10));
            if (p8 == -1) {
                throw new lg.c();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int p10 = p(charSequence.charAt(i11));
                if (p10 == -1) {
                    throw new lg.c();
                }
                aVar.c((p8 * 45) + p10, 11);
                i10 += 2;
            } else {
                aVar.c(p8, 6);
                i10 = i11;
            }
        }
    }

    public static void c(String str, pg.b bVar, mg.a aVar, Charset charset) {
        int i10 = a.f29806a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
            return;
        }
        if (i10 == 3) {
            a(str, aVar, charset);
        } else {
            if (i10 == 4) {
                e(str, aVar);
                return;
            }
            throw new lg.c("Invalid mode: " + bVar);
        }
    }

    public static void d(mg.c cVar, mg.a aVar) {
        aVar.c(pg.b.ECI.a(), 4);
        aVar.c(cVar.c(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:6:0x0011->B:13:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r6, mg.a r7) {
        /*
            java.nio.charset.Charset r0 = mg.e.b
            if (r0 == 0) goto L5e
            byte[] r6 = r6.getBytes(r0)
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L56
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
        L11:
            if (r1 >= r0) goto L55
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L2d
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L2d
        L2b:
            int r2 = r2 - r3
            goto L3c
        L2d:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L3b
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L3b
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L2b
        L3b:
            r2 = r4
        L3c:
            if (r2 == r4) goto L4d
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L11
        L4d:
            lg.c r6 = new lg.c
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L55:
            return
        L56:
            lg.c r6 = new lg.c
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        L5e:
            lg.c r6 = new lg.c
            java.lang.String r7 = "SJIS Charset not supported on this platform"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.c.e(java.lang.String, mg.a):void");
    }

    public static void f(int i10, pg.c cVar, pg.b bVar, mg.a aVar) {
        int b10 = bVar.b(cVar);
        int i11 = 1 << b10;
        if (i10 < i11) {
            aVar.c(i10, b10);
            return;
        }
        throw new lg.c(i10 + " is bigger than " + (i11 - 1));
    }

    public static void g(pg.b bVar, mg.a aVar) {
        aVar.c(bVar.a(), 4);
    }

    public static void h(CharSequence charSequence, mg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    public static int i(pg.b bVar, mg.a aVar, mg.a aVar2, pg.c cVar) {
        return aVar.i() + bVar.b(cVar) + aVar2.i();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(mg.a aVar, pg.a aVar2, pg.c cVar, b bVar) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    public static pg.b l(String str, Charset charset) {
        Charset charset2 = mg.e.b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return pg.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else {
                if (p(charAt) == -1) {
                    return pg.b.BYTE;
                }
                z10 = true;
            }
        }
        return z10 ? pg.b.ALPHANUMERIC : z11 ? pg.b.NUMERIC : pg.b.BYTE;
    }

    public static pg.c m(int i10, pg.a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            pg.c e10 = pg.c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new lg.c("Data too big");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013a, code lost:
    
        if (qg.g.b(r8) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qg.g n(java.lang.String r6, pg.a r7, java.util.Map<lg.b, ?> r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.c.n(java.lang.String, pg.a, java.util.Map):qg.g");
    }

    public static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new ng.c(ng.a.f27084l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static int p(int i10) {
        int[] iArr = f29805a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new lg.c("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new lg.c("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new lg.c("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new lg.c("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    public static mg.a r(mg.a aVar, int i10, int i11, int i12) {
        if (aVar.j() != i11) {
            throw new lg.c("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i12) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i17 = i10;
            int i18 = i11;
            int i19 = i12;
            q(i17, i18, i19, i13, iArr, iArr2);
            int i20 = iArr[0];
            byte[] bArr = new byte[i20];
            aVar.n(i14 * 8, bArr, 0, i20);
            byte[] o8 = o(bArr, iArr2[0]);
            arrayList.add(new qg.a(bArr, o8));
            i15 = Math.max(i15, i20);
            i16 = Math.max(i16, o8.length);
            i14 += iArr[0];
            i13++;
            i10 = i17;
            i11 = i18;
            i12 = i19;
        }
        int i21 = i10;
        if (i11 != i14) {
            throw new lg.c("Data bytes does not match offset");
        }
        mg.a aVar2 = new mg.a();
        for (int i22 = 0; i22 < i15; i22++) {
            int size = arrayList.size();
            int i23 = 0;
            while (i23 < size) {
                Object obj = arrayList.get(i23);
                i23++;
                byte[] a10 = ((qg.a) obj).a();
                if (i22 < a10.length) {
                    aVar2.c(a10[i22], 8);
                }
            }
        }
        for (int i24 = 0; i24 < i16; i24++) {
            int size2 = arrayList.size();
            int i25 = 0;
            while (i25 < size2) {
                Object obj2 = arrayList.get(i25);
                i25++;
                byte[] b10 = ((qg.a) obj2).b();
                if (i24 < b10.length) {
                    aVar2.c(b10[i24], 8);
                }
            }
        }
        if (i21 == aVar2.j()) {
            return aVar2;
        }
        throw new lg.c("Interleaving error: " + i21 + " and " + aVar2.j() + " differ.");
    }

    public static boolean s(String str) {
        byte[] bytes = str.getBytes(mg.e.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static pg.c t(pg.a aVar, pg.b bVar, mg.a aVar2, mg.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, pg.c.e(1)), aVar)), aVar);
    }

    public static void u(int i10, mg.a aVar) {
        int i11 = i10 * 8;
        if (aVar.i() > i11) {
            throw new lg.c("data bits cannot fit in the QR Code" + aVar.i() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.i() < i11; i12++) {
            aVar.a(false);
        }
        int i13 = aVar.i() & 7;
        if (i13 > 0) {
            while (i13 < 8) {
                aVar.a(false);
                i13++;
            }
        }
        int j10 = i10 - aVar.j();
        for (int i14 = 0; i14 < j10; i14++) {
            aVar.c((i14 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.i() != i11) {
            throw new lg.c("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i10, pg.c cVar, pg.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
