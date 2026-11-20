package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.m0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\r789:;<=>?@ABCB]\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b*\u0010\u0019R(\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00106\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u00105\u0082\u0001\rDEFGHIJKLMNOP¨\u0006Q"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "Landroid/os/Parcelable;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;)V", "p", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "other", "", "q0", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z", ve.a.f33391e, "Ljava/lang/String;", "y", "()Ljava/lang/String;", j6.b.f21518e, "i", "c", "g", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "m", "h", "Z", "k", "()Z", "o", "(Z)V", "getDidGoBack$annotations", "()V", "didGoBack", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "CreateInquiryFromTemplate", "ResumeFallbackInquiry", "ExchangeOneTimeCode", "RedeemRelaySession", "CreateInquirySession", "ShowLoadingSpinner", "LoadFeatureFlagSession", "UiStepRunning", "GovernmentIdStepRunning", "SelfieStepRunning", "DocumentStepRunning", "IntegrationStepRunning", "Complete", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InquiryState implements WorkflowState, Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String sessionToken;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String inquiryId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TransitionStatus transitionStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NextStep.CancelDialog cancelDialog;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fromStep;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean didGoBack;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019Jr\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u001d¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", zl.t.f38095d, "Ljava/util/Map;", "s", "()Ljava/util/Map;", "o", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "p", "f", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Complete extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Map<String, InquiryField> fields;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Complete> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(Complete.class.getClassLoader());
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                }
                return new Complete(readString, readString2, readString3, transitionStatus, readString4, linkedHashMap, (InquirySessionConfig) parcel.readParcelable(Complete.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Complete[] newArray(int i10) {
                return new Complete[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Complete(java.lang.String r2, java.lang.String r3, java.lang.String r4, com.withpersona.sdk2.inquiry.internal.TransitionStatus r5, java.lang.String r6, java.util.Map r7, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L6
                r4 = r0
            L6:
                r10 = r10 & 8
                if (r10 == 0) goto L14
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r0
            Lf:
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                goto L1a
            L14:
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                goto Lf
            L1a:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.InquiryState.Complete.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, java.lang.String, java.util.Map, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Complete r(Complete complete, String str, String str2, String str3, TransitionStatus transitionStatus, String str4, Map map, InquirySessionConfig inquirySessionConfig, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = complete.inquiryId;
            }
            if ((i10 & 2) != 0) {
                str2 = complete.sessionToken;
            }
            if ((i10 & 4) != 0) {
                str3 = complete.trackingEventsUrl;
            }
            if ((i10 & 8) != 0) {
                transitionStatus = complete.transitionStatus;
            }
            if ((i10 & 16) != 0) {
                str4 = complete.inquiryStatus;
            }
            if ((i10 & 32) != 0) {
                map = complete.fields;
            }
            if ((i10 & 64) != 0) {
                inquirySessionConfig = complete.inquirySessionConfig;
            }
            if ((i10 & 128) != 0) {
                str5 = complete.redirectUri;
            }
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            String str6 = str5;
            String str7 = str4;
            Map map2 = map;
            return complete.q(str, str2, str3, transitionStatus, str7, map2, inquirySessionConfig2, str6);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.c(this.inquiryId, complete.inquiryId) && Intrinsics.c(this.sessionToken, complete.sessionToken) && Intrinsics.c(this.trackingEventsUrl, complete.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, complete.transitionStatus) && Intrinsics.c(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.c(this.fields, complete.fields) && Intrinsics.c(this.inquirySessionConfig, complete.inquirySessionConfig) && Intrinsics.c(this.redirectUri, complete.redirectUri);
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (((((((hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str2 = this.redirectUri;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final Complete q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new Complete(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, inquiryStatus, fields, inquirySessionConfig, redirectUri);
        }

        @NotNull
        public final Map<String, InquiryField> s() {
            return this.fields;
        }

        @NotNull
        /* renamed from: t, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @NotNull
        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.inquiryStatus = inquiryStatus;
            this.fields = fields;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str2;
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$Jª\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010(R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b/\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b2\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\bD\u0010(R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\b9\u0010(R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bA\u0010P\u001a\u0004\bL\u0010QR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bR\u0010(¨\u0006S"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lxo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "documentStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "p", "v", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "w", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", zl.t.f38095d, "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentStepRunning extends InquiryState implements m0 {

        @NotNull
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.DocumentStepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Document documentStep;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final DocumentPages pages;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Document.AssetConfig assetConfig;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DocumentStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (DocumentPages) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (CustomPendingPage) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning[] newArray(int i10) {
                return new DocumentStepRunning[i10];
            }
        }

        public /* synthetic */ DocumentStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str4, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str5, InquirySessionConfig inquirySessionConfig, CustomPendingPage customPendingPage, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, documentStepStyle, cancelDialog, document, str4, documentPages, assetConfig, str5, inquirySessionConfig, (i10 & 4096) != 0 ? null : customPendingPage, (i10 & 8192) != 0 ? null : str6);
        }

        public static /* synthetic */ DocumentStepRunning r(DocumentStepRunning documentStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str4, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str5, InquirySessionConfig inquirySessionConfig, CustomPendingPage customPendingPage, String str6, int i10, Object obj) {
            return documentStepRunning.q((i10 & 1) != 0 ? documentStepRunning.inquiryId : str, (i10 & 2) != 0 ? documentStepRunning.sessionToken : str2, (i10 & 4) != 0 ? documentStepRunning.trackingEventsUrl : str3, (i10 & 8) != 0 ? documentStepRunning.transitionStatus : transitionStatus, (i10 & 16) != 0 ? documentStepRunning.styles : documentStepStyle, (i10 & 32) != 0 ? documentStepRunning.cancelDialog : cancelDialog, (i10 & 64) != 0 ? documentStepRunning.documentStep : document, (i10 & 128) != 0 ? documentStepRunning.fromComponent : str4, (i10 & 256) != 0 ? documentStepRunning.pages : documentPages, (i10 & 512) != 0 ? documentStepRunning.assetConfig : assetConfig, (i10 & 1024) != 0 ? documentStepRunning.fromStep : str5, (i10 & 2048) != 0 ? documentStepRunning.inquirySessionConfig : inquirySessionConfig, (i10 & 4096) != 0 ? documentStepRunning.customPendingPage : customPendingPage, (i10 & 8192) != 0 ? documentStepRunning.redirectUri : str6);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) other;
            return Intrinsics.c(this.inquiryId, documentStepRunning.inquiryId) && Intrinsics.c(this.sessionToken, documentStepRunning.sessionToken) && Intrinsics.c(this.trackingEventsUrl, documentStepRunning.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, documentStepRunning.transitionStatus) && Intrinsics.c(this.styles, documentStepRunning.styles) && Intrinsics.c(this.cancelDialog, documentStepRunning.cancelDialog) && Intrinsics.c(this.documentStep, documentStepRunning.documentStep) && Intrinsics.c(this.fromComponent, documentStepRunning.fromComponent) && Intrinsics.c(this.pages, documentStepRunning.pages) && Intrinsics.c(this.assetConfig, documentStepRunning.assetConfig) && Intrinsics.c(this.fromStep, documentStepRunning.fromStep) && Intrinsics.c(this.inquirySessionConfig, documentStepRunning.inquirySessionConfig) && Intrinsics.c(this.customPendingPage, documentStepRunning.customPendingPage) && Intrinsics.c(this.redirectUri, documentStepRunning.redirectUri);
        }

        @Override // xo.m0
        @Nullable
        /* renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int hashCode4 = (hashCode3 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode5 = (((((((hashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.documentStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.pages.hashCode()) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            int hashCode6 = (((((hashCode5 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.fromStep.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int hashCode7 = (hashCode6 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str2 = this.redirectUri;
            return hashCode7 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final DocumentStepRunning q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.DocumentStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document documentStep, @NotNull String fromComponent, @NotNull DocumentPages pages, @Nullable NextStep.Document.AssetConfig assetConfig, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new DocumentStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep, inquirySessionConfig, customPendingPage, redirectUri);
        }

        @Nullable
        /* renamed from: s, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Nullable
        /* renamed from: t, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        public String toString() {
            return "DocumentStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", documentStep=" + this.documentStep + ", fromComponent=" + this.fromComponent + ", pages=" + this.pages + ", assetConfig=" + this.assetConfig + ", fromStep=" + this.fromStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final NextStep.Document getDocumentStep() {
            return this.documentStep;
        }

        @NotNull
        /* renamed from: v, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: w, reason: from getter */
        public final DocumentPages getPages() {
            return this.pages;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.documentStep, flags);
            dest.writeString(this.fromComponent);
            dest.writeParcelable(this.pages, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.fromStep);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        /* renamed from: x, reason: from getter */
        public StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document documentStep, @NotNull String fromComponent, @NotNull DocumentPages pages, @Nullable NextStep.Document.AssetConfig assetConfig, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable CustomPendingPage customPendingPage, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = documentStep;
            this.fromComponent = fromComponent;
            this.pages = pages;
            this.assetConfig = assetConfig;
            this.fromStep = fromStep;
            this.inquirySessionConfig = inquirySessionConfig;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str2;
        }
    }

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bS\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u0013\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00103\u001a\u00020\u0013\u0012\b\u00104\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u001c¢\u0006\u0004\bA\u0010BJ\u001d\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001c¢\u0006\u0004\bG\u0010HJÈ\u0003\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00132\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u00132\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00103\u001a\u00020\u00132\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00108\u001a\u0002072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\bM\u0010BJ\u001a\u0010P\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010LR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010LR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bR\u0010LR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010`\u001a\u0004\bU\u0010aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u0010LR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bI\u0010S\u001a\u0004\bh\u0010LR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010S\u001a\u0004\b\\\u0010LR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bn\u0010k\u001a\u0004\bo\u0010mR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bl\u0010e\u001a\u0004\bt\u0010gR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006¢\u0006\f\n\u0004\bo\u0010e\u001a\u0004\bu\u0010gR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010v\u001a\u0004\bw\u0010BR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bV\u0010x\u001a\u0004\by\u0010zR\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b{\u0010S\u001a\u0004\bv\u0010LR\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b|\u0010S\u001a\u0004\bx\u0010LR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b}\u0010k\u001a\u0004\b~\u0010mR\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006¢\u0006\r\n\u0004\b\u007f\u0010e\u001a\u0005\b\u0080\u0001\u0010gR\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010e\u001a\u0005\b\u0081\u0001\u0010gR\u001a\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\bu\u0010S\u001a\u0005\b\u0082\u0001\u0010LR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\bj\u0010\u0085\u0001R\u0019\u0010+\u001a\u00020*8\u0006¢\u0006\u000e\n\u0005\bf\u0010\u0086\u0001\u001a\u0005\bp\u0010\u0087\u0001R\u001b\u0010-\u001a\u00020,8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010/\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\bv\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u00100\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bx\u0010k\u001a\u0004\bn\u0010mR\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u007f\u0010\u0091\u0001R\u0018\u00103\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\bh\u0010k\u001a\u0005\b\u0092\u0001\u0010mR\u001d\u00104\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001e\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u00108\u001a\u0002078\u0006¢\u0006\u000e\n\u0005\bw\u0010\u009a\u0001\u001a\u0005\b|\u0010\u009b\u0001R\u001a\u00109\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\bt\u0010S\u001a\u0005\b\u008f\u0001\u0010LR\u001a\u0010:\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\br\u0010S\u001a\u0005\b\u009c\u0001\u0010LR\u001c\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000f\n\u0005\by\u0010\u0094\u0001\u001a\u0006\b\u009d\u0001\u0010\u0096\u0001R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u009e\u0001\u001a\u0005\b{\u0010\u009f\u0001R\u001e\u0010>\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010S\u001a\u0005\b \u0001\u0010L¨\u0006¡\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lxo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "enabledIdClasses", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "", "imageCaptureCount", "", "manualCaptureButtonDelayMs", "fieldKeyDocument", "fieldKeyIdClass", "shouldSkipReviewScreen", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoCaptureMethods", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lgo/d;", "designVersion", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lgo/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lgo/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d0", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "x", "p", "Ljava/util/List;", "G", "()Ljava/util/List;", "L", "r", "s", "Z", "v", "()Z", zl.t.f38095d, "w", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Q", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "P", "E", "I", "O", "J", "R", "()J", "z", "A", "B", "U", "C", "D", "f0", "h0", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "H", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "T", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "S", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "K", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "b0", "M", "Ljava/lang/Integer;", "N", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lgo/d;", "()Lgo/d;", "a0", "V", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GovernmentIdStepRunning extends InquiryState implements m0 {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyIdClass;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        public final boolean shouldSkipReviewScreen;

        /* renamed from: C, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

        /* renamed from: D, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods;

        /* renamed from: E, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* renamed from: F, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig assetConfig;

        /* renamed from: G, reason: from kotlin metadata and from toString */
        @NotNull
        public final AutoClassificationConfig autoClassificationConfig;

        /* renamed from: H, reason: from kotlin metadata and from toString */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* renamed from: I, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* renamed from: J, reason: from kotlin metadata and from toString */
        public final boolean audioEnabled;

        /* renamed from: K, reason: from kotlin metadata and from toString */
        @Nullable
        public final DigitalIdConfig digitalIdConfig;

        /* renamed from: L, reason: from kotlin metadata and from toString */
        public final boolean staticCaptureTipsEnabled;

        /* renamed from: M, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer holographicTorchEnabledDurationMs;

        /* renamed from: N, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: O, reason: from kotlin metadata and from toString */
        @NotNull
        public final go.d designVersion;

        /* renamed from: P, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* renamed from: Q, reason: from kotlin metadata and from toString */
        @Nullable
        public final String silentNetworkAuthenticationCheckUrl;

        /* renamed from: R, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

        /* renamed from: S, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: T, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Id> enabledIdClasses;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.GovernmentId.Localizations localizations;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        public final int imageCaptureCount;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        public final long manualCaptureButtonDelayMs;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyDocument;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepRunning> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning createFromParcel(Parcel parcel) {
                Class cls;
                ArrayList arrayList;
                String str;
                int i10;
                Class cls2;
                ArrayList arrayList2;
                StyleElements.Axis axis;
                boolean z10;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList3.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                }
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean z11 = true;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    cls = GovernmentIdStepRunning.class;
                    str = readString5;
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    cls = GovernmentIdStepRunning.class;
                    arrayList = new ArrayList(readInt2);
                    str = readString5;
                    for (int i12 = 0; i12 != readInt2; i12++) {
                        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                    }
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                ArrayList arrayList5 = arrayList;
                for (int i13 = 0; i13 != readInt3; i13++) {
                    arrayList4.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                }
                int readInt4 = parcel.readInt();
                Class cls3 = cls;
                String str2 = str;
                long readLong = parcel.readLong();
                boolean z13 = false;
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    i10 = 0;
                    z13 = true;
                } else {
                    i10 = 0;
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt5);
                int i14 = i10;
                while (i14 != readInt5) {
                    arrayList6.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i14++;
                    readInt5 = readInt5;
                }
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                for (int i15 = i10; i15 != readInt6; i15++) {
                    arrayList7.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(parcel.readString()));
                }
                String readString9 = parcel.readString();
                NextStep.GovernmentId.AssetConfig assetConfig = (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls3.getClassLoader());
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) parcel.readParcelable(cls3.getClassLoader());
                StyleElements.Axis valueOf = StyleElements.Axis.valueOf(parcel.readString());
                PendingPageTextPosition valueOf2 = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    cls2 = cls3;
                    arrayList2 = arrayList6;
                    axis = valueOf;
                    z10 = 1;
                } else {
                    cls2 = cls3;
                    arrayList2 = arrayList6;
                    axis = valueOf;
                    z10 = i10;
                }
                DigitalIdConfig digitalIdConfig = (DigitalIdConfig) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() != 0) {
                    i10 = 1;
                }
                return new GovernmentIdStepRunning(readString, readString2, readString3, transitionStatus, governmentIdStepStyle, cancelDialog, readString4, arrayList3, str2, readString6, z12, z11, localizations, arrayList5, arrayList4, readInt4, readLong, readString7, readString8, z13, arrayList2, arrayList7, readString9, assetConfig, autoClassificationConfig, axis, valueOf2, z10, digitalIdConfig, i10, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (InquirySessionConfig) parcel.readParcelable(cls2.getClassLoader()), go.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (CustomPendingPage) parcel.readParcelable(cls2.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning[] newArray(int i10) {
                return new GovernmentIdStepRunning[i10];
            }
        }

        public /* synthetic */ GovernmentIdStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str4, List list, String str5, String str6, boolean z10, boolean z11, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i10, long j10, String str7, String str8, boolean z12, List list4, List list5, String str9, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z13, DigitalIdConfig digitalIdConfig, boolean z14, Integer num, InquirySessionConfig inquirySessionConfig, go.d dVar, String str10, String str11, Integer num2, CustomPendingPage customPendingPage, String str12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : transitionStatus, governmentIdStepStyle, cancelDialog, str4, list, str5, str6, z10, z11, localizations, list2, list3, i10, j10, str7, str8, z12, list4, list5, str9, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, z13, digitalIdConfig, z14, num, inquirySessionConfig, dVar, (i12 & 2) != 0 ? null : str10, (i12 & 4) != 0 ? null : str11, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : customPendingPage, (i12 & 32) != 0 ? null : str12);
        }

        public static /* synthetic */ GovernmentIdStepRunning r(GovernmentIdStepRunning governmentIdStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str4, List list, String str5, String str6, boolean z10, boolean z11, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i10, long j10, String str7, String str8, boolean z12, List list4, List list5, String str9, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z13, DigitalIdConfig digitalIdConfig, boolean z14, Integer num, InquirySessionConfig inquirySessionConfig, go.d dVar, String str10, String str11, Integer num2, CustomPendingPage customPendingPage, String str12, int i11, int i12, Object obj) {
            String str13;
            CustomPendingPage customPendingPage2;
            List list6;
            String str14;
            NextStep.GovernmentId.AssetConfig assetConfig2;
            AutoClassificationConfig autoClassificationConfig2;
            StyleElements.Axis axis2;
            PendingPageTextPosition pendingPageTextPosition2;
            boolean z15;
            DigitalIdConfig digitalIdConfig2;
            boolean z16;
            Integer num3;
            InquirySessionConfig inquirySessionConfig2;
            go.d dVar2;
            String str15;
            String str16;
            Integer num4;
            String str17;
            List list7;
            String str18;
            String str19;
            boolean z17;
            boolean z18;
            NextStep.GovernmentId.Localizations localizations2;
            List list8;
            List list9;
            int i13;
            long j11;
            String str20;
            boolean z19;
            List list10;
            String str21;
            String str22;
            TransitionStatus transitionStatus2;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2;
            NextStep.CancelDialog cancelDialog2;
            String str23;
            String str24 = (i11 & 1) != 0 ? governmentIdStepRunning.inquiryId : str;
            String str25 = (i11 & 2) != 0 ? governmentIdStepRunning.sessionToken : str2;
            String str26 = (i11 & 4) != 0 ? governmentIdStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus3 = (i11 & 8) != 0 ? governmentIdStepRunning.transitionStatus : transitionStatus;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = (i11 & 16) != 0 ? governmentIdStepRunning.styles : governmentIdStepStyle;
            NextStep.CancelDialog cancelDialog3 = (i11 & 32) != 0 ? governmentIdStepRunning.cancelDialog : cancelDialog;
            String str27 = (i11 & 64) != 0 ? governmentIdStepRunning.countryCode : str4;
            List list11 = (i11 & 128) != 0 ? governmentIdStepRunning.enabledIdClasses : list;
            String str28 = (i11 & 256) != 0 ? governmentIdStepRunning.fromComponent : str5;
            String str29 = (i11 & 512) != 0 ? governmentIdStepRunning.fromStep : str6;
            boolean z20 = (i11 & 1024) != 0 ? governmentIdStepRunning.backStepEnabled : z10;
            boolean z21 = (i11 & 2048) != 0 ? governmentIdStepRunning.cancelButtonEnabled : z11;
            NextStep.GovernmentId.Localizations localizations3 = (i11 & 4096) != 0 ? governmentIdStepRunning.localizations : localizations;
            List list12 = (i11 & 8192) != 0 ? governmentIdStepRunning.localizationOverrides : list2;
            String str30 = str24;
            List list13 = (i11 & 16384) != 0 ? governmentIdStepRunning.enabledCaptureOptionsNativeMobile : list3;
            int i14 = (i11 & 32768) != 0 ? governmentIdStepRunning.imageCaptureCount : i10;
            List list14 = list13;
            long j12 = (i11 & 65536) != 0 ? governmentIdStepRunning.manualCaptureButtonDelayMs : j10;
            String str31 = (i11 & 131072) != 0 ? governmentIdStepRunning.fieldKeyDocument : str7;
            String str32 = (i11 & 262144) != 0 ? governmentIdStepRunning.fieldKeyIdClass : str8;
            String str33 = str31;
            boolean z22 = (i11 & 524288) != 0 ? governmentIdStepRunning.shouldSkipReviewScreen : z12;
            List list15 = (i11 & 1048576) != 0 ? governmentIdStepRunning.enabledCaptureFileTypes : list4;
            List list16 = (i11 & 2097152) != 0 ? governmentIdStepRunning.videoCaptureMethods : list5;
            String str34 = (i11 & 4194304) != 0 ? governmentIdStepRunning.webRtcJwt : str9;
            NextStep.GovernmentId.AssetConfig assetConfig3 = (i11 & 8388608) != 0 ? governmentIdStepRunning.assetConfig : assetConfig;
            AutoClassificationConfig autoClassificationConfig3 = (i11 & 16777216) != 0 ? governmentIdStepRunning.autoClassificationConfig : autoClassificationConfig;
            StyleElements.Axis axis3 = (i11 & 33554432) != 0 ? governmentIdStepRunning.reviewCaptureButtonsAxis : axis;
            PendingPageTextPosition pendingPageTextPosition3 = (i11 & 67108864) != 0 ? governmentIdStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z23 = (i11 & 134217728) != 0 ? governmentIdStepRunning.audioEnabled : z13;
            DigitalIdConfig digitalIdConfig3 = (i11 & 268435456) != 0 ? governmentIdStepRunning.digitalIdConfig : digitalIdConfig;
            boolean z24 = (i11 & 536870912) != 0 ? governmentIdStepRunning.staticCaptureTipsEnabled : z14;
            Integer num5 = (i11 & 1073741824) != 0 ? governmentIdStepRunning.holographicTorchEnabledDurationMs : num;
            InquirySessionConfig inquirySessionConfig3 = (i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? governmentIdStepRunning.inquirySessionConfig : inquirySessionConfig;
            go.d dVar3 = (i12 & 1) != 0 ? governmentIdStepRunning.designVersion : dVar;
            String str35 = (i12 & 2) != 0 ? governmentIdStepRunning.flowWatermarkText : str10;
            String str36 = (i12 & 4) != 0 ? governmentIdStepRunning.silentNetworkAuthenticationCheckUrl : str11;
            Integer num6 = (i12 & 8) != 0 ? governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds : num2;
            CustomPendingPage customPendingPage3 = (i12 & 16) != 0 ? governmentIdStepRunning.customPendingPage : customPendingPage;
            if ((i12 & 32) != 0) {
                customPendingPage2 = customPendingPage3;
                str13 = governmentIdStepRunning.redirectUri;
                str14 = str34;
                assetConfig2 = assetConfig3;
                autoClassificationConfig2 = autoClassificationConfig3;
                axis2 = axis3;
                pendingPageTextPosition2 = pendingPageTextPosition3;
                z15 = z23;
                digitalIdConfig2 = digitalIdConfig3;
                z16 = z24;
                num3 = num5;
                inquirySessionConfig2 = inquirySessionConfig3;
                dVar2 = dVar3;
                str15 = str35;
                str16 = str36;
                num4 = num6;
                str17 = str32;
                str18 = str28;
                str19 = str29;
                z17 = z20;
                z18 = z21;
                localizations2 = localizations3;
                list8 = list12;
                list9 = list14;
                i13 = i14;
                j11 = j12;
                str20 = str33;
                z19 = z22;
                list10 = list15;
                list6 = list16;
                str21 = str25;
                str22 = str26;
                transitionStatus2 = transitionStatus3;
                governmentIdStepStyle2 = governmentIdStepStyle3;
                cancelDialog2 = cancelDialog3;
                str23 = str27;
                list7 = list11;
            } else {
                str13 = str12;
                customPendingPage2 = customPendingPage3;
                list6 = list16;
                str14 = str34;
                assetConfig2 = assetConfig3;
                autoClassificationConfig2 = autoClassificationConfig3;
                axis2 = axis3;
                pendingPageTextPosition2 = pendingPageTextPosition3;
                z15 = z23;
                digitalIdConfig2 = digitalIdConfig3;
                z16 = z24;
                num3 = num5;
                inquirySessionConfig2 = inquirySessionConfig3;
                dVar2 = dVar3;
                str15 = str35;
                str16 = str36;
                num4 = num6;
                str17 = str32;
                list7 = list11;
                str18 = str28;
                str19 = str29;
                z17 = z20;
                z18 = z21;
                localizations2 = localizations3;
                list8 = list12;
                list9 = list14;
                i13 = i14;
                j11 = j12;
                str20 = str33;
                z19 = z22;
                list10 = list15;
                str21 = str25;
                str22 = str26;
                transitionStatus2 = transitionStatus3;
                governmentIdStepStyle2 = governmentIdStepStyle3;
                cancelDialog2 = cancelDialog3;
                str23 = str27;
            }
            return governmentIdStepRunning.q(str30, str21, str22, transitionStatus2, governmentIdStepStyle2, cancelDialog2, str23, list7, str18, str19, z17, z18, localizations2, list8, list9, i13, j11, str20, str17, z19, list10, list6, str14, assetConfig2, autoClassificationConfig2, axis2, pendingPageTextPosition2, z15, digitalIdConfig2, z16, num3, inquirySessionConfig2, dVar2, str15, str16, num4, customPendingPage2, str13);
        }

        @NotNull
        /* renamed from: A, reason: from getter */
        public final go.d getDesignVersion() {
            return this.designVersion;
        }

        @Nullable
        /* renamed from: C, reason: from getter */
        public final DigitalIdConfig getDigitalIdConfig() {
            return this.digitalIdConfig;
        }

        @NotNull
        public final List<NextStep.GovernmentId.CaptureFileType> D() {
            return this.enabledCaptureFileTypes;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> E() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        public final List<Id> G() {
            return this.enabledIdClasses;
        }

        @NotNull
        /* renamed from: I, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* renamed from: J, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        @Nullable
        /* renamed from: K, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* renamed from: L, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @Nullable
        /* renamed from: N, reason: from getter */
        public final Integer getHolographicTorchEnabledDurationMs() {
            return this.holographicTorchEnabledDurationMs;
        }

        /* renamed from: O, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        @Nullable
        public final List<NextStep.GovernmentId.LocalizationOverride> P() {
            return this.localizationOverrides;
        }

        @NotNull
        /* renamed from: Q, reason: from getter */
        public final NextStep.GovernmentId.Localizations getLocalizations() {
            return this.localizations;
        }

        /* renamed from: R, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        @NotNull
        /* renamed from: S, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* renamed from: T, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* renamed from: U, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        @Nullable
        /* renamed from: V, reason: from getter */
        public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
            return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Nullable
        /* renamed from: a0, reason: from getter */
        public final String getSilentNetworkAuthenticationCheckUrl() {
            return this.silentNetworkAuthenticationCheckUrl;
        }

        /* renamed from: b0, reason: from getter */
        public final boolean getStaticCaptureTipsEnabled() {
            return this.staticCaptureTipsEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        /* renamed from: d0, reason: from getter */
        public StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) other;
            return Intrinsics.c(this.inquiryId, governmentIdStepRunning.inquiryId) && Intrinsics.c(this.sessionToken, governmentIdStepRunning.sessionToken) && Intrinsics.c(this.trackingEventsUrl, governmentIdStepRunning.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, governmentIdStepRunning.transitionStatus) && Intrinsics.c(this.styles, governmentIdStepRunning.styles) && Intrinsics.c(this.cancelDialog, governmentIdStepRunning.cancelDialog) && Intrinsics.c(this.countryCode, governmentIdStepRunning.countryCode) && Intrinsics.c(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && Intrinsics.c(this.fromComponent, governmentIdStepRunning.fromComponent) && Intrinsics.c(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && Intrinsics.c(this.localizations, governmentIdStepRunning.localizations) && Intrinsics.c(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && Intrinsics.c(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && Intrinsics.c(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && Intrinsics.c(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && Intrinsics.c(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && Intrinsics.c(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && Intrinsics.c(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && Intrinsics.c(this.assetConfig, governmentIdStepRunning.assetConfig) && Intrinsics.c(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && Intrinsics.c(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig) && this.staticCaptureTipsEnabled == governmentIdStepRunning.staticCaptureTipsEnabled && Intrinsics.c(this.holographicTorchEnabledDurationMs, governmentIdStepRunning.holographicTorchEnabledDurationMs) && Intrinsics.c(this.inquirySessionConfig, governmentIdStepRunning.inquirySessionConfig) && this.designVersion == governmentIdStepRunning.designVersion && Intrinsics.c(this.flowWatermarkText, governmentIdStepRunning.flowWatermarkText) && Intrinsics.c(this.silentNetworkAuthenticationCheckUrl, governmentIdStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.c(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds) && Intrinsics.c(this.customPendingPage, governmentIdStepRunning.customPendingPage) && Intrinsics.c(this.redirectUri, governmentIdStepRunning.redirectUri);
        }

        @Override // xo.m0
        @Nullable
        /* renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @NotNull
        public final List<NextStep.GovernmentId.VideoCaptureMethod> f0() {
            return this.videoCaptureMethods;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* renamed from: h0, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int hashCode4 = (hashCode3 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode5 = (hashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            String str2 = this.countryCode;
            int hashCode6 = (((((((((((((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.enabledIdClasses.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.localizations.hashCode()) * 31;
            List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
            int hashCode7 = (((((((((((((((((hashCode6 + (list == null ? 0 : list.hashCode())) * 31) + this.enabledCaptureOptionsNativeMobile.hashCode()) * 31) + Integer.hashCode(this.imageCaptureCount)) * 31) + Long.hashCode(this.manualCaptureButtonDelayMs)) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode()) * 31) + Boolean.hashCode(this.shouldSkipReviewScreen)) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            String str3 = this.webRtcJwt;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int hashCode9 = (((((((((hashCode8 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.autoClassificationConfig.hashCode()) * 31) + this.reviewCaptureButtonsAxis.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31;
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            int hashCode10 = (((hashCode9 + (digitalIdConfig == null ? 0 : digitalIdConfig.hashCode())) * 31) + Boolean.hashCode(this.staticCaptureTipsEnabled)) * 31;
            Integer num = this.holographicTorchEnabledDurationMs;
            int hashCode11 = (((((hashCode10 + (num == null ? 0 : num.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31) + this.designVersion.hashCode()) * 31;
            String str4 = this.flowWatermarkText;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.silentNetworkAuthenticationCheckUrl;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int hashCode15 = (hashCode14 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str6 = this.redirectUri;
            return hashCode15 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final GovernmentIdStepRunning q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @Nullable String countryCode, @NotNull List<Id> enabledIdClasses, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull NextStep.GovernmentId.Localizations localizations, @Nullable List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int imageCaptureCount, long manualCaptureButtonDelayMs, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, boolean shouldSkipReviewScreen, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, @Nullable String webRtcJwt, @Nullable NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, @Nullable DigitalIdConfig digitalIdConfig, boolean staticCaptureTipsEnabled, @Nullable Integer holographicTorchEnabledDurationMs, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull go.d designVersion, @Nullable String flowWatermarkText, @Nullable String silentNetworkAuthenticationCheckUrl, @Nullable Integer silentNetworkAuthenticationBackgroundTimeoutSeconds, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            return new GovernmentIdStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, localizations, localizationOverrides, enabledCaptureOptionsNativeMobile, imageCaptureCount, manualCaptureButtonDelayMs, fieldKeyDocument, fieldKeyIdClass, shouldSkipReviewScreen, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, audioEnabled, digitalIdConfig, staticCaptureTipsEnabled, holographicTorchEnabledDurationMs, inquirySessionConfig, designVersion, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, customPendingPage, redirectUri);
        }

        @Nullable
        /* renamed from: s, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", countryCode=" + this.countryCode + ", enabledIdClasses=" + this.enabledIdClasses + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", localizations=" + this.localizations + ", localizationOverrides=" + this.localizationOverrides + ", enabledCaptureOptionsNativeMobile=" + this.enabledCaptureOptionsNativeMobile + ", imageCaptureCount=" + this.imageCaptureCount + ", manualCaptureButtonDelayMs=" + this.manualCaptureButtonDelayMs + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ", shouldSkipReviewScreen=" + this.shouldSkipReviewScreen + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", assetConfig=" + this.assetConfig + ", autoClassificationConfig=" + this.autoClassificationConfig + ", reviewCaptureButtonsAxis=" + this.reviewCaptureButtonsAxis + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", digitalIdConfig=" + this.digitalIdConfig + ", staticCaptureTipsEnabled=" + this.staticCaptureTipsEnabled + ", holographicTorchEnabledDurationMs=" + this.holographicTorchEnabledDurationMs + ", inquirySessionConfig=" + this.inquirySessionConfig + ", designVersion=" + this.designVersion + ", flowWatermarkText=" + this.flowWatermarkText + ", silentNetworkAuthenticationCheckUrl=" + this.silentNetworkAuthenticationCheckUrl + ", silentNetworkAuthenticationBackgroundTimeoutSeconds=" + this.silentNetworkAuthenticationBackgroundTimeoutSeconds + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.countryCode);
            List<Id> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.GovernmentId.LocalizationOverride> list2 = this.localizationOverrides;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            List<CaptureOptionNativeMobile> list3 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list3.size());
            Iterator<CaptureOptionNativeMobile> it3 = list3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next().name());
            }
            dest.writeInt(this.imageCaptureCount);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            List<NextStep.GovernmentId.CaptureFileType> list4 = this.enabledCaptureFileTypes;
            dest.writeInt(list4.size());
            Iterator<NextStep.GovernmentId.CaptureFileType> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeString(it4.next().name());
            }
            List<NextStep.GovernmentId.VideoCaptureMethod> list5 = this.videoCaptureMethods;
            dest.writeInt(list5.size());
            Iterator<NextStep.GovernmentId.VideoCaptureMethod> it5 = list5.iterator();
            while (it5.hasNext()) {
                dest.writeString(it5.next().name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeParcelable(this.autoClassificationConfig, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.digitalIdConfig, flags);
            dest.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num = this.holographicTorchEnabledDurationMs;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.designVersion.name());
            dest.writeString(this.flowWatermarkText);
            dest.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        @Nullable
        /* renamed from: x, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* renamed from: z, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GovernmentIdStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @Nullable String str2, @NotNull List<Id> enabledIdClasses, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull NextStep.GovernmentId.Localizations localizations, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int i10, long j10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, boolean z12, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, @Nullable String str3, @Nullable NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z13, @Nullable DigitalIdConfig digitalIdConfig, boolean z14, @Nullable Integer num, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull go.d designVersion, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable CustomPendingPage customPendingPage, @Nullable String str6) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str2;
            this.enabledIdClasses = enabledIdClasses;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.localizations = localizations;
            this.localizationOverrides = list;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.imageCaptureCount = i10;
            this.manualCaptureButtonDelayMs = j10;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.shouldSkipReviewScreen = z12;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.webRtcJwt = str3;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z13;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z14;
            this.holographicTorchEnabledDurationMs = num;
            this.inquirySessionConfig = inquirySessionConfig;
            this.designVersion = designVersion;
            this.flowWatermarkText = str4;
            this.silentNetworkAuthenticationCheckUrl = str5;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num2;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str6;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadFeatureFlagSession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<LoadFeatureFlagSession> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoadFeatureFlagSession> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadFeatureFlagSession(parcel.readString(), parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(LoadFeatureFlagSession.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession[] newArray(int i10) {
                return new LoadFeatureFlagSession[i10];
            }
        }

        public /* synthetic */ LoadFeatureFlagSession(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadFeatureFlagSession)) {
                return false;
            }
            LoadFeatureFlagSession loadFeatureFlagSession = (LoadFeatureFlagSession) other;
            return Intrinsics.c(this.inquiryId, loadFeatureFlagSession.inquiryId) && Intrinsics.c(this.sessionToken, loadFeatureFlagSession.sessionToken) && Intrinsics.c(this.trackingEventsUrl, loadFeatureFlagSession.trackingEventsUrl) && Intrinsics.c(this.inquirySessionConfig, loadFeatureFlagSession.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @NotNull
        public String toString() {
            return "LoadFeatureFlagSession(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadFeatureFlagSession(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÓ\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0019\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000203¢\u0006\u0004\b:\u0010;J\u001d\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u000203¢\u0006\u0004\b@\u0010AJ\u0090\u0003\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00192\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u000203HÖ\u0001¢\u0006\u0004\bF\u0010;J\u001a\u0010I\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010ER\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010ER\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bK\u0010ER\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bN\u0010ZR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010ER\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010L\u001a\u0004\bU\u0010ER\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bg\u0010L\u001a\u0004\bh\u0010ER\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bc\u0010b\u001a\u0004\bi\u0010dR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bj\u0010dR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0006¢\u0006\f\n\u0004\bO\u0010p\u001a\u0004\bs\u0010rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bq\u0010t\u001a\u0004\be\u0010uR\u0019\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bv\u0010ER\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bw\u0010p\u001a\u0004\bx\u0010rR\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\by\u0010p\u001a\u0004\bz\u0010rR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0004\b`\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010)\u001a\u00020\u00118\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010b\u001a\u0004\bg\u0010dR\u001a\u0010+\u001a\u00020*8\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010-\u001a\u00020,8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bo\u0010\u0088\u0001R\u001d\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bx\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bz\u0010L\u001a\u0004\by\u0010ER\u001a\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010L\u001a\u0004\b{\u0010ER\u001b\u00102\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010ER\u001d\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0091\u0001\u001a\u0005\bk\u0010\u0092\u0001R\u001d\u00107\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\r\n\u0004\bi\u0010L\u001a\u0005\b\u0093\u0001\u0010E¨\u0006\u0094\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lxo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfieType", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizations", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPosesBuffer", "", "poseTimeoutMs", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lwp/a;", "designVersion", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "fileUploadUrl", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lwp/a;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lwp/a;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "T", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "P", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "p", "E", "r", "Z", "u", "()Z", "s", "v", zl.t.f38095d, "A", "O", "S", "w", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "G", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "x", "Ljava/util/List;", "z", "()Ljava/util/List;", "U", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "V", "B", "I", "C", "J", "D", "Ljava/lang/Long;", "N", "()Ljava/lang/Long;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "K", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "F", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "L", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "H", "Lwp/a;", "()Lwp/a;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "R", "M", "Ljava/lang/Integer;", "Q", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieStepRunning extends InquiryState implements m0 {

        @NotNull
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<NextStep.Selfie.SelfiePose> orderedPoses;

        /* renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffer;

        /* renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* renamed from: E, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* renamed from: F, reason: from kotlin metadata and from toString */
        public final boolean audioEnabled;

        /* renamed from: G, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* renamed from: H, reason: from kotlin metadata and from toString */
        @NotNull
        public final wp.a designVersion;

        /* renamed from: I, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: J, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fileUploadUrl;

        /* renamed from: K, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* renamed from: L, reason: from kotlin metadata and from toString */
        @Nullable
        public final String silentNetworkAuthenticationCheckUrl;

        /* renamed from: M, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

        /* renamed from: N, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* renamed from: O, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.CaptureMethod selfieType;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.Localizations localizations;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Selfie.AssetConfig assetConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                boolean z12;
                String str;
                boolean z13;
                boolean z14;
                NextStep.Selfie.AssetConfig assetConfig;
                Class cls;
                ArrayList arrayList;
                String str2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod valueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                boolean z15 = false;
                boolean z16 = true;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z15 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z16 = z10;
                }
                String readString6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z12 = z11;
                    str = readString6;
                    z13 = z12;
                } else {
                    z12 = z11;
                    str = readString6;
                    z13 = z10;
                }
                if (parcel.readInt() != 0) {
                    z14 = z12;
                } else {
                    z14 = z12;
                    z12 = z10;
                }
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    arrayList4.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                    i10++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    arrayList5.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                    i11++;
                    readInt2 = readInt2;
                }
                NextStep.Selfie.AssetConfig assetConfig2 = (NextStep.Selfie.AssetConfig) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    assetConfig = assetConfig2;
                    cls = SelfieStepRunning.class;
                    str2 = readString;
                    arrayList = null;
                } else {
                    assetConfig = assetConfig2;
                    int readInt3 = parcel.readInt();
                    cls = SelfieStepRunning.class;
                    arrayList = new ArrayList(readInt3);
                    str2 = readString;
                    int i12 = 0;
                    while (i12 != readInt3) {
                        arrayList.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i12++;
                        readInt3 = readInt3;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = arrayList;
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    arrayList3 = arrayList;
                    int i13 = 0;
                    while (i13 != readInt4) {
                        arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
                        i13++;
                        readInt4 = readInt4;
                    }
                }
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                PendingPageTextPosition valueOf3 = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z14 = false;
                }
                return new SelfieStepRunning(str2, readString2, readString3, transitionStatus, selfieStepStyle, cancelDialog, valueOf, readString4, readString5, z15, z16, str, z13, z12, localizations, arrayList4, arrayList5, assetConfig, readString7, arrayList3, arrayList2, valueOf2, valueOf3, z14, (PoseConfigs) parcel.readParcelable(cls.getClassLoader()), wp.a.valueOf(parcel.readString()), (InquirySessionConfig) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (CustomPendingPage) parcel.readParcelable(cls.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning[] newArray(int i10) {
                return new SelfieStepRunning[i10];
            }
        }

        public /* synthetic */ SelfieStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str4, String str5, boolean z10, boolean z11, String str6, boolean z12, boolean z13, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str7, List list3, List list4, Long l10, PendingPageTextPosition pendingPageTextPosition, boolean z14, PoseConfigs poseConfigs, wp.a aVar, InquirySessionConfig inquirySessionConfig, String str8, String str9, String str10, Integer num, CustomPendingPage customPendingPage, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, selfieStepStyle, cancelDialog, captureMethod, str4, str5, z10, z11, str6, z12, z13, localizations, list, list2, assetConfig, str7, list3, list4, l10, pendingPageTextPosition, z14, poseConfigs, aVar, inquirySessionConfig, str8, (i10 & 268435456) != 0 ? null : str9, (i10 & 536870912) != 0 ? null : str10, (i10 & 1073741824) != 0 ? null : num, (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : customPendingPage, (i11 & 1) != 0 ? null : str11);
        }

        public static /* synthetic */ SelfieStepRunning r(SelfieStepRunning selfieStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str4, String str5, boolean z10, boolean z11, String str6, boolean z12, boolean z13, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str7, List list3, List list4, Long l10, PendingPageTextPosition pendingPageTextPosition, boolean z14, PoseConfigs poseConfigs, wp.a aVar, InquirySessionConfig inquirySessionConfig, String str8, String str9, String str10, Integer num, CustomPendingPage customPendingPage, String str11, int i10, int i11, Object obj) {
            String str12;
            CustomPendingPage customPendingPage2;
            List list5;
            NextStep.Selfie.AssetConfig assetConfig2;
            String str13;
            List list6;
            List list7;
            Long l11;
            PendingPageTextPosition pendingPageTextPosition2;
            boolean z15;
            PoseConfigs poseConfigs2;
            wp.a aVar2;
            InquirySessionConfig inquirySessionConfig2;
            String str14;
            String str15;
            String str16;
            Integer num2;
            NextStep.Selfie.Localizations localizations2;
            String str17;
            String str18;
            TransitionStatus transitionStatus2;
            StepStyles.SelfieStepStyle selfieStepStyle2;
            NextStep.CancelDialog cancelDialog2;
            NextStep.Selfie.CaptureMethod captureMethod2;
            String str19;
            String str20;
            boolean z16;
            boolean z17;
            String str21;
            boolean z18;
            boolean z19;
            List list8;
            String str22 = (i10 & 1) != 0 ? selfieStepRunning.inquiryId : str;
            String str23 = (i10 & 2) != 0 ? selfieStepRunning.sessionToken : str2;
            String str24 = (i10 & 4) != 0 ? selfieStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus3 = (i10 & 8) != 0 ? selfieStepRunning.transitionStatus : transitionStatus;
            StepStyles.SelfieStepStyle selfieStepStyle3 = (i10 & 16) != 0 ? selfieStepRunning.styles : selfieStepStyle;
            NextStep.CancelDialog cancelDialog3 = (i10 & 32) != 0 ? selfieStepRunning.cancelDialog : cancelDialog;
            NextStep.Selfie.CaptureMethod captureMethod3 = (i10 & 64) != 0 ? selfieStepRunning.selfieType : captureMethod;
            String str25 = (i10 & 128) != 0 ? selfieStepRunning.fromComponent : str4;
            String str26 = (i10 & 256) != 0 ? selfieStepRunning.fromStep : str5;
            boolean z20 = (i10 & 512) != 0 ? selfieStepRunning.backStepEnabled : z10;
            boolean z21 = (i10 & 1024) != 0 ? selfieStepRunning.cancelButtonEnabled : z11;
            String str27 = (i10 & 2048) != 0 ? selfieStepRunning.fieldKeySelfie : str6;
            boolean z22 = (i10 & 4096) != 0 ? selfieStepRunning.requireStrictSelfieCapture : z12;
            boolean z23 = (i10 & 8192) != 0 ? selfieStepRunning.skipPromptPage : z13;
            String str28 = str22;
            NextStep.Selfie.Localizations localizations3 = (i10 & 16384) != 0 ? selfieStepRunning.localizations : localizations;
            List list9 = (i10 & 32768) != 0 ? selfieStepRunning.enabledCaptureFileTypes : list;
            List list10 = (i10 & 65536) != 0 ? selfieStepRunning.videoCaptureMethods : list2;
            NextStep.Selfie.AssetConfig assetConfig3 = (i10 & 131072) != 0 ? selfieStepRunning.assetConfig : assetConfig;
            String str29 = (i10 & 262144) != 0 ? selfieStepRunning.webRtcJwt : str7;
            List list11 = (i10 & 524288) != 0 ? selfieStepRunning.orderedPoses : list3;
            List list12 = (i10 & 1048576) != 0 ? selfieStepRunning.orderedPosesBuffer : list4;
            Long l12 = (i10 & 2097152) != 0 ? selfieStepRunning.poseTimeoutMs : l10;
            PendingPageTextPosition pendingPageTextPosition3 = (i10 & 4194304) != 0 ? selfieStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z24 = (i10 & 8388608) != 0 ? selfieStepRunning.audioEnabled : z14;
            PoseConfigs poseConfigs3 = (i10 & 16777216) != 0 ? selfieStepRunning.poseConfigs : poseConfigs;
            wp.a aVar3 = (i10 & 33554432) != 0 ? selfieStepRunning.designVersion : aVar;
            InquirySessionConfig inquirySessionConfig3 = (i10 & 67108864) != 0 ? selfieStepRunning.inquirySessionConfig : inquirySessionConfig;
            String str30 = (i10 & 134217728) != 0 ? selfieStepRunning.fileUploadUrl : str8;
            String str31 = (i10 & 268435456) != 0 ? selfieStepRunning.flowWatermarkText : str9;
            String str32 = (i10 & 536870912) != 0 ? selfieStepRunning.silentNetworkAuthenticationCheckUrl : str10;
            Integer num3 = (i10 & 1073741824) != 0 ? selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds : num;
            CustomPendingPage customPendingPage3 = (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? selfieStepRunning.customPendingPage : customPendingPage;
            if ((i11 & 1) != 0) {
                customPendingPage2 = customPendingPage3;
                str12 = selfieStepRunning.redirectUri;
                assetConfig2 = assetConfig3;
                str13 = str29;
                list6 = list11;
                list7 = list12;
                l11 = l12;
                pendingPageTextPosition2 = pendingPageTextPosition3;
                z15 = z24;
                poseConfigs2 = poseConfigs3;
                aVar2 = aVar3;
                inquirySessionConfig2 = inquirySessionConfig3;
                str14 = str30;
                str15 = str31;
                str16 = str32;
                num2 = num3;
                localizations2 = localizations3;
                str18 = str24;
                transitionStatus2 = transitionStatus3;
                selfieStepStyle2 = selfieStepStyle3;
                cancelDialog2 = cancelDialog3;
                captureMethod2 = captureMethod3;
                str19 = str25;
                str20 = str26;
                z16 = z20;
                z17 = z21;
                str21 = str27;
                z18 = z22;
                z19 = z23;
                list8 = list9;
                list5 = list10;
                str17 = str23;
            } else {
                str12 = str11;
                customPendingPage2 = customPendingPage3;
                list5 = list10;
                assetConfig2 = assetConfig3;
                str13 = str29;
                list6 = list11;
                list7 = list12;
                l11 = l12;
                pendingPageTextPosition2 = pendingPageTextPosition3;
                z15 = z24;
                poseConfigs2 = poseConfigs3;
                aVar2 = aVar3;
                inquirySessionConfig2 = inquirySessionConfig3;
                str14 = str30;
                str15 = str31;
                str16 = str32;
                num2 = num3;
                localizations2 = localizations3;
                str17 = str23;
                str18 = str24;
                transitionStatus2 = transitionStatus3;
                selfieStepStyle2 = selfieStepStyle3;
                cancelDialog2 = cancelDialog3;
                captureMethod2 = captureMethod3;
                str19 = str25;
                str20 = str26;
                z16 = z20;
                z17 = z21;
                str21 = str27;
                z18 = z22;
                z19 = z23;
                list8 = list9;
            }
            return selfieStepRunning.q(str28, str17, str18, transitionStatus2, selfieStepStyle2, cancelDialog2, captureMethod2, str19, str20, z16, z17, str21, z18, z19, localizations2, list8, list5, assetConfig2, str13, list6, list7, l11, pendingPageTextPosition2, z15, poseConfigs2, aVar2, inquirySessionConfig2, str14, str15, str16, num2, customPendingPage2, str12);
        }

        @NotNull
        /* renamed from: A, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @Nullable
        /* renamed from: C, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        /* renamed from: D, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* renamed from: E, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: G, reason: from getter */
        public final NextStep.Selfie.Localizations getLocalizations() {
            return this.localizations;
        }

        @Nullable
        public final List<NextStep.Selfie.SelfiePose> I() {
            return this.orderedPoses;
        }

        @Nullable
        public final List<PoseInfo> J() {
            return this.orderedPosesBuffer;
        }

        @NotNull
        /* renamed from: K, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* renamed from: L, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Nullable
        /* renamed from: N, reason: from getter */
        public final Long getPoseTimeoutMs() {
            return this.poseTimeoutMs;
        }

        /* renamed from: O, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        /* renamed from: P, reason: from getter */
        public final NextStep.Selfie.CaptureMethod getSelfieType() {
            return this.selfieType;
        }

        @Nullable
        /* renamed from: Q, reason: from getter */
        public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
            return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
        }

        @Nullable
        /* renamed from: R, reason: from getter */
        public final String getSilentNetworkAuthenticationCheckUrl() {
            return this.silentNetworkAuthenticationCheckUrl;
        }

        /* renamed from: S, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        /* renamed from: T, reason: from getter */
        public StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final List<NextStep.Selfie.VideoCaptureMethod> U() {
            return this.videoCaptureMethods;
        }

        @Nullable
        /* renamed from: V, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) other;
            return Intrinsics.c(this.inquiryId, selfieStepRunning.inquiryId) && Intrinsics.c(this.sessionToken, selfieStepRunning.sessionToken) && Intrinsics.c(this.trackingEventsUrl, selfieStepRunning.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, selfieStepRunning.transitionStatus) && Intrinsics.c(this.styles, selfieStepRunning.styles) && Intrinsics.c(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && Intrinsics.c(this.fromComponent, selfieStepRunning.fromComponent) && Intrinsics.c(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && Intrinsics.c(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && Intrinsics.c(this.localizations, selfieStepRunning.localizations) && Intrinsics.c(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && Intrinsics.c(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && Intrinsics.c(this.assetConfig, selfieStepRunning.assetConfig) && Intrinsics.c(this.webRtcJwt, selfieStepRunning.webRtcJwt) && Intrinsics.c(this.orderedPoses, selfieStepRunning.orderedPoses) && Intrinsics.c(this.orderedPosesBuffer, selfieStepRunning.orderedPosesBuffer) && Intrinsics.c(this.poseTimeoutMs, selfieStepRunning.poseTimeoutMs) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && Intrinsics.c(this.poseConfigs, selfieStepRunning.poseConfigs) && this.designVersion == selfieStepRunning.designVersion && Intrinsics.c(this.inquirySessionConfig, selfieStepRunning.inquirySessionConfig) && Intrinsics.c(this.fileUploadUrl, selfieStepRunning.fileUploadUrl) && Intrinsics.c(this.flowWatermarkText, selfieStepRunning.flowWatermarkText) && Intrinsics.c(this.silentNetworkAuthenticationCheckUrl, selfieStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.c(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds) && Intrinsics.c(this.customPendingPage, selfieStepRunning.customPendingPage) && Intrinsics.c(this.redirectUri, selfieStepRunning.redirectUri);
        }

        @Override // xo.m0
        @Nullable
        /* renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int hashCode4 = (hashCode3 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode5 = (((((((((((((((((((((((hashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.selfieType.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.localizations.hashCode()) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int hashCode6 = (hashCode5 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str2 = this.webRtcJwt;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<NextStep.Selfie.SelfiePose> list = this.orderedPoses;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            List<PoseInfo> list2 = this.orderedPosesBuffer;
            int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Long l10 = this.poseTimeoutMs;
            int hashCode10 = (((((((((((hashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str3 = this.fileUploadUrl;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.flowWatermarkText;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.silentNetworkAuthenticationCheckUrl;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int hashCode15 = (hashCode14 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str6 = this.redirectUri;
            return hashCode15 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final SelfieStepRunning q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.SelfieStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod selfieType, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull String fieldKeySelfie, boolean requireStrictSelfieCapture, boolean skipPromptPage, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, @Nullable NextStep.Selfie.AssetConfig assetConfig, @Nullable String webRtcJwt, @Nullable List<? extends NextStep.Selfie.SelfiePose> orderedPoses, @Nullable List<PoseInfo> orderedPosesBuffer, @Nullable Long poseTimeoutMs, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, @NotNull PoseConfigs poseConfigs, @NotNull wp.a designVersion, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String fileUploadUrl, @Nullable String flowWatermarkText, @Nullable String silentNetworkAuthenticationCheckUrl, @Nullable Integer silentNetworkAuthenticationBackgroundTimeoutSeconds, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new SelfieStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, selfieType, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, webRtcJwt, orderedPoses, orderedPosesBuffer, poseTimeoutMs, pendingPageTextVerticalPosition, audioEnabled, poseConfigs, designVersion, inquirySessionConfig, fileUploadUrl, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, customPendingPage, redirectUri);
        }

        @Nullable
        /* renamed from: s, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        @NotNull
        public String toString() {
            return "SelfieStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", selfieType=" + this.selfieType + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", localizations=" + this.localizations + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", assetConfig=" + this.assetConfig + ", webRtcJwt=" + this.webRtcJwt + ", orderedPoses=" + this.orderedPoses + ", orderedPosesBuffer=" + this.orderedPosesBuffer + ", poseTimeoutMs=" + this.poseTimeoutMs + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ", inquirySessionConfig=" + this.inquirySessionConfig + ", fileUploadUrl=" + this.fileUploadUrl + ", flowWatermarkText=" + this.flowWatermarkText + ", silentNetworkAuthenticationCheckUrl=" + this.silentNetworkAuthenticationCheckUrl + ", silentNetworkAuthenticationBackgroundTimeoutSeconds=" + this.silentNetworkAuthenticationBackgroundTimeoutSeconds + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        /* renamed from: u, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Nullable
        /* renamed from: w, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.selfieType.name());
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
            dest.writeInt(list.size());
            Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<NextStep.Selfie.VideoCaptureMethod> list2 = this.videoCaptureMethods;
            dest.writeInt(list2.size());
            Iterator<NextStep.Selfie.VideoCaptureMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.webRtcJwt);
            List<NextStep.Selfie.SelfiePose> list3 = this.orderedPoses;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list3.size());
                Iterator<NextStep.Selfie.SelfiePose> it3 = list3.iterator();
                while (it3.hasNext()) {
                    dest.writeString(it3.next().name());
                }
            }
            List<PoseInfo> list4 = this.orderedPosesBuffer;
            if (list4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list4.size());
                Iterator<PoseInfo> it4 = list4.iterator();
                while (it4.hasNext()) {
                    dest.writeParcelable(it4.next(), flags);
                }
            }
            Long l10 = this.poseTimeoutMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.poseConfigs, flags);
            dest.writeString(this.designVersion.name());
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.fileUploadUrl);
            dest.writeString(this.flowWatermarkText);
            dest.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* renamed from: x, reason: from getter */
        public final wp.a getDesignVersion() {
            return this.designVersion;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        public final List<NextStep.Selfie.CaptureFileType> z() {
            return this.enabledCaptureFileTypes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelfieStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod selfieType, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, @Nullable NextStep.Selfie.AssetConfig assetConfig, @Nullable String str2, @Nullable List<? extends NextStep.Selfie.SelfiePose> list, @Nullable List<PoseInfo> list2, @Nullable Long l10, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z14, @NotNull PoseConfigs poseConfigs, @NotNull wp.a designVersion, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable CustomPendingPage customPendingPage, @Nullable String str6) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = selfieType;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z12;
            this.skipPromptPage = z13;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str2;
            this.orderedPoses = list;
            this.orderedPosesBuffer = list2;
            this.poseTimeoutMs = l10;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z14;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.inquirySessionConfig = inquirySessionConfig;
            this.fileUploadUrl = str3;
            this.flowWatermarkText = str4;
            this.silentNetworkAuthenticationCheckUrl = str5;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str6;
        }
    }

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b.\u0010/J\u008e\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u0010)J\u001a\u00107\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u00103R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b9\u00103R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010G\u001a\u0004\b<\u0010HR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u00103R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\bO\u00103R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010VR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\bW\u0010VR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010VR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bZ\u0010:\u001a\u0004\b[\u00103R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bY\u0010\\\u001a\u0004\bZ\u0010]R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bX\u00103R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010Q\u001a\u0004\b^\u0010SR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bK\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\be\u0010U\u001a\u0004\bf\u0010VR\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bg\u00103R\u0014\u0010h\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00103¨\u0006i"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lxo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "inquiryStatus", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "webviewUrl", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "isRestoringState", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "z", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "p", "x", "C", "r", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "s", "Z", "()Z", zl.t.f38095d, "u", "w", "v", "getWebviewUrl", "Ljava/util/Map;", "()Ljava/util/Map;", "A", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "D", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "B", "E", "f", "fromStep", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UiStepRunning extends InquiryState implements m0 {

        @NotNull
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        public final boolean isRestoringState;

        /* renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Ui.Localizations localizations;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentConfig> components;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean finalStep;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String webviewUrl;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Map<String, InquiryField> fields;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String clientSideKey;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentErrorInfo> serverComponentErrors;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z10;
                boolean z11;
                boolean z12;
                LinkedHashMap linkedHashMap;
                ArrayList arrayList2;
                String str;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.Ui.Localizations localizations = (NextStep.Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                boolean z13 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList3.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                    arrayList = arrayList3;
                }
                boolean z14 = true;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z13 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z14 = z10;
                }
                if (parcel.readInt() != 0) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    z11 = z10;
                }
                String readString6 = parcel.readString();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i11++;
                    readInt2 = readInt2;
                }
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = null;
                    str = readString7;
                } else {
                    int readInt3 = parcel.readInt();
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = new ArrayList(readInt3);
                    str = readString7;
                    for (int i12 = 0; i12 != readInt3; i12++) {
                        arrayList2.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                }
                InternalErrorInfo internalErrorInfo = (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                return new UiStepRunning(readString, readString2, readString3, transitionStatus, uiStepStyle, cancelDialog, localizations, readString4, readString5, arrayList, z13, z14, z11, readString6, linkedHashMap, str, arrayList2, internalErrorInfo, inquirySessionConfig, z12, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning[] newArray(int i10) {
                return new UiStepRunning[i10];
            }
        }

        public /* synthetic */ UiStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str4, String str5, List list, boolean z10, boolean z11, boolean z12, String str6, Map map, String str7, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z13, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, uiStepStyle, cancelDialog, localizations, str4, str5, list, z10, z11, z12, str6, map, str7, list2, (i10 & 131072) != 0 ? null : internalErrorInfo, (i10 & 262144) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, z13, str8);
        }

        public static /* synthetic */ UiStepRunning r(UiStepRunning uiStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str4, String str5, List list, boolean z10, boolean z11, boolean z12, String str6, Map map, String str7, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z13, String str8, int i10, Object obj) {
            String str9;
            boolean z14;
            String str10 = (i10 & 1) != 0 ? uiStepRunning.inquiryId : str;
            String str11 = (i10 & 2) != 0 ? uiStepRunning.sessionToken : str2;
            String str12 = (i10 & 4) != 0 ? uiStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i10 & 8) != 0 ? uiStepRunning.transitionStatus : transitionStatus;
            StepStyles.UiStepStyle uiStepStyle2 = (i10 & 16) != 0 ? uiStepRunning.styles : uiStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i10 & 32) != 0 ? uiStepRunning.cancelDialog : cancelDialog;
            NextStep.Ui.Localizations localizations2 = (i10 & 64) != 0 ? uiStepRunning.localizations : localizations;
            String str13 = (i10 & 128) != 0 ? uiStepRunning.inquiryStatus : str4;
            String str14 = (i10 & 256) != 0 ? uiStepRunning.stepName : str5;
            List list3 = (i10 & 512) != 0 ? uiStepRunning.components : list;
            boolean z15 = (i10 & 1024) != 0 ? uiStepRunning.backStepEnabled : z10;
            boolean z16 = (i10 & 2048) != 0 ? uiStepRunning.cancelButtonEnabled : z11;
            boolean z17 = (i10 & 4096) != 0 ? uiStepRunning.finalStep : z12;
            String str15 = (i10 & 8192) != 0 ? uiStepRunning.webviewUrl : str6;
            String str16 = str10;
            Map map2 = (i10 & 16384) != 0 ? uiStepRunning.fields : map;
            String str17 = (i10 & 32768) != 0 ? uiStepRunning.clientSideKey : str7;
            List list4 = (i10 & 65536) != 0 ? uiStepRunning.serverComponentErrors : list2;
            InternalErrorInfo internalErrorInfo2 = (i10 & 131072) != 0 ? uiStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig2 = (i10 & 262144) != 0 ? uiStepRunning.inquirySessionConfig : inquirySessionConfig;
            boolean z18 = (i10 & 524288) != 0 ? uiStepRunning.isRestoringState : z13;
            if ((i10 & 1048576) != 0) {
                z14 = z18;
                str9 = uiStepRunning.redirectUri;
            } else {
                str9 = str8;
                z14 = z18;
            }
            return uiStepRunning.q(str16, str11, str12, transitionStatus2, uiStepStyle2, cancelDialog2, localizations2, str13, str14, list3, z15, z16, z17, str15, map2, str17, list4, internalErrorInfo2, inquirySessionConfig2, z14, str9);
        }

        @Nullable
        public final List<UiComponentErrorInfo> A() {
            return this.serverComponentErrors;
        }

        @NotNull
        /* renamed from: C, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @Nullable
        /* renamed from: D, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* renamed from: E, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) other;
            return Intrinsics.c(this.inquiryId, uiStepRunning.inquiryId) && Intrinsics.c(this.sessionToken, uiStepRunning.sessionToken) && Intrinsics.c(this.trackingEventsUrl, uiStepRunning.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, uiStepRunning.transitionStatus) && Intrinsics.c(this.styles, uiStepRunning.styles) && Intrinsics.c(this.cancelDialog, uiStepRunning.cancelDialog) && Intrinsics.c(this.localizations, uiStepRunning.localizations) && Intrinsics.c(this.inquiryStatus, uiStepRunning.inquiryStatus) && Intrinsics.c(this.stepName, uiStepRunning.stepName) && Intrinsics.c(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && Intrinsics.c(this.webviewUrl, uiStepRunning.webviewUrl) && Intrinsics.c(this.fields, uiStepRunning.fields) && Intrinsics.c(this.clientSideKey, uiStepRunning.clientSideKey) && Intrinsics.c(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && Intrinsics.c(this.transitionError, uiStepRunning.transitionError) && Intrinsics.c(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig) && this.isRestoringState == uiStepRunning.isRestoringState && Intrinsics.c(this.redirectUri, uiStepRunning.redirectUri);
        }

        @Override // xo.m0
        @Nullable
        /* renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int hashCode4 = (hashCode3 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode5 = (hashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.Ui.Localizations localizations = this.localizations;
            int hashCode6 = (((((hashCode5 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int hashCode7 = (((((((hashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31;
            String str2 = this.webviewUrl;
            int hashCode8 = (((((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fields.hashCode()) * 31) + this.clientSideKey.hashCode()) * 31;
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int hashCode10 = (((((hashCode9 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31) + Boolean.hashCode(this.isRestoringState)) * 31;
            String str3 = this.redirectUri;
            return hashCode10 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: m */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final UiStepRunning q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.UiStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @Nullable NextStep.Ui.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> components, boolean backStepEnabled, boolean cancelButtonEnabled, boolean finalStep, @Nullable String webviewUrl, @NotNull Map<String, ? extends InquiryField> fields, @NotNull String clientSideKey, @Nullable List<UiComponentErrorInfo> serverComponentErrors, @Nullable InternalErrorInfo transitionError, @NotNull InquirySessionConfig inquirySessionConfig, boolean isRestoringState, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new UiStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, localizations, inquiryStatus, stepName, components, backStepEnabled, cancelButtonEnabled, finalStep, webviewUrl, fields, clientSideKey, serverComponentErrors, transitionError, inquirySessionConfig, isRestoringState, redirectUri);
        }

        /* renamed from: s, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public String toString() {
            return "UiStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", components=" + this.components + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", webviewUrl=" + this.webviewUrl + ", fields=" + this.fields + ", clientSideKey=" + this.clientSideKey + ", serverComponentErrors=" + this.serverComponentErrors + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", isRestoringState=" + this.isRestoringState + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final String getClientSideKey() {
            return this.clientSideKey;
        }

        @NotNull
        public final Map<String, InquiryField> v() {
            return this.fields;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.components;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            dest.writeString(this.webviewUrl);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.clientSideKey);
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentErrorInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* renamed from: x, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* renamed from: z, reason: from getter */
        public final NextStep.Ui.Localizations getLocalizations() {
            return this.localizations;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        public StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UiStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @Nullable NextStep.Ui.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> list, boolean z10, boolean z11, boolean z12, @Nullable String str2, @NotNull Map<String, ? extends InquiryField> fields, @NotNull String clientSideKey, @Nullable List<UiComponentErrorInfo> list2, @Nullable InternalErrorInfo internalErrorInfo, @NotNull InquirySessionConfig inquirySessionConfig, boolean z13, @Nullable String str3) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.components = list;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.finalStep = z12;
            this.webviewUrl = str2;
            this.fields = fields;
            this.clientSideKey = clientSideKey;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.isRestoringState = z13;
            this.redirectUri = str3;
        }
    }

    public /* synthetic */ InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, transitionStatus, stepStyle, cancelDialog, str4);
    }

    @NotNull
    /* renamed from: a */
    public abstract InquirySessionConfig getInquirySessionConfig();

    @Nullable
    /* renamed from: g, reason: from getter */
    public String getInquiryId() {
        return this.inquiryId;
    }

    @Nullable
    public StepStyle getStyles() {
        return this.styles;
    }

    @Nullable
    /* renamed from: i, reason: from getter */
    public String getTrackingEventsUrl() {
        return this.trackingEventsUrl;
    }

    @Nullable
    /* renamed from: j, reason: from getter */
    public NextStep.CancelDialog getCancelDialog() {
        return this.cancelDialog;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    @Nullable
    /* renamed from: m, reason: from getter */
    public String getFromStep() {
        return this.fromStep;
    }

    @Nullable
    /* renamed from: n, reason: from getter */
    public TransitionStatus getTransitionStatus() {
        return this.transitionStatus;
    }

    public final void o(boolean z10) {
        this.didGoBack = z10;
    }

    @NotNull
    public final InquiryState p(@Nullable TransitionStatus transitionStatus) {
        if (this instanceof Complete) {
            return Complete.r((Complete) this, null, null, null, transitionStatus, null, null, null, null, 247, null);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession) || (this instanceof ExchangeOneTimeCode) || (this instanceof RedeemRelaySession)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.r((DocumentStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, null, null, null, null, 16375, null);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.r((GovernmentIdStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.r((SelfieStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null);
        }
        if (this instanceof ShowLoadingSpinner) {
            return ShowLoadingSpinner.r((ShowLoadingSpinner) this, null, null, transitionStatus, null, null, false, null, 123, null);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.r((UiStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null);
        }
        if (this instanceof IntegrationStepRunning) {
            return IntegrationStepRunning.r((IntegrationStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null);
        }
        if (this instanceof LoadFeatureFlagSession) {
            return this;
        }
        throw new gt.l();
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
    public boolean q0(@NotNull WorkflowState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getClass() == other.getClass() && Intrinsics.c(getFromStep(), ((InquiryState) other).getFromStep());
    }

    @Nullable
    /* renamed from: y, reason: from getter */
    public String getSessionToken() {
        return this.sessionToken;
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b<\u0010\u001d¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "templateId", "templateVersion", "accountId", "environmentId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "u", "j", "v", "k", "q", "l", "r", "m", zl.t.f38095d, "n", "Ljava/util/Map;", "s", "()Ljava/util/Map;", "o", "w", "p", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getRedirectUri", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateInquiryFromTemplate extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String templateId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String templateVersion;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String accountId;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String environmentId;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String referenceId;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Map<String, InquiryField> fields;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String themeSetId;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StaticInquiryTemplate staticInquiryTemplate;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquiryFromTemplate> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
                    }
                }
                return new CreateInquiryFromTemplate(readString, readString2, readString3, readString4, readString5, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate[] newArray(int i10) {
                return new CreateInquiryFromTemplate[i10];
            }
        }

        public /* synthetic */ CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, InquirySessionConfig inquirySessionConfig, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, (i10 & 256) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, str7);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) other;
            return Intrinsics.c(this.templateId, createInquiryFromTemplate.templateId) && Intrinsics.c(this.templateVersion, createInquiryFromTemplate.templateVersion) && Intrinsics.c(this.accountId, createInquiryFromTemplate.accountId) && Intrinsics.c(this.environmentId, createInquiryFromTemplate.environmentId) && Intrinsics.c(this.referenceId, createInquiryFromTemplate.referenceId) && Intrinsics.c(this.fields, createInquiryFromTemplate.fields) && Intrinsics.c(this.themeSetId, createInquiryFromTemplate.themeSetId) && Intrinsics.c(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate) && Intrinsics.c(this.inquirySessionConfig, createInquiryFromTemplate.inquirySessionConfig) && Intrinsics.c(this.redirectUri, createInquiryFromTemplate.redirectUri);
        }

        public int hashCode() {
            String str = this.templateId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            int hashCode8 = (((hashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str7 = this.redirectUri;
            return hashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        @Nullable
        /* renamed from: q, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* renamed from: r, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @Nullable
        public final Map<String, InquiryField> s() {
            return this.fields;
        }

        @Nullable
        /* renamed from: t, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @NotNull
        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", environmentId=" + this.environmentId + ", referenceId=" + this.referenceId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @Nullable
        /* renamed from: u, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @Nullable
        /* renamed from: v, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        @Nullable
        /* renamed from: w, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.templateId);
            dest.writeString(this.templateVersion);
            dest.writeString(this.accountId);
            dest.writeString(this.environmentId);
            dest.writeString(this.referenceId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeString(this.themeSetId);
            dest.writeParcelable(this.staticInquiryTemplate, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CreateInquiryFromTemplate(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends InquiryField> map, @Nullable String str6, @Nullable StaticInquiryTemplate staticInquiryTemplate, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str7) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str7;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateInquirySession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InquirySessionDataWrapper inquirySessionDataWrapper;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquirySession> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateInquirySession(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(CreateInquirySession.class.getClassLoader()), (InquirySessionDataWrapper) parcel.readParcelable(CreateInquirySession.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession[] newArray(int i10) {
                return new CreateInquirySession[i10];
            }
        }

        public /* synthetic */ CreateInquirySession(String str, InquirySessionConfig inquirySessionConfig, InquirySessionDataWrapper inquirySessionDataWrapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, (i10 & 4) != 0 ? null : inquirySessionDataWrapper);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquirySession)) {
                return false;
            }
            CreateInquirySession createInquirySession = (CreateInquirySession) other;
            return Intrinsics.c(this.inquiryId, createInquirySession.inquiryId) && Intrinsics.c(this.inquirySessionConfig, createInquirySession.inquirySessionConfig) && Intrinsics.c(this.inquirySessionDataWrapper, createInquirySession.inquirySessionDataWrapper);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.inquirySessionConfig.hashCode()) * 31;
            InquirySessionDataWrapper inquirySessionDataWrapper = this.inquirySessionDataWrapper;
            return hashCode + (inquirySessionDataWrapper == null ? 0 : inquirySessionDataWrapper.hashCode());
        }

        @Nullable
        /* renamed from: q, reason: from getter */
        public final InquirySessionDataWrapper getInquirySessionDataWrapper() {
            return this.inquirySessionDataWrapper;
        }

        @NotNull
        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ", inquirySessionConfig=" + this.inquirySessionConfig + ", inquirySessionDataWrapper=" + this.inquirySessionDataWrapper + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.inquirySessionDataWrapper, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateInquirySession(@NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.inquirySessionConfig = inquirySessionConfig;
            this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeOneTimeCode extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ExchangeOneTimeCode> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String oneTimeLinkCode;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExchangeOneTimeCode> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeOneTimeCode(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(ExchangeOneTimeCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode[] newArray(int i10) {
                return new ExchangeOneTimeCode[i10];
            }
        }

        public /* synthetic */ ExchangeOneTimeCode(String str, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExchangeOneTimeCode)) {
                return false;
            }
            ExchangeOneTimeCode exchangeOneTimeCode = (ExchangeOneTimeCode) other;
            return Intrinsics.c(this.oneTimeLinkCode, exchangeOneTimeCode.oneTimeLinkCode) && Intrinsics.c(this.inquirySessionConfig, exchangeOneTimeCode.inquirySessionConfig);
        }

        public int hashCode() {
            return (this.oneTimeLinkCode.hashCode() * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        @NotNull
        public String toString() {
            return "ExchangeOneTimeCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.oneTimeLinkCode);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExchangeOneTimeCode(@NotNull String oneTimeLinkCode, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.oneTimeLinkCode = oneTimeLinkCode;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b*\u0010+Jè\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010/R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010/R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b5\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\b8\u0010DR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010/R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u0010/R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\bI\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u0010/R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bT\u0010/R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bN\u0010WR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bL\u0010V\u001a\u0004\bR\u0010WR\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bX\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b9\u0010Y\u001a\u0004\bU\u0010ZR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bT\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\bb\u0010/R\u0014\u0010c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010/¨\u0006d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lxo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "localizations", "inquiryStatus", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "integrationPage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "D", "p", "u", "x", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "w", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", zl.t.f38095d, "getInquiryStatus", "z", "v", "Z", "()Z", "getClientSideKey", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "C", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "B", "f", "fromStep", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IntegrationStepRunning extends InquiryState implements m0 {

        @NotNull
        public static final Parcelable.Creator<IntegrationStepRunning> CREATOR = new a();

        /* renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Integration.Localizations localizations;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String clientSideKey;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final IntegrationPage integrationPage;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IntegrationStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationStepRunning(parcel.readString(), parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), NextStep.Integration.IntegrationStepBrowserType.valueOf(parcel.readString()), (NextStep.Integration.Localizations) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (IntegrationPage) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning[] newArray(int i10) {
                return new IntegrationStepRunning[i10];
            }
        }

        public /* synthetic */ IntegrationStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str4, String str5, String str6, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, NextStep.Integration.Localizations localizations, String str7, String str8, boolean z10, boolean z11, String str9, IntegrationPage integrationPage, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, integrationStepStyle, cancelDialog, str4, str5, str6, integrationStepBrowserType, localizations, str7, str8, z10, z11, str9, integrationPage, (i10 & 131072) != 0 ? null : internalErrorInfo, (i10 & 262144) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, (i10 & 524288) != 0 ? null : str10);
        }

        public static /* synthetic */ IntegrationStepRunning r(IntegrationStepRunning integrationStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str4, String str5, String str6, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, NextStep.Integration.Localizations localizations, String str7, String str8, boolean z10, boolean z11, String str9, IntegrationPage integrationPage, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, String str10, int i10, Object obj) {
            String str11;
            InquirySessionConfig inquirySessionConfig2;
            String str12 = (i10 & 1) != 0 ? integrationStepRunning.inquiryId : str;
            String str13 = (i10 & 2) != 0 ? integrationStepRunning.sessionToken : str2;
            String str14 = (i10 & 4) != 0 ? integrationStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i10 & 8) != 0 ? integrationStepRunning.transitionStatus : transitionStatus;
            StepStyles.IntegrationStepStyle integrationStepStyle2 = (i10 & 16) != 0 ? integrationStepRunning.styles : integrationStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i10 & 32) != 0 ? integrationStepRunning.cancelDialog : cancelDialog;
            String str15 = (i10 & 64) != 0 ? integrationStepRunning.type : str4;
            String str16 = (i10 & 128) != 0 ? integrationStepRunning.flowUrl : str5;
            String str17 = (i10 & 256) != 0 ? integrationStepRunning.redirectPath : str6;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType2 = (i10 & 512) != 0 ? integrationStepRunning.integrationStepBrowserType : integrationStepBrowserType;
            NextStep.Integration.Localizations localizations2 = (i10 & 1024) != 0 ? integrationStepRunning.localizations : localizations;
            String str18 = (i10 & 2048) != 0 ? integrationStepRunning.inquiryStatus : str7;
            String str19 = (i10 & 4096) != 0 ? integrationStepRunning.stepName : str8;
            boolean z12 = (i10 & 8192) != 0 ? integrationStepRunning.backStepEnabled : z10;
            String str20 = str12;
            boolean z13 = (i10 & 16384) != 0 ? integrationStepRunning.cancelButtonEnabled : z11;
            String str21 = (i10 & 32768) != 0 ? integrationStepRunning.clientSideKey : str9;
            IntegrationPage integrationPage2 = (i10 & 65536) != 0 ? integrationStepRunning.integrationPage : integrationPage;
            InternalErrorInfo internalErrorInfo2 = (i10 & 131072) != 0 ? integrationStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig3 = (i10 & 262144) != 0 ? integrationStepRunning.inquirySessionConfig : inquirySessionConfig;
            if ((i10 & 524288) != 0) {
                inquirySessionConfig2 = inquirySessionConfig3;
                str11 = integrationStepRunning.redirectUri;
            } else {
                str11 = str10;
                inquirySessionConfig2 = inquirySessionConfig3;
            }
            return integrationStepRunning.q(str20, str13, str14, transitionStatus2, integrationStepStyle2, cancelDialog2, str15, str16, str17, integrationStepBrowserType2, localizations2, str18, str19, z12, z13, str21, integrationPage2, internalErrorInfo2, inquirySessionConfig2, str11);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        /* renamed from: A, reason: from getter */
        public StepStyles.IntegrationStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* renamed from: C, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        @NotNull
        /* renamed from: D, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationStepRunning)) {
                return false;
            }
            IntegrationStepRunning integrationStepRunning = (IntegrationStepRunning) other;
            return Intrinsics.c(this.inquiryId, integrationStepRunning.inquiryId) && Intrinsics.c(this.sessionToken, integrationStepRunning.sessionToken) && Intrinsics.c(this.trackingEventsUrl, integrationStepRunning.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, integrationStepRunning.transitionStatus) && Intrinsics.c(this.styles, integrationStepRunning.styles) && Intrinsics.c(this.cancelDialog, integrationStepRunning.cancelDialog) && Intrinsics.c(this.type, integrationStepRunning.type) && Intrinsics.c(this.flowUrl, integrationStepRunning.flowUrl) && Intrinsics.c(this.redirectPath, integrationStepRunning.redirectPath) && this.integrationStepBrowserType == integrationStepRunning.integrationStepBrowserType && Intrinsics.c(this.localizations, integrationStepRunning.localizations) && Intrinsics.c(this.inquiryStatus, integrationStepRunning.inquiryStatus) && Intrinsics.c(this.stepName, integrationStepRunning.stepName) && this.backStepEnabled == integrationStepRunning.backStepEnabled && this.cancelButtonEnabled == integrationStepRunning.cancelButtonEnabled && Intrinsics.c(this.clientSideKey, integrationStepRunning.clientSideKey) && Intrinsics.c(this.integrationPage, integrationStepRunning.integrationPage) && Intrinsics.c(this.transitionError, integrationStepRunning.transitionError) && Intrinsics.c(this.inquirySessionConfig, integrationStepRunning.inquirySessionConfig) && Intrinsics.c(this.redirectUri, integrationStepRunning.redirectUri);
        }

        @Override // xo.m0
        @Nullable
        /* renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int hashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int hashCode4 = (hashCode3 + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode5 = (((((((((hashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + this.redirectPath.hashCode()) * 31) + this.integrationStepBrowserType.hashCode()) * 31;
            NextStep.Integration.Localizations localizations = this.localizations;
            int hashCode6 = (((((((((((hashCode5 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.clientSideKey.hashCode()) * 31;
            IntegrationPage integrationPage = this.integrationPage;
            int hashCode7 = (hashCode6 + (integrationPage == null ? 0 : integrationPage.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int hashCode8 = (((hashCode7 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str2 = this.redirectUri;
            return hashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final IntegrationStepRunning q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.IntegrationStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, @Nullable NextStep.Integration.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull String clientSideKey, @Nullable IntegrationPage integrationPage, @Nullable InternalErrorInfo transitionError, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new IntegrationStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, type, flowUrl, redirectPath, integrationStepBrowserType, localizations, inquiryStatus, stepName, backStepEnabled, cancelButtonEnabled, clientSideKey, integrationPage, transitionError, inquirySessionConfig, redirectUri);
        }

        /* renamed from: s, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public String toString() {
            return "IntegrationStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", redirectPath=" + this.redirectPath + ", integrationStepBrowserType=" + this.integrationStepBrowserType + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", clientSideKey=" + this.clientSideKey + ", integrationPage=" + this.integrationPage + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* renamed from: u, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        @Nullable
        /* renamed from: v, reason: from getter */
        public final IntegrationPage getIntegrationPage() {
            return this.integrationPage;
        }

        @NotNull
        /* renamed from: w, reason: from getter */
        public final NextStep.Integration.IntegrationStepBrowserType getIntegrationStepBrowserType() {
            return this.integrationStepBrowserType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeString(this.redirectPath);
            dest.writeString(this.integrationStepBrowserType.name());
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.clientSideKey);
            dest.writeParcelable(this.integrationPage, flags);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* renamed from: x, reason: from getter */
        public final String getRedirectPath() {
            return this.redirectPath;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        public final String z() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegrationStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, @Nullable NextStep.Integration.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, boolean z10, boolean z11, @NotNull String clientSideKey, @Nullable IntegrationPage integrationPage, @Nullable InternalErrorInfo internalErrorInfo, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = integrationStepStyle;
            this.cancelDialog = cancelDialog;
            this.type = type;
            this.flowUrl = flowUrl;
            this.redirectPath = redirectPath;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.clientSideKey = clientSideKey;
            this.integrationPage = integrationPage;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemRelaySession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<RedeemRelaySession> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String relaySessionToken;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RedeemRelaySession> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RedeemRelaySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemRelaySession(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(RedeemRelaySession.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RedeemRelaySession[] newArray(int i10) {
                return new RedeemRelaySession[i10];
            }
        }

        public /* synthetic */ RedeemRelaySession(String str, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedeemRelaySession)) {
                return false;
            }
            RedeemRelaySession redeemRelaySession = (RedeemRelaySession) other;
            return Intrinsics.c(this.relaySessionToken, redeemRelaySession.relaySessionToken) && Intrinsics.c(this.inquirySessionConfig, redeemRelaySession.inquirySessionConfig);
        }

        public int hashCode() {
            return (this.relaySessionToken.hashCode() * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final String getRelaySessionToken() {
            return this.relaySessionToken;
        }

        @NotNull
        public String toString() {
            return "RedeemRelaySession(relaySessionToken=" + this.relaySessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.relaySessionToken);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedeemRelaySession(@NotNull String relaySessionToken, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.relaySessionToken = relaySessionToken;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "fallbackInquiryId", "fallbackSessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "r", "k", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResumeFallbackInquiry extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fallbackInquiryId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fallbackSessionToken;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ResumeFallbackInquiry> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResumeFallbackInquiry(parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(ResumeFallbackInquiry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry[] newArray(int i10) {
                return new ResumeFallbackInquiry[i10];
            }
        }

        public /* synthetic */ ResumeFallbackInquiry(String str, String str2, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) other;
            return Intrinsics.c(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && Intrinsics.c(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken) && Intrinsics.c(this.inquirySessionConfig, resumeFallbackInquiry.inquirySessionConfig);
        }

        public int hashCode() {
            return (((this.fallbackInquiryId.hashCode() * 31) + this.fallbackSessionToken.hashCode()) * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* renamed from: q, reason: from getter */
        public final String getFallbackInquiryId() {
            return this.fallbackInquiryId;
        }

        @NotNull
        /* renamed from: r, reason: from getter */
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        @NotNull
        public String toString() {
            return "ResumeFallbackInquiry(fallbackInquiryId=" + this.fallbackInquiryId + ", fallbackSessionToken=" + this.fallbackSessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fallbackInquiryId);
            dest.writeString(this.fallbackSessionToken);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeFallbackInquiry(@NotNull String fallbackInquiryId, @NotNull String fallbackSessionToken, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(fallbackInquiryId, "fallbackInquiryId");
            Intrinsics.checkNotNullParameter(fallbackSessionToken, "fallbackSessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.fallbackInquiryId = fallbackInquiryId;
            this.fallbackSessionToken = fallbackSessionToken;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    public InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4) {
        this.sessionToken = str;
        this.trackingEventsUrl = str2;
        this.inquiryId = str3;
        this.transitionStatus = transitionStatus;
        this.styles = stepStyle;
        this.cancelDialog = cancelDialog;
        this.fromStep = str4;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "y", "j", "k", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "l", "g", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "s", "()Z", "o", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowLoadingSpinner extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean useBasicSpinner;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowLoadingSpinner> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLoadingSpinner(parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner[] newArray(int i10) {
                return new ShowLoadingSpinner[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ShowLoadingSpinner(String str, String str2, TransitionStatus transitionStatus, String str3, StepStyle stepStyle, boolean z10, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? new TransitionStatus.CheckingForNextState(null, false, 3, 0 == true ? 1 : 0) : transitionStatus, str3, stepStyle, z10, (i10 & 64) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        public static /* synthetic */ ShowLoadingSpinner r(ShowLoadingSpinner showLoadingSpinner, String str, String str2, TransitionStatus transitionStatus, String str3, StepStyle stepStyle, boolean z10, InquirySessionConfig inquirySessionConfig, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = showLoadingSpinner.sessionToken;
            }
            if ((i10 & 2) != 0) {
                str2 = showLoadingSpinner.trackingEventsUrl;
            }
            if ((i10 & 4) != 0) {
                transitionStatus = showLoadingSpinner.transitionStatus;
            }
            if ((i10 & 8) != 0) {
                str3 = showLoadingSpinner.inquiryId;
            }
            if ((i10 & 16) != 0) {
                stepStyle = showLoadingSpinner.styles;
            }
            if ((i10 & 32) != 0) {
                z10 = showLoadingSpinner.useBasicSpinner;
            }
            if ((i10 & 64) != 0) {
                inquirySessionConfig = showLoadingSpinner.inquirySessionConfig;
            }
            boolean z11 = z10;
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            StepStyle stepStyle2 = stepStyle;
            TransitionStatus transitionStatus2 = transitionStatus;
            return showLoadingSpinner.q(str, str2, transitionStatus2, str3, stepStyle2, z11, inquirySessionConfig2);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) other;
            return Intrinsics.c(this.sessionToken, showLoadingSpinner.sessionToken) && Intrinsics.c(this.trackingEventsUrl, showLoadingSpinner.trackingEventsUrl) && Intrinsics.c(this.transitionStatus, showLoadingSpinner.transitionStatus) && Intrinsics.c(this.inquiryId, showLoadingSpinner.inquiryId) && Intrinsics.c(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && Intrinsics.c(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, xo.m0
        @Nullable
        public StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int hashCode = this.sessionToken.hashCode() * 31;
            String str = this.trackingEventsUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode3 = (((hashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryId.hashCode()) * 31;
            StepStyle stepStyle = this.styles;
            return ((((hashCode3 + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.useBasicSpinner)) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        public final ShowLoadingSpinner q(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryId, @Nullable StepStyle styles, boolean useBasicSpinner, @NotNull InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new ShowLoadingSpinner(sessionToken, trackingEventsUrl, transitionStatus, inquiryId, styles, useBasicSpinner, inquirySessionConfig);
        }

        /* renamed from: s, reason: from getter */
        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }

        @NotNull
        public String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.styles, flags);
            dest.writeInt(this.useBasicSpinner ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLoadingSpinner(@NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryId, @Nullable StepStyle stepStyle, boolean z10, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.inquiryId = inquiryId;
            this.styles = stepStyle;
            this.useBasicSpinner = z10;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    public /* synthetic */ InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, (i10 & 16) != 0 ? null : stepStyle, (i10 & 32) != 0 ? null : cancelDialog, (i10 & 64) != 0 ? null : str4, null);
    }
}
