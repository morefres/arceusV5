package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w0 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public String f6906a;
    public byte b;

    /* renamed from: c, reason: collision with root package name */
    public int f6907c;

    /* renamed from: d, reason: collision with root package name */
    public int f6908d;

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 a(boolean z10) {
        this.b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final e1 b() {
        if (this.b == 1 && this.f6906a != null && this.f6907c != 0 && this.f6908d != 0) {
            return new x0(this.f6906a, false, this.f6907c, null, null, this.f6908d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6906a == null) {
            sb2.append(" fileOwner");
        }
        if (this.b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f6907c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f6908d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 c(int i10) {
        this.f6907c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final c1 d(int i10) {
        this.f6908d = 1;
        return this;
    }

    public final c1 e(String str) {
        this.f6906a = "";
        return this;
    }
}
