package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = -1.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 2:
                    i10 = a.w(parcel, u8);
                    break;
                case 3:
                    i11 = a.w(parcel, u8);
                    break;
                case 4:
                    i12 = a.w(parcel, u8);
                    break;
                case 5:
                    z10 = a.o(parcel, u8);
                    break;
                case 6:
                    z11 = a.o(parcel, u8);
                    break;
                case 7:
                    f10 = a.s(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzh(i10, i11, i12, z10, z11, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
