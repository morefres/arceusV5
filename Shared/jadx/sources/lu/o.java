package lu;

import androidx.core.view.MotionEventCompat;
import gt.n;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lu.k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "Llu/y;", "element", "Llu/k;", "", ve.a.f33391e, "(Llu/y;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Llu/k;", "", "<anonymous>", "(Lju/p0;)Llu/k;"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {MotionEventCompat.AXIS_GENERIC_8}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super k<? extends Unit>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f23909t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f23910u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y<E> f23911v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ E f23912w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(y<? super E> yVar, E e10, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f23911v = yVar;
            this.f23912w = e10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f23911v, this.f23912w, bVar);
            aVar.f23910u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super k<? extends Unit>> bVar) {
            return invoke2(p0Var, (mt.b<? super k<Unit>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object e10 = nt.c.e();
            int i10 = this.f23909t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    y<E> yVar = this.f23911v;
                    E e11 = this.f23912w;
                    n.Companion companion = gt.n.INSTANCE;
                    this.f23909t = 1;
                    if (yVar.E(e11, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                b = gt.n.b(Unit.f22894a);
            } catch (Throwable th2) {
                n.Companion companion2 = gt.n.INSTANCE;
                b = gt.n.b(gt.o.a(th2));
            }
            return k.b(gt.n.h(b) ? k.INSTANCE.c(Unit.f22894a) : k.INSTANCE.a(gt.n.e(b)));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super k<Unit>> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object a(@NotNull y<? super E> yVar, E e10) {
        Object b;
        Object v5 = yVar.v(e10);
        if (v5 instanceof k.c) {
            b = ju.j.b(null, new a(yVar, e10, null), 1, null);
            return ((k) b).getHolder();
        }
        return k.INSTANCE.c(Unit.f22894a);
    }
}
