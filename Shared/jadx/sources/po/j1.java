package po;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lpo/j1;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lso/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Luq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Ltr/f;Lso/l;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "u", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lfn/c$a;", rl.d.f30696a, "Lsq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e.a cameraXControllerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a camera2ControllerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    public j1(@NotNull Context applicationContext, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit n(j1 j1Var, GovernmentIdWorkflow.Input input, sr.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, tr.f fVar, so.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar.isConnected()) {
            aVar.e();
            oo.e.s(finalizeWebRtc, fVar, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.D(), 0, it, null, 2560, null);
        }
        return Unit.f22894a;
    }

    public static final Unit o(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22894a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit q(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit r(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit s() {
        return Unit.f22894a;
    }

    public static final Unit t(j1 j1Var, tr.f fVar, GovernmentIdWorkflow.Input input) {
        oo.e.q(j1Var.applicationContext, fVar, input, true);
        return Unit.f22894a;
    }

    public static final Unit v(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit w(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit x(j1 j1Var, GovernmentIdWorkflow.Input input, sr.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, tr.f fVar, so.l lVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TrackingEventsLogger.logVideoStopEvent$default(j1Var.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar.isConnected()) {
            aVar.e();
            oo.e.s(finalizeWebRtc, fVar, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), false, finalizeWebRtc.D(), 0, it, null, 2560, null);
        }
        return Unit.f22894a;
    }

    public static final Unit y(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit z(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    @NotNull
    public final Screen m(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        final j1 j1Var;
        final sr.a aVar;
        IdConfig.b bVar;
        Screen.b f10;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: po.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit n10;
                    n10 = j1.n(j1.this, renderProps2, aVar, renderState, workflowContext, videoCaptureHelper, (String) obj);
                    return n10;
                }
            };
            j1Var = this;
            renderProps2 = renderProps2;
            aVar.g(fromStep, function1);
        } else {
            j1Var = this;
            aVar = webRtcManager;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (bVar = sideIdPart.getSide()) == null) {
            bVar = IdConfig.b.f10747d;
        }
        IdConfig.IdSideConfig g10 = renderState.getId().g(bVar);
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), bVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), bVar, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar2 = Screen.b.a.f10814a;
        no.b type = renderState.getId().getType();
        Screen.Overlay overlay = g10.getOverlay();
        NavigationState b = j1Var.navigationStateManager.b();
        List k10 = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> f11 = oo.e.f(workflowContext, false, onOutput);
        kn.a aVar3 = kn.a.f22871a;
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, K, J, capturing, aVar2, overlay, type, bVar, b, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0117: INVOKE (r1v2 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'K' java.lang.String)
              (r10v3 'J' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r12v1 'aVar2' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r4v3 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r13v1 'type' no.b)
              (r2v4 'bVar' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r14v1 'b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.a1.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00d4: CONSTRUCTOR 
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.b1.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x00db: CONSTRUCTOR 
              (r42v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' so.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.c1.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v2 'k10' java.util.List)
              (r41v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc)
              (r16v0 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x00c1: IGET (r0v7 'j1Var' po.j1) A[WRAPPED] po.j1.b com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00c5: IGET (r0v7 'j1Var' po.j1) A[WRAPPED] po.j1.c fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.d1.<init>():void type: CONSTRUCTOR))
              (r21v0 'f11' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (r22v0 'aVar3' kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.e1.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00ea: CONSTRUCTOR 
              (r0v7 'j1Var' po.j1 A[DONT_INLINE])
              (r42v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(po.j1, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: po.f1.<init>(po.j1, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (r3v1 'aVar' sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (r45v0 'transition' uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: po.j1.m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, so.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
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
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.j1.m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, tr.f, so.l, kotlin.jvm.functions.Function1, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }

    @NotNull
    public final Screen u(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        j1 j1Var;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            j1Var = this;
            webRtcManager.g(renderProps.getFromStep(), new Function1() { // from class: po.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit x10;
                    x10 = j1.x(j1.this, renderProps, webRtcManager, renderState, workflowContext, videoCaptureHelper, (String) obj);
                    return x10;
                }
            });
        } else {
            j1Var = this;
        }
        sq.a.d(j1Var.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        return customPendingPage != null ? new Screen.f(yq.b.a(customPendingPage), j1Var.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: po.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit y10;
                y10 = j1.y(Function1.this);
                return y10;
            }
        }, new Function0() { // from class: po.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z10;
                z10 = j1.z(Function1.this);
                return z10;
            }
        }, renderProps.getStrings().getPendingPageNavBarTitle(), false, transition, 64, null) : new Screen.j(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), j1Var.navigationStateManager.b(), new Function0() { // from class: po.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit v5;
                v5 = j1.v(Function1.this);
                return v5;
            }
        }, new Function0() { // from class: po.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit w5;
                w5 = j1.w(Function1.this);
                return w5;
            }
        }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), transition, 256, null);
    }
}
