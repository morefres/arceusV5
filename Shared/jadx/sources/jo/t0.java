package jo;

import android.R;
import android.content.Context;
import android.util.Size;
import androidx.core.view.inputmethod.EditorInfoCompat;
import cn.AlertContainerScreen;
import cn.AlertScreen;
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
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import fn.CameraChoices;
import fn.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.t0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.time.a;
import mo.GovernmentIdHintWorker;
import org.jetbrains.annotations.NotNull;
import rr.b;
import wm.k;
import wm.o;
import wm.r;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$Jg\u0010-\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J[\u00101\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b1\u00102J[\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002032&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b4\u00105J[\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002062&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Ljo/t0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Lmo/a$b;", "governmentIdHintWorkerFactory", "Lrr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Lmo/a$b;Lrr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lsr/a;", "webRtcManager", "", "G0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;Lsr/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lso/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "T", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lso/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "Lwm/h;", "sink", "n0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Y", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lwm/k$a;Lso/l;Lwm/h;)Ljava/lang/Object;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", rl.d.f30696a, "Lmo/a$b;", "e", "Lrr/b$a;", "f", "Lcom/withpersona/sdk2/camera/e$a;", "g", "Lfn/c$a;", "h", "Lsq/a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a webRtcWorkerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a cameraXControllerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a camera2ControllerFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$1", f = "CaptureRenderer.kt", l = {454}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21948t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f21949u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f21950v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f21949u = holographicTorchDelay;
            this.f21950v = aVar;
        }

        public static final Unit q(r.c cVar) {
            Object c10 = cVar.c();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = c10 instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) c10 : null;
            if (holographicTorchDelay == null) {
                return Unit.f22894a;
            }
            cVar.e(GovernmentIdState.HolographicTorchDelay.J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f21949u, this.f21950v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            wm.r<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a> c10;
            Object e10 = nt.c.e();
            int i10 = this.f21948t;
            if (i10 == 0) {
                gt.o.b(obj);
                a.Companion companion = kotlin.time.a.INSTANCE;
                long p8 = kotlin.time.b.p(this.f21949u.getTorchDurationMs(), iu.b.f21120d);
                this.f21948t = 1;
                if (z0.c(p8, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            wm.h<wm.r<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a>> d10 = this.f21950v.d();
            c10 = wm.b0.c(null, new Function1() { // from class: jo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = t0.a.q((r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d10.a(c10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2", f = "CaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21951t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f21953v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f21954w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ wm.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f21955x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ so.l f21956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, so.l lVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f21953v = input;
            this.f21954w = holographicTorchDelay;
            this.f21955x = aVar;
            this.f21956y = lVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return t0.this.new b(this.f21953v, this.f21954w, this.f21955x, this.f21956y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21951t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            t0 t0Var = t0.this;
            GovernmentIdWorkflow.Input input = this.f21953v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f21954w;
            t0Var.T(input, holographicTorchDelay, this.f21955x, holographicTorchDelay.getCaptureConfig(), this.f21956y, this.f21954w.getCameraProperties(), this.f21954w.getCapturedImage());
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public t0(@NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull b.a webRtcWorkerFactory, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit A0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.f22894a;
    }

    public static final Unit B0(GovernmentIdState.WaitForAutocapture waitForAutocapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.f10815c) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22894a;
    }

    public static final wm.r C0(final Hint hint) {
        wm.r c10;
        c10 = wm.b0.c(null, new Function1() { // from class: jo.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D0;
                D0 = t0.D0(Hint.this, (r.c) obj);
                return D0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit D0(Hint hint, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture == null) {
            return Unit.f22894a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f22894a;
    }

    public static final wm.r E0(final GovernmentIdState.WaitForAutocapture waitForAutocapture, Unit it) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        c10 = wm.b0.c(null, new Function1() { // from class: jo.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F0;
                F0 = t0.F0(GovernmentIdState.WaitForAutocapture.this, (r.c) obj);
                return F0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit F0(GovernmentIdState.WaitForAutocapture waitForAutocapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.b.a.f10815c) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f22894a;
    }

    public static final wm.r H0(final t0 t0Var, final sr.a aVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final k.a aVar2, final b.AbstractC0542b it) {
        wm.r c10;
        wm.r c11;
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices b10 = fn.f0.b(t0Var.applicationContext, fn.m0.f17385a);
        if (it instanceof b.AbstractC0542b.C0543b) {
            c11 = wm.b0.c(null, new Function1() { // from class: jo.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit I0;
                    I0 = t0.I0(sr.a.this, t0Var, b10, it, waitForAutocapture, input, aVar2, (r.c) obj);
                    return I0;
                }
            }, 1, null);
            return c11;
        }
        if (!(it instanceof b.AbstractC0542b.Error)) {
            throw new gt.l();
        }
        c10 = wm.b0.c(null, new Function1() { // from class: jo.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit O0;
                O0 = t0.O0(k.a.this, aVar, (r.c) obj);
                return O0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit I0(final sr.a aVar, final t0 t0Var, CameraChoices cameraChoices, b.AbstractC0542b abstractC0542b, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final k.a aVar2, r.c action) {
        int i10;
        int i11;
        fn.h0 primaryChoice;
        fn.h0 primaryChoice2;
        fn.h0 primaryChoice3;
        Size size;
        fn.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == so.x.f31612a) {
            return Unit.f22894a;
        }
        if (waitForAutocapture2 != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, so.x.f31612a, null, null, false, false, null, null, null, 32639, null));
        }
        if (aVar != null) {
            aVar.c(t0Var.webRtcWorkerFactory.getService());
        }
        if (aVar != null) {
            aVar.i(t0Var.applicationContext);
        }
        int i12 = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            i12 = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i10 = i12;
            i11 = width;
        } else {
            i11 = i12;
            i10 = width;
        }
        if (aVar != null) {
            b.AbstractC0542b.C0543b c0543b = (b.AbstractC0542b.C0543b) abstractC0542b;
            aVar.f(c0543b.getResult().getUsername(), c0543b.getResult().getCredential(), c0543b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: jo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit J0;
                    J0 = t0.J0(t0.this, input, waitForAutocapture);
                    return J0;
                }
            }, new Function0() { // from class: jo.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit K0;
                    K0 = t0.K0(k.a.this, aVar);
                    return K0;
                }
            }, new Function0() { // from class: jo.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit M0;
                    M0 = t0.M0(t0.this, input);
                    return M0;
                }
            }, new Function1() { // from class: jo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit N0;
                    N0 = t0.N0(t0.this, (String) obj);
                    return N0;
                }
            });
        }
        return Unit.f22894a;
    }

    public static final Unit J0(t0 t0Var, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f22894a;
    }

    public static final Unit K0(k.a aVar, final sr.a aVar2) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L0;
                L0 = t0.L0(sr.a.this, (r.c) obj);
                return L0;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit L0(sr.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.a();
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22894a;
    }

    public static final Unit M0(t0 t0Var, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(t0Var.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f22894a;
    }

    public static final Unit N0(t0 t0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(t0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f22894a;
    }

    public static final Unit O0(k.a aVar, final sr.a aVar2, r.c action) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c11 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c11 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c11 : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == so.x.f31612a) {
            return Unit.f22894a;
        }
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit P0;
                P0 = t0.P0(sr.a.this, (r.c) obj);
                return P0;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit P0(sr.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (aVar != null) {
            aVar.a();
        }
        action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        return Unit.f22894a;
    }

    public static final Unit U(GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, CaptureConfig captureConfig, CameraProperties cameraProperties, int i10, GovernmentId.GovernmentIdImage governmentIdImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != governmentIdState.getClass()) {
            return Unit.f22894a;
        }
        action.e(new GovernmentIdState.HolographicTorchDelay(sideIdPart, governmentIdState.E(), governmentIdState.D(), governmentIdState.getPartIndex(), governmentIdState.getBackState(), governmentIdState.getCountryCode(), captureConfig, cameraProperties, i10, governmentIdImage, false, 1024, null));
        return Unit.f22894a;
    }

    public static final Unit V(k.a aVar, final so.l lVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W;
                W = t0.W(so.l.this, (r.c) obj);
                return W;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit W(so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.b : so.x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit X(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        IdPart currentPart = governmentIdState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.f22894a;
        }
        action.e(new GovernmentIdState.ReviewCapturedImage(sideIdPart, ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, ((GovernmentIdState) action.c()).D(), ((GovernmentIdState) action.c()).getPartIndex(), waitForAutocapture, cameraProperties, null, false, ((GovernmentIdState) action.c()).getCountryCode(), 768, null));
        return Unit.f22894a;
    }

    public static final wm.r Z(final Hint hint) {
        wm.r c10;
        c10 = wm.b0.c(null, new Function1() { // from class: jo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a02;
                a02 = t0.a0(Hint.this, (r.c) obj);
                return a02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit a0(Hint hint, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture = c10 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) c10 : null;
        if (countdownToCapture == null) {
            return Unit.f22894a;
        }
        action.e(GovernmentIdState.CountdownToCapture.J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f22894a;
    }

    public static final Unit b0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit c0(k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    public static final Unit d0(GovernmentIdState.CountdownToCapture countdownToCapture, t0 t0Var, GovernmentIdWorkflow.Input input, k.a aVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
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
        t0Var.T(input, countdownToCapture, aVar, captureConfig, lVar, cameraProperties, GovernmentId.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f22894a;
    }

    public static final Unit e0(final k.a aVar, final GovernmentIdState.CountdownToCapture countdownToCapture, final GovernmentIdWorkflow.Input input, final so.l lVar, final Throwable error) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(error, "error");
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f02;
                f02 = t0.f0(GovernmentIdState.CountdownToCapture.this, input, error, aVar, lVar, (r.c) obj);
                return f02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit f0(GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, Throwable th2, final k.a aVar, final so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = c10 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) c10 : null;
        if (countdownToCapture2 == null) {
            return Unit.f22894a;
        }
        action.e(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.E(), countdownToCapture.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O((GovernmentIdWorkflow.Input) action.b(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.D(), countdownToCapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), so.x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), th2, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: jo.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g02;
                g02 = t0.g0(k.a.this, lVar);
                return g02;
            }
        }, 11264, null));
        return Unit.f22894a;
    }

    public static final Unit g0(k.a aVar, final so.l lVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h02;
                h02 = t0.h0(so.l.this, (r.c) obj);
                return h02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit h0(so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? so.x.b : so.x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit i0(t0 t0Var, k.a aVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22894a;
    }

    public static final Unit k0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit l0(k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    public static final Unit m0(t0 t0Var, k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, true);
        return Unit.f22894a;
    }

    public static final Unit o0(k.a aVar, AlertScreen.b it) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p02;
                p02 = t0.p0((r.c) obj);
                return p02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit p0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.e(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.f22894a;
    }

    public static final Unit q0(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, t0 t0Var, GovernmentIdWorkflow.Input input, k.a aVar, so.l lVar, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        t0Var.T(input, waitForAutocapture, aVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, com.withpersona.sdk2.inquiry.governmentid.n.e0(waitForAutocapture.getCurrentPart().getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig), GovernmentId.a.b, null, null, 32, null));
        return Unit.f22894a;
    }

    public static final Unit r0(wm.h hVar) {
        hVar.a(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit s0(k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    public static final Unit t0(k.a aVar, final Throwable error) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(error, "error");
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u02;
                u02 = t0.u0(error, (r.c) obj);
                return u02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit u0(Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture == null) {
            return Unit.f22894a;
        }
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.b, null, 0, null, null, null, th2, false, false, null, null, null, 32247, null));
        return Unit.f22894a;
    }

    public static final Unit v0(t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, k.a aVar) {
        wm.r c10;
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: jo.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w02;
                w02 = t0.w0(GovernmentIdState.WaitForAutocapture.this, (r.c) obj);
                return w02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit w0(GovernmentIdState.WaitForAutocapture waitForAutocapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, Screen.b.a.f10814a, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f22894a;
    }

    public static final Unit x0(t0 t0Var, k.a aVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(t0Var.applicationContext, aVar, input, lVar.c(input));
        return Unit.f22894a;
    }

    public static final wm.r y0(final t0 t0Var, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final CaptureConfig captureConfig, gt.n nVar) {
        wm.r c10;
        wm.r c11;
        wm.r c12;
        Object value = nVar.getValue();
        Throwable e10 = gt.n.e(value);
        if (e10 == null) {
            final GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            c12 = wm.b0.c(null, new Function1() { // from class: jo.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit z02;
                    z02 = t0.z0(t0.this, waitForAutocapture, captureConfig, governmentIdImage, (r.c) obj);
                    return z02;
                }
            }, 1, null);
            return c12;
        }
        String message = e10.getMessage();
        if (message == null || !StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            c10 = wm.b0.c(null, new Function1() { // from class: jo.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit B0;
                    B0 = t0.B0(GovernmentIdState.WaitForAutocapture.this, (r.c) obj);
                    return B0;
                }
            }, 1, null);
            return c10;
        }
        c11 = wm.b0.c(null, new Function1() { // from class: jo.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit A0;
                A0 = t0.A0((r.c) obj);
                return A0;
            }
        }, 1, null);
        return c11;
    }

    public static final Unit z0(t0 t0Var, GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logGovernmentIdStateEvent$default(t0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, com.withpersona.sdk2.inquiry.governmentid.n.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture2 == null) {
            return Unit.f22894a;
        }
        action.e(new GovernmentIdState.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((GovernmentIdState) action.c()).E(), captureConfig, governmentIdImage, waitForAutocapture2.D(), waitForAutocapture2.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.f22894a;
    }

    public final void G0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final sr.a webRtcManager) {
        wm.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), kotlin.jvm.internal.d0.k(rr.b.class), "", new Function1() { // from class: jo.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r H0;
                H0 = t0.H0(t0.this, webRtcManager, renderState, renderProps, context, (b.AbstractC0542b) obj);
                return H0;
            }
        });
    }

    public final void T(GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState, final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, final CaptureConfig captureConfig, final so.l videoCaptureHelper, final CameraProperties cameraProperties, final GovernmentId.GovernmentIdImage capturedId) {
        wm.r<? super Object, GovernmentIdState, ? extends Object> c10;
        wm.r<? super Object, GovernmentIdState, ? extends Object> c11;
        boolean z10 = false;
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
        IdConfig c12 = com.withpersona.sdk2.inquiry.governmentid.c.c(captureConfig);
        if (videoCaptureHelper.c(renderProps) && intValue > 0 && renderState.E().isEmpty() && sideIdPart != null) {
            z10 = true;
        }
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            wm.h<wm.r<? super Object, GovernmentIdState, ? extends Object>> d10 = context.d();
            final int i10 = intValue;
            final IdPart.SideIdPart sideIdPart2 = sideIdPart;
            c11 = wm.b0.c(null, new Function1() { // from class: jo.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit U;
                    U = t0.U(GovernmentIdState.this, sideIdPart2, captureConfig, cameraProperties, i10, capturedId, (r.c) obj);
                    return U;
                }
            }, 1, null);
            d10.a(c11);
            return;
        }
        boolean c13 = videoCaptureHelper.c(renderProps);
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (c12 != null && (c13 || shouldSkipReviewScreen)) {
            com.withpersona.sdk2.inquiry.governmentid.n.W(renderState, context, renderProps, capturedId, c12, videoCaptureHelper, cameraProperties, (r26 & 128) != 0, (r26 & 256) != 0 ? renderState.D() : null, (r26 & 512) != 0 ? renderState.getPartIndex() : 0, (r26 & 1024) != 0 ? null : null, (r26 & 2048) != 0 ? renderState.getCountryCode() : null);
        } else {
            if (sideIdPart == null) {
                return;
            }
            final GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(renderProps, sideIdPart.getSide()), renderState.D(), renderState.getPartIndex(), renderState.getBackState(), so.x.f31613c, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: jo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit V;
                    V = t0.V(k.a.this, videoCaptureHelper);
                    return V;
                }
            }, 11776, null);
            wm.h<wm.r<? super Object, GovernmentIdState, ? extends Object>> d11 = context.d();
            c10 = wm.b0.c(null, new Function1() { // from class: jo.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit X;
                    X = t0.X(GovernmentIdState.this, captureConfig, capturedId, waitForAutocapture, cameraProperties, (r.c) obj);
                    return X;
                }
            }, 1, null);
            d11.a(c10);
        }
    }

    @NotNull
    public final Object Y(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        Screen.b f10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        wm.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: jo.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r Z;
                Z = t0.Z((Hint) obj);
                return Z;
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
        Function1 A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a e10 = videoCaptureHelper.e(renderProps);
        String R = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, capturing, aVar, overlay, a10, side, b10, (r70 & 512) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit h10;
                h10 = com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
                return h10;
            }
        } : null, new Function0() { // from class: jo.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b02;
                b02 = t0.b0(wm.h.this);
                return b02;
            }
        }, new Function0() { // from class: jo.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c02;
                c02 = t0.c0(k.a.this, videoCaptureHelper);
                return c02;
            }
        }, true, a11, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & r70) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit i10;
                i10 = com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
                return i10;
            }
        } : new Function2() { // from class: jo.o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit d02;
                d02 = t0.d0(GovernmentIdState.CountdownToCapture.this, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
                return d02;
            }
        }, (524288 & r70) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
                return j10;
            }
        } : new Function1() { // from class: jo.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e02;
                e02 = t0.e0(k.a.this, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
                return e02;
            }
        }, A, (2097152 & r70) != 0 ? kn.a.f22872c : e10, (4194304 & r70) != 0, (8388608 & r70) != 0 ? false : false, (16777216 & r70) != 0 ? false : false, (33554432 & r70) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit k10;
                k10 = com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
                return k10;
            }
        } : null, (67108864 & r70) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l10;
                l10 = com.withpersona.sdk2.inquiry.governmentid.l.l();
                return l10;
            }
        } : null, new Function0() { // from class: jo.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i02;
                i02 = t0.i0(t0.this, context, renderProps, videoCaptureHelper);
                return i02;
            }
        }, (268435456 & r70) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (536870912 & r70) != 0 ? null : R, (1073741824 & r70) != 0 ? null : null, (r70 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (r71 & 1) != 0 ? false : false, (r71 & 2) != 0 ? uq.l.f33106a : null);
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(f10), null, 2, null);
    }

    @NotNull
    public final Object j0(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        final t0 t0Var;
        Screen.b f10;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        context.b("holographic_torch_delay", new a(renderState, context, null));
        if (renderState.getHolographicTorchEnabled()) {
            t0Var = this;
        } else {
            b bVar = new b(renderProps2, renderState, context, videoCaptureHelper, null);
            t0Var = this;
            renderProps2 = renderProps2;
            context.b("holographic_torch_complete", bVar);
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
        NavigationState b11 = t0Var.navigationStateManager.b();
        List k10 = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a e10 = videoCaptureHelper.e(renderProps2);
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, K, J, capturing, aVar, overlay, a10, side, b11, (r70 & 512) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit h10;
                h10 = com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
                return h10;
            }
        } : null, new Function0() { // from class: jo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k02;
                k02 = t0.k0(wm.h.this);
                return k02;
            }
        }, new Function0() { // from class: jo.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l02;
                l02 = t0.l0(k.a.this, videoCaptureHelper);
                return l02;
            }
        }, false, k10, renderState, partIndex, t0Var.cameraXControllerFactory, t0Var.camera2ControllerFactory, (262144 & r70) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit i10;
                i10 = com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
                return i10;
            }
        } : null, (524288 & r70) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
                return j10;
            }
        } : null, A, (2097152 & r70) != 0 ? kn.a.f22872c : e10, (4194304 & r70) != 0, (8388608 & r70) != 0 ? false : false, (16777216 & r70) != 0 ? false : false, (33554432 & r70) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit k102;
                k102 = com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
                return k102;
            }
        } : null, (67108864 & r70) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l10;
                l10 = com.withpersona.sdk2.inquiry.governmentid.l.l();
                return l10;
            }
        } : null, new Function0() { // from class: jo.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m02;
                m02 = t0.m0(t0.this, context, renderProps2);
                return m02;
            }
        }, (268435456 & r70) != 0 ? renderProps2.getImageCaptureCount() : 0, (536870912 & r70) != 0 ? null : null, (1073741824 & r70) != 0 ? null : null, (r70 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (r71 & 1) != 0 ? false : renderState.getHolographicTorchEnabled(), (r71 & 2) != 0 ? uq.l.f33106a : null);
        return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(f10), null, 2, null);
    }

    @NotNull
    public final Object n0(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper, @NotNull final wm.h<? super GovernmentIdWorkflow.a> sink) {
        Screen.b f10;
        wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar;
        so.l lVar;
        mp.c<Object, Object> c10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, renderState.getCurrentPart().getSide());
        String b10 = com.withpersona.sdk2.inquiry.governmentid.c.b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        wm.w.l(context, this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), b10), kotlin.jvm.internal.d0.k(GovernmentIdAnalyzeWorker.class), "", new Function1() { // from class: jo.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r y02;
                y02 = t0.y0(t0.this, renderState, captureConfig, (gt.n) obj);
                return y02;
            }
        });
        wm.w.l(context, this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), kotlin.jvm.internal.d0.k(GovernmentIdHintWorker.class), "", new Function1() { // from class: jo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r C0;
                C0 = t0.C0((Hint) obj);
                return C0;
            }
        });
        kn.a e10 = videoCaptureHelper.e(renderProps);
        kn.a aVar2 = kn.a.f22871a;
        boolean z11 = e10 == aVar2 && !videoCaptureHelper.d();
        if (d10.getManualCaptureConfig().getIsEnabled() && !z11) {
            wm.w.l(context, o.Companion.b(wm.o.INSTANCE, kotlin.ranges.d.d(d10.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), kotlin.jvm.internal.d0.l(wm.o.class, KTypeProjection.INSTANCE.a(kotlin.jvm.internal.d0.k(Unit.class))), d10.getSideKey(), new Function1() { // from class: jo.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r E0;
                    E0 = t0.E0(GovernmentIdState.WaitForAutocapture.this, (Unit) obj);
                    return E0;
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map g10 = kotlin.collections.j0.g(gt.s.a(AlertScreen.a.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string = this.applicationContext.getString(tp.g.f32396n);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(g10, string, null, false, new Function1() { // from class: jo.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit o02;
                    o02 = t0.o0(k.a.this, (AlertScreen.b) obj);
                    return o02;
                }
            }, 12, null));
        }
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode());
        String P = com.withpersona.sdk2.inquiry.governmentid.n.P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), b10, renderState.getCountryCode(), z10);
        IdConfig.b side = renderState.getCurrentPart().getSide();
        Screen.b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = d10.getOverlay();
        no.b a10 = com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig);
        NavigationState b11 = this.navigationStateManager.b();
        List<AutoCaptureRule> a11 = d10.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 A = com.withpersona.sdk2.inquiry.governmentid.n.A(context, false, 1, null);
        kn.a e11 = videoCaptureHelper.e(renderProps);
        String R = com.withpersona.sdk2.inquiry.governmentid.n.R(renderProps.getStrings(), renderState.getHint());
        ko.i L = com.withpersona.sdk2.inquiry.governmentid.n.L(renderProps, renderState.getCurrentPart().getSide());
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, P, manualCapture, overlay, a10, side, b11, (r70 & 512) != 0 ? new Function2() { // from class: go.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit h10;
                h10 = com.withpersona.sdk2.inquiry.governmentid.l.h((List) obj, (CameraProperties) obj2);
                return h10;
            }
        } : new Function2() { // from class: jo.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit q02;
                q02 = t0.q0(GovernmentIdState.WaitForAutocapture.this, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
                return q02;
            }
        }, new Function0() { // from class: jo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit r02;
                r02 = t0.r0(wm.h.this);
                return r02;
            }
        }, new Function0() { // from class: jo.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit s02;
                s02 = t0.s0(k.a.this, videoCaptureHelper);
                return s02;
            }
        }, false, a11, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & r70) != 0 ? new Function2() { // from class: go.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit i10;
                i10 = com.withpersona.sdk2.inquiry.governmentid.l.i((List) obj, (CameraProperties) obj2);
                return i10;
            }
        } : null, (524288 & r70) != 0 ? new Function1() { // from class: go.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.governmentid.l.j((Throwable) obj);
                return j10;
            }
        } : new Function1() { // from class: jo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t02;
                t02 = t0.t0(k.a.this, (Throwable) obj);
                return t02;
            }
        }, A, (2097152 & r70) != 0 ? kn.a.f22872c : e11, (4194304 & r70) != 0, (8388608 & r70) != 0 ? false : false, (16777216 & r70) != 0 ? false : false, (33554432 & r70) != 0 ? new Function2() { // from class: go.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit k102;
                k102 = com.withpersona.sdk2.inquiry.governmentid.l.k((File) obj, (CameraProperties) obj2);
                return k102;
            }
        } : null, (67108864 & r70) != 0 ? new Function0() { // from class: go.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l10;
                l10 = com.withpersona.sdk2.inquiry.governmentid.l.l();
                return l10;
            }
        } : new Function0() { // from class: jo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit v02;
                v02 = t0.v0(t0.this, renderState, context);
                return v02;
            }
        }, new Function0() { // from class: jo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit x02;
                x02 = t0.x0(t0.this, context, renderProps, videoCaptureHelper);
                return x02;
            }
        }, (268435456 & r70) != 0 ? renderProps.getImageCaptureCount() : 0, (536870912 & r70) != 0 ? null : R, (1073741824 & r70) != 0 ? null : L, (r70 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (r71 & 1) != 0 ? false : false, (r71 & 2) != 0 ? uq.l.f33106a : null);
        if (renderState.getCheckCameraPermissions()) {
            c10 = com.withpersona.sdk2.inquiry.governmentid.n.j0(f10, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                lVar = videoCaptureHelper;
                if (lVar.c(renderProps) && hq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    c10 = com.withpersona.sdk2.inquiry.governmentid.n.f0(f10, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                } else {
                    aVar = context;
                }
            } else {
                aVar = context;
                lVar = videoCaptureHelper;
            }
            if (lVar.e(renderProps) == aVar2 && renderState.getWebRtcState() == so.x.f31613c) {
                G0(renderProps, renderState, aVar, lVar.getWebRtcManager());
                c10 = com.withpersona.sdk2.inquiry.permissions.g.c(f10);
            } else {
                c10 = com.withpersona.sdk2.inquiry.permissions.g.c(f10);
            }
        }
        return new AlertContainerScreen(c10, arrayList);
    }
}
