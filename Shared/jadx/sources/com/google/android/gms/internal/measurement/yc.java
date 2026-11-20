package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class yc implements lc {

    /* renamed from: a, reason: collision with root package name */
    public final oc f7007a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f7008c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7009d;

    public yc(oc ocVar, String str, Object[] objArr) {
        this.f7007a = ocVar;
        this.b = str;
        this.f7008c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7009d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f7009d = i10 | (charAt2 << i12);
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
        return this.f7008c;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final boolean zza() {
        return (this.f7009d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final oc zzb() {
        return this.f7007a;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final int zzc() {
        int i10 = this.f7009d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
