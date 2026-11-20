package xp;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.d;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import dn.v0;
import fn.CameraChoices;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.d2;
import ju.g1;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xp.k0;
import ym.ViewEnvironment;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020)*\u00020'2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010!R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR*\u0010_\u001a\u0016\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020$\u0018\u00010Zj\u0004\u0018\u0001`\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010!¨\u0006f"}, d2 = {"Lxp/k0;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Landroid/content/Context;", "context", "Lxp/r0;", "viewController", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "", "useCameraXForVideo", "<init>", "(Landroid/content/Context;Lxp/r0;Lcom/withpersona/sdk2/camera/b;Ldn/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Z)V", "rendering", "Ldn/g;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Ldn/g;", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2Preview", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;)Ldn/g;", "recordVideo", "D", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Z)Ldn/g;", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "Lfn/m0;", "Y", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lfn/m0;", "Lcom/withpersona/sdk2/camera/b$a;", "Z", "(Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lcom/withpersona/sdk2/camera/b$a;", "cameraController", "", "F", "(Ldn/g;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "a0", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "on", "G", "(Z)V", "Lym/y;", "viewEnvironment", "I", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;)V", "Ltq/a;", "systemUiController", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Ltq/a;)V", j6.b.f21518e, "Landroid/content/Context;", "c", "Lxp/r0;", rl.d.f30696a, "Lcom/withpersona/sdk2/camera/b;", "e", "Ldn/n0;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "g", "Landroidx/lifecycle/m;", "h", "Landroidx/lifecycle/m;", "lifecycleScope", "i", "Ldn/g;", "j", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "currentFacingMode", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "lastRendering", "", "l", "Ljava/util/List;", "cameraFacingDirections", "Lju/d2;", "m", "Lju/d2;", "cameraStateListenerJob", "n", "maxRecordingLimitJob", "o", "manualCaptureJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "p", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "r", "takingManualCapture", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k0 implements ym.k<SelfieWorkflow.c.a> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 viewController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.n0 selfieDirectionFeed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean useCameraXForVideo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.m lifecycleScope;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public dn.g cameraController;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraProperties.b currentFacingMode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SelfieWorkflow.c.a lastRendering;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends CameraProperties.b> cameraFacingDirections;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 manualCaptureJob;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean takingManualCapture;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35994a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f35995c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f35996d;

        static {
            int[] iArr = new int[in.a.values().length];
            try {
                iArr[in.a.f20965a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in.a.f20966c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in.a.f20967d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in.a.f20968e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f35994a = iArr;
            int[] iArr2 = new int[SelfieWorkflow.c.a.b.values().length];
            try {
                iArr2[SelfieWorkflow.c.a.b.f12738a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.f12743g.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.f12739c.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.f12740d.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.f12741e.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SelfieWorkflow.c.a.b.f12742f.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
            int[] iArr3 = new int[CameraProperties.b.values().length];
            try {
                iArr3[CameraProperties.b.f9961a.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CameraProperties.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CameraProperties.b.f9962c.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f35995c = iArr3;
            int[] iArr4 = new int[kn.a.values().length];
            try {
                iArr4[kn.a.f22871a.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[kn.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[kn.a.f22872c.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f35996d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"xp/k0$b", "Ldn/s;", "", ve.a.f33391e, "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements dn.s {
        public final /* synthetic */ SelfieWorkflow.c.a b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f35998c;

        public b(SelfieWorkflow.c.a aVar, boolean z10) {
            this.b = aVar;
            this.f35998c = z10;
        }

        public static final Unit c(SelfieWorkflow.c.a aVar, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            aVar.r().invoke(it);
            return Unit.f22894a;
        }

        @Override // dn.s
        public void a() {
            com.withpersona.sdk2.camera.b bVar = k0.this.cameraPreview;
            PreviewView j10 = k0.this.viewController.j();
            b.a Z = k0.this.Z(this.b.getFacingMode());
            dn.n0 n0Var = k0.this.selfieDirectionFeed;
            boolean z10 = this.f35998c;
            final SelfieWorkflow.c.a aVar = this.b;
            bVar.f(j10, Z, n0Var, true, z10, new Function1() { // from class: xp.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit c10;
                    c10 = k0.b.c(SelfieWorkflow.c.a.this, (dn.h) obj);
                    return c10;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"xp/k0$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements android.view.f {
        public final /* synthetic */ dn.g b;

        public c(dn.g gVar) {
            this.b = gVar;
        }

        public static final void b(k0 k0Var, dn.g gVar) {
            Function0 function0 = k0Var.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            k0Var.F(gVar);
        }

        @Override // android.view.f
        public void onCreate(android.view.s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public void onDestroy(android.view.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // android.view.f
        public void onPause(android.view.s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public void onResume(android.view.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            View root = k0.this.viewController.getRoot();
            final k0 k0Var = k0.this;
            final dn.g gVar = this.b;
            root.post(new Runnable() { // from class: xp.m0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.c.b(k0.this, gVar);
                }
            });
        }

        @Override // android.view.f
        public void onStart(android.view.s sVar) {
            super.onStart(sVar);
        }

        @Override // android.view.f
        public void onStop(android.view.s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {652}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36000t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36001u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36002v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f36003a;

            public a(k0 k0Var) {
                this.f36003a = k0Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, mt.b<? super Unit> bVar) {
                Function1 function1;
                if (Intrinsics.c(dVar, d.b.f9993a)) {
                    Function1 function12 = this.f36003a.currentErrorHandler;
                    if (function12 != null) {
                        function12.invoke(new v0());
                    }
                } else if (dVar instanceof d.Closed) {
                    d.Closed closed = (d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f36003a.currentErrorHandler) != null) {
                        function1.invoke(new dn.l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(dn.g gVar, k0 k0Var, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f36001u = gVar;
            this.f36002v = k0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f36001u, this.f36002v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f36000t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h<com.withpersona.sdk2.camera.d> a10 = com.withpersona.sdk2.camera.a.a(this.f36001u.b());
                a aVar = new a(this.f36002v);
                this.f36000t = 1;
                if (a10.collect(aVar, this) == e10) {
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
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$12", f = "CameraScreenRunner.kt", l = {403}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36004t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36005u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36006v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36007w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36008x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a aVar, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f36005u = gVar;
            this.f36006v = k0Var;
            this.f36007w = aVar;
            this.f36008x = abstractC0237a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f36005u, this.f36006v, this.f36007w, this.f36008x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object k10;
            Object e10 = nt.c.e();
            int i10 = this.f36004t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = this.f36005u;
                this.f36004t = 1;
                k10 = gVar.k(this);
                if (k10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                k10 = ((gt.n) obj).getValue();
            }
            k0 k0Var = this.f36006v;
            SelfieWorkflow.c.a aVar = this.f36007w;
            SelfieWorkflow.c.a.AbstractC0237a abstractC0237a = this.f36008x;
            if (gt.n.h(k10)) {
                TrackingEventsLogger.logVideoStopEvent$default(k0Var.trackingEventsLogger, "selfie", aVar.getVideoCaptureMethod().name(), null, null, null, null, false, 124, null);
                SelfieWorkflow.c.a.AbstractC0237a.d dVar = (SelfieWorkflow.c.a.AbstractC0237a.d) abstractC0237a;
                dVar.b().invoke((File) k10);
                dVar.c().invoke();
            }
            k0 k0Var2 = this.f36006v;
            SelfieWorkflow.c.a aVar2 = this.f36007w;
            SelfieWorkflow.c.a.AbstractC0237a abstractC0237a2 = this.f36008x;
            Throwable e11 = gt.n.e(k10);
            if (e11 != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(k0Var2.trackingEventsLogger, "selfie", aVar2.getVideoCaptureMethod().name(), null, gt.a.b(e11), false, 20, null);
                if (!(e11 instanceof dn.h0)) {
                    aVar2.r().invoke(e11);
                    ((SelfieWorkflow.c.a.AbstractC0237a.d) abstractC0237a2).c().invoke();
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2", f = "CameraScreenRunner.kt", l = {192, 194}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36009t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ dn.g f36010u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k0 f36011v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36012w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36013x;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/d;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<com.withpersona.sdk2.camera.d, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f36014t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f36015u;

            public a(mt.b<? super a> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(bVar);
                aVar.f36015u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.camera.d dVar = (com.withpersona.sdk2.camera.d) this.f36015u;
                nt.c.e();
                if (this.f36014t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ot.b.a(!(dVar instanceof d.Ready));
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.withpersona.sdk2.camera.d dVar, mt.b<? super Boolean> bVar) {
                return ((a) create(dVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2", f = "CameraScreenRunner.kt", l = {195, 216}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f36016t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ dn.g f36017u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k0 f36018v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36019w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ SelfieWorkflow.c.a f36020x;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2$2$3$1", f = "CameraScreenRunner.kt", l = {225, 231}, m = "invokeSuspend")
            public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f36021t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36022u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ dn.g f36023v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ k0 f36024w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ SelfieWorkflow.c.a f36025x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, dn.g gVar, k0 k0Var, SelfieWorkflow.c.a aVar, mt.b<? super a> bVar) {
                    super(2, bVar);
                    this.f36022u = abstractC0237a;
                    this.f36023v = gVar;
                    this.f36024w = k0Var;
                    this.f36025x = aVar;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new a(this.f36022u, this.f36023v, this.f36024w, this.f36025x, bVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
                
                    if (r14 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
                
                    if (ju.z0.b(r4, r13) == r0) goto L19;
                 */
                @Override // ot.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = nt.c.e()
                        int r1 = r13.f36021t
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L20
                        if (r1 != r2) goto L18
                        gt.o.b(r14)
                        gt.n r14 = (gt.n) r14
                        java.lang.Object r14 = r14.getValue()
                        goto L54
                    L18:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L20:
                        gt.o.b(r14)
                        goto L38
                    L24:
                        gt.o.b(r14)
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r14 = r13.f36022u
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$h r14 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a.h) r14
                        long r4 = r14.getMaxRecordingLengthMs()
                        r13.f36021t = r3
                        java.lang.Object r14 = ju.z0.b(r4, r13)
                        if (r14 != r0) goto L38
                        goto L53
                    L38:
                        dn.g r14 = r13.f36023v
                        mu.p0 r14 = r14.b()
                        java.lang.Object r14 = r14.getValue()
                        boolean r14 = r14 instanceof com.withpersona.sdk2.camera.d.Closed
                        if (r14 == 0) goto L49
                        kotlin.Unit r14 = kotlin.Unit.f22894a
                        return r14
                    L49:
                        dn.g r14 = r13.f36023v
                        r13.f36021t = r2
                        java.lang.Object r14 = r14.k(r13)
                        if (r14 != r0) goto L54
                    L53:
                        return r0
                    L54:
                        xp.k0 r0 = r13.f36024w
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r1 = r13.f36025x
                        boolean r2 = gt.n.h(r14)
                        if (r2 == 0) goto L7d
                        r2 = r14
                        java.io.File r2 = (java.io.File) r2
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r3 = xp.k0.v(r0)
                        kn.a r0 = r1.getVideoCaptureMethod()
                        java.lang.String r5 = r0.name()
                        r11 = 124(0x7c, float:1.74E-43)
                        r12 = 0
                        java.lang.String r4 = "selfie"
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logVideoStopEvent$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        r2.delete()
                    L7d:
                        xp.k0 r0 = r13.f36024w
                        com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r1 = r13.f36025x
                        java.lang.Throwable r14 = gt.n.e(r14)
                        if (r14 == 0) goto La1
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r2 = xp.k0.v(r0)
                        kn.a r0 = r1.getVideoCaptureMethod()
                        java.lang.String r4 = r0.name()
                        java.lang.String r6 = gt.a.b(r14)
                        r8 = 20
                        r9 = 0
                        java.lang.String r3 = "selfie"
                        r5 = 0
                        r7 = 0
                        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logVideoErrorEvent$default(r2, r3, r4, r5, r6, r7, r8, r9)
                    La1:
                        xp.k0 r14 = r13.f36024w
                        kotlin.jvm.functions.Function1 r14 = xp.k0.q(r14)
                        if (r14 == 0) goto Lb1
                        dn.m0 r0 = new dn.m0
                        r0.<init>()
                        r14.invoke(r0)
                    Lb1:
                        kotlin.Unit r14 = kotlin.Unit.f22894a
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xp.k0.f.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, SelfieWorkflow.c.a aVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f36017u = gVar;
                this.f36018v = k0Var;
                this.f36019w = abstractC0237a;
                this.f36020x = aVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f36017u, this.f36018v, this.f36019w, this.f36020x, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
            
                if (r2 == r1) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x00c7  */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 334
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xp.k0.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dn.g gVar, k0 k0Var, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, SelfieWorkflow.c.a aVar, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f36010u = gVar;
            this.f36011v = k0Var;
            this.f36012w = abstractC0237a;
            this.f36013x = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f36010u, this.f36011v, this.f36012w, this.f36013x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            if (ju.i.g(r10, r3, r9) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (mu.j.i(r10, r9) == r0) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f36009t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r10)
                goto L55
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                gt.o.b(r10)
                goto L3a
            L1e:
                gt.o.b(r10)
                dn.g r10 = r9.f36010u
                mu.p0 r10 = r10.b()
                xp.k0$f$a r1 = new xp.k0$f$a
                r4 = 0
                r1.<init>(r4)
                mu.h r10 = mu.j.N(r10, r1)
                r9.f36009t = r3
                java.lang.Object r10 = mu.j.i(r10, r9)
                if (r10 != r0) goto L3a
                goto L54
            L3a:
                ju.n2 r10 = ju.g1.c()
                xp.k0$f$b r3 = new xp.k0$f$b
                dn.g r4 = r9.f36010u
                xp.k0 r5 = r9.f36011v
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r6 = r9.f36012w
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r7 = r9.f36013x
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8)
                r9.f36009t = r2
                java.lang.Object r10 = ju.i.g(r10, r3, r9)
                if (r10 != r0) goto L55
            L54:
                return r0
            L55:
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xp.k0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$3", f = "CameraScreenRunner.kt", l = {263}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36026t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36027u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ dn.g f36028v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k0 f36029w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, dn.g gVar, k0 k0Var, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f36027u = abstractC0237a;
            this.f36028v = gVar;
            this.f36029w = k0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f36027u, this.f36028v, this.f36029w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f36026t;
            if (i10 == 0) {
                gt.o.b(obj);
                long maxRecordingLengthMs = ((SelfieWorkflow.c.a.AbstractC0237a.j) this.f36027u).getMaxRecordingLengthMs();
                this.f36026t = 1;
                if (z0.b(maxRecordingLengthMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            if (this.f36028v.b().getValue() instanceof d.Closed) {
                return Unit.f22894a;
            }
            TrackingEventsLogger.logSelfieCaptureStateEvent$default(this.f36029w.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.RECORDING_TIMED_OUT, null, null, null, 8, null), false, 2, null);
            Function1 function1 = this.f36029w.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new dn.m0());
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1", f = "CameraScreenRunner.kt", l = {344, 349}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36030t;

        /* renamed from: u, reason: collision with root package name */
        public int f36031u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36032v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a f36034x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ dn.g f36035y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.a.AbstractC0237a f36036z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f36034x = aVar;
            this.f36035y = gVar;
            this.f36036z = abstractC0237a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            h hVar = k0.this.new h(this.f36034x, this.f36035y, this.f36036z, bVar);
            hVar.f36032v = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
        
            r7.f36033w.G(false);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0088 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:8:0x007d, B:10:0x0088, B:11:0x009d, B:13:0x00a5, B:16:0x00aa, B:18:0x00b5, B:26:0x002c, B:27:0x006a, B:32:0x0033, B:34:0x0040, B:36:0x0048, B:41:0x0056), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x0015, B:8:0x007d, B:10:0x0088, B:11:0x009d, B:13:0x00a5, B:16:0x00aa, B:18:0x00b5, B:26:0x002c, B:27:0x006a, B:32:0x0033, B:34:0x0040, B:36:0x0048, B:41:0x0056), top: B:2:0x000d }] */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f36032v
                ju.p0 r0 = (ju.p0) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r7.f36031u
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L30
                if (r2 == r5) goto L2a
                if (r2 != r3) goto L22
                int r1 = r7.f36030t
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L1f
                gt.n r8 = (gt.n) r8     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L1f
                goto L7d
            L1f:
                r8 = move-exception
                goto Lc2
            L22:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2a:
                int r2 = r7.f36030t
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L1f
                goto L6a
            L30:
                gt.o.b(r8)
                xp.k0 r8 = xp.k0.this     // Catch: java.lang.Throwable -> L1f
                xp.k0.A(r8, r5)     // Catch: java.lang.Throwable -> L1f
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r8 = r7.f36034x     // Catch: java.lang.Throwable -> L1f
                boolean r8 = r8.getIsFlashEnabled()     // Catch: java.lang.Throwable -> L1f
                if (r8 != 0) goto L53
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r8 = r7.f36034x     // Catch: java.lang.Throwable -> L1f
                boolean r8 = r8.getIsAutoFlashOnManualCaptureEnabled()     // Catch: java.lang.Throwable -> L1f
                if (r8 == 0) goto L51
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a r8 = r7.f36034x     // Catch: java.lang.Throwable -> L1f
                boolean r8 = r8.getIsDimLightConditions()     // Catch: java.lang.Throwable -> L1f
                if (r8 == 0) goto L51
                goto L53
            L51:
                r2 = r4
                goto L54
            L53:
                r2 = r5
            L54:
                if (r2 == 0) goto L6a
                xp.k0 r8 = xp.k0.this     // Catch: java.lang.Throwable -> L1f
                xp.k0.y(r8, r5)     // Catch: java.lang.Throwable -> L1f
                r7.f36032v = r0     // Catch: java.lang.Throwable -> L1f
                r7.f36030t = r2     // Catch: java.lang.Throwable -> L1f
                r7.f36031u = r5     // Catch: java.lang.Throwable -> L1f
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)     // Catch: java.lang.Throwable -> L1f
                if (r8 != r1) goto L6a
                goto L7b
            L6a:
                ju.q0.h(r0)     // Catch: java.lang.Throwable -> L1f
                dn.g r8 = r7.f36035y     // Catch: java.lang.Throwable -> L1f
                r7.f36032v = r0     // Catch: java.lang.Throwable -> L1f
                r7.f36030t = r2     // Catch: java.lang.Throwable -> L1f
                r7.f36031u = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r8 = r8.d(r7)     // Catch: java.lang.Throwable -> L1f
                if (r8 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r1 = r2
            L7d:
                ju.q0.h(r0)     // Catch: java.lang.Throwable -> L1f
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r0 = r7.f36036z     // Catch: java.lang.Throwable -> L1f
                boolean r2 = gt.n.h(r8)     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L9d
                r2 = r8
                java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L1f
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$e r0 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a.e) r0     // Catch: java.lang.Throwable -> L1f
                kotlin.jvm.functions.Function1 r0 = r0.d()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r3 = "getAbsolutePath(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L1f
                r0.invoke(r2)     // Catch: java.lang.Throwable -> L1f
            L9d:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a r0 = r7.f36036z     // Catch: java.lang.Throwable -> L1f
                java.lang.Throwable r8 = gt.n.e(r8)     // Catch: java.lang.Throwable -> L1f
                if (r8 == 0) goto Lb3
                boolean r2 = r8 instanceof fn.o0     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto Laa
                goto Lb3
            Laa:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$e r0 = (com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a.e) r0     // Catch: java.lang.Throwable -> L1f
                kotlin.jvm.functions.Function1 r0 = r0.c()     // Catch: java.lang.Throwable -> L1f
                r0.invoke(r8)     // Catch: java.lang.Throwable -> L1f
            Lb3:
                if (r1 == 0) goto Lba
                xp.k0 r8 = xp.k0.this     // Catch: java.lang.Throwable -> L1f
                xp.k0.y(r8, r4)     // Catch: java.lang.Throwable -> L1f
            Lba:
                xp.k0 r8 = xp.k0.this
                xp.k0.A(r8, r4)
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            Lc2:
                xp.k0 r0 = xp.k0.this
                xp.k0.A(r0, r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xp.k0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public k0(@NotNull Context context, @NotNull r0 viewController, @NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull dn.n0 selfieDirectionFeed, @NotNull TrackingEventsLogger trackingEventsLogger, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.viewController = viewController;
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.useCameraXForVideo = z10;
        this.lifecycleScope = android.view.t.a(hq.g.i(context));
        List<fn.h0> a10 = fn.f0.a(context);
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(a10, 10));
        Iterator<T> it = a10.iterator();
        while (it.hasNext()) {
            arrayList.add(((fn.h0) it.next()).getFacing());
        }
        this.cameraFacingDirections = CollectionsKt.X(arrayList);
        this.viewController.a();
    }

    public static final Unit J(k0 k0Var, SelfieWorkflow.c.a aVar, int i10) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SWITCH_CAMERA, null, 2, null), false, 2, null);
        aVar.s().invoke(k0Var.cameraFacingDirections.get(i10));
        return Unit.f22894a;
    }

    public static final Unit K(SelfieWorkflow.c.a aVar, k0 k0Var) {
        boolean z10 = !aVar.getIsFlashEnabled();
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        aVar.u().invoke(Boolean.valueOf(z10));
        return Unit.f22894a;
    }

    public static final Unit L(SelfieWorkflow.c.a aVar) {
        aVar.q().invoke();
        return Unit.f22894a;
    }

    public static final Unit M(SelfieWorkflow.c.a aVar) {
        aVar.t().invoke();
        return Unit.f22894a;
    }

    public static final Unit N(k0 k0Var, kotlin.jvm.internal.c0 c0Var) {
        TrackingEventsLogger.logSelfieCaptureButtonClickedEvent$default(k0Var.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        Function0 function0 = (Function0) c0Var.f22963a;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f22894a;
    }

    public static final Unit O(k0 k0Var, dn.g gVar) {
        hn.b.a(k0Var.selfieDirectionFeed, gVar, k0Var.viewController.b());
        return Unit.f22894a;
    }

    public static final Unit P(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.g) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit Q(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.g) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit R(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.g) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit S(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.g) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit T(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.g) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final Unit U(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.i) abstractC0237a).c().invoke();
        return Unit.f22894a;
    }

    public static final Unit V(k0 k0Var, SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        X(k0Var, aVar, gVar, abstractC0237a);
        return Unit.f22894a;
    }

    public static final Unit W(SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        ((SelfieWorkflow.c.a.AbstractC0237a.f) abstractC0237a).b().invoke();
        return Unit.f22894a;
    }

    public static final void X(k0 k0Var, SelfieWorkflow.c.a aVar, dn.g gVar, SelfieWorkflow.c.a.AbstractC0237a abstractC0237a) {
        d2 d10;
        if (k0Var.takingManualCapture) {
            return;
        }
        d2 d2Var = k0Var.manualCaptureJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = ju.k.d(k0Var.lifecycleScope, g1.c(), null, k0Var.new h(aVar, gVar, abstractC0237a, null), 2, null);
        k0Var.manualCaptureJob = d10;
    }

    public final dn.g C(SelfieWorkflow.c.a rendering, Camera2PreviewView camera2Preview) {
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CameraChoices b10 = fn.f0.b(applicationContext, Y(rendering.getFacingMode()));
        if (b10 != null) {
            return rendering.getCamera2ControllerFactory().a(b10, camera2Preview, this.selfieDirectionFeed, kn.a.valueOf(rendering.getVideoCaptureMethod().toString()), rendering.getWebRtcManager(), rendering.getIsAudioRequired());
        }
        rendering.r().invoke(new dn.i0());
        return new com.withpersona.sdk2.camera.g(camera2Preview);
    }

    public final dn.g D(SelfieWorkflow.c.a rendering, boolean recordVideo) {
        return rendering.getCameraXControllerFactory().a(this.cameraPreview, this.viewController.j(), new b(rendering, recordVideo), rendering.getIsAudioRequired());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r4.useCameraXForVideo == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dn.g E(com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a r5) {
        /*
            r4 = this;
            dn.g r0 = r4.cameraController
            if (r0 == 0) goto L13
            com.withpersona.sdk2.camera.CameraProperties$b r1 = r4.currentFacingMode
            com.withpersona.sdk2.camera.CameraProperties$b r2 = r5.getFacingMode()
            if (r1 != r2) goto L10
            r0.j()
            return r0
        L10:
            r0.destroy()
        L13:
            xp.r0 r0 = r4.viewController
            com.withpersona.sdk2.camera.camera2.Camera2PreviewView r0 = r0.i()
            kn.a r1 = r5.getVideoCaptureMethod()
            int[] r2 = xp.k0.a.f35996d
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L49
            r3 = 2
            if (r1 == r3) goto L35
            r0 = 3
            if (r1 != r0) goto L2f
            goto L3a
        L2f:
            gt.l r5 = new gt.l
            r5.<init>()
            throw r5
        L35:
            boolean r1 = r4.useCameraXForVideo
            if (r1 != 0) goto L3a
            goto L49
        L3a:
            kn.a r0 = r5.getVideoCaptureMethod()
            kn.a r1 = kn.a.b
            if (r0 != r1) goto L43
            goto L44
        L43:
            r2 = 0
        L44:
            dn.g r0 = r4.D(r5, r2)
            goto L4d
        L49:
            dn.g r0 = r4.C(r5, r0)
        L4d:
            android.content.Context r1 = r4.context
            androidx.lifecycle.s r1 = hq.g.i(r1)
            androidx.lifecycle.l r1 = r1.a()
            xp.k0$c r2 = new xp.k0$c
            r2.<init>(r0)
            r1.a(r2)
            r4.F(r0)
            r0.j()
            r4.cameraController = r0
            com.withpersona.sdk2.camera.CameraProperties$b r5 = r5.getFacingMode()
            r4.currentFacingMode = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xp.k0.E(com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a):dn.g");
    }

    public final void F(dn.g cameraController) {
        d2 d10;
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = ju.k.d(android.view.t.a(hq.g.i(this.context)), null, null, new d(cameraController, this, null), 3, null);
        this.cameraStateListenerJob = d10;
    }

    public final void G(boolean on2) {
        Window window;
        Window window2;
        dn.g gVar = this.cameraController;
        if (gVar == null) {
            return;
        }
        CameraProperties.b facingMode = gVar.a().getFacingMode();
        if (on2) {
            if (facingMode != CameraProperties.b.f9961a) {
                gVar.c(true);
                return;
            }
            this.viewController.c();
            j.b a10 = hq.g.a(this.context);
            if (a10 == null || (window2 = a10.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.screenBrightness = 1.0f;
            window2.setAttributes(attributes);
            return;
        }
        if (facingMode != CameraProperties.b.f9961a) {
            gVar.c(false);
            return;
        }
        this.viewController.l();
        j.b a11 = hq.g.a(this.context);
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.screenBrightness = -1.0f;
        window.setAttributes(attributes2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, xp.y] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, xp.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a r44, @org.jetbrains.annotations.Nullable tq.a r45) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xp.k0.H(com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a, tq.a):void");
    }

    @Override // ym.k
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull SelfieWorkflow.c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        H(rendering, tq.c.a(viewEnvironment));
    }

    public final fn.m0 Y(CameraProperties.b bVar) {
        int i10 = a.f35995c[bVar.ordinal()];
        if (i10 == 1) {
            return fn.m0.f17385a;
        }
        if (i10 == 2) {
            return fn.m0.b;
        }
        if (i10 == 3) {
            return fn.m0.f17386c;
        }
        throw new gt.l();
    }

    public final b.a Z(CameraProperties.b bVar) {
        int i10 = a.f35995c[bVar.ordinal()];
        if (i10 == 1) {
            return b.a.f9974a;
        }
        if (i10 == 2) {
            return b.a.b;
        }
        if (i10 == 3) {
            return b.a.f9975c;
        }
        throw new gt.l();
    }

    public final SelfieOverlayView.e a0(SelfieWorkflow.c.a.b bVar, boolean z10) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return SelfieOverlayView.e.f13222f;
            case 2:
                return SelfieOverlayView.e.f13223g;
            case 3:
                return SelfieOverlayView.e.f13218a;
            case 4:
                return z10 ? SelfieOverlayView.e.b : SelfieOverlayView.e.f13219c;
            case 5:
                return z10 ? SelfieOverlayView.e.f13219c : SelfieOverlayView.e.b;
            case 6:
                return SelfieOverlayView.e.f13220d;
            case 7:
                return SelfieOverlayView.e.f13221e;
            default:
                throw new gt.l();
        }
    }
}
