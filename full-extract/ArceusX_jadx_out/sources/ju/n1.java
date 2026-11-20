package ju;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@AB0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<098\u0002X\u0082\u0004R\u000b\u0010?\u001a\u00020>8\u0002X\u0082\u0004¨\u0006C"}, d2 = {"Lju/n1;", "Lju/o1;", "Lju/y0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "J0", "(Ljava/lang/Runnable;)Z", "D0", "()Ljava/lang/Runnable;", "", "H0", "C0", "Lju/n1$c;", "W0", "(Lju/n1$c;)Z", "", "now", "delayedTask", "", "T0", "(JLju/n1$c;)I", "P0", "shutdown", "timeMillis", "Lju/n;", "continuation", "f", "(JLju/n;)V", "block", "Lju/i1;", "U0", "(JLjava/lang/Runnable;)Lju/i1;", "o0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "y", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F0", "(Ljava/lang/Runnable;)V", "R0", "(JLju/n1$c;)V", "Q0", "value", rl.d.f30696a, "()Z", "V0", "(Z)V", "isCompleted", "O0", "isEmpty", "a0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lju/n1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "c", ve.a.f33391e, j6.b.f21518e, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class n1 extends o1 implements y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22125f = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22126g = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22127h = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lju/n1$a;", "Lju/n1$c;", "", "nanoTime", "Lju/n;", "", "cont", "<init>", "(Lju/n1;JLju/n;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Lju/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final n<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, @NotNull n<? super Unit> nVar) {
            super(j10);
            this.cont = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.t(n1.this, Unit.f22894a);
        }

        @Override // ju.n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lju/n1$b;", "Lju/n1$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Runnable block;

        public b(long j10, @NotNull Runnable runnable) {
            super(j10);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // ju.n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lju/n1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lju/i1;", "Lpu/q0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "e", "(Lju/n1$c;)I", "now", "", "j", "(J)Z", "Lju/n1$d;", "delayed", "Lju/n1;", "eventLoop", "h", "(JLju/n1$d;Lju/n1;)I", "", ve.a.f33391e, "()V", "", "toString", "()Ljava/lang/String;", "J", "_heap", "Ljava/lang/Object;", j6.b.f21518e, "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lpu/p0;", "value", "()Lpu/p0;", rl.d.f30696a, "(Lpu/p0;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements Runnable, Comparable<c>, i1, pu.q0 {

        @Nullable
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public long nanoTime;

        /* renamed from: b, reason: from kotlin metadata */
        public int index = -1;

        public c(long j10) {
            this.nanoTime = j10;
        }

        @Override // ju.i1
        public final void a() {
            pu.e0 e0Var;
            pu.e0 e0Var2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    e0Var = q1.f22141a;
                    if (obj == e0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    e0Var2 = q1.f22141a;
                    this._heap = e0Var2;
                    Unit unit = Unit.f22894a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // pu.q0
        @Nullable
        public pu.p0<?> b() {
            Object obj = this._heap;
            if (obj instanceof pu.p0) {
                return (pu.p0) obj;
            }
            return null;
        }

        @Override // pu.q0
        public void d(@Nullable pu.p0<?> p0Var) {
            pu.e0 e0Var;
            Object obj = this._heap;
            e0Var = q1.f22141a;
            if (obj == e0Var) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = p0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // pu.q0
        public int getIndex() {
            return this.index;
        }

        public final int h(long now, @NotNull d delayed, @NotNull n1 eventLoop) {
            pu.e0 e0Var;
            synchronized (this) {
                Object obj = this._heap;
                e0Var = q1.f22141a;
                if (obj == e0Var) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c b = delayed.b();
                        if (eventLoop.d()) {
                            return 1;
                        }
                        if (b == null) {
                            delayed.timeNow = now;
                        } else {
                            long j10 = b.nanoTime;
                            if (j10 - now < 0) {
                                now = j10;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j11 = this.nanoTime;
                        long j12 = delayed.timeNow;
                        if (j11 - j12 < 0) {
                            this.nanoTime = j12;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean j(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // pu.q0
        public void setIndex(int i10) {
            this.index = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lju/n1$d;", "Lpu/p0;", "Lju/n1$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends pu.p0<c> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return f22127h.get(this) == 1;
    }

    public final void C0() {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22125f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22125f;
                e0Var = q1.b;
                if (y1.b.a(atomicReferenceFieldUpdater2, this, null, e0Var)) {
                    return;
                }
            } else {
                if (obj instanceof pu.r) {
                    ((pu.r) obj).d();
                    return;
                }
                e0Var2 = q1.b;
                if (obj == e0Var2) {
                    return;
                }
                pu.r rVar = new pu.r(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (y1.b.a(f22125f, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable D0() {
        pu.e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22125f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof pu.r) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                pu.r rVar = (pu.r) obj;
                Object m10 = rVar.m();
                if (m10 != pu.r.f29205h) {
                    return (Runnable) m10;
                }
                y1.b.a(f22125f, this, obj, rVar.l());
            } else {
                e0Var = q1.b;
                if (obj == e0Var) {
                    return null;
                }
                if (y1.b.a(f22125f, this, obj, null)) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void F0(@NotNull Runnable task) {
        H0();
        if (J0(task)) {
            x0();
        } else {
            u0.f22153i.F0(task);
        }
    }

    public final void H0() {
        c cVar;
        d dVar = (d) f22126g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        ju.c.a();
        long nanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c b10 = dVar.b();
                    if (b10 != null) {
                        c cVar2 = b10;
                        cVar = cVar2.j(nanoTime) ? J0(cVar2) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVar != null);
    }

    public final boolean J0(Runnable task) {
        pu.e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22125f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (y1.b.a(f22125f, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof pu.r) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                pu.r rVar = (pu.r) obj;
                int a10 = rVar.a(task);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    y1.b.a(f22125f, this, obj, rVar.l());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                e0Var = q1.b;
                if (obj == e0Var) {
                    return false;
                }
                pu.r rVar2 = new pu.r(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(task);
                if (y1.b.a(f22125f, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean O0() {
        pu.e0 e0Var;
        if (!j0()) {
            return false;
        }
        d dVar = (d) f22126g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f22125f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof pu.r) {
            return ((pu.r) obj).j();
        }
        e0Var = q1.b;
        return obj == e0Var;
    }

    public final void P0() {
        c j10;
        ju.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f22126g.get(this);
            if (dVar == null || (j10 = dVar.j()) == null) {
                return;
            } else {
                w0(nanoTime, j10);
            }
        }
    }

    public final void Q0() {
        f22125f.set(this, null);
        f22126g.set(this, null);
    }

    public final void R0(long now, @NotNull c delayedTask) {
        int T0 = T0(now, delayedTask);
        if (T0 == 0) {
            if (W0(delayedTask)) {
                x0();
            }
        } else if (T0 == 1) {
            w0(now, delayedTask);
        } else if (T0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int T0(long now, c delayedTask) {
        if (d()) {
            return 1;
        }
        d dVar = (d) f22126g.get(this);
        if (dVar == null) {
            y1.b.a(f22126g, this, null, new d(now));
            Object obj = f22126g.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return delayedTask.h(now, dVar, this);
    }

    @NotNull
    public final i1 U0(long timeMillis, @NotNull Runnable block) {
        long c10 = q1.c(timeMillis);
        if (c10 >= 4611686018427387903L) {
            return q2.f22142a;
        }
        ju.c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c10 + nanoTime, block);
        R0(nanoTime, bVar);
        return bVar;
    }

    public final void V0(boolean z10) {
        f22127h.set(this, z10 ? 1 : 0);
    }

    public final boolean W0(c task) {
        d dVar = (d) f22126g.get(this);
        return (dVar != null ? dVar.f() : null) == task;
    }

    @Override // ju.m1
    public long a0() {
        c f10;
        pu.e0 e0Var;
        if (super.a0() == 0) {
            return 0L;
        }
        Object obj = f22125f.get(this);
        if (obj != null) {
            if (!(obj instanceof pu.r)) {
                e0Var = q1.b;
                return obj == e0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((pu.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f22126g.get(this);
        if (dVar == null || (f10 = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = f10.nanoTime;
        ju.c.a();
        return kotlin.ranges.d.d(j10 - System.nanoTime(), 0L);
    }

    @Override // ju.y0
    public void f(long timeMillis, @NotNull n<? super Unit> continuation) {
        long c10 = q1.c(timeMillis);
        if (c10 < 4611686018427387903L) {
            ju.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, continuation);
            R0(nanoTime, aVar);
            r.a(continuation, aVar);
        }
    }

    @Override // ju.y0
    @NotNull
    public i1 h(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return y0.a.a(this, j10, runnable, coroutineContext);
    }

    @Override // ju.m1
    public long o0() {
        if (q0()) {
            return 0L;
        }
        H0();
        Runnable D0 = D0();
        if (D0 == null) {
            return a0();
        }
        D0.run();
        return 0L;
    }

    @Override // ju.m1
    public void shutdown() {
        c3.f22061a.c();
        V0(true);
        C0();
        while (o0() <= 0) {
        }
        P0();
    }

    @Override // ju.l0
    public final void y(@NotNull CoroutineContext context, @NotNull Runnable block) {
        F0(block);
    }
}
