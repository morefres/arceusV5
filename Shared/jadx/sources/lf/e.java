package lf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.zzj;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 == 2) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 3) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 4) {
                bundle = o9.a.b(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                bundle2 = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzj(z10, i10, str, bundle, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
