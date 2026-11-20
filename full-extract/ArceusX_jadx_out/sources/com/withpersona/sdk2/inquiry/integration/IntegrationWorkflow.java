package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.g;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import gt.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import vo.BrowserSelection;
import vo.e;
import wm.Snapshot;
import wm.k;
import wm.r;
import wm.w;
import wm.z;
import wu.h;
import ym.q;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005678.0B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020 *\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020#2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%JU\u0010,\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*0(0'*\u00020&2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lsq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lsq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "props", "Lwm/i;", "snapshot", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lwm/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "state", "C", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lwm/i;", "renderProps", "renderState", "Lwm/k$a;", "context", "z", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lwm/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "", "v", "(Lwm/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "r", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lwm/k$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "p", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lwm/k$a;)Ljava/util/List;", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lsq/a;", "c", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", d.f30696a, "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Input", "State", "PendingAction", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntegrationWorkflow extends k<Input, State, b, Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.InterfaceC0209a integrationBrowserWorkerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b4\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b?\u0010IR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bG\u0010;¨\u0006K"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "stepName", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "startPage", "isSubmitting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;ZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getInquiryId", j6.b.f21518e, "getSessionToken", "c", "getStepName", d.f30696a, "getType", "e", "g", "f", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "h", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "l", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "m", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "n", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final IntegrationPage startPage;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSubmitting;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                NextStep.Integration.IntegrationStepBrowserType valueOf = NextStep.Integration.IntegrationStepBrowserType.valueOf(parcel.readString());
                boolean z12 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z13 = z10;
                }
                return new Input(readString, readString2, readString3, readString4, readString5, readString6, valueOf, z12, z13, (InquirySessionConfig) parcel.readParcelable(Input.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() == 0 ? null : IntegrationPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z11 : false);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, boolean z10, boolean z11, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle, @Nullable InternalErrorInfo internalErrorInfo, @Nullable IntegrationPage integrationPage, boolean z12) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.stepName = stepName;
            this.type = type;
            this.flowUrl = flowUrl;
            this.redirectPath = redirectPath;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.inquirySessionConfig = inquirySessionConfig;
            this.styles = integrationStepStyle;
            this.transitionError = internalErrorInfo;
            this.startPage = integrationPage;
            this.isSubmitting = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
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
            return Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.stepName, input.stepName) && Intrinsics.c(this.type, input.type) && Intrinsics.c(this.flowUrl, input.flowUrl) && Intrinsics.c(this.redirectPath, input.redirectPath) && this.integrationStepBrowserType == input.integrationStepBrowserType && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.transitionError, input.transitionError) && Intrinsics.c(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + this.redirectPath.hashCode()) * 31) + this.integrationStepBrowserType.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int hashCode2 = (hashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int hashCode3 = (hashCode2 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31;
            IntegrationPage integrationPage = this.startPage;
            return ((hashCode3 + (integrationPage != null ? integrationPage.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSubmitting);
        }

        @NotNull
        /* renamed from: i, reason: from getter */
        public final NextStep.Integration.IntegrationStepBrowserType getIntegrationStepBrowserType() {
            return this.integrationStepBrowserType;
        }

        @NotNull
        /* renamed from: j, reason: from getter */
        public final String getRedirectPath() {
            return this.redirectPath;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final IntegrationPage getStartPage() {
            return this.startPage;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @NotNull
        public String toString() {
            return "Input(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", stepName=" + this.stepName + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", redirectPath=" + this.redirectPath + ", integrationStepBrowserType=" + this.integrationStepBrowserType + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", inquirySessionConfig=" + this.inquirySessionConfig + ", styles=" + this.styles + ", transitionError=" + this.transitionError + ", startPage=" + this.startPage + ", isSubmitting=" + this.isSubmitting + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.stepName);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeString(this.redirectPath);
            dest.writeString(this.integrationStepBrowserType.name());
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.transitionError, flags);
            IntegrationPage integrationPage = this.startPage;
            if (integrationPage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                integrationPage.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "Landroid/os/Parcelable;", "OpenBrowser", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PendingAction extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBrowser implements PendingAction {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final OpenBrowser f11175a = new OpenBrowser();

            @NotNull
            public static final Parcelable.Creator<OpenBrowser> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<OpenBrowser> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OpenBrowser createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenBrowser.f11175a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OpenBrowser[] newArray(int i10) {
                    return new OpenBrowser[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof OpenBrowser);
            }

            public int hashCode() {
                return 2035883520;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "Starting", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class State extends SimpleWorkflowState {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "pendingAction", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "v", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Starting extends State {

            @NotNull
            public static final Parcelable.Creator<Starting> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final PendingAction pendingAction;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Starting> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Starting createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Starting((PendingAction) parcel.readParcelable(Starting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Starting[] newArray(int i10) {
                    return new Starting[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Starting() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Starting) && Intrinsics.c(this.pendingAction, ((Starting) other).pendingAction);
            }

            public int hashCode() {
                PendingAction pendingAction = this.pendingAction;
                if (pendingAction == null) {
                    return 0;
                }
                return pendingAction.hashCode();
            }

            @NotNull
            public String toString() {
                return "Starting(pendingAction=" + this.pendingAction + ")";
            }

            @NotNull
            public final Starting u(@Nullable PendingAction pendingAction) {
                return new Starting(pendingAction);
            }

            @Nullable
            /* renamed from: v, reason: from getter */
            public final PendingAction getPendingAction() {
                return this.pendingAction;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.pendingAction, flags);
            }

            public Starting(@Nullable PendingAction pendingAction) {
                super(null);
                this.pendingAction = pendingAction;
            }

            public /* synthetic */ Starting(PendingAction pendingAction, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : pendingAction);
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public State() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "", ve.a.f33391e, j6.b.f21518e, "c", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0207a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0207a f11177a = new C0207a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0207a);
            }

            public int hashCode() {
                return 224778200;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f11178a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1292437803;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f11179a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1979122029;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "c", rl.d.f30696a, ve.a.f33391e, j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f11180a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1494152841;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0208b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0208b f11181a = new C0208b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0208b);
            }

            public int hashCode() {
                return -1332850934;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f11182a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 929193848;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f11183a = new d();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1519977214;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }
    }

    public IntegrationWorkflow(@NotNull Context applicationContext, @NotNull sq.a navigationStateManager, @NotNull a.InterfaceC0209a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit A(IntegrationWorkflow integrationWorkflow, k.a aVar) {
        integrationWorkflow.v(aVar, a.C0207a.f11177a);
        return Unit.f22894a;
    }

    public static final Unit B(IntegrationWorkflow integrationWorkflow, k.a aVar) {
        integrationWorkflow.v(aVar, a.b.f11178a);
        return Unit.f22894a;
    }

    public static final Unit q(IntegrationWorkflow integrationWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        integrationWorkflow.v(aVar, a.c.f11179a);
        return Unit.f22894a;
    }

    public static final r s(IntegrationWorkflow integrationWorkflow, Input input, BrowserSelection browserSelection, final State.Starting starting, a.b it) {
        r d10;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof a.b.C0210a)) {
            throw new l();
        }
        TrackingEventsLogger.logIntegrationEvent$default(integrationWorkflow.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        d10 = z.d(integrationWorkflow, null, new Function1() { // from class: vo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t8;
                t8 = IntegrationWorkflow.t(IntegrationWorkflow.State.Starting.this, (r.c) obj);
                return t8;
            }
        }, 1, null);
        return d10;
    }

    public static final Unit t(State.Starting starting, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(starting.u(null));
        action.d(b.d.f11183a);
        return Unit.f22894a;
    }

    public static final Unit w(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.a.f11180a);
        return Unit.f22894a;
    }

    public static final Unit x(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.C0208b.f11181a);
        return Unit.f22894a;
    }

    public static final Unit y(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        Intrinsics.d(c10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting");
        action.e(((State.Starting) c10).u(PendingAction.OpenBrowser.f11175a));
        return Unit.f22894a;
    }

    @Override // wm.k
    @NotNull
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> p(IntegrationPage integrationPage, final k<? super Input, State, ? extends b, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(integrationPage.getOpenBrowserButton(), new Function1() { // from class: vo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q10;
                q10 = IntegrationWorkflow.q(IntegrationWorkflow.this, aVar, (UiComponent) obj);
                return q10;
            }
        }).b();
    }

    public final void r(final Input renderProps, final State.Starting renderState, k<? super Input, State, ? extends b, ? extends Object>.a context) {
        PendingAction pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof PendingAction.OpenBrowser)) {
            if (pendingAction != null) {
                throw new l();
            }
            return;
        }
        final BrowserSelection c10 = e.f33497a.c(this.applicationContext);
        TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(c10.getSupportsAuthTab()), null, 8, null), false, 2, null);
        w.l(context, this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), c10, renderProps.getIntegrationStepBrowserType()), d0.k(com.withpersona.sdk2.inquiry.integration.a.class), "", new Function1() { // from class: vo.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                r s8;
                s8 = IntegrationWorkflow.s(IntegrationWorkflow.this, renderProps, c10, renderState, (a.b) obj);
                return s8;
            }
        });
    }

    @Override // wm.k
    @NotNull
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public State d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            h b10 = snapshot.b();
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
            State state = (State) parcelable;
            if (state != null) {
                return state;
            }
        }
        return new State.Starting(PendingAction.OpenBrowser.f11175a);
    }

    public final void v(k<? super Input, State, ? extends b, ? extends Object>.a aVar, a aVar2) {
        r<? super Object, State, ? extends Object> d10;
        r<? super Object, State, ? extends Object> d11;
        r<? super Object, State, ? extends Object> d12;
        if (aVar2 instanceof a.C0207a) {
            wm.h<r<? super Object, State, ? extends Object>> d13 = aVar.d();
            d12 = z.d(this, null, new Function1() { // from class: vo.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit w5;
                    w5 = IntegrationWorkflow.w((r.c) obj);
                    return w5;
                }
            }, 1, null);
            d13.a(d12);
        } else if (aVar2 instanceof a.b) {
            wm.h<r<? super Object, State, ? extends Object>> d14 = aVar.d();
            d11 = z.d(this, null, new Function1() { // from class: vo.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit x10;
                    x10 = IntegrationWorkflow.x((r.c) obj);
                    return x10;
                }
            }, 1, null);
            d14.a(d11);
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new l();
            }
            wm.h<r<? super Object, State, ? extends Object>> d15 = aVar.d();
            d10 = z.d(this, null, new Function1() { // from class: vo.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit y10;
                    y10 = IntegrationWorkflow.y((r.c) obj);
                    return y10;
                }
            }, 1, null);
            d15.a(d10);
        }
    }

    @Override // wm.k
    @NotNull
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull State renderState, @NotNull final k<? super Input, State, ? extends b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(renderState instanceof State.Starting)) {
            throw new l();
        }
        State.Starting starting = (State.Starting) renderState;
        r(renderProps, starting, context);
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        IntegrationPage startPage = renderProps.getStartPage();
        Intrinsics.checkNotNull(startPage);
        IntegrationView integrationView = new IntegrationView(yq.b.a(startPage), this.navigationStateManager.b(), new Function0() { // from class: vo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit A;
                A = IntegrationWorkflow.A(IntegrationWorkflow.this, context);
                return A;
            }
        }, new Function0() { // from class: vo.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit B;
                B = IntegrationWorkflow.B(IntegrationWorkflow.this, context);
                return B;
            }
        }, p(renderProps.getStartPage(), context), starting.getPendingAction() != null || renderProps.getIsSubmitting());
        g.c(integrationView);
        return integrationView;
    }
}
