package ym;

import android.view.l0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.squareup.workflow1.ui.PickledTreesnapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.m0;
import mu.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/q;", "workflow", "Lju/p0;", "scope", "Lmu/p0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "", "Lwm/t;", "interceptors", "Lkotlin/Function2;", "Lmt/b;", "", "", "onOutput", ve.a.f33391e, "(Lwm/q;Lju/p0;Lmu/p0;Landroidx/lifecycle/l0;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lmu/p0;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: ym.a$a, reason: collision with other inner class name */
    public static final class C0676a<RenderingT> implements mu.h<RenderingT> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f36743a;

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: ym.a$a$a, reason: collision with other inner class name */
        public static final class C0677a implements mu.i<wm.g<? extends RenderingT>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i f36744a;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @ot.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", l = {137}, m = "emit")
            /* renamed from: ym.a$a$a$a, reason: collision with other inner class name */
            public static final class C0678a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f36745t;

                /* renamed from: u, reason: collision with root package name */
                public int f36746u;

                public C0678a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f36745t = obj;
                    this.f36746u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C0677a.this.emit(null, this);
                }
            }

            public C0677a(mu.i iVar) {
                this.f36744a = iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull mt.b r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ym.a.C0676a.C0677a.C0678a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ym.a$a$a$a r0 = (ym.a.C0676a.C0677a.C0678a) r0
                    int r1 = r0.f36746u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36746u = r1
                    goto L18
                L13:
                    ym.a$a$a$a r0 = new ym.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36745t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f36746u
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    gt.o.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    gt.o.b(r6)
                    mu.i r6 = r4.f36744a
                    wm.g r5 = (wm.g) r5
                    java.lang.Object r5 = r5.a()
                    r0.f36746u = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ym.a.C0676a.C0677a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public C0676a(mu.h hVar) {
            this.f36743a = hVar;
        }

        @Override // mu.h
        @Nullable
        public Object collect(@NotNull mu.i iVar, @NotNull mt.b bVar) {
            Object collect = this.f36743a.collect(new C0677a(iVar), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lwm/g;", "it", "", "<anonymous>", "(Lwm/g;)V"}, k = 3, mv = {1, 6, 0})
    @ot.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class b<RenderingT> extends ot.m implements Function2<wm.g<? extends RenderingT>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36748t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36749u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l0 f36750v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f36750v = l0Var;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            b bVar2 = new b(this.f36750v, bVar);
            bVar2.f36749u = obj;
            return bVar2;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            nt.c.e();
            if (this.f36748t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            wm.g gVar = (wm.g) this.f36749u;
            l0 l0Var = this.f36750v;
            if (l0Var != null) {
                l0Var.i("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new PickledTreesnapshot(gVar.getSnapshot()));
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull wm.g<? extends RenderingT> gVar, @Nullable mt.b<? super Unit> bVar) {
            return ((b) create(gVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final <PropsT, OutputT, RenderingT> p0<RenderingT> a(@NotNull wm.q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, @NotNull ju.p0 scope, @NotNull p0<? extends PropsT> props, @Nullable l0 l0Var, @NotNull List<? extends wm.t> interceptors, @NotNull Function2<? super OutputT, ? super mt.b<? super Unit>, ? extends Object> onOutput) {
        PickledTreesnapshot pickledTreesnapshot;
        wm.q<? super PropsT, ? extends OutputT, ? extends RenderingT> qVar;
        ju.p0 p0Var;
        p0<? extends PropsT> p0Var2;
        List<? extends wm.t> list;
        Function2<? super OutputT, ? super mt.b<? super Unit>, ? extends Object> function2;
        wm.m snapshot;
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        if (l0Var == null || (pickledTreesnapshot = (PickledTreesnapshot) l0Var.b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) {
            qVar = workflow;
            p0Var = scope;
            p0Var2 = props;
            list = interceptors;
            function2 = onOutput;
            snapshot = null;
        } else {
            qVar = workflow;
            p0Var = scope;
            p0Var2 = props;
            list = interceptors;
            function2 = onOutput;
            snapshot = pickledTreesnapshot.getSnapshot();
        }
        p0 a10 = wm.f.a(qVar, p0Var, p0Var2, snapshot, list, function2);
        return mu.j.L(new C0676a(mu.j.E(a10, new b(l0Var, null))), p0Var, m0.INSTANCE.a(), ((wm.g) a10.getValue()).a());
    }
}
