package k9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                pendingIntent = (PendingIntent) o9.a.g(parcel, u8, PendingIntent.CREATOR);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                connectionResult = (ConnectionResult) o9.a.g(parcel, u8, ConnectionResult.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new Status(i10, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
