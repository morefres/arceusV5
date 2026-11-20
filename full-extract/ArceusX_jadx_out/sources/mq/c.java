package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.j0;
import android.view.l;
import android.view.s;
import android.view.t;
import androidx.core.view.MotionEventCompat;
import gt.o;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import r5.a;
import yt.n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmq/c;", "Lr5/a;", "T", "Rendering", "Lmq/a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "<init>", "(Lyt/n;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lmu/p0;", "g2", "(Lmu/p0;)V", "rendering", "h2", "(Ljava/lang/Object;)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c<T extends r5.a, Rendering> extends mq.a<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1", f = "BaseWorkflowFragment.kt", l = {MotionEventCompat.AXIS_GENERIC_2}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24676t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c<T, Rendering> f24677u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ mu.p0<Rendering> f24678v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1$1", f = "BaseWorkflowFragment.kt", l = {MotionEventCompat.AXIS_GENERIC_3}, m = "invokeSuspend")
        /* renamed from: mq.c$a$a, reason: collision with other inner class name */
        public static final class C0433a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f24679t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ mu.p0<Rendering> f24680u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c<T, Rendering> f24681v;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: mq.c$a$a$a, reason: collision with other inner class name */
            public static final class C0434a<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c<T, Rendering> f24682a;

                public C0434a(c<T, Rendering> cVar) {
                    this.f24682a = cVar;
                }

                @Override // mu.i
                public final Object emit(Rendering rendering, mt.b<? super Unit> bVar) {
                    if (rendering == null) {
                        return Unit.f22894a;
                    }
                    this.f24682a.h2(rendering);
                    this.f24682a.a2();
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0433a(mu.p0<? extends Rendering> p0Var, c<T, Rendering> cVar, mt.b<? super C0433a> bVar) {
                super(2, bVar);
                this.f24680u = p0Var;
                this.f24681v = cVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0433a(this.f24680u, this.f24681v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f24679t;
                if (i10 == 0) {
                    o.b(obj);
                    mu.p0<Rendering> p0Var = this.f24680u;
                    C0434a c0434a = new C0434a(this.f24681v);
                    this.f24679t = 1;
                    if (p0Var.collect(c0434a, this) == e10) {
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
                return ((C0433a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c<T, Rendering> cVar, mu.p0<? extends Rendering> p0Var, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f24677u = cVar;
            this.f24678v = p0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f24677u, this.f24678v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f24676t;
            if (i10 == 0) {
                o.b(obj);
                c<T, Rendering> cVar = this.f24677u;
                l.b bVar = l.b.f2629d;
                C0433a c0433a = new C0433a(this.f24678v, cVar, null);
                this.f24676t = 1;
                if (j0.b(cVar, bVar, c0433a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        super(inflateFn);
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        E1();
    }

    public final void g2(@NotNull mu.p0<? extends Rendering> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        s k02 = k0();
        Intrinsics.checkNotNullExpressionValue(k02, "getViewLifecycleOwner(...)");
        k.d(t.a(k02), null, null, new a(this, p0Var, null), 3, null);
    }

    public abstract void h2(Rendering rendering);
}
