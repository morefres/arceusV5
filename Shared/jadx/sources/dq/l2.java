package dq;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nq.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010 \u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ltr/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "addCurrentState", ve.a.f33391e, "(Ltr/f;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Landroid/content/Context;", "context", "renderContext", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "useVideoCapture", "", rl.d.f30696a, "(Landroid/content/Context;Ltr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lnq/j;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lnq/j;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "e", "(Ltr/f;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l2 {
    @Nullable
    public static final SelfieState a(@NotNull tr.f<SelfieState> fVar, boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (z10) {
            return fVar.i();
        }
        SelfieState i10 = fVar.i();
        if (i10 != null) {
            return i10.getBackState();
        }
        return null;
    }

    public static /* synthetic */ SelfieState b(tr.f fVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(fVar, z10);
    }

    public static final void c(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        Iterator<T> it = selfieState.w().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }

    public static final void d(@NotNull Context context, @NotNull tr.f<SelfieState> renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        SelfieState i10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List p8 = kotlin.collections.p.p(pp.i0.f28911a);
        if (z10 && hq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            p8.add(pp.i0.b);
        }
        if (com.withpersona.sdk2.inquiry.permissions.g.a(context, p8).isEmpty() || (i10 = renderContext.i()) == null) {
            return;
        }
        if (i10 instanceof SelfieState.WaitForCameraFeed) {
            renderContext.p(SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) i10, !r12.contains(r0), !r12.contains(pp.i0.b), null, null, null, false, null, false, 252, null));
        } else {
            c(i10);
            renderContext.p(new SelfieState.RestartCamera(false, false, a(renderContext, false), i10.getCameraFacingMode(), 3, null));
        }
    }

    @NotNull
    public static final SelfieState e(@NotNull tr.f<SelfieState> fVar, @NotNull PoseConfigs poseConfigs, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? poseConfigs.a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            SelfieState i10 = fVar.i();
            if (i10 != null) {
                return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, i10.getCameraFacingMode(), 0, null, 192, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        SelfieState i11 = fVar.i();
        if (i11 != null) {
            return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, i11.getCameraFacingMode());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final nq.j f(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if (selfieState instanceof SelfieState.ShowInstructions) {
            return j.e.f27316a;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            in.a m10 = ((SelfieState.ShowPoseHint) selfieState).m();
            return new j.LeadInAnimation(m10 != null ? com.withpersona.sdk2.inquiry.selfie.i.a(m10) : null);
        }
        if (selfieState instanceof SelfieState.RestartCamera) {
            return new j.TakePhoto(null);
        }
        if (selfieState instanceof SelfieState.AcquireNextPose) {
            return new j.LeadInAnimation(null);
        }
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            in.a m11 = ((com.withpersona.sdk2.inquiry.selfie.a) selfieState).m();
            return new j.TakePhoto(m11 != null ? com.withpersona.sdk2.inquiry.selfie.i.a(m11) : null);
        }
        if (selfieState instanceof SelfieState.CaptureTransition) {
            return f(((SelfieState.CaptureTransition) selfieState).getNextState());
        }
        if ((selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished)) {
            return j.b.f27313a;
        }
        if (selfieState instanceof SelfieState.ReviewCaptures) {
            return j.a.f27312a;
        }
        if (selfieState instanceof SelfieState.Submit) {
            return j.d.f27315a;
        }
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            return new j.TakePhoto(null);
        }
        throw new gt.l();
    }
}
