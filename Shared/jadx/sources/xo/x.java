package xo;

import android.app.Application;
import android.net.Uri;
import android.view.y0;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.List;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.r0;
import nq.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.ScreenState;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 p2\u00020\u0001:\u0002\u0080\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\b048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR*\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u0017\u0010R\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\b<\u0010QR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0006¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\b/\u0010VR#\u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006¢\u0006\u0012\n\u0004\b+\u0010Z\u0012\u0004\b]\u0010\u0015\u001a\u0004\b[\u0010\\R#\u0010b\u001a\b\u0012\u0004\u0012\u00020_0S8\u0006¢\u0006\u0012\n\u0004\b`\u0010U\u0012\u0004\ba\u0010\u0015\u001a\u0004\bK\u0010VR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010f\u001a\u0004\bg\u0010hR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010f\u001a\u0004\bk\u0010hR,\u0010q\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR2\u0010s\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bG\u0010hR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010f\u001a\u0004\bt\u0010hR.\u0010v\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\u0006\u0012\u0004\u0018\u00010j0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010f\u001a\u0004\bC\u0010hR&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010f\u001a\u0004\bo\u0010hR&\u0010|\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020{0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010f\u001a\u0004\b`\u0010hR&\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010f\u001a\u0004\b5\u0010h¨\u0006\u0081\u0001"}, d2 = {"Lxo/x;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/l0;)V", "", "foregrounded", "", "E", "(Z)V", "Lg/b;", "activityResultCaller", "G", "(Lg/b;)V", "B", "newValue", "I", rl.d.f30696a, "()V", "F", "D", "C", "force", "skipBackendCall", "e", "(ZZ)V", "c", "Landroid/app/Application;", "Landroidx/lifecycle/l0;", "w", "()Landroidx/lifecycle/l0;", "Lxo/s;", "Lxo/s;", "f", "()Lxo/s;", "H", "(Lxo/s;)V", "component", "", "J", "o", "()J", "inquiryStartTimeMs", "Loq/c;", "g", "Loq/c;", "y", "()Loq/c;", "sdkFilesManager", "Lmu/p0;", "h", "Lmu/p0;", "m", "()Lmu/p0;", "forceFallbackModeFlow", "Landroidx/lifecycle/d0;", "", "i", "Landroidx/lifecycle/d0;", "n", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "j", "A", "setSessionToken", "sessionToken", "k", "r", "setLastStep", "lastStep", "l", "q", "setLastPage", "lastPage", "Lkq/e;", "Lkq/e;", "()Lkq/e;", "dataCollector", "Lmu/b0;", "Lnq/a;", "Lmu/b0;", "()Lmu/b0;", "controllerRequestFlow", "Lmu/c0;", "Luo/c;", "Lmu/c0;", "x", "()Lmu/c0;", "getScreenStateFlow$annotations", "screenStateFlow", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "p", "getEventFlow$annotations", "eventFlow", "Lkp/h0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Lkp/h0;", "v", "()Lkp/h0;", "resolvableApiLauncher", "Landroid/net/Uri;", zl.t.f38095d, "pictureLaunchResultLauncher", "Lg/h;", "", "s", "z", "selectFromPhotoLibraryLauncher", "", "documentsSelectResultLauncher", "u", "requestPermissionResultLauncher", "documentSelectResultLauncher", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "jpMyNumberNfcReaderLauncher", "Lkp/b;", "", "customTabsLauncher", j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x extends android.view.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application application;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.l0 savedStateHandle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public s component;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long inquiryStartTimeMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.p0<Boolean> forceFallbackModeFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public android.view.d0<String> inquiryId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public android.view.d0<String> sessionToken;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public android.view.d0<String> lastStep;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public android.view.d0<String> lastPage;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.e dataCollector;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.b0<nq.a> controllerRequestFlow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.c0<ScreenState> screenStateFlow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.b0<InquiryEvent> eventFlow;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<IntentSenderRequest, ActivityResult> resolvableApiLauncher;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<Uri, Boolean> pictureLaunchResultLauncher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<g.h, List<Uri>> selectFromPhotoLibraryLauncher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<String[], List<Uri>> documentsSelectResultLauncher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<String, Boolean> requestPermissionResultLauncher;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<String[], Uri> documentSelectResultLauncher;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<PassportNfcReaderConfig, PassportNfcReaderOutput> passportNfcReaderLauncher;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> jpMyNumberNfcReaderLauncher;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kp.h0<kp.b, Integer> customTabsLauncher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35938t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35939u;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1", f = "InquiryViewModel.kt", l = {106}, m = "invokeSuspend")
        /* renamed from: xo.x$a$a, reason: collision with other inner class name */
        public static final class C0658a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f35941t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x f35942u;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: xo.x$a$a$a, reason: collision with other inner class name */
            public static final class C0659a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x f35943a;

                public C0659a(x xVar) {
                    this.f35943a = xVar;
                }

                @Override // mu.i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryActivityEvent inquiryActivityEvent, mt.b<? super Unit> bVar) {
                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                        this.f35943a.e(true, ((InquiryActivityEvent.CancelInquiry) inquiryActivityEvent).getSkipBackendCall());
                    }
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0658a(x xVar, mt.b<? super C0658a> bVar) {
                super(2, bVar);
                this.f35942u = xVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0658a(this.f35942u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f35941t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    mu.g0<InquiryActivityEvent> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                    C0659a c0659a = new C0659a(this.f35942u);
                    this.f35941t = 1;
                    if (eventFlow.collect(c0659a, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                throw new gt.d();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((C0658a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2", f = "InquiryViewModel.kt", l = {114}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f35944t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x f35945u;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: xo.x$a$b$a, reason: collision with other inner class name */
            public static final class C0660a<T> implements mu.i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x f35946a;

                public C0660a(x xVar) {
                    this.f35946a = xVar;
                }

                @Override // mu.i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryEvent inquiryEvent, mt.b<? super Unit> bVar) {
                    OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                    if (onEventListener != null) {
                        onEventListener.onEvent(inquiryEvent);
                    }
                    if (inquiryEvent instanceof InquiryEvent.PageChange) {
                        InquiryEvent.PageChange pageChange = (InquiryEvent.PageChange) inquiryEvent;
                        this.f35946a.r().o(pageChange.getName());
                        this.f35946a.q().o(pageChange.getPath());
                    }
                    return Unit.f22894a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x xVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f35945u = xVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f35945u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f35944t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    mu.b0<InquiryEvent> l10 = this.f35945u.l();
                    C0660a c0660a = new C0660a(this.f35945u);
                    this.f35944t = 1;
                    if (l10.collect(c0660a, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                throw new gt.d();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = x.this.new a(bVar);
            aVar.f35939u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            ju.p0 p0Var = (ju.p0) this.f35939u;
            nt.c.e();
            if (this.f35938t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            ju.k.d(p0Var, null, null, new C0658a(x.this, null), 3, null);
            ju.k.d(p0Var, g1.c(), null, new b(x.this, null), 2, null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", f = "InquiryViewModel.kt", l = {199}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35947t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f35949v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f35950w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f35949v = z10;
            this.f35950w = z11;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return x.this.new c(this.f35949v, this.f35950w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f35947t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.b0<nq.a> g10 = x.this.g();
                a.CancelRequest cancelRequest = new a.CancelRequest(this.f35949v, this.f35950w);
                this.f35947t = 1;
                if (g10.emit(cancelRequest, this) == e10) {
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
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f35951t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f35952u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ x f35953v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, x xVar, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f35952u = z10;
            this.f35953v = xVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f35952u, this.f35953v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            TrackingEventsLogger b;
            TrackingEventsLogger b10;
            nt.c.e();
            if (this.f35951t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f35952u) {
                s component = this.f35953v.getComponent();
                if (component != null && (b10 = component.b()) != null) {
                    TrackingEventsLogger.logForegroundEvent$default(b10, this.f35953v.r().f(), this.f35953v.q().f(), false, 4, null);
                }
            } else {
                s component2 = this.f35953v.getComponent();
                if (component2 != null && (b = component2.b()) != null) {
                    TrackingEventsLogger.logBackgroundEvent$default(b, this.f35953v.r().f(), this.f35953v.q().f(), false, 4, null);
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Application application, @NotNull android.view.l0 savedStateHandle) {
        super(application);
        long j10;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.application = application;
        this.savedStateHandle = savedStateHandle;
        Long l10 = (Long) savedStateHandle.b("inquiry_start_time_ms");
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            savedStateHandle.i("inquiry_start_time_ms", Long.valueOf(currentTimeMillis));
            j10 = currentTimeMillis;
        }
        this.inquiryStartTimeMs = j10;
        this.sdkFilesManager = new oq.c(application);
        this.forceFallbackModeFlow = savedStateHandle.f("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.lastStep = savedStateHandle.c("last_step", null);
        this.lastPage = savedStateHandle.c("last_page", null);
        this.dataCollector = new kq.e(savedStateHandle);
        this.controllerRequestFlow = mu.i0.b(0, 0, null, 7, null);
        this.screenStateFlow = r0.a(new ScreenState(false, false, true, false));
        this.eventFlow = mu.i0.b(0, 0, null, 7, null);
        this.resolvableApiLauncher = kp.e0.b();
        this.pictureLaunchResultLauncher = kp.m.h();
        this.selectFromPhotoLibraryLauncher = kp.m.f();
        this.documentsSelectResultLauncher = kp.m.d();
        this.requestPermissionResultLauncher = kp.y.b();
        this.documentSelectResultLauncher = kp.s.b();
        this.passportNfcReaderLauncher = op.g.b();
        this.jpMyNumberNfcReaderLauncher = jp.e.b();
        this.customTabsLauncher = kp.f.b();
        ju.k.d(y0.a(this), g1.a(), null, new a(null), 2, null);
    }

    @NotNull
    public final android.view.d0<String> A() {
        return this.sessionToken;
    }

    public final void B(@NotNull g.b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        G(activityResultCaller);
    }

    public final void C() {
        E(false);
    }

    public final void D() {
        E(true);
    }

    public final void E(boolean foregrounded) {
        ju.k.d(y0.a(this), g1.a(), null, new d(foregrounded, this, null), 2, null);
    }

    public final void F() {
        wn.k c10;
        s sVar = this.component;
        if (sVar == null || (c10 = sVar.c()) == null) {
            return;
        }
        c10.a();
    }

    public final void G(g.b activityResultCaller) {
        this.resolvableApiLauncher.e(activityResultCaller);
        this.pictureLaunchResultLauncher.e(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.e(activityResultCaller);
        this.documentsSelectResultLauncher.e(activityResultCaller);
        this.requestPermissionResultLauncher.e(activityResultCaller);
        this.documentSelectResultLauncher.e(activityResultCaller);
        this.passportNfcReaderLauncher.e(activityResultCaller);
        this.jpMyNumberNfcReaderLauncher.e(activityResultCaller);
        this.customTabsLauncher.e(activityResultCaller);
    }

    public final void H(@Nullable s sVar) {
        this.component = sVar;
    }

    public final void I(boolean newValue) {
        this.savedStateHandle.i("force_fallback_mode", Boolean.valueOf(newValue));
    }

    @Override // android.view.x0
    public void d() {
        k6.s e10;
        s sVar = this.component;
        if (sVar != null && (e10 = sVar.e()) != null) {
            e10.shutdown();
        }
        super.d();
    }

    public final void e(boolean force, boolean skipBackendCall) {
        ju.k.d(y0.a(this), g1.a(), null, new c(force, skipBackendCall, null), 2, null);
    }

    @Nullable
    /* renamed from: f, reason: from getter */
    public final s getComponent() {
        return this.component;
    }

    @NotNull
    public final mu.b0<nq.a> g() {
        return this.controllerRequestFlow;
    }

    @NotNull
    public final kp.h0<kp.b, Integer> h() {
        return this.customTabsLauncher;
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    public final kq.e getDataCollector() {
        return this.dataCollector;
    }

    @NotNull
    public final kp.h0<String[], Uri> j() {
        return this.documentSelectResultLauncher;
    }

    @NotNull
    public final kp.h0<String[], List<Uri>> k() {
        return this.documentsSelectResultLauncher;
    }

    @NotNull
    public final mu.b0<InquiryEvent> l() {
        return this.eventFlow;
    }

    @NotNull
    public final mu.p0<Boolean> m() {
        return this.forceFallbackModeFlow;
    }

    @NotNull
    public final android.view.d0<String> n() {
        return this.inquiryId;
    }

    /* renamed from: o, reason: from getter */
    public final long getInquiryStartTimeMs() {
        return this.inquiryStartTimeMs;
    }

    @NotNull
    public final kp.h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> p() {
        return this.jpMyNumberNfcReaderLauncher;
    }

    @NotNull
    public final android.view.d0<String> q() {
        return this.lastPage;
    }

    @NotNull
    public final android.view.d0<String> r() {
        return this.lastStep;
    }

    @NotNull
    public final kp.h0<PassportNfcReaderConfig, PassportNfcReaderOutput> s() {
        return this.passportNfcReaderLauncher;
    }

    @NotNull
    public final kp.h0<Uri, Boolean> t() {
        return this.pictureLaunchResultLauncher;
    }

    @NotNull
    public final kp.h0<String, Boolean> u() {
        return this.requestPermissionResultLauncher;
    }

    @NotNull
    public final kp.h0<IntentSenderRequest, ActivityResult> v() {
        return this.resolvableApiLauncher;
    }

    @NotNull
    /* renamed from: w, reason: from getter */
    public final android.view.l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    public final mu.c0<ScreenState> x() {
        return this.screenStateFlow;
    }

    @NotNull
    /* renamed from: y, reason: from getter */
    public final oq.c getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    @NotNull
    public final kp.h0<g.h, List<Uri>> z() {
        return this.selectFromPhotoLibraryLauncher;
    }
}
