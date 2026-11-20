package y1;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ne.x;

/* loaded from: classes.dex */
public abstract class a<V> implements x<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f36234d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f36235e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f36236f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f36237g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f36238a;
    public volatile e b;

    /* renamed from: c, reason: collision with root package name */
    public volatile i f36239c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f36240c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f36241d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f36242a;
        public final Throwable b;

        static {
            if (a.f36234d) {
                f36241d = null;
                f36240c = null;
            } else {
                f36241d = new c(false, null);
                f36240c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f36242a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new C0668a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f36243a;

        /* renamed from: y1.a$d$a, reason: collision with other inner class name */
        public class C0668a extends Throwable {
            public C0668a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f36243a = (Throwable) a.h(th2);
        }
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f36244d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f36245a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public e f36246c;

        public e(Runnable runnable, Executor executor) {
            this.f36245a = runnable;
            this.b = executor;
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f36247a;
        public final AtomicReferenceFieldUpdater<i, i> b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f36248c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f36249d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f36250e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f36247a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f36248c = atomicReferenceFieldUpdater3;
            this.f36249d = atomicReferenceFieldUpdater4;
            this.f36250e = atomicReferenceFieldUpdater5;
        }

        @Override // y1.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return y1.b.a(this.f36249d, aVar, eVar, eVar2);
        }

        @Override // y1.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return y1.b.a(this.f36250e, aVar, obj, obj2);
        }

        @Override // y1.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return y1.b.a(this.f36248c, aVar, iVar, iVar2);
        }

        @Override // y1.a.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // y1.a.b
        public void e(i iVar, Thread thread) {
            this.f36247a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final a<V> f36251a;
        public final x<? extends V> b;
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // y1.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.b != eVar) {
                        return false;
                    }
                    aVar.b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f36238a != obj) {
                        return false;
                    }
                    aVar.f36238a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f36239c != iVar) {
                        return false;
                    }
                    aVar.f36239c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // y1.a.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // y1.a.b
        public void e(i iVar, Thread thread) {
            iVar.f36253a = thread;
        }
    }

    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        public static final i f36252c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f36253a;
        public volatile i b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.f36236f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f36253a;
            if (thread != null) {
                this.f36253a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f36236f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, ve.a.f33391e), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, ve.a.f33391e));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f36236f = hVar;
        if (th != null) {
            f36235e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36237g = new Object();
    }

    private void c(StringBuilder sb2) {
        try {
            Object r8 = r(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(z(r8));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    public static <T> T h(T t8) {
        t8.getClass();
        return t8;
    }

    public static void l(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.v();
            aVar.d();
            e j10 = aVar.j(eVar);
            while (j10 != null) {
                eVar = j10.f36246c;
                Runnable runnable = j10.f36245a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f36251a;
                    if (aVar.f36238a == gVar) {
                        if (f36236f.b(aVar, gVar, q(gVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    n(runnable, j10.b);
                }
                j10 = eVar;
            }
            return;
        }
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f36235e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V o(Object obj) {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f36243a);
        }
        if (obj == f36237g) {
            return null;
        }
        return obj;
    }

    public static Object q(x<?> xVar) {
        if (xVar instanceof a) {
            Object obj = ((a) xVar).f36238a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f36242a ? cVar.b != null ? new c(false, cVar.b) : c.f36241d : obj;
        }
        boolean isCancelled = xVar.isCancelled();
        if ((!f36234d) && isCancelled) {
            return c.f36241d;
        }
        try {
            Object r8 = r(xVar);
            return r8 == null ? f36237g : r8;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    public static <V> V r(Future<V> future) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
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
        return v5;
    }

    private void v() {
        i iVar;
        do {
            iVar = this.f36239c;
        } while (!f36236f.c(this, iVar, i.f36252c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    public final boolean A() {
        Object obj = this.f36238a;
        return (obj instanceof c) && ((c) obj).f36242a;
    }

    @Override // ne.x
    public final void a(Runnable runnable, Executor executor) {
        h(runnable);
        h(executor);
        e eVar = this.b;
        if (eVar != e.f36244d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f36246c = eVar;
                if (f36236f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f36244d);
        }
        n(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f36238a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof y1.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = y1.a.f36234d
            if (r3 == 0) goto L1f
            y1.a$c r3 = new y1.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            y1.a$c r3 = y1.a.c.f36240c
            goto L26
        L24:
            y1.a$c r3 = y1.a.c.f36241d
        L26:
            r4 = r7
            r5 = r2
        L28:
            y1.a$b r6 = y1.a.f36236f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.s()
        L35:
            l(r4)
            boolean r4 = r0 instanceof y1.a.g
            if (r4 == 0) goto L58
            y1.a$g r0 = (y1.a.g) r0
            ne.x<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof y1.a
            if (r4 == 0) goto L55
            r4 = r0
            y1.a r4 = (y1.a) r4
            java.lang.Object r0 = r4.f36238a
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof y1.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = r1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.f36238a
            boolean r6 = r0 instanceof y1.a.g
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.a.cancel(boolean):boolean");
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f36238a;
        if ((obj != null) && (!(obj instanceof g))) {
            return o(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f36239c;
            if (iVar != i.f36252c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f36236f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36238a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return o(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(iVar2);
                    } else {
                        iVar = this.f36239c;
                    }
                } while (iVar != i.f36252c);
            }
            return o(this.f36238a);
        }
        while (nanos > 0) {
            Object obj3 = this.f36238a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return o(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36238a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f36238a != null);
    }

    public final e j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.b;
        } while (!f36236f.a(this, eVar2, e.f36244d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f36246c;
            eVar4.f36246c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public void s() {
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = u();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String u() {
        Object obj = this.f36238a;
        if (obj instanceof g) {
            return "setFuture=[" + z(((g) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void w(i iVar) {
        iVar.f36253a = null;
        while (true) {
            i iVar2 = this.f36239c;
            if (iVar2 == i.f36252c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.f36253a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.f36253a == null) {
                        break;
                    }
                } else if (!f36236f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean x(V v5) {
        if (v5 == null) {
            v5 = (V) f36237g;
        }
        if (!f36236f.b(this, null, v5)) {
            return false;
        }
        l(this);
        return true;
    }

    public boolean y(Throwable th2) {
        if (!f36236f.b(this, null, new d((Throwable) h(th2)))) {
            return false;
        }
        l(this);
        return true;
    }

    public final String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36238a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return o(obj2);
            }
            i iVar = this.f36239c;
            if (iVar != i.f36252c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f36236f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36238a;
                            } else {
                                w(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return o(obj);
                    }
                    iVar = this.f36239c;
                } while (iVar != i.f36252c);
            }
            return o(this.f36238a);
        }
        throw new InterruptedException();
    }
}
