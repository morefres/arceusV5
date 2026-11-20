package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import android.view.l0;
import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import gt.l;
import gt.o;
import java.util.List;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import vo.BrowserSelection;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u000256BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J5\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'0%0$2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lju/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lsq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lju/p0;)V", "props", "p", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "renderProps", "renderState", "", "s", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", NotificationCompat.CATEGORY_EVENT, "v", "(Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "q", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;)V", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "n", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Ljava/util/List;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lsq/a;", "h", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "c", j6.b.f21518e, "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends tr.c<IntegrationWorkflow.Input, IntegrationWorkflow.State, IntegrationWorkflow.b, IntegrationView> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.InterfaceC0209a integrationBrowserWorkerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager$2", f = "IntegrationStepStateManager.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11231t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$a$a, reason: collision with other inner class name */
        public static final class C0213a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f11233a;

            public C0213a(b bVar) {
                this.f11233a = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(IntegrationWorkflow.Input input, mt.b<? super Unit> bVar) {
                b bVar2 = this.f11233a;
                IntegrationWorkflow.State i10 = bVar2.d().i();
                if (i10 == null) {
                    return Unit.f22894a;
                }
                bVar2.s(input, i10);
                return Unit.f22894a;
            }
        }

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11231t;
            if (i10 == 0) {
                o.b(obj);
                c0<IntegrationWorkflow.Input> b = b.this.b();
                C0213a c0213a = new C0213a(b.this);
                this.f11231t = 1;
                if (b.collect(c0213a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "", ve.a.f33391e, j6.b.f21518e, "c", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b, reason: collision with other inner class name */
    public interface InterfaceC0214b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$a */
        public static final /* data */ class a implements InterfaceC0214b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f11234a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1679929975;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0215b implements InterfaceC0214b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0215b f11235a = new C0215b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0215b);
            }

            public int hashCode() {
                return 523949724;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$c */
        public static final /* data */ class c implements InterfaceC0214b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f11236a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -323947876;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;", "", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        b a(@NotNull IntegrationWorkflow.Input initialProps, @NotNull l0 savedStateHandle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull IntegrationWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull sq.a navigationStateManager, @NotNull a.InterfaceC0209a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (d().i() == null) {
            d().p(p(b().getValue()));
        }
        d().o(new Function1() { // from class: wo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = com.withpersona.sdk2.inquiry.integration.fragment.b.l(com.withpersona.sdk2.inquiry.integration.fragment.b.this, (IntegrationWorkflow.State) obj);
                return l10;
            }
        });
        k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    public static final Unit l(b bVar, IntegrationWorkflow.State state) {
        if (state == null) {
            return Unit.f22894a;
        }
        bVar.s(bVar.b().getValue(), state);
        return Unit.f22894a;
    }

    public static final Unit o(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.v(InterfaceC0214b.c.f11236a);
        return Unit.f22894a;
    }

    public static final Unit r(b bVar, IntegrationWorkflow.Input input, BrowserSelection browserSelection, a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof a.b.C0210a)) {
            throw new l();
        }
        IntegrationWorkflow.State i10 = bVar.d().i();
        IntegrationWorkflow.State.Starting starting = i10 instanceof IntegrationWorkflow.State.Starting ? (IntegrationWorkflow.State.Starting) i10 : null;
        if (starting == null) {
            return Unit.f22894a;
        }
        TrackingEventsLogger.logIntegrationEvent$default(bVar.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        bVar.d().p(starting.u(null));
        bVar.e(IntegrationWorkflow.b.d.f11183a);
        return Unit.f22894a;
    }

    public static final Unit t(b bVar) {
        bVar.v(InterfaceC0214b.a.f11234a);
        return Unit.f22894a;
    }

    public static final Unit u(b bVar) {
        bVar.v(InterfaceC0214b.C0215b.f11235a);
        return Unit.f22894a;
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> n(IntegrationWorkflow.Input props) {
        IntegrationPage startPage = props.getStartPage();
        return startPage == null ? p.k() : new NestedUiStep.a().a(startPage.getOpenBrowserButton(), new Function1() { // from class: wo.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = com.withpersona.sdk2.inquiry.integration.fragment.b.o(com.withpersona.sdk2.inquiry.integration.fragment.b.this, (UiComponent) obj);
                return o8;
            }
        }).b();
    }

    public final IntegrationWorkflow.State p(IntegrationWorkflow.Input props) {
        return new IntegrationWorkflow.State.Starting(IntegrationWorkflow.PendingAction.OpenBrowser.f11175a);
    }

    public final void q(final IntegrationWorkflow.Input renderProps, IntegrationWorkflow.State.Starting renderState) {
        IntegrationWorkflow.PendingAction pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof IntegrationWorkflow.PendingAction.OpenBrowser)) {
            if (pendingAction != null) {
                throw new l();
            }
        } else {
            final BrowserSelection c10 = vo.e.f33497a.c(this.applicationContext);
            TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(c10.getSupportsAuthTab()), null, 8, null), false, 2, null);
            d().n(this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), c10, renderProps.getIntegrationStepBrowserType()), new Function1() { // from class: wo.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit r8;
                    r8 = com.withpersona.sdk2.inquiry.integration.fragment.b.r(com.withpersona.sdk2.inquiry.integration.fragment.b.this, renderProps, c10, (a.b) obj);
                    return r8;
                }
            });
        }
    }

    public final void s(IntegrationWorkflow.Input renderProps, IntegrationWorkflow.State renderState) {
        if (!(renderState instanceof IntegrationWorkflow.State.Starting)) {
            throw new l();
        }
        IntegrationWorkflow.State.Starting starting = (IntegrationWorkflow.State.Starting) renderState;
        q(renderProps, starting);
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        IntegrationPage startPage = renderProps.getStartPage();
        Intrinsics.checkNotNull(startPage);
        c().setValue(new IntegrationView(yq.b.a(startPage), this.navigationStateManager.b(), new Function0() { // from class: wo.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit t8;
                t8 = com.withpersona.sdk2.inquiry.integration.fragment.b.t(com.withpersona.sdk2.inquiry.integration.fragment.b.this);
                return t8;
            }
        }, new Function0() { // from class: wo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit u8;
                u8 = com.withpersona.sdk2.inquiry.integration.fragment.b.u(com.withpersona.sdk2.inquiry.integration.fragment.b.this);
                return u8;
            }
        }, n(renderProps), starting.getPendingAction() != null || renderProps.getIsSubmitting()));
    }

    public final void v(InterfaceC0214b event) {
        if (event instanceof InterfaceC0214b.a) {
            e(IntegrationWorkflow.b.a.f11180a);
            return;
        }
        if (event instanceof InterfaceC0214b.C0215b) {
            e(IntegrationWorkflow.b.C0208b.f11181a);
            return;
        }
        if (!(event instanceof InterfaceC0214b.c)) {
            throw new l();
        }
        IntegrationWorkflow.State i10 = d().i();
        IntegrationWorkflow.State.Starting starting = i10 instanceof IntegrationWorkflow.State.Starting ? (IntegrationWorkflow.State.Starting) i10 : null;
        if (starting == null) {
            return;
        }
        d().p(starting.u(IntegrationWorkflow.PendingAction.OpenBrowser.f11175a));
    }
}
