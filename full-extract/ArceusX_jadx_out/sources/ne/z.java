package ne;

import e.k0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface z extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.ExecutorService, ne.z
    x<?> submit(Runnable runnable);

    <T> x<T> submit(Runnable runnable, T t8);

    @Override // java.util.concurrent.ExecutorService, ne.z
    <T> x<T> submit(Callable<T> callable);

    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return submit(runnable, (Runnable) obj);
    }
}
