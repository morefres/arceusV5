package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* loaded from: classes.dex */
public final class x3 extends a4 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7389c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7390d;

    /* renamed from: e, reason: collision with root package name */
    public int f7391e;

    public x3(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f7389c = bArr;
        this.f7391e = 0;
        this.f7390d = i11;
    }

    public final void A(String str) {
        int i10 = this.f7391e;
        try {
            int v5 = a4.v(str.length() * 3);
            int v10 = a4.v(str.length());
            if (v10 != v5) {
                int i11 = e7.f7085a;
                r(c7.b(str));
                byte[] bArr = this.f7389c;
                int i12 = this.f7391e;
                this.f7391e = e7.a(str, bArr, i12, bArr.length - i12);
                return;
            }
            int i13 = i10 + v10;
            this.f7391e = i13;
            byte[] bArr2 = this.f7389c;
            int a10 = e7.a(str, bArr2, i13, bArr2.length - i13);
            this.f7391e = i10;
            r((a10 - i10) - v10);
            this.f7391e = a10;
        } catch (IndexOutOfBoundsException e10) {
            throw new y3(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final int c() {
        return this.f7390d - this.f7391e;
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void d(byte b) {
        int i10 = this.f7391e;
        try {
            int i11 = i10 + 1;
            try {
                this.f7389c[i10] = b;
                this.f7391e = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new y3(i10, this.f7390d, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void e(int i10, boolean z10) {
        r(i10 << 3);
        d(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void f(int i10, s3 s3Var) {
        r((i10 << 3) | 2);
        y(s3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void g(int i10, int i11) {
        r((i10 << 3) | 5);
        h(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void h(int i10) {
        int i11 = this.f7391e;
        try {
            byte[] bArr = this.f7389c;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f7391e = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new y3(i11, this.f7390d, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void i(int i10, long j10) {
        r((i10 << 3) | 1);
        j(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void j(long j10) {
        int i10 = this.f7391e;
        try {
            byte[] bArr = this.f7389c;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f7391e = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new y3(i10, this.f7390d, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void k(int i10, int i11) {
        r(i10 << 3);
        l(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void l(int i10) {
        if (i10 >= 0) {
            r(i10);
        } else {
            t(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void m(int i10, x5 x5Var) {
        r(11);
        q(2, i10);
        r(26);
        z(x5Var);
        r(12);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void n(int i10, s3 s3Var) {
        r(11);
        q(2, i10);
        f(3, s3Var);
        r(12);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void o(int i10, String str) {
        r((i10 << 3) | 2);
        A(str);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void p(int i10, int i11) {
        r((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void q(int i10, int i11) {
        r(i10 << 3);
        r(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void r(int i10) {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f7391e;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f7389c[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new y3(i12, this.f7390d, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new y3(i12, this.f7390d, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f7389c[i12] = (byte) i10;
        this.f7391e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void s(int i10, long j10) {
        r(i10 << 3);
        t(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.a4
    public final void t(long j10) {
        boolean z10;
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.f7391e;
        z10 = a4.b;
        if (!z10 || this.f7390d - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.f7389c[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new y3(i12, this.f7390d, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.f7389c[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new y3(i12, this.f7390d, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                a7.r(this.f7389c, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            a7.r(this.f7389c, i11, (byte) j10);
        }
        this.f7391e = i10;
    }

    public final void x(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f7389c, this.f7391e, i11);
            this.f7391e += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new y3(this.f7391e, this.f7390d, i11, e10);
        }
    }

    public final void y(s3 s3Var) {
        r(s3Var.d());
        s3Var.g(this);
    }

    public final void z(x5 x5Var) {
        r(x5Var.zzn());
        x5Var.a(this);
    }
}
