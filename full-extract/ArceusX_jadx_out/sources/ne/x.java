package ne;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface x<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
