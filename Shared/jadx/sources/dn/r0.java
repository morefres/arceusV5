package dn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.FaceLandmark;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import dn.p0;
import hn.ViewfinderInfo;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0003TC,B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0013\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00100J/\u00108\u001a\u0002072\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020 H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@J+\u0010C\u001a\u0004\u0018\u00010>2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bH\u0010GJ\u001b\u0010I\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010GJ#\u0010L\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 2\u0006\u0010K\u001a\u000207H\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020\t*\u00020N2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010R\u001a\u00020 *\u00020QH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010WR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010YR\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0016\u0010`\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0014\u0010b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bi\u0010k¨\u0006m"}, d2 = {"Ldn/r0;", "", "Leo/e;", "featureFlagManager", "<init>", "(Leo/e;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "u", "(DDZ)V", "Ldn/r0$c;", "pose", "v", "(Ldn/r0$c;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "Lin/c;", rl.d.f30696a, "(Landroid/media/Image;I)Lin/c;", "Landroidx/camera/core/d;", "e", "(Landroidx/camera/core/d;)Lin/c;", "Ldn/z;", "imageToAnalyze", "f", "(Ldn/z;)Lin/c;", "Landroid/graphics/Rect;", "rect", "previewRect", "w", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "viewfinderRect", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "k", "(Ldn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "x", "y", "angleInDegrees", j6.b.f21518e, "(III)I", "degrees", "i", "(I)I", "h", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "imageWidth", "imageHeight", "region", "", "n", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)F", "Ldn/r0$b;", Payload.TYPE, "Landroid/graphics/Bitmap;", "bitmap", "Ldn/p0;", "m", "(Ldn/r0$b;Landroid/graphics/Bitmap;)Ldn/p0;", "poseType", "cropRect", "c", "(Ldn/z;Ldn/r0$b;Landroid/graphics/Rect;)Ldn/p0;", "imageRect", "p", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "q", "r", "s", "faceAngleY", zl.t.f38095d, "(Landroid/graphics/Rect;Landroid/graphics/Rect;F)Z", "Lcom/google/mlkit/vision/face/Face;", "o", "(Lcom/google/mlkit/vision/face/Face;Landroid/graphics/Rect;)Z", "Lcom/google/mlkit/vision/common/InputImage;", "j", "(Lcom/google/mlkit/vision/common/InputImage;)Landroid/graphics/Rect;", ve.a.f33391e, "Leo/e;", "Len/k;", "Len/k;", "lightConditionAnalyzer", "D", "Z", "Lhn/c;", "Lhn/c;", "viewfinderInfo", "g", "Ldn/r0$c;", "targetPose", "useOldFaceCenteredDetector", "relaxedSidePoseDistance", "Landroid/graphics/Rect;", "tempRect", "", "[B", "byteArr", "Lcom/google/mlkit/vision/face/FaceDetector;", "l", "Lgt/h;", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final en.k lightConditionAnalyzer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public double minFaceRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public double maxFaceRatio;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean analyzeLightConditions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c targetPose;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean useOldFaceCenteredDetector;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean relaxedSidePoseDistance;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Rect tempRect;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] byteArr;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h faceDetector;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ldn/r0$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15147a = new b("Center", 0);
        public static final b b = new b("Left", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f15148c = new b("Right", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f15149d = new b("Up", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final b f15150e = new b("Down", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f15151f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ pt.a f15152g;

        static {
            b[] a10 = a();
            f15151f = a10;
            f15152g = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f15147a, b, f15148c, f15149d, f15150e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f15151f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Ldn/r0$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "g", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15153a = new c("Center", 0);
        public static final c b = new c("Left", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f15154c = new c("Right", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f15155d = new c("Up", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final c f15156e = new c("Down", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final c f15157f = new c("All", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final c f15158g = new c("None", 6);

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ c[] f15159h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ pt.a f15160i;

        static {
            c[] a10 = a();
            f15159h = a10;
            f15160i = pt.b.a(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f15153a, b, f15154c, f15155d, f15156e, f15157f, f15158g};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f15159h.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15161a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f15147a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f15148c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f15149d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f15150e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15161a = iArr;
        }
    }

    public r0(@NotNull eo.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.featureFlagManager = featureFlagManager;
        this.lightConditionAnalyzer = new en.k();
        this.minFaceRatio = 0.35d;
        this.maxFaceRatio = 0.8d;
        this.targetPose = c.f15157f;
        this.useOldFaceCenteredDetector = featureFlagManager.a(eo.c0.f16095a);
        this.relaxedSidePoseDistance = featureFlagManager.a(eo.x.f16123a);
        this.tempRect = new Rect();
        this.byteArr = new byte[32768];
        this.faceDetector = gt.i.b(new Function0() { // from class: dn.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FaceDetector g10;
                g10 = r0.g();
                return g10;
            }
        });
    }

    public static final FaceDetector g() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.35f).setLandmarkMode(2).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    public final int b(int x10, int y10, int angleInDegrees) {
        int i10 = x10 - 1;
        int i11 = y10 - 1;
        return (((i11 * h(angleInDegrees)) + (i10 * i(angleInDegrees)) + 1) * 3) + ((h(angleInDegrees) * i10) - (i(angleInDegrees) * i11)) + 1;
    }

    public final p0 c(z imageToAnalyze, b poseType, Rect cropRect) {
        Bitmap f10 = cropRect != null ? imageToAnalyze.f(cropRect) : imageToAnalyze.e();
        if (f10 != null) {
            return m(poseType, f10);
        }
        return null;
    }

    @NotNull
    public final in.c d(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        return f(c0.e(image, rotationDegrees));
    }

    @NotNull
    public final in.c e(@NotNull androidx.camera.core.d image) {
        Intrinsics.checkNotNullParameter(image, "image");
        z f10 = c0.f(image);
        return f10 == null ? new in.c(null, in.b.f20978i, 0, false, false, false, 0.0f, 0.0f, 0.0f, null, null, null) : f(f10);
    }

    @NotNull
    public final in.c f(@NotNull z imageToAnalyze) {
        boolean p8;
        in.b bVar;
        in.a aVar;
        p0 c10;
        in.b bVar2;
        in.b bVar3;
        p0 p0Var;
        in.a aVar2;
        in.a aVar3;
        in.b bVar4;
        p0 c11;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        Rect a10 = viewfinderInfo != null ? hn.d.a(viewfinderInfo, imageToAnalyze) : null;
        InputImage g10 = imageToAnalyze.g();
        Rect j10 = j(g10);
        SelfieBrightnessInfo k10 = k(imageToAnalyze, a10);
        Rect b10 = a10 != null ? hn.d.b(a10, g10.getRotationDegrees()) : null;
        Task<List<Face>> process = l().process(g10);
        Intrinsics.checkNotNullExpressionValue(process, "process(...)");
        ImageLightCondition b11 = this.analyzeLightConditions ? this.lightConditionAnalyzer.b(imageToAnalyze, a10) : null;
        try {
            List<Face> result = process.getResult();
            if (result.isEmpty()) {
                return new in.c(null, in.b.f20975f, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, k10, null, b11);
            }
            if (result.size() > 1) {
                return new in.c(null, in.b.f20973d, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, k10, null, b11);
            }
            Intrinsics.checkNotNull(result);
            Face face = (Face) CollectionsKt.d0(result);
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            boolean s8 = s(boundingBox, b10 == null ? j10 : b10);
            Rect boundingBox2 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
            boolean t8 = t(boundingBox2, b10 == null ? j10 : b10, face.getHeadEulerAngleY());
            if (this.useOldFaceCenteredDetector) {
                Rect boundingBox3 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox3, "getBoundingBox(...)");
                p8 = q(boundingBox3, b10 == null ? j10 : b10);
            } else {
                Rect boundingBox4 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox4, "getBoundingBox(...)");
                p8 = p(boundingBox4, b10 == null ? j10 : b10);
            }
            boolean z10 = p8;
            Rect boundingBox5 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox5, "getBoundingBox(...)");
            if (b10 == null) {
                b10 = j10;
            }
            boolean r8 = r(boundingBox5, b10);
            float headEulerAngleY = face.getHeadEulerAngleY();
            float headEulerAngleX = face.getHeadEulerAngleX();
            float headEulerAngleZ = face.getHeadEulerAngleZ();
            if (s8) {
                bVar = in.b.b;
            } else if (t8) {
                bVar = in.b.f20972c;
            } else if (!z10) {
                bVar = in.b.f20971a;
            } else {
                if (r8) {
                    if (-10.0f >= headEulerAngleY || headEulerAngleY >= 10.0f) {
                        if (headEulerAngleY < -15.0f) {
                            aVar = in.a.f20966c;
                            c cVar = this.targetPose;
                            if (cVar == c.f15154c || cVar == c.f15157f) {
                                c10 = c(imageToAnalyze, b.f15148c, a10);
                                p0Var = c10;
                                bVar3 = null;
                            } else {
                                bVar2 = in.b.f20976g;
                                bVar3 = bVar2;
                                p0Var = null;
                            }
                        } else if (15.0f < headEulerAngleY) {
                            aVar = in.a.b;
                            c cVar2 = this.targetPose;
                            if (cVar2 == c.b || cVar2 == c.f15157f) {
                                c10 = c(imageToAnalyze, b.b, a10);
                                p0Var = c10;
                                bVar3 = null;
                            } else {
                                bVar2 = in.b.f20976g;
                                bVar3 = bVar2;
                                p0Var = null;
                            }
                        } else {
                            bVar = in.b.f20976g;
                        }
                        aVar2 = aVar;
                    } else {
                        Intrinsics.checkNotNull(face);
                        if (o(face, j10)) {
                            c cVar3 = this.targetPose;
                            if (cVar3 == c.f15153a || cVar3 == c.f15157f) {
                                aVar = in.a.f20965a;
                                c10 = c(imageToAnalyze, b.f15147a, a10);
                                p0Var = c10;
                                bVar3 = null;
                                aVar2 = aVar;
                            } else {
                                if (headEulerAngleX > 10.0f) {
                                    aVar3 = in.a.f20967d;
                                    if (cVar3 == c.f15155d) {
                                        c11 = c(imageToAnalyze, b.f15149d, a10);
                                        p0Var = c11;
                                        bVar3 = null;
                                    } else {
                                        bVar4 = in.b.f20976g;
                                        bVar3 = bVar4;
                                        p0Var = null;
                                    }
                                } else if (headEulerAngleX < -5.0f) {
                                    aVar3 = in.a.f20968e;
                                    if (cVar3 == c.f15156e) {
                                        c11 = c(imageToAnalyze, b.f15150e, a10);
                                        p0Var = c11;
                                        bVar3 = null;
                                    } else {
                                        bVar4 = in.b.f20976g;
                                        bVar3 = bVar4;
                                        p0Var = null;
                                    }
                                } else {
                                    aVar2 = in.a.f20965a;
                                    bVar3 = in.b.f20976g;
                                    p0Var = null;
                                }
                                aVar2 = aVar3;
                            }
                        } else {
                            bVar = in.b.f20971a;
                        }
                    }
                    return new in.c(p0Var, bVar3, result.size(), s8, t8, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, k10, aVar2, b11);
                }
                bVar = in.b.f20974e;
            }
            bVar3 = bVar;
            p0Var = null;
            aVar2 = null;
            return new in.c(p0Var, bVar3, result.size(), s8, t8, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, k10, aVar2, b11);
        } catch (ExecutionException unused) {
            return new in.c(null, in.b.f20977h, 0, false, false, false, 0.0f, 0.0f, 0.0f, k10, null, b11);
        }
    }

    public final int h(int degrees) {
        return i(degrees + 90);
    }

    public final int i(int degrees) {
        int abs = Math.abs(degrees / 90) % 4;
        if (abs == 0) {
            return 0;
        }
        if (abs == 1) {
            return 1;
        }
        if (abs == 2) {
            return 0;
        }
        if (abs == 3) {
            return -1;
        }
        throw new IllegalStateException("unreachable");
    }

    public final Rect j(InputImage inputImage) {
        return (inputImage.getRotationDegrees() == 90 || inputImage.getRotationDegrees() == 270) ? new Rect(0, 0, inputImage.getHeight(), inputImage.getWidth()) : new Rect(0, 0, inputImage.getWidth(), inputImage.getHeight());
    }

    public final SelfieBrightnessInfo k(z image, Rect viewfinderRect) {
        Image.Plane plane;
        int width = image.getImage().getWidth();
        int height = image.getImage().getHeight();
        Image.Plane[] planes = image.getImage().getPlanes();
        if (width == 0 || height == 0 || planes == null || (plane = planes[0]) == null) {
            return null;
        }
        ByteBuffer buffer = plane.getBuffer();
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        viewfinderRect.width();
        int width2 = viewfinderRect.width() / 3;
        int height2 = viewfinderRect.height() / 3;
        Rect rect = this.tempRect;
        int i10 = viewfinderRect.left;
        int i11 = viewfinderRect.top;
        rect.set(i10, i11, i10 + width2, i11 + height2);
        Float[] fArr = new Float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            fArr[i12] = Float.valueOf(0.0f);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            for (int i14 = 0; i14 < 3; i14++) {
                int b10 = b(i14, i13, image.getRotationDegrees());
                Intrinsics.checkNotNull(buffer);
                fArr[b10] = Float.valueOf(n(buffer, width, height, this.tempRect));
                Rect rect2 = this.tempRect;
                rect2.left += width2;
                rect2.right += width2;
            }
            Rect rect3 = this.tempRect;
            rect3.left = viewfinderRect.left;
            rect3.right = viewfinderRect.left + width2;
            rect3.top += height2;
            rect3.bottom += height2;
        }
        buffer.rewind();
        return new SelfieBrightnessInfo(fArr);
    }

    public final FaceDetector l() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    public final p0 m(b type, Bitmap bitmap) {
        int i10 = d.f15161a[type.ordinal()];
        if (i10 == 1) {
            return new p0.a(bitmap);
        }
        if (i10 == 2) {
            return new p0.c(bitmap);
        }
        if (i10 == 3) {
            return new p0.d(bitmap);
        }
        if (i10 == 4) {
            return new p0.e(bitmap);
        }
        if (i10 == 5) {
            return new p0.b(bitmap);
        }
        throw new gt.l();
    }

    public final float n(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        yPlaneBuffer.rewind();
        int width = region.width();
        int height = region.height() * width;
        if (width > 32768) {
            return 0.0f;
        }
        kotlin.ranges.a p8 = kotlin.ranges.d.p(kotlin.ranges.d.q(region.top, region.bottom), 2);
        int first = p8.getFirst();
        int last = p8.getLast();
        int step = p8.getStep();
        long j10 = 0;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                yPlaneBuffer.position((first * imageWidth) + region.left);
                yPlaneBuffer.get(this.byteArr, 0, width);
                for (int i10 = 0; i10 < width; i10++) {
                    j10 += this.byteArr[i10] & 255;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return ((j10 / height) / 255.0f) * 2;
    }

    public final boolean o(Face face, Rect rect) {
        int width = rect.width();
        int height = rect.height();
        FaceLandmark landmark = face.getLandmark(6);
        if (landmark == null) {
            return false;
        }
        double d10 = width / 2;
        double min = (Math.min(width, height) * 0.4d) / 2;
        double d11 = height / 2;
        return new Rect((int) (d10 - min), (int) (d11 - min), (int) (d10 + min), (int) (d11 + min)).contains((int) landmark.getPosition().x, (int) landmark.getPosition().y);
    }

    public final boolean p(Rect rect, Rect rect2) {
        return ((double) Math.abs(rect2.centerX() - rect.centerX())) / ((double) rect2.width()) <= 0.3d;
    }

    public final boolean q(Rect rect, Rect rect2) {
        int width = rect2.width();
        int height = rect2.height();
        int i10 = width / 2;
        int i11 = height / 2;
        int min = Math.min(width, height) / 2;
        Rect rect3 = new Rect(0, 0, width, height);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(kotlin.ranges.d.c(rect2.width() - rect.right, 1) - kotlin.ranges.d.c(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i10 - min && rect.right < i10 + min && rect.top > i11 - min && rect.bottom < i11 + min;
    }

    public final boolean r(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2);
        rect3.inset(25, 25);
        return rect3.contains(rect);
    }

    public final boolean s(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * this.maxFaceRatio;
    }

    public final boolean t(Rect rect, Rect rect2, float f10) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * (this.minFaceRatio - ((!this.relaxedSidePoseDistance || !((f10 > (-15.0f) ? 1 : (f10 == (-15.0f) ? 0 : -1)) < 0 || (f10 > 15.0f ? 1 : (f10 == 15.0f ? 0 : -1)) > 0)) ? 0.0d : 0.05d));
    }

    public final void u(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.minFaceRatio = minFaceRatio;
        this.maxFaceRatio = maxFaceRatio;
        this.analyzeLightConditions = analyzeLightConditions;
    }

    public final void v(@NotNull c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.targetPose = pose;
    }

    public final void w(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }
}
