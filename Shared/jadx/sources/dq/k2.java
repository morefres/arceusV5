package dq;

import android.content.Context;
import aq.b;
import bq.a;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.e;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import fn.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rr.b;
import tr.TimerWorker;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002:\u0004¯\u0001°\u0001B\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020dH\u0002¢\u0006\u0004\be\u0010fJ9\u0010m\u001a\u00020\u0004\"\f\b\u0000\u0010h*\u00020\u0004*\u00020g*\b\u0012\u0004\u0012\u00020\u00040i2\u0006\u0010j\u001a\u00028\u00002\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020^H\u0002¢\u0006\u0004\bo\u0010`J\u0017\u0010q\u001a\u00020^2\u0006\u0010p\u001a\u00020\u0005H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020^2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u001d\u0010z\u001a\u00020^2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040iH\u0000¢\u0006\u0004\b~\u0010\u007fJ(\u0010\u0082\u0001\u001a\u00020^*\b\u0012\u0004\u0012\u00020\u00040i2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J9\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020^0\u0085\u0001j\u0003`\u0086\u0001*\b\u0012\u0004\u0012\u00020\u00040i2\t\b\u0002\u0010\u0084\u0001\u001a\u00020WH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006±\u0001"}, d2 = {"Ldq/k2;", "", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Laq/b$a;", "submitVerificationWorker", "Lrr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Ljn/a;", "cameraStatsManager", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lju/p0;", "coroutineScope", "Lbq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Leo/e;", "featureFlagManager", "Loq/c;", "sdkFilesManager", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Laq/b$a;Lrr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Ljn/a;Lsq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lju/p0;Lbq/a$b;Lcom/withpersona/sdk2/inquiry/selfie/g;Leo/e;Loq/c;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "renderState", "g1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "e2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "X1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "R2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "j2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "o2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "A1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "F1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "o1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "R1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "k3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "e1", "Lkn/a;", "j3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkn/a;", "", "i3", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "C2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "Ltr/f;", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "f1", "(Ltr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f3", "output", "h3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "g3", "(Ljava/lang/Throwable;)V", "props", "b1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "d1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "workflowContext", "Q1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Ltr/f;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lsr/a;", "webRtcManagerBridge", "c1", "(Ltr/f;Lsr/a;)V", "inRecoverableState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "Z0", "(Ltr/f;Z)Lkotlin/jvm/functions/Function1;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Laq/b$a;", "h", "Lrr/b$a;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "j", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "k", "Lcom/withpersona/sdk2/camera/e$a;", "l", "Lfn/c$a;", "m", "Ljn/a;", "n", "Lsq/a;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "p", "Lbq/a$b;", "q", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "r", "Leo/e;", "s", "Loq/c;", zl.t.f38095d, "Lsr/a;", "webRtcManager", "Lbq/a;", "u", "Lbq/a;", "selfiePoseManager", "v", "c", rl.d.f30696a, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k2 extends tr.c<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.b, SelfieWorkflow.c> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.l0 savedStateHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a submitVerificationWorker;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a webRtcWorkerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.b selfieAnalyzeWorker;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a permissionRequestWorkerFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a cameraXControllerFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a camera2ControllerFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.b selfiePoseManagerFactory;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final sr.a webRtcManager;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$1$1", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15275t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieState f15277v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelfieState selfieState, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f15277v = selfieState;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return k2.this.new a(this.f15277v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f15275t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            k2 k2Var = k2.this;
            k2Var.d1(k2Var.b().getValue(), this.f15277v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$2", f = "SelfieStepStateManager.kt", l = {173}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15278t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k2 f15280a;

            public a(k2 k2Var) {
                this.f15280a = k2Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.Input input, mt.b<? super Unit> bVar) {
                k2 k2Var = this.f15280a;
                SelfieState i10 = k2Var.d().i();
                if (i10 == null) {
                    return Unit.f22894a;
                }
                k2Var.d1(input, i10);
                return Unit.f22894a;
            }
        }

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return k2.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15278t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.c0<SelfieWorkflow.Input> b = k2.this.b();
                a aVar = new a(k2.this);
                this.f15278t = 1;
                if (b.collect(aVar, this) == e10) {
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ldq/k2$d;", "", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Ldq/k2;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Ldq/k2;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @NotNull
        k2 a(@NotNull SelfieWorkflow.Input initialProps, @NotNull android.view.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15281a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[in.a.values().length];
            try {
                iArr[in.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in.a.f20966c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in.a.f20967d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[in.a.f20968e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[in.a.f20965a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15281a = iArr;
            int[] iArr2 = new int[wp.x.values().length];
            try {
                iArr2[wp.x.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[wp.x.f34767c.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[wp.x.f34766a.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[wp.x.f34768d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[wp.x.f34769e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$1", f = "SelfieStepStateManager.kt", l = {MlKitException.CODE_SCANNER_CANCELLED}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15282t;

        public f(mt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15282t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = k2.this.applicationContext;
                this.f15282t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            sr.a aVar = k2.this.webRtcManager;
            if (aVar != null) {
                aVar.e();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$2", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15284t;

        public g(mt.b<? super g> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new g(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f15284t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            k2.this.i3();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderAcquireNextPose$1", f = "SelfieStepStateManager.kt", l = {270}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15286t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f15288v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, mt.b<? super h> bVar) {
            super(1, bVar);
            this.f15288v = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new h(this.f15288v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object e10 = nt.c.e();
            int i10 = this.f15286t;
            if (i10 == 0) {
                gt.o.b(obj);
                bq.a aVar = k2.this.selfiePoseManager;
                int i11 = this.f15288v;
                this.f15286t = 1;
                Object k10 = aVar.k(i11, this);
                if (k10 == e10) {
                    return e10;
                }
                obj2 = k10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                obj2 = ((gt.n) obj).getValue();
            }
            k2 k2Var = k2.this;
            if (gt.n.h(obj2)) {
                PoseInfo poseInfo = (PoseInfo) obj2;
                SelfieState i12 = k2Var.d().i();
                SelfieState.AcquireNextPose acquireNextPose = i12 instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) i12 : null;
                if (acquireNextPose != null) {
                    k2Var.d().p(k2Var.f1(k2Var.d(), SelfieState.AcquireNextPose.A(acquireNextPose, null, 0L, null, null, null, false, kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
                }
            }
            k2 k2Var2 = k2.this;
            Throwable e11 = gt.n.e(obj2);
            if (e11 != null) {
                k2Var2.g3(e11);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$1", f = "SelfieStepStateManager.kt", l = {1368, 1376}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f15289t;

        /* renamed from: u, reason: collision with root package name */
        public Object f15290u;

        /* renamed from: v, reason: collision with root package name */
        public int f15291v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieState.Capture f15292w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k2 f15293x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.Input f15294y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SelfieState.Capture capture, k2 k2Var, SelfieWorkflow.Input input, mt.b<? super i> bVar) {
            super(1, bVar);
            this.f15292w = capture;
            this.f15293x = k2Var;
            this.f15294y = input;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new i(this.f15292w, this.f15293x, this.f15294y, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dq.k2.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$3", f = "SelfieStepStateManager.kt", l = {1533}, m = "invokeSuspend")
    public static final class j extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15295t;

        public j(mt.b<? super j> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new j(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            SelfieState.Capture z10;
            Object e10 = nt.c.e();
            int i10 = this.f15295t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f15295t = 1;
                if (ju.z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            SelfieState i11 = k2.this.d().i();
            SelfieState.Capture capture = i11 instanceof SelfieState.Capture ? (SelfieState.Capture) i11 : null;
            if (capture == null) {
                return Unit.f22894a;
            }
            tr.f<SelfieState> d10 = k2.this.d();
            z10 = capture.z((r36 & 1) != 0 ? capture.selfieError : null, (r36 & 2) != 0 ? capture.poseScore : 0.0f, (r36 & 4) != 0 ? capture.brightnessInfo : null, (r36 & 8) != 0 ? capture.selfies : null, (r36 & 16) != 0 ? capture.posesNeeded : null, (r36 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture.autoCaptureSupported : false, (r36 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture.cameraProperties : null, (r36 & 512) != 0 ? capture.backState : null, (r36 & 1024) != 0 ? capture.poseConfigs : null, (r36 & 2048) != 0 ? capture.cameraFacingMode : null, (r36 & 4096) != 0 ? capture.isFlashEnabled : false, (r36 & 8192) != 0 ? capture.flashState : SelfieState.a.f12612d, (r36 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture.isDimLightConditions : false);
            d10.p(z10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$4", f = "SelfieStepStateManager.kt", l = {1545}, m = "invokeSuspend")
    public static final class k extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15297t;

        public k(mt.b<? super k> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new k(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            SelfieState.Capture z10;
            Object e10 = nt.c.e();
            int i10 = this.f15297t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f15297t = 1;
                if (ju.z0.b(3000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            SelfieState i11 = k2.this.d().i();
            SelfieState.Capture capture = i11 instanceof SelfieState.Capture ? (SelfieState.Capture) i11 : null;
            if (capture == null) {
                return Unit.f22894a;
            }
            tr.f<SelfieState> d10 = k2.this.d();
            z10 = capture.z((r36 & 1) != 0 ? capture.selfieError : null, (r36 & 2) != 0 ? capture.poseScore : 0.0f, (r36 & 4) != 0 ? capture.brightnessInfo : null, (r36 & 8) != 0 ? capture.selfies : null, (r36 & 16) != 0 ? capture.posesNeeded : null, (r36 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture.autoCaptureSupported : false, (r36 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture.cameraProperties : null, (r36 & 512) != 0 ? capture.backState : null, (r36 & 1024) != 0 ? capture.poseConfigs : null, (r36 & 2048) != 0 ? capture.cameraFacingMode : null, (r36 & 4096) != 0 ? capture.isFlashEnabled : false, (r36 & 8192) != 0 ? capture.flashState : SelfieState.a.b, (r36 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture.isDimLightConditions : false);
            d10.p(z10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2", f = "SelfieStepStateManager.kt", l = {1180}, m = "invokeSuspend")
    public static final class l extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f15299t;

        /* renamed from: u, reason: collision with root package name */
        public int f15300u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.Input f15301v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k2 f15302w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieState.CountdownToCapture f15303x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SelfieWorkflow.Input input, k2 k2Var, SelfieState.CountdownToCapture countdownToCapture, mt.b<? super l> bVar) {
            super(1, bVar);
            this.f15301v = input;
            this.f15302w = k2Var;
            this.f15303x = countdownToCapture;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new l(this.f15301v, this.f15302w, this.f15303x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            SelfieState.CountdownToCapture z10;
            Object e10 = nt.c.e();
            int i10 = this.f15300u;
            if (i10 == 0) {
                gt.o.b(obj);
                long a10 = com.withpersona.sdk2.inquiry.selfie.n.a(this.f15301v);
                this.f15299t = a10;
                this.f15300u = 1;
                if (ju.z0.b(a10, this) == e10) {
                    return e10;
                }
                j10 = a10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f15299t;
                gt.o.b(obj);
            }
            SelfieState i11 = this.f15302w.d().i();
            SelfieState.CountdownToCapture countdownToCapture = i11 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) i11 : null;
            if (countdownToCapture == null) {
                return Unit.f22894a;
            }
            int countDown = countdownToCapture.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                this.f15302w.d().p(new SelfieState.Capture(countdownToCapture.getSelfieError(), this.f15303x.getPoseScore(), this.f15303x.getBrightnessInfo(), null, countdownToCapture.g(), countdownToCapture.getStartCaptureTimestamp(), false, this.f15303x.getStartSelfieTimestamp(), countdownToCapture.getCameraProperties(), l2.a(this.f15302w.d(), false), this.f15301v.getPoseConfigs(), this.f15303x.getCameraFacingMode(), this.f15303x.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24648, null));
            } else {
                tr.f<SelfieState> d10 = this.f15302w.d();
                z10 = countdownToCapture.z((r34 & 1) != 0 ? countdownToCapture.countDown : countDown - 1, (r34 & 2) != 0 ? countdownToCapture.selfieError : countdownToCapture.getSelfieError(), (r34 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (r34 & 8) != 0 ? countdownToCapture.cameraProperties : null, (r34 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (r34 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (r34 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (r34 & 128) != 0 ? countdownToCapture.posesNeeded : null, (r34 & 256) != 0 ? countdownToCapture.selfies : null, (r34 & 512) != 0 ? countdownToCapture.backState : null, (r34 & 1024) != 0 ? countdownToCapture.poseConfigs : null, (r34 & 2048) != 0 ? countdownToCapture.autoCaptureSupported : false, (r34 & 4096) != 0 ? countdownToCapture.cameraFacingMode : null, (r34 & 8192) != 0 ? countdownToCapture.isFlashEnabled : false, (r34 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false);
                d10.p(z10);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToManualCapture$1", f = "SelfieStepStateManager.kt", l = {1275}, m = "invokeSuspend")
    public static final class m extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15304t;

        public m(mt.b<? super m> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new m(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            SelfieState.CountdownToManualCapture z10;
            Object e10 = nt.c.e();
            int i10 = this.f15304t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f15304t = 1;
                if (ju.z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            SelfieState i11 = k2.this.d().i();
            SelfieState.CountdownToManualCapture countdownToManualCapture = i11 instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) i11 : null;
            if (countdownToManualCapture == null) {
                return Unit.f22894a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                tr.f<SelfieState> d10 = k2.this.d();
                z10 = countdownToManualCapture.z((r29 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (r29 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (r29 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (r29 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (r29 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (r29 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (r29 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (r29 & 128) != 0 ? countdownToManualCapture.backState : null, (r29 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (r29 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (r29 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : false, (r29 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false);
                d10.p(z10);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderFinalizeVideoCapture$1", f = "SelfieStepStateManager.kt", l = {1995}, m = "invokeSuspend")
    public static final class n extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15306t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f15307u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ tr.f<SelfieState> f15308v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, tr.f<SelfieState> fVar, mt.b<? super n> bVar) {
            super(1, bVar);
            this.f15307u = finalizeLocalVideoCapture;
            this.f15308v = fVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new n(this.f15307u, this.f15308v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15306t;
            if (i10 == 0) {
                gt.o.b(obj);
                long minDurationMs = this.f15307u.getMinDurationMs();
                this.f15306t = 1;
                if (ju.z0.b(minDurationMs, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            SelfieState i11 = this.f15308v.i();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = i11 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) i11 : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22894a;
            }
            this.f15308v.p(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1", f = "SelfieStepStateManager.kt", l = {373}, m = "invokeSuspend")
    public static final class o extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15309t;

        public o(mt.b<? super o> bVar) {
            super(1, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return k2.this.new o(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f15309t;
            if (i10 == 0) {
                gt.o.b(obj);
                a.Companion companion = kotlin.time.a.INSTANCE;
                long p8 = kotlin.time.b.p(3, iu.b.f21121e);
                this.f15309t = 1;
                if (ju.z0.c(p8, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            SelfieState i11 = k2.this.d().i();
            SelfieState.ShowInstructions showInstructions = i11 instanceof SelfieState.ShowInstructions ? (SelfieState.ShowInstructions) i11 : null;
            if (showInstructions == null) {
                return Unit.f22894a;
            }
            k2.this.d().p(SelfieState.ShowInstructions.A(showInstructions, null, null, null, 3, null));
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$runManualCaptureEnabledChecker$1", f = "SelfieStepStateManager.kt", l = {2216}, m = "invokeSuspend")
    public static final class p extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f15311t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.y f15312u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k2 f15313v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.y yVar, k2 k2Var, mt.b<? super p> bVar) {
            super(1, bVar);
            this.f15312u = yVar;
            this.f15313v = k2Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new p(this.f15312u, this.f15313v, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r5.f15311t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                gt.o.b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                gt.o.b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f15312u
                boolean r6 = r6.f22979a
                if (r6 == 0) goto L53
                r5.f15311t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = ju.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                dq.k2 r6 = r5.f15313v
                tr.f r6 = r6.d()
                com.withpersona.sdk2.inquiry.workflows.WorkflowState r6 = r6.i()
                com.withpersona.sdk2.inquiry.selfie.SelfieState r6 = (com.withpersona.sdk2.inquiry.selfie.SelfieState) r6
                boolean r1 = r6 instanceof com.withpersona.sdk2.inquiry.selfie.b
                if (r1 == 0) goto L1a
                r1 = r6
                com.withpersona.sdk2.inquiry.selfie.b r1 = (com.withpersona.sdk2.inquiry.selfie.b) r1
                boolean r1 = r1.o()
                if (r1 == 0) goto L1a
                dq.k2 r1 = r5.f15313v
                tr.f r1 = r1.d()
                r1.p(r6)
                kotlin.jvm.internal.y r6 = r5.f15312u
                r1 = 0
                r6.f22979a = r1
                goto L1a
            L53:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dq.k2.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(@NotNull SelfieWorkflow.Input initialProps, @NotNull android.view.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull b.a submitVerificationWorker, @NotNull b.a webRtcWorkerFactory, @NotNull e.b selfieAnalyzeWorker, @NotNull e.a permissionRequestWorkerFactory, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull jn.a cameraStatsManager, @NotNull sq.a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull final ju.p0 coroutineScope, @NotNull a.b selfiePoseManagerFactory, @NotNull com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger, @NotNull eo.e featureFlagManager, @NotNull oq.c sdkFilesManager) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(selfiePoseManagerFactory, "selfiePoseManagerFactory");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManagerFactory = selfiePoseManagerFactory;
        this.selfieEventLogger = selfieEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.sdkFilesManager = sdkFilesManager;
        this.webRtcManager = sr.c.b();
        this.selfiePoseManager = selfiePoseManagerFactory.a(b().getValue().getInquiryId(), b().getValue().getSessionToken(), b().getValue().getFromStep(), b().getValue().C(), b().getValue().getPoseTimeoutMs());
        selfieEventLogger.o(b().getValue().getUsePerPoseReveal());
        if (d().i() == null) {
            d().p(b1(b().getValue()));
        }
        d().o(new Function1() { // from class: dq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Q0;
                Q0 = k2.Q0(ju.p0.this, this, (SelfieState) obj);
                return Q0;
            }
        });
        ju.k.d(coroutineScope, ju.g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit B1(k2 k2Var, SelfieState.CountdownToCapture countdownToCapture, SelfieWorkflow.Input input, e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        SelfieState i10 = k2Var.d().i();
        SelfieState.CountdownToCapture countdownToCapture2 = i10 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) i10 : null;
        if (countdownToCapture2 == null) {
            return Unit.f22894a;
        }
        if (!(output instanceof e.c.a)) {
            if (output instanceof e.c.b) {
                k2Var.g3(((e.c.b) output).getError());
            } else {
                if (!(output instanceof e.c.C0245c)) {
                    throw new gt.l();
                }
                k2Var.d().p(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.g(), null, countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((e.c.C0245c) output).getIsDimLightConditions(), 163, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit B2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit C1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit D1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit D2(k2 k2Var, boolean z10, b.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof b.d.C0067b) {
            k2Var.h3(SelfieWorkflow.b.d.f12689a);
        } else {
            if (!(it instanceof b.d.Error)) {
                throw new gt.l();
            }
            SelfieState i10 = k2Var.d().i();
            SelfieState.Submit submit = i10 instanceof SelfieState.Submit ? (SelfieState.Submit) i10 : null;
            if (submit == null) {
                return Unit.f22894a;
            }
            if (z10) {
                b.d.Error error = (b.d.Error) it;
                if (com.withpersona.sdk2.inquiry.selfie.p.B(error.getCause())) {
                    k2Var.d().p(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
                }
            }
            k2Var.h3(new SelfieWorkflow.b.Error(((b.d.Error) it).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit E1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit E2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit F2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit G1(PoseInfo poseInfo, in.a aVar, k2 k2Var, SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), countdownToManualCapture, new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22894a;
    }

    public static final Unit G2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit H1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22894a;
    }

    public static final Unit H2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit I1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit I2(k2 k2Var) {
        SelfieState i10 = k2Var.d().i();
        SelfieState.Submit submit = i10 instanceof SelfieState.Submit ? (SelfieState.Submit) i10 : null;
        if (submit == null) {
            return Unit.f22894a;
        }
        k2Var.d().p(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f22894a;
    }

    public static final Unit J1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit K1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit K2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, long j10, CameraProperties cameraProperties) {
        tr.f<SelfieState> fVar;
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        k2Var.selfieEventLogger.n();
        if (k2Var.j3(input) == kn.a.f22871a) {
            k2Var.selfieEventLogger.k();
            k2Var.d().p(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, l2.a(k2Var.d(), false), waitForCameraFeed.g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            k2Var.selfieEventLogger.b(k2Var.d().i());
            in.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.g())).getPose();
            tr.f<SelfieState> d10 = k2Var.d();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, kotlin.collections.p.k(), l2.a(k2Var.d(), false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.g(), input.getPoseConfigs(), true);
                fVar = d10;
            } else if (pose == in.a.f20965a) {
                fVar = d10;
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.g(), null, System.currentTimeMillis(), false, j10, cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                fVar = d10;
                showPoseHint = new SelfieState.ShowPoseHint(kotlin.collections.p.k(), waitForCameraFeed.g(), true, cameraProperties, j10, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            fVar.p(showPoseHint);
        }
        return Unit.f22894a;
    }

    public static final Unit L1(tr.f fVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.a.f12465c));
        WorkflowState i10 = fVar.i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = i10 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) i10 : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f22894a;
        }
        fVar.p(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, CollectionsKt.w0(finalizeLocalVideoCapture.w(), arrayList), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f22894a;
    }

    public static final Unit L2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a1(k2Var, k2Var.d(), false, 1, null).invoke(it);
        return Unit.f22894a;
    }

    public static final Unit M1(tr.f fVar, SelfieWorkflow.Input input, SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        WorkflowState i10 = fVar.i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = i10 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) i10 : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            fVar.p(l2.e(fVar, input.getPoseConfigs(), finalizeLocalVideoCapture2.w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), l2.a(fVar, false)));
            return Unit.f22894a;
        }
        return Unit.f22894a;
    }

    public static final Unit M2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit N1(k2 k2Var, tr.f fVar) {
        k2Var.c1(fVar, null);
        return Unit.f22894a;
    }

    public static final Unit N2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit O1(k2 k2Var) {
        k2Var.e(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit O2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit P1(k2 k2Var, tr.f fVar, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, fVar, input, true);
        return Unit.f22894a;
    }

    public static final Unit P2(k2 k2Var, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == pp.j1.f28919a) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(SelfieWorkflow.b.a.f12686a);
        } else if (it.getPermissionState().getResult() == pp.j1.f28920c) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else {
            k2Var.h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22894a;
    }

    public static final Unit Q0(ju.p0 p0Var, k2 k2Var, SelfieState selfieState) {
        if (selfieState == null) {
            return Unit.f22894a;
        }
        ju.k.d(p0Var, ju.g1.d(), null, k2Var.new a(selfieState, null), 2, null);
        return Unit.f22894a;
    }

    public static final Unit Q2(k2 k2Var, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == pp.j1.f28919a) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(SelfieWorkflow.b.a.f12686a);
        } else if (it.getPermissionState().getResult() == pp.j1.f28920c) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else {
            k2Var.h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22894a;
    }

    public static final Unit S1(k2 k2Var, SelfieWorkflow.Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.selfieEventLogger.m(input.getFromStep());
        k2Var.d().p(new SelfieState.WebRtcFinished(finalizeWebRtc.w(), it, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), finalizeWebRtc.getCameraFacingMode()));
        k2Var.webRtcManager.e();
        return Unit.f22894a;
    }

    public static final Unit S2(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final k2 k2Var, final SelfieWorkflow.Input input, b.AbstractC0542b it) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof b.AbstractC0542b.C0543b) {
            CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
            sr.a aVar = k2Var.webRtcManager;
            if (aVar != null) {
                aVar.c(k2Var.webRtcWorkerFactory.getService());
            }
            sr.a aVar2 = k2Var.webRtcManager;
            if (aVar2 != null) {
                aVar2.i(k2Var.applicationContext);
            }
            int width = cameraProperties.getSize().getWidth();
            int height = cameraProperties.getSize().getHeight();
            if (cameraProperties.getRotation() == 90 || cameraProperties.getRotation() == 270) {
                i10 = width;
                i11 = height;
            } else {
                i11 = width;
                i10 = height;
            }
            sr.a aVar3 = k2Var.webRtcManager;
            if (aVar3 != null) {
                b.AbstractC0542b.C0543b c0543b = (b.AbstractC0542b.C0543b) it;
                aVar3.f(c0543b.getResult().getUsername(), c0543b.getResult().getCredential(), c0543b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: dq.e2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit T2;
                        T2 = k2.T2(k2.this, input, waitForWebRtcSetup);
                        return T2;
                    }
                }, new Function0() { // from class: dq.f2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit U2;
                        U2 = k2.U2(k2.this, waitForWebRtcSetup);
                        return U2;
                    }
                }, new Function0() { // from class: dq.g2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit V2;
                        V2 = k2.V2(k2.this, input);
                        return V2;
                    }
                }, new Function1() { // from class: dq.h2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit W2;
                        W2 = k2.W2(k2.this, (String) obj);
                        return W2;
                    }
                });
            }
        } else {
            if (!(it instanceof b.AbstractC0542b.Error)) {
                throw new gt.l();
            }
            sr.a aVar4 = k2Var.webRtcManager;
            if (aVar4 != null) {
                aVar4.a();
            }
            k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        }
        return Unit.f22894a;
    }

    public static final Unit T1() {
        return Unit.f22894a;
    }

    public static final Unit T2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.selfieEventLogger.l(input.getFromStep());
        k2Var.selfieEventLogger.b(k2Var.d().i());
        k2Var.d().p(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit U1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit U2(k2 k2Var, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.webRtcManager.a();
        k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22894a;
    }

    public static final Unit V1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit V2(k2 k2Var, SelfieWorkflow.Input input) {
        k2Var.selfieEventLogger.j(input.getFromStep());
        return Unit.f22894a;
    }

    public static final Unit W1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit W2(k2 k2Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        k2Var.selfieEventLogger.i(step);
        return Unit.f22894a;
    }

    public static final Unit X2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit Y0(tr.f fVar, k2 k2Var, boolean z10, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        SelfieState selfieState = (SelfieState) fVar.i();
        if (selfieState == null) {
            return Unit.f22894a;
        }
        if (!(cameraError instanceof dn.h)) {
            k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f22894a;
        }
        dn.h hVar = (dn.h) cameraError;
        if (!(hVar instanceof dn.h0)) {
            if (hVar instanceof dn.i0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (hVar instanceof dn.d0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else if (hVar instanceof dn.m0) {
                if (z10) {
                    l2.c(selfieState);
                    if (com.withpersona.sdk2.inquiry.selfie.p.H(selfieState)) {
                        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                }
            } else if (hVar instanceof dn.v) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
            } else if (hVar instanceof dn.v0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            } else {
                if (!(hVar instanceof dn.l0)) {
                    throw new gt.l();
                }
                if (z10) {
                    l2.c(selfieState);
                    if (com.withpersona.sdk2.inquiry.selfie.p.H(selfieState)) {
                        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                }
            }
        }
        return Unit.f22894a;
    }

    public static final Unit Y1(k2 k2Var, SelfieWorkflow.Input input, SelfieState.RestartCamera restartCamera) {
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit Y2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit Z2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static /* synthetic */ Function1 a1(k2 k2Var, tr.f fVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k2Var.Z0(fVar, z10);
    }

    public static final Unit a2(k2 k2Var, SelfieState.ReviewCaptures reviewCaptures) {
        SelfieState i10 = k2Var.d().i();
        SelfieState.ReviewCaptures reviewCaptures2 = i10 instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) i10 : null;
        if (reviewCaptures2 == null) {
            return Unit.f22894a;
        }
        k2Var.d().p(new SelfieState.Submit(reviewCaptures2.w(), reviewCaptures2.getWebRtcObjectId(), reviewCaptures2.getCameraProperties(), reviewCaptures2.getStartSelfieTimestamp(), l2.a(k2Var.d(), true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f22894a;
    }

    public static final Unit b2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.ReviewCaptures reviewCaptures) {
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit b3(k2 k2Var, SelfieState.WebRtcFinished webRtcFinished) {
        k2Var.d().p(l2.e(k2Var.d(), k2Var.b().getValue().getPoseConfigs(), webRtcFinished.w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), l2.a(k2Var.d(), false)));
        return Unit.f22894a;
    }

    public static final Unit c2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit c3(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit d2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit d3(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit e3(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit f2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit g2(k2 k2Var, SelfieState.ShowInstructions showInstructions) {
        k2Var.f(SelfieState.ShowInstructions.A(showInstructions, null, null, null, 3, null));
        return Unit.f22894a;
    }

    public static final Unit h1(in.a pose, boolean z10) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        return Unit.f22894a;
    }

    public static final Unit h2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.ShowInstructions showInstructions) {
        k2Var.selfieEventLogger.c();
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.b(k2Var.d(), false, 1, null), input.A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit i1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SelfieState i10 = k2Var.d().i();
        SelfieState.AcquireNextPose acquireNextPose = i10 instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) i10 : null;
        if (acquireNextPose == null) {
            return Unit.f22894a;
        }
        l2.c(acquireNextPose);
        k2Var.d().p(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), kotlin.collections.p.k(), l2.a(k2Var.d(), false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), kotlin.collections.p.k(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f22894a;
    }

    public static final Unit i2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit j1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit k1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit k2(k2 k2Var, SelfieState.ShowPoseHint showPoseHint, SelfieWorkflow.Input input) {
        tr.f<SelfieState> d10 = k2Var.d();
        List<PoseInfo> g10 = showPoseHint.g();
        d10.p(new SelfieState.Capture(null, 0.0f, null, showPoseHint.w(), g10, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, k2Var.b().getValue().getUsePerPoseReveal() ? Long.valueOf(System.currentTimeMillis() + k2Var.selfiePoseManager.getPerPoseTimeoutMs()) : null, false, 8193, null));
        return Unit.f22894a;
    }

    public static final Unit l1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit l2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit m1(k2 k2Var, CameraProperties.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), it, 3, null));
        return Unit.f22894a;
    }

    public static final Unit m2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit n1(boolean z10) {
        return Unit.f22894a;
    }

    public static final Unit n2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit p1(k2 k2Var, SelfieState.Capture capture, e.c output) {
        SelfieState.Capture z10;
        SelfieState.Capture z11;
        SelfieState.Capture z12;
        Intrinsics.checkNotNullParameter(output, "output");
        SelfieState i10 = k2Var.d().i();
        SelfieState.Capture capture2 = i10 instanceof SelfieState.Capture ? (SelfieState.Capture) i10 : null;
        if (capture2 == null) {
            return Unit.f22894a;
        }
        if (output instanceof e.c.a) {
            e.c.a aVar = (e.c.a) output;
            if (aVar.getSelfie() != null) {
                Selfie selfie = aVar.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                k2Var.selfieEventLogger.g(capture2, selfie);
                k2Var.d().p(k2Var.f1(k2Var.d(), capture, selfie));
            } else {
                tr.f<SelfieState> d10 = k2Var.d();
                z12 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : null, (r36 & 2) != 0 ? capture2.poseScore : 0.0f, (r36 & 4) != 0 ? capture2.brightnessInfo : null, (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : SelfieState.a.f12611c, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : false);
                d10.p(z12);
            }
        } else if (output instanceof e.c.C0245c) {
            e.c.C0245c c0245c = (e.c.C0245c) output;
            if (c0245c.getError() == in.b.f20977h) {
                tr.f<SelfieState> d11 = k2Var.d();
                z11 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : null, (r36 & 2) != 0 ? capture2.poseScore : c0245c.getPoseScore(), (r36 & 4) != 0 ? capture2.brightnessInfo : c0245c.getBrightnessInfo(), (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : null, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : c0245c.getIsDimLightConditions());
                d11.p(z11);
            } else {
                tr.f<SelfieState> d12 = k2Var.d();
                z10 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : c0245c.getError(), (r36 & 2) != 0 ? capture2.poseScore : c0245c.getPoseScore(), (r36 & 4) != 0 ? capture2.brightnessInfo : c0245c.getBrightnessInfo(), (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : null, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : c0245c.getIsDimLightConditions());
                d12.p(z10);
            }
        } else {
            if (!(output instanceof e.c.b)) {
                throw new gt.l();
            }
            k2Var.g3(((e.c.b) output).getError());
        }
        return Unit.f22894a;
    }

    public static final Unit p2(k2 k2Var, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input, e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        SelfieState i10 = k2Var.d().i();
        SelfieState.StartCapture startCapture2 = i10 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) i10 : null;
        if (startCapture2 == null) {
            return Unit.f22894a;
        }
        if (output instanceof e.c.a) {
            e.c.a aVar = (e.c.a) output;
            k2Var.d().p(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar.getPoseScore(), aVar.getBrightnessInfo(), startCapture.g(), startCapture.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar.getIsDimLightConditions()));
        } else if (output instanceof e.c.b) {
            k2Var.g3(((e.c.b) output).getError());
        } else {
            if (!(output instanceof e.c.C0245c)) {
                throw new gt.l();
            }
            e.c.C0245c c0245c = (e.c.C0245c) output;
            k2Var.d().p(c0245c.getError() == in.b.f20977h ? startCapture2.z((r34 & 1) != 0 ? startCapture2.centered : false, (r34 & 2) != 0 ? startCapture2.selfieError : null, (r34 & 4) != 0 ? startCapture2.poseScore : c0245c.getPoseScore(), (r34 & 8) != 0 ? startCapture2.brightnessInfo : c0245c.getBrightnessInfo(), (r34 & 16) != 0 ? startCapture2.posesNeeded : null, (r34 & 32) != 0 ? startCapture2.selfies : null, (r34 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (r34 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? startCapture2.cameraProperties : null, (r34 & 1024) != 0 ? startCapture2.backState : null, (r34 & 2048) != 0 ? startCapture2.poseConfigs : null, (r34 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (r34 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (r34 & 16384) != 0 ? startCapture2.isDimLightConditions : c0245c.getIsDimLightConditions()) : startCapture2.z((r34 & 1) != 0 ? startCapture2.centered : false, (r34 & 2) != 0 ? startCapture2.selfieError : c0245c.getError(), (r34 & 4) != 0 ? startCapture2.poseScore : c0245c.getPoseScore(), (r34 & 8) != 0 ? startCapture2.brightnessInfo : c0245c.getBrightnessInfo(), (r34 & 16) != 0 ? startCapture2.posesNeeded : null, (r34 & 32) != 0 ? startCapture2.selfies : null, (r34 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (r34 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? startCapture2.cameraProperties : null, (r34 & 1024) != 0 ? startCapture2.backState : null, (r34 & 2048) != 0 ? startCapture2.poseConfigs : null, (r34 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (r34 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (r34 & 16384) != 0 ? startCapture2.isDimLightConditions : c0245c.getIsDimLightConditions()));
        }
        return Unit.f22894a;
    }

    public static final Unit q1(PoseInfo poseInfo, in.a aVar, k2 k2Var, SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), capture, new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22894a;
    }

    public static final Unit q2(k2 k2Var, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input) {
        SelfieState i10 = k2Var.d().i();
        SelfieState.StartCapture startCapture2 = i10 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) i10 : null;
        if (startCapture2 == null) {
            return Unit.f22894a;
        }
        k2Var.d().p(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        k2Var.selfieEventLogger.d(startCapture2);
        return Unit.f22894a;
    }

    public static final Unit r1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22894a;
    }

    public static final Unit r2(PoseInfo poseInfo, k2 k2Var, SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), startCapture, new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, poseInfo.getPose(), System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22894a;
    }

    public static final Unit s1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit s2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22894a;
    }

    public static final Unit t1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit t2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit u1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit u2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit v2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit w1(k2 k2Var) {
        SelfieState i10 = k2Var.d().i();
        SelfieState.CaptureTransition captureTransition = i10 instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) i10 : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            k2Var.d().p(nextState);
        }
        return Unit.f22894a;
    }

    public static final Unit x1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit x2(k2 k2Var, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, SelfieWorkflow.Input input, e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof e.c.a)) {
            if (output instanceof e.c.b) {
                k2Var.g3(((e.c.b) output).getError());
            } else {
                if (!(output instanceof e.c.C0245c)) {
                    throw new gt.l();
                }
                tr.f<SelfieState> d10 = k2Var.d();
                e.c.C0245c c0245c = (e.c.C0245c) output;
                in.b error = c0245c.getError();
                List<PoseInfo> g10 = startCaptureFaceDetected.g();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                d10.p(new SelfieState.StartCapture(false, error, c0245c.getPoseScore(), c0245c.getBrightnessInfo(), g10, null, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0245c.getIsDimLightConditions(), 161, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit y1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit y2(k2 k2Var, SelfieWorkflow.Input input, Unit it) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(it, "it");
        SelfieState i10 = k2Var.d().i();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = i10 instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) i10 : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f22894a;
        }
        k2Var.selfieEventLogger.a(startCaptureFaceDetected);
        boolean z10 = input.getDesignVersion() == wp.a.f34487c && startCaptureFaceDetected.j() == in.a.f20965a;
        tr.f<SelfieState> d10 = k2Var.d();
        if (z10) {
            List<PoseInfo> g10 = startCaptureFaceDetected.g();
            List<Selfie> w5 = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), w5, g10, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.g(), startCaptureFaceDetected.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        d10.p(countdownToCapture);
        return Unit.f22894a;
    }

    public static final Unit z1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22894a;
    }

    public static final Unit z2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22894a;
    }

    public final SelfieWorkflow.c A1(final SelfieWorkflow.Input renderProps, final SelfieState.CountdownToCapture renderState) {
        SelfieWorkflow.c g10;
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: dq.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit B1;
                    B1 = k2.B1(k2.this, renderState, renderProps, (e.c) obj);
                    return B1;
                }
            });
        }
        d().m("countdown_" + renderState.getCountDown(), new l(renderProps, this, renderState, null));
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = b10 == null ? renderProps.getStrings().getSelfieHintCenterFace() : b10;
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0240c.b.C0241b c0241b = new SelfieWorkflow.c.C0240c.b.C0241b(renderState.getCountDown(), SelfieWorkflow.c.C0240c.EnumC0243c.b, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        kn.a j32 = j3(renderProps);
        sr.a aVar = this.webRtcManager;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintCenterFace, b10, renderState.getAutoCaptureSupported(), c0241b, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: dq.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit C1;
                C1 = k2.C1(k2.this);
                return C1;
            }
        }, new Function0() { // from class: dq.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit D1;
                D1 = k2.D1(k2.this);
                return D1;
            }
        }, a12, new Function0() { // from class: dq.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit E1;
                E1 = k2.E1(k2.this, renderProps);
                return E1;
            }
        }, j32, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c C2(SelfieWorkflow.Input renderProps, SelfieState.Submit renderState) {
        final boolean z10 = renderProps.getDesignVersion() == wp.a.f34487c;
        if (renderState.getRecoverableSubmitError() == null) {
            d().n(this.submitVerificationWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.w(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp(), renderProps.getFileUploadUrl(), this.selfiePoseManager), new Function1() { // from class: dq.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit D2;
                    D2 = k2.D2(k2.this, z10, (b.d) obj);
                    return D2;
                }
            });
        }
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        if (customPendingPage != null && renderState.getRecoverableSubmitError() == null) {
            return new SelfieWorkflow.c.d(yq.b.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: dq.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit E2;
                    E2 = k2.E2(k2.this);
                    return E2;
                }
            }, new Function0() { // from class: dq.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F2;
                    F2 = k2.F2(k2.this);
                    return F2;
                }
            }, renderProps.getStrings().getPendingPageNavBarTitle());
        }
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        oq.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState b10 = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: dq.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit G2;
                G2 = k2.G2(k2.this);
                return G2;
            }
        };
        Function0 function02 = new Function0() { // from class: dq.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H2;
                H2 = k2.H2(k2.this);
                return H2;
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.c.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, b10, function0, function02, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), com.withpersona.sdk2.inquiry.selfie.p.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: dq.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit I2;
                I2 = k2.I2(k2.this);
                return I2;
            }
        });
    }

    public final SelfieWorkflow.c F1(final SelfieWorkflow.Input renderProps, SelfieState.CountdownToManualCapture renderState) {
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c;
        final SelfieState.CountdownToManualCapture countdownToManualCapture;
        SelfieWorkflow.c.C0240c.b c0241b;
        SelfieWorkflow.c g10;
        final PoseInfo p8 = renderState.p();
        final in.a pose = p8.getPose();
        int i10 = e.f15281a[pose.ordinal()];
        if (i10 == 1) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12809e;
        } else if (i10 == 2) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12812h;
        } else if (i10 == 3) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12815k;
        } else if (i10 == 4) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12818n;
        } else {
            if (i10 != 5) {
                throw new gt.l();
            }
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.b;
        }
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c2 = enumC0243c;
        d().m("countdown_to_manual_capture_" + renderState.getCountDown(), new m(null));
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = b10 == null ? renderProps.getStrings().getSelfieHintCenterFace() : b10;
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            c0241b = new SelfieWorkflow.c.C0240c.b.d(new Function1() { // from class: dq.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit G1;
                    G1 = k2.G1(PoseInfo.this, pose, this, countdownToManualCapture, (String) obj);
                    return G1;
                }
            }, new Function1() { // from class: dq.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit H1;
                    H1 = k2.H1(k2.this, (Throwable) obj);
                    return H1;
                }
            }, true, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        } else {
            countdownToManualCapture = renderState;
            c0241b = new SelfieWorkflow.c.C0240c.b.C0241b(countdownToManualCapture.getCountDown(), enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        }
        SelfieWorkflow.c.C0240c.b bVar = c0241b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        kn.a j32 = j3(renderProps);
        sr.a aVar = this.webRtcManager;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, countdownToManualCapture.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintCenterFace, b10, countdownToManualCapture.getAutoCaptureSupported(), bVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: dq.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit I1;
                I1 = k2.I1(k2.this);
                return I1;
            }
        }, new Function0() { // from class: dq.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit J1;
                J1 = k2.J1(k2.this);
                return J1;
            }
        }, a12, new Function0() { // from class: dq.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K1;
                K1 = k2.K1(k2.this, renderProps);
                return K1;
            }
        }, j32, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), countdownToManualCapture.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c J2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForCameraFeed renderState) {
        SelfieWorkflow.c g10;
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, pp.i0.f28911a)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && e1(renderProps) && hq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, pp.i0.b);
        final long currentTimeMillis = System.currentTimeMillis();
        tr.f<SelfieState> d10 = d();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.g());
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (r61 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0240c.b.g(new Function1() { // from class: dq.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit K2;
                K2 = k2.K2(k2.this, renderProps, renderState, currentTimeMillis, (CameraProperties) obj);
                return K2;
            }
        }, SelfieWorkflow.c.C0240c.EnumC0243c.f12806a, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), j3(renderProps) == kn.a.b, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: dq.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L2;
                L2 = k2.L2(k2.this, (Throwable) obj);
                return L2;
            }
        }), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: dq.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit M2;
                M2 = k2.M2(k2.this);
                return M2;
            }
        }, new Function0() { // from class: dq.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit N2;
                N2 = k2.N2(k2.this);
                return N2;
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: dq.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit O2;
                O2 = k2.O2(k2.this, renderProps);
                return O2;
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : z10 || z11, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        if (z10) {
            tr.f<SelfieState> d11 = d();
            e.a aVar = this.permissionRequestWorkerFactory;
            pp.i0 i0Var = pp.i0.f28911a;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle == null ? "" : cameraPermissionsTitle;
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(tp.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            String str2 = cameraPermissionsRationale;
            Context context = this.applicationContext;
            String string = context.getString(tp.g.G, hq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            d11.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, false, str, str2, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: dq.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit P2;
                    P2 = k2.P2(k2.this, renderState, renderProps, (e.b) obj);
                    return P2;
                }
            });
            return g10;
        }
        if (z11) {
            tr.f<SelfieState> d12 = d();
            e.a aVar2 = this.permissionRequestWorkerFactory;
            pp.i0 i0Var2 = pp.i0.b;
            String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
            if (microphonePermissionsRationale == null) {
                microphonePermissionsRationale = this.applicationContext.getString(tp.g.S);
                Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
            }
            String str3 = microphonePermissionsRationale;
            Context context2 = this.applicationContext;
            String string2 = context2.getString(tp.g.R, hq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
            String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
            String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
            d12.n(aVar2.a(new PermissionRequestWorkflow.Props(i0Var2, false, microphonePermissionsTitle == null ? "" : microphonePermissionsTitle, str3, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: dq.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q2;
                    Q2 = k2.Q2(k2.this, renderState, renderProps, (e.b) obj);
                    return Q2;
                }
            });
        }
        return g10;
    }

    @NotNull
    public final SelfieWorkflow.c Q1(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final tr.f<SelfieState> workflowContext) {
        SelfieWorkflow.c g10;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        workflowContext.m("finalize_delay", new n(renderState, workflowContext, null));
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, workflowContext, null, null, (r61 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0240c.b.C0242c(new Function1() { // from class: dq.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L1;
                L1 = k2.L1(tr.f.this, (File) obj);
                return L1;
            }
        }, new Function0() { // from class: dq.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit M1;
                M1 = k2.M1(tr.f.this, renderProps, renderState);
                return M1;
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.c.C0240c.EnumC0243c.f12822r : SelfieWorkflow.c.C0240c.EnumC0243c.f12820p, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: dq.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit N1;
                N1 = k2.N1(k2.this, workflowContext);
                return N1;
            }
        }, new Function0() { // from class: dq.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit O1;
                O1 = k2.O1(k2.this);
                return O1;
            }
        }, Z0(workflowContext, false), new Function0() { // from class: dq.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit P1;
                P1 = k2.P1(k2.this, workflowContext, renderProps);
                return P1;
            }
        }, kn.a.b, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c R1(final SelfieWorkflow.Input renderProps, SelfieState.FinalizeWebRtc renderState) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        SelfieWorkflow.c g10;
        sr.a aVar = this.webRtcManager;
        if (aVar != null) {
            finalizeWebRtc = renderState;
            aVar.g(renderProps.getFromStep(), new Function1() { // from class: dq.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit S1;
                    S1 = k2.S1(k2.this, renderProps, finalizeWebRtc, (String) obj);
                    return S1;
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d(), null, renderProps.getStrings().getCapturePageTitle(), (r61 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0240c.b.h(new Function0() { // from class: dq.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit T1;
                T1 = k2.T1();
                return T1;
            }
        }, false, SelfieWorkflow.c.C0240c.EnumC0243c.f12820p, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: dq.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit U1;
                U1 = k2.U1(k2.this);
                return U1;
            }
        }, new Function0() { // from class: dq.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit V1;
                V1 = k2.V1(k2.this);
                return V1;
            }
        }, Z0(d(), false), new Function0() { // from class: dq.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit W1;
                W1 = k2.W1(k2.this, renderProps);
                return W1;
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c R2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForWebRtcSetup renderState) {
        SelfieWorkflow.c g10;
        d().n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: dq.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit S2;
                S2 = k2.S2(SelfieState.WaitForWebRtcSetup.this, this, renderProps, (b.AbstractC0542b) obj);
                return S2;
            }
        });
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0240c.b.i iVar = new SelfieWorkflow.c.C0240c.b.i(SelfieWorkflow.c.C0240c.EnumC0243c.f12806a, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        kn.a j32 = j3(renderProps);
        sr.a aVar = this.webRtcManager;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, iVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, b10, new Function0() { // from class: dq.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit X2;
                X2 = k2.X2(k2.this);
                return X2;
            }
        }, new Function0() { // from class: dq.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Y2;
                Y2 = k2.Y2(k2.this);
                return Y2;
            }
        }, a12, new Function0() { // from class: dq.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Z2;
                Z2 = k2.Z2(k2.this, renderProps);
                return Z2;
            }
        }, j32, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c X1(final SelfieWorkflow.Input renderProps, final SelfieState.RestartCamera renderState) {
        sr.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
        return new SelfieWorkflow.c.e(new Function0() { // from class: dq.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Y1;
                Y1 = k2.Y1(k2.this, renderProps, renderState);
                return Y1;
            }
        });
    }

    @NotNull
    public final Function1<Throwable, Unit> Z0(@NotNull final tr.f<SelfieState> fVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Function1() { // from class: dq.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y0;
                Y0 = k2.Y0(tr.f.this, this, z10, (Throwable) obj);
                return Y0;
            }
        };
    }

    public final SelfieWorkflow.c Z1(final SelfieWorkflow.Input renderProps, final SelfieState.ReviewCaptures renderState) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(tp.g.Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(tp.g.I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(tp.g.M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(tp.g.N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(tp.g.O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(tp.g.P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(tp.g.L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(tp.g.K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(tp.g.J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new SelfieWorkflow.c.f(new SelfieWorkflow.c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.z(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: dq.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit a22;
                a22 = k2.a2(k2.this, renderState);
                return a22;
            }
        }, new Function0() { // from class: dq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b22;
                b22 = k2.b2(k2.this, renderProps, renderState);
                return b22;
            }
        }, new Function0() { // from class: dq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c22;
                c22 = k2.c2(k2.this);
                return c22;
            }
        }, new Function0() { // from class: dq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit d22;
                d22 = k2.d2(k2.this);
                return d22;
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    public final SelfieWorkflow.c a3(final SelfieWorkflow.Input renderProps, final SelfieState.WebRtcFinished renderState) {
        SelfieWorkflow.c g10;
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0240c.b.h hVar = new SelfieWorkflow.c.C0240c.b.h(new Function0() { // from class: dq.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit b32;
                b32 = k2.b3(k2.this, renderState);
                return b32;
            }
        }, false, SelfieWorkflow.c.C0240c.EnumC0243c.f12822r, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        sr.a aVar = this.webRtcManager;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, null, capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, hVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, b10, new Function0() { // from class: dq.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c32;
                c32 = k2.c3(k2.this);
                return c32;
            }
        }, new Function0() { // from class: dq.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit d32;
                d32 = k2.d3(k2.this);
                return d32;
            }
        }, a12, new Function0() { // from class: dq.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit e32;
                e32 = k2.e3(k2.this, renderProps);
                return e32;
            }
        }, j3(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    @NotNull
    public final SelfieState b1(@NotNull SelfieWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.A(), props.getPoseConfigs(), false, CameraProperties.b.f9961a, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    public final void c1(@NotNull tr.f<SelfieState> fVar, @Nullable sr.a aVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        SelfieState i10 = fVar.i();
        SelfieState backState = i10 != null ? i10.getBackState() : null;
        if (aVar != null) {
            aVar.e();
        }
        if (backState != null) {
            backState.x(true);
            fVar.p(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(SelfieWorkflow.b.a.f12686a);
        } else {
            e(SelfieWorkflow.b.C0236b.f12687a);
        }
    }

    public final void d1(@NotNull SelfieWorkflow.Input renderProps, @NotNull SelfieState renderState) {
        SelfieWorkflow.c g12;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        nq.j f10 = l2.f(renderState);
        if (!com.withpersona.sdk2.inquiry.selfie.p.H(renderState)) {
            d().m("close_camera", new f(null));
        }
        if (!k3(renderProps)) {
            d().m("output_webrtc_error", new g(null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), f10);
        if (renderState instanceof SelfieState.ShowInstructions) {
            g12 = e2(renderProps, (SelfieState.ShowInstructions) renderState);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            g12 = R2(renderProps, (SelfieState.WaitForWebRtcSetup) renderState);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            g12 = J2(renderProps, (SelfieState.WaitForCameraFeed) renderState);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            g12 = X1(renderProps, (SelfieState.RestartCamera) renderState);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            g12 = j2(renderProps, (SelfieState.ShowPoseHint) renderState);
        } else if (renderState instanceof SelfieState.StartCapture) {
            g12 = o2(renderProps, (SelfieState.StartCapture) renderState);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            g12 = w2(renderProps, (SelfieState.StartCaptureFaceDetected) renderState);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            g12 = A1(renderProps, (SelfieState.CountdownToCapture) renderState);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            g12 = F1(renderProps, (SelfieState.CountdownToManualCapture) renderState);
        } else if (renderState instanceof SelfieState.Capture) {
            g12 = o1(renderProps, (SelfieState.Capture) renderState);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            g12 = v1(renderProps, (SelfieState.CaptureTransition) renderState);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            g12 = Q1(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, d());
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            g12 = R1(renderProps, (SelfieState.FinalizeWebRtc) renderState);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            g12 = a3(renderProps, (SelfieState.WebRtcFinished) renderState);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            g12 = Z1(renderProps, (SelfieState.ReviewCaptures) renderState);
        } else if (z10) {
            g12 = C2(renderProps, (SelfieState.Submit) renderState);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new gt.l();
            }
            g12 = g1(renderProps, (SelfieState.AcquireNextPose) renderState);
        }
        c().setValue(g12);
    }

    public final boolean e1(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        sr.a aVar = this.webRtcManager;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        sr.a aVar2 = this.webRtcManager;
        Object i10 = videoCaptureConfig.i(valueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        if (gt.n.e(i10) == null) {
            return ((Boolean) i10).booleanValue();
        }
        return false;
    }

    public final SelfieWorkflow.c.b e2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowInstructions renderState) {
        RemoteImage remoteImage = null;
        if (renderState.getErrorMessage() != null) {
            d().m("toast_message_timeout", new o(null));
        }
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState b10 = this.navigationStateManager.b();
        SelfieType selfieType = renderProps.getSelfieType();
        if (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12615a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                remoteImage = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.c(selfieType, SelfieType.ThreePhotos.f12617a) && !Intrinsics.c(selfieType, SelfieType.ConfigurablePoses.f12616a)) {
                throw new gt.l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                remoteImage = promptPage2.getSelfiePictograph();
            }
        }
        return new SelfieWorkflow.c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), remoteImage, b10, renderProps.getSelfieType(), renderProps.A(), renderProps.getStrings().getPromptPageNavBarTitle(), renderState.getErrorMessage(), new Function0() { // from class: dq.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit h22;
                h22 = k2.h2(k2.this, renderProps, renderState);
                return h22;
            }
        }, new Function0() { // from class: dq.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i22;
                i22 = k2.i2(k2.this);
                return i22;
            }
        }, new Function0() { // from class: dq.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit f22;
                f22 = k2.f2(k2.this);
                return f22;
            }
        }, new Function0() { // from class: dq.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g22;
                g22 = k2.g2(k2.this, renderState);
                return g22;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.withpersona.sdk2.inquiry.selfie.SelfieState & com.withpersona.sdk2.inquiry.selfie.a> com.withpersona.sdk2.inquiry.selfie.SelfieState f1(tr.f<com.withpersona.sdk2.inquiry.selfie.SelfieState> r24, T r25, com.withpersona.sdk2.inquiry.selfie.Selfie r26) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.k2.f1(tr.f, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.Selfie):com.withpersona.sdk2.inquiry.selfie.SelfieState");
    }

    public final void f3() {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f22979a = true;
        d().m("check_if_manual_capture_enabled", new p(yVar, this, null));
    }

    public final SelfieWorkflow.c g1(final SelfieWorkflow.Input renderProps, SelfieState.AcquireNextPose renderState) {
        int size = renderState.w().size();
        d().m("fetch_pose_" + size, new h(size, null));
        return new SelfieWorkflow.c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new SelfieWorkflow.c.a.AbstractC0237a.C0238a(SelfieWorkflow.c.a.b.f12738a, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: dq.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit h12;
                h12 = k2.h1((in.a) obj, ((Boolean) obj2).booleanValue());
                return h12;
            }
        }, new Function1() { // from class: dq.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i12;
                i12 = k2.i1(k2.this, (Throwable) obj);
                return i12;
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: dq.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j12;
                j12 = k2.j1(k2.this);
                return j12;
            }
        }, new Function0() { // from class: dq.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k12;
                k12 = k2.k1(k2.this);
                return k12;
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: dq.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l12;
                l12 = k2.l1(k2.this, renderProps);
                return l12;
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: dq.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit m12;
                m12 = k2.m1(k2.this, (CameraProperties.b) obj);
                return m12;
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, false, new Function1() { // from class: dq.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit n12;
                n12 = k2.n1(((Boolean) obj).booleanValue());
                return n12;
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }

    public final void g3(Throwable error) {
        String message;
        String message2 = error.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(error instanceof g0.h1)) {
            if (error instanceof InternalErrorException) {
                h3(new SelfieWorkflow.b.Error(((InternalErrorException) error).getErrorInfo()));
                return;
            }
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = error.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
    }

    public final void h3(SelfieWorkflow.b output) {
        sr.a aVar;
        if (((output instanceof SelfieWorkflow.b.d) || (output instanceof SelfieWorkflow.b.a) || (output instanceof SelfieWorkflow.b.Error) || (output instanceof SelfieWorkflow.b.C0236b)) && (aVar = this.webRtcManager) != null) {
            aVar.e();
        }
        e(output);
    }

    public final void i3() {
        e(new SelfieWorkflow.b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final SelfieWorkflow.c j2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowPoseHint renderState) {
        wp.x xVar;
        String selfieHintLookLeft;
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c;
        SelfieWorkflow.c g10;
        int i10 = e.f15281a[renderState.j().ordinal()];
        if (i10 == 1) {
            xVar = wp.x.b;
        } else if (i10 == 2) {
            xVar = wp.x.f34767c;
        } else if (i10 == 3) {
            xVar = wp.x.f34768d;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new gt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            xVar = wp.x.f34769e;
        }
        int[] iArr = e.b;
        int i11 = iArr[xVar.ordinal()];
        if (i11 == 1) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i11 == 2) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookRight();
        } else if (i11 == 3) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintPoseNotCentered();
        } else if (i11 == 4) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookUp();
        } else {
            if (i11 != 5) {
                throw new gt.l();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookDown();
        }
        wp.x xVar2 = xVar;
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[xVar2.ordinal()];
        if (i12 == 1) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12808d;
        } else if (i12 == 2) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12811g;
        } else if (i12 == 3) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.b;
        } else if (i12 == 4) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12814j;
        } else {
            if (i12 != 5) {
                throw new gt.l();
            }
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12817m;
        }
        SelfieWorkflow.c.C0240c.b.f fVar = new SelfieWorkflow.c.C0240c.b.f(new Function0() { // from class: dq.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k22;
                k22 = k2.k2(k2.this, renderState, renderProps);
                return k22;
            }
        }, enumC0243c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        kn.a j32 = j3(renderProps);
        sr.a aVar = this.webRtcManager;
        String str = selfieHintLookLeft;
        SelfieWorkflow.c.C0240c.AssetOverrides C = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        e.a aVar2 = this.cameraXControllerFactory;
        c.a aVar3 = this.camera2ControllerFactory;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, C, requireStrictSelfieCapture, b10, new Function0() { // from class: dq.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l22;
                l22 = k2.l2(k2.this);
                return l22;
            }
        }, new Function0() { // from class: dq.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m22;
                m22 = k2.m2(k2.this);
                return m22;
            }
        }, a12, new Function0() { // from class: dq.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit n22;
                n22 = k2.n2(k2.this, renderProps);
                return n22;
            }
        }, j32, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final kn.a j3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        sr.a aVar = this.webRtcManager;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        sr.a aVar2 = this.webRtcManager;
        Object k10 = videoCaptureConfig.k(valueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        return gt.n.e(k10) == null ? (kn.a) k10 : kn.a.f22872c;
    }

    public final boolean k3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        sr.a aVar = this.webRtcManager;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        sr.a aVar2 = this.webRtcManager;
        Object i10 = videoCaptureConfig.i(valueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        if (gt.n.e(i10) != null) {
            return false;
        }
        ((Boolean) i10).getClass();
        return true;
    }

    public final SelfieWorkflow.c o1(final SelfieWorkflow.Input renderProps, final SelfieState.Capture renderState) {
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c;
        String str;
        boolean z10;
        SelfieWorkflow.c g10;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            d().m("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new i(renderState, this, renderProps, null));
        }
        final PoseInfo p8 = renderState.p();
        final in.a pose = p8.getPose();
        SelfieState.a flashState = renderState.getIsFlashEnabled() ? renderState.getFlashState() == SelfieState.a.f12610a ? SelfieState.a.b : renderState.getFlashState() : SelfieState.a.f12610a;
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), flashState == SelfieState.a.f12610a || flashState == SelfieState.a.f12612d), new Function1() { // from class: dq.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p12;
                    p12 = k2.p1(k2.this, renderState, (e.c) obj);
                    return p12;
                }
            });
        }
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintLookLeft = pose == in.a.b ? renderProps.getStrings().getSelfieHintLookLeft() : pose == in.a.f20966c ? renderProps.getStrings().getSelfieHintLookRight() : renderState.getSelfieError() != null ? b10 : pose == in.a.f20965a ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        int i10 = e.f15281a[pose.ordinal()];
        if (i10 == 1) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12809e;
        } else if (i10 == 2) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12812h;
        } else if (i10 == 3) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12815k;
        } else if (i10 == 4) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12818n;
        } else {
            if (i10 != 5) {
                throw new gt.l();
            }
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.b;
        }
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c2 = enumC0243c;
        SelfieWorkflow.c.C0240c.b aVar = (!renderState.o() || flashState == SelfieState.a.f12611c || flashState == SelfieState.a.f12612d) ? new SelfieWorkflow.c.C0240c.b.a(enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false) : new SelfieWorkflow.c.C0240c.b.d(new Function1() { // from class: dq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q12;
                q12 = k2.q1(PoseInfo.this, pose, this, renderState, (String) obj);
                return q12;
            }
        }, new Function1() { // from class: dq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit r12;
                r12 = k2.r1(k2.this, (Throwable) obj);
                return r12;
            }
        }, false, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false, 4, null);
        if (!renderState.o()) {
            f3();
        }
        SelfieState.a aVar2 = SelfieState.a.f12611c;
        if (flashState == aVar2) {
            d().m("wait_to_capture_with_flash_on", new j(null));
        }
        SelfieState.a aVar3 = SelfieState.a.f12612d;
        if (flashState == aVar3) {
            d().m("turn_off_flash", new k(null));
        }
        kn.a j32 = j3(renderProps);
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String str2 = selfieHintLookLeft;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        sr.a aVar4 = this.webRtcManager;
        SelfieWorkflow.c.C0240c.AssetOverrides C = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        e.a aVar5 = this.cameraXControllerFactory;
        c.a aVar6 = this.camera2ControllerFactory;
        String str3 = b10;
        boolean autoCaptureSupported = renderState.getAutoCaptureSupported();
        in.a j10 = renderState.j();
        float poseScore = renderState.getPoseScore();
        SelfieBrightnessInfo brightnessInfo = renderState.getBrightnessInfo();
        CameraProperties.b cameraFacingMode = renderState.getCameraFacingMode();
        boolean isFlashEnabled = renderState.getIsFlashEnabled();
        boolean a10 = this.featureFlagManager.a(eo.a.f16085a);
        if (renderState.getFlashState() == aVar2 || renderState.getFlashState() == aVar3) {
            str = capturePageTitle;
            z10 = true;
        } else {
            str = capturePageTitle;
            z10 = false;
        }
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, j10, str, (r61 & 16) != 0 ? null : str2, str3, autoCaptureSupported, aVar, C, requireStrictSelfieCapture, b11, new Function0() { // from class: dq.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit s12;
                s12 = k2.s1(k2.this);
                return s12;
            }
        }, new Function0() { // from class: dq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit t12;
                t12 = k2.t1(k2.this);
                return t12;
            }
        }, a12, new Function0() { // from class: dq.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit u12;
                u12 = k2.u1(k2.this, renderProps);
                return u12;
            }
        }, j32, aVar4, recordAudio, aVar5, aVar6, poseScore, brightnessInfo, cameraFacingMode, isFlashEnabled, a10, renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : z10, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : j3(renderProps) == kn.a.b, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c o2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCapture renderState) {
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c;
        boolean z10;
        String str;
        Object obj;
        SelfieWorkflow.c.C0240c.b aVar;
        SelfieWorkflow.c g10;
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: dq.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit p22;
                    p22 = k2.p2(k2.this, renderState, renderProps, (e.c) obj2);
                    return p22;
                }
            });
        }
        final PoseInfo p8 = renderState.p();
        boolean o8 = renderState.o();
        if (!o8) {
            f3();
        }
        int i10 = e.f15281a[p8.getPose().ordinal()];
        if (i10 == 1) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12809e;
        } else if (i10 == 2) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12812h;
        } else if (i10 == 3) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12815k;
        } else if (i10 == 4) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12818n;
        } else {
            if (i10 != 5) {
                throw new gt.l();
            }
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.b;
        }
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c2 = enumC0243c;
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        if (b10 == null) {
            z10 = o8;
            str = renderProps.getStrings().getSelfieHintTakePhoto();
        } else {
            z10 = o8;
            str = b10;
        }
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!z10) {
            obj = null;
            aVar = new SelfieWorkflow.c.C0240c.b.a(enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        } else if (e1(renderProps)) {
            aVar = new SelfieWorkflow.c.C0240c.b.e(new Function0() { // from class: dq.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit q22;
                    q22 = k2.q2(k2.this, renderState, renderProps);
                    return q22;
                }
            }, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: dq.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit r22;
                    r22 = k2.r2(PoseInfo.this, this, renderState, (String) obj2);
                    return r22;
                }
            };
            obj = null;
            aVar = new SelfieWorkflow.c.C0240c.b.d(function1, new Function1() { // from class: dq.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit s22;
                    s22 = k2.s2(k2.this, (Throwable) obj2);
                    return s22;
                }
            }, false, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, obj);
        kn.a j32 = j3(renderProps);
        sr.a aVar2 = this.webRtcManager;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : str, b10, renderState.getAutoCaptureSupported(), aVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: dq.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit t22;
                t22 = k2.t2(k2.this);
                return t22;
            }
        }, new Function0() { // from class: dq.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit u22;
                u22 = k2.u2(k2.this);
                return u22;
            }
        }, a12, new Function0() { // from class: dq.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit v22;
                v22 = k2.v2(k2.this, renderProps);
                return v22;
            }
        }, j32, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c v1(final SelfieWorkflow.Input renderProps, SelfieState.CaptureTransition renderState) {
        SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c;
        SelfieWorkflow.c g10;
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12821q;
        } else {
            int i10 = e.f15281a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12810f;
            } else if (i10 == 2) {
                enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12813i;
            } else if (i10 == 3) {
                enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12816l;
            } else if (i10 == 4) {
                enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12819o;
            } else {
                if (i10 != 5) {
                    throw new gt.l();
                }
                enumC0243c = SelfieWorkflow.c.C0240c.EnumC0243c.f12807c;
            }
        }
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, null, capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0240c.b.h(new Function0() { // from class: dq.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit w12;
                w12 = k2.w1(k2.this);
                return w12;
            }
        }, true, enumC0243c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: dq.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit x12;
                x12 = k2.x1(k2.this);
                return x12;
            }
        }, new Function0() { // from class: dq.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit y12;
                y12 = k2.y1(k2.this);
                return y12;
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: dq.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z12;
                z12 = k2.z1(k2.this, renderProps);
                return z12;
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }

    public final SelfieWorkflow.c w2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCaptureFaceDetected renderState) {
        SelfieWorkflow.c g10;
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: dq.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit x22;
                    x22 = k2.x2(k2.this, renderState, renderProps, (e.c) obj);
                    return x22;
                }
            });
        }
        d().n(new TimerWorker(1000L), new Function1() { // from class: dq.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y22;
                y22 = k2.y2(k2.this, renderProps, (Unit) obj);
                return y22;
            }
        });
        tr.f<SelfieState> d10 = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        SelfieWorkflow.c.C0240c.b.a aVar = new SelfieWorkflow.c.C0240c.b.a(SelfieWorkflow.c.C0240c.EnumC0243c.b, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 a12 = a1(this, d(), false, 1, null);
        kn.a j32 = j3(renderProps);
        sr.a aVar2 = this.webRtcManager;
        SelfieWorkflow.c.C0240c.AssetOverrides C = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        e.a aVar3 = this.cameraXControllerFactory;
        c.a aVar4 = this.camera2ControllerFactory;
        g10 = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d10, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, C, requireStrictSelfieCapture, b10, new Function0() { // from class: dq.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z22;
                z22 = k2.z2(k2.this);
                return z22;
            }
        }, new Function0() { // from class: dq.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit A2;
                A2 = k2.A2(k2.this);
                return A2;
            }
        }, a12, new Function0() { // from class: dq.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit B2;
                B2 = k2.B2(k2.this, renderProps);
                return B2;
            }
        }, j32, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return g10;
    }
}
