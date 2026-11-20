package xm;

import gt.o;
import java.util.concurrent.CancellationException;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.WorkflowOutput;
import wm.q;
import wm.t;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lxm/m;", "PropsT", "OutputT", "RenderingT", "", "Lju/p0;", "scope", "Lwm/q;", "protoWorkflow", "Lmu/p0;", "props", "Lwm/m;", "snapshot", "Lwm/t;", "interceptor", "<init>", "(Lju/p0;Lwm/q;Lmu/p0;Lwm/m;Lwm/t;)V", "Lwm/g;", "g", "()Lwm/g;", "Lwm/v;", "f", "(Lmt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "e", "(Ljava/util/concurrent/CancellationException;)V", "Lwm/k;", ve.a.f33391e, "Lwm/k;", "workflow", "Lxm/d;", j6.b.f21518e, "Lxm/d;", "idCounter", "c", "Ljava/lang/Object;", "currentProps", "Llu/x;", rl.d.f30696a, "Llu/x;", "getPropsChannel$annotations", "()V", "propsChannel", "Lxm/j;", "Lxm/j;", "rootNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m<PropsT, OutputT, RenderingT> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wm.k<PropsT, ?, OutputT, RenderingT> workflow;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d idCounter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public PropsT currentProps;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x<PropsT> propsChannel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j<PropsT, ? extends Object, OutputT, RenderingT> rootNode;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Llu/k;", "channelResult", "Lwm/v;", "<anonymous>", "(Llu/k;)Lwm/v;"}, k = 3, mv = {1, 6, 0})
    @ot.f(c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<lu.k<? extends PropsT>, mt.b<? super WorkflowOutput<? extends OutputT>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35672t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35673u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ m<PropsT, OutputT, RenderingT> f35674v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<PropsT, OutputT, RenderingT> mVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f35674v = mVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            a aVar = new a(this.f35674v, bVar);
            aVar.f35673u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((lu.k) obj).getHolder(), (mt.b) obj2);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            nt.c.e();
            if (this.f35672t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Object holder = ((lu.k) this.f35673u).getHolder();
            Throwable e10 = lu.k.e(holder);
            if (e10 != null) {
                throw e10;
            }
            Object f10 = lu.k.f(holder);
            if (f10 == null) {
                return null;
            }
            m<PropsT, OutputT, RenderingT> mVar = this.f35674v;
            if (Intrinsics.c(mVar.currentProps, f10)) {
                return null;
            }
            mVar.currentProps = f10;
            return null;
        }

        @Nullable
        public final Object o(@NotNull Object obj, @Nullable mt.b<? super WorkflowOutput<? extends OutputT>> bVar) {
            return ((a) create(lu.k.b(obj), bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @ot.f(c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", f = "WorkflowRunner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<PropsT, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35675t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35676u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ m<PropsT, OutputT, RenderingT> f35677v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m<PropsT, OutputT, RenderingT> mVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f35677v = mVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            b bVar2 = new b(this.f35677v, bVar);
            bVar2.f35676u = obj;
            return bVar2;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            nt.c.e();
            if (this.f35675t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ot.b.a(Intrinsics.c(this.f35676u, this.f35677v.currentProps));
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PropsT propst, @Nullable mt.b<? super Boolean> bVar) {
            return ((b) create(propst, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public m(@NotNull p0 scope, @NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, @NotNull mu.p0<? extends PropsT> props, @Nullable wm.m mVar, @NotNull t interceptor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(protoWorkflow, "protoWorkflow");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        wm.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> b10 = protoWorkflow.b();
        this.workflow = b10;
        d dVar = new d();
        this.idCounter = dVar;
        this.currentProps = props.getValue();
        this.propsChannel = mu.j.G(mu.j.o(props, new b(this, null)), scope);
        this.rootNode = new j<>(l.b(b10, null, 1, null), b10, this.currentProps, mVar, scope.getCoroutineContext(), null, null, interceptor, dVar, 96, null);
    }

    public final void e(@Nullable CancellationException cause) {
        this.rootNode.e(cause);
    }

    @Nullable
    public final Object f(@NotNull mt.b<? super WorkflowOutput<? extends OutputT>> bVar) {
        su.e eVar = new su.e(bVar);
        try {
            if (!this.propsChannel.i()) {
                eVar.a(this.propsChannel.z(), new a(this, null));
            }
            this.rootNode.p(eVar);
        } catch (Throwable th2) {
            eVar.C(th2);
        }
        Object B = eVar.B();
        if (B == nt.c.e()) {
            ot.h.c(bVar);
        }
        return B;
    }

    @NotNull
    public final wm.g<RenderingT> g() {
        return new wm.g<>(this.rootNode.m(this.workflow, this.currentProps), this.rootNode.o(this.workflow));
    }
}
