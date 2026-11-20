package lb;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q extends hb.o implements r {
    public static r s2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new p(iBinder);
    }

    @Override // hb.o
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        s((Location) hb.t.b(parcel, Location.CREATOR));
        return true;
    }
}
