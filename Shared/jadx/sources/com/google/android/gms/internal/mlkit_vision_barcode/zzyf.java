package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzyf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 3:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 4:
                    i13 = o9.a.w(parcel, u8);
                    break;
                case 5:
                    i14 = o9.a.w(parcel, u8);
                    break;
                case 6:
                    i15 = o9.a.w(parcel, u8);
                    break;
                case 7:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 8:
                    str = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzxq(i10, i11, i12, i13, i14, i15, z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxq[i10];
    }
}
