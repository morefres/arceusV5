package n9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                iBinder = o9.a.v(parcel, u8);
            } else if (n10 == 3) {
                connectionResult = (ConnectionResult) o9.a.g(parcel, u8, ConnectionResult.CREATOR);
            } else if (n10 == 4) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                z11 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zav(i10, iBinder, connectionResult, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
