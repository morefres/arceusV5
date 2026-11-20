package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 2:
                    zzrVarArr = (zzr[]) a.k(parcel, u8, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) a.g(parcel, u8, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) a.g(parcel, u8, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) a.g(parcel, u8, zzf.CREATOR);
                    break;
                case 6:
                    str = a.h(parcel, u8);
                    break;
                case 7:
                    f10 = a.s(parcel, u8);
                    break;
                case 8:
                    str2 = a.h(parcel, u8);
                    break;
                case 9:
                    i10 = a.w(parcel, u8);
                    break;
                case 10:
                    z10 = a.o(parcel, u8);
                    break;
                case 11:
                    i11 = a.w(parcel, u8);
                    break;
                case 12:
                    i12 = a.w(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, str, f10, str2, i10, z10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
