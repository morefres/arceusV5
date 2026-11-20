package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ia extends ja {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f6541c;

    /* renamed from: d, reason: collision with root package name */
    public int f6542d;

    public /* synthetic */ ia(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f6542d = Integer.MAX_VALUE;
        this.b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f6542d;
        this.f6542d = 0;
        int i12 = this.b + this.f6541c;
        this.b = i12;
        if (i12 <= 0) {
            this.f6541c = 0;
            return i11;
        }
        this.f6541c = i12;
        this.b = 0;
        return i11;
    }
}
