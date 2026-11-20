package ne;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class c0 {
    public static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
