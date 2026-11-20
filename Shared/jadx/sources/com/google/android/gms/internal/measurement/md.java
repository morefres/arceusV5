package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class md {

    /* renamed from: f, reason: collision with root package name */
    public static final md f6674f = new md(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f6675a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6676c;

    /* renamed from: d, reason: collision with root package name */
    public int f6677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6678e;

    public md(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6677d = -1;
        this.f6675a = i10;
        this.b = iArr;
        this.f6676c = objArr;
        this.f6678e = z10;
    }

    public static md a() {
        return f6674f;
    }

    public static md b() {
        return new md(0, new int[8], new Object[8], true);
    }

    public static md c(md mdVar, md mdVar2) {
        int i10 = mdVar.f6675a + mdVar2.f6675a;
        int[] copyOf = Arrays.copyOf(mdVar.b, i10);
        System.arraycopy(mdVar2.b, 0, copyOf, mdVar.f6675a, mdVar2.f6675a);
        Object[] copyOf2 = Arrays.copyOf(mdVar.f6676c, i10);
        System.arraycopy(mdVar2.f6676c, 0, copyOf2, mdVar.f6675a, mdVar2.f6675a);
        return new md(i10, copyOf, copyOf2, true);
    }

    public final void d() {
        if (this.f6678e) {
            this.f6678e = false;
        }
    }

    public final void e() {
        if (!this.f6678e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        int i10 = this.f6675a;
        if (i10 == mdVar.f6675a) {
            int[] iArr = this.b;
            int[] iArr2 = mdVar.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f6676c;
                    Object[] objArr2 = mdVar.f6676c;
                    int i12 = this.f6675a;
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

    public final void f(yd ydVar) {
        for (int i10 = 0; i10 < this.f6675a; i10++) {
            ydVar.J(this.b[i10] >>> 3, this.f6676c[i10]);
        }
    }

    public final void g(yd ydVar) {
        if (this.f6675a != 0) {
            for (int i10 = 0; i10 < this.f6675a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.f6676c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ydVar.k(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ydVar.w(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ydVar.v(i13, (ha) obj);
                } else if (i12 == 3) {
                    ydVar.n(i13);
                    ((md) obj).g(ydVar);
                    ydVar.o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new rb("Protocol message tag had invalid wire type."));
                    }
                    ydVar.d(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f6677d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6675a; i12++) {
            int i13 = this.b[i12] >>> 3;
            ha haVar = (ha) this.f6676c[i12];
            int G = ma.G(8);
            int G2 = ma.G(16) + ma.G(i13);
            int G3 = ma.G(24);
            int d10 = haVar.d();
            i11 += G + G + G2 + G3 + ma.G(d10) + d10;
        }
        this.f6677d = i11;
        return i11;
    }

    public final int hashCode() {
        int i10 = this.f6675a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.f6676c;
        int i16 = this.f6675a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int i() {
        int G;
        int a10;
        int i10;
        int i11 = this.f6677d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f6675a; i13++) {
            int i14 = this.b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f6676c[i13]).getClass();
                    i10 = ma.G(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    ha haVar = (ha) this.f6676c[i13];
                    int G2 = ma.G(i17);
                    int d10 = haVar.d();
                    i10 = G2 + ma.G(d10) + d10;
                } else if (i16 == 3) {
                    int G3 = ma.G(i15 << 3);
                    G = G3 + G3;
                    a10 = ((md) this.f6676c[i13]).i();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new rb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6676c[i13]).getClass();
                    i10 = ma.G(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i18 = i15 << 3;
                long longValue = ((Long) this.f6676c[i13]).longValue();
                G = ma.G(i18);
                a10 = ma.a(longValue);
            }
            i10 = G + a10;
            i12 += i10;
        }
        this.f6677d = i12;
        return i12;
    }

    public final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f6675a; i11++) {
            qc.b(sb2, i10, String.valueOf(this.b[i11] >>> 3), this.f6676c[i11]);
        }
    }

    public final void k(int i10, Object obj) {
        e();
        m(this.f6675a + 1);
        int[] iArr = this.b;
        int i11 = this.f6675a;
        iArr[i11] = i10;
        this.f6676c[i11] = obj;
        this.f6675a = i11 + 1;
    }

    public final md l(md mdVar) {
        if (mdVar.equals(f6674f)) {
            return this;
        }
        e();
        int i10 = this.f6675a + mdVar.f6675a;
        m(i10);
        System.arraycopy(mdVar.b, 0, this.b, this.f6675a, mdVar.f6675a);
        System.arraycopy(mdVar.f6676c, 0, this.f6676c, this.f6675a, mdVar.f6675a);
        this.f6675a = i10;
        return this;
    }

    public final void m(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.f6675a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.f6676c = Arrays.copyOf(this.f6676c, i10);
        }
    }

    public md() {
        this(0, new int[8], new Object[8], true);
    }
}
