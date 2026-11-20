package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        zzp zzpVar = null;
        String str = null;
        String str2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArr = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    zzpVar = (zzp) o9.a.g(parcel, u8, zzp.CREATOR);
                    break;
                case 3:
                    str = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) o9.a.k(parcel, u8, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) o9.a.k(parcel, u8, zzn.CREATOR);
                    break;
                case 7:
                    strArr = o9.a.i(parcel, u8);
                    break;
                case 8:
                    zziVarArr = (zzi[]) o9.a.k(parcel, u8, zzi.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzl(zzpVar, str, str2, zzqVarArr, zznVarArr, strArr, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
