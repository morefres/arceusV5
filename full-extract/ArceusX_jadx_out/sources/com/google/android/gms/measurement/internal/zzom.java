package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.ud;
import o9.b;

/* loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new ud();

    /* renamed from: f, reason: collision with root package name */
    public final long f7478f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f7479g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7480h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f7481i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7482j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7483k;

    /* renamed from: l, reason: collision with root package name */
    public String f7484l;

    public zzom(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f7478f = j10;
        this.f7479g = bArr;
        this.f7480h = str;
        this.f7481i = bundle;
        this.f7482j = i10;
        this.f7483k = j11;
        this.f7484l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7478f;
        int a10 = b.a(parcel);
        b.r(parcel, 1, j10);
        b.g(parcel, 2, this.f7479g, false);
        b.v(parcel, 3, this.f7480h, false);
        b.f(parcel, 4, this.f7481i, false);
        b.n(parcel, 5, this.f7482j);
        b.r(parcel, 6, this.f7483k);
        b.v(parcel, 7, this.f7484l, false);
        b.b(parcel, a10);
    }
}
