package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 == 3) {
                i12 = o9.a.w(parcel, u8);
            } else if (n10 == 4) {
                i13 = o9.a.w(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                j10 = o9.a.y(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzyu(i10, i11, i12, i13, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyu[i10];
    }
}
