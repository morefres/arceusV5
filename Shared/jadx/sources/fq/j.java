package fq;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.p;
import fn.c;
import fq.j;
import gt.o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ot.m;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJG\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lfq/j;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lsq/a;", "navigationStateManager", "Leo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lsq/a;Leo/e;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/e$a;", "c", "Lfn/c$a;", rl.d.f30696a, "Lsq/a;", "e", "Leo/e;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", f = "LocalVideoCaptureRenderer.kt", l = {41}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17683t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f17684u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.b, Object>.a f17685v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f17684u = finalizeLocalVideoCapture;
            this.f17685v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(r.c cVar) {
            Object c10 = cVar.c();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = c10 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) c10 : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22894a;
            }
            cVar.e(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f17684u, this.f17685v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b> c10;
            Object e10 = nt.c.e();
            int i10 = this.f17683t;
            if (i10 == 0) {
                o.b(obj);
                long minDurationMs = this.f17684u.getMinDurationMs();
                this.f17683t = 1;
                if (z0.b(minDurationMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            wm.h<r<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b>> d10 = this.f17685v.d();
            c10 = b0.c(null, new Function1() { // from class: fq.i
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

    public j(@NotNull Context applicationContext, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull sq.a navigationStateManager, @NotNull eo.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.featureFlagManager = featureFlagManager;
    }

    public static final Unit i(k.a aVar, File it) {
        r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.a.f12465c));
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: fq.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = j.j(arrayList, (r.c) obj);
                return j10;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit j(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = c10 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) c10 : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f22894a;
        }
        action.e(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, CollectionsKt.w0(((SelfieState) action.c()).w(), list), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f22894a;
    }

    public static final Unit k(k.a aVar, final SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: fq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l10;
                l10 = j.l(SelfieState.FinalizeLocalVideoCapture.this, (r.c) obj);
                return l10;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit l(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = c10 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) c10 : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            action.e(p.D(action, ((SelfieState) action.c()).w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), p.k(action, false)));
            return Unit.f22894a;
        }
        return Unit.f22894a;
    }

    public static final Unit m(k.a aVar) {
        p.x(aVar, null);
        return Unit.f22894a;
    }

    public static final Unit n(k.a aVar) {
        r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: fq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = j.o((r.c) obj);
                return o8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit o(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit p(j jVar, k.a aVar, SelfieWorkflow.Input input) {
        p.z(jVar.applicationContext, aVar, input, true);
        return Unit.f22894a;
    }

    @NotNull
    public final SelfieWorkflow.c q(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a context) {
        SelfieWorkflow.c m10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.b("finalize_delay", new a(renderState, context, null));
        m10 = com.withpersona.sdk2.inquiry.selfie.o.m(renderProps, context, null, null, (r61 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0240c.b.C0242c(new Function1() { // from class: fq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i10;
                i10 = j.i(k.a.this, (File) obj);
                return i10;
            }
        }, new Function0() { // from class: fq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k10;
                k10 = j.k(k.a.this, renderState);
                return k10;
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.c.C0240c.EnumC0243c.f12822r : SelfieWorkflow.c.C0240c.EnumC0243c.f12820p, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m11;
                m11 = j.m(k.a.this);
                return m11;
            }
        }, new Function0() { // from class: fq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit n10;
                n10 = j.n(k.a.this);
                return n10;
            }
        }, p.m(context, false), new Function0() { // from class: fq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p8;
                p8 = j.p(j.this, context, renderProps);
                return p8;
            }
        }, kn.a.b, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }
}
