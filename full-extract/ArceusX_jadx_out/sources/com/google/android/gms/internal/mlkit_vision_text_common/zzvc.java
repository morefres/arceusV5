package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            switch (a.n(u8)) {
                case 1:
                    str = a.h(parcel, u8);
                    break;
                case 2:
                    rect = (Rect) a.g(parcel, u8, Rect.CREATOR);
                    break;
                case 3:
                    arrayList = a.l(parcel, u8, Point.CREATOR);
                    break;
                case 4:
                    str2 = a.h(parcel, u8);
                    break;
                case 5:
                    f10 = a.s(parcel, u8);
                    break;
                case 6:
                    f11 = a.s(parcel, u8);
                    break;
                case 7:
                    arrayList2 = a.l(parcel, u8, zzvj.CREATOR);
                    break;
                default:
                    a.C(parcel, u8);
                    break;
            }
        }
        a.m(parcel, D);
        return new zzvb(str, rect, arrayList, str2, f10, f11, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvb[i10];
    }
}
