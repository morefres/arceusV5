package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        boolean z10 = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 2:
                    zznVarArr = (zzn[]) a.k(parcel, u8, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) a.g(parcel, u8, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) a.g(parcel, u8, zzf.CREATOR);
                    break;
                case 5:
                    str = a.h(parcel, u8);
                    break;
                case 6:
                    f10 = a.s(parcel, u8);
                    break;
                case 7:
                    str2 = a.h(parcel, u8);
                    break;
                case 8:
                    z10 = a.o(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzr(zznVarArr, zzfVar, zzfVar2, str, f10, str2, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
