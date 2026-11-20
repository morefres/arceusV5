package pr;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ar.h2;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.d;
import com.withpersona.sdk2.inquiry.ui.k;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jp.JpMyNumberNfcValidOperation;
import jp.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mr.b4;
import nq.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.j1;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 l2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002mRB\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b3\u00104J-\u00109\u001a\u00020'*\b\u0012\u0004\u0012\u000206052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020'07H\u0002¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020'2\u0006\u0010;\u001a\u0002062\u0006\u0010=\u001a\u00020<2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020'2\u0006\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020D2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020<2\u0006\u0010A\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020'¢\u0006\u0004\bP\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lpr/g1;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Ljp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lup/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Lsq/a;", "navigationStateManager", "Lpr/e0;", "componentWorkHelper", "Lnq/c;", "externalEventLogger", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lju/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Ljp/n$a;Lup/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Lsq/a;Lpr/e0;Lnq/c;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lju/p0;)V", "renderProps", "renderState", "", "S", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "m0", "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "k0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "p0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "P", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "n0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "w0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "O", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "N", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "j0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "M", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "l0", "()V", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "h", "Ljp/n$a;", "i", "Lup/c;", "j", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "k", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "l", "Lsq/a;", "m", "Lpr/e0;", "n", "Lnq/c;", "o", "Leo/e;", "p", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "q", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "r", rl.d.f30696a, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g1 extends tr.c<UiWorkflow.Input, UiState, UiWorkflow.b, UiWorkflow.c> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a nfcScanWorkerFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n.a scanJpMyNumberNfcWorkerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d.a createReusablePersonaWorkerFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k.a verifyReusablePersonaWorkerFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 componentWorkHelper;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a permissionRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$1$1", f = "UiStepStateManager.kt", l = {132}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29045t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiState f29047v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UiState uiState, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f29047v = uiState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return g1.this.new a(this.f29047v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29045t;
            if (i10 == 0) {
                gt.o.b(obj);
                g1 g1Var = g1.this;
                UiWorkflow.Input value = g1Var.b().getValue();
                UiState uiState = this.f29047v;
                this.f29045t = 1;
                if (g1Var.S(value, uiState, this) == e10) {
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
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$2", f = "UiStepStateManager.kt", l = {136}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29048t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f29050a;

            public a(g1 g1Var) {
                this.f29050a = g1Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.Input input, mt.b<? super Unit> bVar) {
                Object S;
                g1 g1Var = this.f29050a;
                UiState i10 = g1Var.d().i();
                return (i10 != null && (S = g1Var.S(input, i10, bVar)) == nt.c.e()) ? S : Unit.f22894a;
            }
        }

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return g1.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29048t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.c0<UiWorkflow.Input> b = g1.this.b();
                a aVar = new a(g1.this);
                this.f29048t = 1;
                if (b.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3", f = "UiStepStateManager.kt", l = {144}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29051t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f29053a;

            public a(g1 g1Var) {
                this.f29053a = g1Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, mt.b<? super Unit> bVar) {
                UiState i10 = this.f29053a.d().i();
                if (i10 == null) {
                    return Unit.f22894a;
                }
                g1 g1Var = this.f29053a;
                g1Var.k0(g1Var.b().getValue(), i10);
                return Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements mu.h<String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.h f29054a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
            public static final class a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mu.i f29055a;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3$invokeSuspend$$inlined$map$1$2", f = "UiStepStateManager.kt", l = {223}, m = "emit")
                /* renamed from: pr.g1$c$b$a$a, reason: collision with other inner class name */
                public static final class C0508a extends ot.d {
                    public int A;

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29056t;

                    /* renamed from: u, reason: collision with root package name */
                    public int f29057u;

                    /* renamed from: v, reason: collision with root package name */
                    public Object f29058v;

                    /* renamed from: x, reason: collision with root package name */
                    public Object f29060x;

                    /* renamed from: y, reason: collision with root package name */
                    public Object f29061y;

                    /* renamed from: z, reason: collision with root package name */
                    public Object f29062z;

                    public C0508a(mt.b bVar) {
                        super(bVar);
                    }

                    @Override // ot.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f29056t = obj;
                        this.f29057u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(mu.i iVar) {
                    this.f29055a = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull mt.b r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof pr.g1.c.b.a.C0508a
                        if (r0 == 0) goto L13
                        r0 = r7
                        pr.g1$c$b$a$a r0 = (pr.g1.c.b.a.C0508a) r0
                        int r1 = r0.f29057u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29057u = r1
                        goto L18
                    L13:
                        pr.g1$c$b$a$a r0 = new pr.g1$c$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f29056t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f29057u
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.f29062z
                        mu.i r6 = (mu.i) r6
                        java.lang.Object r6 = r0.f29060x
                        pr.g1$c$b$a$a r6 = (pr.g1.c.b.a.C0508a) r6
                        gt.o.b(r7)
                        goto L69
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        gt.o.b(r7)
                        mu.i r7 = r5.f29055a
                        r2 = r6
                        com.withpersona.sdk2.inquiry.ui.UiWorkflow$Input r2 = (com.withpersona.sdk2.inquiry.ui.UiWorkflow.Input) r2
                        java.lang.String r2 = r2.getStepName()
                        java.lang.Object r4 = ot.l.a(r6)
                        r0.f29058v = r4
                        java.lang.Object r4 = ot.l.a(r0)
                        r0.f29060x = r4
                        java.lang.Object r6 = ot.l.a(r6)
                        r0.f29061y = r6
                        java.lang.Object r6 = ot.l.a(r7)
                        r0.f29062z = r6
                        r6 = 0
                        r0.A = r6
                        r0.f29057u = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L69
                        return r1
                    L69:
                        kotlin.Unit r6 = kotlin.Unit.f22894a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pr.g1.c.b.a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            public b(mu.h hVar) {
                this.f29054a = hVar;
            }

            @Override // mu.h
            @Nullable
            public Object collect(@NotNull mu.i<? super String> iVar, @NotNull mt.b bVar) {
                Object collect = this.f29054a.collect(new a(iVar), bVar);
                return collect == nt.c.e() ? collect : Unit.f22894a;
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return g1.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29051t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h m10 = mu.j.m(new b(g1.this.b()));
                a aVar = new a(g1.this);
                this.f29051t = 1;
                if (m10.collect(aVar, this) == e10) {
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
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lpr/g1$e;", "", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lpr/g1;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lpr/g1;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e {
        @NotNull
        g1 a(@NotNull UiWorkflow.Input initialProps, @NotNull android.view.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29063a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.f28920c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29063a = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function1<HelpBottomSheetComponent, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f29064a = new g();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h extends kotlin.jvm.internal.k implements Function1<UiWorkflow.b, Unit> {
        public h(Object obj) {
            super(1, obj, g1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(UiWorkflow.b p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((g1) this.receiver).e(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.b bVar) {
            d(bVar);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29065t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiState f29067v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ButtonComponent f29068w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UiState uiState, ButtonComponent buttonComponent, mt.b<? super i> bVar) {
            super(1, bVar);
            this.f29067v = uiState;
            this.f29068w = buttonComponent;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return g1.this.new i(this.f29067v, this.f29068w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            String str;
            nt.c.e();
            if (this.f29065t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            g1 g1Var = g1.this;
            UiState.Displaying displaying = (UiState.Displaying) this.f29067v;
            ButtonComponent buttonComponent = this.f29068w;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int intValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = this.f29068w.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = this.f29068w.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                str = kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                str = null;
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, intValue, str), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$6$1", f = "UiStepStateManager.kt", l = {296}, m = "invokeSuspend")
    public static final class j extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29069t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f29070u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f29071v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState f29072w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UiState.Displaying.AutoSubmit autoSubmit, g1 g1Var, UiState uiState, mt.b<? super j> bVar) {
            super(1, bVar);
            this.f29070u = autoSubmit;
            this.f29071v = g1Var;
            this.f29072w = uiState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new j(this.f29070u, this.f29071v, this.f29072w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29069t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f29069t = 1;
                if (ju.z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            int countdown = this.f29070u.getCountdown() - 1;
            g1 g1Var = this.f29071v;
            UiState.Displaying displaying = (UiState.Displaying) this.f29072w;
            AutoSubmitableComponent component = this.f29070u.getComponent();
            String autoSubmitCountdownText = this.f29070u.getComponent().getAutoSubmitCountdownText();
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$7", f = "UiStepStateManager.kt", l = {456}, m = "invokeSuspend")
    public static final class k extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f29073t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow.c.a f29075v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UiWorkflow.c.a aVar, mt.b<? super k> bVar) {
            super(2, bVar);
            this.f29075v = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return g1.this.new k(this.f29075v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f29073t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.c0<UiWorkflow.c> c10 = g1.this.c();
                UiWorkflow.c.a aVar = this.f29075v;
                this.f29073t = 1;
                if (c10.emit(aVar, this) == e10) {
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
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$runGovIdNfcWork$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class l extends ot.m implements Function1<mt.b<? super Unit>, Object> {
        public final /* synthetic */ UiState.Displaying A;

        /* renamed from: t, reason: collision with root package name */
        public int f29076t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f29077u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f29078v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f29079w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Date f29080x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f29081y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.NfcScan f29082z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GovernmentIdNfcScan.Attributes attributes, g1 g1Var, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, mt.b<? super l> bVar) {
            super(1, bVar);
            this.f29077u = attributes;
            this.f29078v = g1Var;
            this.f29079w = str;
            this.f29080x = date;
            this.f29081y = date2;
            this.f29082z = nfcScan;
            this.A = displaying;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new l(this.f29077u, this.f29078v, this.f29079w, this.f29080x, this.f29081y, this.f29082z, this.A, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            String string;
            nt.c.e();
            if (this.f29076t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GovernmentIdNfcScan.Attributes attributes = this.f29077u;
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = this.f29078v.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.p0(this.f29079w)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (this.f29080x == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (this.f29081y == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            this.f29078v.f(UiState.Displaying.v(this.A, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.f29082z.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(@NotNull UiWorkflow.Input initialProps, @NotNull android.view.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull b.a nfcScanWorkerFactory, @NotNull n.a scanJpMyNumberNfcWorkerFactory, @NotNull up.c sandboxFlags, @NotNull d.a createReusablePersonaWorkerFactory, @NotNull k.a verifyReusablePersonaWorkerFactory, @NotNull sq.a navigationStateManager, @NotNull e0 componentWorkHelper, @NotNull nq.c externalEventLogger, @NotNull eo.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull e.a permissionRequestWorkerFactory, @NotNull final ju.p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(scanJpMyNumberNfcWorkerFactory, "scanJpMyNumberNfcWorkerFactory");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.scanJpMyNumberNfcWorkerFactory = scanJpMyNumberNfcWorkerFactory;
        this.sandboxFlags = sandboxFlags;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        if (d().i() == null) {
            f(M(b().getValue()));
        }
        d().o(new Function1() { // from class: pr.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit G;
                G = g1.G(ju.p0.this, this, (UiState) obj);
                return G;
            }
        });
        ju.k.d(coroutineScope, ju.g1.d(), null, new b(null), 2, null);
        ju.k.d(coroutineScope, ju.g1.d(), null, new c(null), 2, null);
    }

    public static final Unit G(ju.p0 p0Var, g1 g1Var, UiState uiState) {
        if (uiState == null) {
            return Unit.f22894a;
        }
        ju.k.d(p0Var, ju.g1.d(), null, g1Var.new a(uiState, null), 2, null);
        return Unit.f22894a;
    }

    public static final Unit Q(UiState.PendingAction pendingAction, g1 g1Var, UiState.Displaying displaying, d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        if (createReusablePersona.getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            g1Var.e(UiWorkflow.b.c.f13825a);
            return Unit.f22894a;
        }
        if (Intrinsics.c(it, d.b.a.f13889a)) {
            g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        } else {
            if (!(it instanceof d.b.Error)) {
                throw new gt.l();
            }
            g1Var.f(((d.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(tp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        }
        return Unit.f22894a;
    }

    public static final Unit R(g1 g1Var, UiState.Displaying displaying, k.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, k.b.a.f13966a)) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
            g1Var.e(new UiWorkflow.b.FinishedWithTransition(true));
        } else {
            if (!(it instanceof k.b.Error)) {
                throw new gt.l();
            }
            g1Var.f(((k.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(tp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        }
        return Unit.f22894a;
    }

    public static final Unit T(g1 g1Var, UiState uiState, UiWorkflow.Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        g1Var.e(input.getFinalStep() ? UiWorkflow.b.c.f13825a : UiWorkflow.b.C0255b.f13824a);
        return Unit.f22894a;
    }

    public static final Unit U(g1 g1Var, UiState uiState, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.O(component, (UiState.Displaying) uiState);
        return Unit.f22894a;
    }

    public static final Unit V(g1 g1Var, UiState uiState, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.N(component, (UiState.Displaying) uiState);
        return Unit.f22894a;
    }

    public static final Unit W(HelpBottomSheetComponent helpBottomSheetComponent, g1 g1Var, UiState uiState) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            g1Var.O((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState);
        }
        return Unit.f22894a;
    }

    public static final Unit X(HelpBottomSheetComponent helpBottomSheetComponent, g1 g1Var, UiState uiState) {
        String unableToScanTransitionComponentName;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) helpBottomSheetComponent;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                g1Var.w0(helpBottomSheetComponent, true, displaying);
                UiState.Displaying v5 = UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null);
                GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScanComponent.getConfig().getAttributes();
                g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(v5, attributes2 != null ? attributes2.getUnableToScanTransitionComponentName() : null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit Y(g1 g1Var, UiState uiState, VerifyPersonaButtonComponent component, Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.w0(component, true, displaying);
        g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(component, componentParams), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22894a;
    }

    public static final Unit Z(g1 g1Var) {
        g1Var.e(UiWorkflow.b.a.f13823a);
        return Unit.f22894a;
    }

    public static final Unit a0(g1 g1Var, UiState uiState, InputAddressComponent component, String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), component, component.V(addressId).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit b0(g1 g1Var, UiState uiState) {
        g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f22894a;
    }

    public static final Unit c0(g1 g1Var, UiWorkflow.Input input, UiState uiState, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.componentWorkHelper.H(input, (UiState.Displaying) uiState, g1Var.d(), component, new h(g1Var));
        return Unit.f22894a;
    }

    public static final Unit d0(g1 g1Var, UiState uiState, CreatePersonaSheetComponent createReusablePersonaComponent, UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = buttonClicked instanceof ButtonComponent ? (ButtonComponent) buttonClicked : null;
        if (buttonComponent != null) {
            buttonComponent.b(true);
        }
        Unit unit = Unit.f22894a;
        g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(components, createReusablePersonaComponent, ar.k.b(createReusablePersonaComponent, buttonClicked, buttonClicked)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createReusablePersonaComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22894a;
    }

    public static final Unit e0(g1 g1Var, UiState uiState) {
        g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f22894a;
    }

    public static final Unit f0(g1 g1Var, boolean z10, UiState uiState, e.b it) {
        UiState.Displaying displaying;
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = f.f29063a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            UiState i11 = g1Var.d().i();
            displaying = i11 instanceof UiState.Displaying ? (UiState.Displaying) i11 : null;
            if (displaying == null) {
                return Unit.f22894a;
            }
            g1Var.m0(displaying);
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new gt.l();
            }
            g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        } else if (z10) {
            UiState i12 = g1Var.d().i();
            displaying = i12 instanceof UiState.Displaying ? (UiState.Displaying) i12 : null;
            if (displaying == null) {
                return Unit.f22894a;
            }
            g1Var.m0(displaying);
        } else {
            g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        }
        return Unit.f22894a;
    }

    public static final boolean g0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit h0(g1 g1Var, UiState uiState, UiWorkflow.Input input, UiComponent uiComponent, boolean z10, Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType a10 = b4.a(uiComponent);
        if (a10 != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, a10, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.w0(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.f13251c || displaying.getHasRequestedGpsPermissions()) {
            UiState i10 = g1Var.d().i();
            UiState.Displaying displaying2 = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
            if (displaying2 == null) {
                return Unit.f22894a;
            }
            UiState.Displaying v5 = UiState.Displaying.v(displaying2, null, null, null, null, null, null, null, null, null, false, false, componentParams, uiComponent, null, false, 0, null, 0, 255999, null);
            g1Var.f(v5);
            g1Var.m0(v5);
        } else {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, true, componentParams, uiComponent, null, false, 0, null, 0, 254975, null));
        }
        return Unit.f22894a;
    }

    public static final Unit i0(g1 g1Var, UiState uiState) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        g1Var.e(UiWorkflow.b.c.f13825a);
        return Unit.f22894a;
    }

    public static final Unit o0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f22894a;
    }

    public static final Unit q0(g1 g1Var, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, PassportNfcReaderOutput output) {
        String str;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, PassportNfcReaderOutput.Cancel.f12244a)) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        } else if (output instanceof PassportNfcReaderOutput.Error) {
            String name = nfcScan.getComponent().getName();
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes == null || (str = attributes.getScanDocumentError()) == null) {
                str = "";
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", str), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        } else if (output instanceof PassportNfcReaderOutput.Success) {
            UiState i10 = g1Var.d().i();
            UiState.Displaying displaying2 = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
            if (displaying2 == null) {
                return Unit.f22894a;
            }
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) cr.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: pr.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean r02;
                    r02 = g1.r0(UiState.Displaying.NfcScan.this, (GovernmentIdNfcScanComponent) obj);
                    return Boolean.valueOf(r02);
                }
            });
            if (governmentIdNfcScanComponent2 == null) {
                return Unit.f22894a;
            }
            PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) output;
            governmentIdNfcScanComponent2.getNfcDataController().c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, success.getSubmitButtonComponentName()));
        } else if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        } else {
            if (!(output instanceof PassportNfcReaderOutput.ReenterDetails)) {
                throw new gt.l();
            }
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((PassportNfcReaderOutput.ReenterDetails) output).getButtonComponentName()));
        }
        return Unit.f22894a;
    }

    public static final boolean r0(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final Unit t0(g1 g1Var, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcReaderOutput output) {
        UiState.Displaying displaying2;
        cr.j scanResultController;
        cr.j scanResultController2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            UiState i10 = g1Var.d().i();
            displaying2 = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
            if (displaying2 == null) {
                return Unit.f22894a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) cr.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: pr.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean u02;
                    u02 = g1.u0(JpMyNumberNfcScanComponent.this, (JpMyNumberNfcScanComponent) obj);
                    return Boolean.valueOf(u02);
                }
            });
            if (jpMyNumberNfcScanComponent2 != null && (scanResultController2 = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
                scanResultController2.c(((JpMyNumberNfcReaderOutput.Success) output).getResult());
            }
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((JpMyNumberNfcReaderOutput.Success) output).getTransitionComponentName()));
        } else if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            UiState i11 = g1Var.d().i();
            displaying2 = i11 instanceof UiState.Displaying ? (UiState.Displaying) i11 : null;
            if (displaying2 == null) {
                return Unit.f22894a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent3 = (JpMyNumberNfcScanComponent) cr.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: pr.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean v02;
                    v02 = g1.v0(JpMyNumberNfcScanComponent.this, (JpMyNumberNfcScanComponent) obj);
                    return Boolean.valueOf(v02);
                }
            });
            if (jpMyNumberNfcScanComponent3 != null && (scanResultController = jpMyNumberNfcScanComponent3.getScanResultController()) != null) {
                scanResultController.c(((JpMyNumberNfcReaderOutput.Failed) output).getResult());
            }
            String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) output).getTransitionComponentName();
            if (transitionComponentName == null || transitionComponentName.length() == 0) {
                g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
            } else {
                g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, transitionComponentName));
            }
        } else {
            if (!Intrinsics.c(output, JpMyNumberNfcReaderOutput.Cancel.f12200a)) {
                throw new gt.l();
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        }
        return Unit.f22894a;
    }

    public static final boolean u0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final boolean v0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit x0(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof h2) {
            ((h2) it).b(z10 ? Intrinsics.c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f22894a;
    }

    @NotNull
    public final UiState M(@NotNull UiWorkflow.Input props) {
        List<UiComponent> k10;
        Intrinsics.checkNotNullParameter(props, "props");
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (k10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components)) == null) {
            k10 = kotlin.collections.p.k();
        }
        if (!this.featureFlagManager.a(eo.t.f16115a)) {
            k10 = com.withpersona.sdk2.inquiry.ui.b.d(k10);
        }
        List<UiComponent> list = k10;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> s8 = props.s();
        if (s8 == null) {
            s8 = kotlin.collections.p.k();
        }
        return new UiState.Displaying(list, stepName, s8, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final void N(JpMyNumberNfcScanComponent component, UiState.Displaying renderState) {
        String str;
        if (component.getValidOperation() == null) {
            return;
        }
        if (!j0(component)) {
            w0(component, true, renderState);
            f(UiState.Displaying.v(renderState, null, null, kotlin.collections.p.k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(component), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
            return;
        }
        String name = component.getName();
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (attributes == null || (str = attributes.getEnableNfcPrompt()) == null) {
            str = "";
        }
        f(UiState.Displaying.v(renderState, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", str), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
    }

    public final void O(GovernmentIdNfcScanComponent component, UiState.Displaying renderState) {
        w0(component, true, renderState);
        f(UiState.Displaying.v(renderState, null, null, null, null, null, new UiState.Displaying.NfcScan(component), null, null, null, false, false, null, null, null, false, renderState.getNfcScanAttemptCount() + 1, null, 0, 212959, null));
    }

    public final void P(UiWorkflow.Input renderProps, final UiState.Displaying renderState) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            tr.f<UiState> d10 = d();
            d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d10.n(aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), new Function1() { // from class: pr.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q;
                    Q = g1.Q(UiState.PendingAction.this, this, renderState, (d.b) obj);
                    return Q;
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new gt.l();
            }
            return;
        }
        tr.f<UiState> d11 = d();
        k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d11.n(aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), new Function1() { // from class: pr.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit R;
                R = g1.R(g1.this, renderState, (k.b) obj);
                return R;
            }
        });
    }

    public final Object S(final UiWorkflow.Input input, final UiState uiState, mt.b<? super Unit> bVar) {
        UiState.Displaying displaying;
        boolean z10;
        UiWorkflow.c.a.AutoSubmit autoSubmit;
        if (input.getIsRestoringState()) {
            return Unit.f22894a;
        }
        if (!(uiState instanceof UiState.Displaying)) {
            throw new gt.l();
        }
        UiState.Displaying displaying2 = (UiState.Displaying) uiState;
        P(input, displaying2);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) cr.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(HelpBottomSheetComponent.class), g.f29064a);
        this.navigationStateManager.c(input.getBackStepEnabled(), input.getCancelButtonEnabled(), displaying2.getPendingAction() == null && !input.getIsSubmitting(), helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled());
        n0(displaying2.getComponents(), new Function1() { // from class: pr.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c02;
                c02 = g1.c0(g1.this, input, uiState, (UiComponent) obj);
                return c02;
            }
        });
        if (displaying2.getNfcScan() != null) {
            p0(input, displaying2, displaying2.getNfcScan());
        }
        if (displaying2.getJpMyNumberNfcScan() != null) {
            s0(input, displaying2, displaying2.getJpMyNumberNfcScan());
        }
        pp.i0 i0Var = input.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.f13254a ? pp.i0.f28912c : pp.i0.f28913d;
        final boolean z11 = input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.b;
        if (displaying2.getIsRequestingGpsPermissions()) {
            tr.f<UiState> d10 = d();
            e.a aVar = this.permissionRequestWorkerFactory;
            String gpsPermissionsTitle = input.getGpsPermissionsTitle();
            if (gpsPermissionsTitle == null) {
                gpsPermissionsTitle = "";
            }
            String gpsPermissionsRationale = input.getGpsPermissionsRationale();
            if (gpsPermissionsRationale == null) {
                gpsPermissionsRationale = "Gps permission are required to verify your identity";
            }
            Context context = this.applicationContext;
            String string = context.getString(tp.g.f32385c0, hq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String gpsFeatureModalPositiveButton = input.getGpsFeatureModalPositiveButton();
            if (gpsFeatureModalPositiveButton == null) {
                gpsFeatureModalPositiveButton = this.applicationContext.getString(tp.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
            }
            String gpsPermissionsModalNegativeButton = input.getGpsPermissionsModalNegativeButton();
            if (gpsPermissionsModalNegativeButton == null) {
                displaying = displaying2;
                gpsPermissionsModalNegativeButton = this.applicationContext.getString(tp.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
            } else {
                displaying = displaying2;
            }
            d10.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, input.getGpsFeatureTitle(), input.getGpsFeatureRationale(), input.getGpsPermissionsModalNegativeButton(), input.getStyles())), new Function1() { // from class: pr.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit f02;
                    f02 = g1.f0(g1.this, z11, uiState, (e.b) obj);
                    return f02;
                }
            });
        } else {
            displaying = displaying2;
        }
        String error = displaying.getError();
        if (error == null && input.getTransitionError() != null) {
            error = this.applicationContext.getString(tp.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) cr.h.a(displaying.getComponents(), kotlin.jvm.internal.d0.b(ButtonComponent.class), new Function1() { // from class: pr.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean g02;
                    g02 = g1.g0((ButtonComponent) obj);
                    return Boolean.valueOf(g02);
                }
            });
            if (buttonComponent != null) {
                d().m("begin_countdown", new i(uiState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 != null) {
            z10 = true;
            if (autoSubmit2.getCountdown() >= 1) {
                d().m("countdown_" + autoSubmit2.getCountdown(), new j(autoSubmit2, this, uiState, null));
            }
        } else {
            z10 = true;
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = input.getComponents();
        List<UiComponentErrorInfo> x10 = displaying.x();
        List<UiComponentErrorInfo> s8 = input.s();
        if (s8 == null) {
            s8 = kotlin.collections.p.k();
        }
        List w02 = CollectionsKt.w0(x10, s8);
        NavigationState b10 = this.navigationStateManager.b();
        String navBarTitle = input.getNavBarTitle();
        if (input.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new UiWorkflow.c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0 ? z10 : false);
        }
        Object g10 = ju.i.g(ju.g1.c(), new k(new UiWorkflow.c.a(components, components2, w02, b10, navBarTitle, new yt.n() { // from class: pr.h0
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit h02;
                h02 = g1.h0(g1.this, uiState, input, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
                return h02;
            }
        }, new Function0() { // from class: pr.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i02;
                i02 = g1.i0(g1.this, uiState);
                return i02;
            }
        }, new Function0() { // from class: pr.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit T;
                T = g1.T(g1.this, uiState, input);
                return T;
            }
        }, new Function1() { // from class: pr.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit U;
                U = g1.U(g1.this, uiState, (GovernmentIdNfcScanComponent) obj);
                return U;
            }
        }, new Function1() { // from class: pr.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V;
                V = g1.V(g1.this, uiState, (JpMyNumberNfcScanComponent) obj);
                return V;
            }
        }, new Function0() { // from class: pr.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit W;
                W = g1.W(HelpBottomSheetComponent.this, this, uiState);
                return W;
            }
        }, new Function0() { // from class: pr.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit X;
                X = g1.X(HelpBottomSheetComponent.this, this, uiState);
                return X;
            }
        }, new Function2() { // from class: pr.y0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit Y;
                Y = g1.Y(g1.this, uiState, (VerifyPersonaButtonComponent) obj, (Map) obj2);
                return Y;
            }
        }, autoSubmit, new Function0() { // from class: pr.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Z;
                Z = g1.Z(g1.this);
                return Z;
            }
        }, new Function2() { // from class: pr.a1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit a02;
                a02 = g1.a0(g1.this, uiState, (InputAddressComponent) obj, (String) obj2);
                return a02;
            }
        }, (displaying.getPendingAction() != null || input.getIsSubmitting()) ? z10 : false, displaying.getStyles(), str, new Function0() { // from class: pr.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b02;
                b02 = g1.b0(g1.this, uiState);
                return b02;
            }
        }, new Function2() { // from class: pr.c1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit d02;
                d02 = g1.d0(g1.this, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
                return d02;
            }
        }, helpBottomSheetComponent != null ? helpBottomSheetComponent.n1(displaying.getNfcScanAttemptCount()) : null, displaying.getShowHelpBottomSheet(), new Function0() { // from class: pr.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit e02;
                e02 = g1.e0(g1.this, uiState);
                return e02;
            }
        }), null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public final boolean j0(JpMyNumberNfcScanComponent component) {
        List<String> d10;
        if (!this.sandboxFlags.c()) {
            return !jp.j.f22005a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean c10 = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation validOperation = component.getValidOperation();
        return !c10 && jp.m.f22012a.a((validOperation == null || (d10 = validOperation.d()) == null) ? null : (String) CollectionsKt.firstOrNull(d10));
    }

    public final void k0(UiWorkflow.Input renderProps, UiState renderState) {
        nq.i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new gt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new gt.l();
                }
                dVar = new i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new i.d(renderProps.getStepName()) : new i.f(renderProps.getStepName());
        }
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void l0() {
    }

    public final void m0(UiState.Displaying renderState) {
        UiComponent triggeringComponent = renderState.getTriggeringComponent();
        Map<String, ComponentParam> z10 = renderState.z();
        if (triggeringComponent == null || z10 == null) {
            return;
        }
        e(new UiWorkflow.b.FinishedWithoutTransition(triggeringComponent, z10, renderState.getStepName()));
    }

    public final void n0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                n0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: pr.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit o02;
                        o02 = g1.o0(Function1.this, (UiComponent) obj);
                        return o02;
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    public final void p0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends op.b> n10;
        String scanDocumentError;
        String str;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String b10 = component.getCardAccessNumberController().b();
        String b11 = component.getDocumentNumberController().b();
        Date b12 = component.getDateOfBirthController().b();
        Date b13 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(b11) || b12 == null || b13 == null) {
            d().m("client_side_nfc_form_validation", new l(attributes, this, b11, b12, b13, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(b11, b13, b12);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            n10 = kotlin.collections.p.n(op.b.f28093a, op.b.b, op.b.f28095d);
        } else {
            n10 = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = f.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                op.b bVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : op.b.f28095d : op.b.f28094c : op.b.b : op.b.f28093a;
                if (bVar != null) {
                    n10.add(bVar);
                }
            }
        }
        tr.f<UiState> d10 = d();
        b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        String string = this.applicationContext.getString(tp.g.C);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(tp.g.D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(tp.g.C);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                str = "";
                String string4 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String str11 = (attributes != null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
                String string5 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String str12 = (attributes != null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
                String string6 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                d10.n(aVar.a(b10, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), n10, renderProps.getStyles(), null, component.getConfig().getStyles()), new Function1() { // from class: pr.o0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit q02;
                        q02 = g1.q0(g1.this, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
                        return q02;
                    }
                });
            }
        }
        str = scanDocumentError;
        String string42 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
        if (attributes != null) {
        }
        String string52 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
        if (attributes != null) {
        }
        String string62 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
        d10.n(aVar.a(b10, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string42, str11, string52, str12, string62, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), n10, renderProps.getStyles(), null, component.getConfig().getStyles()), new Function1() { // from class: pr.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q02;
                q02 = g1.q0(g1.this, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
                return q02;
            }
        });
    }

    public final void s0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation validOperation = component.getValidOperation();
        if (validOperation == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        d().n(this.scanJpMyNumberNfcWorkerFactory.a(validOperation, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), new Function1() { // from class: pr.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t02;
                t02 = g1.t0(g1.this, renderState, component, (JpMyNumberNfcReaderOutput) obj);
                return t02;
            }
        });
    }

    public final void w0(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        n0(renderState.getComponents(), new Function1() { // from class: pr.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x02;
                x02 = g1.x0(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
                return x02;
            }
        });
    }
}
