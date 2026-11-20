package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.e0;
import j9.k0;
import j9.q;
import o9.b;

/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new e0();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5891f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5892g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5893h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5894i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5895j;

    public zzr(boolean z10, String str, int i10, int i11, long j10) {
        this.f5891f = z10;
        this.f5892g = str;
        this.f5893h = k0.a(i10) - 1;
        this.f5894i = q.a(i11) - 1;
        this.f5895j = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.c(parcel, 1, this.f5891f);
        b.v(parcel, 2, this.f5892g, false);
        b.n(parcel, 3, this.f5893h);
        b.n(parcel, 4, this.f5894i);
        b.r(parcel, 5, this.f5895j);
        b.b(parcel, a10);
    }

    public final boolean zza() {
        return this.f5891f;
    }

    public final String zzb() {
        return this.f5892g;
    }

    public final long zzc() {
        return this.f5895j;
    }

    public final int zzd() {
        return k0.a(this.f5893h);
    }

    public final int zze() {
        return q.a(this.f5894i);
    }
}
