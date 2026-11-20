package po;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lpo/v0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "renderState", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lso/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Luq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Ltr/f;Lso/l;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "h", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lso/l;Lcom/withpersona/sdk2/camera/CameraProperties;Ltr/f;)V", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lfn/c$a;", rl.d.f30696a, "Lsq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v0 {

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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "GovIdLocalVideoCaptureRenderer.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f28841t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.FinalizeLocalVideoCapture f28842u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ tr.f<GovernmentIdState> f28843v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, tr.f<GovernmentIdState> fVar, mt.b<? super a> bVar) {
            super(1, bVar);
            this.f28842u = finalizeLocalVideoCapture;
            this.f28843v = fVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new a(this.f28842u, this.f28843v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f28841t;
            if (i10 == 0) {
                gt.o.b(obj);
                long minDurationMs = this.f28842u.getMinDurationMs();
                this.f28841t = 1;
                if (ju.z0.b(minDurationMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            GovernmentIdState i11 = this.f28843v.i();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = i11 instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) i11 : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22894a;
            }
            this.f28843v.p(GovernmentIdState.FinalizeLocalVideoCapture.J(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, FrameMetricsAggregator.EVERY_DURATION, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public v0(@NotNull Context applicationContext, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit j(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22894a;
    }

    public static final Unit k(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit l(tr.f fVar, GovernmentIdWorkflow.Input input, Function1 function1) {
        oo.e.p(fVar, input, null, function1);
        return Unit.f22894a;
    }

    public static final Unit m(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit n(v0 v0Var, GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, GovernmentIdWorkflow.Input input, so.l lVar, tr.f fVar, File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        v0Var.h(file, finalizeLocalVideoCapture, input, lVar, cameraProperties, fVar);
        return Unit.f22894a;
    }

    public static final Unit o() {
        return Unit.f22894a;
    }

    public static final Unit p(v0 v0Var, tr.f fVar, GovernmentIdWorkflow.Input input) {
        oo.e.q(v0Var.applicationContext, fVar, input, true);
        return Unit.f22894a;
    }

    public final void h(File file, GovernmentIdState.FinalizeLocalVideoCapture renderState, GovernmentIdWorkflow.Input renderProps, so.l videoCaptureHelper, CameraProperties cameraProperties, tr.f<GovernmentIdState> workflowContext) {
        List<GovernmentId> E = renderState.E();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(E, 10));
        Iterator<T> it = E.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.b bVar = GovernmentId.b.f10506a;
        boolean contains = arrayList.contains(bVar);
        GovernmentId.b bVar2 = GovernmentId.b.b;
        boolean contains2 = arrayList.contains(bVar2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List d10 = kotlin.collections.o.d(new Frame(absolutePath, "video/*"));
        if (contains && contains2) {
            bVar = GovernmentId.b.f10507c;
        } else if (!contains && contains2) {
            bVar = bVar2;
        }
        oo.e.s(renderState, workflowContext, renderProps, new GovernmentId.GovernmentIdVideo(d10, bVar, renderState.getId().getIdClassKey(), GovernmentId.a.b), renderState.getId(), videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    @NotNull
    public final Screen i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeLocalVideoCapture renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        IdConfig.b bVar;
        Screen.b f10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        workflowContext.m("finalize_delay", new a(renderState, workflowContext, null));
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (bVar = sideIdPart.getSide()) == null) {
            bVar = IdConfig.b.f10747d;
        }
        IdConfig.b bVar2 = bVar;
        IdConfig.IdSideConfig g10 = renderState.getId().g(bVar2);
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps.getStrings(), bVar2, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps.getStrings(), bVar2, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        Screen.b.a aVar = Screen.b.a.f10814a;
        no.b type = renderState.getId().getType();
        Screen.Overlay overlay = g10.getOverlay();
        NavigationState b = this.navigationStateManager.b();
        List k10 = kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1<Throwable, Unit> f11 = oo.e.f(workflowContext, false, onOutput);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, capturing, aVar, overlay, type, bVar2, b, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0115: INVOKE (r1v3 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r7v3 'K' java.lang.String)
              (r9v3 'J' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r11v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r13v0 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r12v1 'type' no.b)
              (r8v2 'bVar2' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r14v0 'b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00bc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.o0.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00c3: CONSTRUCTOR 
              (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.p0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x00cb: CONSTRUCTOR 
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r43v0 'onOutput' kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit> A[DONT_INLINE])
             A[MD:(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: po.q0.<init>(tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v1 'k10' java.util.List)
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture)
              (r16v1 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x00b4: IGET (r38v0 'this' po.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.v0.b com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00b6: IGET (r38v0 'this' po.v0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] po.v0.c fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x00d2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.r0.<init>():void type: CONSTRUCTOR))
              (r21v0 'f11' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (wrap:kn.a:0x00b2: SGET  A[WRAPPED] kn.a.b kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00dc: CONSTRUCTOR 
              (r38v0 'this' po.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r40v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' so.l A[DONT_INLINE])
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
             A[MD:(po.v0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, tr.f):void (m), WRAPPED] call: po.s0.<init>(po.v0, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l, tr.f):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x00e2: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: po.t0.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00e7: CONSTRUCTOR 
              (r38v0 'this' po.v0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> A[DONT_INLINE])
              (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(po.v0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: po.u0.<init>(po.v0, tr.f, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r39v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (null sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (r44v0 'transition' uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: po.v0.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState>, so.l, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, kotlin.Unit>, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen, file: classes3.dex
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
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.v0.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, tr.f, so.l, kotlin.jvm.functions.Function1, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }
}
