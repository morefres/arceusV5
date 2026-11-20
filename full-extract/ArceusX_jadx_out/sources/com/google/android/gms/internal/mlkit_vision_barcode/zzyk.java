package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzyk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                d10 = o9.a.q(parcel, u8);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                d11 = o9.a.q(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzxv(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxv[i10];
    }
}
