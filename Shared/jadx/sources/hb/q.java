package hb;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbc;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 1;
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    zzbaVar = (zzba) o9.a.g(parcel, u8, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = o9.a.v(parcel, u8);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) o9.a.g(parcel, u8, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = o9.a.v(parcel, u8);
                    break;
                case 6:
                    iBinder3 = o9.a.v(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzbc(i10, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
