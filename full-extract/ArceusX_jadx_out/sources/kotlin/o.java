package kotlin;

import androidx.core.view.MotionEventCompat;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mu.h;
import mu.i;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import yt.n;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lmu/i;", "", "Lmu/h;", j6.b.f21518e, "(Lyt/n;)Lmu/h;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/o$a", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements h<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f27435a;

        public a(n nVar) {
            this.f27435a = nVar;
        }

        @Override // mu.h
        public Object collect(i<? super R> iVar, mt.b<? super Unit> bVar) {
            Object a10 = o.a(new b(this.f27435a, iVar, null), bVar);
            return a10 == c.e() ? a10 : Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {MotionEventCompat.AXIS_GENERIC_16}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27436t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27437u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n<p0, i<? super R>, mt.b<? super Unit>, Object> f27438v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i<R> f27439w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(n<? super p0, ? super i<? super R>, ? super mt.b<? super Unit>, ? extends Object> nVar, i<? super R> iVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f27438v = nVar;
            this.f27439w = iVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f27438v, this.f27439w, bVar);
            bVar2.f27437u = obj;
            return bVar2;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27436t;
            if (i10 == 0) {
                gt.o.b(obj);
                p0 p0Var = (p0) this.f27437u;
                n<p0, i<? super R>, mt.b<? super Unit>, Object> nVar = this.f27438v;
                Object obj2 = this.f27439w;
                this.f27436t = 1;
                if (nVar.invoke(p0Var, obj2, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull Function2<? super p0, ? super mt.b<? super R>, ? extends Object> function2, @NotNull mt.b<? super R> bVar) {
        n nVar = new n(bVar.getContext(), bVar);
        Object d10 = qu.b.d(nVar, nVar, function2);
        if (d10 == c.e()) {
            ot.h.c(bVar);
        }
        return d10;
    }

    @NotNull
    public static final <R> h<R> b(@NotNull n<? super p0, ? super i<? super R>, ? super mt.b<? super Unit>, ? extends Object> nVar) {
        return new a(nVar);
    }
}
