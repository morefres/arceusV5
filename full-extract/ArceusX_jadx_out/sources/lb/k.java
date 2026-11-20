package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class k extends hb.o implements l {
    public static l s2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof l ? (l) queryLocalInterface : new j(iBinder);
    }

    @Override // hb.o
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
