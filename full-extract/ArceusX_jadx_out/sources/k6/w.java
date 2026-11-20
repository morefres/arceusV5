package k6;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import e7.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ju.p0;
import ju.q0;
import ju.w0;
import k6.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;
import y6.Size;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b2\u0010;*\u0004\b<\u0010=R\u001d\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010@*\u0004\bA\u0010=R\u000b\u0010\u000f\u001a\u00020C8\u0002X\u0082\u0004¨\u0006D"}, d2 = {"Lk6/w;", "Lk6/s;", "Lk6/w$a;", "options", "<init>", "(Lk6/w$a;)V", "Lx6/g;", "request", "Lx6/d;", "c", "(Lx6/g;)Lx6/d;", "Lx6/k;", rl.d.f30696a, "(Lx6/g;Lmt/b;)Ljava/lang/Object;", "", "shutdown", "()V", "initialRequest", "", Payload.TYPE, "g", "(Lx6/g;ILmt/b;)Ljava/lang/Object;", "Lx6/t;", "result", "Lb7/c;", "target", "Lk6/j;", "eventListener", "l", "(Lx6/t;Lb7/c;Lk6/j;)V", "Lx6/e;", "k", "(Lx6/e;Lb7/c;Lk6/j;)V", "j", "(Lx6/g;Lk6/j;)V", ve.a.f33391e, "Lk6/w$a;", "h", "()Lk6/w$a;", "Lju/p0;", j6.b.f21518e, "Lju/p0;", "scope", "Le7/d0;", "Le7/d0;", "systemCallbacks", "Lx6/r;", "Lx6/r;", "requestService", "Lk6/h;", "e", "Lk6/h;", "getComponents", "()Lk6/h;", "components", "Lx6/g$b;", "()Lx6/g$b;", "defaults", "Ls6/d;", "()Ls6/d;", "getMemoryCache$delegate", "(Lk6/w;)Ljava/lang/Object;", "memoryCache", "Ln6/a;", "()Ln6/a;", "getDiskCache$delegate", "diskCache", "Lkotlinx/atomicfu/AtomicBoolean;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22403g = AtomicIntegerFieldUpdater.newUpdater(w.class, "f");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Options options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e7.d0 systemCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x6.r requestService;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h components;

    /* renamed from: f, reason: collision with root package name */
    public volatile /* synthetic */ int f22408f;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Lk6/w$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lx6/g$b;", "defaults", "Lgt/h;", "Lkotlin/coroutines/CoroutineContext;", "mainCoroutineContextLazy", "Ls6/d;", "memoryCacheLazy", "Ln6/a;", "diskCacheLazy", "Lk6/j$c;", "eventListenerFactory", "Lk6/h;", "componentRegistry", "Le7/u;", "logger", "<init>", "(Landroid/content/Context;Lx6/g$b;Lgt/h;Lgt/h;Lgt/h;Lk6/j$c;Lk6/h;Le7/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Landroid/content/Context;", "()Landroid/content/Context;", j6.b.f21518e, "Lx6/g$b;", "c", "()Lx6/g$b;", "Lgt/h;", "g", "()Lgt/h;", rl.d.f30696a, "h", "e", "f", "Lk6/j$c;", "()Lk6/j$c;", "Lk6/h;", "()Lk6/h;", "Le7/u;", "()Le7/u;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: k6.w$a, reason: from toString */
    public static final /* data */ class Options {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Context application;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ImageRequest.Defaults defaults;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final gt.h<CoroutineContext> mainCoroutineContextLazy;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final gt.h<s6.d> memoryCacheLazy;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final gt.h<n6.a> diskCacheLazy;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final j.c eventListenerFactory;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final h componentRegistry;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final e7.u logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Options(@NotNull Context context, @NotNull ImageRequest.Defaults defaults, @NotNull gt.h<? extends CoroutineContext> hVar, @NotNull gt.h<? extends s6.d> hVar2, @NotNull gt.h<? extends n6.a> hVar3, @NotNull j.c cVar, @NotNull h hVar4, @Nullable e7.u uVar) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = hVar;
            this.memoryCacheLazy = hVar2;
            this.diskCacheLazy = hVar3;
            this.eventListenerFactory = cVar;
            this.componentRegistry = hVar4;
            this.logger = uVar;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final h getComponentRegistry() {
            return this.componentRegistry;
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        @NotNull
        public final gt.h<n6.a> d() {
            return this.diskCacheLazy;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final j.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.c(this.application, options.application) && Intrinsics.c(this.defaults, options.defaults) && Intrinsics.c(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && Intrinsics.c(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.c(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.c(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.c(this.componentRegistry, options.componentRegistry) && Intrinsics.c(this.logger, options.logger);
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final e7.u getLogger() {
            return this.logger;
        }

        @NotNull
        public final gt.h<CoroutineContext> g() {
            return this.mainCoroutineContextLazy;
        }

        @NotNull
        public final gt.h<s6.d> h() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            e7.u uVar = this.logger;
            return hashCode + (uVar == null ? 0 : uVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/k;", "<anonymous>", "(Lju/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<p0, mt.b<? super x6.k>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22416t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22418v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f22418v = imageRequest;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return w.this.new b(this.f22418v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22416t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = w.this;
            ImageRequest imageRequest = this.f22418v;
            this.f22416t = 1;
            Object g10 = wVar.g(imageRequest, 0, this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super x6.k> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/k;", "<anonymous>", "(Lju/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<p0, mt.b<? super x6.k>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f22419t;

        /* renamed from: u, reason: collision with root package name */
        public int f22420u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22421v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22423x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/k;", "<anonymous>", "(Lju/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<p0, mt.b<? super x6.k>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f22424t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f22425u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ImageRequest f22426v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, ImageRequest imageRequest, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f22425u = wVar;
                this.f22426v = imageRequest;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f22425u, this.f22426v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f22424t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                w wVar = this.f22425u;
                ImageRequest imageRequest = this.f22426v;
                this.f22424t = 1;
                Object g10 = wVar.g(imageRequest, 1, this);
                return g10 == e10 ? e10 : g10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super x6.k> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f22423x = imageRequest;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = w.this.new c(this.f22423x, bVar);
            cVar.f22421v = obj;
            return cVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            w0 b;
            p0 p0Var = (p0) this.f22421v;
            Object e10 = nt.c.e();
            int i10 = this.f22420u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            b = ju.k.b(p0Var, w.this.getOptions().g().getValue(), null, new a(w.this, this.f22423x, null), 2, null);
            w0<x6.k> b10 = a0.c(this.f22423x, b).b();
            this.f22421v = ot.l.a(p0Var);
            this.f22419t = ot.l.a(b);
            this.f22420u = 1;
            Object w5 = b10.w(this);
            return w5 == e10 ? e10 : w5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super x6.k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
    public static final class d extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f22427t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22428u;

        /* renamed from: v, reason: collision with root package name */
        public Object f22429v;

        /* renamed from: w, reason: collision with root package name */
        public Object f22430w;

        /* renamed from: x, reason: collision with root package name */
        public Object f22431x;

        /* renamed from: y, reason: collision with root package name */
        public Object f22432y;

        /* renamed from: z, reason: collision with root package name */
        public Object f22433z;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return w.this.g(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lx6/k;", "<anonymous>", "(Lju/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<p0, mt.b<? super x6.k>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22434t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22435u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ w f22436v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Size f22437w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j f22438x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ n f22439y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, w wVar, Size size, j jVar, n nVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f22435u = imageRequest;
            this.f22436v = wVar;
            this.f22437w = size;
            this.f22438x = jVar;
            this.f22439y = nVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f22435u, this.f22436v, this.f22437w, this.f22438x, this.f22439y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22434t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            p6.e eVar = new p6.e(this.f22435u, this.f22436v.getComponents().g(), 0, this.f22435u, this.f22437w, this.f22438x, this.f22439y != null);
            this.f22434t = 1;
            Object g10 = eVar.g(this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super x6.k> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public w(@NotNull Options options) {
        p0 c10;
        this.options = options;
        c10 = z.c(options.getLogger());
        this.scope = c10;
        e7.d0 a10 = e7.e0.a(this);
        this.systemCallbacks = a10;
        x6.r a11 = x6.s.a(this, a10, options.getLogger());
        this.requestService = a11;
        options.h();
        options.d();
        this.components = z.e(c0.a(b0.a(a0.a(z.f(options.getComponentRegistry().k(), options), options), options), options)).i(new p6.a(this, a10, a11, options.getLogger())).p();
    }

    @Override // k6.s
    @NotNull
    public ImageRequest.Defaults a() {
        return this.options.getDefaults();
    }

    @Override // k6.s
    @Nullable
    public n6.a b() {
        return this.options.d().getValue();
    }

    @Override // k6.s
    @NotNull
    public x6.d c(@NotNull ImageRequest request) {
        w0 b10;
        b10 = ju.k.b(this.scope, this.options.g().getValue(), null, new b(request, null), 2, null);
        return a0.c(request, b10);
    }

    @Override // k6.s
    @Nullable
    public Object d(@NotNull ImageRequest imageRequest, @NotNull mt.b<? super x6.k> bVar) {
        return !a0.d(imageRequest) ? g(imageRequest, 1, bVar) : q0.g(new c(imageRequest, null), bVar);
    }

    @Override // k6.s
    @Nullable
    public s6.d e() {
        return this.options.h().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x0054, B:15:0x01a8, B:17:0x01ae, B:21:0x01b9, B:23:0x01bd, B:24:0x01cb, B:25:0x01d0), top: B:13:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x0054, B:15:0x01a8, B:17:0x01ae, B:21:0x01b9, B:23:0x01bd, B:24:0x01cb, B:25:0x01d0), top: B:13:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110 A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:60:0x0109, B:62:0x0110, B:64:0x0116, B:66:0x011c, B:67:0x0120, B:70:0x0128, B:71:0x012e, B:73:0x0131, B:75:0x013a, B:76:0x013d, B:87:0x00d8, B:89:0x00e4, B:91:0x00e9, B:95:0x01d7, B:96:0x01dc), top: B:86:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:60:0x0109, B:62:0x0110, B:64:0x0116, B:66:0x011c, B:67:0x0120, B:70:0x0128, B:71:0x012e, B:73:0x0131, B:75:0x013a, B:76:0x013d, B:87:0x00d8, B:89:0x00e4, B:91:0x00e9, B:95:0x01d7, B:96:0x01dc), top: B:86:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(x6.ImageRequest r17, int r18, mt.b<? super x6.k> r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.w.g(x6.g, int, mt.b):java.lang.Object");
    }

    @Override // k6.s
    @NotNull
    public h getComponents() {
        return this.components;
    }

    @NotNull
    /* renamed from: h, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    public final void j(ImageRequest request, j eventListener) {
        e7.u logger = this.options.getLogger();
        if (logger != null) {
            u.a aVar = u.a.f15729c;
            if (logger.a().compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.d(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.d(request);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(x6.ErrorResult r7, b7.c r8, k6.j r9) {
        /*
            r6 = this;
            x6.g r0 = r7.getRequest()
            k6.w$a r1 = r6.options
            e7.u r1 = r1.getLogger()
            if (r1 == 0) goto L36
            java.lang.Throwable r2 = r7.getThrowable()
            e7.u$a r3 = r1.a()
            e7.u$a r4 = e7.u.a.f15731e
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "🚨 Failed - "
            r3.append(r5)
            java.lang.Object r5 = r0.getData()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "RealImageLoader"
            r1.b(r5, r4, r3, r2)
        L36:
            boolean r1 = r8 instanceof d7.e
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            x6.g r1 = r7.getRequest()
            d7.d$a r1 = x6.j.o(r1)
            r2 = r8
            d7.e r2 = (d7.e) r2
            d7.d r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof d7.c
            if (r2 == 0) goto L58
        L50:
            k6.n r1 = r7.getImage()
            r8.a(r1)
            goto L69
        L58:
            x6.g r8 = r7.getRequest()
            r9.r(r8, r1)
            r1.a()
            x6.g r8 = r7.getRequest()
            r9.q(r8, r1)
        L69:
            r9.c(r0, r7)
            x6.g$d r8 = r0.getListener()
            if (r8 == 0) goto L75
            r8.c(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.w.k(x6.e, b7.c, k6.j):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(x6.SuccessResult r7, b7.c r8, k6.j r9) {
        /*
            r6 = this;
            x6.g r0 = r7.getRequest()
            m6.f r1 = r7.getDataSource()
            k6.w$a r2 = r6.options
            e7.u r2 = r2.getLogger()
            if (r2 == 0) goto L4a
            e7.u$a r3 = e7.u.a.f15729c
            e7.u$a r4 = r2.a()
            int r4 = r4.compareTo(r3)
            if (r4 > 0) goto L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = e7.h0.l(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.getData()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.b(r5, r3, r1, r4)
        L4a:
            boolean r1 = r8 instanceof d7.e
            if (r1 != 0) goto L51
            if (r8 == 0) goto L7d
            goto L64
        L51:
            x6.g r1 = r7.getRequest()
            d7.d$a r1 = x6.j.o(r1)
            r2 = r8
            d7.e r2 = (d7.e) r2
            d7.d r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof d7.c
            if (r2 == 0) goto L6c
        L64:
            k6.n r1 = r7.getImage()
            r8.c(r1)
            goto L7d
        L6c:
            x6.g r8 = r7.getRequest()
            r9.r(r8, r1)
            r1.a()
            x6.g r8 = r7.getRequest()
            r9.q(r8, r1)
        L7d:
            r9.b(r0, r7)
            x6.g$d r8 = r0.getListener()
            if (r8 == 0) goto L89
            r8.b(r0, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.w.l(x6.t, b7.c, k6.j):void");
    }

    @Override // k6.s
    public void shutdown() {
        if (f22403g.getAndSet(this, 1) == 1) {
            return;
        }
        q0.f(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        s6.d e10 = e();
        if (e10 != null) {
            e10.clear();
        }
    }
}
