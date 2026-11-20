package androidx.work;

import android.content.Context;
import androidx.work.c;
import gt.o;
import ju.a0;
import ju.g1;
import ju.h2;
import ju.l0;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rl.d;
import x5.k;
import x5.u;
import y1.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lne/x;", "Landroidx/work/c$a;", "startWork", "()Lne/x;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "Lx5/k;", "getForegroundInfo", "Landroidx/work/b;", "data", "", "setProgress", "(Landroidx/work/b;Lmt/b;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lx5/k;Lmt/b;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lju/l0;", "coroutineContext", "Lju/l0;", "getCoroutineContext", "()Lju/l0;", "getCoroutineContext$annotations", ve.a.f33391e, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends androidx.work.c {

    @NotNull
    private final l0 coroutineContext;

    @NotNull
    private final WorkerParameters params;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lju/l0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "L", "(Lkotlin/coroutines/CoroutineContext;)Z", d.f30696a, "Lju/l0;", "getDispatcher", "()Lju/l0;", "dispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l0 {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f3250c = new a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final l0 dispatcher = g1.a();

        @Override // ju.l0
        public boolean L(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dispatcher.L(context);
        }

        @Override // ju.l0
        public void y(@NotNull CoroutineContext context, @NotNull Runnable block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            dispatcher.y(context, block);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx5/k;", "<anonymous>", "(Lju/p0;)Lx5/k;"}, k = 3, mv = {2, 1, 0})
    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, mt.b<? super k>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f3252t;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return CoroutineWorker.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f3252t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f3252t = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == e10 ? e10 : foregroundInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super k> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f3254t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return CoroutineWorker.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f3254t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f3254t = 1;
            Object doWork = coroutineWorker.doWork(this);
            return doWork == e10 ? e10 : doWork;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.coroutineContext = a.f3250c;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, mt.b<? super k> bVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull mt.b<? super c.a> bVar);

    @NotNull
    public l0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull mt.b<? super k> bVar) {
        return getForegroundInfo$suspendImpl(this, bVar);
    }

    @Override // androidx.work.c
    @NotNull
    public final x<k> getForegroundInfoAsync() {
        a0 b10;
        l0 coroutineContext = getCoroutineContext();
        b10 = h2.b(null, 1, null);
        return u.k(coroutineContext.plus(b10), null, new b(null), 2, null);
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
    }

    @Nullable
    public final Object setForeground(@NotNull k kVar, @NotNull mt.b<? super Unit> bVar) {
        x<Void> foregroundAsync = setForegroundAsync(kVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        Object b10 = e.b(foregroundAsync, bVar);
        return b10 == nt.c.e() ? b10 : Unit.f22894a;
    }

    @Nullable
    public final Object setProgress(@NotNull androidx.work.b bVar, @NotNull mt.b<? super Unit> bVar2) {
        x<Void> progressAsync = setProgressAsync(bVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(...)");
        Object b10 = e.b(progressAsync, bVar2);
        return b10 == nt.c.e() ? b10 : Unit.f22894a;
    }

    @Override // androidx.work.c
    @NotNull
    public final x<c.a> startWork() {
        a0 b10;
        CoroutineContext coroutineContext = !Intrinsics.c(getCoroutineContext(), a.f3250c) ? getCoroutineContext() : this.params.l();
        Intrinsics.checkNotNull(coroutineContext);
        b10 = h2.b(null, 1, null);
        return u.k(coroutineContext.plus(b10), null, new c(null), 2, null);
    }
}
