package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f1984f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f1985a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1986c;

    /* renamed from: d, reason: collision with root package name */
    public i f1987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1988e;

    public static final class b extends h {

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f1989g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f1990h;

        /* renamed from: i, reason: collision with root package name */
        public int f1991i;

        /* renamed from: j, reason: collision with root package name */
        public int f1992j;

        /* renamed from: k, reason: collision with root package name */
        public int f1993k;

        /* renamed from: l, reason: collision with root package name */
        public int f1994l;

        /* renamed from: m, reason: collision with root package name */
        public int f1995m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f1996n;

        /* renamed from: o, reason: collision with root package name */
        public int f1997o;

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() {
            int L = L();
            if (L > 0) {
                int i10 = this.f1991i;
                int i11 = this.f1993k;
                if (L <= i10 - i11) {
                    String str = new String(this.f1989g, i11, L, z.b);
                    this.f1993k += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw a0.g();
            }
            throw a0.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() {
            int L = L();
            if (L > 0) {
                int i10 = this.f1991i;
                int i11 = this.f1993k;
                if (L <= i10 - i11) {
                    String a10 = r1.a(this.f1989g, i11, L);
                    this.f1993k += L;
                    return a10;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw a0.g();
            }
            throw a0.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() {
            if (f()) {
                this.f1995m = 0;
                return 0;
            }
            int L = L();
            this.f1995m = L;
            if (s1.a(L) != 0) {
                return this.f1995m;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) {
            int b = s1.b(i10);
            if (b == 0) {
                Q();
                return true;
            }
            if (b == 1) {
                P(8);
                return true;
            }
            if (b == 2) {
                P(L());
                return true;
            }
            if (b == 3) {
                G();
                a(s1.c(s1.a(i10), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw a0.e();
            }
            P(4);
            return true;
        }

        public byte H() {
            int i10 = this.f1993k;
            if (i10 == this.f1991i) {
                throw a0.m();
            }
            byte[] bArr = this.f1989g;
            this.f1993k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) {
            if (i10 > 0) {
                int i11 = this.f1991i;
                int i12 = this.f1993k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f1993k = i13;
                    return Arrays.copyOfRange(this.f1989g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw a0.m();
            }
            if (i10 == 0) {
                return z.f2211d;
            }
            throw a0.g();
        }

        public int J() {
            int i10 = this.f1993k;
            if (this.f1991i - i10 < 4) {
                throw a0.m();
            }
            byte[] bArr = this.f1989g;
            this.f1993k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() {
            int i10 = this.f1993k;
            if (this.f1991i - i10 < 8) {
                throw a0.m();
            }
            byte[] bArr = this.f1989g;
            this.f1993k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f1993k;
            int i12 = this.f1991i;
            if (i12 != i11) {
                byte[] bArr = this.f1989g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f1993k = i13;
                    return b;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b10 = bArr[i18];
                                int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f1993k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f1993k;
            int i11 = this.f1991i;
            if (i11 != i10) {
                byte[] bArr = this.f1989g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f1993k = i12;
                    return b;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f1993k = i13;
                    return j10;
                }
            }
            return N();
        }

        public long N() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((H() & 128) == 0) {
                    return j10;
                }
            }
            throw a0.f();
        }

        public final void O() {
            int i10 = this.f1991i + this.f1992j;
            this.f1991i = i10;
            int i11 = i10 - this.f1994l;
            int i12 = this.f1997o;
            if (i11 <= i12) {
                this.f1992j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f1992j = i13;
            this.f1991i = i10 - i13;
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f1991i;
                int i12 = this.f1993k;
                if (i10 <= i11 - i12) {
                    this.f1993k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw a0.m();
            }
            throw a0.g();
        }

        public final void Q() {
            if (this.f1991i - this.f1993k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f1989g;
                int i11 = this.f1993k;
                this.f1993k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        public final void S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) {
            if (this.f1995m != i10) {
                throw a0.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f1993k - this.f1994l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f1993k == this.f1991i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f1997o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) {
            if (i10 < 0) {
                throw a0.g();
            }
            int e10 = i10 + e();
            if (e10 < 0) {
                throw a0.h();
            }
            int i11 = this.f1997o;
            if (e10 > i11) {
                throw a0.m();
            }
            this.f1997o = e10;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int L = L();
            if (L > 0) {
                int i10 = this.f1991i;
                int i11 = this.f1993k;
                if (L <= i10 - i11) {
                    g B = (this.f1990h && this.f1996n) ? g.B(this.f1989g, i11, L) : g.f(this.f1989g, i11, L);
                    this.f1993k += L;
                    return B;
                }
            }
            return L == 0 ? g.b : g.A(I(L));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f1997o = Integer.MAX_VALUE;
            this.f1989g = bArr;
            this.f1991i = i11 + i10;
            this.f1993k = i10;
            this.f1994l = i10;
            this.f1990h = z10;
        }
    }

    public static final class c extends h {

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f1998g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f1999h;

        /* renamed from: i, reason: collision with root package name */
        public int f2000i;

        /* renamed from: j, reason: collision with root package name */
        public int f2001j;

        /* renamed from: k, reason: collision with root package name */
        public int f2002k;

        /* renamed from: l, reason: collision with root package name */
        public int f2003l;

        /* renamed from: m, reason: collision with root package name */
        public int f2004m;

        /* renamed from: n, reason: collision with root package name */
        public int f2005n;

        public static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f2000i + this.f2001j;
            this.f2000i = i10;
            int i11 = this.f2004m + i10;
            int i12 = this.f2005n;
            if (i11 <= i12) {
                this.f2001j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2001j = i13;
            this.f2000i = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (a0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() {
            if (this.f2000i - this.f2002k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f1999h;
                int i11 = this.f2002k;
                this.f2002k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() {
            int Q = Q();
            if (Q > 0) {
                int i10 = this.f2000i;
                int i11 = this.f2002k;
                if (Q <= i10 - i11) {
                    String str = new String(this.f1999h, i11, Q, z.b);
                    this.f2002k += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q < 0) {
                throw a0.g();
            }
            if (Q > this.f2000i) {
                return new String(L(Q, false), z.b);
            }
            U(Q);
            String str2 = new String(this.f1999h, this.f2002k, Q, z.b);
            this.f2002k += Q;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() {
            byte[] L;
            int Q = Q();
            int i10 = this.f2002k;
            int i11 = this.f2000i;
            if (Q <= i11 - i10 && Q > 0) {
                L = this.f1999h;
                this.f2002k = i10 + Q;
            } else {
                if (Q == 0) {
                    return "";
                }
                if (Q < 0) {
                    throw a0.g();
                }
                i10 = 0;
                if (Q <= i11) {
                    U(Q);
                    L = this.f1999h;
                    this.f2002k = Q;
                } else {
                    L = L(Q, false);
                }
            }
            return r1.a(L, i10, Q);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() {
            if (f()) {
                this.f2003l = 0;
                return 0;
            }
            int Q = Q();
            this.f2003l = Q;
            if (s1.a(Q) != 0) {
                return this.f2003l;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) {
            int b = s1.b(i10);
            if (b == 0) {
                Y();
                return true;
            }
            if (b == 1) {
                W(8);
                return true;
            }
            if (b == 2) {
                W(Q());
                return true;
            }
            if (b == 3) {
                G();
                a(s1.c(s1.a(i10), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw a0.e();
            }
            W(4);
            return true;
        }

        public final g J(int i10) {
            byte[] M = M(i10);
            if (M != null) {
                return g.e(M);
            }
            int i11 = this.f2002k;
            int i12 = this.f2000i;
            int i13 = i12 - i11;
            this.f2004m += i12;
            this.f2002k = 0;
            this.f2000i = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1999h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return g.A(bArr);
        }

        public byte K() {
            if (this.f2002k == this.f2000i) {
                U(1);
            }
            byte[] bArr = this.f1999h;
            int i10 = this.f2002k;
            this.f2002k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) {
            byte[] M = M(i10);
            if (M != null) {
                return z10 ? (byte[]) M.clone() : M;
            }
            int i11 = this.f2002k;
            int i12 = this.f2000i;
            int i13 = i12 - i11;
            this.f2004m += i12;
            this.f2002k = 0;
            this.f2000i = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1999h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) {
            if (i10 == 0) {
                return z.f2211d;
            }
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = this.f2004m;
            int i12 = this.f2002k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f1986c > 0) {
                throw a0.l();
            }
            int i14 = this.f2005n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw a0.m();
            }
            int i15 = this.f2000i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f1998g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1999h, this.f2002k, bArr, 0, i15);
            this.f2004m += this.f2000i;
            this.f2002k = 0;
            this.f2000i = 0;
            while (i15 < i10) {
                int I = I(this.f1998g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw a0.m();
                }
                this.f2004m += I;
                i15 += I;
            }
            return bArr;
        }

        public final List<byte[]> N(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f1998g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw a0.m();
                    }
                    this.f2004m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() {
            int i10 = this.f2002k;
            if (this.f2000i - i10 < 4) {
                U(4);
                i10 = this.f2002k;
            }
            byte[] bArr = this.f1999h;
            this.f2002k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() {
            int i10 = this.f2002k;
            if (this.f2000i - i10 < 8) {
                U(8);
                i10 = this.f2002k;
            }
            byte[] bArr = this.f1999h;
            this.f2002k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f2002k;
            int i12 = this.f2000i;
            if (i12 != i11) {
                byte[] bArr = this.f1999h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f2002k = i13;
                    return b;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b10 = bArr[i18];
                                int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f2002k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f2002k;
            int i11 = this.f2000i;
            if (i11 != i10) {
                byte[] bArr = this.f1999h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f2002k = i12;
                    return b;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f2002k = i13;
                    return j10;
                }
            }
            return S();
        }

        public long S() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((K() & 128) == 0) {
                    return j10;
                }
            }
            throw a0.f();
        }

        public final void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f1986c - this.f2004m) - this.f2002k) {
                throw a0.m();
            }
            throw a0.l();
        }

        public void W(int i10) {
            int i11 = this.f2000i;
            int i12 = this.f2002k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f2002k = i12 + i10;
            }
        }

        public final void X(int i10) {
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = this.f2004m;
            int i12 = this.f2002k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f2005n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw a0.m();
            }
            this.f2004m = i11 + i12;
            int i15 = this.f2000i - i12;
            this.f2000i = 0;
            this.f2002k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long V = V(this.f1998g, j10);
                    if (V < 0 || V > j10) {
                        throw new IllegalStateException(this.f1998g.getClass() + "#skip returned invalid result: " + V + "\nThe InputStream implementation is buggy.");
                    }
                    if (V == 0) {
                        break;
                    } else {
                        i15 += (int) V;
                    }
                } finally {
                    this.f2004m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f2000i;
            int i17 = i16 - this.f2002k;
            this.f2002k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f2000i;
                if (i18 <= i19) {
                    this.f2002k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f2002k = i19;
                    U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) {
            if (this.f2003l != i10) {
                throw a0.b();
            }
        }

        public final boolean b0(int i10) {
            int i11 = this.f2002k;
            int i12 = i11 + i10;
            int i13 = this.f2000i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f1986c;
            int i15 = this.f2004m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f2005n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f1999h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f2004m += i11;
                this.f2000i -= i11;
                this.f2002k = 0;
            }
            InputStream inputStream = this.f1998g;
            byte[] bArr2 = this.f1999h;
            int i16 = this.f2000i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f1986c - this.f2004m) - i16));
            if (I == 0 || I < -1 || I > this.f1999h.length) {
                throw new IllegalStateException(this.f1998g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f2000i += I;
            T();
            if (this.f2000i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f2004m + this.f2002k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f2002k == this.f2000i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f2005n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) {
            if (i10 < 0) {
                throw a0.g();
            }
            int i11 = i10 + this.f2004m + this.f2002k;
            if (i11 < 0) {
                throw a0.h();
            }
            int i12 = this.f2005n;
            if (i11 > i12) {
                throw a0.m();
            }
            this.f2005n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int Q = Q();
            int i10 = this.f2000i;
            int i11 = this.f2002k;
            if (Q <= i10 - i11 && Q > 0) {
                g f10 = g.f(this.f1999h, i11, Q);
                this.f2002k += Q;
                return f10;
            }
            if (Q == 0) {
                return g.b;
            }
            if (Q >= 0) {
                return J(Q);
            }
            throw a0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f2005n = Integer.MAX_VALUE;
            z.b(inputStream, "input");
            this.f1998g = inputStream;
            this.f1999h = new byte[i10];
            this.f2000i = 0;
            this.f2002k = 0;
            this.f2004m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(z.f2211d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (a0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() {
        int C;
        do {
            C = C();
            if (C == 0) {
                return;
            }
            b();
            this.f1985a++;
            this.f1985a--;
        } while (F(C));
    }

    public abstract void a(int i10);

    public void b() {
        if (this.f1985a >= this.b) {
            throw a0.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public h() {
        this.b = f1984f;
        this.f1986c = Integer.MAX_VALUE;
        this.f1988e = false;
    }
}
