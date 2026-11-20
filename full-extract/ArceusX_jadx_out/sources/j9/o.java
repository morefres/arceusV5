package j9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        Integer num = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 == 3) {
                pendingIntent = (PendingIntent) o9.a.g(parcel, u8, PendingIntent.CREATOR);
            } else if (n10 == 4) {
                str = o9.a.h(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                num = o9.a.x(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ConnectionResult(i10, i11, pendingIntent, str, num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
