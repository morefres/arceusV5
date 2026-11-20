package ru;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ju.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.e0;
import pu.z;
import zl.t;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003A\u000f B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010DR\u0014\u0010G\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010H\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001e\u0010K\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010JR\u0011\u0010L\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001fR\u000b\u0010N\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010O\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¨\u0006S"}, d2 = {"Lru/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lru/h;", "task", "", "c", "(Lru/h;)Z", "Lru/a$c;", "q", "()Lru/a$c;", "worker", "o", "(Lru/a$c;)I", "stateSnapshot", "", "x", "(J)V", "state", "F", "(J)Z", "I", "()Z", rl.d.f30696a, "()I", "fair", "B", "(Lru/a$c;Lru/h;Z)Lru/h;", "f", "oldIndex", "newIndex", "s", "(Lru/a$c;II)V", "r", "(Lru/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "w", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "g", "(Ljava/lang/Runnable;ZZ)V", "e", "(Ljava/lang/Runnable;Z)Lru/h;", "y", "toString", "()Ljava/lang/String;", "u", "(Lru/h;)V", ve.a.f33391e, j6.b.f21518e, "J", "Ljava/lang/String;", "Lru/d;", "Lru/d;", "globalCpuQueue", "globalBlockingQueue", "Lpu/z;", "Lpu/z;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "h", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f30759i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f30760j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30761k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final e0 f30762l = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* renamed from: b, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ru.d globalCpuQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ru.d globalBlockingQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30769a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f30779c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f30778a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f30780d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f30781e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f30769a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/a$d;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f30778a = new d("CPU_ACQUIRED", 0);
        public static final d b = new d("BLOCKING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f30779c = new d("PARKING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f30780d = new d("DORMANT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f30781e = new d("TERMINATED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f30782f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ pt.a f30783g;

        static {
            d[] a10 = a();
            f30782f = a10;
            f30783g = pt.b.a(a10);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{f30778a, b, f30779c, f30780d, f30781e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f30782f.clone();
        }
    }

    public a(int i10, int i11, long j10, @NotNull String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.globalCpuQueue = new ru.d();
            this.globalBlockingQueue = new ru.d();
            this.workers = new z<>((i10 + 1) * 2);
            this.controlState$volatile = i10 << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ boolean H(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f30760j.get(aVar);
        }
        return aVar.F(j10);
    }

    public static /* synthetic */ void h(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.g(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater j() {
        return f30760j;
    }

    public final h B(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.f30781e) {
            return hVar;
        }
        if (!hVar.taskContext && dVar == d.b) {
            return hVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(hVar, z10);
    }

    public final boolean F(long state) {
        if (kotlin.ranges.d.c(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int d10 = d();
            if (d10 == 1 && this.corePoolSize > 1) {
                d();
            }
            if (d10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        c q10;
        do {
            q10 = q();
            if (q10 == null) {
                return false;
            }
        } while (!c.f30770i.compareAndSet(q10, -1, 0));
        LockSupport.unpark(q10);
        return true;
    }

    public final boolean c(h task) {
        return task.taskContext ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w(10000L);
    }

    public final int d() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f30760j.get(this);
                int i10 = (int) (j10 & 2097151);
                int c10 = kotlin.ranges.d.c(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (c10 >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (j().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.workers.c(i11, cVar);
                if (i11 != ((int) (2097151 & f30760j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = c10 + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final h e(@NotNull Runnable block, boolean taskContext) {
        long a10 = j.f30799f.a();
        if (!(block instanceof h)) {
            return j.b(block, a10, taskContext);
        }
        h hVar = (h) block;
        hVar.submissionTime = a10;
        hVar.taskContext = taskContext;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        h(this, command, false, false, 6, null);
    }

    public final c f() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void g(@NotNull Runnable block, boolean taskContext, boolean fair) {
        ju.c.a();
        h e10 = e(block, taskContext);
        boolean z10 = e10.taskContext;
        long addAndGet = z10 ? f30760j.addAndGet(this, 2097152L) : 0L;
        h B = B(f(), e10, fair);
        if (B != null && !c(B)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z10) {
            x(addAndGet);
        } else {
            y();
        }
    }

    public final boolean isTerminated() {
        return f30761k.get(this) == 1;
    }

    public final int o(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f30762l) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    public final c q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30759i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.workers.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int o8 = o(b10);
            if (o8 >= 0 && f30759i.compareAndSet(this, j10, o8 | j11)) {
                b10.o(f30762l);
                return b10;
            }
        }
    }

    public final boolean r(@NotNull c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() != f30762l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30759i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            indexInArray = worker.getIndexInArray();
            worker.o(this.workers.b((int) (2097151 & j10)));
        } while (!f30759i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | indexInArray));
        return true;
    }

    public final void s(@NotNull c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30759i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i10 == oldIndex) {
                i10 = newIndex == 0 ? o(worker) : newIndex;
            }
            if (i10 >= 0) {
                if (f30759i.compareAndSet(this, j10, j11 | i10)) {
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.workers.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.workers.b(i15);
            if (b10 != null) {
                int i16 = b10.localQueue.i();
                int i17 = b.f30769a[b10.state.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new gt.l();
                    }
                    i14++;
                }
            }
        }
        long j10 = f30760j.get(this);
        return this.schedulerName + '@' + t0.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(@NotNull h task) {
        try {
            task.run();
        } catch (Throwable th2) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            } finally {
                ju.c.a();
            }
        }
    }

    public final void w(long timeout) {
        int i10;
        h e10;
        if (f30761k.compareAndSet(this, 0, 1)) {
            c f10 = f();
            synchronized (this.workers) {
                i10 = (int) (j().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.workers.b(i11);
                    Intrinsics.checkNotNull(b10);
                    c cVar = b10;
                    if (cVar != f10) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.j(this.globalBlockingQueue);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (f10 != null) {
                    e10 = f10.e(true);
                    if (e10 != null) {
                        continue;
                        u(e10);
                    }
                }
                e10 = this.globalCpuQueue.e();
                if (e10 == null && (e10 = this.globalBlockingQueue.e()) == null) {
                    break;
                }
                u(e10);
            }
            if (f10 != null) {
                f10.r(d.f30781e);
            }
            f30759i.set(this, 0L);
            f30760j.set(this, 0L);
        }
    }

    public final void x(long stateSnapshot) {
        if (I() || F(stateSnapshot)) {
            return;
        }
        I();
    }

    public final void y() {
        if (I() || H(this, 0L, 1, null)) {
            return;
        }
        I();
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0015J\u0011\u0010$\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010!J\u001d\u0010'\u001a\u0004\u0018\u00010\u00132\n\u0010&\u001a\u00060\u0004j\u0002`%H\u0002¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0016\u00107\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\b\u0010F\u001a\u00020E8\u0006¨\u0006G"}, d2 = {"Lru/a$c;", "Ljava/lang/Thread;", "<init>", "(Lru/a;)V", "", "index", "(Lru/a;I)V", "Lru/a$d;", "newState", "", "r", "(Lru/a$d;)Z", "", "run", "()V", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "Lru/h;", "e", "(Z)Lru/h;", "p", "()Z", "m", "q", "i", "task", j6.b.f21518e, "(Lru/h;)V", "k", t.f38095d, rl.d.f30696a, "()Lru/h;", "scanLocalQueue", "c", "l", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "s", "(I)Lru/h;", "indexInArray", "I", "f", "()I", "n", "(I)V", "Lru/l;", ve.a.f33391e, "Lru/l;", "localQueue", "Lkotlin/jvm/internal/c0;", "Lkotlin/jvm/internal/c0;", "stolenTask", "Lru/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f30770i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l localQueue;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c0<h> stolenTask;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public d state;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long terminationDeadline;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long minDelayUntilStealableTaskNs;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int rngState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.localQueue = new l();
            this.stolenTask = new c0<>();
            this.state = d.f30780d;
            this.nextParkedWorker = a.f30762l;
            int nanoTime = (int) System.nanoTime();
            this.rngState = nanoTime == 0 ? 42 : nanoTime;
        }

        public final void b(h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.f30779c) {
                this.state = d.b;
            }
            if (!task.taskContext) {
                a.this.u(task);
                return;
            }
            if (r(d.b)) {
                a.this.y();
            }
            a.this.u(task);
            a.j().addAndGet(a.this, -2097152L);
            if (this.state != d.f30781e) {
                this.state = d.f30780d;
            }
        }

        public final h c(boolean scanLocalQueue) {
            h l10;
            h l11;
            if (scanLocalQueue) {
                boolean z10 = j(a.this.corePoolSize * 2) == 0;
                if (z10 && (l11 = l()) != null) {
                    return l11;
                }
                h k10 = this.localQueue.k();
                if (k10 != null) {
                    return k10;
                }
                if (!z10 && (l10 = l()) != null) {
                    return l10;
                }
            } else {
                h l12 = l();
                if (l12 != null) {
                    return l12;
                }
            }
            return s(3);
        }

        public final h d() {
            h l10 = this.localQueue.l();
            if (l10 != null) {
                return l10;
            }
            h e10 = a.this.globalBlockingQueue.e();
            return e10 == null ? s(1) : e10;
        }

        @Nullable
        public final h e(boolean mayHaveLocalTasks) {
            return p() ? c(mayHaveLocalTasks) : d();
        }

        /* renamed from: f, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        /* renamed from: g, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != a.f30762l;
        }

        public final int j(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        public final void k() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                t();
            }
        }

        public final h l() {
            if (j(2) == 0) {
                h e10 = a.this.globalCpuQueue.e();
                return e10 != null ? e10 : a.this.globalBlockingQueue.e();
            }
            h e11 = a.this.globalBlockingQueue.e();
            return e11 != null ? e11 : a.this.globalCpuQueue.e();
        }

        public final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.state != d.f30781e) {
                    h e10 = e(this.mayHaveLocalTasks);
                    if (e10 != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        b(e10);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            q();
                        } else if (z10) {
                            r(d.f30779c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            r(d.f30781e);
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j10;
            if (this.state == d.f30778a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater j11 = a.j();
            do {
                j10 = j11.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.j().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.state = d.f30778a;
            return true;
        }

        public final void q() {
            if (!i()) {
                a.this.r(this);
                return;
            }
            f30770i.set(this, -1);
            while (i() && f30770i.get(this) == -1 && !a.this.isTerminated() && this.state != d.f30781e) {
                r(d.f30779c);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(@NotNull d newState) {
            d dVar = this.state;
            boolean z10 = dVar == d.f30778a;
            if (z10) {
                a.j().addAndGet(a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public final h s(int stealingMode) {
            int i10 = (int) (a.j().get(a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int j10 = j(i10);
            a aVar = a.this;
            long j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                j10++;
                if (j10 > i10) {
                    j10 = 1;
                }
                c b = aVar.workers.b(j10);
                if (b != null && b != this) {
                    long r8 = b.localQueue.r(stealingMode, this.stolenTask);
                    if (r8 == -1) {
                        c0<h> c0Var = this.stolenTask;
                        h hVar = c0Var.f22963a;
                        c0Var.f22963a = null;
                        return hVar;
                    }
                    if (r8 > 0) {
                        j11 = Math.min(j11, r8);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.minDelayUntilStealableTaskNs = j11;
            return null;
        }

        public final void t() {
            a aVar = a.this;
            synchronized (aVar.workers) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.j().get(aVar) & 2097151)) <= aVar.corePoolSize) {
                        return;
                    }
                    if (f30770i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.s(this, i10, 0);
                        int andDecrement = (int) (a.j().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            c b = aVar.workers.b(andDecrement);
                            Intrinsics.checkNotNull(b);
                            c cVar = b;
                            aVar.workers.c(i10, cVar);
                            cVar.n(i10);
                            aVar.s(cVar, andDecrement, i10);
                        }
                        aVar.workers.c(andDecrement, null);
                        Unit unit = Unit.f22894a;
                        this.state = d.f30781e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
