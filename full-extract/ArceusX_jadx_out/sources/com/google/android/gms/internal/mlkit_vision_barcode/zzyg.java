package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzyg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzxq zzxqVar = null;
        zzxq zzxqVar2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    zzxqVar = (zzxq) o9.a.g(parcel, u8, zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (zzxq) o9.a.g(parcel, u8, zzxq.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzxr(str, str2, str3, str4, str5, zzxqVar, zzxqVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzxr[i10];
    }
}
