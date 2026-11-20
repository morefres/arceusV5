package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzbj;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<zzbj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                str3 = o9.a.h(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                str = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzbj(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
