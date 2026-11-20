package kotlin;

import gt.o;
import ju.j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.v;
import mt.b;
import mu.h;
import mu.i;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rl.d;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnu/g;", "S", "T", "Lnu/e;", "Lmu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lmu/h;Lkotlin/coroutines/CoroutineContext;ILlu/a;)V", "Lmu/i;", "collector", "", "q", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "Llu/v;", "scope", d.f30696a, "(Llu/v;Lmt/b;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "p", "(Lmu/i;Lkotlin/coroutines/CoroutineContext;Lmt/b;)Ljava/lang/Object;", "Lmu/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class g<S, T> extends e<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<S> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/i;", "it", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    public static final class a extends m implements Function2<i<? super T>, b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27393t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27394u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g<S, T> f27395v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<S, T> gVar, b<? super a> bVar) {
            super(2, bVar);
            this.f27395v = gVar;
        }

        @Override // ot.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27395v, bVar);
            aVar.f27394u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27393t;
            if (i10 == 0) {
                o.b(obj);
                i<? super T> iVar = (i) this.f27394u;
                g<S, T> gVar = this.f27395v;
                this.f27393t = 1;
                if (gVar.q(iVar, this) == e10) {
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
        public final Object invoke(i<? super T> iVar, b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull h<? extends S> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        super(coroutineContext, i10, aVar);
        this.flow = hVar;
    }

    public static /* synthetic */ <S, T> Object n(g<S, T> gVar, i<? super T> iVar, b<? super Unit> bVar) {
        if (gVar.capacity == -3) {
            CoroutineContext context = bVar.getContext();
            CoroutineContext k10 = j0.k(context, gVar.context);
            if (Intrinsics.c(k10, context)) {
                Object q10 = gVar.q(iVar, bVar);
                return q10 == c.e() ? q10 : Unit.f22894a;
            }
            d.Companion companion = kotlin.coroutines.d.INSTANCE;
            if (Intrinsics.c(k10.get(companion), context.get(companion))) {
                Object p8 = gVar.p(iVar, k10, bVar);
                return p8 == c.e() ? p8 : Unit.f22894a;
            }
        }
        Object collect = super.collect(iVar, bVar);
        return collect == c.e() ? collect : Unit.f22894a;
    }

    public static /* synthetic */ <S, T> Object o(g<S, T> gVar, v<? super T> vVar, b<? super Unit> bVar) {
        Object q10 = gVar.q(new z(vVar), bVar);
        return q10 == c.e() ? q10 : Unit.f22894a;
    }

    @Override // kotlin.e, mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull b<? super Unit> bVar) {
        return n(this, iVar, bVar);
    }

    @Override // kotlin.e
    @Nullable
    public Object d(@NotNull v<? super T> vVar, @NotNull b<? super Unit> bVar) {
        return o(this, vVar, bVar);
    }

    public final Object p(i<? super T> iVar, CoroutineContext coroutineContext, b<? super Unit> bVar) {
        i e10;
        e10 = f.e(iVar, bVar.getContext());
        return f.d(coroutineContext, e10, null, new a(this, null), bVar, 4, null);
    }

    @Nullable
    public abstract Object q(@NotNull i<? super T> iVar, @NotNull b<? super Unit> bVar);

    @Override // kotlin.e
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
