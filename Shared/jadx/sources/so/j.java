package so;

import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.MotionEventCompat;
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
import fn.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import so.j;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lso/j;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lso/l;", "videoCaptureHelper", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lwm/k$a;Lso/l;)Ljava/lang/Object;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lfn/c$a;", rl.d.f30696a, "Lsq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {MotionEventCompat.AXIS_GENERIC_14}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31582t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState.FinalizeLocalVideoCapture f31583u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Object>.a f31584v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f31583u = finalizeLocalVideoCapture;
            this.f31584v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(r.c cVar) {
            Object c10 = cVar.c();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = c10 instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) c10 : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22894a;
            }
            cVar.e(GovernmentIdState.FinalizeLocalVideoCapture.J(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, FrameMetricsAggregator.EVERY_DURATION, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f31583u, this.f31584v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            wm.r<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a> c10;
            Object e10 = nt.c.e();
            int i10 = this.f31582t;
            if (i10 == 0) {
                gt.o.b(obj);
                long minDurationMs = this.f31583u.getMinDurationMs();
                this.f31582t = 1;
                if (z0.b(minDurationMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            wm.h<wm.r<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a>> d10 = this.f31584v.d();
            c10 = b0.c(null, new Function1() { // from class: so.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = j.a.q((r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d10.a(c10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public j(@NotNull Context applicationContext, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit j(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f22894a;
    }

    public static final Unit k(k.a aVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: so.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = j.l((r.c) obj);
                return l10;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit l(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit m(k.a aVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, null);
        return Unit.f22894a;
    }

    public static final Unit n(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit o(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, k.a aVar, GovernmentIdWorkflow.Input input, l lVar, File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<GovernmentId> E = finalizeLocalVideoCapture.E();
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
        com.withpersona.sdk2.inquiry.governmentid.n.W(finalizeLocalVideoCapture, aVar, input, new GovernmentId.GovernmentIdVideo(d10, bVar, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.a.b), finalizeLocalVideoCapture.getId(), lVar, cameraProperties, (r26 & 128) != 0, (r26 & 256) != 0 ? finalizeLocalVideoCapture.D() : null, (r26 & 512) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (r26 & 1024) != 0 ? null : null, (r26 & 2048) != 0 ? finalizeLocalVideoCapture.getCountryCode() : null);
        return Unit.f22894a;
    }

    public static final Unit p() {
        return Unit.f22894a;
    }

    public static final Unit q(j jVar, k.a aVar, GovernmentIdWorkflow.Input input) {
        com.withpersona.sdk2.inquiry.governmentid.n.U(jVar.applicationContext, aVar, input, true);
        return Unit.f22894a;
    }

    @NotNull
    public final Object i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.FinalizeLocalVideoCapture renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final l videoCaptureHelper) {
        IdConfig.b bVar;
        Screen.b f10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        context.b("finalize_delay", new a(renderState, context, null));
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
        Function1<Throwable, Unit> z10 = com.withpersona.sdk2.inquiry.governmentid.n.z(context, false);
        boolean isDelayComplete = renderState.getIsDelayComplete();
        f10 = com.withpersona.sdk2.inquiry.governmentid.l.f(renderProps, K, J, capturing, aVar, overlay, type, bVar2, b, (r70 & 512) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011a: INVOKE (r1v1 'f10' com.withpersona.sdk2.inquiry.governmentid.Screen$b) = 
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input)
              (r7v1 'K' java.lang.String)
              (r9v3 'J' java.lang.String)
              (r10v4 'capturing' java.lang.String)
              (r5v1 'aVar' com.withpersona.sdk2.inquiry.governmentid.Screen$b$a)
              (r4v12 'overlay' com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay)
              (r12v1 'type' no.b)
              (r8v0 'bVar2' com.withpersona.sdk2.inquiry.governmentid.IdConfig$b)
              (r13v1 'b' com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.n.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00b4: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.a.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00bd: CONSTRUCTOR 
              (r43v0 'context' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(wm.k$a):void (m), WRAPPED] call: so.b.<init>(wm.k$a):void type: CONSTRUCTOR)
              (wrap:kotlin.jvm.functions.Function0:0x00c5: CONSTRUCTOR 
              (r43v0 'context' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
             A[MD:(wm.k$a):void (m), WRAPPED] call: so.c.<init>(wm.k$a):void type: CONSTRUCTOR)
              false
              (r14v0 'k10' java.util.List)
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture)
              (r16v0 'partIndex' int)
              (wrap:com.withpersona.sdk2.camera.e$a:0x00a5: IGET (r40v0 'this' so.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] so.j.b com.withpersona.sdk2.camera.e$a)
              (wrap:fn.c$a:0x00a9: IGET (r40v0 'this' so.j A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] so.j.c fn.c$a)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0011: ARITH (262144 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.o.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0020: ARITH (524288 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.p.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x00cc: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.d.<init>():void type: CONSTRUCTOR))
              (r21v0 'z10' kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>)
              (wrap:kn.a:?: TERNARY null = ((wrap:int:0x002f: ARITH (2097152 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] kn.a.c kn.a) : (wrap:kn.a:0x00a3: SGET  A[WRAPPED] kn.a.b kn.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (4194304 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (8388608 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (16777216 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 'isDelayComplete' boolean))
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x005b: ARITH (33554432 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.q.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x00d3: CONSTRUCTOR 
              (r42v0 'renderState' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture A[DONT_INLINE])
              (r43v0 'context' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
              (r44v0 'videoCaptureHelper' so.l A[DONT_INLINE])
             A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void (m), WRAPPED] call: so.e.<init>(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, so.l):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006a: ARITH (67108864 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: go.r.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x00d8: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: so.f.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:0x00dd: CONSTRUCTOR 
              (r40v0 'this' so.j A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r43v0 'context' wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a A[DONT_INLINE])
              (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input A[DONT_INLINE])
             A[MD:(so.j, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void (m), WRAPPED] call: so.g.<init>(so.j, wm.k$a, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input):void type: CONSTRUCTOR)
              (wrap:int:?: TERNARY null = ((wrap:int:0x0079: ARITH (268435456 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: INVOKE (r41v0 'renderProps' com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input) VIRTUAL call: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (536870912 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:ko.i:?: TERNARY null = ((wrap:int:0x0092: ARITH (1073741824 int) & (r70v0 int) A[WRAPPED]) != (0 int)) ? (null ko.i) : (null ko.i))
              (wrap:sr.a:?: TERNARY null = ((wrap:int:0x009c: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null sr.a) : (null sr.a))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:uq.l:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b3: SGET  A[WRAPPED] uq.l.a uq.l) : (null uq.l))
             STATIC call: com.withpersona.sdk2.inquiry.governmentid.l.f(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b A[MD:(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, no.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, fn.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, ko.i, sr.a, boolean, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen$b (m), WRAPPED] in method: so.j.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a, so.l):java.lang.Object, file: classes3.dex
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
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so.j.i(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$FinalizeLocalVideoCapture, wm.k$a, so.l):java.lang.Object");
    }
}
