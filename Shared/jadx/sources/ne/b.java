package ne;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class b<V> extends oe.a implements x<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f26964d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f26965e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0460b f26966f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f26967g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f26968a;
    public volatile e b;

    /* renamed from: c, reason: collision with root package name */
    public volatile l f26969c;

    /* renamed from: ne.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0460b {
        public AbstractC0460b() {
        }

        public abstract boolean a(b<?> bVar, e eVar, e eVar2);

        public abstract boolean b(b<?> bVar, Object obj, Object obj2);

        public abstract boolean c(b<?> bVar, l lVar, l lVar2);

        public abstract e d(b<?> bVar, e eVar);

        public abstract l e(b<?> bVar, l lVar);

        public abstract void f(l lVar, l lVar2);

        public abstract void g(l lVar, Thread thread);
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f26970c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f26971d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f26972a;
        public final Throwable b;

        static {
            if (b.f26964d) {
                f26971d = null;
                f26970c = null;
            } else {
                f26971d = new c(false, null);
                f26970c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f26972a = z10;
            this.b = th2;
        }
    }

    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f26973a;

        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f26973a = (Throwable) he.n.l(th2);
        }
    }

    public static final class f extends AbstractC0460b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f26977a;
        public final AtomicReferenceFieldUpdater<l, l> b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, l> f26978c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, e> f26979d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, Object> f26980e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f26977a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.f26978c = atomicReferenceFieldUpdater3;
            this.f26979d = atomicReferenceFieldUpdater4;
            this.f26980e = atomicReferenceFieldUpdater5;
        }

        @Override // ne.b.AbstractC0460b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return y1.b.a(this.f26979d, bVar, eVar, eVar2);
        }

        @Override // ne.b.AbstractC0460b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return y1.b.a(this.f26980e, bVar, obj, obj2);
        }

        @Override // ne.b.AbstractC0460b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return y1.b.a(this.f26978c, bVar, lVar, lVar2);
        }

        @Override // ne.b.AbstractC0460b
        public e d(b<?> bVar, e eVar) {
            return this.f26979d.getAndSet(bVar, eVar);
        }

        @Override // ne.b.AbstractC0460b
        public l e(b<?> bVar, l lVar) {
            return this.f26978c.getAndSet(bVar, lVar);
        }

        @Override // ne.b.AbstractC0460b
        public void f(l lVar, l lVar2) {
            this.b.lazySet(lVar, lVar2);
        }

        @Override // ne.b.AbstractC0460b
        public void g(l lVar, Thread thread) {
            this.f26977a.lazySet(lVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final b<V> f26981a;
        public final x<? extends V> b;

        public g(b<V> bVar, x<? extends V> xVar) {
            this.f26981a = bVar;
            this.b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26981a.f26968a != this) {
                return;
            }
            if (b.f26966f.b(this.f26981a, this, b.w(this.b))) {
                b.t(this.f26981a);
            }
        }
    }

    public static final class h extends AbstractC0460b {
        public h() {
            super();
        }

        @Override // ne.b.AbstractC0460b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.b != eVar) {
                        return false;
                    }
                    bVar.b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.b.AbstractC0460b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.f26968a != obj) {
                        return false;
                    }
                    bVar.f26968a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.b.AbstractC0460b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.f26969c != lVar) {
                        return false;
                    }
                    bVar.f26969c = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.b.AbstractC0460b
        public e d(b<?> bVar, e eVar) {
            e eVar2;
            synchronized (bVar) {
                try {
                    eVar2 = bVar.b;
                    if (eVar2 != eVar) {
                        bVar.b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // ne.b.AbstractC0460b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            synchronized (bVar) {
                try {
                    lVar2 = bVar.f26969c;
                    if (lVar2 != lVar) {
                        bVar.f26969c = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // ne.b.AbstractC0460b
        public void f(l lVar, l lVar2) {
            lVar.b = lVar2;
        }

        @Override // ne.b.AbstractC0460b
        public void g(l lVar, Thread thread) {
            lVar.f26988a = thread;
        }
    }

    public interface i<V> extends x<V> {
    }

    public static abstract class j<V> extends b<V> implements i<V> {
        @Override // ne.b, ne.x
        public void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // ne.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // ne.b, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // ne.b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // ne.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // ne.b, java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }
    }

    public static final class k extends AbstractC0460b {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f26982a;
        public static final long b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f26983c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f26984d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f26985e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f26986f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f26983c = unsafe.objectFieldOffset(b.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(b.class.getDeclaredField(j6.b.f21518e));
                f26984d = unsafe.objectFieldOffset(b.class.getDeclaredField(ve.a.f33391e));
                f26985e = unsafe.objectFieldOffset(l.class.getDeclaredField(ve.a.f33391e));
                f26986f = unsafe.objectFieldOffset(l.class.getDeclaredField(j6.b.f21518e));
                f26982a = unsafe;
            } catch (Exception e11) {
                he.u.j(e11);
                throw new RuntimeException(e11);
            }
        }

        public k() {
            super();
        }

        @Override // ne.b.AbstractC0460b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f26982a, bVar, b, eVar, eVar2);
        }

        @Override // ne.b.AbstractC0460b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f26982a, bVar, f26984d, obj, obj2);
        }

        @Override // ne.b.AbstractC0460b
        public boolean c(b<?> bVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.a.a(f26982a, bVar, f26983c, lVar, lVar2);
        }

        @Override // ne.b.AbstractC0460b
        public e d(b<?> bVar, e eVar) {
            e eVar2;
            do {
                eVar2 = bVar.b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(bVar, eVar2, eVar));
            return eVar2;
        }

        @Override // ne.b.AbstractC0460b
        public l e(b<?> bVar, l lVar) {
            l lVar2;
            do {
                lVar2 = bVar.f26969c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(bVar, lVar2, lVar));
            return lVar2;
        }

        @Override // ne.b.AbstractC0460b
        public void f(l lVar, l lVar2) {
            f26982a.putObject(lVar, f26986f, lVar2);
        }

        @Override // ne.b.AbstractC0460b
        public void g(l lVar, Thread thread) {
            f26982a.putObject(lVar, f26985e, thread);
        }
    }

    public static final class l {

        /* renamed from: c, reason: collision with root package name */
        public static final l f26987c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f26988a;
        public volatile l b;

        public l(boolean z10) {
        }

        public void a(l lVar) {
            b.f26966f.f(this, lVar);
        }

        public void b() {
            Thread thread = this.f26988a;
            if (thread != null) {
                this.f26988a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            b.f26966f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ne.b$a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        boolean z10;
        Throwable th2;
        AbstractC0460b abstractC0460b;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f26964d = z10;
        f26965e = Logger.getLogger(b.class.getName());
        ?? r52 = 0;
        r52 = 0;
        try {
            abstractC0460b = new k();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            try {
                abstractC0460b = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, ve.a.f33391e), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(b.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, j6.b.f21518e), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ve.a.f33391e));
            } catch (Throwable th4) {
                h hVar = new h();
                r52 = th4;
                abstractC0460b = hVar;
            }
        }
        f26966f = abstractC0460b;
        if (r52 != 0) {
            ?? r02 = f26965e;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", th2);
            r02.log(level, "SafeAtomicHelper is broken!", r52);
        }
        f26967g = new Object();
    }

    public static CancellationException r(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static void t(b<?> bVar) {
        e eVar = null;
        while (true) {
            bVar.B();
            bVar.o();
            e s8 = bVar.s(eVar);
            while (s8 != null) {
                eVar = s8.f26976c;
                Runnable runnable = s8.f26975a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    bVar = gVar.f26981a;
                    if (bVar.f26968a == gVar) {
                        if (f26966f.b(bVar, gVar, w(gVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = s8.b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                s8 = eVar;
            }
            return;
        }
    }

    public static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f26965e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object w(x<?> xVar) {
        Throwable a10;
        if (xVar instanceof i) {
            Object obj = ((b) xVar).f26968a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f26972a) {
                    obj = cVar.b != null ? new c(false, cVar.b) : c.f26971d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((xVar instanceof oe.a) && (a10 = oe.b.a((oe.a) xVar)) != null) {
            return new d(a10);
        }
        boolean isCancelled = xVar.isCancelled();
        if ((!f26964d) && isCancelled) {
            c cVar2 = c.f26971d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object x10 = x(xVar);
            if (!isCancelled) {
                return x10 == null ? f26967g : x10;
            }
            String valueOf = String.valueOf(xVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(valueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            String valueOf2 = String.valueOf(xVar);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 77);
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(valueOf2);
            return new d(new IllegalArgumentException(sb3.toString(), e10));
        } catch (ExecutionException e11) {
            if (!isCancelled) {
                return new d(e11.getCause());
            }
            String valueOf3 = String.valueOf(xVar);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
            sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb4.append(valueOf3);
            return new c(false, new IllegalArgumentException(sb4.toString(), e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V x(Future<V> future) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public String A() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final void B() {
        for (l e10 = f26966f.e(this, l.f26987c); e10 != null; e10 = e10.b) {
            e10.b();
        }
    }

    public final void C(l lVar) {
        lVar.f26988a = null;
        while (true) {
            l lVar2 = this.f26969c;
            if (lVar2 == l.f26987c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.b;
                if (lVar2.f26988a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.b = lVar4;
                    if (lVar3.f26988a == null) {
                        break;
                    }
                } else if (!f26966f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    public boolean D(V v5) {
        if (v5 == null) {
            v5 = (V) f26967g;
        }
        if (!f26966f.b(this, null, v5)) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean E(Throwable th2) {
        if (!f26966f.b(this, null, new d((Throwable) he.n.l(th2)))) {
            return false;
        }
        t(this);
        return true;
    }

    public boolean F(x<? extends V> xVar) {
        d dVar;
        he.n.l(xVar);
        Object obj = this.f26968a;
        if (obj == null) {
            if (xVar.isDone()) {
                if (!f26966f.b(this, null, w(xVar))) {
                    return false;
                }
                t(this);
                return true;
            }
            g gVar = new g(this, xVar);
            if (f26966f.b(this, null, gVar)) {
                try {
                    xVar.a(gVar, ne.l.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    f26966f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f26968a;
        }
        if (obj instanceof c) {
            xVar.cancel(((c) obj).f26972a);
        }
        return false;
    }

    public final boolean G() {
        Object obj = this.f26968a;
        return (obj instanceof c) && ((c) obj).f26972a;
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        he.n.m(runnable, "Runnable was null.");
        he.n.m(executor, "Executor was null.");
        if (!isDone() && (eVar = this.b) != e.f26974d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f26976c = eVar;
                if (f26966f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.b;
                }
            } while (eVar != e.f26974d);
        }
        u(runnable, executor);
    }

    @Override // oe.a
    public final Throwable c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f26968a;
        if (obj instanceof d) {
            return ((d) obj).f26973a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f26968a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f26964d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f26970c : c.f26971d;
            Objects.requireNonNull(cVar);
        }
        b<V> bVar = this;
        boolean z11 = false;
        while (true) {
            if (f26966f.b(bVar, obj, cVar)) {
                if (z10) {
                    bVar.y();
                }
                t(bVar);
                if (!(obj instanceof g)) {
                    break;
                }
                x<? extends V> xVar = ((g) obj).b;
                if (!(xVar instanceof i)) {
                    xVar.cancel(z10);
                    break;
                }
                bVar = (b) xVar;
                obj = bVar.f26968a;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = bVar.f26968a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f26968a;
        if ((obj != null) && (!(obj instanceof g))) {
            return v(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f26969c;
            if (lVar != l.f26987c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f26966f.c(this, lVar, lVar2)) {
                        do {
                            c0.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f26968a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return v(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(lVar2);
                    } else {
                        lVar = this.f26969c;
                    }
                } while (lVar != l.f26987c);
            }
            Object obj3 = this.f26968a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f26968a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return v(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String bVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String sb3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb3).concat(" (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb4.append(valueOf);
                sb4.append(convert);
                sb4.append(" ");
                sb4.append(lowerCase);
                String sb5 = sb4.toString();
                if (z10) {
                    sb5 = String.valueOf(sb5).concat(",");
                }
                concat = String.valueOf(sb5).concat(" ");
            }
            if (z10) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                sb6.append(valueOf2);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                concat = sb6.toString();
            }
            sb3 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(bVar).length());
        sb7.append(sb3);
        sb7.append(" for ");
        sb7.append(bVar);
        throw new TimeoutException(sb7.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f26968a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f26968a != null);
    }

    public final void m(StringBuilder sb2) {
        try {
            Object x10 = x(this);
            sb2.append("SUCCESS, result=[");
            p(sb2, x10);
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

    public final void n(StringBuilder sb2) {
        String sb3;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f26968a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            q(sb2, ((g) obj).b);
            sb2.append("]");
        } else {
            try {
                sb3 = he.r.a(A());
            } catch (RuntimeException | StackOverflowError e10) {
                String valueOf = String.valueOf(e10.getClass());
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                sb4.append("Exception thrown from implementation: ");
                sb4.append(valueOf);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                sb2.append(", info=[");
                sb2.append(sb3);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m(sb2);
        }
    }

    public void o() {
    }

    public final void p(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void q(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    public final e s(e eVar) {
        e eVar2 = eVar;
        e d10 = f26966f.d(this, e.f26974d);
        while (d10 != null) {
            e eVar3 = d10.f26976c;
            d10.f26976c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m(sb2);
        } else {
            n(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V v(Object obj) {
        if (obj instanceof c) {
            throw r("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f26973a);
        }
        return obj == f26967g ? (V) b0.b() : obj;
    }

    public void y() {
    }

    public final void z(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(G());
        }
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f26974d = new e();

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f26975a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public e f26976c;

        public e(Runnable runnable, Executor executor) {
            this.f26975a = runnable;
            this.b = executor;
        }

        public e() {
            this.f26975a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f26968a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f26969c;
            if (lVar != l.f26987c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f26966f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26968a;
                            } else {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f26969c;
                } while (lVar != l.f26987c);
            }
            Object obj3 = this.f26968a;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
