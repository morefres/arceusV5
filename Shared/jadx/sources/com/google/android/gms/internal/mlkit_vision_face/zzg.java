package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MAX_VALUE;
        float f19 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float f20 = -1.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 1:
                    i10 = a.w(parcel, u8);
                    break;
                case 2:
                    i11 = a.w(parcel, u8);
                    break;
                case 3:
                    f10 = a.s(parcel, u8);
                    break;
                case 4:
                    f11 = a.s(parcel, u8);
                    break;
                case 5:
                    f12 = a.s(parcel, u8);
                    break;
                case 6:
                    f13 = a.s(parcel, u8);
                    break;
                case 7:
                    f17 = a.s(parcel, u8);
                    break;
                case 8:
                    f18 = a.s(parcel, u8);
                    break;
                case 9:
                    zznVarArr = (zzn[]) a.k(parcel, u8, zzn.CREATOR);
                    break;
                case 10:
                    f14 = a.s(parcel, u8);
                    break;
                case 11:
                    f15 = a.s(parcel, u8);
                    break;
                case 12:
                    f16 = a.s(parcel, u8);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) a.k(parcel, u8, zzd.CREATOR);
                    break;
                case 14:
                    f19 = a.s(parcel, u8);
                    break;
                case 15:
                    f20 = a.s(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzf(i10, i11, f10, f11, f12, f13, f17, f18, f19, zznVarArr, f14, f15, f16, zzdVarArr, f20);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
