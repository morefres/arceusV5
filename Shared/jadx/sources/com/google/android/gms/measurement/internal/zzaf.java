package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.g;
import o9.b;

/* loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new g();

    /* renamed from: f, reason: collision with root package name */
    public final long f7455f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7456g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7457h;

    public zzaf(long j10, int i10, long j11) {
        this.f7455f = j10;
        this.f7456g = i10;
        this.f7457h = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7455f;
        int a10 = b.a(parcel);
        b.r(parcel, 1, j10);
        b.n(parcel, 2, this.f7456g);
        b.r(parcel, 3, this.f7457h);
        b.b(parcel, a10);
    }
}
