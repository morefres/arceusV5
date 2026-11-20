package we;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34198a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final c b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f34199c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f34200a;
        public final long[] b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f34201c;

        public a() {
            this(new long[10], new long[10], new long[10]);
        }

        public void a(a aVar, int i10) {
            we.d.a(this.f34200a, aVar.f34200a, i10);
            we.d.a(this.b, aVar.b, i10);
            we.d.a(this.f34201c, aVar.f34201c, i10);
        }

        public void b(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f34200a = jArr;
            this.b = jArr2;
            this.f34201c = jArr3;
        }

        public a(a aVar) {
            this.f34200a = Arrays.copyOf(aVar.f34200a, 10);
            this.b = Arrays.copyOf(aVar.b, 10);
            this.f34201c = Arrays.copyOf(aVar.f34201c, 10);
        }
    }

    public static class b extends a {

        /* renamed from: d, reason: collision with root package name */
        public final long[] f34202d;

        public b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // we.e.a
        public void b(long[] jArr, long[] jArr2) {
            i.f(jArr, jArr2, this.f34202d);
        }

        public b(C0636e c0636e) {
            this();
            long[] jArr = this.f34200a;
            d dVar = c0636e.f34206a;
            i.o(jArr, dVar.b, dVar.f34204a);
            long[] jArr2 = this.b;
            d dVar2 = c0636e.f34206a;
            i.m(jArr2, dVar2.b, dVar2.f34204a);
            System.arraycopy(c0636e.f34206a.f34205c, 0, this.f34202d, 0, 10);
            i.f(this.f34201c, c0636e.b, f.b);
        }

        public b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f34202d = jArr3;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f34203a;
        public final long[] b;

        public c() {
            this(new d(), new long[10]);
        }

        public c(d dVar, long[] jArr) {
            this.f34203a = dVar;
            this.b = jArr;
        }

        public c(c cVar) {
            this.f34203a = new d(cVar.f34203a);
            this.b = Arrays.copyOf(cVar.b, 10);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f34204a;
        public final long[] b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f34205c;

        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        public static d a(d dVar, c cVar) {
            i.f(dVar.f34204a, cVar.f34203a.f34204a, cVar.b);
            long[] jArr = dVar.b;
            d dVar2 = cVar.f34203a;
            i.f(jArr, dVar2.b, dVar2.f34205c);
            i.f(dVar.f34205c, cVar.f34203a.f34205c, cVar.b);
            return dVar;
        }

        public boolean b() {
            long[] jArr = new long[10];
            i.k(jArr, this.f34204a);
            long[] jArr2 = new long[10];
            i.k(jArr2, this.b);
            long[] jArr3 = new long[10];
            i.k(jArr3, this.f34205c);
            long[] jArr4 = new long[10];
            i.k(jArr4, jArr3);
            long[] jArr5 = new long[10];
            i.m(jArr5, jArr2, jArr);
            i.f(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            i.f(jArr6, jArr, jArr2);
            i.f(jArr6, jArr6, f.f34208a);
            i.n(jArr6, jArr4);
            i.h(jArr6, jArr6);
            return df.e.b(i.a(jArr5), i.a(jArr6));
        }

        public byte[] c() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            i.e(jArr, this.f34205c);
            i.f(jArr2, this.f34204a, jArr);
            i.f(jArr3, this.b, jArr);
            byte[] a10 = i.a(jArr3);
            a10[31] = (byte) ((e.k(jArr2) << 7) ^ a10[31]);
            return a10;
        }

        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f34204a = jArr;
            this.b = jArr2;
            this.f34205c = jArr3;
        }

        public d(d dVar) {
            this.f34204a = Arrays.copyOf(dVar.f34204a, 10);
            this.b = Arrays.copyOf(dVar.b, 10);
            this.f34205c = Arrays.copyOf(dVar.f34205c, 10);
        }

        public d(c cVar) {
            this();
            a(this, cVar);
        }
    }

    /* renamed from: we.e$e, reason: collision with other inner class name */
    public static class C0636e {

        /* renamed from: a, reason: collision with root package name */
        public final d f34206a;
        public final long[] b;

        public C0636e() {
            this(new d(), new long[10]);
        }

        public static C0636e c(byte[] bArr) {
            long[] jArr = new long[10];
            long[] c10 = i.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            i.k(jArr4, c10);
            i.f(jArr5, jArr4, f.f34208a);
            i.m(jArr4, jArr4, jArr2);
            i.o(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            i.k(jArr8, jArr5);
            i.f(jArr8, jArr8, jArr5);
            i.k(jArr, jArr8);
            i.f(jArr, jArr, jArr5);
            i.f(jArr, jArr, jArr4);
            e.s(jArr, jArr);
            i.f(jArr, jArr, jArr8);
            i.f(jArr, jArr, jArr4);
            i.k(jArr6, jArr);
            i.f(jArr6, jArr6, jArr5);
            i.m(jArr7, jArr6, jArr4);
            if (e.m(jArr7)) {
                i.o(jArr7, jArr6, jArr4);
                if (e.m(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                i.f(jArr, jArr, f.f34209c);
            }
            if (!e.m(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (e.k(jArr) == ((bArr[31] & 255) >> 7)) {
                e.r(jArr, jArr);
            }
            i.f(jArr3, jArr, c10);
            return new C0636e(new d(jArr, c10, jArr2), jArr3);
        }

        public static C0636e d(C0636e c0636e, c cVar) {
            i.f(c0636e.f34206a.f34204a, cVar.f34203a.f34204a, cVar.b);
            long[] jArr = c0636e.f34206a.b;
            d dVar = cVar.f34203a;
            i.f(jArr, dVar.b, dVar.f34205c);
            i.f(c0636e.f34206a.f34205c, cVar.f34203a.f34205c, cVar.b);
            long[] jArr2 = c0636e.b;
            d dVar2 = cVar.f34203a;
            i.f(jArr2, dVar2.f34204a, dVar2.b);
            return c0636e;
        }

        public C0636e(d dVar, long[] jArr) {
            this.f34206a = dVar;
            this.b = jArr;
        }

        public C0636e(c cVar) {
            this();
            d(this, cVar);
        }
    }

    public static boolean A(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!n(copyOfRange)) {
            return false;
        }
        MessageDigest a10 = df.m.f14680e.a("SHA-512");
        a10.update(bArr2, 0, 32);
        a10.update(bArr3);
        a10.update(bArr);
        byte[] digest = a10.digest();
        t(digest);
        byte[] c10 = f(digest, C0636e.c(bArr3), copyOfRange).c();
        for (int i10 = 0; i10 < 32; i10++) {
            if (c10[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static void e(c cVar, C0636e c0636e, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f34203a.f34204a;
        d dVar = c0636e.f34206a;
        i.o(jArr2, dVar.b, dVar.f34204a);
        long[] jArr3 = cVar.f34203a.b;
        d dVar2 = c0636e.f34206a;
        i.m(jArr3, dVar2.b, dVar2.f34204a);
        long[] jArr4 = cVar.f34203a.b;
        i.f(jArr4, jArr4, aVar.b);
        d dVar3 = cVar.f34203a;
        i.f(dVar3.f34205c, dVar3.f34204a, aVar.f34200a);
        i.f(cVar.b, c0636e.b, aVar.f34201c);
        aVar.b(cVar.f34203a.f34204a, c0636e.f34206a.f34205c);
        long[] jArr5 = cVar.f34203a.f34204a;
        i.o(jArr, jArr5, jArr5);
        d dVar4 = cVar.f34203a;
        i.m(dVar4.f34204a, dVar4.f34205c, dVar4.b);
        d dVar5 = cVar.f34203a;
        long[] jArr6 = dVar5.b;
        i.o(jArr6, dVar5.f34205c, jArr6);
        i.o(cVar.f34203a.f34205c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        i.m(jArr7, jArr, jArr7);
    }

    public static d f(byte[] bArr, C0636e c0636e, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(c0636e);
        c cVar = new c();
        h(cVar, c0636e);
        C0636e c0636e2 = new C0636e(cVar);
        for (int i10 = 1; i10 < 8; i10++) {
            e(cVar, c0636e2, bVarArr[i10 - 1]);
            bVarArr[i10] = new b(new C0636e(cVar));
        }
        byte[] y10 = y(bArr);
        byte[] y11 = y(bArr2);
        c cVar2 = new c(b);
        C0636e c0636e3 = new C0636e();
        int i11 = 255;
        while (i11 >= 0 && y10[i11] == 0 && y11[i11] == 0) {
            i11--;
        }
        while (i11 >= 0) {
            g(cVar2, new d(cVar2));
            byte b10 = y10[i11];
            if (b10 > 0) {
                e(cVar2, C0636e.d(c0636e3, cVar2), bVarArr[y10[i11] / 2]);
            } else if (b10 < 0) {
                z(cVar2, C0636e.d(c0636e3, cVar2), bVarArr[(-y10[i11]) / 2]);
            }
            byte b11 = y11[i11];
            if (b11 > 0) {
                e(cVar2, C0636e.d(c0636e3, cVar2), f.f34211e[y11[i11] / 2]);
            } else if (b11 < 0) {
                z(cVar2, C0636e.d(c0636e3, cVar2), f.f34211e[(-y11[i11]) / 2]);
            }
            i11--;
        }
        return new d(cVar2);
    }

    public static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        i.k(cVar.f34203a.f34204a, dVar.f34204a);
        i.k(cVar.f34203a.f34205c, dVar.b);
        i.k(cVar.b, dVar.f34205c);
        long[] jArr2 = cVar.b;
        i.o(jArr2, jArr2, jArr2);
        i.o(cVar.f34203a.b, dVar.f34204a, dVar.b);
        i.k(jArr, cVar.f34203a.b);
        d dVar2 = cVar.f34203a;
        i.o(dVar2.b, dVar2.f34205c, dVar2.f34204a);
        d dVar3 = cVar.f34203a;
        long[] jArr3 = dVar3.f34205c;
        i.m(jArr3, jArr3, dVar3.f34204a);
        d dVar4 = cVar.f34203a;
        i.m(dVar4.f34204a, jArr, dVar4.b);
        long[] jArr4 = cVar.b;
        i.m(jArr4, jArr4, cVar.f34203a.f34205c);
    }

    public static void h(c cVar, C0636e c0636e) {
        g(cVar, c0636e.f34206a);
    }

    public static int i(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return ((i14 & (i14 << 1)) >> 7) & 1;
    }

    public static byte[] j(byte[] bArr) {
        MessageDigest a10 = df.m.f14680e.a("SHA-512");
        a10.update(bArr, 0, 32);
        byte[] digest = a10.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b10 = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = b10;
        digest[31] = (byte) (b10 | 64);
        return digest;
    }

    public static int k(long[] jArr) {
        return i.a(jArr)[0] & 1;
    }

    public static void l() {
        if (f.f34208a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static boolean m(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        i.i(jArr2);
        for (byte b10 : i.a(jArr2)) {
            if (b10 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(byte[] bArr) {
        for (int i10 = 31; i10 >= 0; i10--) {
            int i11 = bArr[i10] & 255;
            int i12 = f34199c[i10] & 255;
            if (i11 != i12) {
                return i11 < i12;
            }
        }
        return false;
    }

    public static long o(byte[] bArr, int i10) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static long p(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | o(bArr, i10);
    }

    public static void q(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long o8 = o(bArr2, 0) & 2097151;
        long p8 = (p(bArr2, 2) >> 5) & 2097151;
        long o10 = (o(bArr2, 5) >> 2) & 2097151;
        long p10 = (p(bArr2, 7) >> 7) & 2097151;
        long p11 = (p(bArr2, 10) >> 4) & 2097151;
        long o11 = (o(bArr2, 13) >> 1) & 2097151;
        long p12 = (p(bArr2, 15) >> 6) & 2097151;
        long o12 = (o(bArr2, 18) >> 3) & 2097151;
        long o13 = o(bArr2, 21) & 2097151;
        long p13 = (p(bArr2, 23) >> 5) & 2097151;
        long o14 = (o(bArr2, 26) >> 2) & 2097151;
        long p14 = p(bArr2, 28) >> 7;
        long o15 = o(bArr3, 0) & 2097151;
        long p15 = (p(bArr3, 2) >> 5) & 2097151;
        long o16 = (o(bArr3, 5) >> 2) & 2097151;
        long p16 = (p(bArr3, 7) >> 7) & 2097151;
        long p17 = (p(bArr3, 10) >> 4) & 2097151;
        long o17 = (o(bArr3, 13) >> 1) & 2097151;
        long p18 = (p(bArr3, 15) >> 6) & 2097151;
        long o18 = (o(bArr3, 18) >> 3) & 2097151;
        long o19 = o(bArr3, 21) & 2097151;
        long p19 = (p(bArr3, 23) >> 5) & 2097151;
        long o20 = (o(bArr3, 26) >> 2) & 2097151;
        long p20 = p(bArr3, 28) >> 7;
        long o21 = o(bArr4, 0) & 2097151;
        long p21 = (p(bArr4, 2) >> 5) & 2097151;
        long o22 = (o(bArr4, 5) >> 2) & 2097151;
        long p22 = (p(bArr4, 7) >> 7) & 2097151;
        long p23 = (p(bArr4, 10) >> 4) & 2097151;
        long o23 = (o(bArr4, 13) >> 1) & 2097151;
        long p24 = (p(bArr4, 15) >> 6) & 2097151;
        long o24 = (o(bArr4, 18) >> 3) & 2097151;
        long o25 = o(bArr4, 21) & 2097151;
        long j10 = o21 + (o8 * o15);
        long j11 = p21 + (o8 * p15) + (p8 * o15);
        long j12 = o22 + (o8 * o16) + (p8 * p15) + (o10 * o15);
        long j13 = p22 + (o8 * p16) + (p8 * o16) + (o10 * p15) + (p10 * o15);
        long j14 = p23 + (o8 * p17) + (p8 * p16) + (o10 * o16) + (p10 * p15) + (p11 * o15);
        long j15 = o23 + (o8 * o17) + (p8 * p17) + (o10 * p16) + (p10 * o16) + (p11 * p15) + (o11 * o15);
        long j16 = p24 + (o8 * p18) + (p8 * o17) + (o10 * p17) + (p10 * p16) + (p11 * o16) + (o11 * p15) + (p12 * o15);
        long j17 = o24 + (o8 * o18) + (p8 * p18) + (o10 * o17) + (p10 * p17) + (p11 * p16) + (o11 * o16) + (p12 * p15) + (o12 * o15);
        long j18 = o25 + (o8 * o19) + (p8 * o18) + (o10 * p18) + (p10 * o17) + (p11 * p17) + (o11 * p16) + (p12 * o16) + (o12 * p15) + (o13 * o15);
        long p25 = ((p(bArr4, 23) >> 5) & 2097151) + (o8 * p19) + (p8 * o19) + (o10 * o18) + (p10 * p18) + (p11 * o17) + (o11 * p17) + (p12 * p16) + (o12 * o16) + (o13 * p15) + (p13 * o15);
        long o26 = ((o(bArr4, 26) >> 2) & 2097151) + (o8 * o20) + (p8 * p19) + (o10 * o19) + (p10 * o18) + (p11 * p18) + (o11 * o17) + (p12 * p17) + (o12 * p16) + (o13 * o16) + (p13 * p15) + (o14 * o15);
        long p26 = (p(bArr4, 28) >> 7) + (o8 * p20) + (p8 * o20) + (o10 * p19) + (p10 * o19) + (p11 * o18) + (o11 * p18) + (p12 * o17) + (o12 * p17) + (o13 * p16) + (p13 * o16) + (o14 * p15) + (o15 * p14);
        long j19 = (p8 * p20) + (o10 * o20) + (p10 * p19) + (p11 * o19) + (o11 * o18) + (p12 * p18) + (o12 * o17) + (o13 * p17) + (p13 * p16) + (o14 * o16) + (p15 * p14);
        long j20 = (o10 * p20) + (p10 * o20) + (p11 * p19) + (o11 * o19) + (p12 * o18) + (o12 * p18) + (o13 * o17) + (p13 * p17) + (o14 * p16) + (o16 * p14);
        long j21 = (p10 * p20) + (p11 * o20) + (o11 * p19) + (p12 * o19) + (o12 * o18) + (o13 * p18) + (p13 * o17) + (o14 * p17) + (p16 * p14);
        long j22 = (p11 * p20) + (o11 * o20) + (p12 * p19) + (o12 * o19) + (o13 * o18) + (p13 * p18) + (o14 * o17) + (p17 * p14);
        long j23 = (o11 * p20) + (p12 * o20) + (o12 * p19) + (o13 * o19) + (p13 * o18) + (o14 * p18) + (o17 * p14);
        long j24 = (p12 * p20) + (o12 * o20) + (o13 * p19) + (p13 * o19) + (o14 * o18) + (p18 * p14);
        long j25 = (o12 * p20) + (o13 * o20) + (p13 * p19) + (o14 * o19) + (o18 * p14);
        long j26 = (o13 * p20) + (p13 * o20) + (o14 * p19) + (o19 * p14);
        long j27 = (p13 * p20) + (o14 * o20) + (p19 * p14);
        long j28 = (o14 * p20) + (o20 * p14);
        long j29 = p14 * p20;
        long j30 = (j10 + 1048576) >> 21;
        long j31 = j11 + j30;
        long j32 = j10 - (j30 << 21);
        long j33 = (j12 + 1048576) >> 21;
        long j34 = j13 + j33;
        long j35 = j12 - (j33 << 21);
        long j36 = (j14 + 1048576) >> 21;
        long j37 = j15 + j36;
        long j38 = j14 - (j36 << 21);
        long j39 = (j16 + 1048576) >> 21;
        long j40 = j17 + j39;
        long j41 = j16 - (j39 << 21);
        long j42 = (j18 + 1048576) >> 21;
        long j43 = p25 + j42;
        long j44 = j18 - (j42 << 21);
        long j45 = (o26 + 1048576) >> 21;
        long j46 = p26 + j45;
        long j47 = o26 - (j45 << 21);
        long j48 = (j19 + 1048576) >> 21;
        long j49 = j20 + j48;
        long j50 = j19 - (j48 << 21);
        long j51 = (j21 + 1048576) >> 21;
        long j52 = j22 + j51;
        long j53 = j21 - (j51 << 21);
        long j54 = (j23 + 1048576) >> 21;
        long j55 = j24 + j54;
        long j56 = j23 - (j54 << 21);
        long j57 = (j25 + 1048576) >> 21;
        long j58 = j26 + j57;
        long j59 = j25 - (j57 << 21);
        long j60 = (j27 + 1048576) >> 21;
        long j61 = j28 + j60;
        long j62 = j27 - (j60 << 21);
        long j63 = (j29 + 1048576) >> 21;
        long j64 = (j31 + 1048576) >> 21;
        long j65 = j35 + j64;
        long j66 = j31 - (j64 << 21);
        long j67 = (j34 + 1048576) >> 21;
        long j68 = j38 + j67;
        long j69 = j34 - (j67 << 21);
        long j70 = (j37 + 1048576) >> 21;
        long j71 = j41 + j70;
        long j72 = j37 - (j70 << 21);
        long j73 = (j40 + 1048576) >> 21;
        long j74 = j44 + j73;
        long j75 = j40 - (j73 << 21);
        long j76 = (j43 + 1048576) >> 21;
        long j77 = j47 + j76;
        long j78 = j43 - (j76 << 21);
        long j79 = (j46 + 1048576) >> 21;
        long j80 = j50 + j79;
        long j81 = j46 - (j79 << 21);
        long j82 = (j49 + 1048576) >> 21;
        long j83 = j53 + j82;
        long j84 = j49 - (j82 << 21);
        long j85 = (j52 + 1048576) >> 21;
        long j86 = j56 + j85;
        long j87 = j52 - (j85 << 21);
        long j88 = (j55 + 1048576) >> 21;
        long j89 = j59 + j88;
        long j90 = j55 - (j88 << 21);
        long j91 = (j58 + 1048576) >> 21;
        long j92 = j62 + j91;
        long j93 = j58 - (j91 << 21);
        long j94 = (j61 + 1048576) >> 21;
        long j95 = (j29 - (j63 << 21)) + j94;
        long j96 = j61 - (j94 << 21);
        long j97 = j87 + (j63 * 136657);
        long j98 = j86 - (j63 * 683901);
        long j99 = ((j84 + (j63 * 654183)) - (j95 * 997805)) + (j96 * 136657);
        long j100 = ((j83 - (j63 * 997805)) + (j95 * 136657)) - (j96 * 683901);
        long j101 = ((((j81 + (j63 * 666643)) + (j95 * 470296)) + (j96 * 654183)) - (j92 * 997805)) + (j93 * 136657);
        long j102 = ((((j80 + (j63 * 470296)) + (j95 * 654183)) - (j96 * 997805)) + (j92 * 136657)) - (j93 * 683901);
        long j103 = j71 + (j89 * 666643);
        long j104 = j74 + (j92 * 666643) + (j93 * 470296) + (j89 * 654183);
        long j105 = ((((j77 + (j95 * 666643)) + (j96 * 470296)) + (j92 * 654183)) - (j93 * 997805)) + (j89 * 136657);
        long j106 = (j103 + 1048576) >> 21;
        long j107 = j75 + (j93 * 666643) + (j89 * 470296) + j106;
        long j108 = j103 - (j106 << 21);
        long j109 = (j104 + 1048576) >> 21;
        long j110 = ((((j78 + (j96 * 666643)) + (j92 * 470296)) + (j93 * 654183)) - (j89 * 997805)) + j109;
        long j111 = j104 - (j109 << 21);
        long j112 = (j105 + 1048576) >> 21;
        long j113 = (j101 - (j89 * 683901)) + j112;
        long j114 = j105 - (j112 << 21);
        long j115 = (j102 + 1048576) >> 21;
        long j116 = (j99 - (j92 * 683901)) + j115;
        long j117 = j102 - (j115 << 21);
        long j118 = (j100 + 1048576) >> 21;
        long j119 = (j97 - (j95 * 683901)) + j118;
        long j120 = j100 - (j118 << 21);
        long j121 = (j98 + 1048576) >> 21;
        long j122 = j90 + j121;
        long j123 = j98 - (j121 << 21);
        long j124 = (j107 + 1048576) >> 21;
        long j125 = j111 + j124;
        long j126 = j107 - (j124 << 21);
        long j127 = (j110 + 1048576) >> 21;
        long j128 = j114 + j127;
        long j129 = j110 - (j127 << 21);
        long j130 = (j113 + 1048576) >> 21;
        long j131 = j117 + j130;
        long j132 = j113 - (j130 << 21);
        long j133 = (j116 + 1048576) >> 21;
        long j134 = j120 + j133;
        long j135 = j116 - (j133 << 21);
        long j136 = (j119 + 1048576) >> 21;
        long j137 = j123 + j136;
        long j138 = j119 - (j136 << 21);
        long j139 = j128 - (j122 * 683901);
        long j140 = ((j125 - (j122 * 997805)) + (j137 * 136657)) - (j138 * 683901);
        long j141 = ((((j108 + (j122 * 470296)) + (j137 * 654183)) - (j138 * 997805)) + (j134 * 136657)) - (j135 * 683901);
        long j142 = j32 + (j131 * 666643);
        long j143 = j65 + (j134 * 666643) + (j135 * 470296) + (j131 * 654183);
        long j144 = ((((j68 + (j137 * 666643)) + (j138 * 470296)) + (j134 * 654183)) - (j135 * 997805)) + (j131 * 136657);
        long j145 = (j142 + 1048576) >> 21;
        long j146 = j66 + (j135 * 666643) + (j131 * 470296) + j145;
        long j147 = j142 - (j145 << 21);
        long j148 = (j143 + 1048576) >> 21;
        long j149 = ((((j69 + (j138 * 666643)) + (j134 * 470296)) + (j135 * 654183)) - (j131 * 997805)) + j148;
        long j150 = j143 - (j148 << 21);
        long j151 = (j144 + 1048576) >> 21;
        long j152 = ((((((j72 + (j122 * 666643)) + (j137 * 470296)) + (j138 * 654183)) - (j134 * 997805)) + (j135 * 136657)) - (j131 * 683901)) + j151;
        long j153 = j144 - (j151 << 21);
        long j154 = (j141 + 1048576) >> 21;
        long j155 = ((((j126 + (j122 * 654183)) - (j137 * 997805)) + (j138 * 136657)) - (j134 * 683901)) + j154;
        long j156 = j141 - (j154 << 21);
        long j157 = (j140 + 1048576) >> 21;
        long j158 = ((j129 + (j122 * 136657)) - (j137 * 683901)) + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j139 + 1048576) >> 21;
        long j161 = j132 + j160;
        long j162 = j139 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = j153 + j166;
        long j168 = j149 - (j166 << 21);
        long j169 = (j152 + 1048576) >> 21;
        long j170 = j156 + j169;
        long j171 = j152 - (j169 << 21);
        long j172 = (j155 + 1048576) >> 21;
        long j173 = j159 + j172;
        long j174 = j155 - (j172 << 21);
        long j175 = (j158 + 1048576) >> 21;
        long j176 = (j161 + 1048576) >> 21;
        long j177 = j161 - (j176 << 21);
        long j178 = j147 + (j176 * 666643);
        long j179 = j165 + (j176 * 470296);
        long j180 = j164 + (j176 * 654183);
        long j181 = j168 - (j176 * 997805);
        long j182 = j167 + (j176 * 136657);
        long j183 = j171 - (j176 * 683901);
        long j184 = j178 >> 21;
        long j185 = j179 + j184;
        long j186 = j178 - (j184 << 21);
        long j187 = j185 >> 21;
        long j188 = j180 + j187;
        long j189 = j185 - (j187 << 21);
        long j190 = j188 >> 21;
        long j191 = j181 + j190;
        long j192 = j188 - (j190 << 21);
        long j193 = j191 >> 21;
        long j194 = j182 + j193;
        long j195 = j191 - (j193 << 21);
        long j196 = j194 >> 21;
        long j197 = j183 + j196;
        long j198 = j194 - (j196 << 21);
        long j199 = j197 >> 21;
        long j200 = j170 + j199;
        long j201 = j197 - (j199 << 21);
        long j202 = j200 >> 21;
        long j203 = j174 + j202;
        long j204 = j200 - (j202 << 21);
        long j205 = j203 >> 21;
        long j206 = j173 + j205;
        long j207 = j203 - (j205 << 21);
        long j208 = j206 >> 21;
        long j209 = (j158 - (j175 << 21)) + j208;
        long j210 = j206 - (j208 << 21);
        long j211 = j209 >> 21;
        long j212 = j162 + j175 + j211;
        long j213 = j209 - (j211 << 21);
        long j214 = j212 >> 21;
        long j215 = j177 + j214;
        long j216 = j212 - (j214 << 21);
        long j217 = j215 >> 21;
        long j218 = j215 - (j217 << 21);
        long j219 = j186 + (666643 * j217);
        long j220 = j189 + (470296 * j217);
        long j221 = j192 + (654183 * j217);
        long j222 = j195 - (997805 * j217);
        long j223 = j198 + (136657 * j217);
        long j224 = j201 - (j217 * 683901);
        long j225 = j219 >> 21;
        long j226 = j220 + j225;
        long j227 = j226 >> 21;
        long j228 = j221 + j227;
        long j229 = j226 - (j227 << 21);
        long j230 = j228 >> 21;
        long j231 = j222 + j230;
        long j232 = j228 - (j230 << 21);
        long j233 = j231 >> 21;
        long j234 = j223 + j233;
        long j235 = j231 - (j233 << 21);
        long j236 = j234 >> 21;
        long j237 = j224 + j236;
        long j238 = j234 - (j236 << 21);
        long j239 = j237 >> 21;
        long j240 = j204 + j239;
        long j241 = j237 - (j239 << 21);
        long j242 = j240 >> 21;
        long j243 = j207 + j242;
        long j244 = j240 - (j242 << 21);
        long j245 = j243 >> 21;
        long j246 = j210 + j245;
        long j247 = j243 - (j245 << 21);
        long j248 = j246 >> 21;
        long j249 = j213 + j248;
        long j250 = j249 >> 21;
        long j251 = j216 + j250;
        long j252 = j249 - (j250 << 21);
        long j253 = j251 >> 21;
        long j254 = j218 + j253;
        long j255 = j251 - (j253 << 21);
        bArr[0] = (byte) (j219 - (j225 << 21));
        bArr[1] = (byte) (r0 >> 8);
        bArr[2] = (byte) ((r0 >> 16) | (j229 << 5));
        bArr[3] = (byte) (j229 >> 3);
        bArr[4] = (byte) (j229 >> 11);
        bArr[5] = (byte) ((j229 >> 19) | (j232 << 2));
        bArr[6] = (byte) (j232 >> 6);
        bArr[7] = (byte) ((j232 >> 14) | (j235 << 7));
        bArr[8] = (byte) (j235 >> 1);
        bArr[9] = (byte) (j235 >> 9);
        bArr[10] = (byte) ((j235 >> 17) | (j238 << 4));
        bArr[11] = (byte) (j238 >> 4);
        bArr[12] = (byte) (j238 >> 12);
        bArr[13] = (byte) ((j238 >> 20) | (j241 << 1));
        bArr[14] = (byte) (j241 >> 7);
        bArr[15] = (byte) ((j241 >> 15) | (j244 << 6));
        bArr[16] = (byte) (j244 >> 2);
        bArr[17] = (byte) (j244 >> 10);
        bArr[18] = (byte) ((j244 >> 18) | (j247 << 3));
        bArr[19] = (byte) (j247 >> 5);
        bArr[20] = (byte) (j247 >> 13);
        bArr[21] = (byte) (j246 - (j248 << 21));
        bArr[22] = (byte) (r4 >> 8);
        bArr[23] = (byte) ((r4 >> 16) | (j252 << 5));
        bArr[24] = (byte) (j252 >> 3);
        bArr[25] = (byte) (j252 >> 11);
        bArr[26] = (byte) ((j252 >> 19) | (j255 << 2));
        bArr[27] = (byte) (j255 >> 6);
        bArr[28] = (byte) ((j255 >> 14) | (j254 << 7));
        bArr[29] = (byte) (j254 >> 1);
        bArr[30] = (byte) (j254 >> 9);
        bArr[31] = (byte) (j254 >> 17);
    }

    public static void r(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    public static void s(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        i.k(jArr3, jArr2);
        i.k(jArr4, jArr3);
        i.k(jArr4, jArr4);
        i.f(jArr4, jArr2, jArr4);
        i.f(jArr3, jArr3, jArr4);
        i.k(jArr3, jArr3);
        i.f(jArr3, jArr4, jArr3);
        i.k(jArr4, jArr3);
        for (int i10 = 1; i10 < 5; i10++) {
            i.k(jArr4, jArr4);
        }
        i.f(jArr3, jArr4, jArr3);
        i.k(jArr4, jArr3);
        for (int i11 = 1; i11 < 10; i11++) {
            i.k(jArr4, jArr4);
        }
        i.f(jArr4, jArr4, jArr3);
        i.k(jArr5, jArr4);
        for (int i12 = 1; i12 < 20; i12++) {
            i.k(jArr5, jArr5);
        }
        i.f(jArr4, jArr5, jArr4);
        i.k(jArr4, jArr4);
        for (int i13 = 1; i13 < 10; i13++) {
            i.k(jArr4, jArr4);
        }
        i.f(jArr3, jArr4, jArr3);
        i.k(jArr4, jArr3);
        for (int i14 = 1; i14 < 50; i14++) {
            i.k(jArr4, jArr4);
        }
        i.f(jArr4, jArr4, jArr3);
        i.k(jArr5, jArr4);
        for (int i15 = 1; i15 < 100; i15++) {
            i.k(jArr5, jArr5);
        }
        i.f(jArr4, jArr5, jArr4);
        i.k(jArr4, jArr4);
        for (int i16 = 1; i16 < 50; i16++) {
            i.k(jArr4, jArr4);
        }
        i.f(jArr3, jArr4, jArr3);
        i.k(jArr3, jArr3);
        i.k(jArr3, jArr3);
        i.f(jArr, jArr3, jArr2);
    }

    public static void t(byte[] bArr) {
        long o8 = o(bArr, 0) & 2097151;
        long p8 = (p(bArr, 2) >> 5) & 2097151;
        long o10 = (o(bArr, 5) >> 2) & 2097151;
        long p10 = (p(bArr, 7) >> 7) & 2097151;
        long p11 = (p(bArr, 10) >> 4) & 2097151;
        long o11 = (o(bArr, 13) >> 1) & 2097151;
        long p12 = (p(bArr, 15) >> 6) & 2097151;
        long o12 = (o(bArr, 18) >> 3) & 2097151;
        long o13 = o(bArr, 21) & 2097151;
        long p13 = (p(bArr, 23) >> 5) & 2097151;
        long o14 = (o(bArr, 26) >> 2) & 2097151;
        long p14 = (p(bArr, 28) >> 7) & 2097151;
        long p15 = (p(bArr, 31) >> 4) & 2097151;
        long o15 = (o(bArr, 34) >> 1) & 2097151;
        long p16 = (p(bArr, 36) >> 6) & 2097151;
        long o16 = (o(bArr, 39) >> 3) & 2097151;
        long o17 = o(bArr, 42) & 2097151;
        long p17 = (p(bArr, 44) >> 5) & 2097151;
        long o18 = (o(bArr, 47) >> 2) & 2097151;
        long p18 = (p(bArr, 49) >> 7) & 2097151;
        long p19 = (p(bArr, 52) >> 4) & 2097151;
        long o19 = (o(bArr, 55) >> 1) & 2097151;
        long p20 = (p(bArr, 57) >> 6) & 2097151;
        long p21 = p(bArr, 60) >> 3;
        long j10 = o17 - (p21 * 683901);
        long j11 = ((p16 - (p21 * 997805)) + (p20 * 136657)) - (o19 * 683901);
        long j12 = ((((p15 + (p21 * 470296)) + (p20 * 654183)) - (o19 * 997805)) + (p19 * 136657)) - (p18 * 683901);
        long j13 = p12 + (o18 * 666643);
        long j14 = o12 + (p18 * 666643) + (o18 * 470296);
        long j15 = o13 + (p19 * 666643) + (p18 * 470296) + (o18 * 654183);
        long j16 = (((p13 + (o19 * 666643)) + (p19 * 470296)) + (p18 * 654183)) - (o18 * 997805);
        long j17 = ((((o14 + (p20 * 666643)) + (o19 * 470296)) + (p19 * 654183)) - (p18 * 997805)) + (o18 * 136657);
        long j18 = (((((p14 + (p21 * 666643)) + (p20 * 470296)) + (o19 * 654183)) - (p19 * 997805)) + (p18 * 136657)) - (o18 * 683901);
        long j19 = (j13 + 1048576) >> 21;
        long j20 = j14 + j19;
        long j21 = j13 - (j19 << 21);
        long j22 = (j15 + 1048576) >> 21;
        long j23 = j16 + j22;
        long j24 = j15 - (j22 << 21);
        long j25 = (j17 + 1048576) >> 21;
        long j26 = j18 + j25;
        long j27 = j17 - (j25 << 21);
        long j28 = (j12 + 1048576) >> 21;
        long j29 = ((((o15 + (p21 * 654183)) - (p20 * 997805)) + (o19 * 136657)) - (p19 * 683901)) + j28;
        long j30 = j12 - (j28 << 21);
        long j31 = (j11 + 1048576) >> 21;
        long j32 = ((o16 + (p21 * 136657)) - (p20 * 683901)) + j31;
        long j33 = j11 - (j31 << 21);
        long j34 = (j10 + 1048576) >> 21;
        long j35 = p17 + j34;
        long j36 = j10 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = (j26 + 1048576) >> 21;
        long j44 = j30 + j43;
        long j45 = j26 - (j43 << 21);
        long j46 = (j29 + 1048576) >> 21;
        long j47 = j33 + j46;
        long j48 = j29 - (j46 << 21);
        long j49 = (j32 + 1048576) >> 21;
        long j50 = j36 + j49;
        long j51 = j32 - (j49 << 21);
        long j52 = j41 - (j35 * 683901);
        long j53 = ((j38 - (j35 * 997805)) + (j50 * 136657)) - (j51 * 683901);
        long j54 = ((((j21 + (j35 * 470296)) + (j50 * 654183)) - (j51 * 997805)) + (j47 * 136657)) - (j48 * 683901);
        long j55 = o8 + (j44 * 666643);
        long j56 = p8 + (j48 * 666643) + (j44 * 470296);
        long j57 = o10 + (j47 * 666643) + (j48 * 470296) + (j44 * 654183);
        long j58 = (((p10 + (j51 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j44 * 997805);
        long j59 = ((((p11 + (j50 * 666643)) + (j51 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j44 * 136657);
        long j60 = (((((o11 + (j35 * 666643)) + (j50 * 470296)) + (j51 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j44 * 683901);
        long j61 = (j55 + 1048576) >> 21;
        long j62 = j56 + j61;
        long j63 = j55 - (j61 << 21);
        long j64 = (j57 + 1048576) >> 21;
        long j65 = j58 + j64;
        long j66 = j57 - (j64 << 21);
        long j67 = (j59 + 1048576) >> 21;
        long j68 = j60 + j67;
        long j69 = j59 - (j67 << 21);
        long j70 = (j54 + 1048576) >> 21;
        long j71 = ((((j39 + (j35 * 654183)) - (j50 * 997805)) + (j51 * 136657)) - (j47 * 683901)) + j70;
        long j72 = j54 - (j70 << 21);
        long j73 = (j53 + 1048576) >> 21;
        long j74 = ((j42 + (j35 * 136657)) - (j50 * 683901)) + j73;
        long j75 = j53 - (j73 << 21);
        long j76 = (j52 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j52 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = j69 + j82;
        long j84 = j65 - (j82 << 21);
        long j85 = (j68 + 1048576) >> 21;
        long j86 = j72 + j85;
        long j87 = j68 - (j85 << 21);
        long j88 = (j71 + 1048576) >> 21;
        long j89 = j75 + j88;
        long j90 = j71 - (j88 << 21);
        long j91 = (j74 + 1048576) >> 21;
        long j92 = (j77 + 1048576) >> 21;
        long j93 = j77 - (j92 << 21);
        long j94 = j63 + (j92 * 666643);
        long j95 = j81 + (j92 * 470296);
        long j96 = j80 + (j92 * 654183);
        long j97 = j84 - (j92 * 997805);
        long j98 = j83 + (j92 * 136657);
        long j99 = j87 - (j92 * 683901);
        long j100 = j94 >> 21;
        long j101 = j95 + j100;
        long j102 = j94 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j96 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j97 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j98 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j99 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = j86 + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j90 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j89 + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = (j74 - (j91 << 21)) + j124;
        long j126 = j122 - (j124 << 21);
        long j127 = j125 >> 21;
        long j128 = j78 + j91 + j127;
        long j129 = j125 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = j93 + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = j131 - (j133 << 21);
        long j135 = j102 + (666643 * j133);
        long j136 = j105 + (470296 * j133);
        long j137 = j108 + (654183 * j133);
        long j138 = j111 - (997805 * j133);
        long j139 = j114 + (136657 * j133);
        long j140 = j117 - (j133 * 683901);
        long j141 = j135 >> 21;
        long j142 = j136 + j141;
        long j143 = j135 - (j141 << 21);
        long j144 = j142 >> 21;
        long j145 = j137 + j144;
        long j146 = j142 - (j144 << 21);
        long j147 = j145 >> 21;
        long j148 = j138 + j147;
        long j149 = j145 - (j147 << 21);
        long j150 = j148 >> 21;
        long j151 = j139 + j150;
        long j152 = j148 - (j150 << 21);
        long j153 = j151 >> 21;
        long j154 = j140 + j153;
        long j155 = j151 - (j153 << 21);
        long j156 = j154 >> 21;
        long j157 = j120 + j156;
        long j158 = j154 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = j123 + j159;
        long j161 = j157 - (j159 << 21);
        long j162 = j160 >> 21;
        long j163 = j126 + j162;
        long j164 = j160 - (j162 << 21);
        long j165 = j163 >> 21;
        long j166 = j129 + j165;
        long j167 = j163 - (j165 << 21);
        long j168 = j166 >> 21;
        long j169 = j132 + j168;
        long j170 = j166 - (j168 << 21);
        long j171 = j169 >> 21;
        long j172 = j134 + j171;
        long j173 = j169 - (j171 << 21);
        bArr[0] = (byte) j143;
        bArr[1] = (byte) (j143 >> 8);
        bArr[2] = (byte) ((j143 >> 16) | (j146 << 5));
        bArr[3] = (byte) (j146 >> 3);
        bArr[4] = (byte) (j146 >> 11);
        bArr[5] = (byte) ((j146 >> 19) | (j149 << 2));
        bArr[6] = (byte) (j149 >> 6);
        bArr[7] = (byte) ((j149 >> 14) | (j152 << 7));
        bArr[8] = (byte) (j152 >> 1);
        bArr[9] = (byte) (j152 >> 9);
        bArr[10] = (byte) ((j152 >> 17) | (j155 << 4));
        bArr[11] = (byte) (j155 >> 4);
        bArr[12] = (byte) (j155 >> 12);
        bArr[13] = (byte) ((j155 >> 20) | (j158 << 1));
        bArr[14] = (byte) (j158 >> 7);
        bArr[15] = (byte) ((j158 >> 15) | (j161 << 6));
        bArr[16] = (byte) (j161 >> 2);
        bArr[17] = (byte) (j161 >> 10);
        bArr[18] = (byte) ((j161 >> 18) | (j164 << 3));
        bArr[19] = (byte) (j164 >> 5);
        bArr[20] = (byte) (j164 >> 13);
        bArr[21] = (byte) j167;
        bArr[22] = (byte) (j167 >> 8);
        bArr[23] = (byte) ((j167 >> 16) | (j170 << 5));
        bArr[24] = (byte) (j170 >> 3);
        bArr[25] = (byte) (j170 >> 11);
        bArr[26] = (byte) ((j170 >> 19) | (j173 << 2));
        bArr[27] = (byte) (j173 >> 6);
        bArr[28] = (byte) ((j173 >> 14) | (j172 << 7));
        bArr[29] = (byte) (j172 >> 1);
        bArr[30] = (byte) (j172 >> 9);
        bArr[31] = (byte) (j172 >> 17);
    }

    public static d u(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 * 2;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) (((bArr[i11] & 255) >> 4) & 15);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        c cVar = new c(b);
        C0636e c0636e = new C0636e();
        for (i10 = 1; i10 < 64; i10 += 2) {
            a aVar = new a(f34198a);
            w(aVar, i10 / 2, bArr2[i10]);
            e(cVar, C0636e.d(c0636e, cVar), aVar);
        }
        d dVar = new d();
        g(cVar, d.a(dVar, cVar));
        g(cVar, d.a(dVar, cVar));
        g(cVar, d.a(dVar, cVar));
        g(cVar, d.a(dVar, cVar));
        for (int i16 = 0; i16 < 64; i16 += 2) {
            a aVar2 = new a(f34198a);
            w(aVar2, i16 / 2, bArr2[i16]);
            e(cVar, C0636e.d(c0636e, cVar), aVar2);
        }
        d dVar2 = new d(cVar);
        if (dVar2.b()) {
            return dVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] v(byte[] bArr) {
        return u(bArr).c();
    }

    public static void w(a aVar, int i10, byte b10) {
        int i11 = (b10 & 255) >> 7;
        int i12 = b10 - (((-i11) & b10) << 1);
        a[][] aVarArr = f.f34210d;
        aVar.a(aVarArr[i10][0], i(i12, 1));
        aVar.a(aVarArr[i10][1], i(i12, 2));
        aVar.a(aVarArr[i10][2], i(i12, 3));
        aVar.a(aVarArr[i10][3], i(i12, 4));
        aVar.a(aVarArr[i10][4], i(i12, 5));
        aVar.a(aVarArr[i10][5], i(i12, 6));
        aVar.a(aVarArr[i10][6], i(i12, 7));
        aVar.a(aVarArr[i10][7], i(i12, 8));
        long[] copyOf = Arrays.copyOf(aVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(aVar.f34200a, 10);
        long[] copyOf3 = Arrays.copyOf(aVar.f34201c, 10);
        r(copyOf3, copyOf3);
        aVar.a(new a(copyOf, copyOf2, copyOf3), i11);
    }

    public static byte[] x(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest a10 = df.m.f14680e.a("SHA-512");
        a10.update(bArr3, 32, 32);
        a10.update(copyOfRange);
        byte[] digest = a10.digest();
        t(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(u(digest).c(), 0, 32);
        a10.reset();
        a10.update(copyOfRange2);
        a10.update(bArr2);
        a10.update(copyOfRange);
        byte[] digest2 = a10.digest();
        t(digest2);
        byte[] bArr4 = new byte[32];
        q(bArr4, digest2, bArr3, digest);
        return df.e.a(copyOfRange2, bArr4);
    }

    public static byte[] y(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 <= 15) {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        } else if (b11 - (b10 << i13) >= -15) {
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (true) {
                                if (i10 >= 256) {
                                    break;
                                }
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void z(c cVar, C0636e c0636e, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f34203a.f34204a;
        d dVar = c0636e.f34206a;
        i.o(jArr2, dVar.b, dVar.f34204a);
        long[] jArr3 = cVar.f34203a.b;
        d dVar2 = c0636e.f34206a;
        i.m(jArr3, dVar2.b, dVar2.f34204a);
        long[] jArr4 = cVar.f34203a.b;
        i.f(jArr4, jArr4, aVar.f34200a);
        d dVar3 = cVar.f34203a;
        i.f(dVar3.f34205c, dVar3.f34204a, aVar.b);
        i.f(cVar.b, c0636e.b, aVar.f34201c);
        aVar.b(cVar.f34203a.f34204a, c0636e.f34206a.f34205c);
        long[] jArr5 = cVar.f34203a.f34204a;
        i.o(jArr, jArr5, jArr5);
        d dVar4 = cVar.f34203a;
        i.m(dVar4.f34204a, dVar4.f34205c, dVar4.b);
        d dVar5 = cVar.f34203a;
        long[] jArr6 = dVar5.b;
        i.o(jArr6, dVar5.f34205c, jArr6);
        i.m(cVar.f34203a.f34205c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        i.o(jArr7, jArr, jArr7);
    }
}
