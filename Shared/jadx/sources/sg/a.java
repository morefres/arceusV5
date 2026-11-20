package sg;

import androidx.core.view.MotionEventCompat;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import ek.q;
import gt.n;
import gt.o;
import java.lang.reflect.InvocationTargetException;
import ju.g1;
import ju.l0;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ot.m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, d2 = {"Lsg/a;", "", "Lju/l0;", "dispatcher", "", "controllerClassName", "Lkotlin/Function2;", "Lrl/i;", "Lrl/c;", "Lsg/i;", "nativeAdsHandlerFactory", "<init>", "(Lju/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lj/b;", "activity", "", rl.d.f30696a, "(Lj/b;)V", "e", "()V", "c", "(Lj/b;)Lrl/c;", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "Lkotlin/jvm/functions/Function2;", "Lju/p0;", "Lju/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String controllerClassName;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<rl.i, rl.c, i> nativeAdsHandlerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: sg.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0552a extends kotlin.jvm.internal.a implements Function2<rl.i, rl.c, i> {

        /* renamed from: h, reason: collision with root package name */
        public static final C0552a f31051h = new C0552a();

        public C0552a() {
            super(2, i.class, "<init>", "<init>(Lcom/roblox/universalapp/ads/ModuleInstaller;Lcom/roblox/universalapp/ads/GmaSdkController;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(rl.i p02, rl.c p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new i(p02, p12, null, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ads.AdsHelper$onCreate$1", f = "AdsHelper.kt", l = {MotionEventCompat.AXIS_GENERIC_8, 49}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31052t;

        /* renamed from: u, reason: collision with root package name */
        public Object f31053u;

        /* renamed from: v, reason: collision with root package name */
        public int f31054v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j.b f31056x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j.b bVar, mt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f31056x = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new c(this.f31056x, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f31054v
                r2 = 2
                r3 = 1
                java.lang.String r4 = "rbx.AdsHelper"
                if (r1 == 0) goto L38
                if (r1 == r3) goto L28
                if (r1 == r2) goto L18
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                java.lang.Object r0 = r7.f31053u
                sg.i r0 = (sg.i) r0
                java.lang.Object r1 = r7.f31052t
                rl.c r1 = (rl.c) r1
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L25
                goto La7
            L25:
                r8 = move-exception
                goto Lad
            L28:
                java.lang.Object r1 = r7.f31053u
                sg.i r1 = (sg.i) r1
                java.lang.Object r3 = r7.f31052t
                rl.c r3 = (rl.c) r3
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L34
                goto L76
            L34:
                r8 = move-exception
                r0 = r1
                goto Lad
            L38:
                gt.o.b(r8)
                sg.a r8 = sg.a.this
                j.b r1 = r7.f31056x
                rl.c r8 = sg.a.a(r8, r1)
                sg.a r1 = sg.a.this
                kotlin.jvm.functions.Function2 r1 = sg.a.b(r1)
                sg.f r5 = sg.f.f31066a
                java.lang.Object r1 = r1.invoke(r5, r8)
                sg.i r1 = (sg.i) r1
                rh.i r6 = rh.h.a()     // Catch: java.lang.Throwable -> L34
                boolean r6 = r6.i0()     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L95
                boolean r6 = r8 instanceof com.roblox.universalapp.ads.NoopGmaSdkController     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L95
                java.lang.String r6 = "gmasdk not installed; awaiting in-session install to activate ads"
                ek.q.h(r4, r6)     // Catch: java.lang.Throwable -> L34
                java.lang.Object r6 = ot.l.a(r8)     // Catch: java.lang.Throwable -> L34
                r7.f31052t = r6     // Catch: java.lang.Throwable -> L34
                r7.f31053u = r1     // Catch: java.lang.Throwable -> L34
                r7.f31054v = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r3 = r5.d(r7)     // Catch: java.lang.Throwable -> L34
                if (r3 != r0) goto L75
                goto La5
            L75:
                r3 = r8
            L76:
                sg.a r8 = sg.a.this     // Catch: java.lang.Throwable -> L34
                j.b r5 = r7.f31056x     // Catch: java.lang.Throwable -> L34
                rl.c r8 = sg.a.a(r8, r5)     // Catch: java.lang.Throwable -> L34
                boolean r5 = r8 instanceof com.roblox.universalapp.ads.NoopGmaSdkController     // Catch: java.lang.Throwable -> L34
                if (r5 != 0) goto L8b
                java.lang.String r5 = "Activated real LegacyGmaSdkController in-session; swapping into ads protocol"
                ek.q.h(r4, r5)     // Catch: java.lang.Throwable -> L34
                r1.n(r8)     // Catch: java.lang.Throwable -> L34
                goto L94
            L8b:
                java.lang.String r8 = "gmasdk installed but controller still unavailable; keeping no-op protocol"
                int r8 = ek.q.k(r4, r8)     // Catch: java.lang.Throwable -> L34
                ot.b.c(r8)     // Catch: java.lang.Throwable -> L34
            L94:
                r8 = r3
            L95:
                java.lang.Object r8 = ot.l.a(r8)     // Catch: java.lang.Throwable -> L34
                r7.f31052t = r8     // Catch: java.lang.Throwable -> L34
                r7.f31053u = r1     // Catch: java.lang.Throwable -> L34
                r7.f31054v = r2     // Catch: java.lang.Throwable -> L34
                java.lang.Object r8 = ju.z0.a(r7)     // Catch: java.lang.Throwable -> L34
                if (r8 != r0) goto La6
            La5:
                return r0
            La6:
                r0 = r1
            La7:
                gt.d r8 = new gt.d     // Catch: java.lang.Throwable -> L25
                r8.<init>()     // Catch: java.lang.Throwable -> L25
                throw r8     // Catch: java.lang.Throwable -> L25
            Lad:
                r0.i()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public final rl.c c(j.b activity) {
        Object b;
        String str;
        try {
            n.Companion companion = n.INSTANCE;
            Object newInstance = Class.forName(this.controllerClassName).getConstructor(j.b.class).newInstance(activity);
            Intrinsics.d(newInstance, "null cannot be cast to non-null type com.roblox.universalapp.ads.GmaSdkController");
            b = n.b((rl.c) newInstance);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        Throwable e10 = n.e(b);
        if (e10 != null) {
            if (e10 instanceof ClassNotFoundException) {
                str = "GmaSdkController not found. Ensure the GMA SDK module is included.";
            } else if (e10 instanceof NoSuchMethodException) {
                str = "Constructor GmaSdkController(AppCompatActivity) not found. Check class definition.";
            } else if ((e10 instanceof IllegalAccessException) || (e10 instanceof InstantiationException) || (e10 instanceof InvocationTargetException)) {
                str = "Failed to instantiate GmaSdkController: " + e10.getClass().getSimpleName();
            } else {
                str = "An unexpected error occurred while trying to create GmaSdkController";
            }
            q.f("rbx.AdsHelper", str, e10);
        }
        Throwable e11 = n.e(b);
        if (e11 != null) {
            b = new NoopGmaSdkController(e11 instanceof ClassNotFoundException ? "MODULE_NOT_INSTALLED" : "CONTROLLER_UNAVAILABLE");
        }
        return (rl.c) b;
    }

    public final void d(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ju.k.d(this.scope, null, null, new c(activity, null), 3, null);
    }

    public final void e() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull l0 dispatcher, @NotNull String controllerClassName, @NotNull Function2<? super rl.i, ? super rl.c, i> nativeAdsHandlerFactory) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(controllerClassName, "controllerClassName");
        Intrinsics.checkNotNullParameter(nativeAdsHandlerFactory, "nativeAdsHandlerFactory");
        this.controllerClassName = controllerClassName;
        this.nativeAdsHandlerFactory = nativeAdsHandlerFactory;
        this.scope = q0.a(dispatcher);
    }

    public /* synthetic */ a(l0 l0Var, String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.b() : l0Var, (i10 & 2) != 0 ? rh.h.a().W() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController" : str, (i10 & 4) != 0 ? C0552a.f31051h : function2);
    }
}
