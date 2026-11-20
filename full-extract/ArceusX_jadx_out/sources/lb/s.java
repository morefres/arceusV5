package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzbo;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                i12 = o9.a.w(parcel, u8);
            } else if (n10 == 3) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 == 4) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                zzboVarArr = (zzbo[]) o9.a.k(parcel, u8, zzbo.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new LocationAvailability(i10, i11, i12, j10, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
