package wm;

import com.google.mlkit.common.MlKitException;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.t;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B;\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJq\u0010\u001a\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\u00162$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lwm/d;", "P", "S", "O", "Lwm/a;", "Lwm/h;", "Lwm/r;", "baseRenderContext", "Lwm/t$b;", "interceptor", "<init>", "(Lwm/a;Lwm/t$b;)V", "value", "", "f", "(Lwm/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lwm/q;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "c", "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "sideEffect", j6.b.f21518e, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lwm/a;", rl.d.f30696a, "Lwm/t$b;", "()Lwm/h;", "actionSink", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d<P, S, O> implements wm.a<P, S, O>, h<r<? super P, S, ? extends O>> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wm.a<P, S, O> baseRenderContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t.b<P, S, O> interceptor;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT, ChildRenderingT, ChildPropsT] */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"ChildPropsT", "ChildOutputT", "ChildRenderingT", "P", "S", "O", "Lwm/q;", "iChild", "iProps", "", "iKey", "Lkotlin/Function1;", "Lwm/r;", "iHandler", ve.a.f33391e, "(Lwm/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a<ChildOutputT, ChildPropsT, ChildRenderingT> extends kotlin.jvm.internal.m implements yt.o<q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>>, ChildRenderingT> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d<P, S, O> f34375i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<P, S, O> dVar) {
            super(4);
            this.f34375i = dVar;
        }

        @Override // yt.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChildRenderingT e(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> iChild, ChildPropsT childpropst, @NotNull String iKey, @NotNull Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> iHandler) {
            Intrinsics.checkNotNullParameter(iChild, "iChild");
            Intrinsics.checkNotNullParameter(iKey, "iKey");
            Intrinsics.checkNotNullParameter(iHandler, "iHandler");
            return (ChildRenderingT) this.f34375i.baseRenderContext.c(iChild, childpropst, iKey, iHandler);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lmt/b;", "", "", "iSideEffect", ve.a.f33391e, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function2<String, Function1<? super mt.b<? super Unit>, ? extends Object>, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d<P, S, O> f34376i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "O", "Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 6, 0})
        @ot.f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", f = "WorkflowInterceptor.kt", l = {306}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f34377t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1<mt.b<? super Unit>, Object> f34378u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super mt.b<? super Unit>, ? extends Object> function1, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f34378u = function1;
            }

            @Override // ot.a
            @NotNull
            public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
                return new a(this.f34378u, bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f34377t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    Function1<mt.b<? super Unit>, Object> function1 = this.f34378u;
                    this.f34377t = 1;
                    if (function1.invoke(this) == e10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<P, S, O> dVar) {
            super(2);
            this.f34376i = dVar;
        }

        public final void a(@NotNull String iKey, @NotNull Function1<? super mt.b<? super Unit>, ? extends Object> iSideEffect) {
            Intrinsics.checkNotNullParameter(iKey, "iKey");
            Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
            this.f34376i.baseRenderContext.b(iKey, new a(iSideEffect, null));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super mt.b<? super Unit>, ? extends Object> function1) {
            a(str, function1);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\u008a@"}, d2 = {"<anonymous>", "", "P", "S", "O"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @ot.f(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", f = "WorkflowInterceptor.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f34379t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, mt.b<? super Unit>, Object> f34380u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d<P, S, O> f34381v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super p0, ? super mt.b<? super Unit>, ? extends Object> function2, d<P, S, O> dVar, mt.b<? super c> bVar) {
            super(1, bVar);
            this.f34380u = function2;
            this.f34381v = dVar;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@NotNull mt.b<?> bVar) {
            return new c(this.f34380u, this.f34381v, bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f34379t;
            if (i10 == 0) {
                gt.o.b(obj);
                Function2<p0, mt.b<? super Unit>, Object> function2 = this.f34380u;
                p0 a10 = q0.a(getContext());
                this.f34379t = 1;
                if (function2.invoke(a10, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable mt.b<? super Unit> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", "O", "Lwm/r;", "interceptedAction", "", ve.a.f33391e, "(Lwm/r;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: wm.d$d, reason: collision with other inner class name */
    public static final class C0641d extends kotlin.jvm.internal.m implements Function1<r<? super P, S, ? extends O>, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d<P, S, O> f34382i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0641d(d<P, S, O> dVar) {
            super(1);
            this.f34382i = dVar;
        }

        public final void a(@NotNull r<? super P, S, ? extends O> interceptedAction) {
            Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
            this.f34382i.baseRenderContext.d().a(interceptedAction);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((r) obj);
            return Unit.f22894a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull wm.a<? extends P, S, ? super O> baseRenderContext, @NotNull t.b<P, S, O> interceptor) {
        Intrinsics.checkNotNullParameter(baseRenderContext, "baseRenderContext");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.baseRenderContext = baseRenderContext;
        this.interceptor = interceptor;
    }

    @Override // wm.a
    public void b(@NotNull String key, @NotNull Function2<? super p0, ? super mt.b<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        this.interceptor.c(key, new c(sideEffect, this, null), new b(this));
    }

    @Override // wm.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return (ChildRenderingT) this.interceptor.a(child, props, key, handler, new a(this));
    }

    @Override // wm.a
    @NotNull
    public h<r<? super P, S, ? extends O>> d() {
        return this;
    }

    @Override // wm.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull r<? super P, S, ? extends O> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.interceptor.b(value, new C0641d(this));
    }
}
