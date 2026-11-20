package lf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        Bundle bundle = null;
        zzj zzjVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                bundle = o9.a.b(parcel, u8);
            } else if (n10 == 2) {
                zzjVar = (zzj) o9.a.g(parcel, u8, zzj.CREATOR);
            } else if (n10 == 3) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 4) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 != 1000) {
                o9.a.C(parcel, u8);
            } else {
                i10 = o9.a.w(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new Thing(i10, bundle, zzjVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Thing[i10];
    }
}
