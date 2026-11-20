package xm;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.WorkflowOutput;
import wm.q;
import wm.r;
import wm.t;
import wm.w;
import xm.e;
import xm.f;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010#\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010\u001f\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u0017\"\u0004\b\u0003\u0010%2\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010'0&¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b+\u0010,J\u008f\u0001\u0010/\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001d2\u0006\u0010-\u001a\u00028\u00032\u0006\u0010!\u001a\u00020 2$\u0010\"\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0002¢\u0006\u0004\b/\u00100R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030.098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010:¨\u0006<"}, d2 = {"Lxm/h;", "PropsT", "StateT", "OutputT", "Lxm/f$a;", "", "Lxm/k;", "Lwm/m;", "snapshotCache", "Lkotlin/coroutines/CoroutineContext;", "contextForChildren", "Lkotlin/Function1;", "Lwm/r;", "", "emitActionToParent", "Lwm/t$c;", "workflowSession", "Lwm/t;", "interceptor", "Lxm/d;", "idCounter", "<init>", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V", "", "c", "()V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lwm/q;", "child", "props", "", "key", "handler", ve.a.f33391e, "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "T", "Lsu/d;", "Lwm/v;", "selector", "g", "(Lsu/d;)V", "f", "()Ljava/util/Map;", "initialProps", "Lxm/i;", rl.d.f30696a, "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lxm/i;", "Ljava/util/Map;", j6.b.f21518e, "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function1;", "Lwm/t$c;", "e", "Lwm/t;", "Lxm/d;", "Lxm/a;", "Lxm/a;", "children", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h<PropsT, StateT, OutputT> implements f.a<PropsT, StateT, OutputT> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<WorkflowNodeId, wm.m> snapshotCache;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext contextForChildren;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<r<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final t.c workflowSession;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t interceptor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final d idCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public xm.a<i<?, ?, ?, ?, ?>> children;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a<ChildOutputT> extends kotlin.jvm.internal.k implements Function1<ChildOutputT, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> f35647a;
        public final /* synthetic */ h<PropsT, StateT, OutputT> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c0Var, h<PropsT, StateT, OutputT> hVar) {
            super(1, Intrinsics.a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.f35647a = c0Var;
            this.b = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(ChildOutputT childoutputt) {
            return h.e(this.f35647a, this.b, childoutputt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Nullable Map<WorkflowNodeId, wm.m> map, @NotNull CoroutineContext contextForChildren, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, @Nullable t.c cVar, @NotNull t interceptor, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(contextForChildren, "contextForChildren");
        Intrinsics.checkNotNullParameter(emitActionToParent, "emitActionToParent");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = contextForChildren;
        this.emitActionToParent = emitActionToParent;
        this.workflowSession = cVar;
        this.interceptor = interceptor;
        this.idCounter = dVar;
        this.children = new xm.a<>();
    }

    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object e(c0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> c0Var, h<PropsT, StateT, OutputT> hVar, ChildOutputT childoutputt) {
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar;
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar2 = c0Var.f22963a;
        if (iVar2 == null) {
            Intrinsics.u("node");
            iVar = null;
        } else {
            iVar = iVar2;
        }
        return hVar.emitActionToParent.invoke(iVar.c(childoutputt));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super ChildOutputT, ? extends wm.r<? super PropsT, StateT, ? extends OutputT>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [xm.e$a] */
    @Override // xm.f.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        e eVar;
        e eVar2;
        e eVar3;
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        eVar = this.children.staging;
        for (e.a b = eVar.b(); b != null; b = b.getNextListNode()) {
            if (((i) b).h(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + w.j(child) + ": key=\"" + key + '\"').toString());
            }
        }
        xm.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        eVar2 = aVar.active;
        i iVar = null;
        i iVar2 = null;
        i iVar3 = eVar2.b();
        while (true) {
            if (iVar3 == null) {
                break;
            }
            if (iVar3.h(child, key)) {
                if (iVar2 == null) {
                    eVar2.e(iVar3.getNextListNode());
                } else {
                    iVar2.b(iVar3.getNextListNode());
                }
                if (Intrinsics.c(eVar2.c(), iVar3)) {
                    eVar2.f(iVar2);
                }
                iVar3.b(null);
                iVar = iVar3;
            } else {
                iVar2 = iVar3;
                iVar3 = iVar3.getNextListNode();
            }
        }
        if (iVar == null) {
            iVar = d(child, props, key, handler);
        }
        eVar3 = aVar.staging;
        eVar3.d(iVar);
        i iVar4 = iVar;
        iVar4.j(handler);
        return (ChildRenderingT) iVar4.i(child.b(), props);
    }

    public final void c() {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        xm.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        eVar = aVar.active;
        for (e.a b = eVar.b(); b != null; b = b.getNextListNode()) {
            j.f(((i) b).g(), null, 1, null);
        }
        eVar2 = aVar.active;
        eVar3 = aVar.staging;
        aVar.active = eVar3;
        aVar.staging = eVar2;
        eVar4 = aVar.staging;
        eVar4.a();
        this.snapshotCache = null;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, xm.i, xm.i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>] */
    public final <ChildPropsT, ChildOutputT, ChildRenderingT> i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId a10 = l.a(child, key);
        c0 c0Var = new c0();
        Map<WorkflowNodeId, wm.m> map = this.snapshotCache;
        ?? r12 = (i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new i(child, handler, new j(a10, child.b(), initialProps, map == null ? null : map.get(a10), this.contextForChildren, new a(c0Var, this), this.workflowSession, this.interceptor, this.idCounter));
        c0Var.f22963a = r12;
        return r12;
    }

    @NotNull
    public final Map<WorkflowNodeId, wm.m> f() {
        e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eVar = this.children.active;
        for (e.a b = eVar.b(); b != null; b = b.getNextListNode()) {
            i iVar = (i) b;
            linkedHashMap.put(iVar.d(), iVar.g().o(iVar.f().b()));
        }
        return linkedHashMap;
    }

    public final <T> void g(@NotNull su.d<? super WorkflowOutput<? extends T>> selector) {
        e eVar;
        Intrinsics.checkNotNullParameter(selector, "selector");
        eVar = this.children.active;
        for (e.a b = eVar.b(); b != null; b = b.getNextListNode()) {
            ((i) b).g().p(selector);
        }
    }
}
