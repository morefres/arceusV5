package io;

import android.content.Context;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.d;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import dn.h0;
import dn.j0;
import dn.l0;
import dn.v0;
import go.OverlayAssets;
import io.u;
import java.io.File;
import ju.d2;
import ju.g1;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u0010:\u001a\u0016\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0012\u0018\u000105j\u0004\u0018\u0001`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010=¨\u0006N"}, d2 = {"Lio/u;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Landroid/content/Context;", "context", "Lio/w;", "viewController", "Ldn/g;", "cameraController", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lio/w;Ldn/g;Ldn/x;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "rendering", "Lym/y;", "viewEnvironment", "", zl.t.f38095d, "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lym/y;)V", "", "maxRecordingLengthMs", "A", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;J)V", "Landroidx/lifecycle/m;", "lifecycleScope", "s", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;J)V", "r", "()V", "", "q", "()Z", j6.b.f21518e, "Landroid/content/Context;", "c", "Lio/w;", rl.d.f30696a, "Ldn/g;", "e", "Ldn/x;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lju/d2;", "g", "Lju/d2;", "currentCaptureJob", "h", "maxRecordingLimitJob", "i", "Z", "currentHolographicTorchEnabled", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "j", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "l", "cameraStateListenerJob", "", "m", "Ljava/lang/Integer;", "lastAutoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "lastLoggedIdleSide", "o", "I", "statusBarColor", "p", "currentPermissionChangedHandler", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements ym.k<Screen.b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w viewController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.g cameraController;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dn.x governmentIdFeed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentCaptureJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean currentHolographicTorchEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer lastAutoCaptureRulesId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IdConfig.b lastLoggedIdleSide;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int statusBarColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> currentPermissionChangedHandler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"io/u$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements android.view.f {
        public a() {
        }

        public static final void b(u uVar) {
            Function0 function0 = uVar.currentPermissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            uVar.r();
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
            View root = u.this.viewController.getRoot();
            final u uVar = u.this;
            root.post(new Runnable() { // from class: io.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.b(u.this);
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"io/u$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            d2 d2Var = u.this.maxRecordingLimitJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            u.this.maxRecordingLimitJob = null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21060a;

        static {
            int[] iArr = new int[go.d.values().length];
            try {
                iArr[go.d.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f21060a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {363}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21061t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f21063a;

            public a(u uVar) {
                this.f21063a = uVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, mt.b<? super Unit> bVar) {
                Function1 function1;
                if (dVar instanceof d.Ready) {
                    TrackingEventsLogger.logCameraInfoEvent$default(this.f21063a.trackingEventsLogger, com.withpersona.sdk2.camera.c.a(this.f21063a.cameraController.a()), false, 2, null);
                } else if (Intrinsics.c(dVar, d.b.f9993a)) {
                    Function1 function12 = this.f21063a.currentErrorHandler;
                    if (function12 != null) {
                        function12.invoke(new v0());
                    }
                } else if (dVar instanceof d.Closed) {
                    d.Closed closed = (d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f21063a.currentErrorHandler) != null) {
                        function1.invoke(new l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22894a;
            }
        }

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return u.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f21061t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h<com.withpersona.sdk2.camera.d> a10 = com.withpersona.sdk2.camera.a.a(u.this.cameraController.b());
                a aVar = new a(u.this);
                this.f21061t = 1;
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
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1", f = "CameraScreenRunner.kt", l = {329, 337}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21064t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f21065u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f21066v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Screen.b f21067w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, u uVar, Screen.b bVar, mt.b<? super e> bVar2) {
            super(2, bVar2);
            this.f21065u = j10;
            this.f21066v = uVar;
            this.f21067w = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f21065u, this.f21066v, this.f21067w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
        
            if (ju.z0.b(r6, r17) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {209}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {
        public Object A;
        public int B;
        public final /* synthetic */ Screen.b C;
        public final /* synthetic */ u D;

        /* renamed from: t, reason: collision with root package name */
        public int f21068t;

        /* renamed from: u, reason: collision with root package name */
        public int f21069u;

        /* renamed from: v, reason: collision with root package name */
        public int f21070v;

        /* renamed from: w, reason: collision with root package name */
        public int f21071w;

        /* renamed from: x, reason: collision with root package name */
        public Object f21072x;

        /* renamed from: y, reason: collision with root package name */
        public Object f21073y;

        /* renamed from: z, reason: collision with root package name */
        public Object f21074z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Screen.b bVar, u uVar, mt.b<? super f> bVar2) {
            super(2, bVar2);
            this.C = bVar;
            this.D = uVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.C, this.D, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:5:0x0068). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r10.B
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2a
                int r1 = r10.f21069u
                int r4 = r10.f21068t
                java.lang.Object r5 = r10.A
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r10.f21074z
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r7 = r10.f21073y
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r7 = (com.withpersona.sdk2.inquiry.governmentid.Screen.b) r7
                java.lang.Object r8 = r10.f21072x
                io.u r8 = (io.u) r8
                gt.o.b(r11)
                gt.n r11 = (gt.n) r11
                java.lang.Object r11 = r11.getValue()
                goto L68
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L32:
                gt.o.b(r11)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.C
                int r11 = r11.getRemainingCaptureCount()
                io.u r1 = r10.D
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r4 = r10.C
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r11)
                r8 = r1
                r1 = r2
                r7 = r4
                r4 = r11
            L48:
                if (r1 >= r4) goto L8b
                dn.g r11 = io.u.h(r8)
                r10.f21072x = r8
                r10.f21073y = r7
                r10.f21074z = r5
                r10.A = r5
                r10.f21068t = r4
                r10.f21069u = r1
                r10.f21070v = r1
                r10.f21071w = r2
                r10.B = r3
                java.lang.Object r11 = r11.d(r10)
                if (r11 != r0) goto L67
                return r0
            L67:
                r6 = r5
            L68:
                java.lang.Throwable r9 = gt.n.e(r11)
                if (r9 != 0) goto L7a
                java.io.File r11 = (java.io.File) r11
                java.lang.String r11 = r11.getAbsolutePath()
                r5.add(r11)
                int r1 = r1 + r3
                r5 = r6
                goto L48
            L7a:
                boolean r11 = r9 instanceof fn.o0
                if (r11 == 0) goto L81
                kotlin.Unit r11 = kotlin.Unit.f22894a
                return r11
            L81:
                kotlin.jvm.functions.Function1 r11 = r7.E()
                r11.invoke(r9)
                kotlin.Unit r11 = kotlin.Unit.f22894a
                return r11
            L8b:
                io.u r11 = r10.D
                io.w r11 = io.u.m(r11)
                r11.e()
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.C
                kotlin.jvm.functions.Function2 r11 = r11.y()
                io.u r0 = r10.D
                dn.g r0 = io.u.h(r0)
                com.withpersona.sdk2.camera.CameraProperties r0 = r0.a()
                r11.invoke(r5, r0)
                kotlin.Unit r11 = kotlin.Unit.f22894a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6", f = "CameraScreenRunner.kt", l = {249, InputDeviceCompat.SOURCE_KEYBOARD}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {
        public int A;
        public final /* synthetic */ Screen.b B;
        public final /* synthetic */ u C;

        /* renamed from: t, reason: collision with root package name */
        public int f21075t;

        /* renamed from: u, reason: collision with root package name */
        public int f21076u;

        /* renamed from: v, reason: collision with root package name */
        public int f21077v;

        /* renamed from: w, reason: collision with root package name */
        public int f21078w;

        /* renamed from: x, reason: collision with root package name */
        public Object f21079x;

        /* renamed from: y, reason: collision with root package name */
        public Object f21080y;

        /* renamed from: z, reason: collision with root package name */
        public Object f21081z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen.b bVar, u uVar, mt.b<? super g> bVar2) {
            super(2, bVar2);
            this.B = bVar;
            this.C = uVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.B, this.C, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:12:0x006e). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r11.A
                r2 = 0
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r0 = r11.f21079x
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r12)
                goto La2
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                int r1 = r11.f21076u
                int r6 = r11.f21075t
                java.lang.Object r7 = r11.f21081z
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r8 = r11.f21080y
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r9 = r11.f21079x
                io.u r9 = (io.u) r9
                gt.o.b(r12)
                gt.n r12 = (gt.n) r12
                java.lang.Object r12 = r12.getValue()
                goto L6e
            L3b:
                gt.o.b(r12)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.B
                int r12 = r12.getRemainingCaptureCount()
                io.u r1 = r11.C
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r12)
                r9 = r1
                r1 = r2
            L4d:
                if (r1 >= r12) goto L83
                dn.g r7 = io.u.h(r9)
                r11.f21079x = r9
                r11.f21080y = r6
                r11.f21081z = r6
                r11.f21075t = r12
                r11.f21076u = r1
                r11.f21077v = r1
                r11.f21078w = r2
                r11.A = r5
                java.lang.Object r7 = r7.d(r11)
                if (r7 != r0) goto L6a
                goto La0
            L6a:
                r8 = r6
                r6 = r12
                r12 = r7
                r7 = r8
            L6e:
                java.lang.Throwable r10 = gt.n.e(r12)
                if (r10 != 0) goto L7b
                java.io.File r12 = (java.io.File) r12
                java.lang.String r12 = r12.getAbsolutePath()
                goto L7c
            L7b:
                r12 = r4
            L7c:
                r7.add(r12)
                int r1 = r1 + r5
                r12 = r6
                r6 = r8
                goto L4d
            L83:
                io.u r12 = r11.C
                io.w r12 = io.u.m(r12)
                r12.e()
                io.u r12 = r11.C
                io.w r12 = io.u.m(r12)
                r11.f21079x = r6
                r11.f21080y = r4
                r11.f21081z = r4
                r11.A = r3
                java.lang.Object r12 = r12.f(r11)
                if (r12 != r0) goto La1
            La0:
                return r0
            La1:
                r0 = r6
            La2:
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.B
                kotlin.jvm.functions.Function2 r12 = r12.d()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.a0(r0)
                io.u r1 = r11.C
                dn.g r1 = io.u.h(r1)
                com.withpersona.sdk2.camera.CameraProperties r1 = r1.a()
                r12.invoke(r0, r1)
                kotlin.Unit r12 = kotlin.Unit.f22894a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.u.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$8", f = "CameraScreenRunner.kt", l = {271}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21082t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen.b f21084v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Screen.b bVar, mt.b<? super h> bVar2) {
            super(2, bVar2);
            this.f21084v = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return u.this.new h(this.f21084v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object e10 = nt.c.e();
            int i10 = this.f21082t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = u.this.cameraController;
                this.f21082t = 1;
                Object k10 = gVar.k(this);
                if (k10 == e10) {
                    return e10;
                }
                obj2 = k10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                obj2 = ((gt.n) obj).getValue();
            }
            Screen.b bVar = this.f21084v;
            u uVar = u.this;
            if (gt.n.h(obj2)) {
                bVar.F().invoke((File) obj2, uVar.cameraController.a());
                TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, 124, null);
            }
            u uVar2 = u.this;
            Screen.b bVar2 = this.f21084v;
            Throwable e11 = gt.n.e(obj2);
            if (e11 != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, gt.a.b(e11), false, 20, null);
                if (!(e11 instanceof h0)) {
                    bVar2.D().invoke(e11);
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", f = "CameraScreenRunner.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21085t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen.b f21087v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ android.view.m f21088w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f21089x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Screen.b bVar, android.view.m mVar, long j10, mt.b<? super i> bVar2) {
            super(2, bVar2);
            this.f21087v = bVar;
            this.f21088w = mVar;
            this.f21089x = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return u.this.new i(this.f21087v, this.f21088w, this.f21089x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object f10;
            Object e10 = nt.c.e();
            int i10 = this.f21085t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.g gVar = u.this.cameraController;
                this.f21085t = 1;
                f10 = gVar.f(this);
                if (f10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                f10 = ((gt.n) obj).getValue();
            }
            u uVar = u.this;
            Screen.b bVar = this.f21087v;
            android.view.m mVar = this.f21088w;
            long j10 = this.f21089x;
            if (gt.n.h(f10)) {
                if (((Boolean) f10).booleanValue()) {
                    uVar.s(bVar, mVar, j10);
                }
                TrackingEventsLogger.logVideoStartEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, false, 12, null);
            }
            u uVar2 = u.this;
            Screen.b bVar2 = this.f21087v;
            Throwable e11 = gt.n.e(f10);
            if (e11 != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, gt.a.b(e11), false, 20, null);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public u(@NotNull Context context, @NotNull w viewController, @NotNull dn.g cameraController, @NotNull dn.x governmentIdFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.viewController = viewController;
        this.cameraController = cameraController;
        this.governmentIdFeed = governmentIdFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.statusBarColor = l2.b.c(context, tp.b.f32357a);
        viewController.a();
        hq.g.i(context).a().a(new a());
        r();
        viewController.getRoot().addOnAttachStateChangeListener(new b());
    }

    public static final Unit u(u uVar, boolean z10) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        uVar.cameraController.c(z10);
        return Unit.f22894a;
    }

    public static final Unit v(u uVar, Screen.b bVar, android.view.m mVar) {
        d2 d10;
        boolean q10 = uVar.q();
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        if (!q10) {
            uVar.A(bVar, bVar.getMaxRecordingLengthMs());
            bVar.x().invoke();
            d10 = ju.k.d(mVar, g1.c(), null, new f(bVar, uVar, null), 2, null);
            uVar.currentCaptureJob = d10;
        }
        return Unit.f22894a;
    }

    public static final Unit w(u uVar) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CAPTURE_TIPS, null, 2, null), false, 2, null);
        return Unit.f22894a;
    }

    public static final Unit x(u uVar) {
        uVar.cameraController.g();
        return Unit.f22894a;
    }

    public static final void y(u uVar, View view) {
        uVar.cameraController.g();
    }

    public static final Unit z(u uVar) {
        hn.b.a(uVar.governmentIdFeed, uVar.cameraController, uVar.viewController.b());
        return Unit.f22894a;
    }

    public final void A(Screen.b rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == kn.a.b) {
            android.view.m a10 = android.view.t.a(hq.g.i(this.context));
            ju.k.d(a10, g1.c(), null, new i(rendering, a10, maxRecordingLengthMs, null), 2, null);
        }
    }

    public final boolean q() {
        d2 d2Var = this.currentCaptureJob;
        return d2Var != null && d2Var.b();
    }

    public final void r() {
        d2 d10;
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = ju.k.d(android.view.t.a(hq.g.i(this.context)), null, null, new d(null), 3, null);
        this.cameraStateListenerJob = d10;
    }

    public final void s(Screen.b rendering, android.view.m lifecycleScope, long maxRecordingLengthMs) {
        d2 d10;
        d2 d2Var = this.maxRecordingLimitJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = ju.k.d(lifecycleScope, g1.b(), null, new e(maxRecordingLengthMs, this, rendering, null), 2, null);
        this.maxRecordingLimitJob = d10;
    }

    @Override // ym.k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        j0.c b10;
        d2 d2Var;
        d2 d10;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final android.view.m a10 = android.view.t.a(hq.g.i(this.context));
        if (this.lastLoggedIdleSide != rendering.getCaptureSide()) {
            this.lastLoggedIdleSide = rendering.getCaptureSide();
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.IDLE, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(rendering.getCaptureSide()), null, 8, null), false, 2, null);
        }
        this.cameraController.j();
        if (rendering.getHolographicTorchEnabled() != this.currentHolographicTorchEnabled) {
            this.currentHolographicTorchEnabled = rendering.getHolographicTorchEnabled();
            this.cameraController.c(rendering.getHolographicTorchEnabled());
        }
        if (x.b(rendering)) {
            s(rendering, a10, rendering.getMaxRecordingLengthMs());
        }
        this.cameraController.h(rendering.getEnableAnalyzer());
        tq.c.b(viewEnvironment, this.context, this.statusBarColor);
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            dn.x xVar = this.governmentIdFeed;
            b10 = v.b(rendering.getCaptureSide());
            xVar.o(b10, rendering.e(), kotlin.collections.o.d(new en.k()), c.f21060a[rendering.getDesignVersion().ordinal()] == 1);
            this.lastAutoCaptureRulesId = Integer.valueOf(rendering.getAutoCaptureRulesId());
        }
        this.currentErrorHandler = rendering.D();
        this.permissionChangedHandler = rendering.n();
        w wVar = this.viewController;
        String message = rendering.getMessage();
        String scanInstructions = rendering.getScanInstructions();
        String disclaimer = rendering.getDisclaimer();
        String title = rendering.getTitle();
        String description = rendering.getDescription();
        String hintText = rendering.getHintText();
        Screen.b.a captureButtonState = (rendering.getCaptureButtonState() != Screen.b.a.b || rendering.getIsEnabled()) ? rendering.getCaptureButtonState() : Screen.b.a.f10814a;
        IdConfig.b captureSide = rendering.getCaptureSide();
        Screen.Overlay overlay = rendering.getOverlay();
        OverlayAssets b11 = com.withpersona.sdk2.inquiry.governmentid.o.b(this.context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        wVar.c(message, scanInstructions, disclaimer, title, description, hintText, captureButtonState, captureSide, overlay, b11, assetConfig != null ? com.withpersona.sdk2.inquiry.governmentid.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, x.a(rendering), rendering.getShowFinalizeUi(), rendering.getNavigationState(), rendering.getNavBarTitle(), rendering.getCaptureTips(), rendering.getAssetConfig(), rendering.getPlaySideTransition(), rendering.h(), rendering.o(), new Function1() { // from class: io.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u8;
                u8 = u.u(u.this, ((Boolean) obj).booleanValue());
                return u8;
            }
        }, new Function0() { // from class: io.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit v5;
                v5 = u.v(u.this, rendering, a10);
                return v5;
            }
        }, new Function0() { // from class: io.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit w5;
                w5 = u.w(u.this);
                return w5;
            }
        }, new Function0() { // from class: io.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit x10;
                x10 = u.x(u.this);
                return x10;
            }
        }, rendering.getStyles(), rendering.getWatermarkText());
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: io.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.y(u.this, view);
            }
        });
        if (rendering.getAutoCapturing() && !q()) {
            A(rendering, rendering.getMaxRecordingLengthMs());
            d10 = ju.k.d(a10, g1.c(), null, new g(rendering, this, null), 2, null);
            this.currentCaptureJob = d10;
        }
        uq.z.b(this.cameraController.getPreviewView(), new Function0() { // from class: io.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z10;
                z10 = u.z(u.this);
                return z10;
            }
        });
        if (((rendering.getState() instanceof GovernmentIdState.FinalizeWebRtc) || rendering.getFinalizeLocalVideo()) && (d2Var = this.maxRecordingLimitJob) != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            ju.k.d(a10, g1.c(), null, new h(rendering, null), 2, null);
        }
    }
}
