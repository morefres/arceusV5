package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class s9 implements i2 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f7360d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f7361e = Logger.getLogger(s9.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final x1 f7362f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7363g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f7364a;
    public volatile k5 b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q9 f7365c;

    static {
        x1 g9Var;
        try {
            g9Var = new f7(AtomicReferenceFieldUpdater.newUpdater(q9.class, Thread.class, ve.a.f33391e), AtomicReferenceFieldUpdater.newUpdater(q9.class, q9.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(s9.class, q9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(s9.class, k5.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(s9.class, Object.class, ve.a.f33391e));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            g9Var = new g9();
        }
        Throwable th3 = th;
        f7362f = g9Var;
        if (th3 != null) {
            f7361e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f7363g = new Object();
    }

    public static void d(s9 s9Var) {
        q9 q9Var;
        x1 x1Var;
        k5 k5Var;
        do {
            q9Var = s9Var.f7365c;
            x1Var = f7362f;
        } while (!x1Var.e(s9Var, q9Var, q9.f7267c));
        while (q9Var != null) {
            Thread thread = q9Var.f7268a;
            if (thread != null) {
                q9Var.f7268a = null;
                LockSupport.unpark(thread);
            }
            q9Var = q9Var.b;
        }
        do {
            k5Var = s9Var.b;
        } while (!x1Var.c(s9Var, k5Var, k5.f7170d));
        k5 k5Var2 = null;
        while (k5Var != null) {
            k5 k5Var3 = k5Var.f7172c;
            k5Var.f7172c = k5Var2;
            k5Var2 = k5Var;
            k5Var = k5Var3;
        }
        while (k5Var2 != null) {
            Runnable runnable = k5Var2.f7171a;
            k5 k5Var4 = k5Var2.f7172c;
            if (runnable instanceof f8) {
                throw null;
            }
            g(runnable, k5Var2.b);
            k5Var2 = k5Var4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7361e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public static final Object i(Object obj) {
        if (obj instanceof q2) {
            Throwable th2 = ((q2) obj).f7265a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof m4) {
            throw new ExecutionException(((m4) obj).f7229a);
        }
        if (obj == f7363g) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.i2
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        k5 k5Var = this.b;
        k5 k5Var2 = k5.f7170d;
        if (k5Var != k5Var2) {
            k5 k5Var3 = new k5(runnable, executor);
            do {
                k5Var3.f7172c = k5Var;
                if (f7362f.c(this, k5Var, k5Var3)) {
                    return;
                } else {
                    k5Var = this.b;
                }
            } while (k5Var != k5Var2);
        }
        g(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this.f7364a instanceof f8) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f7364a;
        if ((obj instanceof f8) | (obj == null)) {
            q2 q2Var = f7360d ? new q2(z10, new CancellationException("Future.cancel() was called.")) : z10 ? q2.b : q2.f7264c;
            while (!f7362f.d(this, obj, q2Var)) {
                obj = this.f7364a;
                if (!(obj instanceof f8)) {
                }
            }
            d(this);
            if (obj instanceof f8) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = f7363g;
        }
        if (!f7362f.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v5 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v5 == this ? "this future" : String.valueOf(v5));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7364a;
        if ((obj2 != null) && (!(obj2 instanceof f8))) {
            return i(obj2);
        }
        q9 q9Var = this.f7365c;
        q9 q9Var2 = q9.f7267c;
        if (q9Var != q9Var2) {
            q9 q9Var3 = new q9();
            do {
                x1 x1Var = f7362f;
                x1Var.a(q9Var3, q9Var);
                if (x1Var.e(this, q9Var, q9Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(q9Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f7364a;
                    } while (!((obj != null) & (!(obj instanceof f8))));
                    return i(obj);
                }
                q9Var = this.f7365c;
            } while (q9Var != q9Var2);
        }
        return i(this.f7364a);
    }

    public final void h(q9 q9Var) {
        q9Var.f7268a = null;
        while (true) {
            q9 q9Var2 = this.f7365c;
            if (q9Var2 != q9.f7267c) {
                q9 q9Var3 = null;
                while (q9Var2 != null) {
                    q9 q9Var4 = q9Var2.b;
                    if (q9Var2.f7268a != null) {
                        q9Var3 = q9Var2;
                    } else if (q9Var3 != null) {
                        q9Var3.b = q9Var4;
                        if (q9Var3.f7268a == null) {
                            break;
                        }
                    } else if (!f7362f.e(this, q9Var2, q9Var4)) {
                        break;
                    }
                    q9Var2 = q9Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7364a instanceof q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f7364a != null) & (!(r0 instanceof f8));
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f7364a instanceof q2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e10) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(concat);
                sb2.append("]");
            } else if (isDone()) {
                f(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        boolean z10;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f7364a;
            if ((obj != null) & (!(obj instanceof f8))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q9 q9Var = this.f7365c;
                q9 q9Var2 = q9.f7267c;
                if (q9Var != q9Var2) {
                    q9 q9Var3 = new q9();
                    z10 = true;
                    do {
                        x1 x1Var = f7362f;
                        x1Var.a(q9Var3, q9Var);
                        if (x1Var.e(this, q9Var, q9Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7364a;
                                    if ((obj2 != null) & (!(obj2 instanceof f8))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(q9Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(q9Var3);
                        } else {
                            q9Var = this.f7365c;
                        }
                    } while (q9Var != q9Var2);
                }
                return i(this.f7364a);
            }
            z10 = true;
            while (nanos > 0) {
                Object obj3 = this.f7364a;
                if ((obj3 != null ? z10 : false) & (!(obj3 instanceof f8))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String s9Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + s9Var);
        }
        throw new InterruptedException();
    }
}
