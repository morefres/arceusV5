package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.location.Location;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.Relationship;
import com.withpersona.sdk2.inquiry.network.dto.RelationshipData;
import com.withpersona.sdk2.inquiry.network.dto.Relationships;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import ep.w;
import ep.y;
import iv.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rq.GpsData;
import vn.ThreatEventState;
import wn.DeviceMetrics;
import zl.t;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J:\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J \u0010<\u001a\u00020;2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0004\bD\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\bF\u00105J \u0010G\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", "", "Landroid/content/Context;", "applicationContext", "Lep/w;", NotificationCompat.CATEGORY_SERVICE, "Lep/y;", "relayService", "Lbp/i;", "fallbackModeManager", "Lup/c;", "sandboxFlags", "Lwn/a;", "deviceIdProvider", "Lcp/a;", "playIntegrityHelper", "", "redactAppIdentifyingInformation", "<init>", "(Landroid/content/Context;Lep/w;Lep/y;Lbp/i;Lup/c;Lwn/a;Lcp/a;Z)V", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lep/e;Lmt/b;)Ljava/lang/Object;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lmt/b;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "k", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "m", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "r", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lmt/b;)Ljava/lang/Object;", "Lwn/c;", "metrics", "s", "(Ljava/lang/String;Lwn/c;Lmt/b;)Ljava/lang/Object;", "fromStep", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "inquirySessionData", "", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "u", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", t.f38095d, "Lkotlin/Function1;", "Lmt/b;", "Liv/x;", "Lokhttp3/ResponseBody;", "inquiryCall", "l", "(Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "o", "n", "(Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "checkInquiryResponse", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lep/w;", "c", "Lep/y;", rl.d.f30696a, "Lbp/i;", "e", "Lup/c;", "f", "Lwn/a;", "g", "Lcp/a;", "Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final w service;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y relayService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bp.i fallbackModeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wn.a deviceIdProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cp.a playIntegrityHelper;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {64, 80}, m = "createInquiry")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12017t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12018u;

        /* renamed from: w, reason: collision with root package name */
        public int f12020w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12018u = obj;
            this.f12020w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {138}, m = "createInquirySession")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12021t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12022u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12023v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12024w;

        /* renamed from: y, reason: collision with root package name */
        public int f12026y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12024w = obj;
            this.f12026y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {162}, m = "exchangeOneTimeLinkCode")
    public static final class c extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12027t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12028u;

        /* renamed from: w, reason: collision with root package name */
        public int f12030w;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12028u = obj;
            this.f12030w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {397}, m = "makeInquiryCallWithRetry")
    public static final class d extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12031t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12032u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12033v;

        /* renamed from: x, reason: collision with root package name */
        public int f12035x;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12033v = obj;
            this.f12035x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.l(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attempt", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", f = "InquiryApiHelper.kt", l = {399, 403}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e, reason: collision with other inner class name */
    public static final class C0224e extends ot.m implements Function2<Integer, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12036t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ int f12037u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<mt.b<? super x<ResponseBody>>, Object> f12038v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<InternalErrorInfo> f12039w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0224e(Function1<? super mt.b<? super x<ResponseBody>>, ? extends Object> function1, c0<InternalErrorInfo> c0Var, mt.b<? super C0224e> bVar) {
            super(2, bVar);
            this.f12038v = function1;
            this.f12039w = c0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            C0224e c0224e = new C0224e(this.f12038v, this.f12039w, bVar);
            c0224e.f12037u = ((Number) obj).intValue();
            return c0224e;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, mt.b<? super Boolean> bVar) {
            return o(num.intValue(), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            if (r13 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        
            if (ju.z0.b(1000, r12) == r1) goto L20;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.f12037u
                java.lang.Object r1 = nt.c.e()
                int r2 = r12.f12036t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                gt.o.b(r13)     // Catch: java.io.IOException -> L14
                goto L42
            L14:
                r0 = move-exception
                r13 = r0
                goto L66
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                gt.o.b(r13)
                goto L35
            L23:
                gt.o.b(r13)
                if (r0 <= 0) goto L35
                r12.f12037u = r0
                r12.f12036t = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r13 = ju.z0.b(r5, r12)
                if (r13 != r1) goto L35
                goto L41
            L35:
                kotlin.jvm.functions.Function1<mt.b<? super iv.x<okhttp3.ResponseBody>>, java.lang.Object> r13 = r12.f12038v     // Catch: java.io.IOException -> L14
                r12.f12037u = r0     // Catch: java.io.IOException -> L14
                r12.f12036t = r3     // Catch: java.io.IOException -> L14
                java.lang.Object r13 = r13.invoke(r12)     // Catch: java.io.IOException -> L14
                if (r13 != r1) goto L42
            L41:
                return r1
            L42:
                iv.x r13 = (iv.x) r13     // Catch: java.io.IOException -> L14
                boolean r0 = r13.g()
                if (r0 != 0) goto L5b
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r13 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r13)
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f12039w
                r0.f22963a = r13
                boolean r13 = r13.isRecoverable()
                java.lang.Boolean r13 = ot.b.a(r13)
                return r13
            L5b:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r13 = r12.f12039w
                r0 = 0
                r13.f22963a = r0
                r13 = 0
                java.lang.Boolean r13 = ot.b.a(r13)
                return r13
            L66:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f12039w
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r5 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                java.lang.String r7 = r13.getMessage()
                r10 = 8
                r11 = 0
                r6 = 0
                r8 = 1
                r9 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r0.f22963a = r5
                java.lang.Boolean r13 = ot.b.a(r4)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.C0224e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object o(int i10, mt.b<? super Boolean> bVar) {
            return ((C0224e) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {211}, m = "redeemRelaySession")
    public static final class f extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12040t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12041u;

        /* renamed from: w, reason: collision with root package name */
        public int f12043w;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12041u = obj;
            this.f12043w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {465}, m = "runFallbackTransitionBack")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12044t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12045u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12046v;

        /* renamed from: x, reason: collision with root package name */
        public int f12048x;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12046v = obj;
            this.f12048x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.n(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {435}, m = "runTransitionBack")
    public static final class h extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f12049t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12050u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12051v;

        /* renamed from: w, reason: collision with root package name */
        public Object f12052w;

        /* renamed from: x, reason: collision with root package name */
        public Object f12053x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f12054y;

        public h(mt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12054y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.o(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {243, 251}, m = "updateInquiry")
    public static final class i extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12056t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12057u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12058v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12059w;

        /* renamed from: y, reason: collision with root package name */
        public int f12061y;

        public i(mt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12059w = obj;
            this.f12061y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.r(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {269}, m = "updateInquiryDeviceMetrics")
    public static final class j extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12062t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12063u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12064v;

        /* renamed from: x, reason: collision with root package name */
        public int f12066x;

        public j(mt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12064v = obj;
            this.f12066x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.s(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {270}, m = "invokeSuspend")
    public static final class k extends ot.m implements Function1<mt.b<? super x<ResponseBody>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12067t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12069v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ DeviceMetrics f12070w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, DeviceMetrics deviceMetrics, mt.b<? super k> bVar) {
            super(1, bVar);
            this.f12069v = str;
            this.f12070w = deviceMetrics;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e.this.new k(this.f12069v, this.f12070w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12067t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12069v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            Long timeSinceBootMs = this.f12070w.getTimeSinceBootMs();
            Long totalMemoryBytes = this.f12070w.getTotalMemoryBytes();
            Long availableStorageBytes = this.f12070w.getAvailableStorageBytes();
            wn.n phoneCallStatus = this.f12070w.getPhoneCallStatus();
            UpdateInquirySessionRequest a10 = companion.a(timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus != null ? phoneCallStatus.getSerializedValue() : null);
            this.f12067t = 1;
            Object i11 = wVar.i(str, a10, this);
            return i11 == e10 ? e10 : i11;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super x<ResponseBody>> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {362, 367, 373}, m = "updateInquiryInternal")
    public static final class l extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12071t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12072u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12073v;

        /* renamed from: w, reason: collision with root package name */
        public Object f12074w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12075x;

        /* renamed from: z, reason: collision with root package name */
        public int f12077z;

        public l(mt.b<? super l> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12075x = obj;
            this.f12077z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.t(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {374}, m = "invokeSuspend")
    public static final class m extends ot.m implements Function1<mt.b<? super x<ResponseBody>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12078t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12080v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GpsData f12081w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ThreatEventState f12082x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, GpsData gpsData, ThreatEventState threatEventState, mt.b<? super m> bVar) {
            super(1, bVar);
            this.f12080v = str;
            this.f12081w = gpsData;
            this.f12082x = threatEventState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e.this.new m(this.f12080v, this.f12081w, this.f12082x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> b;
            rq.b precision;
            Location location;
            Location location2;
            Object e10 = nt.c.e();
            int i10 = this.f12078t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12080v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f12081w;
            ArrayList arrayList = null;
            Double b10 = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : ot.b.b(location2.getLatitude());
            GpsData gpsData2 = this.f12081w;
            Double b11 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : ot.b.b(location.getLongitude());
            GpsData gpsData3 = this.f12081w;
            String a10 = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : rq.c.a(precision);
            ThreatEventState threatEventState = this.f12082x;
            if (threatEventState != null && (b = threatEventState.b()) != null) {
                arrayList = new ArrayList(b.size());
                for (Map.Entry<String, ThreatEventState.EventMetadata> entry : b.entrySet()) {
                    String key = entry.getKey();
                    String timestamp = entry.getValue().getTimestamp();
                    String str2 = "";
                    if (timestamp == null) {
                        timestamp = "";
                    }
                    String reasonData = entry.getValue().getReasonData();
                    if (reasonData != null) {
                        str2 = reasonData;
                    }
                    arrayList.add(new UpdateInquirySessionRequest.AppdomeThreatEvent(key, timestamp, str2));
                }
            }
            UpdateInquirySessionRequest d10 = companion.d(b11, b10, a10, arrayList);
            this.f12078t = 1;
            Object i11 = wVar.i(str, d10, this);
            return i11 == e10 ? e10 : i11;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super x<ResponseBody>> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {332, 335, 349}, m = "verifyDeviceIntegrity")
    public static final class n extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f12083t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12084u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12085v;

        /* renamed from: w, reason: collision with root package name */
        public Object f12086w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12087x;

        /* renamed from: z, reason: collision with root package name */
        public int f12089z;

        public n(mt.b<? super n> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12087x = obj;
            this.f12089z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return e.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", f = "InquiryApiHelper.kt", l = {336}, m = "invokeSuspend")
    public static final class o extends ot.m implements Function1<mt.b<? super x<ResponseBody>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12090t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12092v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f12093w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, mt.b<? super o> bVar) {
            super(1, bVar);
            this.f12092v = str;
            this.f12093w = str2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e.this.new o(this.f12092v, this.f12093w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12090t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12092v;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(e.this.applicationContext.getPackageName(), this.f12093w));
            this.f12090t = 1;
            Object k10 = wVar.k(str, verifyDeviceIntegrityRequest, this);
            return k10 == e10 ? e10 : k10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super x<ResponseBody>> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public e(@NotNull Context applicationContext, @NotNull w service, @NotNull y relayService, @NotNull bp.i fallbackModeManager, @NotNull up.c sandboxFlags, @NotNull wn.a deviceIdProvider, @NotNull cp.a playIntegrityHelper, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(relayService, "relayService");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(playIntegrityHelper, "playIntegrityHelper");
        this.applicationContext = applicationContext;
        this.service = service;
        this.relayService = relayService;
        this.fallbackModeManager = fallbackModeManager;
        this.sandboxFlags = sandboxFlags;
        this.deviceIdProvider = deviceIdProvider;
        this.playIntegrityHelper = playIntegrityHelper;
        this.redactAppIdentifyingInformation = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r0 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (r0 == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull ep.InquiryAttributes r18, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.a> r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.h(ep.e, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper r13, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.b> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.i(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper, mt.b):java.lang.Object");
    }

    public final InquirySessionDataWrapper j(CheckInquiryResponse checkInquiryResponse) {
        String accessToken;
        List<Included> included;
        CheckInquiryResponse.Meta meta = checkInquiryResponse.getMeta();
        if (meta == null || (accessToken = meta.getAccessToken()) == null || (included = checkInquiryResponse.getIncluded()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : included) {
            if (obj instanceof InquirySessionData) {
                arrayList.add(obj);
            }
        }
        InquirySessionData inquirySessionData = (InquirySessionData) CollectionsKt.firstOrNull(arrayList);
        if (inquirySessionData != null) {
            return new InquirySessionDataWrapper(accessToken, inquirySessionData, meta.getTrackingEventsUrl());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.d> r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.k(java.lang.String, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.jvm.functions.Function1<? super mt.b<? super iv.x<okhttp3.ResponseBody>>, ? extends java.lang.Object> r6, mt.b<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.inquiry.internal.network.e.d
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.inquiry.internal.network.e$d r0 = (com.withpersona.sdk2.inquiry.internal.network.e.d) r0
            int r1 = r0.f12035x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12035x = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$d r0 = new com.withpersona.sdk2.inquiry.internal.network.e$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12033v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f12035x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f12032u
            kotlin.jvm.internal.c0 r6 = (kotlin.jvm.internal.c0) r6
            java.lang.Object r0 = r0.f12031t
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            gt.o.b(r7)
            goto L5a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            gt.o.b(r7)
            kotlin.jvm.internal.c0 r7 = new kotlin.jvm.internal.c0
            r7.<init>()
            com.withpersona.sdk2.inquiry.internal.network.e$e r2 = new com.withpersona.sdk2.inquiry.internal.network.e$e
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = ot.l.a(r6)
            r0.f12031t = r6
            r0.f12032u = r7
            r0.f12035x = r3
            r6 = 5
            java.lang.Object r6 = hq.b0.a(r6, r2, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r6 = r7
        L5a:
            T r6 = r6.f22963a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.l(kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.g> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.inquiry.internal.network.e.f
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.inquiry.internal.network.e$f r0 = (com.withpersona.sdk2.inquiry.internal.network.e.f) r0
            int r1 = r0.f12043w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12043w = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$f r0 = new com.withpersona.sdk2.inquiry.internal.network.e$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12041u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f12043w
            java.lang.String r3 = "Bearer "
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.f12040t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r7)
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            gt.o.b(r7)
            ep.y r7 = r5.relayService
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object r6 = ot.l.a(r6)
            r0.f12040t = r6
            r0.f12043w = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            iv.x r7 = (iv.x) r7
            boolean r6 = r7.g()
            if (r6 == 0) goto Ld3
            okhttp3.Headers r6 = r7.f()
            java.lang.String r0 = "persona-device-id"
            java.lang.String r6 = r6.get(r0)
            if (r6 == 0) goto L73
            wn.a r0 = r5.deviceIdProvider
            r0.a(r6)
        L73:
            java.lang.Object r6 = r7.a()
            com.withpersona.sdk2.inquiry.internal.network.CurrentRelaySessionResponse r6 = (com.withpersona.sdk2.inquiry.internal.network.CurrentRelaySessionResponse) r6
            r7 = 0
            if (r6 == 0) goto L99
            com.withpersona.sdk2.inquiry.internal.network.CurrentRelaySessionResponse$Data r0 = r6.getData()
            if (r0 == 0) goto L99
            com.withpersona.sdk2.inquiry.network.dto.Relationships r0 = r0.getRelationships()
            if (r0 == 0) goto L99
            com.withpersona.sdk2.inquiry.network.dto.Relationship r0 = r0.getInquiry()
            if (r0 == 0) goto L99
            com.withpersona.sdk2.inquiry.network.dto.RelationshipData r0 = r0.getData()
            if (r0 == 0) goto L99
            java.lang.String r0 = r0.getId()
            goto L9a
        L99:
            r0 = r7
        L9a:
            if (r6 == 0) goto La6
            com.withpersona.sdk2.inquiry.internal.network.CurrentRelaySessionResponse$Metadata r6 = r6.getMeta()
            if (r6 == 0) goto La6
            java.lang.String r7 = r6.getInquirySessionToken()
        La6:
            if (r0 == 0) goto Lc6
            if (r7 != 0) goto Lab
            goto Lc6
        Lab:
            com.withpersona.sdk2.inquiry.internal.network.g$b r6 = new com.withpersona.sdk2.inquiry.internal.network.g$b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a r1 = com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.INSTANCE
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r1 = r1.a()
            r6.<init>(r0, r7, r1)
            return r6
        Lc6:
            com.withpersona.sdk2.inquiry.internal.network.g$a r6 = new com.withpersona.sdk2.inquiry.internal.network.g$a
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r7 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
            java.lang.String r0 = "Error resolving relay session."
            r7.<init>(r0)
            r6.<init>(r7)
            return r6
        Ld3:
            com.withpersona.sdk2.inquiry.internal.network.g$a r6 = new com.withpersona.sdk2.inquiry.internal.network.g$a
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r7)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.m(java.lang.String, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: SocketTimeoutException -> 0x0031, TryCatch #0 {SocketTimeoutException -> 0x0031, blocks: (B:11:0x002d, B:12:0x005b, B:14:0x0069, B:18:0x0075, B:20:0x0082, B:25:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r6, java.lang.String r7, mt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.internal.network.e.g
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.internal.network.e$g r0 = (com.withpersona.sdk2.inquiry.internal.network.e.g) r0
            int r1 = r0.f12048x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12048x = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$g r0 = new com.withpersona.sdk2.inquiry.internal.network.e$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12046v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f12048x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f12045u
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f12044t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r8)     // Catch: java.net.SocketTimeoutException -> L31
            goto L5b
        L31:
            r6 = move-exception
            goto L8c
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            gt.o.b(r8)
            bp.i r8 = r5.fallbackModeManager     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest$a r2 = com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest.INSTANCE     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest r2 = r2.a(r7)     // Catch: java.net.SocketTimeoutException -> L31
            java.lang.Object r4 = ot.l.a(r6)     // Catch: java.net.SocketTimeoutException -> L31
            r0.f12044t = r4     // Catch: java.net.SocketTimeoutException -> L31
            java.lang.Object r7 = ot.l.a(r7)     // Catch: java.net.SocketTimeoutException -> L31
            r0.f12045u = r7     // Catch: java.net.SocketTimeoutException -> L31
            r0.f12048x = r3     // Catch: java.net.SocketTimeoutException -> L31
            java.lang.Object r8 = r8.f(r6, r2, r0)     // Catch: java.net.SocketTimeoutException -> L31
            if (r8 != r1) goto L5b
            return r1
        L5b:
            iv.x r8 = (iv.x) r8     // Catch: java.net.SocketTimeoutException -> L31
            bp.i r6 = r5.fallbackModeManager     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i r6 = r6.getCurrentSession()     // Catch: java.net.SocketTimeoutException -> L31
            boolean r7 = r8.g()     // Catch: java.net.SocketTimeoutException -> L31
            if (r7 != 0) goto L73
            com.withpersona.sdk2.inquiry.internal.network.h$a r6 = new com.withpersona.sdk2.inquiry.internal.network.h$a     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r8)     // Catch: java.net.SocketTimeoutException -> L31
            r6.<init>(r7)     // Catch: java.net.SocketTimeoutException -> L31
            return r6
        L73:
            if (r6 != 0) goto L82
            com.withpersona.sdk2.inquiry.internal.network.h$a r6 = new com.withpersona.sdk2.inquiry.internal.network.h$a     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r7 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo     // Catch: java.net.SocketTimeoutException -> L31
            java.lang.String r8 = "Current fallback session is unexpectedly null."
            r7.<init>(r8)     // Catch: java.net.SocketTimeoutException -> L31
            r6.<init>(r7)     // Catch: java.net.SocketTimeoutException -> L31
            return r6
        L82:
            com.withpersona.sdk2.inquiry.internal.network.h$b r7 = new com.withpersona.sdk2.inquiry.internal.network.h$b     // Catch: java.net.SocketTimeoutException -> L31
            com.withpersona.sdk2.inquiry.internal.InquiryState r6 = r6.a()     // Catch: java.net.SocketTimeoutException -> L31
            r7.<init>(r6)     // Catch: java.net.SocketTimeoutException -> L31
            return r7
        L8c:
            com.withpersona.sdk2.inquiry.internal.network.h$a r7 = new com.withpersona.sdk2.inquiry.internal.network.h$a
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r6 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toSocketTimeoutErrorInfo(r6)
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.n(java.lang.String, java.lang.String, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: SocketTimeoutException -> 0x003f, TryCatch #0 {SocketTimeoutException -> 0x003f, blocks: (B:11:0x003b, B:12:0x006f, B:14:0x0077, B:17:0x008a, B:22:0x004c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: SocketTimeoutException -> 0x003f, TRY_LEAVE, TryCatch #0 {SocketTimeoutException -> 0x003f, blocks: (B:11:0x003b, B:12:0x006f, B:14:0x0077, B:17:0x008a, B:22:0x004c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r6, java.lang.String r7, java.lang.String r8, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9, java.lang.String r10, mt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.withpersona.sdk2.inquiry.internal.network.e.h
            if (r0 == 0) goto L13
            r0 = r11
            com.withpersona.sdk2.inquiry.internal.network.e$h r0 = (com.withpersona.sdk2.inquiry.internal.network.e.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$h r0 = new com.withpersona.sdk2.inquiry.internal.network.e$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f12054y
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r6 = r0.f12053x
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r0.f12052w
            r9 = r6
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig) r9
            java.lang.Object r6 = r0.f12051v
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f12050u
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f12049t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r11)     // Catch: java.net.SocketTimeoutException -> L3f
            goto L6f
        L3f:
            r6 = move-exception
            goto L94
        L41:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L49:
            gt.o.b(r11)
            ep.w r11 = r5.service     // Catch: java.net.SocketTimeoutException -> L3f
            com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest$a r2 = com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest.INSTANCE     // Catch: java.net.SocketTimeoutException -> L3f
            com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest r2 = r2.a(r8)     // Catch: java.net.SocketTimeoutException -> L3f
            r0.f12049t = r6     // Catch: java.net.SocketTimeoutException -> L3f
            java.lang.Object r4 = ot.l.a(r7)     // Catch: java.net.SocketTimeoutException -> L3f
            r0.f12050u = r4     // Catch: java.net.SocketTimeoutException -> L3f
            java.lang.Object r8 = ot.l.a(r8)     // Catch: java.net.SocketTimeoutException -> L3f
            r0.f12051v = r8     // Catch: java.net.SocketTimeoutException -> L3f
            r0.f12052w = r9     // Catch: java.net.SocketTimeoutException -> L3f
            r0.f12053x = r10     // Catch: java.net.SocketTimeoutException -> L3f
            r0.A = r3     // Catch: java.net.SocketTimeoutException -> L3f
            java.lang.Object r11 = r11.f(r6, r7, r2, r0)     // Catch: java.net.SocketTimeoutException -> L3f
            if (r11 != r1) goto L6f
            return r1
        L6f:
            iv.x r11 = (iv.x) r11     // Catch: java.net.SocketTimeoutException -> L3f
            boolean r7 = r11.g()     // Catch: java.net.SocketTimeoutException -> L3f
            if (r7 == 0) goto L8a
            com.withpersona.sdk2.inquiry.internal.network.h$b r7 = new com.withpersona.sdk2.inquiry.internal.network.h$b     // Catch: java.net.SocketTimeoutException -> L3f
            java.lang.Object r8 = r11.a()     // Catch: java.net.SocketTimeoutException -> L3f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.net.SocketTimeoutException -> L3f
            com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse r8 = (com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse) r8     // Catch: java.net.SocketTimeoutException -> L3f
            com.withpersona.sdk2.inquiry.internal.InquiryState r6 = ep.a.w(r8, r6, r9, r10)     // Catch: java.net.SocketTimeoutException -> L3f
            r7.<init>(r6)     // Catch: java.net.SocketTimeoutException -> L3f
            return r7
        L8a:
            com.withpersona.sdk2.inquiry.internal.network.h$a r6 = new com.withpersona.sdk2.inquiry.internal.network.h$a     // Catch: java.net.SocketTimeoutException -> L3f
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r11)     // Catch: java.net.SocketTimeoutException -> L3f
            r6.<init>(r7)     // Catch: java.net.SocketTimeoutException -> L3f
            return r6
        L94:
            com.withpersona.sdk2.inquiry.internal.network.h$a r7 = new com.withpersona.sdk2.inquiry.internal.network.h$a
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r6 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toSocketTimeoutErrorInfo(r6)
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.o(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String, mt.b):java.lang.Object");
    }

    @Nullable
    public final Object p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str4, @NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        return this.fallbackModeManager.b() ? n(str, str3, bVar) : o(str, str2, str3, inquirySessionConfig, str4, bVar);
    }

    public final void q(@NotNull InquirySessionData inquirySessionData) {
        Relationship device;
        RelationshipData data;
        String id2;
        Intrinsics.checkNotNullParameter(inquirySessionData, "inquirySessionData");
        Relationships relationships = inquirySessionData.getRelationships();
        if (relationships != null && (device = relationships.getDevice()) != null && (data = device.getData()) != null && (id2 = data.getId()) != null) {
            this.deviceIdProvider.a(id2);
        }
        String playIntegrityProjectId = inquirySessionData.getAttributes().getPlayIntegrityProjectId();
        if (playIntegrityProjectId != null) {
            this.playIntegrityHelper.h(playIntegrityProjectId);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r7, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.internal.network.e.i
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.internal.network.e$i r0 = (com.withpersona.sdk2.inquiry.internal.network.e.i) r0
            int r1 = r0.f12061y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12061y = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$i r0 = new com.withpersona.sdk2.inquiry.internal.network.e$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12059w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f12061y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f12058v
            com.withpersona.sdk2.inquiry.internal.network.j r6 = (com.withpersona.sdk2.inquiry.internal.network.j) r6
            java.lang.Object r6 = r0.f12057u
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r6 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig) r6
            java.lang.Object r7 = r0.f12056t
            java.lang.String r7 = (java.lang.String) r7
            gt.o.b(r8)
            goto L87
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f12057u
            r7 = r6
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r7 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig) r7
            java.lang.Object r6 = r0.f12056t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r8)
            goto L5d
        L4d:
            gt.o.b(r8)
            r0.f12056t = r6
            r0.f12057u = r7
            r0.f12061y = r4
            java.lang.Object r8 = r5.u(r6, r7, r0)
            if (r8 != r1) goto L5d
            goto L85
        L5d:
            com.withpersona.sdk2.inquiry.internal.network.j r8 = (com.withpersona.sdk2.inquiry.internal.network.j) r8
            boolean r2 = r8 instanceof com.withpersona.sdk2.inquiry.internal.network.j.Error
            if (r2 == 0) goto L6f
            com.withpersona.sdk2.inquiry.internal.network.i$a r6 = new com.withpersona.sdk2.inquiry.internal.network.i$a
            com.withpersona.sdk2.inquiry.internal.network.j$a r8 = (com.withpersona.sdk2.inquiry.internal.network.j.Error) r8
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r7 = r8.getCause()
            r6.<init>(r7)
            return r6
        L6f:
            java.lang.Object r2 = ot.l.a(r6)
            r0.f12056t = r2
            r0.f12057u = r7
            java.lang.Object r8 = ot.l.a(r8)
            r0.f12058v = r8
            r0.f12061y = r3
            java.lang.Object r8 = r5.t(r6, r7, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            r6 = r7
        L87:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r8 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r8
            if (r8 == 0) goto L97
            boolean r6 = r6.k()
            if (r6 == 0) goto L97
            com.withpersona.sdk2.inquiry.internal.network.i$a r6 = new com.withpersona.sdk2.inquiry.internal.network.i$a
            r6.<init>(r8)
            return r6
        L97:
            com.withpersona.sdk2.inquiry.internal.network.i$b r6 = com.withpersona.sdk2.inquiry.internal.network.i.b.f12104a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.r(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull wn.DeviceMetrics r6, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.inquiry.internal.network.e.j
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.inquiry.internal.network.e$j r0 = (com.withpersona.sdk2.inquiry.internal.network.e.j) r0
            int r1 = r0.f12066x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12066x = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$j r0 = new com.withpersona.sdk2.inquiry.internal.network.e$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12064v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f12066x
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f12063u
            wn.c r5 = (wn.DeviceMetrics) r5
            java.lang.Object r5 = r0.f12062t
            java.lang.String r5 = (java.lang.String) r5
            gt.o.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            gt.o.b(r7)
            com.withpersona.sdk2.inquiry.internal.network.e$k r7 = new com.withpersona.sdk2.inquiry.internal.network.e$k
            r2 = 0
            r7.<init>(r5, r6, r2)
            java.lang.Object r5 = ot.l.a(r5)
            r0.f12062t = r5
            java.lang.Object r5 = ot.l.a(r6)
            r0.f12063u = r5
            r0.f12066x = r3
            java.lang.Object r7 = r4.l(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r7 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r7
            if (r7 != 0) goto L5e
            com.withpersona.sdk2.inquiry.internal.network.i$b r5 = com.withpersona.sdk2.inquiry.internal.network.i.b.f12104a
            return r5
        L5e:
            com.withpersona.sdk2.inquiry.internal.network.i$a r5 = new com.withpersona.sdk2.inquiry.internal.network.i$a
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.s(java.lang.String, wn.c, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
    
        if (r0 == r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r13, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r14, mt.b<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.t(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        if (r4.i(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r8, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9, mt.b<? super com.withpersona.sdk2.inquiry.internal.network.j> r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.u(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, mt.b):java.lang.Object");
    }
}
