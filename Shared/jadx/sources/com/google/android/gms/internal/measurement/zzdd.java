package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new h2();

    /* renamed from: f, reason: collision with root package name */
    public final long f7020f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7021g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7022h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f7023i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7024j;

    public zzdd(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f7020f = j10;
        this.f7021g = j11;
        this.f7022h = z10;
        this.f7023i = bundle;
        this.f7024j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7020f;
        int a10 = o9.b.a(parcel);
        o9.b.r(parcel, 1, j10);
        o9.b.r(parcel, 2, this.f7021g);
        o9.b.c(parcel, 3, this.f7022h);
        o9.b.f(parcel, 7, this.f7023i, false);
        o9.b.v(parcel, 8, this.f7024j, false);
        o9.b.b(parcel, a10);
    }
}
