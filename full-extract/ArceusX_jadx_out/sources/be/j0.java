package be;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class j0 extends h1 implements k0 {
    public static k0 s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof k0 ? (k0) queryLocalInterface : new i0(iBinder);
    }
}
