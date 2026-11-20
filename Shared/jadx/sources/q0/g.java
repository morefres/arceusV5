package q0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Executor {
    public static volatile Executor b;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f29494a = Executors.newFixedThreadPool(2, new a());

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f29495a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f29495a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (b != null) {
            return b;
        }
        synchronized (g.class) {
            try {
                if (b == null) {
                    b = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29494a.execute(runnable);
    }
}
