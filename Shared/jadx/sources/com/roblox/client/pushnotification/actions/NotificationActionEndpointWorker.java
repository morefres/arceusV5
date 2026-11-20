package com.roblox.client.pushnotification.actions;

import android.content.Context;
import android.net.Uri;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import ek.q;
import gt.n;
import gt.o;
import gt.s;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import rg.a1;
import tk.g;
import x5.d;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Landroidx/work/WorkerParameters;", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationActionEndpointWorker extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters params;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "actionId", "notificationId", "actionUrl", "actionBody", "", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "HTTPS_PROTOCOL", "Ljava/lang/String;", "DATA_ACTION_URL", "DATA_ACTION_BODY", "WORK_NAME_PREFIX", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull String actionId, @NotNull String notificationId, @NotNull String actionUrl, @NotNull String actionBody) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(notificationId, "notificationId");
            Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
            Intrinsics.checkNotNullParameter(actionBody, "actionBody");
            Pair[] pairArr = {s.a("action-url", actionUrl), s.a("action-body", actionBody)};
            b.a aVar = new b.a();
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                aVar.b((String) pair.c(), pair.d());
            }
            androidx.work.b a10 = aVar.a();
            p0 a11 = p0.INSTANCE.a(context);
            String str = "notification-action-" + actionId + "-" + notificationId;
            j jVar = j.b;
            z.a k10 = new z.a(NotificationActionEndpointWorker.class).o(a10).k(new d(x.b, false, false, false, 14, null));
            x5.a aVar2 = x5.a.f35237a;
            Duration ofSeconds = Duration.ofSeconds(5L);
            Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
            a11.g(str, jVar, k10.j(aVar2, ofSeconds).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker", f = "NotificationActionEndpointWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_8}, m = "doWork", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9286t;

        /* renamed from: v, reason: collision with root package name */
        public int f9288v;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9286t = obj;
            this.f9288v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return NotificationActionEndpointWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$doWork$2", f = "NotificationActionEndpointWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9289t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9290u;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = NotificationActionEndpointWorker.this.new c(bVar);
            cVar.f9290u = obj;
            return cVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            androidx.work.b d10;
            String g10;
            nt.c.e();
            if (this.f9289t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            NotificationActionEndpointWorker notificationActionEndpointWorker = NotificationActionEndpointWorker.this;
            try {
                n.Companion companion = n.INSTANCE;
                d10 = notificationActionEndpointWorker.params.d();
                g10 = d10.g("action-url");
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                b = n.b(o.a(th2));
            }
            if (g10 == null) {
                return c.a.a();
            }
            String g11 = d10.g("action-body");
            if (g11 == null) {
                g11 = "";
            }
            Uri parse = Uri.parse(g10);
            String O = a1.O();
            Intrinsics.checkNotNull(O);
            if (!ij.a.a(parse, O)) {
                q.d("NotificationActionEndpointWorker: URL rejected by domain check. host=" + parse.getHost() + " appDomain=" + O);
                return c.a.a();
            }
            q.a("NotificationActionEndpointWorker: calling " + g10);
            Response execute = g.b().newCall(new Request.Builder().url(g10).post(RequestBody.INSTANCE.create(g11, MediaType.INSTANCE.get("application/json"))).build()).execute();
            try {
                q.a("NotificationActionEndpointWorker: response " + execute.code() + " for " + g10);
                int code = execute.code();
                c.a a10 = (200 > code || code >= 300) ? (500 > code || code >= 600) ? c.a.a() : c.a.c() : c.a.d();
                tt.c.a(execute, null);
                b = n.b(a10);
                return n.e(b) == null ? (c.a) b : c.a.c();
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionEndpointWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
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
            boolean r0 = r6 instanceof com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker.b
            if (r0 == 0) goto L13
            r0 = r6
            com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$b r0 = (com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker.b) r0
            int r1 = r0.f9288v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9288v = r1
            goto L18
        L13:
            com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$b r0 = new com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9286t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9288v
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
            com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$c r2 = new com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$c
            r4 = 0
            r2.<init>(r4)
            r0.f9288v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker.doWork(mt.b):java.lang.Object");
    }
}
