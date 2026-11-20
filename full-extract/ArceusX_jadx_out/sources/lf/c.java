package lf;

import android.os.IBinder;
import android.os.IInterface;
import va.w;

/* loaded from: classes2.dex */
public abstract class c extends w implements d {
    public static d s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }
}
