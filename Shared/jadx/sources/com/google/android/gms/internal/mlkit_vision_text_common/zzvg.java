package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o9.a;

/* loaded from: classes.dex */
public final class zzvg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = a.D(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = a.u(parcel);
            int n10 = a.n(u8);
            if (n10 == 1) {
                str = a.h(parcel, u8);
            } else if (n10 != 2) {
                a.C(parcel, u8);
            } else {
                arrayList = a.l(parcel, u8, zzuz.CREATOR);
            }
        }
        a.m(parcel, D);
        return new zzvf(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvf[i10];
    }
}
