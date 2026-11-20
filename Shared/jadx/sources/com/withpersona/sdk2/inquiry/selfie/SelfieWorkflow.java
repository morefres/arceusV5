package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import aq.b;
import bq.a;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
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
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import dq.l2;
import fn.c;
import g0.h1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import ju.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.i0;
import pp.j1;
import rr.b;
import wm.Snapshot;
import wm.k;
import wm.o;
import wm.r;
import wm.w;
import wm.z;
import wp.x;
import zl.t;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00ad\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0085\u0001®\u0001\u0087\u0001\u0089\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JC\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002002\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b5\u00106JC\u00108\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002072\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b8\u00109JC\u0010;\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020:2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b;\u0010<JC\u0010>\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020=2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b>\u0010?JC\u0010A\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020@2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bA\u0010BJC\u0010D\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020C2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020F2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bG\u0010HJC\u0010J\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020I2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bJ\u0010KJC\u0010M\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020L2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bM\u0010NJC\u0010P\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020O2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bP\u0010QJC\u0010S\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020R2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bS\u0010TJC\u0010V\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020U2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^J-\u0010c\u001a\u00020b2\u001c\u0010a\u001a\u00180_R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040`H\u0002¢\u0006\u0004\bc\u0010dJC\u0010f\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020e2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bf\u0010gJC\u0010i\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020h2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bi\u0010jJG\u0010p\u001a\u00020\u0003\"\f\b\u0000\u0010l*\u00020\u0003*\u00020k*\u00160_R\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030`2\u0006\u0010m\u001a\u00028\u00002\b\u0010o\u001a\u0004\u0018\u00010nH\u0002¢\u0006\u0004\bp\u0010qJ3\u0010r\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\br\u0010sJ;\u0010u\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010t\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ7\u0010y\u001a\u00020b*\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Laq/b$a;", "submitVerificationWorker", "Lrr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lfq/j;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Ljn/a;", "cameraStatsManager", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lbq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "inquiryThemeManager", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Loq/c;", "sdkFilesManager", "Leo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Laq/b$a;Lrr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lfq/j;Lcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Ljn/a;Lsq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lbq/a$b;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/selfie/g;Loq/c;Leo/e;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "renderState", "Lwm/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "D2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "q3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lwm/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "B3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "P2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "f2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "K1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "T1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "m2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "P3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "c4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "w1", "Lkn/a;", "b4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkn/a;", "Lwm/r$c;", "Lwm/r;", "updater", "", "Z3", "(Lwm/r$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "i3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lwm/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "x1", "(Lwm/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "V3", "(Lwm/k$a;)V", "output", "X3", "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "W3", "(Lwm/k$a;Ljava/lang/Throwable;)V", "props", "Lwm/i;", "snapshot", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "y1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lwm/k$a;)Ljava/lang/Object;", "state", "a4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lwm/i;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Laq/b$a;", "c", "Lrr/b$a;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "e", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "f", "Lfq/j;", "g", "Lcom/withpersona/sdk2/camera/e$a;", "h", "Lfn/c$a;", "i", "Ljn/a;", "j", "Lsq/a;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "l", "Lbq/a$b;", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "n", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "o", "Loq/c;", "p", "Leo/e;", "Lsr/a;", "q", "Lsr/a;", "webRtcManager", "Lbq/a;", "r", "Lbq/a;", "selfiePoseManager", "s", "Input", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieWorkflow extends wm.k<Input, SelfieState, b, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b.a submitVerificationWorker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b.a webRtcWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.b selfieAnalyzeWorker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fq.j localVideoCaptureRenderer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e.a cameraXControllerFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a camera2ControllerFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.b selfiePoseManagerFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a inquiryThemeManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final sr.a webRtcManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public bq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0083\u0001Bµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000202¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b=\u00104J\u001a\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010<R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010NR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bO\u0010_\u001a\u0004\bb\u0010aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bZ\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bV\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bT\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bP\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bj\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bk\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bl\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bm\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bl\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bk\u0010q\u001a\u0004\br\u0010sR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bD\u0010t\u001a\u0004\bB\u0010uR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bj\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b`\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bg\u0010~R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bh\u0010<R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bi\u0010<R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bz\u0010L\u001a\u0004\b\u007f\u0010NR\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bc\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "orderedPosesBuffered", "", "poseTimeoutMs", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lwp/a;", "designVersion", "fileUploadUrl", "flowWatermarkText", "usePerPoseReveal", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lwp/a;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "y", j6.b.f21518e, "u", "c", "s", rl.d.f30696a, t.f38095d, "e", "Z", "f", "()Z", "m", "g", "p", "h", "I", "i", "K", "j", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "L", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "J", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "Ljava/util/List;", "A", "()Ljava/util/List;", "C", "n", "Ljava/lang/Long;", "G", "()Ljava/lang/Long;", "o", "q", "r", "z", "x", "w", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "N", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "P", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "D", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "E", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "B", "Lwp/a;", "()Lwp/a;", "O", "F", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "Strings", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        @NotNull
        public final wp.a designVersion;

        /* renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fileUploadUrl;

        /* renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* renamed from: E, reason: from kotlin metadata and from toString */
        public final boolean usePerPoseReveal;

        /* renamed from: F, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Strings strings;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final SelfieType selfieType;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> orderedPoses;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffered;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsTitle;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsRationale;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalPositiveButton;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalNegativeButton;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsTitle;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsRationale;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalPositiveButton;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalNegativeButton;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.AssetConfig assetConfig;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000201HÖ\u0001¢\u0006\u0004\b<\u00103J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010;R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010;R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010;R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010;R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bR\u0010;R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010;R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bU\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bZ\u0010;R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\b[\u0010;R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010;R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\b`\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\ba\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010;R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010;R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\b^\u0010;R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\b\\\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bk\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bf\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bi\u0010;R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bl\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bm\u0010;R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bo\u0010;R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bh\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\bd\u0010;R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bb\u0010;R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bB\u0010;R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bS\u0010;R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\bs\u0010;R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bt\u0010;R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bu\u0010;R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010C\u001a\u0004\bw\u0010;R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010C\u001a\u0004\bx\u0010;R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bM\u0010;R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010C\u001a\u0004\by\u0010;R\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\bp\u0010;R\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bX\u0010;¨\u0006z"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Landroid/os/Parcelable;", "", Title.type, "prompt", "disclosure", "startButton", "capturePageTitle", "capturePageNavBarTitle", "promptPageNavBarTitle", "pendingPageNavBarTitle", "checkPageNavBarTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintLookUp", "selfieHintLookDown", "selfieHintHoldStill", "selfieHintPoseTimeout", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageLabelUp", "selfieCheckPageLabelDown", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "selfieHintLookUpDescription", "selfieHintLookDownDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getTitle", j6.b.f21518e, "r", "c", "n", rl.d.f30696a, "i0", "e", "i", "f", "g", "s", "h", "o", "k", "j", "f0", "G", "l", "K", "m", "L", "a0", "J", "p", "b0", "q", "Q", "S", "U", t.f38095d, "O", "u", "N", "v", "d0", "w", "x", "y", "D", "z", "A", "B", "C", "E", "F", "H", "I", "R", "T", "M", "V", "P", "h0", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new a();

            /* renamed from: A, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelFront;

            /* renamed from: B, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelLeft;

            /* renamed from: C, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelRight;

            /* renamed from: D, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelUp;

            /* renamed from: E, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelDown;

            /* renamed from: F, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnSubmit;

            /* renamed from: G, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnRetake;

            /* renamed from: H, reason: from kotlin metadata and from toString */
            @Nullable
            public final String autoCaptureOn;

            /* renamed from: I, reason: from kotlin metadata and from toString */
            @Nullable
            public final String captureSuccess;

            /* renamed from: J, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintCenterFaceDescription;

            /* renamed from: K, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookLeftDescription;

            /* renamed from: L, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookRightDescription;

            /* renamed from: M, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUpDescription;

            /* renamed from: N, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDownDescription;

            /* renamed from: O, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraLoadingTitle;

            /* renamed from: P, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintVerifying;

            /* renamed from: Q, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintAutoCaptureTimeout;

            /* renamed from: R, reason: from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String disclosure;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String startButton;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String capturePageTitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String promptPageNavBarTitle;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintTakePhoto;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintCenterFace;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooClose;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooFar;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintMultipleFaces;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceIncomplete;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintPoseNotCentered;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookLeft;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookRight;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUp;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDown;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintHoldStill;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintPoseTimeout;

            /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageTitle;

            /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageDescription;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Strings> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Strings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String startButton, @NotNull String capturePageTitle, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String selfieHintTakePhoto, @NotNull String selfieHintCenterFace, @NotNull String selfieHintFaceTooClose, @NotNull String selfieHintFaceTooFar, @NotNull String selfieHintMultipleFaces, @NotNull String selfieHintFaceIncomplete, @NotNull String selfieHintPoseNotCentered, @NotNull String selfieHintLookLeft, @NotNull String selfieHintLookRight, @Nullable String str5, @Nullable String str6, @NotNull String selfieHintHoldStill, @Nullable String str7, @NotNull String processingTitle, @NotNull String processingDescription, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(startButton, "startButton");
                Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
                Intrinsics.checkNotNullParameter(selfieHintTakePhoto, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(selfieHintCenterFace, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
                Intrinsics.checkNotNullParameter(selfieHintLookLeft, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(selfieHintLookRight, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(selfieHintHoldStill, "selfieHintHoldStill");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.startButton = startButton;
                this.capturePageTitle = capturePageTitle;
                this.capturePageNavBarTitle = str;
                this.promptPageNavBarTitle = str2;
                this.pendingPageNavBarTitle = str3;
                this.checkPageNavBarTitle = str4;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCentered = selfieHintPoseNotCentered;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintLookUp = str5;
                this.selfieHintLookDown = str6;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.selfieHintPoseTimeout = str7;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.selfieCheckPageTitle = str8;
                this.selfieCheckPageDescription = str9;
                this.selfieCheckPageLabelFront = str10;
                this.selfieCheckPageLabelLeft = str11;
                this.selfieCheckPageLabelRight = str12;
                this.selfieCheckPageLabelUp = str13;
                this.selfieCheckPageLabelDown = str14;
                this.selfieCheckPageBtnSubmit = str15;
                this.selfieCheckPageBtnRetake = str16;
                this.autoCaptureOn = str17;
                this.captureSuccess = str18;
                this.selfieHintCenterFaceDescription = str19;
                this.selfieHintLookLeftDescription = str20;
                this.selfieHintLookRightDescription = str21;
                this.selfieHintLookUpDescription = str22;
                this.selfieHintLookDownDescription = str23;
                this.cameraLoadingTitle = str24;
                this.selfieHintVerifying = str25;
                this.selfieHintAutoCaptureTimeout = str26;
                this.disclaimer = str27;
            }

            @Nullable
            /* renamed from: A, reason: from getter */
            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }

            @Nullable
            /* renamed from: C, reason: from getter */
            public final String getSelfieCheckPageLabelUp() {
                return this.selfieCheckPageLabelUp;
            }

            @Nullable
            /* renamed from: D, reason: from getter */
            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            @Nullable
            /* renamed from: E, reason: from getter */
            public final String getSelfieHintAutoCaptureTimeout() {
                return this.selfieHintAutoCaptureTimeout;
            }

            @NotNull
            /* renamed from: G, reason: from getter */
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @Nullable
            /* renamed from: I, reason: from getter */
            public final String getSelfieHintCenterFaceDescription() {
                return this.selfieHintCenterFaceDescription;
            }

            @NotNull
            /* renamed from: J, reason: from getter */
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            /* renamed from: K, reason: from getter */
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            /* renamed from: L, reason: from getter */
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            /* renamed from: N, reason: from getter */
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @Nullable
            /* renamed from: O, reason: from getter */
            public final String getSelfieHintLookDown() {
                return this.selfieHintLookDown;
            }

            @Nullable
            /* renamed from: P, reason: from getter */
            public final String getSelfieHintLookDownDescription() {
                return this.selfieHintLookDownDescription;
            }

            @NotNull
            /* renamed from: Q, reason: from getter */
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @Nullable
            /* renamed from: R, reason: from getter */
            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            @NotNull
            /* renamed from: S, reason: from getter */
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @Nullable
            /* renamed from: T, reason: from getter */
            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            @Nullable
            /* renamed from: U, reason: from getter */
            public final String getSelfieHintLookUp() {
                return this.selfieHintLookUp;
            }

            @Nullable
            /* renamed from: V, reason: from getter */
            public final String getSelfieHintLookUpDescription() {
                return this.selfieHintLookUpDescription;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            @NotNull
            /* renamed from: a0, reason: from getter */
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @NotNull
            /* renamed from: b0, reason: from getter */
            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }

            @Nullable
            /* renamed from: d0, reason: from getter */
            public final String getSelfieHintPoseTimeout() {
                return this.selfieHintPoseTimeout;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.prompt, strings.prompt) && Intrinsics.c(this.disclosure, strings.disclosure) && Intrinsics.c(this.startButton, strings.startButton) && Intrinsics.c(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.c(this.promptPageNavBarTitle, strings.promptPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.c(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.c(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.c(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.c(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.c(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.c(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.c(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.c(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.c(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.c(this.selfieHintLookUp, strings.selfieHintLookUp) && Intrinsics.c(this.selfieHintLookDown, strings.selfieHintLookDown) && Intrinsics.c(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.c(this.selfieHintPoseTimeout, strings.selfieHintPoseTimeout) && Intrinsics.c(this.processingTitle, strings.processingTitle) && Intrinsics.c(this.processingDescription, strings.processingDescription) && Intrinsics.c(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.c(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.c(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.c(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.c(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.c(this.selfieCheckPageLabelUp, strings.selfieCheckPageLabelUp) && Intrinsics.c(this.selfieCheckPageLabelDown, strings.selfieCheckPageLabelDown) && Intrinsics.c(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.c(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.c(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.c(this.captureSuccess, strings.captureSuccess) && Intrinsics.c(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.c(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.c(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.c(this.selfieHintLookUpDescription, strings.selfieHintLookUpDescription) && Intrinsics.c(this.selfieHintLookDownDescription, strings.selfieHintLookDownDescription) && Intrinsics.c(this.cameraLoadingTitle, strings.cameraLoadingTitle) && Intrinsics.c(this.selfieHintVerifying, strings.selfieHintVerifying) && Intrinsics.c(this.selfieHintAutoCaptureTimeout, strings.selfieHintAutoCaptureTimeout) && Intrinsics.c(this.disclaimer, strings.disclaimer);
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            @NotNull
            /* renamed from: f0, reason: from getter */
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            @Nullable
            /* renamed from: g, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* renamed from: h0, reason: from getter */
            public final String getSelfieHintVerifying() {
                return this.selfieHintVerifying;
            }

            public int hashCode() {
                int hashCode = ((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31;
                String str = this.capturePageNavBarTitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.promptPageNavBarTitle;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.pendingPageNavBarTitle;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.checkPageNavBarTitle;
                int hashCode5 = (((((((((((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31;
                String str5 = this.selfieHintLookUp;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieHintLookDown;
                int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.selfieHintHoldStill.hashCode()) * 31;
                String str7 = this.selfieHintPoseTimeout;
                int hashCode8 = (((((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str8 = this.selfieCheckPageTitle;
                int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.selfieCheckPageDescription;
                int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieCheckPageLabelFront;
                int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieCheckPageLabelLeft;
                int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieCheckPageLabelRight;
                int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.selfieCheckPageLabelUp;
                int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.selfieCheckPageLabelDown;
                int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.selfieCheckPageBtnSubmit;
                int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.selfieCheckPageBtnRetake;
                int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.autoCaptureOn;
                int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.captureSuccess;
                int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.selfieHintCenterFaceDescription;
                int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.selfieHintLookLeftDescription;
                int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.selfieHintLookRightDescription;
                int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.selfieHintLookUpDescription;
                int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.selfieHintLookDownDescription;
                int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.cameraLoadingTitle;
                int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.selfieHintVerifying;
                int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.selfieHintAutoCaptureTimeout;
                int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.disclaimer;
                return hashCode27 + (str27 != null ? str27.hashCode() : 0);
            }

            @NotNull
            /* renamed from: i, reason: from getter */
            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            @NotNull
            /* renamed from: i0, reason: from getter */
            public final String getStartButton() {
                return this.startButton;
            }

            @Nullable
            /* renamed from: j, reason: from getter */
            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            @Nullable
            /* renamed from: k, reason: from getter */
            public final String getCheckPageNavBarTitle() {
                return this.checkPageNavBarTitle;
            }

            @Nullable
            /* renamed from: m, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            /* renamed from: n, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* renamed from: o, reason: from getter */
            public final String getPendingPageNavBarTitle() {
                return this.pendingPageNavBarTitle;
            }

            @NotNull
            /* renamed from: p, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            /* renamed from: q, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            /* renamed from: r, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* renamed from: s, reason: from getter */
            public final String getPromptPageNavBarTitle() {
                return this.promptPageNavBarTitle;
            }

            @Nullable
            /* renamed from: t, reason: from getter */
            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", capturePageNavBarTitle=" + this.capturePageNavBarTitle + ", promptPageNavBarTitle=" + this.promptPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintLookUp=" + this.selfieHintLookUp + ", selfieHintLookDown=" + this.selfieHintLookDown + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", selfieHintPoseTimeout=" + this.selfieHintPoseTimeout + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageLabelUp=" + this.selfieCheckPageLabelUp + ", selfieCheckPageLabelDown=" + this.selfieCheckPageLabelDown + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ", autoCaptureOn=" + this.autoCaptureOn + ", captureSuccess=" + this.captureSuccess + ", selfieHintCenterFaceDescription=" + this.selfieHintCenterFaceDescription + ", selfieHintLookLeftDescription=" + this.selfieHintLookLeftDescription + ", selfieHintLookRightDescription=" + this.selfieHintLookRightDescription + ", selfieHintLookUpDescription=" + this.selfieHintLookUpDescription + ", selfieHintLookDownDescription=" + this.selfieHintLookDownDescription + ", cameraLoadingTitle=" + this.cameraLoadingTitle + ", selfieHintVerifying=" + this.selfieHintVerifying + ", selfieHintAutoCaptureTimeout=" + this.selfieHintAutoCaptureTimeout + ", disclaimer=" + this.disclaimer + ")";
            }

            @Nullable
            /* renamed from: u, reason: from getter */
            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            @Nullable
            /* renamed from: v, reason: from getter */
            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            @Nullable
            /* renamed from: w, reason: from getter */
            public final String getSelfieCheckPageLabelDown() {
                return this.selfieCheckPageLabelDown;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.disclosure);
                dest.writeString(this.startButton);
                dest.writeString(this.capturePageTitle);
                dest.writeString(this.capturePageNavBarTitle);
                dest.writeString(this.promptPageNavBarTitle);
                dest.writeString(this.pendingPageNavBarTitle);
                dest.writeString(this.checkPageNavBarTitle);
                dest.writeString(this.selfieHintTakePhoto);
                dest.writeString(this.selfieHintCenterFace);
                dest.writeString(this.selfieHintFaceTooClose);
                dest.writeString(this.selfieHintFaceTooFar);
                dest.writeString(this.selfieHintMultipleFaces);
                dest.writeString(this.selfieHintFaceIncomplete);
                dest.writeString(this.selfieHintPoseNotCentered);
                dest.writeString(this.selfieHintLookLeft);
                dest.writeString(this.selfieHintLookRight);
                dest.writeString(this.selfieHintLookUp);
                dest.writeString(this.selfieHintLookDown);
                dest.writeString(this.selfieHintHoldStill);
                dest.writeString(this.selfieHintPoseTimeout);
                dest.writeString(this.processingTitle);
                dest.writeString(this.processingDescription);
                dest.writeString(this.selfieCheckPageTitle);
                dest.writeString(this.selfieCheckPageDescription);
                dest.writeString(this.selfieCheckPageLabelFront);
                dest.writeString(this.selfieCheckPageLabelLeft);
                dest.writeString(this.selfieCheckPageLabelRight);
                dest.writeString(this.selfieCheckPageLabelUp);
                dest.writeString(this.selfieCheckPageLabelDown);
                dest.writeString(this.selfieCheckPageBtnSubmit);
                dest.writeString(this.selfieCheckPageBtnRetake);
                dest.writeString(this.autoCaptureOn);
                dest.writeString(this.captureSuccess);
                dest.writeString(this.selfieHintCenterFaceDescription);
                dest.writeString(this.selfieHintLookLeftDescription);
                dest.writeString(this.selfieHintLookRightDescription);
                dest.writeString(this.selfieHintLookUpDescription);
                dest.writeString(this.selfieHintLookDownDescription);
                dest.writeString(this.cameraLoadingTitle);
                dest.writeString(this.selfieHintVerifying);
                dest.writeString(this.selfieHintAutoCaptureTimeout);
                dest.writeString(this.disclaimer);
            }

            @Nullable
            /* renamed from: x, reason: from getter */
            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            @Nullable
            /* renamed from: z, reason: from getter */
            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                boolean z10;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                boolean z12 = parcel.readInt() != 0 ? z10 : false;
                String readString5 = parcel.readString();
                boolean z13 = parcel.readInt() != 0 ? z10 : false;
                boolean z14 = parcel.readInt() != 0 ? z10 : false;
                Strings createFromParcel = Strings.CREATOR.createFromParcel(parcel);
                SelfieType selfieType = (SelfieType) parcel.readParcelable(Input.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i11 = 0;
                    while (i11 != readInt2) {
                        arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                        i11++;
                        readInt2 = readInt2;
                    }
                }
                return new Input(readString, readString2, readString3, readString4, z11, z12, readString5, z13, z14, createFromParcel, selfieType, arrayList2, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.SelfieStepStyle) parcel.readParcelable(Input.class.getClassLoader()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.Selfie.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), PoseConfigs.CREATOR.createFromParcel(parcel), wp.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull Strings strings, @NotNull SelfieType selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable List<PoseInfo> list, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.Selfie.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @NotNull PoseConfigs poseConfigs, @NotNull wp.a designVersion, @Nullable String str9, @Nullable String str10, boolean z14, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z12;
            this.skipPromptPage = z13;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = orderedPoses;
            this.orderedPosesBuffered = list;
            this.poseTimeoutMs = l10;
            this.cameraPermissionsTitle = str;
            this.cameraPermissionsRationale = str2;
            this.cameraPermissionsModalPositiveButton = str3;
            this.cameraPermissionsModalNegativeButton = str4;
            this.microphonePermissionsTitle = str5;
            this.microphonePermissionsRationale = str6;
            this.microphonePermissionsModalPositiveButton = str7;
            this.microphonePermissionsModalNegativeButton = str8;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.fileUploadUrl = str9;
            this.flowWatermarkText = str10;
            this.usePerPoseReveal = z14;
            this.customPendingPage = customPendingPage;
        }

        @NotNull
        public final List<PoseInfo> A() {
            return this.orderedPoses;
        }

        @Nullable
        public final List<PoseInfo> C() {
            return this.orderedPosesBuffered;
        }

        @NotNull
        /* renamed from: D, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* renamed from: E, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Nullable
        /* renamed from: G, reason: from getter */
        public final Long getPoseTimeoutMs() {
            return this.poseTimeoutMs;
        }

        /* renamed from: I, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        /* renamed from: J, reason: from getter */
        public final SelfieType getSelfieType() {
            return this.selfieType;
        }

        /* renamed from: K, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @NotNull
        /* renamed from: L, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* renamed from: N, reason: from getter */
        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        /* renamed from: O, reason: from getter */
        public final boolean getUsePerPoseReveal() {
            return this.usePerPoseReveal;
        }

        @NotNull
        /* renamed from: P, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.fromComponent, input.fromComponent) && Intrinsics.c(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.c(this.strings, input.strings) && Intrinsics.c(this.selfieType, input.selfieType) && Intrinsics.c(this.orderedPoses, input.orderedPoses) && Intrinsics.c(this.orderedPosesBuffered, input.orderedPosesBuffered) && Intrinsics.c(this.poseTimeoutMs, input.poseTimeoutMs) && Intrinsics.c(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.c(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.c(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.c(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.c(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.c(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.c(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.c(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.c(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion && Intrinsics.c(this.fileUploadUrl, input.fileUploadUrl) && Intrinsics.c(this.flowWatermarkText, input.flowWatermarkText) && this.usePerPoseReveal == input.usePerPoseReveal && Intrinsics.c(this.customPendingPage, input.customPendingPage);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Nullable
        /* renamed from: g, reason: from getter */
        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            List<PoseInfo> list = this.orderedPosesBuffered;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Long l10 = this.poseTimeoutMs;
            int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.cameraPermissionsTitle;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int hashCode12 = (((((((((((hashCode11 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode()) * 31;
            String str9 = this.fileUploadUrl;
            int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.flowWatermarkText;
            int hashCode14 = (((hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.usePerPoseReveal)) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            return hashCode14 + (customPendingPage != null ? customPendingPage.hashCode() : 0);
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Nullable
        /* renamed from: n, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* renamed from: o, reason: from getter */
        public final wp.a getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* renamed from: p, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @Nullable
        /* renamed from: q, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        /* renamed from: r, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* renamed from: s, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: t, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", orderedPosesBuffered=" + this.orderedPosesBuffered + ", poseTimeoutMs=" + this.poseTimeoutMs + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ", fileUploadUrl=" + this.fileUploadUrl + ", flowWatermarkText=" + this.flowWatermarkText + ", usePerPoseReveal=" + this.usePerPoseReveal + ", customPendingPage=" + this.customPendingPage + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* renamed from: v, reason: from getter */
        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        @Nullable
        /* renamed from: w, reason: from getter */
        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            this.strings.writeToParcel(dest, flags);
            dest.writeParcelable(this.selfieType, flags);
            List<PoseInfo> list = this.orderedPoses;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<PoseInfo> list2 = this.orderedPosesBuffered;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<PoseInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            Long l10 = this.poseTimeoutMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeString(this.cameraPermissionsTitle);
            dest.writeString(this.cameraPermissionsRationale);
            dest.writeString(this.cameraPermissionsModalPositiveButton);
            dest.writeString(this.cameraPermissionsModalNegativeButton);
            dest.writeString(this.microphonePermissionsTitle);
            dest.writeString(this.microphonePermissionsRationale);
            dest.writeString(this.microphonePermissionsModalPositiveButton);
            dest.writeString(this.microphonePermissionsModalNegativeButton);
            dest.writeParcelable(this.styles, flags);
            this.videoCaptureConfig.writeToParcel(dest, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.designVersion.name());
            dest.writeString(this.fileUploadUrl);
            dest.writeString(this.flowWatermarkText);
            dest.writeInt(this.usePerPoseReveal ? 1 : 0);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @Nullable
        /* renamed from: x, reason: from getter */
        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        @NotNull
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* renamed from: z, reason: from getter */
        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "<init>", "()V", j6.b.f21518e, rl.d.f30696a, ve.a.f33391e, "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f12686a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 869674411;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0236b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0236b f12687a = new C0236b();

            public C0236b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0236b);
            }

            public int hashCode() {
                return 1455860573;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$c, reason: from toString */
        public static final /* data */ class Error extends b {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f12689a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 905373494;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "<init>", "()V", j6.b.f21518e, "e", "c", ve.a.f33391e, "f", "g", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bL\u0018\u00002\u00020\u0001:\u0002>BB\u009d\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020\f\u0012\u0006\u00100\u001a\u00020\f\u0012\u0006\u00101\u001a\u00020\f\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0019\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bJ\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bM\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010]\u001a\u0004\b`\u0010_R'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b8\u0006¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bd\u0010_R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b`\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bd\u0010n\u001a\u0004\bG\u0010oR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bF\u0010rR#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bs\u0010a\u001a\u0004\be\u0010cR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bJ\u0010t\u001a\u0004\bs\u0010uR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bD\u0010xR\u0017\u0010-\u001a\u00020'8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bN\u0010{R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\b|\u0010QR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\b}\u0010QR\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\b~\u0010QR\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\b\u007f\u0010QR#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bl\u0010cR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bp\u0010\u0081\u0001R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bm\u0010O\u001a\u0004\by\u0010QR\u0017\u00106\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bv\u0010QR\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b}\u0010O\u001a\u0004\b>\u0010QR\u0019\u00109\u001a\u0002088\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0082\u0001\u001a\u0005\bK\u0010\u0083\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010?\u001a\u0004\bt\u0010AR\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010?\u001a\u0004\b\\\u0010A¨\u0006\u0084\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "description", "autoCaptureText", "captureSuccessText", "disclaimerText", "realTimeHint", "hintAutoCaptureTimeoutText", "hintVerifyingText", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "onCameraFacingModeSelected", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isFlashOn", "isDimLightConditions", "onFlashSet", "Lin/a;", "pose", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lwp/a;", "designVersion", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkn/a;Lsr/a;ZLcom/withpersona/sdk2/camera/e$a;Lfn/c$a;Lkotlin/jvm/functions/Function1;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZLkotlin/jvm/functions/Function1;Lin/a;ZZZLwp/a;Ljava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "D", "()Ljava/lang/String;", j6.b.f21518e, "m", "c", "g", rl.d.f30696a, "e", "f", "i", "y", "h", "k", "l", "j", "Z", "I", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "B", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "p", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", t.f38095d, "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "v", "s", "Lkn/a;", "E", "()Lkn/a;", "Lsr/a;", "G", "()Lsr/a;", "u", "H", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "w", "Lfn/c$a;", "()Lfn/c$a;", "x", "F", "()F", "z", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "A", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "L", "J", "M", "K", "Lin/a;", "()Lin/a;", "Lwp/a;", "()Lwp/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: A, reason: from kotlin metadata */
            @NotNull
            public final CameraProperties.b facingMode;

            /* renamed from: B, reason: from kotlin metadata */
            public final boolean isFlashEnabled;

            /* renamed from: C, reason: from kotlin metadata */
            public final boolean isAutoFlashOnManualCaptureEnabled;

            /* renamed from: D, reason: from kotlin metadata */
            public final boolean isFlashOn;

            /* renamed from: E, reason: from kotlin metadata */
            public final boolean isDimLightConditions;

            /* renamed from: F, reason: from kotlin metadata */
            @NotNull
            public final Function1<Boolean, Unit> onFlashSet;

            /* renamed from: G, reason: from kotlin metadata */
            @Nullable
            public final in.a pose;

            /* renamed from: H, reason: from kotlin metadata */
            public final boolean requestingPermissions;

            /* renamed from: I, reason: from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* renamed from: J, reason: from kotlin metadata */
            public final boolean allowSwitchCamera;

            /* renamed from: K, reason: from kotlin metadata */
            @NotNull
            public final wp.a designVersion;

            /* renamed from: L, reason: from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* renamed from: M, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String description;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String autoCaptureText;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String captureSuccessText;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String disclaimerText;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String realTimeHint;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintAutoCaptureTimeoutText;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintVerifyingText;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final boolean isAutoCaptureOn;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AbstractC0237a mode;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final kn.a videoCaptureMethod;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final sr.a webRtcManager;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final e.a cameraXControllerFactory;

            /* renamed from: w, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final c.a camera2ControllerFactory;

            /* renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<CameraProperties.b, Unit> onCameraFacingModeSelected;

            /* renamed from: y, reason: collision with root package name and from kotlin metadata */
            public final float poseScore;

            /* renamed from: z, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\u0005\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "h", "j", "g", "c", "i", "e", "f", j6.b.f21518e, rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0237a {

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "sessionToken", "inquiryId", "stepName", "Lkotlin/Function2;", "Lin/a;", "", "", "onComplete", "Lkotlin/Function1;", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "c", "getInquiryId", rl.d.f30696a, "getStepName", "e", "Lkotlin/jvm/functions/Function2;", "getOnComplete", "()Lkotlin/jvm/functions/Function2;", "f", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$a, reason: collision with other inner class name */
                public static final class C0238a extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final String sessionToken;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String inquiryId;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String stepName;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function2<in.a, Boolean, Unit> onComplete;

                    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0238a(@NotNull b overlay, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull Function2<? super in.a, ? super Boolean, Unit> onComplete, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
                        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                        Intrinsics.checkNotNullParameter(stepName, "stepName");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.sessionToken = sessionToken;
                        this.inquiryId = inquiryId;
                        this.stepName = stepName;
                        this.onComplete = onComplete;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$b */
                public static final class b extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(@NotNull b overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.isCapturing = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "countDown", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;I)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "I", "()I", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$c, reason: collision with other inner class name */
                public static final class C0239c extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final int countDown;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0239c(@NotNull b overlay, int i10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.countDown = i10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", rl.d.f30696a, "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$d */
                public static final class d extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(@NotNull b overlay, @NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        this.overlay = overlay;
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onAnimationComplete;
                    }

                    /* renamed from: d, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Lkotlin/jvm/functions/Function1;", rl.d.f30696a, "()Lkotlin/jvm/functions/Function1;", "c", "Z", "()Z", "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$e */
                public static final class e extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public e(@NotNull b overlay, @NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.isCapturing = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
                        return this.processImage;
                    }

                    /* renamed from: e, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onCaptureClicked", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$f */
                public static final class f extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull b overlay, @NotNull Function0<Unit> onCaptureClicked) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        this.overlay = overlay;
                        this.onCaptureClicked = onCaptureClicked;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "poseHintComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$g */
                public static final class g extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(@NotNull b overlay, @NotNull Function0<Unit> poseHintComplete) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        this.overlay = overlay;
                        this.poseHintComplete = poseHintComplete;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }
                }

                @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Z", "e", "()Z", "c", "J", "()J", rl.d.f30696a, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$h */
                public static final class h extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public h(@NotNull b overlay, boolean z10, long j10, @NotNull Function1<? super CameraProperties, Unit> previewReady, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.recordLocalVideo = z10;
                        this.maxRecordingLengthMs = j10;
                        this.previewReady = previewReady;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<CameraProperties, Unit> d() {
                        return this.previewReady;
                    }

                    /* renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;Z)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$i */
                public static final class i extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull b overlay, @NotNull Function0<Unit> onComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        this.overlay = overlay;
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "maxRecordingLengthMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;J)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", j6.b.f21518e, "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$j */
                public static final class j extends AbstractC0237a {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(@NotNull b overlay, long j10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0237a
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ AbstractC0237a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* renamed from: a */
                public abstract b getOverlay();

                public AbstractC0237a() {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "g", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class b {

                /* renamed from: a, reason: collision with root package name */
                public static final b f12738a = new b("CLEAR", 0);
                public static final b b = new b("CENTER", 1);

                /* renamed from: c, reason: collision with root package name */
                public static final b f12739c = new b("LOOK_LEFT", 2);

                /* renamed from: d, reason: collision with root package name */
                public static final b f12740d = new b("LOOK_RIGHT", 3);

                /* renamed from: e, reason: collision with root package name */
                public static final b f12741e = new b("LOOK_UP", 4);

                /* renamed from: f, reason: collision with root package name */
                public static final b f12742f = new b("LOOK_DOWN", 5);

                /* renamed from: g, reason: collision with root package name */
                public static final b f12743g = new b("FINALIZING", 6);

                /* renamed from: h, reason: collision with root package name */
                public static final /* synthetic */ b[] f12744h;

                /* renamed from: i, reason: collision with root package name */
                public static final /* synthetic */ pt.a f12745i;

                static {
                    b[] a10 = a();
                    f12744h = a10;
                    f12745i = pt.b.a(a10);
                }

                public b(String str, int i10) {
                }

                public static final /* synthetic */ b[] a() {
                    return new b[]{f12738a, b, f12739c, f12740d, f12741e, f12742f, f12743g};
                }

                public static b valueOf(String str) {
                    return (b) Enum.valueOf(b.class, str);
                }

                public static b[] values() {
                    return (b[]) f12744h.clone();
                }
            }

            public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, AbstractC0237a abstractC0237a, StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, NavigationState navigationState, Function0 function0, Function0 function02, Function1 function1, Function0 function03, kn.a aVar, sr.a aVar2, boolean z12, e.a aVar3, c.a aVar4, Function1 function12, float f10, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.b bVar, boolean z13, boolean z14, boolean z15, boolean z16, Function1 function13, in.a aVar5, boolean z17, boolean z18, boolean z19, wp.a aVar6, String str10, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, z10, abstractC0237a, selfieStepStyle, z11, navigationState, function0, function02, function1, function03, aVar, aVar2, z12, aVar3, aVar4, function12, f10, selfieBrightnessInfo, bVar, z13, z14, z15, z16, function13, aVar5, z17, z18, z19, aVar6, (i11 & 32) != 0 ? null : str10, (i11 & 64) != 0 ? null : str11);
            }

            /* renamed from: A, reason: from getter */
            public final boolean getRequestingPermissions() {
                return this.requestingPermissions;
            }

            /* renamed from: B, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* renamed from: C, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* renamed from: D, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: E, reason: from getter */
            public final kn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* renamed from: F, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* renamed from: G, reason: from getter */
            public final sr.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* renamed from: H, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            /* renamed from: I, reason: from getter */
            public final boolean getIsAutoCaptureOn() {
                return this.isAutoCaptureOn;
            }

            /* renamed from: J, reason: from getter */
            public final boolean getIsAutoFlashOnManualCaptureEnabled() {
                return this.isAutoFlashOnManualCaptureEnabled;
            }

            /* renamed from: K, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }

            /* renamed from: L, reason: from getter */
            public final boolean getIsFlashEnabled() {
                return this.isFlashEnabled;
            }

            /* renamed from: M, reason: from getter */
            public final boolean getIsFlashOn() {
                return this.isFlashOn;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getAllowSwitchCamera() {
                return this.allowSwitchCamera;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final String getAutoCaptureText() {
                return this.autoCaptureText;
            }

            @Nullable
            /* renamed from: c, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* renamed from: d, reason: from getter */
            public final c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* renamed from: e, reason: from getter */
            public final e.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final String getCaptureSuccessText() {
                return this.captureSuccessText;
            }

            @Nullable
            /* renamed from: g, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* renamed from: h, reason: from getter */
            public final wp.a getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* renamed from: i, reason: from getter */
            public final String getDisclaimerText() {
                return this.disclaimerText;
            }

            @NotNull
            /* renamed from: j, reason: from getter */
            public final CameraProperties.b getFacingMode() {
                return this.facingMode;
            }

            @Nullable
            /* renamed from: k, reason: from getter */
            public final String getHintAutoCaptureTimeoutText() {
                return this.hintAutoCaptureTimeoutText;
            }

            @Nullable
            /* renamed from: l, reason: from getter */
            public final String getHintVerifyingText() {
                return this.hintVerifyingText;
            }

            @Nullable
            /* renamed from: m, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* renamed from: n, reason: from getter */
            public final AbstractC0237a getMode() {
                return this.mode;
            }

            @Nullable
            /* renamed from: o, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: p, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> q() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> r() {
                return this.onCameraError;
            }

            @NotNull
            public final Function1<CameraProperties.b, Unit> s() {
                return this.onCameraFacingModeSelected;
            }

            @NotNull
            public final Function0<Unit> t() {
                return this.onCancel;
            }

            @NotNull
            public final Function1<Boolean, Unit> u() {
                return this.onFlashSet;
            }

            @NotNull
            public final Function0<Unit> v() {
                return this.onPermissionChanged;
            }

            @Nullable
            /* renamed from: w, reason: from getter */
            public final in.a getPose() {
                return this.pose;
            }

            /* renamed from: x, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* renamed from: y, reason: from getter */
            public final String getRealTimeHint() {
                return this.realTimeHint;
            }

            /* renamed from: z, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @NotNull AbstractC0237a mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z12, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull Function1<? super CameraProperties.b, Unit> onCameraFacingModeSelected, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull Function1<? super Boolean, Unit> onFlashSet, @Nullable in.a aVar2, boolean z17, boolean z18, boolean z19, @NotNull wp.a designVersion, @Nullable String str10, @Nullable String str11) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
                Intrinsics.checkNotNullParameter(onCameraFacingModeSelected, "onCameraFacingModeSelected");
                Intrinsics.checkNotNullParameter(facingMode, "facingMode");
                Intrinsics.checkNotNullParameter(onFlashSet, "onFlashSet");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.disclaimerText = str6;
                this.realTimeHint = str7;
                this.hintAutoCaptureTimeoutText = str8;
                this.hintVerifyingText = str9;
                this.isAutoCaptureOn = z10;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z11;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z12;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.onCameraFacingModeSelected = onCameraFacingModeSelected;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.facingMode = facingMode;
                this.isFlashEnabled = z13;
                this.isAutoFlashOnManualCaptureEnabled = z14;
                this.isFlashOn = z15;
                this.isDimLightConditions = z16;
                this.onFlashSet = onFlashSet;
                this.pose = aVar2;
                this.requestingPermissions = z17;
                this.recordingLocallyRequired = z18;
                this.allowSwitchCamera = z19;
                this.designVersion = designVersion;
                this.watermarkText = str10;
                this.navBarTitle = str11;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b/\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b)\u00108R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b,\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b3\u00108¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "navBarTitle", "errorMessage", "Lkotlin/Function0;", "", "onClick", "onBack", "onCancel", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", ve.a.f33391e, "Ljava/lang/String;", "o", "()Ljava/lang/String;", j6.b.f21518e, "k", "c", rl.d.f30696a, "m", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final String prompt;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String disclosure;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String start;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage instructionAsset;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final SelfieType selfieType;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<PoseInfo> orderedPoses;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String errorMessage;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onClick;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String start, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @Nullable RemoteImage remoteImage, @NotNull NavigationState navigationState, @NotNull SelfieType selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable String str, @Nullable String str2, @NotNull Function0<Unit> onClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onErrorDismissed) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(start, "start");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(selfieType, "selfieType");
                Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.start = start;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.selfieType = selfieType;
                this.orderedPoses = orderedPoses;
                this.navBarTitle = str;
                this.errorMessage = str2;
                this.onClick = onClick;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onErrorDismissed = onErrorDismissed;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @Nullable
            /* renamed from: c, reason: from getter */
            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
            }

            @Nullable
            /* renamed from: d, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: e, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> f() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> g() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final List<PoseInfo> j() {
                return this.orderedPoses;
            }

            @NotNull
            /* renamed from: k, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* renamed from: l, reason: from getter */
            public final SelfieType getSelfieType() {
                return this.selfieType;
            }

            @NotNull
            /* renamed from: m, reason: from getter */
            public final String getStart() {
                return this.start;
            }

            @Nullable
            /* renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001:\u0003*,&BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b&\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010>R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010BR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bC\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\bK\u00108R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\b,\u0010MR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b*\u0010OR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bD\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010'\u001a\u0004\bP\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\b5\u0010)¨\u0006Q"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lfn/c$a;", "camera2ControllerFactory", "recordingLocallyRequired", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkn/a;Lsr/a;ZLcom/withpersona/sdk2/camera/e$a;Lfn/c$a;ZLjava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "o", "()Ljava/lang/String;", j6.b.f21518e, rl.d.f30696a, "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "e", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "f", "Z", "m", "()Z", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "i", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "l", "Lkn/a;", "p", "()Lkn/a;", "Lsr/a;", "r", "()Lsr/a;", "s", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "Lfn/c$a;", "()Lfn/c$a;", "q", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c, reason: collision with other inner class name */
        public static final class C0240c extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final b mode;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AssetOverrides assetOverrides;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final kn.a videoCaptureMethod;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final sr.a webRtcManager;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final e.a cameraXControllerFactory;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final c.a camera2ControllerFactory;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", j6.b.f21518e, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$a, reason: from toString */
            public static final /* data */ class AssetOverrides {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage leftPoseImage;

                /* renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage rightPoseImage;

                public AssetOverrides(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                @Nullable
                /* renamed from: a, reason: from getter */
                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                @Nullable
                /* renamed from: b, reason: from getter */
                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return Intrinsics.c(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.c(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return hashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "g", "i", "f", j6.b.f21518e, "h", rl.d.f30696a, "e", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b */
            public static abstract class b {

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", j6.b.f21518e, "Z", "()Z", "c", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$a */
                public static final class a extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(@NotNull EnumC0243c overlay, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.isCapturing = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* renamed from: c, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "countDown", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", ve.a.f33391e, "I", j6.b.f21518e, "()I", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$b, reason: collision with other inner class name */
                public static final class C0241b extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    public final int countDown;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0241b(int i10, @NotNull EnumC0243c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.countDown = i10;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }

                    /* renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function1;", j6.b.f21518e, "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "e", "()Z", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$c, reason: collision with other inner class name */
                public static final class C0242c extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0242c(@NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10, @NotNull EnumC0243c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onAnimationComplete;
                    }

                    /* renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* renamed from: e, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BQ\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "isCapturing", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function1;", rl.d.f30696a, "()Lkotlin/jvm/functions/Function1;", j6.b.f21518e, "c", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "e", "f", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$d */
                public static final class d extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    public /* synthetic */ d(Function1 function1, Function1 function12, boolean z10, EnumC0243c enumC0243c, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function12, (i10 & 4) != 0 ? false : z10, enumC0243c, z11, z12);
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
                        return this.processImage;
                    }

                    /* renamed from: e, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* renamed from: f, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(@NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, @NotNull EnumC0243c overlay, boolean z11, boolean z12) {
                        super(null);
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                        this.isCapturing = z12;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onCaptureClicked", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", j6.b.f21518e, "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$e */
                public static final class e extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(@NotNull Function0<Unit> onCaptureClicked, @NotNull EnumC0243c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }

                    /* renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "poseHintComplete", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", j6.b.f21518e, "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$f */
                public static final class f extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull Function0<Unit> poseHintComplete, @NotNull EnumC0243c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }

                    /* renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "recordLocalVideo", "", "maxRecordingLengthMs", "", "onError", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZJLkotlin/jvm/functions/Function1;)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function1;", rl.d.f30696a, "()Lkotlin/jvm/functions/Function1;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "f", "()Z", "e", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g */
                public static final class g extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(@NotNull Function1<? super CameraProperties, Unit> previewReady, @NotNull EnumC0243c overlay, boolean z10, boolean z11, long j10, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.previewReady = previewReady;
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.recordLocalVideo = z11;
                        this.maxRecordingLengthMs = j10;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<CameraProperties, Unit> d() {
                        return this.previewReady;
                    }

                    /* renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    /* renamed from: f, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", j6.b.f21518e, "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", rl.d.f30696a, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$h */
                public static final class h extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final boolean imageCaptured;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(@NotNull Function0<Unit> onComplete, boolean z10, @NotNull EnumC0243c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }

                    /* renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", j6.b.f21518e, "J", "()J", "c", "Z", "getShowProgress", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$i */
                public static final class i extends b {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0243c overlay;

                    /* renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull EnumC0243c overlay, long j10, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0240c.b
                    @NotNull
                    /* renamed from: a, reason: from getter */
                    public EnumC0243c getOverlay() {
                        return this.overlay;
                    }

                    /* renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* renamed from: a */
                public abstract EnumC0243c getOverlay();

                public b() {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c, reason: collision with other inner class name */
            public static final class EnumC0243c {

                /* renamed from: a, reason: collision with root package name */
                public static final EnumC0243c f12806a = new EnumC0243c("CLEAR", 0);
                public static final EnumC0243c b = new EnumC0243c("CENTER", 1);

                /* renamed from: c, reason: collision with root package name */
                public static final EnumC0243c f12807c = new EnumC0243c("CENTER_COMPLETE", 2);

                /* renamed from: d, reason: collision with root package name */
                public static final EnumC0243c f12808d = new EnumC0243c("LOOK_LEFT_HINT", 3);

                /* renamed from: e, reason: collision with root package name */
                public static final EnumC0243c f12809e = new EnumC0243c("LOOK_LEFT", 4);

                /* renamed from: f, reason: collision with root package name */
                public static final EnumC0243c f12810f = new EnumC0243c("LOOK_LEFT_COMPLETE", 5);

                /* renamed from: g, reason: collision with root package name */
                public static final EnumC0243c f12811g = new EnumC0243c("LOOK_RIGHT_HINT", 6);

                /* renamed from: h, reason: collision with root package name */
                public static final EnumC0243c f12812h = new EnumC0243c("LOOK_RIGHT", 7);

                /* renamed from: i, reason: collision with root package name */
                public static final EnumC0243c f12813i = new EnumC0243c("LOOK_RIGHT_COMPLETE", 8);

                /* renamed from: j, reason: collision with root package name */
                public static final EnumC0243c f12814j = new EnumC0243c("LOOK_UP_HINT", 9);

                /* renamed from: k, reason: collision with root package name */
                public static final EnumC0243c f12815k = new EnumC0243c("LOOK_UP", 10);

                /* renamed from: l, reason: collision with root package name */
                public static final EnumC0243c f12816l = new EnumC0243c("LOOK_UP_COMPLETE", 11);

                /* renamed from: m, reason: collision with root package name */
                public static final EnumC0243c f12817m = new EnumC0243c("LOOK_DOWN_HINT", 12);

                /* renamed from: n, reason: collision with root package name */
                public static final EnumC0243c f12818n = new EnumC0243c("LOOK_DOWN", 13);

                /* renamed from: o, reason: collision with root package name */
                public static final EnumC0243c f12819o = new EnumC0243c("LOOK_DOWN_COMPLETE", 14);

                /* renamed from: p, reason: collision with root package name */
                public static final EnumC0243c f12820p = new EnumC0243c("FINALIZING", 15);

                /* renamed from: q, reason: collision with root package name */
                public static final EnumC0243c f12821q = new EnumC0243c("COMPLETE_WITH_CAPTURE", 16);

                /* renamed from: r, reason: collision with root package name */
                public static final EnumC0243c f12822r = new EnumC0243c("COMPLETE", 17);

                /* renamed from: s, reason: collision with root package name */
                public static final /* synthetic */ EnumC0243c[] f12823s;

                /* renamed from: t, reason: collision with root package name */
                public static final /* synthetic */ pt.a f12824t;

                static {
                    EnumC0243c[] a10 = a();
                    f12823s = a10;
                    f12824t = pt.b.a(a10);
                }

                public EnumC0243c(String str, int i10) {
                }

                public static final /* synthetic */ EnumC0243c[] a() {
                    return new EnumC0243c[]{f12806a, b, f12807c, f12808d, f12809e, f12810f, f12811g, f12812h, f12813i, f12814j, f12815k, f12816l, f12817m, f12818n, f12819o, f12820p, f12821q, f12822r};
                }

                public static EnumC0243c valueOf(String str) {
                    return (EnumC0243c) Enum.valueOf(EnumC0243c.class, str);
                }

                public static EnumC0243c[] values() {
                    return (EnumC0243c[]) f12823s.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0240c(@Nullable String str, @Nullable String str2, @NotNull b mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull AssetOverrides assetOverrides, boolean z10, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z11, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, boolean z12, @Nullable String str3, @Nullable String str4) {
                super(null);
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
                this.title = str;
                this.message = str2;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z10;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z11;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.recordingLocallyRequired = z12;
                this.watermarkText = str3;
                this.navBarTitle = str4;
            }

            @NotNull
            /* renamed from: a, reason: from getter */
            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* renamed from: c, reason: from getter */
            public final e.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* renamed from: d, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* renamed from: e, reason: from getter */
            public final b getMode() {
                return this.mode;
            }

            @Nullable
            /* renamed from: f, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: g, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> i() {
                return this.onCameraError;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> k() {
                return this.onPermissionChanged;
            }

            /* renamed from: l, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* renamed from: m, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: p, reason: from getter */
            public final kn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* renamed from: q, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* renamed from: r, reason: from getter */
            public final sr.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* renamed from: s, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0010\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", rl.d.f30696a, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.uiScreen = uiScreen;
                this.navigationState = navigationState;
                this.styles = selfieStepStyle;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @Nullable
            /* renamed from: e, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* renamed from: f, reason: from getter */
            public final UiComponentScreen getUiScreen() {
                return this.uiScreen;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lkotlin/Function0;", "", "rendered", "<init>", "(Lkotlin/jvm/functions/Function0;)V", ve.a.f33391e, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> rendered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Function0<Unit> rendered) {
                super(null);
                Intrinsics.checkNotNullParameter(rendered, "rendered");
                this.rendered = rendered;
            }

            @NotNull
            public final Function0<Unit> a() {
                return this.rendered;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0015Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001d\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b!\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u0015\u0010)¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "strings", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "h", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", j6.b.f21518e, "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "e", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class f extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Strings strings;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final List<Selfie> selfies;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onUsePhotos;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetakePhotos;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "", "", Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "selfieLabelUp", "selfieLabelDown", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "i", j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "g", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$f$a, reason: from toString */
            public static final /* data */ class Strings {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String title;

                /* renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final String description;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelFront;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelLeft;

                /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelRight;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelUp;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelDown;

                /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String submitButton;

                /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String retakeButton;

                public Strings(@NotNull String title, @NotNull String description, @NotNull String selfieLabelFront, @NotNull String selfieLabelLeft, @NotNull String selfieLabelRight, @NotNull String selfieLabelUp, @NotNull String selfieLabelDown, @NotNull String submitButton, @NotNull String retakeButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(selfieLabelFront, "selfieLabelFront");
                    Intrinsics.checkNotNullParameter(selfieLabelLeft, "selfieLabelLeft");
                    Intrinsics.checkNotNullParameter(selfieLabelRight, "selfieLabelRight");
                    Intrinsics.checkNotNullParameter(selfieLabelUp, "selfieLabelUp");
                    Intrinsics.checkNotNullParameter(selfieLabelDown, "selfieLabelDown");
                    Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                    Intrinsics.checkNotNullParameter(retakeButton, "retakeButton");
                    this.title = title;
                    this.description = description;
                    this.selfieLabelFront = selfieLabelFront;
                    this.selfieLabelLeft = selfieLabelLeft;
                    this.selfieLabelRight = selfieLabelRight;
                    this.selfieLabelUp = selfieLabelUp;
                    this.selfieLabelDown = selfieLabelDown;
                    this.submitButton = submitButton;
                    this.retakeButton = retakeButton;
                }

                @NotNull
                /* renamed from: a, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                /* renamed from: b, reason: from getter */
                public final String getRetakeButton() {
                    return this.retakeButton;
                }

                @NotNull
                /* renamed from: c, reason: from getter */
                public final String getSelfieLabelDown() {
                    return this.selfieLabelDown;
                }

                @NotNull
                /* renamed from: d, reason: from getter */
                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                @NotNull
                /* renamed from: e, reason: from getter */
                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.description, strings.description) && Intrinsics.c(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.c(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.c(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.c(this.selfieLabelUp, strings.selfieLabelUp) && Intrinsics.c(this.selfieLabelDown, strings.selfieLabelDown) && Intrinsics.c(this.submitButton, strings.submitButton) && Intrinsics.c(this.retakeButton, strings.retakeButton);
                }

                @NotNull
                /* renamed from: f, reason: from getter */
                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                @NotNull
                /* renamed from: g, reason: from getter */
                public final String getSelfieLabelUp() {
                    return this.selfieLabelUp;
                }

                @NotNull
                /* renamed from: h, reason: from getter */
                public final String getSubmitButton() {
                    return this.submitButton;
                }

                public int hashCode() {
                    return (((((((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.selfieLabelUp.hashCode()) * 31) + this.selfieLabelDown.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                @NotNull
                /* renamed from: i, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", selfieLabelUp=" + this.selfieLabelUp + ", selfieLabelDown=" + this.selfieLabelDown + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(@NotNull Strings strings, @NotNull List<? extends Selfie> selfies, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onUsePhotos, @NotNull Function0<Unit> onRetakePhotos, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(strings, "strings");
                Intrinsics.checkNotNullParameter(selfies, "selfies");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onUsePhotos, "onUsePhotos");
                Intrinsics.checkNotNullParameter(onRetakePhotos, "onRetakePhotos");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.strings = strings;
                this.selfies = selfies;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = onUsePhotos;
                this.onRetakePhotos = onRetakePhotos;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onRetakePhotos;
            }

            @NotNull
            public final Function0<Unit> f() {
                return this.onUsePhotos;
            }

            @NotNull
            public final List<Selfie> g() {
                return this.selfies;
            }

            @NotNull
            /* renamed from: h, reason: from getter */
            public final Strings getStrings() {
                return this.strings;
            }

            @Nullable
            /* renamed from: i, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b!\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b&\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b;\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b8\u0010=R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b5\u00103¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "Loq/c;", "sdkFilesManager", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lwp/a;", "designVersion", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "<init>", "(Ljava/lang/String;Loq/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lwp/a;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", ve.a.f33391e, "Ljava/lang/String;", "n", "()Ljava/lang/String;", j6.b.f21518e, "Loq/c;", "l", "()Loq/c;", "c", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "k", "Lwp/a;", "()Lwp/a;", "o", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final oq.c sdkFilesManager;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String description;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage customLoadingAsset;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final wp.a designVersion;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String centerSelfieFilePath;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String uploadScanningHintText;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final InternalErrorInfo recoverableSubmitError;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetrySubmit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@NotNull String title, @NotNull oq.c sdkFilesManager, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable RemoteImage remoteImage, @Nullable String str, @NotNull wp.a designVersion, @Nullable String str2, @Nullable String str3, @Nullable InternalErrorInfo internalErrorInfo, @NotNull Function0<Unit> onRetrySubmit) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                Intrinsics.checkNotNullParameter(onRetrySubmit, "onRetrySubmit");
                this.title = title;
                this.sdkFilesManager = sdkFilesManager;
                this.description = description;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.customLoadingAsset = remoteImage;
                this.navBarTitle = str;
                this.designVersion = designVersion;
                this.centerSelfieFilePath = str2;
                this.uploadScanningHintText = str3;
                this.recoverableSubmitError = internalErrorInfo;
                this.onRetrySubmit = onRetrySubmit;
            }

            @Nullable
            /* renamed from: a, reason: from getter */
            public final String getCenterSelfieFilePath() {
                return this.centerSelfieFilePath;
            }

            @Nullable
            /* renamed from: b, reason: from getter */
            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            @NotNull
            /* renamed from: c, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* renamed from: d, reason: from getter */
            public final wp.a getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* renamed from: e, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* renamed from: f, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> g() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onRetrySubmit;
            }

            @NotNull
            /* renamed from: j, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            /* renamed from: k, reason: from getter */
            public final InternalErrorInfo getRecoverableSubmitError() {
                return this.recoverableSubmitError;
            }

            @NotNull
            /* renamed from: l, reason: from getter */
            public final oq.c getSdkFilesManager() {
                return this.sdkFilesManager;
            }

            @Nullable
            /* renamed from: m, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* renamed from: n, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* renamed from: o, reason: from getter */
            public final String getUploadScanningHintText() {
                return this.uploadScanningHintText;
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
        public static final /* synthetic */ int[] f12861a;
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
            f12861a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.f34766a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x.f34767c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[x.f34768d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[x.f34769e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", f = "SelfieWorkflow.kt", l = {165}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12862t;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return SelfieWorkflow.this.new e(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f12862t;
            if (i10 == 0) {
                gt.o.b(obj);
                dn.j jVar = dn.j.f15081a;
                Context context = SelfieWorkflow.this.applicationContext;
                this.f12862t = 1;
                if (jVar.b(context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            sr.a aVar = SelfieWorkflow.this.webRtcManager;
            if (aVar != null) {
                aVar.e();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", f = "SelfieWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12864t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12865u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12866v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f12865u = aVar;
            this.f12866v = selfieWorkflow;
        }

        public static final Unit q(SelfieWorkflow selfieWorkflow, r.c cVar) {
            selfieWorkflow.Z3(cVar);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f12865u, this.f12866v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, SelfieState, ? extends b> d10;
            nt.c.e();
            if (this.f12864t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            wm.h<r<? super Input, SelfieState, ? extends b>> d11 = this.f12865u.d();
            final SelfieWorkflow selfieWorkflow = this.f12866v;
            d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = SelfieWorkflow.f.q(SelfieWorkflow.this, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1", f = "SelfieWorkflow.kt", l = {493}, m = "invokeSuspend")
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12867t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f12869v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12870w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i10, wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f12869v = i10;
            this.f12870w = aVar;
        }

        public static final Unit q(SelfieWorkflow selfieWorkflow, PoseInfo poseInfo, r.c cVar) {
            Object c10 = cVar.c();
            SelfieState.AcquireNextPose acquireNextPose = c10 instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) c10 : null;
            if (acquireNextPose == null) {
                return Unit.f22894a;
            }
            cVar.e(selfieWorkflow.x1(cVar, SelfieState.AcquireNextPose.A(acquireNextPose, null, 0L, null, null, null, false, kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return SelfieWorkflow.this.new g(this.f12869v, this.f12870w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object k10;
            r<? super Input, SelfieState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f12867t;
            if (i10 == 0) {
                gt.o.b(obj);
                bq.a aVar = SelfieWorkflow.this.selfiePoseManager;
                if (aVar == null) {
                    Intrinsics.u("selfiePoseManager");
                    aVar = null;
                }
                int i11 = this.f12869v;
                this.f12867t = 1;
                k10 = aVar.k(i11, this);
                if (k10 == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                k10 = ((gt.n) obj).getValue();
            }
            wm.k<Input, SelfieState, b, Object>.a aVar2 = this.f12870w;
            final SelfieWorkflow selfieWorkflow = SelfieWorkflow.this;
            if (gt.n.h(k10)) {
                final PoseInfo poseInfo = (PoseInfo) k10;
                wm.h<r<? super Input, SelfieState, ? extends b>> d11 = aVar2.d();
                d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.x4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit q10;
                        q10 = SelfieWorkflow.g.q(SelfieWorkflow.this, poseInfo, (r.c) obj2);
                        return q10;
                    }
                }, 1, null);
                d11.a(d10);
            }
            SelfieWorkflow selfieWorkflow2 = SelfieWorkflow.this;
            wm.k<Input, SelfieState, b, Object>.a aVar3 = this.f12870w;
            Throwable e11 = gt.n.e(k10);
            if (e11 != null) {
                selfieWorkflow2.W3(aVar3, e11);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1", f = "SelfieWorkflow.kt", l = {1379, 1381}, m = "invokeSuspend")
    public static final class h extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f12871t;

        /* renamed from: u, reason: collision with root package name */
        public int f12872u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieState.Capture f12873v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12874w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12875x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(SelfieState.Capture capture, SelfieWorkflow selfieWorkflow, wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f12873v = capture;
            this.f12874w = selfieWorkflow;
            this.f12875x = aVar;
        }

        public static final Unit q(SelfieState.Capture capture, r.c cVar) {
            Object c10 = cVar.c();
            SelfieState.Capture capture2 = c10 instanceof SelfieState.Capture ? (SelfieState.Capture) c10 : null;
            if (capture2 != null && Intrinsics.c(capture2.getCaptureDeadlineEpochMs(), capture.getCaptureDeadlineEpochMs())) {
                l2.c(capture2);
                if (((Input) cVar.b()).getSkipPromptPage()) {
                    cVar.e(new SelfieState.AcquireNextPose(capture2.getCameraProperties(), capture2.getStartSelfieTimestamp(), kotlin.collections.p.k(), p.k(cVar, false), capture2.getCameraFacingMode(), capture2.getIsFlashEnabled(), capture2.g(), capture2.getPoseConfigs(), capture2.getAutoCaptureSupported()));
                } else {
                    cVar.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
                }
                return Unit.f22894a;
            }
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new h(this.f12873v, this.f12874w, this.f12875x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (r10.o(r9) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if (ju.z0.c(r7, r9) == r0) goto L18;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f12872u
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                gt.o.b(r10)
                goto L5f
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                long r5 = r9.f12871t
                gt.o.b(r10)
                goto L46
            L21:
                gt.o.b(r10)
                com.withpersona.sdk2.inquiry.selfie.SelfieState$Capture r10 = r9.f12873v
                java.lang.Long r10 = r10.getCaptureDeadlineEpochMs()
                long r5 = r10.longValue()
                long r7 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r7
                kotlin.time.a$a r10 = kotlin.time.a.INSTANCE
                iu.b r10 = iu.b.f21120d
                long r7 = kotlin.time.b.q(r5, r10)
                r9.f12871t = r5
                r9.f12872u = r4
                java.lang.Object r10 = ju.z0.c(r7, r9)
                if (r10 != r0) goto L46
                goto L5e
            L46:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r10 = r9.f12874w
                bq.a r10 = com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.q1(r10)
                if (r10 != 0) goto L54
                java.lang.String r10 = "selfiePoseManager"
                kotlin.jvm.internal.Intrinsics.u(r10)
                r10 = r3
            L54:
                r9.f12871t = r5
                r9.f12872u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L5f
            L5e:
                return r0
            L5f:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r10 = r9.f12874w
                com.withpersona.sdk2.inquiry.selfie.g r10 = com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.p1(r10)
                r10.n()
                wm.k<com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, java.lang.Object>$a r10 = r9.f12875x
                wm.h r10 = r10.d()
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r0 = r9.f12874w
                com.withpersona.sdk2.inquiry.selfie.SelfieState$Capture r1 = r9.f12873v
                wp.y4 r2 = new wp.y4
                r2.<init>()
                wm.r r0 = wm.w.g(r0, r3, r2, r4, r3)
                r10.a(r0)
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", f = "SelfieWorkflow.kt", l = {1537}, m = "invokeSuspend")
    public static final class i extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12876t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12877u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12878v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, mt.b<? super i> bVar) {
            super(2, bVar);
            this.f12877u = aVar;
            this.f12878v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(r.c cVar) {
            SelfieState.Capture z10;
            Object c10 = cVar.c();
            SelfieState.Capture capture = c10 instanceof SelfieState.Capture ? (SelfieState.Capture) c10 : null;
            if (capture == null) {
                return Unit.f22894a;
            }
            z10 = capture.z((r36 & 1) != 0 ? capture.selfieError : null, (r36 & 2) != 0 ? capture.poseScore : 0.0f, (r36 & 4) != 0 ? capture.brightnessInfo : null, (r36 & 8) != 0 ? capture.selfies : null, (r36 & 16) != 0 ? capture.posesNeeded : null, (r36 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture.autoCaptureSupported : false, (r36 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture.cameraProperties : null, (r36 & 512) != 0 ? capture.backState : null, (r36 & 1024) != 0 ? capture.poseConfigs : null, (r36 & 2048) != 0 ? capture.cameraFacingMode : null, (r36 & 4096) != 0 ? capture.isFlashEnabled : false, (r36 & 8192) != 0 ? capture.flashState : SelfieState.a.f12612d, (r36 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture.isDimLightConditions : false);
            cVar.e(z10);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new i(this.f12877u, this.f12878v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, SelfieState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f12876t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f12876t = 1;
                if (z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            wm.h<r<? super Input, SelfieState, ? extends b>> d11 = this.f12877u.d();
            d10 = z.d(this.f12878v, null, new Function1() { // from class: wp.z4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = SelfieWorkflow.i.q((r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$4", f = "SelfieWorkflow.kt", l = {1551}, m = "invokeSuspend")
    public static final class j extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12879t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12880u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12881v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, mt.b<? super j> bVar) {
            super(2, bVar);
            this.f12880u = aVar;
            this.f12881v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(r.c cVar) {
            SelfieState.Capture z10;
            Object c10 = cVar.c();
            SelfieState.Capture capture = c10 instanceof SelfieState.Capture ? (SelfieState.Capture) c10 : null;
            if (capture == null) {
                return Unit.f22894a;
            }
            z10 = capture.z((r36 & 1) != 0 ? capture.selfieError : null, (r36 & 2) != 0 ? capture.poseScore : 0.0f, (r36 & 4) != 0 ? capture.brightnessInfo : null, (r36 & 8) != 0 ? capture.selfies : null, (r36 & 16) != 0 ? capture.posesNeeded : null, (r36 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture.autoCaptureSupported : false, (r36 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture.cameraProperties : null, (r36 & 512) != 0 ? capture.backState : null, (r36 & 1024) != 0 ? capture.poseConfigs : null, (r36 & 2048) != 0 ? capture.cameraFacingMode : null, (r36 & 4096) != 0 ? capture.isFlashEnabled : false, (r36 & 8192) != 0 ? capture.flashState : SelfieState.a.b, (r36 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture.isDimLightConditions : false);
            cVar.e(z10);
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new j(this.f12880u, this.f12881v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, SelfieState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f12879t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f12879t = 1;
                if (z0.b(3000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            wm.h<r<? super Input, SelfieState, ? extends b>> d11 = this.f12880u.d();
            d10 = z.d(this.f12881v, null, new Function1() { // from class: wp.a5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = SelfieWorkflow.j.q((r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", f = "SelfieWorkflow.kt", l = {1187}, m = "invokeSuspend")
    public static final class k extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f12882t;

        /* renamed from: u, reason: collision with root package name */
        public int f12883u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Input f12884v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12885w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12886x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SelfieState.CountdownToCapture f12887y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Input input, wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, SelfieState.CountdownToCapture countdownToCapture, mt.b<? super k> bVar) {
            super(2, bVar);
            this.f12884v = input;
            this.f12885w = aVar;
            this.f12886x = selfieWorkflow;
            this.f12887y = countdownToCapture;
        }

        public static final Unit q(long j10, SelfieState.CountdownToCapture countdownToCapture, Input input, r.c cVar) {
            SelfieState.CountdownToCapture z10;
            Object c10 = cVar.c();
            SelfieState.CountdownToCapture countdownToCapture2 = c10 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) c10 : null;
            if (countdownToCapture2 == null) {
                return Unit.f22894a;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                cVar.e(new SelfieState.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), countdownToCapture2.w(), countdownToCapture2.g(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), p.k(cVar, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24640, null));
            } else {
                z10 = countdownToCapture2.z((r34 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (r34 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (r34 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (r34 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (r34 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (r34 & 32) != 0 ? countdownToCapture2.poseScore : 0.0f, (r34 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (r34 & 128) != 0 ? countdownToCapture2.posesNeeded : null, (r34 & 256) != 0 ? countdownToCapture2.selfies : null, (r34 & 512) != 0 ? countdownToCapture2.backState : null, (r34 & 1024) != 0 ? countdownToCapture2.poseConfigs : null, (r34 & 2048) != 0 ? countdownToCapture2.autoCaptureSupported : false, (r34 & 4096) != 0 ? countdownToCapture2.cameraFacingMode : null, (r34 & 8192) != 0 ? countdownToCapture2.isFlashEnabled : false, (r34 & 16384) != 0 ? countdownToCapture2.isDimLightConditions : false);
                cVar.e(z10);
            }
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new k(this.f12884v, this.f12885w, this.f12886x, this.f12887y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            final long j10;
            r<? super Input, SelfieState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f12883u;
            if (i10 == 0) {
                gt.o.b(obj);
                long a10 = n.a(this.f12884v);
                this.f12882t = a10;
                this.f12883u = 1;
                if (z0.b(a10, this) == e10) {
                    return e10;
                }
                j10 = a10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f12882t;
                gt.o.b(obj);
            }
            wm.h<r<? super Input, SelfieState, ? extends b>> d11 = this.f12885w.d();
            SelfieWorkflow selfieWorkflow = this.f12886x;
            final SelfieState.CountdownToCapture countdownToCapture = this.f12887y;
            final Input input = this.f12884v;
            d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = SelfieWorkflow.k.q(j10, countdownToCapture, input, (r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", f = "SelfieWorkflow.kt", l = {1282}, m = "invokeSuspend")
    public static final class l extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12888t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12889u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12890v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, mt.b<? super l> bVar) {
            super(2, bVar);
            this.f12889u = aVar;
            this.f12890v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(r.c cVar) {
            SelfieState.CountdownToManualCapture z10;
            Object c10 = cVar.c();
            SelfieState.CountdownToManualCapture countdownToManualCapture = c10 instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) c10 : null;
            if (countdownToManualCapture == null) {
                return Unit.f22894a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                z10 = countdownToManualCapture.z((r29 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (r29 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (r29 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (r29 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (r29 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (r29 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (r29 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (r29 & 128) != 0 ? countdownToManualCapture.backState : null, (r29 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (r29 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (r29 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : false, (r29 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false);
                cVar.e(z10);
            }
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new l(this.f12889u, this.f12890v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            r<? super Input, SelfieState, ? extends b> d10;
            Object e10 = nt.c.e();
            int i10 = this.f12888t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f12888t = 1;
                if (z0.b(1000L, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            wm.h<r<? super Input, SelfieState, ? extends b>> d11 = this.f12889u.d();
            d10 = z.d(this.f12890v, null, new Function1() { // from class: wp.c5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit q10;
                    q10 = SelfieWorkflow.l.q((r.c) obj2);
                    return q10;
                }
            }, 1, null);
            d11.a(d10);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", f = "SelfieWorkflow.kt", l = {2130}, m = "invokeSuspend")
    public static final class m extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f12891t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ y f12892u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ wm.k<Input, SelfieState, b, Object>.a f12893v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12894w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(y yVar, wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, mt.b<? super m> bVar) {
            super(2, bVar);
            this.f12892u = yVar;
            this.f12893v = aVar;
            this.f12894w = selfieWorkflow;
        }

        public static final Unit q(y yVar, r.c cVar) {
            WorkflowState workflowState = (SelfieState) cVar.c();
            if ((workflowState instanceof com.withpersona.sdk2.inquiry.selfie.b) && ((com.withpersona.sdk2.inquiry.selfie.b) workflowState).o()) {
                cVar.e(workflowState);
                yVar.f22979a = false;
            }
            return Unit.f22894a;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new m(this.f12892u, this.f12893v, this.f12894w, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r5.f12891t
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
                kotlin.jvm.internal.y r6 = r5.f12892u
                boolean r6 = r6.f22979a
                if (r6 == 0) goto L43
                r5.f12891t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = ju.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                wm.k<com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, java.lang.Object>$a r6 = r5.f12893v
                wm.h r6 = r6.d()
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r1 = r5.f12894w
                kotlin.jvm.internal.y r3 = r5.f12892u
                wp.d5 r4 = new wp.d5
                r4.<init>()
                r3 = 0
                wm.r r1 = wm.w.g(r1, r3, r4, r2, r3)
                r6.a(r1)
                goto L1a
            L43:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((m) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public SelfieWorkflow(@NotNull Context applicationContext, @NotNull b.a submitVerificationWorker, @NotNull b.a webRtcWorkerFactory, @NotNull e.b selfieAnalyzeWorker, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull fq.j localVideoCaptureRenderer, @NotNull e.a cameraXControllerFactory, @NotNull c.a camera2ControllerFactory, @NotNull jn.a cameraStatsManager, @NotNull sq.a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull a.b selfiePoseManagerFactory, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a inquiryThemeManager, @NotNull com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger, @NotNull oq.c sdkFilesManager, @NotNull eo.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(selfiePoseManagerFactory, "selfiePoseManagerFactory");
        Intrinsics.checkNotNullParameter(inquiryThemeManager, "inquiryThemeManager");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManagerFactory = selfiePoseManagerFactory;
        this.inquiryThemeManager = inquiryThemeManager;
        this.selfieEventLogger = selfieEventLogger;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.webRtcManager = sr.c.b();
    }

    public static final Unit A1(k.a aVar, final SelfieWorkflow selfieWorkflow, in.a aVar2, boolean z10) {
        r d10;
        Intrinsics.checkNotNullParameter(aVar2, "<unused var>");
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B1;
                B1 = SelfieWorkflow.B1(SelfieWorkflow.this, (r.c) obj);
                return B1;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit A2(Input input, SelfieState.ReviewCaptures reviewCaptures, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.k(action, false), input.A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit A3(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit B1(SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.AcquireNextPose acquireNextPose = c10 instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) c10 : null;
        if (acquireNextPose == null) {
            return Unit.f22894a;
        }
        action.e(selfieWorkflow.x1(action, acquireNextPose, null));
        return Unit.f22894a;
    }

    public static final Unit B2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit C1(k.a aVar, SelfieWorkflow selfieWorkflow, Throwable it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.q4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D1;
                D1 = SelfieWorkflow.D1((r.c) obj);
                return D1;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit C2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final r C3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final k.a aVar, final b.AbstractC0542b it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof b.AbstractC0542b.C0543b) {
            d11 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.g4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit D3;
                    D3 = SelfieWorkflow.D3(SelfieState.WaitForWebRtcSetup.this, selfieWorkflow, it, input, aVar, (r.c) obj);
                    return D3;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof b.AbstractC0542b.Error)) {
            throw new gt.l();
        }
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.h4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit K3;
                K3 = SelfieWorkflow.K3(k.a.this, selfieWorkflow, waitForWebRtcSetup, (r.c) obj);
                return K3;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit D1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.AcquireNextPose acquireNextPose = c10 instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) c10 : null;
        if (acquireNextPose == null) {
            return Unit.f22894a;
        }
        l2.c(acquireNextPose);
        action.e(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), kotlin.collections.p.k(), p.k(action, false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), acquireNextPose.g(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f22894a;
    }

    public static final Unit D3(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final SelfieWorkflow selfieWorkflow, b.AbstractC0542b abstractC0542b, final Input input, final k.a aVar, r.c action) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
        sr.a aVar2 = selfieWorkflow.webRtcManager;
        if (aVar2 != null) {
            aVar2.c(selfieWorkflow.webRtcWorkerFactory.getService());
        }
        sr.a aVar3 = selfieWorkflow.webRtcManager;
        if (aVar3 != null) {
            aVar3.i(selfieWorkflow.applicationContext);
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
        sr.a aVar4 = selfieWorkflow.webRtcManager;
        if (aVar4 != null) {
            b.AbstractC0542b.C0543b c0543b = (b.AbstractC0542b.C0543b) abstractC0542b;
            aVar4.f(c0543b.getResult().getUsername(), c0543b.getResult().getCredential(), c0543b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: wp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit E3;
                    E3 = SelfieWorkflow.E3(k.a.this, selfieWorkflow, input, waitForWebRtcSetup);
                    return E3;
                }
            }, new Function0() { // from class: wp.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit G3;
                    G3 = SelfieWorkflow.G3(k.a.this, selfieWorkflow, waitForWebRtcSetup);
                    return G3;
                }
            }, new Function0() { // from class: wp.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit I3;
                    I3 = SelfieWorkflow.I3(SelfieWorkflow.this, input);
                    return I3;
                }
            }, new Function1() { // from class: wp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit J3;
                    J3 = SelfieWorkflow.J3(SelfieWorkflow.this, (String) obj);
                    return J3;
                }
            });
        }
        return Unit.f22894a;
    }

    public static final Unit E1(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit E2(k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ShowInstructions showInstructions) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F2;
                F2 = SelfieWorkflow.F2(SelfieWorkflow.this, input, showInstructions, (r.c) obj);
                return F2;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit E3(k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit F3;
                F3 = SelfieWorkflow.F3(SelfieWorkflow.this, input, waitForWebRtcSetup, (r.c) obj);
                return F3;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit F1(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit F2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.ShowInstructions showInstructions, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.c();
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.l(action, false, 1, null), input.A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit F3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.l(input.getFromStep());
        selfieWorkflow.selfieEventLogger.b((SelfieState) action.c());
        action.e(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), p.k(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f22894a;
    }

    public static final Unit G1(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit G2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit G3(k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit H3;
                H3 = SelfieWorkflow.H3(SelfieWorkflow.this, waitForWebRtcSetup, (r.c) obj);
                return H3;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit H1(k.a aVar, SelfieWorkflow selfieWorkflow, final CameraProperties.b facingMode) {
        r d10;
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit I1;
                I1 = SelfieWorkflow.I1(CameraProperties.b.this, (r.c) obj);
                return I1;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit H2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit H3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.webRtcManager.a();
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22894a;
    }

    public static final Unit I1(CameraProperties.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), bVar, 3, null));
        return Unit.f22894a;
    }

    public static final Unit I2() {
        return Unit.f22894a;
    }

    public static final Unit I3(SelfieWorkflow selfieWorkflow, Input input) {
        selfieWorkflow.selfieEventLogger.j(input.getFromStep());
        return Unit.f22894a;
    }

    public static final Unit J1(boolean z10) {
        return Unit.f22894a;
    }

    public static final Unit J3(SelfieWorkflow selfieWorkflow, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        selfieWorkflow.selfieEventLogger.i(step);
        return Unit.f22894a;
    }

    public static final Unit K2(k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.ShowPoseHint showPoseHint, final Input input) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.y3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L2;
                L2 = SelfieWorkflow.L2(SelfieState.ShowPoseHint.this, input, selfieWorkflow, (r.c) obj);
                return L2;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit K3(k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        r d10;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit L3;
                L3 = SelfieWorkflow.L3(SelfieWorkflow.this, waitForWebRtcSetup, (r.c) obj);
                return L3;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final r L1(final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, final k.a aVar, final e.c output) {
        r d10;
        Intrinsics.checkNotNullParameter(output, "output");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.a4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit M1;
                M1 = SelfieWorkflow.M1(e.c.this, selfieWorkflow, capture, aVar, (r.c) obj);
                return M1;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit L2(SelfieState.ShowPoseHint showPoseHint, Input input, SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<PoseInfo> g10 = showPoseHint.g();
        List<Selfie> w5 = showPoseHint.w();
        long currentTimeMillis = System.currentTimeMillis();
        boolean autoCaptureSupported = showPoseHint.getAutoCaptureSupported();
        CameraProperties cameraProperties = showPoseHint.getCameraProperties();
        long startSelfieTimestamp = showPoseHint.getStartSelfieTimestamp();
        SelfieState k10 = p.k(action, false);
        PoseConfigs poseConfigs = input.getPoseConfigs();
        CameraProperties.b cameraFacingMode = showPoseHint.getCameraFacingMode();
        boolean isFlashEnabled = showPoseHint.getIsFlashEnabled();
        Long l10 = null;
        bq.a aVar = null;
        if (input.getUsePerPoseReveal()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            bq.a aVar2 = selfieWorkflow.selfiePoseManager;
            if (aVar2 == null) {
                Intrinsics.u("selfiePoseManager");
            } else {
                aVar = aVar2;
            }
            l10 = Long.valueOf(currentTimeMillis2 + aVar.getPerPoseTimeoutMs());
        }
        action.e(new SelfieState.Capture(null, 0.0f, null, w5, g10, currentTimeMillis, autoCaptureSupported, startSelfieTimestamp, cameraProperties, k10, poseConfigs, cameraFacingMode, isFlashEnabled, null, l10, false, 8193, null));
        return Unit.f22894a;
    }

    public static final Unit L3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        sr.a aVar = selfieWorkflow.webRtcManager;
        if (aVar != null) {
            aVar.a();
        }
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22894a;
    }

    public static final Unit M1(e.c cVar, SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, k.a aVar, r.c action) {
        SelfieState.Capture z10;
        SelfieState.Capture z11;
        SelfieState.Capture z12;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.Capture capture2 = c10 instanceof SelfieState.Capture ? (SelfieState.Capture) c10 : null;
        if (capture2 == null) {
            return Unit.f22894a;
        }
        if (cVar instanceof e.c.a) {
            e.c.a aVar2 = (e.c.a) cVar;
            if (aVar2.getSelfie() != null) {
                Selfie selfie = aVar2.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                selfieWorkflow.selfieEventLogger.g(capture2, selfie);
                action.e(selfieWorkflow.x1(action, capture, selfie));
            } else {
                z12 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : null, (r36 & 2) != 0 ? capture2.poseScore : 0.0f, (r36 & 4) != 0 ? capture2.brightnessInfo : null, (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : SelfieState.a.f12611c, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : false);
                action.e(z12);
            }
        } else if (cVar instanceof e.c.C0245c) {
            e.c.C0245c c0245c = (e.c.C0245c) cVar;
            if (c0245c.getError() == in.b.f20977h) {
                z11 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : null, (r36 & 2) != 0 ? capture2.poseScore : c0245c.getPoseScore(), (r36 & 4) != 0 ? capture2.brightnessInfo : c0245c.getBrightnessInfo(), (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : null, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : c0245c.getIsDimLightConditions());
                action.e(z11);
            } else {
                z10 = capture2.z((r36 & 1) != 0 ? capture2.selfieError : c0245c.getError(), (r36 & 2) != 0 ? capture2.poseScore : c0245c.getPoseScore(), (r36 & 4) != 0 ? capture2.brightnessInfo : c0245c.getBrightnessInfo(), (r36 & 8) != 0 ? capture2.selfies : null, (r36 & 16) != 0 ? capture2.posesNeeded : null, (r36 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (r36 & 64) != 0 ? capture2.autoCaptureSupported : false, (r36 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (r36 & 256) != 0 ? capture2.cameraProperties : null, (r36 & 512) != 0 ? capture2.backState : null, (r36 & 1024) != 0 ? capture2.poseConfigs : null, (r36 & 2048) != 0 ? capture2.cameraFacingMode : null, (r36 & 4096) != 0 ? capture2.isFlashEnabled : false, (r36 & 8192) != 0 ? capture2.flashState : null, (r36 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (r36 & 32768) != 0 ? capture2.isDimLightConditions : c0245c.getIsDimLightConditions());
                action.e(z10);
            }
        } else {
            if (!(cVar instanceof e.c.b)) {
                throw new gt.l();
            }
            selfieWorkflow.W3(aVar, ((e.c.b) cVar).getError());
        }
        return Unit.f22894a;
    }

    public static final Unit M2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit M3(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit N1(PoseInfo poseInfo, in.a aVar, k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, String absolutePath) {
        r d10;
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, aVar, System.currentTimeMillis(), poseInfo.getToken());
        wm.h d11 = aVar2.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit O1;
                O1 = SelfieWorkflow.O1(SelfieWorkflow.this, capture, selfieImage, (r.c) obj);
                return O1;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit N2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit N3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit O1(SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, capture, selfieImage));
        return Unit.f22894a;
    }

    public static final Unit O2(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit O3(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit P1(SelfieWorkflow selfieWorkflow, k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22894a;
    }

    public static final Unit Q1(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final r Q2(final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input, final k.a aVar, final e.c output) {
        r d10;
        Intrinsics.checkNotNullParameter(output, "output");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit R2;
                R2 = SelfieWorkflow.R2(e.c.this, startCapture, input, selfieWorkflow, aVar, (r.c) obj);
                return R2;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit Q3(k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.WebRtcFinished webRtcFinished) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.m4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit R3;
                R3 = SelfieWorkflow.R3(SelfieState.WebRtcFinished.this, (r.c) obj);
                return R3;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit R1(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit R2(e.c cVar, SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.StartCapture startCapture2 = c10 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) c10 : null;
        if (startCapture2 == null) {
            return Unit.f22894a;
        }
        if (cVar instanceof e.c.a) {
            e.c.a aVar2 = (e.c.a) cVar;
            action.e(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar2.getPoseScore(), aVar2.getBrightnessInfo(), startCapture.g(), startCapture.w(), p.k(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar2.getIsDimLightConditions()));
        } else if (cVar instanceof e.c.b) {
            selfieWorkflow.W3(aVar, ((e.c.b) cVar).getError());
        } else {
            if (!(cVar instanceof e.c.C0245c)) {
                throw new gt.l();
            }
            e.c.C0245c c0245c = (e.c.C0245c) cVar;
            action.e(c0245c.getError() == in.b.f20977h ? startCapture2.z((r34 & 1) != 0 ? startCapture2.centered : false, (r34 & 2) != 0 ? startCapture2.selfieError : null, (r34 & 4) != 0 ? startCapture2.poseScore : c0245c.getPoseScore(), (r34 & 8) != 0 ? startCapture2.brightnessInfo : c0245c.getBrightnessInfo(), (r34 & 16) != 0 ? startCapture2.posesNeeded : null, (r34 & 32) != 0 ? startCapture2.selfies : null, (r34 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (r34 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? startCapture2.cameraProperties : null, (r34 & 1024) != 0 ? startCapture2.backState : null, (r34 & 2048) != 0 ? startCapture2.poseConfigs : null, (r34 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (r34 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (r34 & 16384) != 0 ? startCapture2.isDimLightConditions : c0245c.getIsDimLightConditions()) : startCapture2.z((r34 & 1) != 0 ? startCapture2.centered : false, (r34 & 2) != 0 ? startCapture2.selfieError : c0245c.getError(), (r34 & 4) != 0 ? startCapture2.poseScore : c0245c.getPoseScore(), (r34 & 8) != 0 ? startCapture2.brightnessInfo : c0245c.getBrightnessInfo(), (r34 & 16) != 0 ? startCapture2.posesNeeded : null, (r34 & 32) != 0 ? startCapture2.selfies : null, (r34 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (r34 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (r34 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (r34 & 512) != 0 ? startCapture2.cameraProperties : null, (r34 & 1024) != 0 ? startCapture2.backState : null, (r34 & 2048) != 0 ? startCapture2.poseConfigs : null, (r34 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (r34 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (r34 & 16384) != 0 ? startCapture2.isDimLightConditions : c0245c.getIsDimLightConditions()));
        }
        return Unit.f22894a;
    }

    public static final Unit R3(SelfieState.WebRtcFinished webRtcFinished, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(p.D(action, webRtcFinished.w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), p.k(action, false)));
        return Unit.f22894a;
    }

    public static final Unit S1(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit S2(k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit T2;
                T2 = SelfieWorkflow.T2(SelfieState.StartCapture.this, input, selfieWorkflow, (r.c) obj);
                return T2;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit S3(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit T2(SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.StartCapture startCapture2 = c10 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) c10 : null;
        if (startCapture2 == null) {
            return Unit.f22894a;
        }
        action.e(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), p.k(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        selfieWorkflow.selfieEventLogger.d(startCapture2);
        return Unit.f22894a;
    }

    public static final Unit T3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit U1(k.a aVar, SelfieWorkflow selfieWorkflow) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.w3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V1;
                V1 = SelfieWorkflow.V1((r.c) obj);
                return V1;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit U2(PoseInfo poseInfo, in.a aVar, k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, String absolutePath) {
        r d10;
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, aVar, System.currentTimeMillis(), poseInfo.getToken());
        wm.h d11 = aVar2.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit V2;
                V2 = SelfieWorkflow.V2(SelfieWorkflow.this, startCapture, selfieImage, (r.c) obj);
                return V2;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit U3(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit V1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.CaptureTransition captureTransition = c10 instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) c10 : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            action.e(nextState);
        }
        return Unit.f22894a;
    }

    public static final Unit V2(SelfieWorkflow selfieWorkflow, SelfieState.StartCapture startCapture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, startCapture, selfieImage));
        return Unit.f22894a;
    }

    public static final Unit W1(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit W2(SelfieWorkflow selfieWorkflow, k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22894a;
    }

    public static final Unit X1(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit X2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit Y1(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit Y2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit Y3(b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(bVar);
        return Unit.f22894a;
    }

    public static final Unit Z2(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final r a2(final SelfieWorkflow selfieWorkflow, final k.a aVar, final SelfieState.CountdownToCapture countdownToCapture, final Input input, final e.c output) {
        r d10;
        Intrinsics.checkNotNullParameter(output, "output");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit b22;
                b22 = SelfieWorkflow.b2(e.c.this, selfieWorkflow, aVar, countdownToCapture, input, (r.c) obj);
                return b22;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit b2(e.c cVar, SelfieWorkflow selfieWorkflow, k.a aVar, SelfieState.CountdownToCapture countdownToCapture, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.CountdownToCapture countdownToCapture2 = c10 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) c10 : null;
        if (countdownToCapture2 == null) {
            return Unit.f22894a;
        }
        if (!(cVar instanceof e.c.a)) {
            if (cVar instanceof e.c.b) {
                selfieWorkflow.W3(aVar, ((e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof e.c.C0245c)) {
                    throw new gt.l();
                }
                action.e(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.g(), countdownToCapture.w(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), p.k(action, false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((e.c.C0245c) cVar).getIsDimLightConditions(), 131, null));
            }
        }
        return Unit.f22894a;
    }

    public static final r b3(final SelfieWorkflow selfieWorkflow, final k.a aVar, final SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final e.c output) {
        r d10;
        Intrinsics.checkNotNullParameter(output, "output");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c32;
                c32 = SelfieWorkflow.c3(e.c.this, selfieWorkflow, aVar, startCaptureFaceDetected, input, (r.c) obj);
                return c32;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit c2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit c3(e.c cVar, SelfieWorkflow selfieWorkflow, k.a aVar, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(cVar instanceof e.c.a)) {
            if (cVar instanceof e.c.b) {
                selfieWorkflow.W3(aVar, ((e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof e.c.C0245c)) {
                    throw new gt.l();
                }
                e.c.C0245c c0245c = (e.c.C0245c) cVar;
                in.b error = c0245c.getError();
                List<PoseInfo> g10 = startCaptureFaceDetected.g();
                List<Selfie> w5 = startCaptureFaceDetected.w();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.e(new SelfieState.StartCapture(false, error, c0245c.getPoseScore(), c0245c.getBrightnessInfo(), g10, w5, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0245c.getIsDimLightConditions(), 129, null));
            }
        }
        return Unit.f22894a;
    }

    public static final Unit d2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final r d3(final SelfieWorkflow selfieWorkflow, final Input input, Unit it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e32;
                e32 = SelfieWorkflow.e3(SelfieWorkflow.this, input, (r.c) obj);
                return e32;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit e2(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit e3(SelfieWorkflow selfieWorkflow, Input input, r.c action) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = c10 instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) c10 : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f22894a;
        }
        selfieWorkflow.selfieEventLogger.a(startCaptureFaceDetected);
        if (input.getDesignVersion() == wp.a.f34487c && startCaptureFaceDetected.j() == in.a.f20965a) {
            List<PoseInfo> g10 = startCaptureFaceDetected.g();
            List<Selfie> w5 = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), w5, g10, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.g(), startCaptureFaceDetected.w(), p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        action.e(countdownToCapture);
        return Unit.f22894a;
    }

    public static final Unit f3(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit g2(PoseInfo poseInfo, in.a aVar, k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        r d10;
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.f12465c, aVar, System.currentTimeMillis(), poseInfo.getToken());
        wm.h d11 = aVar2.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h22;
                h22 = SelfieWorkflow.h2(SelfieWorkflow.this, countdownToManualCapture, selfieImage, (r.c) obj);
                return h22;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit g3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit h2(SelfieWorkflow selfieWorkflow, SelfieState.CountdownToManualCapture countdownToManualCapture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, countdownToManualCapture, selfieImage));
        return Unit.f22894a;
    }

    public static final Unit h3(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit i2(SelfieWorkflow selfieWorkflow, k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22894a;
    }

    public static final Unit j2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final r j3(final SelfieWorkflow selfieWorkflow, final k.a aVar, final boolean z10, final b.d it) {
        r d10;
        r d11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof b.d.C0067b) {
            d11 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit k32;
                    k32 = SelfieWorkflow.k3(SelfieWorkflow.this, aVar, (r.c) obj);
                    return k32;
                }
            }, 1, null);
            return d11;
        }
        if (!(it instanceof b.d.Error)) {
            throw new gt.l();
        }
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit l32;
                l32 = SelfieWorkflow.l3(z10, it, selfieWorkflow, aVar, (r.c) obj);
                return l32;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit k2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit k3(SelfieWorkflow selfieWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.X3(aVar, b.d.f12689a);
        return Unit.f22894a;
    }

    public static final Unit l2(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit l3(boolean z10, b.d dVar, SelfieWorkflow selfieWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.Submit submit = c10 instanceof SelfieState.Submit ? (SelfieState.Submit) c10 : null;
        if (submit == null) {
            return Unit.f22894a;
        }
        if (z10) {
            b.d.Error error = (b.d.Error) dVar;
            if (p.B(error.getCause())) {
                action.e(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
                return Unit.f22894a;
            }
        }
        selfieWorkflow.X3(aVar, new b.Error(((b.d.Error) dVar).getCause()));
        return Unit.f22894a;
    }

    public static final Unit m3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit n2(k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.FinalizeWebRtc finalizeWebRtc, final String it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o22;
                o22 = SelfieWorkflow.o2(SelfieWorkflow.this, input, finalizeWebRtc, it, (r.c) obj);
                return o22;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit n3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit o2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.m(input.getFromStep());
        action.e(new SelfieState.WebRtcFinished(finalizeWebRtc.w(), str, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), p.k(action, false), finalizeWebRtc.getCameraFacingMode()));
        selfieWorkflow.webRtcManager.e();
        return Unit.f22894a;
    }

    public static final Unit o3(k.a aVar, SelfieWorkflow selfieWorkflow) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.n4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p32;
                p32 = SelfieWorkflow.p3((r.c) obj);
                return p32;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit p2() {
        return Unit.f22894a;
    }

    public static final Unit p3(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.Submit submit = c10 instanceof SelfieState.Submit ? (SelfieState.Submit) c10 : null;
        if (submit == null) {
            return Unit.f22894a;
        }
        action.e(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f22894a;
    }

    public static final Unit q2(k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22894a;
    }

    public static final Unit r2(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit r3(SelfieWorkflow selfieWorkflow, k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0236b.f12687a);
        return Unit.f22894a;
    }

    public static final Unit s2(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final Unit s3(SelfieWorkflow selfieWorkflow, k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22894a;
    }

    public static final r t3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final k.a aVar, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.x3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit u32;
                u32 = SelfieWorkflow.u3(PermissionRequestWorkflow.Output.this, waitForCameraFeed, input, selfieWorkflow, aVar, (r.c) obj);
                return u32;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit u2(k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.RestartCamera restartCamera) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.i4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v22;
                v22 = SelfieWorkflow.v2(SelfieWorkflow.Input.this, restartCamera, (r.c) obj);
                return v22;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit u3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == j1.f28919a) {
            action.e(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.X3(aVar, b.a.f12686a);
        } else {
            selfieWorkflow.X3(aVar, new b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22894a;
    }

    public static final Unit v2(Input input, SelfieState.RestartCamera restartCamera, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.k(action, false), input.A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f22894a;
    }

    public static final r v3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final k.a aVar, final PermissionRequestWorkflow.Output it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w32;
                w32 = SelfieWorkflow.w3(PermissionRequestWorkflow.Output.this, waitForCameraFeed, input, selfieWorkflow, aVar, (r.c) obj);
                return w32;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit w3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == j1.f28919a) {
            action.e(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.X3(aVar, b.a.f12686a);
        } else {
            selfieWorkflow.X3(aVar, new b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22894a;
    }

    public static final Unit x2(k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.ReviewCaptures reviewCaptures) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y22;
                y22 = SelfieWorkflow.y2(SelfieState.ReviewCaptures.this, (r.c) obj);
                return y22;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit x3(final SelfieWorkflow selfieWorkflow, k.a aVar, final Input input, final SelfieState.WaitForCameraFeed waitForCameraFeed, final long j10, final CameraProperties cameraProperties) {
        r d10;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        selfieWorkflow.selfieEventLogger.n();
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.b4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y32;
                y32 = SelfieWorkflow.y3(SelfieWorkflow.this, input, waitForCameraFeed, cameraProperties, j10, (r.c) obj);
                return y32;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit y2(SelfieState.ReviewCaptures reviewCaptures, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        SelfieState.ReviewCaptures reviewCaptures2 = c10 instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) c10 : null;
        if (reviewCaptures2 == null) {
            return Unit.f22894a;
        }
        SelfieState.ReviewCaptures reviewCaptures3 = reviewCaptures2;
        action.e(new SelfieState.Submit(reviewCaptures3.w(), reviewCaptures3.getWebRtcObjectId(), reviewCaptures3.getCameraProperties(), reviewCaptures3.getStartSelfieTimestamp(), p.k(action, true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f22894a;
    }

    public static final Unit y3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, CameraProperties cameraProperties, long j10, r.c action) {
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (selfieWorkflow.b4(input) == kn.a.f22871a) {
            selfieWorkflow.selfieEventLogger.k();
            action.e(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, p.k(action, false), waitForCameraFeed.g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            selfieWorkflow.selfieEventLogger.b((SelfieState) action.c());
            in.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.g())).getPose();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, kotlin.collections.p.k(), p.k(action, false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.g(), input.getPoseConfigs(), true);
            } else if (pose == in.a.f20965a) {
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.g(), null, System.currentTimeMillis(), false, j10, cameraProperties, p.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new SelfieState.ShowPoseHint(kotlin.collections.p.k(), waitForCameraFeed.g(), true, cameraProperties, j10, p.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            action.e(showPoseHint);
        }
        return Unit.f22894a;
    }

    public static final Unit z2(k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ReviewCaptures reviewCaptures) {
        r d10;
        wm.h d11 = aVar.d();
        d10 = z.d(selfieWorkflow, null, new Function1() { // from class: wp.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit A2;
                A2 = SelfieWorkflow.A2(SelfieWorkflow.Input.this, reviewCaptures, (r.c) obj);
                return A2;
            }
        }, 1, null);
        d11.a(d10);
        return Unit.f22894a;
    }

    public static final Unit z3(k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        p.n(aVar, false, 1, null).invoke(it);
        return Unit.f22894a;
    }

    public final c B3(final Input renderProps, final SelfieState.WaitForWebRtcSetup renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c m10;
        w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), d0.k(rr.b.class), "", new Function1() { // from class: wp.z3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r C3;
                C3 = SelfieWorkflow.C3(SelfieWorkflow.this, renderState, renderProps, context, (b.AbstractC0542b) obj);
                return C3;
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0240c.b.i iVar = new c.C0240c.b.i(c.C0240c.EnumC0243c.f12806a, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 n10 = p.n(context, false, 1, null);
        kn.a b42 = b4(renderProps);
        sr.a aVar = this.webRtcManager;
        m10 = o.m(renderProps, context, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, iVar, p.C(renderProps), requireStrictSelfieCapture, b10, new Function0() { // from class: wp.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit M3;
                M3 = SelfieWorkflow.M3(k.a.this, this);
                return M3;
            }
        }, new Function0() { // from class: wp.v4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit N3;
                N3 = SelfieWorkflow.N3(SelfieWorkflow.this, context);
                return N3;
            }
        }, n10, new Function0() { // from class: wp.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit O3;
                O3 = SelfieWorkflow.O3(SelfieWorkflow.this, context, renderProps);
                return O3;
            }
        }, b42, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final c.b D2(final Input renderProps, final SelfieState.ShowInstructions renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState b10 = this.navigationStateManager.b();
        SelfieType selfieType = renderProps.getSelfieType();
        RemoteImage remoteImage = null;
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
        return new c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), remoteImage, b10, renderProps.getSelfieType(), renderProps.A(), renderProps.getStrings().getPromptPageNavBarTitle(), null, new Function0() { // from class: wp.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit E2;
                E2 = SelfieWorkflow.E2(k.a.this, this, renderProps, renderState);
                return E2;
            }
        }, new Function0() { // from class: wp.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit G2;
                G2 = SelfieWorkflow.G2(k.a.this, this);
                return G2;
            }
        }, new Function0() { // from class: wp.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H2;
                H2 = SelfieWorkflow.H2(SelfieWorkflow.this, context);
                return H2;
            }
        }, new Function0() { // from class: wp.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit I2;
                I2 = SelfieWorkflow.I2();
                return I2;
            }
        });
    }

    public final c J2(final Input renderProps, final SelfieState.ShowPoseHint renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        x xVar;
        String selfieHintPoseNotCentered;
        c.C0240c.EnumC0243c enumC0243c;
        c m10;
        int i10 = d.f12861a[renderState.j().ordinal()];
        if (i10 == 1) {
            xVar = x.b;
        } else if (i10 == 2) {
            xVar = x.f34767c;
        } else if (i10 == 3) {
            xVar = x.f34768d;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new gt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            xVar = x.f34769e;
        }
        int[] iArr = d.b;
        int i11 = iArr[xVar.ordinal()];
        if (i11 == 1) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintPoseNotCentered();
        } else if (i11 == 2) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i11 == 3) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookRight();
        } else if (i11 == 4) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookUp();
        } else {
            if (i11 != 5) {
                throw new gt.l();
            }
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookDown();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[xVar.ordinal()];
        if (i12 == 1) {
            enumC0243c = c.C0240c.EnumC0243c.b;
        } else if (i12 == 2) {
            enumC0243c = c.C0240c.EnumC0243c.f12808d;
        } else if (i12 == 3) {
            enumC0243c = c.C0240c.EnumC0243c.f12811g;
        } else if (i12 == 4) {
            enumC0243c = c.C0240c.EnumC0243c.f12814j;
        } else {
            if (i12 != 5) {
                throw new gt.l();
            }
            enumC0243c = c.C0240c.EnumC0243c.f12817m;
        }
        c.C0240c.b.f fVar = new c.C0240c.b.f(new Function0() { // from class: wp.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K2;
                K2 = SelfieWorkflow.K2(k.a.this, this, renderState, renderProps);
                return K2;
            }
        }, enumC0243c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        String str = selfieHintPoseNotCentered;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 n10 = p.n(context, false, 1, null);
        kn.a b42 = b4(renderProps);
        sr.a aVar = this.webRtcManager;
        c.C0240c.AssetOverrides C = p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        e.a aVar2 = this.cameraXControllerFactory;
        c.a aVar3 = this.camera2ControllerFactory;
        m10 = o.m(renderProps, context, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, C, requireStrictSelfieCapture, b10, new Function0() { // from class: wp.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit M2;
                M2 = SelfieWorkflow.M2(k.a.this, this);
                return M2;
            }
        }, new Function0() { // from class: wp.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit N2;
                N2 = SelfieWorkflow.N2(SelfieWorkflow.this, context);
                return N2;
            }
        }, n10, new Function0() { // from class: wp.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit O2;
                O2 = SelfieWorkflow.O2(SelfieWorkflow.this, context, renderProps);
                return O2;
            }
        }, b42, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c K1(final com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Input r34, final com.withpersona.sdk2.inquiry.selfie.SelfieState.Capture r35, wm.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.b, ? extends java.lang.Object>.a r36) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.K1(com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState$Capture, wm.k$a):com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c");
    }

    public final c P2(final Input renderProps, final SelfieState.StartCapture renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0240c.EnumC0243c enumC0243c;
        final SelfieWorkflow selfieWorkflow;
        Object obj;
        c.C0240c.b aVar;
        c m10;
        final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar2 = context;
        if (renderState.k().getAutoCaptureEnabled()) {
            w.l(aVar2, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: wp.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    wm.r Q2;
                    Q2 = SelfieWorkflow.Q2(SelfieWorkflow.this, renderState, renderProps, aVar2, (e.c) obj2);
                    return Q2;
                }
            });
        }
        final PoseInfo p8 = renderState.p();
        final in.a pose = p8.getPose();
        boolean o8 = renderState.o();
        if (!o8) {
            V3(aVar2);
        }
        int i10 = d.f12861a[pose.ordinal()];
        if (i10 == 1) {
            enumC0243c = c.C0240c.EnumC0243c.f12809e;
        } else if (i10 == 2) {
            enumC0243c = c.C0240c.EnumC0243c.f12812h;
        } else if (i10 == 3) {
            enumC0243c = c.C0240c.EnumC0243c.f12815k;
        } else if (i10 == 4) {
            enumC0243c = c.C0240c.EnumC0243c.f12818n;
        } else {
            if (i10 != 5) {
                throw new gt.l();
            }
            enumC0243c = c.C0240c.EnumC0243c.b;
        }
        c.C0240c.EnumC0243c enumC0243c2 = enumC0243c;
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintTakePhoto = b10 == null ? renderProps.getStrings().getSelfieHintTakePhoto() : b10;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!o8) {
            selfieWorkflow = this;
            obj = null;
            aVar = new c.C0240c.b.a(enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        } else if (w1(renderProps)) {
            aVar = new c.C0240c.b.e(new Function0() { // from class: wp.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit S2;
                    S2 = SelfieWorkflow.S2(k.a.this, this, renderState, renderProps);
                    return S2;
                }
            }, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
            selfieWorkflow = this;
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: wp.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit U2;
                    U2 = SelfieWorkflow.U2(PoseInfo.this, pose, context, this, renderState, (String) obj2);
                    return U2;
                }
            };
            aVar2 = context;
            obj = null;
            selfieWorkflow = this;
            aVar = new c.C0240c.b.d(function1, new Function1() { // from class: wp.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit W2;
                    W2 = SelfieWorkflow.W2(SelfieWorkflow.this, aVar2, (Throwable) obj2);
                    return W2;
                }
            }, false, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = selfieWorkflow.navigationStateManager.b();
        Function1 n10 = p.n(aVar2, false, 1, obj);
        kn.a b42 = b4(renderProps);
        sr.a aVar3 = selfieWorkflow.webRtcManager;
        String str = b10;
        m10 = o.m(renderProps, aVar2, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintTakePhoto, str, renderState.getAutoCaptureSupported(), aVar, p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: wp.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit X2;
                X2 = SelfieWorkflow.X2(k.a.this, selfieWorkflow);
                return X2;
            }
        }, new Function0() { // from class: wp.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Y2;
                Y2 = SelfieWorkflow.Y2(SelfieWorkflow.this, aVar2);
                return Y2;
            }
        }, n10, new Function0() { // from class: wp.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Z2;
                Z2 = SelfieWorkflow.Z2(SelfieWorkflow.this, aVar2, renderProps);
                return Z2;
            }
        }, b42, aVar3, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final c P3(final Input renderProps, final SelfieState.WebRtcFinished renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c m10;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0240c.b.h hVar = new c.C0240c.b.h(new Function0() { // from class: wp.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Q3;
                Q3 = SelfieWorkflow.Q3(k.a.this, this, renderState);
                return Q3;
            }
        }, false, c.C0240c.EnumC0243c.f12822r, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 n10 = p.n(context, false, 1, null);
        sr.a aVar = this.webRtcManager;
        m10 = o.m(renderProps, context, null, capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, hVar, p.C(renderProps), requireStrictSelfieCapture, b10, new Function0() { // from class: wp.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit S3;
                S3 = SelfieWorkflow.S3(k.a.this, this);
                return S3;
            }
        }, new Function0() { // from class: wp.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit T3;
                T3 = SelfieWorkflow.T3(SelfieWorkflow.this, context);
                return T3;
            }
        }, n10, new Function0() { // from class: wp.x2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit U3;
                U3 = SelfieWorkflow.U3(SelfieWorkflow.this, context, renderProps);
                return U3;
            }
        }, b4(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final c T1(final Input renderProps, SelfieState.CaptureTransition renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0240c.EnumC0243c enumC0243c;
        c m10;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC0243c = c.C0240c.EnumC0243c.f12821q;
        } else {
            int i10 = d.f12861a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0243c = c.C0240c.EnumC0243c.f12810f;
            } else if (i10 == 2) {
                enumC0243c = c.C0240c.EnumC0243c.f12813i;
            } else if (i10 == 3) {
                enumC0243c = c.C0240c.EnumC0243c.f12816l;
            } else if (i10 == 4) {
                enumC0243c = c.C0240c.EnumC0243c.f12819o;
            } else {
                if (i10 != 5) {
                    throw new gt.l();
                }
                enumC0243c = c.C0240c.EnumC0243c.f12807c;
            }
        }
        m10 = o.m(renderProps, context, null, capturePageTitle, (r61 & 16) != 0 ? null : null, null, false, new c.C0240c.b.h(new Function0() { // from class: wp.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit U1;
                U1 = SelfieWorkflow.U1(k.a.this, this);
                return U1;
            }
        }, true, enumC0243c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: wp.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit W1;
                W1 = SelfieWorkflow.W1(k.a.this, this);
                return W1;
            }
        }, new Function0() { // from class: wp.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit X1;
                X1 = SelfieWorkflow.X1(SelfieWorkflow.this, context);
                return X1;
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: wp.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Y1;
                Y1 = SelfieWorkflow.Y1(SelfieWorkflow.this, context, renderProps);
                return Y1;
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final void V3(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        y yVar = new y();
        yVar.f22979a = true;
        context.b("check_if_manual_capture_enabled", new m(yVar, context, this, null));
    }

    public final void W3(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, Throwable th2) {
        String message;
        String message2 = th2.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            X3(aVar, new b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof h1)) {
            if (th2 instanceof InternalErrorException) {
                X3(aVar, new b.Error(((InternalErrorException) th2).getErrorInfo()));
                return;
            }
            X3(aVar, new b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            X3(aVar, new b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        X3(aVar, new b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
    }

    public final void X3(wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context, final b output) {
        sr.a aVar;
        r<? super Object, SelfieState, ? extends Object> d10;
        if (((output instanceof b.d) || (output instanceof b.a) || (output instanceof b.Error) || (output instanceof b.C0236b)) && (aVar = this.webRtcManager) != null) {
            aVar.e();
        }
        wm.h<r<? super Object, SelfieState, ? extends Object>> d11 = context.d();
        d10 = z.d(this, null, new Function1() { // from class: wp.d4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y3;
                Y3 = SelfieWorkflow.Y3(SelfieWorkflow.b.this, (r.c) obj);
                return Y3;
            }
        }, 1, null);
        d11.a(d10);
    }

    public final c Z1(final Input renderProps, SelfieState.CountdownToCapture renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        final SelfieState.CountdownToCapture countdownToCapture;
        c m10;
        if (renderState.k().getAutoCaptureEnabled()) {
            countdownToCapture = renderState;
            w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: wp.q3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r a22;
                    a22 = SelfieWorkflow.a2(SelfieWorkflow.this, context, countdownToCapture, renderProps, (e.c) obj);
                    return a22;
                }
            });
        } else {
            countdownToCapture = renderState;
        }
        context.b("countdown_" + countdownToCapture.getCountDown(), new k(renderProps, context, this, renderState, null));
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = b10 == null ? renderProps.getStrings().getSelfieHintCenterFace() : b10;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0240c.b.C0241b c0241b = new c.C0240c.b.C0241b(renderState.getCountDown(), c.C0240c.EnumC0243c.b, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = this.navigationStateManager.b();
        Function1 n10 = p.n(context, false, 1, null);
        kn.a b42 = b4(renderProps);
        sr.a aVar = this.webRtcManager;
        String str = b10;
        m10 = o.m(renderProps, context, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintCenterFace, str, renderState.getAutoCaptureSupported(), c0241b, p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: wp.r3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c22;
                c22 = SelfieWorkflow.c2(k.a.this, this);
                return c22;
            }
        }, new Function0() { // from class: wp.s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit d22;
                d22 = SelfieWorkflow.d2(SelfieWorkflow.this, context);
                return d22;
            }
        }, n10, new Function0() { // from class: wp.t3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit e22;
                e22 = SelfieWorkflow.e2(SelfieWorkflow.this, context, renderProps);
                return e22;
            }
        }, b42, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final void Z3(r<? super Input, SelfieState, ? extends b>.c updater) {
        updater.d(new b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final c a3(final Input renderProps, final SelfieState.StartCaptureFaceDetected renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c m10;
        if (renderState.k().getAutoCaptureEnabled()) {
            w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: wp.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r b32;
                    b32 = SelfieWorkflow.b3(SelfieWorkflow.this, context, renderState, renderProps, (e.c) obj);
                    return b32;
                }
            });
        }
        w.l(context, o.Companion.b(wm.o.INSTANCE, 1000L, null, 2, null), d0.l(wm.o.class, KTypeProjection.INSTANCE.a(d0.k(Unit.class))), "", new Function1() { // from class: wp.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r d32;
                d32 = SelfieWorkflow.d3(SelfieWorkflow.this, renderProps, (Unit) obj);
                return d32;
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        c.C0240c.b.a aVar = new c.C0240c.b.a(c.C0240c.EnumC0243c.b, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b10 = this.navigationStateManager.b();
        Function1 n10 = p.n(context, false, 1, null);
        kn.a b42 = b4(renderProps);
        sr.a aVar2 = this.webRtcManager;
        c.C0240c.AssetOverrides C = p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        e.a aVar3 = this.cameraXControllerFactory;
        c.a aVar4 = this.camera2ControllerFactory;
        m10 = o.m(renderProps, context, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, C, requireStrictSelfieCapture, b10, new Function0() { // from class: wp.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit f32;
                f32 = SelfieWorkflow.f3(k.a.this, this);
                return f32;
            }
        }, new Function0() { // from class: wp.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g32;
                g32 = SelfieWorkflow.g3(SelfieWorkflow.this, context);
                return g32;
            }
        }, n10, new Function0() { // from class: wp.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit h32;
                h32 = SelfieWorkflow.h3(SelfieWorkflow.this, context, renderProps);
                return h32;
            }
        }, b42, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    @Override // wm.k
    @NotNull
    /* renamed from: a4, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull SelfieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ym.q.a(state);
    }

    public final kn.a b4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        sr.a aVar = this.webRtcManager;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        sr.a aVar2 = this.webRtcManager;
        Object k10 = videoCaptureConfig.k(valueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        return gt.n.e(k10) == null ? (kn.a) k10 : kn.a.f22872c;
    }

    public final boolean c4(Input renderProps) {
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

    public final c f2(final Input renderProps, final SelfieState.CountdownToManualCapture renderState, wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0240c.EnumC0243c enumC0243c;
        final SelfieWorkflow selfieWorkflow;
        c.C0240c.b c0241b;
        c m10;
        final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar = context;
        final PoseInfo p8 = renderState.p();
        final in.a pose = p8.getPose();
        int i10 = d.f12861a[pose.ordinal()];
        if (i10 == 1) {
            enumC0243c = c.C0240c.EnumC0243c.f12809e;
        } else if (i10 == 2) {
            enumC0243c = c.C0240c.EnumC0243c.f12812h;
        } else if (i10 == 3) {
            enumC0243c = c.C0240c.EnumC0243c.f12815k;
        } else if (i10 == 4) {
            enumC0243c = c.C0240c.EnumC0243c.f12818n;
        } else {
            if (i10 != 5) {
                throw new gt.l();
            }
            enumC0243c = c.C0240c.EnumC0243c.b;
        }
        c.C0240c.EnumC0243c enumC0243c2 = enumC0243c;
        aVar.b("countdown_to_manual_capture_" + renderState.getCountDown(), new l(aVar, this, null));
        in.b selfieError = renderState.getSelfieError();
        String b10 = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = b10 == null ? renderProps.getStrings().getSelfieHintCenterFace() : b10;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            Function1 function1 = new Function1() { // from class: wp.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit g22;
                    g22 = SelfieWorkflow.g2(PoseInfo.this, pose, aVar, this, renderState, (String) obj);
                    return g22;
                }
            };
            aVar = aVar;
            selfieWorkflow = this;
            c0241b = new c.C0240c.b.d(function1, new Function1() { // from class: wp.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i22;
                    i22 = SelfieWorkflow.i2(SelfieWorkflow.this, aVar, (Throwable) obj);
                    return i22;
                }
            }, true, enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), false);
        } else {
            selfieWorkflow = this;
            c0241b = new c.C0240c.b.C0241b(renderState.getCountDown(), enumC0243c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a));
        }
        c.C0240c.b bVar = c0241b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState b11 = selfieWorkflow.navigationStateManager.b();
        Function1 n10 = p.n(aVar, false, 1, null);
        String str = selfieHintCenterFace;
        kn.a b42 = b4(renderProps);
        sr.a aVar2 = selfieWorkflow.webRtcManager;
        String str2 = b10;
        m10 = o.m(renderProps, aVar, renderState.j(), capturePageTitle, (r61 & 16) != 0 ? null : str, str2, renderState.getAutoCaptureSupported(), bVar, p.C(renderProps), requireStrictSelfieCapture, b11, new Function0() { // from class: wp.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j22;
                j22 = SelfieWorkflow.j2(k.a.this, selfieWorkflow);
                return j22;
            }
        }, new Function0() { // from class: wp.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k22;
                k22 = SelfieWorkflow.k2(SelfieWorkflow.this, aVar);
                return k22;
            }
        }, n10, new Function0() { // from class: wp.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l22;
                l22 = SelfieWorkflow.l2(SelfieWorkflow.this, aVar, renderProps);
                return l22;
            }
        }, b42, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.a(eo.a.f16085a), renderState.getIsDimLightConditions(), (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final c i3(Input renderProps, SelfieState.Submit renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        bq.a aVar;
        final boolean z10 = renderProps.getDesignVersion() == wp.a.f34487c;
        if (renderState.getRecoverableSubmitError() == null) {
            b.a aVar2 = this.submitVerificationWorker;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            String fromComponent = renderProps.getFromComponent();
            String fromStep = renderProps.getFromStep();
            List<Selfie> w5 = renderState.w();
            SelfieType selfieType = renderProps.getSelfieType();
            String fieldKeySelfie = renderProps.getFieldKeySelfie();
            String webRtcObjectId = renderState.getWebRtcObjectId();
            CameraProperties cameraProperties = renderState.getCameraProperties();
            long startSelfieTimestamp = renderState.getStartSelfieTimestamp();
            String fileUploadUrl = renderProps.getFileUploadUrl();
            bq.a aVar3 = this.selfiePoseManager;
            if (aVar3 == null) {
                Intrinsics.u("selfiePoseManager");
                aVar = null;
            } else {
                aVar = aVar3;
            }
            w.l(context, aVar2.a(sessionToken, inquiryId, fromComponent, fromStep, selfieType, fieldKeySelfie, w5, webRtcObjectId, cameraProperties, startSelfieTimestamp, fileUploadUrl, aVar), d0.k(aq.b.class), "submit_" + renderState.getSubmitAttempt(), new Function1() { // from class: wp.e3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r j32;
                    j32 = SelfieWorkflow.j3(SelfieWorkflow.this, context, z10, (b.d) obj);
                    return j32;
                }
            });
        }
        sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        oq.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState b10 = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: wp.f3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m32;
                m32 = SelfieWorkflow.m3(SelfieWorkflow.this, context);
                return m32;
            }
        };
        Function0 function02 = new Function0() { // from class: wp.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit n32;
                n32 = SelfieWorkflow.n3(SelfieWorkflow.this, context);
                return n32;
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new c.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, b10, function0, function02, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), p.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: wp.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit o32;
                o32 = SelfieWorkflow.o3(k.a.this, this);
                return o32;
            }
        });
    }

    public final c m2(final Input renderProps, SelfieState.FinalizeWebRtc renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        c m10;
        sr.a aVar = this.webRtcManager;
        if (aVar != null) {
            finalizeWebRtc = renderState;
            aVar.g(renderProps.getFromStep(), new Function1() { // from class: wp.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit n22;
                    n22 = SelfieWorkflow.n2(k.a.this, this, renderProps, finalizeWebRtc, (String) obj);
                    return n22;
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        m10 = o.m(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (r61 & 16) != 0 ? null : null, null, false, new c.C0240c.b.h(new Function0() { // from class: wp.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p22;
                p22 = SelfieWorkflow.p2();
                return p22;
            }
        }, false, c.C0240c.EnumC0243c.f12820p, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: wp.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q22;
                q22 = SelfieWorkflow.q2(k.a.this, this);
                return q22;
            }
        }, new Function0() { // from class: wp.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit r22;
                r22 = SelfieWorkflow.r2(SelfieWorkflow.this, context);
                return r22;
            }
        }, p.m(context, false), new Function0() { // from class: wp.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit s22;
                s22 = SelfieWorkflow.s2(SelfieWorkflow.this, context, renderProps);
                return s22;
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : false, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        return m10;
    }

    public final Object q3(final Input renderProps, final SelfieState.WaitForCameraFeed renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c m10;
        mp.c d10;
        mp.c d11;
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, i0.f28911a)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && w1(renderProps) && hq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, i0.b);
        final long currentTimeMillis = System.currentTimeMillis();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.g());
        m10 = o.m(renderProps, context, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (r61 & 16) != 0 ? null : null, null, false, new c.C0240c.b.g(new Function1() { // from class: wp.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x32;
                x32 = SelfieWorkflow.x3(SelfieWorkflow.this, context, renderProps, renderState, currentTimeMillis, (CameraProperties) obj);
                return x32;
            }
        }, c.C0240c.EnumC0243c.f12806a, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12616a), b4(renderProps) == kn.a.b, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: wp.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit z32;
                z32 = SelfieWorkflow.z3(k.a.this, (Throwable) obj);
                return z32;
            }
        }), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: wp.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit A3;
                A3 = SelfieWorkflow.A3(k.a.this, this);
                return A3;
            }
        }, new Function0() { // from class: wp.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit r32;
                r32 = SelfieWorkflow.r3(SelfieWorkflow.this, context);
                return r32;
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: wp.m3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit s32;
                s32 = SelfieWorkflow.s3(SelfieWorkflow.this, context, renderProps);
                return s32;
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, (r61 & 67108864) != 0 ? false : false, (r61 & 134217728) != 0 ? false : z10 || z11, (r61 & 268435456) != 0 ? false : false, (r61 & 536870912) != 0);
        if (z10) {
            i0 i0Var = i0.f28911a;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle != null ? cameraPermissionsTitle : "";
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(tp.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(tp.g.G, hq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            d11 = com.withpersona.sdk2.inquiry.permissions.g.d(m10, context, true, i0Var, (r36 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : null, new Function1() { // from class: wp.n3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r t32;
                    t32 = SelfieWorkflow.t3(SelfieWorkflow.this, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
                    return t32;
                }
            });
            return d11;
        }
        if (!z11) {
            return m10;
        }
        i0 i0Var2 = i0.b;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(tp.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string2 = context3.getString(tp.g.R, hq.g.b(context3));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        d10 = com.withpersona.sdk2.inquiry.permissions.g.d(m10, context, true, i0Var2, (r36 & 8) != 0 ? false : false, microphonePermissionsTitle != null ? microphonePermissionsTitle : "", microphonePermissionsRationale, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (r36 & 512) != 0 ? null : null, (r36 & 1024) != 0 ? null : null, (r36 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (r36 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: wp.p3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wm.r v32;
                v32 = SelfieWorkflow.v3(SelfieWorkflow.this, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
                return v32;
            }
        });
        return d10;
    }

    public final c t2(final Input renderProps, final SelfieState.RestartCamera renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        sr.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
        return new c.e(new Function0() { // from class: wp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit u22;
                u22 = SelfieWorkflow.u2(k.a.this, this, renderProps, renderState);
                return u22;
            }
        });
    }

    @Override // wm.k
    @NotNull
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public SelfieState d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.selfiePoseManager = this.selfiePoseManagerFactory.a(props.getInquiryId(), props.getSessionToken(), props.getFromStep(), props.C(), props.getPoseTimeoutMs());
        this.selfieEventLogger.o(props.getUsePerPoseReveal());
        if (snapshot != null) {
            wu.h b10 = snapshot.b();
            Parcelable parcelable = null;
            if (b10.I() <= 0) {
                b10 = null;
            }
            if (b10 != null) {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                byte[] O = b10.O();
                obtain.unmarshall(O, 0, O.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
            }
            SelfieState selfieState = (SelfieState) parcelable;
            if (selfieState != null) {
                return selfieState;
            }
        }
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.A(), props.getPoseConfigs(), false, CameraProperties.b.f9961a, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    public final boolean w1(Input renderProps) {
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

    public final c w2(final Input renderProps, final SelfieState.ReviewCaptures renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
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
        return new c.f(new c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.z(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: wp.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit x22;
                x22 = SelfieWorkflow.x2(k.a.this, this, renderState);
                return x22;
            }
        }, new Function0() { // from class: wp.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z22;
                z22 = SelfieWorkflow.z2(k.a.this, this, renderProps, renderState);
                return z22;
            }
        }, new Function0() { // from class: wp.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit B2;
                B2 = SelfieWorkflow.B2(k.a.this, this);
                return B2;
            }
        }, new Function0() { // from class: wp.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit C2;
                C2 = SelfieWorkflow.C2(SelfieWorkflow.this, context);
                return C2;
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.withpersona.sdk2.inquiry.selfie.SelfieState & com.withpersona.sdk2.inquiry.selfie.a> com.withpersona.sdk2.inquiry.selfie.SelfieState x1(wm.r<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ?>.c r24, T r25, com.withpersona.sdk2.inquiry.selfie.Selfie r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.x1(wm.r$c, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.Selfie):com.withpersona.sdk2.inquiry.selfie.SelfieState");
    }

    @Override // wm.k
    @NotNull
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull SelfieState renderState, @NotNull wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        Object z12;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!p.H(renderState)) {
            context.b("close_camera", new e(null));
        }
        if (!c4(renderProps)) {
            context.b("output_webrtc_error", new f(context, this, null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), l2.f(renderState));
        if (renderState instanceof SelfieState.ShowInstructions) {
            z12 = D2(renderProps, (SelfieState.ShowInstructions) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            z12 = B3(renderProps, (SelfieState.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            z12 = q3(renderProps, (SelfieState.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            z12 = t2(renderProps, (SelfieState.RestartCamera) renderState, context);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            z12 = J2(renderProps, (SelfieState.ShowPoseHint) renderState, context);
        } else if (renderState instanceof SelfieState.StartCapture) {
            z12 = P2(renderProps, (SelfieState.StartCapture) renderState, context);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            z12 = a3(renderProps, (SelfieState.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            z12 = Z1(renderProps, (SelfieState.CountdownToCapture) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            z12 = f2(renderProps, (SelfieState.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof SelfieState.Capture) {
            z12 = K1(renderProps, (SelfieState.Capture) renderState, context);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            z12 = T1(renderProps, (SelfieState.CaptureTransition) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            z12 = this.localVideoCaptureRenderer.q(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            z12 = m2(renderProps, (SelfieState.FinalizeWebRtc) renderState, context);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            z12 = P3(renderProps, (SelfieState.WebRtcFinished) renderState, context);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            z12 = w2(renderProps, (SelfieState.ReviewCaptures) renderState, context);
        } else if (z10) {
            z12 = i3(renderProps, (SelfieState.Submit) renderState, context);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new gt.l();
            }
            z12 = z1(renderProps, (SelfieState.AcquireNextPose) renderState, context);
        }
        return z12 instanceof c.C0240c ? com.withpersona.sdk2.inquiry.permissions.g.c(z12) : z12;
    }

    public final c z1(final Input renderProps, SelfieState.AcquireNextPose renderState, final wm.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        int size = renderState.w().size();
        context.b("fetch_pose_" + size, new g(size, context, null));
        return new c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new c.a.AbstractC0237a.C0238a(c.a.b.f12738a, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: wp.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit A1;
                A1 = SelfieWorkflow.A1(k.a.this, this, (in.a) obj, ((Boolean) obj2).booleanValue());
                return A1;
            }
        }, new Function1() { // from class: wp.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit C1;
                C1 = SelfieWorkflow.C1(k.a.this, this, (Throwable) obj);
                return C1;
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: wp.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit E1;
                E1 = SelfieWorkflow.E1(k.a.this, this);
                return E1;
            }
        }, new Function0() { // from class: wp.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit F1;
                F1 = SelfieWorkflow.F1(SelfieWorkflow.this, context);
                return F1;
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: wp.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit G1;
                G1 = SelfieWorkflow.G1(SelfieWorkflow.this, context, renderProps);
                return G1;
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: wp.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit H1;
                H1 = SelfieWorkflow.H1(k.a.this, this, (CameraProperties.b) obj);
                return H1;
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(eo.a.f16085a), false, false, new Function1() { // from class: wp.o3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit J1;
                J1 = SelfieWorkflow.J1(((Boolean) obj).booleanValue());
                return J1;
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }
}
