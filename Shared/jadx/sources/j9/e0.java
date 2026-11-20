package j9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzr;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        long j10 = -1;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 4) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                j10 = o9.a.y(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzr(z10, str, i10, i11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
