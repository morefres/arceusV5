package ju;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", j6.b.f21518e, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;", "coroutineContext", rl.d.f30696a, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends ot.m implements Function2<p0, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22048t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22049u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<T> f22050v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends T> function0, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f22050v = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f22050v, bVar);
            aVar.f22049u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f22048t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return a2.d(((p0) this.f22049u).getCoroutineContext(), this.f22050v);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull mt.b<? super T> bVar) {
        return i.g(coroutineContext, new a(function0, null), bVar);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, mt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        return b(coroutineContext, function0, bVar);
    }

    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) {
        try {
            d3 d3Var = new d3();
            d3Var.C(g2.h(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                d3Var.z();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
