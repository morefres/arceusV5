package fp;

import androidx.core.app.FrameMetricsAggregator;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.internal.c;
import com.withpersona.sdk2.inquiry.internal.f;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.internal.m;
import com.withpersona.sdk2.inquiry.internal.network.a;
import com.withpersona.sdk2.inquiry.internal.network.b;
import com.withpersona.sdk2.inquiry.internal.network.d;
import com.withpersona.sdk2.inquiry.internal.network.g;
import com.withpersona.sdk2.inquiry.internal.network.h;
import com.withpersona.sdk2.inquiry.internal.network.i;
import com.withpersona.sdk2.inquiry.internal.o;
import com.withpersona.sdk2.inquiry.internal.r;
import com.withpersona.sdk2.inquiry.internal.v;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import ep.InquiryAttributes;
import fo.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nq.a;
import org.jetbrains.annotations.NotNull;
import xo.y;

@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\b\u0000\u0018\u0000 ¿\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004À\u0001Á\u0001Bç\u0001\b\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020K2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020N2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00052\u0006\u0010C\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00052\u0006\u0010C\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ-\u0010[\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020Z2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b[\u0010\\J-\u0010^\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020]2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b^\u0010_J-\u0010a\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020`2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u00020\u00052\u0006\u0010C\u001a\u00020c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bd\u0010eJ-\u0010g\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020i2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bj\u0010kJ?\u0010r\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00032\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030tH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020>H\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020B2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020p*\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J5\u0010\u0085\u0001\u001a\u00020>2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020~2\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020>¢\u0006\u0005\b\u008c\u0001\u0010yR\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001¨\u0006Â\u0001"}, d2 = {"Lfp/e0;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Lfp/s0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "exchangeOneTimeCodeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "redeemRelaySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "governmentIdWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "selfieWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "uiWorkflow", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "documentWorkflow", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "integrationWorkflow", "Lnq/e;", "externalInquiryController", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "restoreUiStepStateWorkerFactory", "Lfo/b$a;", "featureFlagWorkerFactory", "Leo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "trackingMetadataProvider", "Lcom/withpersona/sdk2/inquiry/internal/q;", "silentNetworkAuthenticationManager", "Lxo/f;", "deviceMetricsOrchestrator", "Lju/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/internal/c$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/k$b;Lcom/withpersona/sdk2/inquiry/internal/r$a;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;Lcom/withpersona/sdk2/inquiry/internal/v$a;Lcom/withpersona/sdk2/inquiry/internal/f$a;Lcom/withpersona/sdk2/inquiry/internal/m$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lnq/e;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/o$a;Lfo/b$a;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lcom/withpersona/sdk2/inquiry/internal/q;Lxo/f;Lju/p0;)V", "state", "", "G", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "renderState", "Lkotlin/Function0;", "backAction", "k0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "U", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "h0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "l0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Q", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "M", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Z", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "O", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "S", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "e0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "c0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "N", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "g0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;Lkotlin/jvm/functions/Function0;)Lfp/s0;", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "didGoBack", "X", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lep/e;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)Lfp/s0;", "Ltr/f;", "context", "q0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Ltr/f;)V", "w0", "()V", "Lxo/m0;", "stepState", "p0", "(Lxo/m0;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "K", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "", "sessionToken", "error", "errorMessage", "x0", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "output", "z0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V", "F", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "L", "e", "Landroidx/lifecycle/l0;", "f", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "h", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "i", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "j", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "l", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "m", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "p", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "q", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "r", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "s", "Lnq/e;", zl.t.f38095d, "Lsq/a;", "u", "Lnq/c;", "v", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "w", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "x", "Lfo/b$a;", "y", "Leo/e;", "z", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "A", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "B", "Lcom/withpersona/sdk2/inquiry/internal/q;", "C", "Lxo/f;", "D", ve.a.f33391e, j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e0 extends tr.c<InquiryWorkflow$Props, InquiryState, InquiryWorkflow$Output, s0> {

    /* renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final TrackingMetadataProvider trackingMetadataProvider;

    /* renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.q silentNetworkAuthenticationManager;

    /* renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final xo.f deviceMetricsOrchestrator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a createInquiryWorker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.InterfaceC0217a inquirySessionWorker;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k.b pollingWorker;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r.a transitionBackWorker;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransitionWorker.a transitionWorkerFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v.a updateInquirySessionWorkerFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f.a exchangeOneTimeCodeWorkerFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.a redeemRelaySessionWorkerFactory;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow governmentIdWorkflow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelfieWorkflow selfieWorkflow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiWorkflow uiWorkflow;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentWorkflow documentWorkflow;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntegrationWorkflow integrationWorkflow;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.e externalInquiryController;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o.a restoreUiStepStateWorkerFactory;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a featureFlagWorkerFactory;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lfp/e0$b;", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lfp/e0;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lfp/e0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        e0 a(@NotNull InquiryWorkflow$Props props, @NotNull android.view.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17569a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17570c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f17571d;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17569a = iArr;
            int[] iArr2 = new int[wp.a.values().length];
            try {
                iArr2[wp.a.f34486a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[wp.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[xo.a0.values().length];
            try {
                iArr3[xo.a0.f35796a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[xo.a0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f17570c = iArr3;
            int[] iArr4 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr4[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f17571d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$handleState$5", f = "InquiryStateManager.kt", l = {211}, m = "invokeSuspend")
    public static final class d extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17572t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f17574a;

            public a(e0 e0Var) {
                this.f17574a = e0Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(nq.a aVar, mt.b<? super Unit> bVar) {
                if (!(aVar instanceof a.CancelRequest)) {
                    throw new gt.l();
                }
                a.CancelRequest cancelRequest = (a.CancelRequest) aVar;
                e0.I(this.f17574a, cancelRequest.getForce(), cancelRequest.getSkipBackendCall());
                return Unit.f22894a;
            }
        }

        public d(mt.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e0.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17572t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h<nq.a> c10 = e0.this.externalInquiryController.c();
                a aVar = new a(e0.this);
                this.f17572t = 1;
                if (c10.collect(aVar, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1", f = "InquiryStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17575t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryState.Complete f17577v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InquiryState.Complete complete, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f17577v = complete;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e0.this.new e(this.f17577v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f17575t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            e0.this.z0(new InquiryWorkflow$Output.Complete(this.f17577v.getInquiryId(), this.f17577v.getInquiryStatus(), this.f17577v.s(), this.f17577v.getSessionToken(), this.f17577v.getRedirectUri()));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderUiStep$2", f = "InquiryStateManager.kt", l = {846}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17578t;

        public f(mt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return e0.this.new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17578t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f17578t = 1;
                if (ju.z0.b(2000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            InquiryState i11 = e0.this.d().i();
            InquiryState.UiStepRunning uiStepRunning = i11 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) i11 : null;
            if (uiStepRunning == null) {
                return Unit.f22894a;
            }
            e0.this.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 1966079, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull InquiryWorkflow$Props props, @NotNull android.view.l0 savedStateHandle, @NotNull c.a createInquiryWorker, @NotNull a.InterfaceC0217a inquirySessionWorker, @NotNull k.b pollingWorker, @NotNull r.a transitionBackWorker, @NotNull TransitionWorker.a transitionWorkerFactory, @NotNull v.a updateInquirySessionWorkerFactory, @NotNull f.a exchangeOneTimeCodeWorkerFactory, @NotNull m.a redeemRelaySessionWorkerFactory, @NotNull GovernmentIdWorkflow governmentIdWorkflow, @NotNull SelfieWorkflow selfieWorkflow, @NotNull UiWorkflow uiWorkflow, @NotNull DocumentWorkflow documentWorkflow, @NotNull IntegrationWorkflow integrationWorkflow, @NotNull nq.e externalInquiryController, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull o.a restoreUiStepStateWorkerFactory, @NotNull b.a featureFlagWorkerFactory, @NotNull eo.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull com.withpersona.sdk2.inquiry.internal.q silentNetworkAuthenticationManager, @NotNull xo.f deviceMetricsOrchestrator, @NotNull ju.p0 coroutineScope) {
        super(props, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(createInquiryWorker, "createInquiryWorker");
        Intrinsics.checkNotNullParameter(inquirySessionWorker, "inquirySessionWorker");
        Intrinsics.checkNotNullParameter(pollingWorker, "pollingWorker");
        Intrinsics.checkNotNullParameter(transitionBackWorker, "transitionBackWorker");
        Intrinsics.checkNotNullParameter(transitionWorkerFactory, "transitionWorkerFactory");
        Intrinsics.checkNotNullParameter(updateInquirySessionWorkerFactory, "updateInquirySessionWorkerFactory");
        Intrinsics.checkNotNullParameter(exchangeOneTimeCodeWorkerFactory, "exchangeOneTimeCodeWorkerFactory");
        Intrinsics.checkNotNullParameter(redeemRelaySessionWorkerFactory, "redeemRelaySessionWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdWorkflow, "governmentIdWorkflow");
        Intrinsics.checkNotNullParameter(selfieWorkflow, "selfieWorkflow");
        Intrinsics.checkNotNullParameter(uiWorkflow, "uiWorkflow");
        Intrinsics.checkNotNullParameter(documentWorkflow, "documentWorkflow");
        Intrinsics.checkNotNullParameter(integrationWorkflow, "integrationWorkflow");
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(restoreUiStepStateWorkerFactory, "restoreUiStepStateWorkerFactory");
        Intrinsics.checkNotNullParameter(featureFlagWorkerFactory, "featureFlagWorkerFactory");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(trackingMetadataProvider, "trackingMetadataProvider");
        Intrinsics.checkNotNullParameter(silentNetworkAuthenticationManager, "silentNetworkAuthenticationManager");
        Intrinsics.checkNotNullParameter(deviceMetricsOrchestrator, "deviceMetricsOrchestrator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.createInquiryWorker = createInquiryWorker;
        this.inquirySessionWorker = inquirySessionWorker;
        this.pollingWorker = pollingWorker;
        this.transitionBackWorker = transitionBackWorker;
        this.transitionWorkerFactory = transitionWorkerFactory;
        this.updateInquirySessionWorkerFactory = updateInquirySessionWorkerFactory;
        this.exchangeOneTimeCodeWorkerFactory = exchangeOneTimeCodeWorkerFactory;
        this.redeemRelaySessionWorkerFactory = redeemRelaySessionWorkerFactory;
        this.governmentIdWorkflow = governmentIdWorkflow;
        this.selfieWorkflow = selfieWorkflow;
        this.uiWorkflow = uiWorkflow;
        this.documentWorkflow = documentWorkflow;
        this.integrationWorkflow = integrationWorkflow;
        this.externalInquiryController = externalInquiryController;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.restoreUiStepStateWorkerFactory = restoreUiStepStateWorkerFactory;
        this.featureFlagWorkerFactory = featureFlagWorkerFactory;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.trackingMetadataProvider = trackingMetadataProvider;
        this.silentNetworkAuthenticationManager = silentNetworkAuthenticationManager;
        this.deviceMetricsOrchestrator = deviceMetricsOrchestrator;
        if (d().i() == null) {
            f(F(props));
        } else {
            InquiryState i10 = d().i();
            if (i10 instanceof InquiryState.UiStepRunning) {
                f(InquiryState.UiStepRunning.r((InquiryState.UiStepRunning) i10, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, true, null, 1572863, null));
            }
        }
        d().o(new Function1() { // from class: fp.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B;
                B = e0.B(e0.this, (InquiryState) obj);
                return B;
            }
        });
    }

    public static final Unit B(e0 e0Var, InquiryState inquiryState) {
        if (inquiryState == null) {
            return Unit.f22894a;
        }
        e0Var.G(inquiryState);
        return Unit.f22894a;
    }

    public static final Unit H(e0 e0Var) {
        J(e0Var, false, false, 4, null);
        return Unit.f22894a;
    }

    public static final void I(e0 e0Var, boolean z10, boolean z11) {
        InquiryState i10 = e0Var.d().i();
        if (i10 == null) {
            return;
        }
        String inquiryId = i10.getInquiryId();
        String sessionToken = i10.getSessionToken();
        StepStyle styles = i10.getStyles();
        NextStep.CancelDialog cancelDialog = i10.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = i10.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = i10.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = i10.getCancelDialog();
        e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z10, z11, null, 512, null));
    }

    public static /* synthetic */ void J(e0 e0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        I(e0Var, z10, z11);
    }

    public static final Unit P(e0 e0Var, InquiryState.CreateInquirySession createInquirySession, com.withpersona.sdk2.inquiry.internal.network.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof b.Success) {
            b.Success success = (b.Success) it;
            e0Var.f(new InquiryState.LoadFeatureFlagSession(createInquirySession.getInquiryId(), success.getSessionToken(), success.getTrackingEventsUrl(), success.getInquirySessionConfig()));
            e0Var.externalEventLogger.b(new InquiryEvent.StartEvent(createInquirySession.getInquiryId(), com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(success.getSessionToken())));
        } else {
            if (!(it instanceof b.Error)) {
                throw new gt.l();
            }
            y0(e0Var, createInquirySession.getSessionToken(), ((b.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22894a;
    }

    public static final Unit R(e0 e0Var, InquiryState.DocumentStepRunning documentStepRunning, DocumentWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, DocumentWorkflow.b.C0170b.f10141a)) {
            String inquiryId = documentStepRunning.getInquiryId();
            String sessionToken = documentStepRunning.getSessionToken();
            StepStyles.DocumentStepStyle styles = documentStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = documentStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = documentStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = documentStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = documentStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, DocumentWorkflow.b.a.f10140a)) {
            e0Var.f(InquiryState.DocumentStepRunning.r(documentStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, null, null, null, null, 16375, null));
        } else if (it instanceof DocumentWorkflow.b.Errored) {
            DocumentWorkflow.b.Errored errored = (DocumentWorkflow.b.Errored) it;
            if (e0Var.K(errored.getCause())) {
                e0Var.f(e0Var.p0(documentStepRunning));
            } else {
                y0(e0Var, documentStepRunning.getSessionToken(), errored.getCause(), null, 4, null);
            }
        } else {
            if (!Intrinsics.c(it, DocumentWorkflow.b.d.f10143a)) {
                throw new gt.l();
            }
            e0Var.f(InquiryState.DocumentStepRunning.r(documentStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, null, 16375, null));
        }
        return Unit.f22894a;
    }

    public static final Unit T(e0 e0Var, InquiryState.ExchangeOneTimeCode exchangeOneTimeCode, com.withpersona.sdk2.inquiry.internal.network.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof d.Success) {
            d.Success success = (d.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                String trackingEventsUrl = success.getTrackingEventsUrl();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, trackingEventsUrl, inquirySessionConfig));
            }
        } else {
            if (!(it instanceof d.Error)) {
                throw new gt.l();
            }
            y0(e0Var, exchangeOneTimeCode.getSessionToken(), ((d.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22894a;
    }

    public static final Unit V(e0 e0Var, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, GovernmentIdWorkflow.a.b.f10714a)) {
            String inquiryId = governmentIdStepRunning.getInquiryId();
            String sessionToken = governmentIdStepRunning.getSessionToken();
            StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.a.c) {
            GovernmentIdWorkflow.a.c cVar = (GovernmentIdWorkflow.a.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, GovernmentIdWorkflow.a.d.f10716a)) {
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, GovernmentIdWorkflow.a.C0197a.f10713a)) {
                throw new gt.l();
            }
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f22894a;
    }

    public static final Unit W(e0 e0Var, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, GovernmentIdWorkflow.a.b.f10714a)) {
            String inquiryId = governmentIdStepRunning.getInquiryId();
            String sessionToken = governmentIdStepRunning.getSessionToken();
            StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.a.c) {
            GovernmentIdWorkflow.a.c cVar = (GovernmentIdWorkflow.a.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, GovernmentIdWorkflow.a.d.f10716a)) {
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, GovernmentIdWorkflow.a.C0197a.f10713a)) {
                throw new gt.l();
            }
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f22894a;
    }

    public static final Unit Y(e0 e0Var, InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.Success) {
            a.Success success = (a.Success) it;
            String redirectUri = success.getRedirectUri();
            if (redirectUri != null) {
                e0Var.savedStateHandle.i("redirect_uri", redirectUri);
            }
            if (hq.j.e(success.getInquiryId())) {
                e0Var.z0(new InquiryWorkflow$Output.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
            } else {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, success.getInquirySession(), 2, null));
            }
        } else {
            if (!(it instanceof a.Error)) {
                throw new gt.l();
            }
            a.Error error = (a.Error) it;
            e0Var.x0(inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        }
        return Unit.f22894a;
    }

    public static final Unit a0(e0 e0Var, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, IntegrationWorkflow.b.c.f11182a)) {
            if (Intrinsics.c(it, IntegrationWorkflow.b.d.f11183a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, IntegrationWorkflow.b.a.f11180a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, IntegrationWorkflow.b.C0208b.f11181a)) {
                    throw new gt.l();
                }
                String inquiryId = integrationStepRunning.getInquiryId();
                String sessionToken = integrationStepRunning.getSessionToken();
                StepStyles.IntegrationStepStyle styles = integrationStepRunning.getStyles();
                NextStep.CancelDialog cancelDialog = integrationStepRunning.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = integrationStepRunning.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = integrationStepRunning.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = integrationStepRunning.getCancelDialog();
                e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit b0(e0 e0Var, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, IntegrationWorkflow.b.c.f11182a)) {
            if (Intrinsics.c(it, IntegrationWorkflow.b.d.f11183a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, IntegrationWorkflow.b.a.f11180a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, IntegrationWorkflow.b.C0208b.f11181a)) {
                    throw new gt.l();
                }
                String inquiryId = integrationStepRunning.getInquiryId();
                String sessionToken = integrationStepRunning.getSessionToken();
                StepStyles.IntegrationStepStyle styles = integrationStepRunning.getStyles();
                NextStep.CancelDialog cancelDialog = integrationStepRunning.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = integrationStepRunning.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = integrationStepRunning.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = integrationStepRunning.getCancelDialog();
                e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit d0(e0 e0Var, InquiryState.LoadFeatureFlagSession loadFeatureFlagSession, b.AbstractC0316b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof b.AbstractC0316b.Success) && !(it instanceof b.AbstractC0316b.a)) {
            throw new gt.l();
        }
        e0Var.trackingEventsLogger.setIsEnabled(!e0Var.b().getValue().M());
        e0Var.trackingMetadataProvider.setFeatureFlags(e0Var.featureFlagManager.b());
        TrackingEventsLogger.logInquiryStartEvent$default(e0Var.trackingEventsLogger, com.withpersona.sdk2.inquiry.internal.j.a(e0Var.b().getValue(), e0Var.featureFlagManager.a(eo.w.f16121a) ? UiFramework.PersonaWorkflow : UiFramework.SquareWorkflow), false, 2, null);
        if (e0Var.featureFlagManager.a(eo.b.f16089a)) {
            e0Var.deviceMetricsOrchestrator.a(loadFeatureFlagSession.getSessionToken());
        }
        e0Var.f(new InquiryState.ShowLoadingSpinner(loadFeatureFlagSession.getSessionToken(), loadFeatureFlagSession.getTrackingEventsUrl(), null, loadFeatureFlagSession.getInquiryId(), null, true, loadFeatureFlagSession.getInquirySessionConfig(), 4, null));
        return Unit.f22894a;
    }

    public static final Unit f0(e0 e0Var, InquiryState.RedeemRelaySession redeemRelaySession, com.withpersona.sdk2.inquiry.internal.network.g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof g.Success) {
            g.Success success = (g.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, null, inquirySessionConfig, 4, null));
            }
        } else {
            if (!(it instanceof g.Error)) {
                throw new gt.l();
            }
            y0(e0Var, redeemRelaySession.getSessionToken(), ((g.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22894a;
    }

    public static final Unit i0(e0 e0Var, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, SelfieWorkflow.b.C0236b.f12687a)) {
            String inquiryId = selfieStepRunning.getInquiryId();
            String sessionToken = selfieStepRunning.getSessionToken();
            StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.d.f12689a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.a.f12686a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.b.Error)) {
                throw new gt.l();
            }
            SelfieWorkflow.b.Error error = (SelfieWorkflow.b.Error) it;
            if (e0Var.K(error.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), error.getCause(), null, 4, null);
            }
        }
        return Unit.f22894a;
    }

    public static final Unit j0(e0 e0Var, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, SelfieWorkflow.b.C0236b.f12687a)) {
            String inquiryId = selfieStepRunning.getInquiryId();
            String sessionToken = selfieStepRunning.getSessionToken();
            StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.d.f12689a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.a.f12686a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.b.Error)) {
                throw new gt.l();
            }
            SelfieWorkflow.b.Error error = (SelfieWorkflow.b.Error) it;
            if (e0Var.K(error.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), error.getCause(), null, 4, null);
            }
        }
        return Unit.f22894a;
    }

    public static final Unit m0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, UiWorkflow.b.C0255b.f13824a)) {
            String inquiryId = uiStepRunning.getInquiryId();
            String sessionToken = uiStepRunning.getSessionToken();
            StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.b.d) {
            UiWorkflow.b.d dVar = (UiWorkflow.b.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.b.FinishedWithoutTransition) {
            UiWorkflow.b.FinishedWithoutTransition finishedWithoutTransition = (UiWorkflow.b.FinishedWithoutTransition) it;
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(finishedWithoutTransition.getFromComponent(), finishedWithoutTransition.a(), finishedWithoutTransition.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.FinishedWithTransition) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.a) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.b.c)) {
                throw new gt.l();
            }
            e0Var.z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f22894a;
    }

    public static final Unit n0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, UiWorkflow.b.C0255b.f13824a)) {
            String inquiryId = uiStepRunning.getInquiryId();
            String sessionToken = uiStepRunning.getSessionToken();
            StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.b.d) {
            UiWorkflow.b.d dVar = (UiWorkflow.b.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.b.FinishedWithoutTransition) {
            UiWorkflow.b.FinishedWithoutTransition finishedWithoutTransition = (UiWorkflow.b.FinishedWithoutTransition) it;
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(finishedWithoutTransition.getFromComponent(), finishedWithoutTransition.a(), finishedWithoutTransition.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.FinishedWithTransition) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.a) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11434a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.b.c)) {
                throw new gt.l();
            }
            e0Var.z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f22894a;
    }

    public static final Unit o0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, o.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, o.b.a.f12110a)) {
            if (!(e0Var.d().i() instanceof InquiryState.UiStepRunning)) {
                return Unit.f22894a;
            }
            e0Var.f(e0Var.p0(uiStepRunning));
        } else {
            if (!(it instanceof o.b.C0225b)) {
                throw new gt.l();
            }
            InquiryState i10 = e0Var.d().i();
            InquiryState.UiStepRunning uiStepRunning2 = i10 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) i10 : null;
            if (uiStepRunning2 == null) {
                return Unit.f22894a;
            }
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, ((o.b.C0225b) it).a(), false, false, false, null, null, null, null, null, null, false, null, 1572351, null));
        }
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r0(e0 e0Var, InquiryState inquiryState, String str, InternalErrorInfo internalErrorInfo) {
        Collection<UiComponentError> values;
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new gt.l();
            }
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        r5 = null;
        ArrayList arrayList = null;
        if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
            InquiryState i10 = e0Var.d().i();
            InquiryState.UiStepRunning uiStepRunning = i10 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) i10 : null;
            if (uiStepRunning == null) {
                return;
            }
            Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
            if (details != null && (values = details.values()) != null) {
                Collection<UiComponentError> collection = values;
                arrayList = new ArrayList(kotlin.collections.q.u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new UiComponentErrorInfo((UiComponentError) it.next(), 0L, 2, null));
                }
            }
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, arrayList, null, null, false, null, 2031607, null));
            return;
        }
        if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
            if (inquiryState instanceof xo.m0) {
                e0Var.f(e0Var.p0((xo.m0) inquiryState));
                return;
            } else {
                y0(e0Var, str, internalErrorInfo, null, 4, null);
                return;
            }
        }
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
            throw new gt.l();
        }
        if (!networkErrorInfo.isRecoverable()) {
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        InquiryState i11 = e0Var.d().i();
        InquiryState.UiStepRunning uiStepRunning2 = i11 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) i11 : null;
        if (uiStepRunning2 == null) {
            return;
        }
        e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, networkErrorInfo, null, false, null, 1966071, null));
    }

    public static final Unit s0(e0 e0Var, InquiryState inquiryState, String str, TransitionWorker.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof TransitionWorker.b.Error) {
            r0(e0Var, inquiryState, str, ((TransitionWorker.b.Error) it).getCause());
        } else {
            if (!(it instanceof TransitionWorker.b.Success)) {
                throw new gt.l();
            }
            InquiryState i10 = e0Var.d().i();
            if (i10 == null) {
                return Unit.f22894a;
            }
            e0Var.f(i10.p(new TransitionStatus.UpdateInquirySession(((TransitionWorker.b.Success) it).getNextState(), false)));
        }
        return Unit.f22894a;
    }

    public static final Unit t0(e0 e0Var, String str, TransitionStatus transitionStatus, com.withpersona.sdk2.inquiry.internal.network.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof i.Error) {
            y0(e0Var, str, ((i.Error) it).getCause(), null, 4, null);
        } else {
            if (!Intrinsics.c(it, i.b.f12104a)) {
                throw new gt.l();
            }
            InquiryState i10 = e0Var.d().i();
            if (i10 == null) {
                return Unit.f22894a;
            }
            TransitionStatus.UpdateInquirySession updateInquirySession = (TransitionStatus.UpdateInquirySession) transitionStatus;
            if (updateInquirySession.getNextStep() != null) {
                e0Var.f(updateInquirySession.getNextStep());
            } else {
                e0Var.f(i10.p(new TransitionStatus.CheckingForNextState(null, updateInquirySession.getCanReuseWorkflow(), 1, null)));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit u0(e0 e0Var, TransitionStatus transitionStatus, InquiryState inquiryState, String str, k.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof k.c.Success) {
            e0Var.f(((k.c.Success) it).a(e0Var.d().i(), ((TransitionStatus.CheckingForNextState) transitionStatus).getCanReuseWorkflow()));
        } else {
            if (!(it instanceof k.c.Error)) {
                throw new gt.l();
            }
            r0(e0Var, inquiryState, str, ((k.c.Error) it).getCause());
        }
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit v0(e0 e0Var, InquiryState inquiryState, String str, com.withpersona.sdk2.inquiry.internal.network.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof h.Success) {
            h.Success success = (h.Success) it;
            success.getNextState().o(true);
            e0Var.f(success.getNextState());
        } else {
            if (!(it instanceof h.Error)) {
                throw new gt.l();
            }
            h.Error error = (h.Error) it;
            if (e0Var.K(error.getCause()) && (inquiryState instanceof xo.m0)) {
                e0Var.f(e0Var.p0((xo.m0) inquiryState));
            } else {
                y0(e0Var, str, error.getCause(), null, 4, null);
            }
        }
        return Unit.f22894a;
    }

    public static /* synthetic */ void y0(e0 e0Var, String str, InternalErrorInfo internalErrorInfo, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        e0Var.x0(str, internalErrorInfo, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InquiryState F(@NotNull InquiryWorkflow$Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (props instanceof InquiryWorkflow$Props.TemplateProps) {
            InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) props;
            return new InquiryState.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.g(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate(), null, templateProps.getRedirectUri(), 256, null);
        }
        int i10 = 2;
        InquirySessionConfig inquirySessionConfig = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (props instanceof InquiryWorkflow$Props.OneTimeCodeProps) {
            return new InquiryState.ExchangeOneTimeCode(((InquiryWorkflow$Props.OneTimeCodeProps) props).getOneTimeLinkCode(), inquirySessionConfig, i10, objArr3 == true ? 1 : 0);
        }
        if (props instanceof InquiryWorkflow$Props.RelaySessionProps) {
            return new InquiryState.RedeemRelaySession(((InquiryWorkflow$Props.RelaySessionProps) props).getRelaySessionToken(), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        if (!(props instanceof InquiryWorkflow$Props.InquiryProps)) {
            throw new gt.l();
        }
        InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) props;
        if (hq.j.e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new InquiryState.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, 4, null);
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken != null && sessionToken.length() != 0) {
            return new InquiryState.LoadFeatureFlagSession(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, InquirySessionConfig.INSTANCE.a(), 4, null);
        }
        return new InquiryState.CreateInquirySession(inquiryProps.getInquiryId(), null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(InquiryState state) {
        s0 c02;
        String redirectUri;
        String sessionToken = state.getSessionToken();
        if (sessionToken != null) {
            if (StringsKt.p0(sessionToken)) {
                sessionToken = null;
            }
            if (sessionToken != null) {
                this.trackingEventsLogger.setSessionToken(sessionToken);
            }
        }
        String trackingEventsUrl = state.getTrackingEventsUrl();
        if (trackingEventsUrl != null) {
            this.trackingEventsLogger.setTrackingEventsUrl(trackingEventsUrl);
        }
        xo.m0 m0Var = state instanceof xo.m0 ? (xo.m0) state : null;
        if (m0Var != null && (redirectUri = m0Var.getRedirectUri()) != null) {
            this.savedStateHandle.i("redirect_uri", redirectUri);
        }
        q0(state, d());
        this.silentNetworkAuthenticationManager.d(state);
        TransitionStatus transitionStatus = state.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f11434a;
        if (Intrinsics.c(transitionStatus, transitioningBack)) {
            this.silentNetworkAuthenticationManager.b();
        }
        this.navigationStateManager.e(Intrinsics.c(state.getTransitionStatus(), transitioningBack));
        Function0<Unit> function0 = new Function0() { // from class: fp.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H;
                H = e0.H(e0.this);
                return H;
            }
        };
        d().m("controllerRequestCollector", new d(null));
        InquiryWorkflow$Props value = b().getValue();
        if (state instanceof InquiryState.CreateInquiryFromTemplate) {
            c02 = N(value, (InquiryState.CreateInquiryFromTemplate) state, function0);
        } else if (state instanceof InquiryState.ResumeFallbackInquiry) {
            c02 = g0(value, (InquiryState.ResumeFallbackInquiry) state, function0);
        } else if (state instanceof InquiryState.CreateInquirySession) {
            c02 = O(value, (InquiryState.CreateInquirySession) state, function0);
        } else if (state instanceof InquiryState.ExchangeOneTimeCode) {
            c02 = S(value, (InquiryState.ExchangeOneTimeCode) state, function0);
        } else if (state instanceof InquiryState.RedeemRelaySession) {
            c02 = e0(value, (InquiryState.RedeemRelaySession) state, function0);
        } else if (state instanceof InquiryState.ShowLoadingSpinner) {
            c02 = k0(value, (InquiryState.ShowLoadingSpinner) state, function0);
        } else if (state instanceof InquiryState.GovernmentIdStepRunning) {
            c02 = U(value, (InquiryState.GovernmentIdStepRunning) state);
        } else if (state instanceof InquiryState.SelfieStepRunning) {
            c02 = h0(value, (InquiryState.SelfieStepRunning) state, function0);
        } else if (state instanceof InquiryState.UiStepRunning) {
            c02 = l0(value, (InquiryState.UiStepRunning) state, function0);
        } else if (state instanceof InquiryState.DocumentStepRunning) {
            c02 = Q((InquiryState.DocumentStepRunning) state);
        } else if (state instanceof InquiryState.Complete) {
            c02 = M((InquiryState.Complete) state);
        } else if (state instanceof InquiryState.IntegrationStepRunning) {
            c02 = Z(value, (InquiryState.IntegrationStepRunning) state);
        } else {
            if (!(state instanceof InquiryState.LoadFeatureFlagSession)) {
                throw new gt.l();
            }
            c02 = c0((InquiryState.LoadFeatureFlagSession) state, function0);
        }
        c().setValue(c02);
    }

    public final boolean K(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    public final void L() {
        w0();
        this.silentNetworkAuthenticationManager.c();
        this.deviceMetricsOrchestrator.b();
    }

    public final s0 M(InquiryState.Complete renderState) {
        d().m("complete", new e(renderState, null));
        return new a();
    }

    public final s0 N(InquiryWorkflow$Props renderProps, InquiryState.CreateInquiryFromTemplate renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.s(), renderState.getThemeSetId(), null, 2304, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 O(InquiryWorkflow$Props renderProps, final InquiryState.CreateInquirySession renderState, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.inquirySessionWorker.a(renderState.getInquiryId(), renderState.getInquirySessionDataWrapper()), new Function1() { // from class: fp.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit P;
                P = e0.P(e0.this, renderState, (com.withpersona.sdk2.inquiry.internal.network.b) obj);
                return P;
            }
        });
        return new u0(new y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 Q(final InquiryState.DocumentStepRunning renderState) {
        DocumentWorkflow.StartPage startPage;
        String str;
        NextStep.Document.Config config = renderState.getDocumentStep().getConfig();
        String documentId = config.getDocumentId();
        int i10 = c.f17571d[config.getStartPage().ordinal()];
        if (i10 == 1) {
            startPage = DocumentWorkflow.StartPage.Prompt.f10091a;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            startPage = documentId != null ? new DocumentWorkflow.StartPage.Review(documentId) : DocumentWorkflow.StartPage.Prompt.f10091a;
        }
        DocumentWorkflow.StartPage startPage2 = startPage;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        String title = config.getLocalizations().getPromptPage().getTitle();
        String prompt = config.getLocalizations().getPromptPage().getPrompt();
        String disclaimer = config.getLocalizations().getPromptPage().getDisclaimer();
        String btnSubmit = config.getLocalizations().getPromptPage().getBtnSubmit();
        String title2 = config.getLocalizations().getPendingPage().getTitle();
        String description = config.getLocalizations().getPendingPage().getDescription();
        String fieldKeyDocument = config.getFieldKeyDocument();
        String kind = config.getKind();
        int documentFileLimit = config.getDocumentFileLimit();
        Boolean backStepEnabled = config.getBackStepEnabled();
        boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = config.getCancelButtonEnabled();
        boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String cameraPermissionsTitle = config.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = config.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = config.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = config.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String largeFileErrorPrompt = config.getLocalizations().getPromptPage().getLargeFileErrorPrompt();
        StepStyles.DocumentStepStyle styles = renderState.getStyles();
        DocumentPages pages = renderState.getPages();
        NextStep.Document.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            str = sessionToken;
            assetConfig = new NextStep.Document.AssetConfig(null, null, 3, null);
        } else {
            str = sessionToken;
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = config.getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        String navBarTitle = config.getLocalizations().getPromptPage().getNavBarTitle();
        NextStep.Document.CheckPage checkPage = config.getLocalizations().getCheckPage();
        DocumentWorkflow.Input input = new DocumentWorkflow.Input(str, inquiryId, fromStep, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, startPage2, pages, documentFileLimit, booleanValue, booleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, largeFileErrorPrompt, styles, assetConfig, pendingPageTextVerticalPosition, navBarTitle, checkPage != null ? checkPage.getNavBarTitle() : null, config.getLocalizations().getPendingPage().getNavBarTitle(), renderState.getCustomPendingPage());
        Function1 function1 = new Function1() { // from class: fp.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit R;
                R = e0.R(e0.this, renderState, (DocumentWorkflow.b) obj);
                return R;
            }
        };
        if (this.featureFlagManager.a(eo.w.f16121a)) {
            return new fp.b(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11434a), input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
        }
        return new fp.d(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11434a), this.documentWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
    }

    public final s0 S(InquiryWorkflow$Props renderProps, final InquiryState.ExchangeOneTimeCode renderState, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.exchangeOneTimeCodeWorkerFactory.create(renderState.getOneTimeLinkCode()), new Function1() { // from class: fp.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit T;
                T = e0.T(e0.this, renderState, (com.withpersona.sdk2.inquiry.internal.network.d) obj);
                return T;
            }
        });
        return new u0(new y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 U(InquiryWorkflow$Props renderProps, final InquiryState.GovernmentIdStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> G = renderState.G();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = G.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Id id2 = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            IdConfig o8 = com.withpersona.sdk2.inquiry.governmentid.d.o(id2, countryCode2 != null ? countryCode2 : "US", renderState.getManualCaptureButtonDelayMs());
            if (o8 != null) {
                arrayList.add(o8);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> E = renderState.E();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        String str = countryCode3 != null ? countryCode3 : "US";
        List<NextStep.GovernmentId.LocalizationOverride> P = renderState.P();
        GovernmentIdWorkflow.Input.Strings j10 = ep.a.j(localizations, str, P != null ? CollectionsKt.E0(P) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> D = renderState.D();
        List<NextStep.GovernmentId.VideoCaptureMethod> f02 = renderState.f0();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(f02, 10));
        Iterator<T> it2 = f02.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kn.a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, D, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        NextStep.GovernmentId.AssetConfig assetConfig2 = assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig;
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f11434a;
        GovernmentIdWorkflow.Input input = new GovernmentIdWorkflow.Input(sessionToken, countryCode, arrayList, inquiryId, fromStep, fromComponent, backStepEnabled, cancelButtonEnabled, E, styles, j10, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig2, !Intrinsics.c(transitionStatus, transitioningBack), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig(), renderState.getStaticCaptureTipsEnabled(), renderState.getHolographicTorchEnabledDurationMs(), renderState.getDesignVersion(), renderState.getFlowWatermarkText(), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(eo.w.f16121a)) {
            return new fp.f(!Intrinsics.c(renderState.getTransitionStatus(), transitioningBack), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: fp.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit V;
                    V = e0.V(e0.this, renderState, (GovernmentIdWorkflow.a) obj);
                    return V;
                }
            });
        }
        return new h(!Intrinsics.c(renderState.getTransitionStatus(), transitioningBack), this.governmentIdWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: fp.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W;
                W = e0.W(e0.this, renderState, (GovernmentIdWorkflow.a) obj);
                return W;
            }
        });
    }

    public final s0 X(InquiryWorkflow$Props renderProps, final InquiryAttributes attributes, StepStyle styles, boolean didGoBack, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.createInquiryWorker.a(attributes), new Function1() { // from class: fp.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y;
                Y = e0.Y(e0.this, attributes, (com.withpersona.sdk2.inquiry.internal.network.a) obj);
                return Y;
            }
        });
        return new u0(new y.a(styles, true, backAction), didGoBack);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fp.s0 Z(com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props r25, final com.withpersona.sdk2.inquiry.internal.InquiryState.IntegrationStepRunning r26) {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r4 = r26.getSessionToken()
            java.lang.String r3 = r26.getInquiryId()
            java.lang.String r5 = r26.z()
            java.lang.String r6 = r26.getType()
            java.lang.String r7 = r26.getFlowUrl()
            java.lang.String r8 = r26.getRedirectPath()
            com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType r9 = r26.getIntegrationStepBrowserType()
            boolean r10 = r26.getBackStepEnabled()
            boolean r11 = r26.getCancelButtonEnabled()
            com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r12 = r26.getInquirySessionConfig()
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle r13 = r26.getStyles()
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r14 = r26.getTransitionError()
            com.withpersona.sdk2.inquiry.integration.IntegrationPage r15 = r26.getIntegrationPage()
            com.withpersona.sdk2.inquiry.internal.TransitionStatus r2 = r26.getTransitionStatus()
            r25 = r3
            boolean r3 = r2 instanceof com.withpersona.sdk2.inquiry.internal.TransitionStatus.CheckingForNextState
            r16 = 0
            r1 = 1
            if (r3 == 0) goto L63
            com.withpersona.sdk2.inquiry.internal.TransitionStatus r2 = r26.getTransitionStatus()
            com.withpersona.sdk2.inquiry.internal.TransitionStatus$CheckingForNextState r2 = (com.withpersona.sdk2.inquiry.internal.TransitionStatus.CheckingForNextState) r2
            xo.a0 r2 = r2.getPollingMode()
            int[] r3 = fp.e0.c.f17570c
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r1) goto L7d
            r3 = 2
            if (r2 != r3) goto L5d
        L5a:
            r16 = r1
            goto L7d
        L5d:
            gt.l r1 = new gt.l
            r1.<init>()
            throw r1
        L63:
            boolean r3 = r2 instanceof com.withpersona.sdk2.inquiry.internal.TransitionStatus.Transitioning
            if (r3 != 0) goto L5a
            com.withpersona.sdk2.inquiry.internal.TransitionStatus$TransitioningBack r3 = com.withpersona.sdk2.inquiry.internal.TransitionStatus.TransitioningBack.f11434a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
            if (r3 != 0) goto L5a
            boolean r3 = r2 instanceof com.withpersona.sdk2.inquiry.internal.TransitionStatus.UpdateInquirySession
            if (r3 == 0) goto L74
            goto L5a
        L74:
            if (r2 != 0) goto L77
            goto L7d
        L77:
            gt.l r1 = new gt.l
            r1.<init>()
            throw r1
        L7d:
            com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input r2 = new com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input
            r3 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            eo.e r3 = r0.featureFlagManager
            eo.w r4 = eo.w.f16121a
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto Lb3
            com.withpersona.sdk2.inquiry.internal.TransitionStatus r3 = r26.getTransitionStatus()
            com.withpersona.sdk2.inquiry.internal.TransitionStatus$TransitioningBack r4 = com.withpersona.sdk2.inquiry.internal.TransitionStatus.TransitioningBack.f11434a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            r18 = r3 ^ 1
            java.lang.String r20 = r26.getFromStep()
            boolean r21 = r26.getDidGoBack()
            fp.o0 r17 = new fp.o0
            fp.c0 r1 = new fp.c0
            r3 = r26
            r1.<init>()
            r22 = r1
            r19 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            return r17
        Lb3:
            r3 = r26
            com.withpersona.sdk2.inquiry.internal.TransitionStatus r4 = r3.getTransitionStatus()
            com.withpersona.sdk2.inquiry.internal.TransitionStatus$TransitioningBack r5 = com.withpersona.sdk2.inquiry.internal.TransitionStatus.TransitioningBack.f11434a
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
            r18 = r4 ^ 1
            java.lang.String r21 = r3.getFromStep()
            com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow r1 = r0.integrationWorkflow
            boolean r22 = r3.getDidGoBack()
            fp.q0 r17 = new fp.q0
            fp.d0 r4 = new fp.d0
            r4.<init>()
            r19 = r1
            r20 = r2
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.e0.Z(com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props, com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning):fp.s0");
    }

    public final s0 c0(final InquiryState.LoadFeatureFlagSession renderState, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.featureFlagWorkerFactory.create(renderState.getSessionToken()), new Function1() { // from class: fp.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d02;
                d02 = e0.d0(e0.this, renderState, (b.AbstractC0316b) obj);
                return d02;
            }
        });
        return new u0(new y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 e0(InquiryWorkflow$Props renderProps, final InquiryState.RedeemRelaySession renderState, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.redeemRelaySessionWorkerFactory.create(renderState.getRelaySessionToken()), new Function1() { // from class: fp.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f02;
                f02 = e0.f0(e0.this, renderState, (com.withpersona.sdk2.inquiry.internal.network.g) obj);
                return f02;
            }
        });
        return new u0(new y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 g0(InquiryWorkflow$Props renderProps, InquiryState.ResumeFallbackInquiry renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, null, 4067, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 h0(InquiryWorkflow$Props renderProps, final InquiryState.SelfieStepRunning renderState, Function0<Unit> backAction) {
        List d10;
        List<PoseInfo> list;
        List<NextStep.Selfie.SelfiePose> I = renderState.I();
        if (I == null || I.isEmpty()) {
            int i10 = c.f17569a[renderState.getSelfieType().ordinal()];
            if (i10 == 1) {
                d10 = kotlin.collections.o.d(in.a.f20965a);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new gt.l();
                }
                d10 = kotlin.collections.p.n(in.a.f20965a, in.a.b, in.a.f20966c);
            }
        } else {
            List<NextStep.Selfie.SelfiePose> I2 = renderState.I();
            d10 = new ArrayList(kotlin.collections.q.u(I2, 10));
            Iterator<T> it = I2.iterator();
            while (it.hasNext()) {
                d10.add(com.withpersona.sdk2.inquiry.selfie.i.c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        List<PoseInfo> J = renderState.J();
        if (J == null || J.isEmpty()) {
            Iterable<IndexedValue> S0 = CollectionsKt.S0(d10);
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(S0, 10));
            for (IndexedValue indexedValue : S0) {
                int index = indexedValue.getIndex();
                arrayList.add(new PoseInfo(index, (in.a) indexedValue.b(), index == kotlin.collections.p.m(d10), null));
            }
            list = arrayList;
        } else {
            list = renderState.J();
        }
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromComponent = renderState.getFromComponent();
        String fromStep = renderState.getFromStep();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        String fieldKeySelfie = renderState.getFieldKeySelfie();
        boolean requireStrictSelfieCapture = renderState.getRequireStrictSelfieCapture();
        boolean skipPromptPage = renderState.getSkipPromptPage();
        SelfieWorkflow.Input.Strings l10 = ep.a.l(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        SelfieType a10 = com.withpersona.sdk2.inquiry.selfie.m.a(renderState.getSelfieType());
        List<PoseInfo> J2 = renderState.J();
        Long poseTimeoutMs = renderState.getPoseTimeoutMs();
        String cameraPermissionsTitle = renderState.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnCancel();
        StepStyles.SelfieStepStyle styles = renderState.getStyles();
        NextStep.Selfie.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Selfie.AssetConfig(null, null, 3, null);
        }
        NextStep.Selfie.AssetConfig assetConfig2 = assetConfig;
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getPendingPageTextVerticalPosition();
        List<NextStep.Selfie.CaptureFileType> z10 = renderState.z();
        List<NextStep.Selfie.VideoCaptureMethod> U = renderState.U();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(U, 10));
        Iterator<T> it2 = U.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kn.a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, z10, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        PoseConfigs poseConfigs = renderState.getPoseConfigs();
        int i11 = c.b[renderState.getDesignVersion().ordinal()];
        wp.a designVersion = (i11 == 1 || i11 == 2) ? this.featureFlagManager.a(eo.y.f16125a) ? wp.a.b : wp.a.f34486a : renderState.getDesignVersion();
        String fileUploadUrl = renderState.getFileUploadUrl();
        String flowWatermarkText = renderState.getFlowWatermarkText();
        List<PoseInfo> J3 = renderState.J();
        SelfieWorkflow.Input input = new SelfieWorkflow.Input(sessionToken, inquiryId, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, l10, a10, list, J2, poseTimeoutMs, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, videoCaptureConfig, assetConfig2, pendingPageTextVerticalPosition, poseConfigs, designVersion, fileUploadUrl, flowWatermarkText, !(J3 == null || J3.isEmpty()), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(eo.w.f16121a)) {
            return new v0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11434a), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: fp.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i02;
                    i02 = e0.i0(e0.this, renderState, (SelfieWorkflow.b) obj);
                    return i02;
                }
            });
        }
        return new x0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11434a), this.selfieWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: fp.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j02;
                j02 = e0.j0(e0.this, renderState, (SelfieWorkflow.b) obj);
                return j02;
            }
        });
    }

    public final s0 k0(InquiryWorkflow$Props renderProps, InquiryState.ShowLoadingSpinner renderState, Function0<Unit> backAction) {
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        return new u0(new y.a(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction), renderState.getDidGoBack());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fp.s0 l0(com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props r32, com.withpersona.sdk2.inquiry.internal.InquiryState.UiStepRunning r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.e0.l0(com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props, com.withpersona.sdk2.inquiry.internal.InquiryState$UiStepRunning, kotlin.jvm.functions.Function0):fp.s0");
    }

    public final InquiryState.ShowLoadingSpinner p0(xo.m0 stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.y(), stepState.i(), null, stepState.g(), stepState.getStyles(), true, stepState.a(), 4, null);
    }

    public final void q0(final InquiryState renderState, tr.f<InquiryState> context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final TransitionStatus transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof TransitionStatus.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.transitionWorkerFactory.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, b().getValue().getShareToken(), b().getValue().f1(), renderState.getInquirySessionConfig(), ((TransitionStatus.Transitioning) transitionStatus).getTransitionData()), new Function1() { // from class: fp.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit s02;
                    s02 = e0.s0(e0.this, renderState, sessionToken, (TransitionWorker.b) obj);
                    return s02;
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.updateInquirySessionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), new Function1() { // from class: fp.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit t02;
                    t02 = e0.t0(e0.this, sessionToken, transitionStatus, (com.withpersona.sdk2.inquiry.internal.network.i) obj);
                    return t02;
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            TransitionStatus.CheckingForNextState checkingForNextState = (TransitionStatus.CheckingForNextState) transitionStatus;
            context.n(this.pollingWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, checkingForNextState.getPollingMode(), renderState.getInquirySessionConfig(), checkingForNextState.getCanReuseWorkflow()), new Function1() { // from class: fp.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit u02;
                    u02 = e0.u0(e0.this, transitionStatus, renderState, sessionToken, (k.c) obj);
                    return u02;
                }
            });
            return;
        }
        if (!Intrinsics.c(transitionStatus, TransitionStatus.TransitioningBack.f11434a)) {
            if (transitionStatus != null) {
                throw new gt.l();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            context.n(this.transitionBackWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, fromStep, renderState.getInquirySessionConfig()), new Function1() { // from class: fp.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit v02;
                    v02 = e0.v0(e0.this, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.network.h) obj);
                    return v02;
                }
            });
        }
    }

    public final void w0() {
        InquiryState i10 = d().i();
        if (i10 != null && (i10 instanceof InquiryState.UiStepRunning)) {
            InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) i10;
            this.uiStepSavedStateHelper.e(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName(), uiStepRunning.getComponents());
        }
    }

    public final void x0(String sessionToken, InternalErrorInfo error, String errorMessage) {
        if (errorMessage == null) {
            errorMessage = xo.t.b(error);
        }
        z0(new InquiryWorkflow$Output.Error(errorMessage, xo.t.a(error), error, sessionToken));
    }

    public void z0(@NotNull InquiryWorkflow$Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof InquiryWorkflow$Output.Cancel) {
            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) output;
            if (cancel.getRedirectUri() == null) {
                output = InquiryWorkflow$Output.Cancel.f(cancel, null, null, null, null, null, null, null, false, false, (String) this.savedStateHandle.b("redirect_uri"), FrameMetricsAggregator.EVERY_DURATION, null);
            }
        }
        super.e(output);
    }
}
