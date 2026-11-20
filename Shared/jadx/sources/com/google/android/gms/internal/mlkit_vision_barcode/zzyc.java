package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    bArr = o9.a.c(parcel, u8);
                    break;
                case 5:
                    pointArr = (Point[]) o9.a.k(parcel, u8, Point.CREATOR);
                    break;
                case 6:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 7:
                    zzxuVar = (zzxu) o9.a.g(parcel, u8, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) o9.a.g(parcel, u8, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) o9.a.g(parcel, u8, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) o9.a.g(parcel, u8, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) o9.a.g(parcel, u8, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) o9.a.g(parcel, u8, zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (zzxr) o9.a.g(parcel, u8, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) o9.a.g(parcel, u8, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) o9.a.g(parcel, u8, zzxt.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzyb(i10, str, str2, bArr, pointArr, i11, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzyb[i10];
    }
}
