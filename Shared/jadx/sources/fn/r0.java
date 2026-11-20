package fn;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import dn.AudioConfiguration;
import dn.w0;
import java.io.File;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u0011\u0010>\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b5\u0010=¨\u0006?"}, d2 = {"Lfn/r0;", "", "Landroid/content/Context;", "context", "Lfn/h0;", "cameraChoice", "", "fps", "orientationHint", "", "recordAudio", "<init>", "(Landroid/content/Context;Lfn/h0;IIZ)V", "", "p", "(Lmt/b;)Ljava/lang/Object;", "Ljava/io/File;", "q", "h", "m", "()V", "isInitialPrepare", "n", "(Z)V", "l", "j", "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "k", "()Landroid/media/MediaRecorder;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lfn/h0;", "c", "I", rl.d.f30696a, "e", "Z", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getOnSurfaceChanged", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "onSurfaceChanged", "Landroid/view/Surface;", "g", "Landroid/view/Surface;", "_surface", "Ljava/io/File;", "currentFile", "i", "Landroid/media/MediaRecorder;", "mediaRecorder", "isPrepared", "isDestroyed", "Ltu/a;", "Ltu/a;", "mutex", "()Landroid/view/Surface;", "surface", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f17395n = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int fps;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int orientationHint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean recordAudio;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onSurfaceChanged;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Surface _surface;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public File currentFile;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MediaRecorder mediaRecorder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isPrepared;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isDestroyed;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a mutex;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper", f = "MediaRecorderWrapper.kt", l = {212}, m = "destroy")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f17407t;

        /* renamed from: u, reason: collision with root package name */
        public int f17408u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f17409v;

        /* renamed from: x, reason: collision with root package name */
        public int f17411x;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17409v = obj;
            this.f17411x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return r0.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", f = "MediaRecorderWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17412t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return r0.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f17412t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                r0.this.mediaRecorder.start();
            } catch (IllegalStateException unused) {
                r0.this.mediaRecorder.reset();
                r0.this.l(false);
                r0.this.mediaRecorder.start();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ljava/io/File;", "<anonymous>", "(Lju/p0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", f = "MediaRecorderWrapper.kt", l = {212}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super File>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f17414t;

        /* renamed from: u, reason: collision with root package name */
        public Object f17415u;

        /* renamed from: v, reason: collision with root package name */
        public int f17416v;

        /* renamed from: w, reason: collision with root package name */
        public int f17417w;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return r0.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            tu.a aVar;
            r0 r0Var;
            File file;
            Object e10 = nt.c.e();
            int i10 = this.f17417w;
            if (i10 == 0) {
                gt.o.b(obj);
                aVar = r0.this.mutex;
                r0 r0Var2 = r0.this;
                this.f17414t = aVar;
                this.f17415u = r0Var2;
                this.f17416v = 0;
                this.f17417w = 1;
                if (aVar.c(null, this) == e10) {
                    return e10;
                }
                r0Var = r0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (r0) this.f17415u;
                aVar = (tu.a) this.f17414t;
                gt.o.b(obj);
            }
            try {
                if (r0Var.isDestroyed) {
                    return null;
                }
                try {
                    r0Var.mediaRecorder.stop();
                    file = r0Var.currentFile;
                } catch (RuntimeException unused) {
                    r0Var.currentFile.delete();
                    file = null;
                }
                r0Var.mediaRecorder.release();
                if (r0Var.isDestroyed) {
                    return file;
                }
                r0Var.mediaRecorder = r0Var.k();
                r0Var.l(false);
                return file;
            } finally {
                aVar.f(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super File> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public r0(@NotNull Context context, @NotNull h0 cameraChoice, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i10;
        this.orientationHint = i11;
        this.recordAudio = z10;
        this._surface = f17395n ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = j();
        this.mediaRecorder = k();
        this.mutex = tu.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:11:0x0051, B:13:0x0055, B:17:0x005d), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:11:0x0051, B:13:0x0055, B:17:0x005d), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fn.r0.b
            if (r0 == 0) goto L13
            r0 = r6
            fn.r0$b r0 = (fn.r0.b) r0
            int r1 = r0.f17411x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17411x = r1
            goto L18
        L13:
            fn.r0$b r0 = new fn.r0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17409v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17411x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f17407t
            tu.a r0 = (tu.a) r0
            gt.o.b(r6)
            goto L51
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            gt.o.b(r6)
            boolean r6 = r5.isDestroyed
            if (r6 == 0) goto L40
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L40:
            tu.a r6 = r5.mutex
            r0.f17407t = r6
            r2 = 0
            r0.f17408u = r2
            r0.f17411x = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r6
        L51:
            boolean r6 = r5.isDestroyed     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L5d
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L5b
            r0.f(r4)
            return r6
        L5b:
            r6 = move-exception
            goto L80
        L5d:
            r5.isDestroyed = r3     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L5b
            r0.f(r4)
            android.view.Surface r6 = r5.i()     // Catch: java.lang.RuntimeException -> L6b
            r6.release()     // Catch: java.lang.RuntimeException -> L6b
        L6b:
            android.media.MediaRecorder r6 = r5.mediaRecorder     // Catch: java.lang.RuntimeException -> L70 java.lang.Throwable -> L76
            r6.stop()     // Catch: java.lang.RuntimeException -> L70 java.lang.Throwable -> L76
        L70:
            java.io.File r6 = r5.currentFile
            r6.delete()
            goto L7d
        L76:
            r6 = move-exception
            java.io.File r0 = r5.currentFile
            r0.delete()
            throw r6
        L7d:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L80:
            r0.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.r0.h(mt.b):java.lang.Object");
    }

    @NotNull
    public final Surface i() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface2, "getSurface(...)");
        return surface2;
    }

    public final File j() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    public final MediaRecorder k() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        q0.a();
        return p0.a(this.context);
    }

    public final void l(boolean isInitialPrepare) {
        if (!isInitialPrepare) {
            this.currentFile = j();
        }
        n(isInitialPrepare);
    }

    public final void m() {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        l(true);
    }

    public final void n(boolean isInitialPrepare) {
        Function0<Unit> function0;
        this.mediaRecorder.setVideoSource(2);
        if (this.recordAudio) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(w0.a(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight()));
        if (this.recordAudio) {
            AudioConfiguration a10 = dn.d.a();
            if (a10 != null) {
                this.mediaRecorder.setAudioSamplingRate(a10.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z10 = f17395n;
        if (z10) {
            this.mediaRecorder.setInputSurface(i());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z10 || isInitialPrepare || (function0 = this.onSurfaceChanged) == null) {
            return;
        }
        function0.invoke();
    }

    public final void o(@Nullable Function0<Unit> function0) {
        this.onSurfaceChanged = function0;
    }

    @Nullable
    public final Object p(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(g1.a(), new c(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    @Nullable
    public final Object q(@NotNull mt.b<? super File> bVar) {
        return ju.i.g(g1.a(), new d(null), bVar);
    }
}
