package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001eB/\b\u0007\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Ltr/h;", "Lg/c;", "", "", "openDocumentLauncher", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Loq/c;)V", "", "g", "()V", "Landroid/net/Uri;", "file", "f", "(Landroid/net/Uri;)Ljava/lang/String;", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "c", "Landroid/content/Context;", rl.d.f30696a, "Loq/c;", ve.a.f33391e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements wm.o<a>, tr.h<a> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<String[]> openDocumentLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "<init>", "()V", "c", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a$a, reason: collision with other inner class name */
        public static final class C0200a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0200a f10938a = new C0200a();

            public C0200a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "()Ljava/lang/String;", j6.b.f21518e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String fileName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull String absoluteFilePath, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
                this.fileName = str;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.h<a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f10941a;
        public final /* synthetic */ e b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i f10942a;
            public final /* synthetic */ e b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", f = "DocumentSelectWorker.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.e$b$a$a, reason: collision with other inner class name */
            public static final class C0201a extends ot.d {
                public int A;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10943t;

                /* renamed from: u, reason: collision with root package name */
                public int f10944u;

                /* renamed from: v, reason: collision with root package name */
                public Object f10945v;

                /* renamed from: x, reason: collision with root package name */
                public Object f10947x;

                /* renamed from: y, reason: collision with root package name */
                public Object f10948y;

                /* renamed from: z, reason: collision with root package name */
                public Object f10949z;

                public C0201a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f10943t = obj;
                    this.f10944u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(mu.i iVar, e eVar) {
                this.f10942a = iVar;
                this.b = eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, mt.b r12) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.e.b.a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public b(mu.h hVar, e eVar) {
            this.f10941a = hVar;
            this.b = eVar;
        }

        @Override // mu.h
        public Object collect(mu.i<? super a> iVar, mt.b bVar) {
            Object collect = this.f10941a.collect(new a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    public e(@NotNull g.c<String[]> openDocumentLauncher, @NotNull Context context, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
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
    public boolean c(@NotNull wm.o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Nullable
    public final String f(@NotNull Uri file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Cursor query = this.context.getContentResolver().query(file, null, null, null, null);
        if (query != null) {
            query.moveToFirst();
        }
        String string = query != null ? query.getString(Math.max(query.getColumnIndex("_display_name"), 0)) : null;
        if (query != null) {
            query.close();
        }
        return string;
    }

    public final void g() {
        this.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<a> run() {
        return mu.j.y(new b(new u(), this), g1.b());
    }
}
