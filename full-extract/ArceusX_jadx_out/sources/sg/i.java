package sg;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener;
import com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds;
import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import gt.n;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import ju.g1;
import ju.l0;
import ju.m0;
import ju.p0;
import ju.q0;
import ju.x;
import ju.z2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import sg.i;
import sl.GetQueryInfoError;
import tl.NativeAdsProgressData;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u0001:\u0001KB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)Jg\u00103\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u0010\u001cJ\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010'J[\u0010>\u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\b2\u001e\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0;H\u0002¢\u0006\u0004\b>\u0010?J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190A2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bB\u0010CJ-\u0010G\u001a\u00020\u000e2\u001c\u0010F\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D\u0012\u0006\u0012\u0004\u0018\u00010E0\bH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010\\\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190A0Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lsg/i;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;", "Lrl/i;", "moduleInstaller", "Lrl/c;", "gmaSdkController", "Lju/p0;", "scope", "Lkotlin/Function1;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "setPlatformImpl", "<init>", "(Lrl/i;Lrl/c;Lju/p0;Lkotlin/jvm/functions/Function1;)V", "controller", "", "n", "(Lrl/c;)V", "i", "()V", "", "eagerInstall", "install", "(Z)V", "", "id", "", "experimentVariant", "initialize", "(ILjava/lang/String;)V", "requestId", "initializeAdUnitId", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;)V", "adTracingId", "adUnitId", "loadInterstitialAd", "adResponseJson", "onServeInterstitialAdResponse", "onServeInterstitialAdFailed", "(Ljava/lang/String;)V", "getQueryInfo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adString", "durationNeededEnum", "", "durationNeededForRewardMs", "isEuUser", "creativeUrl", "uiExperimentData", "gmaAdType", "isClickable", "setAdString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "showAd", "cleanupAd", "destroyInterstitialAd", "Lrl/a;", "adFormat", "onSuccess", "Lkotlin/Function3;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "onFailure", "k", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lyt/n;)V", "queryInfo", "Lgt/n;", "o", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lmt/b;", "", "block", "j", "(Lkotlin/jvm/functions/Function1;)V", ve.a.f33391e, "Lrl/i;", j6.b.f21518e, "Lrl/c;", "c", "Lju/p0;", rl.d.f30696a, "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "f", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "nativeAdsCore", "Ljava/util/concurrent/ConcurrentHashMap;", "Lju/x;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "pendingServeAds", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i extends IPlatformNativeAds {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rl.i moduleInstaller;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile rl.c gmaSdkController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<i, INativeAdsCoreListener> setPlatformImpl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public INativeAdsCoreListener nativeAdsCore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<gt.n<String>>> pendingServeAds;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function1<IPlatformNativeAds, INativeAdsCoreListener> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31087a = new a();

        public a() {
            super(1, INativeAdsCoreListener.class, "setPlatformImpl", "setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final INativeAdsCoreListener invoke(IPlatformNativeAds iPlatformNativeAds) {
            return INativeAdsCoreListener.setPlatformImpl(iPlatformNativeAds);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31088a;

        static {
            int[] iArr = new int[rl.a.values().length];
            try {
                iArr[rl.a.f30692d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl.a.f30691c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31088a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$cleanupAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31089t;

        public d(mt.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31089t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            i.this.gmaSdkController.d();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$destroyInterstitialAd$1", f = "NativeAdsHandler.kt", l = {438}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31091t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31093v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f31093v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new e(this.f31093v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31091t;
            if (i10 == 0) {
                gt.o.b(obj);
                rl.c cVar = i.this.gmaSdkController;
                rl.a aVar = rl.a.f30692d;
                String str = this.f31093v;
                this.f31091t = 1;
                if (cVar.a(aVar, str, this) == e10) {
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
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$enqueue$1", f = "NativeAdsHandler.kt", l = {448}, m = "invokeSuspend", v = 1)
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31094t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<mt.b<? super Unit>, Object> f31095u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super mt.b<? super Unit>, ? extends Object> function1, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f31095u = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f31095u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31094t;
            if (i10 == 0) {
                gt.o.b(obj);
                Function1<mt.b<? super Unit>, Object> function1 = this.f31095u;
                this.f31094t = 1;
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
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31096t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31097u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31098v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f31099w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31100x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31101y;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"sg/i$g$a", "Lrl/j;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lsl/a;", "error", ve.a.f33391e, "(Lsl/a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31102a;
            public final /* synthetic */ boolean b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f31103c;

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: sg.i$g$a$a, reason: collision with other inner class name */
            public static final class C0554a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31104t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f31105u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ GetQueryInfoError f31106v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ i f31107w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ int f31108x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0554a(boolean z10, GetQueryInfoError getQueryInfoError, i iVar, int i10, mt.b<? super C0554a> bVar) {
                    super(1, bVar);
                    this.f31105u = z10;
                    this.f31106v = getQueryInfoError;
                    this.f31107w = iVar;
                    this.f31108x = i10;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new C0554a(this.f31105u, this.f31106v, this.f31107w, this.f31108x, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31104t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    if (this.f31105u) {
                        sg.b bVar = sg.b.f31057c;
                        String message = this.f31106v.getMessage();
                        if (message == null) {
                            message = "UNKNOWN";
                        }
                        sg.l.e(bVar, message);
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31107w.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f31108x, "");
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((C0554a) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31109t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f31110u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f31111v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f31112w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ String f31113x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z10, i iVar, int i10, String str, mt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31110u = z10;
                    this.f31111v = iVar;
                    this.f31112w = i10;
                    this.f31113x = str;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new b(this.f31110u, this.f31111v, this.f31112w, this.f31113x, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31109t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    if (this.f31110u) {
                        sg.l.e(sg.b.f31057c, "success");
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31111v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        int i10 = this.f31112w;
                        String str = this.f31113x;
                        if (str == null) {
                            str = "";
                        }
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, str);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            public a(i iVar, boolean z10, int i10) {
                this.f31102a = iVar;
                this.b = z10;
                this.f31103c = i10;
            }

            @Override // rl.j
            public void a(GetQueryInfoError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                i iVar = this.f31102a;
                iVar.j(new C0554a(this.b, error, iVar, this.f31103c, null));
            }

            @Override // rl.j
            public void onSuccess(String queryInfo) {
                i iVar = this.f31102a;
                iVar.j(new b(this.b, iVar, this.f31103c, queryInfo, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, i iVar, int i10, String str3, mt.b<? super g> bVar) {
            super(1, bVar);
            this.f31097u = str;
            this.f31098v = str2;
            this.f31099w = iVar;
            this.f31100x = i10;
            this.f31101y = str3;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new g(this.f31097u, this.f31098v, this.f31099w, this.f31100x, this.f31101y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31096t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            boolean z10 = Intrinsics.c(this.f31097u, "IsolatedRewarded") || Intrinsics.c(this.f31097u, "NonIsolatedRewarded");
            if (z10) {
                sg.l.f(b.b, null, 2, null);
            }
            if (this.f31098v.length() != 0) {
                this.f31099w.gmaSdkController.f(this.f31098v, this.f31101y, this.f31097u, new a(this.f31099w, z10, this.f31100x));
                return Unit.f22894a;
            }
            if (z10) {
                sg.l.e(b.f31057c, "MISSING_AD_TRACING_ID");
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f31099w.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f31100x, "");
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31114t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31116v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31117w;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1$1$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31118t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f31119u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f31120v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Boolean f31121w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f31122x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, int i10, Boolean bool, String str, mt.b<? super a> bVar) {
                super(1, bVar);
                this.f31119u = iVar;
                this.f31120v = i10;
                this.f31121w = bool;
                this.f31122x = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f31119u, this.f31120v, this.f31121w, this.f31122x, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f31118t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                INativeAdsCoreListener iNativeAdsCoreListener = this.f31119u.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    int i10 = this.f31120v;
                    Boolean bool = this.f31121w;
                    Intrinsics.checkNotNull(bool);
                    iNativeAdsCoreListener.onInitializeCompleted(i10, bool.booleanValue(), this.f31122x);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super Unit> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, mt.b<? super h> bVar) {
            super(1, bVar);
            this.f31116v = str;
            this.f31117w = i10;
        }

        public static final void r(i iVar, int i10, Boolean bool, String str) {
            iVar.j(new a(iVar, i10, bool, str, null));
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new h(this.f31116v, this.f31117w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31114t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            rl.c cVar = i.this.gmaSdkController;
            String str = this.f31116v;
            final i iVar = i.this;
            final int i10 = this.f31117w;
            cVar.i(str, new BiConsumer() { // from class: sg.j
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    i.h.r(i.this, i10, (Boolean) obj2, (String) obj3);
                }
            });
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1", f = "NativeAdsHandler.kt", l = {185, 198}, m = "invokeSuspend", v = 1)
    /* renamed from: sg.i$i, reason: collision with other inner class name */
    public static final class C0555i extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31123t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31125v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f31126w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0555i(String str, String str2, mt.b<? super C0555i> bVar) {
            super(1, bVar);
            this.f31125v = str;
            this.f31126w = str2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new C0555i(this.f31125v, this.f31126w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0056, code lost:
        
            if (r5.b(r1, r4) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        
            if (r5 == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r4.f31123t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                gt.o.b(r5)
                gt.n r5 = (gt.n) r5
                java.lang.Object r5 = r5.getValue()
                goto L88
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                gt.o.b(r5)
                goto L63
            L24:
                gt.o.b(r5)
                sg.i r5 = sg.i.this
                rl.c r5 = sg.i.d(r5)
                boolean r5 = r5 instanceof com.roblox.universalapp.ads.NoopGmaSdkController
                if (r5 == 0) goto L77
                boolean r5 = com.roblox.universalapp.ads.JNINativeAdsProtocol.getGmaSdkBackgroundInstallIxpEnabled()
                if (r5 != 0) goto L63
                java.lang.String r5 = "NativeAdsHandler"
                java.lang.String r1 = "gmasdk is not installed, trigger the installation"
                ek.q.h(r5, r1)
                rh.i r5 = rh.h.a()
                boolean r5 = r5.n1()
                if (r5 == 0) goto L59
                sg.i r5 = sg.i.this
                rl.i r5 = sg.i.e(r5)
                rl.i$a r1 = rl.i.a.b
                r4.f31123t = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L63
                goto L87
            L59:
                sg.i r5 = sg.i.this
                rl.i r5 = sg.i.e(r5)
                r0 = 0
                r5.a(r0)
            L63:
                sg.i r5 = sg.i.this
                com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener r5 = sg.i.f(r5)
                if (r5 == 0) goto L74
                java.lang.String r0 = r4.f31125v
                com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason r1 = com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason.NOTINSTALLED
                java.lang.String r2 = "gmasdk module not installed"
                r5.onInitializeSdkFailed(r0, r1, r2)
            L74:
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            L77:
                sg.i r5 = sg.i.this
                rl.c r5 = sg.i.d(r5)
                java.lang.String r1 = r4.f31126w
                r4.f31123t = r2
                java.lang.Object r5 = r5.k(r1, r4)
                if (r5 != r0) goto L88
            L87:
                return r0
            L88:
                sg.i r0 = sg.i.this
                java.lang.String r1 = r4.f31125v
                boolean r2 = gt.n.h(r5)
                if (r2 == 0) goto L9e
                r2 = r5
                kotlin.Unit r2 = (kotlin.Unit) r2
                com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener r0 = sg.i.f(r0)
                if (r0 == 0) goto L9e
                r0.onInitializeSdkSuccess(r1)
            L9e:
                sg.i r0 = sg.i.this
                java.lang.String r1 = r4.f31125v
                java.lang.Throwable r5 = gt.n.e(r5)
                if (r5 == 0) goto Lc9
                boolean r2 = r5 instanceof rl.b
                if (r2 == 0) goto Laf
                com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason r2 = com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason.NATIVESHUTTINGDOWN
                goto Lb8
            Laf:
                boolean r2 = r5 instanceof ju.e3
                if (r2 == 0) goto Lb6
                com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason r2 = com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason.TIMEDOUT
                goto Lb8
            Lb6:
                com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason r2 = com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason.UNDEFINED
            Lb8:
                com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener r0 = sg.i.f(r0)
                if (r0 == 0) goto Lc9
                java.lang.String r5 = r5.getMessage()
                if (r5 != 0) goto Lc6
                java.lang.String r5 = ""
            Lc6:
                r0.onInitializeSdkFailed(r1, r2, r5)
            Lc9:
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.i.C0555i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((C0555i) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$install$1", f = "NativeAdsHandler.kt", l = {157, 159}, m = "invokeSuspend", v = 1)
    public static final class j extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31127t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f31128u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31129v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, i iVar, mt.b<? super j> bVar) {
            super(1, bVar);
            this.f31128u = z10;
            this.f31129v = iVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new j(this.f31128u, this.f31129v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            if (r6.b(r1, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r6.b(r1, r5) == r0) goto L21;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r5.f31127t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                gt.o.b(r6)
                goto L73
            L1b:
                gt.o.b(r6)
                boolean r6 = com.roblox.universalapp.ads.JNINativeAdsProtocol.getGmaSdkBackgroundInstallIxpEnabled()
                if (r6 == 0) goto L68
                boolean r6 = qh.h.y()
                if (r6 == 0) goto L68
                boolean r6 = r5.f31128u
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "engine triggered gmasdk install, eager install: "
                r1.append(r4)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                java.lang.String r1 = "NativeAdsHandler"
                ek.q.h(r1, r6)
                boolean r6 = r5.f31128u
                if (r6 == 0) goto L57
                sg.i r6 = r5.f31129v
                rl.i r6 = sg.i.e(r6)
                rl.i$a r1 = rl.i.a.b
                r5.f31127t = r3
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L73
                goto L67
            L57:
                sg.i r6 = r5.f31129v
                rl.i r6 = sg.i.e(r6)
                rl.i$a r1 = rl.i.a.f30707a
                r5.f31127t = r2
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L73
            L67:
                return r0
            L68:
                sg.i r6 = r5.f31129v
                rl.i r6 = sg.i.e(r6)
                boolean r0 = r5.f31128u
                r6.a(r0)
            L73:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.i.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1", f = "NativeAdsHandler.kt", l = {235}, m = "invokeSuspend", v = 1)
    public static final class k extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31130t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31131u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ yt.n<String, LoadAdFailureReason, String, Unit> f31132v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f31133w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ rl.a f31134x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31135y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f31136z;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "queryInfo", "Lgt/n;", "<anonymous>", "(Ljava/lang/String;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1$1", f = "NativeAdsHandler.kt", l = {236}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function2<String, mt.b<? super gt.n<? extends String>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f31137t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31138u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i f31139v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ rl.a f31140w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f31141x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, rl.a aVar, String str, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f31139v = iVar;
                this.f31140w = aVar;
                this.f31141x = str;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f31139v, this.f31140w, this.f31141x, bVar);
                aVar.f31138u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object o8;
                String str = (String) this.f31138u;
                Object e10 = nt.c.e();
                int i10 = this.f31137t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    i iVar = this.f31139v;
                    rl.a aVar = this.f31140w;
                    String str2 = this.f31141x;
                    this.f31138u = ot.l.a(str);
                    this.f31137t = 1;
                    o8 = iVar.o(aVar, str2, str, this);
                    if (o8 == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    o8 = ((gt.n) obj).getValue();
                }
                return gt.n.a(o8);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, mt.b<? super gt.n<String>> bVar) {
                return ((a) create(str, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, yt.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> nVar, i iVar, rl.a aVar, String str2, Function1<? super String, Unit> function1, mt.b<? super k> bVar) {
            super(1, bVar);
            this.f31131u = str;
            this.f31132v = nVar;
            this.f31133w = iVar;
            this.f31134x = aVar;
            this.f31135y = str2;
            this.f31136z = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new k(this.f31131u, this.f31132v, this.f31133w, this.f31134x, this.f31135y, this.f31136z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object c10;
            LoadAdFailureReason a10;
            Object e10 = nt.c.e();
            int i10 = this.f31130t;
            if (i10 == 0) {
                gt.o.b(obj);
                if (this.f31131u.length() == 0) {
                    this.f31132v.invoke(this.f31131u, LoadAdFailureReason.ADTRACINGIDABSENT, "adTracingId is empty");
                    return Unit.f22894a;
                }
                rl.c cVar = this.f31133w.gmaSdkController;
                rl.a aVar = this.f31134x;
                String str = this.f31131u;
                String str2 = this.f31135y;
                a aVar2 = new a(this.f31133w, aVar, str, null);
                this.f31130t = 1;
                kVar = this;
                c10 = cVar.c(aVar, str, str2, aVar2, kVar);
                if (c10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                c10 = ((gt.n) obj).getValue();
                kVar = this;
            }
            Function1<String, Unit> function1 = kVar.f31136z;
            String str3 = kVar.f31131u;
            if (gt.n.h(c10)) {
                function1.invoke(str3);
            }
            yt.n<String, LoadAdFailureReason, String, Unit> nVar = kVar.f31132v;
            String str4 = kVar.f31131u;
            Throwable e11 = gt.n.e(c10);
            if (e11 != null) {
                if (e11 instanceof rl.b) {
                    a10 = LoadAdFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    rl.e eVar = e11 instanceof rl.e ? (rl.e) e11 : null;
                    a10 = rl.h.a(eVar != null ? eVar.getReason() : null);
                }
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                nVar.invoke(str4, a10, message);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$replaceNoopGmaSdkController$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31142t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ rl.c f31144v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(rl.c cVar, mt.b<? super l> bVar) {
            super(1, bVar);
            this.f31144v = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return i.this.new l(this.f31144v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31142t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            i.this.gmaSdkController = this.f31144v;
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler", f = "NativeAdsHandler.kt", l = {273}, m = "serveAd-BWLJW6A", v = 1)
    public static final class m extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f31145t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31146u;

        /* renamed from: v, reason: collision with root package name */
        public Object f31147v;

        /* renamed from: w, reason: collision with root package name */
        public Object f31148w;

        /* renamed from: x, reason: collision with root package name */
        public Object f31149x;

        /* renamed from: y, reason: collision with root package name */
        public Object f31150y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f31151z;

        public m(mt.b<? super m> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31151z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object o8 = i.this.o(null, null, null, this);
            return o8 == nt.c.e() ? o8 : gt.n.a(o8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$serveAd$2", f = "NativeAdsHandler.kt", l = {274}, m = "invokeSuspend", v = 1)
    public static final class n extends ot.m implements Function2<p0, mt.b<? super gt.n<? extends String>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31152t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<gt.n<String>> f31153u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(x<gt.n<String>> xVar, mt.b<? super n> bVar) {
            super(2, bVar);
            this.f31153u = xVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new n(this.f31153u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super gt.n<? extends String>> bVar) {
            return invoke2(p0Var, (mt.b<? super gt.n<String>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f31152t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            x<gt.n<String>> xVar = this.f31153u;
            this.f31152t = 1;
            Object w5 = xVar.w(this);
            return w5 == e10 ? e10 : w5;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super gt.n<String>> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends ot.m implements Function1<mt.b<? super Unit>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;

        /* renamed from: t, reason: collision with root package name */
        public int f31154t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31155u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31156v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31157w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f31158x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31159y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f31160z;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"sg/i$o$a", "Lrl/f;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31161a;
            public final /* synthetic */ int b;

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: sg.i$o$a$a, reason: collision with other inner class name */
            public static final class C0556a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31162t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31163u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31164v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f31165w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0556a(i iVar, int i10, String str, mt.b<? super C0556a> bVar) {
                    super(1, bVar);
                    this.f31163u = iVar;
                    this.f31164v = i10;
                    this.f31165w = str;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new C0556a(this.f31163u, this.f31164v, this.f31165w, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31162t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31163u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f31164v, false, this.f31165w);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((C0556a) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31166t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31167u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31168v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i iVar, int i10, mt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31167u = iVar;
                    this.f31168v = i10;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new b(this.f31167u, this.f31168v, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31166t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31167u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f31168v, true, "");
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            public a(i iVar, int i10) {
                this.f31161a = iVar;
                this.b = i10;
            }

            @Override // rl.f
            public void onFailure(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                i iVar = this.f31161a;
                iVar.j(new C0556a(iVar, this.b, errorMessage, null));
            }

            @Override // rl.f
            public void onSuccess() {
                i iVar = this.f31161a;
                iVar.j(new b(iVar, this.b, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, i iVar, int i10, long j10, String str2, boolean z10, String str3, String str4, boolean z11, String str5, String str6, String str7, mt.b<? super o> bVar) {
            super(1, bVar);
            this.f31155u = str;
            this.f31156v = iVar;
            this.f31157w = i10;
            this.f31158x = j10;
            this.f31159y = str2;
            this.f31160z = z10;
            this.A = str3;
            this.B = str4;
            this.C = z11;
            this.D = str5;
            this.E = str6;
            this.F = str7;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new o(this.f31155u, this.f31156v, this.f31157w, this.f31158x, this.f31159y, this.f31160z, this.A, this.B, this.C, this.D, this.E, this.F, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31154t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f31155u.length() == 0) {
                INativeAdsCoreListener iNativeAdsCoreListener = this.f31156v.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    iNativeAdsCoreListener.onSetAdStringCompleted(this.f31157w, false, "adTracingId is empty");
                }
                return Unit.f22894a;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                long j10 = this.f31158x;
                String str = this.f31159y;
                boolean z10 = this.f31160z;
                String str2 = this.A;
                String str3 = this.B;
                boolean z11 = this.C;
                String str4 = this.D;
                String str5 = this.E;
                String str6 = this.F;
                jSONObject.put("durationNeededForRewardMs", j10);
                jSONObject.put("durationNeededEnum", str);
                jSONObject.put("isEUUser", z10);
                jSONObject.put("moderationExternalCreativeUrl", str2);
                jSONObject.put("gmaAdType", str3);
                jSONObject.put("isClickable", z11);
                jSONObject.put("uiExperimentData", new JSONObject(str4));
                jSONObject.put("adString", str5);
                jSONObject.put("adUnitId", str6);
                this.f31156v.gmaSdkController.g(this.f31155u, jSONObject, new a(this.f31156v, this.f31157w));
                return Unit.f22894a;
            } catch (JSONException e10) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = this.f31156v.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onSetAdStringCompleted(this.f31157w, false, "setAdString failed to construct JSON - " + e10);
                }
                return Unit.f22894a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31169t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31170u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31171v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31172w;

        @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"sg/i$p$a", "Lrl/k;", "Ltl/c;", NotificationCompat.CATEGORY_STATUS, "", "watchDuration", "", rl.d.f30696a, "(Ltl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "c", "(Ljava/lang/String;Z)V", "Ltl/b;", "progressData", ve.a.f33391e, "(Ltl/b;)V", "reasonKey", "description", j6.b.f21518e, "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.k {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31173a;
            public final /* synthetic */ int b;

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: sg.i$p$a$a, reason: collision with other inner class name */
            public static final class C0557a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31174t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31175u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ NativeAdsProgressData f31176v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0557a(i iVar, NativeAdsProgressData nativeAdsProgressData, mt.b<? super C0557a> bVar) {
                    super(1, bVar);
                    this.f31175u = iVar;
                    this.f31176v = nativeAdsProgressData;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new C0557a(this.f31175u, this.f31176v, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31174t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31175u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onAdProgress((float) this.f31176v.getAdProgress(), (float) this.f31176v.getVideoDuration(), this.f31176v.getPrice(), this.f31176v.getPricePrecisionType(), this.f31176v.getPriceCurrencyCode());
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((C0557a) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onCtaClicked$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31177t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f31178u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f31179v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f31180w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, i iVar, boolean z10, mt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31178u = str;
                    this.f31179v = iVar;
                    this.f31180w = z10;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new b(this.f31178u, this.f31179v, this.f31180w, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31177t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    ek.q.h("NativeAdsHandler", "cta clicked");
                    String str = this.f31178u;
                    if (str == null) {
                        ek.q.e("NativeAdsHandler", "Invalid ad type, cannot log click");
                        return Unit.f22894a;
                    }
                    String str2 = Intrinsics.c(str, "AppPromo") ? "AppPromo" : "ClickOut";
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31179v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onCtaClick(str2, this.f31180w);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onPlayBackEnded$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class c extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31181t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31182u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31183v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ tl.c f31184w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f31185x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(i iVar, int i10, tl.c cVar, float f10, mt.b<? super c> bVar) {
                    super(1, bVar);
                    this.f31182u = iVar;
                    this.f31183v = i10;
                    this.f31184w = cVar;
                    this.f31185x = f10;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new c(this.f31182u, this.f31183v, this.f31184w, this.f31185x, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31181t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31182u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onShowAdCompleted(this.f31183v, this.f31184w.getValue(), this.f31185x);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((c) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onUserReportAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class d extends ot.m implements Function1<mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f31186t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31187u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f31188v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f31189w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(i iVar, String str, String str2, mt.b<? super d> bVar) {
                    super(1, bVar);
                    this.f31187u = iVar;
                    this.f31188v = str;
                    this.f31189w = str2;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new d(this.f31187u, this.f31188v, this.f31189w, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    nt.c.e();
                    if (this.f31186t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31187u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onReportAd(this.f31188v, this.f31189w);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super Unit> bVar) {
                    return ((d) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            public a(i iVar, int i10) {
                this.f31173a = iVar;
                this.b = i10;
            }

            @Override // rl.k
            public void a(NativeAdsProgressData progressData) {
                Intrinsics.checkNotNullParameter(progressData, "progressData");
                i iVar = this.f31173a;
                iVar.j(new C0557a(iVar, progressData, null));
            }

            @Override // rl.k
            public void b(String reasonKey, String description) {
                Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
                Intrinsics.checkNotNullParameter(description, "description");
                i iVar = this.f31173a;
                iVar.j(new d(iVar, reasonKey, description, null));
            }

            @Override // rl.k
            public void c(String gmaAdType, boolean isEndCardVisible) {
                i iVar = this.f31173a;
                iVar.j(new b(gmaAdType, iVar, isEndCardVisible, null));
            }

            @Override // rl.k
            public void d(tl.c status, float watchDuration) {
                Intrinsics.checkNotNullParameter(status, "status");
                i iVar = this.f31173a;
                iVar.j(new c(iVar, this.b, status, watchDuration, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, i iVar, int i10, mt.b<? super p> bVar) {
            super(1, bVar);
            this.f31170u = str;
            this.f31171v = iVar;
            this.f31172w = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new p(this.f31170u, this.f31171v, this.f31172w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31169t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f31170u.length() != 0) {
                this.f31171v.gmaSdkController.b(this.f31170u, new a(this.f31171v, this.f31172w));
                return Unit.f22894a;
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f31171v.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onShowAdCompleted(this.f31172w, tl.c.f32315f.getValue(), 0.0f);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"sg/i$q", "Lkotlin/coroutines/a;", "Lju/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class q extends kotlin.coroutines.a implements m0 {
        public q(m0.Companion companion) {
            super(companion);
        }

        @Override // ju.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            ek.q.f("NativeAdsHandler", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull rl.i moduleInstaller, @NotNull rl.c gmaSdkController, @NotNull p0 scope, @NotNull Function1<? super i, ? extends INativeAdsCoreListener> setPlatformImpl) {
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(gmaSdkController, "gmaSdkController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(setPlatformImpl, "setPlatformImpl");
        this.moduleInstaller = moduleInstaller;
        this.gmaSdkController = gmaSdkController;
        this.scope = scope;
        this.setPlatformImpl = setPlatformImpl;
        this.cleanedUp = new AtomicBoolean(false);
        this.pendingServeAds = new ConcurrentHashMap<>();
        this.nativeAdsCore = (INativeAdsCoreListener) setPlatformImpl.invoke(this);
    }

    public static final Unit l(i iVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INativeAdsCoreListener iNativeAdsCoreListener = iVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdSuccess(it);
        }
        return Unit.f22894a;
    }

    public static final Unit m(i iVar, String id2, LoadAdFailureReason reason, String message) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        INativeAdsCoreListener iNativeAdsCoreListener = iVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdFailed(id2, reason, message);
        }
        return Unit.f22894a;
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void cleanupAd() {
        j(new d(null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void destroyInterstitialAd(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        j(new e(adTracingId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void getQueryInfo(int id2, @NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        j(new g(experimentVariant, adTracingId, this, id2, adUnitId, null));
    }

    public final void i() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            ek.q.e("NativeAdsHandler", "cleanup() called more than once");
            return;
        }
        ek.q.h("NativeAdsHandler", "cleanup");
        this.setPlatformImpl.invoke(null);
        this.nativeAdsCore = null;
        this.gmaSdkController.destroy();
        q0.f(this.scope, null, 1, null);
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initialize(int id2, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        j(new h(experimentVariant, id2, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initializeSdk(@NotNull String requestId, @NotNull String initializeAdUnitId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(initializeAdUnitId, "initializeAdUnitId");
        j(new C0555i(requestId, initializeAdUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void install(boolean eagerInstall) {
        j(new j(eagerInstall, this, null));
    }

    public final void j(Function1<? super mt.b<? super Unit>, ? extends Object> block) {
        if (q0.i(this.scope)) {
            ju.k.d(this.scope, null, null, new f(block, null), 3, null);
        } else {
            ek.q.e("NativeAdsHandler", "Failed to enqueue ads task");
        }
    }

    public final void k(rl.a adFormat, String adTracingId, String adUnitId, Function1<? super String, Unit> onSuccess, yt.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> onFailure) {
        j(new k(adTracingId, onFailure, this, adFormat, adUnitId, onSuccess, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void loadInterstitialAd(@NotNull String adTracingId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        k(rl.a.f30692d, adTracingId, adUnitId, new Function1() { // from class: sg.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = i.l(i.this, (String) obj);
                return l10;
            }
        }, new yt.n() { // from class: sg.h
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit m10;
                m10 = i.m(i.this, (String) obj, (LoadAdFailureReason) obj2, (String) obj3);
                return m10;
            }
        });
    }

    public final void n(@NotNull rl.c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        rl.c cVar = this.gmaSdkController;
        if ((cVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            j(new l(controller, null));
            return;
        }
        ek.q.e("NativeAdsHandler", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + cVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(rl.a r10, java.lang.String r11, java.lang.String r12, mt.b<? super gt.n<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.i.o(rl.a, java.lang.String, java.lang.String, mt.b):java.lang.Object");
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdFailed(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        x<gt.n<String>> remove = this.pendingServeAds.remove(adTracingId);
        if (remove != null) {
            n.Companion companion = gt.n.INSTANCE;
            remove.r(gt.n.a(gt.n.b(gt.o.a(new RuntimeException("serveAd failed")))));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdResponse(@NotNull String adTracingId, @NotNull String adResponseJson) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adResponseJson, "adResponseJson");
        x<gt.n<String>> remove = this.pendingServeAds.remove(adTracingId);
        if (remove != null) {
            remove.r(gt.n.a(gt.n.b(adResponseJson)));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void setAdString(int id2, @NotNull String adTracingId, @NotNull String adUnitId, @NotNull String adString, @NotNull String durationNeededEnum, long durationNeededForRewardMs, boolean isEuUser, @NotNull String creativeUrl, @NotNull String uiExperimentData, @NotNull String gmaAdType, boolean isClickable) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adString, "adString");
        Intrinsics.checkNotNullParameter(durationNeededEnum, "durationNeededEnum");
        Intrinsics.checkNotNullParameter(creativeUrl, "creativeUrl");
        Intrinsics.checkNotNullParameter(uiExperimentData, "uiExperimentData");
        Intrinsics.checkNotNullParameter(gmaAdType, "gmaAdType");
        j(new o(adTracingId, this, id2, durationNeededForRewardMs, durationNeededEnum, isEuUser, creativeUrl, gmaAdType, isClickable, uiExperimentData, adString, adUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void showAd(int id2, @NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        j(new p(adTracingId, this, id2, null));
    }

    public /* synthetic */ i(rl.i iVar, rl.c cVar, p0 p0Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, null) : cVar, (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.U(g1.a(), 1, null, 2, null)).plus(new q(m0.INSTANCE))) : p0Var, (i10 & 8) != 0 ? a.f31087a : function1);
    }
}
