package wm;

import java.util.List;
import java.util.concurrent.CancellationException;
import ju.p0;
import ju.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/q;", "workflow", "Lju/p0;", "scope", "Lmu/p0;", "props", "Lwm/m;", "initialSnapshot", "", "Lwm/t;", "interceptors", "Lkotlin/Function2;", "Lmt/b;", "", "", "onOutput", "Lwm/g;", ve.a.f33391e, "(Lwm/q;Lju/p0;Lmu/p0;Lwm/m;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lmu/p0;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
    @ot.f(c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", f = "RenderWorkflow.kt", l = {136, 145}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f34384t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f34385u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ xm.m<PropsT, OutputT, RenderingT> f34386v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ mu.c0<g<RenderingT>> f34387w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<OutputT, mt.b<? super Unit>, Object> f34388x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xm.m<PropsT, OutputT, RenderingT> mVar, mu.c0<g<RenderingT>> c0Var, Function2<? super OutputT, ? super mt.b<? super Unit>, ? extends Object> function2, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f34386v = mVar;
            this.f34387w = c0Var;
            this.f34388x = function2;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            a aVar = new a(this.f34386v, this.f34387w, this.f34388x, bVar);
            aVar.f34385u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r4.invoke(r8, r7) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:6:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:6:0x005b). Please report as a decompilation issue!!! */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f34384t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.f34385u
                ju.p0 r1 = (ju.p0) r1
                gt.o.b(r8)
                goto L5b
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f34385u
                ju.p0 r1 = (ju.p0) r1
                gt.o.b(r8)
                goto L43
            L26:
                gt.o.b(r8)
                java.lang.Object r8 = r7.f34385u
                ju.p0 r8 = (ju.p0) r8
            L2d:
                boolean r1 = ju.q0.i(r8)
                if (r1 == 0) goto L6e
                xm.m<PropsT, OutputT, RenderingT> r1 = r7.f34386v
                r7.f34385u = r8
                r7.f34384t = r3
                java.lang.Object r1 = r1.f(r7)
                if (r1 != r0) goto L40
                goto L6d
            L40:
                r6 = r1
                r1 = r8
                r8 = r6
            L43:
                wm.v r8 = (wm.WorkflowOutput) r8
                boolean r4 = ju.q0.i(r1)
                if (r4 != 0) goto L4e
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            L4e:
                mu.c0<wm.g<RenderingT>> r4 = r7.f34387w
                xm.m<PropsT, OutputT, RenderingT> r5 = r7.f34386v
                wm.g r5 = r5.g()
                r4.setValue(r5)
                if (r8 != 0) goto L5d
            L5b:
                r8 = r1
                goto L2d
            L5d:
                kotlin.jvm.functions.Function2<OutputT, mt.b<? super kotlin.Unit>, java.lang.Object> r4 = r7.f34388x
                java.lang.Object r8 = r8.a()
                r7.f34385u = r1
                r7.f34384t = r2
                java.lang.Object r8 = r4.invoke(r8, r7)
                if (r8 != r0) goto L5b
            L6d:
                return r0
            L6e:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> mu.p0<g<RenderingT>> a(@NotNull q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull p0 scope, @NotNull mu.p0<? extends PropsT> props, @Nullable m mVar, @NotNull List<? extends t> interceptors, @NotNull Function2<? super OutputT, ? super mt.b<? super Unit>, ? extends Object> onOutput) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        xm.m mVar2 = new xm.m(scope, workflow, props, mVar, xm.c.a(interceptors));
        try {
            mu.c0 a10 = r0.a(mVar2.g());
            ju.k.d(scope, null, null, new a(mVar2, a10, onOutput, null), 3, null);
            return a10;
        } catch (Throwable th2) {
            CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
            if (cancellationException == null) {
                cancellationException = r1.a("Workflow runtime failed", th2);
            }
            mVar2.e(cancellationException);
            throw th2;
        }
    }
}
