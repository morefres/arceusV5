package tu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import ju.p;
import ju.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.b0;
import pu.c0;
import pu.e0;
import yt.n;
import zl.t;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006."}, d2 = {"Ltu/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "j", "(Lmt/b;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lju/k3;", "waiter", "", "k", "(Lju/k3;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", t.f38095d, rl.d.f30696a, "Lju/n;", "i", "(Lju/n;)V", ve.a.f33391e, "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", j6.b.f21518e, "Lyt/n;", "onCancellationRelease", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Ltu/m;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32551c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32552d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32553e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32554f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32555g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int permits;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32557a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            m j11;
            j11 = l.j(j10, mVar);
            return j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return d(l10.longValue(), mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32558a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            m j11;
            j11 = l.j(j10, mVar);
            return j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return d(l10.longValue(), mVar);
        }
    }

    public j(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new n() { // from class: tu.i
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit s8;
                s8 = j.s(j.this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                return s8;
            }
        };
    }

    public static final Unit s(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.a();
        return Unit.f22894a;
    }

    public final void a() {
        do {
            int andIncrement = f32555g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                l();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final int b() {
        return Math.max(f32555g.get(this), 0);
    }

    @Nullable
    public final Object d(@NotNull mt.b<? super Unit> bVar) {
        Object j10;
        return (m() <= 0 && (j10 = j(bVar)) == nt.c.e()) ? j10 : Unit.f22894a;
    }

    public final void i(@NotNull ju.n<? super Unit> waiter) {
        while (m() <= 0) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((k3) waiter)) {
                return;
            }
        }
        waiter.J(Unit.f22894a, this.onCancellationRelease);
    }

    public final Object j(mt.b<? super Unit> bVar) {
        p b10 = r.b(nt.b.c(bVar));
        try {
            if (!k(b10)) {
                i(b10);
            }
            Object z10 = b10.z();
            if (z10 == nt.c.e()) {
                ot.h.c(bVar);
            }
            return z10 == nt.c.e() ? z10 : Unit.f22894a;
        } catch (Throwable th2) {
            b10.Q();
            throw th2;
        }
    }

    public final boolean k(k3 waiter) {
        int i10;
        Object c10;
        int i11;
        e0 e0Var;
        e0 e0Var2;
        m mVar = (m) f32553e.get(this);
        long andIncrement = f32554f.getAndIncrement(this);
        a aVar = a.f32557a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32553e;
        i10 = l.f32563f;
        long j10 = andIncrement / i10;
        loop0: while (true) {
            c10 = pu.b.c(mVar, j10, aVar);
            if (!c0.c(c10)) {
                b0 b10 = c0.b(c10);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b10.id) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b10)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) c0.b(c10);
        i11 = l.f32563f;
        int i12 = (int) (andIncrement % i11);
        if (lu.l.a(mVar2.getF32564e(), i12, null, waiter)) {
            waiter.c(mVar2, i12);
            return true;
        }
        e0Var = l.b;
        e0Var2 = l.f32560c;
        if (!lu.l.a(mVar2.getF32564e(), i12, e0Var, e0Var2)) {
            return false;
        }
        if (waiter instanceof ju.n) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((ju.n) waiter).J(Unit.f22894a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof su.l)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((su.l) waiter).e(Unit.f22894a);
        }
        return true;
    }

    public final void l() {
        int i10;
        do {
            i10 = f32555g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f32555g.compareAndSet(this, i10, this.permits));
    }

    public final int m() {
        int andDecrement;
        do {
            andDecrement = f32555g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public final boolean t() {
        while (true) {
            int i10 = f32555g.get(this);
            if (i10 > this.permits) {
                l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f32555g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof ju.n)) {
            if (obj instanceof su.l) {
                return ((su.l) obj).f(this, Unit.f22894a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        ju.n nVar = (ju.n) obj;
        Object f10 = nVar.f(Unit.f22894a, null, this.onCancellationRelease);
        if (f10 == null) {
            return false;
        }
        nVar.L(f10);
        return true;
    }

    public final boolean v() {
        int i10;
        Object c10;
        int i11;
        e0 e0Var;
        e0 e0Var2;
        int i12;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        m mVar = (m) f32551c.get(this);
        long andIncrement = f32552d.getAndIncrement(this);
        i10 = l.f32563f;
        long j10 = andIncrement / i10;
        b bVar = b.f32558a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32551c;
        loop0: while (true) {
            c10 = pu.b.c(mVar, j10, bVar);
            if (c0.c(c10)) {
                break;
            }
            b0 b10 = c0.b(c10);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.id >= b10.id) {
                    break loop0;
                }
                if (!b10.u()) {
                    break;
                }
                if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b10)) {
                    if (b0Var.p()) {
                        b0Var.n();
                    }
                } else if (b10.p()) {
                    b10.n();
                }
            }
        }
        m mVar2 = (m) c0.b(c10);
        mVar2.b();
        if (mVar2.id > j10) {
            return false;
        }
        i11 = l.f32563f;
        int i13 = (int) (andIncrement % i11);
        e0Var = l.b;
        Object andSet = mVar2.getF32564e().getAndSet(i13, e0Var);
        if (andSet != null) {
            e0Var2 = l.f32562e;
            if (andSet == e0Var2) {
                return false;
            }
            return u(andSet);
        }
        i12 = l.f32559a;
        for (int i14 = 0; i14 < i12; i14++) {
            Object obj = mVar2.getF32564e().get(i13);
            e0Var5 = l.f32560c;
            if (obj == e0Var5) {
                return true;
            }
        }
        e0Var3 = l.b;
        e0Var4 = l.f32561d;
        return !lu.l.a(mVar2.getF32564e(), i13, e0Var3, e0Var4);
    }
}
