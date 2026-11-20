package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class m1<V> extends s1<V> {
    public static Object m(Object obj) {
        if (obj instanceof h1) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((h1) obj).b);
            throw cancellationException;
        }
        if (obj instanceof j1) {
            throw new ExecutionException(((j1) obj).f7158a);
        }
        if (obj == s1.f7276d) {
            return null;
        }
        return obj;
    }

    public static boolean q(Object obj) {
        return !(obj instanceof i1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(i2 i2Var) {
        Throwable c10;
        if (i2Var instanceof l1) {
            Object obj = ((m1) i2Var).f7280a;
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (h1Var.f7139a) {
                    Throwable th2 = h1Var.b;
                    obj = th2 != null ? new h1(false, th2) : h1.f7138d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((i2Var instanceof o2) && (c10 = ((o2) i2Var).c()) != null) {
            return new j1(c10);
        }
        boolean isCancelled = i2Var.isCancelled();
        if ((!s1.f7278f) && isCancelled) {
            h1 h1Var2 = h1.f7138d;
            Objects.requireNonNull(h1Var2);
            return h1Var2;
        }
        try {
            Object u8 = u(i2Var);
            if (!isCancelled) {
                return u8 == null ? s1.f7276d : u8;
            }
            return new h1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(i2Var)));
        } catch (Error | Exception e10) {
            return new j1(e10);
        } catch (CancellationException e11) {
            return !isCancelled ? new j1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(i2Var)), e11)) : new h1(false, e11);
        } catch (ExecutionException e12) {
            return isCancelled ? new h1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(i2Var)), e12)) : new j1(e12.getCause());
        }
    }

    public static Object u(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public static void w(m1 m1Var, boolean z10) {
        k1 k1Var;
        k1 k1Var2 = null;
        while (true) {
            m1Var.i();
            m1Var.p();
            k1 k1Var3 = k1Var2;
            k1 e10 = m1Var.e(k1.f7163d);
            k1 k1Var4 = k1Var3;
            while (e10 != null) {
                k1 k1Var5 = e10.f7165c;
                e10.f7165c = k1Var4;
                k1Var4 = e10;
                e10 = k1Var5;
            }
            while (k1Var4 != null) {
                Runnable runnable = k1Var4.f7164a;
                k1Var = k1Var4.f7165c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof i1) {
                    i1 i1Var = (i1) runnable2;
                    m1Var = i1Var.f7154a;
                    if (m1Var.f7280a == i1Var && s1.k(m1Var, i1Var, t(i1Var.b))) {
                        break;
                    }
                } else {
                    Executor executor = k1Var4.b;
                    Objects.requireNonNull(executor);
                    x(runnable2, executor);
                }
                k1Var4 = k1Var;
            }
            return;
            k1Var2 = k1Var;
        }
    }

    public static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            s1.f7277e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i2
    public final void b(Runnable runnable, Executor executor) {
        k1 k1Var;
        x.c(executor, "Executor was null.");
        if (!isDone() && (k1Var = this.b) != k1.f7163d) {
            k1 k1Var2 = new k1(runnable, executor);
            do {
                k1Var2.f7165c = k1Var;
                if (j(k1Var, k1Var2)) {
                    return;
                } else {
                    k1Var = this.b;
                }
            } while (k1Var != k1.f7163d);
        }
        x(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final Throwable c() {
        if (!(this instanceof l1)) {
            return null;
        }
        Object obj = this.f7280a;
        if (obj instanceof j1) {
            return ((j1) obj).f7158a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        h1 h1Var;
        Object obj = this.f7280a;
        if (!(obj instanceof i1) && !(obj == null)) {
            return false;
        }
        if (s1.f7278f) {
            h1Var = new h1(z10, new CancellationException("Future.cancel() was called."));
        } else {
            h1Var = z10 ? h1.f7137c : h1.f7138d;
            Objects.requireNonNull(h1Var);
        }
        m1<V> m1Var = this;
        boolean z11 = false;
        while (true) {
            if (s1.k(m1Var, obj, h1Var)) {
                w(m1Var, z10);
                if (!(obj instanceof i1)) {
                    break;
                }
                i2<? extends V> i2Var = ((i1) obj).b;
                if (!(i2Var instanceof l1)) {
                    i2Var.cancel(z10);
                    break;
                }
                m1Var = (m1) i2Var;
                obj = m1Var.f7280a;
                if (!(obj == null) && !(obj instanceof i1)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = m1Var.f7280a;
                if (q(obj)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return f();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7280a instanceof h1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7280a;
        return (obj != null) & q(obj);
    }

    public String n() {
        throw null;
    }

    public void p() {
    }

    public final boolean r(Throwable th2) {
        if (!s1.k(this, null, new j1(th2))) {
            return false;
        }
        w(this, false);
        return true;
    }

    public final boolean s(i2 i2Var) {
        j1 j1Var;
        Object obj = this.f7280a;
        if (obj == null) {
            if (i2Var.isDone()) {
                if (!s1.k(this, null, t(i2Var))) {
                    return false;
                }
                w(this, false);
                return true;
            }
            i1 i1Var = new i1(this, i2Var);
            if (s1.k(this, null, i1Var)) {
                try {
                    i2Var.b(i1Var, y1.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        j1Var = new j1(th2);
                    } catch (Error | Exception unused) {
                        j1Var = j1.b;
                    }
                    s1.k(this, i1Var, j1Var);
                }
                return true;
            }
            obj = this.f7280a;
        }
        if (obj instanceof h1) {
            i2Var.cancel(((h1) obj).f7139a);
        }
        return false;
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f7280a instanceof h1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            v(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f7280a;
            if (obj instanceof i1) {
                sb2.append(", setFuture=[");
                i2<? extends V> i2Var = ((i1) obj).b;
                try {
                    if (i2Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(i2Var);
                    }
                } catch (Throwable th2) {
                    j2.a(th2);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    concat = a0.a(n());
                } catch (Throwable th3) {
                    j2.a(th3);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (concat != null) {
                    sb2.append(", info=[");
                    sb2.append(concat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                v(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void v(StringBuilder sb2) {
        try {
            Object u8 = u(this);
            sb2.append("SUCCESS, result=[");
            if (u8 == null) {
                sb2.append("null");
            } else if (u8 == this) {
                sb2.append("this future");
            } else {
                sb2.append(u8.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(u8)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return g(j10, timeUnit);
    }
}
