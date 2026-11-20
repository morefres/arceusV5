package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.qd;
import o9.b;

/* loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new qd();

    /* renamed from: f, reason: collision with root package name */
    public final String f7475f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7476g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7477h;

    public zzoh(String str, long j10, int i10) {
        this.f7475f = str;
        this.f7476g = j10;
        this.f7477h = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7475f;
        int a10 = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.r(parcel, 2, this.f7476g);
        b.n(parcel, 3, this.f7477h);
        b.b(parcel, a10);
    }
}
