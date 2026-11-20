package va;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                str3 = o9.a.h(parcel, u8);
            } else if (n10 == 4) {
                str4 = o9.a.h(parcel, u8);
            } else if (n10 == 6) {
                str5 = o9.a.h(parcel, u8);
            } else if (n10 != 7) {
                o9.a.C(parcel, u8);
            } else {
                bundle = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzk(str, str2, str3, str4, str5, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
