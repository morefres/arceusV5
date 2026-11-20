package xd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class e extends b implements f {
    public static f s2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder);
    }
}
