package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        double d10 = 0.0d;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 3:
                    str = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 6:
                    pointArr = (Point[]) o9.a.k(parcel, u8, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) o9.a.g(parcel, u8, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) o9.a.g(parcel, u8, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) o9.a.g(parcel, u8, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) o9.a.g(parcel, u8, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) o9.a.g(parcel, u8, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) o9.a.g(parcel, u8, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) o9.a.g(parcel, u8, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) o9.a.g(parcel, u8, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) o9.a.g(parcel, u8, zzm.CREATOR);
                    break;
                case 16:
                    bArr = o9.a.c(parcel, u8);
                    break;
                case 17:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 18:
                    d10 = o9.a.q(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzu(i10, str, str2, i11, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArr, z10, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
