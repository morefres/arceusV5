package ee;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class k0 extends b0 implements l0 {
    public static l0 s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(iBinder);
    }
}
