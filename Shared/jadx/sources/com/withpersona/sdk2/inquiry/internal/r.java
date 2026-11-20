package com.withpersona.sdk2.inquiry.internal;

import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BE\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lmu/h;", "run", "()Lmu/h;", "otherWorker", "", ve.a.f33391e, "(Ltr/h;)Z", j6.b.f21518e, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", rl.d.f30696a, "f", "e", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "g", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "()Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements tr.h<com.withpersona.sdk2.inquiry.internal.network.h> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InquirySessionConfig inquirySessionConfig;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$a;", "", "", "sessionToken", "trackingEventsUrl", "inquiryId", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/r;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/r;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        r a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1", f = "TransitionBackWorker.kt", l = {MotionEventCompat.AXIS_BRAKE, MotionEventCompat.AXIS_GAS}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<mu.i<? super com.withpersona.sdk2.inquiry.internal.network.h>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f12131t;

        /* renamed from: u, reason: collision with root package name */
        public int f12132u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12133v;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = r.this.new b(bVar);
            bVar2.f12133v = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
        
            if (r2.emit(r13, r12) == r1) goto L16;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f12133v
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r12.f12132u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                gt.o.b(r13)
                r11 = r12
                goto L74
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r2 = r12.f12131t
                mu.i r2 = (mu.i) r2
                gt.o.b(r13)
                r11 = r12
                goto L62
            L28:
                gt.o.b(r13)
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                com.withpersona.sdk2.inquiry.internal.network.e r5 = r13.getInquiryApiHelper()
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r6 = r13.getSessionToken()
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r7 = r13.getInquiryId()
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r8 = r13.getFromStep()
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9 = r13.getInquirySessionConfig()
                com.withpersona.sdk2.inquiry.internal.r r13 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r10 = com.withpersona.sdk2.inquiry.internal.r.c(r13)
                java.lang.Object r13 = ot.l.a(r0)
                r12.f12133v = r13
                r12.f12131t = r0
                r12.f12132u = r4
                r11 = r12
                java.lang.Object r13 = r5.p(r6, r7, r8, r9, r10, r11)
                if (r13 != r1) goto L61
                goto L73
            L61:
                r2 = r0
            L62:
                java.lang.Object r0 = ot.l.a(r0)
                r11.f12133v = r0
                r0 = 0
                r11.f12131t = r0
                r11.f12132u = r3
                java.lang.Object r13 = r2.emit(r13, r12)
                if (r13 != r1) goto L74
            L73:
                return r1
            L74:
                kotlin.Unit r13 = kotlin.Unit.f22894a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super com.withpersona.sdk2.inquiry.internal.network.h> iVar, mt.b<? super Unit> bVar) {
            return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public r(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.trackingEventsUrl = str;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof r)) {
            return false;
        }
        r rVar = (r) otherWorker;
        return Intrinsics.c(this.sessionToken, rVar.sessionToken) && Intrinsics.c(this.inquiryId, rVar.inquiryId);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final String getFromStep() {
        return this.fromStep;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.network.e getInquiryApiHelper() {
        return this.inquiryApiHelper;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    @NotNull
    /* renamed from: h, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // tr.h
    @NotNull
    public mu.h<com.withpersona.sdk2.inquiry.internal.network.h> run() {
        return mu.j.w(new b(null));
    }
}
