package ne;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ne.b;
import ne.p;

/* loaded from: classes2.dex */
public final class a0 {

    public class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f26961a;
        public final /* synthetic */ ne.b b;

        public a(Executor executor, ne.b bVar) {
            this.f26961a = executor;
            this.b = bVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f26961a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.b.E(e10);
            }
        }
    }

    public static class b extends ne.c {
        public final ExecutorService b;

        public b(ExecutorService executorService) {
            this.b = (ExecutorService) he.n.l(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.b.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
            sb2.append(obj);
            sb2.append("[");
            sb2.append(valueOf);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static final class c extends b implements ScheduledExecutorService, z {

        /* renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f26962c;

        public static final class a<V> extends p.a<V> implements y<V> {
            public final ScheduledFuture<?> b;

            public a(x<V> xVar, ScheduledFuture<?> scheduledFuture) {
                super(xVar);
                this.b = scheduledFuture;
            }

            @Override // ne.o, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean cancel = super.cancel(z10);
                if (cancel) {
                    this.b.cancel(z10);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.b.getDelay(timeUnit);
            }
        }

        public static final class b extends b.j<Void> implements Runnable {

            /* renamed from: h, reason: collision with root package name */
            public final Runnable f26963h;

            public b(Runnable runnable) {
                this.f26963h = (Runnable) he.n.l(runnable);
            }

            @Override // ne.b
            public String A() {
                String valueOf = String.valueOf(this.f26963h);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
                sb2.append("task=[");
                sb2.append(valueOf);
                sb2.append("]");
                return sb2.toString();
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f26963h.run();
                } catch (Throwable th2) {
                    E(th2);
                    throw he.u.e(th2);
                }
            }
        }

        public c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f26962c = (ScheduledExecutorService) he.n.l(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            g0 M = g0.M(runnable, null);
            return new a(M, this.f26962c.schedule(M, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public <V> y<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            g0 N = g0.N(callable);
            return new a(N, this.f26962c.schedule(N, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public y<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f26962c.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public y<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f26962c.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return l.INSTANCE;
    }

    public static z b(ExecutorService executorService) {
        return executorService instanceof z ? (z) executorService : executorService instanceof ScheduledExecutorService ? new c((ScheduledExecutorService) executorService) : new b(executorService);
    }

    public static Executor c(Executor executor, ne.b<?> bVar) {
        he.n.l(executor);
        he.n.l(bVar);
        return executor == a() ? executor : new a(executor, bVar);
    }
}
