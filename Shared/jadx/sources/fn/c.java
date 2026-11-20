package fn;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.d;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.b0;
import fn.c;
import fn.s;
import ju.d2;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0+*\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010:R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0016\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020=0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010FR\u0014\u0010\r\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010IR\u0014\u0010L\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010KR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010M¨\u0006O"}, d2 = {"Lfn/c;", "Ldn/g;", "Lfn/b0$a;", "camera2ManagerFactoryFactory", "Lfn/i0;", "cameraChoiceHelper", "Lju/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lfn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Lfn/b0$a;Lfn/i0;Lju/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)V", "", "j", "()V", "destroy", "enable", "c", "(Z)V", "g", "Lgt/n;", "Ljava/io/File;", rl.d.f30696a, "(Lmt/b;)Ljava/lang/Object;", "f", "k", "enableAnalyzer", "h", "z", "Lmu/p0;", "Lfn/s$d;", "Lmu/h;", "w", "(Lmu/p0;)Lmu/h;", "y", ve.a.f33391e, "Lfn/b0$a;", j6.b.f21518e, "Lfn/i0;", "Lju/p0;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lfn/b0;", "e", "Lfn/b0;", "camera2ManagerFactory", "Lfn/s;", "Lfn/s;", "currentManager", "Lmu/c0;", "Lcom/withpersona/sdk2/camera/d;", "Lmu/c0;", "_previewState", "Z", "recordingOngoing", "Lju/d2;", "i", "Lju/d2;", "currentStateCollectJob", "()Lmu/p0;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements dn.g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0.a camera2ManagerFactoryFactory;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 camera2ManagerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public s currentManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public mu.c0<com.withpersona.sdk2.camera.d> _previewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean recordingOngoing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentStateCollectJob;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lfn/c$a;", "", "Lfn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "Lfn/c;", ve.a.f33391e, "(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a webRtcManager, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/i;", "Lfn/s$d;", "state", "", "<anonymous>", "(Lmu/i;Lfn/s$d;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED}, m = "invokeSuspend")
    public static final class b extends ot.m implements yt.n<mu.i<? super s.d>, s.d, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17311t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17312u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f17313v;

        public b(mt.b<? super b> bVar) {
            super(3, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            mu.i iVar = (mu.i) this.f17312u;
            s.d dVar = (s.d) this.f17313v;
            Object e10 = nt.c.e();
            int i10 = this.f17311t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f17312u = ot.l.a(iVar);
                this.f17313v = dVar;
                this.f17311t = 1;
                if (iVar.emit(dVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return ot.b.a(!Intrinsics.c(dVar, s.d.b.f17448a));
        }

        @Override // yt.n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super s.d> iVar, s.d dVar, mt.b<? super Boolean> bVar) {
            b bVar2 = new b(bVar);
            bVar2.f17312u = iVar;
            bVar2.f17313v = dVar;
            return bVar2.invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$2", f = "Camera2Controller.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: fn.c$c, reason: collision with other inner class name */
    public static final class C0311c extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17314t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fn.c$c$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f17316a;

            public a(c cVar) {
                this.f17316a = cVar;
            }

            public static final String d(c cVar) {
                return "First frame received for camera choice " + cVar.currentManager.getCameraChoice();
            }

            @Override // mu.i
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(s.d dVar, mt.b<? super Unit> bVar) {
                if (!Intrinsics.c(dVar, s.d.a.f17447a)) {
                    if (dVar instanceof s.d.Started) {
                        s.d.Started started = (s.d.Started) dVar;
                        if (started.getFirstFrameReceived()) {
                            TrackingEventsLogger trackingEventsLogger = this.f17316a.trackingEventsLogger;
                            final c cVar = this.f17316a;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: fn.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String d10;
                                    d10 = c.C0311c.a.d(c.this);
                                    return d10;
                                }
                            }, false, 4, null);
                        }
                        this.f17316a._previewState.setValue(new d.Ready(started.getFirstFrameReceived()));
                    } else if (Intrinsics.c(dVar, s.d.b.f17448a)) {
                        this.f17316a._previewState.setValue(new d.Closed(this.f17316a.recordingOngoing, false));
                        c cVar2 = this.f17316a;
                        cVar2.currentManager = cVar2.camera2ManagerFactory.h();
                        this.f17316a.recordingOngoing = false;
                    } else {
                        if (!(dVar instanceof s.d.Error)) {
                            throw new gt.l();
                        }
                        s.c error = ((s.d.Error) dVar).getError();
                        if (error instanceof s.c.a) {
                            this.f17316a.z();
                        } else {
                            if (!(error instanceof s.c.b)) {
                                throw new gt.l();
                            }
                            this.f17316a._previewState.setValue(d.c.f9994a);
                        }
                    }
                }
                return Unit.f22894a;
            }
        }

        public C0311c(mt.b<? super C0311c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new C0311c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17314t;
            if (i10 == 0) {
                gt.o.b(obj);
                c cVar = c.this;
                mu.h e11 = mu.j.e(cVar.w(cVar.currentManager.e0()));
                a aVar = new a(c.this);
                this.f17314t = 1;
                if (e11.collect(aVar, this) == e10) {
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
            return ((C0311c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", l = {}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17317t;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f17317t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            c.this._previewState.setValue(new d.Closed(true, true));
            c.this._previewState.setValue(d.c.f9994a);
            c.this.j();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {159}, m = "startVideo-IoAF18A")
    public static final class e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17319t;

        /* renamed from: v, reason: collision with root package name */
        public int f17321v;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17319t = obj;
            this.f17321v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object f10 = c.this.f(this);
            return f10 == nt.c.e() ? f10 : gt.n.a(f10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {170}, m = "stopVideo-IoAF18A")
    public static final class f extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17322t;

        /* renamed from: v, reason: collision with root package name */
        public int f17324v;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17322t = obj;
            this.f17324v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object k10 = c.this.k(this);
            return k10 == nt.c.e() ? k10 : gt.n.a(k10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {152}, m = "takePicture-IoAF18A")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17325t;

        /* renamed from: v, reason: collision with root package name */
        public int f17327v;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17325t = obj;
            this.f17327v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object d10 = c.this.d(this);
            return d10 == nt.c.e() ? d10 : gt.n.a(d10);
        }
    }

    public c(@NotNull b0.a camera2ManagerFactoryFactory, @NotNull i0 cameraChoiceHelper, @NotNull ju.p0 coroutineScope, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z10) {
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(cameraChoices, "cameraChoices");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.coroutineScope = coroutineScope;
        this.trackingEventsLogger = trackingEventsLogger;
        this._previewState = mu.r0.a(d.c.f9994a);
        b0 a10 = camera2ManagerFactoryFactory.a(cameraChoices, previewView, analyzer, videoCaptureMethod, aVar, z10);
        this.camera2ManagerFactory = a10;
        this.currentManager = a10.h();
    }

    public static final String A() {
        return "All camera choices exhausted. Emitting CameraState.Error, which surfaces as the \"Unsupported device.\" error.";
    }

    public static final String x(c cVar) {
        return "Attempting camera choice " + cVar.currentManager.getCameraChoice();
    }

    @Override // dn.g
    @NotNull
    public CameraProperties a() {
        return this.currentManager.getCameraProperties();
    }

    @Override // dn.g
    @NotNull
    public mu.p0<com.withpersona.sdk2.camera.d> b() {
        return this._previewState;
    }

    @Override // dn.g
    public void c(boolean enable) {
        this.currentManager.Z(enable);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // dn.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.c.g
            if (r0 == 0) goto L13
            r0 = r5
            fn.c$g r0 = (fn.c.g) r0
            int r1 = r0.f17327v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17327v = r1
            goto L18
        L13:
            fn.c$g r0 = new fn.c$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17325t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17327v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            gt.o.b(r5)
            gt.n r5 = (gt.n) r5
            java.lang.Object r5 = r5.getValue()
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            gt.o.b(r5)
            fn.s r5 = r4.currentManager
            r0.f17327v = r3
            java.lang.Object r5 = r5.o0(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.c.d(mt.b):java.lang.Object");
    }

    @Override // dn.g
    public void destroy() {
        this.currentManager.Y();
    }

    @Override // dn.g
    @NotNull
    /* renamed from: e */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // dn.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.c.e
            if (r0 == 0) goto L13
            r0 = r5
            fn.c$e r0 = (fn.c.e) r0
            int r1 = r0.f17321v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17321v = r1
            goto L18
        L13:
            fn.c$e r0 = new fn.c$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17319t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17321v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            gt.o.b(r5)
            gt.n r5 = (gt.n) r5
            java.lang.Object r5 = r5.getValue()
            goto L5b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            gt.o.b(r5)
            mu.c0<com.withpersona.sdk2.camera.d> r5 = r4._previewState
            java.lang.Object r5 = r5.getValue()
            boolean r5 = r5 instanceof com.withpersona.sdk2.camera.d.Ready
            if (r5 != 0) goto L50
            gt.n$a r5 = gt.n.INSTANCE
            r5 = 0
            java.lang.Boolean r5 = ot.b.a(r5)
            java.lang.Object r5 = gt.n.b(r5)
            return r5
        L50:
            fn.s r5 = r4.currentManager
            r0.f17321v = r3
            java.lang.Object r5 = r5.x0(r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            boolean r0 = gt.n.g(r5)
            if (r0 == 0) goto L63
            r0 = 0
            goto L64
        L63:
            r0 = r5
        L64:
            java.lang.Boolean r1 = ot.b.a(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            if (r0 == 0) goto L70
            r4.recordingOngoing = r3
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.c.f(mt.b):java.lang.Object");
    }

    @Override // dn.g
    public void g() {
        this.currentManager.a0();
    }

    @Override // dn.g
    public void h(boolean enableAnalyzer) {
        this.currentManager.q0(enableAnalyzer);
    }

    @Override // dn.g
    /* renamed from: i, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    @Override // dn.g
    public void j() {
        d2 d10;
        if (Intrinsics.c(this._previewState.getValue(), d.c.f9994a) || (this._previewState.getValue() instanceof d.Closed)) {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this._previewState.setValue(d.C0167d.f9995a);
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String x10;
                    x10 = c.x(c.this);
                    return x10;
                }
            }, false, 4, null);
            d10 = ju.k.d(this.coroutineScope, null, null, new C0311c(null), 3, null);
            this.currentStateCollectJob = d10;
            this.currentManager.r0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // dn.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fn.c.f
            if (r0 == 0) goto L13
            r0 = r5
            fn.c$f r0 = (fn.c.f) r0
            int r1 = r0.f17324v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17324v = r1
            goto L18
        L13:
            fn.c$f r0 = new fn.c$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17322t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17324v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            gt.o.b(r5)
            gt.n r5 = (gt.n) r5
            java.lang.Object r5 = r5.getValue()
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            gt.o.b(r5)
            r5 = 0
            r4.recordingOngoing = r5
            fn.s r5 = r4.currentManager
            r0.f17324v = r3
            java.lang.Object r5 = r5.z0(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.c.k(mt.b):java.lang.Object");
    }

    public final mu.h<s.d> w(mu.p0<? extends s.d> p0Var) {
        return mu.j.T(p0Var, new b(null));
    }

    public final void y() {
        this.currentManager = this.camera2ManagerFactory.h();
        ju.k.d(this.coroutineScope, g1.c(), null, new d(null), 2, null);
    }

    public final void z() {
        this.camera2ManagerFactory.f();
        if (!this.camera2ManagerFactory.i()) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String A;
                    A = c.A();
                    return A;
                }
            }, false, 4, null);
            this._previewState.setValue(d.b.f9993a);
        } else {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            y();
        }
    }
}
