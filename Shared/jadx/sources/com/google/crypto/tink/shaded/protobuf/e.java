package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.y;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f8471a = 100;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8472a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f8472a = iArr;
            try {
                iArr[s1.b.f8603c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8472a[s1.b.f8604d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8472a[s1.b.f8605e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8472a[s1.b.f8606f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8472a[s1.b.f8607g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8472a[s1.b.f8615o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8472a[s1.b.f8608h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8472a[s1.b.f8618r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8472a[s1.b.f8609i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8472a[s1.b.f8617q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8472a[s1.b.f8610j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8472a[s1.b.f8619s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8472a[s1.b.f8620t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8472a[s1.b.f8616p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8472a[s1.b.f8614n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8472a[s1.b.f8611k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8472a[s1.b.f8612l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8472a[s1.b.f8613m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f8473a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8474c;

        /* renamed from: d, reason: collision with root package name */
        public final p f8475d;

        /* renamed from: e, reason: collision with root package name */
        public int f8476e;

        public b(p pVar) {
            pVar.getClass();
            this.f8475d = pVar;
        }
    }

    public static int A(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            J = M(bArr, J, bVar);
            j0Var.e(bVar.b);
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int J = J(bArr, i11, bVar);
        zVar.d(i.c(bVar.f8473a));
        while (J < i12) {
            int J2 = J(bArr, J, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            J = J(bArr, J2, bVar);
            zVar.d(i.c(bVar.f8473a));
        }
        return J;
    }

    public static int C(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int M = M(bArr, i11, bVar);
        j0Var.e(i.d(bVar.b));
        while (M < i12) {
            int J = J(bArr, M, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            M = M(bArr, J, bVar);
            j0Var.e(i.d(bVar.b));
        }
        return M;
    }

    public static int D(byte[] bArr, int i10, b bVar) {
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 == 0) {
            bVar.f8474c = "";
            return J;
        }
        bVar.f8474c = new String(bArr, J, i11, a0.b);
        return J + i11;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        int J = J(bArr, i11, bVar);
        int i13 = bVar.f8473a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, J, i13, a0.b));
            J += i13;
        }
        while (J < i12) {
            int J2 = J(bArr, J, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i14 = bVar.f8473a;
            if (i14 < 0) {
                throw b0.g();
            }
            if (i14 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, J, i14, a0.b));
                J += i14;
            }
        }
        return J;
    }

    public static int F(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        int J = J(bArr, i11, bVar);
        int i13 = bVar.f8473a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            int i14 = J + i13;
            if (!r1.m(bArr, J, i14)) {
                throw b0.d();
            }
            iVar.add(new String(bArr, J, i13, a0.b));
            J = i14;
        }
        while (J < i12) {
            int J2 = J(bArr, J, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i15 = bVar.f8473a;
            if (i15 < 0) {
                throw b0.g();
            }
            if (i15 == 0) {
                iVar.add("");
            } else {
                int i16 = J + i15;
                if (!r1.m(bArr, J, i16)) {
                    throw b0.d();
                }
                iVar.add(new String(bArr, J, i15, a0.b));
                J = i16;
            }
        }
        return J;
    }

    public static int G(byte[] bArr, int i10, b bVar) {
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 == 0) {
            bVar.f8474c = "";
            return J;
        }
        bVar.f8474c = r1.e(bArr, J, i11);
        return J + i11;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, o1 o1Var, b bVar) {
        if (s1.a(i10) == 0) {
            throw b0.c();
        }
        int b10 = s1.b(i10);
        if (b10 == 0) {
            int M = M(bArr, i11, bVar);
            o1Var.n(i10, Long.valueOf(bVar.b));
            return M;
        }
        if (b10 == 1) {
            o1Var.n(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (b10 == 2) {
            int J = J(bArr, i11, bVar);
            int i13 = bVar.f8473a;
            if (i13 < 0) {
                throw b0.g();
            }
            if (i13 > bArr.length - J) {
                throw b0.m();
            }
            if (i13 == 0) {
                o1Var.n(i10, h.b);
            } else {
                o1Var.n(i10, h.f(bArr, J, i13));
            }
            return J + i13;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw b0.c();
            }
            o1Var.n(i10, Integer.valueOf(i(bArr, i11)));
            return i11 + 4;
        }
        o1 k10 = o1.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = bVar.f8476e + 1;
        bVar.f8476e = i15;
        a(i15);
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int J2 = J(bArr, i11, bVar);
            i16 = bVar.f8473a;
            if (i16 == i14) {
                i11 = J2;
                break;
            }
            i11 = H(i16, bArr, J2, i12, k10, bVar);
        }
        bVar.f8476e--;
        if (i11 > i12 || i16 != i14) {
            throw b0.h();
        }
        o1Var.n(i10, k10);
        return i11;
    }

    public static int I(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f8473a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f8473a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f8473a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f8473a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f8473a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int J(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return I(b10, bArr, i11, bVar);
        }
        bVar.f8473a = b10;
        return i11;
    }

    public static int K(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int J = J(bArr, i11, bVar);
        zVar.d(bVar.f8473a);
        while (J < i12) {
            int J2 = J(bArr, J, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            J = J(bArr, J2, bVar);
            zVar.d(bVar.f8473a);
        }
        return J;
    }

    public static int L(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.b = j11;
        return i11;
    }

    public static int M(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return L(j10, bArr, i11, bVar);
        }
        bVar.b = j10;
        return i11;
    }

    public static int N(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int M = M(bArr, i11, bVar);
        j0Var.e(bVar.b);
        while (M < i12) {
            int J = J(bArr, M, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            M = M(bArr, J, bVar);
            j0Var.e(bVar.b);
        }
        return M;
    }

    public static int O(Object obj, g1 g1Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        int i13 = bVar.f8476e + 1;
        bVar.f8476e = i13;
        a(i13);
        int d02 = ((v0) g1Var).d0(obj, bArr, i10, i11, i12, bVar);
        bVar.f8476e--;
        bVar.f8474c = obj;
        return d02;
    }

    public static int P(Object obj, g1 g1Var, byte[] bArr, int i10, int i11, b bVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = I(i13, bArr, i12, bVar);
            i13 = bVar.f8473a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw b0.m();
        }
        int i15 = bVar.f8476e + 1;
        bVar.f8476e = i15;
        a(i15);
        int i16 = i14 + i13;
        g1Var.h(obj, bArr, i14, i16, bVar);
        bVar.f8476e--;
        bVar.f8474c = obj;
        return i16;
    }

    public static int Q(int i10, byte[] bArr, int i11, int i12, b bVar) {
        if (s1.a(i10) == 0) {
            throw b0.c();
        }
        int b10 = s1.b(i10);
        if (b10 == 0) {
            return M(bArr, i11, bVar);
        }
        if (b10 == 1) {
            return i11 + 8;
        }
        if (b10 == 2) {
            return J(bArr, i11, bVar) + bVar.f8473a;
        }
        if (b10 != 3) {
            if (b10 == 5) {
                return i11 + 4;
            }
            throw b0.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = J(bArr, i11, bVar);
            i14 = bVar.f8473a;
            if (i14 == i13) {
                break;
            }
            i11 = Q(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw b0.h();
        }
        return i11;
    }

    public static void a(int i10) {
        if (i10 >= f8471a) {
            throw b0.i();
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        f fVar = (f) iVar;
        int M = M(bArr, i11, bVar);
        fVar.e(bVar.b != 0);
        while (M < i12) {
            int J = J(bArr, M, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            M = M(bArr, J, bVar);
            fVar.e(bVar.b != 0);
        }
        return M;
    }

    public static int c(byte[] bArr, int i10, b bVar) {
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 > bArr.length - J) {
            throw b0.m();
        }
        if (i11 == 0) {
            bVar.f8474c = h.b;
            return J;
        }
        bVar.f8474c = h.f(bArr, J, i11);
        return J + i11;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        int J = J(bArr, i11, bVar);
        int i13 = bVar.f8473a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 > bArr.length - J) {
            throw b0.m();
        }
        if (i13 == 0) {
            iVar.add(h.b);
        } else {
            iVar.add(h.f(bArr, J, i13));
            J += i13;
        }
        while (J < i12) {
            int J2 = J(bArr, J, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            J = J(bArr, J2, bVar);
            int i14 = bVar.f8473a;
            if (i14 < 0) {
                throw b0.g();
            }
            if (i14 > bArr.length - J) {
                throw b0.m();
            }
            if (i14 == 0) {
                iVar.add(h.b);
            } else {
                iVar.add(h.f(bArr, J, i14));
                J += i14;
            }
        }
        return J;
    }

    public static double e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        mVar.d(e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int J = J(bArr, i13, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            mVar.d(e(bArr, J));
            i13 = J + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int i10, byte[] bArr, int i11, int i12, y.c<?, ?> cVar, y.e<?, ?> eVar, n1<o1, o1> n1Var, b bVar) {
        int i13;
        int i14;
        u<y.d> uVar = cVar.extensions;
        int i15 = i10 >>> 3;
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f8472a[eVar.a().ordinal()]) {
                case 1:
                    m mVar = new m();
                    int t8 = t(bArr, i11, mVar, bVar);
                    uVar.x(eVar.b, mVar);
                    return t8;
                case 2:
                    w wVar = new w();
                    int w5 = w(bArr, i11, wVar, bVar);
                    uVar.x(eVar.b, wVar);
                    return w5;
                case 3:
                case 4:
                    j0 j0Var = new j0();
                    int A = A(bArr, i11, j0Var, bVar);
                    uVar.x(eVar.b, j0Var);
                    return A;
                case 5:
                case 6:
                    z zVar = new z();
                    int z10 = z(bArr, i11, zVar, bVar);
                    uVar.x(eVar.b, zVar);
                    return z10;
                case 7:
                case 8:
                    j0 j0Var2 = new j0();
                    int v5 = v(bArr, i11, j0Var2, bVar);
                    uVar.x(eVar.b, j0Var2);
                    return v5;
                case 9:
                case 10:
                    z zVar2 = new z();
                    int u8 = u(bArr, i11, zVar2, bVar);
                    uVar.x(eVar.b, zVar2);
                    return u8;
                case 11:
                    f fVar = new f();
                    int s8 = s(bArr, i11, fVar, bVar);
                    uVar.x(eVar.b, fVar);
                    return s8;
                case 12:
                    z zVar3 = new z();
                    int x10 = x(bArr, i11, zVar3, bVar);
                    uVar.x(eVar.b, zVar3);
                    return x10;
                case 13:
                    j0 j0Var3 = new j0();
                    int y10 = y(bArr, i11, j0Var3, bVar);
                    uVar.x(eVar.b, j0Var3);
                    return y10;
                case 14:
                    z zVar4 = new z();
                    int z11 = z(bArr, i11, zVar4, bVar);
                    i1.z(cVar, i15, zVar4, eVar.b.b(), null, n1Var);
                    uVar.x(eVar.b, zVar4);
                    return z11;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
        }
        Object obj = null;
        if (eVar.a() == s1.b.f8616p) {
            i11 = J(bArr, i11, bVar);
            if (eVar.b.b().a(bVar.f8473a) == null) {
                i1.J(cVar, i15, bVar.f8473a, null, n1Var);
                return i11;
            }
            obj = Integer.valueOf(bVar.f8473a);
        } else {
            switch (a.f8472a[eVar.a().ordinal()]) {
                case 1:
                    i13 = i11;
                    obj = Double.valueOf(e(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    obj = Float.valueOf(m(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = M(bArr, i11, bVar);
                    obj = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i11 = J(bArr, i11, bVar);
                    obj = Integer.valueOf(bVar.f8473a);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    obj = Long.valueOf(k(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    obj = Integer.valueOf(i(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = M(bArr, i11, bVar);
                    obj = Boolean.valueOf(bVar.b != 0);
                    break;
                case 12:
                    i11 = J(bArr, i11, bVar);
                    obj = Integer.valueOf(i.c(bVar.f8473a));
                    break;
                case 13:
                    i11 = M(bArr, i11, bVar);
                    obj = Long.valueOf(i.d(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = c(bArr, i11, bVar);
                    obj = bVar.f8474c;
                    break;
                case 16:
                    i11 = D(bArr, i11, bVar);
                    obj = bVar.f8474c;
                    break;
                case 17:
                    int i16 = (i15 << 3) | 4;
                    g1 c10 = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int o8 = o(c10, bArr, i11, i12, i16, bVar);
                        uVar.a(eVar.b, bVar.f8474c);
                        return o8;
                    }
                    Object i17 = uVar.i(eVar.b);
                    if (i17 == null) {
                        i17 = c10.e();
                        uVar.x(eVar.b, i17);
                    }
                    return O(i17, c10, bArr, i11, i12, i16, bVar);
                case 18:
                    g1 c11 = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int q10 = q(c11, bArr, i11, i12, bVar);
                        uVar.a(eVar.b, bVar.f8474c);
                        return q10;
                    }
                    Object i18 = uVar.i(eVar.b);
                    if (i18 == null) {
                        i18 = c11.e();
                        uVar.x(eVar.b, i18);
                    }
                    return P(i18, c11, bArr, i11, i12, bVar);
            }
        }
        if (eVar.d()) {
            uVar.a(eVar.b, obj);
            return i11;
        }
        uVar.x(eVar.b, obj);
        return i11;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, Object obj, s0 s0Var, n1<o1, o1> n1Var, b bVar) {
        y.e a10 = bVar.f8475d.a(s0Var, i10 >>> 3);
        if (a10 == null) {
            return H(i10, bArr, i11, i12, v0.w(obj), bVar);
        }
        y.c cVar = (y.c) obj;
        cVar.Z();
        return g(i10, bArr, i11, i12, cVar, a10, n1Var, bVar);
    }

    public static int i(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        zVar.d(i(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int J = J(bArr, i13, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            zVar.d(i(bArr, J));
            i13 = J + 4;
        }
        return i13;
    }

    public static long k(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        j0Var.e(k(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int J = J(bArr, i13, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            j0Var.e(k(bArr, J));
            i13 = J + 8;
        }
        return i13;
    }

    public static float m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(i(bArr, i10));
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        wVar.d(m(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int J = J(bArr, i13, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            wVar.d(m(bArr, J));
            i13 = J + 4;
        }
        return i13;
    }

    public static int o(g1 g1Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        Object e10 = g1Var.e();
        int O = O(e10, g1Var, bArr, i10, i11, i12, bVar);
        g1Var.b(e10);
        bVar.f8474c = e10;
        return O;
    }

    public static int p(g1 g1Var, int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        int i13 = (i10 & (-8)) | 4;
        int o8 = o(g1Var, bArr, i11, i12, i13, bVar);
        iVar.add(bVar.f8474c);
        while (o8 < i12) {
            int J = J(bArr, o8, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            o8 = o(g1Var, bArr, J, i12, i13, bVar);
            iVar.add(bVar.f8474c);
        }
        return o8;
    }

    public static int q(g1 g1Var, byte[] bArr, int i10, int i11, b bVar) {
        Object e10 = g1Var.e();
        int P = P(e10, g1Var, bArr, i10, i11, bVar);
        g1Var.b(e10);
        bVar.f8474c = e10;
        return P;
    }

    public static int r(g1<?> g1Var, int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        int q10 = q(g1Var, bArr, i11, i12, bVar);
        iVar.add(bVar.f8474c);
        while (q10 < i12) {
            int J = J(bArr, q10, bVar);
            if (i10 != bVar.f8473a) {
                break;
            }
            q10 = q(g1Var, bArr, J, i12, bVar);
            iVar.add(bVar.f8474c);
        }
        return q10;
    }

    public static int s(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        f fVar = (f) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            J = M(bArr, J, bVar);
            fVar.e(bVar.b != 0);
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int t(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            mVar.d(e(bArr, J));
            J += 8;
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int u(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            zVar.d(i(bArr, J));
            J += 4;
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int v(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            j0Var.e(k(bArr, J));
            J += 8;
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int w(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            wVar.d(m(bArr, J));
            J += 4;
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int x(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            J = J(bArr, J, bVar);
            zVar.d(i.c(bVar.f8473a));
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int y(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            J = M(bArr, J, bVar);
            j0Var.e(i.d(bVar.b));
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }

    public static int z(byte[] bArr, int i10, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int J = J(bArr, i10, bVar);
        int i11 = bVar.f8473a + J;
        while (J < i11) {
            J = J(bArr, J, bVar);
            zVar.d(bVar.f8473a);
        }
        if (J == i11) {
            return J;
        }
        throw b0.m();
    }
}
