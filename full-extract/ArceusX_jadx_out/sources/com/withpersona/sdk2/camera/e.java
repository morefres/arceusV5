package com.withpersona.sdk2.camera;

import android.content.Context;
import android.view.View;
import android.view.e0;
import androidx.camera.view.PreviewView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.d;
import dn.d0;
import dn.s;
import gt.n;
import gt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import mu.p0;
import mu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010-R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000202058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u00106R\u0014\u0010:\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00109R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010;¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/camera/e;", "Ldn/g;", "Landroid/content/Context;", "context", "Ljn/a;", "cameraStatsManager", "Loq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Ldn/s;", "cameraXBinder", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Ljn/a;Loq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)V", "", "j", "()V", "destroy", "enable", "c", "(Z)V", "g", "Lgt/n;", "Ljava/io/File;", rl.d.f30696a, "(Lmt/b;)Ljava/lang/Object;", "f", "k", "enableAnalyzer", "h", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Ljn/a;", "Loq/c;", "Lcom/withpersona/sdk2/camera/b;", "e", "Landroidx/camera/view/PreviewView;", "n", "()Landroidx/camera/view/PreviewView;", "Ldn/s;", "Z", "isBound", "i", "recordingStarted", "Lmu/c0;", "Lcom/withpersona/sdk2/camera/d;", "Lmu/c0;", "_previewState", "Lmu/p0;", "()Lmu/p0;", "cameraState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements dn.g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PreviewView previewView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s cameraXBinder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isBound;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public volatile boolean recordingStarted;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c0<com.withpersona.sdk2.camera.d> _previewState;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/camera/e$a;", "", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Ldn/s;", "cameraXBinder", "", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e;", ve.a.f33391e, "(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Ldn/s;Z)Lcom/withpersona/sdk2/camera/e;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        e a(@NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull PreviewView previewView, @NotNull s cameraXBinder, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/e$b", "Landroidx/lifecycle/e0;", "Landroidx/camera/view/PreviewView$e;", "value", "", j6.b.f21518e, "(Landroidx/camera/view/PreviewView$e;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements e0<PreviewView.e> {
        public b() {
        }

        @Override // android.view.e0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PreviewView.e value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value == PreviewView.e.STREAMING) {
                e.this._previewState.setValue(new d.Ready(true));
                e.this.e().getPreviewStreamState().n(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/withpersona/sdk2/camera/e$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            e.this.cameraStatsManager.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            e.this.cameraStatsManager.c();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {113}, m = "stopVideo-IoAF18A")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10008t;

        /* renamed from: v, reason: collision with root package name */
        public int f10010v;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10008t = obj;
            this.f10010v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object k10 = e.this.k(this);
            return k10 == nt.c.e() ? k10 : n.a(k10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", l = {97}, m = "takePicture-IoAF18A")
    /* renamed from: com.withpersona.sdk2.camera.e$e, reason: collision with other inner class name */
    public static final class C0168e extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10011t;

        /* renamed from: v, reason: collision with root package name */
        public int f10013v;

        public C0168e(mt.b<? super C0168e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10011t = obj;
            this.f10013v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object d10 = e.this.d(this);
            return d10 == nt.c.e() ? d10 : n.a(d10);
        }
    }

    public e(@NotNull Context context, @NotNull jn.a cameraStatsManager, @NotNull oq.c sdkFilesManager, @NotNull com.withpersona.sdk2.camera.b cameraPreview, @NotNull PreviewView previewView, @NotNull s cameraXBinder, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraXBinder, "cameraXBinder");
        this.context = context;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = cameraXBinder;
        this.isAudioRequired = z10;
        this._previewState = r0.a(d.c.f9994a);
    }

    @Override // dn.g
    @NotNull
    public CameraProperties a() {
        return this.cameraPreview.e();
    }

    @Override // dn.g
    @NotNull
    public p0<com.withpersona.sdk2.camera.d> b() {
        return this._previewState;
    }

    @Override // dn.g
    public void c(boolean enable) {
        this.cameraPreview.c(enable);
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
            boolean r0 = r5 instanceof com.withpersona.sdk2.camera.e.C0168e
            if (r0 == 0) goto L13
            r0 = r5
            com.withpersona.sdk2.camera.e$e r0 = (com.withpersona.sdk2.camera.e.C0168e) r0
            int r1 = r0.f10013v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10013v = r1
            goto L18
        L13:
            com.withpersona.sdk2.camera.e$e r0 = new com.withpersona.sdk2.camera.e$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10011t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f10013v
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
            com.withpersona.sdk2.camera.b r5 = r4.cameraPreview
            oq.c r2 = r4.sdkFilesManager
            r0.f10013v = r3
            java.lang.Object r5 = r5.m(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.e.d(mt.b):java.lang.Object");
    }

    @Override // dn.g
    public void destroy() {
    }

    @Override // dn.g
    @Nullable
    public Object f(@NotNull mt.b<? super n<Boolean>> bVar) {
        if (this.recordingStarted) {
            n.Companion companion = n.INSTANCE;
            return n.b(ot.b.a(false));
        }
        try {
            boolean k10 = this.cameraPreview.k(this.context, this.isAudioRequired);
            if (k10) {
                this.recordingStarted = true;
            }
            n.Companion companion2 = n.INSTANCE;
            return n.b(ot.b.a(k10));
        } catch (d0 e10) {
            n.Companion companion3 = n.INSTANCE;
            return n.b(o.a(e10));
        }
    }

    @Override // dn.g
    public void g() {
        this.cameraPreview.d(e());
    }

    @Override // dn.g
    public void h(boolean enableAnalyzer) {
    }

    @Override // dn.g
    /* renamed from: i, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingStarted;
    }

    @Override // dn.g
    public void j() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(d.C0167d.f9995a);
        this.isBound = true;
        this.cameraXBinder.a();
        e().getPreviewStreamState().j(new b());
        if (e().isAttachedToWindow()) {
            this.cameraStatsManager.d();
        }
        e().addOnAttachStateChangeListener(new c());
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
            boolean r0 = r5 instanceof com.withpersona.sdk2.camera.e.d
            if (r0 == 0) goto L13
            r0 = r5
            com.withpersona.sdk2.camera.e$d r0 = (com.withpersona.sdk2.camera.e.d) r0
            int r1 = r0.f10010v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10010v = r1
            goto L18
        L13:
            com.withpersona.sdk2.camera.e$d r0 = new com.withpersona.sdk2.camera.e$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10008t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f10010v
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
            boolean r5 = r4.recordingStarted
            if (r5 != 0) goto L4e
            gt.n$a r5 = gt.n.INSTANCE
            dn.h0 r5 = new dn.h0
            r5.<init>()
            java.lang.Object r5 = gt.o.a(r5)
            java.lang.Object r5 = gt.n.b(r5)
            return r5
        L4e:
            r5 = 0
            r4.recordingStarted = r5
            com.withpersona.sdk2.camera.b r5 = r4.cameraPreview
            r0.f10010v = r3
            java.lang.Object r5 = r5.l(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.e.k(mt.b):java.lang.Object");
    }

    @Override // dn.g
    @NotNull
    /* renamed from: n, reason: from getter and merged with bridge method [inline-methods] */
    public PreviewView getPreviewView() {
        return this.previewView;
    }
}
