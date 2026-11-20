package kotlin;

import gt.o;
import java.util.ArrayList;
import ju.p0;
import ju.q0;
import ju.r0;
import ju.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.t;
import lu.v;
import lu.x;
import mu.h;
import mu.i;
import mu.j;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rl.d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lnu/e;", "T", "Lnu/q;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)V", "Lmu/h;", "f", "()Lmu/h;", "h", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lmu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lnu/e;", "Llu/v;", "scope", "", d.f30696a, "(Llu/v;Lmt/b;)Ljava/lang/Object;", "Lju/p0;", "Llu/x;", "m", "(Lju/p0;)Llu/x;", "Lmu/i;", "collector", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "", j6.b.f21518e, "()Ljava/lang/String;", "toString", ve.a.f33391e, "Lkotlin/coroutines/CoroutineContext;", "I", "c", "Llu/a;", "Lkotlin/Function2;", "Lmt/b;", "", "k", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "l", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class e<T> implements q<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* renamed from: b, reason: from kotlin metadata */
    public final int capacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.a onBufferOverflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27385t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27386u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T> f27387v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ e<T> f27388w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar, e<T> eVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f27387v = iVar;
            this.f27388w = eVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f27387v, this.f27388w, bVar);
            aVar.f27386u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27385t;
            if (i10 == 0) {
                o.b(obj);
                p0 p0Var = (p0) this.f27386u;
                i<T> iVar = this.f27387v;
                x<T> m10 = this.f27388w.m(p0Var);
                this.f27385t = 1;
                if (j.p(iVar, m10, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Llu/v;", "it", "", "<anonymous>", "(Llu/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    public static final class b extends m implements Function2<v<? super T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27389t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27390u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e<T> f27391v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f27391v = eVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f27391v, bVar);
            bVar2.f27390u = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27389t;
            if (i10 == 0) {
                o.b(obj);
                v<? super T> vVar = (v) this.f27390u;
                e<T> eVar = this.f27391v;
                this.f27389t = 1;
                if (eVar.d(vVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super T> vVar, mt.b<? super Unit> bVar) {
            return ((b) create(vVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public e(@NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = aVar;
    }

    public static /* synthetic */ <T> Object c(e<T> eVar, i<? super T> iVar, mt.b<? super Unit> bVar) {
        Object g10 = q0.g(new a(iVar, eVar, null), bVar);
        return g10 == c.e() ? g10 : Unit.f22894a;
    }

    @Nullable
    public String b() {
        return null;
    }

    @Override // mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull mt.b<? super Unit> bVar) {
        return c(this, iVar, bVar);
    }

    @Nullable
    public abstract Object d(@NotNull v<? super T> vVar, @NotNull mt.b<? super Unit> bVar);

    @NotNull
    public abstract e<T> e(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow);

    @Nullable
    public h<T> f() {
        return null;
    }

    @Override // kotlin.q
    @NotNull
    public h<T> h(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        CoroutineContext plus = context.plus(this.context);
        if (onBufferOverflow == lu.a.f23848a) {
            int i10 = this.capacity;
            if (i10 != -3) {
                if (capacity != -3) {
                    if (i10 != -2) {
                        if (capacity != -2) {
                            capacity += i10;
                            if (capacity < 0) {
                                capacity = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                capacity = i10;
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (Intrinsics.c(plus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : e(plus, capacity, onBufferOverflow);
    }

    @NotNull
    public final Function2<v<? super T>, mt.b<? super Unit>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    public x<T> m(@NotNull p0 scope) {
        return t.e(scope, this.context, l(), this.onBufferOverflow, r0.f22144c, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b10 = b();
        if (b10 != null) {
            arrayList.add(b10);
        }
        if (this.context != kotlin.coroutines.e.f22936a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != lu.a.f23848a) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return t0.a(this) + '[' + CollectionsKt.m0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
