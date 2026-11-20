package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import dn.d0;
import dn.h0;
import dn.l0;
import dn.m0;
import dn.v;
import dn.v0;
import dq.l2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.i0;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00140\u0004R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\u0006*\u00160\u0004R\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001f\u001a\u00020\u001e*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001aM\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"j\u0002`$*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\b\u0002\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010&\u001aO\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2&\u0010)\u001a\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0001H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020\nH\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00103\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00107\u001a\u000206*\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010B\u001a\u0004\u0018\u00010\u000e*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "B", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lwm/r$c;", "Lwm/r;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "addCurrentState", "k", "(Lwm/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "D", "(Lwm/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Lsr/a;", "webRtcManagerBridge", "", "x", "(Lwm/k$a;Lsr/a;)V", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "m", "(Lwm/k$a;Z)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "renderContext", "renderProps", "useVideoCapture", "z", "(Landroid/content/Context;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "Lin/a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "G", "(Lin/a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "F", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Ljava/lang/String;", "centerSelfieFilePath", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13067a;
        public static final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13068c;

        static {
            int[] iArr = new int[SelfieWorkflow.c.C0240c.EnumC0243c.values().length];
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12806a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12807c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12808d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12809e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12810f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12811g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12812h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12813i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12814j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12815k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12816l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12817m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12818n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12819o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12820p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12821q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.c.C0240c.EnumC0243c.f12822r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f13067a = iArr;
            int[] iArr2 = new int[in.a.values().length];
            try {
                iArr2[in.a.f20965a.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[in.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[in.a.f20966c.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[in.a.f20967d.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[in.a.f20968e.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            b = iArr2;
            int[] iArr3 = new int[Selfie.a.values().length];
            try {
                iArr3[Selfie.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Selfie.a.f12465c.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f13068c = iArr3;
        }
    }

    public static final Unit A(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.c();
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            action.e(SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, !list.contains(i0.f28911a), !list.contains(i0.b), null, null, null, false, null, false, 252, null));
        } else {
            l2.c((SelfieState) action.c());
            action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
        }
        return Unit.f22894a;
    }

    public static final boolean B(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        return (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable();
    }

    @NotNull
    public static final SelfieWorkflow.c.C0240c.AssetOverrides C(@NotNull SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.c.C0240c.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    @NotNull
    public static final SelfieState D(@NotNull r<? super SelfieWorkflow.Input, SelfieState, ?>.c cVar, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? cVar.b().getPoseConfigs().a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, cVar.c().getCameraFacingMode(), 0, null, 192, null);
        }
        return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, cVar.c().getCameraFacingMode());
    }

    @NotNull
    public static final SelfieWorkflow.c.a.b E(@NotNull SelfieWorkflow.c.C0240c.EnumC0243c enumC0243c) {
        Intrinsics.checkNotNullParameter(enumC0243c, "<this>");
        switch (a.f13067a[enumC0243c.ordinal()]) {
            case 1:
                return SelfieWorkflow.c.a.b.f12738a;
            case 2:
            case 3:
                return SelfieWorkflow.c.a.b.b;
            case 4:
            case 5:
            case 6:
                return SelfieWorkflow.c.a.b.f12739c;
            case 7:
            case 8:
            case 9:
                return SelfieWorkflow.c.a.b.f12740d;
            case 10:
            case 11:
            case 12:
                return SelfieWorkflow.c.a.b.f12741e;
            case 13:
            case 14:
            case 15:
                return SelfieWorkflow.c.a.b.f12742f;
            case 16:
                return SelfieWorkflow.c.a.b.f12743g;
            case 17:
                return SelfieWorkflow.c.a.b.f12738a;
            case 18:
                return SelfieWorkflow.c.a.b.f12738a;
            default:
                throw new gt.l();
        }
    }

    @NotNull
    public static final SelfieCaptureMethod F(@NotNull Selfie.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f13068c[aVar.ordinal()];
        if (i10 == 1) {
            return SelfieCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return SelfieCaptureMethod.MANUAL;
        }
        throw new gt.l();
    }

    @NotNull
    public static final SelfiePoseType G(@NotNull in.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.b[aVar.ordinal()];
        if (i10 == 1) {
            return SelfiePoseType.CENTER;
        }
        if (i10 == 2) {
            return SelfiePoseType.LEFT;
        }
        if (i10 == 3) {
            return SelfiePoseType.RIGHT;
        }
        if (i10 == 4) {
            return SelfiePoseType.UP;
        }
        if (i10 == 5) {
            return SelfiePoseType.DOWN;
        }
        throw new gt.l();
    }

    public static final boolean H(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if ((selfieState instanceof SelfieState.Capture) || (selfieState instanceof SelfieState.CaptureTransition) || (selfieState instanceof SelfieState.CountdownToCapture) || (selfieState instanceof SelfieState.CountdownToManualCapture) || (selfieState instanceof SelfieState.ShowPoseHint) || (selfieState instanceof SelfieState.StartCapture) || (selfieState instanceof SelfieState.StartCaptureFaceDetected) || (selfieState instanceof SelfieState.WaitForCameraFeed) || (selfieState instanceof SelfieState.WaitForWebRtcSetup) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished) || (selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.AcquireNextPose)) {
            return true;
        }
        if ((selfieState instanceof SelfieState.ShowInstructions) || (selfieState instanceof SelfieState.RestartCamera) || (selfieState instanceof SelfieState.ReviewCaptures) || (selfieState instanceof SelfieState.Submit)) {
            return false;
        }
        throw new gt.l();
    }

    @Nullable
    public static final SelfieState k(@NotNull r<?, SelfieState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ SelfieState l(r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> m(@NotNull final wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: wp.f5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = com.withpersona.sdk2.inquiry.selfie.p.o(k.a.this, z10, (Throwable) obj);
                return o8;
            }
        };
    }

    public static /* synthetic */ Function1 n(k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m(aVar, z10);
    }

    public static final Unit o(k.a aVar, final boolean z10, final Throwable cameraError) {
        r c10;
        r c11;
        r c12;
        r c13;
        r c14;
        r c15;
        r c16;
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof dn.h)) {
            wm.h d10 = aVar.d();
            c16 = b0.c(null, new Function1() { // from class: wp.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit p8;
                    p8 = com.withpersona.sdk2.inquiry.selfie.p.p(cameraError, (r.c) obj);
                    return p8;
                }
            }, 1, null);
            d10.a(c16);
            return Unit.f22894a;
        }
        dn.h hVar = (dn.h) cameraError;
        if (!(hVar instanceof h0)) {
            if (hVar instanceof dn.i0) {
                wm.h d11 = aVar.d();
                c15 = b0.c(null, new Function1() { // from class: wp.i5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit q10;
                        q10 = com.withpersona.sdk2.inquiry.selfie.p.q((r.c) obj);
                        return q10;
                    }
                }, 1, null);
                d11.a(c15);
            } else if (hVar instanceof d0) {
                wm.h d12 = aVar.d();
                c14 = b0.c(null, new Function1() { // from class: wp.j5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit r8;
                        r8 = com.withpersona.sdk2.inquiry.selfie.p.r((r.c) obj);
                        return r8;
                    }
                }, 1, null);
                d12.a(c14);
            } else if (hVar instanceof m0) {
                wm.h d13 = aVar.d();
                c13 = b0.c(null, new Function1() { // from class: wp.k5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit s8;
                        s8 = com.withpersona.sdk2.inquiry.selfie.p.s(z10, (r.c) obj);
                        return s8;
                    }
                }, 1, null);
                d13.a(c13);
            } else if (hVar instanceof v) {
                wm.h d14 = aVar.d();
                c12 = b0.c(null, new Function1() { // from class: wp.l5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit t8;
                        t8 = com.withpersona.sdk2.inquiry.selfie.p.t((r.c) obj);
                        return t8;
                    }
                }, 1, null);
                d14.a(c12);
            } else if (hVar instanceof v0) {
                wm.h d15 = aVar.d();
                c11 = b0.c(null, new Function1() { // from class: wp.m5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit u8;
                        u8 = com.withpersona.sdk2.inquiry.selfie.p.u((r.c) obj);
                        return u8;
                    }
                }, 1, null);
                d15.a(c11);
            } else {
                if (!(hVar instanceof l0)) {
                    throw new gt.l();
                }
                wm.h d16 = aVar.d();
                c10 = b0.c(null, new Function1() { // from class: wp.n5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit v5;
                        v5 = com.withpersona.sdk2.inquiry.selfie.p.v(z10, (r.c) obj);
                        return v5;
                    }
                }, 1, null);
                d16.a(c10);
            }
        }
        return Unit.f22894a;
    }

    public static final Unit p(Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f22894a;
    }

    public static final Unit q(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f22894a;
    }

    public static final Unit r(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f22894a;
    }

    public static final Unit s(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            l2.c((SelfieState) action.c());
            if (H((SelfieState) action.c())) {
                action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f22894a;
    }

    public static final Unit t(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f22894a;
    }

    public static final Unit u(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f22894a;
    }

    public static final Unit v(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            l2.c((SelfieState) action.c());
            if (H((SelfieState) action.c())) {
                action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f22894a;
    }

    @Nullable
    public static final String w(@NotNull SelfieState.Submit submit) {
        Object obj;
        Intrinsics.checkNotNullParameter(submit, "<this>");
        List<Selfie> w5 = submit.w();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : w5) {
            if (obj2 instanceof Selfie.SelfieImage) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((Selfie.SelfieImage) obj).getPose() == in.a.f20965a) {
                break;
            }
        }
        Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) obj;
        if (selfieImage != null) {
            return selfieImage.getAbsoluteFilePath();
        }
        return null;
    }

    public static final void x(@NotNull wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, @Nullable final sr.a aVar2) {
        r<? super Object, SelfieState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        wm.h<r<? super Object, SelfieState, ? extends Object>> d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: wp.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y10;
                y10 = com.withpersona.sdk2.inquiry.selfie.p.y(sr.a.this, (r.c) obj);
                return y10;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit y(sr.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState backState = ((SelfieState) action.c()).getBackState();
        if (aVar != null) {
            aVar.e();
        }
        if (backState != null) {
            backState.x(true);
            action.e(backState);
        } else if (((SelfieWorkflow.Input) action.b()).getBackStepEnabled()) {
            action.d(SelfieWorkflow.b.a.f12686a);
        } else {
            action.d(SelfieWorkflow.b.C0236b.f12687a);
        }
        return Unit.f22894a;
    }

    public static final void z(@NotNull Context context, @NotNull wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        r<? super Object, SelfieState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List p8 = kotlin.collections.p.p(i0.f28911a);
        if (z10 && hq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            p8.add(i0.b);
        }
        final List<i0> a10 = com.withpersona.sdk2.inquiry.permissions.g.a(context, p8);
        if (a10.isEmpty()) {
            return;
        }
        wm.h<r<? super Object, SelfieState, ? extends Object>> d10 = renderContext.d();
        c10 = b0.c(null, new Function1() { // from class: wp.g5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit A;
                A = com.withpersona.sdk2.inquiry.selfie.p.A(a10, (r.c) obj);
                return A;
            }
        }, 1, null);
        d10.a(c10);
    }
}
