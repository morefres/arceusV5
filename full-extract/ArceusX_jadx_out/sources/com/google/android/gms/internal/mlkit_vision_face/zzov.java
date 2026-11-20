package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import o9.a;

/* loaded from: classes.dex */
public final class zzov implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
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
                    i12 = a.w(parcel, u8);
                    break;
                case 4:
                    i13 = a.w(parcel, u8);
                    break;
                case 5:
                    z10 = a.o(parcel, u8);
                    break;
                case 6:
                    f10 = a.s(parcel, u8);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzou(i10, i11, i12, i13, z10, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzou[i10];
    }
}
