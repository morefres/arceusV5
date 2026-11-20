package n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;

/* loaded from: classes.dex */
public abstract class n1 extends db.n implements h {
    public n1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // db.n
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) db.o.b(parcel, Bundle.CREATOR);
            db.o.e(parcel);
            d0(readInt, readStrongBinder, bundle);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) db.o.b(parcel, Bundle.CREATOR);
            db.o.e(parcel);
            i(readInt2, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) db.o.b(parcel, zzj.CREATOR);
            db.o.e(parcel);
            x1(readInt3, readStrongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
