package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.w;
import o9.b;

@Deprecated
/* loaded from: classes.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new w();

    /* renamed from: f, reason: collision with root package name */
    public final String f7437f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7438g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7439h;

    public zzbj(String str, String str2, String str3) {
        this.f7439h = str;
        this.f7437f = str2;
        this.f7438g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.v(parcel, 1, this.f7437f, false);
        b.v(parcel, 2, this.f7438g, false);
        b.v(parcel, 5, this.f7439h, false);
        b.b(parcel, a10);
    }
}
