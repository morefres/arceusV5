package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x8.d;

/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();

    /* renamed from: f, reason: collision with root package name */
    public final String f5589f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5590g;

    public zza(String str, String str2) {
        this.f5589f = str;
        this.f5590g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 1, this.f5589f, false);
        b.v(parcel, 2, this.f5590g, false);
        b.b(parcel, a10);
    }
}
