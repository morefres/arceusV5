package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureSide;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import dn.d0;
import dn.h0;
import dn.i0;
import dn.l0;
import dn.m0;
import dn.v;
import dn.v0;
import go.j2;
import java.util.ArrayList;
import java.util.List;
import ko.BottomSheetCaptureTipsViewModel;
import ko.StaticCaptureTipsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.j1;
import so.x;
import wm.b0;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aM\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a1\u0010#\u001a\u0004\u0018\u00010\u0004*\u00140 R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030!2\b\b\u0002\u0010\"\u001a\u00020\u0012H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a¥\u0001\u00109\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020\u00122\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u000202012\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:\u001aO\u0010<\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\u00020>*\u00020%H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020%H\u0000¢\u0006\u0004\bB\u0010C\u001a5\u0010H\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001062\u0006\u0010G\u001a\u00020\u0012H\u0000¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bL\u0010K\u001a-\u0010M\u001a\u000206*\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\bM\u0010K\u001a\u001f\u0010P\u001a\u0004\u0018\u000106*\u00020D2\b\u0010O\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001d\u0010S\u001a\u0004\u0018\u00010R*\u00020\u00032\u0006\u0010E\u001a\u00020%H\u0000¢\u0006\u0004\bS\u0010T\u001a\u0019\u0010V\u001a\b\u0012\u0004\u0012\u00020U01*\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010Z\"\u001a\u0010]\u001a\u0004\u0018\u00010%*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "Lso/l;", "videoCaptureHelper", "", "S", "(Lwm/k$a;Lso/l;)V", "v", "(Lwm/k$a;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", "", "checkPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lmp/c;", "j0", "(Ljava/lang/Object;Landroid/content/Context;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lmp/c;", "f0", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "z", "(Lwm/k$a;Z)Lkotlin/jvm/functions/Function1;", "Lwm/r$c;", "Lwm/r;", "addCurrentState", "x", "(Lwm/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "currentSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "O", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "W", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lso/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "U", "(Landroid/content/Context;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "e0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "side", "selectedId", "isAutoClassification", "P", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "K", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "J", "M", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "R", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Ljava/lang/String;", "Lko/i;", "L", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lko/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "N", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "output", "b0", "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Lso/l;)V", "Q", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "sideOrNull", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10985a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.f28920c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10985a = iArr;
            int[] iArr2 = new int[IdConfig.b.values().length];
            try {
                iArr2[IdConfig.b.f10747d.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.b.f10748e.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.b.f10749f.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.b.f10750g.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.b.f10751h.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static /* synthetic */ Function1 A(k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return z(aVar, z10);
    }

    public static final Unit B(k.a aVar, final boolean z10, final Throwable cameraError) {
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
            c16 = b0.c(null, new Function1() { // from class: go.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit H;
                    H = com.withpersona.sdk2.inquiry.governmentid.n.H(cameraError, (r.c) obj);
                    return H;
                }
            }, 1, null);
            d10.a(c16);
            return Unit.f22894a;
        }
        dn.h hVar = (dn.h) cameraError;
        if (!(hVar instanceof h0)) {
            if (hVar instanceof i0) {
                wm.h d11 = aVar.d();
                c15 = b0.c(null, new Function1() { // from class: go.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit I;
                        I = com.withpersona.sdk2.inquiry.governmentid.n.I((r.c) obj);
                        return I;
                    }
                }, 1, null);
                d11.a(c15);
            } else if (hVar instanceof d0) {
                wm.h d12 = aVar.d();
                c14 = b0.c(null, new Function1() { // from class: go.q1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit C;
                        C = com.withpersona.sdk2.inquiry.governmentid.n.C((r.c) obj);
                        return C;
                    }
                }, 1, null);
                d12.a(c14);
            } else if (hVar instanceof m0) {
                wm.h d13 = aVar.d();
                c13 = b0.c(null, new Function1() { // from class: go.r1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit D;
                        D = com.withpersona.sdk2.inquiry.governmentid.n.D(z10, (r.c) obj);
                        return D;
                    }
                }, 1, null);
                d13.a(c13);
            } else if (hVar instanceof v) {
                wm.h d14 = aVar.d();
                c12 = b0.c(null, new Function1() { // from class: go.s1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit E;
                        E = com.withpersona.sdk2.inquiry.governmentid.n.E((r.c) obj);
                        return E;
                    }
                }, 1, null);
                d14.a(c12);
            } else if (hVar instanceof v0) {
                wm.h d15 = aVar.d();
                c11 = b0.c(null, new Function1() { // from class: go.t1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit F;
                        F = com.withpersona.sdk2.inquiry.governmentid.n.F((r.c) obj);
                        return F;
                    }
                }, 1, null);
                d15.a(c11);
            } else {
                if (!(hVar instanceof l0)) {
                    throw new gt.l();
                }
                wm.h d16 = aVar.d();
                c10 = b0.c(null, new Function1() { // from class: go.u1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit G;
                        G = com.withpersona.sdk2.inquiry.governmentid.n.G(z10, cameraError, (r.c) obj);
                        return G;
                    }
                }, 1, null);
                d16.a(c10);
            }
        }
        return Unit.f22894a;
    }

    public static final Unit C(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f22894a;
    }

    public static final Unit D(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.c()).v();
            action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
        } else {
            action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f22894a;
    }

    public static final Unit E(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f22894a;
    }

    public static final Unit F(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f22894a;
    }

    public static final Unit G(boolean z10, Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            ((GovernmentIdState) action.c()).v();
            if (!((l0) th2).getIsClosedDueToBadCameraConfiguration()) {
                action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.c()).getCountryCode(), null, null, 223, null));
            }
        } else {
            action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f22894a;
    }

    public static final Unit H(Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f22894a;
    }

    public static final Unit I(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f22894a;
    }

    @NotNull
    public static final String J(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String a10 = strings.getCaptureScreenDescription().a(str, selectedId, side);
        return a10 == null ? "" : a10;
    }

    @NotNull
    public static final String K(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String a10 = strings.getCaptureScreenTitle().a(str, selectedId, side);
        return a10 == null ? "" : a10;
    }

    @Nullable
    public static final ko.i L(@NotNull GovernmentIdWorkflow.Input input, @NotNull IdConfig.b side) {
        String idFrontHelpModalTitle;
        String idFrontHelpModalPrompt;
        String idFrontHelpModalHints;
        String idFrontHelpModalContinueButtonText;
        String idBackHelpModalTitle;
        String idBackHelpModalPrompt;
        String idBackHelpModalHints;
        String idBackHelpModalContinueButtonText;
        String barcodeHelpModalTitle;
        String barcodeHelpModalPrompt;
        String barcodeHelpModalHints;
        String barcodeHelpModalContinueButtonText;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (input.getStaticCaptureTipsEnabled()) {
            return new StaticCaptureTipsViewModel(input.getStrings().getStaticCaptureTipsTitle(), input.getStrings().getStaticCaptureTipsSubtext(), input.getAssetConfig().getCapturePage());
        }
        int i10 = a.b[side.ordinal()];
        if (i10 == 1) {
            String helpButtonText = input.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = input.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = input.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = input.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = input.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new BottomSheetCaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, side);
        }
        if (i10 == 2) {
            String helpButtonText2 = input.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = input.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = input.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = input.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = input.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new BottomSheetCaptureTipsViewModel(helpButtonText2, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHints, idBackHelpModalContinueButtonText, side);
        }
        if (i10 == 3) {
            return null;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                return null;
            }
            throw new gt.l();
        }
        String helpButtonText3 = input.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = input.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = input.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = input.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = input.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new BottomSheetCaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    @NotNull
    public static final String M(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String a10 = strings.getConfirmCapture().a(str, selectedId, side);
        return a10 == null ? "" : a10;
    }

    @NotNull
    public static final List<EnabledIdClass> N(@NotNull GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        List<IdConfig> o8 = input.o();
        ArrayList arrayList = new ArrayList(q.u(o8, 10));
        for (IdConfig idConfig : o8) {
            j2 icon = idConfig.getIcon();
            String str = input.getStrings().V().get(idConfig.getIdClassKey());
            if (str == null) {
                str = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, str));
        }
        return arrayList;
    }

    @NotNull
    public static final Screen.b.a O(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull IdConfig.b currentSide) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(currentSide, "currentSide");
        return currentSide == IdConfig.b.f10751h ? Screen.b.a.b : (Intrinsics.c(renderProps.getCountryCode(), "US") || currentSide != IdConfig.b.f10748e) ? Screen.b.a.f10815c : Screen.b.a.b;
    }

    @NotNull
    public static final String P(@NotNull GovernmentIdWorkflow.Input.Strings strings, @NotNull IdConfig.b side, @NotNull String selectedId, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        if (z10 && strings.getAutoClassificationCaptureTipText() != null) {
            return strings.getAutoClassificationCaptureTipText();
        }
        String a10 = strings.getScanInstructions().a(str, selectedId, side);
        return a10 == null ? "" : a10;
    }

    @Nullable
    public static final IdConfig.b Q(@NotNull IdPart idPart) {
        Intrinsics.checkNotNullParameter(idPart, "<this>");
        IdPart.SideIdPart sideIdPart = idPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) idPart : null;
        if (sideIdPart != null) {
            return sideIdPart.getSide();
        }
        return null;
    }

    @Nullable
    public static final String R(@NotNull GovernmentIdWorkflow.Input.Strings strings, @Nullable Hint hint) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        if (Intrinsics.c(hint, HoldStillHint.f10977a)) {
            return strings.getHintHoldStill();
        }
        if (Intrinsics.c(hint, LowLightHint.f10978a)) {
            return strings.getHintLowLight();
        }
        if (hint == null) {
            return null;
        }
        throw new gt.l();
    }

    public static final void S(@NotNull wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, @Nullable final so.l lVar) {
        r<? super Object, GovernmentIdState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        wm.h<r<? super Object, GovernmentIdState, ? extends Object>> d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: go.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit T;
                T = com.withpersona.sdk2.inquiry.governmentid.n.T(so.l.this, (r.c) obj);
                return T;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit T(so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.c()).getBackState();
        if (lVar != null) {
            lVar.a();
        }
        if (backState != null) {
            backState.G(true);
            action.e(backState);
        } else if (((GovernmentIdWorkflow.Input) action.b()).getBackStepEnabled()) {
            action.d(GovernmentIdWorkflow.a.C0197a.f10713a);
        } else {
            action.d(GovernmentIdWorkflow.a.b.f10714a);
        }
        return Unit.f22894a;
    }

    public static final void U(@NotNull Context context, @NotNull wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10) {
        r<? super Object, GovernmentIdState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List p8 = kotlin.collections.p.p(pp.i0.f28911a);
        if (z10 && hq.g.f(context)) {
            p8.add(pp.i0.b);
        }
        final List<pp.i0> a10 = com.withpersona.sdk2.inquiry.permissions.g.a(context, p8);
        if (a10.isEmpty()) {
            return;
        }
        wm.h<r<? super Object, GovernmentIdState, ? extends Object>> d10 = renderContext.d();
        c10 = b0.c(null, new Function1() { // from class: go.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V;
                V = com.withpersona.sdk2.inquiry.governmentid.n.V(a10, (r.c) obj);
                return V;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit V(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.e(GovernmentIdState.WaitForAutocapture.L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, list.contains(pp.i0.f28911a), list.contains(pp.i0.b), null, null, null, 29695, null));
        } else {
            ((GovernmentIdState) action.c()).v();
            action.e(new GovernmentIdState.RestartStep(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, 223, null));
        }
        return Unit.f22894a;
    }

    public static final void W(@NotNull final GovernmentIdState renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull final GovernmentIdWorkflow.Input renderProps, @Nullable final GovernmentId governmentId, @NotNull final IdConfig id2, @NotNull final so.l videoCaptureHelper, @NotNull final CameraProperties cameraProperties, final boolean z10, @NotNull final List<? extends IdPart> parts, final int i10, @Nullable final String str, @Nullable final String str2) {
        r<? super Object, GovernmentIdState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        final kn.a e10 = videoCaptureHelper.e(renderProps);
        wm.h<r<? super Object, GovernmentIdState, ? extends Object>> d10 = renderContext.d();
        c10 = b0.c(null, new Function1() { // from class: go.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y;
                Y = com.withpersona.sdk2.inquiry.governmentid.n.Y(GovernmentIdState.this, governmentId, i10, parts, renderProps, videoCaptureHelper, id2, z10, str2, e10, cameraProperties, str, renderContext, (r.c) obj);
                return Y;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit Y(GovernmentIdState governmentIdState, GovernmentId governmentId, int i10, List list, GovernmentIdWorkflow.Input input, final so.l lVar, IdConfig idConfig, boolean z10, String str, kn.a aVar, CameraProperties cameraProperties, String str2, final k.a aVar2, r.c action) {
        WorkflowState submit;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.c().getClass() != governmentIdState.getClass()) {
            return Unit.f22894a;
        }
        List<GovernmentId> x02 = governmentId != null ? CollectionsKt.x0(((GovernmentIdState) action.c()).E(), governmentId) : ((GovernmentIdState) action.c()).E();
        int i11 = i10 == list.size() ? i10 : i10 + 1;
        IdPart idPart = (IdPart) CollectionsKt.f0(list, i11);
        if (idPart instanceof IdPart.SideIdPart) {
            if (!input.u() || lVar.d()) {
                IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                submit = new GovernmentIdState.WaitForAutocapture(sideIdPart, x02, new CaptureConfig.IdCaptureConfig(idConfig), O((GovernmentIdWorkflow.Input) action.b(), sideIdPart.getSide()), list, i11, x(action, z10), lVar.d() ? x.b : x.f31613c, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, str, null, new Function0() { // from class: go.d2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit Z;
                        Z = com.withpersona.sdk2.inquiry.governmentid.n.Z(k.a.this, lVar);
                        return Z;
                    }
                }, 11776, null);
            } else {
                submit = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, x02, list, i11, str, new CaptureConfig.IdCaptureConfig(idConfig), false, x(action, z10), null, 320, null);
            }
        } else {
            if (idPart != null) {
                throw new gt.l();
            }
            submit = (aVar != kn.a.f22871a || (action.c() instanceof GovernmentIdState.FinalizeWebRtc) || (action.c() instanceof GovernmentIdState.ReviewSelectedImage)) ? (aVar != kn.a.b || (action.c() instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (action.c() instanceof GovernmentIdState.ReviewSelectedImage)) ? new GovernmentIdState.Submit(idConfig, x02, null, list, i11, x(action, z10), str, new GovernmentIdRequestArguments(x02, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), str2, cameraProperties, false, 1028, null) : new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, x02, (IdPart) CollectionsKt.o0(list), list, i11, x(action, z10), str, new GovernmentIdRequestArguments(x02, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), 0L, false, 768, null) : new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.o0(list), x02, list, i11, x(action, z10), str, idConfig, cameraProperties);
        }
        action.e(submit);
        return Unit.f22894a;
    }

    public static final Unit Z(k.a aVar, final so.l lVar) {
        r c10;
        wm.h d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: go.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a02;
                a02 = com.withpersona.sdk2.inquiry.governmentid.n.a0(so.l.this, (r.c) obj);
                return a02;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit a0(so.l lVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = c10 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) c10 : null;
        if (waitForAutocapture != null) {
            action.e(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? x.b : x.f31613c, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22894a;
    }

    public static final void b0(@NotNull wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final GovernmentIdWorkflow.a output, @NotNull so.l videoCaptureHelper) {
        r<? super Object, GovernmentIdState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof GovernmentIdWorkflow.a.d) || (output instanceof GovernmentIdWorkflow.a.C0197a) || (output instanceof GovernmentIdWorkflow.a.c) || (output instanceof GovernmentIdWorkflow.a.b)) {
            videoCaptureHelper.a();
        }
        wm.h<r<? super Object, GovernmentIdState, ? extends Object>> d10 = context.d();
        c10 = b0.c(null, new Function1() { // from class: go.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c02;
                c02 = com.withpersona.sdk2.inquiry.governmentid.n.c0(GovernmentIdWorkflow.a.this, (r.c) obj);
                return c02;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit c0(GovernmentIdWorkflow.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(aVar);
        return Unit.f22894a;
    }

    @NotNull
    public static final GovIdCaptureSide d0(@NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i10 = a.b[bVar.ordinal()];
        if (i10 == 1) {
            return GovIdCaptureSide.Front;
        }
        if (i10 == 2) {
            return GovIdCaptureSide.Back;
        }
        if (i10 == 3) {
            return GovIdCaptureSide.FrontOrBack;
        }
        if (i10 == 4) {
            return GovIdCaptureSide.BarcodePdf417;
        }
        if (i10 == 5) {
            return GovIdCaptureSide.PassportSignature;
        }
        throw new gt.l();
    }

    @NotNull
    public static final GovernmentId.b e0(@NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i10 = a.b[bVar.ordinal()];
        if (i10 == 1) {
            return GovernmentId.b.f10506a;
        }
        if (i10 == 2) {
            return GovernmentId.b.b;
        }
        if (i10 == 3) {
            return GovernmentId.b.f10506a;
        }
        if (i10 != 4 && i10 != 5) {
            throw new gt.l();
        }
        return GovernmentId.b.b;
    }

    @NotNull
    public static final mp.c<Object, Object> f0(@NotNull Object obj, @NotNull Context context, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        mp.c<Object, Object> d10;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        pp.i0 i0Var = pp.i0.b;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(tp.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String string = context.getString(tp.g.R, hq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        d10 = com.withpersona.sdk2.inquiry.permissions.g.d(obj, renderContext, z10, i0Var, (r36 & 8) != 0 ? false : false, str, microphonePermissionsPrompt, string, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: go.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                wm.r g02;
                g02 = com.withpersona.sdk2.inquiry.governmentid.n.g0(k.a.this, (PermissionRequestWorkflow.Output) obj2);
                return g02;
            }
        });
        return d10;
    }

    public static final r g0(final k.a aVar, final PermissionRequestWorkflow.Output it) {
        r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        c10 = b0.c(null, new Function1() { // from class: go.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h02;
                h02 = com.withpersona.sdk2.inquiry.governmentid.n.h0(PermissionRequestWorkflow.Output.this, aVar, (r.c) obj);
                return h02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit h0(PermissionRequestWorkflow.Output output, k.a aVar, r.c action) {
        r c10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f10985a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            wm.h d10 = aVar.d();
            c10 = b0.c(null, new Function1() { // from class: go.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i02;
                    i02 = com.withpersona.sdk2.inquiry.governmentid.n.i0((r.c) obj);
                    return i02;
                }
            }, 1, null);
            d10.a(c10);
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            S(aVar, null);
        }
        return Unit.f22894a;
    }

    public static final Unit i0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.c();
        if (workflowState instanceof go.a) {
            action.e(((go.a) workflowState).q(false));
        }
        return Unit.f22894a;
    }

    @NotNull
    public static final mp.c<Object, Object> j0(@NotNull Object obj, @NotNull Context context, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a renderContext, @NotNull GovernmentIdWorkflow.Input renderProps, boolean z10, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        mp.c<Object, Object> d10;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        pp.i0 i0Var = pp.i0.f28911a;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(tp.g.f32399q);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String string = context.getString(tp.g.f32398p, hq.g.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        d10 = com.withpersona.sdk2.inquiry.permissions.g.d(obj, renderContext, z10, i0Var, (r36 & 8) != 0 ? false : false, str, cameraPermissionsPrompt, string, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : null, new Function1() { // from class: go.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                wm.r k02;
                k02 = com.withpersona.sdk2.inquiry.governmentid.n.k0(k.a.this, (PermissionRequestWorkflow.Output) obj2);
                return k02;
            }
        });
        return d10;
    }

    public static final r k0(final k.a aVar, final PermissionRequestWorkflow.Output it) {
        r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        c10 = b0.c(null, new Function1() { // from class: go.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l02;
                l02 = com.withpersona.sdk2.inquiry.governmentid.n.l0(PermissionRequestWorkflow.Output.this, aVar, (r.c) obj);
                return l02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit l0(PermissionRequestWorkflow.Output output, k.a aVar, r.c action) {
        r c10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f10985a[output.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            wm.h d10 = aVar.d();
            c10 = b0.c(null, new Function1() { // from class: go.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit m02;
                    m02 = com.withpersona.sdk2.inquiry.governmentid.n.m0((r.c) obj);
                    return m02;
                }
            }, 1, null);
            d10.a(c10);
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            S(aVar, null);
        }
        return Unit.f22894a;
    }

    public static final Unit m0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        WorkflowState workflowState = (GovernmentIdState) action.c();
        if (workflowState instanceof go.c) {
            action.e(((go.c) workflowState).r(false));
        }
        return Unit.f22894a;
    }

    public static final void v(@NotNull wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar) {
        r<? super Object, GovernmentIdState, ? extends Object> c10;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        wm.h<r<? super Object, GovernmentIdState, ? extends Object>> d10 = aVar.d();
        c10 = b0.c(null, new Function1() { // from class: go.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w5;
                w5 = com.withpersona.sdk2.inquiry.governmentid.n.w((r.c) obj);
                return w5;
            }
        }, 1, null);
        d10.a(c10);
    }

    public static final Unit w(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    @Nullable
    public static final GovernmentIdState x(@NotNull r<?, GovernmentIdState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ GovernmentIdState y(r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return x(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> z(@NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: go.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B;
                B = com.withpersona.sdk2.inquiry.governmentid.n.B(k.a.this, z10, (Throwable) obj);
                return B;
            }
        };
    }
}
