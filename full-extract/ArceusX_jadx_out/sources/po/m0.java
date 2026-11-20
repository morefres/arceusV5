package po;

import android.content.Context;
import android.util.Size;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import fn.CameraChoices;
import fn.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.a;
import mo.GovernmentIdHintWorker;
import org.jetbrains.annotations.NotNull;
import rr.b;
import tr.TimerWorker;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J_\u0010,\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020+2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-JG\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020.2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b/\u00100J7\u00103\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JM\u0010;\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lpo/m0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Lmo/a$b;", "governmentIdHintWorkerFactory", "Lrr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Lmo/a$b;Lrr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;)V", "context", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lso/l;", "videoCaptureHelper", "Lwm/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "sink", "Lkotlin/Function1;", "", "onOutput", "Luq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Q", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;Lso/l;Lwm/h;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "E", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Ltr/f;Lso/l;Lwm/h;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "M", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Ltr/f;Lso/l;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Lsr/a;", "webRtcManager", "c0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;Lsr/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "C", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lso/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "c", "Lmo/a$b;", rl.d.f30696a, "Lrr/b$a;", "e", "Lcom/withpersona/sdk2/camera/e$a;", "f", "Lfn/c$a;", "g", "Lsq/a;", "h", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "i", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a webRtcWorkerFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a cameraXControllerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a camera2ControllerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a permissionRequestWorker;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28791a;

        static {
            int[] iArr = new int[pp.j1.values().length];
            try {
                iArr[pp.j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pp.j1.f28920c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pp.j1.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28791a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$1", f = "GovIdCaptureRenderer.kt", l = {505}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f28792t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f28793u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ tr.f<GovernmentIdState> f28794v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, tr.f<GovernmentIdState> fVar, mt.b<? super b> bVar) {
            super(1, bVar);
            this.f28793u = holographicTorchDelay;
            this.f28794v = fVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new b(this.f28793u, this.f28794v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f28792t;
            if (i10 == 0) {
                gt.o.b(obj);
                a.Companion companion = kotlin.time.a.INSTANCE;
                long p8 = kotlin.time.b.p(this.f28793u.getTorchDurationMs(), iu.b.f21120d);
                this.f28792t = 1;
                if (ju.z0.c(p8, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            GovernmentIdState i11 = this.f28794v.i();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = i11 instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) i11 : null;
            if (holographicTorchDelay == null) {
                return Unit.f22894a;
            }
            this.f28794v.p(GovernmentIdState.HolographicTorchDelay.J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2", f = "GovIdCaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f28795t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f28797v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f28798w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ tr.f<GovernmentIdState> f28799x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ so.l f28800y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, tr.f<GovernmentIdState> fVar, so.l lVar, mt.b<? super c> bVar) {
            super(1, bVar);
            this.f28797v = input;
            this.f28798w = holographicTorchDelay;
            this.f28799x = fVar;
            this.f28800y = lVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return m0.this.new c(this.f28797v, this.f28798w, this.f28799x, this.f28800y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f28795t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            m0 m0Var = m0.this;
            GovernmentIdWorkflow.Input input = this.f28797v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f28798w;
            m0Var.C(input, holographicTorchDelay, this.f28799x, holographicTorchDelay.getCaptureConfig(), this.f28800y, this.f28798w.getCameraProperties(), this.f28798w.getCapturedImage());
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public m0(@NotNull Context applicationContext, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull b.a webRtcWorkerFactory, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull e.a permissionRequestWorker) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorker, "permissionRequestWorker");
        this.applicationContext = applicationContext;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker;
    }

    public static final Unit D(tr.f fVar, so.l lVar) {
        WorkflowState i10 = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture != null) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.b : so.x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit F(tr.f fVar, Hint hint) {
        WorkflowState i10 = fVar.i();
        GovernmentIdState.CountdownToCapture countdownToCapture = i10 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) i10 : null;
        if (countdownToCapture == null) {
            return Unit.f22894a;
        }
        fVar.p(GovernmentIdState.CountdownToCapture.J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f22894a;
    }

    public static final Unit G(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit H(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit I(GovernmentIdState.CountdownToCapture countdownToCapture, m0 m0Var, GovernmentIdWorkflow.Input input, tr.f fVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> f32 = countdownToCapture.getIdForReview().f3();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(f32, 10));
        Iterator<T> it = f32.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List w02 = CollectionsKt.w0(arrayList, absolutePaths);
        CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
        GovernmentId.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = w02;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        m0Var.C(input, countdownToCapture, fVar, captureConfig, lVar, cameraProperties, GovernmentId.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f22894a;
    }

    public static final Unit J(final tr.f fVar, GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, final so.l lVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState i10 = fVar.i();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = i10 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) i10 : null;
        if (countdownToCapture2 == null) {
            return Unit.f22894a;
        }
        fVar.p(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.E(), countdownToCapture.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O(input, countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.D(), countdownToCapture2.getPartIndex(), oo.e.e(fVar, false), so.x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), error, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: po.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K;
                K = m0.K(tr.f.this, lVar);
                return K;
            }
        }, 11264, null));
        return Unit.f22894a;
    }

    public static final Unit K(tr.f fVar, so.l lVar) {
        WorkflowState i10 = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture != null) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.b : so.x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit L(m0 m0Var, tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        oo.e.q(m0Var.applicationContext, fVar, input, lVar.c(input));
        return Unit.f22894a;
    }

    public static final Unit N(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit O(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit P(m0 m0Var, tr.f fVar, GovernmentIdWorkflow.Input input) {
        oo.e.q(m0Var.applicationContext, fVar, input, true);
        return Unit.f22894a;
    }

    public static final Unit R(m0 m0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, tr.f fVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.f10814a, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f22894a;
    }

    public static final Unit S(m0 m0Var, tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        oo.e.q(m0Var.applicationContext, fVar, input, lVar.c(input));
        return Unit.f22894a;
    }

    public static final Unit T(tr.f fVar, GovernmentIdWorkflow.Input input, Function1 function1, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f28791a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) fVar.i();
            if (workflowState != null && (workflowState instanceof go.c)) {
                fVar.p(((go.c) workflowState).r(false));
            }
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            oo.e.p(fVar, input, null, function1);
        }
        return Unit.f22894a;
    }

    public static final Unit U(tr.f fVar, GovernmentIdWorkflow.Input input, Function1 function1, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f28791a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            WorkflowState workflowState = (GovernmentIdState) fVar.i();
            if (workflowState != null && (workflowState instanceof go.a)) {
                fVar.p(((go.a) workflowState).q(false));
            }
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            oo.e.p(fVar, input, null, function1);
        }
        return Unit.f22894a;
    }

    public static final Unit V(m0 m0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, tr.f fVar, CaptureConfig captureConfig, wm.h hVar, gt.n nVar) {
        List<GovernmentId> k10;
        Object value = nVar.getValue();
        Throwable e10 = gt.n.e(value);
        if (e10 == null) {
            GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            WorkflowState i10 = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
            if (waitForAutocapture2 != null) {
                IdPart.SideIdPart currentPart = waitForAutocapture.getCurrentPart();
                GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
                if (governmentIdState == null || (k10 = governmentIdState.E()) == null) {
                    k10 = kotlin.collections.p.k();
                }
                fVar.p(new GovernmentIdState.CountdownToCapture(currentPart, k10, captureConfig, governmentIdImage, waitForAutocapture2.D(), waitForAutocapture2.getPartIndex(), oo.e.e(fVar, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
            }
        } else {
            String message = e10.getMessage();
            if (message != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
                hVar.a(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            } else if (waitForAutocapture.getManualCapture() == Screen.b.a.f10815c) {
                fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit W(tr.f fVar, Hint hint) {
        WorkflowState i10 = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture == null) {
            return Unit.f22894a;
        }
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f22894a;
    }

    public static final Unit X(GovernmentIdState.WaitForAutocapture waitForAutocapture, tr.f fVar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.f10815c) {
            fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22894a;
    }

    public static final Unit Y(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, m0 m0Var, GovernmentIdWorkflow.Input input, tr.f fVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        m0Var.C(input, waitForAutocapture, fVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.n.e0(waitForAutocapture.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig), GovernmentId.a.b, null, null, 32, null));
        return Unit.f22894a;
    }

    public static final Unit Z(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit a0(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit b0(tr.f fVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        WorkflowState i10 = fVar.i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture == null) {
            return Unit.f22894a;
        }
        fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, error, false, false, null, null, null, 32247, null));
        return Unit.f22894a;
    }

    public static final Unit d0(final m0 m0Var, final tr.f fVar, final sr.a aVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, b.AbstractC0542b it) {
        int i10;
        fn.h0 primaryChoice;
        fn.h0 primaryChoice2;
        fn.h0 primaryChoice3;
        Size size;
        fn.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(it, "it");
        CameraChoices b10 = fn.f0.b(m0Var.applicationContext, fn.m0.f17385a);
        if (it instanceof b.AbstractC0542b.C0543b) {
            WorkflowState i11 = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture2 = i11 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i11 : null;
            if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == so.x.f31612a) {
                return Unit.f22894a;
            }
            if (waitForAutocapture2 != null) {
                fVar.p(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, so.x.f31612a, null, null, false, false, null, null, null, 32639, null));
            }
            if (aVar != null) {
                aVar.c(m0Var.webRtcWorkerFactory.getService());
            }
            if (aVar != null) {
                aVar.i(m0Var.applicationContext);
            }
            int i12 = 0;
            int width = (b10 == null || (primaryChoice4 = b10.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
            if (b10 != null && (primaryChoice3 = b10.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                i12 = size.getHeight();
            }
            if ((b10 == null || (primaryChoice2 = b10.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (b10 == null || (primaryChoice = b10.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                i10 = width;
            } else {
                i10 = i12;
                i12 = width;
            }
            if (aVar != null) {
                b.AbstractC0542b.C0543b c0543b = (b.AbstractC0542b.C0543b) it;
                aVar.f(c0543b.getResult().getUsername(), c0543b.getResult().getCredential(), c0543b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i10, i12, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: po.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit e02;
                        e02 = m0.e0(m0.this, input, waitForAutocapture);
                        return e02;
                    }
                }, new Function0() { // from class: po.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit f02;
                        f02 = m0.f0(sr.a.this, fVar);
                        return f02;
                    }
                }, new Function0() { // from class: po.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit g02;
                        g02 = m0.g0(m0.this, input);
                        return g02;
                    }
                }, new Function1() { // from class: po.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit h02;
                        h02 = m0.h0(m0.this, (String) obj);
                        return h02;
                    }
                });
            }
        } else {
            if (!(it instanceof b.AbstractC0542b.Error)) {
                throw new gt.l();
            }
            WorkflowState i13 = fVar.i();
            GovernmentIdState.WaitForAutocapture waitForAutocapture3 = i13 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i13 : null;
            if (waitForAutocapture3 == null || waitForAutocapture3.getWebRtcState() == so.x.f31612a) {
                return Unit.f22894a;
            }
            if (aVar != null) {
                aVar.a();
            }
            GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
            fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        }
        return Unit.f22894a;
    }

    public static final Unit e0(m0 m0Var, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(m0Var.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f22894a;
    }

    public static final Unit f0(sr.a aVar, tr.f fVar) {
        aVar.a();
        GovernmentIdState governmentIdState = (GovernmentIdState) fVar.i();
        fVar.p(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState != null ? governmentIdState.getCountryCode() : null, null, null, 223, null));
        return Unit.f22894a;
    }

    public static final Unit g0(m0 m0Var, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(m0Var.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f22894a;
    }

    public static final Unit h0(m0 m0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(m0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f22894a;
    }

    public final void C(GovernmentIdWorkflow.Input renderProps, GovernmentIdState renderState, final tr.f<GovernmentIdState> workflowContext, CaptureConfig captureConfig, final so.l videoCaptureHelper, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage capturedId) {
        List<GovernmentId> k10;
        List<IdPart> k11;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod b10 = com.withpersona.sdk2.inquiry.governmentid.j.b(capturedId.getCaptureMethod());
            IdConfig.b Q = com.withpersona.sdk2.inquiry.governmentid.n.Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, b10, Q != null ? com.withpersona.sdk2.inquiry.governmentid.n.d0(Q) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int intValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        IdConfig c10 = com.withpersona.sdk2.inquiry.governmentid.c.c(captureConfig);
        boolean z10 = videoCaptureHelper.c(renderProps) && intValue > 0 && renderState.E().isEmpty() && sideIdPart != null;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            workflowContext.p(new GovernmentIdState.HolographicTorchDelay(sideIdPart, renderState.E(), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), renderState.getCountryCode(), captureConfig, cameraProperties, intValue, capturedId, false, 1024, null));
            return;
        }
        IdPart.SideIdPart sideIdPart2 = sideIdPart;
        boolean z11 = videoCaptureHelper.c(renderProps) && !renderProps.getAutoClassificationConfig().getIsEnabled();
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (c10 != null && (z11 || shouldSkipReviewScreen)) {
            oo.e.s(renderState, workflowContext, renderProps, capturedId, c10, videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
            return;
        }
        if (sideIdPart2 == null) {
            return;
        }
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart2, renderState.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart2.getSide()), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), so.x.f31613c, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: po.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit D;
                D = m0.D(tr.f.this, videoCaptureHelper);
                return D;
            }
        }, 11776, null);
        IdPart currentPart2 = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart3 = currentPart2 instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart2 : null;
        if (sideIdPart3 == null) {
            return;
        }
        GovernmentIdState i10 = workflowContext.i();
        if (i10 == null || (k10 = i10.E()) == null) {
            k10 = kotlin.collections.p.k();
        }
        List<GovernmentId> list = k10;
        GovernmentIdState i11 = workflowContext.i();
        if (i11 == null || (k11 = i11.D()) == null) {
            k11 = kotlin.collections.p.k();
        }
        List<IdPart> list2 = k11;
        GovernmentIdState i12 = workflowContext.i();
        int partIndex = i12 != null ? i12.getPartIndex() : 0;
        GovernmentIdState i13 = workflowContext.i();
        workflowContext.p(new GovernmentIdState.ReviewCapturedImage(sideIdPart3, list, captureConfig, capturedId, list2, partIndex, waitForAutocapture, cameraProperties, null, false, i13 != null ? i13.getCountryCode() : null, 768, null));
    }

    @NotNull
    public final Screen E(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        Screen.b f10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: po.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F;
                F = m0.F(tr.f.this, (Hint) obj);
                return F;
            }
        });
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a aVar = Screen.b.a.f10814a;
        Screen.Overlay overlay = d10.getOverlay();
        no.b a10 = com.withpersona.sdk2.inquiry.governmentid.c.a(renderState.getCaptureConfig());
        NavigationState b10 = this.navigationStateManager.b();
        List<AutoCaptureRule> a11 = d10.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 g10 = oo.e.g(workflowContext, false, onOutput, 1, null);
        kn.a e10 = videoCaptureHelper.e(renderProps);
        String R = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, capturing, aVar, overlay, a10, side, b10, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0146: INVOKE (r1v3 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r8v5 'K' java.lang.String)
              (r9v6 'J' java.lang.String)
              (r10v5 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r6v9 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v1 'a10' no.b)
              (r11v4 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r6v11 'b10' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:0x00f9: CONSTRUCTOR (r43v0 'sink' wm.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a> A[DONT_INLINE]) A[MD:(wm.h):void (m), WRAPPED] call: po.g0.<init>(wm.h):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x0100: CONSTRUCTOR 
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' so.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.h0.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              true
              (r13v3 'a11' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture)
              (r16v1 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x00f2: IGET (r38v0 'this' po.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00f4: IGET (r38v0 'this' po.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.m0.f fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x0107: CONSTRUCTOR 
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture A[DONT_INLINE])
              (r38v0 'this' po.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, tr.f, so.l):void (m), WRAPPED] call: po.i0.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, tr.f, so.l):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x0116: CONSTRUCTOR 
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void (m), WRAPPED] call: po.j0.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void type: CONSTRUCTOR))
              (r21v0 'g10' kotlin.jvm.functions.Function1)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (r22v0 'e10' kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:kotlin.jvm.functions.Function0:0x011d: CONSTRUCTOR 
              (r38v0 'this' po.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void (m), WRAPPED] call: po.k0.<init>(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (r29v0 'imageCaptureCount' int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 'R' java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (r32v0 'webRtcManager' sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (r45v0 'transition' uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: po.m0.E(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, so.l, wm.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: go.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 35 more
            */
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.m0.E(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$CountdownToCapture, tr.f, so.l, wm.h, kotlin.jvm.functions.Function1, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen M(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput) {
        final m0 m0Var;
        Screen.b f10;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        workflowContext.m("holographic_torch_delay", new b(renderState, workflowContext, null));
        if (renderState.getHolographicTorchEnabled()) {
            m0Var = this;
        } else {
            c cVar = new c(renderProps2, renderState, workflowContext, videoCaptureHelper, null);
            m0Var = this;
            renderProps2 = renderProps2;
            workflowContext.m("holographic_torch_complete", cVar);
        }
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String b10 = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), side, b10, renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), side, b10, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar = Screen.b.a.f10814a;
        Screen.Overlay overlay = d10.getOverlay();
        no.b a10 = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState b11 = m0Var.navigationStateManager.b();
        List k10 = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 g10 = oo.e.g(workflowContext, false, onOutput, 1, null);
        kn.a e10 = videoCaptureHelper.e(renderProps2);
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, K, J, capturing, aVar, overlay, a10, side, b11, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00fc: INVOKE (r1v2 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'K' java.lang.String)
              (r6v1 'J' java.lang.String)
              (r11v3 'capturing' java.lang.String)
              (r12v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r3v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r2v2 'a10' no.b)
              (r9v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r13v1 'b11' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:0x00bb: CONSTRUCTOR 
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.l.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x00c2: CONSTRUCTOR 
              (r42v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' so.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.w.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v0 'k10' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay)
              (r16v0 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x00b0: IGET (r0v8 'm0Var' po.m0) A[WRAPPED] po.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00b2: IGET (r0v8 'm0Var' po.m0) A[WRAPPED] po.m0.f fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (r21v0 'g10' kotlin.jvm.functions.Function1)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (r22v0 'e10' kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:kotlin.jvm.functions.Function0:0x00c7: CONSTRUCTOR 
              (r0v8 'm0Var' po.m0 A[DONT_INLINE])
              (r42v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: po.e0.<init>(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (r32v0 'webRtcManager' sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (wrap:boolean:0x00b4: INVOKE (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.HolographicTorchDelay.O():boolean A[MD:():boolean (m), WRAPPED]))
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (null uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: po.m0.M(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay, tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, so.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: go.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 35 more
            */
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.m0.M(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$HolographicTorchDelay, tr.f, so.l, kotlin.jvm.functions.Function1):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen Q(@NotNull Context context, @NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        IdConfig.IdSideConfig idSideConfig;
        Screen.b f10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String b10 = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        workflowContext.n(this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), b10), new Function1() { // from class: po.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V;
                V = m0.V(m0.this, renderState, workflowContext, captureConfig, sink, (gt.n) obj);
                return V;
            }
        });
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: po.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W;
                W = m0.W(tr.f.this, (Hint) obj);
                return W;
            }
        });
        kn.a e10 = videoCaptureHelper.e(renderProps);
        kn.a aVar = kn.a.f22871a;
        boolean z11 = e10 == aVar && !videoCaptureHelper.d();
        if (!d10.getManualCaptureConfig().getIsEnabled() || z11) {
            idSideConfig = d10;
        } else {
            idSideConfig = d10;
            workflowContext.n(new TimerWorker(kotlin.ranges.d.d(d10.getManualCaptureConfig().getDelayMs(), 0L)), new Function1() { // from class: po.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit X;
                    X = m0.X(GovernmentIdState.WaitForAutocapture.this, workflowContext, (Unit) obj);
                    return X;
                }
            });
        }
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode());
        String P = com.withpersona.sdk2.inquiry.governmentid.n.P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode(), z10);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = idSideConfig.getOverlay();
        no.b a10 = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState b11 = this.navigationStateManager.b();
        List<AutoCaptureRule> a11 = idSideConfig.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 g10 = oo.e.g(workflowContext, false, onOutput, 1, null);
        kn.a e11 = videoCaptureHelper.e(renderProps);
        String R = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        ko.i L = com.withpersona.sdk2.inquiry.governmentid.n.L(renderProps, renderState.getCurrentPart().getSide());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, P, manualCapture, overlay, a10, side, b11, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b4: INVOKE (r4v3 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r10v1 'K' java.lang.String)
              (r11v1 'J' java.lang.String)
              (r12v1 'P' java.lang.String)
              (r12v2 'manualCapture' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r13v2 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r14v4 'a10' no.b)
              (r13v1 'side' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r22v0 'b11' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x0160: CONSTRUCTOR 
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture A[DONT_INLINE])
              (r4v0 'captureConfig' com.withpersona.sdk2.inquiry.governmentid.CaptureConfig A[DONT_INLINE])
              (r45v0 'this' po.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r49v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, com.withpersona.sdk2.inquiry.governmentid.CaptureConfig, po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, tr.f, so.l):void (m), WRAPPED] call: po.p.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, com.withpersona.sdk2.inquiry.governmentid.CaptureConfig, po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, tr.f, so.l):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x0168: CONSTRUCTOR (r51v0 'sink' wm.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a> A[DONT_INLINE]) A[MD:(wm.h):void (m), WRAPPED] call: po.q.<init>(wm.h):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x016d: CONSTRUCTOR 
              (r49v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' so.l A[DONT_INLINE])
              (r52v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.r.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r17v4 'a11' java.util.List<com.withpersona.sdk2.camera.AutoCaptureRule>)
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture)
              (r23v0 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x0151: IGET (r45v0 'this' po.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.m0.e com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x0153: IGET (r45v0 'this' po.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.m0.f fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x0172: CONSTRUCTOR (r49v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE]) A[MD:(tr.f):void (m), WRAPPED] call: po.s.<init>(tr.f):void type: CONSTRUCTOR))
              (r28v0 'g10' kotlin.jvm.functions.Function1)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (r29v0 'e11' kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x0179: CONSTRUCTOR 
              (r45v0 'this' po.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r48v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture A[DONT_INLINE])
              (r49v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
             A[MD:(po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, tr.f):void (m), WRAPPED] call: po.t.<init>(po.m0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, tr.f):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x0180: CONSTRUCTOR 
              (r45v0 'this' po.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r49v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void (m), WRAPPED] call: po.u.<init>(po.m0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r47v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 'R' java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (r38v0 'L' ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (r39v0 'webRtcManager' sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (r53v0 'transition' uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: po.m0.Q(android.content.Context, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, so.l, wm.h<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a>, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: go.n, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 35 more
            */
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.m0.Q(android.content.Context, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture, tr.f, so.l, wm.h, kotlin.jvm.functions.Function1, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    public final void c0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final tr.f<GovernmentIdState> workflowContext, final sr.a webRtcManager) {
        workflowContext.n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: po.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d02;
                d02 = m0.d0(m0.this, workflowContext, webRtcManager, renderState, renderProps, (b.AbstractC0542b) obj);
                return d02;
            }
        });
    }
}
