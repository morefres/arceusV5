package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import android.view.l0;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.e;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import go.p2;
import gt.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g1;
import ju.p0;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import mu.c0;
import no.c;
import nq.h;
import nq.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po.j1;
import po.m0;
import po.v0;
import so.x;
import zl.t;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001fB\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00101J\u001b\u00104\u001a\u000203*\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020+¢\u0006\u0004\b?\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lk6/s;", "imageLoader", "Lno/c$a;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "documentSelectWorker", "Lpo/v0;", "localVideoCaptureRenderer", "Lpo/j1;", "webRtcRenderer", "Lpo/m0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lpo/i;", "autoClassificationRenderer", "Ljn/a;", "cameraStatsManager", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "Lju/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lk6/s;Lno/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lpo/v0;Lpo/j1;Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lpo/i;Ljn/a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lju/p0;)V", "renderProps", "renderState", "", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lmt/b;)Ljava/lang/Object;", "g0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "c0", "()V", "Z", "", "V0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "props", "a0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "f0", "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "e0", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lk6/s;", "h", "Lno/c$a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "j", "Lpo/v0;", "k", "Lpo/j1;", "l", "Lpo/m0;", "m", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "n", "Lpo/i;", "o", "Ljn/a;", "p", "Lsq/a;", "q", "Lnq/c;", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "Lso/l;", t.f38095d, "Lso/l;", "videoCaptureHelper", "Lgu/c;", "u", "Lgu/c;", "previousStateClass", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends tr.c<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Screen> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a submitVerificationWorkerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v0 localVideoCaptureRenderer;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j1 webRtcRenderer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m0 captureRenderer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.i autoClassificationRenderer;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.l videoCaptureHelper;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public gu.c<? extends GovernmentIdState> previousStateClass;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$1$1", f = "GovernmentIdStepStateManager.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11096t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11098v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GovernmentIdState governmentIdState, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f11098v = governmentIdState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new a(this.f11098v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11096t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.this;
                GovernmentIdWorkflow.Input value = bVar.b().getValue();
                GovernmentIdState governmentIdState = this.f11098v;
                this.f11096t = 1;
                if (bVar.d0(value, governmentIdState, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$2", f = "GovernmentIdStepStateManager.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b, reason: collision with other inner class name */
    public static final class C0206b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11099t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f11101a;

            public a(b bVar) {
                this.f11101a = bVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.Input input, mt.b<? super Unit> bVar) {
                Object d02;
                b bVar2 = this.f11101a;
                GovernmentIdState i10 = bVar2.d().i();
                return (i10 != null && (d02 = bVar2.d0(input, i10, bVar)) == nt.c.e()) ? d02 : Unit.f22894a;
            }
        }

        public C0206b(mt.b<? super C0206b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new C0206b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11099t;
            if (i10 == 0) {
                o.b(obj);
                c0<GovernmentIdWorkflow.Input> b = b.this.b();
                a aVar = new a(b.this);
                this.f11099t = 1;
                if (b.collect(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((C0206b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        b a(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11102a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.f10747d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.f10748e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.b.f10749f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.b.f10750g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.b.f10751h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11102a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$2", f = "GovernmentIdStepStateManager.kt", l = {223}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11103t;

        public e(mt.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return b.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11103t;
            if (i10 == 0) {
                o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = b.this.applicationContext;
                this.f11103t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            b.this.videoCaptureHelper.a();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$3", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11105t;

        public f(mt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return b.this.new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f11105t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            b.this.e(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$4", f = "GovernmentIdStepStateManager.kt", l = {241}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11107t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11109v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen screen, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f11109v = screen;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return b.this.new g(this.f11109v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11107t;
            if (i10 == 0) {
                o.b(obj);
                c0<Screen> c10 = b.this.c();
                Screen screen = this.f11109v;
                this.f11107t = 1;
                if (c10.emit(screen, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h implements wm.h, kotlin.jvm.internal.h {
        public h() {
        }

        @Override // kotlin.jvm.internal.h
        public final gt.b<?> b() {
            return new kotlin.jvm.internal.k(1, b.this, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // wm.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(GovernmentIdWorkflow.a p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            b.this.e(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wm.h) && (obj instanceof kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class i implements wm.h, kotlin.jvm.internal.h {
        public i() {
        }

        @Override // kotlin.jvm.internal.h
        public final gt.b<?> b() {
            return new kotlin.jvm.internal.k(1, b.this, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // wm.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(GovernmentIdWorkflow.a p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            b.this.e(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wm.h) && (obj instanceof kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class j extends kotlin.jvm.internal.k implements Function1<GovernmentIdWorkflow.a, Unit> {
        public j(Object obj) {
            super(1, obj, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(GovernmentIdWorkflow.a p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((b) this.receiver).e(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.a aVar) {
            d(aVar);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$1", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class k extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11112t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f11113u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11114v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f11115w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar, mt.b<? super k> bVar2) {
            super(1, bVar2);
            this.f11113u = input;
            this.f11114v = governmentIdState;
            this.f11115w = bVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new k(this.f11113u, this.f11114v, this.f11115w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f11112t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (this.f11113u.o().size() == 1) {
                GovernmentIdState governmentIdState = this.f11114v;
                b bVar = this.f11115w;
                GovernmentIdWorkflow.Input input = this.f11113u;
                b.T0(governmentIdState, bVar, input, (IdConfig) CollectionsKt.d0(input.o()), false);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class l extends kotlin.jvm.internal.k implements Function1<GovernmentIdWorkflow.a, Unit> {
        public l(Object obj) {
            super(1, obj, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(GovernmentIdWorkflow.a p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((b) this.receiver).e(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.a aVar) {
            d(aVar);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class m extends kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11116h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b f11117i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f11118j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f11116h = governmentIdState;
            this.f11117i = bVar;
            this.f11118j = input;
        }

        public final void a(IdConfig p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            b.U0(this.f11116h, this.f11117i, this.f11118j, p02, false, 16, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            a(idConfig);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$42", f = "GovernmentIdStepStateManager.kt", l = {899}, m = "invokeSuspend")
    public static final class n extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f11119t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11121v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GovernmentIdState governmentIdState, mt.b<? super n> bVar) {
            super(1, bVar);
            this.f11121v = governmentIdState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return b.this.new n(this.f11121v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f11119t;
            if (i10 == 0) {
                o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = b.this.applicationContext;
                this.f11119t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            b.this.videoCaptureHelper.a();
            b.this.d().p(this.f11121v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull s imageLoader, @NotNull c.a submitVerificationWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker, @NotNull v0 localVideoCaptureRenderer, @NotNull j1 webRtcRenderer, @NotNull m0 captureRenderer, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull po.i autoClassificationRenderer, @NotNull jn.a cameraStatsManager, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager, @NotNull final p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSelectWorker, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(webRtcRenderer, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(captureRenderer, "captureRenderer");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(autoClassificationRenderer, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = themeManager;
        this.videoCaptureHelper = new so.l(null, 1, null);
        if (d().i() == null) {
            f(a0(b().getValue()));
        }
        d().o(new Function1() { // from class: oo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit T;
                T = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.T(ju.p0.this, this, (GovernmentIdState) obj);
                return T;
            }
        });
        ju.k.d(coroutineScope, g1.d(), null, new C0206b(null), 2, null);
    }

    public static final Unit A0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit B0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit C0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit D0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit E0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit F0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit G0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit H0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit I0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit J0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit K0(b bVar) {
        bVar.c0();
        return Unit.f22894a;
    }

    public static final Unit L0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit M0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit N0(b bVar) {
        bVar.Z();
        return Unit.f22894a;
    }

    public static final Unit O0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ShowInstructions.J((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f22894a;
    }

    public static final Unit P0(b bVar, GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, e.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof e.a.c) {
            e.a.c cVar = (e.a.c) it;
            S0(sideIdPart, governmentIdState, bVar, cVar.getAbsoluteFilePath(), cVar.getFileName());
        } else if (Intrinsics.c(it, e.a.C0200a.f10938a)) {
            bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        } else {
            if (!(it instanceof e.a.b)) {
                throw new gt.l();
            }
            bVar.e(new GovernmentIdWorkflow.a.c(((e.a.b) it).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit Q0(final b bVar, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        GovernmentIdState i10 = bVar.d().i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = i10 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) i10 : null;
        if (chooseCaptureMethod == null) {
            return Unit.f22894a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        bVar.f(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.E(), chooseCaptureMethod2.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.D(), chooseCaptureMethod.getPartIndex(), oo.e.e(bVar.d(), false), x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: oo.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit R0;
                R0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.R0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                return R0;
            }
        }, 11776, null));
        return Unit.f22894a;
    }

    public static final Unit R0(b bVar) {
        GovernmentIdState i10 = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final void S0(IdPart.SideIdPart sideIdPart, GovernmentIdState governmentIdState, b bVar, String str, String str2) {
        List d10 = kotlin.collections.o.d(new Frame(str, null, 2, null));
        GovernmentId.b e02 = com.withpersona.sdk2.inquiry.governmentid.n.e0(sideIdPart.getSide());
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(d10, e02, com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), GovernmentId.a.f10503c, null, null, 32, null);
        GovernmentIdState i10 = bVar.d().i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = i10 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) i10 : null;
        if (chooseCaptureMethod2 == null) {
            return;
        }
        bVar.f(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod.getCurrentPart(), chooseCaptureMethod.E(), chooseCaptureMethod.getCaptureConfig(), governmentIdImage, str2, chooseCaptureMethod2.D(), chooseCaptureMethod2.getPartIndex(), oo.e.e(bVar.d(), false), null, null, false, chooseCaptureMethod.getCountryCode(), 1792, null));
    }

    public static final Unit T(p0 p0Var, b bVar, GovernmentIdState governmentIdState) {
        if (governmentIdState == null) {
            return Unit.f22894a;
        }
        ju.k.d(p0Var, g1.d(), null, bVar.new a(governmentIdState, null), 2, null);
        return Unit.f22894a;
    }

    public static final void T0(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10) {
        oo.e.s((GovernmentIdState.ShowInstructions) governmentIdState, bVar.d(), input, null, idConfig, bVar.videoCaptureHelper, new CameraProperties(null, null, null, 0, 0, 31, null), z10, idConfig.f(), 0, null, null, 3584, null);
    }

    public static /* synthetic */ void U0(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        T0(governmentIdState, bVar, input, idConfig, z10);
    }

    public static final Unit b0(b bVar) {
        GovernmentIdState i10 = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit h0(b bVar, GovernmentIdState governmentIdState) {
        bVar.documentSelectWorker.g();
        bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f22894a;
    }

    public static final Unit i0(b bVar) {
        bVar.c0();
        return Unit.f22894a;
    }

    public static final Unit j0(b bVar) {
        bVar.Z();
        return Unit.f22894a;
    }

    public static final Unit k0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f22894a;
    }

    public static final Unit l0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit m0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22894a;
    }

    public static final Unit n0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar) {
        oo.e.u(input, (GovernmentIdState.ReviewImageState) governmentIdState, bVar.d(), bVar.videoCaptureHelper, bVar.trackingEventsLogger);
        return Unit.f22894a;
    }

    public static final Unit o0(final b bVar, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, CaptureConfig captureConfig) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(bVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        GovernmentIdState i10 = bVar.d().i();
        if (i10 != null) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
            GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), i10.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(input, reviewCapturedImage.getCurrentPart().getSide()), i10.D(), i10.getPartIndex(), oo.e.e(bVar.d(), false), bVar.videoCaptureHelper.d() ? x.b : x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: oo.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit p02;
                    p02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.p0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return p02;
                }
            }, 11776, null);
            waitForAutocapture.G(true);
            bVar.f(waitForAutocapture);
        }
        return Unit.f22894a;
    }

    public static final Unit p0(b bVar) {
        GovernmentIdState i10 = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = i10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) i10 : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit q0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit r0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ReviewCapturedImage.O((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f22894a;
    }

    public static final Unit s0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar) {
        oo.e.u(input, (GovernmentIdState.ReviewImageState) governmentIdState, bVar.d(), bVar.videoCaptureHelper, bVar.trackingEventsLogger);
        return Unit.f22894a;
    }

    public static final Unit t0(b bVar) {
        bVar.c0();
        return Unit.f22894a;
    }

    public static final Unit u0(b bVar) {
        bVar.c0();
        return Unit.f22894a;
    }

    public static final Unit v0(b bVar) {
        bVar.Z();
        return Unit.f22894a;
    }

    public static final Unit w0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ReviewSelectedImage.O((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f22894a;
    }

    public static final Unit x0(b bVar, GovernmentIdState governmentIdState, c.b it) {
        GovernmentIdState backState;
        String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof c.b.C0466c) {
            bVar.f(GovernmentIdState.Submit.J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
            bVar.e(GovernmentIdWorkflow.a.d.f10716a);
        } else {
            if (it instanceof c.b.C0465b) {
                c.b.C0465b c0465b = (c.b.C0465b) it;
                if (c0465b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                    string = bVar.applicationContext.getString(tp.g.f32402t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0465b.getCause()).getDetails().getMinDimensionSize()));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = bVar.applicationContext.getString(tp.g.f32403u);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                GovernmentIdState i10 = bVar.d().i();
                backState = i10 != null ? i10.getBackState() : null;
                if (backState != null) {
                    bVar.f(backState.u(string));
                }
            } else {
                if (!(it instanceof c.b.a)) {
                    throw new gt.l();
                }
                GovernmentIdState i11 = bVar.d().i();
                backState = i11 != null ? i11.getBackState() : null;
                c.b.a aVar = (c.b.a) it;
                if ((aVar.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar.getCause()).isRecoverable() && backState != null) {
                    String string2 = bVar.applicationContext.getString(tp.g.B);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    bVar.f(backState.u(string2));
                } else {
                    bVar.f(GovernmentIdState.Submit.J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
                    bVar.e(new GovernmentIdWorkflow.a.c(aVar.getCause()));
                }
            }
        }
        return Unit.f22894a;
    }

    public static final Unit y0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit z0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public final boolean V0(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return true;
        }
        if (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) {
            return this.videoCaptureHelper.c(input) && input.getAutoClassificationConfig().getIsEnabled();
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return false;
        }
        throw new gt.l();
    }

    public final void Z() {
        e(GovernmentIdWorkflow.a.b.f10714a);
    }

    @NotNull
    public final GovernmentIdState a0(@NotNull GovernmentIdWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (!props.getAutoClassificationConfig().getIsEnabled()) {
            return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
        }
        if (props.u()) {
            return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.b.f10747d), p.k(), p.k(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
        }
        return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.b.f10747d), p.k(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == go.d.b ? Screen.b.a.f10815c : Screen.b.a.b, p.k(), 0, null, x.f31613c, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, new Function0() { // from class: oo.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b02;
                b02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.b0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                return b02;
            }
        }, 11776, null);
    }

    public final void c0() {
        GovernmentIdState i10 = d().i();
        GovernmentIdState backState = i10 != null ? i10.getBackState() : null;
        this.videoCaptureHelper.a();
        if (backState != null) {
            backState.G(true);
            f(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(GovernmentIdWorkflow.a.C0197a.f10713a);
        } else {
            e(GovernmentIdWorkflow.a.b.f10714a);
        }
    }

    public final Object d0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, mt.b<? super Unit> bVar) {
        Screen g02 = g0(input, governmentIdState);
        if (!V0(governmentIdState, input)) {
            d().m("close_camera", new e(null));
        }
        if (!this.videoCaptureHelper.f(input) && hq.g.e(this.applicationContext)) {
            d().m("output_webrtc_error", new f(null));
        }
        Object g10 = ju.i.g(g1.c(), new g(g02, null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public final void e0() {
        this.videoCaptureHelper.a();
        this.cameraStatsManager.a();
    }

    public final void f0(@NotNull File file, @NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        GovernmentIdState i10 = d().i();
        GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = i10 instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) i10 : null;
        if (finalizeLocalVideoCapture == null) {
            return;
        }
        GovernmentIdWorkflow.Input value = b().getValue();
        TrackingEventsLogger.logVideoStopEvent$default(this.trackingEventsLogger, value.getFromStep(), "Upload", null, null, null, null, false, 124, null);
        List<GovernmentId> E = finalizeLocalVideoCapture.E();
        ArrayList arrayList = new ArrayList(q.u(E, 10));
        Iterator<T> it = E.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.b bVar = GovernmentId.b.f10506a;
        boolean contains = arrayList.contains(bVar);
        GovernmentId.b bVar2 = GovernmentId.b.b;
        boolean contains2 = arrayList.contains(bVar2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List d10 = kotlin.collections.o.d(new Frame(absolutePath, "video/*"));
        if (contains && contains2) {
            bVar = GovernmentId.b.f10507c;
        } else if (!contains && contains2) {
            bVar = bVar2;
        }
        oo.e.s(finalizeLocalVideoCapture, d(), value, new GovernmentId.GovernmentIdVideo(d10, bVar, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.a.b), finalizeLocalVideoCapture.getId(), this.videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    public final Screen g0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState) {
        nq.h takePhoto;
        final GovernmentIdWorkflow.Input input;
        boolean z10;
        gu.c<? extends GovernmentIdState> b = d0.b(renderState.getClass());
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit), false, 8, null);
        boolean z11 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z11) {
            takePhoto = h.a.f27296a;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = h.b.f27297a;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = h.C0470h.f27303a;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new h.Prompt(((GovernmentIdState.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof GovernmentIdState.WaitForAutocapture) || (renderState instanceof GovernmentIdState.CountdownToCapture) || (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (renderState instanceof GovernmentIdState.FinalizeWebRtc) || (renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new h.Check(((GovernmentIdState.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new h.CheckUpload(((GovernmentIdState.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.Submit) {
            takePhoto = h.e.f27300a;
        } else {
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new gt.l();
            }
            takePhoto = h.g.f27302a;
        }
        this.externalEventLogger.c(new i.c(renderProps.getFromStep(), takePhoto));
        RemoteImage remoteImage = null;
        if (!Intrinsics.c(this.previousStateClass, b)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.c(b, d0.b(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.b Q = com.withpersona.sdk2.inquiry.governmentid.n.Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, Q != null ? com.withpersona.sdk2.inquiry.governmentid.n.d0(Q) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = b;
        }
        uq.l lVar = renderState.getDidGoBack() ? uq.l.b : uq.l.f33106a;
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            d().m("check_if_single_id_class", new k(renderProps, renderState, this, null));
            return new Screen.e(renderProps.getStrings().getTitle(), renderProps.getStrings().getPrompt(), renderProps.getStrings().getChoose(), renderProps.getStrings().getInstructionsDisclaimer(), oo.e.m(renderProps), this.navigationStateManager.b(), new m(renderState, this, renderProps), renderProps.getStyles(), renderProps.getAssetConfig().getSelectPage(), renderProps.getIsEnabled(), new Function0() { // from class: oo.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit K0;
                    K0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.K0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return K0;
                }
            }, new Function0() { // from class: oo.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit N0;
                    N0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.N0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return N0;
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: oo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit O0;
                    O0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.O0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState);
                    return O0;
                }
            }, this.themeManager.a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), lVar);
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdPart.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                d().n(this.documentSelectWorker, new Function1() { // from class: oo.l0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit P0;
                        P0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.P0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState, currentPart, (e.a) obj);
                        return P0;
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> n10 = renderProps.n();
            String j10 = oo.e.j(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String i10 = oo.e.i(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState b10 = this.navigationStateManager.b();
            Function0 function0 = new Function0() { // from class: oo.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Q0;
                    Q0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.Q0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState, renderProps);
                    return Q0;
                }
            };
            Function0 function02 = new Function0() { // from class: oo.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit h02;
                    h02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.h0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState);
                    return h02;
                }
            };
            Function0 function03 = new Function0() { // from class: oo.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit i02;
                    i02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.i0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return i02;
                }
            };
            Function0 function04 = new Function0() { // from class: oo.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit j02;
                    j02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.j0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return j02;
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function05 = new Function0() { // from class: oo.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit k02;
                    k02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.k0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState);
                    return k02;
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.b side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = d.f11102a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new gt.l();
                            }
                            if (promptPage != null) {
                                remoteImage = promptPage.getPassportSignaturePictograph();
                            }
                        } else if (promptPage != null) {
                            remoteImage = promptPage.getBarcodePdf417Pictograph();
                        }
                    }
                } else if (promptPage != null) {
                    remoteImage = promptPage.getIdBackPictograph();
                }
            } else if (com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.f27224j) {
                if (promptPage != null) {
                    remoteImage = promptPage.getPassportFrontPictograph();
                }
            } else if (promptPage != null) {
                remoteImage = promptPage.getIdFrontPictograph();
            }
            RemoteImage remoteImage2 = remoteImage;
            int i12 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            int i13 = i12 != 1 ? (i12 == 2 || i12 == 4) ? p2.f18743d : p2.f18744e : com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.f27224j ? p2.f18745f : p2.f18744e;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.c(n10, j10, i10, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, b10, function0, function02, function03, function04, error, function05, styles, remoteImage2, i13, requestPageNavBarTitle, lVar);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.Q(this.applicationContext, renderProps, (GovernmentIdState.WaitForAutocapture) renderState, d(), this.videoCaptureHelper, new h(), new Function1() { // from class: oo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit l02;
                    l02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.l0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return l02;
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.E(renderProps, (GovernmentIdState.CountdownToCapture) renderState, d(), this.videoCaptureHelper, new i(), new Function1() { // from class: oo.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit m02;
                    m02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.m0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return m02;
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.d0(reviewCapturedImage.getIdForReview().f3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                z10 = true;
                oo.e.v(renderProps, (GovernmentIdState.ReviewImageState) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new j(this));
                input = renderProps;
            } else {
                input = renderProps;
                z10 = true;
            }
            return new Screen.h(this.imageLoader, oo.e.k(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), input.getStrings().getCaptureDisclaimer(), d10.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig), this.navigationStateManager.b(), new Function0() { // from class: oo.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit n02;
                    n02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.n0(GovernmentIdWorkflow.Input.this, renderState, this);
                    return n02;
                }
            }, input.getStrings().getButtonSubmit(), new Function0() { // from class: oo.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit o02;
                    o02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.o0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState, input, captureConfig);
                    return o02;
                }
            }, input.getStrings().getButtonRetake(), oo.e.l(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: oo.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit q02;
                    q02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.q0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return q02;
                }
            }, input.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: oo.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit r02;
                    r02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.r0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState);
                    return r02;
                }
            }, input.getAssetConfig().getCapturePage(), (!input.getIsEnabled() || reviewCapturedImage.getSubmittingForAutoClassification()) ? false : z10, reviewCapturedImage.getSubmittingForAutoClassification(), input.getReviewCaptureButtonsAxis(), input.getDesignVersion(), (this.videoCaptureHelper.c(input) && input.getAutoClassificationConfig().getIsEnabled()) ? z10 : false, input.getStrings().getCheckPageNavBarTitle(), lVar);
        }
        final GovernmentIdWorkflow.Input input2 = renderProps;
        if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            IdPart.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                oo.e.v(renderProps, (GovernmentIdState.ReviewImageState) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new l(this));
                input2 = renderProps;
            }
            s sVar = this.imageLoader;
            String o8 = oo.e.o(input2.getStrings(), currentPart2.getSide());
            String n11 = oo.e.n(input2.getStrings(), currentPart2.getSide());
            String reviewSelectedImageConfirmButton = input2.getStrings().getReviewSelectedImageConfirmButton();
            String reviewSelectedImageChooseAnotherButton = input2.getStrings().getReviewSelectedImageChooseAnotherButton();
            String absoluteFilePath = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getAbsoluteFilePath();
            String mimeType = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getMimeType();
            String fileName = reviewSelectedImage.getFileName();
            NavigationState b11 = this.navigationStateManager.b();
            String error2 = reviewSelectedImage.getError();
            boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
            StepStyles.GovernmentIdStepStyle styles2 = input2.getStyles();
            String reviewUploadPageNavBarTitle = input2.getStrings().getReviewUploadPageNavBarTitle();
            if (reviewUploadPageNavBarTitle == null) {
                reviewUploadPageNavBarTitle = input2.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.i(sVar, o8, n11, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, b11, new Function0() { // from class: oo.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit s02;
                    s02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.s0(GovernmentIdWorkflow.Input.this, renderState, this);
                    return s02;
                }
            }, new Function0() { // from class: oo.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit t02;
                    t02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.t0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return t02;
                }
            }, new Function0() { // from class: oo.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit u02;
                    u02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.u0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return u02;
                }
            }, new Function0() { // from class: oo.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit v02;
                    v02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.v0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return v02;
                }
            }, error2, new Function0() { // from class: oo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit w02;
                    w02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.w0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState);
                    return w02;
                }
            }, styles2, submittingForAutoClassification, reviewUploadPageNavBarTitle, lVar);
        }
        if (renderState instanceof GovernmentIdState.Submit) {
            GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
            if (!submit.getHasSubmitted()) {
                d().n(this.submitVerificationWorkerFactory.a(input2.getSessionToken(), input2.getInquiryId(), input2.getFromComponent(), input2.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), new Function1() { // from class: oo.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit x02;
                        x02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.x0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, renderState, (c.b) obj);
                        return x02;
                    }
                });
            }
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = input2.getCustomPendingPage();
            return customPendingPage != null ? new Screen.f(yq.b.a(customPendingPage), this.navigationStateManager.b(), input2.getStyles(), new Function0() { // from class: oo.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit y02;
                    y02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.y0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return y02;
                }
            }, new Function0() { // from class: oo.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit z02;
                    z02 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.z0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return z02;
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), false, lVar, 64, null) : new Screen.j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: oo.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit A0;
                    A0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.A0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return A0;
                }
            }, new Function0() { // from class: oo.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit B0;
                    B0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.B0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return B0;
                }
            }, input2.getPendingPageTextVerticalPosition(), false, input2.getStrings().getPendingPageNavBarTitle(), lVar, 256, null);
        }
        if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
            if (!input2.getAutoClassificationConfig().getIsEnabled()) {
                return this.localVideoCaptureRenderer.i(input2, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit G0;
                        G0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.G0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                        return G0;
                    }
                }, lVar);
            }
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage2 = input2.getCustomPendingPage();
            return customPendingPage2 != null ? new Screen.f(yq.b.a(customPendingPage2), this.navigationStateManager.b(), input2.getStyles(), new Function0() { // from class: oo.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit C0;
                    C0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.C0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return C0;
                }
            }, new Function0() { // from class: oo.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit D0;
                    D0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.D0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return D0;
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), true, lVar) : new Screen.j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: oo.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit E0;
                    E0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.E0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return E0;
                }
            }, new Function0() { // from class: oo.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F0;
                    F0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.F0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this);
                    return F0;
                }
            }, input2.getPendingPageTextVerticalPosition(), true, input2.getStrings().getPendingPageNavBarTitle(), lVar);
        }
        if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
            return renderProps.getAutoClassificationConfig().getIsEnabled() ? this.webRtcRenderer.u(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit H0;
                    H0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.H0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return H0;
                }
            }, lVar) : this.webRtcRenderer.m(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit I0;
                    I0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.I0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return I0;
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.HolographicTorchDelay) {
            return this.captureRenderer.M(renderProps, (GovernmentIdState.HolographicTorchDelay) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.i0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit J0;
                    J0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.J0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return J0;
                }
            });
        }
        if (z11) {
            return this.autoClassificationRenderer.i(renderProps, (GovernmentIdState.AutoClassificationError) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit L0;
                    L0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.L0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return L0;
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            return this.autoClassificationRenderer.m(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit M0;
                    M0 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.M0(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.this, (GovernmentIdWorkflow.a) obj);
                    return M0;
                }
            }, lVar);
        }
        if (!(renderState instanceof GovernmentIdState.RestartStep)) {
            throw new gt.l();
        }
        d().m("restart_step", new n(a0(renderProps), null));
        return new Screen.g(null, 1, null);
    }
}
