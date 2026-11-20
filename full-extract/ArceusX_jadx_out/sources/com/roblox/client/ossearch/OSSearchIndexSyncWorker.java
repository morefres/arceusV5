package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.appsflyer.share.attribution.RequestError;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import ek.q;
import gt.o;
import gt.s;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g1;
import ju.l0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import x5.g0;
import x5.i;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;
import xi.ThumbnailResult;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR(\u0010\u0014\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "Lju/l0;", ve.a.f33391e, "Lju/l0;", "c", "()Lju/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lju/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "Lkotlin/Function0;", "", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setClock$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getClock$NativeShell_googleProdRelease$annotations", "clock", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OSSearchIndexSyncWorker extends CoroutineWorker {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 ioDispatcher;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Long> clock;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", rl.d.f30696a, j6.b.f21518e, ve.a.f33391e, "", "PERIODIC_SYNC_WORK_NAME", "Ljava/lang/String;", "IMMEDIATE_SYNC_WORK_NAME", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("fetch_search_results");
        }

        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("periodic_fetch_search_results");
        }

        public final void c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchIndexSyncWorker", "Scheduling immediate OS search index sync");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("fetch_search_results", j.b, new z.a(OSSearchIndexSyncWorker.class).k(new x5.d(x.b, false, true, true, 2, null)).b());
        }

        public final void d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchIndexSyncWorker", "Scheduling periodic OS search index sync");
            Duration ofDays = Duration.ofDays(1L);
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            p0 a10 = companion.a(applicationContext);
            i iVar = i.b;
            Intrinsics.checkNotNull(ofDays);
            a10.e("periodic_fetch_search_results", iVar, new g0.a(OSSearchIndexSyncWorker.class, ofDays).k(new x5.d(x.b, false, true, true, 2, null)).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function0<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9166a = new b();

        public b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker", f = "OSSearchIndexSyncWorker.kt", l = {35, MotionEventCompat.AXIS_GENERIC_12, MotionEventCompat.AXIS_GENERIC_15}, m = "doWork", v = 1)
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public long f9167t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9168u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9169v;

        /* renamed from: x, reason: collision with root package name */
        public int f9171x;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9169v = obj;
            this.f9171x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OSSearchIndexSyncWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2", f = "OSSearchIndexSyncWorker.kt", l = {49, RequestError.RESPONSE_CODE_FAILURE, 53, 67, 68}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ com.roblox.client.ossearch.c C;

        /* renamed from: t, reason: collision with root package name */
        public Object f9172t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9173u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9174v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9175w;

        /* renamed from: x, reason: collision with root package name */
        public int f9176x;

        /* renamed from: y, reason: collision with root package name */
        public int f9177y;

        /* renamed from: z, reason: collision with root package name */
        public int f9178z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9179t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9180u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f9180u = oSSearchIndexSyncWorker;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f9180u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f9179t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                m2.e.i(this.f9180u.getApplicationContext());
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$2", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9181t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9182u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<Pair<m2.c, ThumbnailResult>> f9183v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItemsResult f9184w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, List<? extends Pair<? extends m2.c, ThumbnailResult>> list, SearchIndexItemsResult searchIndexItemsResult, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f9182u = oSSearchIndexSyncWorker;
                this.f9183v = list;
                this.f9184w = searchIndexItemsResult;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f9182u, this.f9183v, this.f9184w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f9181t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9182u.getApplicationContext();
                List<Pair<m2.c, ThumbnailResult>> list = this.f9183v;
                ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((m2.c) ((Pair) it.next()).c());
                }
                m2.e.m(applicationContext, arrayList);
                com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9216a;
                Context applicationContext2 = this.f9182u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                bVar.d(applicationContext2, this.f9182u.b().invoke().longValue() + (this.f9184w.getRefreshIntervalSeconds() * 1000));
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$availableShortcuts$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends m implements Function2<ju.p0, mt.b<? super Integer>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9185t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9186u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f9186u = oSSearchIndexSyncWorker;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new c(this.f9186u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f9185t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9186u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return ot.b.c(xi.a.a(applicationContext));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Integer> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Lkotlin/Pair;", "Lm2/c;", "Lxi/e;", "<anonymous>", "(Lju/p0;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1", f = "OSSearchIndexSyncWorker.kt", l = {60}, m = "invokeSuspend", v = 1)
        /* renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$d, reason: collision with other inner class name */
        public static final class C0146d extends m implements Function2<ju.p0, mt.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9187t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItem f9188u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ com.roblox.client.ossearch.c f9189v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9190w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0146d(SearchIndexItem searchIndexItem, com.roblox.client.ossearch.c cVar, OSSearchIndexSyncWorker oSSearchIndexSyncWorker, mt.b<? super C0146d> bVar) {
                super(2, bVar);
                this.f9188u = searchIndexItem;
                this.f9189v = cVar;
                this.f9190w = oSSearchIndexSyncWorker;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0146d(this.f9188u, this.f9189v, this.f9190w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ju.p0 p0Var, mt.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>> bVar) {
                return invoke2(p0Var, (mt.b<? super Pair<? extends m2.c, ThumbnailResult>>) bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f9187t;
                if (i10 == 0) {
                    o.b(obj);
                    SearchIndexItem searchIndexItem = this.f9188u;
                    com.roblox.client.ossearch.c cVar = this.f9189v;
                    l0 ioDispatcher = this.f9190w.getIoDispatcher();
                    Context applicationContext = this.f9190w.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    this.f9187t = 1;
                    obj = xi.a.c(searchIndexItem, cVar, ioDispatcher, applicationContext, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                ThumbnailResult thumbnailResult = (ThumbnailResult) obj;
                SearchIndexItem searchIndexItem2 = this.f9188u;
                Bitmap bitmap = thumbnailResult.getBitmap();
                Context applicationContext2 = this.f9190w.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return s.a(xi.a.d(searchIndexItem2, bitmap, applicationContext2), thumbnailResult);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ju.p0 p0Var, mt.b<? super Pair<? extends m2.c, ThumbnailResult>> bVar) {
                return ((C0146d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.roblox.client.ossearch.c cVar, mt.b<? super d> bVar) {
            super(2, bVar);
            this.C = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = OSSearchIndexSyncWorker.this.new d(this.C, bVar);
            dVar.A = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0144 A[Catch: all -> 0x0030, LOOP:4: B:122:0x013e->B:124:0x0144, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x002b, B:11:0x01b7, B:112:0x004b, B:114:0x018c, B:119:0x0064, B:121:0x011d, B:122:0x013e, B:124:0x0144, B:126:0x0167, B:131:0x0081, B:132:0x00f8, B:137:0x0094, B:139:0x00cf, B:144:0x00a9), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01d2  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 842
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchIndexSyncWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)J"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$nextAllowedSync$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<ju.p0, mt.b<? super Long>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9191t;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return OSSearchIndexSyncWorker.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9191t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9216a;
            Context applicationContext = OSSearchIndexSyncWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return ot.b.d(bVar.c(applicationContext));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Long> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lju/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$thumbnailCache$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<ju.p0, mt.b<? super com.roblox.client.ossearch.c>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9193t;

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9193t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return com.roblox.client.ossearch.c.INSTANCE.a();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchIndexSyncWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = g1.b();
        this.clock = b.f9166a;
    }

    @NotNull
    public final Function0<Long> b() {
        return this.clock;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.roblox.client.ossearch.OSSearchIndexSyncWorker.c
            if (r0 == 0) goto L13
            r0 = r12
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$c r0 = (com.roblox.client.ossearch.OSSearchIndexSyncWorker.c) r0
            int r1 = r0.f9171x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9171x = r1
            goto L18
        L13:
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$c r0 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9169v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9171x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f9168u
            com.roblox.client.ossearch.c r0 = (com.roblox.client.ossearch.c) r0
            gt.o.b(r12)
            goto Lb1
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3d:
            long r4 = r0.f9167t
            gt.o.b(r12)
            goto L99
        L43:
            gt.o.b(r12)
            goto L5a
        L47:
            gt.o.b(r12)
            ju.l0 r12 = r11.ioDispatcher
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$e r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$e
            r2.<init>(r6)
            r0.f9171x = r5
            java.lang.Object r12 = ju.i.g(r12, r2, r0)
            if (r12 != r1) goto L5a
            goto Lb0
        L5a:
            java.lang.Number r12 = (java.lang.Number) r12
            long r7 = r12.longValue()
            kotlin.jvm.functions.Function0<java.lang.Long> r12 = r11.clock
            java.lang.Object r12 = r12.invoke()
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r2 = "OSSearchIndexSyncWorker"
            if (r12 >= 0) goto L81
            java.lang.String r12 = "Skipping OS search sync, not yet due"
            ek.q.h(r2, r12)
            androidx.work.c$a r12 = androidx.work.c.a.d()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        L81:
            java.lang.String r12 = "Starting OS search index sync"
            ek.q.h(r2, r12)
            ju.l0 r12 = r11.ioDispatcher
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$f r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$f
            r2.<init>(r6)
            r0.f9167t = r7
            r0.f9171x = r4
            java.lang.Object r12 = ju.i.g(r12, r2, r0)
            if (r12 != r1) goto L98
            goto Lb0
        L98:
            r4 = r7
        L99:
            com.roblox.client.ossearch.c r12 = (com.roblox.client.ossearch.c) r12
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$d r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$d
            r2.<init>(r12, r6)
            java.lang.Object r12 = ot.l.a(r12)
            r0.f9168u = r12
            r0.f9167t = r4
            r0.f9171x = r3
            java.lang.Object r12 = ju.q0.g(r2, r0)
            if (r12 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchIndexSyncWorker.doWork(mt.b):java.lang.Object");
    }
}
