package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzaf;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 == 2) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                j11 = o9.a.y(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzaf(j10, i10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
