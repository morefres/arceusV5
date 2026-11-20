package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lf.a;
import o9.b;

/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {

    /* renamed from: f, reason: collision with root package name */
    public final int f8731f;

    /* renamed from: g, reason: collision with root package name */
    public static final zza f8728g = new zza(1);

    /* renamed from: h, reason: collision with root package name */
    public static final zza f8729h = new zza(2);

    /* renamed from: i, reason: collision with root package name */
    public static final zza f8730i = new zza(3);
    public static final Parcelable.Creator<zza> CREATOR = new a();

    public zza(int i10) {
        this.f8731f = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f8731f);
        b.b(parcel, a10);
    }
}
