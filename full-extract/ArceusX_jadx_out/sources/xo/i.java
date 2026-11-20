package xo;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import ju.d2;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lxo/i;", "", "Lep/w;", "inquiryService", "Lsm/w;", "moshi", "Llp/b;", "logger", "Lju/p0;", "coroutineScope", "<init>", "(Lep/w;Lsm/w;Llp/b;Lju/p0;)V", "", "sessionToken", "Lju/d2;", "i", "(Ljava/lang/String;)Lju/d2;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lju/d2;", "h", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Llp/a;", "level", "", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Llp/a;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lep/w;", j6.b.f21518e, "Lsm/w;", "c", "Llp/b;", rl.d.f30696a, "Lju/p0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ep.w inquiryService;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sm.w moshi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.b logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", l = {MotionEventCompat.AXIS_GENERIC_6}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35850t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35852v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InternalErrorInfo f35853w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InternalErrorInfo internalErrorInfo, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f35852v = str;
            this.f35853w = internalErrorInfo;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return i.this.new a(this.f35852v, this.f35853w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35850t;
            if (i10 == 0) {
                gt.o.b(obj);
                ep.w wVar = i.this.inquiryService;
                String str = this.f35852v;
                ErrorRequest errorRequest = new ErrorRequest(com.withpersona.sdk2.inquiry.internal.network.c.a(this.f35853w), i.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.f35853w));
                this.f35850t = 1;
                if (wVar.h(str, errorRequest, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {61, 70}, m = "reportError")
    public static final class b extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f35854t;

        /* renamed from: u, reason: collision with root package name */
        public Object f35855u;

        /* renamed from: v, reason: collision with root package name */
        public Object f35856v;

        /* renamed from: w, reason: collision with root package name */
        public Object f35857w;

        /* renamed from: x, reason: collision with root package name */
        public Object f35858x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f35859y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35859y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return i.this.e(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", l = {MotionEventCompat.AXIS_GENERIC_16, 48, 49, 51}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35861t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35863v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f35863v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return i.this.new c(this.f35863v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        
            if (r14.f(r13) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (xo.i.g(r5, r6, "com.withpersona.sdk2.inquiry.integrity", r8, null, r10, 8, null) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (xo.i.g(r5, r6, com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.SUBSYSTEM, r8, null, r10, 8, null) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            if (xo.i.g(r5, r6, "com.withpersona.sdk2.inquiry.nfc", r8, null, r10, 8, null) == r0) goto L25;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r13.f35861t
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                gt.o.b(r14)
                r10 = r13
                goto L84
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L22:
                gt.o.b(r14)
                r10 = r13
                goto L75
            L27:
                gt.o.b(r14)
                r10 = r13
                goto L60
            L2c:
                gt.o.b(r14)
                r10 = r13
                goto L4b
            L31:
                gt.o.b(r14)
                r14 = r5
                xo.i r5 = xo.i.this
                java.lang.String r6 = r13.f35863v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Nfc
                r13.f35861t = r14
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.nfc"
                r9 = 0
                r11 = 8
                r12 = 0
                r10 = r13
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L4b
                goto L83
            L4b:
                xo.i r5 = xo.i.this
                java.lang.String r6 = r10.f35863v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Network
                r10.f35861t = r4
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.network"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L60
                goto L83
            L60:
                xo.i r5 = xo.i.this
                java.lang.String r6 = r10.f35863v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Other
                r10.f35861t = r3
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.integrity"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L75
                goto L83
            L75:
                xo.i r14 = xo.i.this
                lp.b r14 = xo.i.b(r14)
                r10.f35861t = r2
                java.lang.Object r14 = r14.f(r13)
                if (r14 != r0) goto L84
            L83:
                return r0
            L84:
                kotlin.Unit r14 = kotlin.Unit.f22894a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35864t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35866v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f35866v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return i.this.new d(this.f35866v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35864t;
            if (i10 == 0) {
                gt.o.b(obj);
                ep.w wVar = i.this.inquiryService;
                String str = this.f35866v;
                this.f35864t = 1;
                if (wVar.e(str, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public i(@NotNull ep.w inquiryService, @NotNull sm.w moshi, @NotNull lp.b logger, @NotNull ju.p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    public static /* synthetic */ Object g(i iVar, String str, String str2, ErrorRequest.a aVar, lp.a aVar2, mt.b bVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            aVar2 = lp.a.f23786c;
        }
        return iVar.e(str, str2, aVar, aVar2, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (r2.h(r8, r4, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, java.lang.String r9, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a r10, lp.a r11, mt.b<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof xo.i.b
            if (r0 == 0) goto L13
            r0 = r12
            xo.i$b r0 = (xo.i.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xo.i$b r0 = new xo.i$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f35859y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L60
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r8 = r0.f35858x
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f35857w
            lp.a r8 = (lp.a) r8
            java.lang.Object r8 = r0.f35856v
            com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = (com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a) r8
            java.lang.Object r8 = r0.f35855u
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f35854t
            java.lang.String r8 = (java.lang.String) r8
            gt.o.b(r12)
            goto Lcd
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            java.lang.Object r8 = r0.f35857w
            r11 = r8
            lp.a r11 = (lp.a) r11
            java.lang.Object r8 = r0.f35856v
            r10 = r8
            com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r10 = (com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a) r10
            java.lang.Object r8 = r0.f35855u
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f35854t
            java.lang.String r8 = (java.lang.String) r8
            gt.o.b(r12)
            goto L7e
        L60:
            gt.o.b(r12)
            lp.b r12 = r7.logger
            r0.f35854t = r8
            java.lang.Object r2 = ot.l.a(r9)
            r0.f35855u = r2
            r0.f35856v = r10
            java.lang.Object r2 = ot.l.a(r11)
            r0.f35857w = r2
            r0.A = r4
            java.lang.Object r12 = r12.j(r9, r11, r0)
            if (r12 != r1) goto L7e
            goto Lcc
        L7e:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L85
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        L85:
            boolean r2 = kotlin.text.StringsKt.p0(r12)
            if (r2 == 0) goto L8e
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        L8e:
            ep.w r2 = r7.inquiryService
            com.withpersona.sdk2.inquiry.internal.network.ErrorRequest r4 = new com.withpersona.sdk2.inquiry.internal.network.ErrorRequest
            sm.w r5 = r7.moshi
            java.lang.Class<com.withpersona.sdk2.inquiry.internal.ErrorLog> r6 = com.withpersona.sdk2.inquiry.internal.ErrorLog.class
            sm.h r5 = r5.c(r6)
            com.withpersona.sdk2.inquiry.internal.ErrorLog r6 = new com.withpersona.sdk2.inquiry.internal.ErrorLog
            r6.<init>(r12)
            java.lang.Object r5 = r5.toJsonValue(r6)
            r4.<init>(r10, r5)
            java.lang.Object r5 = ot.l.a(r8)
            r0.f35854t = r5
            java.lang.Object r9 = ot.l.a(r9)
            r0.f35855u = r9
            java.lang.Object r9 = ot.l.a(r10)
            r0.f35856v = r9
            java.lang.Object r9 = ot.l.a(r11)
            r0.f35857w = r9
            java.lang.Object r9 = ot.l.a(r12)
            r0.f35858x = r9
            r0.A = r3
            java.lang.Object r8 = r2.h(r8, r4, r0)
            if (r8 != r1) goto Lcd
        Lcc:
            return r1
        Lcd:
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.i.e(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a, lp.a, mt.b):java.lang.Object");
    }

    @NotNull
    public final d2 f(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        d2 d10;
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        d10 = ju.k.d(this.coroutineScope, g1.b(), null, new a(sessionToken, errorInfo, null), 2, null);
        return d10;
    }

    @NotNull
    public final d2 h(@NotNull String sessionToken) {
        d2 d10;
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        d10 = ju.k.d(this.coroutineScope, g1.b(), null, new c(sessionToken, null), 2, null);
        return d10;
    }

    @NotNull
    public final d2 i(@NotNull String sessionToken) {
        d2 d10;
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        d10 = ju.k.d(this.coroutineScope, g1.b(), null, new d(sessionToken, null), 2, null);
        return d10;
    }
}
