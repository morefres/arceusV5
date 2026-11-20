package r0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ne.x;

/* loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public r0.a<? super I, ? extends O> f30023c;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue<Boolean> f30024d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f30025e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public x<? extends I> f30026f;

    /* renamed from: g, reason: collision with root package name */
    public volatile x<? extends O> f30027g;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f30028a;

        public a(x xVar) {
            this.f30028a = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.d(n.m(this.f30028a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    b.this.e(e10.getCause());
                }
            } finally {
                b.this.f30027g = null;
            }
        }
    }

    public b(r0.a<? super I, ? extends O> aVar, x<? extends I> xVar) {
        this.f30023c = (r0.a) x2.g.g(aVar);
        this.f30026f = (x) x2.g.g(xVar);
    }

    @Override // r0.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        i(this.f30024d, Boolean.valueOf(z10));
        h(this.f30026f, z10);
        h(this.f30027g, z10);
        return true;
    }

    @Override // r0.d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            x<? extends I> xVar = this.f30026f;
            if (xVar != null) {
                xVar.get();
            }
            this.f30025e.await();
            x<? extends O> xVar2 = this.f30027g;
            if (xVar2 != null) {
                xVar2.get();
            }
        }
        return (O) super.get();
    }

    public final void h(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    public final <E> void i(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final <E> E j(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ne.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ne.x<? extends I>, r0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        r0.a<? super I, ? extends O> aVar;
        ?? r02 = (r0.a<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            x<? extends O> apply = this.f30023c.apply(n.m(this.f30026f));
                            this.f30027g = apply;
                            if (isCancelled()) {
                                apply.cancel(((Boolean) j(this.f30024d)).booleanValue());
                                this.f30027g = null;
                            } else {
                                apply.a(new a(apply), q0.c.b());
                            }
                        } catch (Exception e10) {
                            e(e10);
                            aVar = r02;
                        }
                    } catch (Error e11) {
                        e(e11);
                        aVar = r02;
                    }
                } finally {
                    this.f30023c = (r0.a<? super I, ? extends O>) r02;
                    this.f30026f = (x<? extends I>) r02;
                    this.f30025e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                e(e12.getCause());
            }
        } catch (UndeclaredThrowableException e13) {
            e(e13.getCause());
            aVar = r02;
        }
    }

    @Override // r0.d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            x<? extends I> xVar = this.f30026f;
            if (xVar != null) {
                long nanoTime = System.nanoTime();
                xVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f30025e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
                x<? extends O> xVar2 = this.f30027g;
                if (xVar2 != null) {
                    xVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
