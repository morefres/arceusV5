package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class g6 implements u5 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f7112a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f7113c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7114d;

    public g6(x5 x5Var, String str, Object[] objArr) {
        this.f7112a = x5Var;
        this.b = str;
        this.f7113c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7114d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f7114d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.f7113c;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final x5 zza() {
        return this.f7112a;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final boolean zzb() {
        return (this.f7114d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final int zzc() {
        int i10 = this.f7114d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
