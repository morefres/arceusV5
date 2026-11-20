package dh;

import ek.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class a<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f14739a = new AtomicBoolean(false);
    public AtomicInteger b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public T f14740c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledExecutorService f14741d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture<?> f14742e;

    /* renamed from: f, reason: collision with root package name */
    public String f14743f;

    public a(String str) {
        this.f14743f = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.f14741d == null) {
            this.f14741d = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f14741d;
    }

    public final synchronized T c() {
        return this.f14740c;
    }

    public final void d(long j10) {
        this.f14742e = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public synchronized void e(T t8) {
        try {
            if (!this.f14739a.get() && (g() <= 0 || this.b.incrementAndGet() < g())) {
                long f10 = f();
                if (f10 <= 0) {
                    a(t8);
                    return;
                }
                q.h(this.f14743f, "queue value: " + t8);
                this.f14740c = t8;
                if (this.f14742e == null) {
                    d(f10);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f14742e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f14740c = t8;
            q.h(this.f14743f, "set immediately: " + t8);
            a(t8);
            this.f14739a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract long f();

    public abstract int g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        a(c());
        this.f14739a.set(true);
    }
}
