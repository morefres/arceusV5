package xo;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lxo/f;", "", "Lwn/d;", "collector", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "apiHelper", "Lju/l0;", "dispatcher", "<init>", "(Lwn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lju/l0;)V", "", "sessionToken", "", ve.a.f33391e, "(Ljava/lang/String;)V", "c", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "()V", "Lwn/d;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "Lju/l0;", "Lju/p0;", rl.d.f30696a, "Lju/p0;", "scope", "", "e", "Z", "hasSent", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wn.d collector;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e apiHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.l0 dispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean hasSent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator$collectAndSend$1", f = "DeviceMetricsOrchestrator.kt", l = {MotionEventCompat.AXIS_GENERIC_13}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35826t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35828v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f35828v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return f.this.new a(this.f35828v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35826t;
            if (i10 == 0) {
                gt.o.b(obj);
                f fVar = f.this;
                String str = this.f35828v;
                this.f35826t = 1;
                if (fVar.c(str, this) == e10) {
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
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator", f = "DeviceMetricsOrchestrator.kt", l = {52}, m = "perform")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35829t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35830u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f35831v;

        /* renamed from: x, reason: collision with root package name */
        public int f35833x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35831v = obj;
            this.f35833x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return f.this.c(null, this);
        }
    }

    public f(@NotNull wn.d collector, @NotNull com.withpersona.sdk2.inquiry.internal.network.e apiHelper, @NotNull ju.l0 dispatcher) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.collector = collector;
        this.apiHelper = apiHelper;
        this.dispatcher = dispatcher;
        this.scope = q0.a(dispatcher.plus(z2.b(null, 1, null)));
    }

    public final void a(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        if (this.hasSent) {
            return;
        }
        this.hasSent = true;
        ju.k.d(this.scope, null, null, new a(sessionToken, null), 3, null);
    }

    public final void b() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|(2:17|18)|21|22))|32|6|7|(0)(0)|12|(3:14|17|18)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xo.f.b
            if (r0 == 0) goto L13
            r0 = r7
            xo.f$b r0 = (xo.f.b) r0
            int r1 = r0.f35833x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35833x = r1
            goto L18
        L13:
            xo.f$b r0 = new xo.f$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35831v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35833x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f35830u
            wn.c r6 = (wn.DeviceMetrics) r6
            java.lang.Object r6 = r0.f35829t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r7)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            goto L5b
        L31:
            r6 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            gt.o.b(r7)
            wn.d r7 = r5.collector
            wn.c r7 = r7.a()
            com.withpersona.sdk2.inquiry.internal.network.e r2 = r5.apiHelper     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            java.lang.Object r4 = ot.l.a(r6)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            r0.f35829t = r4     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            java.lang.Object r4 = ot.l.a(r7)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            r0.f35830u = r4     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            r0.f35833x = r3     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            java.lang.Object r7 = r2.s(r6, r7, r0)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.withpersona.sdk2.inquiry.internal.network.i r7 = (com.withpersona.sdk2.inquiry.internal.network.i) r7     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            boolean r6 = r7 instanceof com.withpersona.sdk2.inquiry.internal.network.i.b     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            if (r6 != 0) goto L6c
            boolean r6 = r7 instanceof com.withpersona.sdk2.inquiry.internal.network.i.Error     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            if (r6 == 0) goto L66
            goto L6c
        L66:
            gt.l r6 = new gt.l     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
            throw r6     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L6c
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L6f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.f.c(java.lang.String, mt.b):java.lang.Object");
    }
}
