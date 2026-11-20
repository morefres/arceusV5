package nb;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class f {
    public f(Context context) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
