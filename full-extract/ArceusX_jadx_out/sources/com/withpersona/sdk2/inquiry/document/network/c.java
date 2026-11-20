package com.withpersona.sdk2.inquiry.document.network;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import hq.k;
import iv.x;
import java.io.File;
import java.util.List;
import ju.a0;
import ju.g1;
import ju.h2;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import wm.o;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002!\u0014B9\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", NotificationCompat.CATEGORY_SERVICE, "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "Lhq/k;", "fileHelper", "", "isSingleFileLimit", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lhq/k;Z)V", "otherWorker", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "n", "(Lmt/b;)Ljava/lang/Object;", "documentFileId", "", "m", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Ljava/lang/String;", "Lzn/c;", rl.d.f30696a, "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "f", "Lhq/k;", "g", "Z", "Lju/p0;", "h", "Lju/p0;", "serviceCoroutineScope", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements o<b>, tr.h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.c service;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentFile.Local localDocument;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileHelper;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isSingleFileLimit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceCoroutineScope;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "", "Lzn/c;", NotificationCompat.CATEGORY_SERVICE, "Lhq/k;", "fileHelper", "<init>", "(Lzn/c;Lhq/k;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "", "isSingleFileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/c;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lzn/c;", j6.b.f21518e, "Lhq/k;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final k fileHelper;

        public a(@NotNull zn.c service, @NotNull k fileHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        @NotNull
        public final c a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Local localDocument, boolean isSingleFileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new c(sessionToken, this.service, documentId, localDocument, this.fileHelper, isSingleFileLimit, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<init>", "()V", rl.d.f30696a, "c", ve.a.f33391e, j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$b, reason: collision with other inner class name */
        public static final class C0187b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0187b(@NotNull InternalErrorInfo cause) {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "progressPercentage", "<init>", "(I)V", ve.a.f33391e, "I", "()I", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$c, reason: collision with other inner class name */
        public static final class C0188c extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int progressPercentage;

            public C0188c(int i10) {
                super(null);
                this.progressPercentage = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "oldLocalDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "newRemoteDocument", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", j6.b.f21518e, "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final DocumentFile.Local oldLocalDocument;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final DocumentFile.Remote newRemoteDocument;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull DocumentFile.Local oldLocalDocument, @NotNull DocumentFile.Remote newRemoteDocument) {
                super(null);
                Intrinsics.checkNotNullParameter(oldLocalDocument, "oldLocalDocument");
                Intrinsics.checkNotNullParameter(newRemoteDocument, "newRemoteDocument");
                this.oldLocalDocument = oldLocalDocument;
                this.newRemoteDocument = newRemoteDocument;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final DocumentFile.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final DocumentFile.Local getOldLocalDocument() {
                return this.oldLocalDocument;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Liv/x;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$deleteFile$2", f = "DocumentFileUploadWorker.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$c, reason: collision with other inner class name */
    public static final class C0189c extends m implements Function1<mt.b<? super x<?>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10345t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10347v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0189c(String str, mt.b<? super C0189c> bVar) {
            super(1, bVar);
            this.f10347v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return c.this.new C0189c(this.f10347v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f10345t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            zn.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = this.f10347v;
            this.f10345t = 1;
            Object e11 = cVar.e(str, str2, this);
            return e11 == e10 ? e10 : e11;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super x<?>> bVar) {
            return ((C0189c) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker", f = "DocumentFileUploadWorker.kt", l = {191}, m = "fetchCurrentDocuments")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10348t;

        /* renamed from: v, reason: collision with root package name */
        public int f10350v;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10348t = obj;
            this.f10350v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$fetchCurrentDocuments$result$1", f = "DocumentFileUploadWorker.kt", l = {192}, m = "invokeSuspend")
    public static final class e extends m implements Function1<mt.b<? super x<CreateDocumentResponse>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10351t;

        public e(mt.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f10351t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            zn.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = c.this.documentId;
            this.f10351t = 1;
            Object c10 = cVar.c(str, str2, this);
            return c10 == e10 ? e10 : c10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super x<CreateDocumentResponse>> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", f = "DocumentFileUploadWorker.kt", l = {66, 69, 177}, m = "invokeSuspend")
    public static final class f extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f10353t;

        /* renamed from: u, reason: collision with root package name */
        public Object f10354u;

        /* renamed from: v, reason: collision with root package name */
        public Object f10355v;

        /* renamed from: w, reason: collision with root package name */
        public Object f10356w;

        /* renamed from: x, reason: collision with root package name */
        public Object f10357x;

        /* renamed from: y, reason: collision with root package name */
        public int f10358y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f10359z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<b> f10360a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", f = "DocumentFileUploadWorker.kt", l = {178}, m = "emit")
            /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$a$a, reason: collision with other inner class name */
            public static final class C0190a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public Object f10361t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f10362u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ a<T> f10363v;

                /* renamed from: w, reason: collision with root package name */
                public int f10364w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0190a(a<? super T> aVar, mt.b<? super C0190a> bVar) {
                    super(bVar);
                    this.f10363v = aVar;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f10362u = obj;
                    this.f10364w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f10363v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super b> iVar) {
                this.f10360a = iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.withpersona.sdk2.inquiry.document.network.c.b r5, mt.b<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withpersona.sdk2.inquiry.document.network.c.f.a.C0190a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withpersona.sdk2.inquiry.document.network.c$f$a$a r0 = (com.withpersona.sdk2.inquiry.document.network.c.f.a.C0190a) r0
                    int r1 = r0.f10364w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10364w = r1
                    goto L18
                L13:
                    com.withpersona.sdk2.inquiry.document.network.c$f$a$a r0 = new com.withpersona.sdk2.inquiry.document.network.c$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f10362u
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f10364w
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f10361t
                    com.withpersona.sdk2.inquiry.document.network.c$b r5 = (com.withpersona.sdk2.inquiry.document.network.c.b) r5
                    gt.o.b(r6)
                    goto L45
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    gt.o.b(r6)
                    mu.i<com.withpersona.sdk2.inquiry.document.network.c$b> r6 = r4.f10360a
                    r0.f10361t = r5
                    r0.f10364w = r3
                    java.lang.Object r6 = r6.emit(r5, r0)
                    if (r6 != r1) goto L45
                    return r1
                L45:
                    boolean r6 = r5 instanceof com.withpersona.sdk2.inquiry.document.network.c.b.a
                    if (r6 != 0) goto L4d
                    boolean r5 = r5 instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0187b
                    if (r5 == 0) goto L55
                L4d:
                    kotlin.coroutines.CoroutineContext r5 = r0.getContext()
                    r6 = 0
                    ju.g2.d(r5, r6, r3, r6)
                L55:
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.a.emit(com.withpersona.sdk2.inquiry.document.network.c$b, mt.b):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", f = "DocumentFileUploadWorker.kt", l = {169, 173}, m = "invokeSuspend")
        public static final class b extends m implements Function2<i<? super b.C0188c>, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f10365t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f10366u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ zn.d f10367v;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", f = "DocumentFileUploadWorker.kt", l = {}, m = "invokeSuspend")
            public static final class a extends m implements Function2<Integer, mt.b<? super Boolean>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f10368t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ int f10369u;

                public a(mt.b<? super a> bVar) {
                    super(2, bVar);
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    a aVar = new a(bVar);
                    aVar.f10369u = ((Number) obj).intValue();
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, mt.b<? super Boolean> bVar) {
                    return o(num.intValue(), bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    int i10 = this.f10369u;
                    nt.c.e();
                    if (this.f10368t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return ot.b.a(i10 < 100);
                }

                public final Object o(int i10, mt.b<? super Boolean> bVar) {
                    return ((a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b$b, reason: collision with other inner class name */
            public static final class C0191b<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i<b.C0188c> f10370a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0191b(i<? super b.C0188c> iVar) {
                    this.f10370a = iVar;
                }

                public final Object b(int i10, mt.b<? super Unit> bVar) {
                    Object emit = this.f10370a.emit(new b.C0188c(i10), bVar);
                    return emit == nt.c.e() ? emit : Unit.f22894a;
                }

                @Override // mu.i
                public /* bridge */ /* synthetic */ Object emit(Object obj, mt.b bVar) {
                    return b(((Number) obj).intValue(), bVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zn.d dVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f10367v = dVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                b bVar2 = new b(this.f10367v, bVar);
                bVar2.f10366u = obj;
                return bVar2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
            
                if (r0.emit(r7, r6) == r1) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
            
                if (r7.collect(r2, r6) == r1) goto L15;
             */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.f10366u
                    mu.i r0 = (mu.i) r0
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r6.f10365t
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L22
                    if (r2 == r4) goto L1e
                    if (r2 != r3) goto L16
                    gt.o.b(r7)
                    goto L5b
                L16:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1e:
                    gt.o.b(r7)
                    goto L45
                L22:
                    gt.o.b(r7)
                    zn.d r7 = r6.f10367v
                    mu.p0 r7 = r7.a()
                    com.withpersona.sdk2.inquiry.document.network.c$f$b$a r2 = new com.withpersona.sdk2.inquiry.document.network.c$f$b$a
                    r5 = 0
                    r2.<init>(r5)
                    mu.h r7 = mu.j.N(r7, r2)
                    com.withpersona.sdk2.inquiry.document.network.c$f$b$b r2 = new com.withpersona.sdk2.inquiry.document.network.c$f$b$b
                    r2.<init>(r0)
                    r6.f10366u = r0
                    r6.f10365t = r4
                    java.lang.Object r7 = r7.collect(r2, r6)
                    if (r7 != r1) goto L45
                    goto L5a
                L45:
                    com.withpersona.sdk2.inquiry.document.network.c$b$c r7 = new com.withpersona.sdk2.inquiry.document.network.c$b$c
                    r2 = 100
                    r7.<init>(r2)
                    java.lang.Object r2 = ot.l.a(r0)
                    r6.f10366u = r2
                    r6.f10365t = r3
                    java.lang.Object r7 = r0.emit(r7, r6)
                    if (r7 != r1) goto L5b
                L5a:
                    return r1
                L5b:
                    kotlin.Unit r7 = kotlin.Unit.f22894a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b.C0188c> iVar, mt.b<? super Unit> bVar) {
                return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "(Lju/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", f = "DocumentFileUploadWorker.kt", l = {80}, m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c, reason: collision with other inner class name */
        public static final class C0192c extends m implements Function2<p0, mt.b<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f10371t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f10372u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ zn.d f10373v;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", f = "DocumentFileUploadWorker.kt", l = {81}, m = "invokeSuspend")
            /* renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c$a */
            public static final class a extends m implements Function1<mt.b<? super x<DocumentFileUploadResponse>>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f10374t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ c f10375u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ zn.d f10376v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(c cVar, zn.d dVar, mt.b<? super a> bVar) {
                    super(1, bVar);
                    this.f10375u = cVar;
                    this.f10376v = dVar;
                }

                @Override // ot.a
                public final mt.b<Unit> create(mt.b<?> bVar) {
                    return new a(this.f10375u, this.f10376v, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    Object e10 = nt.c.e();
                    int i10 = this.f10374t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        return obj;
                    }
                    gt.o.b(obj);
                    zn.c cVar = this.f10375u.service;
                    String str = this.f10375u.sessionToken;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    MultipartBody.Part createFormData = companion.createFormData("data[type]", "document-file");
                    MultipartBody.Part createFormData2 = companion.createFormData("data[attributes][document-id]", this.f10375u.documentId);
                    MultipartBody.Part createFormData3 = companion.createFormData("data[attributes][capture-method]", this.f10375u.localDocument.getCaptureMethod().getType());
                    MultipartBody.Part createFormData4 = companion.createFormData("data[attributes][originals][]", this.f10375u.localDocument.getAbsoluteFilePath(), this.f10376v);
                    String name = new File(this.f10375u.localDocument.getAbsoluteFilePath()).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    List<MultipartBody.Part> n10 = p.n(createFormData, createFormData2, createFormData3, createFormData4, companion.createFormData("data[attributes][name]", name));
                    this.f10374t = 1;
                    Object a10 = cVar.a(str, n10, this);
                    return a10 == e10 ? e10 : a10;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(mt.b<? super x<DocumentFileUploadResponse>> bVar) {
                    return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192c(c cVar, zn.d dVar, mt.b<? super C0192c> bVar) {
                super(2, bVar);
                this.f10372u = cVar;
                this.f10373v = dVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0192c(this.f10372u, this.f10373v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f10371t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                a aVar = new a(this.f10372u, this.f10373v, null);
                this.f10371t = 1;
                Object enqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                return enqueueVerificationRequestWithRetry == e10 ? e10 : enqueueVerificationRequestWithRetry;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super NetworkCallResult<DocumentFileUploadResponse>> bVar) {
                return ((C0192c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", f = "DocumentFileUploadWorker.kt", l = {106, 110, 122, 147, 149, 156, 162}, m = "invokeSuspend")
        public static final class d extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {
            public final /* synthetic */ w0<NetworkCallResult<DocumentFileUploadResponse>> A;
            public final /* synthetic */ c B;

            /* renamed from: t, reason: collision with root package name */
            public Object f10377t;

            /* renamed from: u, reason: collision with root package name */
            public Object f10378u;

            /* renamed from: v, reason: collision with root package name */
            public Object f10379v;

            /* renamed from: w, reason: collision with root package name */
            public int f10380w;

            /* renamed from: x, reason: collision with root package name */
            public int f10381x;

            /* renamed from: y, reason: collision with root package name */
            public int f10382y;

            /* renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f10383z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(w0<? extends NetworkCallResult<DocumentFileUploadResponse>> w0Var, c cVar, mt.b<? super d> bVar) {
                super(2, bVar);
                this.A = w0Var;
                this.B = cVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                d dVar = new d(this.A, this.B, bVar);
                dVar.f10383z = obj;
                return dVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0172, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x01fc, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x01a4, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x01d7, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x01fa, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
            
                if (r0.emit(r7, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
            
                if (r0.emit(r14, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x004b, code lost:
            
                if (r14 == r1) goto L57;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 532
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
                return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            f fVar = c.this.new f(bVar);
            fVar.f10359z = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x012c, code lost:
        
            if (r5.collect(r6, r16) == r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x012e, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        
            if (r8.m(r9, r16) == r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        
            if (r7 == r2) goto L27;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ c(String str, zn.c cVar, String str2, DocumentFile.Local local, k kVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, local, kVar, z10);
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    public final Object m(String str, mt.b<? super Unit> bVar) {
        Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(new C0189c(str, null), bVar);
        return enqueueRetriableRequestWithRetry == nt.c.e() ? enqueueRetriableRequestWithRetry : Unit.f22894a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(mt.b<? super java.util.List<com.withpersona.sdk2.inquiry.document.network.DocumentFileData>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withpersona.sdk2.inquiry.document.network.c.d
            if (r0 == 0) goto L13
            r0 = r6
            com.withpersona.sdk2.inquiry.document.network.c$d r0 = (com.withpersona.sdk2.inquiry.document.network.c.d) r0
            int r1 = r0.f10350v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10350v = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.document.network.c$d r0 = new com.withpersona.sdk2.inquiry.document.network.c$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10348t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f10350v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            gt.o.b(r6)
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            gt.o.b(r6)
            com.withpersona.sdk2.inquiry.document.network.c$e r6 = new com.withpersona.sdk2.inquiry.document.network.c$e
            r6.<init>(r4)
            r0.f10350v = r3
            java.lang.Object r6 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueRetriableRequestWithRetry(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r6
            boolean r0 = r6 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
            if (r0 == 0) goto L4a
            return r4
        L4a:
            boolean r0 = r6 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
            if (r0 == 0) goto L5e
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r6
            java.lang.Object r6 = r6.getResponse()
            com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse r6 = (com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse) r6
            if (r6 == 0) goto L5d
            java.util.List r6 = r6.b()
            return r6
        L5d:
            return r4
        L5e:
            gt.l r6 = new gt.l
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.n(mt.b):java.lang.Object");
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return j.w(new f(null));
    }

    public c(String str, zn.c cVar, String str2, DocumentFile.Local local, k kVar, boolean z10) {
        a0 b10;
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = kVar;
        this.isSingleFileLimit = z10;
        l0 a10 = g1.a();
        b10 = h2.b(null, 1, null);
        this.serviceCoroutineScope = q0.a(a10.plus(b10));
    }
}
