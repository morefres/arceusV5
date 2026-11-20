package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import cn.AlertContainerScreen;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.e;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import go.p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.t0;
import ju.p0;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import no.c;
import nq.h;
import nq.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.v;
import so.x;
import wm.Snapshot;
import wm.k;
import wm.r;
import wm.w;
import wm.z;
import ym.q;
import zl.t;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002zVBy\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#JC\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b(\u0010)J;\u0010,\u001a\u00020+2\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020+2\u001c\u00100\u001a\u00180.R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u000203*\u00020\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\b\u0012\u0004\u0012\u00020\u000508*\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020;*\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u0004\u0018\u000106*\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010?J-\u0010E\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bE\u0010FJ-\u0010G\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bG\u0010FJ-\u0010H\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u0002062\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bH\u0010FJ\u001b\u0010I\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u000206*\u00020@2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bK\u0010JJ\u0017\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010=J!\u0010Q\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJC\u0010S\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\"\u0010'\u001a\u001e0&R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bS\u0010)J\u0019\u0010T\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020\u0003H\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010y\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lk6/s;", "imageLoader", "Lno/c$a;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "documentSelectWorker", "Lso/j;", "localVideoCaptureRenderer", "Lso/v;", "webRtcRenderer", "Ljo/t0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lho/n;", "autoClassificationRenderer", "Ljn/a;", "cameraStatsManager", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "<init>", "(Landroid/content/Context;Lk6/s;Lno/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lso/j;Lso/v;Ljo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lho/n;Ljn/a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;)V", "renderProps", "renderState", "Lwm/k$a;", "context", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lwm/k$a;)Ljava/lang/Object;", "output", "", "b1", "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V", "Lwm/r$c;", "Lwm/r;", "updater", "c1", "(Lwm/r$c;)V", "Luq/m;", "f1", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Luq/m;", "", "name", "Lym/m;", "h0", "(Ljava/lang/Object;Ljava/lang/String;)Lym/m;", "", "e1", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Z", "e0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "selectedId", "countryCode", "a0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Z", "b0", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "c0", "state", "g0", "props", "Lwm/i;", "snapshot", "f0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "i0", "d1", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lwm/i;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lk6/s;", "c", "Lno/c$a;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "e", "Lso/j;", "f", "Lso/v;", "g", "Ljo/t0;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "i", "Lho/n;", "j", "Ljn/a;", "k", "Lsq/a;", "l", "Lnq/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "Lso/l;", "o", "Lso/l;", "videoCaptureHelper", "Lgu/c;", "p", "Lgu/c;", "previousStateClass", "Input", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GovernmentIdWorkflow extends wm.k<Input, GovernmentIdState, a, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a submitVerificationWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.j localVideoCaptureRenderer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v webRtcRenderer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t0 captureRenderer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ho.n autoClassificationRenderer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.l videoCaptureHelper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public gu.c<? extends GovernmentIdState> previousStateClass;

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bF\b\u0007\u0018\u00002\u00020\u0001:\u0001|B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0014¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010LR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u00103R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\b[\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bB\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b_\u0010LR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b[\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b\\\u0010eR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bI\u0010f\u001a\u0004\b:\u0010gR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bG\u0010K\u001a\u0004\b \u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bH\u0010jR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bX\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bE\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010)\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\bu\u0010LR\u0019\u0010*\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b]\u0010`\u001a\u0004\bk\u0010bR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bY\u0010wR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010;\u001a\u0004\bc\u0010=R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\bm\u0010y\u001a\u0004\bS\u0010zR\u0011\u0010{\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bh\u0010L¨\u0006}"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "strings", "", "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", "", "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "Lgo/d;", "designVersion", "flowWatermarkText", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lgo/d;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", ve.a.f33391e, "Ljava/lang/String;", "y", "()Ljava/lang/String;", j6.b.f21518e, "j", "c", "Ljava/util/List;", "o", "()Ljava/util/List;", rl.d.f30696a, "x", "e", t.f38095d, "f", "s", "g", "Z", "()Z", "h", "i", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "I", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "k", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "G", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "l", "w", "m", "p", "q", "J", "z", "()J", "D", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "r", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "u", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "getDigitalIdConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "E", "Lgo/d;", "()Lgo/d;", "B", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "hasMultipleCaptureOptions", "Strings", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata */
        @NotNull
        public final go.d designVersion;

        /* renamed from: B, reason: from kotlin metadata */
        @Nullable
        public final String flowWatermarkText;

        /* renamed from: C, reason: from kotlin metadata */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String countryCode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<IdConfig> enabledIdClasses;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final boolean backStepEnabled;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final boolean cancelButtonEnabled;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Strings strings;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final int imageCaptureCount;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fieldKeyDocument;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fieldKeyIdClass;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final long manualCaptureButtonDelayMs;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final boolean shouldSkipReviewScreen;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer theme;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final NextStep.GovernmentId.AssetConfig assetConfig;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final boolean isEnabled;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AutoClassificationConfig autoClassificationConfig;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final DigitalIdConfig digitalIdConfig;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        public final boolean staticCaptureTipsEnabled;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer holographicTorchEnabledDurationMs;

        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b_\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G¢\u0006\u0004\bJ\u0010KJ\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001d\u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020L¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020LHÖ\u0001¢\u0006\u0004\bW\u0010NJ\u001a\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010XHÖ\u0003¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010VR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010VR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010VR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010^\u001a\u0004\be\u0010VR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bg\u0010VR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010VR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010VR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010VR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010VR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010VR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bh\u0010VR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bw\u0010t\u001a\u0004\bx\u0010vR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010vR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b{\u0010^\u001a\u0004\b|\u0010VR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b}\u0010t\u001a\u0004\b~\u0010vR\u0018\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010^\u001a\u0005\b\u0080\u0001\u0010VR\u0018\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010^\u001a\u0004\by\u0010VR\u0018\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010^\u001a\u0004\bw\u0010VR\u0018\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bi\u0010t\u001a\u0005\b\u0082\u0001\u0010vR\u0018\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bx\u0010^\u001a\u0005\b\u0083\u0001\u0010VR\u0018\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bu\u0010^\u001a\u0005\b\u0084\u0001\u0010VR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\b|\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\bk\u0010t\u001a\u0005\b\u0088\u0001\u0010vR\u0019\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010t\u001a\u0005\b\u008a\u0001\u0010vR\u0018\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bc\u0010^\u001a\u0005\b\u008b\u0001\u0010VR\u0019\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010^\u001a\u0005\b\u008c\u0001\u0010VR'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0085\u0001\u001a\u0006\b\u008e\u0001\u0010\u0087\u0001R'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0085\u0001\u001a\u0006\b\u008f\u0001\u0010\u0087\u0001R\u0019\u0010#\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0090\u0001\u0010VR\u0019\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010VR\u001b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010VR\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u007f\u0010VR\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0093\u0001\u0010^\u001a\u0004\b{\u0010VR\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010^\u001a\u0004\b}\u0010VR\u001b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010^\u001a\u0005\b\u0095\u0001\u0010VR\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010VR\u001b\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010^\u001a\u0005\b\u0099\u0001\u0010VR\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010^\u001a\u0005\b\u009b\u0001\u0010VR\u001b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010^\u001a\u0005\b\u0098\u0001\u0010VR\u001b\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010^\u001a\u0005\b\u009c\u0001\u0010VR\u001b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010^\u001a\u0005\b\u0096\u0001\u0010VR\u001a\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u009f\u0001\u0010^\u001a\u0004\br\u0010VR\u001a\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b \u0001\u0010^\u001a\u0004\bp\u0010VR\u001a\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¡\u0001\u0010^\u001a\u0004\bn\u0010VR\u001a\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b¢\u0001\u0010^\u001a\u0004\bj\u0010VR\u001b\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010^\u001a\u0005\b¤\u0001\u0010VR\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010^\u001a\u0005\b¥\u0001\u0010VR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010^\u001a\u0005\b§\u0001\u0010VR\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010^\u001a\u0005\b©\u0001\u0010VR\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010^\u001a\u0005\b \u0001\u0010VR\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010^\u001a\u0005\b\u009f\u0001\u0010VR\u001b\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010^\u001a\u0005\b\u009e\u0001\u0010VR\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010^\u001a\u0005\b\u009d\u0001\u0010VR\u001b\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010^\u001a\u0005\b\u00ad\u0001\u0010VR\u001b\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010^\u001a\u0005\b®\u0001\u0010VR\u001b\u0010>\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010^\u001a\u0005\b°\u0001\u0010VR\u001b\u0010?\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010^\u001a\u0005\b±\u0001\u0010VR\u001b\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010^\u001a\u0005\b£\u0001\u0010VR\u001a\u0010A\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\be\u0010^\u001a\u0005\b¢\u0001\u0010VR\u001b\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010^\u001a\u0005\b\u0094\u0001\u0010VR\u001b\u0010C\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010^\u001a\u0005\b¡\u0001\u0010VR\u001b\u0010D\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010^\u001a\u0005\b¶\u0001\u0010VR\u001b\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010^\u001a\u0005\bµ\u0001\u0010VR\u001a\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0099\u0001\u0010^\u001a\u0004\b]\u0010VR#\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G8\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010·\u0001\u001a\u0006\b³\u0001\u0010¸\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Landroid/os/Parcelable;", "", Title.type, "prompt", "choose", "instructionsDisclaimer", "selectPageNavBarTitle", "capturePageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "requestPageNavBarTitle", "reviewUploadPageNavBarTitle", "autoClassificationPageNavBarTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "captureScreenTitle", "captureScreenDescription", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", "", "idClassToName", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "reviewSelectedImageTitle", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getTitle", j6.b.f21518e, "v0", "c", "z", rl.d.f30696a, "h0", "e", "S0", "f", t.f38095d, "g", "x", "h", "s0", "i", "y0", "j", "I0", "k", "l", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "v", "()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "m", "u", "n", "K0", "o", "w", "p", "G", "q", "s", "r", "I", "u0", "t0", "Ljava/util/Map;", "V", "()Ljava/util/Map;", "D", "y", "A", "C", "E", "B", "G0", "z0", "E0", "A0", "F", "H", "J", "r0", "K", "p0", "L", "m0", "M", "n0", "N", "O", "P", "Q", "R", "S", "T", "U", "f0", "d0", "W", "b0", "X", "a0", "Y", "Z", "c0", "b1", "Z0", "e0", "d1", "c1", "g0", "i0", "j0", "k0", "l0", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new a();

            /* renamed from: A, reason: from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodUploadButton;

            /* renamed from: B, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.b, String> reviewSelectedImageTitle;

            /* renamed from: C, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<IdConfig.b, String> reviewSelectedImageBody;

            /* renamed from: D, reason: from kotlin metadata and from toString */
            @NotNull
            public final String reviewSelectedImageConfirmButton;

            /* renamed from: E, reason: from kotlin metadata and from toString */
            @NotNull
            public final String reviewSelectedImageChooseAnotherButton;

            /* renamed from: F, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsTitle;

            /* renamed from: G, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsPrompt;

            /* renamed from: H, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsAllowButtonText;

            /* renamed from: I, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraPermissionsCancelButtonText;

            /* renamed from: J, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsTitle;

            /* renamed from: K, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsPrompt;

            /* renamed from: L, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsAllowButtonText;

            /* renamed from: M, reason: from kotlin metadata and from toString */
            @Nullable
            public final String microphonePermissionsCancelButtonText;

            /* renamed from: N, reason: from kotlin metadata and from toString */
            @Nullable
            public final String hintHoldStill;

            /* renamed from: O, reason: from kotlin metadata and from toString */
            @Nullable
            public final String hintLowLight;

            /* renamed from: P, reason: from kotlin metadata and from toString */
            @Nullable
            public final String helpButtonText;

            /* renamed from: Q, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalTitle;

            /* renamed from: R, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalPrompt;

            /* renamed from: S, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalHints;

            /* renamed from: T, reason: from kotlin metadata and from toString */
            @Nullable
            public final String barcodeHelpModalContinueButtonText;

            /* renamed from: U, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalTitle;

            /* renamed from: V, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalPrompt;

            /* renamed from: W, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalHints;

            /* renamed from: X, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idFrontHelpModalContinueButtonText;

            /* renamed from: Y, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalTitle;

            /* renamed from: Z, reason: from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalPrompt;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalHints;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idBackHelpModalContinueButtonText;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String choose;

            /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsTitle;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String instructionsDisclaimer;

            /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String staticCaptureTipsSubtext;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selectPageNavBarTitle;

            /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentTitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String unableToClassifyDocumentContinueButtonText;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedTitle;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassRejectedContinueButtonText;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String requestPageNavBarTitle;

            /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String countryInputTitle;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String reviewUploadPageNavBarTitle;

            /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String idClassInputTitle;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationPageNavBarTitle;

            /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationTitle;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenTitle;

            /* renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String manualClassificationContinueButtonText;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText captureScreenDescription;

            /* renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String autoClassificationCaptureTipText;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText scanInstructions;

            /* renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String capturing;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCapture;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String captureDisclaimer;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String buttonSubmit;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String buttonRetake;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText confirmCaptureTitle;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> idClassToName;

            /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodTitle;

            /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final OverridableText chooseCaptureMethodBody;

            /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String chooseCaptureMethodCameraButton;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Strings> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    String str;
                    LinkedHashMap linkedHashMap;
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    Parcelable.Creator<OverridableText> creator = OverridableText.CREATOR;
                    OverridableText createFromParcel = creator.createFromParcel(parcel);
                    OverridableText createFromParcel2 = creator.createFromParcel(parcel);
                    OverridableText createFromParcel3 = creator.createFromParcel(parcel);
                    String readString12 = parcel.readString();
                    OverridableText createFromParcel4 = creator.createFromParcel(parcel);
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    OverridableText createFromParcel5 = creator.createFromParcel(parcel);
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i10 = 0;
                    while (i10 != readInt) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                        i10++;
                        readInt = readInt;
                    }
                    Parcelable.Creator<OverridableText> creator2 = OverridableText.CREATOR;
                    OverridableText createFromParcel6 = creator2.createFromParcel(parcel);
                    OverridableText createFromParcel7 = creator2.createFromParcel(parcel);
                    String readString18 = parcel.readString();
                    String readString19 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
                    int i11 = 0;
                    while (i11 != readInt2) {
                        linkedHashMap3.put(IdConfig.b.valueOf(parcel.readString()), parcel.readString());
                        i11++;
                        readInt2 = readInt2;
                    }
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                    int i12 = 0;
                    while (i12 != readInt3) {
                        linkedHashMap4.put(IdConfig.b.valueOf(parcel.readString()), parcel.readString());
                        i12++;
                        readInt3 = readInt3;
                    }
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    String readString28 = parcel.readString();
                    String readString29 = parcel.readString();
                    String readString30 = parcel.readString();
                    String readString31 = parcel.readString();
                    String readString32 = parcel.readString();
                    String readString33 = parcel.readString();
                    String readString34 = parcel.readString();
                    String readString35 = parcel.readString();
                    String readString36 = parcel.readString();
                    String readString37 = parcel.readString();
                    String readString38 = parcel.readString();
                    String readString39 = parcel.readString();
                    String readString40 = parcel.readString();
                    String readString41 = parcel.readString();
                    String readString42 = parcel.readString();
                    String readString43 = parcel.readString();
                    String readString44 = parcel.readString();
                    String readString45 = parcel.readString();
                    String readString46 = parcel.readString();
                    String readString47 = parcel.readString();
                    String readString48 = parcel.readString();
                    String readString49 = parcel.readString();
                    String readString50 = parcel.readString();
                    String readString51 = parcel.readString();
                    String readString52 = parcel.readString();
                    String readString53 = parcel.readString();
                    String readString54 = parcel.readString();
                    String readString55 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                        str = readString20;
                        linkedHashMap = linkedHashMap4;
                    } else {
                        int readInt4 = parcel.readInt();
                        str = readString20;
                        ArrayList arrayList2 = new ArrayList(readInt4);
                        linkedHashMap = linkedHashMap4;
                        int i13 = 0;
                        while (i13 != readInt4) {
                            arrayList2.add(parcel.readParcelable(Strings.class.getClassLoader()));
                            i13++;
                            readInt4 = readInt4;
                        }
                        arrayList = arrayList2;
                    }
                    return new Strings(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, createFromParcel, createFromParcel2, createFromParcel3, readString12, createFromParcel4, readString13, readString14, readString15, createFromParcel5, readString16, readString17, linkedHashMap2, createFromParcel6, createFromParcel7, readString18, readString19, linkedHashMap3, linkedHashMap, str, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString51, readString52, readString53, readString54, readString55, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String choose, @NotNull String instructionsDisclaimer, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull OverridableText captureScreenTitle, @NotNull OverridableText captureScreenDescription, @NotNull OverridableText scanInstructions, @NotNull String capturing, @NotNull OverridableText confirmCapture, @NotNull String captureDisclaimer, @NotNull String buttonSubmit, @NotNull String buttonRetake, @NotNull OverridableText confirmCaptureTitle, @NotNull String processingTitle, @NotNull String processingDescription, @NotNull Map<String, String> idClassToName, @NotNull OverridableText chooseCaptureMethodTitle, @NotNull OverridableText chooseCaptureMethodBody, @NotNull String chooseCaptureMethodCameraButton, @NotNull String chooseCaptureMethodUploadButton, @NotNull Map<IdConfig.b, String> reviewSelectedImageTitle, @NotNull Map<IdConfig.b, String> reviewSelectedImageBody, @NotNull String reviewSelectedImageConfirmButton, @NotNull String reviewSelectedImageChooseAnotherButton, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(choose, "choose");
                Intrinsics.checkNotNullParameter(instructionsDisclaimer, "instructionsDisclaimer");
                Intrinsics.checkNotNullParameter(captureScreenTitle, "captureScreenTitle");
                Intrinsics.checkNotNullParameter(captureScreenDescription, "captureScreenDescription");
                Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
                Intrinsics.checkNotNullParameter(capturing, "capturing");
                Intrinsics.checkNotNullParameter(confirmCapture, "confirmCapture");
                Intrinsics.checkNotNullParameter(captureDisclaimer, "captureDisclaimer");
                Intrinsics.checkNotNullParameter(buttonSubmit, "buttonSubmit");
                Intrinsics.checkNotNullParameter(buttonRetake, "buttonRetake");
                Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                Intrinsics.checkNotNullParameter(idClassToName, "idClassToName");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodTitle, "chooseCaptureMethodTitle");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodBody, "chooseCaptureMethodBody");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodCameraButton, "chooseCaptureMethodCameraButton");
                Intrinsics.checkNotNullParameter(chooseCaptureMethodUploadButton, "chooseCaptureMethodUploadButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageTitle, "reviewSelectedImageTitle");
                Intrinsics.checkNotNullParameter(reviewSelectedImageBody, "reviewSelectedImageBody");
                Intrinsics.checkNotNullParameter(reviewSelectedImageConfirmButton, "reviewSelectedImageConfirmButton");
                Intrinsics.checkNotNullParameter(reviewSelectedImageChooseAnotherButton, "reviewSelectedImageChooseAnotherButton");
                this.title = title;
                this.prompt = prompt;
                this.choose = choose;
                this.instructionsDisclaimer = instructionsDisclaimer;
                this.selectPageNavBarTitle = str;
                this.capturePageNavBarTitle = str2;
                this.checkPageNavBarTitle = str3;
                this.pendingPageNavBarTitle = str4;
                this.requestPageNavBarTitle = str5;
                this.reviewUploadPageNavBarTitle = str6;
                this.autoClassificationPageNavBarTitle = str7;
                this.captureScreenTitle = captureScreenTitle;
                this.captureScreenDescription = captureScreenDescription;
                this.scanInstructions = scanInstructions;
                this.capturing = capturing;
                this.confirmCapture = confirmCapture;
                this.captureDisclaimer = captureDisclaimer;
                this.buttonSubmit = buttonSubmit;
                this.buttonRetake = buttonRetake;
                this.confirmCaptureTitle = confirmCaptureTitle;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.idClassToName = idClassToName;
                this.chooseCaptureMethodTitle = chooseCaptureMethodTitle;
                this.chooseCaptureMethodBody = chooseCaptureMethodBody;
                this.chooseCaptureMethodCameraButton = chooseCaptureMethodCameraButton;
                this.chooseCaptureMethodUploadButton = chooseCaptureMethodUploadButton;
                this.reviewSelectedImageTitle = reviewSelectedImageTitle;
                this.reviewSelectedImageBody = reviewSelectedImageBody;
                this.reviewSelectedImageConfirmButton = reviewSelectedImageConfirmButton;
                this.reviewSelectedImageChooseAnotherButton = reviewSelectedImageChooseAnotherButton;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
                this.microphonePermissionsTitle = str12;
                this.microphonePermissionsPrompt = str13;
                this.microphonePermissionsAllowButtonText = str14;
                this.microphonePermissionsCancelButtonText = str15;
                this.hintHoldStill = str16;
                this.hintLowLight = str17;
                this.helpButtonText = str18;
                this.barcodeHelpModalTitle = str19;
                this.barcodeHelpModalPrompt = str20;
                this.barcodeHelpModalHints = str21;
                this.barcodeHelpModalContinueButtonText = str22;
                this.idFrontHelpModalTitle = str23;
                this.idFrontHelpModalPrompt = str24;
                this.idFrontHelpModalHints = str25;
                this.idFrontHelpModalContinueButtonText = str26;
                this.idBackHelpModalTitle = str27;
                this.idBackHelpModalPrompt = str28;
                this.idBackHelpModalHints = str29;
                this.idBackHelpModalContinueButtonText = str30;
                this.staticCaptureTipsTitle = str31;
                this.staticCaptureTipsSubtext = str32;
                this.unableToClassifyDocumentTitle = str33;
                this.unableToClassifyDocumentContinueButtonText = str34;
                this.idClassRejectedTitle = str35;
                this.idClassRejectedContinueButtonText = str36;
                this.countryInputTitle = str37;
                this.idClassInputTitle = str38;
                this.manualClassificationTitle = str39;
                this.manualClassificationContinueButtonText = str40;
                this.autoClassificationCaptureTipText = str41;
                this.localizationOverrides = list;
            }

            @NotNull
            /* renamed from: A, reason: from getter */
            public final OverridableText getChooseCaptureMethodBody() {
                return this.chooseCaptureMethodBody;
            }

            @NotNull
            /* renamed from: A0, reason: from getter */
            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            @NotNull
            /* renamed from: C, reason: from getter */
            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            @NotNull
            /* renamed from: D, reason: from getter */
            public final OverridableText getChooseCaptureMethodTitle() {
                return this.chooseCaptureMethodTitle;
            }

            @NotNull
            /* renamed from: E, reason: from getter */
            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            @NotNull
            /* renamed from: E0, reason: from getter */
            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            @NotNull
            /* renamed from: G, reason: from getter */
            public final OverridableText getConfirmCapture() {
                return this.confirmCapture;
            }

            @NotNull
            public final Map<IdConfig.b, String> G0() {
                return this.reviewSelectedImageTitle;
            }

            @NotNull
            /* renamed from: I, reason: from getter */
            public final OverridableText getConfirmCaptureTitle() {
                return this.confirmCaptureTitle;
            }

            @Nullable
            /* renamed from: I0, reason: from getter */
            public final String getReviewUploadPageNavBarTitle() {
                return this.reviewUploadPageNavBarTitle;
            }

            @Nullable
            /* renamed from: J, reason: from getter */
            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            @Nullable
            /* renamed from: K, reason: from getter */
            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            @NotNull
            /* renamed from: K0, reason: from getter */
            public final OverridableText getScanInstructions() {
                return this.scanInstructions;
            }

            @Nullable
            /* renamed from: L, reason: from getter */
            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            @Nullable
            /* renamed from: N, reason: from getter */
            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            @Nullable
            /* renamed from: O, reason: from getter */
            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }

            @Nullable
            /* renamed from: P, reason: from getter */
            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            @Nullable
            /* renamed from: Q, reason: from getter */
            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            @Nullable
            /* renamed from: R, reason: from getter */
            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            @Nullable
            /* renamed from: S, reason: from getter */
            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            @Nullable
            /* renamed from: S0, reason: from getter */
            public final String getSelectPageNavBarTitle() {
                return this.selectPageNavBarTitle;
            }

            @Nullable
            /* renamed from: T, reason: from getter */
            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            @Nullable
            /* renamed from: U, reason: from getter */
            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            @NotNull
            public final Map<String, String> V() {
                return this.idClassToName;
            }

            @Nullable
            /* renamed from: Z0, reason: from getter */
            public final String getStaticCaptureTipsSubtext() {
                return this.staticCaptureTipsSubtext;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            @Nullable
            /* renamed from: a0, reason: from getter */
            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            @Nullable
            /* renamed from: b0, reason: from getter */
            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            @Nullable
            /* renamed from: b1, reason: from getter */
            public final String getStaticCaptureTipsTitle() {
                return this.staticCaptureTipsTitle;
            }

            @Nullable
            /* renamed from: c1, reason: from getter */
            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            @Nullable
            /* renamed from: d0, reason: from getter */
            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            @Nullable
            /* renamed from: d1, reason: from getter */
            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.prompt, strings.prompt) && Intrinsics.c(this.choose, strings.choose) && Intrinsics.c(this.instructionsDisclaimer, strings.instructionsDisclaimer) && Intrinsics.c(this.selectPageNavBarTitle, strings.selectPageNavBarTitle) && Intrinsics.c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.c(this.requestPageNavBarTitle, strings.requestPageNavBarTitle) && Intrinsics.c(this.reviewUploadPageNavBarTitle, strings.reviewUploadPageNavBarTitle) && Intrinsics.c(this.autoClassificationPageNavBarTitle, strings.autoClassificationPageNavBarTitle) && Intrinsics.c(this.captureScreenTitle, strings.captureScreenTitle) && Intrinsics.c(this.captureScreenDescription, strings.captureScreenDescription) && Intrinsics.c(this.scanInstructions, strings.scanInstructions) && Intrinsics.c(this.capturing, strings.capturing) && Intrinsics.c(this.confirmCapture, strings.confirmCapture) && Intrinsics.c(this.captureDisclaimer, strings.captureDisclaimer) && Intrinsics.c(this.buttonSubmit, strings.buttonSubmit) && Intrinsics.c(this.buttonRetake, strings.buttonRetake) && Intrinsics.c(this.confirmCaptureTitle, strings.confirmCaptureTitle) && Intrinsics.c(this.processingTitle, strings.processingTitle) && Intrinsics.c(this.processingDescription, strings.processingDescription) && Intrinsics.c(this.idClassToName, strings.idClassToName) && Intrinsics.c(this.chooseCaptureMethodTitle, strings.chooseCaptureMethodTitle) && Intrinsics.c(this.chooseCaptureMethodBody, strings.chooseCaptureMethodBody) && Intrinsics.c(this.chooseCaptureMethodCameraButton, strings.chooseCaptureMethodCameraButton) && Intrinsics.c(this.chooseCaptureMethodUploadButton, strings.chooseCaptureMethodUploadButton) && Intrinsics.c(this.reviewSelectedImageTitle, strings.reviewSelectedImageTitle) && Intrinsics.c(this.reviewSelectedImageBody, strings.reviewSelectedImageBody) && Intrinsics.c(this.reviewSelectedImageConfirmButton, strings.reviewSelectedImageConfirmButton) && Intrinsics.c(this.reviewSelectedImageChooseAnotherButton, strings.reviewSelectedImageChooseAnotherButton) && Intrinsics.c(this.cameraPermissionsTitle, strings.cameraPermissionsTitle) && Intrinsics.c(this.cameraPermissionsPrompt, strings.cameraPermissionsPrompt) && Intrinsics.c(this.cameraPermissionsAllowButtonText, strings.cameraPermissionsAllowButtonText) && Intrinsics.c(this.cameraPermissionsCancelButtonText, strings.cameraPermissionsCancelButtonText) && Intrinsics.c(this.microphonePermissionsTitle, strings.microphonePermissionsTitle) && Intrinsics.c(this.microphonePermissionsPrompt, strings.microphonePermissionsPrompt) && Intrinsics.c(this.microphonePermissionsAllowButtonText, strings.microphonePermissionsAllowButtonText) && Intrinsics.c(this.microphonePermissionsCancelButtonText, strings.microphonePermissionsCancelButtonText) && Intrinsics.c(this.hintHoldStill, strings.hintHoldStill) && Intrinsics.c(this.hintLowLight, strings.hintLowLight) && Intrinsics.c(this.helpButtonText, strings.helpButtonText) && Intrinsics.c(this.barcodeHelpModalTitle, strings.barcodeHelpModalTitle) && Intrinsics.c(this.barcodeHelpModalPrompt, strings.barcodeHelpModalPrompt) && Intrinsics.c(this.barcodeHelpModalHints, strings.barcodeHelpModalHints) && Intrinsics.c(this.barcodeHelpModalContinueButtonText, strings.barcodeHelpModalContinueButtonText) && Intrinsics.c(this.idFrontHelpModalTitle, strings.idFrontHelpModalTitle) && Intrinsics.c(this.idFrontHelpModalPrompt, strings.idFrontHelpModalPrompt) && Intrinsics.c(this.idFrontHelpModalHints, strings.idFrontHelpModalHints) && Intrinsics.c(this.idFrontHelpModalContinueButtonText, strings.idFrontHelpModalContinueButtonText) && Intrinsics.c(this.idBackHelpModalTitle, strings.idBackHelpModalTitle) && Intrinsics.c(this.idBackHelpModalPrompt, strings.idBackHelpModalPrompt) && Intrinsics.c(this.idBackHelpModalHints, strings.idBackHelpModalHints) && Intrinsics.c(this.idBackHelpModalContinueButtonText, strings.idBackHelpModalContinueButtonText) && Intrinsics.c(this.staticCaptureTipsTitle, strings.staticCaptureTipsTitle) && Intrinsics.c(this.staticCaptureTipsSubtext, strings.staticCaptureTipsSubtext) && Intrinsics.c(this.unableToClassifyDocumentTitle, strings.unableToClassifyDocumentTitle) && Intrinsics.c(this.unableToClassifyDocumentContinueButtonText, strings.unableToClassifyDocumentContinueButtonText) && Intrinsics.c(this.idClassRejectedTitle, strings.idClassRejectedTitle) && Intrinsics.c(this.idClassRejectedContinueButtonText, strings.idClassRejectedContinueButtonText) && Intrinsics.c(this.countryInputTitle, strings.countryInputTitle) && Intrinsics.c(this.idClassInputTitle, strings.idClassInputTitle) && Intrinsics.c(this.manualClassificationTitle, strings.manualClassificationTitle) && Intrinsics.c(this.manualClassificationContinueButtonText, strings.manualClassificationContinueButtonText) && Intrinsics.c(this.autoClassificationCaptureTipText, strings.autoClassificationCaptureTipText) && Intrinsics.c(this.localizationOverrides, strings.localizationOverrides);
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final String getAutoClassificationPageNavBarTitle() {
                return this.autoClassificationPageNavBarTitle;
            }

            @Nullable
            /* renamed from: f0, reason: from getter */
            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            @Nullable
            /* renamed from: g, reason: from getter */
            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: h0, reason: from getter */
            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            public int hashCode() {
                int hashCode = ((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.choose.hashCode()) * 31) + this.instructionsDisclaimer.hashCode()) * 31;
                String str = this.selectPageNavBarTitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.capturePageNavBarTitle;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.checkPageNavBarTitle;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.pendingPageNavBarTitle;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.requestPageNavBarTitle;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.reviewUploadPageNavBarTitle;
                int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.autoClassificationPageNavBarTitle;
                int hashCode8 = (((((((((((((((((((((((((((((((((((((((((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.captureScreenTitle.hashCode()) * 31) + this.captureScreenDescription.hashCode()) * 31) + this.scanInstructions.hashCode()) * 31) + this.capturing.hashCode()) * 31) + this.confirmCapture.hashCode()) * 31) + this.captureDisclaimer.hashCode()) * 31) + this.buttonSubmit.hashCode()) * 31) + this.buttonRetake.hashCode()) * 31) + this.confirmCaptureTitle.hashCode()) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31) + this.idClassToName.hashCode()) * 31) + this.chooseCaptureMethodTitle.hashCode()) * 31) + this.chooseCaptureMethodBody.hashCode()) * 31) + this.chooseCaptureMethodCameraButton.hashCode()) * 31) + this.chooseCaptureMethodUploadButton.hashCode()) * 31) + this.reviewSelectedImageTitle.hashCode()) * 31) + this.reviewSelectedImageBody.hashCode()) * 31) + this.reviewSelectedImageConfirmButton.hashCode()) * 31) + this.reviewSelectedImageChooseAnotherButton.hashCode()) * 31;
                String str8 = this.cameraPermissionsTitle;
                int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.cameraPermissionsPrompt;
                int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.cameraPermissionsAllowButtonText;
                int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.cameraPermissionsCancelButtonText;
                int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.microphonePermissionsTitle;
                int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.microphonePermissionsPrompt;
                int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.microphonePermissionsAllowButtonText;
                int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.microphonePermissionsCancelButtonText;
                int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.hintHoldStill;
                int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.hintLowLight;
                int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.helpButtonText;
                int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.barcodeHelpModalTitle;
                int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.barcodeHelpModalPrompt;
                int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.barcodeHelpModalHints;
                int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.barcodeHelpModalContinueButtonText;
                int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.idFrontHelpModalTitle;
                int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.idFrontHelpModalPrompt;
                int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.idFrontHelpModalHints;
                int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.idFrontHelpModalContinueButtonText;
                int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.idBackHelpModalTitle;
                int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
                String str28 = this.idBackHelpModalPrompt;
                int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
                String str29 = this.idBackHelpModalHints;
                int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
                String str30 = this.idBackHelpModalContinueButtonText;
                int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
                String str31 = this.staticCaptureTipsTitle;
                int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
                String str32 = this.staticCaptureTipsSubtext;
                int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
                String str33 = this.unableToClassifyDocumentTitle;
                int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
                String str34 = this.unableToClassifyDocumentContinueButtonText;
                int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
                String str35 = this.idClassRejectedTitle;
                int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
                String str36 = this.idClassRejectedContinueButtonText;
                int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
                String str37 = this.countryInputTitle;
                int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
                String str38 = this.idClassInputTitle;
                int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
                String str39 = this.manualClassificationTitle;
                int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
                String str40 = this.manualClassificationContinueButtonText;
                int hashCode41 = (hashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
                String str41 = this.autoClassificationCaptureTipText;
                int hashCode42 = (hashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
                List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
                return hashCode42 + (list != null ? list.hashCode() : 0);
            }

            @Nullable
            /* renamed from: i, reason: from getter */
            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            @Nullable
            public final List<NextStep.GovernmentId.LocalizationOverride> i0() {
                return this.localizationOverrides;
            }

            @Nullable
            /* renamed from: j, reason: from getter */
            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            @Nullable
            /* renamed from: k, reason: from getter */
            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            @Nullable
            /* renamed from: k0, reason: from getter */
            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            @Nullable
            /* renamed from: l0, reason: from getter */
            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            @NotNull
            /* renamed from: m, reason: from getter */
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            @Nullable
            /* renamed from: m0, reason: from getter */
            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            @NotNull
            /* renamed from: n, reason: from getter */
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            @Nullable
            /* renamed from: n0, reason: from getter */
            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            @Nullable
            /* renamed from: o, reason: from getter */
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            @Nullable
            /* renamed from: p, reason: from getter */
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            @Nullable
            /* renamed from: p0, reason: from getter */
            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            @Nullable
            /* renamed from: q, reason: from getter */
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            @Nullable
            /* renamed from: r, reason: from getter */
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            @Nullable
            /* renamed from: r0, reason: from getter */
            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @NotNull
            /* renamed from: s, reason: from getter */
            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            @Nullable
            /* renamed from: s0, reason: from getter */
            public final String getPendingPageNavBarTitle() {
                return this.pendingPageNavBarTitle;
            }

            @Nullable
            /* renamed from: t, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @NotNull
            /* renamed from: t0, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", choose=" + this.choose + ", instructionsDisclaimer=" + this.instructionsDisclaimer + ", selectPageNavBarTitle=" + this.selectPageNavBarTitle + ", capturePageNavBarTitle=" + this.capturePageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", requestPageNavBarTitle=" + this.requestPageNavBarTitle + ", reviewUploadPageNavBarTitle=" + this.reviewUploadPageNavBarTitle + ", autoClassificationPageNavBarTitle=" + this.autoClassificationPageNavBarTitle + ", captureScreenTitle=" + this.captureScreenTitle + ", captureScreenDescription=" + this.captureScreenDescription + ", scanInstructions=" + this.scanInstructions + ", capturing=" + this.capturing + ", confirmCapture=" + this.confirmCapture + ", captureDisclaimer=" + this.captureDisclaimer + ", buttonSubmit=" + this.buttonSubmit + ", buttonRetake=" + this.buttonRetake + ", confirmCaptureTitle=" + this.confirmCaptureTitle + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", idClassToName=" + this.idClassToName + ", chooseCaptureMethodTitle=" + this.chooseCaptureMethodTitle + ", chooseCaptureMethodBody=" + this.chooseCaptureMethodBody + ", chooseCaptureMethodCameraButton=" + this.chooseCaptureMethodCameraButton + ", chooseCaptureMethodUploadButton=" + this.chooseCaptureMethodUploadButton + ", reviewSelectedImageTitle=" + this.reviewSelectedImageTitle + ", reviewSelectedImageBody=" + this.reviewSelectedImageBody + ", reviewSelectedImageConfirmButton=" + this.reviewSelectedImageConfirmButton + ", reviewSelectedImageChooseAnotherButton=" + this.reviewSelectedImageChooseAnotherButton + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsPrompt=" + this.cameraPermissionsPrompt + ", cameraPermissionsAllowButtonText=" + this.cameraPermissionsAllowButtonText + ", cameraPermissionsCancelButtonText=" + this.cameraPermissionsCancelButtonText + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsPrompt=" + this.microphonePermissionsPrompt + ", microphonePermissionsAllowButtonText=" + this.microphonePermissionsAllowButtonText + ", microphonePermissionsCancelButtonText=" + this.microphonePermissionsCancelButtonText + ", hintHoldStill=" + this.hintHoldStill + ", hintLowLight=" + this.hintLowLight + ", helpButtonText=" + this.helpButtonText + ", barcodeHelpModalTitle=" + this.barcodeHelpModalTitle + ", barcodeHelpModalPrompt=" + this.barcodeHelpModalPrompt + ", barcodeHelpModalHints=" + this.barcodeHelpModalHints + ", barcodeHelpModalContinueButtonText=" + this.barcodeHelpModalContinueButtonText + ", idFrontHelpModalTitle=" + this.idFrontHelpModalTitle + ", idFrontHelpModalPrompt=" + this.idFrontHelpModalPrompt + ", idFrontHelpModalHints=" + this.idFrontHelpModalHints + ", idFrontHelpModalContinueButtonText=" + this.idFrontHelpModalContinueButtonText + ", idBackHelpModalTitle=" + this.idBackHelpModalTitle + ", idBackHelpModalPrompt=" + this.idBackHelpModalPrompt + ", idBackHelpModalHints=" + this.idBackHelpModalHints + ", idBackHelpModalContinueButtonText=" + this.idBackHelpModalContinueButtonText + ", staticCaptureTipsTitle=" + this.staticCaptureTipsTitle + ", staticCaptureTipsSubtext=" + this.staticCaptureTipsSubtext + ", unableToClassifyDocumentTitle=" + this.unableToClassifyDocumentTitle + ", unableToClassifyDocumentContinueButtonText=" + this.unableToClassifyDocumentContinueButtonText + ", idClassRejectedTitle=" + this.idClassRejectedTitle + ", idClassRejectedContinueButtonText=" + this.idClassRejectedContinueButtonText + ", countryInputTitle=" + this.countryInputTitle + ", idClassInputTitle=" + this.idClassInputTitle + ", manualClassificationTitle=" + this.manualClassificationTitle + ", manualClassificationContinueButtonText=" + this.manualClassificationContinueButtonText + ", autoClassificationCaptureTipText=" + this.autoClassificationCaptureTipText + ", localizationOverrides=" + this.localizationOverrides + ")";
            }

            @NotNull
            /* renamed from: u, reason: from getter */
            public final OverridableText getCaptureScreenDescription() {
                return this.captureScreenDescription;
            }

            @NotNull
            /* renamed from: u0, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            /* renamed from: v, reason: from getter */
            public final OverridableText getCaptureScreenTitle() {
                return this.captureScreenTitle;
            }

            @NotNull
            /* renamed from: v0, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* renamed from: w, reason: from getter */
            public final String getCapturing() {
                return this.capturing;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.choose);
                dest.writeString(this.instructionsDisclaimer);
                dest.writeString(this.selectPageNavBarTitle);
                dest.writeString(this.capturePageNavBarTitle);
                dest.writeString(this.checkPageNavBarTitle);
                dest.writeString(this.pendingPageNavBarTitle);
                dest.writeString(this.requestPageNavBarTitle);
                dest.writeString(this.reviewUploadPageNavBarTitle);
                dest.writeString(this.autoClassificationPageNavBarTitle);
                this.captureScreenTitle.writeToParcel(dest, flags);
                this.captureScreenDescription.writeToParcel(dest, flags);
                this.scanInstructions.writeToParcel(dest, flags);
                dest.writeString(this.capturing);
                this.confirmCapture.writeToParcel(dest, flags);
                dest.writeString(this.captureDisclaimer);
                dest.writeString(this.buttonSubmit);
                dest.writeString(this.buttonRetake);
                this.confirmCaptureTitle.writeToParcel(dest, flags);
                dest.writeString(this.processingTitle);
                dest.writeString(this.processingDescription);
                Map<String, String> map = this.idClassToName;
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
                this.chooseCaptureMethodTitle.writeToParcel(dest, flags);
                this.chooseCaptureMethodBody.writeToParcel(dest, flags);
                dest.writeString(this.chooseCaptureMethodCameraButton);
                dest.writeString(this.chooseCaptureMethodUploadButton);
                Map<IdConfig.b, String> map2 = this.reviewSelectedImageTitle;
                dest.writeInt(map2.size());
                for (Map.Entry<IdConfig.b, String> entry2 : map2.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
                Map<IdConfig.b, String> map3 = this.reviewSelectedImageBody;
                dest.writeInt(map3.size());
                for (Map.Entry<IdConfig.b, String> entry3 : map3.entrySet()) {
                    dest.writeString(entry3.getKey().name());
                    dest.writeString(entry3.getValue());
                }
                dest.writeString(this.reviewSelectedImageConfirmButton);
                dest.writeString(this.reviewSelectedImageChooseAnotherButton);
                dest.writeString(this.cameraPermissionsTitle);
                dest.writeString(this.cameraPermissionsPrompt);
                dest.writeString(this.cameraPermissionsAllowButtonText);
                dest.writeString(this.cameraPermissionsCancelButtonText);
                dest.writeString(this.microphonePermissionsTitle);
                dest.writeString(this.microphonePermissionsPrompt);
                dest.writeString(this.microphonePermissionsAllowButtonText);
                dest.writeString(this.microphonePermissionsCancelButtonText);
                dest.writeString(this.hintHoldStill);
                dest.writeString(this.hintLowLight);
                dest.writeString(this.helpButtonText);
                dest.writeString(this.barcodeHelpModalTitle);
                dest.writeString(this.barcodeHelpModalPrompt);
                dest.writeString(this.barcodeHelpModalHints);
                dest.writeString(this.barcodeHelpModalContinueButtonText);
                dest.writeString(this.idFrontHelpModalTitle);
                dest.writeString(this.idFrontHelpModalPrompt);
                dest.writeString(this.idFrontHelpModalHints);
                dest.writeString(this.idFrontHelpModalContinueButtonText);
                dest.writeString(this.idBackHelpModalTitle);
                dest.writeString(this.idBackHelpModalPrompt);
                dest.writeString(this.idBackHelpModalHints);
                dest.writeString(this.idBackHelpModalContinueButtonText);
                dest.writeString(this.staticCaptureTipsTitle);
                dest.writeString(this.staticCaptureTipsSubtext);
                dest.writeString(this.unableToClassifyDocumentTitle);
                dest.writeString(this.unableToClassifyDocumentContinueButtonText);
                dest.writeString(this.idClassRejectedTitle);
                dest.writeString(this.idClassRejectedContinueButtonText);
                dest.writeString(this.countryInputTitle);
                dest.writeString(this.idClassInputTitle);
                dest.writeString(this.manualClassificationTitle);
                dest.writeString(this.manualClassificationContinueButtonText);
                dest.writeString(this.autoClassificationCaptureTipText);
                List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
                if (list == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }

            @Nullable
            /* renamed from: x, reason: from getter */
            public final String getCheckPageNavBarTitle() {
                return this.checkPageNavBarTitle;
            }

            @Nullable
            /* renamed from: y0, reason: from getter */
            public final String getRequestPageNavBarTitle() {
                return this.requestPageNavBarTitle;
            }

            @NotNull
            /* renamed from: z, reason: from getter */
            public final String getChoose() {
                return this.choose;
            }

            @NotNull
            public final Map<IdConfig.b, String> z0() {
                return this.reviewSelectedImageBody;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                boolean z10;
                Class cls;
                boolean z11;
                AutoClassificationConfig autoClassificationConfig;
                DigitalIdConfig createFromParcel;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(IdConfig.CREATOR.createFromParcel(parcel));
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = true;
                    z12 = false;
                }
                boolean z13 = parcel.readInt() != 0 ? z10 : false;
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i11 = 0; i11 != readInt2; i11++) {
                    arrayList2.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                }
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(Input.class.getClassLoader());
                Strings createFromParcel2 = Strings.CREATOR.createFromParcel(parcel);
                int readInt3 = parcel.readInt();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    cls = Input.class;
                    z11 = z10;
                } else {
                    cls = Input.class;
                    z11 = false;
                }
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoCaptureConfig createFromParcel3 = VideoCaptureConfig.CREATOR.createFromParcel(parcel);
                NextStep.GovernmentId.AssetConfig assetConfig = (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls.getClassLoader());
                boolean z14 = parcel.readInt() != 0;
                AutoClassificationConfig createFromParcel4 = AutoClassificationConfig.CREATOR.createFromParcel(parcel);
                StyleElements.Axis valueOf2 = StyleElements.Axis.valueOf(parcel.readString());
                PendingPageTextPosition valueOf3 = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    autoClassificationConfig = createFromParcel4;
                    createFromParcel = null;
                } else {
                    autoClassificationConfig = createFromParcel4;
                    createFromParcel = DigitalIdConfig.CREATOR.createFromParcel(parcel);
                }
                return new Input(readString, readString2, arrayList, readString3, readString4, readString5, z12, z13, arrayList2, governmentIdStepStyle, createFromParcel2, readInt3, readString6, readString7, readLong, z11, valueOf, createFromParcel3, assetConfig, z14, autoClassificationConfig, valueOf2, valueOf3, createFromParcel, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, go.d.valueOf(parcel.readString()), parcel.readString(), (CustomPendingPage) parcel.readParcelable(cls.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input(@NotNull String sessionToken, @Nullable String str, @NotNull List<IdConfig> enabledIdClasses, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, boolean z10, boolean z11, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Strings strings, int i10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, long j10, boolean z12, @Nullable Integer num, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.GovernmentId.AssetConfig assetConfig, boolean z13, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable DigitalIdConfig digitalIdConfig, boolean z14, @Nullable Integer num2, @NotNull go.d designVersion, @Nullable String str2, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.styles = governmentIdStepStyle;
            this.strings = strings;
            this.imageCaptureCount = i10;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.manualCaptureButtonDelayMs = j10;
            this.shouldSkipReviewScreen = z12;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z13;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z14;
            this.holographicTorchEnabledDurationMs = num2;
            this.designVersion = designVersion;
            this.flowWatermarkText = str2;
            this.customPendingPage = customPendingPage;
        }

        @NotNull
        /* renamed from: A, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* renamed from: C, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* renamed from: D, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        /* renamed from: E, reason: from getter */
        public final boolean getStaticCaptureTipsEnabled() {
            return this.staticCaptureTipsEnabled;
        }

        @NotNull
        /* renamed from: G, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* renamed from: I, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* renamed from: J, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* renamed from: f, reason: from getter */
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* renamed from: m, reason: from getter */
        public final go.d getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> n() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        public final List<IdConfig> o() {
            return this.enabledIdClasses;
        }

        @NotNull
        /* renamed from: p, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        @Nullable
        /* renamed from: r, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* renamed from: s, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: t, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        public final boolean u() {
            return this.enabledCaptureOptionsNativeMobile.size() > 1;
        }

        @Nullable
        /* renamed from: v, reason: from getter */
        public final Integer getHolographicTorchEnabledDurationMs() {
            return this.holographicTorchEnabledDurationMs;
        }

        /* renamed from: w, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.countryCode);
            List<IdConfig> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<IdConfig> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromStep);
            dest.writeString(this.fromComponent);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            List<CaptureOptionNativeMobile> list2 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list2.size());
            Iterator<CaptureOptionNativeMobile> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.styles, flags);
            this.strings.writeToParcel(dest, flags);
            dest.writeInt(this.imageCaptureCount);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            Integer num = this.theme;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            this.videoCaptureConfig.writeToParcel(dest, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeInt(this.isEnabled ? 1 : 0);
            this.autoClassificationConfig.writeToParcel(dest, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            if (digitalIdConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                digitalIdConfig.writeToParcel(dest, flags);
            }
            dest.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num2 = this.holographicTorchEnabledDurationMs;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.designVersion.name());
            dest.writeString(this.flowWatermarkText);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @NotNull
        /* renamed from: x, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        /* renamed from: z, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "<init>", "()V", j6.b.f21518e, rl.d.f30696a, ve.a.f33391e, "c", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0197a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0197a f10713a = new C0197a();

            public C0197a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0197a);
            }

            public int hashCode() {
                return 1411335115;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f10714a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1649914237;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull InternalErrorInfo cause) {
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f10716a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1099427158;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10717a;

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
            f10717a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", f = "GovernmentIdWorkflow.kt", l = {157}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10718t;

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return GovernmentIdWorkflow.this.new c(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f10718t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = GovernmentIdWorkflow.this.applicationContext;
                this.f10718t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            GovernmentIdWorkflow.this.videoCaptureHelper.a();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10720t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, GovernmentIdState, a, Object>.a f10721u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow f10722v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a aVar, GovernmentIdWorkflow governmentIdWorkflow, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f10721u = aVar;
            this.f10722v = governmentIdWorkflow;
        }

        public static final Unit q(GovernmentIdWorkflow governmentIdWorkflow, r.c cVar) {
            governmentIdWorkflow.c1(cVar);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f10721u, this.f10722v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, GovernmentIdState, ? extends a> d10;
            nt.c.e();
            if (this.f10720t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            wm.h<r<? super Input, GovernmentIdState, ? extends a>> d11 = this.f10721u.d();
            final GovernmentIdWorkflow governmentIdWorkflow = this.f10722v;
            d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = GovernmentIdWorkflow.d.q(GovernmentIdWorkflow.this, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", f = "GovernmentIdWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10723t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Input f10724u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f10725v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow f10726w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, GovernmentIdState, a, Object>.a f10727x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Input input, GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a aVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f10724u = input;
            this.f10725v = governmentIdState;
            this.f10726w = governmentIdWorkflow;
            this.f10727x = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f10724u, this.f10725v, this.f10726w, this.f10727x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f10723t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f10724u.o().size() == 1) {
                GovernmentIdState governmentIdState = this.f10725v;
                GovernmentIdWorkflow governmentIdWorkflow = this.f10726w;
                wm.k<Input, GovernmentIdState, a, Object>.a aVar = this.f10727x;
                Input input = this.f10724u;
                GovernmentIdWorkflow.Z0(governmentIdState, governmentIdWorkflow, aVar, input, (IdConfig) CollectionsKt.d0(input.o()), false);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$24", f = "GovernmentIdWorkflow.kt", l = {774}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10728t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, GovernmentIdState, a, Object>.a f10730v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f10731w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a aVar, GovernmentIdState governmentIdState, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f10730v = aVar;
            this.f10731w = governmentIdState;
        }

        public static final Unit q(GovernmentIdState governmentIdState, r.c cVar) {
            cVar.e(governmentIdState);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return GovernmentIdWorkflow.this.new f(this.f10730v, this.f10731w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, GovernmentIdState, ? extends a> d10;
            Object e10 = nt.c.e();
            int i10 = this.f10728t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = GovernmentIdWorkflow.this.applicationContext;
                this.f10728t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            GovernmentIdWorkflow.this.videoCaptureHelper.a();
            wm.h<r<? super Input, GovernmentIdState, ? extends a>> d11 = this.f10730v.d();
            GovernmentIdWorkflow governmentIdWorkflow = GovernmentIdWorkflow.this;
            final GovernmentIdState governmentIdState = this.f10731w;
            d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = GovernmentIdWorkflow.f.q(GovernmentIdState.this, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f10732h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow f10733i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, GovernmentIdState, a, Object>.a f10734j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Input f10735k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a aVar, Input input) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f10732h = governmentIdState;
            this.f10733i = governmentIdWorkflow;
            this.f10734j = aVar;
            this.f10735k = input;
        }

        public final void a(IdConfig p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            GovernmentIdWorkflow.a1(this.f10732h, this.f10733i, this.f10734j, this.f10735k, p02, false, 32, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            a(idConfig);
            return Unit.f22894a;
        }
    }

    public GovernmentIdWorkflow(@NotNull Context applicationContext, @NotNull s imageLoader, @NotNull c.a submitVerificationWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker, @NotNull so.j localVideoCaptureRenderer, @NotNull v webRtcRenderer, @NotNull t0 captureRenderer, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull ho.n autoClassificationRenderer, @NotNull jn.a cameraStatsManager, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager) {
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
    }

    public static final Unit A0(final GovernmentIdWorkflow governmentIdWorkflow, final k.a aVar, final GovernmentIdState governmentIdState, final Input input, final CaptureConfig captureConfig) {
        r d10;
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(governmentIdWorkflow.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B0;
                B0 = GovernmentIdWorkflow.B0(GovernmentIdState.this, input, captureConfig, aVar, governmentIdWorkflow, (r.c) obj);
                return B0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit B0(GovernmentIdState governmentIdState, Input input, CaptureConfig captureConfig, final k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState governmentIdState2 = c10 instanceof GovernmentIdState ? (GovernmentIdState) c10 : null;
        if (governmentIdState2 == null) {
            return Unit.f22894a;
        }
        GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), ((GovernmentIdState) action.c()).E(), captureConfig, n.O((Input) action.b(), reviewCapturedImage.getCurrentPart().getSide()), governmentIdState2.D(), governmentIdState2.getPartIndex(), n.x(action, false), x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: go.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit C0;
                C0 = GovernmentIdWorkflow.C0(k.a.this, governmentIdWorkflow);
                return C0;
            }
        }, 11776, null);
        waitForAutocapture.G(true);
        action.e(waitForAutocapture);
        return Unit.f22894a;
    }

    public static final Unit C0(k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D0;
                D0 = GovernmentIdWorkflow.D0(GovernmentIdWorkflow.this, (r.c) obj);
                return D0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit D0(GovernmentIdWorkflow governmentIdWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, governmentIdWorkflow.videoCaptureHelper.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit E0(wm.h hVar) {
        hVar.a(a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit F0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit G0;
                G0 = GovernmentIdWorkflow.G0(GovernmentIdState.this, (r.c) obj);
                return G0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit G0(GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.ReviewCapturedImage.O((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f22894a;
    }

    public static final Unit H0(Input input, GovernmentIdState governmentIdState, k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        p.h(input, (GovernmentIdState.ReviewImageState) governmentIdState, aVar, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
        return Unit.f22894a;
    }

    public static final Unit I0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        n.S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f22894a;
    }

    public static final Unit J0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        n.S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f22894a;
    }

    public static final Unit K0(k.a aVar) {
        n.v(aVar);
        return Unit.f22894a;
    }

    public static final Unit L0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit M0;
                M0 = GovernmentIdWorkflow.M0(GovernmentIdState.this, (r.c) obj);
                return M0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit M0(GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.ReviewSelectedImage.O((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f22894a;
    }

    public static final Unit N0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        n.S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f22894a;
    }

    public static final r O0(final GovernmentIdWorkflow governmentIdWorkflow, final k.a aVar, final c.b it) {
        r d10;
        final String string;
        r d11;
        r d12;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof c.b.C0466c) {
            d12 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit P0;
                    P0 = GovernmentIdWorkflow.P0(GovernmentIdWorkflow.this, aVar, (r.c) obj);
                    return P0;
                }
            }, 1, null);
            return d12;
        }
        if (!(it instanceof c.b.C0465b)) {
            if (!(it instanceof c.b.a)) {
                throw new gt.l();
            }
            d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit R0;
                    R0 = GovernmentIdWorkflow.R0(c.b.this, governmentIdWorkflow, aVar, (r.c) obj);
                    return R0;
                }
            }, 1, null);
            return d10;
        }
        c.b.C0465b c0465b = (c.b.C0465b) it;
        if (c0465b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = governmentIdWorkflow.applicationContext.getString(tp.g.f32402t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0465b.getCause()).getDetails().getMinDimensionSize()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = governmentIdWorkflow.applicationContext.getString(tp.g.f32403u);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        d11 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Q0;
                Q0 = GovernmentIdWorkflow.Q0(string, (r.c) obj);
                return Q0;
            }
        }, 1, null);
        return d11;
    }

    public static final Unit P0(GovernmentIdWorkflow governmentIdWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.b1(aVar, a.d.f10716a);
        return Unit.f22894a;
    }

    public static final Unit Q0(String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.c()).getBackState();
        if (backState != null) {
            action.e(backState.u(str));
        }
        return Unit.f22894a;
    }

    public static final Unit R0(c.b bVar, GovernmentIdWorkflow governmentIdWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.c()).getBackState();
        c.b.a aVar2 = (c.b.a) bVar;
        if ((aVar2.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar2.getCause()).isRecoverable() && backState != null) {
            String string = governmentIdWorkflow.applicationContext.getString(tp.g.B);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(backState.u(string));
        } else {
            governmentIdWorkflow.b1(aVar, new a.c(aVar2.getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit S0(GovernmentIdWorkflow governmentIdWorkflow, k.a aVar) {
        governmentIdWorkflow.b1(aVar, a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit T0(GovernmentIdWorkflow governmentIdWorkflow, k.a aVar) {
        governmentIdWorkflow.b1(aVar, a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit U0(k.a aVar) {
        n.v(aVar);
        return Unit.f22894a;
    }

    public static final Unit V0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W0;
                W0 = GovernmentIdWorkflow.W0(GovernmentIdState.this, (r.c) obj);
                return W0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit W0(GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.ShowInstructions.J((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f22894a;
    }

    public static final r<Input, GovernmentIdState, a> X0(IdPart.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, String str, final String str2) {
        r<Input, GovernmentIdState, a> d10;
        final GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(kotlin.collections.o.d(new Frame(str, null, 2, null)), n.e0(sideIdPart.getSide()), com.withpersona.sdk2.inquiry.governmentid.c.b(((GovernmentIdState.ChooseCaptureMethod) governmentIdState).getCaptureConfig()), GovernmentId.a.f10503c, null, null, 32, null);
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y0;
                Y0 = GovernmentIdWorkflow.Y0(GovernmentIdState.this, governmentIdImage, str2, (r.c) obj);
                return Y0;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit Y0(GovernmentIdState governmentIdState, GovernmentId.GovernmentIdImage governmentIdImage, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = c10 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) c10 : null;
        if (chooseCaptureMethod == null) {
            return Unit.f22894a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = chooseCaptureMethod;
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod3 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.e(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod3.getCurrentPart(), chooseCaptureMethod3.E(), chooseCaptureMethod3.getCaptureConfig(), governmentIdImage, str, chooseCaptureMethod2.D(), chooseCaptureMethod2.getPartIndex(), n.y(action, false, 1, null), null, null, false, chooseCaptureMethod3.getCountryCode(), 1792, null));
        return Unit.f22894a;
    }

    public static final void Z0(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a aVar, Input input, IdConfig idConfig, boolean z10) {
        n.W(r0, aVar, input, null, idConfig, governmentIdWorkflow.videoCaptureHelper, new CameraProperties(null, null, null, 0, 0, 31, null), (r26 & 128) != 0 ? true : z10, (r26 & 256) != 0 ? r0.D() : idConfig.f(), (r26 & 512) != 0 ? r0.getPartIndex() : 0, (r26 & 1024) != 0 ? null : null, (r26 & 2048) != 0 ? ((GovernmentIdState.ShowInstructions) governmentIdState).getCountryCode() : null);
    }

    public static /* synthetic */ void a1(GovernmentIdState governmentIdState, GovernmentIdWorkflow governmentIdWorkflow, k.a aVar, Input input, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = true;
        }
        Z0(governmentIdState, governmentIdWorkflow, aVar, input, idConfig, z10);
    }

    public static final r k0(final GovernmentIdWorkflow governmentIdWorkflow, IdPart.SideIdPart sideIdPart, final GovernmentIdState governmentIdState, final k.a aVar, final e.a it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof e.a.c) {
            e.a.c cVar = (e.a.c) it;
            return X0(sideIdPart, governmentIdState, governmentIdWorkflow, cVar.getAbsoluteFilePath(), cVar.getFileName());
        }
        if (Intrinsics.c(it, e.a.C0200a.f10938a)) {
            d11 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit m02;
                    m02 = GovernmentIdWorkflow.m0(GovernmentIdState.this, (r.c) obj);
                    return m02;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof e.a.b)) {
            throw new gt.l();
        }
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l02;
                l02 = GovernmentIdWorkflow.l0(GovernmentIdWorkflow.this, aVar, it, (r.c) obj);
                return l02;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit l0(GovernmentIdWorkflow governmentIdWorkflow, k.a aVar, e.a aVar2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.b1(aVar, new a.c(((e.a.b) aVar2).getCause()));
        return Unit.f22894a;
    }

    public static final Unit m0(GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        return Unit.f22894a;
    }

    public static final Unit n0(final k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState, final Input input) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o02;
                o02 = GovernmentIdWorkflow.o0(GovernmentIdState.this, input, aVar, governmentIdWorkflow, (r.c) obj);
                return o02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit o0(GovernmentIdState governmentIdState, Input input, final k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = c10 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) c10 : null;
        if (chooseCaptureMethod == null) {
            return Unit.f22894a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        action.e(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.E(), chooseCaptureMethod2.getCaptureConfig(), n.O(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.D(), chooseCaptureMethod.getPartIndex(), n.y(action, false, 1, null), x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: go.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p02;
                p02 = GovernmentIdWorkflow.p0(k.a.this, governmentIdWorkflow);
                return p02;
            }
        }, 11776, null));
        return Unit.f22894a;
    }

    public static final Unit p0(k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q02;
                q02 = GovernmentIdWorkflow.q0(GovernmentIdWorkflow.this, (r.c) obj);
                return q02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit q0(GovernmentIdWorkflow governmentIdWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, governmentIdWorkflow.videoCaptureHelper.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final Unit r0(k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit s02;
                s02 = GovernmentIdWorkflow.s0(GovernmentIdWorkflow.this, governmentIdState, (r.c) obj);
                return s02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit s0(GovernmentIdWorkflow governmentIdWorkflow, GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.documentSelectWorker.g();
        action.e(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f22894a;
    }

    public static final Unit t0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        n.S(aVar, governmentIdWorkflow.videoCaptureHelper);
        return Unit.f22894a;
    }

    public static final Unit u0(k.a aVar) {
        n.v(aVar);
        return Unit.f22894a;
    }

    public static final void v0(final k.a aVar, final GovernmentIdWorkflow governmentIdWorkflow, final a it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w02;
                w02 = GovernmentIdWorkflow.w0(GovernmentIdWorkflow.this, aVar, it, (r.c) obj);
                return w02;
            }
        }, 1, null);
        d11.a(d10);
    }

    public static final Unit w0(GovernmentIdWorkflow governmentIdWorkflow, k.a aVar, a aVar2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        governmentIdWorkflow.b1(aVar, aVar2);
        return Unit.f22894a;
    }

    public static final Unit x0(k.a aVar, GovernmentIdWorkflow governmentIdWorkflow, final GovernmentIdState governmentIdState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(governmentIdWorkflow, null, new Function1() { // from class: go.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y02;
                y02 = GovernmentIdWorkflow.y0(GovernmentIdState.this, (r.c) obj);
                return y02;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit y0(GovernmentIdState governmentIdState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f22894a;
    }

    public static final Unit z0(Input input, GovernmentIdState governmentIdState, k.a aVar, GovernmentIdWorkflow governmentIdWorkflow) {
        p.h(input, (GovernmentIdState.ReviewImageState) governmentIdState, aVar, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
        return Unit.f22894a;
    }

    public final String Z(Input.Strings strings, IdConfig.b bVar, String str, String str2) {
        String a10 = strings.getChooseCaptureMethodBody().a(str2, str, bVar);
        if (a10 != null) {
            return a10;
        }
        String string = this.applicationContext.getString(tp.g.f32400r);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String a0(Input.Strings strings, IdConfig.b bVar, String str, String str2) {
        String a10 = strings.getChooseCaptureMethodTitle().a(str2, str, bVar);
        if (a10 != null) {
            return a10;
        }
        String string = this.applicationContext.getString(tp.g.f32401s);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String b0(Input.Strings strings, IdConfig.b bVar, String str, String str2) {
        String a10 = strings.getConfirmCaptureTitle().a(str2, str, bVar);
        return a10 == null ? "" : a10;
    }

    public final void b1(wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a context, a output) {
        n.b0(context, output, this.videoCaptureHelper);
    }

    public final String c0(Input.Strings strings, IdConfig.b bVar) {
        String str = strings.z0().get(bVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(tp.g.f32404v);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void c1(r<? super Input, GovernmentIdState, ? extends a>.c updater) {
        updater.d(new a.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final String d0(Input.Strings strings, IdConfig.b bVar) {
        String str = strings.G0().get(bVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(tp.g.f32405w);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // wm.k
    @Nullable
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull GovernmentIdState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (g0(state)) {
            return null;
        }
        return q.a(state);
    }

    public final String e0(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return "camera_screen";
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return null;
        }
        throw new gt.l();
    }

    public final boolean e1(GovernmentIdState governmentIdState) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return true;
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return false;
        }
        throw new gt.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.os.Parcelable, java.lang.Object] */
    @Override // wm.k
    @NotNull
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public GovernmentIdState d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        GovernmentIdState governmentIdState = null;
        if (snapshot != null) {
            wu.h b10 = snapshot.b();
            if (b10.I() <= 0) {
                b10 = null;
            }
            if (b10 != null) {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                byte[] O = b10.O();
                obtain.unmarshall(O, 0, O.length);
                obtain.setDataPosition(0);
                ?? readParcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                Intrinsics.checkNotNullExpressionValue(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                governmentIdState = readParcelable;
            }
            governmentIdState = governmentIdState;
        }
        if (governmentIdState != null) {
            return governmentIdState;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.c(props)) {
            if (props.u()) {
                return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.b.f10747d), kotlin.collections.p.k(), kotlin.collections.p.k(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
            }
            return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.b.f10747d), kotlin.collections.p.k(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == go.d.b ? Screen.b.a.f10815c : Screen.b.a.b, kotlin.collections.p.k(), 0, null, x.f31613c, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, null, 28160, null);
        }
        return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
    }

    public final uq.m f1(Object obj, GovernmentIdState governmentIdState) {
        return new uq.m(obj, governmentIdState.getDidGoBack() ? uq.l.b : uq.l.f33106a);
    }

    public final boolean g0(GovernmentIdState state) {
        while (state != null) {
            if ((state instanceof GovernmentIdState.AutoClassificationError) || (state instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                return true;
            }
            state = state.getBackState();
        }
        return false;
    }

    public final ym.m<Object> h0(Object obj, String str) {
        return new ym.m<>(obj, str);
    }

    @Override // wm.k
    @NotNull
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull GovernmentIdState renderState, @NotNull wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Object j02 = j0(renderProps, renderState, context);
        String e02 = e0(renderState);
        if (e02 != null) {
            j02 = h0(j02, e02);
        }
        if (!e1(renderState)) {
            context.b("close_camera", new c(null));
        }
        if (!this.videoCaptureHelper.f(renderProps) && hq.g.e(this.applicationContext)) {
            context.b("output_webrtc_error", new d(context, this, null));
        }
        return f1(j02, renderState);
    }

    public final Object j0(final Input renderProps, final GovernmentIdState renderState, final wm.k<? super Input, GovernmentIdState, ? extends a, ? extends Object>.a context) {
        nq.h takePhoto;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        gu.c<? extends GovernmentIdState> b10 = d0.b(renderState.getClass());
        final wm.h<? super a> hVar = new wm.h() { // from class: go.w
            @Override // wm.h
            public final void a(Object obj) {
                GovernmentIdWorkflow.v0(k.a.this, this, (GovernmentIdWorkflow.a) obj);
            }
        };
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit), false, 8, null);
        boolean z10 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z10) {
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
        if (!Intrinsics.c(this.previousStateClass, b10)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.c(b10, d0.b(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.b Q = n.Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, Q != null ? n.d0(Q) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = b10;
        }
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            context.b("check_if_single_id_class", new e(renderProps, renderState, this, context, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> N = n.N(renderProps);
            g gVar = new g(renderState, this, context, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new Screen.e(title, prompt, choose, instructionsDisclaimer, N, this.navigationStateManager.b(), gVar, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new Function0() { // from class: go.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit N0;
                    N0 = GovernmentIdWorkflow.N0(k.a.this, this);
                    return N0;
                }
            }, new Function0() { // from class: go.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit U0;
                    U0 = GovernmentIdWorkflow.U0(k.a.this);
                    return U0;
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: go.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit V0;
                    V0 = GovernmentIdWorkflow.V0(k.a.this, this, renderState);
                    return V0;
                }
            }, this.themeManager.a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), null, 65536, null);
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdPart.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                w.l(context, this.documentSelectWorker, d0.k(com.withpersona.sdk2.inquiry.governmentid.e.class), "", new Function1() { // from class: go.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r k02;
                        k02 = GovernmentIdWorkflow.k0(GovernmentIdWorkflow.this, currentPart, renderState, context, (e.a) obj);
                        return k02;
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> n10 = renderProps.n();
            String a02 = a0(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String Z = Z(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState b11 = this.navigationStateManager.b();
            Function0 function0 = new Function0() { // from class: go.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit n02;
                    n02 = GovernmentIdWorkflow.n0(k.a.this, this, renderState, renderProps);
                    return n02;
                }
            };
            Function0 function02 = new Function0() { // from class: go.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit r02;
                    r02 = GovernmentIdWorkflow.r0(k.a.this, this, renderState);
                    return r02;
                }
            };
            Function0 function03 = new Function0() { // from class: go.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit t02;
                    t02 = GovernmentIdWorkflow.t0(k.a.this, this);
                    return t02;
                }
            };
            Function0 function04 = new Function0() { // from class: go.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit u02;
                    u02 = GovernmentIdWorkflow.u0(k.a.this);
                    return u02;
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function05 = new Function0() { // from class: go.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit x02;
                    x02 = GovernmentIdWorkflow.x0(k.a.this, this, renderState);
                    return x02;
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.b side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = b.f10717a;
            int i10 = iArr[side.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new gt.l();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                remoteImage = idFrontPictograph;
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                            remoteImage = idFrontPictograph;
                        }
                    }
                    remoteImage = null;
                } else {
                    if (promptPage != null) {
                        idFrontPictograph = promptPage.getIdBackPictograph();
                        remoteImage = idFrontPictograph;
                    }
                    remoteImage = null;
                }
            } else if (com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.f27224j) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                    remoteImage = idFrontPictograph;
                }
                remoteImage = null;
            } else {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdFrontPictograph();
                    remoteImage = idFrontPictograph;
                }
                remoteImage = null;
            }
            int i11 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            int i12 = i11 != 1 ? (i11 == 2 || i11 == 4) ? p2.f18743d : p2.f18744e : com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.f27224j ? p2.f18745f : p2.f18744e;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.c(n10, a02, Z, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, b11, function0, function02, function03, function04, error, function05, styles, remoteImage, i12, requestPageNavBarTitle, null, 65536, null);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.n0(renderProps, (GovernmentIdState.WaitForAutocapture) renderState, context, this.videoCaptureHelper, hVar);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.Y(renderProps, (GovernmentIdState.CountdownToCapture) renderState, context, this.videoCaptureHelper, hVar);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, n.d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig d10 = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.d0(reviewCapturedImage.getIdForReview().f3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                p.j(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new AlertContainerScreen(com.withpersona.sdk2.inquiry.permissions.g.c(new Screen.h(this.imageLoader, n.M(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), renderProps.getStrings().getCaptureDisclaimer(), d10.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig), this.navigationStateManager.b(), new Function0() { // from class: go.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit z02;
                    z02 = GovernmentIdWorkflow.z0(GovernmentIdWorkflow.Input.this, renderState, context, this);
                    return z02;
                }
            }, renderProps.getStrings().getButtonSubmit(), new Function0() { // from class: go.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit A0;
                    A0 = GovernmentIdWorkflow.A0(GovernmentIdWorkflow.this, context, renderState, renderProps, captureConfig);
                    return A0;
                }
            }, renderProps.getStrings().getButtonRetake(), b0(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: go.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit E0;
                    E0 = GovernmentIdWorkflow.E0(wm.h.this);
                    return E0;
                }
            }, renderProps.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: go.e1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F0;
                    F0 = GovernmentIdWorkflow.F0(k.a.this, this, renderState);
                    return F0;
                }
            }, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis(), renderProps.getDesignVersion(), false, renderProps.getStrings().getCheckPageNavBarTitle(), null, 20971520, null)), null, 2, null);
        }
        if (!(renderState instanceof GovernmentIdState.ReviewSelectedImage)) {
            if (renderState instanceof GovernmentIdState.Submit) {
                GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
                w.l(context, this.submitVerificationWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), d0.k(no.c.class), "", new Function1() { // from class: go.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r O0;
                        O0 = GovernmentIdWorkflow.O0(GovernmentIdWorkflow.this, context, (c.b) obj);
                        return O0;
                    }
                });
                sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
                return new Screen.j(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: go.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit S0;
                        S0 = GovernmentIdWorkflow.S0(GovernmentIdWorkflow.this, context);
                        return S0;
                    }
                }, new Function0() { // from class: go.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit T0;
                        T0 = GovernmentIdWorkflow.T0(GovernmentIdWorkflow.this, context);
                        return T0;
                    }
                }, renderProps.getPendingPageTextVerticalPosition(), false, renderProps.getStrings().getPendingPageNavBarTitle(), null, 1280, null);
            }
            if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
                return this.localVideoCaptureRenderer.i(renderProps, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
                return this.webRtcRenderer.j(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.HolographicTorchDelay) {
                return this.captureRenderer.j0(renderProps, (GovernmentIdState.HolographicTorchDelay) renderState, context, this.videoCaptureHelper, hVar);
            }
            if (z10) {
                return this.autoClassificationRenderer.n(renderProps, (GovernmentIdState.AutoClassificationError) renderState, context, this.videoCaptureHelper);
            }
            if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
                return this.autoClassificationRenderer.t(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
            }
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new gt.l();
            }
            context.b("restart_step", new f(context, d(renderProps, null), null));
            return new Screen.g(null, 1, null);
        }
        GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
        TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, n.d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        IdPart.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
        if (reviewSelectedImage.getSubmittingForAutoClassification()) {
            p.j(renderProps, (GovernmentIdState.ReviewImageState) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
        }
        s sVar = this.imageLoader;
        String d02 = d0(renderProps.getStrings(), currentPart2.getSide());
        String c02 = c0(renderProps.getStrings(), currentPart2.getSide());
        String reviewSelectedImageConfirmButton = renderProps.getStrings().getReviewSelectedImageConfirmButton();
        String reviewSelectedImageChooseAnotherButton = renderProps.getStrings().getReviewSelectedImageChooseAnotherButton();
        String absoluteFilePath = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getAbsoluteFilePath();
        String mimeType = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getMimeType();
        String fileName = reviewSelectedImage.getFileName();
        NavigationState b12 = this.navigationStateManager.b();
        String error2 = reviewSelectedImage.getError();
        boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
        StepStyles.GovernmentIdStepStyle styles2 = renderProps.getStyles();
        String reviewUploadPageNavBarTitle = renderProps.getStrings().getReviewUploadPageNavBarTitle();
        if (reviewUploadPageNavBarTitle == null) {
            reviewUploadPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.i(sVar, d02, c02, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, b12, new Function0() { // from class: go.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H0;
                H0 = GovernmentIdWorkflow.H0(GovernmentIdWorkflow.Input.this, renderState, context, this);
                return H0;
            }
        }, new Function0() { // from class: go.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit I0;
                I0 = GovernmentIdWorkflow.I0(k.a.this, this);
                return I0;
            }
        }, new Function0() { // from class: go.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit J0;
                J0 = GovernmentIdWorkflow.J0(k.a.this, this);
                return J0;
            }
        }, new Function0() { // from class: go.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K0;
                K0 = GovernmentIdWorkflow.K0(k.a.this);
                return K0;
            }
        }, error2, new Function0() { // from class: go.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit L0;
                L0 = GovernmentIdWorkflow.L0(k.a.this, this, renderState);
                return L0;
            }
        }, styles2, submittingForAutoClassification, reviewUploadPageNavBarTitle, null, 262144, null);
    }
}
