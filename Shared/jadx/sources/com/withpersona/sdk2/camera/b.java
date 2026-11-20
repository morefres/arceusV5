package com.withpersona.sdk2.camera;

import android.content.Context;
import android.util.Size;
import android.view.s;
import androidx.camera.view.PreviewView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import d1.k;
import dn.i0;
import dn.r;
import dn.u;
import f1.a0;
import f1.p;
import f1.p1;
import f1.r0;
import g0.a2;
import g0.f1;
import g0.h1;
import g0.j0;
import g0.l;
import g0.m0;
import g0.u0;
import g0.v;
import g0.x2;
import gt.n;
import gt.o;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00102\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/camera/b;", "", "Loq/c;", "sdkFilesManager", "<init>", "(Loq/c;)V", "Landroidx/camera/view/PreviewView;", "previewView", "Lcom/withpersona/sdk2/camera/b$a;", "cameraDirection", "Lg0/u0$a;", "imageAnalyzer", "", "useCameraCapture", "useVideoCapture", "Lkotlin/Function1;", "Ldn/h;", "", "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/b$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V", "enable", "c", "(Z)V", rl.d.f30696a, "(Landroidx/camera/view/PreviewView;)V", "Lgt/n;", "Ljava/io/File;", "m", "(Loq/c;Lmt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "isAudioRequired", "k", "(Landroid/content/Context;Z)Z", "l", "(Lmt/b;)Ljava/lang/Object;", "Lg0/l;", "camera", "Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "(Lg0/l;)Lcom/withpersona/sdk2/camera/CameraProperties;", ve.a.f33391e, "Loq/c;", "Ldn/r;", j6.b.f21518e, "Ldn/r;", "currentCameraSession", "e", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public r currentCameraSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/b$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9974a = new a("FRONT", 0);
        public static final a b = new a("BACK", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f9975c = new a("EXTERNAL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f9976d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f9977e;

        static {
            a[] a10 = a();
            f9976d = a10;
            f9977e = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f9974a, b, f9975c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9976d.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/b$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.b$b, reason: collision with other inner class name */
    public static final class C0166b implements android.view.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f9978a;

        public C0166b(ExecutorService executorService) {
            this.f9978a = executorService;
        }

        @Override // android.view.f
        public void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public void onDestroy(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f9978a.shutdown();
        }

        @Override // android.view.f
        public void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public void onResume(s sVar) {
            super.onResume(sVar);
        }

        @Override // android.view.f
        public void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // android.view.f
        public void onStop(s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {227}, m = "stopVideo-IoAF18A")
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f9979t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9980u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9981v;

        /* renamed from: x, reason: collision with root package name */
        public int f9983x;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9981v = obj;
            this.f9983x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object l10 = b.this.l(this);
            return l10 == nt.c.e() ? l10 : n.a(l10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", l = {189}, m = "takePicture-gIAlu-s")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f9984t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9985u;

        /* renamed from: w, reason: collision with root package name */
        public int f9987w;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9985u = obj;
            this.f9987w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object m10 = b.this.m(null, this);
            return m10 == nt.c.e() ? m10 : n.a(m10);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/withpersona/sdk2/camera/b$e", "Lg0/f1$g;", "Lg0/f1$i;", "outputFileResults", "", rl.d.f30696a, "(Lg0/f1$i;)V", "Lg0/h1;", "exception", "e", "(Lg0/h1;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements f1.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mt.b<n<? extends File>> f9988a;
        public final /* synthetic */ File b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(mt.b<? super n<? extends File>> bVar, File file) {
            this.f9988a = bVar;
            this.b = file;
        }

        @Override // g0.f1.g
        public void d(f1.i outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            mt.b<n<? extends File>> bVar = this.f9988a;
            n.Companion companion = n.INSTANCE;
            bVar.resumeWith(n.b(n.a(n.b(this.b))));
        }

        @Override // g0.f1.g
        public void e(h1 exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            mt.b<n<? extends File>> bVar = this.f9988a;
            n.Companion companion = n.INSTANCE;
            bVar.resumeWith(n.b(n.a(n.b(o.a(exception)))));
        }
    }

    public b(@NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.sdkFilesManager = sdkFilesManager;
    }

    public static /* synthetic */ void g(b bVar, PreviewView previewView, a aVar, u0.a aVar2, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        bVar.f(previewView, aVar, aVar2, z10, z11, function1);
    }

    public static final void h(final PreviewView previewView, final boolean z10, final u0.a aVar, final boolean z11, final v vVar, final b bVar, final Function1 function1) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.a t12 = u.b(context).t1();
            if (t12 != null) {
                t12.k();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            k.Companion companion = k.INSTANCE;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final x<k> c10 = companion.c(context2);
            c10.a(new Runnable() { // from class: dn.p
                @Override // java.lang.Runnable
                public final void run() {
                    com.withpersona.sdk2.camera.b.i(ne.x.this, rotation, z10, aVar, newSingleThreadExecutor, z11, previewView, vVar, bVar, function1);
                }
            }, l2.b.i(previewView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(x xVar, int i10, boolean z10, u0.a aVar, ExecutorService executorService, boolean z11, PreviewView previewView, v vVar, b bVar, Function1 function1) {
        f1 f1Var;
        k kVar = (k) xVar.get();
        a2 f10 = new a2.a().c(i10).f();
        Intrinsics.checkNotNullExpressionValue(f10, "build(...)");
        x2.a aVar2 = new x2.a();
        aVar2.b(f10);
        r0 r0Var = null;
        if (z10) {
            f1Var = new f1.b().i(1).c(i10).f();
            aVar2.b(f1Var);
        } else {
            f1Var = null;
        }
        if (aVar != null) {
            u0 f11 = new u0.c().j(0).d(new Size(2000, 2000)).c(i10).f();
            Intrinsics.checkNotNullExpressionValue(f11, "build(...)");
            f11.t0(executorService, aVar);
            aVar2.b(f11);
        }
        if (z11) {
            r0.i e10 = new r0.i().e(executorService);
            f1.x xVar2 = f1.x.f16613c;
            r0Var = e10.f(a0.d(xVar2, p.b(xVar2))).c();
            aVar2.b(p1.m1(r0Var));
        }
        kVar.h();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j.b b = u.b(context);
            x2 c10 = aVar2.c();
            Intrinsics.checkNotNullExpressionValue(c10, "build(...)");
            l c11 = kVar.c(b, vVar, c10);
            bVar.currentCameraSession = new r(c11, f1Var, r0Var, bVar.j(c11));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            hq.g.i(context2).a().a(new C0166b(executorService));
            f10.q0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new i0());
        }
    }

    public final void c(boolean enable) {
        l camera;
        r rVar = this.currentCameraSession;
        if (rVar == null || (camera = rVar.getCamera()) == null) {
            return;
        }
        camera.c().c(enable);
    }

    public final void d(@NotNull PreviewView previewView) {
        l camera;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        r rVar = this.currentCameraSession;
        if (rVar == null || (camera = rVar.getCamera()) == null) {
            return;
        }
        camera.c().o(new m0.a(new j0(previewView.getDisplay(), camera.d(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    @NotNull
    public final CameraProperties e() {
        CameraProperties cameraProperties;
        r rVar = this.currentCameraSession;
        return (rVar == null || (cameraProperties = rVar.getCameraProperties()) == null) ? new CameraProperties(null, null, null, 0, 0, 31, null) : cameraProperties;
    }

    public final void f(@NotNull final PreviewView previewView, @NotNull a cameraDirection, @Nullable final u0.a imageAnalyzer, final boolean useCameraCapture, final boolean useVideoCapture, @NotNull final Function1<? super dn.h, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final v a10 = new v.a().b(cameraDirection == a.f9974a ? 0 : 1).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        previewView.post(new Runnable() { // from class: dn.o
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.camera.b.h(PreviewView.this, useCameraCapture, imageAnalyzer, useVideoCapture, a10, this, onCameraError);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: IllegalArgumentException -> 0x009a, TryCatch #0 {IllegalArgumentException -> 0x009a, blocks: (B:2:0x0000, B:4:0x0025, B:5:0x002a, B:10:0x0059, B:12:0x005c, B:14:0x0067, B:17:0x006b, B:18:0x006f, B:20:0x0075, B:23:0x0087, B:28:0x008f, B:32:0x0050, B:34:0x0056, B:35:0x0042, B:37:0x0049), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: IllegalArgumentException -> 0x009a, TryCatch #0 {IllegalArgumentException -> 0x009a, blocks: (B:2:0x0000, B:4:0x0025, B:5:0x002a, B:10:0x0059, B:12:0x005c, B:14:0x0067, B:17:0x006b, B:18:0x006f, B:20:0x0075, B:23:0x0087, B:28:0x008f, B:32:0x0050, B:34:0x0056, B:35:0x0042, B:37:0x0049), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withpersona.sdk2.camera.CameraProperties j(g0.l r11) {
        /*
            r10 = this;
            g0.t r11 = r11.d()     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.String r0 = "getCameraInfo(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            f0.h r11 = f0.h.a(r11)     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.String r0 = "from(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.String r2 = r11.c()     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.String r0 = "getCameraId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Object r0 = r11.b(r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r0 != 0) goto L2a
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.IllegalArgumentException -> L9a
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L9a
        L2a:
            android.util.Size r4 = new android.util.Size     // Catch: java.lang.IllegalArgumentException -> L9a
            int r1 = r0.width()     // Catch: java.lang.IllegalArgumentException -> L9a
            int r0 = r0.height()     // Catch: java.lang.IllegalArgumentException -> L9a
            r4.<init>(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Object r0 = r11.b(r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r0 != 0) goto L42
            goto L4d
        L42:
            int r1 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L9a
            r3 = 1
            if (r1 != r3) goto L4d
            com.withpersona.sdk2.camera.CameraProperties$b r0 = com.withpersona.sdk2.camera.CameraProperties.b.b     // Catch: java.lang.IllegalArgumentException -> L9a
        L4b:
            r3 = r0
            goto L5c
        L4d:
            if (r0 != 0) goto L50
            goto L59
        L50:
            int r0 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r0 != 0) goto L59
            com.withpersona.sdk2.camera.CameraProperties$b r0 = com.withpersona.sdk2.camera.CameraProperties.b.f9961a     // Catch: java.lang.IllegalArgumentException -> L9a
            goto L4b
        L59:
            com.withpersona.sdk2.camera.CameraProperties$b r0 = com.withpersona.sdk2.camera.CameraProperties.b.f9962c     // Catch: java.lang.IllegalArgumentException -> L9a
            goto L4b
        L5c:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Object r11 = r11.b(r0)     // Catch: java.lang.IllegalArgumentException -> L9a
            android.util.Range[] r11 = (android.util.Range[]) r11     // Catch: java.lang.IllegalArgumentException -> L9a
            r0 = 0
            if (r11 == 0) goto L8f
            int r1 = r11.length     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r1 != 0) goto L6b
            goto L8f
        L6b:
            java.util.Iterator r11 = kotlin.jvm.internal.c.a(r11)     // Catch: java.lang.IllegalArgumentException -> L9a
        L6f:
            boolean r1 = r11.hasNext()     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r11.next()     // Catch: java.lang.IllegalArgumentException -> L9a
            android.util.Range r1 = (android.util.Range) r1     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Comparable r1 = r1.getUpper()     // Catch: java.lang.IllegalArgumentException -> L9a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.IllegalArgumentException -> L9a
            int r5 = r1.intValue()     // Catch: java.lang.IllegalArgumentException -> L9a
            if (r5 <= r0) goto L6f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.IllegalArgumentException -> L9a
            int r0 = r1.intValue()     // Catch: java.lang.IllegalArgumentException -> L9a
            goto L6f
        L8f:
            r5 = r0
            com.withpersona.sdk2.camera.CameraProperties r1 = new com.withpersona.sdk2.camera.CameraProperties     // Catch: java.lang.IllegalArgumentException -> L9a
            r7 = 16
            r8 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L9a
            return r1
        L9a:
            com.withpersona.sdk2.camera.CameraProperties r2 = new com.withpersona.sdk2.camera.CameraProperties
            r8 = 31
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.b.j(g0.l):com.withpersona.sdk2.camera.CameraProperties");
    }

    public final boolean k(@NotNull Context context, boolean isAudioRequired) {
        r0 recorder;
        Intrinsics.checkNotNullParameter(context, "context");
        r rVar = this.currentCameraSession;
        if (rVar == null || rVar.getCurrentRecordingHelper() != null || (recorder = rVar.getRecorder()) == null) {
            return false;
        }
        rVar.f(h.INSTANCE.a(recorder, context, this.sdkFilesManager, isAudioRequired));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.camera.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.camera.b$c r0 = (com.withpersona.sdk2.camera.b.c) r0
            int r1 = r0.f9983x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9983x = r1
            goto L18
        L13:
            com.withpersona.sdk2.camera.b$c r0 = new com.withpersona.sdk2.camera.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9981v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9983x
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f9980u
            com.withpersona.sdk2.camera.h r1 = (com.withpersona.sdk2.camera.h) r1
            java.lang.Object r0 = r0.f9979t
            dn.r r0 = (dn.r) r0
            gt.o.b(r7)
            gt.n r7 = (gt.n) r7
            java.lang.Object r7 = r7.getValue()
            goto L80
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            gt.o.b(r7)
            dn.r r7 = r6.currentCameraSession
            if (r7 != 0) goto L56
            gt.n$a r7 = gt.n.INSTANCE
            dn.h0 r7 = new dn.h0
            r7.<init>()
            java.lang.Object r7 = gt.o.a(r7)
            java.lang.Object r7 = gt.n.b(r7)
            return r7
        L56:
            com.withpersona.sdk2.camera.h r2 = r7.getCurrentRecordingHelper()
            if (r2 != 0) goto L6c
            gt.n$a r7 = gt.n.INSTANCE
            dn.h0 r7 = new dn.h0
            r7.<init>()
            java.lang.Object r7 = gt.o.a(r7)
            java.lang.Object r7 = gt.n.b(r7)
            return r7
        L6c:
            r0.f9979t = r7
            java.lang.Object r4 = ot.l.a(r2)
            r0.f9980u = r4
            r0.f9983x = r3
            java.lang.Object r0 = r2.e(r0)
            if (r0 != r1) goto L7d
            return r1
        L7d:
            r5 = r0
            r0 = r7
            r7 = r5
        L80:
            r1 = 0
            r0.f(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.b.l(mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@org.jetbrains.annotations.NotNull oq.c r7, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.camera.b.d
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.camera.b$d r0 = (com.withpersona.sdk2.camera.b.d) r0
            int r1 = r0.f9987w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9987w = r1
            goto L18
        L13:
            com.withpersona.sdk2.camera.b$d r0 = new com.withpersona.sdk2.camera.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9985u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f9987w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f9984t
            oq.c r7 = (oq.c) r7
            gt.o.b(r8)
            goto La5
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            gt.o.b(r8)
            r0.f9984t = r7
            r0.f9987w = r3
            mt.e r8 = new mt.e
            mt.b r2 = nt.b.c(r0)
            r8.<init>(r2)
            dn.r r2 = r6.currentCameraSession
            if (r2 == 0) goto L4f
            g0.f1 r2 = r2.getImageCapture()
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 != 0) goto L6d
            gt.n$a r7 = gt.n.INSTANCE
            dn.i0 r7 = new dn.i0
            r7.<init>()
            java.lang.Object r7 = gt.o.a(r7)
            java.lang.Object r7 = gt.n.b(r7)
            gt.n r7 = gt.n.a(r7)
            java.lang.Object r7 = gt.n.b(r7)
            r8.resumeWith(r7)
            goto L95
        L6d:
            java.lang.String r3 = "jpg"
            java.io.File r7 = r7.e(r3)
            g0.f1$h$a r3 = new g0.f1$h$a
            r3.<init>(r7)
            g0.f1$h r3 = r3.a()
            java.lang.String r4 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            ju.n2 r4 = ju.g1.c()
            ju.n2 r4 = r4.getImmediate()
            java.util.concurrent.Executor r4 = ju.v1.a(r4)
            com.withpersona.sdk2.camera.b$e r5 = new com.withpersona.sdk2.camera.b$e
            r5.<init>(r8, r7)
            r2.T0(r3, r4, r5)
        L95:
            java.lang.Object r8 = r8.a()
            java.lang.Object r7 = nt.c.e()
            if (r8 != r7) goto La2
            ot.h.c(r0)
        La2:
            if (r8 != r1) goto La5
            return r1
        La5:
            gt.n r8 = (gt.n) r8
            java.lang.Object r7 = r8.getValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.b.m(oq.c, mt.b):java.lang.Object");
    }
}
