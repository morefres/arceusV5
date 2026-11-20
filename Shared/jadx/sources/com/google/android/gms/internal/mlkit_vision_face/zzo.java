package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            int n10 = a.n(u8);
            if (n10 == 1) {
                i10 = a.w(parcel, u8);
            } else if (n10 == 2) {
                f10 = a.s(parcel, u8);
            } else if (n10 == 3) {
                f11 = a.s(parcel, u8);
            } else if (n10 != 4) {
                a.C(parcel, u8);
            } else {
                i11 = a.w(parcel, u8);
            }
        }
        a.m(parcel, D);
        return new zzn(i10, f10, f11, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzn[i10];
    }
}
