package com.roblox.client.ossearch;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.platform.http.postbody.notifications.SearchResultRequestItem;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchResultIdentifier;
import ek.q;
import gt.o;
import gt.s;
import ju.g1;
import ju.l0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m2.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR(\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "c", "()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lju/l0;", ve.a.f33391e, "Lju/l0;", rl.d.f30696a, "()Lju/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lju/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OSSearchSingleResultFetchWorker extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 ioDispatcher;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", PinShortcutHandler.EXTRA_PLACE_ID, "", j6.b.f21518e, "(Landroid/content/Context;J)V", ve.a.f33391e, "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("fetch_unique_search_result");
        }

        public final void b(@NotNull Context context, long placeId) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchSingleResultFetchWorker", "Scheduling immediate OS search index sync");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            p0 a10 = companion.a(applicationContext);
            j jVar = j.f35288d;
            z.a aVar = new z.a(OSSearchSingleResultFetchWorker.class);
            Pair[] pairArr = {s.a("place_id", Long.valueOf(placeId))};
            b.a aVar2 = new b.a();
            Pair pair = pairArr[0];
            aVar2.b((String) pair.c(), pair.d());
            a10.g("fetch_unique_search_result", jVar, aVar.o(aVar2.a()).k(new x5.d(x.b, false, false, true, 6, null)).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker", f = "OSSearchSingleResultFetchWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_2, MotionEventCompat.AXIS_GENERIC_5}, m = "doWork", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f9195t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9196u;

        /* renamed from: w, reason: collision with root package name */
        public int f9198w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9196u = obj;
            this.f9198w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OSSearchSingleResultFetchWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2", f = "OSSearchSingleResultFetchWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_12, MotionEventCompat.AXIS_GENERIC_14, MotionEventCompat.AXIS_GENERIC_16}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<ju.p0, mt.b<? super c.a>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ com.roblox.client.ossearch.c I;

        /* renamed from: t, reason: collision with root package name */
        public Object f9199t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9200u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9201v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9202w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9203x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9204y;

        /* renamed from: z, reason: collision with root package name */
        public Object f9205z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2$1$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ju.p0, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9206t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchSingleResultFetchWorker f9207u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ m2.c f9208v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchSingleResultFetchWorker oSSearchSingleResultFetchWorker, m2.c cVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f9207u = oSSearchSingleResultFetchWorker;
                this.f9208v = cVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f9207u, this.f9208v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f9206t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return ot.b.a(e.h(this.f9207u.getApplicationContext(), this.f9208v));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Boolean> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, mt.b<? super c> bVar) {
            super(2, bVar);
            this.I = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = OSSearchSingleResultFetchWorker.this.new c(this.I, bVar);
            cVar.G = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x013f A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:8:0x0048, B:10:0x01e8, B:11:0x0139, B:13:0x013f, B:19:0x018d, B:22:0x01fd, B:144:0x00f1), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01fd A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:8:0x0048, B:10:0x01e8, B:11:0x0139, B:13:0x013f, B:19:0x018d, B:22:0x01fd, B:144:0x00f1), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0214  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x01e1 -> B:10:0x01e8). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 867
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lju/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$thumbnailCache$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ju.p0, mt.b<? super com.roblox.client.ossearch.c>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9209t;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9209t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return com.roblox.client.ossearch.c.INSTANCE.a();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchSingleResultFetchWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = g1.b();
    }

    public final SingleOSSearchResultPostBody c() {
        Long valueOf = Long.valueOf(getInputData().f("place_id", -1L));
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new SingleOSSearchResultPostBody(kotlin.collections.o.d(new SearchResultRequestItem(new SearchResultIdentifier(valueOf))));
        }
        return null;
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.b
            if (r0 == 0) goto L13
            r0 = r7
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b r0 = (com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.b) r0
            int r1 = r0.f9198w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9198w = r1
            goto L18
        L13:
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b r0 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9196u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9198w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.f9195t
            com.roblox.client.ossearch.c r0 = (com.roblox.client.ossearch.c) r0
            gt.o.b(r7)
            goto L6d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            gt.o.b(r7)
            goto L57
        L3d:
            gt.o.b(r7)
            java.lang.String r7 = "OSSearchSingleResultFetchWorker"
            java.lang.String r2 = "Starting OS search result fetch"
            ek.q.h(r7, r2)
            ju.l0 r7 = r6.ioDispatcher
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$d r2 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$d
            r2.<init>(r3)
            r0.f9198w = r5
            java.lang.Object r7 = ju.i.g(r7, r2, r0)
            if (r7 != r1) goto L57
            goto L6c
        L57:
            com.roblox.client.ossearch.c r7 = (com.roblox.client.ossearch.c) r7
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c r2 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c
            r2.<init>(r7, r3)
            java.lang.Object r7 = ot.l.a(r7)
            r0.f9195t = r7
            r0.f9198w = r4
            java.lang.Object r7 = ju.q0.g(r2, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.doWork(mt.b):java.lang.Object");
    }
}
