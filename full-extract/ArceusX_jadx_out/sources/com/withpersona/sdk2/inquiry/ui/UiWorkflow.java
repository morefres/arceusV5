package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ar.h2;
import br.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.d;
import com.withpersona.sdk2.inquiry.ui.k;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import gt.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jp.JpMyNumberNfcValidOperation;
import jp.n;
import ju.p0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import kotlin.text.x;
import mr.b4;
import nq.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import pp.i0;
import pp.j1;
import wm.Snapshot;
import wm.k;
import wm.r;
import wm.w;
import wm.z;
import ym.q;
import zl.t;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 p2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004TqVXBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020$*\u00180 R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)JK\u0010.\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/JC\u00100\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020$*\b\u0012\u0004\u0012\u000203022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020$04H\u0002¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020$2\u0006\u00108\u001a\u0002032\u0006\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b;\u0010<JC\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\u00020$2\u0006\u0010>\u001a\u00020A2\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002092\u0006\u0010>\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJK\u0010H\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ!\u0010M\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJC\u0010O\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00032\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020K2\u0006\u0010Q\u001a\u00020\u0003H\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Ljp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lup/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/a;", "componentWorkHelper", "Lnq/c;", "externalEventLogger", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Ljp/n$a;Lup/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Lsq/a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/ui/a;Lnq/c;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lwm/r$c;", "Lwm/r;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "", "D0", "(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "renderProps", "C0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lwm/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "n1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "E0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "C1", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "q0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "n0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;)V", "B0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "v1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "Lwm/i;", "snapshot", "A0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "G0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lwm/k$a;)Ljava/lang/Object;", "state", "E1", "(Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lwm/i;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "c", "Ljp/n$a;", rl.d.f30696a, "Lup/c;", "e", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "f", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "g", "Lsq/a;", "h", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "i", "Lcom/withpersona/sdk2/inquiry/ui/a;", "j", "Lnq/c;", "k", "Leo/e;", "l", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "m", "Ljava/lang/String;", "lastLoggedPage", "n", "Input", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiWorkflow extends wm.k<Input, UiState, b, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b.a nfcScanWorkerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n.a scanJpMyNumberNfcWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d.a createReusablePersonaWorkerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k.a verifyReusablePersonaWorkerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a componentWorkHelper;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String lastLoggedPage;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010+R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b1\u0010>R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bI\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bE\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bP\u00109R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\bV\u0010>R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bQ\u0010+¨\u0006W"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "isRestoringState", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "y", j6.b.f21518e, "p", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", rl.d.f30696a, t.f38095d, "e", "Z", "()Z", "f", "g", "h", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "q", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "i", "o", "j", "n", "k", "getGpsPermissionsModalPositiveButton", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "s", "r", "w", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "u", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "v", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentConfig> components;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean finalStep;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsTitle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsRationale;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalPositiveButton;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsPermissionsModalNegativeButton;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalPositiveButton;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentErrorInfo> serverComponentErrors;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSubmitting;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isRestoringState;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String navBarTitle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Class cls;
                ArrayList arrayList2;
                boolean z10;
                Class cls2;
                boolean z11;
                boolean z12;
                StepStyles.UiStepStyle uiStepStyle;
                String str;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ArrayList arrayList3 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(parcel.readParcelable(Input.class.getClassLoader()));
                    }
                }
                String readString3 = parcel.readString();
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    cls = Input.class;
                    arrayList2 = arrayList;
                    z10 = true;
                } else {
                    cls = Input.class;
                    arrayList2 = arrayList;
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    cls2 = cls;
                    z11 = true;
                } else {
                    cls2 = cls;
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) parcel.readParcelable(cls2.getClassLoader());
                boolean z14 = z12;
                String readString4 = parcel.readString();
                Class cls3 = cls2;
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                StepStyles.UiStepStyle uiStepStyle2 = (StepStyles.UiStepStyle) parcel.readParcelable(cls3.getClassLoader());
                if (parcel.readInt() == 0) {
                    uiStepStyle = uiStepStyle2;
                    str = readString;
                } else {
                    int readInt2 = parcel.readInt();
                    uiStepStyle = uiStepStyle2;
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    str = readString;
                    int i11 = 0;
                    while (i11 != readInt2) {
                        arrayList4.add(UiComponentErrorInfo.CREATOR.createFromParcel(parcel));
                        i11++;
                        readInt2 = readInt2;
                    }
                    arrayList3 = arrayList4;
                }
                return new Input(str, readString2, arrayList2, readString3, z10, z11, z13, inquirySessionConfig, readString4, readString5, readString6, readString7, readString8, readString9, readString10, uiStepStyle, arrayList3, parcel.readInt() != 0 ? z14 : false, (InternalErrorInfo) parcel.readParcelable(cls3.getClassLoader()), parcel.readInt() != 0 ? z14 : false, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @Nullable List<? extends UiComponentConfig> list, @NotNull String stepName, boolean z10, boolean z11, boolean z12, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable List<UiComponentErrorInfo> list2, boolean z13, @Nullable InternalErrorInfo internalErrorInfo, boolean z14, @Nullable String str8) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.components = list;
            this.stepName = stepName;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.finalStep = z12;
            this.inquirySessionConfig = inquirySessionConfig;
            this.gpsPermissionsTitle = str;
            this.gpsPermissionsRationale = str2;
            this.gpsPermissionsModalPositiveButton = str3;
            this.gpsPermissionsModalNegativeButton = str4;
            this.gpsFeatureTitle = str5;
            this.gpsFeatureRationale = str6;
            this.gpsFeatureModalPositiveButton = str7;
            this.styles = uiStepStyle;
            this.serverComponentErrors = list2;
            this.isSubmitting = z13;
            this.transitionError = internalErrorInfo;
            this.isRestoringState = z14;
            this.navBarTitle = str8;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.components, input.components) && Intrinsics.c(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.c(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.c(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.c(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.c(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.c(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.c(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.c(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.c(this.transitionError, input.transitionError) && this.isRestoringState == input.isRestoringState && Intrinsics.c(this.navBarTitle, input.navBarTitle);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @Nullable
        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        @Nullable
        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int hashCode = ((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int hashCode2 = (((((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str = this.gpsPermissionsTitle;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gpsPermissionsRationale;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsPermissionsModalPositiveButton;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsPermissionsModalNegativeButton;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureTitle;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gpsFeatureRationale;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.gpsFeatureModalPositiveButton;
            int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int hashCode10 = (hashCode9 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            int hashCode11 = (((hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int hashCode12 = (((hashCode11 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + Boolean.hashCode(this.isRestoringState)) * 31;
            String str8 = this.navBarTitle;
            return hashCode12 + (str8 != null ? str8.hashCode() : 0);
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getGpsFeatureModalPositiveButton() {
            return this.gpsFeatureModalPositiveButton;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        @Nullable
        /* renamed from: m, reason: from getter */
        public final String getGpsPermissionsModalNegativeButton() {
            return this.gpsPermissionsModalNegativeButton;
        }

        @Nullable
        /* renamed from: n, reason: from getter */
        public final String getGpsPermissionsRationale() {
            return this.gpsPermissionsRationale;
        }

        @Nullable
        /* renamed from: o, reason: from getter */
        public final String getGpsPermissionsTitle() {
            return this.gpsPermissionsTitle;
        }

        @NotNull
        /* renamed from: p, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Nullable
        /* renamed from: r, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @Nullable
        public final List<UiComponentErrorInfo> s() {
            return this.serverComponentErrors;
        }

        @NotNull
        /* renamed from: t, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", components=" + this.components + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", gpsPermissionsTitle=" + this.gpsPermissionsTitle + ", gpsPermissionsRationale=" + this.gpsPermissionsRationale + ", gpsPermissionsModalPositiveButton=" + this.gpsPermissionsModalPositiveButton + ", gpsPermissionsModalNegativeButton=" + this.gpsPermissionsModalNegativeButton + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalPositiveButton=" + this.gpsFeatureModalPositiveButton + ", styles=" + this.styles + ", serverComponentErrors=" + this.serverComponentErrors + ", isSubmitting=" + this.isSubmitting + ", transitionError=" + this.transitionError + ", isRestoringState=" + this.isRestoringState + ", navBarTitle=" + this.navBarTitle + ")";
        }

        @Nullable
        /* renamed from: u, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            List<UiComponentConfig> list = this.components;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeString(this.stepName);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.gpsPermissionsTitle);
            dest.writeString(this.gpsPermissionsRationale);
            dest.writeString(this.gpsPermissionsModalPositiveButton);
            dest.writeString(this.gpsPermissionsModalNegativeButton);
            dest.writeString(this.gpsFeatureTitle);
            dest.writeString(this.gpsFeatureRationale);
            dest.writeString(this.gpsFeatureModalPositiveButton);
            dest.writeParcelable(this.styles, flags);
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentErrorInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
            dest.writeString(this.navBarTitle);
        }

        @NotNull
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", j6.b.f21518e, "f", "e", rl.d.f30696a, "c", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f13823a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1353460011;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0255b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0255b f13824a = new C0255b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0255b);
            }

            public int hashCode() {
                return -650975523;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f13825a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -584917881;
            }

            @NotNull
            public String toString() {
                return "Completed";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "message", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String message;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            public d(@Nullable String str, @NotNull InternalErrorInfo cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.message = str;
                this.cause = cause;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$e;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "canReuseWorkflow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$e, reason: from toString */
        public static final /* data */ class FinishedWithTransition implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean canReuseWorkflow;

            public FinishedWithTransition(boolean z10) {
                this.canReuseWorkflow = z10;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getCanReuseWorkflow() {
                return this.canReuseWorkflow;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishedWithTransition) && this.canReuseWorkflow == ((FinishedWithTransition) other).canReuseWorkflow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.canReuseWorkflow);
            }

            @NotNull
            public String toString() {
                return "FinishedWithTransition(canReuseWorkflow=" + this.canReuseWorkflow + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b$f;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", j6.b.f21518e, "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$b$f, reason: from toString */
        public static final /* data */ class FinishedWithoutTransition implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UiComponent fromComponent;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, ComponentParam> componentParams;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String fromStep;

            /* JADX WARN: Multi-variable type inference failed */
            public FinishedWithoutTransition(@NotNull UiComponent fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep) {
                Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
                Intrinsics.checkNotNullParameter(componentParams, "componentParams");
                Intrinsics.checkNotNullParameter(fromStep, "fromStep");
                this.fromComponent = fromComponent;
                this.componentParams = componentParams;
                this.fromStep = fromStep;
            }

            @NotNull
            public final Map<String, ComponentParam> a() {
                return this.componentParams;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final UiComponent getFromComponent() {
                return this.fromComponent;
            }

            @NotNull
            /* renamed from: c, reason: from getter */
            public final String getFromStep() {
                return this.fromStep;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishedWithoutTransition)) {
                    return false;
                }
                FinishedWithoutTransition finishedWithoutTransition = (FinishedWithoutTransition) other;
                return Intrinsics.c(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.c(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.c(this.fromStep, finishedWithoutTransition.fromStep);
            }

            public int hashCode() {
                return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
            }

            @NotNull
            public String toString() {
                return "FinishedWithoutTransition(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "<init>", "()V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015B\u0099\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u0012$\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR;\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bQ\u0010JR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bS\u0010JR5\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\b:\u0010XR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b?\u0010H\u001a\u0004\bY\u0010JR)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bE\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bG\u0010CR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010JR)\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\ba\u0010VR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bM\u0010eR\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bf\u0010]R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bc\u0010JR\u0013\u0010i\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\b<\u0010hR\u0013\u0010j\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bK\u0010hR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "navBarTitle", "Lkotlin/Function3;", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "onClick", "Lkotlin/Function0;", "onComplete", "onCancel", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "launchJpMyNumberNfcScan", "launchActionFromHelpSheet", "launchSecondaryActionFromHelpSheet", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "onVerifyPersonaClick", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "autoSubmit", "onBack", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "onSuggestionSelected", "isLoading", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "onCreateReusablePersonaClick", "Lbr/o;", "helpBottomSheetViewModel", "shouldLaunchHelpBottomSheet", "onHelpBottomSheetDismissed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lyt/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lbr/o;ZLkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", ve.a.f33391e, "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "f", "()Ljava/util/List;", j6.b.f21518e, rl.d.f30696a, "c", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "Lyt/n;", "r", "()Lyt/n;", "g", "Lkotlin/jvm/functions/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "h", "q", "i", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "j", "k", "m", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "p", "w", "Z", "B", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", t.f38095d, "u", "v", "Lbr/o;", "()Lbr/o;", "z", "", "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "y", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponent> components;

            /* renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final List<UiComponentConfig> componentConfigs;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<UiComponentErrorInfo> componentErrors;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final yt.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onComplete;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> launchNfcScan;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchActionFromHelpSheet;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Function0<Unit> launchSecondaryActionFromHelpSheet;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final AutoSubmit autoSubmit;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<InputAddressComponent, String, Unit> onSuggestionSelected;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final boolean isLoading;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.UiStepStyle styles;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String error;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> onCreateReusablePersonaClick;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final HelpBottomSheetViewModel helpBottomSheetViewModel;

            /* renamed from: w, reason: collision with root package name and from kotlin metadata */
            public final boolean shouldLaunchHelpBottomSheet;

            /* renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onHelpBottomSheetDismissed;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "component", "", "countdownText", "", "isReadyToSubmit", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", j6.b.f21518e, "Ljava/lang/String;", "c", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$c$a$a, reason: collision with other inner class name and from toString */
            public static final /* data */ class AutoSubmit {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final AutoSubmitableComponent component;

                /* renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String countdownText;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                public final boolean isReadyToSubmit;

                public AutoSubmit(@NotNull AutoSubmitableComponent component, @Nullable String str, boolean z10) {
                    Intrinsics.checkNotNullParameter(component, "component");
                    this.component = component;
                    this.countdownText = str;
                    this.isReadyToSubmit = z10;
                }

                @NotNull
                /* renamed from: a, reason: from getter */
                public final AutoSubmitableComponent getComponent() {
                    return this.component;
                }

                @Nullable
                /* renamed from: b, reason: from getter */
                public final String getCountdownText() {
                    return this.countdownText;
                }

                /* renamed from: c, reason: from getter */
                public final boolean getIsReadyToSubmit() {
                    return this.isReadyToSubmit;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AutoSubmit)) {
                        return false;
                    }
                    AutoSubmit autoSubmit = (AutoSubmit) other;
                    return Intrinsics.c(this.component, autoSubmit.component) && Intrinsics.c(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
                }

                public int hashCode() {
                    int hashCode = this.component.hashCode() * 31;
                    String str = this.countdownText;
                    return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isReadyToSubmit);
                }

                @NotNull
                public String toString() {
                    return "AutoSubmit(component=" + this.component + ", countdownText=" + this.countdownText + ", isReadyToSubmit=" + this.isReadyToSubmit + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@NotNull List<? extends UiComponent> components, @Nullable List<? extends UiComponentConfig> list, @NotNull List<UiComponentErrorInfo> componentErrors, @NotNull NavigationState navigationState, @Nullable String str, @NotNull yt.n<? super UiComponent, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> onClick, @NotNull Function0<Unit> onComplete, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan, @NotNull Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull Function2<? super VerifyPersonaButtonComponent, ? super Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick, @Nullable AutoSubmit autoSubmit, @NotNull Function0<Unit> onBack, @NotNull Function2<? super InputAddressComponent, ? super String, Unit> onSuggestionSelected, boolean z10, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @NotNull Function2<? super CreatePersonaSheetComponent, ? super UiComponent, Unit> onCreateReusablePersonaClick, @Nullable HelpBottomSheetViewModel helpBottomSheetViewModel, boolean z11, @NotNull Function0<Unit> onHelpBottomSheetDismissed) {
                super(null);
                Intrinsics.checkNotNullParameter(components, "components");
                Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(launchNfcScan, "launchNfcScan");
                Intrinsics.checkNotNullParameter(launchJpMyNumberNfcScan, "launchJpMyNumberNfcScan");
                Intrinsics.checkNotNullParameter(onVerifyPersonaClick, "onVerifyPersonaClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onSuggestionSelected, "onSuggestionSelected");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                Intrinsics.checkNotNullParameter(onCreateReusablePersonaClick, "onCreateReusablePersonaClick");
                Intrinsics.checkNotNullParameter(onHelpBottomSheetDismissed, "onHelpBottomSheetDismissed");
                this.components = components;
                this.componentConfigs = list;
                this.componentErrors = componentErrors;
                this.navigationState = navigationState;
                this.navBarTitle = str;
                this.onClick = onClick;
                this.onComplete = onComplete;
                this.onCancel = onCancel;
                this.launchNfcScan = launchNfcScan;
                this.launchJpMyNumberNfcScan = launchJpMyNumberNfcScan;
                this.launchActionFromHelpSheet = function0;
                this.launchSecondaryActionFromHelpSheet = function02;
                this.onVerifyPersonaClick = onVerifyPersonaClick;
                this.autoSubmit = autoSubmit;
                this.onBack = onBack;
                this.onSuggestionSelected = onSuggestionSelected;
                this.isLoading = z10;
                this.styles = uiStepStyle;
                this.error = str2;
                this.onErrorDismissed = onErrorDismissed;
                this.onCreateReusablePersonaClick = onCreateReusablePersonaClick;
                this.helpBottomSheetViewModel = helpBottomSheetViewModel;
                this.shouldLaunchHelpBottomSheet = z11;
                this.onHelpBottomSheetDismissed = onHelpBottomSheetDismissed;
            }

            @Nullable
            /* renamed from: A, reason: from getter */
            public final StepStyles.UiStepStyle getStyles() {
                return this.styles;
            }

            /* renamed from: B, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            @Nullable
            public final Drawable a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return jr.d.a(uiStepStyle, context);
                }
                return null;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final AutoSubmit getAutoSubmit() {
                return this.autoSubmit;
            }

            @Nullable
            public final Integer c() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getBackgroundColorValue();
                }
                return null;
            }

            @Nullable
            public final List<UiComponentConfig> d() {
                return this.componentConfigs;
            }

            @NotNull
            public final List<UiComponentErrorInfo> e() {
                return this.componentErrors;
            }

            @NotNull
            public final List<UiComponent> f() {
                return this.components;
            }

            @Nullable
            /* renamed from: g, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @Nullable
            public final Integer h() {
                AttributeStyles.HeaderButtonColorStyle headerButtonColor;
                StyleElements.SimpleElementColor headerButton;
                StyleElements.SimpleElementColorValue base;
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                    return null;
                }
                return base.getValue();
            }

            @Nullable
            /* renamed from: i, reason: from getter */
            public final HelpBottomSheetViewModel getHelpBottomSheetViewModel() {
                return this.helpBottomSheetViewModel;
            }

            @Nullable
            public final Function0<Unit> j() {
                return this.launchActionFromHelpSheet;
            }

            @NotNull
            public final Function1<JpMyNumberNfcScanComponent, Unit> k() {
                return this.launchJpMyNumberNfcScan;
            }

            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> l() {
                return this.launchNfcScan;
            }

            @Nullable
            public final Function0<Unit> m() {
                return this.launchSecondaryActionFromHelpSheet;
            }

            @Nullable
            /* renamed from: n, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: o, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> p() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> q() {
                return this.onCancel;
            }

            @NotNull
            public final yt.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> r() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> s() {
                return this.onComplete;
            }

            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> t() {
                return this.onCreateReusablePersonaClick;
            }

            @NotNull
            public final Function0<Unit> u() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function0<Unit> v() {
                return this.onHelpBottomSheetDismissed;
            }

            @NotNull
            public final Function2<InputAddressComponent, String, Unit> w() {
                return this.onSuggestionSelected;
            }

            @NotNull
            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> x() {
                return this.onVerifyPersonaClick;
            }

            @Nullable
            public final StyleElements.PositionType y() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getPageLevelVerticalAlignment();
                }
                return null;
            }

            /* renamed from: z, reason: from getter */
            public final boolean getShouldLaunchHelpBottomSheet() {
                return this.shouldLaunchHelpBottomSheet;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13855a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.f28920c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13855a = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function1<HelpBottomSheetComponent, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f13856a = new e();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f13857t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, UiState, b, Object>.a f13858u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13859v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState f13860w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ButtonComponent f13861x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(wm.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState uiState, ButtonComponent buttonComponent, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f13858u = aVar;
            this.f13859v = uiWorkflow;
            this.f13860w = uiState;
            this.f13861x = buttonComponent;
        }

        public static final Unit q(UiState uiState, ButtonComponent buttonComponent, r.c cVar) {
            String str;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int intValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = buttonComponent.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = buttonComponent.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                str = x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                str = null;
            }
            cVar.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, intValue, str), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f13858u, this.f13859v, this.f13860w, this.f13861x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, UiState, ? extends b> d10;
            nt.c.e();
            if (this.f13857t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            wm.h<r<? super Input, UiState, ? extends b>> d11 = this.f13858u.d();
            UiWorkflow uiWorkflow = this.f13859v;
            final UiState uiState = this.f13860w;
            final ButtonComponent buttonComponent = this.f13861x;
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.h6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = UiWorkflow.f.q(UiState.this, buttonComponent, (r.c) obj2);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", f = "UiWorkflow.kt", l = {188}, m = "invokeSuspend")
    public static final class g extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f13862t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, UiState, b, Object>.a f13863u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13864v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f13865w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ UiState f13866x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(wm.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f13863u = aVar;
            this.f13864v = uiWorkflow;
            this.f13865w = autoSubmit;
            this.f13866x = uiState;
        }

        public static final Unit q(UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, r.c cVar) {
            int countdown = autoSubmit.getCountdown() - 1;
            UiState.Displaying displaying = (UiState.Displaying) uiState;
            AutoSubmitableComponent component = autoSubmit.getComponent();
            String autoSubmitCountdownText = autoSubmit.getComponent().getAutoSubmitCountdownText();
            cVar.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f13863u, this.f13864v, this.f13865w, this.f13866x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, UiState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f13862t;
            if (i10 == 0) {
                o.b(obj);
                this.f13862t = 1;
                if (z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            wm.h<r<? super Input, UiState, ? extends b>> d11 = this.f13863u.d();
            UiWorkflow uiWorkflow = this.f13864v;
            final UiState.Displaying.AutoSubmit autoSubmit = this.f13865w;
            final UiState uiState = this.f13866x;
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.i6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = UiWorkflow.g.q(UiState.Displaying.AutoSubmit.this, uiState, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ UiState.Displaying.NfcScan A;
        public final /* synthetic */ UiState.Displaying B;

        /* renamed from: t, reason: collision with root package name */
        public int f13867t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, UiState, b, Object>.a f13868u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow f13869v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f13870w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13871x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f13872y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Date f13873z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(wm.k<? super Input, UiState, ? extends b, ? extends Object>.a aVar, UiWorkflow uiWorkflow, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f13868u = aVar;
            this.f13869v = uiWorkflow;
            this.f13870w = attributes;
            this.f13871x = str;
            this.f13872y = date;
            this.f13873z = date2;
            this.A = nfcScan;
            this.B = displaying;
        }

        public static final Unit q(GovernmentIdNfcScan.Attributes attributes, UiWorkflow uiWorkflow, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, r.c cVar) {
            String string;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = uiWorkflow.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.p0(str)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (date == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (date2 == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            cVar.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new h(this.f13868u, this.f13869v, this.f13870w, this.f13871x, this.f13872y, this.f13873z, this.A, this.B, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, UiState, ? extends b> d10;
            nt.c.e();
            if (this.f13867t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            wm.h<r<? super Input, UiState, ? extends b>> d11 = this.f13868u.d();
            final UiWorkflow uiWorkflow = this.f13869v;
            final GovernmentIdNfcScan.Attributes attributes = this.f13870w;
            final String str = this.f13871x;
            final Date date = this.f13872y;
            final Date date2 = this.f13873z;
            final UiState.Displaying.NfcScan nfcScan = this.A;
            final UiState.Displaying displaying = this.B;
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.j6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = UiWorkflow.h.q(GovernmentIdNfcScan.Attributes.this, uiWorkflow, str, date, date2, nfcScan, displaying, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public UiWorkflow(@NotNull Context applicationContext, @NotNull b.a nfcScanWorkerFactory, @NotNull n.a scanJpMyNumberNfcWorkerFactory, @NotNull up.c sandboxFlags, @NotNull d.a createReusablePersonaWorkerFactory, @NotNull k.a verifyReusablePersonaWorkerFactory, @NotNull sq.a navigationStateManager, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull a componentWorkHelper, @NotNull nq.c externalEventLogger, @NotNull eo.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(scanJpMyNumberNfcWorkerFactory, "scanJpMyNumberNfcWorkerFactory");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.scanJpMyNumberNfcWorkerFactory = scanJpMyNumberNfcWorkerFactory;
        this.sandboxFlags = sandboxFlags;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final boolean A1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit B1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        return Unit.f22894a;
    }

    public static final Unit D1(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof h2) {
            ((h2) it).b(z10 ? Intrinsics.c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f22894a;
    }

    public static final Unit F0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f22894a;
    }

    public static final Unit H0(UiWorkflow uiWorkflow, Input input, UiState uiState, k.a aVar, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.componentWorkHelper.n0(input, (UiState.Displaying) uiState, aVar, component);
        return Unit.f22894a;
    }

    public static final Unit I0(UiWorkflow uiWorkflow, UiState uiState, k.a aVar) {
        r d10;
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit J0;
                J0 = UiWorkflow.J0((r.c) obj);
                return J0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit J0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(b.c.f13825a);
        return Unit.f22894a;
    }

    public static final Unit K0(UiWorkflow uiWorkflow, UiState uiState, k.a aVar, final Input input) {
        r d10;
        TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.v4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L0;
                L0 = UiWorkflow.L0(UiWorkflow.Input.this, (r.c) obj);
                return L0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit L0(Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262015, null));
        action.d(input.getFinalStep() ? b.c.f13825a : b.C0255b.f13824a);
        return Unit.f22894a;
    }

    public static final Unit M0(UiWorkflow uiWorkflow, UiState uiState, k.a aVar, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.q0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f22894a;
    }

    public static final Unit N0(UiWorkflow uiWorkflow, UiState uiState, k.a aVar, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.n0(component, (UiState.Displaying) uiState, aVar);
        return Unit.f22894a;
    }

    public static final Unit O0(HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, UiState uiState, k.a aVar) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            uiWorkflow.q0((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState, aVar);
        }
        return Unit.f22894a;
    }

    public static final Unit P0(final HelpBottomSheetComponent helpBottomSheetComponent, UiWorkflow uiWorkflow, final UiState uiState, k.a aVar) {
        GovernmentIdNfcScan.Attributes attributes;
        String unableToScanTransitionComponentName;
        r d10;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent) && (attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes()) != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
            uiWorkflow.C1(helpBottomSheetComponent, true, (UiState.Displaying) uiState);
            wm.h d11 = aVar.d();
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q0;
                    Q0 = UiWorkflow.Q0(UiState.this, helpBottomSheetComponent, (r.c) obj);
                    return Q0;
                }
            }, 1, null);
            d11.a(d10);
        }
        return Unit.f22894a;
    }

    public static final Unit Q0(UiState uiState, HelpBottomSheetComponent helpBottomSheetComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        GovernmentIdNfcScan.Attributes attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getConfig().getAttributes();
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, attributes != null ? attributes.getUnableToScanTransitionComponentName() : null));
        return Unit.f22894a;
    }

    public static final Unit R0(UiWorkflow uiWorkflow, final UiState uiState, k.a aVar, final VerifyPersonaButtonComponent component, final Map componentParams) {
        r d10;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        uiWorkflow.C1(component, true, (UiState.Displaying) uiState);
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit S0;
                S0 = UiWorkflow.S0(UiState.this, component, componentParams, (r.c) obj);
                return S0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit S0(UiState uiState, VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map map, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent, map), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22894a;
    }

    public static final boolean T0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit U0(k.a aVar, UiWorkflow uiWorkflow) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V0;
                V0 = UiWorkflow.V0((r.c) obj);
                return V0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit V0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.a.f13823a);
        return Unit.f22894a;
    }

    public static final Unit W0(k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final InputAddressComponent component, final String addressId) {
        r d10;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit X0;
                X0 = UiWorkflow.X0(UiState.this, component, addressId, (r.c) obj);
                return X0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit X0(UiState uiState, InputAddressComponent inputAddressComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.V(str).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit Y0(k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Z0;
                Z0 = UiWorkflow.Z0(UiState.this, (r.c) obj);
                return Z0;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit Z0(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f22894a;
    }

    public static final Unit a1(k.a aVar, UiWorkflow uiWorkflow, final UiState uiState, final CreatePersonaSheetComponent createReusablePersonaComponent, final UiComponent buttonClicked) {
        r d10;
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit b12;
                b12 = UiWorkflow.b1(UiState.this, createReusablePersonaComponent, buttonClicked, (r.c) obj);
                return b12;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit b1(UiState uiState, CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
        if (buttonComponent != null) {
            buttonComponent.b(true);
        }
        Unit unit = Unit.f22894a;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(components, createPersonaSheetComponent, ar.k.b(createPersonaSheetComponent, uiComponent, uiComponent)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22894a;
    }

    public static final Unit c1(k.a aVar, UiWorkflow uiWorkflow, final UiState uiState) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.d5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d12;
                d12 = UiWorkflow.d1(UiState.this, (r.c) obj);
                return d12;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit d1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f22894a;
    }

    public static final r e1(final UiWorkflow uiWorkflow, final k.a aVar, final boolean z10, final UiState uiState, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f12;
                f12 = UiWorkflow.f1(PermissionRequestWorkflow.Output.this, aVar, uiWorkflow, z10, uiState, (r.c) obj);
                return f12;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit f1(PermissionRequestWorkflow.Output output, k.a aVar, final UiWorkflow uiWorkflow, boolean z10, final UiState uiState, r.c action) {
        r d10;
        r d11;
        r d12;
        r d13;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f13855a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            wm.h d14 = aVar.d();
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.f5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit g12;
                    g12 = UiWorkflow.g1(UiWorkflow.this, (r.c) obj);
                    return g12;
                }
            }, 1, null);
            d14.a(d10);
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new gt.l();
            }
            wm.h d15 = aVar.d();
            d13 = z.d(uiWorkflow, null, new Function1() { // from class: mr.i5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit j12;
                    j12 = UiWorkflow.j1(UiState.this, (r.c) obj);
                    return j12;
                }
            }, 1, null);
            d15.a(d13);
        } else if (z10) {
            wm.h d16 = aVar.d();
            d12 = z.d(uiWorkflow, null, new Function1() { // from class: mr.g5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit h12;
                    h12 = UiWorkflow.h1(UiWorkflow.this, (r.c) obj);
                    return h12;
                }
            }, 1, null);
            d16.a(d12);
        } else {
            wm.h d17 = aVar.d();
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i12;
                    i12 = UiWorkflow.i1(UiState.this, (r.c) obj);
                    return i12;
                }
            }, 1, null);
            d17.a(d11);
        }
        return Unit.f22894a;
    }

    public static final Unit g1(UiWorkflow uiWorkflow, r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object c10 = a10.c();
        UiState.Displaying displaying = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        uiWorkflow.D0(a10, displaying);
        return Unit.f22894a;
    }

    public static final Unit h1(UiWorkflow uiWorkflow, r.c a10) {
        Intrinsics.checkNotNullParameter(a10, "$this$a");
        Object c10 = a10.c();
        UiState.Displaying displaying = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        uiWorkflow.D0(a10, displaying);
        return Unit.f22894a;
    }

    public static final Unit i1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, String.valueOf(Integer.parseInt(displaying.getRequestPermissionKey()) + 1), false, 0, null, 0, 252927, null));
        return Unit.f22894a;
    }

    public static final Unit j1(UiState uiState, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        return Unit.f22894a;
    }

    public static final Unit k1(final UiWorkflow uiWorkflow, final UiState uiState, Input input, k.a aVar, final UiComponent uiComponent, boolean z10, final Map componentParams) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType a10 = b4.a(uiComponent);
        if (a10 != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, a10, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        uiWorkflow.C1(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.f13251c || displaying.getHasRequestedGpsPermissions()) {
            wm.h d12 = aVar.d();
            d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.x4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit m12;
                    m12 = UiWorkflow.m1(componentParams, uiComponent, uiWorkflow, (r.c) obj);
                    return m12;
                }
            }, 1, null);
            d12.a(d10);
        } else {
            wm.h d13 = aVar.d();
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit l12;
                    l12 = UiWorkflow.l1(UiState.this, componentParams, uiComponent, (r.c) obj);
                    return l12;
                }
            }, 1, null);
            d13.a(d11);
        }
        return Unit.f22894a;
    }

    public static final Unit l1(UiState uiState, Map map, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, true, map, uiComponent, null, false, 0, null, 0, 254847, null));
        return Unit.f22894a;
    }

    public static final Unit m1(Map map, UiComponent uiComponent, UiWorkflow uiWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        UiState.Displaying v5 = UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, map, uiComponent, null, false, 0, null, 0, 255871, null);
        action.e(v5);
        uiWorkflow.D0(action, v5);
        return Unit.f22894a;
    }

    public static final Unit o0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = jpMyNumberNfcScanComponent.getName();
        JpMyNumberNfcScan.Attributes attributes = jpMyNumberNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (str = attributes.getEnableNfcPrompt()) == null) {
            str = "";
        }
        action.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", str), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
        return Unit.f22894a;
    }

    public static final r o1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, final GovernmentIdNfcScanComponent governmentIdNfcScanComponent, final PassportNfcReaderOutput output) {
        r d10;
        r d11;
        r d12;
        r d13;
        r d14;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, PassportNfcReaderOutput.Cancel.f12244a)) {
            d14 = z.d(uiWorkflow, null, new Function1() { // from class: mr.k5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p12;
                    p12 = UiWorkflow.p1(UiState.Displaying.this, (r.c) obj);
                    return p12;
                }
            }, 1, null);
            return d14;
        }
        if (output instanceof PassportNfcReaderOutput.Error) {
            d13 = z.d(uiWorkflow, null, new Function1() { // from class: mr.l5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit q12;
                    q12 = UiWorkflow.q1(UiState.Displaying.NfcScan.this, governmentIdNfcScanComponent, displaying, (r.c) obj);
                    return q12;
                }
            }, 1, null);
            return d13;
        }
        if (output instanceof PassportNfcReaderOutput.Success) {
            d12 = z.d(uiWorkflow, null, new Function1() { // from class: mr.m5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit r12;
                    r12 = UiWorkflow.r1(PassportNfcReaderOutput.this, displaying, nfcScan, (r.c) obj);
                    return r12;
                }
            }, 1, null);
            return d12;
        }
        if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.n5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit t12;
                    t12 = UiWorkflow.t1(UiState.Displaying.this, (r.c) obj);
                    return t12;
                }
            }, 1, null);
            return d11;
        }
        if (!(output instanceof PassportNfcReaderOutput.ReenterDetails)) {
            throw new gt.l();
        }
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.o5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u12;
                u12 = UiWorkflow.u1(UiState.Displaying.this, output, (r.c) obj);
                return u12;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit p0(UiState.Displaying displaying, JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, p.k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(jpMyNumberNfcScanComponent), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
        return Unit.f22894a;
    }

    public static final Unit p1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        return Unit.f22894a;
    }

    public static final Unit q1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, r.c action) {
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = nfcScan.getComponent().getName();
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (str = attributes.getScanDocumentError()) == null) {
            str = "";
        }
        action.e(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", str), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        return Unit.f22894a;
    }

    public static final Unit r0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, null, false, false, null, null, null, false, 0, null, 0, 245727, null));
        return Unit.f22894a;
    }

    public static final Unit r1(PassportNfcReaderOutput passportNfcReaderOutput, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying2 = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying2 == null) {
            return Unit.f22894a;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) cr.h.a(displaying2.getComponents(), d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: mr.a6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean s12;
                s12 = UiWorkflow.s1(UiState.Displaying.NfcScan.this, (GovernmentIdNfcScanComponent) obj);
                return Boolean.valueOf(s12);
            }
        });
        if (governmentIdNfcScanComponent == null) {
            return Unit.f22894a;
        }
        PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) passportNfcReaderOutput;
        governmentIdNfcScanComponent.getNfcDataController().c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, success.getSubmitButtonComponentName()));
        return Unit.f22894a;
    }

    public static final boolean s1(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final r t0(final UiState.PendingAction pendingAction, final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final d.b it) {
        r d10;
        r d11;
        r d12;
        Intrinsics.checkNotNullParameter(it, "it");
        if (((UiState.PendingAction.CreateReusablePersona) pendingAction).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            d12 = z.d(uiWorkflow, null, new Function1() { // from class: mr.w5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit u02;
                    u02 = UiWorkflow.u0((r.c) obj);
                    return u02;
                }
            }, 1, null);
            return d12;
        }
        if (Intrinsics.c(it, d.b.a.f13889a)) {
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.x5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit v02;
                    v02 = UiWorkflow.v0(UiState.Displaying.this, pendingAction, (r.c) obj);
                    return v02;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof d.b.Error)) {
            throw new gt.l();
        }
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.y5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w02;
                w02 = UiWorkflow.w0(d.b.this, displaying, uiWorkflow, pendingAction, (r.c) obj);
                return w02;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit t1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        return Unit.f22894a;
    }

    public static final Unit u0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.c.f13825a);
        return Unit.f22894a;
    }

    public static final Unit u1(UiState.Displaying displaying, PassportNfcReaderOutput passportNfcReaderOutput, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((PassportNfcReaderOutput.ReenterDetails) passportNfcReaderOutput).getButtonComponentName()));
        return Unit.f22894a;
    }

    public static final Unit v0(UiState.Displaying displaying, UiState.PendingAction pendingAction, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22894a;
    }

    public static final Unit w0(d.b bVar, UiState.Displaying displaying, UiWorkflow uiWorkflow, UiState.PendingAction pendingAction, r.c action) {
        UiState.Displaying v5;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((d.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            v5 = UiState.Displaying.v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(tp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null);
        } else {
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            v5 = UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null);
        }
        action.e(v5);
        return Unit.f22894a;
    }

    public static final r w1(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, final JpMyNumberNfcReaderOutput output) {
        r d10;
        r d11;
        r d12;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            d12 = z.d(uiWorkflow, null, new Function1() { // from class: mr.p5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit x12;
                    x12 = UiWorkflow.x1(JpMyNumberNfcReaderOutput.this, displaying, jpMyNumberNfcScanComponent, (r.c) obj);
                    return x12;
                }
            }, 1, null);
            return d12;
        }
        if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit z12;
                    z12 = UiWorkflow.z1(JpMyNumberNfcReaderOutput.this, displaying, jpMyNumberNfcScanComponent, (r.c) obj);
                    return z12;
                }
            }, 1, null);
            return d11;
        }
        if (!Intrinsics.c(output, JpMyNumberNfcReaderOutput.Cancel.f12200a)) {
            throw new gt.l();
        }
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.r5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B1;
                B1 = UiWorkflow.B1(UiState.Displaying.this, (r.c) obj);
                return B1;
            }
        }, 1, null);
        return d10;
    }

    public static final r x0(final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final k.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, k.b.a.f13966a)) {
            d11 = z.d(uiWorkflow, null, new Function1() { // from class: mr.s5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit y02;
                    y02 = UiWorkflow.y0(UiState.Displaying.this, (r.c) obj);
                    return y02;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof k.b.Error)) {
            throw new gt.l();
        }
        d10 = z.d(uiWorkflow, null, new Function1() { // from class: mr.t5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit z02;
                z02 = UiWorkflow.z0(k.b.this, uiWorkflow, displaying, (r.c) obj);
                return z02;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit x1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        cr.j scanResultController;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying2 = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying2 == null) {
            return Unit.f22894a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) cr.h.a(displaying2.getComponents(), d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: mr.b6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean y12;
                y12 = UiWorkflow.y1(JpMyNumberNfcScanComponent.this, (JpMyNumberNfcScanComponent) obj);
                return Boolean.valueOf(y12);
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (scanResultController = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            scanResultController.c(((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getResult());
        }
        action.e(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((JpMyNumberNfcReaderOutput.Success) jpMyNumberNfcReaderOutput).getTransitionComponentName()));
        return Unit.f22894a;
    }

    public static final Unit y0(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        action.d(new b.FinishedWithTransition(true));
        return Unit.f22894a;
    }

    public static final boolean y1(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit z0(k.b bVar, UiWorkflow uiWorkflow, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((k.b.Error) bVar).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(tp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22894a;
    }

    public static final Unit z1(JpMyNumberNfcReaderOutput jpMyNumberNfcReaderOutput, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, r.c action) {
        cr.j scanResultController;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        UiState.Displaying displaying2 = c10 instanceof UiState.Displaying ? (UiState.Displaying) c10 : null;
        if (displaying2 == null) {
            return Unit.f22894a;
        }
        JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) cr.h.a(displaying2.getComponents(), d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: mr.z5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean A1;
                A1 = UiWorkflow.A1(JpMyNumberNfcScanComponent.this, (JpMyNumberNfcScanComponent) obj);
                return Boolean.valueOf(A1);
            }
        });
        if (jpMyNumberNfcScanComponent2 != null && (scanResultController = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
            scanResultController.c(((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getResult());
        }
        String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) jpMyNumberNfcReaderOutput).getTransitionComponentName();
        action.e((transitionComponentName == null || transitionComponentName.length() == 0) ? UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null) : com.withpersona.sdk2.inquiry.ui.b.b(displaying, transitionComponentName));
        return Unit.f22894a;
    }

    @Override // wm.k
    @NotNull
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public UiState d(@NotNull Input props, @Nullable Snapshot snapshot) {
        List<UiComponent> k10;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            wu.h b10 = snapshot.b();
            Parcelable parcelable = null;
            if (b10.I() <= 0) {
                b10 = null;
            }
            if (b10 != null) {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                byte[] O = b10.O();
                obtain.unmarshall(O, 0, O.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
            }
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (k10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components)) == null) {
            k10 = p.k();
        }
        if (!this.featureFlagManager.a(eo.t.f16115a)) {
            k10 = com.withpersona.sdk2.inquiry.ui.b.d(k10);
        }
        List<UiComponent> list = k10;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> s8 = props.s();
        if (s8 == null) {
            s8 = p.k();
        }
        return new UiState.Displaying(list, stepName, s8, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final boolean B0(JpMyNumberNfcScanComponent component) {
        List<String> d10;
        if (!this.sandboxFlags.c()) {
            return !jp.j.f22005a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean c10 = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation validOperation = component.getValidOperation();
        return !c10 && jp.m.f22012a.a((validOperation == null || (d10 = validOperation.d()) == null) ? null : (String) CollectionsKt.firstOrNull(d10));
    }

    public final void C0(Input renderProps, UiState renderState) {
        nq.i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new gt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new gt.l();
                }
                dVar = new i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new i.d(renderProps.getStepName()) : new i.f(renderProps.getStepName());
        }
        String str = dVar.getStepName() + ":" + dVar;
        if (Intrinsics.c(str, this.lastLoggedPage)) {
            return;
        }
        this.lastLoggedPage = str;
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void C1(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        E0(renderState.getComponents(), new Function1() { // from class: mr.v5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D1;
                D1 = UiWorkflow.D1(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
                return D1;
            }
        });
    }

    public final void D0(r<? super Input, UiState, ? extends b>.c cVar, UiState.Displaying displaying) {
        UiComponent triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> z10 = displaying.z();
        if (triggeringComponent == null || z10 == null) {
            return;
        }
        cVar.d(new b.FinishedWithoutTransition(triggeringComponent, z10, displaying.getStepName()));
    }

    public final void E0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                E0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: mr.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit F0;
                        F0 = UiWorkflow.F0(Function1.this, (UiComponent) obj);
                        return F0;
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    @Override // wm.k
    @NotNull
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    @Override // wm.k
    @NotNull
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Input renderProps, @NotNull final UiState renderState, @NotNull final wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        final UiWorkflow uiWorkflow;
        final UiState uiState;
        c.a.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (renderProps.getIsRestoringState()) {
            return Unit.f22894a;
        }
        C0(renderProps, renderState);
        if (!(renderState instanceof UiState.Displaying)) {
            throw new gt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        s0(renderProps, displaying, context);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) cr.h.a(displaying.getComponents(), d0.b(HelpBottomSheetComponent.class), e.f13856a);
        boolean z10 = helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled();
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting(), z10);
        E0(displaying.getComponents(), new Function1() { // from class: mr.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit H0;
                H0 = UiWorkflow.H0(UiWorkflow.this, renderProps, renderState, context, (UiComponent) obj);
                return H0;
            }
        });
        if (displaying.getNfcScan() != null) {
            n1(renderProps, displaying, context, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            v1(renderProps, displaying, context, displaying.getJpMyNumberNfcScan());
        }
        i0 i0Var = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.f13254a ? i0.f28912c : i0.f28913d;
        final boolean z11 = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.b;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(tp.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) cr.h.a(displaying.getComponents(), d0.b(ButtonComponent.class), new Function1() { // from class: mr.e6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean T0;
                    T0 = UiWorkflow.T0((ButtonComponent) obj);
                    return Boolean.valueOf(T0);
                }
            });
            if (buttonComponent != null) {
                context.b("begin_countdown", new f(context, this, renderState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 == null || autoSubmit2.getCountdown() < 1) {
            uiWorkflow = this;
            uiState = renderState;
        } else {
            String str2 = "countdown_" + autoSubmit2.getCountdown();
            g gVar = new g(context, this, autoSubmit2, renderState, null);
            uiWorkflow = this;
            uiState = renderState;
            context.b(str2, gVar);
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = renderProps.getComponents();
        List<UiComponentErrorInfo> x10 = displaying.x();
        List<UiComponentErrorInfo> s8 = renderProps.s();
        if (s8 == null) {
            s8 = p.k();
        }
        List w02 = CollectionsKt.w0(x10, s8);
        NavigationState b10 = uiWorkflow.navigationStateManager.b();
        String navBarTitle = renderProps.getNavBarTitle();
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        c.a aVar = new c.a(components, components2, w02, b10, navBarTitle, new yt.n() { // from class: mr.f6
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit k12;
                k12 = UiWorkflow.k1(UiWorkflow.this, uiState, renderProps, context, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
                return k12;
            }
        }, new Function0() { // from class: mr.g6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit I0;
                I0 = UiWorkflow.I0(UiWorkflow.this, uiState, context);
                return I0;
            }
        }, new Function0() { // from class: mr.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K0;
                K0 = UiWorkflow.K0(UiWorkflow.this, uiState, context, renderProps);
                return K0;
            }
        }, new Function1() { // from class: mr.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit M0;
                M0 = UiWorkflow.M0(UiWorkflow.this, uiState, context, (GovernmentIdNfcScanComponent) obj);
                return M0;
            }
        }, new Function1() { // from class: mr.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit N0;
                N0 = UiWorkflow.N0(UiWorkflow.this, uiState, context, (JpMyNumberNfcScanComponent) obj);
                return N0;
            }
        }, new Function0() { // from class: mr.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit O0;
                O0 = UiWorkflow.O0(HelpBottomSheetComponent.this, uiWorkflow, uiState, context);
                return O0;
            }
        }, new Function0() { // from class: mr.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit P0;
                P0 = UiWorkflow.P0(HelpBottomSheetComponent.this, uiWorkflow, uiState, context);
                return P0;
            }
        }, new Function2() { // from class: mr.i4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit R0;
                R0 = UiWorkflow.R0(UiWorkflow.this, uiState, context, (VerifyPersonaButtonComponent) obj, (Map) obj2);
                return R0;
            }
        }, autoSubmit, new Function0() { // from class: mr.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit U0;
                U0 = UiWorkflow.U0(k.a.this, uiWorkflow);
                return U0;
            }
        }, new Function2() { // from class: mr.y4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit W0;
                W0 = UiWorkflow.W0(k.a.this, uiWorkflow, uiState, (InputAddressComponent) obj, (String) obj2);
                return W0;
            }
        }, displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new Function0() { // from class: mr.j5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Y0;
                Y0 = UiWorkflow.Y0(k.a.this, uiWorkflow, uiState);
                return Y0;
            }
        }, new Function2() { // from class: mr.u5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit a12;
                a12 = UiWorkflow.a1(k.a.this, uiWorkflow, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
                return a12;
            }
        }, helpBottomSheetComponent != null ? HelpBottomSheetComponent.x2(helpBottomSheetComponent, 0, 1, null) : null, z10 && displaying.getShowHelpBottomSheet(), new Function0() { // from class: mr.c6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c12;
                c12 = UiWorkflow.c1(k.a.this, uiWorkflow, uiState);
                return c12;
            }
        });
        boolean isRequestingGpsPermissions = displaying.getIsRequestingGpsPermissions();
        String gpsPermissionsTitle = renderProps.getGpsPermissionsTitle();
        if (gpsPermissionsTitle == null) {
            gpsPermissionsTitle = "";
        }
        String gpsPermissionsRationale = renderProps.getGpsPermissionsRationale();
        if (gpsPermissionsRationale == null) {
            gpsPermissionsRationale = "Gps permission are required to verify your identity";
        }
        Context context2 = uiWorkflow.applicationContext;
        String string = context2.getString(tp.g.f32385c0, hq.g.b(context2));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = uiWorkflow.applicationContext.getString(tp.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = uiWorkflow.applicationContext.getString(tp.g.D);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        return com.withpersona.sdk2.inquiry.permissions.g.d(aVar, context, isRequestingGpsPermissions, i0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getGpsPermissionsModalNegativeButton(), uiWorkflow.permissionRequestWorkflow, renderProps.getStyles(), displaying.getRequestPermissionKey(), new Function1() { // from class: mr.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r e12;
                e12 = UiWorkflow.e1(UiWorkflow.this, context, z11, uiState, (PermissionRequestWorkflow.Output) obj);
                return e12;
            }
        });
    }

    public final void n0(final JpMyNumberNfcScanComponent component, final UiState.Displaying renderState, wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        r<? super Object, UiState, ? extends Object> d10;
        r<? super Object, UiState, ? extends Object> d11;
        if (component.getValidOperation() == null) {
            return;
        }
        if (B0(component)) {
            wm.h<r<? super Object, UiState, ? extends Object>> d12 = context.d();
            d11 = z.d(this, null, new Function1() { // from class: mr.q4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit o02;
                    o02 = UiWorkflow.o0(UiState.Displaying.this, component, (r.c) obj);
                    return o02;
                }
            }, 1, null);
            d12.a(d11);
        } else {
            C1(component, true, renderState);
            wm.h<r<? super Object, UiState, ? extends Object>> d13 = context.d();
            d10 = z.d(this, null, new Function1() { // from class: mr.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p02;
                    p02 = UiWorkflow.p0(UiState.Displaying.this, component, (r.c) obj);
                    return p02;
                }
            }, 1, null);
            d13.a(d10);
        }
    }

    public final void n1(Input renderProps, final UiState.Displaying renderState, wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends op.b> n10;
        String scanDocumentError;
        String str;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String b10 = component.getCardAccessNumberController().b();
        String b11 = component.getDocumentNumberController().b();
        Date b12 = component.getDateOfBirthController().b();
        Date b13 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(b11) || b12 == null || b13 == null) {
            context.b("client_side_nfc_form_validation", new h(context, this, attributes, b11, b12, b13, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(b11, b13, b12);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            n10 = p.n(op.b.f28093a, op.b.b, op.b.f28095d);
        } else {
            n10 = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = d.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                op.b bVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : op.b.f28095d : op.b.f28094c : op.b.b : op.b.f28093a;
                if (bVar != null) {
                    n10.add(bVar);
                }
            }
        }
        b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        String string = this.applicationContext.getString(tp.g.C);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(tp.g.D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(tp.g.C);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                str = "";
                String string4 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String str11 = (attributes != null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
                String string5 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String str12 = (attributes != null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
                String string6 = this.applicationContext.getString(tp.g.F);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                w.l(context, aVar.a(b10, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), n10, renderProps.getStyles(), null, component.getConfig().getStyles()), d0.k(com.withpersona.sdk2.inquiry.nfc.b.class), "", new Function1() { // from class: mr.z4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r o12;
                        o12 = UiWorkflow.o1(UiWorkflow.this, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
                        return o12;
                    }
                });
            }
        }
        str = scanDocumentError;
        String string42 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
        if (attributes != null) {
        }
        String string52 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
        if (attributes != null) {
        }
        String string62 = this.applicationContext.getString(tp.g.F);
        Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
        w.l(context, aVar.a(b10, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string42, str11, string52, str12, string62, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), n10, renderProps.getStyles(), null, component.getConfig().getStyles()), d0.k(com.withpersona.sdk2.inquiry.nfc.b.class), "", new Function1() { // from class: mr.z4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r o12;
                o12 = UiWorkflow.o1(UiWorkflow.this, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
                return o12;
            }
        });
    }

    public final void q0(final GovernmentIdNfcScanComponent component, final UiState.Displaying renderState, wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        r<? super Object, UiState, ? extends Object> d10;
        C1(component, true, renderState);
        wm.h<r<? super Object, UiState, ? extends Object>> d11 = context.d();
        d10 = z.d(this, null, new Function1() { // from class: mr.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit r02;
                r02 = UiWorkflow.r0(GovernmentIdNfcScanComponent.this, renderState, (r.c) obj);
                return r02;
            }
        }, 1, null);
        d11.a(d10);
    }

    public final void s0(Input renderProps, final UiState.Displaying renderState, wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w.l(context, aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), d0.k(com.withpersona.sdk2.inquiry.ui.d.class), "", new Function1() { // from class: mr.m4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r t02;
                    t02 = UiWorkflow.t0(UiState.PendingAction.this, this, renderState, (d.b) obj);
                    return t02;
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new gt.l();
            }
            return;
        }
        k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        w.l(context, aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), d0.k(k.class), "", new Function1() { // from class: mr.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r x02;
                x02 = UiWorkflow.x0(UiWorkflow.this, renderState, (k.b) obj);
                return x02;
            }
        });
    }

    public final void v1(Input renderProps, final UiState.Displaying renderState, wm.k<? super Input, UiState, ? extends b, ? extends Object>.a context, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation validOperation = component.getValidOperation();
        if (validOperation == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        w.l(context, this.scanJpMyNumberNfcWorkerFactory.a(validOperation, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), d0.k(n.class), "", new Function1() { // from class: mr.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r w12;
                w12 = UiWorkflow.w1(UiWorkflow.this, renderState, component, (JpMyNumberNfcReaderOutput) obj);
                return w12;
            }
        });
    }
}
