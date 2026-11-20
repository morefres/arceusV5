package ug;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f32828a;
    public static final int b;

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f32829c;

    /* renamed from: d, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f32830d;

    /* renamed from: e, reason: collision with root package name */
    public static Executor f32831e;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f32832a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f32832a.getAndIncrement());
        }
    }

    public static class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f32828a = availableProcessors;
        b = (availableProcessors * 2) + 1;
        f32829c = new a();
        f32830d = new LinkedBlockingQueue(128);
    }

    public static synchronized Executor a() {
        Executor executor;
        synchronized (s.class) {
            try {
                if (f32831e == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, b, 30L, TimeUnit.SECONDS, f32830d, f32829c);
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    threadPoolExecutor.setRejectedExecutionHandler(new b());
                    f32831e = threadPoolExecutor;
                }
                executor = f32831e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executor;
    }
}
