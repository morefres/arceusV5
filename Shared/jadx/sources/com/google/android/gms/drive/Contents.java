package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x9.a;

@Deprecated
/* loaded from: classes.dex */
public class Contents extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Contents> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final ParcelFileDescriptor f5900f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5901g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5902h;

    /* renamed from: i, reason: collision with root package name */
    public final DriveId f5903i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5904j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5905k;

    public Contents(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull DriveId driveId, boolean z10, String str) {
        this.f5900f = parcelFileDescriptor;
        this.f5901g = i10;
        this.f5902h = i11;
        this.f5903i = driveId;
        this.f5904j = z10;
        this.f5905k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f5900f;
        int a10 = b.a(parcel);
        b.t(parcel, 2, parcelFileDescriptor, i10, false);
        b.n(parcel, 3, this.f5901g);
        b.n(parcel, 4, this.f5902h);
        b.t(parcel, 5, this.f5903i, i10, false);
        b.c(parcel, 7, this.f5904j);
        b.v(parcel, 8, this.f5905k, false);
        b.b(parcel, a10);
    }
}
