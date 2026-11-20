package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzva implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            int n10 = a.n(u8);
            if (n10 == 1) {
                str = a.h(parcel, u8);
            } else if (n10 == 2) {
                rect = (Rect) a.g(parcel, u8, Rect.CREATOR);
            } else if (n10 == 3) {
                arrayList = a.l(parcel, u8, Point.CREATOR);
            } else if (n10 == 4) {
                str2 = a.h(parcel, u8);
            } else if (n10 != 5) {
                a.C(parcel, u8);
            } else {
                arrayList2 = a.l(parcel, u8, zzvd.CREATOR);
            }
        }
        a.m(parcel, D);
        return new zzuz(str, rect, arrayList, str2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzuz[i10];
    }
}
