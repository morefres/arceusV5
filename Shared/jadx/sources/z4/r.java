package z4;

import gt.n;
import ju.p0;
import ju.r0;
import ju.w1;
import ju.x;
import ju.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends ot.m implements Function2<p0, mt.b<? super T>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f37886t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37887u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, mt.b<? super T>, Object> f37888v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: z4.r$a$a, reason: collision with other inner class name */
        public static final class C0688a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f37889t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f37890u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ x<T> f37891v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, mt.b<? super T>, Object> f37892w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0688a(x<T> xVar, Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super C0688a> bVar) {
                super(2, bVar);
                this.f37891v = xVar;
                this.f37892w = function2;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                C0688a c0688a = new C0688a(this.f37891v, this.f37892w, bVar);
                c0688a.f37890u = obj;
                return c0688a;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                x<T> xVar;
                Object b;
                Object e10 = nt.c.e();
                int i10 = this.f37889t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    p0 p0Var = (p0) this.f37890u;
                    x<T> xVar2 = this.f37891v;
                    Function2<p0, mt.b<? super T>, Object> function2 = this.f37892w;
                    try {
                        n.Companion companion = gt.n.INSTANCE;
                        this.f37890u = xVar2;
                        this.f37889t = 1;
                        obj = function2.invoke(p0Var, this);
                        if (obj == e10) {
                            return e10;
                        }
                        xVar = xVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        xVar = xVar2;
                        n.Companion companion2 = gt.n.INSTANCE;
                        b = gt.n.b(gt.o.a(th));
                        z.d(xVar, b);
                        return Unit.f22894a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f37890u;
                    try {
                        gt.o.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        n.Companion companion22 = gt.n.INSTANCE;
                        b = gt.n.b(gt.o.a(th));
                        z.d(xVar, b);
                        return Unit.f22894a;
                    }
                }
                b = gt.n.b(obj);
                z.d(xVar, b);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((C0688a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<p0, mt.b<? super T>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f37893t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<T> f37894u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x<T> xVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f37894u = xVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f37894u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f37893t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                x<T> xVar = this.f37894u;
                this.f37893t = 1;
                Object w5 = xVar.w(this);
                return w5 == e10 ? e10 : w5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super T> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f37888v = function2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f37888v, bVar);
            aVar.f37887u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f37886t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            CoroutineContext.Element element = ((p0) this.f37887u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
            Intrinsics.checkNotNull(element);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) element;
            x c10 = z.c(null, 1, null);
            ju.i.c(w1.f22160a, dVar, r0.f22145d, new C0688a(c10, this.f37888v, null));
            while (!c10.d()) {
                try {
                    return ju.i.e(dVar, new b(c10, null));
                } catch (InterruptedException unused) {
                }
            }
            return c10.g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final <T> T a(@NotNull Function2<? super p0, ? super mt.b<? super T>, ? extends Object> block) {
        Object b;
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        b = ju.j.b(null, new a(block, null), 1, null);
        return (T) b;
    }
}
