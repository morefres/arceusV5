package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* loaded from: classes.dex */
public final class ka extends ma {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6637d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6638e;

    /* renamed from: f, reason: collision with root package name */
    public int f6639f;

    public ka(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f6637d = bArr;
        this.f6639f = 0;
        this.f6638e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void A(int i10) {
        int i11 = this.f6639f;
        try {
            byte[] bArr = this.f6637d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f6639f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(i11, this.f6638e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void B(long j10) {
        boolean z10;
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        z10 = ma.f6672c;
        int i11 = this.f6639f;
        if (!z10 || this.f6638e - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f6637d[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new la(i11, this.f6638e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f6637d[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new la(i11, this.f6638e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                sd.u(this.f6637d, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            sd.u(this.f6637d, i11, (byte) j10);
        }
        this.f6639f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void C(long j10) {
        int i10 = this.f6639f;
        try {
            byte[] bArr = this.f6637d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f6639f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(i10, this.f6638e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void D(byte[] bArr, int i10, int i11) {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void E(String str) {
        int i10 = this.f6639f;
        try {
            int G = ma.G(str.length() * 3);
            int G2 = ma.G(str.length());
            if (G2 != G) {
                z(vd.b(str));
                byte[] bArr = this.f6637d;
                int i11 = this.f6639f;
                this.f6639f = vd.c(str, bArr, i11, this.f6638e - i11);
                return;
            }
            int i12 = i10 + G2;
            this.f6639f = i12;
            int c10 = vd.c(str, this.f6637d, i12, this.f6638e - i12);
            this.f6639f = i10;
            z((c10 - i10) - G2);
            this.f6639f = c10;
        } catch (ud e10) {
            this.f6639f = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new la(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final int F() {
        return this.f6638e - this.f6639f;
    }

    public final void H(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f6637d, this.f6639f, i11);
            this.f6639f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(this.f6639f, this.f6638e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void i(int i10, int i11) {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void j(int i10, int i11) {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void k(int i10, int i11) {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void l(int i10, int i11) {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void m(int i10, long j10) {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void n(int i10, long j10) {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void o(int i10, boolean z10) {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void p(int i10, String str) {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void q(int i10, ha haVar) {
        z((i10 << 3) | 2);
        r(haVar);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void r(ha haVar) {
        z(haVar.d());
        haVar.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void s(byte[] bArr, int i10, int i11) {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void t(int i10, oc ocVar, zc zcVar) {
        z((i10 << 3) | 2);
        z(((r9) ocVar).g(zcVar));
        zcVar.e(ocVar, this.f6673a);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void u(int i10, oc ocVar) {
        z(11);
        k(2, i10);
        z(26);
        w(ocVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void v(int i10, ha haVar) {
        z(11);
        k(2, i10);
        q(3, haVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void w(oc ocVar) {
        z(ocVar.a());
        ocVar.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void x(byte b) {
        int i10 = this.f6639f;
        try {
            int i11 = i10 + 1;
            try {
                this.f6637d[i10] = b;
                this.f6639f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new la(i10, this.f6638e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void y(int i10) {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void z(int i10) {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f6639f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f6637d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new la(i12, this.f6638e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new la(i12, this.f6638e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f6637d[i12] = (byte) i10;
        this.f6639f = i11;
    }
}
