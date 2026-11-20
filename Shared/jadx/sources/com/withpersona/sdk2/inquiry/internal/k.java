package com.withpersona.sdk2.inquiry.internal;

import androidx.core.app.NotificationCompat;
import androidx.core.text.HtmlCompat;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.a0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'#!B\u007f\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k;", "Ltr/h;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lxo/a0;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "", "canReuseWorkflow", "Lep/w;", NotificationCompat.CATEGORY_SERVICE, "Lwn/a;", "deviceIdProvider", "Lup/c;", "sandboxFlags", "Lbp/i;", "fallbackModeManager", "Lir/a;", "fontDownloader", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLep/w;Lwn/a;Lup/c;Lbp/i;Lir/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lmu/h;", "run", "()Lmu/h;", "otherWorker", ve.a.f33391e, "(Ltr/h;)Z", j6.b.f21518e, "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", rl.d.f30696a, "o", "e", "Lxo/a0;", "f", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "g", "Z", "h", "Lep/w;", "i", "Lwn/a;", "j", "Lup/c;", "k", "Lbp/i;", "l", "Lir/a;", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "n", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements tr.h<c> {

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
    public final a0 pollingMode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public InquirySessionConfig inquirySessionConfig;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean canReuseWorkflow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ep.w service;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wn.a deviceIdProvider;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bp.i fallbackModeManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.a fontDownloader;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lxo/a0;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "", "canReuseWorkflow", "Lcom/withpersona/sdk2/inquiry/internal/k;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/k;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        k a(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @NotNull String inquiryId, @NotNull a0 pollingMode, @NotNull InquirySessionConfig inquirySessionConfig, boolean canReuseWorkflow);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/internal/k$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$c$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.k$c$a, reason: from toString */
        public static final /* data */ class Error extends c {

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

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "currentState", "", "canReuseWorkflow", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Z)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.k$c$b, reason: from toString */
        public static final /* data */ class Success extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InquiryState nextState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull InquiryState nextState) {
                super(null);
                Intrinsics.checkNotNullParameter(nextState, "nextState");
                this.nextState = nextState;
            }

            @NotNull
            public final InquiryState a(@Nullable InquiryState currentState, boolean canReuseWorkflow) {
                InquiryState inquiryState = this.nextState;
                if (canReuseWorkflow && (inquiryState instanceof InquiryState.UiStepRunning) && (currentState instanceof InquiryState.UiStepRunning)) {
                    InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
                    InquiryState.UiStepRunning uiStepRunning2 = (InquiryState.UiStepRunning) currentState;
                    if (Intrinsics.c(uiStepRunning.getStepName(), uiStepRunning2.getStepName())) {
                        return InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, uiStepRunning2.getClientSideKey(), null, null, null, false, null, 2064383, null);
                    }
                }
                return inquiryState;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                return this.nextState.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/internal/k$c;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.PollingWorker$run$1", f = "PollingWorker.kt", l = {52, HtmlCompat.FROM_HTML_MODE_COMPACT, 142, 153, 160, 164, 170, 174}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<mu.i<? super c>, mt.b<? super Unit>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public int D;
        public long E;
        public int F;
        public /* synthetic */ Object G;

        /* renamed from: t, reason: collision with root package name */
        public Object f11898t;

        /* renamed from: u, reason: collision with root package name */
        public Object f11899u;

        /* renamed from: v, reason: collision with root package name */
        public Object f11900v;

        /* renamed from: w, reason: collision with root package name */
        public Object f11901w;

        /* renamed from: x, reason: collision with root package name */
        public Object f11902x;

        /* renamed from: y, reason: collision with root package name */
        public Object f11903y;

        /* renamed from: z, reason: collision with root package name */
        public Object f11904z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11905a;

            static {
                int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
                try {
                    iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f11905a = iArr;
            }
        }

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            d dVar = k.this.new d(bVar);
            dVar.G = obj;
            return dVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:19|20|22|23|(2:158|159)|25|(1:27)|28|29|30|31|32|33|34|(7:36|37|38|39|(2:137|(2:143|(1:145)(3:149|129|(3:131|10|11)))(1:139))(4:41|(1:43)|44|(12:46|(1:48)|49|(6:51|(4:54|(3:56|57|58)(1:60)|59|52)|61|62|(1:64)|65)(1:134)|66|67|(5:69|(4:72|(3:74|75|76)(1:78)|77|70)|79|80|(1:88))|89|(4:91|(4:94|(3:96|97|98)(1:100)|99|92)|101|102)(1:133)|(1:104)|105|(6:116|(1:118)|119|(1:121)(1:132)|122|(1:124)(3:128|129|(0)))(1:(1:110)(2:114|115)))(2:135|136))|12|(4:14|(1:16)|7|8)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x03ce, code lost:
        
            if (r6.emit(r11, r28) == r7) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0488, code lost:
        
            if (r6.emit(r13, r28) == r7) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x04df, code lost:
        
            if (r6.emit(r9, r28) == r7) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x051d, code lost:
        
            if (r6.emit(r9, r28) == r7) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x055d, code lost:
        
            r17 = true;
            r0 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x05bb, code lost:
        
            if (r6.emit(r0, r28) == r7) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x012a, code lost:
        
            if (r6.emit(r1, r28) == r7) goto L158;
         */
        /* JADX WARN: Removed duplicated region for block: B:131:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x049e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0571  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x054d -> B:10:0x0048). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x056c -> B:12:0x014e). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 1496
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super c> iVar, mt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public k(@NotNull String sessionToken, @Nullable String str, @NotNull String inquiryId, @NotNull a0 pollingMode, @NotNull InquirySessionConfig inquirySessionConfig, boolean z10, @NotNull ep.w service, @NotNull wn.a deviceIdProvider, @NotNull up.c sandboxFlags, @NotNull bp.i fallbackModeManager, @NotNull ir.a fontDownloader, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager, @NotNull com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(fontDownloader, "fontDownloader");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        Intrinsics.checkNotNullParameter(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.trackingEventsUrl = str;
        this.inquiryId = inquiryId;
        this.pollingMode = pollingMode;
        this.inquirySessionConfig = inquirySessionConfig;
        this.canReuseWorkflow = z10;
        this.service = service;
        this.deviceIdProvider = deviceIdProvider;
        this.sandboxFlags = sandboxFlags;
        this.fallbackModeManager = fallbackModeManager;
        this.fontDownloader = fontDownloader;
        this.themeManager = themeManager;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof k)) {
            return false;
        }
        k kVar = (k) otherWorker;
        return Intrinsics.c(this.sessionToken, kVar.sessionToken) && Intrinsics.c(this.inquiryId, kVar.inquiryId) && this.pollingMode == kVar.pollingMode;
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @NotNull
    /* renamed from: o, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    /* renamed from: p, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // tr.h
    @NotNull
    public mu.h<c> run() {
        return mu.j.w(new d(null));
    }
}
