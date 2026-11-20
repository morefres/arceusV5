package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import ep.InquiryAttributes;
import gt.n;
import gt.o;
import iv.x;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.l;
import ot.m;
import sm.w;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Lbp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", NotificationCompat.CATEGORY_SERVICE, "Lsm/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lsm/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "Lep/e;", "attributes", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lep/e;Lmt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Liv/x;", j6.b.f21518e, "(Ljava/lang/String;Lokhttp3/RequestBody;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "", "f", "()I", "Lbp/h;", "endpoint", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;Lbp/h;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lsm/w;", "getMoshi", "()Lsm/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", rl.d.f30696a, "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements bp.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FallbackModeService service;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final w moshi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.a staticTemplateSessionFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int requestCount;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {84, 120}, m = "createSession-gIAlu-s")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f11807t;

        /* renamed from: u, reason: collision with root package name */
        public Object f11808u;

        /* renamed from: v, reason: collision with root package name */
        public Object f11809v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f11810w;

        /* renamed from: y, reason: collision with root package name */
        public int f11812y;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11810w = obj;
            this.f11812y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object c10 = d.this.c(null, this);
            return c10 == nt.c.e() ? c10 : n.a(c10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Lju/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", l = {85}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, mt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11813t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11814u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f11815v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", l = {88}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<FallbackModeService.StatusResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f11816t;

            /* renamed from: u, reason: collision with root package name */
            public int f11817u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11818v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f11819w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InquiryAttributes inquiryAttributes, d dVar, mt.b<? super a> bVar) {
                super(1, bVar);
                this.f11818v = inquiryAttributes;
                this.f11819w = dVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f11818v, this.f11819w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object e10 = nt.c.e();
                int i10 = this.f11817u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                String sessionToken = this.f11818v.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(this.f11818v.getSessionToken());
                }
                FallbackModeService service = this.f11819w.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f11818v.getTemplateId());
                this.f11816t = l.a(str);
                this.f11817u = 1;
                Object c10 = service.c(str, statusRequest, this);
                return c10 == e10 ? e10 : c10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<FallbackModeService.StatusResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InquiryAttributes inquiryAttributes, d dVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f11814u = inquiryAttributes;
            this.f11815v = dVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f11814u, this.f11815v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11813t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(this.f11814u, this.f11815v, null);
            this.f11813t = 1;
            Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return enqueueRetriableRequestWithRetry == e10 ? e10 : enqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Lju/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", l = {121}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11820t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11822v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", l = {122}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<FallbackModeService.SessionIdResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11823t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11824u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11825v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, InquiryAttributes inquiryAttributes, mt.b<? super a> bVar) {
                super(1, bVar);
                this.f11824u = dVar;
                this.f11825v = inquiryAttributes;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f11824u, this.f11825v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f11823t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11824u.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f11825v.getTemplateId(), this.f11825v.getTemplateVersion(), this.f11825v.getInquiryId(), this.f11825v.getReferenceId(), this.f11825v.getAccountId(), ep.b.a(this.f11825v.getEnvironment()), this.f11825v.getEnvironmentId(), this.f11825v.d() != null ? new InquiryFieldMap(ep.a.t(this.f11825v.d())) : null, this.f11825v.getThemeSetId());
                this.f11823t = 1;
                Object a10 = service.a(sessionIdRequest, this);
                return a10 == e10 ? e10 : a10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<FallbackModeService.SessionIdResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InquiryAttributes inquiryAttributes, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f11822v = inquiryAttributes;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return d.this.new c(this.f11822v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11820t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11822v, null);
            this.f11820t = 1;
            Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return enqueueRetriableRequestWithRetry == e10 ? e10 : enqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {175, 210}, m = "transition")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d, reason: collision with other inner class name */
    public static final class C0221d extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f11826t;

        /* renamed from: u, reason: collision with root package name */
        public Object f11827u;

        /* renamed from: v, reason: collision with root package name */
        public Object f11828v;

        /* renamed from: w, reason: collision with root package name */
        public Object f11829w;

        /* renamed from: x, reason: collision with root package name */
        public Object f11830x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f11831y;

        public C0221d(mt.b<? super C0221d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11831y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return d.this.h(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Lju/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", l = {176}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, mt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11833t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11835v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ bp.h f11836w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11837x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", l = {177}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<FallbackModeService.UploadUrlResponse>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11838t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11839u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11840v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ bp.h f11841w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11842x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, bp.h hVar, RequestBody requestBody, mt.b<? super a> bVar) {
                super(1, bVar);
                this.f11839u = dVar;
                this.f11840v = str;
                this.f11841w = hVar;
                this.f11842x = requestBody;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f11839u, this.f11840v, this.f11841w, this.f11842x, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object e10 = nt.c.e();
                int i10 = this.f11838t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11839u.getService();
                String str2 = this.f11840v;
                bp.h hVar = this.f11841w;
                int f10 = this.f11839u.f();
                long contentLength = this.f11842x.contentLength();
                MediaType mediaType = this.f11842x.getMediaType();
                if (mediaType == null || (str = mediaType.toString()) == null) {
                    str = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(contentLength, str);
                this.f11838t = 1;
                Object d10 = service.d(str2, hVar, f10, uploadUrlRequest, this);
                return d10 == e10 ? e10 : d10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<FallbackModeService.UploadUrlResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, bp.h hVar, RequestBody requestBody, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f11835v = str;
            this.f11836w = hVar;
            this.f11837x = requestBody;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return d.this.new e(this.f11835v, this.f11836w, this.f11837x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11833t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11835v, this.f11836w, this.f11837x, null);
            this.f11833t = 1;
            Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return enqueueRetriableRequestWithRetry == e10 ? e10 : enqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Lju/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", l = {211}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super NetworkCallResult<Object>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11843t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11845v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11846w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", l = {212}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<Object>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f11847t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11848u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11849v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11850w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, RequestBody requestBody, mt.b<? super a> bVar) {
                super(1, bVar);
                this.f11848u = dVar;
                this.f11849v = str;
                this.f11850w = requestBody;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f11848u, this.f11849v, this.f11850w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f11847t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11848u.getService();
                String str = this.f11849v;
                RequestBody requestBody = this.f11850w;
                this.f11847t = 1;
                Object b = service.b(str, requestBody, this);
                return b == e10 ? e10 : b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, RequestBody requestBody, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f11845v = str;
            this.f11846w = requestBody;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return d.this.new f(this.f11845v, this.f11846w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11843t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11845v, this.f11846w, null);
            this.f11843t = 1;
            Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return enqueueRetriableRequestWithRetry == e10 ? e10 : enqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super NetworkCallResult<Object>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public d(@NotNull FallbackModeService service, @NotNull w moshi, @NotNull i.a staticTemplateSessionFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.service = service;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
    }

    @Override // bp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull mt.b<? super x<?>> bVar) {
        return h(str, requestBody, bp.h.b, bVar);
    }

    @Override // bp.a
    @Nullable
    public Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull mt.b<? super x<?>> bVar) {
        return h(str, requestBody, bp.h.f4328a, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0078, code lost:
    
        if (r9 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // bp.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull ep.InquiryAttributes r8, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<com.withpersona.sdk2.inquiry.internal.fallbackmode.i>> r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.c(ep.e, mt.b):java.lang.Object");
    }

    public final int f() {
        int i10 = this.requestCount + 1;
        this.requestCount = i10;
        return i10;
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final FallbackModeService getService() {
        return this.service;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r17, okhttp3.RequestBody r18, bp.h r19, mt.b<? super iv.x<?>> r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.h(java.lang.String, okhttp3.RequestBody, bp.h, mt.b):java.lang.Object");
    }
}
