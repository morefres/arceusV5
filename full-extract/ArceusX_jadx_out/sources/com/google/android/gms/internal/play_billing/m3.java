package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class m3 extends p3 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7228e;

    public m3(byte[] bArr, int i10, int i11) {
        super(null);
        s3.i(i10, i10 + i11, bArr.length);
        this.f7226c = bArr;
        this.f7227d = i10;
        this.f7228e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final byte b(int i10) {
        return this.f7226c[this.f7227d + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int c(int i10, int i11, int i12) {
        return z4.b(i10, this.f7226c, this.f7227d, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int d() {
        return this.f7228e;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final s3 e(int i10, int i11) {
        int i12 = s3.i(i10, i11, this.f7228e);
        return i12 == 0 ? s3.b : new m3(this.f7226c, this.f7227d + i10, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void f(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f7226c, this.f7227d, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void g(i3 i3Var) {
        ((x3) i3Var).x(this.f7226c, this.f7227d, this.f7228e);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final boolean h(s3 s3Var) {
        boolean z10 = s3Var instanceof q3;
        if (!z10 && !(s3Var instanceof m3)) {
            return s3Var.h(this);
        }
        int i10 = this.f7228e;
        if (i10 > s3Var.d()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > s3Var.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + s3Var.d());
        }
        if (z10) {
            return s3.l(this.f7226c, this.f7227d, ((q3) s3Var).f7266c, 0, i10);
        }
        if (s3Var instanceof m3) {
            m3 m3Var = (m3) s3Var;
            return s3.l(this.f7226c, this.f7227d, m3Var.f7226c, m3Var.f7227d, i10);
        }
        s3 e10 = s3Var.e(0, i10);
        int i11 = this.f7227d;
        return e10.equals(e(i11, i10 + i11));
    }
}
