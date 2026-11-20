package wm;

import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Lmu/h;", "Lwm/h;", "Lwm/r;", "actionSink", "Lkotlin/Function1;", "handler", "", ve.a.f33391e, "(Lmu/h;Lwm/h;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "action", j6.b.f21518e, "(Lwm/h;Lwm/r;Lmt/b;)Ljava/lang/Object;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
/* loaded from: classes3.dex */
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"wm/y$a", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a<T> implements mu.i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f34432a;
        public final /* synthetic */ Function1 b;

        public a(h hVar, Function1 function1) {
            this.f34432a = hVar;
            this.b = function1;
        }

        @Override // mu.i
        @Nullable
        public Object emit(T t8, @NotNull mt.b<? super Unit> bVar) {
            Object m10 = w.m(this.f34432a, (r) this.b.invoke(t8), bVar);
            return m10 == nt.c.e() ? m10 : Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0007\u001a\u00020\u0006*\u00180\u0005R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"wm/y$b", "Lwm/r;", "", "toString", "()Ljava/lang/String;", "Lwm/r$c;", "", ve.a.f33391e, "(Lwm/r$c;)V", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: wm.y$b, reason: from toString */
    public static final class sendAndAwaitApplication<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<PropsT, StateT, OutputT> f34433c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ju.n<Unit> f34434d;

        /* JADX WARN: Multi-variable type inference failed */
        public sendAndAwaitApplication(r<? super PropsT, StateT, ? extends OutputT> rVar, ju.n<? super Unit> nVar) {
            this.f34433c = rVar;
            this.f34434d = nVar;
        }

        @Override // wm.r
        public void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (this.f34434d.b()) {
                this.f34433c.a(cVar);
                ju.n<Unit> nVar = this.f34434d;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(Unit.f22894a));
            }
        }

        @NotNull
        public String toString() {
            return "sendAndAwaitApplication(" + this.f34433c + ')';
        }
    }

    @Nullable
    public static final <T, PropsT, StateT, OutputT> Object a(@NotNull mu.h<? extends T> hVar, @NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar2, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull mt.b<? super Unit> bVar) {
        Object collect = hVar.collect(new a(hVar2, function1), bVar);
        return collect == nt.c.e() ? collect : Unit.f22894a;
    }

    @Nullable
    public static final <PropsT, StateT, OutputT> Object b(@NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, @NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @NotNull mt.b<? super Unit> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        hVar.a(new sendAndAwaitApplication(rVar, pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }
}
