package n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class l1 extends db.n implements m1 {
    public l1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static m1 s2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new k1(iBinder);
    }

    @Override // db.n
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            y9.a zzd = zzd();
            parcel2.writeNoException();
            db.o.d(parcel2, zzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
