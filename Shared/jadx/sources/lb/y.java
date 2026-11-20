package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzbo;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 1;
        int i11 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 == 3) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                j11 = o9.a.y(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzbo(i10, i11, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i10) {
        return new zzbo[i10];
    }
}
