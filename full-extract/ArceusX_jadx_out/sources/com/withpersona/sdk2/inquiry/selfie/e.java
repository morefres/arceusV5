package com.withpersona.sdk2.inquiry.selfie;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dn.n0;
import ju.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0012\u0016\u0014B=\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020\t*\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Ltr/h;", "Lat/a;", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Loq/c;", "sdkFilesManager", "<init>", "(Lat/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;)V", "otherWorker", "c", "(Lwm/o;)Z", ve.a.f33391e, "(Ltr/h;)Z", j6.b.f21518e, "Lmu/h;", "run", "()Lmu/h;", "Lin/c;", "Lin/a;", "pose", "", "l", "(Lin/c;Lin/a;)F", "Lat/a;", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", rl.d.f30696a, "Z", "e", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "f", "Loq/c;", "", "g", "I", "numRetries", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "m", "(Lcom/withpersona/sdk2/camera/ImageLightCondition;)Z", "isLowLight", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements wm.o<c>, tr.h<c> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final at.a<n0> selfieDirectionFeed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PoseInfo poseInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean captureOnPoseDetected;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g selfieEventLogger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int numRetries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "poseInfo", "", "captureOnPoseDetected", "Lcom/withpersona/sdk2/inquiry/selfie/e;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        e a(@NotNull g selfieEventLogger, @NotNull PoseInfo poseInfo, boolean captureOnPoseDetected);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "<init>", "()V", ve.a.f33391e, "c", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "c", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", j6.b.f21518e, "F", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", rl.d.f30696a, "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Selfie selfie;

            /* renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            public a(@Nullable Selfie selfie, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, boolean z10) {
                super(null);
                this.selfie = selfie;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* renamed from: b, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* renamed from: c, reason: from getter */
            public final Selfie getSelfie() {
                return this.selfie;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", ve.a.f33391e, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/e$c;", "Lin/b;", "error", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "isDimLightConditions", "<init>", "(Lin/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Z)V", ve.a.f33391e, "Lin/b;", j6.b.f21518e, "()Lin/b;", "F", "c", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", rl.d.f30696a, "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.e$c$c, reason: collision with other inner class name */
        public static final class C0245c extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final in.b error;

            /* renamed from: b, reason: from kotlin metadata */
            public final float poseScore;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0245c(@NotNull in.b error, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.isDimLightConditions = z10;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final in.b getError() {
                return this.error;
            }

            /* renamed from: c, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
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
        public static final /* synthetic */ int[] f12996a;

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
            f12996a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.e$e, reason: collision with other inner class name */
    public static final class C0246e implements mu.h<c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f12997a;
        public final /* synthetic */ e b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a */
        public static final class a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ mu.i f12998a;
            public final /* synthetic */ e b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "SelfieAnalyzeWorker.kt", l = {105, 124}, m = "emit")
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.e$e$a$a, reason: collision with other inner class name */
            public static final class C0247a extends ot.d {
                public Object A;
                public Object B;
                public Object C;
                public Object D;
                public Object E;
                public int F;
                public int G;
                public int H;
                public int I;
                public boolean J;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f12999t;

                /* renamed from: u, reason: collision with root package name */
                public int f13000u;

                /* renamed from: v, reason: collision with root package name */
                public Object f13001v;

                /* renamed from: x, reason: collision with root package name */
                public Object f13003x;

                /* renamed from: y, reason: collision with root package name */
                public Object f13004y;

                /* renamed from: z, reason: collision with root package name */
                public Object f13005z;

                public C0247a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f12999t = obj;
                    this.f13000u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(mu.i iVar, e eVar) {
                this.f12998a = iVar;
                this.b = eVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x01dd, code lost:
            
                if (r15.emit(r8, r0) == r1) goto L60;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x019e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x01af  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
            /* JADX WARN: Type inference failed for: r2v0, types: [in.c, int] */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, mt.b r15) {
                /*
                    Method dump skipped, instructions count: 505
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.e.C0246e.a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public C0246e(mu.h hVar, e eVar) {
            this.f12997a = hVar;
            this.b = eVar;
        }

        @Override // mu.h
        public Object collect(mu.i<? super c> iVar, mt.b bVar) {
            Object collect = this.f12997a.collect(new a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    public e(@NotNull at.a<n0> selfieDirectionFeed, @NotNull PoseInfo poseInfo, boolean z10, @NotNull g selfieEventLogger, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(poseInfo, "poseInfo");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.poseInfo = poseInfo;
        this.captureOnPoseDetected = z10;
        this.selfieEventLogger = selfieEventLogger;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(eVar.poseInfo, this.poseInfo) && eVar.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof e;
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(eVar.poseInfo, this.poseInfo) && eVar.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    public final float l(in.c cVar, in.a aVar) {
        float min;
        if (cVar.getFacesInFrame() != 1) {
            return 0.0f;
        }
        int i10 = d.f12996a[aVar.ordinal()];
        if (i10 == 1) {
            boolean z10 = (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar()) ? false : true;
            boolean isFaceCentered = cVar.getIsFaceCentered();
            float i11 = kotlin.ranges.d.i((Math.abs(cVar.getFaceAngleY()) - 10.0f) / 90.0f, 0.0f, 1.0f);
            float f10 = z10 ? 0.33f : 0.0f;
            if (isFaceCentered) {
                f10 += 0.17f;
            }
            return i11 > 0.0f ? f10 + (i11 * 0.5f) : f10;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new gt.l();
                    }
                    if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    min = Math.min(Math.abs(((-5.0f) - cVar.getFaceAngleX()) / (-5.0f)), 1.0f);
                } else {
                    if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                        return 0.0f;
                    }
                    min = Math.min(Math.abs((10.0f - cVar.getFaceAngleX()) / 10.0f), 1.0f);
                }
            } else {
                if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                    return 0.0f;
                }
                min = Math.min(Math.abs(((-15.0f) - cVar.getFaceAngleY()) / (-15.0f)), 1.0f);
            }
        } else {
            if (cVar.getIsFaceTooClose() || cVar.getIsFaceTooFar() || !cVar.getIsFaceCentered()) {
                return 0.0f;
            }
            min = Math.min(Math.abs((15.0f - cVar.getFaceAngleY()) / 15.0f), 1.0f);
        }
        return 1.0f - min;
    }

    public final boolean m(ImageLightCondition imageLightCondition) {
        if (imageLightCondition == null) {
            return false;
        }
        return (imageLightCondition.getLuminosity() < 0.34d && !((imageLightCondition.getRmsContrast() > 0.3d ? 1 : (imageLightCondition.getRmsContrast() == 0.3d ? 0 : -1)) > 0 && (imageLightCondition.getLowHighContrast() > 0.5d ? 1 : (imageLightCondition.getLowHighContrast() == 0.5d ? 0 : -1)) > 0)) || (imageLightCondition.getLuminosity() < 0.45d && ((imageLightCondition.getRmsContrast() > 0.2d ? 1 : (imageLightCondition.getRmsContrast() == 0.2d ? 0 : -1)) < 0 || (imageLightCondition.getLowHighContrast() > 0.2d ? 1 : (imageLightCondition.getLowHighContrast() == 0.2d ? 0 : -1)) < 0));
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<c> run() {
        n0 n0Var = this.selfieDirectionFeed.get();
        Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
        return mu.j.y(new C0246e(mu.j.n(n0Var, 1), this), g1.a());
    }
}
