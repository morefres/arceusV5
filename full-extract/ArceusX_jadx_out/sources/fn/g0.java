package fn;

import android.graphics.Point;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001=\u0018\u0000 (2\u00020\u0001:\u00013BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J9\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020 2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J3\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\"\u0010D\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010@\u001a\u0004\bA\u00101\"\u0004\bB\u0010CR$\u0010K\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010MR\u0016\u0010*\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010O¨\u0006P"}, d2 = {"Lfn/g0;", "", "Lfn/h0;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Lkotlin/Function0;", "", "onFrameReceived", "Lju/p0;", "coroutineScope", "<init>", "(Lfn/h0;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;Lkotlin/jvm/functions/Function0;Lju/p0;)V", "Lgt/n;", "m", "()Ljava/lang/Object;", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "k", "(IILandroid/util/Size;J)V", "f", "()V", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "g", "(Landroid/hardware/camera2/CameraDevice;Lmt/b;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "l", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "h", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Ljava/lang/Object;", "i", "()Z", "e", ve.a.f33391e, "Lfn/h0;", j6.b.f21518e, "Ljava/util/List;", "c", "Landroid/os/Handler;", rl.d.f30696a, "Landroid/hardware/camera2/CameraCharacteristics;", "Lkotlin/jvm/functions/Function0;", "Lju/p0;", "fn/g0$b", "Lfn/g0$b;", "callback", "Z", "getEnableTorch", "j", "(Z)V", "enableTorch", "Landroid/hardware/camera2/params/MeteringRectangle;", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "meteringRect", "Lju/d2;", "Lju/d2;", "resetFocusJob", "Landroid/hardware/camera2/CameraCaptureSession;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Surface> targets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Handler handler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraCharacteristics cameraCharacteristics;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onFrameReceived;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 coroutineScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b callback;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean enableTorch;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MeteringRectangle meteringRect;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 resetFocusJob;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public CameraCaptureSession session;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfn/g0$a;", "", "<init>", "()V", "Lfn/h0;", "cameraChoice", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "", "onFrameReceived", "Ljq/a;", "coroutineScopeFactory", "Lfn/g0;", ve.a.f33391e, "(Lfn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Ljq/a;Lmt/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: fn.g0$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        @ot.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", f = "CameraCaptureSessionWrapper.kt", l = {54}, m = "create")
        /* renamed from: fn.g0$a$a, reason: collision with other inner class name */
        public static final class C0312a extends ot.d {
            public Object A;
            public Object B;
            public Object C;
            public int D;
            public /* synthetic */ Object E;
            public int G;

            /* renamed from: t, reason: collision with root package name */
            public Object f17353t;

            /* renamed from: u, reason: collision with root package name */
            public Object f17354u;

            /* renamed from: v, reason: collision with root package name */
            public Object f17355v;

            /* renamed from: w, reason: collision with root package name */
            public Object f17356w;

            /* renamed from: x, reason: collision with root package name */
            public Object f17357x;

            /* renamed from: y, reason: collision with root package name */
            public Object f17358y;

            /* renamed from: z, reason: collision with root package name */
            public Object f17359z;

            public C0312a(mt.b<? super C0312a> bVar) {
                super(bVar);
            }

            @Override // ot.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.E = obj;
                this.G |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return Companion.this.a(null, null, null, null, null, null, null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull fn.h0 r14, @org.jetbrains.annotations.NotNull android.hardware.camera2.CameraCharacteristics r15, @org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r16, @org.jetbrains.annotations.NotNull android.hardware.camera2.CameraDevice r17, @org.jetbrains.annotations.Nullable android.os.Handler r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull jq.a r20, @org.jetbrains.annotations.NotNull mt.b<? super fn.g0> r21) {
            /*
                r13 = this;
                r0 = r21
                boolean r1 = r0 instanceof fn.g0.Companion.C0312a
                if (r1 == 0) goto L15
                r1 = r0
                fn.g0$a$a r1 = (fn.g0.Companion.C0312a) r1
                int r2 = r1.G
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L15
                int r2 = r2 - r3
                r1.G = r2
                goto L1a
            L15:
                fn.g0$a$a r1 = new fn.g0$a$a
                r1.<init>(r0)
            L1a:
                java.lang.Object r0 = r1.E
                java.lang.Object r2 = nt.c.e()
                int r3 = r1.G
                r4 = 1
                if (r3 == 0) goto L5b
                if (r3 != r4) goto L53
                java.lang.Object r14 = r1.C
                fn.g0 r14 = (fn.g0) r14
                java.lang.Object r2 = r1.B
                fn.g0 r2 = (fn.g0) r2
                java.lang.Object r2 = r1.A
                fn.g0 r2 = (fn.g0) r2
                java.lang.Object r3 = r1.f17359z
                jq.a r3 = (jq.a) r3
                java.lang.Object r3 = r1.f17358y
                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                java.lang.Object r3 = r1.f17357x
                android.os.Handler r3 = (android.os.Handler) r3
                java.lang.Object r3 = r1.f17356w
                android.hardware.camera2.CameraDevice r3 = (android.hardware.camera2.CameraDevice) r3
                java.lang.Object r3 = r1.f17355v
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r3 = r1.f17354u
                android.hardware.camera2.CameraCharacteristics r3 = (android.hardware.camera2.CameraCharacteristics) r3
                java.lang.Object r1 = r1.f17353t
                fn.h0 r1 = (fn.h0) r1
                gt.o.b(r0)
                goto Lb4
            L53:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L5b:
                gt.o.b(r0)
                fn.g0 r5 = new fn.g0
                ju.p0 r11 = r20.a()
                r12 = 0
                r6 = r14
                r9 = r15
                r7 = r16
                r8 = r18
                r10 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r14 = ot.l.a(r14)
                r1.f17353t = r14
                java.lang.Object r14 = ot.l.a(r15)
                r1.f17354u = r14
                java.lang.Object r14 = ot.l.a(r16)
                r1.f17355v = r14
                java.lang.Object r14 = ot.l.a(r17)
                r1.f17356w = r14
                java.lang.Object r14 = ot.l.a(r18)
                r1.f17357x = r14
                java.lang.Object r14 = ot.l.a(r19)
                r1.f17358y = r14
                java.lang.Object r14 = ot.l.a(r20)
                r1.f17359z = r14
                r1.A = r5
                java.lang.Object r14 = ot.l.a(r5)
                r1.B = r14
                r1.C = r5
                r14 = 0
                r1.D = r14
                r1.G = r4
                r14 = r17
                java.lang.Object r0 = fn.g0.b(r5, r14, r1)
                if (r0 != r2) goto Lb2
                return r2
            Lb2:
                r14 = r5
                r2 = r14
            Lb4:
                android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
                fn.g0.d(r14, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: fn.g0.Companion.a(fn.h0, android.hardware.camera2.CameraCharacteristics, java.util.List, android.hardware.camera2.CameraDevice, android.os.Handler, kotlin.jvm.functions.Function0, jq.a, mt.b):java.lang.Object");
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"fn/g0$b", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            super.onCaptureCompleted(session, request, result);
            g0.this.onFrameReceived.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"fn/g0$c", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mt.b<CameraCaptureSession> f17361a;
        public final /* synthetic */ CameraDevice b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(mt.b<? super CameraCaptureSession> bVar, CameraDevice cameraDevice) {
            this.f17361a = bVar;
            this.b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            RuntimeException runtimeException = new RuntimeException("Camera " + this.b.getId() + " session configuration failed");
            mt.b<CameraCaptureSession> bVar = this.f17361a;
            n.Companion companion = gt.n.INSTANCE;
            bVar.resumeWith(gt.n.b(gt.o.a(runtimeException)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.f17361a.resumeWith(gt.n.b(session));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", f = "CameraCaptureSessionWrapper.kt", l = {185, 187}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17362t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f17363u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0 f17364v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", f = "CameraCaptureSessionWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17365t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g0 f17366u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f17366u = g0Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f17366u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f17365t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                this.f17366u.e();
                this.f17366u.m();
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, g0 g0Var, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f17363u = j10;
            this.f17364v = g0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f17363u, this.f17364v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (ju.i.g(r7, r1, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (ju.z0.b(r4, r6) == r0) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r6.f17362t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)
                goto L41
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                gt.o.b(r7)
                goto L2c
            L1e:
                gt.o.b(r7)
                long r4 = r6.f17363u
                r6.f17362t = r3
                java.lang.Object r7 = ju.z0.b(r4, r6)
                if (r7 != r0) goto L2c
                goto L40
            L2c:
                ju.n2 r7 = ju.g1.c()
                fn.g0$d$a r1 = new fn.g0$d$a
                fn.g0 r3 = r6.f17364v
                r4 = 0
                r1.<init>(r3, r4)
                r6.f17362t = r2
                java.lang.Object r7 = ju.i.g(r7, r1, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fn.g0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ g0(h0 h0Var, List list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0 function0, ju.p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, list, handler, cameraCharacteristics, function0, p0Var);
    }

    public final void e() {
        this.meteringRect = null;
    }

    public final void f() {
        ju.q0.f(this.coroutineScope, null, 1, null);
    }

    public final Object g(CameraDevice cameraDevice, mt.b<? super CameraCaptureSession> bVar) {
        mt.e eVar = new mt.e(nt.b.c(bVar));
        l(cameraDevice, this.targets, this.handler, new c(eVar, cameraDevice));
        Object a10 = eVar.a();
        if (a10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return a10;
    }

    public final Object h(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) {
        try {
            n.Companion companion = gt.n.INSTANCE;
            CaptureRequest.Builder createCaptureRequest = session.getDevice().createCaptureRequest(1);
            Iterator<T> it = surfaces.iterator();
            while (it.hasNext()) {
                createCaptureRequest.addTarget((Surface) it.next());
            }
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.g());
            if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            if (this.enableTorch) {
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            }
            MeteringRectangle meteringRectangle = this.meteringRect;
            if (meteringRectangle != null && i()) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            }
            return gt.n.b(createCaptureRequest.build());
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(th2));
        }
    }

    public final boolean i() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) >= 1;
    }

    public final void j(boolean z10) {
        this.enableTorch = z10;
    }

    public final void k(int x10, int y10, @NotNull Size size, long duration) {
        d2 d10;
        Intrinsics.checkNotNullParameter(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x10, y10), size, 1000);
        d2 d2Var = this.resetFocusJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = ju.k.d(this.coroutineScope, null, null, new d(duration, this, null), 3, null);
        this.resetFocusJob = d10;
    }

    public final boolean l(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 33) {
            device.createCaptureSession(targets, stateCallback, handler);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Surface> it = targets.iterator();
        while (it.hasNext()) {
            OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
            outputConfiguration.setDynamicRangeProfile(this.cameraChoice.getAdditionalOptions().getDynamicRange());
            arrayList.add(outputConfiguration);
        }
        device.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
        return true;
    }

    @NotNull
    public final Object m() {
        CameraCaptureSession cameraCaptureSession = this.session;
        CameraCaptureSession cameraCaptureSession2 = null;
        if (cameraCaptureSession == null) {
            Intrinsics.u("session");
            cameraCaptureSession = null;
        }
        Object h10 = h(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        if (!gt.n.h(h10)) {
            return gt.n.b(h10);
        }
        try {
            CaptureRequest captureRequest = (CaptureRequest) h10;
            CameraCaptureSession cameraCaptureSession3 = this.session;
            if (cameraCaptureSession3 == null) {
                Intrinsics.u("session");
            } else {
                cameraCaptureSession2 = cameraCaptureSession3;
            }
            cameraCaptureSession2.setRepeatingRequest(captureRequest, this.callback, this.handler);
            return gt.n.b(Unit.f22894a);
        } catch (Throwable th2) {
            n.Companion companion = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(h0 h0Var, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics, Function0<Unit> function0, ju.p0 p0Var) {
        this.cameraChoice = h0Var;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.onFrameReceived = function0;
        this.coroutineScope = p0Var;
        this.callback = new b();
    }
}
