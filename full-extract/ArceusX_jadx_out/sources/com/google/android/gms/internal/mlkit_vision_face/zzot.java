package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            int n10 = a.n(u8);
            if (n10 == 1) {
                i10 = a.w(parcel, u8);
            } else if (n10 != 2) {
                a.C(parcel, u8);
            } else {
                arrayList = a.l(parcel, u8, PointF.CREATOR);
            }
        }
        a.m(parcel, D);
        return new zzos(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzos[i10];
    }
}
