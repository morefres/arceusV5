package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x8.e;

/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();

    /* renamed from: f, reason: collision with root package name */
    public final String f5591f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5592g;

    public zzc(String str, int i10) {
        this.f5591f = str;
        this.f5592g = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 1, this.f5591f, false);
        b.n(parcel, 2, this.f5592g);
        b.b(parcel, a10);
    }

    public final int zza() {
        return this.f5592g;
    }

    public final String zzb() {
        return this.f5591f;
    }
}
