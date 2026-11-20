package com.withpersona.sdk2.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import dn.d0;
import dn.v;
import f1.b2;
import f1.e1;
import f1.r;
import f1.r0;
import f1.w;
import gt.n;
import gt.o;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0003\u0013\u0011\u0015B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/camera/h;", "", "Landroid/content/Context;", "context", "Lf1/r0;", "recorder", "Loq/c;", "sdkFilesManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lf1/r0;Loq/c;Z)V", "Lgt/n;", "Ljava/io/File;", "e", "(Lmt/b;)Ljava/lang/Object;", "", "c", "()V", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lf1/r0;", "Loq/c;", rl.d.f30696a, "Z", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "recordingExecutor", "Lmu/c0;", "Lcom/withpersona/sdk2/camera/h$c;", "f", "Lmu/c0;", "videoStateFlow", "Lcom/withpersona/sdk2/camera/h$b;", "g", "Lcom/withpersona/sdk2/camera/h$b;", "currentSession", "h", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final r0 recorder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor recordingExecutor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<c> videoStateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b currentSession;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/camera/h$a;", "", "<init>", "()V", "Lf1/r0;", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "", "isAudioRequired", "Lcom/withpersona/sdk2/camera/h;", ve.a.f33391e, "(Lf1/r0;Landroid/content/Context;Loq/c;Z)Lcom/withpersona/sdk2/camera/h;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a(@NotNull r0 r0Var, @NotNull Context context, @NotNull oq.c sdkFilesManager, boolean z10) {
            Intrinsics.checkNotNullParameter(r0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            h hVar = new h(context, r0Var, sdkFilesManager, z10);
            hVar.c();
            return hVar;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/camera/h$b;", "", "Lf1/e1;", "recording", "Ljava/io/File;", "outputFile", "<init>", "(Lf1/e1;Ljava/io/File;)V", "", ve.a.f33391e, "()V", "e", "Lf1/e1;", "getRecording", "()Lf1/e1;", j6.b.f21518e, "Ljava/io/File;", "c", "()Ljava/io/File;", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", rl.d.f30696a, "(Ljava/lang/Throwable;)V", "error", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e1 recording;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final File outputFile;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Throwable error;

        public b(@NotNull e1 recording, @NotNull File outputFile) {
            Intrinsics.checkNotNullParameter(recording, "recording");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            this.recording = recording;
            this.outputFile = outputFile;
        }

        public final void a() {
            this.recording.close();
        }

        @Nullable
        /* renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final File getOutputFile() {
            return this.outputFile;
        }

        public final void d(@Nullable Throwable th2) {
            this.error = th2;
        }

        public final void e() {
            this.recording.e();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/h$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10025a = new c("NotStarted", 0);
        public static final c b = new c("Started", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f10026c = new c("Finalized", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f10027d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f10028e;

        static {
            c[] a10 = a();
            f10027d = a10;
            f10028e = pt.b.a(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f10025a, b, f10026c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f10027d.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.RecordingHelper", f = "RecordingHelper.kt", l = {87}, m = "stop-IoAF18A")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f10029t;

        /* renamed from: u, reason: collision with root package name */
        public Object f10030u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10031v;

        /* renamed from: x, reason: collision with root package name */
        public int f10033x;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10031v = obj;
            this.f10033x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object e10 = h.this.e(this);
            return e10 == nt.c.e() ? e10 : n.a(e10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/h$c;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/h$c;)Z"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.RecordingHelper$stop$2", f = "RecordingHelper.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function2<c, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10034t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10035u;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = new e(bVar);
            eVar.f10035u = obj;
            return eVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.f10035u;
            nt.c.e();
            if (this.f10034t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ot.b.a(cVar != c.f10026c);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, mt.b<? super Boolean> bVar) {
            return ((e) create(cVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public h(@NotNull Context context, @NotNull r0 recorder, @NotNull oq.c sdkFilesManager, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.context = context;
        this.recorder = recorder;
        this.sdkFilesManager = sdkFilesManager;
        this.isAudioRequired = z10;
        Executor i10 = l2.b.i(context);
        Intrinsics.checkNotNullExpressionValue(i10, "getMainExecutor(...)");
        this.recordingExecutor = i10;
        this.videoStateFlow = mu.r0.a(c.f10025a);
    }

    public static final void d(h hVar, b2 event) {
        File outputFile;
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = hVar.currentSession;
        if (event instanceof b2.d) {
            hVar.videoStateFlow.setValue(c.b);
            return;
        }
        if (event instanceof b2.a) {
            b2.a aVar = (b2.a) event;
            if (aVar.k()) {
                if (bVar != null) {
                    bVar.d(new v("Recording completed with error code " + aVar.j(), aVar.i()));
                }
                if (bVar != null && (outputFile = bVar.getOutputFile()) != null) {
                    outputFile.delete();
                }
            }
            if (bVar != null) {
                bVar.a();
            }
            hVar.currentSession = null;
            hVar.videoStateFlow.setValue(c.f10026c);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void c() {
        if (this.currentSession != null) {
            return;
        }
        File e10 = this.sdkFilesManager.e("mp4");
        boolean z10 = l2.g.b(this.context, "android.permission.RECORD_AUDIO") == 0;
        if (this.isAudioRequired && !z10) {
            throw new d0();
        }
        w d02 = this.recorder.d0(this.context, new r.a(e10).a());
        if (this.isAudioRequired && z10) {
            d02.j();
        }
        Intrinsics.checkNotNullExpressionValue(d02, "apply(...)");
        e1 i10 = d02.i(this.recordingExecutor, new x2.a() { // from class: dn.k0
            @Override // x2.a
            public final void accept(Object obj) {
                com.withpersona.sdk2.camera.h.d(com.withpersona.sdk2.camera.h.this, (b2) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(i10, "start(...)");
        this.currentSession = new b(i10, e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.camera.h.d
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.camera.h$d r0 = (com.withpersona.sdk2.camera.h.d) r0
            int r1 = r0.f10033x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10033x = r1
            goto L18
        L13:
            com.withpersona.sdk2.camera.h$d r0 = new com.withpersona.sdk2.camera.h$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10031v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f10033x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f10030u
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r0.f10029t
            com.withpersona.sdk2.camera.h$b r0 = (com.withpersona.sdk2.camera.h.b) r0
            gt.o.b(r8)
            goto L72
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            gt.o.b(r8)
            com.withpersona.sdk2.camera.h$b r8 = r7.currentSession
            if (r8 != 0) goto L50
            gt.n$a r8 = gt.n.INSTANCE
            dn.h0 r8 = new dn.h0
            r8.<init>()
            java.lang.Object r8 = gt.o.a(r8)
            java.lang.Object r8 = gt.n.b(r8)
            return r8
        L50:
            java.io.File r2 = r8.getOutputFile()
            r8.e()
            mu.c0<com.withpersona.sdk2.camera.h$c> r4 = r7.videoStateFlow
            com.withpersona.sdk2.camera.h$e r5 = new com.withpersona.sdk2.camera.h$e
            r6 = 0
            r5.<init>(r6)
            mu.h r4 = mu.j.N(r4, r5)
            r0.f10029t = r8
            r0.f10030u = r2
            r0.f10033x = r3
            java.lang.Object r0 = mu.j.i(r4, r0)
            if (r0 != r1) goto L70
            return r1
        L70:
            r0 = r8
            r1 = r2
        L72:
            java.lang.Throwable r8 = r0.getError()
            if (r8 == 0) goto L83
            gt.n$a r0 = gt.n.INSTANCE
            java.lang.Object r8 = gt.o.a(r8)
            java.lang.Object r8 = gt.n.b(r8)
            return r8
        L83:
            java.lang.Object r8 = gt.n.b(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.h.e(mt.b):java.lang.Object");
    }
}
