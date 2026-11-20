package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class s1<V> extends o2 implements i2<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7276d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final h2 f7277e = new h2(m1.class);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f7278f;

    /* renamed from: g, reason: collision with root package name */
    public static final n1 f7279g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f7280a;
    public volatile k1 b;

    /* renamed from: c, reason: collision with root package name */
    public volatile r1 f7281c;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        n1 p1Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f7278f = z10;
        String property = System.getProperty("java.runtime.name", "");
        w1 w1Var = null;
        if (property == null || property.contains("Android")) {
            try {
                p1Var = new q1(w1Var);
            } catch (Error | Exception e10) {
                try {
                    p1Var = new o1(w1Var);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    p1Var = new p1(w1Var);
                }
            }
        } else {
            try {
                p1Var = new o1(w1Var);
            } catch (NoClassDefFoundError unused2) {
                p1Var = new p1(w1Var);
            }
        }
        th2 = null;
        th3 = null;
        f7279g = p1Var;
        if (th2 != null) {
            h2 h2Var = f7277e;
            Logger a10 = h2Var.a();
            Level level = Level.SEVERE;
            a10.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            h2Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public static boolean k(s1 s1Var, Object obj, Object obj2) {
        return f7279g.f(s1Var, obj, obj2);
    }

    public final void d(r1 r1Var) {
        r1Var.f7271a = null;
        while (true) {
            r1 r1Var2 = this.f7281c;
            if (r1Var2 != r1.f7270c) {
                r1 r1Var3 = null;
                while (r1Var2 != null) {
                    r1 r1Var4 = r1Var2.b;
                    if (r1Var2.f7271a != null) {
                        r1Var3 = r1Var2;
                    } else if (r1Var3 != null) {
                        r1Var3.b = r1Var4;
                        if (r1Var3.f7271a == null) {
                            break;
                        }
                    } else if (!f7279g.g(this, r1Var2, r1Var4)) {
                        break;
                    }
                    r1Var2 = r1Var4;
                }
                return;
            }
            return;
        }
    }

    public final k1 e(k1 k1Var) {
        return f7279g.a(this, k1Var);
    }

    public final Object f() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7280a;
        if ((obj2 != null) && m1.q(obj2)) {
            return m1.m(obj2);
        }
        r1 r1Var = this.f7281c;
        if (r1Var != r1.f7270c) {
            r1 r1Var2 = new r1();
            do {
                n1 n1Var = f7279g;
                n1Var.c(r1Var2, r1Var);
                if (n1Var.g(this, r1Var, r1Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(r1Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f7280a;
                    } while (!((obj != null) & m1.q(obj)));
                    return m1.m(obj);
                }
                r1Var = this.f7281c;
            } while (r1Var != r1.f7270c);
        }
        Object obj3 = this.f7280a;
        Objects.requireNonNull(obj3);
        return m1.m(obj3);
    }

    public final Object g(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7280a;
        boolean z10 = true;
        if ((obj != null) && m1.q(obj)) {
            return m1.m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r1 r1Var = this.f7281c;
            if (r1Var != r1.f7270c) {
                r1 r1Var2 = new r1();
                do {
                    n1 n1Var = f7279g;
                    n1Var.c(r1Var2, r1Var);
                    if (n1Var.g(this, r1Var, r1Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                d(r1Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7280a;
                            if ((obj2 != null) && m1.q(obj2)) {
                                return m1.m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d(r1Var2);
                    } else {
                        r1Var = this.f7281c;
                    }
                } while (r1Var != r1.f7270c);
            }
            Object obj3 = this.f7280a;
            Objects.requireNonNull(obj3);
            return m1.m(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f7280a;
            if ((obj4 != null) && m1.q(obj4)) {
                return m1.m(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
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
        throw new TimeoutException(str + " for " + obj5);
    }

    public final void i() {
        for (r1 b = f7279g.b(this, r1.f7270c); b != null; b = b.b) {
            Thread thread = b.f7271a;
            if (thread != null) {
                b.f7271a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean j(k1 k1Var, k1 k1Var2) {
        return f7279g.e(this, k1Var, k1Var2);
    }
}
