package ee;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class p0 extends b0 implements q0 {
    public static q0 s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(iBinder);
    }
}
