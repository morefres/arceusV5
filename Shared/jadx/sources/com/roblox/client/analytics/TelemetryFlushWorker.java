package com.roblox.client.analytics;

import android.content.Context;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.engine.jni.NativeReportingInterface;
import ek.q;
import gt.n;
import gt.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.q0;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.l;
import ot.m;
import rh.h;
import ve.a;
import x5.d;
import x5.f0;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function0;", "", a.f33391e, "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "setNativeFlushV1$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getNativeFlushV1$NativeShell_googleProdRelease$annotations", "()V", "nativeFlushV1", j6.b.f21518e, "f", "setNativeFlushV2$NativeShell_googleProdRelease", "getNativeFlushV2$NativeShell_googleProdRelease$annotations", "nativeFlushV2", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TelemetryFlushWorker extends CoroutineWorker {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV1;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV2;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", a.f33391e, "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.analytics.TelemetryFlushWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            z.a k10 = new z.a(TelemetryFlushWorker.class).k(new d(x.b, false, false, false, 14, null));
            if (Build.VERSION.SDK_INT >= 31) {
                k10.l(f0.f35273a);
            }
            z b = k10.b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("TelemetryFlushUniqueWork", j.f35286a, b);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.analytics.TelemetryFlushWorker", f = "TelemetryFlushWorker.kt", l = {41}, m = "doWork", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f8976t;

        /* renamed from: v, reason: collision with root package name */
        public int f8978v;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8976t = obj;
            this.f8978v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TelemetryFlushWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2", f = "TelemetryFlushWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_11}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f8979t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1", f = "TelemetryFlushWorker.kt", l = {59}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f8981t;

            /* renamed from: u, reason: collision with root package name */
            public int f8982u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f8983v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ TelemetryFlushWorker f8984w;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$1", f = "TelemetryFlushWorker.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c$a$a, reason: collision with other inner class name */
            public static final class C0137a extends m implements Function2<ju.p0, mt.b<? super Boolean>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f8985t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f8986u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ TelemetryFlushWorker f8987v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0137a(TelemetryFlushWorker telemetryFlushWorker, mt.b<? super C0137a> bVar) {
                    super(2, bVar);
                    this.f8987v = telemetryFlushWorker;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    C0137a c0137a = new C0137a(this.f8987v, bVar);
                    c0137a.f8986u = obj;
                    return c0137a;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    Object b;
                    nt.c.e();
                    if (this.f8985t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f8987v;
                    try {
                        n.Companion companion = n.INSTANCE;
                        telemetryFlushWorker.e().invoke();
                        b = n.b(Unit.f22894a);
                    } catch (Throwable th2) {
                        n.Companion companion2 = n.INSTANCE;
                        b = n.b(o.a(th2));
                    }
                    Throwable e10 = n.e(b);
                    if (e10 != null) {
                        q.f("TelemetryFlushWorker", "V1 telemetry flush failed: " + e10.getMessage(), e10);
                    }
                    return ot.b.a(n.g(b));
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ju.p0 p0Var, mt.b<? super Boolean> bVar) {
                    return ((C0137a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
            @f(c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$2", f = "TelemetryFlushWorker.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends m implements Function2<ju.p0, mt.b<? super Boolean>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f8988t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f8989u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ TelemetryFlushWorker f8990v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TelemetryFlushWorker telemetryFlushWorker, mt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f8990v = telemetryFlushWorker;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    b bVar2 = new b(this.f8990v, bVar);
                    bVar2.f8989u = obj;
                    return bVar2;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    Object b;
                    nt.c.e();
                    if (this.f8988t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f8990v;
                    try {
                        n.Companion companion = n.INSTANCE;
                        telemetryFlushWorker.f().invoke();
                        b = n.b(Unit.f22894a);
                    } catch (Throwable th2) {
                        n.Companion companion2 = n.INSTANCE;
                        b = n.b(o.a(th2));
                    }
                    Throwable e10 = n.e(b);
                    if (e10 != null) {
                        q.f("TelemetryFlushWorker", "V2 telemetry flush failed: " + e10.getMessage(), e10);
                    }
                    return ot.b.a(n.g(b));
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ju.p0 p0Var, mt.b<? super Boolean> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TelemetryFlushWorker telemetryFlushWorker, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f8984w = telemetryFlushWorker;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f8984w, bVar);
                aVar.f8983v = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                w0 b10;
                w0 b11;
                c.a a10;
                ju.p0 p0Var = (ju.p0) this.f8983v;
                Object e10 = nt.c.e();
                int i10 = this.f8982u;
                if (i10 == 0) {
                    o.b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f8984w;
                    List c10 = kotlin.collections.o.c();
                    if (h.a().O2()) {
                        b11 = k.b(p0Var, null, null, new C0137a(telemetryFlushWorker, null), 3, null);
                        c10.add(b11);
                    }
                    if (h.a().f()) {
                        b10 = k.b(p0Var, null, null, new b(telemetryFlushWorker, null), 3, null);
                        c10.add(b10);
                    }
                    List a11 = kotlin.collections.o.a(c10);
                    this.f8983v = l.a(p0Var);
                    this.f8981t = l.a(a11);
                    this.f8982u = 1;
                    obj = ju.f.a(a11, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            a10 = c.a.a();
                            break;
                        }
                    }
                }
                a10 = c.a.d();
                Intrinsics.checkNotNull(a10);
                return a10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return TelemetryFlushWorker.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f8979t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(TelemetryFlushWorker.this, null);
            this.f8979t = 1;
            Object g10 = q0.g(aVar, this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemetryFlushWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.nativeFlushV1 = new Function0() { // from class: ug.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g10;
                g10 = TelemetryFlushWorker.g();
                return g10;
            }
        };
        this.nativeFlushV2 = new Function0() { // from class: ug.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit h10;
                h10 = TelemetryFlushWorker.h();
                return h10;
            }
        };
    }

    public static final void d(@NotNull Context context) {
        INSTANCE.a(context);
    }

    public static final Unit g() {
        NativeReportingInterface.flushEngineTelemetryV1Events();
        return Unit.f22894a;
    }

    public static final Unit h() {
        NativeReportingInterface.flushEngineTelemetryV2Events();
        return Unit.f22894a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.roblox.client.analytics.TelemetryFlushWorker.b
            if (r0 == 0) goto L13
            r0 = r6
            com.roblox.client.analytics.TelemetryFlushWorker$b r0 = (com.roblox.client.analytics.TelemetryFlushWorker.b) r0
            int r1 = r0.f8978v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8978v = r1
            goto L18
        L13:
            com.roblox.client.analytics.TelemetryFlushWorker$b r0 = new com.roblox.client.analytics.TelemetryFlushWorker$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8976t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f8978v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            gt.o.b(r6)
            ju.l0 r6 = ju.g1.b()
            com.roblox.client.analytics.TelemetryFlushWorker$c r2 = new com.roblox.client.analytics.TelemetryFlushWorker$c
            r4 = 0
            r2.<init>(r4)
            r0.f8978v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.analytics.TelemetryFlushWorker.doWork(mt.b):java.lang.Object");
    }

    @NotNull
    public final Function0<Unit> e() {
        return this.nativeFlushV1;
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.nativeFlushV2;
    }
}
