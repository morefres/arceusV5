package qh;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import gt.n;
import gt.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ju.g1;
import ju.n;
import ju.p0;
import ju.q0;
import ju.z0;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import zl.t;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R4\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b088\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lqh/h;", "Lae/f;", "<init>", "()V", "", "", "Lqh/a;", "policies", "", "r", "(Ljava/util/Map;)V", "moduleName", "m", "(Ljava/lang/String;)V", "l", "", "k", "(Ljava/lang/String;)Z", "y", "()Z", "loadIntoProcess", "i", "(Ljava/lang/String;ZLmt/b;)Ljava/lang/Object;", "Lae/e;", "state", "v", "(Lae/e;)V", t.f38095d, "", "moduleNames", "s", "(Ljava/util/List;)Ljava/lang/String;", NotificationCompat.CATEGORY_STATUS, "", "retryAttempt", "installDurationBucket", "w", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "Lae/b;", j6.b.f21518e, "Lae/b;", "splitInstallManager", "c", "Ljava/util/List;", "standardFields", rl.d.f30696a, "Ljava/util/Map;", "retryPolicies", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "retryCounts", "", "f", "downloadRequestedAtMs", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getLoadWebRtcLibrary$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function1;", "setLoadWebRtcLibrary$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function1;)V", "getLoadWebRtcLibrary$NativeShell_googleProdRelease$annotations", "loadWebRtcLibrary", "Lju/p0;", "h", "Lju/p0;", "retryScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h implements ae.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f29840a;

    /* renamed from: b, reason: from kotlin metadata */
    public static ae.b splitInstallManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> standardFields;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Map<String, ExpBackOffRetryPolicy> retryPolicies;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, AtomicInteger> retryCounts;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Long> downloadRequestedAtMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function1<? super String, Unit> loadWebRtcLibrary;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static p0 retryScope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery", f = "RobloxFeatureDelivery.kt", l = {396}, m = "awaitModuleInstalled", v = 1)
    public static final class a extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f29847t;

        /* renamed from: u, reason: collision with root package name */
        public Object f29848u;

        /* renamed from: v, reason: collision with root package name */
        public Object f29849v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f29850w;

        /* renamed from: x, reason: collision with root package name */
        public int f29851x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29852y;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29852y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return h.this.i(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ae.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29854a;
        public final /* synthetic */ n<Unit> b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f29855c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f29856d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10) {
            this.f29854a = str;
            this.b = nVar;
            this.f29855c = atomicBoolean;
            this.f29856d = z10;
        }

        @Override // vd.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ae.e state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.i() == 5 && state.f().contains(this.f29854a)) {
                h.j(this.b, this.f29855c, this.f29856d, this.f29854a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$onStateUpdate$2$1", f = "RobloxFeatureDelivery.kt", l = {275}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29857t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f29858u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f29859v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String str, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f29858u = j10;
            this.f29859v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f29858u, this.f29859v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29857t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f29858u;
                this.f29857t = 1;
                if (z0.b(j10, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            String str = this.f29859v;
            Intrinsics.checkNotNull(str);
            h.m(str);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        h hVar = new h();
        f29840a = hVar;
        standardFields = kotlin.collections.o.d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        retryPolicies = k0.j();
        retryCounts = new ConcurrentHashMap<>();
        downloadRequestedAtMs = new ConcurrentHashMap<>();
        loadWebRtcLibrary = new Function1() { // from class: qh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u8;
                u8 = h.u((String) obj);
                return u8;
            }
        };
        retryScope = q0.a(g1.b().plus(z2.b(null, 1, null)));
        Context f10 = RobloxApplication.f();
        ae.b a10 = rh.h.a().e3() ? de.b.a(f10) : ae.c.a(f10);
        a10.c(hVar);
        Intrinsics.checkNotNullExpressionValue(a10, "apply(...)");
        splitInstallManager = a10;
    }

    public static final void j(n<? super Unit> nVar, AtomicBoolean atomicBoolean, boolean z10, String str) {
        if (nVar.b() && atomicBoolean.compareAndSet(false, true)) {
            if (z10) {
                Context f10 = RobloxApplication.f();
                Intrinsics.checkNotNullExpressionValue(f10, "getAppContext(...)");
                j.a(f10);
            }
            Log.i("rbx.featuredelivery", "awaitModuleInstalled: " + str + " installed");
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(Unit.f22894a));
        }
    }

    public static final boolean k(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ae.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        return bVar.e().contains(moduleName);
    }

    public static final void l(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ae.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        bVar.f(kotlin.collections.o.d(moduleName));
    }

    public static final void m(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (k(moduleName)) {
            Log.i("rbx.featuredelivery", "Module already installed: " + moduleName);
            return;
        }
        downloadRequestedAtMs.putIfAbsent(moduleName, Long.valueOf(SystemClock.elapsedRealtime()));
        ae.d b10 = ae.d.c().a(moduleName).b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        ae.b bVar = splitInstallManager;
        if (bVar == null) {
            Intrinsics.u("splitInstallManager");
            bVar = null;
        }
        Task<Integer> a10 = bVar.a(b10);
        final Function1 function1 = new Function1() { // from class: qh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit n10;
                n10 = h.n((Integer) obj);
                return n10;
            }
        };
        a10.g(new sb.g() { // from class: qh.e
            @Override // sb.g
            public final void onSuccess(Object obj) {
                h.o(Function1.this, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: qh.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                h.p(task);
            }
        }).e(new sb.f() { // from class: qh.g
            @Override // sb.f
            public final void onFailure(Exception exc) {
                h.q(exc);
            }
        });
    }

    public static final Unit n(Integer num) {
        Log.i("rbx.featuredelivery", "Module download started: " + num);
        return Unit.f22894a;
    }

    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void p(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.i("rbx.featuredelivery", "Module download completed");
    }

    public static final void q(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("rbx.featuredelivery", "Module download failed", e10);
    }

    public static final void r(@NotNull Map<String, ExpBackOffRetryPolicy> policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        retryPolicies = policies;
        retryCounts.clear();
        Iterator<T> it = policies.keySet().iterator();
        while (it.hasNext()) {
            retryCounts.put((String) it.next(), new AtomicInteger(0));
        }
    }

    public static final Unit u(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebRtcLoader.initialize(it);
        return Unit.f22894a;
    }

    public static /* synthetic */ void x(h hVar, String str, List list, int i10, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        hVar.w(str, list, i10, str2);
    }

    public static final boolean y() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, ae.f, qh.h$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object i(java.lang.String r9, boolean r10, mt.b r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qh.h.a
            if (r0 == 0) goto L13
            r0 = r11
            qh.h$a r0 = (qh.h.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            qh.h$a r0 = new qh.h$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f29852y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 0
            java.lang.String r4 = "splitInstallManager"
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 != r5) goto L3b
            java.lang.Object r9 = r0.f29849v
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            java.lang.Object r9 = r0.f29848u
            kotlin.jvm.internal.c0 r9 = (kotlin.jvm.internal.c0) r9
            java.lang.Object r10 = r0.f29847t
            java.lang.String r10 = (java.lang.String) r10
            gt.o.b(r11)     // Catch: java.lang.Throwable -> L38
            goto L9b
        L38:
            r10 = move-exception
            goto Lb0
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            gt.o.b(r11)
            kotlin.jvm.internal.c0 r11 = new kotlin.jvm.internal.c0
            r11.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = 0
            r2.<init>(r6)
            r0.f29847t = r9     // Catch: java.lang.Throwable -> L7b
            r0.f29848u = r11     // Catch: java.lang.Throwable -> L7b
            r0.f29849v = r2     // Catch: java.lang.Throwable -> L7b
            r0.f29850w = r10     // Catch: java.lang.Throwable -> L7b
            r0.f29851x = r6     // Catch: java.lang.Throwable -> L7b
            r0.A = r5     // Catch: java.lang.Throwable -> L7b
            ju.p r6 = new ju.p     // Catch: java.lang.Throwable -> L7b
            mt.b r7 = nt.b.c(r0)     // Catch: java.lang.Throwable -> L7b
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7b
            r6.F()     // Catch: java.lang.Throwable -> L7b
            qh.h$b r5 = new qh.h$b     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r9, r6, r2, r10)     // Catch: java.lang.Throwable -> L7b
            r11.f22963a = r5     // Catch: java.lang.Throwable -> L7b
            ae.b r7 = h()     // Catch: java.lang.Throwable -> L7b
            if (r7 != 0) goto L7e
            kotlin.jvm.internal.Intrinsics.u(r4)     // Catch: java.lang.Throwable -> L7b
            r7 = r3
            goto L7e
        L7b:
            r10 = move-exception
            r9 = r11
            goto Lb0
        L7e:
            r7.c(r5)     // Catch: java.lang.Throwable -> L7b
            boolean r5 = k(r9)     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L8a
            g(r6, r2, r10, r9)     // Catch: java.lang.Throwable -> L7b
        L8a:
            java.lang.Object r9 = r6.z()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r10 = nt.c.e()     // Catch: java.lang.Throwable -> L7b
            if (r9 != r10) goto L97
            ot.h.c(r0)     // Catch: java.lang.Throwable -> L7b
        L97:
            if (r9 != r1) goto L9a
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.f22963a
            ae.f r9 = (ae.f) r9
            if (r9 == 0) goto Lad
            ae.b r10 = qh.h.splitInstallManager
            if (r10 != 0) goto La9
            kotlin.jvm.internal.Intrinsics.u(r4)
            goto Laa
        La9:
            r3 = r10
        Laa:
            r3.b(r9)
        Lad:
            kotlin.Unit r9 = kotlin.Unit.f22894a
            return r9
        Lb0:
            T r9 = r9.f22963a
            ae.f r9 = (ae.f) r9
            if (r9 == 0) goto Lc2
            ae.b r11 = qh.h.splitInstallManager
            if (r11 != 0) goto Lbe
            kotlin.jvm.internal.Intrinsics.u(r4)
            goto Lbf
        Lbe:
            r3 = r11
        Lbf:
            r3.b(r9)
        Lc2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.h.i(java.lang.String, boolean, mt.b):java.lang.Object");
    }

    public final String s(List<String> moduleNames) {
        Long l10;
        Iterator<T> it = moduleNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                l10 = null;
                break;
            }
            l10 = downloadRequestedAtMs.remove((String) it.next());
            if (l10 != null) {
                break;
            }
        }
        if (l10 == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
        return elapsedRealtime < 5000 ? "lt5s" : elapsedRealtime < 15000 ? "5to15s" : elapsedRealtime < RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS ? "15to60s" : "gte60s";
    }

    public final void t() {
        Context f10 = RobloxApplication.f();
        Intrinsics.checkNotNull(f10);
        j.a(f10);
        String f11 = qh.b.f(f10, "robloxwebrtc", null, 4, null);
        if (f11 != null) {
            loadWebRtcLibrary.invoke(f11);
            x(this, "WebRtcLoadRequested", kotlin.collections.o.d("webrtcsdk"), 0, null, 12, null);
        } else {
            Log.w("rbx.featuredelivery", "Installed webrtcsdk but could not resolve librobloxwebrtc.so");
            x(this, "WebRtcResolvePathFailed", kotlin.collections.o.d("webrtcsdk"), 0, null, 12, null);
        }
    }

    @Override // vd.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull ae.e state) {
        Set set;
        AtomicInteger putIfAbsent;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.i()) {
            case 0:
                Log.i("rbx.featuredelivery", "Status: UNKNOWN for module " + state.f());
                List<String> f10 = state.f();
                Intrinsics.checkNotNullExpressionValue(f10, "moduleNames(...)");
                x(this, "Unknown", f10, 0, null, 12, null);
                break;
            case 1:
                Log.i("rbx.featuredelivery", "Status: PENDING for module " + state.f());
                List<String> f11 = state.f();
                Intrinsics.checkNotNullExpressionValue(f11, "moduleNames(...)");
                x(this, "Pending", f11, 0, null, 12, null);
                break;
            case 2:
                Log.i("rbx.featuredelivery", state.j() == 0 ? "Downloading " + state.f() : "Downloading " + state.f() + ", " + ((state.a() * 100) / state.j()) + "%");
                List<String> f12 = state.f();
                Intrinsics.checkNotNullExpressionValue(f12, "moduleNames(...)");
                x(this, "Downloading", f12, 0, null, 12, null);
                break;
            case 3:
                Log.i("rbx.featuredelivery", "Status: DOWNLOADED for module " + state.f());
                List<String> f13 = state.f();
                Intrinsics.checkNotNullExpressionValue(f13, "moduleNames(...)");
                x(this, "Downloaded", f13, 0, null, 12, null);
                break;
            case 4:
                Log.i("rbx.featuredelivery", "Installing " + state.f());
                List<String> f14 = state.f();
                Intrinsics.checkNotNullExpressionValue(f14, "moduleNames(...)");
                x(this, "Installing", f14, 0, null, 12, null);
                break;
            case 5:
                Log.i("rbx.featuredelivery", "Installed " + state.f());
                List<String> f15 = state.f();
                Intrinsics.checkNotNullExpressionValue(f15, "moduleNames(...)");
                List<String> f16 = state.f();
                Intrinsics.checkNotNullExpressionValue(f16, "moduleNames(...)");
                x(this, "Installed", f15, 0, s(f16), 4, null);
                if (rh.h.a().P3()) {
                    List<String> f17 = state.f();
                    Intrinsics.checkNotNullExpressionValue(f17, "moduleNames(...)");
                    Iterator<T> it = f17.iterator();
                    while (it.hasNext()) {
                        AtomicInteger atomicInteger = retryCounts.get((String) it.next());
                        if (atomicInteger != null) {
                            atomicInteger.set(0);
                        }
                    }
                }
                JNIAAssetManagerSetup.a(RobloxApplication.f());
                if (state.f().contains("webrtcsdk")) {
                    t();
                    break;
                }
                break;
            case 6:
                Log.e("rbx.featuredelivery", "Status: Failed for module " + state.f() + ", errorCode=" + state.c());
                List<String> f18 = state.f();
                Intrinsics.checkNotNullExpressionValue(f18, "moduleNames(...)");
                x(this, "Failed", f18, 0, null, 12, null);
                if (rh.h.a().P3()) {
                    List<String> f19 = state.f();
                    Intrinsics.checkNotNullExpressionValue(f19, "moduleNames(...)");
                    for (String str : f19) {
                        ExpBackOffRetryPolicy expBackOffRetryPolicy = retryPolicies.get(str);
                        if (expBackOffRetryPolicy != null) {
                            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = retryCounts;
                            AtomicInteger atomicInteger2 = concurrentHashMap.get(str);
                            if (atomicInteger2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger2 = new AtomicInteger(0)))) != null) {
                                atomicInteger2 = putIfAbsent;
                            }
                            AtomicInteger atomicInteger3 = atomicInteger2;
                            set = i.f29860a;
                            if (set.contains(Integer.valueOf(state.c()))) {
                                int andIncrement = atomicInteger3.getAndIncrement();
                                if (andIncrement < expBackOffRetryPolicy.getMaxRetries()) {
                                    long baseDelayMs = expBackOffRetryPolicy.getBaseDelayMs() * (1 << andIncrement);
                                    Log.i("rbx.featuredelivery", "Scheduling " + str + " retry #" + (andIncrement + 1) + " in " + baseDelayMs + "ms");
                                    ju.k.d(retryScope, null, null, new c(baseDelayMs, str, null), 3, null);
                                } else {
                                    Log.e("rbx.featuredelivery", str + ": max retries exhausted after " + andIncrement + " attempts");
                                    h hVar = f29840a;
                                    List<String> f20 = state.f();
                                    Intrinsics.checkNotNullExpressionValue(f20, "moduleNames(...)");
                                    x(hVar, "RetryExhausted", f20, andIncrement, null, 8, null);
                                }
                            } else {
                                Log.e("rbx.featuredelivery", str + ": non-retryable error " + state.c());
                                h hVar2 = f29840a;
                                List<String> f21 = state.f();
                                Intrinsics.checkNotNullExpressionValue(f21, "moduleNames(...)");
                                x(hVar2, "PermanentFailure", f21, 0, null, 12, null);
                            }
                        }
                    }
                    break;
                } else {
                    Log.i("rbx.featuredelivery", "Retry disabled globally via kill switch");
                    break;
                }
                break;
            case 7:
                Log.i("rbx.featuredelivery", "Status: CANCELED for module " + state.f());
                List<String> f22 = state.f();
                Intrinsics.checkNotNullExpressionValue(f22, "moduleNames(...)");
                x(this, "Canceled", f22, 0, null, 12, null);
                break;
            case 8:
                Log.i("rbx.featuredelivery", "REQUIRES_USER_CONFIRMATION is unsupported " + state.f());
                List<String> f23 = state.f();
                Intrinsics.checkNotNullExpressionValue(f23, "moduleNames(...)");
                x(this, "Requires User Confirmation", f23, 0, null, 12, null);
                break;
            case 9:
                Log.i("rbx.featuredelivery", "Status: CANCELING for module " + state.f());
                List<String> f24 = state.f();
                Intrinsics.checkNotNullExpressionValue(f24, "moduleNames(...)");
                x(this, "Canceling", f24, 0, null, 12, null);
                break;
        }
    }

    public final void w(String status, List<String> moduleNames, int retryAttempt, String installDurationBucket) {
        List<Pair<String, String>> x02;
        List<String> d10 = kotlin.collections.o.d(RobloxTelemetryEventConfig.POINTS_BACKEND);
        List<Pair<String, String>> n10 = rh.h.a().n5() ? p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)), new Pair("user_id", String.valueOf(dk.c.c().j()))) : p.n(new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.m0(moduleNames, ",", null, null, 0, null, null, 62, null)), new Pair("retry_attempt", String.valueOf(retryAttempt)));
        if (installDurationBucket != null && (x02 = CollectionsKt.x0(n10, new Pair("install_duration", installDurationBucket))) != null) {
            n10 = x02;
        }
        RobloxTelemetryEvent build = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(d10).setThrottlingHundredthPercentage(rh.h.a().S()).setEventName("roblox_feature_delivery").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(standardFields).setCustomStringFields(n10).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        LoggingProtocol.j(build);
    }
}
