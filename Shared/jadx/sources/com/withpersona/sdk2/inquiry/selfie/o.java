package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import dq.l2;
import fn.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a×\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\b\u001a\"0\u0002R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109\u001a½\u0002\u0010;\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050:2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b?\u0010>\u001a\u0013\u0010A\u001a\u00020@*\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "context", "Lin/a;", "pose", "", Title.type, "message", "realTimeHint", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isDimLightConditions", "isFlashOn", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "m", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lwm/k$a;Lin/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkn/a;Lsr/a;ZLcom/withpersona/sdk2/camera/e$a;Lfn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Ltr/f;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Ltr/f;Lin/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkn/a;Lsr/a;ZLcom/withpersona/sdk2/camera/e$a;Lfn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "l", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lin/a;)Ljava/lang/String;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "s", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13066a;
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
                iArr[in.a.f20965a.ordinal()] = 3;
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
            f13066a = iArr;
            int[] iArr2 = new int[wp.a.values().length];
            try {
                iArr2[wp.a.f34486a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[wp.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[wp.a.f34487c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final SelfieWorkflow.c g(@NotNull SelfieWorkflow.Input renderProps, @NotNull final tr.f<SelfieState> context, @Nullable in.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.c.C0240c.b mode, @NotNull SelfieWorkflow.c.C0240c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar2, boolean z12, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String cameraLoadingTitle;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        int i10 = a.b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new SelfieWorkflow.c.C0240c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new gt.l();
        }
        if (!(mode instanceof SelfieWorkflow.c.C0240c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.c.C0240c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == wp.a.f34487c) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.A());
            in.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f13066a[pose.ordinal()];
            cameraLoadingTitle = (i11 == 1 || i11 == 2) ? l(renderProps, aVar) : i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : k(renderProps, aVar);
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        return new SelfieWorkflow.c.a(str, cameraLoadingTitle, k(renderProps, aVar), z10 ? renderProps.getStrings().getAutoCaptureOn() : null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: wp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i12;
                i12 = com.withpersona.sdk2.inquiry.selfie.o.i(tr.f.this, (CameraProperties.b) obj);
                return i12;
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: wp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.selfie.o.j(tr.f.this, ((Boolean) obj).booleanValue());
                return j10;
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit i(tr.f fVar, CameraProperties.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), it, 3, null));
        return Unit.f22894a;
    }

    public static final Unit j(tr.f fVar, boolean z10) {
        SelfieState A;
        SelfieState selfieState = (SelfieState) fVar.i();
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            if (selfieState instanceof SelfieState.Capture) {
                A = r2.z((r36 & 1) != 0 ? r2.selfieError : null, (r36 & 2) != 0 ? r2.poseScore : 0.0f, (r36 & 4) != 0 ? r2.brightnessInfo : null, (r36 & 8) != 0 ? r2.selfies : null, (r36 & 16) != 0 ? r2.posesNeeded : null, (r36 & 32) != 0 ? r2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? r2.autoCaptureSupported : false, (r36 & 128) != 0 ? r2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? r2.cameraProperties : null, (r36 & 512) != 0 ? r2.backState : null, (r36 & 1024) != 0 ? r2.poseConfigs : null, (r36 & 2048) != 0 ? r2.cameraFacingMode : null, (r36 & 4096) != 0 ? r2.isFlashEnabled : z10, (r36 & 8192) != 0 ? r2.flashState : null, (r36 & 16384) != 0 ? r2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? ((SelfieState.Capture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                A = r1.z((r29 & 1) != 0 ? r1.countDown : 0, (r29 & 2) != 0 ? r1.selfieError : null, (r29 & 4) != 0 ? r1.cameraProperties : null, (r29 & 8) != 0 ? r1.posesNeeded : null, (r29 & 16) != 0 ? r1.startCaptureTimestamp : 0L, (r29 & 32) != 0 ? r1.autoCaptureSupported : false, (r29 & 64) != 0 ? r1.startSelfieTimestamp : 0L, (r29 & 128) != 0 ? r1.backState : null, (r29 & 256) != 0 ? r1.poseConfigs : null, (r29 & 512) != 0 ? r1.cameraFacingMode : null, (r29 & 1024) != 0 ? r1.isFlashEnabled : z10, (r29 & 2048) != 0 ? ((SelfieState.CountdownToManualCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                A = r1.z((r34 & 1) != 0 ? r1.centered : false, (r34 & 2) != 0 ? r1.selfieError : null, (r34 & 4) != 0 ? r1.poseScore : 0.0f, (r34 & 8) != 0 ? r1.brightnessInfo : null, (r34 & 16) != 0 ? r1.posesNeeded : null, (r34 & 32) != 0 ? r1.selfies : null, (r34 & 64) != 0 ? r1.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? r1.autoCaptureSupported : false, (r34 & 256) != 0 ? r1.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? r1.cameraProperties : null, (r34 & 1024) != 0 ? r1.backState : null, (r34 & 2048) != 0 ? r1.poseConfigs : null, (r34 & 4096) != 0 ? r1.cameraFacingMode : null, (r34 & 8192) != 0 ? r1.isFlashEnabled : z10, (r34 & 16384) != 0 ? ((SelfieState.StartCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                A = r1.z((r34 & 1) != 0 ? r1.countDown : 0, (r34 & 2) != 0 ? r1.selfieError : null, (r34 & 4) != 0 ? r1.startCaptureTimestamp : 0L, (r34 & 8) != 0 ? r1.cameraProperties : null, (r34 & 16) != 0 ? r1.startSelfieTimestamp : 0L, (r34 & 32) != 0 ? r1.poseScore : 0.0f, (r34 & 64) != 0 ? r1.brightnessInfo : null, (r34 & 128) != 0 ? r1.posesNeeded : null, (r34 & 256) != 0 ? r1.selfies : null, (r34 & 512) != 0 ? r1.backState : null, (r34 & 1024) != 0 ? r1.poseConfigs : null, (r34 & 2048) != 0 ? r1.autoCaptureSupported : false, (r34 & 4096) != 0 ? r1.cameraFacingMode : null, (r34 & 8192) != 0 ? r1.isFlashEnabled : z10, (r34 & 16384) != 0 ? ((SelfieState.CountdownToCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                A = SelfieState.ShowPoseHint.A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                A = r1.z((r32 & 1) != 0 ? r1.startCaptureTimestamp : 0L, (r32 & 2) != 0 ? r1.cameraProperties : null, (r32 & 4) != 0 ? r1.startSelfieTimestamp : 0L, (r32 & 8) != 0 ? r1.poseScore : 0.0f, (r32 & 16) != 0 ? r1.brightnessInfo : null, (r32 & 32) != 0 ? r1.posesNeeded : null, (r32 & 64) != 0 ? r1.selfies : null, (r32 & 128) != 0 ? r1.backState : null, (r32 & 256) != 0 ? r1.poseConfigs : null, (r32 & 512) != 0 ? r1.autoCaptureSupported : false, (r32 & 1024) != 0 ? r1.cameraFacingMode : null, (r32 & 2048) != 0 ? r1.isFlashEnabled : z10, (r32 & 4096) != 0 ? ((SelfieState.StartCaptureFaceDetected) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                A = SelfieState.WaitForWebRtcSetup.A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new gt.l();
                }
                A = SelfieState.AcquireNextPose.A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f22894a;
            }
            A = SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        fVar.p(A);
        return Unit.f22894a;
    }

    public static final String k(SelfieWorkflow.Input input, in.a aVar) {
        int i10 = aVar == null ? -1 : a.f13066a[aVar.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return input.getStrings().getSelfieHintLookLeftDescription();
        }
        if (i10 == 2) {
            return input.getStrings().getSelfieHintLookRightDescription();
        }
        if (i10 == 3) {
            return input.getStrings().getSelfieHintCenterFaceDescription();
        }
        if (i10 == 4) {
            return input.getStrings().getSelfieHintLookUpDescription();
        }
        if (i10 == 5) {
            return input.getStrings().getSelfieHintLookDownDescription();
        }
        throw new gt.l();
    }

    public static final String l(SelfieWorkflow.Input input, in.a aVar) {
        int i10 = aVar == null ? -1 : a.f13066a[aVar.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return input.getStrings().getSelfieHintLookLeft();
        }
        if (i10 == 2) {
            return input.getStrings().getSelfieHintLookRight();
        }
        if (i10 == 3) {
            return input.getStrings().getSelfieHintCenterFace();
        }
        if (i10 == 4) {
            return input.getStrings().getSelfieHintLookUp();
        }
        if (i10 == 5) {
            return input.getStrings().getSelfieHintLookDown();
        }
        throw new gt.l();
    }

    @NotNull
    public static final SelfieWorkflow.c m(@NotNull SelfieWorkflow.Input renderProps, @NotNull final wm.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a context, @Nullable in.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.c.C0240c.b mode, @NotNull SelfieWorkflow.c.C0240c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar2, boolean z12, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String cameraLoadingTitle;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        int i10 = a.b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new SelfieWorkflow.c.C0240c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new gt.l();
        }
        if (!(mode instanceof SelfieWorkflow.c.C0240c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.c.C0240c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == wp.a.f34487c) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.A());
            in.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f13066a[pose.ordinal()];
            cameraLoadingTitle = (i11 == 1 || i11 == 2) ? l(renderProps, aVar) : i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : k(renderProps, aVar);
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        return new SelfieWorkflow.c.a(str, cameraLoadingTitle, k(renderProps, aVar), z10 ? renderProps.getStrings().getAutoCaptureOn() : null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: wp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o8;
                o8 = com.withpersona.sdk2.inquiry.selfie.o.o(k.a.this, (CameraProperties.b) obj);
                return o8;
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: wp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q10;
                q10 = com.withpersona.sdk2.inquiry.selfie.o.q(k.a.this, ((Boolean) obj).booleanValue());
                return q10;
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit o(k.a aVar, final CameraProperties.b it) {
        r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: wp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p8;
                p8 = com.withpersona.sdk2.inquiry.selfie.o.p(CameraProperties.b.this, (r.c) obj);
                return p8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit p(CameraProperties.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), bVar, 3, null));
        return Unit.f22894a;
    }

    public static final Unit q(k.a aVar, final boolean z10) {
        r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: wp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit r8;
                r8 = com.withpersona.sdk2.inquiry.selfie.o.r(z10, (r.c) obj);
                return r8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit r(boolean z10, r.c action) {
        SelfieState A;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.c();
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            if (selfieState instanceof SelfieState.Capture) {
                A = r3.z((r36 & 1) != 0 ? r3.selfieError : null, (r36 & 2) != 0 ? r3.poseScore : 0.0f, (r36 & 4) != 0 ? r3.brightnessInfo : null, (r36 & 8) != 0 ? r3.selfies : null, (r36 & 16) != 0 ? r3.posesNeeded : null, (r36 & 32) != 0 ? r3.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? r3.autoCaptureSupported : false, (r36 & 128) != 0 ? r3.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? r3.cameraProperties : null, (r36 & 512) != 0 ? r3.backState : null, (r36 & 1024) != 0 ? r3.poseConfigs : null, (r36 & 2048) != 0 ? r3.cameraFacingMode : null, (r36 & 4096) != 0 ? r3.isFlashEnabled : z10, (r36 & 8192) != 0 ? r3.flashState : null, (r36 & 16384) != 0 ? r3.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? ((SelfieState.Capture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                A = r2.z((r29 & 1) != 0 ? r2.countDown : 0, (r29 & 2) != 0 ? r2.selfieError : null, (r29 & 4) != 0 ? r2.cameraProperties : null, (r29 & 8) != 0 ? r2.posesNeeded : null, (r29 & 16) != 0 ? r2.startCaptureTimestamp : 0L, (r29 & 32) != 0 ? r2.autoCaptureSupported : false, (r29 & 64) != 0 ? r2.startSelfieTimestamp : 0L, (r29 & 128) != 0 ? r2.backState : null, (r29 & 256) != 0 ? r2.poseConfigs : null, (r29 & 512) != 0 ? r2.cameraFacingMode : null, (r29 & 1024) != 0 ? r2.isFlashEnabled : z10, (r29 & 2048) != 0 ? ((SelfieState.CountdownToManualCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                A = r2.z((r34 & 1) != 0 ? r2.centered : false, (r34 & 2) != 0 ? r2.selfieError : null, (r34 & 4) != 0 ? r2.poseScore : 0.0f, (r34 & 8) != 0 ? r2.brightnessInfo : null, (r34 & 16) != 0 ? r2.posesNeeded : null, (r34 & 32) != 0 ? r2.selfies : null, (r34 & 64) != 0 ? r2.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? r2.autoCaptureSupported : false, (r34 & 256) != 0 ? r2.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? r2.cameraProperties : null, (r34 & 1024) != 0 ? r2.backState : null, (r34 & 2048) != 0 ? r2.poseConfigs : null, (r34 & 4096) != 0 ? r2.cameraFacingMode : null, (r34 & 8192) != 0 ? r2.isFlashEnabled : z10, (r34 & 16384) != 0 ? ((SelfieState.StartCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                A = r2.z((r34 & 1) != 0 ? r2.countDown : 0, (r34 & 2) != 0 ? r2.selfieError : null, (r34 & 4) != 0 ? r2.startCaptureTimestamp : 0L, (r34 & 8) != 0 ? r2.cameraProperties : null, (r34 & 16) != 0 ? r2.startSelfieTimestamp : 0L, (r34 & 32) != 0 ? r2.poseScore : 0.0f, (r34 & 64) != 0 ? r2.brightnessInfo : null, (r34 & 128) != 0 ? r2.posesNeeded : null, (r34 & 256) != 0 ? r2.selfies : null, (r34 & 512) != 0 ? r2.backState : null, (r34 & 1024) != 0 ? r2.poseConfigs : null, (r34 & 2048) != 0 ? r2.autoCaptureSupported : false, (r34 & 4096) != 0 ? r2.cameraFacingMode : null, (r34 & 8192) != 0 ? r2.isFlashEnabled : z10, (r34 & 16384) != 0 ? ((SelfieState.CountdownToCapture) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                A = SelfieState.ShowPoseHint.A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                A = r2.z((r32 & 1) != 0 ? r2.startCaptureTimestamp : 0L, (r32 & 2) != 0 ? r2.cameraProperties : null, (r32 & 4) != 0 ? r2.startSelfieTimestamp : 0L, (r32 & 8) != 0 ? r2.poseScore : 0.0f, (r32 & 16) != 0 ? r2.brightnessInfo : null, (r32 & 32) != 0 ? r2.posesNeeded : null, (r32 & 64) != 0 ? r2.selfies : null, (r32 & 128) != 0 ? r2.backState : null, (r32 & 256) != 0 ? r2.poseConfigs : null, (r32 & 512) != 0 ? r2.autoCaptureSupported : false, (r32 & 1024) != 0 ? r2.cameraFacingMode : null, (r32 & 2048) != 0 ? r2.isFlashEnabled : z10, (r32 & 4096) != 0 ? ((SelfieState.StartCaptureFaceDetected) selfieState).isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                A = SelfieState.WaitForWebRtcSetup.A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new gt.l();
                }
                A = SelfieState.AcquireNextPose.A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f22894a;
            }
            A = SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        action.e(A);
        return Unit.f22894a;
    }

    public static final SelfieWorkflow.c.a.AbstractC0237a s(SelfieWorkflow.c.C0240c.b bVar) {
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.a) {
            SelfieWorkflow.c.C0240c.b.a aVar = (SelfieWorkflow.c.C0240c.b.a) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.b(p.E(aVar.getOverlay()), aVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.C0241b) {
            SelfieWorkflow.c.C0240c.b.C0241b c0241b = (SelfieWorkflow.c.C0240c.b.C0241b) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.C0239c(p.E(c0241b.getOverlay()), c0241b.getCountDown());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.C0242c) {
            SelfieWorkflow.c.C0240c.b.C0242c c0242c = (SelfieWorkflow.c.C0240c.b.C0242c) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.d(p.E(c0242c.getOverlay()), c0242c.b(), c0242c.c(), c0242c.getStartFinalize());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.d) {
            SelfieWorkflow.c.C0240c.b.d dVar = (SelfieWorkflow.c.C0240c.b.d) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.e(p.E(dVar.getOverlay()), dVar.d(), dVar.c(), dVar.getForceCapture(), dVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.e) {
            SelfieWorkflow.c.C0240c.b.e eVar = (SelfieWorkflow.c.C0240c.b.e) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.f(p.E(eVar.getOverlay()), eVar.b());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.f) {
            SelfieWorkflow.c.C0240c.b.f fVar = (SelfieWorkflow.c.C0240c.b.f) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.g(p.E(fVar.getOverlay()), fVar.b());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.g) {
            SelfieWorkflow.c.C0240c.b.g gVar = (SelfieWorkflow.c.C0240c.b.g) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.h(p.E(gVar.getOverlay()), gVar.getRecordLocalVideo(), gVar.getMaxRecordingLengthMs(), gVar.d(), gVar.c());
        }
        if (bVar instanceof SelfieWorkflow.c.C0240c.b.h) {
            SelfieWorkflow.c.C0240c.b.h hVar = (SelfieWorkflow.c.C0240c.b.h) bVar;
            return new SelfieWorkflow.c.a.AbstractC0237a.i(p.E(hVar.getOverlay()), hVar.c(), hVar.getImageCaptured());
        }
        if (!(bVar instanceof SelfieWorkflow.c.C0240c.b.i)) {
            throw new gt.l();
        }
        SelfieWorkflow.c.C0240c.b.i iVar = (SelfieWorkflow.c.C0240c.b.i) bVar;
        return new SelfieWorkflow.c.a.AbstractC0237a.j(p.E(iVar.getOverlay()), iVar.getMaxRecordingLengthMs());
    }
}
