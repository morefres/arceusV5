package ru;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lru/l;", "", "<init>", "()V", "Lru/h;", "task", j6.b.f21518e, "(Lru/h;)Lru/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lru/h;", "", "onlyBlocking", "o", "(Z)Lru/h;", "index", "q", "(IZ)Lru/h;", "Lkotlin/jvm/internal/c0;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/c0;)J", "Lru/d;", "queue", "n", "(Lru/d;)Z", "m", "()Lru/h;", "", "c", "(Lru/h;)V", "k", "fair", ve.a.f33391e, "(Lru/h;Z)Lru/h;", "r", "l", "globalQueue", "j", "(Lru/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30801c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30802d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30803e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    public final h a(@NotNull h task, boolean fair) {
        if (fair) {
            return b(task);
        }
        h hVar = (h) b.getAndSet(this, task);
        if (hVar == null) {
            return null;
        }
        return b(hVar);
    }

    public final h b(h task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f30803e.incrementAndGet(this);
        }
        int i10 = f30801c.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f30801c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || !hVar.taskContext) {
            return;
        }
        f30803e.decrementAndGet(this);
    }

    public final int e() {
        return f30801c.get(this) - f30802d.get(this);
    }

    public final int i() {
        return b.get(this) != null ? e() + 1 : e();
    }

    public final void j(@NotNull d globalQueue) {
        h hVar = (h) b.getAndSet(this, null);
        if (hVar != null) {
            globalQueue.a(hVar);
        }
        while (n(globalQueue)) {
        }
    }

    @Nullable
    public final h k() {
        h hVar = (h) b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    @Nullable
    public final h l() {
        return o(true);
    }

    public final h m() {
        h andSet;
        while (true) {
            int i10 = f30802d.get(this);
            if (i10 - f30801c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f30802d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    public final boolean n(d queue) {
        h m10 = m();
        if (m10 == null) {
            return false;
        }
        queue.a(m10);
        return true;
    }

    public final h o(boolean onlyBlocking) {
        h hVar;
        do {
            hVar = (h) b.get(this);
            if (hVar == null || hVar.taskContext != onlyBlocking) {
                int i10 = f30802d.get(this);
                int i11 = f30801c.get(this);
                while (i10 != i11) {
                    if (onlyBlocking && f30803e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h q10 = q(i11, onlyBlocking);
                    if (q10 != null) {
                        return q10;
                    }
                }
                return null;
            }
        } while (!y1.b.a(b, this, hVar, null));
        return hVar;
    }

    public final h p(int stealingMode) {
        int i10 = f30802d.get(this);
        int i11 = f30801c.get(this);
        boolean z10 = stealingMode == 1;
        while (i10 != i11) {
            if (z10 && f30803e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            h q10 = q(i10, z10);
            if (q10 != null) {
                return q10;
            }
            i10 = i12;
        }
        return null;
    }

    public final h q(int index, boolean onlyBlocking) {
        int i10 = index & 127;
        h hVar = this.buffer.get(i10);
        if (hVar == null || hVar.taskContext != onlyBlocking || !lu.l.a(this.buffer, i10, hVar, null)) {
            return null;
        }
        if (onlyBlocking) {
            f30803e.decrementAndGet(this);
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int stealingMode, @NotNull c0<h> stolenTaskRef) {
        T m10 = stealingMode == 3 ? m() : p(stealingMode);
        if (m10 == 0) {
            return s(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.f22963a = m10;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, ru.h] */
    public final long s(int stealingMode, c0<h> stolenTaskRef) {
        ?? r02;
        do {
            r02 = (h) b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long a10 = j.f30799f.a() - r02.submissionTime;
            long j10 = j.b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!y1.b.a(b, this, r02, null));
        stolenTaskRef.f22963a = r02;
        return -1L;
    }
}
