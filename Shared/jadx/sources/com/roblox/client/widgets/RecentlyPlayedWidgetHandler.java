package com.roblox.client.widgets;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.f;
import android.view.s;
import android.view.t;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.widgets.JNIWidgetDataProtocol;
import gt.h;
import gt.i;
import gt.o;
import java.util.Map;
import ju.g1;
import ju.k;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import ot.m;
import rg.a1;
import tu.g;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R#\u0010;\u001a\n 7*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "variant", "", "cacheWidgetVariant", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "widgetDataJson", "", "", "thumbnailURLs", "cacheRecentlyPlayedData", "(Ljava/lang/String;Ljava/util/Map;)V", "jsonString", "reformatData", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "isRecentlyPlayedWidgetEnabled", "maybeToggleWidget", "(Landroid/content/Context;ZLmt/b;)Ljava/lang/Object;", "getCachedWidgetVariant", "(Landroid/content/Context;)Ljava/lang/String;", "Ljk/c;", "recentlyPlayedWidgetFileProvider", "Ljk/c;", "TAG", "Ljava/lang/String;", "Ltu/a;", "cacheMutex", "Ltu/a;", "Lju/l0;", "ioDispatcher", "Lju/l0;", "getIoDispatcher$NativeShell_googleProdRelease", "()Lju/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lju/l0;)V", "defaultDispatcher", "getDefaultDispatcher$NativeShell_googleProdRelease", "setDefaultDispatcher$NativeShell_googleProdRelease", "Landroid/content/ComponentName;", "componentName$delegate", "Lgt/h;", "getComponentName", "()Landroid/content/ComponentName;", "componentName", "kotlin.jvm.PlatformType", "recentlyPlayedRequestMessageId$delegate", "getRecentlyPlayedRequestMessageId", "()Ljava/lang/String;", "recentlyPlayedRequestMessageId", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecentlyPlayedWidgetHandler implements f {

    @NotNull
    private static final String TAG = "RecentlyPlayedWidgetHandler";

    @NotNull
    public static final RecentlyPlayedWidgetHandler INSTANCE = new RecentlyPlayedWidgetHandler();

    @NotNull
    private static final jk.c recentlyPlayedWidgetFileProvider = new jk.c();

    @NotNull
    private static final tu.a cacheMutex = g.b(false, 1, null);

    @NotNull
    private static l0 ioDispatcher = g1.b();

    @NotNull
    private static l0 defaultDispatcher = g1.a();

    /* renamed from: componentName$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h componentName = i.b(new Function0() { // from class: jk.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ComponentName componentName_delegate$lambda$0;
            componentName_delegate$lambda$0 = RecentlyPlayedWidgetHandler.componentName_delegate$lambda$0();
            return componentName_delegate$lambda$0;
        }
    });

    /* renamed from: recentlyPlayedRequestMessageId$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h recentlyPlayedRequestMessageId = i.b(new Function0() { // from class: jk.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String recentlyPlayedRequestMessageId_delegate$lambda$0;
            recentlyPlayedRequestMessageId_delegate$lambda$0 = RecentlyPlayedWidgetHandler.recentlyPlayedRequestMessageId_delegate$lambda$0();
            return recentlyPlayedRequestMessageId_delegate$lambda$0;
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public static final a b = new a("NO_WIDGET", 0, "no_widget");

        /* renamed from: c, reason: collision with root package name */
        public static final a f9546c = new a("V1", 1, "v1");

        /* renamed from: d, reason: collision with root package name */
        public static final a f9547d = new a("V2", 2, "v2");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f9548e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9549f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        static {
            a[] a10 = a();
            f9548e = a10;
            f9549f = pt.b.a(a10);
        }

        public a(String str, int i10, String str2) {
            this.value = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, f9546c, f9547d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9548e.clone();
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$cacheRecentlyPlayedData$1", f = "RecentlyPlayedWidgetHandler.kt", l = {216, 119}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ Map<Long, String> A;

        /* renamed from: t, reason: collision with root package name */
        public Object f9551t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9552u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9553v;

        /* renamed from: w, reason: collision with root package name */
        public int f9554w;

        /* renamed from: x, reason: collision with root package name */
        public int f9555x;

        /* renamed from: y, reason: collision with root package name */
        public int f9556y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9557z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Map<Long, String> map, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f9557z = str;
            this.A = map;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f9557z, this.A, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008c A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:8:0x0084, B:10:0x008c, B:14:0x0092), top: B:6:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: all -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:8:0x0084, B:10:0x008c, B:14:0x0092), top: B:6:0x001c }] */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f9556y
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L3e
                if (r1 == r4) goto L2b
                if (r1 != r3) goto L23
                java.lang.Object r0 = r9.f9553v
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r9.f9552u
                android.content.Context r1 = (android.content.Context) r1
                java.lang.Object r2 = r9.f9551t
                tu.a r2 = (tu.a) r2
                gt.o.b(r10)     // Catch: java.lang.Throwable -> L20
                goto L84
            L20:
                r10 = move-exception
                goto La5
            L23:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2b:
                int r1 = r9.f9554w
                java.lang.Object r4 = r9.f9553v
                java.util.Map r4 = (java.util.Map) r4
                java.lang.Object r6 = r9.f9552u
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r9.f9551t
                tu.a r7 = (tu.a) r7
                gt.o.b(r10)
                r10 = r7
                goto L5c
            L3e:
                gt.o.b(r10)
                tu.a r10 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.access$getCacheMutex$p()
                java.lang.String r6 = r9.f9557z
                java.util.Map<java.lang.Long, java.lang.String> r1 = r9.A
                r9.f9551t = r10
                r9.f9552u = r6
                r9.f9553v = r1
                r9.f9554w = r2
                r9.f9556y = r4
                java.lang.Object r4 = r10.c(r5, r9)
                if (r4 != r0) goto L5a
                goto L7f
            L5a:
                r4 = r1
                r1 = r2
            L5c:
                android.content.Context r7 = com.roblox.client.RobloxApplication.f()     // Catch: java.lang.Throwable -> La2
                com.roblox.client.widgets.RecentlyPlayedWidgetHandler r8 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.INSTANCE     // Catch: java.lang.Throwable -> La2
                java.lang.String r4 = r8.reformatData(r6, r4)     // Catch: java.lang.Throwable -> La2
                jk.c r6 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.access$getRecentlyPlayedWidgetFileProvider$p()     // Catch: java.lang.Throwable -> La2
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> La2
                r9.f9551t = r10     // Catch: java.lang.Throwable -> La2
                r9.f9552u = r7     // Catch: java.lang.Throwable -> La2
                r9.f9553v = r4     // Catch: java.lang.Throwable -> La2
                r9.f9554w = r1     // Catch: java.lang.Throwable -> La2
                r9.f9555x = r2     // Catch: java.lang.Throwable -> La2
                r9.f9556y = r3     // Catch: java.lang.Throwable -> La2
                java.lang.Object r1 = r6.b(r7, r4, r9)     // Catch: java.lang.Throwable -> La2
                if (r1 != r0) goto L80
            L7f:
                return r0
            L80:
                r2 = r10
                r10 = r1
                r0 = r4
                r1 = r7
            L84:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L20
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L20
                if (r10 != 0) goto L92
                kotlin.Unit r10 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L20
                r2.f(r5)
                return r10
            L92:
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$a r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.INSTANCE     // Catch: java.lang.Throwable -> L20
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L20
                r10.a(r1, r0)     // Catch: java.lang.Throwable -> L20
                kotlin.Unit r10 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L20
                r2.f(r5)
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            La2:
                r0 = move-exception
                r2 = r10
                r10 = r0
            La5:
                r2.f(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetHandler.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler", f = "RecentlyPlayedWidgetHandler.kt", l = {180}, m = "maybeToggleWidget", v = 1)
    public static final class c extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f9558t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9559u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f9560v;

        /* renamed from: w, reason: collision with root package name */
        public int f9561w;

        /* renamed from: x, reason: collision with root package name */
        public int f9562x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9563y;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9563y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetHandler.this.maybeToggleWidget(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onCreate$1", f = "RecentlyPlayedWidgetHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9565t;

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
            if (this.f9565t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context f10 = RobloxApplication.f();
            int[] appWidgetIds = AppWidgetManager.getInstance(f10).getAppWidgetIds(new ComponentName(f10, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (!(appWidgetIds.length == 0)) {
                jk.b.d();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onStop$1", f = "RecentlyPlayedWidgetHandler.kt", l = {77}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f9566t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9567u;

        /* renamed from: v, reason: collision with root package name */
        public int f9568v;

        /* renamed from: w, reason: collision with root package name */
        public int f9569w;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i10;
            Context context;
            Object e10 = nt.c.e();
            int i11 = this.f9569w;
            if (i11 == 0) {
                o.b(obj);
                String recentlyPlayedWidgetVariant = JNIWidgetDataProtocol.f9904a.getRecentlyPlayedWidgetVariant();
                boolean z10 = !Intrinsics.c(recentlyPlayedWidgetVariant, a.b.getValue());
                Context f10 = RobloxApplication.f();
                RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
                Intrinsics.checkNotNull(f10);
                recentlyPlayedWidgetHandler.cacheWidgetVariant(f10, recentlyPlayedWidgetVariant);
                this.f9566t = recentlyPlayedWidgetVariant;
                this.f9567u = f10;
                this.f9568v = z10 ? 1 : 0;
                this.f9569w = 1;
                if (recentlyPlayedWidgetHandler.maybeToggleWidget(f10, z10, this) == e10) {
                    return e10;
                }
                str = recentlyPlayedWidgetVariant;
                i10 = z10 ? 1 : 0;
                context = f10;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f9568v;
                context = (Context) this.f9567u;
                str = (String) this.f9566t;
                o.b(obj);
            }
            if (i10 == 0) {
                return Unit.f22894a;
            }
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return Unit.f22894a;
            }
            JNIWidgetDataProtocol.f9904a.initializeProtocol();
            MessageBus f11 = MessageBus.f();
            Intrinsics.checkNotNullExpressionValue(f11, "getInstance(...)");
            f11.l(RecentlyPlayedWidgetHandler.INSTANCE.getRecentlyPlayedRequestMessageId(), Intrinsics.c(str, a.f9547d.getValue()) ? new JSONObject().put(Payload.TYPE, "GameIcon").put("format", "webp").put("width", 256).put("height", 256) : new JSONObject());
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    private RecentlyPlayedWidgetHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheWidgetVariant(Context context, String variant) {
        SharedPreferences U = a1.U(context);
        if (Intrinsics.c(U.getString("recently_played_widget_variant", null), variant)) {
            return;
        }
        Intrinsics.checkNotNull(U);
        SharedPreferences.Editor edit = U.edit();
        edit.putString("recently_played_widget_variant", variant);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentName componentName_delegate$lambda$0() {
        return new ComponentName(RobloxApplication.f(), (Class<?>) RecentlyPlayedWidgetProvider.class);
    }

    private final ComponentName getComponentName() {
        return (ComponentName) componentName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRecentlyPlayedRequestMessageId() {
        return (String) recentlyPlayedRequestMessageId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recentlyPlayedRequestMessageId_delegate$lambda$0() {
        JNIWidgetDataProtocol jNIWidgetDataProtocol = JNIWidgetDataProtocol.f9904a;
        return MessageBus.getMessageId(jNIWidgetDataProtocol.getProtocolName(), jNIWidgetDataProtocol.getRecentlyPlayedRequestMessage());
    }

    @Keep
    public final void cacheRecentlyPlayedData(@NotNull String widgetDataJson, @NotNull Map<Long, String> thumbnailURLs) {
        Intrinsics.checkNotNullParameter(widgetDataJson, "widgetDataJson");
        Intrinsics.checkNotNullParameter(thumbnailURLs, "thumbnailURLs");
        k.d(q0.a(z2.b(null, 1, null).plus(defaultDispatcher)), null, null, new b(widgetDataJson, thumbnailURLs, null), 3, null);
    }

    @NotNull
    public final String getCachedWidgetVariant(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = a1.U(context).getString("recently_played_widget_variant", null);
        return string == null ? a.f9546c.getValue() : string;
    }

    @NotNull
    public final l0 getDefaultDispatcher$NativeShell_googleProdRelease() {
        return defaultDispatcher;
    }

    @NotNull
    public final l0 getIoDispatcher$NativeShell_googleProdRelease() {
        return ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object maybeToggleWidget(@org.jetbrains.annotations.NotNull android.content.Context r22, boolean r23, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r24) {
        /*
            r21 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof com.roblox.client.widgets.RecentlyPlayedWidgetHandler.c
            if (r2 == 0) goto L19
            r2 = r1
            com.roblox.client.widgets.RecentlyPlayedWidgetHandler$c r2 = (com.roblox.client.widgets.RecentlyPlayedWidgetHandler.c) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.A = r3
            r3 = r21
            goto L20
        L19:
            com.roblox.client.widgets.RecentlyPlayedWidgetHandler$c r2 = new com.roblox.client.widgets.RecentlyPlayedWidgetHandler$c
            r3 = r21
            r2.<init>(r1)
        L20:
            java.lang.Object r1 = r2.f9563y
            java.lang.Object r4 = nt.c.e()
            int r5 = r2.A
            r6 = 1
            if (r5 == 0) goto L41
            if (r5 != r6) goto L39
            java.lang.Object r0 = r2.f9559u
            android.content.pm.PackageManager r0 = (android.content.pm.PackageManager) r0
            java.lang.Object r0 = r2.f9558t
            android.content.Context r0 = (android.content.Context) r0
            gt.o.b(r1)
            goto La4
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            gt.o.b(r1)
            android.content.pm.PackageManager r1 = r22.getPackageManager()
            android.content.ComponentName r5 = r3.getComponentName()
            int r5 = r1.getComponentEnabledSetting(r5)
            if (r0 == 0) goto L54
            r7 = r6
            goto L55
        L54:
            r7 = 2
        L55:
            if (r5 != r7) goto L5a
            kotlin.Unit r0 = kotlin.Unit.f22894a
            return r0
        L5a:
            android.content.ComponentName r8 = r3.getComponentName()
            r1.setComponentEnabledSetting(r8, r7, r6)
            if (r0 == 0) goto L73
            ug.m r9 = ug.m.f32761a
            jk.f r11 = jk.f.f21855d
            jk.g r13 = jk.g.f21859a
            java.lang.String r14 = ""
            java.lang.String r10 = "recents"
            java.lang.String r12 = ""
            jk.b.b(r9, r10, r11, r12, r13, r14)
            goto Lb3
        L73:
            ug.m r15 = ug.m.f32761a
            jk.f r17 = jk.f.f21856e
            jk.g r19 = jk.g.f21859a
            java.lang.String r20 = ""
            java.lang.String r16 = "recents"
            java.lang.String r18 = ""
            jk.b.b(r15, r16, r17, r18, r19, r20)
            jk.c r8 = new jk.c
            r8.<init>()
            java.lang.Object r9 = ot.l.a(r22)
            r2.f9558t = r9
            java.lang.Object r1 = ot.l.a(r1)
            r2.f9559u = r1
            r2.f9560v = r0
            r2.f9561w = r5
            r2.f9562x = r7
            r2.A = r6
            r0 = r22
            java.lang.Object r1 = r8.a(r0, r2)
            if (r1 != r4) goto La4
            return r4
        La4:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "RecentlyPlayedWidgetHandler"
            java.lang.String r1 = "Recently Played Widget cache cleanup failed"
            android.util.Log.e(r0, r1)
        Lb3:
            kotlin.Unit r0 = kotlin.Unit.f22894a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetHandler.maybeToggleWidget(android.content.Context, boolean, mt.b):java.lang.Object");
    }

    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (rh.h.a().T3()) {
            k.d(t.a(owner), ioDispatcher, null, new d(null), 2, null);
        }
    }

    @Override // android.view.f
    public /* bridge */ void onDestroy(@NotNull s sVar) {
        super.onDestroy(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public void onStop(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        k.d(t.a(owner), ioDispatcher, null, new e(null), 2, null);
    }

    @NotNull
    public final String reformatData(@NotNull String jsonString, @NotNull Map<Long, String> thumbnailURLs) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(thumbnailURLs, "thumbnailURLs");
        JSONArray jSONArray = new JSONArray(jsonString);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String str = thumbnailURLs.get(Long.valueOf(jSONObject.optLong(PinShortcutHandler.EXTRA_PLACE_ID)));
            if (str != null) {
                jSONObject.put("thumbnailUrl", str);
            }
            jSONObject.remove("thumbnailPath");
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final void setDefaultDispatcher$NativeShell_googleProdRelease(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        defaultDispatcher = l0Var;
    }

    public final void setIoDispatcher$NativeShell_googleProdRelease(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        ioDispatcher = l0Var;
    }
}
