package x5;

import androidx.core.view.MotionEventCompat;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y1.c;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lju/r0;", "start", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", "Lne/x;", "j", "(Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;)Lne/x;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {MotionEventCompat.AXIS_GENERIC_11}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35338t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35339u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<ju.p0, mt.b<? super T>, Object> f35340v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c.a<T> f35341w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super ju.p0, ? super mt.b<? super T>, ? extends Object> function2, c.a<T> aVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f35340v = function2;
            this.f35341w = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f35340v, this.f35341w, bVar);
            aVar.f35339u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35338t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    ju.p0 p0Var = (ju.p0) this.f35339u;
                    Function2<ju.p0, mt.b<? super T>, Object> function2 = this.f35340v;
                    this.f35338t = 1;
                    obj = function2.invoke(p0Var, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                this.f35341w.c(obj);
            } catch (CancellationException unused) {
                this.f35341w.d();
            } catch (Throwable th2) {
                this.f35341w.f(th2);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final <V> ne.x<V> f(@NotNull final Executor executor, @NotNull final String debugTag, @NotNull final Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        ne.x<V> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: x5.r
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                Object g10;
                g10 = u.g(executor, debugTag, block, aVar);
                return g10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture(...)");
        return a10;
    }

    public static final Object g(Executor executor, String str, final Function0 function0, final c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: x5.s
            @Override // java.lang.Runnable
            public final void run() {
                u.h(atomicBoolean);
            }
        }, h.f35278a);
        executor.execute(new Runnable() { // from class: x5.t
            @Override // java.lang.Runnable
            public final void run() {
                u.i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void i(AtomicBoolean atomicBoolean, c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    @NotNull
    public static final <T> ne.x<T> j(@NotNull final CoroutineContext context, @NotNull final ju.r0 start, @NotNull final Function2<? super ju.p0, ? super mt.b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        ne.x<T> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: x5.p
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                Object l10;
                l10 = u.l(CoroutineContext.this, start, block, aVar);
                return l10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture(...)");
        return a10;
    }

    public static /* synthetic */ ne.x k(CoroutineContext coroutineContext, ju.r0 r0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        if ((i10 & 2) != 0) {
            r0Var = ju.r0.f22143a;
        }
        return j(coroutineContext, r0Var, function2);
    }

    public static final Object l(CoroutineContext coroutineContext, ju.r0 r0Var, Function2 function2, c.a completer) {
        d2 d10;
        Intrinsics.checkNotNullParameter(completer, "completer");
        final d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        completer.a(new Runnable() { // from class: x5.q
            @Override // java.lang.Runnable
            public final void run() {
                u.m(d2.this);
            }
        }, h.f35278a);
        d10 = ju.k.d(ju.q0.a(coroutineContext), null, r0Var, new a(function2, completer, null), 1, null);
        return d10;
    }

    public static final void m(d2 d2Var) {
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }
}
