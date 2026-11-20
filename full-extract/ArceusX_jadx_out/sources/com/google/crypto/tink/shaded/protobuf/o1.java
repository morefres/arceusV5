package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f8565f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f8566a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8567c;

    /* renamed from: d, reason: collision with root package name */
    public int f8568d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8569e;

    public o1() {
        this(0, new int[8], new Object[8], true);
    }

    public static o1 c() {
        return f8565f;
    }

    public static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static o1 j(o1 o1Var, o1 o1Var2) {
        int i10 = o1Var.f8566a + o1Var2.f8566a;
        int[] copyOf = Arrays.copyOf(o1Var.b, i10);
        System.arraycopy(o1Var2.b, 0, copyOf, o1Var.f8566a, o1Var2.f8566a);
        Object[] copyOf2 = Arrays.copyOf(o1Var.f8567c, i10);
        System.arraycopy(o1Var2.f8567c, 0, copyOf2, o1Var.f8566a, o1Var2.f8566a);
        return new o1(i10, copyOf, copyOf2, true);
    }

    public static o1 k() {
        return new o1();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i10, Object obj, t1 t1Var) {
        int a10 = s1.a(i10);
        int b = s1.b(i10);
        if (b == 0) {
            t1Var.u(a10, ((Long) obj).longValue());
            return;
        }
        if (b == 1) {
            t1Var.s(a10, ((Long) obj).longValue());
            return;
        }
        if (b == 2) {
            t1Var.M(a10, (h) obj);
            return;
        }
        if (b != 3) {
            if (b != 5) {
                throw new RuntimeException(b0.e());
            }
            t1Var.c(a10, ((Integer) obj).intValue());
        } else if (t1Var.t() == t1.a.ASCENDING) {
            t1Var.x(a10);
            ((o1) obj).r(t1Var);
            t1Var.C(a10);
        } else {
            t1Var.C(a10);
            ((o1) obj).r(t1Var);
            t1Var.x(a10);
        }
    }

    public void a() {
        if (!this.f8569e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f8566a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f8567c = Arrays.copyOf(this.f8567c, i10);
        }
    }

    public int d() {
        int X;
        int i10 = this.f8568d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8566a; i12++) {
            int i13 = this.b[i12];
            int a10 = s1.a(i13);
            int b = s1.b(i13);
            if (b == 0) {
                X = k.X(a10, ((Long) this.f8567c[i12]).longValue());
            } else if (b == 1) {
                X = k.o(a10, ((Long) this.f8567c[i12]).longValue());
            } else if (b == 2) {
                X = k.g(a10, (h) this.f8567c[i12]);
            } else if (b == 3) {
                X = (k.U(a10) * 2) + ((o1) this.f8567c[i12]).d();
            } else {
                if (b != 5) {
                    throw new IllegalStateException(b0.e());
                }
                X = k.m(a10, ((Integer) this.f8567c[i12]).intValue());
            }
            i11 += X;
        }
        this.f8568d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f8568d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8566a; i12++) {
            i11 += k.J(s1.a(this.b[i12]), (h) this.f8567c[i12]);
        }
        this.f8568d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f8566a;
        return i10 == o1Var.f8566a && o(this.b, o1Var.b, i10) && l(this.f8567c, o1Var.f8567c, this.f8566a);
    }

    public void h() {
        if (this.f8569e) {
            this.f8569e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f8566a;
        return ((((527 + i10) * 31) + f(this.b, i10)) * 31) + g(this.f8567c, this.f8566a);
    }

    public o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f8566a + o1Var.f8566a;
        b(i10);
        System.arraycopy(o1Var.b, 0, this.b, this.f8566a, o1Var.f8566a);
        System.arraycopy(o1Var.f8567c, 0, this.f8567c, this.f8566a, o1Var.f8566a);
        this.f8566a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f8566a; i11++) {
            u0.d(sb2, i10, String.valueOf(s1.a(this.b[i11])), this.f8567c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f8566a + 1);
        int[] iArr = this.b;
        int i11 = this.f8566a;
        iArr[i11] = i10;
        this.f8567c[i11] = obj;
        this.f8566a = i11 + 1;
    }

    public void p(t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            for (int i10 = this.f8566a - 1; i10 >= 0; i10--) {
                t1Var.b(s1.a(this.b[i10]), this.f8567c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f8566a; i11++) {
            t1Var.b(s1.a(this.b[i11]), this.f8567c[i11]);
        }
    }

    public void r(t1 t1Var) {
        if (this.f8566a == 0) {
            return;
        }
        if (t1Var.t() == t1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f8566a; i10++) {
                q(this.b[i10], this.f8567c[i10], t1Var);
            }
            return;
        }
        for (int i11 = this.f8566a - 1; i11 >= 0; i11--) {
            q(this.b[i11], this.f8567c[i11], t1Var);
        }
    }

    public o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f8568d = -1;
        this.f8566a = i10;
        this.b = iArr;
        this.f8567c = objArr;
        this.f8569e = z10;
    }
}
