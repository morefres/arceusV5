package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            int n10 = a.n(u8);
            if (n10 == 1) {
                i10 = a.w(parcel, u8);
            } else if (n10 == 2) {
                i11 = a.w(parcel, u8);
            } else if (n10 == 3) {
                i12 = a.w(parcel, u8);
            } else if (n10 == 4) {
                j10 = a.y(parcel, u8);
            } else if (n10 != 5) {
                a.C(parcel, u8);
            } else {
                i13 = a.w(parcel, u8);
            }
        }
        a.m(parcel, D);
        return new VisionImageMetadataParcel(i10, i11, i12, j10, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VisionImageMetadataParcel[i10];
    }
}
