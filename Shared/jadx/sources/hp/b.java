package hp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.l;
import android.view.s;
import android.view.t;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.e;
import fp.e1;
import gt.o;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import mu.i;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import xo.z;
import ym.ViewEnvironment;
import ym.c0;
import yt.n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012R(\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010,\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lhp/b;", "Lmq/a;", "Lzo/d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "PropsT", "StateT", "OutputT", "Lfp/e1;", "rendering", "k2", "(Lfp/e1;)V", "m2", "Lym/c0;", "j0", "Lym/c0;", "j2", "()Lym/c0;", "setViewRegistry", "(Lym/c0;)V", "getViewRegistry$annotations", "viewRegistry", "Ltq/a;", "k0", "Ltq/a;", "i2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lmu/c0;", "", "l0", "Lmu/c0;", "propsFlow", "m0", "Lfp/e1;", "lastRendering", "n0", j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends mq.a<zo.d> {

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public c0 viewRegistry;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.c0<Object> propsFlow;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e1<Object, Object, Object> lastRendering;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, zo.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19538a = new a();

        public a() {
            super(3, zo.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", 0);
        }

        public final zo.d d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return zo.d.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ zo.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhp/b$b;", "", "<init>", "()V", "Lhp/b;", ve.a.f33391e, "()Lhp/b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: hp.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$1", f = "WorkflowStepFragment.kt", l = {65}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f19539t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ mu.c0<PropsT> f19541v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.c0<PropsT> f19542a;

            public a(mu.c0<PropsT> c0Var) {
                this.f19542a = c0Var;
            }

            @Override // mu.i
            public final Object emit(Object obj, mt.b<? super Unit> bVar) {
                Object emit;
                return (obj == null || (emit = this.f19542a.emit(obj, bVar)) != nt.c.e()) ? Unit.f22894a : emit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mu.c0<PropsT> c0Var, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f19541v = c0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new c(this.f19541v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f19539t;
            if (i10 == 0) {
                o.b(obj);
                mu.c0 c0Var = b.this.propsFlow;
                a aVar = new a(this.f19541v);
                this.f19539t = 1;
                if (c0Var.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [OutputT] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "OutputT", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$contentView$1$1", f = "WorkflowStepFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d<OutputT> extends m implements Function2<OutputT, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f19543t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19544u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e1<PropsT, StateT, OutputT> f19545v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1<PropsT, StateT, OutputT> e1Var, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f19545v = e1Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = new d(this.f19545v, bVar);
            dVar.f19544u = obj;
            return dVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f19544u;
            nt.c.e();
            if (this.f19543t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f19545v.getHandler().invoke(obj2);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OutputT outputt, mt.b<? super Unit> bVar) {
            return ((d) create(outputt, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public b() {
        super(a.f19538a);
        this.propsFlow = r0.a(null);
    }

    public static final void l2(b bVar) {
        bVar.a2();
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        E1();
        e1<Object, Object, Object> e1Var = this.lastRendering;
        if (e1Var != null) {
            k2(e1Var);
        }
    }

    @NotNull
    public final tq.a i2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @NotNull
    public final c0 j2() {
        c0 c0Var = this.viewRegistry;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.u("viewRegistry");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <PropsT, StateT, OutputT> void k2(@NotNull e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.lastRendering = rendering;
            return;
        }
        mu.c0 a10 = r0.a(rendering.a());
        s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        android.view.m a11 = t.a(k02);
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        ju.k.d(a11, null, null, new c(a10, null), 3, null);
        androidx.fragment.app.c J = J();
        Intrinsics.d(J, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment");
        e n22 = ((InquiryWorkflowFragment) J).n2();
        if (!Intrinsics.c(n22.e().f(), rendering.getName())) {
            n22.g();
        }
        n22.e().o(rendering.getName());
        Context I1 = I1();
        Intrinsics.checkNotNullExpressionValue(I1, "requireContext(...)");
        WorkflowLayout workflowLayout = new WorkflowLayout(I1, attributeSet, 2, objArr == true ? 1 : 0);
        l a12 = a();
        Intrinsics.checkNotNullExpressionValue(a12, "<get-lifecycle>(...)");
        WorkflowLayout.b(workflowLayout, a12, ym.a.a(rendering.c(), t.a(this), a10, n22.getSavedStateHandle(), z.f35956a.a(), new d(rendering, null)), null, new ViewEnvironment(k0.m(gt.s.a(c0.INSTANCE, j2()), gt.s.a(tq.b.b, i2()))), 4, null);
        ((zo.d) b2()).getRoot().removeAllViews();
        ((zo.d) b2()).getRoot().addView(workflowLayout);
        ((zo.d) b2()).getRoot().post(new Runnable() { // from class: hp.a
            @Override // java.lang.Runnable
            public final void run() {
                b.l2(b.this);
            }
        });
    }

    public final <PropsT, StateT, OutputT> void m2(@NotNull e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        mu.c0<Object> c0Var = this.propsFlow;
        PropsT a10 = rendering.a();
        Intrinsics.d(a10, "null cannot be cast to non-null type kotlin.Any");
        c0Var.setValue(a10);
    }
}
