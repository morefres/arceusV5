package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp.a0;
import org.jetbrains.annotations.NotNull;
import wm.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001b\u0015B)\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "Ltr/h;", "Lg/c;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Loq/c;)V", "", "errorMessage", "", "e", "(Ljava/lang/String;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "c", "Landroid/content/Context;", rl.d.f30696a, "Loq/c;", ve.a.f33391e, "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements o<b>, tr.h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<Uri> pictureLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.a$b$a, reason: collision with other inner class name */
        public static final class C0173a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0173a f10200a = new C0173a();

            public C0173a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.a$b$b, reason: collision with other inner class name */
        public static final class C0174b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0174b(@NotNull String absoluteFilePath) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.h<b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f10202a;
        public final /* synthetic */ a b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.a$c$a, reason: collision with other inner class name */
        public static final class C0175a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i f10203a;
            public final /* synthetic */ a b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", f = "DocumentCameraWorker.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            /* renamed from: com.withpersona.sdk2.inquiry.document.a$c$a$a, reason: collision with other inner class name */
            public static final class C0176a extends ot.d {
                public int A;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10204t;

                /* renamed from: u, reason: collision with root package name */
                public int f10205u;

                /* renamed from: v, reason: collision with root package name */
                public Object f10206v;

                /* renamed from: x, reason: collision with root package name */
                public Object f10208x;

                /* renamed from: y, reason: collision with root package name */
                public Object f10209y;

                /* renamed from: z, reason: collision with root package name */
                public Object f10210z;

                public C0176a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f10204t = obj;
                    this.f10205u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C0175a.this.emit(null, this);
                }
            }

            public C0175a(mu.i iVar, a aVar) {
                this.f10203a = iVar;
                this.b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, mt.b r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.document.a.c.C0175a.C0176a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withpersona.sdk2.inquiry.document.a$c$a$a r0 = (com.withpersona.sdk2.inquiry.document.a.c.C0175a.C0176a) r0
                    int r1 = r0.f10205u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10205u = r1
                    goto L18
                L13:
                    com.withpersona.sdk2.inquiry.document.a$c$a$a r0 = new com.withpersona.sdk2.inquiry.document.a$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f10204t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f10205u
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.f10210z
                    mu.i r7 = (mu.i) r7
                    java.lang.Object r7 = r0.f10208x
                    com.withpersona.sdk2.inquiry.document.a$c$a$a r7 = (com.withpersona.sdk2.inquiry.document.a.c.C0175a.C0176a) r7
                    gt.o.b(r8)
                    goto L9d
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    gt.o.b(r8)
                    mu.i r8 = r6.f10203a
                    r2 = r7
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L77
                    com.withpersona.sdk2.inquiry.document.a r2 = r6.b
                    oq.c r2 = com.withpersona.sdk2.inquiry.document.a.d(r2)
                    java.lang.String r4 = "document_camera_photo.jpg"
                    java.io.File r2 = r2.f(r4)
                    com.withpersona.sdk2.inquiry.document.a r4 = r6.b
                    oq.c r4 = com.withpersona.sdk2.inquiry.document.a.d(r4)
                    java.lang.String r5 = "jpg"
                    java.io.File r4 = r4.e(r5)
                    boolean r2 = r2.renameTo(r4)
                    if (r2 == 0) goto L74
                    com.withpersona.sdk2.inquiry.document.a$b$b r2 = new com.withpersona.sdk2.inquiry.document.a$b$b
                    java.lang.String r4 = r4.getAbsolutePath()
                    java.lang.String r5 = "getAbsolutePath(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                    r2.<init>(r4)
                    goto L79
                L74:
                    com.withpersona.sdk2.inquiry.document.a$b$a r2 = com.withpersona.sdk2.inquiry.document.a.b.C0173a.f10200a
                    goto L79
                L77:
                    com.withpersona.sdk2.inquiry.document.a$b$a r2 = com.withpersona.sdk2.inquiry.document.a.b.C0173a.f10200a
                L79:
                    java.lang.Object r4 = ot.l.a(r7)
                    r0.f10206v = r4
                    java.lang.Object r4 = ot.l.a(r0)
                    r0.f10208x = r4
                    java.lang.Object r7 = ot.l.a(r7)
                    r0.f10209y = r7
                    java.lang.Object r7 = ot.l.a(r8)
                    r0.f10210z = r7
                    r7 = 0
                    r0.A = r7
                    r0.f10205u = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L9d
                    return r1
                L9d:
                    kotlin.Unit r7 = kotlin.Unit.f22894a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.a.c.C0175a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public c(mu.h hVar, a aVar) {
            this.f10202a = hVar;
            this.b = aVar;
        }

        @Override // mu.h
        public Object collect(mu.i<? super b> iVar, mt.b bVar) {
            Object collect = this.f10202a.collect(new C0175a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    public a(@NotNull g.c<Uri> pictureLauncher, @NotNull Context context, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(pictureLauncher, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    public final boolean e(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.f("document_camera_photo.jpg"));
            g.c<Uri> cVar = this.pictureLauncher;
            Intrinsics.checkNotNull(uriForFile);
            cVar.b(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return new c(new a0(), this);
    }
}
