package zn;

import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import iv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u0011B)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lzn/a;", "Lwm/o;", "Lzn/a$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", NotificationCompat.CATEGORY_SERVICE, "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Ljava/lang/String;", "Lzn/c;", rl.d.f30696a, "getDocumentId", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements o<b>, h<b> {

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
    public final DocumentFile.Remote remoteDocument;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzn/a$a;", "", "Lzn/c;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lzn/c;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "Lzn/a;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lzn/a;", "Lzn/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: zn.a$a, reason: collision with other inner class name */
    public static final class C0697a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        public C0697a(@NotNull zn.c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new a(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzn/a$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lzn/a$b$a;", "Lzn/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzn/a$b$a;", "Lzn/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: zn.a$b$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Error extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$b$b;", "Lzn/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: zn.a$b$b, reason: collision with other inner class name */
        public static final class C0699b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0699b f38123a = new C0699b();

            public C0699b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lzn/a$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", f = "DocumentFileDeleteWorker.kt", l = {32, MotionEventCompat.AXIS_GENERIC_7, 40}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f38124t;

        /* renamed from: u, reason: collision with root package name */
        public Object f38125u;

        /* renamed from: v, reason: collision with root package name */
        public int f38126v;

        /* renamed from: w, reason: collision with root package name */
        public int f38127w;

        /* renamed from: x, reason: collision with root package name */
        public int f38128x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f38129y;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Liv/x;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", f = "DocumentFileDeleteWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_2}, m = "invokeSuspend")
        /* renamed from: zn.a$c$a, reason: collision with other inner class name */
        public static final class C0700a extends m implements Function1<mt.b<? super x<?>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f38131t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f38132u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0700a(a aVar, mt.b<? super C0700a> bVar) {
                super(1, bVar);
                this.f38132u = aVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new C0700a(this.f38132u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f38131t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                zn.c cVar = this.f38132u.service;
                String str = this.f38132u.sessionToken;
                String documentFileId = this.f38132u.getRemoteDocument().getDocumentFileId();
                this.f38131t = 1;
                Object e11 = cVar.e(str, documentFileId, this);
                return e11 == e10 ? e10 : e11;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<?>> bVar) {
                return ((C0700a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f38129y = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r0.emit(r5, r8) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        
            if (r9 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f38129y
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r8.f38128x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L37
                if (r2 == r5) goto L33
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r8.f38125u
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r8.f38124t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                gt.o.b(r9)
                goto L9f
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r2 = r8.f38124t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                gt.o.b(r9)
                goto L74
            L33:
                gt.o.b(r9)
                goto L4d
            L37:
                gt.o.b(r9)
                zn.a$c$a r9 = new zn.a$c$a
                zn.a r2 = zn.a.this
                r7 = 0
                r9.<init>(r2, r7)
                r8.f38129y = r0
                r8.f38128x = r5
                java.lang.Object r9 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueRetriableRequestWithRetry(r9, r8)
                if (r9 != r1) goto L4d
                goto L9e
            L4d:
                r2 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r9 == 0) goto L74
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r9
                java.lang.Object r9 = r9.getResponse()
                zn.a$b$b r5 = zn.a.b.C0699b.f38123a
                r8.f38129y = r0
                r8.f38124t = r2
                java.lang.Object r9 = ot.l.a(r9)
                r8.f38125u = r9
                r8.f38126v = r6
                r8.f38127w = r6
                r8.f38128x = r4
                java.lang.Object r9 = r0.emit(r5, r8)
                if (r9 != r1) goto L74
                goto L9e
            L74:
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r9 == 0) goto L9f
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r9
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r9 = r9.getNetworkErrorInfo()
                zn.a$b$a r4 = new zn.a$b$a
                r4.<init>(r9)
                java.lang.Object r5 = ot.l.a(r0)
                r8.f38129y = r5
                r8.f38124t = r2
                java.lang.Object r9 = ot.l.a(r9)
                r8.f38125u = r9
                r8.f38126v = r6
                r8.f38127w = r6
                r8.f38128x = r3
                java.lang.Object r9 = r0.emit(r4, r8)
                if (r9 != r1) goto L9f
            L9e:
                return r1
            L9f:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zn.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ a(String str, zn.c cVar, String str2, DocumentFile.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, remote);
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final DocumentFile.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return j.w(new c(null));
    }

    public a(String str, zn.c cVar, String str2, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.remoteDocument = remote;
    }
}
