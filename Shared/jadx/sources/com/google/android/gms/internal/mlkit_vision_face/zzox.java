package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        Rect rect = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 1:
                    i10 = a.w(parcel, u8);
                    break;
                case 2:
                    rect = (Rect) a.g(parcel, u8, Rect.CREATOR);
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
                    f14 = a.s(parcel, u8);
                    break;
                case 8:
                    f15 = a.s(parcel, u8);
                    break;
                case 9:
                    f16 = a.s(parcel, u8);
                    break;
                case 10:
                    arrayList = a.l(parcel, u8, zzpc.CREATOR);
                    break;
                case 11:
                    arrayList2 = a.l(parcel, u8, zzos.CREATOR);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzow(i10, rect, f10, f11, f12, f13, f14, f15, f16, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzow[i10];
    }
}
