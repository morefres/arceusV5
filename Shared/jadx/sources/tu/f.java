package tu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import ju.l0;
import ju.p;
import ju.r;
import ju.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.b0;
import pu.e0;
import tu.f;
import yt.n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015RR\u0010\u001f\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00180\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¨\u0006%"}, d2 = {"Ltu/f;", "Ltu/j;", "Ltu/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "c", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "A", "(Ljava/lang/Object;)I", "D", "G", "Lkotlin/Function3;", "Lsu/l;", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lyt/n;", "onSelectCancellationUnlockConstructor", "B", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", ve.a.f33391e, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class f extends j implements tu.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32545i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<su.l<?>, Object, Object, n<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0096\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u0002*\u00020*2\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u001e\u00101\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0096\u0001¢\u0006\u0004\b1\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00106R\u0014\u00109\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Ltu/f$a;", "Lju/n;", "", "Lju/k3;", "Lju/p;", "cont", "", "owner", "<init>", "(Ltu/f;Lju/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "j", "(Lkotlin/Unit;Ljava/lang/Object;Lyt/n;)Ljava/lang/Object;", "g", "(Lkotlin/Unit;Lyt/n;)V", "exception", "n", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "L", "(Ljava/lang/Object;)V", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "k", "(Lkotlin/jvm/functions/Function1;)V", "Lpu/b0;", "segment", "", "index", "c", "(Lpu/b0;I)V", "Lju/l0;", "i", "(Lju/l0;Lkotlin/Unit;)V", "G", "(Lju/l0;Ljava/lang/Throwable;)V", "Lgt/n;", "result", "resumeWith", ve.a.f33391e, "Lju/p;", j6.b.f21518e, "Ljava/lang/Object;", "()Z", "isActive", rl.d.f30696a, "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements ju.n<Unit>, k3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final p<Unit> cont;

        /* renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull p<? super Unit> pVar, @Nullable Object obj) {
            this.cont = pVar;
            this.owner = obj;
        }

        public static final Unit h(f fVar, a aVar, Throwable th2) {
            fVar.f(aVar.owner);
            return Unit.f22894a;
        }

        public static final Unit l(f fVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            f.z().set(fVar, aVar.owner);
            fVar.f(aVar.owner);
            return Unit.f22894a;
        }

        @Override // ju.n
        public void G(@NotNull l0 l0Var, @NotNull Throwable th2) {
            this.cont.G(l0Var, th2);
        }

        @Override // ju.n
        public void L(@NotNull Object token) {
            this.cont.L(token);
        }

        @Override // ju.n
        public boolean b() {
            return this.cont.b();
        }

        @Override // ju.k3
        public void c(@NotNull b0<?> segment, int index) {
            this.cont.c(segment, index);
        }

        @Override // ju.n
        public boolean d() {
            return this.cont.d();
        }

        @Override // ju.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void J(@NotNull R value, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            f.z().set(f.this, this.owner);
            p<Unit> pVar = this.cont;
            final f fVar = f.this;
            pVar.S(value, new Function1() { // from class: tu.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit h10;
                    h10 = f.a.h(f.this, this, (Throwable) obj);
                    return h10;
                }
            });
        }

        @Override // mt.b
        @NotNull
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // ju.n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void t(@NotNull l0 l0Var, @NotNull Unit unit) {
            this.cont.t(l0Var, unit);
        }

        @Override // ju.n
        @Nullable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object f(@NotNull R value, @Nullable Object idempotent, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final f fVar = f.this;
            Object f10 = this.cont.f(value, idempotent, new n() { // from class: tu.d
                @Override // yt.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit l10;
                    l10 = f.a.l(f.this, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                    return l10;
                }
            });
            if (f10 != null) {
                f.z().set(f.this, this.owner);
            }
            return f10;
        }

        @Override // ju.n
        public void k(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.k(handler);
        }

        @Override // ju.n
        @Nullable
        public Object n(@NotNull Throwable exception) {
            return this.cont.n(exception);
        }

        @Override // ju.n
        public boolean p(@Nullable Throwable cause) {
            return this.cont.p(cause);
        }

        @Override // mt.b
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f32549a;
        this.onSelectCancellationUnlockConstructor = new n() { // from class: tu.b
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                n E;
                E = f.E(f.this, (su.l) obj, obj2, obj3);
                return E;
            }
        };
    }

    public static /* synthetic */ Object C(f fVar, Object obj, mt.b<? super Unit> bVar) {
        Object D;
        return (!fVar.e(obj) && (D = fVar.D(obj, bVar)) == nt.c.e()) ? D : Unit.f22894a;
    }

    public static final n E(final f fVar, su.l lVar, final Object obj, Object obj2) {
        return new n() { // from class: tu.c
            @Override // yt.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Unit F;
                F = f.F(f.this, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return F;
            }
        };
    }

    public static final Unit F(f fVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        fVar.f(obj);
        return Unit.f22894a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f32545i;
    }

    public final int A(Object owner) {
        e0 e0Var;
        while (B()) {
            Object obj = f32545i.get(this);
            e0Var = g.f32549a;
            if (obj != e0Var) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean B() {
        return b() == 0;
    }

    public final Object D(Object obj, mt.b<? super Unit> bVar) {
        p b = r.b(nt.b.c(bVar));
        try {
            i(new a(b, obj));
            Object z10 = b.z();
            if (z10 == nt.c.e()) {
                ot.h.c(bVar);
            }
            return z10 == nt.c.e() ? z10 : Unit.f22894a;
        } catch (Throwable th2) {
            b.Q();
            throw th2;
        }
    }

    public final int G(Object owner) {
        while (!t()) {
            if (owner == null) {
                return 1;
            }
            int A = A(owner);
            if (A == 1) {
                return 2;
            }
            if (A == 2) {
                return 1;
            }
        }
        f32545i.set(this, owner);
        return 0;
    }

    @Override // tu.a
    @Nullable
    public Object c(@Nullable Object obj, @NotNull mt.b<? super Unit> bVar) {
        return C(this, obj, bVar);
    }

    @Override // tu.a
    public boolean e(@Nullable Object owner) {
        int G = G(owner);
        if (G == 0) {
            return true;
        }
        if (G == 1) {
            return false;
        }
        if (G != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    @Override // tu.a
    public void f(@Nullable Object owner) {
        e0 e0Var;
        e0 e0Var2;
        while (B()) {
            Object obj = f32545i.get(this);
            e0Var = g.f32549a;
            if (obj != e0Var) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32545i;
                e0Var2 = g.f32549a;
                if (y1.b.a(atomicReferenceFieldUpdater, this, obj, e0Var2)) {
                    a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + t0.b(this) + "[isLocked=" + B() + ",owner=" + f32545i.get(this) + ']';
    }
}
