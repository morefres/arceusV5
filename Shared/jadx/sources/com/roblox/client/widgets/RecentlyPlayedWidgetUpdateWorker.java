package com.roblox.client.widgets;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.appsflyer.share.attribution.RequestError;
import com.roblox.client.shortcuts.PinShortcutHandler;
import ek.q;
import gt.o;
import gt.s;
import java.util.ArrayList;
import java.util.List;
import ju.g1;
import ju.l0;
import ju.q0;
import ju.w0;
import k6.d0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import ot.f;
import ot.l;
import ot.m;
import x5.j;
import x5.p0;
import x5.z;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lju/l0;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lju/l0;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "", "f", "context", "", "widgetDataJson", rl.d.f30696a, "(Landroid/content/Context;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lju/l0;", "e", "()Lju/l0;", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecentlyPlayedWidgetUpdateWorker extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "recentlyPlayedData", "", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "", "MAX_THREADS", "I", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull String recentlyPlayedData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(recentlyPlayedData, "recentlyPlayedData");
            Pair[] pairArr = {s.a("recently_played_json_list", recentlyPlayedData)};
            b.a aVar = new b.a();
            Pair pair = pairArr[0];
            aVar.b((String) pair.c(), pair.d());
            androidx.work.b a10 = aVar.a();
            int length = a10.j().length;
            if (length <= 10240) {
                p0.INSTANCE.a(context).g("RecentlyPlayedUpdateWork", j.f35286a, new z.a(RecentlyPlayedWidgetUpdateWorker.class).o(a10).b());
                return;
            }
            q.e("RecentlyPlayedWidgetUpdateWorker", "Worker failed to start. Recently played data size (" + length + ") exceeds 10KB limit");
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<ju.p0, mt.b<? super List<? extends Unit>>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ k6.s B;

        /* renamed from: t, reason: collision with root package name */
        public Object f9586t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9587u;

        /* renamed from: v, reason: collision with root package name */
        public int f9588v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9589w;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ JSONArray f9591y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9592z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2$1", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {98}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ju.p0, mt.b<? super Unit>, Object> {
            public final /* synthetic */ k6.s A;

            /* renamed from: t, reason: collision with root package name */
            public Object f9593t;

            /* renamed from: u, reason: collision with root package name */
            public Object f9594u;

            /* renamed from: v, reason: collision with root package name */
            public int f9595v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f9596w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f9597x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ String f9598y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f9599z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, Context context, k6.s sVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f9596w = str;
                this.f9597x = str2;
                this.f9598y = str3;
                this.f9599z = context;
                this.A = sVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f9596w, this.f9597x, this.f9598y, this.f9599z, this.A, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f9595v;
                if (i10 == 0) {
                    o.b(obj);
                    com.roblox.client.widgets.a aVar = com.roblox.client.widgets.a.f9614a;
                    String str = this.f9596w;
                    Intrinsics.checkNotNull(str);
                    String str2 = this.f9597x;
                    Intrinsics.checkNotNull(str2);
                    String j10 = aVar.j(str, str2, this.f9598y);
                    ImageRequest b = new ImageRequest.a(this.f9599z).c(this.f9597x).f(j10).j(j10).g(x6.c.f35363c).b();
                    k6.s sVar = this.A;
                    this.f9593t = l.a(j10);
                    this.f9594u = l.a(b);
                    this.f9595v = 1;
                    obj = sVar.d(b, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                k kVar = (k) obj;
                if (kVar instanceof ErrorResult) {
                    q.f("RecentlyPlayedWidgetUpdateWorker", "Failed to cache thumbnail for " + this.f9596w, ((ErrorResult) kVar).getThrowable());
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray, String str, Context context, k6.s sVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f9591y = jSONArray;
            this.f9592z = str;
            this.A = context;
            this.B = sVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = RecentlyPlayedWidgetUpdateWorker.this.new b(this.f9591y, this.f9592z, this.A, this.B, bVar);
            bVar2.f9589w = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ju.p0 p0Var, mt.b<? super List<? extends Unit>> bVar) {
            return invoke2(p0Var, (mt.b<? super List<Unit>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            w0 b;
            ju.p0 p0Var = (ju.p0) this.f9589w;
            Object e10 = nt.c.e();
            int i10 = this.f9588v;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            l0 U = l0.U(RecentlyPlayedWidgetUpdateWorker.this.getIoDispatcher(), 3, null, 2, null);
            ArrayList arrayList = new ArrayList();
            int length = this.f9591y.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = this.f9591y.getJSONObject(i11);
                String optString = jSONObject.optString("thumbnailUrl");
                String optString2 = jSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID);
                Intrinsics.checkNotNull(optString);
                if (optString.length() != 0) {
                    b = ju.k.b(p0Var, U, null, new a(optString2, optString, this.f9592z, this.A, this.B, null), 2, null);
                    arrayList.add(b);
                }
            }
            this.f9589w = l.a(p0Var);
            this.f9586t = l.a(U);
            this.f9587u = l.a(arrayList);
            this.f9588v = 1;
            Object a10 = ju.f.a(arrayList, this);
            return a10 == e10 ? e10 : a10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ju.p0 p0Var, mt.b<? super List<Unit>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_7}, m = "doWork", v = 1)
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9600t;

        /* renamed from: v, reason: collision with root package name */
        public int f9602v;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9600t = obj;
            this.f9602v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetUpdateWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$doWork$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_12, RequestError.RESPONSE_CODE_FAILURE, 51}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9603t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9604u;

        /* renamed from: v, reason: collision with root package name */
        public int f9605v;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return RecentlyPlayedWidgetUpdateWorker.this.new d(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
        
            if (r10.f(r9) != r0) goto L31;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f9605v
                java.lang.String r2 = "getApplicationContext(...)"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L41
                if (r1 == r5) goto L35
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                java.lang.Object r0 = r9.f9604u
                jk.c r0 = (jk.c) r0
                java.lang.Object r0 = r9.f9603t
                java.lang.String r0 = (java.lang.String) r0
                gt.o.b(r10)
                goto Lbc
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f9604u
                jk.c r1 = (jk.c) r1
                java.lang.Object r2 = r9.f9603t
                java.lang.String r2 = (java.lang.String) r2
                gt.o.b(r10)
                goto La5
            L35:
                java.lang.Object r1 = r9.f9604u
                jk.c r1 = (jk.c) r1
                java.lang.Object r5 = r9.f9603t
                java.lang.String r5 = (java.lang.String) r5
                gt.o.b(r10)
                goto L79
            L41:
                gt.o.b(r10)
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                androidx.work.b r10 = r10.getInputData()
                java.lang.String r1 = "recently_played_json_list"
                java.lang.String r10 = r10.g(r1)
                if (r10 != 0) goto L57
                androidx.work.c$a r10 = androidx.work.c.a.a()
                return r10
            L57:
                jk.c r1 = new jk.c
                r1.<init>()
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r6 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                android.content.Context r6 = r6.getApplicationContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                r9.f9603t = r10
                java.lang.Object r7 = ot.l.a(r1)
                r9.f9604u = r7
                r9.f9605v = r5
                java.lang.Object r5 = r1.e(r6, r10, r9)
                if (r5 != r0) goto L76
                goto Lbb
            L76:
                r8 = r5
                r5 = r10
                r10 = r8
            L79:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L86
                androidx.work.c$a r10 = androidx.work.c.a.a()
                return r10
            L86:
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                android.content.Context r6 = r10.getApplicationContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                java.lang.Object r2 = ot.l.a(r5)
                r9.f9603t = r2
                java.lang.Object r2 = ot.l.a(r1)
                r9.f9604u = r2
                r9.f9605v = r4
                java.lang.Object r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.b(r10, r6, r5, r9)
                if (r10 != r0) goto La4
                goto Lbb
            La4:
                r2 = r5
            La5:
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                java.lang.Object r2 = ot.l.a(r2)
                r9.f9603t = r2
                java.lang.Object r1 = ot.l.a(r1)
                r9.f9604u = r1
                r9.f9605v = r3
                java.lang.Object r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.c(r10, r9)
                if (r10 != r0) goto Lbc
            Lbb:
                return r0
            Lbc:
                androidx.work.c$a r10 = androidx.work.c.a.d()
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {65}, m = "requestWidgetUpdate", v = 1)
    public static final class e extends ot.d {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public int I;

        /* renamed from: t, reason: collision with root package name */
        public Object f9607t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9608u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9609v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9610w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9611x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9612y;

        /* renamed from: z, reason: collision with root package name */
        public Object f9613z;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.G = obj;
            this.I |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetUpdateWorker.this.f(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        this(appContext, workerParams, null, 4, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    public final Object d(Context context, String str, mt.b<? super Unit> bVar) {
        JSONArray jSONArray = new JSONArray(str);
        k6.s a10 = d0.a(context);
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object g10 = q0.g(new b(jSONArray, recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext), context, a10, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
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
            boolean r0 = r6 instanceof com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.c
            if (r0 == 0) goto L13
            r0 = r6
            com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$c r0 = (com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.c) r0
            int r1 = r0.f9602v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9602v = r1
            goto L18
        L13:
            com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$c r0 = new com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9600t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9602v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            gt.o.b(r6)
            ju.l0 r6 = r5.ioDispatcher
            com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$d r2 = new com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$d
            r4 = 0
            r2.<init>(r4)
            r0.f9602v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.doWork(mt.b):java.lang.Object");
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00f8 -> B:10:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt.b<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.f(mt.b):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull l0 ioDispatcher) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
    }

    public /* synthetic */ RecentlyPlayedWidgetUpdateWorker(Context context, WorkerParameters workerParameters, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i10 & 4) != 0 ? g1.b() : l0Var);
    }
}
