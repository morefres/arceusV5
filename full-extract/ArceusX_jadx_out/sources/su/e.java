package su;

import androidx.core.view.MotionEventCompat;
import gt.n;
import ju.p;
import ju.p0;
import ju.q0;
import ju.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsu/e;", "R", "Lsu/k;", "Lmt/b;", "uCont", "<init>", "(Lmt/b;)V", "", "B", "()Ljava/lang/Object;", "", "e", "", "C", "(Ljava/lang/Throwable;)V", "Lju/p;", "g", "Lju/p;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e<R> extends k<R> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p<R> cont;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {MotionEventCompat.AXIS_GENERIC_8}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31686t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e<R> f31687u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<R> eVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f31687u = eVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f31687u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31686t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    e<R> eVar = this.f31687u;
                    this.f31686t = 1;
                    obj = eVar.o(this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                n.c(this.f31687u.cont, obj);
                return Unit.f22894a;
            } catch (Throwable th2) {
                n.d(this.f31687u.cont, th2);
                return Unit.f22894a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public e(@NotNull mt.b<? super R> bVar) {
        super(bVar.getContext());
        this.cont = new p<>(nt.b.c(bVar), 1);
    }

    @Nullable
    public final Object B() {
        if (this.cont.d()) {
            return this.cont.z();
        }
        ju.k.d(q0.a(getContext()), null, r0.f22145d, new a(this, null), 1, null);
        return this.cont.z();
    }

    public final void C(@NotNull Throwable e10) {
        p<R> pVar = this.cont;
        n.Companion companion = gt.n.INSTANCE;
        pVar.resumeWith(gt.n.b(gt.o.a(e10)));
    }
}
