package so;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJM\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lso/v;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lso/l;", "videoCaptureHelper", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lwm/k$a;Lso/l;)Ljava/lang/Object;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lfn/c$a;", rl.d.f30696a, "Lsq/a;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

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

    public v(@NotNull Context applicationContext, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
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

    public static final Unit k(final k.a aVar, final v vVar, final GovernmentIdWorkflow.Input input, final sr.a aVar2, final GovernmentIdState.FinalizeWebRtc finalizeWebRtc, final l lVar, final String it) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: so.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = v.l(v.this, input, aVar2, finalizeWebRtc, aVar, lVar, it, (r.c) obj);
                return l10;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit l(v vVar, GovernmentIdWorkflow.Input input, sr.a aVar, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, k.a aVar2, l lVar, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logVideoStopEvent$default(vVar.trackingEventsLogger, input.getFromStep(), "Stream", null, null, null, null, false, 124, null);
        if (aVar.isConnected()) {
            aVar.e();
            com.withpersona.sdk2.inquiry.governmentid.n.W(finalizeWebRtc, aVar2, input, null, finalizeWebRtc.getId(), lVar, finalizeWebRtc.getCameraProperties(), (r26 & 128) != 0, (r26 & 256) != 0 ? finalizeWebRtc.D() : finalizeWebRtc.D(), (r26 & 512) != 0 ? finalizeWebRtc.getPartIndex() : 0, (r26 & 1024) != 0 ? null : str, (r26 & 2048) != 0 ? finalizeWebRtc.getCountryCode() : null);
        }
        return Unit.f22894a;
    }

    public static final Unit m(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22894a;
    }

    public static final Unit n(k.a aVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: so.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = v.o((r.c) obj);
                return o8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit o(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit p(k.a aVar, l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    public static final Unit q(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit r() {
        return Unit.f22894a;
    }

    public static final Unit s(v vVar, k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(vVar.applicationContext, aVar, input, true);
        return Unit.f22894a;
    }

    @NotNull
    public final Object j(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeWebRtc renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final l videoCaptureHelper) {
        final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar;
        final sr.a aVar2;
        final v vVar;
        IdConfig.b bVar;
        Screen.b f10;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        sr.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            String fromStep = renderProps2.getFromStep();
            aVar2 = webRtcManager;
            Function1<? super String, Unit> function1 = new Function1() { // from class: so.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit k10;
                    k10 = v.k(k.a.this, this, renderProps2, aVar2, renderState, videoCaptureHelper, (String) obj);
                    return k10;
                }
            };
            vVar = this;
            aVar = context;
            renderProps2 = renderProps2;
            aVar2.g(fromStep, function1);
        } else {
            aVar = context;
            aVar2 = webRtcManager;
            vVar = this;
        }
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null || (bVar = sideIdPart.getSide()) == null) {
            bVar = IdConfig.b.f10747d;
        }
        IdConfig.b bVar2 = bVar;
        IdConfig.IdSideConfig g10 = renderState.getId().g(bVar2);
        String K = com.withpersona.sdk2.inquiry.governmentid.n.K(renderProps2.getStrings(), bVar2, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String J = com.withpersona.sdk2.inquiry.governmentid.n.J(renderProps2.getStrings(), bVar2, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.b.a aVar3 = Screen.b.a.f10814a;
        no.b type = renderState.getId().getType();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps2, K, J, capturing, aVar3, g10.getOverlay(), type, bVar2, vVar.navigationStateManager.b(), (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012d: INVOKE (r1v2 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r9v1 'K' java.lang.String)
              (r10v3 'J' java.lang.String)
              (r11v4 'capturing' java.lang.String)
              (r5v2 'aVar3' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (wrap:com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay:0x00a2: INVOKE (r3v6 'g10' com.withpersona.sdk2.inquiry.governmentid.IdConfig$IdSideConfig) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.IdConfig.IdSideConfig.g():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay A[MD:():com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay (m), WRAPPED])
              (r13v1 'type' no.b)
              (r8v0 'bVar2' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (wrap:com.withpersona.sdk2.inquiry.shared.navigation.NavigationState:0x00a8: INVOKE (wrap:sq.a:0x00a6: IGET (r0v2 'vVar' so.v) A[WRAPPED] so.v.d sq.a) VIRTUAL call: sq.a.b():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState A[MD:():com.withpersona.sdk2.inquiry.shared.navigation.NavigationState (m), WRAPPED])
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00ca: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.n.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00d2: CONSTRUCTOR 
              (r2v5 'aVar' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(wm.k$a):void (m), WRAPPED] call: so.o.<init>(wm.k$a):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x00d9: CONSTRUCTOR 
              (r2v5 'aVar' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(wm.k$a, so.l):void (m), WRAPPED] call: so.p.<init>(wm.k$a, so.l):void type: CONSTRUCTOR)
              false
              (wrap:java.util.List:0x00ae: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED])
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc)
              (wrap:int:0x00b2: INVOKE (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.FinalizeWebRtc.C():int A[MD:():int (m), WRAPPED])
              (wrap:com.withpersona.sdk2.camera.e$a:0x00bd: IGET (r0v2 'vVar' so.v) A[WRAPPED] so.v.b com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00c1: IGET (r0v2 'vVar' so.v) A[WRAPPED] so.v.c fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x00e0: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.q.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>:0x00b7: INVOKE 
              (r2v5 'aVar' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a)
              false
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.n.z(wm.k$a, boolean):kotlin.jvm.functions.Function1 A[MD:(wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, boolean):kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> (m), WRAPPED])
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (wrap:kn.a:0x00bb: SGET  A[WRAPPED] kn.a.a kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x00e5: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.r.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00ec: CONSTRUCTOR 
              (r0v2 'vVar' so.v A[DONT_INLINE])
              (r2v5 'aVar' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(so.v, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: so.s.<init>(so.v, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r1v1 'renderProps2' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (r4v1 'aVar2' sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (null uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: so.v.j(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, so.l):java.lang.Object, file: classes3.dex
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
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so.v.j(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeWebRtc, wm.k$a, so.l):java.lang.Object");
    }
}
