package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 7:
                    str6 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    str7 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    str8 = o9.a.h(parcel, u8);
                    break;
                case 10:
                    str9 = o9.a.h(parcel, u8);
                    break;
                case 11:
                    str10 = o9.a.h(parcel, u8);
                    break;
                case 12:
                    str11 = o9.a.h(parcel, u8);
                    break;
                case 13:
                    str12 = o9.a.h(parcel, u8);
                    break;
                case 14:
                    str13 = o9.a.h(parcel, u8);
                    break;
                case 15:
                    str14 = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzm(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
