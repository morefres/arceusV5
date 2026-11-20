package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 1:
                    str = a.h(parcel, u8);
                    break;
                case 2:
                    str2 = a.h(parcel, u8);
                    break;
                case 3:
                    str3 = a.h(parcel, u8);
                    break;
                case 4:
                    z10 = a.o(parcel, u8);
                    break;
                case 5:
                    i10 = a.w(parcel, u8);
                    break;
                case 6:
                    str4 = a.h(parcel, u8);
                    break;
                case 7:
                    z11 = a.o(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzvh(str, str2, str3, z10, i10, str4, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvh[i10];
    }
}
