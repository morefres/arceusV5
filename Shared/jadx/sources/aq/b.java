package aq;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import gt.n;
import iv.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import tr.h;
import wm.o;
import zl.t;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004A-+>BË\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020*2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016¢\u0006\u0004\b0\u00101J0\u0010:\u001a\b\u0012\u0004\u0012\u00020908*\u0002022\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u000209*\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010@R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010@R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, d2 = {"Laq/b;", "Lwm/o;", "Laq/b$d;", "Ltr/h;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Laq/a;", NotificationCompat.CATEGORY_SERVICE, "fromStep", "fromComponent", "fieldKeySelfie", "Lkq/a;", "dataCollector", "Lco/a;", "fallbackModeManager", "Lpq/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Ljn/a;", "cameraStatsManager", "", "startSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "fileUploadUrl", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lbq/a;", "selfiePoseManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Laq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkq/a;Lco/a;Lpq/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Ljn/a;JLcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lbq/a;)V", "otherWorker", "", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", "Lmu/h;", "run", "()Lmu/h;", "Ljava/io/File;", "Laq/b$b;", "fileType", "", "Lokhttp3/MultipartBody$Part;", "bodyParts", "Lgt/n;", "", "y", "(Ljava/io/File;Laq/b$b;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "x", "(Lkq/a;Ljava/util/List;)V", j6.b.f21518e, "Landroid/content/Context;", "Ljava/lang/String;", rl.d.f30696a, "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "f", "Ljava/util/List;", "g", "Laq/a;", "h", "i", "j", "k", "Lkq/a;", "l", "Lco/a;", "m", "Lpq/a;", "n", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "p", "Ljn/a;", "q", "J", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", t.f38095d, "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "u", "Lbq/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements o<d>, h<d> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelfieType selfieType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Selfie> selfies;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.a service;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldKeySelfie;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.a dataCollector;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final co.a fallbackModeManager;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.a imageHelper;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String webRtcObjectId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long startSelfieTimestamp;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fileUploadUrl;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Laq/b$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "fieldKeySelfie", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "fileUploadUrl", "Lbq/a;", "selfiePoseManager", "Laq/b;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Lbq/a;)Laq/b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @NotNull SelfieType selfieType, @NotNull String fieldKeySelfie, @NotNull List<? extends Selfie> selfies, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, @Nullable String fileUploadUrl, @NotNull bq.a selfiePoseManager);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Laq/b$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: aq.b$b, reason: collision with other inner class name */
    public static final class EnumC0066b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0066b f3440a = new EnumC0066b("IMAGE", 0);
        public static final EnumC0066b b = new EnumC0066b("VIDEO", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0066b[] f3441c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ pt.a f3442d;

        static {
            EnumC0066b[] a10 = a();
            f3441c = a10;
            f3442d = pt.b.a(a10);
        }

        public EnumC0066b(String str, int i10) {
        }

        public static final /* synthetic */ EnumC0066b[] a() {
            return new EnumC0066b[]{f3440a, b};
        }

        public static EnumC0066b valueOf(String str) {
            return (EnumC0066b) Enum.valueOf(EnumC0066b.class, str);
        }

        public static EnumC0066b[] values() {
            return (EnumC0066b[]) f3441c.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laq/b$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends RuntimeException {
        public c() {
            super("File upload returned invalid response.");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Laq/b$d;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Laq/b$d$a;", "Laq/b$d$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laq/b$d$a;", "Laq/b$d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: aq.b$d$a, reason: from toString */
        public static final /* data */ class Error extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
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
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/b$d$b;", "Laq/b$d;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: aq.b$d$b, reason: collision with other inner class name */
        public static final class C0067b extends d {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0067b f3444a = new C0067b();

            public C0067b() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3445a;

        static {
            int[] iArr = new int[EnumC0066b.values().length];
            try {
                iArr[EnumC0066b.f3440a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0066b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3445a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Laq/b$d;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {85, 87, 167, 172, 174, 197, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 324, 346, 347, 349, 350}, m = "invokeSuspend")
    public static final class f extends m implements Function2<i<? super d>, mt.b<? super Unit>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public Object E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public /* synthetic */ Object K;

        /* renamed from: t, reason: collision with root package name */
        public Object f3446t;

        /* renamed from: u, reason: collision with root package name */
        public Object f3447u;

        /* renamed from: v, reason: collision with root package name */
        public Object f3448v;

        /* renamed from: w, reason: collision with root package name */
        public Object f3449w;

        /* renamed from: x, reason: collision with root package name */
        public Object f3450x;

        /* renamed from: y, reason: collision with root package name */
        public Object f3451y;

        /* renamed from: z, reason: collision with root package name */
        public Object f3452z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liv/x;", "", "<anonymous>", "()Liv/x;"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {326, 331}, m = "invokeSuspend")
        public static final class a extends m implements Function1<mt.b<? super x<? extends Object>>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f3453t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f3454u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<MultipartBody.Part> f3455v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, List<MultipartBody.Part> list, mt.b<? super a> bVar2) {
                super(1, bVar2);
                this.f3454u = bVar;
                this.f3455v = list;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new a(this.f3454u, this.f3455v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = nt.c.e()
                    int r1 = r5.f3453t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    gt.o.b(r6)
                    goto L64
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    gt.o.b(r6)
                    goto L44
                L1e:
                    gt.o.b(r6)
                    aq.b r6 = r5.f3454u
                    co.a r6 = aq.b.h(r6)
                    boolean r6 = r6.b()
                    if (r6 == 0) goto L47
                    aq.b r6 = r5.f3454u
                    co.a r6 = aq.b.h(r6)
                    aq.b r1 = r5.f3454u
                    java.lang.String r1 = aq.b.r(r1)
                    java.util.List<okhttp3.MultipartBody$Part> r2 = r5.f3455v
                    r5.f3453t = r3
                    java.lang.Object r6 = r6.a(r1, r2, r5)
                    if (r6 != r0) goto L44
                    goto L63
                L44:
                    iv.x r6 = (iv.x) r6
                    return r6
                L47:
                    aq.b r6 = r5.f3454u
                    aq.a r6 = aq.b.q(r6)
                    aq.b r1 = r5.f3454u
                    java.lang.String r1 = aq.b.r(r1)
                    aq.b r3 = r5.f3454u
                    java.lang.String r3 = aq.b.m(r3)
                    java.util.List<okhttp3.MultipartBody$Part> r4 = r5.f3455v
                    r5.f3453t = r2
                    java.lang.Object r6 = r6.a(r1, r3, r4, r5)
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    iv.x r6 = (iv.x) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: aq.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: aq.b$f$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C0068b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3456a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[in.a.values().length];
                try {
                    iArr[in.a.f20965a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[in.a.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[in.a.f20966c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[in.a.f20967d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[in.a.f20968e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f3456a = iArr;
                int[] iArr2 = new int[CameraProperties.b.values().length];
                try {
                    iArr2[CameraProperties.b.f9962c.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                b = iArr2;
            }
        }

        public f(mt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            f fVar = b.this.new f(bVar);
            fVar.K = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x0373, code lost:
        
            if (r1.emit(r4, r40) == r2) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x056d  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0645  */
        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0725  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x07f0  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0c31  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0ba2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0c2a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x02b8  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x032a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0379  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0723 -> B:40:0x07db). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x07d5 -> B:39:0x07d8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0648 -> B:41:0x0650). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instructions count: 3242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aq.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, mt.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", l = {367, 368}, m = "uploadIfNeededAndAddFileToBody-BWLJW6A")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f3457t;

        /* renamed from: u, reason: collision with root package name */
        public Object f3458u;

        /* renamed from: v, reason: collision with root package name */
        public Object f3459v;

        /* renamed from: w, reason: collision with root package name */
        public Object f3460w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f3461x;

        /* renamed from: z, reason: collision with root package name */
        public int f3463z;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3461x = obj;
            this.f3463z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object y10 = b.this.y(null, null, null, this);
            return y10 == nt.c.e() ? y10 : n.a(y10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Context context, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull SelfieType selfieType, @NotNull List<? extends Selfie> selfies, @NotNull aq.a service, @NotNull String fromStep, @NotNull String fromComponent, @NotNull String fieldKeySelfie, @NotNull kq.a dataCollector, @NotNull co.a fallbackModeManager, @NotNull pq.a imageHelper, @Nullable String str, @NotNull CameraProperties cameraProperties, @NotNull jn.a cameraStatsManager, long j10, @NotNull TrackingEventsLogger trackingEventsLogger, @Nullable String str2, @NotNull DirectFileUploader directFileUploader, @NotNull bq.a selfiePoseManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(selfieType, "selfieType");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(selfiePoseManager, "selfiePoseManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.selfieType = selfieType;
        this.selfies = selfies;
        this.service = service;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.fieldKeySelfie = fieldKeySelfie;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
        this.startSelfieTimestamp = j10;
        this.trackingEventsLogger = trackingEventsLogger;
        this.fileUploadUrl = str2;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManager = selfiePoseManager;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.sessionToken, ((b) otherWorker).sessionToken);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && Intrinsics.c(this.sessionToken, ((b) otherWorker).sessionToken);
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<d> run() {
        return j.w(new f(null));
    }

    public final void x(kq.a aVar, List<? extends Selfie> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Selfie.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            linkedHashMap.put(((Selfie.SelfieImage) obj2).getPose(), obj2);
        }
        aVar.a(new SelfieStepData(this.fromStep, (Selfie) linkedHashMap.get(in.a.f20965a), (Selfie) linkedHashMap.get(in.a.b), (Selfie) linkedHashMap.get(in.a.f20966c), (Selfie) linkedHashMap.get(in.a.f20967d), (Selfie) linkedHashMap.get(in.a.f20968e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.io.File r10, aq.b.EnumC0066b r11, java.util.List<okhttp3.MultipartBody.Part> r12, mt.b<? super gt.n<kotlin.Unit>> r13) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.b.y(java.io.File, aq.b$b, java.util.List, mt.b):java.lang.Object");
    }
}
