package sq;

import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import eo.z;
import gt.o;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.r0;
import nq.e;
import nt.c;
import org.jetbrains.annotations.NotNull;
import ot.f;
import ot.m;
import rl.d;
import uo.ScreenState;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR*\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&\"\u0004\b\u001e\u0010'R\u0011\u0010)\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010(¨\u0006*"}, d2 = {"Lsq/a;", "", "Lnq/e;", "externalInquiryController", "Leo/e;", "featureFlagManager", "Lju/p0;", "coroutineScope", "<init>", "(Lnq/e;Leo/e;Lju/p0;)V", "", "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "shouldShowHelpButton", "", "c", "(ZZZZ)V", "f", "()V", ve.a.f33391e, "Lnq/e;", j6.b.f21518e, "Leo/e;", "Lju/p0;", "Lmu/c0;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", d.f30696a, "Lmu/c0;", "navigationStateFlow", "e", "Z", "g", "isNavigationEnabled", "h", "value", "i", "isTransitioningBack", "()Z", "(Z)V", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e externalInquiryController;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<NavigationState> navigationStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowBackButton;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowCancelButton;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isNavigationEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowHelpButton;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isTransitioningBack;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", f = "NavigationStateManager.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: sq.a$a, reason: collision with other inner class name */
    public static final class C0562a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31639t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ NavigationState f31641v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0562a(NavigationState navigationState, mt.b<? super C0562a> bVar) {
            super(2, bVar);
            this.f31641v = navigationState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new C0562a(this.f31641v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f31639t;
            if (i10 == 0) {
                o.b(obj);
                c0<ScreenState> b = a.this.externalInquiryController.b();
                ScreenState screenState = new ScreenState(this.f31641v.getShowBackButton(), this.f31641v.getShowCancelButton(), this.f31641v.getIsNavigationEnabled(), this.f31641v.getShowHelpButton());
                this.f31639t = 1;
                if (b.emit(screenState, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((C0562a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a(@NotNull e externalInquiryController, @NotNull eo.e featureFlagManager, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.externalInquiryController = externalInquiryController;
        this.featureFlagManager = featureFlagManager;
        this.coroutineScope = coroutineScope;
        this.navigationStateFlow = r0.a(new NavigationState(true, true, externalInquiryController.d(), true, true, true));
        this.isNavigationEnabled = true;
    }

    public static /* synthetic */ void d(a aVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        aVar.c(z10, z11, z12, z13);
    }

    @NotNull
    public final NavigationState b() {
        return this.navigationStateFlow.getValue();
    }

    public final void c(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled, boolean shouldShowHelpButton) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        this.shouldShowHelpButton = shouldShowHelpButton && this.featureFlagManager.d(z.f16127a);
        f();
    }

    public final void e(boolean z10) {
        this.isTransitioningBack = z10;
        f();
    }

    public final void f() {
        NavigationState navigationState = new NavigationState(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.d(), this.externalInquiryController.e(), this.isNavigationEnabled && !this.isTransitioningBack, this.shouldShowHelpButton);
        if (Intrinsics.c(this.navigationStateFlow.getValue(), navigationState)) {
            return;
        }
        this.navigationStateFlow.setValue(navigationState);
        k.d(this.coroutineScope, null, null, new C0562a(navigationState, null), 3, null);
    }
}
