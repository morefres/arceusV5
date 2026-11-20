package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.a;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.e;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import gt.l;
import gt.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import k6.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
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
import yq.UiStepBottomSheet;
import zl.t;
import zn.a;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006F`aHbJBq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J7\u0010&\u001a\u00020%*\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'JU\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u00020(2\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b/\u00100JU\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u0002012\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b2\u00103JG\u00107\u001a\u00020%*\u0002042\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020%*\u0002092\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorker", "Lzn/a$a;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lzn/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "", "K0", "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "context", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "A0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lwm/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "B0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lwm/k$a;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "renderProps", "renderState", "H1", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lwm/k$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "I1", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lwm/k$a;)V", "props", "Lwm/i;", "snapshot", "J0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "state", "a2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lwm/i;", "V0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lwm/k$a;)Ljava/lang/Object;", ve.a.f33391e, "Lk6/s;", j6.b.f21518e, "Landroid/content/Context;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/document/a;", "e", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "f", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "g", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "i", "Lzn/a$a;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "k", "Lsq/a;", "l", "Lnq/c;", "m", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Input", "StartPage", "State", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocumentWorkflow extends k<Input, State, b, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.a documentCameraWorker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.b documentsSelectWorkerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0184a documentCreateWorker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a documentLoadWorker;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a documentFileUploadWorker;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0697a documentFileDeleteWorker;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.a documentSubmitWorker;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b5\u0010,J\u001a\u00108\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u00104R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u00104R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u00104R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bO\u00104R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010Z\u001a\u0004\bR\u0010,R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010[\u001a\u0004\bE\u0010\\R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010[\u001a\u0004\bG\u0010\\R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\b]\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\b`\u00104R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\ba\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010;\u001a\u0004\b^\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b<\u0010g\u001a\u0004\b:\u0010hR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bL\u0010i\u001a\u0004\bc\u0010jR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010;\u001a\u0004\bZ\u00104R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010;\u001a\u0004\bK\u00104R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\bb\u00104R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b_\u0010l\u001a\u0004\bM\u0010m¨\u0006n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "startPage", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "", "documentFileLimit", "", "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "largeFileErrorPrompt", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "promptPageNavBarTitle", "checkPageNavBarTitle", "pendingPageNavBarTitle", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "y", j6.b.f21518e, "r", "c", "q", rl.d.f30696a, "p", "e", "J", "f", "G", "g", "k", "h", "N", "i", "z", "j", "v", "o", "l", "s", "m", "n", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "K", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "u", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "I", "Z", "()Z", "E", t.f38095d, "D", "C", "A", "w", "x", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "L", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "B", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @Nullable
        public final String promptPageNavBarTitle;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final String checkPageNavBarTitle;

        /* renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String pendingPageNavBarTitle;

        /* renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String promptTitle;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String promptDescription;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String disclaimer;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String submitButtonText;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String pendingTitle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String pendingDescription;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyDocument;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String kind;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String documentId;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final StartPage startPage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final DocumentPages pages;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        public final int documentFileLimit;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsTitle;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsRationale;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalPositiveButton;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String permissionsModalNegativeButton;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String largeFileErrorPrompt;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.DocumentStepStyle styles;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Document.AssetConfig assetConfig;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StartPage) parcel.readParcelable(Input.class.getClassLoader()), DocumentPages.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.DocumentStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String fieldKeyDocument, @NotNull String kind, @Nullable String str7, @NotNull StartPage startPage, @NotNull DocumentPages pages, int i10, boolean z10, boolean z11, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull NextStep.Document.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(startPage, "startPage");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.promptTitle = str;
            this.promptDescription = str2;
            this.disclaimer = str3;
            this.submitButtonText = str4;
            this.pendingTitle = str5;
            this.pendingDescription = str6;
            this.fieldKeyDocument = fieldKeyDocument;
            this.kind = kind;
            this.documentId = str7;
            this.startPage = startPage;
            this.pages = pages;
            this.documentFileLimit = i10;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.permissionsTitle = str8;
            this.permissionsRationale = str9;
            this.permissionsModalPositiveButton = str10;
            this.permissionsModalNegativeButton = str11;
            this.largeFileErrorPrompt = str12;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.promptPageNavBarTitle = str13;
            this.checkPageNavBarTitle = str14;
            this.pendingPageNavBarTitle = str15;
            this.customPendingPage = customPendingPage;
        }

        @Nullable
        /* renamed from: A, reason: from getter */
        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }

        @Nullable
        /* renamed from: C, reason: from getter */
        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        @Nullable
        /* renamed from: D, reason: from getter */
        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        @Nullable
        /* renamed from: E, reason: from getter */
        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        @Nullable
        /* renamed from: G, reason: from getter */
        public final String getPromptDescription() {
            return this.promptDescription;
        }

        @Nullable
        /* renamed from: I, reason: from getter */
        public final String getPromptPageNavBarTitle() {
            return this.promptPageNavBarTitle;
        }

        @Nullable
        /* renamed from: J, reason: from getter */
        public final String getPromptTitle() {
            return this.promptTitle;
        }

        @NotNull
        /* renamed from: K, reason: from getter */
        public final StartPage getStartPage() {
            return this.startPage;
        }

        @Nullable
        /* renamed from: L, reason: from getter */
        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* renamed from: N, reason: from getter */
        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
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
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.fromStep, input.fromStep) && Intrinsics.c(this.fromComponent, input.fromComponent) && Intrinsics.c(this.promptTitle, input.promptTitle) && Intrinsics.c(this.promptDescription, input.promptDescription) && Intrinsics.c(this.disclaimer, input.disclaimer) && Intrinsics.c(this.submitButtonText, input.submitButtonText) && Intrinsics.c(this.pendingTitle, input.pendingTitle) && Intrinsics.c(this.pendingDescription, input.pendingDescription) && Intrinsics.c(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.c(this.kind, input.kind) && Intrinsics.c(this.documentId, input.documentId) && Intrinsics.c(this.startPage, input.startPage) && Intrinsics.c(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.permissionsTitle, input.permissionsTitle) && Intrinsics.c(this.permissionsRationale, input.permissionsRationale) && Intrinsics.c(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.c(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.c(this.largeFileErrorPrompt, input.largeFileErrorPrompt) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.c(this.promptPageNavBarTitle, input.promptPageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, input.checkPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, input.pendingPageNavBarTitle) && Intrinsics.c(this.customPendingPage, input.customPendingPage);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public int hashCode() {
            int hashCode = ((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31;
            String str = this.promptTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int hashCode7 = (((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.kind.hashCode()) * 31;
            String str7 = this.documentId;
            int hashCode8 = (((((((((((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.startPage.hashCode()) * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.documentFileLimit)) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31;
            String str8 = this.permissionsTitle;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.largeFileErrorPrompt;
            int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int hashCode14 = (((((hashCode13 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31;
            String str13 = this.promptPageNavBarTitle;
            int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.checkPageNavBarTitle;
            int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.pendingPageNavBarTitle;
            int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            return hashCode17 + (customPendingPage != null ? customPendingPage.hashCode() : 0);
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getCheckPageNavBarTitle() {
            return this.checkPageNavBarTitle;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: m, reason: from getter */
        public final int getDocumentFileLimit() {
            return this.documentFileLimit;
        }

        @Nullable
        /* renamed from: n, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        /* renamed from: o, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* renamed from: p, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        /* renamed from: r, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* renamed from: s, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        @Nullable
        /* renamed from: t, reason: from getter */
        public final String getLargeFileErrorPrompt() {
            return this.largeFileErrorPrompt;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromStep=" + this.fromStep + ", fromComponent=" + this.fromComponent + ", promptTitle=" + this.promptTitle + ", promptDescription=" + this.promptDescription + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", pendingTitle=" + this.pendingTitle + ", pendingDescription=" + this.pendingDescription + ", fieldKeyDocument=" + this.fieldKeyDocument + ", kind=" + this.kind + ", documentId=" + this.documentId + ", startPage=" + this.startPage + ", pages=" + this.pages + ", documentFileLimit=" + this.documentFileLimit + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", permissionsTitle=" + this.permissionsTitle + ", permissionsRationale=" + this.permissionsRationale + ", permissionsModalPositiveButton=" + this.permissionsModalPositiveButton + ", permissionsModalNegativeButton=" + this.permissionsModalNegativeButton + ", largeFileErrorPrompt=" + this.largeFileErrorPrompt + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", promptPageNavBarTitle=" + this.promptPageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", customPendingPage=" + this.customPendingPage + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final DocumentPages getPages() {
            return this.pages;
        }

        @Nullable
        /* renamed from: v, reason: from getter */
        public final String getPendingDescription() {
            return this.pendingDescription;
        }

        @Nullable
        /* renamed from: w, reason: from getter */
        public final String getPendingPageNavBarTitle() {
            return this.pendingPageNavBarTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromStep);
            dest.writeString(this.fromComponent);
            dest.writeString(this.promptTitle);
            dest.writeString(this.promptDescription);
            dest.writeString(this.disclaimer);
            dest.writeString(this.submitButtonText);
            dest.writeString(this.pendingTitle);
            dest.writeString(this.pendingDescription);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.kind);
            dest.writeString(this.documentId);
            dest.writeParcelable(this.startPage, flags);
            this.pages.writeToParcel(dest, flags);
            dest.writeInt(this.documentFileLimit);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.permissionsTitle);
            dest.writeString(this.permissionsRationale);
            dest.writeString(this.permissionsModalPositiveButton);
            dest.writeString(this.permissionsModalNegativeButton);
            dest.writeString(this.largeFileErrorPrompt);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeString(this.promptPageNavBarTitle);
            dest.writeString(this.checkPageNavBarTitle);
            dest.writeString(this.pendingPageNavBarTitle);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @NotNull
        /* renamed from: x, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* renamed from: z, reason: from getter */
        public final String getPendingTitle() {
            return this.pendingTitle;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "Landroid/os/Parcelable;", "Prompt", "Review", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartPage extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Prompt implements StartPage {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Prompt f10091a = new Prompt();

            @NotNull
            public static final Parcelable.Creator<Prompt> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Prompt> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Prompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Prompt.f10091a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Prompt[] newArray(int i10) {
                    return new Prompt[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Prompt);
            }

            public int hashCode() {
                return 813153962;
            }

            @NotNull
            public String toString() {
                return "Prompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Review implements StartPage {

            @NotNull
            public static final Parcelable.Creator<Review> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Review> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Review createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Review(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Review[] newArray(int i10) {
                    return new Review[i10];
                }
            }

            public Review(@NotNull String documentId) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Review) && Intrinsics.c(this.documentId, ((Review) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            @NotNull
            public String toString() {
                return "Review(documentId=" + this.documentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.documentId);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014()*+,B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0004-./0¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "", "documentId", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;)V", "other", "", "q0", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z", "shouldShowUploadOptionsDialog", "f", "(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "documentFileToDelete", "g", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "c", "Ljava/lang/String;", "k", "()Ljava/lang/String;", rl.d.f30696a, "Ljava/util/List;", "m", "()Ljava/util/List;", "UploadState", "Start", "ReviewCapturesWithoutDocumentId", "ReviewCaptures", "UploadDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class State implements WorkflowState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final a captureState;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final UploadState uploadState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String documentId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<DocumentFile> documents;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "Landroid/os/Parcelable;", "CreateDocument", "UploadFiles", "DeleteFiles", "ReadyToSubmit", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface UploadState extends Parcelable {

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CreateDocument implements UploadState {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final CreateDocument f10120a = new CreateDocument();

                @NotNull
                public static final Parcelable.Creator<CreateDocument> CREATOR = new a();

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<CreateDocument> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final CreateDocument createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return CreateDocument.f10120a;
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final CreateDocument[] newArray(int i10) {
                        return new CreateDocument[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    return this == other || (other instanceof CreateDocument);
                }

                public int hashCode() {
                    return 1079141691;
                }

                @NotNull
                public String toString() {
                    return "CreateDocument";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DeleteFiles implements UploadState {

                @NotNull
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DeleteFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DeleteFiles(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles[] newArray(int i10) {
                        return new DeleteFiles[i10];
                    }
                }

                public DeleteFiles(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @NotNull
                /* renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DeleteFiles) && Intrinsics.c(this.documentId, ((DeleteFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "DeleteFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getDocumentId", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ReadyToSubmit implements UploadState {

                @NotNull
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReadyToSubmit> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ReadyToSubmit(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit[] newArray(int i10) {
                        return new ReadyToSubmit[i10];
                    }
                }

                public ReadyToSubmit(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReadyToSubmit) && Intrinsics.c(this.documentId, ((ReadyToSubmit) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "ReadyToSubmit(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UploadFiles implements UploadState {

                @NotNull
                public static final Parcelable.Creator<UploadFiles> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String documentId;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<UploadFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UploadFiles(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles[] newArray(int i10) {
                        return new UploadFiles[i10];
                    }
                }

                public UploadFiles(@NotNull String documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    this.documentId = documentId;
                }

                @NotNull
                /* renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UploadFiles) && Intrinsics.c(this.documentId, ((UploadFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                @NotNull
                public String toString() {
                    return "UploadFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f10124a = new a("None", 0);
            public static final a b = new a("CheckCameraPermissions", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f10125c = new a("CameraRunning", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final a f10126d = new a("SelectFileFromDocuments", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final a f10127e = new a("SelectImageFromPhotoLibrary", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ a[] f10128f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ pt.a f10129g;

            static {
                a[] a10 = a();
                f10128f = a10;
                f10129g = pt.b.a(a10);
            }

            public a(String str, int i10) {
            }

            public static final /* synthetic */ a[] a() {
                return new a[]{f10124a, b, f10125c, f10126d, f10127e};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f10128f.clone();
            }
        }

        public /* synthetic */ State(a aVar, UploadState uploadState, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, uploadState, str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State i(State state, UploadState uploadState, String str, List list, DocumentFile documentFile, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithUploadState");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                list = null;
            }
            if ((i10 & 8) != 0) {
                documentFile = null;
            }
            return state.g(uploadState, str, list, documentFile);
        }

        @NotNull
        public final State a(@NotNull a captureState) {
            Intrinsics.checkNotNullParameter(captureState, "captureState");
            if (this instanceof Start) {
                return Start.p((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.p((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.p((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, false, null, 251, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new l();
        }

        @NotNull
        public final State f(boolean shouldShowUploadOptionsDialog) {
            if (this instanceof Start) {
                return Start.p((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.p((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.p((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new l();
        }

        @NotNull
        public final State g(@NotNull UploadState uploadState, @Nullable String documentId, @Nullable List<? extends DocumentFile> documents, @Nullable DocumentFile documentFileToDelete) {
            Intrinsics.checkNotNullParameter(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = start.getDocumentId();
                }
                return Start.p(start, null, uploadState, documentId, false, 9, null);
            }
            if (this instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) this;
                if (documents == null) {
                    documents = reviewCaptures.m();
                }
                return ReviewCaptures.p(reviewCaptures, documents, null, null, uploadState, documentFileToDelete, false, false, null, 230, null);
            }
            if (!(this instanceof ReviewCapturesWithoutDocumentId)) {
                if (this instanceof UploadDocument) {
                    return UploadDocument.p((UploadDocument) this, null, null, uploadState, null, 11, null);
                }
                throw new l();
            }
            ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) this;
            if (documentId == null) {
                documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            }
            String str = documentId;
            if (documents == null) {
                documents = reviewCapturesWithoutDocumentId.m();
            }
            return ReviewCapturesWithoutDocumentId.p(reviewCapturesWithoutDocumentId, documents, str, null, uploadState, documentFileToDelete, false, false, null, 228, null);
        }

        @NotNull
        /* renamed from: j, reason: from getter */
        public a getCaptureState() {
            return this.captureState;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public List<DocumentFile> m() {
            return this.documents;
        }

        @NotNull
        /* renamed from: n, reason: from getter */
        public UploadState getUploadState() {
            return this.uploadState;
        }

        @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
        public boolean q0(@NotNull WorkflowState other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return getClass() == other.getClass() && getCaptureState() == ((State) other).getCaptureState();
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "h", "getError", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UploadDocument extends State {

            @NotNull
            public static final Parcelable.Creator<UploadDocument> CREATOR = new a();

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UploadDocument> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UploadDocument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), (UploadState) parcel.readParcelable(UploadDocument.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UploadDocument[] newArray(int i10) {
                    return new UploadDocument[i10];
                }
            }

            public /* synthetic */ UploadDocument(List list, String str, UploadState uploadState, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? UploadState.CreateDocument.f10120a : uploadState, (i10 & 8) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UploadDocument p(UploadDocument uploadDocument, List list, String str, UploadState uploadState, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i10 & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i10 & 4) != 0) {
                    uploadState = uploadDocument.uploadState;
                }
                if ((i10 & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.o(list, str, uploadState, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) other;
                return Intrinsics.c(this.documents, uploadDocument.documents) && Intrinsics.c(this.documentId, uploadDocument.documentId) && Intrinsics.c(this.uploadState, uploadDocument.uploadState) && Intrinsics.c(this.error, uploadDocument.error);
            }

            public int hashCode() {
                int hashCode = ((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                String str = this.error;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            public List<DocumentFile> m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final UploadDocument o(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull UploadState uploadState, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new UploadDocument(documents, documentId, uploadState, error);
            }

            @NotNull
            public String toString() {
                return "UploadDocument(documents=" + this.documents + ", documentId=" + this.documentId + ", uploadState=" + this.uploadState + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UploadDocument(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull UploadState uploadState, @Nullable String str) {
                super(a.f10124a, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.uploadState = uploadState;
                this.error = str;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(a aVar, UploadState uploadState, String str, List<? extends DocumentFile> list) {
            this.captureState = aVar;
            this.uploadState = uploadState;
            this.documentId = str;
            this.documents = list;
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u001e¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "shouldLoadDocuments", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "q", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "s", "()Z", t.f38095d, "l", "r", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReviewCaptures extends State {

            @NotNull
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final DocumentFile documentFileToDelete;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldLoadDocuments;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCaptures> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures createFromParcel(Parcel parcel) {
                    boolean z10;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                    }
                    String readString = parcel.readString();
                    a valueOf = a.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    boolean z11 = true;
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    return new ReviewCaptures(arrayList, readString, valueOf, uploadState, documentFile, z11, parcel.readInt() != 0 ? z10 : false, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures[] newArray(int i10) {
                    return new ReviewCaptures[i10];
                }
            }

            public /* synthetic */ ReviewCaptures(List list, String str, a aVar, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? a.f10124a : aVar, (i10 & 8) != 0 ? UploadState.CreateDocument.f10120a : uploadState, (i10 & 16) != 0 ? null : documentFile, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str2);
            }

            public static /* synthetic */ ReviewCaptures p(ReviewCaptures reviewCaptures, List list, String str, a aVar, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCaptures.documentId;
                }
                if ((i10 & 4) != 0) {
                    aVar = reviewCaptures.captureState;
                }
                if ((i10 & 8) != 0) {
                    uploadState = reviewCaptures.uploadState;
                }
                if ((i10 & 16) != 0) {
                    documentFile = reviewCaptures.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCaptures.shouldLoadDocuments;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                if ((i10 & 128) != 0) {
                    str2 = reviewCaptures.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z13 = z10;
                return reviewCaptures.o(list, str, aVar, uploadState, documentFile2, z13, z12, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.c(this.documents, reviewCaptures.documents) && Intrinsics.c(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && Intrinsics.c(this.uploadState, reviewCaptures.uploadState) && Intrinsics.c(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.shouldLoadDocuments == reviewCaptures.shouldLoadDocuments && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.c(this.error, reviewCaptures.error);
            }

            public int hashCode() {
                int hashCode = ((((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int hashCode2 = (((((hashCode + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.shouldLoadDocuments)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str = this.error;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            public List<DocumentFile> m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final ReviewCaptures o(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFileToDelete, boolean shouldLoadDocuments, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, shouldLoadDocuments, shouldShowUploadOptionsDialog, error);
            }

            @Nullable
            /* renamed from: q, reason: from getter */
            public final DocumentFile getDocumentFileToDelete() {
                return this.documentFileToDelete;
            }

            @Nullable
            /* renamed from: r, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: s, reason: from getter */
            public final boolean getShouldLoadDocuments() {
                return this.shouldLoadDocuments;
            }

            /* renamed from: t, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", shouldLoadDocuments=" + this.shouldLoadDocuments + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.shouldLoadDocuments ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull List<? extends DocumentFile> documents, @NotNull String documentId, @NotNull a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFile, boolean z10, boolean z11, @Nullable String str) {
                super(captureState, uploadState, documentId, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.shouldLoadDocuments = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u001e¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "m", "()Ljava/util/List;", "f", "Ljava/lang/String;", "k", "g", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "getDocumentFileToDelete", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Z", "r", "()Z", "s", "l", "q", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReviewCapturesWithoutDocumentId extends State {

            @NotNull
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new a();

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final DocumentFile documentFileToDelete;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean reloadingFromPreviousSession;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCapturesWithoutDocumentId> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId createFromParcel(Parcel parcel) {
                    boolean z10;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader()));
                    }
                    String readString = parcel.readString();
                    a valueOf = a.valueOf(parcel.readString());
                    UploadState uploadState = (UploadState) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    DocumentFile documentFile = (DocumentFile) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    boolean z11 = true;
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    return new ReviewCapturesWithoutDocumentId(arrayList, readString, valueOf, uploadState, documentFile, z11, parcel.readInt() != 0 ? z10 : false, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId[] newArray(int i10) {
                    return new ReviewCapturesWithoutDocumentId[i10];
                }
            }

            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, a aVar, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? a.f10124a : aVar, (i10 & 8) != 0 ? UploadState.CreateDocument.f10120a : uploadState, (i10 & 16) != 0 ? null : documentFile, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str2);
            }

            public static /* synthetic */ ReviewCapturesWithoutDocumentId p(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, a aVar, UploadState uploadState, DocumentFile documentFile, boolean z10, boolean z11, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                if ((i10 & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                if ((i10 & 4) != 0) {
                    aVar = reviewCapturesWithoutDocumentId.captureState;
                }
                if ((i10 & 8) != 0) {
                    uploadState = reviewCapturesWithoutDocumentId.uploadState;
                }
                if ((i10 & 16) != 0) {
                    documentFile = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                if ((i10 & 32) != 0) {
                    z10 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                }
                if ((i10 & 64) != 0) {
                    z11 = reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog;
                }
                if ((i10 & 128) != 0) {
                    str2 = reviewCapturesWithoutDocumentId.error;
                }
                boolean z12 = z11;
                String str3 = str2;
                DocumentFile documentFile2 = documentFile;
                boolean z13 = z10;
                return reviewCapturesWithoutDocumentId.o(list, str, aVar, uploadState, documentFile2, z13, z12, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCapturesWithoutDocumentId)) {
                    return false;
                }
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) other;
                return Intrinsics.c(this.documents, reviewCapturesWithoutDocumentId.documents) && Intrinsics.c(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && Intrinsics.c(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && Intrinsics.c(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && Intrinsics.c(this.error, reviewCapturesWithoutDocumentId.error);
            }

            public int hashCode() {
                int hashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int hashCode3 = (((((hashCode2 + (documentFile == null ? 0 : documentFile.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return hashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @Nullable
            /* renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            public List<DocumentFile> m() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final ReviewCapturesWithoutDocumentId o(@NotNull List<? extends DocumentFile> documents, @Nullable String documentId, @NotNull a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, @Nullable String error) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new ReviewCapturesWithoutDocumentId(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            @Nullable
            /* renamed from: q, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: r, reason: from getter */
            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            /* renamed from: s, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "ReviewCapturesWithoutDocumentId(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<DocumentFile> list = this.documents;
                dest.writeInt(list.size());
                Iterator<DocumentFile> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesWithoutDocumentId(@NotNull List<? extends DocumentFile> documents, @Nullable String str, @NotNull a captureState, @NotNull UploadState uploadState, @Nullable DocumentFile documentFile, boolean z10, boolean z11, @Nullable String str2) {
                super(captureState, uploadState, str, documents, null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z10;
                this.shouldShowUploadOptionsDialog = z11;
                this.error = str2;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "captureState", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "uploadState", "", "documentId", "", "shouldShowUploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "j", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "f", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "n", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "g", "Ljava/lang/String;", "k", "h", "Z", "q", "()Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Start extends State {

            @NotNull
            public static final Parcelable.Creator<Start> CREATOR = new a();

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final a captureState;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final UploadState uploadState;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String documentId;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean shouldShowUploadOptionsDialog;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Start> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Start createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Start(a.valueOf(parcel.readString()), (UploadState) parcel.readParcelable(Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Start[] newArray(int i10) {
                    return new Start[i10];
                }
            }

            public /* synthetic */ Start(a aVar, UploadState uploadState, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? a.f10124a : aVar, (i10 & 2) != 0 ? UploadState.CreateDocument.f10120a : uploadState, str, (i10 & 8) != 0 ? false : z10);
            }

            public static /* synthetic */ Start p(Start start, a aVar, UploadState uploadState, String str, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    aVar = start.captureState;
                }
                if ((i10 & 2) != 0) {
                    uploadState = start.uploadState;
                }
                if ((i10 & 4) != 0) {
                    str = start.documentId;
                }
                if ((i10 & 8) != 0) {
                    z10 = start.shouldShowUploadOptionsDialog;
                }
                return start.o(aVar, uploadState, str, z10);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.captureState == start.captureState && Intrinsics.c(this.uploadState, start.uploadState) && Intrinsics.c(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            public int hashCode() {
                int hashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: j, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @Nullable
            /* renamed from: k, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            @NotNull
            /* renamed from: n, reason: from getter */
            public UploadState getUploadState() {
                return this.uploadState;
            }

            @NotNull
            public final Start o(@NotNull a captureState, @NotNull UploadState uploadState, @Nullable String documentId, boolean shouldShowUploadOptionsDialog) {
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                return new Start(captureState, uploadState, documentId, shouldShowUploadOptionsDialog);
            }

            /* renamed from: q, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            @NotNull
            public String toString() {
                return "Start(captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentId=" + this.documentId + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.documentId);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(@NotNull a captureState, @NotNull UploadState uploadState, @Nullable String str, boolean z10) {
                super(captureState, uploadState, str, p.k(), null);
                Intrinsics.checkNotNullParameter(captureState, "captureState");
                Intrinsics.checkNotNullParameter(uploadState, "uploadState");
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z10;
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "g", "h", "j", "e", "c", "f", rl.d.f30696a, "i", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0169a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0169a f10130a = new C0169a();

            public C0169a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0169a);
            }

            public int hashCode() {
                return 1245705540;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f10131a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1143899241;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f10132a = new c();

            public c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1422406686;
            }

            @NotNull
            public String toString() {
                return "CloseUploadOptions";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f10133a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -967280389;
            }

            @NotNull
            public String toString() {
                return "DismissError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f10134a = new e();

            public e() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1532240394;
            }

            @NotNull
            public String toString() {
                return "OpenUploadOptions";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$f, reason: from toString */
        public static final /* data */ class RemoveDocument extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final DocumentFile.Remote document;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveDocument(@NotNull String documentId, @NotNull DocumentFile.Remote document) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(document, "document");
                this.documentId = documentId;
                this.document = document;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final DocumentFile.Remote getDocument() {
                return this.document;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveDocument)) {
                    return false;
                }
                RemoveDocument removeDocument = (RemoveDocument) other;
                return Intrinsics.c(this.documentId, removeDocument.documentId) && Intrinsics.c(this.document, removeDocument.document);
            }

            public int hashCode() {
                return (this.documentId.hashCode() * 31) + this.document.hashCode();
            }

            @NotNull
            public String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f10136a = new g();

            public g() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1818587564;
            }

            @NotNull
            public String toString() {
                return "SelectDocument";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f10137a = new h();

            public h() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1457257560;
            }

            @NotNull
            public String toString() {
                return "SelectPhotoFromLibrary";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$a$i, reason: from toString */
        public static final /* data */ class Submit extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(@NotNull String documentId) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submit) && Intrinsics.c(this.documentId, ((Submit) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            @NotNull
            public String toString() {
                return "Submit(documentId=" + this.documentId + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final j f10139a = new j();

            public j() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -623405138;
            }

            @NotNull
            public String toString() {
                return "TakePhoto";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "c", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f10140a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 89823627;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0170b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0170b f10141a = new C0170b();

            public C0170b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0170b);
            }

            public int hashCode() {
                return -1234032835;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$b$c, reason: from toString */
        public static final /* data */ class Errored extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Errored(@NotNull InternalErrorInfo cause) {
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
                return (other instanceof Errored) && Intrinsics.c(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f10143a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1784519914;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10181a;
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
            f10181a = iArr;
            int[] iArr2 = new int[State.a.values().length];
            try {
                iArr2[State.a.f10124a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[State.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[State.a.f10125c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[State.a.f10126d.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[State.a.f10127e.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4", f = "DocumentWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10182t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<Input, State, b, Object>.a f10183u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow f10184v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f10185w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(k<? super Input, State, ? extends b, ? extends Object>.a aVar, DocumentWorkflow documentWorkflow, String str, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f10183u = aVar;
            this.f10184v = documentWorkflow;
            this.f10185w = str;
        }

        public static final Unit q(String str, r.c cVar) {
            Object c10 = cVar.c();
            State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = c10 instanceof State.ReviewCapturesWithoutDocumentId ? (State.ReviewCapturesWithoutDocumentId) c10 : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f22894a;
            }
            cVar.e(new State.ReviewCaptures(reviewCapturesWithoutDocumentId.m(), str, null, new State.UploadState.UploadFiles(str), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f10183u, this.f10184v, this.f10185w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, State, ? extends b> d10;
            nt.c.e();
            if (this.f10182t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            wm.h<r<? super Input, State, ? extends b>> d11 = this.f10183u.d();
            DocumentWorkflow documentWorkflow = this.f10184v;
            final String str = this.f10185w;
            d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.j2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = DocumentWorkflow.e.q(str, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", f = "DocumentWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f10186t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<Input, State, b, Object>.a f10187u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow f10188v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ State.UploadState f10189w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(k<? super Input, State, ? extends b, ? extends Object>.a aVar, DocumentWorkflow documentWorkflow, State.UploadState uploadState, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f10187u = aVar;
            this.f10188v = documentWorkflow;
            this.f10189w = uploadState;
        }

        public static final Unit q(State.UploadState uploadState, r.c cVar) {
            cVar.e(State.i((State) cVar.c(), new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId()), null, null, null, 14, null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f10187u, this.f10188v, this.f10189w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, State, ? extends b> d10;
            nt.c.e();
            if (this.f10186t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            wm.h<r<? super Input, State, ? extends b>> d11 = this.f10187u.d();
            DocumentWorkflow documentWorkflow = this.f10188v;
            final State.UploadState uploadState = this.f10189w;
            d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.k2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = DocumentWorkflow.f.q(DocumentWorkflow.State.UploadState.this, (r.c) obj2);
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

    public DocumentWorkflow(@NotNull s imageLoader, @NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull com.withpersona.sdk2.inquiry.document.a documentCameraWorker, @NotNull i.b documentsSelectWorkerFactory, @NotNull a.C0184a documentCreateWorker, @NotNull e.a documentLoadWorker, @NotNull c.a documentFileUploadWorker, @NotNull a.C0697a documentFileDeleteWorker, @NotNull g.a documentSubmitWorker, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(documentCameraWorker, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(documentCreateWorker, "documentCreateWorker");
        Intrinsics.checkNotNullParameter(documentLoadWorker, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(documentFileUploadWorker, "documentFileUploadWorker");
        Intrinsics.checkNotNullParameter(documentFileDeleteWorker, "documentFileDeleteWorker");
        Intrinsics.checkNotNullParameter(documentSubmitWorker, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorker = documentCreateWorker;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorker = documentFileUploadWorker;
        this.documentFileDeleteWorker = documentFileDeleteWorker;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final r A1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B1;
                B1 = DocumentWorkflow.B1(PermissionRequestWorkflow.Output.this, documentWorkflow, state, (r.c) obj);
                return B1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit B1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f10181a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(aVar.e(string) ? state.a(State.a.f10125c) : state.a(State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            action.e(state.a(State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit C0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.g.f10136a);
        return Unit.f22894a;
    }

    public static final r C1(DocumentWorkflow documentWorkflow, final e.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof e.b.C0193b) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit D1;
                    D1 = DocumentWorkflow.D1(e.b.this, (r.c) obj);
                    return D1;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof e.b.a)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit E1;
                E1 = DocumentWorkflow.E1(e.b.this, (r.c) obj);
                return E1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit D0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit D1(e.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        State.ReviewCaptures reviewCaptures = c10 instanceof State.ReviewCaptures ? (State.ReviewCaptures) c10 : null;
        if (reviewCaptures == null) {
            return Unit.f22894a;
        }
        State.UploadState.ReadyToSubmit readyToSubmit = new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
        List<DocumentFile> a10 = ((e.b.C0193b) bVar).a();
        List<DocumentFile> m10 = reviewCaptures.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        action.e(State.ReviewCaptures.p(reviewCaptures, CollectionsKt.w0(a10, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        return Unit.f22894a;
    }

    public static final Unit E0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.j.f10139a);
        return Unit.f22894a;
    }

    public static final Unit E1(e.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new b.Errored(((e.b.a) bVar).getCause()));
        return Unit.f22894a;
    }

    public static final Unit F0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit F1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit G0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit G1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit H0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit I0(DocumentWorkflow documentWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentWorkflow.K0(aVar, a.j.f10139a);
        return Unit.f22894a;
    }

    public static final r J1(DocumentWorkflow documentWorkflow, final Input input, final a.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.b.C0174b) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit K1;
                    K1 = DocumentWorkflow.K1(a.b.this, input, (r.c) obj);
                    return K1;
                }
            }, 1, null);
            return d11;
        }
        if (!Intrinsics.c(it, a.b.C0173a.f10200a)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L1;
                L1 = DocumentWorkflow.L1((r.c) obj);
                return L1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit K1(a.b bVar, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.UploadState uploadState = ((State) action.c()).getUploadState();
        State.a aVar = null;
        DocumentFile documentFile = null;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        action.e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(((State) action.c()).m(), new DocumentFile.Local(((a.b.C0174b) bVar).getAbsoluteFilePath(), CaptureMethod.f10037c, 0, 4, null)), input.getDocumentFileLimit()), ((State) action.c()).getDocumentId(), aVar, uploadState, documentFile, z10, z11, str, 244, null));
        return Unit.f22894a;
    }

    public static final Unit L0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.C0170b.f10141a);
        return Unit.f22894a;
    }

    public static final Unit L1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).a(State.a.f10124a));
        return Unit.f22894a;
    }

    public static final Unit M0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.a.f10140a);
        return Unit.f22894a;
    }

    public static final r M1(final DocumentWorkflow documentWorkflow, final Input input, final State state, final i.c it) {
        r d10;
        r d11;
        r d12;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof i.c.Success) {
            d12 = z.d(documentWorkflow, null, new Function1() { // from class: xn.b2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit N1;
                    N1 = DocumentWorkflow.N1(i.c.this, input, (r.c) obj);
                    return N1;
                }
            }, 1, null);
            return d12;
        }
        if (it instanceof i.c.Failure) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.c2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit O1;
                    O1 = DocumentWorkflow.O1(i.c.this, input, documentWorkflow, (r.c) obj);
                    return O1;
                }
            }, 1, null);
            return d11;
        }
        if (!Intrinsics.c(it, i.c.a.f10271a)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit P1;
                P1 = DocumentWorkflow.P1(DocumentWorkflow.State.this, (r.c) obj);
                return P1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit N0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).a(State.a.f10126d).f(false));
        return Unit.f22894a;
    }

    public static final Unit N1(i.c cVar, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.a aVar = null;
        action.e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(((State) action.c()).m(), g.b(((i.c.Success) cVar).a())), input.getDocumentFileLimit()), ((State) action.c()).getDocumentId(), aVar, ((State) action.c()).getUploadState(), null, false, false, null, 244, null));
        return Unit.f22894a;
    }

    public static final Unit O0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).a(State.a.f10127e).f(false));
        return Unit.f22894a;
    }

    public static final Unit O1(i.c cVar, Input input, DocumentWorkflow documentWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State.a aVar = null;
        action.e(new State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(((State) action.c()).m(), g.b(((i.c.Failure) cVar).a())), input.getDocumentFileLimit()), ((State) action.c()).getDocumentId(), aVar, ((State) action.c()).getUploadState(), null, false, false, documentWorkflow.applicationContext.getString(tp.g.f32395m), 116, null));
        return Unit.f22894a;
    }

    public static final Unit P0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).a(State.a.b).f(false));
        return Unit.f22894a;
    }

    public static final Unit P1(State state, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(state.a(State.a.f10124a));
        return Unit.f22894a;
    }

    public static final Unit Q0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).f(true));
        return Unit.f22894a;
    }

    public static final r Q1(DocumentWorkflow documentWorkflow, final a.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.b.C0186b) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit R1;
                    R1 = DocumentWorkflow.R1(a.b.this, (r.c) obj);
                    return R1;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof a.b.Error)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit S1;
                S1 = DocumentWorkflow.S1(a.b.this, (r.c) obj);
                return S1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit R0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(((State) action.c()).f(false));
        return Unit.f22894a;
    }

    public static final Unit R1(a.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        a.b.C0186b c0186b = (a.b.C0186b) bVar;
        action.e(State.i((State) action.c(), new State.UploadState.ReadyToSubmit(c0186b.getDocumentId()), c0186b.getDocumentId(), null, null, 12, null));
        return Unit.f22894a;
    }

    public static final Unit S0(a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c() instanceof State.ReviewCaptures) {
            a.RemoveDocument removeDocument = (a.RemoveDocument) aVar;
            action.e(State.i((State) action.c(), new State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
        }
        return Unit.f22894a;
    }

    public static final Unit S1(a.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        a.b.Error error = (a.b.Error) bVar;
        if (!error.getCause().isRecoverable()) {
            action.d(new b.Errored(error.getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit T0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        State state = (State) action.c();
        if (state instanceof State.ReviewCaptures) {
            action.e(State.ReviewCaptures.p((State.ReviewCaptures) state, null, null, null, null, null, false, false, null, 127, null));
        }
        return Unit.f22894a;
    }

    public static final r T1(final DocumentWorkflow documentWorkflow, final State.UploadState uploadState, final DocumentFile.Local local, final Input input, final c.b response) {
        r d10;
        r d11;
        r d12;
        r d13;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof c.b.d) {
            d13 = z.d(documentWorkflow, null, new Function1() { // from class: xn.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit U1;
                    U1 = DocumentWorkflow.U1(DocumentWorkflow.State.UploadState.this, response, (r.c) obj);
                    return U1;
                }
            }, 1, null);
            return d13;
        }
        if (response instanceof c.b.C0188c) {
            d12 = z.d(documentWorkflow, null, new Function1() { // from class: xn.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit V1;
                    V1 = DocumentWorkflow.V1(DocumentFile.Local.this, response, (r.c) obj);
                    return V1;
                }
            }, 1, null);
            return d12;
        }
        if (response instanceof c.b.a) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit W1;
                    W1 = DocumentWorkflow.W1(DocumentFile.Local.this, uploadState, response, documentWorkflow, input, (r.c) obj);
                    return W1;
                }
            }, 1, null);
            return d11;
        }
        if (!(response instanceof c.b.C0187b)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit X1;
                X1 = DocumentWorkflow.X1(c.b.this, (r.c) obj);
                return X1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit U0(a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        a.Submit submit = (a.Submit) aVar;
        action.e(new State.UploadDocument(((State) action.c()).m(), submit.getDocumentId(), new State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        return Unit.f22894a;
    }

    public static final Unit U1(State.UploadState uploadState, c.b bVar, r.c action) {
        State.UploadState readyToSubmit;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> m10 = ((State) action.c()).m();
        ArrayList arrayList = new ArrayList(q.u(m10, 10));
        for (Parcelable parcelable : m10) {
            c.b.d dVar = (c.b.d) bVar;
            if (Intrinsics.c(parcelable, dVar.getOldLocalDocument())) {
                parcelable = dVar.getNewRemoteDocument();
            }
            arrayList.add(parcelable);
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((DocumentFile) obj) instanceof DocumentFile.Local) {
                    readyToSubmit = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
        }
        readyToSubmit = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        action.e(State.i((State) action.c(), readyToSubmit, null, arrayList, null, 10, null));
        return Unit.f22894a;
    }

    public static final Unit V1(DocumentFile.Local local, c.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<DocumentFile> m10 = ((State) action.c()).m();
        ArrayList arrayList = new ArrayList(q.u(m10, 10));
        for (Parcelable parcelable : m10) {
            if ((parcelable instanceof DocumentFile.Local) && Intrinsics.c(parcelable, local)) {
                parcelable = DocumentFile.Local.f((DocumentFile.Local) parcelable, null, null, ((c.b.C0188c) bVar).getProgressPercentage(), 3, null);
            }
            arrayList.add(parcelable);
        }
        action.e(State.i((State) action.c(), ((State) action.c()).getUploadState(), null, arrayList, null, 10, null));
        return Unit.f22894a;
    }

    public static final Unit W0(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit W1(DocumentFile.Local local, State.UploadState uploadState, c.b bVar, DocumentWorkflow documentWorkflow, Input input, r.c action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List v02 = CollectionsKt.v0(((State) action.c()).m(), local);
        List list = v02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
        }
        uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.UploadFiles) uploadState).getDocumentId());
        State.UploadState uploadState2 = uploadFiles;
        c.b.a aVar = (c.b.a) bVar;
        DocumentFile documentFile = null;
        action.e(new State.ReviewCaptures(v02, ((State.UploadState.UploadFiles) uploadState).getDocumentId(), State.a.f10124a, uploadState2, documentFile, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, g.c(aVar.getCause(), documentWorkflow.applicationContext, input), 80, null));
        return Unit.f22894a;
    }

    public static final Unit X0(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit X1(c.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new b.Errored(((c.b.C0187b) bVar).getCause()));
        return Unit.f22894a;
    }

    public static final Unit Y0(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.j.f10139a);
        return Unit.f22894a;
    }

    public static final r Y1(DocumentWorkflow documentWorkflow, final DocumentFile.Remote remote, final State.UploadState uploadState, final a.b response) {
        r d10;
        Intrinsics.checkNotNullParameter(response, "response");
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Z1;
                Z1 = DocumentWorkflow.Z1(DocumentFile.Remote.this, uploadState, response, (r.c) obj);
                return Z1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit Z0(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit Z1(DocumentFile.Remote remote, State.UploadState uploadState, a.b bVar, r.c action) {
        State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        State.ReviewCaptures reviewCaptures = c10 instanceof State.ReviewCaptures ? (State.ReviewCaptures) c10 : null;
        if (reviewCaptures == null) {
            return Unit.f22894a;
        }
        List v02 = CollectionsKt.v0(reviewCaptures.m(), remote);
        List list = v02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new State.UploadState.UploadFiles(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
            }
        }
        uploadFiles = new State.UploadState.ReadyToSubmit(((State.UploadState.DeleteFiles) uploadState).getDocumentId());
        State.UploadState uploadState2 = uploadFiles;
        if (bVar instanceof a.b.C0699b) {
            action.e(State.ReviewCaptures.p(reviewCaptures, v02, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(bVar instanceof a.b.Error)) {
                throw new l();
            }
            action.d(new b.Errored(((a.b.Error) bVar).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit a1(DocumentWorkflow documentWorkflow, k.a aVar, State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        documentWorkflow.K0(aVar, new a.RemoveDocument(((State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f22894a;
    }

    public static final Unit b1(DocumentWorkflow documentWorkflow, k.a aVar, State state) {
        documentWorkflow.K0(aVar, new a.Submit(((State.ReviewCaptures) state).getDocumentId()));
        return Unit.f22894a;
    }

    public static final Unit c1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit d1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit e1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.d.f10133a);
        return Unit.f22894a;
    }

    public static final r f1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit g12;
                g12 = DocumentWorkflow.g1(PermissionRequestWorkflow.Output.this, documentWorkflow, state, (r.c) obj);
                return g12;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit g1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f10181a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(aVar.e(string) ? state.a(State.a.f10125c) : state.a(State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            action.e(state.a(State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit h1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.c.f10132a);
        return Unit.f22894a;
    }

    public static final Unit i1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.c.f10132a);
        return Unit.f22894a;
    }

    public static final Unit j1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.g.f10136a);
        return Unit.f22894a;
    }

    public static final Unit k1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.h.f10137a);
        return Unit.f22894a;
    }

    public static final Unit l1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.j.f10139a);
        return Unit.f22894a;
    }

    public static final Unit m1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.e.f10134a);
        return Unit.f22894a;
    }

    public static final Unit n1(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    public static final Unit o1() {
        return Unit.f22894a;
    }

    public static final Unit p1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit q1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.C0169a.f10130a);
        return Unit.f22894a;
    }

    public static final Unit r1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.d.f10133a);
        return Unit.f22894a;
    }

    public static final r s1(final DocumentWorkflow documentWorkflow, final State state, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t12;
                t12 = DocumentWorkflow.t1(PermissionRequestWorkflow.Output.this, documentWorkflow, state, (r.c) obj);
                return t12;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit t1(PermissionRequestWorkflow.Output output, DocumentWorkflow documentWorkflow, State state, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f10181a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = documentWorkflow.documentCameraWorker;
            String string = documentWorkflow.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.e(aVar.e(string) ? state.a(State.a.f10125c) : state.a(State.a.f10124a));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            action.e(state.a(State.a.f10124a));
        }
        return Unit.f22894a;
    }

    public static final Unit u1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.c.f10132a);
        return Unit.f22894a;
    }

    public static final r v1(DocumentWorkflow documentWorkflow, final g.b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, g.b.C0194b.f10410a)) {
            d11 = z.d(documentWorkflow, null, new Function1() { // from class: xn.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit w12;
                    w12 = DocumentWorkflow.w1((r.c) obj);
                    return w12;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof g.b.Error)) {
            throw new l();
        }
        d10 = z.d(documentWorkflow, null, new Function1() { // from class: xn.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x12;
                x12 = DocumentWorkflow.x1(g.b.this, (r.c) obj);
                return x12;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit w1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.d.f10143a);
        return Unit.f22894a;
    }

    public static final Unit x1(g.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new b.Errored(((g.b.Error) bVar).getCause()));
        return Unit.f22894a;
    }

    public static final Unit y1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.b.f10131a);
        return Unit.f22894a;
    }

    public static final Unit z1(DocumentWorkflow documentWorkflow, k.a aVar) {
        documentWorkflow.K0(aVar, a.b.f10131a);
        return Unit.f22894a;
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> A0(DocumentStartPage documentStartPage, final k<? super Input, State, ? extends b, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: xn.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit C0;
                C0 = DocumentWorkflow.C0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return C0;
            }
        }).a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: xn.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D0;
                D0 = DocumentWorkflow.D0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return D0;
            }
        }).a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: xn.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit E0;
                E0 = DocumentWorkflow.E0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return E0;
            }
        }).a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: xn.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F0;
                F0 = DocumentWorkflow.F0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return F0;
            }
        }).b();
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> B0(UploadOptionsDialog uploadOptionsDialog, final k<? super Input, State, ? extends b, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: xn.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit G0;
                G0 = DocumentWorkflow.G0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return G0;
            }
        }).a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: xn.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit H0;
                H0 = DocumentWorkflow.H0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return H0;
            }
        }).a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: xn.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit I0;
                I0 = DocumentWorkflow.I0(DocumentWorkflow.this, aVar, (UiComponent) obj);
                return I0;
            }
        }).b();
    }

    public final void H1(State.a aVar, final Input input, final State state, k<? super Input, State, ? extends b, ? extends Object>.a aVar2) {
        int i10 = d.b[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            w.l(aVar2, this.documentCameraWorker, d0.k(com.withpersona.sdk2.inquiry.document.a.class), "", new Function1() { // from class: xn.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r J1;
                    J1 = DocumentWorkflow.J1(DocumentWorkflow.this, input, (a.b) obj);
                    return J1;
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new l();
            }
            w.l(aVar2, state.getCaptureState() == State.a.f10126d ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), d0.k(i.class), "", new Function1() { // from class: xn.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r M1;
                    M1 = DocumentWorkflow.M1(DocumentWorkflow.this, input, state, (i.c) obj);
                    return M1;
                }
            });
        }
    }

    public final void I1(final State.UploadState uploadState, final Input input, State state, k<? super Input, State, ? extends b, ? extends Object>.a aVar) {
        if (Intrinsics.c(uploadState, State.UploadState.CreateDocument.f10120a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            w.l(aVar, this.documentCreateWorker.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), d0.k(com.withpersona.sdk2.inquiry.document.network.a.class), "", new Function1() { // from class: xn.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r Q1;
                    Q1 = DocumentWorkflow.Q1(DocumentWorkflow.this, (a.b) obj);
                    return Q1;
                }
            });
            return;
        }
        if (!(uploadState instanceof State.UploadState.UploadFiles)) {
            if (!(uploadState instanceof State.UploadState.DeleteFiles)) {
                if (!(uploadState instanceof State.UploadState.ReadyToSubmit)) {
                    throw new l();
                }
                return;
            } else {
                if (state instanceof State.ReviewCaptures) {
                    State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) state;
                    DocumentFile documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    w.l(aVar, this.documentFileDeleteWorker.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), d0.k(zn.a.class), "", new Function1() { // from class: xn.b1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            wm.r Y1;
                            Y1 = DocumentWorkflow.Y1(DocumentWorkflow.this, remote, uploadState, (a.b) obj);
                            return Y1;
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<DocumentFile> m10 = state.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.b("upload_complete", new f(aVar, this, uploadState, null));
            return;
        }
        for (final DocumentFile.Local local : CollectionsKt.H0(arrayList, 3)) {
            c.a aVar2 = this.documentFileUploadWorker;
            String sessionToken = input.getSessionToken();
            String documentId = ((State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            w.l(aVar, aVar2.a(sessionToken, documentId, local, z10), d0.k(com.withpersona.sdk2.inquiry.document.network.c.class), local.getAbsoluteFilePath(), new Function1() { // from class: xn.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    wm.r T1;
                    T1 = DocumentWorkflow.T1(DocumentWorkflow.this, uploadState, local, input, (c.b) obj2);
                    return T1;
                }
            });
        }
    }

    @Override // wm.k
    @NotNull
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public State d(@NotNull Input props, @Nullable Snapshot snapshot) {
        State f10;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            wu.h b10 = snapshot.b();
            Object obj = null;
            if (b10.I() <= 0) {
                b10 = null;
            }
            if (b10 != null) {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                byte[] O = b10.O();
                obtain.unmarshall(O, 0, O.length);
                obtain.setDataPosition(0);
                Object readParcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                Intrinsics.checkNotNullExpressionValue(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                obj = readParcelable;
            }
            State state = (State) obj;
            if (state != null && (f10 = state.f(false)) != null) {
                return f10;
            }
        }
        StartPage startPage = props.getStartPage();
        if (Intrinsics.c(startPage, StartPage.Prompt.f10091a)) {
            return new State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (startPage instanceof StartPage.Review) {
            return new State.ReviewCaptures(p.k(), ((StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
        }
        throw new l();
    }

    public final void K0(k<? super Input, State, ? extends b, ? extends Object>.a aVar, final a aVar2) {
        r<? super Object, State, ? extends Object> d10;
        if (Intrinsics.c(aVar2, a.b.f10131a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit L0;
                    L0 = DocumentWorkflow.L0((r.c) obj);
                    return L0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.C0169a.f10130a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit M0;
                    M0 = DocumentWorkflow.M0((r.c) obj);
                    return M0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.g.f10136a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit N0;
                    N0 = DocumentWorkflow.N0((r.c) obj);
                    return N0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.h.f10137a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit O0;
                    O0 = DocumentWorkflow.O0((r.c) obj);
                    return O0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.j.f10139a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.m1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit P0;
                    P0 = DocumentWorkflow.P0((r.c) obj);
                    return P0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.e.f10134a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q0;
                    Q0 = DocumentWorkflow.Q0((r.c) obj);
                    return Q0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.c.f10132a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit R0;
                    R0 = DocumentWorkflow.R0((r.c) obj);
                    return R0;
                }
            }, 1, null);
        } else if (aVar2 instanceof a.RemoveDocument) {
            d10 = z.d(this, null, new Function1() { // from class: xn.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit S0;
                    S0 = DocumentWorkflow.S0(DocumentWorkflow.a.this, (r.c) obj);
                    return S0;
                }
            }, 1, null);
        } else if (Intrinsics.c(aVar2, a.d.f10133a)) {
            d10 = z.d(this, null, new Function1() { // from class: xn.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit T0;
                    T0 = DocumentWorkflow.T0((r.c) obj);
                    return T0;
                }
            }, 1, null);
        } else {
            if (!(aVar2 instanceof a.Submit)) {
                throw new l();
            }
            d10 = z.d(this, null, new Function1() { // from class: xn.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit U0;
                    U0 = DocumentWorkflow.U0(DocumentWorkflow.a.this, (r.c) obj);
                    return U0;
                }
            }, 1, null);
        }
        aVar.d().a(d10);
    }

    @Override // wm.k
    @NotNull
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull final State renderState, @NotNull final k<? super Input, State, ? extends b, ? extends Object>.a context) {
        mp.c d10;
        mp.c d11;
        mp.c d12;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof State.UploadDocument), false, 8, null);
        H1(renderState.getCaptureState(), renderProps, renderState, context);
        I1(renderState.getUploadState(), renderProps, renderState, context);
        g.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof State.Start) {
            Object bVar = new com.withpersona.sdk2.inquiry.document.b(yq.b.a(renderProps.getPages().getDocumentStartPage()), A0(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.b(), new Function0() { // from class: xn.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit W0;
                    W0 = DocumentWorkflow.W0(DocumentWorkflow.this, context);
                    return W0;
                }
            }, new Function0() { // from class: xn.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit X0;
                    X0 = DocumentWorkflow.X0(DocumentWorkflow.this, context);
                    return X0;
                }
            }, null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles(), 32, null);
            State.Start start = (State.Start) renderState;
            if (start.getShouldShowUploadOptionsDialog()) {
                bVar = mp.d.a(yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: xn.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit i12;
                        i12 = DocumentWorkflow.i1(DocumentWorkflow.this, context);
                        return i12;
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), bVar, "document_upload_options_dialog");
            }
            boolean z10 = start.getCaptureState() == State.a.b;
            i0 i0Var = i0.f28911a;
            String permissionsTitle = renderProps.getPermissionsTitle();
            String str = permissionsTitle != null ? permissionsTitle : "";
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(tp.g.f32388f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(tp.g.f32387e, hq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            d12 = com.withpersona.sdk2.inquiry.permissions.g.d(bVar, context, z10, i0Var, (r36 & 8) != 0 ? false : false, str, permissionsRationale, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : null, new Function1() { // from class: xn.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r A1;
                    A1 = DocumentWorkflow.A1(DocumentWorkflow.this, renderState, (PermissionRequestWorkflow.Output) obj);
                    return A1;
                }
            });
            return d12;
        }
        if (renderState instanceof State.ReviewCaptures) {
            State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                w.l(context, this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), d0.k(com.withpersona.sdk2.inquiry.document.network.e.class), "", new Function1() { // from class: xn.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r C1;
                        C1 = DocumentWorkflow.C1(DocumentWorkflow.this, (e.b) obj);
                        return C1;
                    }
                });
            }
            c.ReviewCaptures reviewCaptures2 = new c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.m(), this.navigationStateManager.b(), new Function0() { // from class: xn.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F1;
                    F1 = DocumentWorkflow.F1(DocumentWorkflow.this, context);
                    return F1;
                }
            }, new Function0() { // from class: xn.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit G1;
                    G1 = DocumentWorkflow.G1(DocumentWorkflow.this, context);
                    return G1;
                }
            }, new Function0() { // from class: xn.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Y0;
                    Y0 = DocumentWorkflow.Y0(DocumentWorkflow.this, context);
                    return Y0;
                }
            }, new Function0() { // from class: xn.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Z0;
                    Z0 = DocumentWorkflow.Z0(DocumentWorkflow.this, context);
                    return Z0;
                }
            }, new Function1() { // from class: xn.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit a12;
                    a12 = DocumentWorkflow.a1(DocumentWorkflow.this, context, renderState, (DocumentFile.Remote) obj);
                    return a12;
                }
            }, new Function0() { // from class: xn.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit b12;
                    b12 = DocumentWorkflow.b1(DocumentWorkflow.this, context, renderState);
                    return b12;
                }
            }, new Function0() { // from class: xn.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit c12;
                    c12 = DocumentWorkflow.c1(DocumentWorkflow.this, context);
                    return c12;
                }
            }, new Function0() { // from class: xn.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit d13;
                    d13 = DocumentWorkflow.d1(DocumentWorkflow.this, context);
                    return d13;
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.m().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: xn.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit e12;
                    e12 = DocumentWorkflow.e1(DocumentWorkflow.this, context);
                    return e12;
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
            boolean z11 = reviewCaptures.getCaptureState() == State.a.b;
            i0 i0Var2 = i0.f28911a;
            String permissionsTitle2 = renderProps.getPermissionsTitle();
            if (permissionsTitle2 == null) {
                permissionsTitle2 = "";
            }
            String permissionsRationale2 = renderProps.getPermissionsRationale();
            if (permissionsRationale2 == null) {
                permissionsRationale2 = this.applicationContext.getString(tp.g.f32388f);
                Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
            }
            Context context3 = this.applicationContext;
            String string2 = context3.getString(tp.g.f32387e, hq.g.b(context3));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            d11 = com.withpersona.sdk2.inquiry.permissions.g.d(reviewCaptures2, context, z11, i0Var2, (r36 & 8) != 0 ? false : false, permissionsTitle2, permissionsRationale2, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : null, new Function1() { // from class: xn.t1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r f12;
                    f12 = DocumentWorkflow.f1(DocumentWorkflow.this, renderState, (PermissionRequestWorkflow.Output) obj);
                    return f12;
                }
            });
            return reviewCaptures.getShouldShowUploadOptionsDialog() ? mp.d.a(yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: xn.e2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit h12;
                    h12 = DocumentWorkflow.h1(DocumentWorkflow.this, context);
                    return h12;
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), d11, "document_upload_screen") : new mp.c(d11, p.k(), "document_upload_screen");
        }
        if (!(renderState instanceof State.ReviewCapturesWithoutDocumentId)) {
            if (!(renderState instanceof State.UploadDocument)) {
                throw new l();
            }
            w.l(context, this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((State.UploadDocument) renderState).m()), d0.k(com.withpersona.sdk2.inquiry.document.network.g.class), "", new Function1() { // from class: xn.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r v12;
                    v12 = DocumentWorkflow.v1(DocumentWorkflow.this, (g.b) obj);
                    return v12;
                }
            });
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            return new c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: xn.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit y12;
                    y12 = DocumentWorkflow.y1(DocumentWorkflow.this, context);
                    return y12;
                }
            }, new Function0() { // from class: xn.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit z12;
                    z12 = DocumentWorkflow.z1(DocumentWorkflow.this, context);
                    return z12;
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, 512, null);
        }
        State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (State.ReviewCapturesWithoutDocumentId) renderState;
        String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
        if (documentId != null) {
            context.b(documentId, new e(context, this, documentId, null));
        }
        c.ReviewCaptures reviewCaptures3 = new c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.m(), this.navigationStateManager.b(), new Function0() { // from class: xn.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j12;
                j12 = DocumentWorkflow.j1(DocumentWorkflow.this, context);
                return j12;
            }
        }, new Function0() { // from class: xn.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k12;
                k12 = DocumentWorkflow.k1(DocumentWorkflow.this, context);
                return k12;
            }
        }, new Function0() { // from class: xn.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l12;
                l12 = DocumentWorkflow.l1(DocumentWorkflow.this, context);
                return l12;
            }
        }, new Function0() { // from class: xn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m12;
                m12 = DocumentWorkflow.m1(DocumentWorkflow.this, context);
                return m12;
            }
        }, new Function1() { // from class: xn.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit n12;
                n12 = DocumentWorkflow.n1((DocumentFile.Remote) obj);
                return n12;
            }
        }, new Function0() { // from class: xn.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit o12;
                o12 = DocumentWorkflow.o1();
                return o12;
            }
        }, new Function0() { // from class: xn.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p12;
                p12 = DocumentWorkflow.p1(DocumentWorkflow.this, context);
                return p12;
            }
        }, new Function0() { // from class: xn.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q12;
                q12 = DocumentWorkflow.q1(DocumentWorkflow.this, context);
                return q12;
            }
        }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: xn.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit r12;
                r12 = DocumentWorkflow.r1(DocumentWorkflow.this, context);
                return r12;
            }
        }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), null, 4194304, null);
        boolean z12 = reviewCapturesWithoutDocumentId.getCaptureState() == State.a.b;
        i0 i0Var3 = i0.f28911a;
        String permissionsTitle3 = renderProps.getPermissionsTitle();
        if (permissionsTitle3 == null) {
            permissionsTitle3 = "";
        }
        String permissionsRationale3 = renderProps.getPermissionsRationale();
        if (permissionsRationale3 == null) {
            permissionsRationale3 = this.applicationContext.getString(tp.g.f32388f);
            Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
        }
        String str2 = permissionsRationale3;
        Context context4 = this.applicationContext;
        String string3 = context4.getString(tp.g.f32387e, hq.g.b(context4));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        d10 = com.withpersona.sdk2.inquiry.permissions.g.d(reviewCaptures3, context, z12, i0Var3, (r36 & 8) != 0 ? false : false, permissionsTitle3, str2, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : null, new Function1() { // from class: xn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r s12;
                s12 = DocumentWorkflow.s1(DocumentWorkflow.this, renderState, (PermissionRequestWorkflow.Output) obj);
                return s12;
            }
        });
        return reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? mp.d.a(yq.s.f37035a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new Function0() { // from class: xn.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit u12;
                u12 = DocumentWorkflow.u1(DocumentWorkflow.this, context);
                return u12;
            }
        }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), d10, "document_upload_screen") : new mp.c(d10, p.k(), "document_upload_screen");
    }

    @Override // wm.k
    @NotNull
    /* renamed from: a2, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ym.q.a(state);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", "Lyq/p;", j6.b.f21518e, "()Lyq/p;", "bottomSheet", "c", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/document/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @Nullable
        /* renamed from: b */
        UiStepBottomSheet getBottomSheet();

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0012\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0016\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "Lyq/p;", "bottomSheet", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lyq/p;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "g", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", rl.d.f30696a, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "Lyq/p;", "()Lyq/p;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            public b(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.uiScreen = uiScreen;
                this.navigationState = navigationState;
                this.styles = documentStepStyle;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
                this.bottomSheet = uiStepBottomSheet;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c
            @Nullable
            /* renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* renamed from: c, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onCancel;
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* renamed from: g, reason: from getter */
            public final UiComponentScreen getUiScreen() {
                return this.uiScreen;
            }

            public /* synthetic */ b(UiComponentScreen uiComponentScreen, NavigationState navigationState, StepStyles.DocumentStepStyle documentStepStyle, Function0 function0, Function0 function02, String str, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiComponentScreen, navigationState, documentStepStyle, function0, function02, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : uiStepBottomSheet);
            }
        }

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b \u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b#\u00107¨\u00068"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "", Title.type, "prompt", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "navBarTitle", "Lyq/p;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Lyq/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "i", j6.b.f21518e, "g", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", rl.d.f30696a, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "e", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getNavBarTitle", "j", "Lyq/p;", "()Lyq/p;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c$a, reason: from toString */
        public static final /* data */ class LoadingAnimation implements c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final NextStep.Document.AssetConfig.PendingPage assetConfig;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            public LoadingAnimation(@Nullable String str, @Nullable String str2, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable NextStep.Document.AssetConfig.PendingPage pendingPage, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable String str3, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.navBarTitle = str3;
                this.bottomSheet = uiStepBottomSheet;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final NextStep.Document.AssetConfig.PendingPage getAssetConfig() {
                return this.assetConfig;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c
            @Nullable
            /* renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            @NotNull
            /* renamed from: c, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onCancel;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) other;
                return Intrinsics.c(this.title, loadingAnimation.title) && Intrinsics.c(this.prompt, loadingAnimation.prompt) && Intrinsics.c(this.navigationState, loadingAnimation.navigationState) && Intrinsics.c(this.onBack, loadingAnimation.onBack) && Intrinsics.c(this.onCancel, loadingAnimation.onCancel) && Intrinsics.c(this.styles, loadingAnimation.styles) && Intrinsics.c(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition && Intrinsics.c(this.navBarTitle, loadingAnimation.navBarTitle) && Intrinsics.c(this.bottomSheet, loadingAnimation.bottomSheet);
            }

            @NotNull
            /* renamed from: f, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            /* renamed from: g, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* renamed from: h, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int hashCode3 = (hashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                int hashCode4 = (((hashCode3 + (pendingPage == null ? 0 : pendingPage.hashCode())) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31;
                String str3 = this.navBarTitle;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                UiStepBottomSheet uiStepBottomSheet = this.bottomSheet;
                return hashCode5 + (uiStepBottomSheet != null ? uiStepBottomSheet.hashCode() : 0);
            }

            @Nullable
            /* renamed from: i, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public String toString() {
                return "LoadingAnimation(title=" + this.title + ", prompt=" + this.prompt + ", navigationState=" + this.navigationState + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", navBarTitle=" + this.navBarTitle + ", bottomSheet=" + this.bottomSheet + ")";
            }

            public /* synthetic */ LoadingAnimation(String str, String str2, NavigationState navigationState, Function0 function0, Function0 function02, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextPosition, String str3, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, navigationState, function0, function02, documentStepStyle, pendingPage, pendingPageTextPosition, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : uiStepBottomSheet);
            }
        }

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b9\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bF\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bO\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bI\u0010ER\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010P\u001a\u0004\b7\u0010QR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\b0\u0010QR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bS\u0010QR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010(R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bK\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010VR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bB\u0010(R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b4\u0010Z¨\u0006["}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "Lk6/s;", "imageLoader", "", Title.type, "prompt", "disclaimer", "submitButtonText", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "onRemove", "onSubmit", "onCancel", "onBack", "", "disabled", "addButtonEnabled", "submitButtonEnabled", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "navBarTitle", "Lyq/p;", "bottomSheet", "<init>", "(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lyq/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lk6/s;", "g", "()Lk6/s;", j6.b.f21518e, "Ljava/lang/String;", t.f38095d, "c", "p", rl.d.f30696a, "e", "s", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "i", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "getOpenSelectFile", "()Lkotlin/jvm/functions/Function0;", "getSelectFromPhotoLibrary", "j", "getOpenCamera", "k", "o", "l", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "n", "Z", "()Z", "q", "r", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "v", "w", "Lyq/p;", "()Lyq/p;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class ReviewCaptures implements c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final s imageLoader;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @Nullable
            public final String title;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String prompt;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String submitButtonText;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<DocumentFile> documents;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openSelectFile;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> selectFromPhotoLibrary;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openCamera;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> openUploadOptions;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function1<DocumentFile.Remote, Unit> onRemove;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onSubmit;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean disabled;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean addButtonEnabled;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean submitButtonEnabled;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String error;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final StepStyles.DocumentStepStyle styles;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String navBarTitle;

            /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final UiStepBottomSheet bottomSheet;

            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(@NotNull s imageLoader, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<? extends DocumentFile> documents, @NotNull NavigationState navigationState, @NotNull Function0<Unit> openSelectFile, @NotNull Function0<Unit> selectFromPhotoLibrary, @NotNull Function0<Unit> openCamera, @NotNull Function0<Unit> openUploadOptions, @NotNull Function1<? super DocumentFile.Remote, Unit> onRemove, @NotNull Function0<Unit> onSubmit, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onBack, boolean z10, boolean z11, boolean z12, @Nullable String str5, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable String str6, @Nullable UiStepBottomSheet uiStepBottomSheet) {
                Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                Intrinsics.checkNotNullParameter(documents, "documents");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(openSelectFile, "openSelectFile");
                Intrinsics.checkNotNullParameter(selectFromPhotoLibrary, "selectFromPhotoLibrary");
                Intrinsics.checkNotNullParameter(openCamera, "openCamera");
                Intrinsics.checkNotNullParameter(openUploadOptions, "openUploadOptions");
                Intrinsics.checkNotNullParameter(onRemove, "onRemove");
                Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.imageLoader = imageLoader;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = documents;
                this.navigationState = navigationState;
                this.openSelectFile = openSelectFile;
                this.selectFromPhotoLibrary = selectFromPhotoLibrary;
                this.openCamera = openCamera;
                this.openUploadOptions = openUploadOptions;
                this.onRemove = onRemove;
                this.onSubmit = onSubmit;
                this.onCancel = onCancel;
                this.onBack = onBack;
                this.disabled = z10;
                this.addButtonEnabled = z11;
                this.submitButtonEnabled = z12;
                this.error = str5;
                this.onErrorDismissed = onErrorDismissed;
                this.styles = documentStepStyle;
                this.navBarTitle = str6;
                this.bottomSheet = uiStepBottomSheet;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getAddButtonEnabled() {
                return this.addButtonEnabled;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.c
            @Nullable
            /* renamed from: b, reason: from getter */
            public UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getDisabled() {
                return this.disabled;
            }

            @Nullable
            /* renamed from: d, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            public final List<DocumentFile> e() {
                return this.documents;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return Intrinsics.c(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.c(this.title, reviewCaptures.title) && Intrinsics.c(this.prompt, reviewCaptures.prompt) && Intrinsics.c(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.c(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.c(this.documents, reviewCaptures.documents) && Intrinsics.c(this.navigationState, reviewCaptures.navigationState) && Intrinsics.c(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.c(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.c(this.openCamera, reviewCaptures.openCamera) && Intrinsics.c(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.c(this.onRemove, reviewCaptures.onRemove) && Intrinsics.c(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.c(this.onCancel, reviewCaptures.onCancel) && Intrinsics.c(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.c(this.error, reviewCaptures.error) && Intrinsics.c(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.c(this.styles, reviewCaptures.styles) && Intrinsics.c(this.navBarTitle, reviewCaptures.navBarTitle) && Intrinsics.c(this.bottomSheet, reviewCaptures.bottomSheet);
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final String getError() {
                return this.error;
            }

            @NotNull
            /* renamed from: g, reason: from getter */
            public final s getImageLoader() {
                return this.imageLoader;
            }

            @Nullable
            /* renamed from: h, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            public int hashCode() {
                int hashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int hashCode5 = (((((((((((((((((((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.openSelectFile.hashCode()) * 31) + this.selectFromPhotoLibrary.hashCode()) * 31) + this.openCamera.hashCode()) * 31) + this.openUploadOptions.hashCode()) * 31) + this.onRemove.hashCode()) * 31) + this.onSubmit.hashCode()) * 31) + this.onCancel.hashCode()) * 31) + this.onBack.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.addButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31;
                String str5 = this.error;
                int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int hashCode7 = (hashCode6 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                String str6 = this.navBarTitle;
                int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                UiStepBottomSheet uiStepBottomSheet = this.bottomSheet;
                return hashCode8 + (uiStepBottomSheet != null ? uiStepBottomSheet.hashCode() : 0);
            }

            @NotNull
            /* renamed from: i, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> k() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> l() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function1<DocumentFile.Remote, Unit> m() {
                return this.onRemove;
            }

            @NotNull
            public final Function0<Unit> n() {
                return this.onSubmit;
            }

            @NotNull
            public final Function0<Unit> o() {
                return this.openUploadOptions;
            }

            @Nullable
            /* renamed from: p, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* renamed from: q, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            /* renamed from: r, reason: from getter */
            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            @Nullable
            /* renamed from: s, reason: from getter */
            public final String getSubmitButtonText() {
                return this.submitButtonText;
            }

            @Nullable
            /* renamed from: t, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public String toString() {
                return "ReviewCaptures(imageLoader=" + this.imageLoader + ", title=" + this.title + ", prompt=" + this.prompt + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", documents=" + this.documents + ", navigationState=" + this.navigationState + ", openSelectFile=" + this.openSelectFile + ", selectFromPhotoLibrary=" + this.selectFromPhotoLibrary + ", openCamera=" + this.openCamera + ", openUploadOptions=" + this.openUploadOptions + ", onRemove=" + this.onRemove + ", onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onBack=" + this.onBack + ", disabled=" + this.disabled + ", addButtonEnabled=" + this.addButtonEnabled + ", submitButtonEnabled=" + this.submitButtonEnabled + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", navBarTitle=" + this.navBarTitle + ", bottomSheet=" + this.bottomSheet + ")";
            }

            public /* synthetic */ ReviewCaptures(s sVar, String str, String str2, String str3, String str4, List list, NavigationState navigationState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function0 function05, Function0 function06, Function0 function07, boolean z10, boolean z11, boolean z12, String str5, Function0 function08, StepStyles.DocumentStepStyle documentStepStyle, String str6, UiStepBottomSheet uiStepBottomSheet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(sVar, str, str2, str3, str4, list, navigationState, function0, function02, function03, function04, function1, function05, function06, function07, z10, z11, z12, str5, function08, documentStepStyle, (i10 & 2097152) != 0 ? null : str6, (i10 & 4194304) != 0 ? null : uiStepBottomSheet);
            }
        }
    }
}
