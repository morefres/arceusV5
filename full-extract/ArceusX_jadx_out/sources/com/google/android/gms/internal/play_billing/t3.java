package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public class t3 extends w3 {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f7368c;

    /* renamed from: d, reason: collision with root package name */
    public int f7369d;

    public /* synthetic */ t3(byte[] bArr, int i10, int i11, boolean z10, v3 v3Var) {
        super(null);
        this.f7369d = Integer.MAX_VALUE;
        this.b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f7369d;
        this.f7369d = 0;
        int i12 = this.b + this.f7368c;
        this.b = i12;
        if (i12 <= 0) {
            this.f7368c = 0;
            return i11;
        }
        this.f7368c = i12;
        this.b = 0;
        return i11;
    }
}
