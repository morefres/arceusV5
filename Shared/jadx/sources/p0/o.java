package p0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f28246a;

    public static Handler a() {
        if (f28246a != null) {
            return f28246a;
        }
        synchronized (o.class) {
            try {
                if (f28246a == null) {
                    f28246a = u2.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28246a;
    }
}
