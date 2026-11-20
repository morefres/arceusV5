package n9;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class o0 extends db.n implements p0 {
    public static p0 s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof p0 ? (p0) queryLocalInterface : new n0(iBinder);
    }
}
