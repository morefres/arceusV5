package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f8494f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f8495a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f8496c;

    /* renamed from: d, reason: collision with root package name */
    public j f8497d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8498e;

    public static final class b extends i {

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f8499g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f8500h;

        /* renamed from: i, reason: collision with root package name */
        public int f8501i;

        /* renamed from: j, reason: collision with root package name */
        public int f8502j;

        /* renamed from: k, reason: collision with root package name */
        public int f8503k;

        /* renamed from: l, reason: collision with root package name */
        public int f8504l;

        /* renamed from: m, reason: collision with root package name */
        public int f8505m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f8506n;

        /* renamed from: o, reason: collision with root package name */
        public int f8507o;

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() {
            int L = L();
            if (L > 0) {
                int i10 = this.f8501i;
                int i11 = this.f8503k;
                if (L <= i10 - i11) {
                    String str = new String(this.f8499g, i11, L, a0.b);
                    this.f8503k += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw b0.g();
            }
            throw b0.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String B() {
            int L = L();
            if (L > 0) {
                int i10 = this.f8501i;
                int i11 = this.f8503k;
                if (L <= i10 - i11) {
                    String e10 = r1.e(this.f8499g, i11, L);
                    this.f8503k += L;
                    return e10;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw b0.g();
            }
            throw b0.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            if (f()) {
                this.f8505m = 0;
                return 0;
            }
            int L = L();
            this.f8505m = L;
            if (s1.a(L) != 0) {
                return this.f8505m;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int D() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long E() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
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
                throw b0.e();
            }
            P(4);
            return true;
        }

        public byte H() {
            int i10 = this.f8503k;
            if (i10 == this.f8501i) {
                throw b0.m();
            }
            byte[] bArr = this.f8499g;
            this.f8503k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) {
            if (i10 > 0) {
                int i11 = this.f8501i;
                int i12 = this.f8503k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f8503k = i13;
                    return Arrays.copyOfRange(this.f8499g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw b0.m();
            }
            if (i10 == 0) {
                return a0.f8439d;
            }
            throw b0.g();
        }

        public int J() {
            int i10 = this.f8503k;
            if (this.f8501i - i10 < 4) {
                throw b0.m();
            }
            byte[] bArr = this.f8499g;
            this.f8503k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() {
            int i10 = this.f8503k;
            if (this.f8501i - i10 < 8) {
                throw b0.m();
            }
            byte[] bArr = this.f8499g;
            this.f8503k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f8503k;
            int i12 = this.f8501i;
            if (i12 != i11) {
                byte[] bArr = this.f8499g;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f8503k = i13;
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
                    this.f8503k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f8503k;
            int i11 = this.f8501i;
            if (i11 != i10) {
                byte[] bArr = this.f8499g;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f8503k = i12;
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
                    this.f8503k = i13;
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
            throw b0.f();
        }

        public final void O() {
            int i10 = this.f8501i + this.f8502j;
            this.f8501i = i10;
            int i11 = i10 - this.f8504l;
            int i12 = this.f8507o;
            if (i11 <= i12) {
                this.f8502j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f8502j = i13;
            this.f8501i = i10 - i13;
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f8501i;
                int i12 = this.f8503k;
                if (i10 <= i11 - i12) {
                    this.f8503k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw b0.m();
            }
            throw b0.g();
        }

        public final void Q() {
            if (this.f8501i - this.f8503k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f8499g;
                int i11 = this.f8503k;
                this.f8503k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        public final void S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i10) {
            if (this.f8505m != i10) {
                throw b0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int e() {
            return this.f8503k - this.f8504l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean f() {
            return this.f8503k == this.f8501i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void l(int i10) {
            this.f8507o = i10;
            O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int m(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int e10 = i10 + e();
            if (e10 < 0) {
                throw b0.h();
            }
            int i11 = this.f8507o;
            if (e10 > i11) {
                throw b0.m();
            }
            this.f8507o = e10;
            O();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean n() {
            return M() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h o() {
            int L = L();
            if (L > 0) {
                int i10 = this.f8501i;
                int i11 = this.f8503k;
                if (L <= i10 - i11) {
                    h B = (this.f8500h && this.f8506n) ? h.B(this.f8499g, i11, L) : h.f(this.f8499g, i11, L);
                    this.f8503k += L;
                    return B;
                }
            }
            return L == 0 ? h.b : h.A(I(L));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int r() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long s() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int u() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int w() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long x() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int y() {
            return i.c(L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long z() {
            return i.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f8507o = Integer.MAX_VALUE;
            this.f8499g = bArr;
            this.f8501i = i11 + i10;
            this.f8503k = i10;
            this.f8504l = i10;
            this.f8500h = z10;
        }
    }

    public static final class c extends i {

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f8508g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f8509h;

        /* renamed from: i, reason: collision with root package name */
        public int f8510i;

        /* renamed from: j, reason: collision with root package name */
        public int f8511j;

        /* renamed from: k, reason: collision with root package name */
        public int f8512k;

        /* renamed from: l, reason: collision with root package name */
        public int f8513l;

        /* renamed from: m, reason: collision with root package name */
        public int f8514m;

        /* renamed from: n, reason: collision with root package name */
        public int f8515n;

        public static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f8510i + this.f8511j;
            this.f8510i = i10;
            int i11 = this.f8514m + i10;
            int i12 = this.f8515n;
            if (i11 <= i12) {
                this.f8511j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f8511j = i13;
            this.f8510i = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() {
            if (this.f8510i - this.f8512k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f8509h;
                int i11 = this.f8512k;
                this.f8512k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() {
            int Q = Q();
            if (Q > 0) {
                int i10 = this.f8510i;
                int i11 = this.f8512k;
                if (Q <= i10 - i11) {
                    String str = new String(this.f8509h, i11, Q, a0.b);
                    this.f8512k += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q < 0) {
                throw b0.g();
            }
            if (Q > this.f8510i) {
                return new String(L(Q, false), a0.b);
            }
            U(Q);
            String str2 = new String(this.f8509h, this.f8512k, Q, a0.b);
            this.f8512k += Q;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String B() {
            byte[] L;
            int Q = Q();
            int i10 = this.f8512k;
            int i11 = this.f8510i;
            if (Q <= i11 - i10 && Q > 0) {
                L = this.f8509h;
                this.f8512k = i10 + Q;
            } else {
                if (Q == 0) {
                    return "";
                }
                if (Q < 0) {
                    throw b0.g();
                }
                i10 = 0;
                if (Q <= i11) {
                    U(Q);
                    L = this.f8509h;
                    this.f8512k = Q;
                } else {
                    L = L(Q, false);
                }
            }
            return r1.e(L, i10, Q);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            if (f()) {
                this.f8513l = 0;
                return 0;
            }
            int Q = Q();
            this.f8513l = Q;
            if (s1.a(Q) != 0) {
                return this.f8513l;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int D() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long E() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
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
                throw b0.e();
            }
            W(4);
            return true;
        }

        public final h J(int i10) {
            byte[] M = M(i10);
            if (M != null) {
                return h.e(M);
            }
            int i11 = this.f8512k;
            int i12 = this.f8510i;
            int i13 = i12 - i11;
            this.f8514m += i12;
            this.f8512k = 0;
            this.f8510i = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8509h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return h.A(bArr);
        }

        public byte K() {
            if (this.f8512k == this.f8510i) {
                U(1);
            }
            byte[] bArr = this.f8509h;
            int i10 = this.f8512k;
            this.f8512k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) {
            byte[] M = M(i10);
            if (M != null) {
                return z10 ? (byte[]) M.clone() : M;
            }
            int i11 = this.f8512k;
            int i12 = this.f8510i;
            int i13 = i12 - i11;
            this.f8514m += i12;
            this.f8512k = 0;
            this.f8510i = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8509h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) {
            if (i10 == 0) {
                return a0.f8439d;
            }
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f8514m;
            int i12 = this.f8512k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f8496c > 0) {
                throw b0.l();
            }
            int i14 = this.f8515n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            int i15 = this.f8510i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f8508g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8509h, this.f8512k, bArr, 0, i15);
            this.f8514m += this.f8510i;
            this.f8512k = 0;
            this.f8510i = 0;
            while (i15 < i10) {
                int I = I(this.f8508g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw b0.m();
                }
                this.f8514m += I;
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
                    int read = this.f8508g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw b0.m();
                    }
                    this.f8514m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() {
            int i10 = this.f8512k;
            if (this.f8510i - i10 < 4) {
                U(4);
                i10 = this.f8512k;
            }
            byte[] bArr = this.f8509h;
            this.f8512k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() {
            int i10 = this.f8512k;
            if (this.f8510i - i10 < 8) {
                U(8);
                i10 = this.f8512k;
            }
            byte[] bArr = this.f8509h;
            this.f8512k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f8512k;
            int i12 = this.f8510i;
            if (i12 != i11) {
                byte[] bArr = this.f8509h;
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b >= 0) {
                    this.f8512k = i13;
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
                    this.f8512k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f8512k;
            int i11 = this.f8510i;
            if (i11 != i10) {
                byte[] bArr = this.f8509h;
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b >= 0) {
                    this.f8512k = i12;
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
                    this.f8512k = i13;
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
            throw b0.f();
        }

        public final void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f8496c - this.f8514m) - this.f8512k) {
                throw b0.m();
            }
            throw b0.l();
        }

        public void W(int i10) {
            int i11 = this.f8510i;
            int i12 = this.f8512k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f8512k = i12 + i10;
            }
        }

        public final void X(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f8514m;
            int i12 = this.f8512k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f8515n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            this.f8514m = i11 + i12;
            int i15 = this.f8510i - i12;
            this.f8510i = 0;
            this.f8512k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long V = V(this.f8508g, j10);
                    if (V < 0 || V > j10) {
                        throw new IllegalStateException(this.f8508g.getClass() + "#skip returned invalid result: " + V + "\nThe InputStream implementation is buggy.");
                    }
                    if (V == 0) {
                        break;
                    } else {
                        i15 += (int) V;
                    }
                } finally {
                    this.f8514m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f8510i;
            int i17 = i16 - this.f8512k;
            this.f8512k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f8510i;
                if (i18 <= i19) {
                    this.f8512k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f8512k = i19;
                    U(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i10) {
            if (this.f8513l != i10) {
                throw b0.b();
            }
        }

        public final boolean b0(int i10) {
            int i11 = this.f8512k;
            int i12 = i11 + i10;
            int i13 = this.f8510i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f8496c;
            int i15 = this.f8514m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f8515n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f8509h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f8514m += i11;
                this.f8510i -= i11;
                this.f8512k = 0;
            }
            InputStream inputStream = this.f8508g;
            byte[] bArr2 = this.f8509h;
            int i16 = this.f8510i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f8496c - this.f8514m) - i16));
            if (I == 0 || I < -1 || I > this.f8509h.length) {
                throw new IllegalStateException(this.f8508g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f8510i += I;
            T();
            if (this.f8510i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int e() {
            return this.f8514m + this.f8512k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean f() {
            return this.f8512k == this.f8510i && !b0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void l(int i10) {
            this.f8515n = i10;
            T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int m(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = i10 + this.f8514m + this.f8512k;
            if (i11 < 0) {
                throw b0.h();
            }
            int i12 = this.f8515n;
            if (i11 > i12) {
                throw b0.m();
            }
            this.f8515n = i11;
            T();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean n() {
            return R() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h o() {
            int Q = Q();
            int i10 = this.f8510i;
            int i11 = this.f8512k;
            if (Q <= i10 - i11 && Q > 0) {
                h f10 = h.f(this.f8509h, i11, Q);
                this.f8512k += Q;
                return f10;
            }
            if (Q == 0) {
                return h.b;
            }
            if (Q >= 0) {
                return J(Q);
            }
            throw b0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int r() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long s() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int u() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long v() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int w() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long x() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int y() {
            return i.c(Q());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long z() {
            return i.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f8515n = Integer.MAX_VALUE;
            a0.b(inputStream, "input");
            this.f8508g = inputStream;
            this.f8509h = new byte[i10];
            this.f8510i = 0;
            this.f8512k = 0;
            this.f8514m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static i g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static i h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(a0.f8439d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static i j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static i k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (b0 e10) {
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
            this.f8495a++;
            this.f8495a--;
        } while (F(C));
    }

    public abstract void a(int i10);

    public void b() {
        if (this.f8495a >= this.b) {
            throw b0.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract h o();

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

    public i() {
        this.b = f8494f;
        this.f8496c = Integer.MAX_VALUE;
        this.f8498e = false;
    }
}
