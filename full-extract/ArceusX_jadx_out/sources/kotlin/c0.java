package kotlin;

import gt.o;
import j6.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import mu.i;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import pu.l0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnu/c0;", "T", "Lmu/i;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Lmu/i;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lkotlin/coroutines/CoroutineContext;", "", b.f21518e, "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lmt/b;", "c", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c0<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext emitContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, mt.b<? super Unit>, Object> emitRef;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends m implements Function2<T, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27380t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27381u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T> f27382v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f27382v = iVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f27382v, bVar);
            aVar.f27381u = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27380t;
            if (i10 == 0) {
                o.b(obj);
                Object obj2 = this.f27381u;
                i<T> iVar = this.f27382v;
                this.f27380t = 1;
                if (iVar.emit(obj2, this) == e10) {
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
        public final Object invoke(T t8, mt.b<? super Unit> bVar) {
            return ((a) create(t8, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public c0(@NotNull i<? super T> iVar, @NotNull CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = l0.g(coroutineContext);
        this.emitRef = new a(iVar, null);
    }

    @Override // mu.i
    @Nullable
    public Object emit(T t8, @NotNull mt.b<? super Unit> bVar) {
        Object c10 = f.c(this.emitContext, t8, this.countOrElement, this.emitRef, bVar);
        return c10 == c.e() ? c10 : Unit.f22894a;
    }
}
