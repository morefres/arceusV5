package x4;

import gt.n;
import java.util.concurrent.RejectedExecutionException;
import ju.b3;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"R", "Lx4/u;", "Lkotlin/Function1;", "Lmt/b;", "", "block", "e", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lju/p0;", "transactionBlock", rl.d.f30696a, "(Lx4/u;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lx4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;", j6.b.f21518e, "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
/* loaded from: classes.dex */
public final /* synthetic */ class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<R> f35225a;
        public final /* synthetic */ u b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, mt.b<? super R>, Object> f35226c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
        /* renamed from: x4.x$a$a, reason: collision with other inner class name */
        public static final class C0650a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f35227t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f35228u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u f35229v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ ju.n<R> f35230w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, mt.b<? super R>, Object> f35231x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0650a(u uVar, ju.n<? super R> nVar, Function2<? super p0, ? super mt.b<? super R>, ? extends Object> function2, mt.b<? super C0650a> bVar) {
                super(2, bVar);
                this.f35229v = uVar;
                this.f35230w = nVar;
                this.f35231x = function2;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                C0650a c0650a = new C0650a(this.f35229v, this.f35230w, this.f35231x, bVar);
                c0650a.f35228u = obj;
                return c0650a;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                mt.b bVar;
                Object e10 = nt.c.e();
                int i10 = this.f35227t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    CoroutineContext.Element element = ((p0) this.f35228u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext c10 = x.c(this.f35229v, (kotlin.coroutines.d) element);
                    mt.b bVar2 = this.f35230w;
                    n.Companion companion = gt.n.INSTANCE;
                    Function2<p0, mt.b<? super R>, Object> function2 = this.f35231x;
                    this.f35228u = bVar2;
                    this.f35227t = 1;
                    obj = ju.i.g(c10, function2, this);
                    if (obj == e10) {
                        return e10;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (mt.b) this.f35228u;
                    gt.o.b(obj);
                }
                bVar.resumeWith(gt.n.b(obj));
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((C0650a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(ju.n<? super R> nVar, u uVar, Function2<? super p0, ? super mt.b<? super R>, ? extends Object> function2) {
            this.f35225a = nVar;
            this.b = uVar;
            this.f35226c = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ju.i.e(this.f35225a.getContext().minusKey(kotlin.coroutines.d.INSTANCE), new C0650a(this.b, this.f35225a, this.f35226c, null));
            } catch (Throwable th2) {
                this.f35225a.p(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2058}, m = "invokeSuspend")
    public static final class b<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35232t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35233u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<mt.b<? super R>, Object> f35234v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super mt.b<? super R>, ? extends Object> function1, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f35234v = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f35234v, bVar);
            bVar2.f35233u = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35232t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            if (((p0) this.f35233u).getCoroutineContext().get(c0.INSTANCE) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            Function1<mt.b<? super R>, Object> function1 = this.f35234v;
            this.f35232t = 1;
            Object invoke = function1.invoke(this);
            return invoke == e10 ? e10 : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final <R> Object b(@NotNull u uVar, @NotNull Function1<? super mt.b<? super R>, ? extends Object> function1, @NotNull mt.b<? super R> bVar) {
        if ((!uVar.F() || !uVar.M() || !uVar.G()) && bVar.getContext().get(y.f35235a) != null) {
            return v.e(uVar, function1, bVar);
        }
        return function1.invoke(bVar);
    }

    public static final CoroutineContext c(u uVar, kotlin.coroutines.d dVar) {
        CoroutineContext plus = dVar.plus(new c0(dVar));
        return plus.plus(b3.a(uVar.B(), plus));
    }

    public static final <R> Object d(u uVar, Function2<? super p0, ? super mt.b<? super R>, ? extends Object> function2, mt.b<? super R> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        try {
            uVar.D().execute(new a(pVar, uVar, function2));
        } catch (RejectedExecutionException e10) {
            pVar.p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, @NotNull Function1<? super mt.b<? super R>, ? extends Object> function1, @NotNull mt.b<? super R> bVar) {
        b bVar2 = new b(function1, null);
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        kotlin.coroutines.d transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? ju.i.g(transactionDispatcher, bVar2, bVar) : d(uVar, bVar2, bVar);
    }
}
