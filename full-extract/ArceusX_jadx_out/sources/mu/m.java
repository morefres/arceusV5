package mu;

import androidx.core.view.MotionEventCompat;
import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmu/h;", "", ve.a.f33391e, "(Lmu/h;Lmt/b;)Ljava/lang/Object;", "T", "Lju/p0;", "scope", "Lju/d2;", rl.d.f30696a, "(Lmu/h;Lju/p0;)Lju/d2;", "Lkotlin/Function2;", "Lmt/b;", "", "action", j6.b.f21518e, "(Lmu/h;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "Lmu/i;", "flow", "c", "(Lmu/i;Lmu/h;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {MotionEventCompat.AXIS_GENERIC_15}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f25095t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h<T> f25096u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T> hVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f25096u = hVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f25096u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f25095t;
            if (i10 == 0) {
                gt.o.b(obj);
                h<T> hVar = this.f25096u;
                this.f25095t = 1;
                if (j.i(hVar, this) == e10) {
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
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final Object a(@NotNull h<?> hVar, @NotNull mt.b<? super Unit> bVar) {
        Object collect = hVar.collect(kotlin.s.f27441a, bVar);
        return collect == nt.c.e() ? collect : Unit.f22894a;
    }

    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super mt.b<? super Unit>, ? extends Object> function2, @NotNull mt.b<? super Unit> bVar) {
        Object i10 = j.i(o.b(j.A(hVar, function2), 0, null, 2, null), bVar);
        return i10 == nt.c.e() ? i10 : Unit.f22894a;
    }

    @Nullable
    public static final <T> Object c(@NotNull i<? super T> iVar, @NotNull h<? extends T> hVar, @NotNull mt.b<? super Unit> bVar) {
        j.r(iVar);
        Object collect = hVar.collect(iVar, bVar);
        return collect == nt.c.e() ? collect : Unit.f22894a;
    }

    @NotNull
    public static final <T> d2 d(@NotNull h<? extends T> hVar, @NotNull ju.p0 p0Var) {
        d2 d10;
        d10 = ju.k.d(p0Var, null, null, new a(hVar, null), 3, null);
        return d10;
    }
}
