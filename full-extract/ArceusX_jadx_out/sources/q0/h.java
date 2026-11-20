package q0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f29496a;

    public static ScheduledExecutorService a() {
        if (f29496a != null) {
            return f29496a;
        }
        synchronized (h.class) {
            try {
                if (f29496a == null) {
                    f29496a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f29496a;
    }
}
