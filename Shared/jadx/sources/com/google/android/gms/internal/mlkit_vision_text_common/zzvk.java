package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
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
                f10 = a.s(parcel, u8);
            } else if (n10 != 5) {
                a.C(parcel, u8);
            } else {
                f11 = a.s(parcel, u8);
            }
        }
        a.m(parcel, D);
        return new zzvj(str, rect, arrayList, f10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvj[i10];
    }
}
