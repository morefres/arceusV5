package s7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class f implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f30913d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f30914a;
    public final AtomicInteger b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f30915c;

    public f() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f30914a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f30915c = "lottie-" + f30913d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f30914a, runnable, this.f30915c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
