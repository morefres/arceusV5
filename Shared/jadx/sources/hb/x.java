package hb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        zzj zzjVar = null;
        int i10 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                zzjVar = (zzj) o9.a.g(parcel, u8, zzj.CREATOR);
            } else if (n10 == 3) {
                iBinder = o9.a.v(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                iBinder2 = o9.a.v(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzl(i10, zzjVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
