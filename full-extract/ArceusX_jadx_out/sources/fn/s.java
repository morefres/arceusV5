package fn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent$MiscInquiryEvent$VideoCaptureFallback;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.s;
import gn.f;
import gt.n;
import java.io.File;
import java.io.FileOutputStream;
import ju.a2;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.k;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¼\u00012\u00020\u0001:\u0003IMQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0083@¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010 J\u001c\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b4\u0010#J,\u0010<\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u0004\u0018\u00010$*\u00020AH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010,R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,R\u0017\u0010i\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010,R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010,R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010,R\u0018\u0010\u0097\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010,R\u0018\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010,R&\u0010\u009f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010!0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R#\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010£\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010,R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010°\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009a\u0001R\u0019\u0010³\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020A0´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"Lfn/s;", "", "Landroid/content/Context;", "context", "Lfn/h0;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "Ljn/a;", "cameraStatsManager", "Loq/c;", "sdkFilesManager", "Ljq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lnq/c;", "externalEventLogger", "isImageReaderRecorderEnabled", "forceImageReaderRecorder", "<init>", "(Landroid/content/Context;Lfn/h0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;ZLjn/a;Loq/c;Ljq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lnq/c;ZZ)V", "", "r0", "()V", "Lgt/n;", "x0", "(Lmt/b;)Ljava/lang/Object;", "Ljava/io/File;", "z0", "o0", "Y", "analyzerEnabled", "q0", "(Z)V", "enable", "Z", "a0", "g0", "j0", "retryOnError", "Lfn/g0;", "V", "(ZLmt/b;)Ljava/lang/Object;", "X", "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "l0", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lmt/b;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "h0", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "n0", "(Landroid/media/Image;)V", "p0", "(Landroid/media/Image;)Ljava/io/File;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lfn/h0;", "b0", "()Lfn/h0;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d0", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", rl.d.f30696a, "Lfn/g;", "e", "Lkn/a;", "f", "Lsr/a;", "g", "h", "Ljn/a;", "i", "Loq/c;", "j", "Ljq/a;", "k", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "l", "Lnq/c;", "m", "n", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c0", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lju/p0;", "p", "Lju/p0;", "coroutineScope", "q", "Ljava/lang/String;", "r", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "s", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", zl.t.f38095d, "I", "orientation", "u", "recordAudio", "Lfn/r0;", "v", "Lfn/r0;", "mediaRecorderWrapper", "Lgn/f;", "w", "Lgn/f;", "imageReaderVideoRecorder", "x", "useImageReaderRecorder", "y", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "z", "Landroid/os/HandlerThread;", "cameraThread", "A", "Landroid/os/Handler;", "cameraHandler", "B", "Lfn/g0;", "session", "C", "recordingStarted", "D", "isAnalyzerEnabled", "E", "isImageCaptureRequested", "F", "isPreviewSurfaceAvailable", "Lmu/c0;", "G", "Lmu/c0;", "imageCaptureResult", "Lfn/s$d;", "H", "_state", "Lmu/p0;", "Lmu/p0;", "e0", "()Lmu/p0;", "state", "J", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "K", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "L", "analysisSizeScaling", "M", "Landroid/media/ImageReader;", "imageReader", "Llu/g;", "N", "Llu/g;", "imageProcessingChannel", "Landroid/os/ConditionVariable;", "O", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "P", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Handler cameraHandler;

    /* renamed from: B, reason: from kotlin metadata */
    @Nullable
    public g0 session;

    /* renamed from: C, reason: from kotlin metadata */
    public volatile boolean recordingStarted;

    /* renamed from: D, reason: from kotlin metadata */
    public volatile boolean isAnalyzerEnabled;

    /* renamed from: E, reason: from kotlin metadata */
    public volatile boolean isImageCaptureRequested;

    /* renamed from: F, reason: from kotlin metadata */
    public volatile boolean isPreviewSurfaceAvailable;

    /* renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final mu.c0<gt.n<File>> imageCaptureResult;

    /* renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final mu.c0<d> _state;

    /* renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final mu.p0<d> state;

    /* renamed from: J, reason: from kotlin metadata */
    public boolean isPreviewStarted;

    /* renamed from: K, reason: from kotlin metadata */
    @Nullable
    public SurfaceHolder.Callback surfaceHolderCallback;

    /* renamed from: L, reason: from kotlin metadata */
    public float analysisSizeScaling;

    /* renamed from: M, reason: from kotlin metadata */
    @NotNull
    public ImageReader imageReader;

    /* renamed from: N, reason: from kotlin metadata */
    @NotNull
    public lu.g<Image> imageProcessingChannel;

    /* renamed from: O, reason: from kotlin metadata */
    @NotNull
    public ConditionVariable processImageHaltedCv;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Camera2PreviewView previewView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.g analyzer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kn.a videoCaptureMethod;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final sr.a webRtcManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jq.a coroutineScopeFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean isImageReaderRecorderEnabled;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean forceImageReaderRecorder;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.p0 coroutineScope;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cameraId;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraManager cameraManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraCharacteristics characteristics;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int orientation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final boolean recordAudio;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 mediaRecorderWrapper;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gn.f imageReaderVideoRecorder;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean useImageReaderRecorder;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraDevice camera;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HandlerThread cameraThread;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17444t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fn.s$a$a, reason: collision with other inner class name */
        public static final class C0313a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f17446a;

            public C0313a(s sVar) {
                this.f17446a = sVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, mt.b<? super Unit> bVar) {
                this.f17446a.n0(image);
                return Unit.f22894a;
            }
        }

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17444t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h H = mu.j.H(s.this.imageProcessingChannel);
                C0313a c0313a = new C0313a(s.this);
                this.f17444t = 1;
                if (H.collect(c0313a, this) == e10) {
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
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lfn/s$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", j6.b.f21518e, ve.a.f33391e, "Lfn/s$c$a;", "Lfn/s$c$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfn/s$c$a;", "Lfn/s$c;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, @NotNull Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn/s$c$b;", "Lfn/s$c;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {
            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }

        public c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfn/s$d;", "", ve.a.f33391e, rl.d.f30696a, j6.b.f21518e, "c", "Lfn/s$d$a;", "Lfn/s$d$b;", "Lfn/s$d$c;", "Lfn/s$d$d;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfn/s$d$a;", "Lfn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f17447a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1835001754;
            }

            @NotNull
            public String toString() {
                return "Created";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfn/s$d$b;", "Lfn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f17448a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1111701481;
            }

            @NotNull
            public String toString() {
                return "Destroyed";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfn/s$d$c;", "Lfn/s$d;", "Lfn/s$c;", "error", "<init>", "(Lfn/s$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lfn/s$c;", "()Lfn/s$c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fn.s$d$c, reason: from toString */
        public static final /* data */ class Error implements d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final c error;

            public Error(@NotNull c error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final c getError() {
                return this.error;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfn/s$d$d;", "Lfn/s$d;", "", "firstFrameReceived", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: fn.s$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class Started implements d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean firstFrameReceived;

            public Started(boolean z10) {
                this.firstFrameReceived = z10;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getFirstFrameReceived() {
                return this.firstFrameReceived;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Started) && this.firstFrameReceived == ((Started) other).firstFrameReceived;
            }

            public int hashCode() {
                return Boolean.hashCode(this.firstFrameReceived);
            }

            @NotNull
            public String toString() {
                return "Started(firstFrameReceived=" + this.firstFrameReceived + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lfn/g0;", "<anonymous>", "(Lju/p0;)Lfn/g0;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2", f = "Camera2Manager.kt", l = {317, 335, 372}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<ju.p0, mt.b<? super g0>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f17451t;

        /* renamed from: u, reason: collision with root package name */
        public Object f17452u;

        /* renamed from: v, reason: collision with root package name */
        public Object f17453v;

        /* renamed from: w, reason: collision with root package name */
        public int f17454w;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f17456y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f17456y = z10;
        }

        public static final Unit r(s sVar) {
            Object value = sVar._state.getValue();
            d.Started started = value instanceof d.Started ? (d.Started) value : null;
            if (started != null && !started.getFirstFrameReceived()) {
                sVar._state.setValue(new d.Started(true));
            }
            return Unit.f22894a;
        }

        public static final String s(s sVar, Exception exc) {
            return "createCaptureSession failed on first attempt for choice " + sVar.getCameraChoice() + " (videoCaptureMethod=" + sVar.videoCaptureMethod + "): " + exc + ". Retrying.";
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new e(this.f17456y, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0176, code lost:
        
            if (r15 == r1) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fn.s.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super g0> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", l = {499}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17457t;

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new f(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17457t;
            if (i10 == 0) {
                gt.o.b(obj);
                Object value = s.this._state.getValue();
                d.b bVar = d.b.f17448a;
                if (Intrinsics.c(value, bVar)) {
                    return Unit.f22894a;
                }
                s.this._state.setValue(bVar);
                s.this.getPreviewView().getHolder().removeCallback(s.this.surfaceHolderCallback);
                s.this.processImageHaltedCv.block(2000L);
                r0 r0Var = s.this.mediaRecorderWrapper;
                this.f17457t = 1;
                if (r0Var.h(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            s.this.imageReaderVideoRecorder.i();
            s.this.imageReader.close();
            g0 g0Var = s.this.session;
            if (g0Var != null) {
                g0Var.f();
            }
            s.this.session = null;
            CameraDevice cameraDevice = s.this.camera;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            s.this.camera = null;
            s.this.cameraStatsManager.c();
            ju.q0.f(s.this.coroutineScope, null, 1, null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroyAsync$1", f = "Camera2Manager.kt", l = {481}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17459t;

        public g(mt.b<? super g> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new g(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17459t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17459t = 1;
                if (sVar.X(this) == e10) {
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
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", l = {293}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17461t;

        public h(mt.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new h(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17461t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17461t = 1;
                obj = s.W(sVar, false, this, 1, null);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var != null && s.this.useImageReaderRecorder) {
                s.this.j0();
            }
            if (g0Var != null) {
                gt.n.a(g0Var.m());
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {760, 583}, m = "openCamera")
    public static final class i extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f17463t;

        /* renamed from: u, reason: collision with root package name */
        public Object f17464u;

        /* renamed from: v, reason: collision with root package name */
        public Object f17465v;

        /* renamed from: w, reason: collision with root package name */
        public Object f17466w;

        /* renamed from: x, reason: collision with root package name */
        public Object f17467x;

        /* renamed from: y, reason: collision with root package name */
        public int f17468y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f17469z;

        public i(mt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17469z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return s.this.l0(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"fn/s$j", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<CameraDevice> f17470a;
        public final /* synthetic */ s b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(ju.n<? super CameraDevice> nVar, s sVar) {
            this.f17470a = nVar;
            this.b = sVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.b.camera = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int error) {
            Intrinsics.checkNotNullParameter(device, "device");
            try {
                device.close();
            } catch (Exception unused) {
            }
            if (this.f17470a.b()) {
                ju.n<CameraDevice> nVar = this.f17470a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.o.a(new l0(error))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f17470a.resumeWith(gt.n.b(device));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {459}, m = "requestImageCapture-IoAF18A")
    public static final class k extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17471t;

        /* renamed from: v, reason: collision with root package name */
        public int f17473v;

        public k(mt.b<? super k> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17471t = obj;
            this.f17473v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object o02 = s.this.o0(this);
            return o02 == nt.c.e() ? o02 : gt.n.a(o02);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "Ljava/io/File;", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", l = {471}, m = "invokeSuspend")
    public static final class l extends ot.m implements Function2<ju.p0, mt.b<? super gt.n<? extends File>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17474t;

        public l(mt.b<? super l> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new l(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17474t;
            if (i10 == 0) {
                gt.o.b(obj);
                if (s.this.isImageCaptureRequested) {
                    n.Companion companion = gt.n.INSTANCE;
                    return gt.n.a(gt.n.b(gt.o.a(new o0())));
                }
                s.this.imageCaptureResult.setValue(null);
                s.this.isImageCaptureRequested = true;
                mu.h s8 = mu.j.s(s.this.imageCaptureResult);
                this.f17474t = 1;
                obj = mu.j.u(s8, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            Object value = ((gt.n) obj).getValue();
            s.this.isImageCaptureRequested = false;
            return gt.n.a(value);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super gt.n<? extends File>> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"fn/s$m", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements SurfaceHolder.Callback {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceCreated$1$1", f = "Camera2Manager.kt", l = {265}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17477t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f17478u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f17478u = sVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f17478u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f17477t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    s sVar = this.f17478u;
                    this.f17477t = 1;
                    if (s.s0(sVar, this) == e10) {
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
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceDestroyed$1", f = "Camera2Manager.kt", l = {243}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f17479t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f17480u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f17480u = sVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new b(this.f17480u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f17479t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    s sVar = this.f17480u;
                    this.f17479t = 1;
                    if (sVar.X(this) == e10) {
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
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        public m() {
        }

        public static final void b(s sVar) {
            ju.k.d(sVar.coroutineScope, null, null, new a(sVar, null), 3, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            s.this.isPreviewSurfaceAvailable = true;
            s.this.getPreviewView().b(s.this.getCameraChoice().getSize().getWidth(), s.this.getCameraChoice().getSize().getHeight(), s.this.orientation);
            Camera2PreviewView previewView = s.this.getPreviewView();
            final s sVar = s.this;
            previewView.post(new Runnable() { // from class: fn.v
                @Override // java.lang.Runnable
                public final void run() {
                    s.m.b(s.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            s.this.isPreviewSurfaceAvailable = false;
            ju.k.d(s.this.coroutineScope, null, null, new b(s.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$3$1", f = "Camera2Manager.kt", l = {274}, m = "invokeSuspend")
    public static final class n extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17481t;

        public n(mt.b<? super n> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new n(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17481t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17481t = 1;
                if (s.s0(sVar, this) == e10) {
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
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {218}, m = "start$initializeCameraAndSetState")
    public static final class o extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f17483t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17484u;

        /* renamed from: v, reason: collision with root package name */
        public int f17485v;

        public o(mt.b<? super o> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17484u = obj;
            this.f17485v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return s.s0(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {385, HttpStatusCode.UNAUTHORIZED_401}, m = "startVideo-IoAF18A")
    public static final class p extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f17486t;

        /* renamed from: u, reason: collision with root package name */
        public int f17487u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f17488v;

        /* renamed from: x, reason: collision with root package name */
        public int f17490x;

        public p(mt.b<? super p> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17488v = obj;
            this.f17490x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object x02 = s.this.x0(this);
            return x02 == nt.c.e() ? x02 : gt.n.a(x02);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$startVideo$2$startResult$1", f = "Camera2Manager.kt", l = {}, m = "invokeSuspend")
    public static final class q extends ot.m implements Function2<ju.p0, mt.b<? super gt.n<? extends Unit>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17491t;

        public q(mt.b<? super q> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new q(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ju.p0 p0Var, mt.b<? super gt.n<? extends Unit>> bVar) {
            return invoke2(p0Var, (mt.b<? super gt.n<Unit>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f17491t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return gt.n.a(s.this.imageReaderVideoRecorder.o());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ju.p0 p0Var, mt.b<? super gt.n<Unit>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 449}, m = "stopVideo-IoAF18A")
    public static final class r extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17493t;

        /* renamed from: v, reason: collision with root package name */
        public int f17495v;

        public r(mt.b<? super r> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17493t = obj;
            this.f17495v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object z02 = s.this.z0(this);
            return z02 == nt.c.e() ? z02 : gt.n.a(z02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lgn/f$e;", "<anonymous>", "(Lju/p0;)Lgn/f$e;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$stopVideo$recording$result$1", f = "Camera2Manager.kt", l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "invokeSuspend")
    /* renamed from: fn.s$s, reason: collision with other inner class name */
    public static final class C0315s extends ot.m implements Function2<ju.p0, mt.b<? super f.e>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f17496t;

        public C0315s(mt.b<? super C0315s> bVar) {
            super(2, bVar);
        }

        public static final f.e q(s sVar) {
            return sVar.imageReaderVideoRecorder.s();
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return s.this.new C0315s(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f17496t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            final s sVar = s.this;
            Function0 function0 = new Function0() { // from class: fn.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    f.e q10;
                    q10 = s.C0315s.q(s.this);
                    return q10;
                }
            };
            this.f17496t = 1;
            Object c10 = a2.c(null, function0, this, 1, null);
            return c10 == e10 ? e10 : c10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super f.e> bVar) {
            return ((C0315s) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public s(@NotNull Context context, @NotNull h0 cameraChoice, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z10, @NotNull jn.a cameraStatsManager, @NotNull oq.c sdkFilesManager, @NotNull jq.a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull nq.c externalEventLogger, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(coroutineScopeFactory, "coroutineScopeFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = aVar;
        this.isAudioRequired = z10;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.coroutineScopeFactory = coroutineScopeFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        this.externalEventLogger = externalEventLogger;
        this.isImageReaderRecorderEnabled = z11;
        this.forceImageReaderRecorder = z12;
        this.cameraProperties = cameraChoice.getCameraProperties();
        ju.p0 a10 = coroutineScopeFactory.a();
        this.coroutineScope = a10;
        String id2 = cameraChoice.getId();
        this.cameraId = id2;
        Object systemService = context.getSystemService("camera");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(id2);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int intValue = ((Number) obj).intValue();
        this.orientation = intValue;
        boolean z13 = z10 && hq.g.f(context);
        this.recordAudio = z13;
        Integer upper = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new r0(context, cameraChoice, upper.intValue(), intValue, z13);
        int width = cameraChoice.getSize().getWidth();
        int height = cameraChoice.getSize().getHeight();
        Integer upper2 = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        this.imageReaderVideoRecorder = new gn.f(width, height, upper2.intValue(), intValue, z13, sdkFilesManager);
        this.useImageReaderRecorder = z12;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = mu.r0.a(null);
        mu.c0<d> a11 = mu.r0.a(d.a.f17447a);
        this._state = a11;
        this.state = a11;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = h0();
        this.imageProcessingChannel = lu.j.a(1, lu.a.b, new Function1() { // from class: fn.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit f02;
                f02 = s.f0((Image) obj2);
                return f02;
            }
        });
        this.processImageHaltedCv = new ConditionVariable();
        ju.k.d(a10, null, null, new a(null), 3, null);
    }

    public static final String A0(Throwable th2) {
        return "stopVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public static final String B0(Throwable th2) {
        return "stopVideo warning - audio failed to record due to " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public static /* synthetic */ Object W(s sVar, boolean z10, mt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sVar.V(z10, bVar);
    }

    public static final Unit f0(Image it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.close();
        return Unit.f22894a;
    }

    public static final void i0(s sVar, ImageReader imageReader) {
        sr.a aVar;
        Image acquireNextImage = imageReader.acquireNextImage();
        int rotation = sVar.cameraChoice.getRotation();
        if (sVar.videoCaptureMethod == kn.a.f22871a && (aVar = sVar.webRtcManager) != null) {
            aVar.b(acquireNextImage, rotation);
        }
        if (acquireNextImage != null) {
            if (sVar.useImageReaderRecorder && sVar.recordingStarted) {
                sVar.imageReaderVideoRecorder.l(acquireNextImage);
            }
            Object v5 = sVar.imageProcessingChannel.v(acquireNextImage);
            if (v5 instanceof k.c) {
                lu.k.e(v5);
                acquireNextImage.close();
            }
        }
    }

    public static final String k0() {
        return "Unable to setup camera with 3 streams. Falling back to 2 streams instead.";
    }

    public static final String m0(boolean z10, kotlin.jvm.internal.a0 a0Var, String str, l0 l0Var) {
        String b;
        boolean z11 = !z10 || a0Var.f22960a > 2;
        int errorCode = l0Var.getErrorCode();
        b = e0.b(l0Var.getErrorCode());
        return "openCamera error for camera " + str + ": code=" + errorCode + " (" + b + "), attempt=" + (a0Var.f22960a + 1) + ", retriable=" + z10 + ", exhaustedAllRetries=" + z11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r6.trackingEventsLogger, "camera", new fn.q(r6, r0), false, 4, null);
        r6._state.setValue(new fn.s.d.Error(new fn.s.c.a("Unable to initialize Camera2 classes", r0)));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s0(final fn.s r6, mt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof fn.s.o
            if (r0 == 0) goto L13
            r0 = r7
            fn.s$o r0 = (fn.s.o) r0
            int r1 = r0.f17485v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17485v = r1
            goto L18
        L13:
            fn.s$o r0 = new fn.s$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17484u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17485v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f17483t
            fn.s r6 = (fn.s) r6
            gt.o.b(r7)     // Catch: java.lang.Exception -> L2d
            goto L46
        L2d:
            r0 = move-exception
            r7 = r0
            goto L61
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            gt.o.b(r7)
            r0.f17483t = r6     // Catch: java.lang.Exception -> L2d
            r0.f17485v = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r7 = r6.g0(r0)     // Catch: java.lang.Exception -> L2d
            if (r7 != r1) goto L46
            return r1
        L46:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r0 = r6.trackingEventsLogger     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "camera"
            fn.p r2 = new fn.p     // Catch: java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Exception -> L2d
            r4 = 4
            r5 = 0
            r3 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2d
            mu.c0<fn.s$d> r7 = r6._state     // Catch: java.lang.Exception -> L2d
            fn.s$d$d r0 = new fn.s$d$d     // Catch: java.lang.Exception -> L2d
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2d
            r7.setValue(r0)     // Catch: java.lang.Exception -> L2d
            goto L81
        L61:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r0 = r6.trackingEventsLogger
            fn.q r2 = new fn.q
            r2.<init>()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "camera"
            r3 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r0, r1, r2, r3, r4, r5)
            mu.c0<fn.s$d> r6 = r6._state
            fn.s$d$c r0 = new fn.s$d$c
            fn.s$c$a r1 = new fn.s$c$a
            java.lang.String r2 = "Unable to initialize Camera2 classes"
            r1.<init>(r2, r7)
            r0.<init>(r1)
            r6.setValue(r0)
        L81:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.s0(fn.s, mt.b):java.lang.Object");
    }

    public static final String t0(s sVar) {
        return "initializeCamera succeeded for choice " + sVar.cameraChoice;
    }

    public static final String u0(s sVar, Exception exc) {
        return "initializeCamera failed for choice " + sVar.cameraChoice + ": " + kotlin.text.c0.B1(gt.a.b(exc), 4000);
    }

    public static final String v0(s sVar, boolean z10) {
        return "Camera not started for choice " + sVar.cameraChoice + ": missing permission (audioPermissionMissing=" + z10 + ")";
    }

    public static final Unit w0(s sVar) {
        if (sVar.isPreviewSurfaceAvailable) {
            ju.k.d(sVar.coroutineScope, null, null, sVar.new n(null), 3, null);
        }
        return Unit.f22894a;
    }

    public static final String y0(Throwable th2) {
        return "startVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public final Object V(boolean z10, mt.b<? super g0> bVar) {
        return ju.i.g(g1.c(), new e(z10, null), bVar);
    }

    public final Object X(mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(g1.a(), new f(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public final void Y() {
        ju.k.d(this.coroutineScope, null, null, new g(null), 3, null);
    }

    public final void Z(boolean enable) {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.j(enable);
            gt.n.a(g0Var.m());
        }
    }

    public final void a0() {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.k(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (this.cameraChoice.getSize().getWidth() * 0.15d), (int) (this.cameraChoice.getSize().getHeight() * 0.15d)), 5000L);
            gt.n.a(g0Var.m());
        }
    }

    @NotNull
    /* renamed from: b0, reason: from getter */
    public final h0 getCameraChoice() {
        return this.cameraChoice;
    }

    @NotNull
    /* renamed from: c0, reason: from getter */
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    /* renamed from: d0, reason: from getter */
    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    @NotNull
    public final mu.p0<d> e0() {
        return this.state;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final Object g0(mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(g1.c(), new h(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public final ImageReader h0() {
        ImageReader newInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: fn.k
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                s.i0(s.this, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(newInstance, "also(...)");
        return newInstance;
    }

    public final void j0() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String k02;
                k02 = s.k0();
                return k02;
            }
        }, false, 4, null);
        this.externalEventLogger.b(InquiryEvent$MiscInquiryEvent$VideoCaptureFallback.f11139a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (ju.z0.b(r12 * 2000, r2) == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: l0 -> 0x00ab, TRY_LEAVE, TryCatch #0 {l0 -> 0x00ab, blocks: (B:13:0x007a, B:15:0x00a7), top: B:12:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0101 -> B:11:0x0044). Please report as a decompilation issue!!! */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(android.hardware.camera2.CameraManager r20, java.lang.String r21, android.os.Handler r22, mt.b<? super android.hardware.camera2.CameraDevice> r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.l0(android.hardware.camera2.CameraManager, java.lang.String, android.os.Handler, mt.b):java.lang.Object");
    }

    public final void n0(Image image) {
        try {
            try {
                if (Intrinsics.c(this._state.getValue(), d.b.f17448a)) {
                    this.processImageHaltedCv.open();
                    wt.a.a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    wt.a.a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File p02 = p0(image);
                    if (p02 != null) {
                        this.imageCaptureResult.setValue(gt.n.a(gt.n.b(p02)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.f(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.f22894a;
                wt.a.a(image, null);
            } finally {
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fn.s.k
            if (r0 == 0) goto L13
            r0 = r6
            fn.s$k r0 = (fn.s.k) r0
            int r1 = r0.f17473v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17473v = r1
            goto L18
        L13:
            fn.s$k r0 = new fn.s$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17471t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17473v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            gt.o.b(r6)
            ju.n2 r6 = ju.g1.c()
            fn.s$l r2 = new fn.s$l
            r4 = 0
            r2.<init>(r4)
            r0.f17473v = r3
            java.lang.Object r6 = ju.i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            gt.n r6 = (gt.n) r6
            java.lang.Object r6 = r6.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.o0(mt.b):java.lang.Object");
    }

    public final File p0(Image image) {
        Bitmap d10 = dn.c0.d(image, this.orientation, null, 2, null);
        if (d10 == null) {
            return null;
        }
        File e10 = this.sdkFilesManager.e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(e10);
        try {
            d10.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            tt.c.a(fileOutputStream, null);
            d10.recycle();
            return e10;
        } finally {
        }
    }

    public final void q0(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    public final void r0() {
        final boolean z10 = this.isAudioRequired && l2.b.a(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (l2.b.a(this.context, "android.permission.CAMERA") != 0 || z10) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String v02;
                    v02 = s.v0(s.this, z10);
                    return v02;
                }
            }, false, 4, null);
            this._state.setValue(new d.Error(new c.b()));
        } else {
            if (this.isPreviewStarted) {
                return;
            }
            this.isPreviewStarted = true;
            this.isPreviewSurfaceAvailable = false;
            this.surfaceHolderCallback = new m();
            this.mediaRecorderWrapper.o(new Function0() { // from class: fn.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit w02;
                    w02 = s.w0(s.this);
                    return w02;
                }
            });
            this.previewView.a();
            this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
            this.cameraStatsManager.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:13:0x00aa, B:19:0x0041, B:20:0x0076, B:22:0x0082, B:28:0x0058, B:30:0x005e, B:35:0x009a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<java.lang.Boolean>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof fn.s.p
            if (r0 == 0) goto L13
            r0 = r12
            fn.s$p r0 = (fn.s.p) r0
            int r1 = r0.f17490x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17490x = r1
            goto L18
        L13:
            fn.s$p r0 = new fn.s$p
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f17488v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17490x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f17486t
            fn.s r0 = (fn.s) r0
            gt.o.b(r12)     // Catch: java.lang.Throwable -> L31
            goto Laa
        L31:
            r0 = move-exception
            r12 = r0
            goto Lb7
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3d:
            java.lang.Object r0 = r0.f17486t
            fn.s r0 = (fn.s) r0
            gt.o.b(r12)     // Catch: java.lang.Throwable -> L31
            goto L76
        L45:
            gt.o.b(r12)
            boolean r12 = r11.recordingStarted
            r2 = 0
            if (r12 == 0) goto L58
            gt.n$a r12 = gt.n.INSTANCE
            java.lang.Boolean r12 = ot.b.a(r2)
            java.lang.Object r12 = gt.n.b(r12)
            return r12
        L58:
            gt.n$a r12 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L31
            boolean r12 = r11.useImageReaderRecorder     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto L9a
            ju.l0 r12 = ju.g1.a()     // Catch: java.lang.Throwable -> L31
            fn.s$q r3 = new fn.s$q     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L31
            r0.f17486t = r11     // Catch: java.lang.Throwable -> L31
            r0.f17487u = r2     // Catch: java.lang.Throwable -> L31
            r0.f17490x = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = ju.i.g(r12, r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r12 != r1) goto L75
            goto La8
        L75:
            r0 = r11
        L76:
            gt.n r12 = (gt.n) r12     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L31
            java.lang.Throwable r12 = gt.n.e(r12)     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto Laa
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r5 = r0.trackingEventsLogger     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "camera"
            fn.j r7 = new fn.j     // Catch: java.lang.Throwable -> L31
            r7.<init>()     // Catch: java.lang.Throwable -> L31
            r9 = 4
            r10 = 0
            r8 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = gt.o.a(r12)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = gt.n.b(r12)     // Catch: java.lang.Throwable -> L31
            return r12
        L9a:
            fn.r0 r12 = r11.mediaRecorderWrapper     // Catch: java.lang.Throwable -> L31
            r0.f17486t = r11     // Catch: java.lang.Throwable -> L31
            r0.f17487u = r2     // Catch: java.lang.Throwable -> L31
            r0.f17490x = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r12.p(r0)     // Catch: java.lang.Throwable -> L31
            if (r12 != r1) goto La9
        La8:
            return r1
        La9:
            r0 = r11
        Laa:
            r0.recordingStarted = r4     // Catch: java.lang.Throwable -> L31
            gt.n$a r12 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r12 = ot.b.a(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = gt.n.b(r12)     // Catch: java.lang.Throwable -> L31
            return r12
        Lb7:
            gt.n$a r0 = gt.n.INSTANCE
            java.lang.Object r12 = gt.o.a(r12)
            java.lang.Object r12 = gt.n.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.x0(mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(@org.jetbrains.annotations.NotNull mt.b<? super gt.n<? extends java.io.File>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof fn.s.r
            if (r0 == 0) goto L13
            r0 = r11
            fn.s$r r0 = (fn.s.r) r0
            int r1 = r0.f17495v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17495v = r1
            goto L18
        L13:
            fn.s$r r0 = new fn.s$r
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f17493t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f17495v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            gt.o.b(r11)
            goto Lac
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            gt.o.b(r11)
            goto L6a
        L3a:
            gt.o.b(r11)
            boolean r11 = r10.recordingStarted
            if (r11 != 0) goto L51
            gt.n$a r11 = gt.n.INSTANCE
            dn.h0 r11 = new dn.h0
            r11.<init>()
            java.lang.Object r11 = gt.o.a(r11)
            java.lang.Object r11 = gt.n.b(r11)
            return r11
        L51:
            r11 = 0
            r10.recordingStarted = r11
            boolean r11 = r10.useImageReaderRecorder
            if (r11 == 0) goto La1
            ju.l0 r11 = ju.g1.a()
            fn.s$s r2 = new fn.s$s
            r2.<init>(r3)
            r0.f17495v = r5
            java.lang.Object r11 = ju.i.g(r11, r2, r0)
            if (r11 != r1) goto L6a
            goto Lab
        L6a:
            gn.f$e r11 = (gn.f.e) r11
            if (r11 == 0) goto L83
            java.lang.Throwable r0 = r11.getVideoError()
            if (r0 == 0) goto L83
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r4 = r10.trackingEventsLogger
            fn.l r6 = new fn.l
            r6.<init>()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "camera"
            r7 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r4, r5, r6, r7, r8, r9)
        L83:
            if (r11 == 0) goto L9a
            java.lang.Throwable r0 = r11.getAudioError()
            if (r0 == 0) goto L9a
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r4 = r10.trackingEventsLogger
            fn.m r6 = new fn.m
            r6.<init>()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "camera"
            r7 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r4, r5, r6, r7, r8, r9)
        L9a:
            if (r11 == 0) goto Laf
            java.io.File r3 = r11.getFile()
            goto Laf
        La1:
            fn.r0 r11 = r10.mediaRecorderWrapper
            r0.f17495v = r4
            java.lang.Object r11 = r11.q(r0)
            if (r11 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r3 = r11
            java.io.File r3 = (java.io.File) r3
        Laf:
            if (r3 != 0) goto Lc3
            gt.n$a r11 = gt.n.INSTANCE
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Recording failed."
            r11.<init>(r0)
            java.lang.Object r11 = gt.o.a(r11)
            java.lang.Object r11 = gt.n.b(r11)
            return r11
        Lc3:
            java.lang.Object r11 = gt.n.b(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.z0(mt.b):java.lang.Object");
    }
}
