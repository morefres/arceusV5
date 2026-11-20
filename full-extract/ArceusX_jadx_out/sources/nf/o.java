package nf;

import e.k0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nf.p;

/* loaded from: classes2.dex */
public class o implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f27066a;
    public final ScheduledExecutorService b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f27066a = executorService;
        this.b = scheduledExecutorService;
    }

    public static /* synthetic */ void e(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void f(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void j(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f27066a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27066a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f27066a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f27066a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f27066a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f27066a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.c
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture schedule;
                schedule = r0.b.schedule(new Runnable() { // from class: nf.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f27066a.execute(new Runnable() { // from class: nf.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.m(r1, r2);
                            }
                        });
                    }
                }, j10, timeUnit);
                return schedule;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.f
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture scheduleAtFixedRate;
                scheduleAtFixedRate = r0.b.scheduleAtFixedRate(new Runnable() { // from class: nf.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f27066a.execute(new Runnable() { // from class: nf.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.f(r1, r2);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
                return scheduleAtFixedRate;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.g
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture scheduleWithFixedDelay;
                scheduleWithFixedDelay = r0.b.scheduleWithFixedDelay(new Runnable() { // from class: nf.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f27066a.execute(new Runnable() { // from class: nf.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.j(r1, r2);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
                return scheduleWithFixedDelay;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f27066a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f27066a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f27066a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nf.h
            @Override // nf.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture schedule;
                schedule = r0.b.schedule(new Callable() { // from class: nf.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Future submit;
                        submit = o.this.f27066a.submit(new Runnable() { // from class: nf.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.e(r1, r2);
                            }
                        });
                        return submit;
                    }
                }, j10, timeUnit);
                return schedule;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t8) {
        return this.f27066a.submit(runnable, t8);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f27066a.submit(runnable);
    }
}
