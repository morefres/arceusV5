package xo;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xq.a;
import xq.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, d2 = {"Lxo/k0;", "", "Landroid/content/Context;", "applicationContext", "Lxq/a$a;", "silentNetworkAuthWorkerFactory", "Lep/w;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Landroid/content/Context;Lxq/a$a;Lep/w;)V", "", "sessionToken", "checkUrl", "", "timeoutSeconds", "", "c", "(Ljava/lang/String;Ljava/lang/String;ILmt/b;)Ljava/lang/Object;", "Lgt/n;", "Lxq/c$b;", rl.d.f30696a, "(Ljava/lang/String;ILmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "g", "(Lxq/c$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "f", "(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "request", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lxq/a$a;", "Lep/w;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a.C0662a silentNetworkAuthWorkerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ep.w service;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {29, MotionEventCompat.AXIS_GENERIC_3}, m = "perform")
    public static final class b extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f35876t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35877u;

        /* renamed from: v, reason: collision with root package name */
        public Object f35878v;

        /* renamed from: w, reason: collision with root package name */
        public Object f35879w;

        /* renamed from: x, reason: collision with root package name */
        public int f35880x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f35881y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35881y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return k0.this.c(null, null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {MotionEventCompat.AXIS_GENERIC_12}, m = "runSna-0E7RQCE")
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35883t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35884u;

        /* renamed from: v, reason: collision with root package name */
        public int f35885v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f35886w;

        /* renamed from: y, reason: collision with root package name */
        public int f35888y;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35886w = obj;
            this.f35888y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object d10 = k0.this.d(null, 0, this);
            return d10 == nt.c.e() ? d10 : gt.n.a(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {70}, m = "sendUpdate")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f35889t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35890u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f35891v;

        /* renamed from: x, reason: collision with root package name */
        public int f35893x;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35891v = obj;
            this.f35893x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return k0.this.e(null, null, this);
        }
    }

    public k0(@NotNull Context applicationContext, @NotNull a.C0662a silentNetworkAuthWorkerFactory, @NotNull ep.w service) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(silentNetworkAuthWorkerFactory, "silentNetworkAuthWorkerFactory");
        Intrinsics.checkNotNullParameter(service, "service");
        this.applicationContext = applicationContext;
        this.silentNetworkAuthWorkerFactory = silentNetworkAuthWorkerFactory;
        this.service = service;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (e(r6, r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof xo.k0.b
            if (r0 == 0) goto L13
            r0 = r9
            xo.k0$b r0 = (xo.k0.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xo.k0$b r0 = new xo.k0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f35881y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f35879w
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r6 = (com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest) r6
            java.lang.Object r6 = r0.f35877u
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f35876t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r9)
            goto La0
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            int r8 = r0.f35880x
            java.lang.Object r6 = r0.f35877u
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f35876t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r9)
            gt.n r9 = (gt.n) r9
            java.lang.Object r9 = r9.getValue()
            goto L6b
        L55:
            gt.o.b(r9)
            r0.f35876t = r6
            java.lang.Object r9 = ot.l.a(r7)
            r0.f35877u = r9
            r0.f35880x = r8
            r0.A = r4
            java.lang.Object r9 = r5.d(r7, r8, r0)
            if (r9 != r1) goto L6b
            goto L9f
        L6b:
            java.lang.Throwable r2 = gt.n.e(r9)
            if (r2 != 0) goto L79
            r2 = r9
            xq.c$b r2 = (xq.c.b) r2
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r2 = r5.g(r2)
            goto L7d
        L79:
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r2 = r5.f(r2)
        L7d:
            java.lang.Object r4 = ot.l.a(r6)
            r0.f35876t = r4
            java.lang.Object r7 = ot.l.a(r7)
            r0.f35877u = r7
            java.lang.Object r7 = ot.l.a(r9)
            r0.f35878v = r7
            java.lang.Object r7 = ot.l.a(r2)
            r0.f35879w = r7
            r0.f35880x = r8
            r0.A = r3
            java.lang.Object r6 = r5.e(r6, r2, r0)
            if (r6 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.k0.c(java.lang.String, java.lang.String, int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, int r13, mt.b<? super gt.n<? extends xq.c.b>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof xo.k0.c
            if (r0 == 0) goto L13
            r0 = r14
            xo.k0$c r0 = (xo.k0.c) r0
            int r1 = r0.f35888y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35888y = r1
            goto L18
        L13:
            xo.k0$c r0 = new xo.k0$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f35886w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35888y
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r12 = r0.f35884u
            xq.a r12 = (xq.a) r12
            java.lang.Object r12 = r0.f35883t
            java.lang.String r12 = (java.lang.String) r12
            gt.o.b(r14)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            goto L72
        L31:
            r0 = move-exception
            r12 = r0
            goto L77
        L34:
            r0 = move-exception
            r12 = r0
            goto L82
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            gt.o.b(r14)
            xq.a$a r14 = r11.silentNetworkAuthWorkerFactory     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            android.content.Context r2 = r11.applicationContext     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig r4 = new com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r9 = 6
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r12
            r4.<init>(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            xq.a r12 = r14.a(r2, r4, r13)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            gt.n$a r14 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            mu.h r14 = r12.run()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            java.lang.Object r2 = ot.l.a(r5)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r0.f35883t = r2     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            java.lang.Object r12 = ot.l.a(r12)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r0.f35884u = r12     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r0.f35885v = r13     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r0.f35888y = r3     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            java.lang.Object r14 = mu.j.u(r14, r0)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            if (r14 != r1) goto L72
            return r1
        L72:
            java.lang.Object r12 = gt.n.b(r14)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            return r12
        L77:
            gt.n$a r13 = gt.n.INSTANCE
            java.lang.Object r12 = gt.o.a(r12)
            java.lang.Object r12 = gt.n.b(r12)
            return r12
        L82:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.k0.d(java.lang.String, int, mt.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r6, mt.b<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof xo.k0.d
            if (r0 == 0) goto L13
            r0 = r7
            xo.k0$d r0 = (xo.k0.d) r0
            int r1 = r0.f35893x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35893x = r1
            goto L18
        L13:
            xo.k0$d r0 = new xo.k0$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35891v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f35893x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f35890u
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r5 = (com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest) r5
            java.lang.Object r5 = r0.f35889t
            java.lang.String r5 = (java.lang.String) r5
            gt.o.b(r7)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            goto L55
        L31:
            r5 = move-exception
            goto L58
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            gt.o.b(r7)
            ep.w r7 = r4.service     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            java.lang.Object r2 = ot.l.a(r5)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            r0.f35889t = r2     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            java.lang.Object r2 = ot.l.a(r6)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            r0.f35890u = r2     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            r0.f35893x = r3     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            java.lang.Object r5 = r7.i(r5, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Throwable -> L55
            if (r5 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r5 = kotlin.Unit.f22894a
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.k0.e(java.lang.String, com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest, mt.b):java.lang.Object");
    }

    public final UpdateInquirySessionRequest f(Throwable th2) {
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, "sdk_error", th2.getClass().getSimpleName(), 1, null);
    }

    public final UpdateInquirySessionRequest g(c.b bVar) {
        if (bVar instanceof c.b.C0664b) {
            return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, ((c.b.C0664b) bVar).a(), null, null, 6, null);
        }
        if (!(bVar instanceof c.b.Error)) {
            throw new gt.l();
        }
        c.b.Error error = (c.b.Error) bVar;
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, error.getErrorName(), error.getErrorMessage(), 1, null);
    }
}
