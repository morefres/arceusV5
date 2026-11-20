package wm;

import ju.CoroutineName;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"OutputT", "Lwm/o;", "worker", "", "renderKey", "Lwm/h;", "Lwm/r;", "", "actionSink", "", rl.d.f30696a, "(Lwm/o;Ljava/lang/String;Lwm/h;Lmt/b;)Ljava/lang/Object;", "T", "Lmu/h;", "c", "(Lwm/o;)Lmu/h;", "key", j6.b.f21518e, "(Lwm/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
    @ot.f(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", l = {78}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f34361t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ o<OutputT> f34362u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> f34363v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f34364w;

        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"OutputT", "output", "Lwm/r;", "Lwm/o;", "", ve.a.f33391e, "(Ljava/lang/Object;)Lwm/r;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: wm.a0$a$a, reason: collision with other inner class name */
        public static final class C0640a<OutputT> extends kotlin.jvm.internal.m implements Function1<OutputT, r<? super o<? extends OutputT>, Integer, ? extends OutputT>> {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ o<OutputT> f34365i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f34366j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0640a(o<? extends OutputT> oVar, String str) {
                super(1);
                this.f34365i = oVar;
                this.f34366j = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r<o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new b(this.f34365i, this.f34366j, outputt);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? extends OutputT> oVar, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f34362u = oVar;
            this.f34363v = hVar;
            this.f34364w = str;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new a(this.f34362u, this.f34363v, this.f34364w, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f34361t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h c10 = a0.c(this.f34362u);
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar = this.f34363v;
                C0640a c0640a = new C0640a(this.f34362u, this.f34364w);
                this.f34361t = 1;
                if (w.i(c10, hVar, c0640a, this) == e10) {
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
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final String b(o<?> oVar, String str) {
        String obj = oVar.toString();
        if (StringsKt.p0(str)) {
            return obj;
        }
        return obj + ':' + str;
    }

    public static final <T> mu.h<T> c(o<? extends T> oVar) {
        mu.h<? extends T> run = oVar.run();
        if (run != null) {
            return run;
        }
        throw new NullPointerException("Worker " + oVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    @Nullable
    public static final <OutputT> Object d(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, @NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(new CoroutineName(b(oVar, str)), new a(oVar, hVar, str, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}
