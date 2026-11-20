package ne;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public String f26994a = null;
    public Boolean b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26995c = null;

    /* renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f26996d = null;

    /* renamed from: e, reason: collision with root package name */
    public ThreadFactory f26997e = null;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f26998a;
        public final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f26999c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f27000d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f27001e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f27002f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f26998a = threadFactory;
            this.b = str;
            this.f26999c = atomicLong;
            this.f27000d = bool;
            this.f27001e = num;
            this.f27002f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f26998a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                AtomicLong atomicLong = this.f26999c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(f0.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f27000d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f27001e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27002f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    public static ThreadFactory c(f0 f0Var) {
        String str = f0Var.f26994a;
        Boolean bool = f0Var.b;
        Integer num = f0Var.f26995c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f0Var.f26996d;
        ThreadFactory threadFactory = f0Var.f26997e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public f0 e(boolean z10) {
        this.b = Boolean.valueOf(z10);
        return this;
    }

    public f0 f(String str) {
        d(str, 0);
        this.f26994a = str;
        return this;
    }

    public f0 g(int i10) {
        he.n.g(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        he.n.g(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f26995c = Integer.valueOf(i10);
        return this;
    }

    public f0 h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f26996d = (Thread.UncaughtExceptionHandler) he.n.l(uncaughtExceptionHandler);
        return this;
    }
}
