package kotlin;

import gt.o;
import java.util.Iterator;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.t;
import lu.v;
import lu.x;
import mt.b;
import mu.h;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rl.d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnu/j;", "T", "Lnu/e;", "", "Lmu/h;", "flows", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILlu/a;)V", "e", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lnu/e;", "Lju/p0;", "scope", "Llu/x;", "m", "(Lju/p0;)Llu/x;", "Llu/v;", "", d.f30696a, "(Llu/v;Lmt/b;)Ljava/lang/Object;", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j<T> extends e<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Iterable<h<T>> flows;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27415t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h<T> f27416u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ z<T> f27417v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T> hVar, z<T> zVar, b<? super a> bVar) {
            super(2, bVar);
            this.f27416u = hVar;
            this.f27417v = zVar;
        }

        @Override // ot.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new a(this.f27416u, this.f27417v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27415t;
            if (i10 == 0) {
                o.b(obj);
                h<T> hVar = this.f27416u;
                z<T> zVar = this.f27417v;
                this.f27415t = 1;
                if (hVar.collect(zVar, this) == e10) {
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
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ j(Iterable iterable, CoroutineContext coroutineContext, int i10, lu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? e.f22936a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? lu.a.f23848a : aVar);
    }

    @Override // kotlin.e
    @Nullable
    public Object d(@NotNull v<? super T> vVar, @NotNull b<? super Unit> bVar) {
        z zVar = new z(vVar);
        Iterator<h<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            k.d(vVar, null, null, new a(it.next(), zVar, null), 3, null);
        }
        return Unit.f22894a;
    }

    @Override // kotlin.e
    @NotNull
    public e<T> e(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        return new j(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.e
    @NotNull
    public x<T> m(@NotNull p0 scope) {
        return t.b(scope, this.context, this.capacity, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Iterable<? extends h<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        super(coroutineContext, i10, aVar);
        this.flows = iterable;
    }
}
