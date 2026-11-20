package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 5:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    arrayList = o9.a.j(parcel, u8);
                    break;
                case 7:
                    z12 = o9.a.o(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z10, str, str2, z11, str3, arrayList, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
