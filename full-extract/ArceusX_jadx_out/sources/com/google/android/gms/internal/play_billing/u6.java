package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u6 {

    /* renamed from: f, reason: collision with root package name */
    public static final u6 f7378f = new u6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f7379a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7380c;

    /* renamed from: d, reason: collision with root package name */
    public int f7381d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7382e;

    public u6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7381d = -1;
        this.f7379a = i10;
        this.b = iArr;
        this.f7380c = objArr;
        this.f7382e = z10;
    }

    public static u6 c() {
        return f7378f;
    }

    public static u6 e(u6 u6Var, u6 u6Var2) {
        int i10 = u6Var.f7379a + u6Var2.f7379a;
        int[] copyOf = Arrays.copyOf(u6Var.b, i10);
        System.arraycopy(u6Var2.b, 0, copyOf, u6Var.f7379a, u6Var2.f7379a);
        Object[] copyOf2 = Arrays.copyOf(u6Var.f7380c, i10);
        System.arraycopy(u6Var2.f7380c, 0, copyOf2, u6Var.f7379a, u6Var2.f7379a);
        return new u6(i10, copyOf, copyOf2, true);
    }

    public static u6 f() {
        return new u6(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int v5;
        int w5;
        int i10;
        int i11 = this.f7381d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7379a; i13++) {
            int i14 = this.b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f7380c[i13]).getClass();
                    i10 = a4.v(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    s3 s3Var = (s3) this.f7380c[i13];
                    int v10 = a4.v(i17);
                    int d10 = s3Var.d();
                    i10 = v10 + a4.v(d10) + d10;
                } else if (i16 == 3) {
                    int v11 = a4.v(i15 << 3);
                    v5 = v11 + v11;
                    w5 = ((u6) this.f7380c[i13]).a();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new e5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f7380c[i13]).getClass();
                    i10 = a4.v(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i18 = i15 << 3;
                long longValue = ((Long) this.f7380c[i13]).longValue();
                v5 = a4.v(i18);
                w5 = a4.w(longValue);
            }
            i10 = v5 + w5;
            i12 += i10;
        }
        this.f7381d = i12;
        return i12;
    }

    public final int b() {
        int i10 = this.f7381d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7379a; i12++) {
            int i13 = this.b[i12] >>> 3;
            s3 s3Var = (s3) this.f7380c[i12];
            int v5 = a4.v(8);
            int v10 = a4.v(16) + a4.v(i13);
            int v11 = a4.v(24);
            int d10 = s3Var.d();
            i11 += v5 + v5 + v10 + v11 + a4.v(d10) + d10;
        }
        this.f7381d = i11;
        return i11;
    }

    public final u6 d(u6 u6Var) {
        if (u6Var.equals(f7378f)) {
            return this;
        }
        g();
        int i10 = this.f7379a + u6Var.f7379a;
        m(i10);
        System.arraycopy(u6Var.b, 0, this.b, this.f7379a, u6Var.f7379a);
        System.arraycopy(u6Var.f7380c, 0, this.f7380c, this.f7379a, u6Var.f7379a);
        this.f7379a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        int i10 = this.f7379a;
        if (i10 == u6Var.f7379a) {
            int[] iArr = this.b;
            int[] iArr2 = u6Var.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f7380c;
                    Object[] objArr2 = u6Var.f7380c;
                    int i12 = this.f7379a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void g() {
        if (!this.f7382e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f7382e) {
            this.f7382e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f7379a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.f7380c;
        int i16 = this.f7379a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7379a; i11++) {
            z5.b(sb2, i10, String.valueOf(this.b[i11] >>> 3), this.f7380c[i11]);
        }
    }

    public final void j(int i10, Object obj) {
        g();
        m(this.f7379a + 1);
        int[] iArr = this.b;
        int i11 = this.f7379a;
        iArr[i11] = i10;
        this.f7380c[i11] = obj;
        this.f7379a = i11 + 1;
    }

    public final void k(i7 i7Var) {
        for (int i10 = 0; i10 < this.f7379a; i10++) {
            i7Var.D(this.b[i10] >>> 3, this.f7380c[i10]);
        }
    }

    public final void l(i7 i7Var) {
        if (this.f7379a != 0) {
            for (int i10 = 0; i10 < this.f7379a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.f7380c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    i7Var.k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    i7Var.L(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    i7Var.E(i13, (s3) obj);
                } else if (i12 == 3) {
                    i7Var.q(i13);
                    ((u6) obj).l(i7Var);
                    i7Var.x(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new e5("Protocol message tag had invalid wire type."));
                    }
                    i7Var.d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f7379a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f7380c = Arrays.copyOf(this.f7380c, i10);
        }
    }

    public u6() {
        this(0, new int[8], new Object[8], true);
    }
}
