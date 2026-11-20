package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.DebugLogEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcScanEventData;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseDetectEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingUiEvent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.VideoErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoIceCompleteEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopRequestEventData;
import com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse;
import eo.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import ju.k;
import ju.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oq.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.w;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0094\u00012\u00020\u0001:\u0006\u0095\u0001\u0094\u0001\u0096\u0001BS\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010.J+\u0010/\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010.J+\u00100\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010.J+\u00103\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J3\u00107\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u00108JQ\u0010>\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u0001012\b\u0010;\u001a\u0004\u0018\u0001012\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ=\u0010D\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020Q2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020T2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\\\u0010]J1\u0010c\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010gJ3\u0010k\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020h2\b\u0010j\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020p2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010t\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020s2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bt\u0010uJ-\u0010y\u001a\u00020\u001d2\u0006\u0010v\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000e0w2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010|\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020{2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010~R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u007fR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0080\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0083\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0084\u0001R\u0017\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0084\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "cache", "Lsm/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "metadataProvider", "Loq/c;", "sdkFilesManager", "Leo/e;", "featureFlagManager", "", "trackingEventServerEndpoint", "Lju/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "networkStateManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lsm/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Loq/c;Leo/e;Ljava/lang/String;Lju/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "fetchPublicKey", "(Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", NotificationCompat.CATEGORY_EVENT, "", "force", "", "logEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Z)V", "flush", "nowToIso8601Utc", "()Ljava/lang/String;", "sessionToken", "setSessionToken", "(Ljava/lang/String;)V", "trackingEventsUrl", "setTrackingEventsUrl", "enabled", "setIsEnabled", "(Z)V", "stepName", "pageName", "logInquiryPageViewEvent", "(Ljava/lang/String;Ljava/lang/String;Z)V", "logForegroundEvent", "logBackgroundEvent", "", "numCandidates", "logWebRtcIceCompleteEvent", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "videoCaptureMethod", "attempt", "logVideoStartEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "assetId", "elapsedTime", "chunksLength", "", "blobSize", "logVideoStopEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "(Ljava/lang/String;Z)V", "errorName", "errorReason", "logVideoErrorEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "permissionData", "logPermissionEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "data", "logSelfieCaptureButtonClickedEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfiePoseCaptureEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logSelfieCaptureStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdButtonClickEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logGovernmentIdStateEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "config", "logInquiryStartEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "reason", "", "durationMs", "errorDescription", "logInquiryEndEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;JLjava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logIntegrationEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", Payload.TYPE, "buttonName", "logUiStepButtonEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logCameraInfoEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcScanEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logNfcErrorEvent", "(Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Z)V", "category", "Lkotlin/Function0;", "message", "logDebugLogEvent", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "logSelfiePoseDetect", "(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Z)V", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "Lsm/w;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "Loq/c;", "Leo/e;", "Ljava/lang/String;", "Lju/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;", "Lx5/p0;", "workManager", "Lx5/p0;", "Ljava/text/SimpleDateFormat;", "iso8601Formatter", "Ljava/text/SimpleDateFormat;", "id", "isEnabled", "Z", "cachedPublicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "isDebugMode", "()Z", "Companion", "Factory", "TrackingEventsWorker", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger implements TrackingEventsLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_MEMORY_THRESHOLD = 10;

    @NotNull
    public static final String KEY_ENCRYPTED_REQUEST_FILE = "encrypted_request_file";

    @NotNull
    public static final String KEY_FLUSH_TOKEN = "flush_token";

    @NotNull
    public static final String KEY_SERVER_ENDPOINT = "server_endpoint";

    @NotNull
    public static final String KEY_SESSION_TOKEN = "session_token";

    @NotNull
    public static final String WORK_NAME_PREFIX = "tracking_events_work_";

    @Nullable
    private static h<List<TrackingEvent>> trackingEventsJsonAdapter;

    @NotNull
    private final TrackingEventsCache cache;

    @Nullable
    private volatile PublicKeyResponse cachedPublicKeyResponse;

    @NotNull
    private final Context context;

    @NotNull
    private final p0 coroutineScope;

    @NotNull
    private final e featureFlagManager;

    @NotNull
    private final String id;
    private volatile boolean isEnabled;

    @NotNull
    private final SimpleDateFormat iso8601Formatter;

    @NotNull
    private final TrackingMetadataProvider metadataProvider;

    @NotNull
    private final w moshi;

    @NotNull
    private final NetworkStateManager networkStateManager;

    @NotNull
    private final c sdkFilesManager;

    @Nullable
    private volatile String sessionToken;

    @NotNull
    private final String trackingEventServerEndpoint;

    @NotNull
    private volatile String trackingEventsUrl;

    @NotNull
    private final x5.p0 workManager;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR$\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;", "", "<init>", "()V", "", "json", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "publicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "createTrackingEventsRequest", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lmt/b;)Ljava/lang/Object;", "", "DEFAULT_MEMORY_THRESHOLD", "I", "KEY_SESSION_TOKEN", "Ljava/lang/String;", "KEY_SERVER_ENDPOINT", "KEY_ENCRYPTED_REQUEST_FILE", "KEY_FLUSH_TOKEN", "WORK_NAME_PREFIX", "Lsm/h;", "", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "trackingEventsJsonAdapter", "Lsm/h;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
        
            if (r10 == r1) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object createTrackingEventsRequest(java.lang.String r8, com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse r9, mt.b<? super com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest> r10) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.Companion.createTrackingEventsRequest(java.lang.String, com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse, mt.b):java.lang.Object");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;", "", "create", "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;", "trackingEventServerEndpoint", "", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        @NotNull
        RealTrackingEventsLogger create(@NotNull String trackingEventServerEndpoint);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$TrackingEventsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrackingEventsWorker extends CoroutineWorker {

        @NotNull
        private final Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackingEventsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
            this.context = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x016e, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x01ab, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x01e8, code lost:
        
            if (r2 == r3) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0233, code lost:
        
            if (r2 == r3) goto L177;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x02a7, code lost:
        
            if (r2 == r3) goto L177;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0393, code lost:
        
            if (r1.onFlushFinished(r9, r5, r2) != r3) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x047a, code lost:
        
            if (r1.onFlushFinished(r4, r5, r2) != r3) goto L173;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x02f0 A[Catch: Exception -> 0x00ab, all -> 0x0398, TryCatch #6 {Exception -> 0x00ab, blocks: (B:19:0x00a0, B:20:0x02ea, B:22:0x02f0, B:23:0x033c, B:76:0x02ff, B:79:0x031e, B:81:0x0334), top: B:18:0x00a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x047c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x03bf  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x03da A[Catch: all -> 0x0398, LOOP:0: B:42:0x03d8->B:43:0x03da, LOOP_END, TryCatch #8 {all -> 0x0398, blocks: (B:19:0x00a0, B:20:0x02ea, B:22:0x02f0, B:23:0x033c, B:76:0x02ff, B:79:0x031e, B:81:0x0334, B:38:0x03b9, B:41:0x03c1, B:43:0x03da, B:45:0x03ec), top: B:18:0x00a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x03f9  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x040c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x040e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x044c  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0456  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0356  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x02ff A[Catch: Exception -> 0x00ab, all -> 0x0398, TryCatch #6 {Exception -> 0x00ab, blocks: (B:19:0x00a0, B:20:0x02ea, B:22:0x02f0, B:23:0x033c, B:76:0x02ff, B:79:0x031e, B:81:0x0334), top: B:18:0x00a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
        /* JADX WARN: Type inference failed for: r0v20, types: [com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService] */
        /* JADX WARN: Type inference failed for: r1v15, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, mt.b] */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28, types: [com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker$doWork$1, mt.b] */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v49 */
        /* JADX WARN: Type inference failed for: r2v50 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v37 */
        /* JADX WARN: Type inference failed for: r4v38 */
        /* JADX WARN: Type inference failed for: r4v39 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v41 */
        /* JADX WARN: Type inference failed for: r4v43 */
        /* JADX WARN: Type inference failed for: r4v45 */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v11, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v13, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v27 */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Type inference failed for: r5v29 */
        /* JADX WARN: Type inference failed for: r5v30 */
        /* JADX WARN: Type inference failed for: r5v31 */
        /* JADX WARN: Type inference failed for: r5v4, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v7, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r5v9, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v34, types: [com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache] */
        /* JADX WARN: Type inference failed for: r6v37 */
        /* JADX WARN: Type inference failed for: r6v38 */
        /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v47 */
        /* JADX WARN: Type inference failed for: r6v48 */
        /* JADX WARN: Type inference failed for: r6v49 */
        @Override // androidx.work.CoroutineWorker
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r21) {
            /*
                Method dump skipped, instructions count: 1178
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.TrackingEventsWorker.doWork(mt.b):java.lang.Object");
        }
    }

    public RealTrackingEventsLogger(@NotNull Context context, @NotNull TrackingEventsCache trackingEventsCache, @NotNull w wVar, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull c cVar, @NotNull e eVar, @NotNull String str, @NotNull p0 p0Var, @NotNull NetworkStateManager networkStateManager) {
        context.getClass();
        trackingEventsCache.getClass();
        wVar.getClass();
        trackingMetadataProvider.getClass();
        cVar.getClass();
        eVar.getClass();
        str.getClass();
        p0Var.getClass();
        networkStateManager.getClass();
        this.context = context;
        this.cache = trackingEventsCache;
        this.moshi = wVar;
        this.metadataProvider = trackingMetadataProvider;
        this.sdkFilesManager = cVar;
        this.featureFlagManager = eVar;
        this.trackingEventServerEndpoint = str;
        this.coroutineScope = p0Var;
        this.networkStateManager = networkStateManager;
        this.workManager = x5.p0.INSTANCE.a(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.iso8601Formatter = simpleDateFormat;
        this.id = a.a();
        this.trackingEventsUrl = str;
        trackingEventsJsonAdapter = wVar.d(a0.j(List.class, TrackingEvent.class));
        TrackingEventsCache.INSTANCE.setInstance(trackingEventsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:22|23))(2:24|(1:26)(2:27|(1:29)(2:30|(1:32))))|12|(1:14)|15|(2:17|18)|21))|34|6|7|(0)(0)|12|(0)|15|(0)|21) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0074, TRY_LEAVE, TryCatch #0 {Exception -> 0x0074, blocks: (B:11:0x002a, B:12:0x0066, B:15:0x006d, B:17:0x0071, B:30:0x0049), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPublicKey(mt.b<? super com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1 r0 = (com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1 r0 = new com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$fetchPublicKey$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            gt.o.b(r8)     // Catch: java.lang.Exception -> L74
            gt.n r8 = (gt.n) r8     // Catch: java.lang.Exception -> L74
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Exception -> L74
            goto L66
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            gt.o.b(r8)
            com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse r8 = r7.cachedPublicKeyResponse
            if (r8 == 0) goto L44
            return r8
        L44:
            java.lang.String r8 = r7.sessionToken
            if (r8 != 0) goto L49
            return r4
        L49:
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponentManager r2 = com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponentManager.INSTANCE     // Catch: java.lang.Exception -> L74
            android.content.Context r5 = r7.context     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = r7.trackingEventsUrl     // Catch: java.lang.Exception -> L74
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponent r2 = r2.getInstance(r5, r6)     // Catch: java.lang.Exception -> L74
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService r2 = r2.trackingEventsService()     // Catch: java.lang.Exception -> L74
            java.lang.Object r5 = ot.l.a(r8)     // Catch: java.lang.Exception -> L74
            r0.L$0 = r5     // Catch: java.lang.Exception -> L74
            r0.label = r3     // Catch: java.lang.Exception -> L74
            java.lang.Object r8 = r2.m71getPublicKeygIAlus$tracking_events_release(r8, r0)     // Catch: java.lang.Exception -> L74
            if (r8 != r1) goto L66
            return r1
        L66:
            boolean r0 = gt.n.g(r8)     // Catch: java.lang.Exception -> L74
            if (r0 == 0) goto L6d
            r8 = r4
        L6d:
            com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse r8 = (com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse) r8     // Catch: java.lang.Exception -> L74
            if (r8 == 0) goto L74
            r7.cachedPublicKeyResponse = r8     // Catch: java.lang.Exception -> L74
            return r8
        L74:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.fetchPublicKey(mt.b):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0311, code lost:
    
        if (r8.onFlushFinished(r7, false, r2) == r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0157, code lost:
    
        if (r11.onFlushFinished(r0, true, r2) == r3) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9 A[Catch: Exception -> 0x0215, TRY_LEAVE, TryCatch #6 {Exception -> 0x0215, blocks: (B:32:0x01d5, B:34:0x01d9, B:37:0x0218), top: B:31:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0218 A[Catch: Exception -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0215, blocks: (B:32:0x01d5, B:34:0x01d9, B:37:0x0218), top: B:31:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(mt.b<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.flush(mt.b):java.lang.Object");
    }

    private final boolean isDebugMode() {
        return this.featureFlagManager.a(eo.c.f16093a);
    }

    private final void logEvent(TrackingEvent event, boolean force) {
        if (this.isEnabled) {
            k.d(this.coroutineScope, null, null, new RealTrackingEventsLogger$logEvent$1(this, event, force, null), 3, null);
        }
    }

    private final String nowToIso8601Utc() {
        String format = this.iso8601Formatter.format(new Date());
        format.getClass();
        return format;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logBackgroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryBackgroundEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logCameraInfoEvent(@NotNull CameraInfoEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryCameraInfoEvent(a.a(), CameraInfoEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logDebugLogEvent(@NotNull String category, @NotNull Function0<String> message, boolean force) {
        category.getClass();
        message.getClass();
        if (isDebugMode()) {
            logEvent(new TrackingEvent.InquiryDebugLogEvent(a.a(), new DebugLogEventData(category, message.invoke(), this.metadataProvider.collect()), nowToIso8601Utc()), force);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logForegroundEvent(@Nullable String stepName, @Nullable String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryForegroundEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdButtonClickEvent(@NotNull GovernmentIdButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdButtonEvent(a.a(), GovernmentIdButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdStateEvent(@NotNull GovernmentIdStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdStateEvent(a.a(), GovernmentIdStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryEndEvent(@NotNull InquiryEndReason reason, long durationMs, @Nullable String errorDescription, boolean force) {
        reason.getClass();
        logEvent(new TrackingEvent.InquiryEndEvent(a.a(), new InquiryEndEventData(reason, Long.valueOf(durationMs), errorDescription, this.metadataProvider.collect()), nowToIso8601Utc()), true);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryPageViewEvent(@NotNull String stepName, @Nullable String pageName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.PageViewTrackingEvent(a.a(), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryStartEvent(@NotNull InquiryConfigData config, boolean force) {
        InquiryConfigData copy;
        config.getClass();
        TrackingMetadata collect = this.metadataProvider.collect();
        String a10 = a.a();
        copy = config.copy((r32 & 1) != 0 ? config.templateId : null, (r32 & 2) != 0 ? config.templateVersion : null, (r32 & 4) != 0 ? config.environment : null, (r32 & 8) != 0 ? config.environmentId : null, (r32 & 16) != 0 ? config.organizationId : this.networkStateManager.getOrganizationId(), (r32 & 32) != 0 ? config.uiFramework : null, (r32 & 64) != 0 ? config.themeSetId : null, (r32 & 128) != 0 ? config.hasAccountId : null, (r32 & 256) != 0 ? config.hasFields : null, (r32 & 512) != 0 ? config.hasInquiryId : null, (r32 & 1024) != 0 ? config.hasOneTimeLinkCode : null, (r32 & 2048) != 0 ? config.hasRedirectUri : null, (r32 & 4096) != 0 ? config.hasReferenceId : null, (r32 & 8192) != 0 ? config.hasSessionToken : null, (r32 & 16384) != 0 ? config.hasTheme : null);
        logEvent(new TrackingEvent.InquiryStartEvent(a10, new InquiryStartEventData(copy, collect), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logIntegrationEvent(@NotNull IntegrationEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryIntegrationEvent(a.a(), IntegrationEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcErrorEvent(@NotNull NfcErrorEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcErrorEvent(a.a(), NfcErrorEventData.copy$default(data, null, null, null, null, null, null, null, null, this.metadataProvider.collect(), 255, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcScanEvent(@NotNull NfcScanEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcScanEvent(a.a(), NfcScanEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logPermissionEvent(@NotNull PermissionTrackingEventData permissionData, boolean force) {
        permissionData.getClass();
        logEvent(new TrackingEvent.InquiryPermissionEvent(a.a(), PermissionTrackingEventData.copy$default(permissionData, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureButtonClickedEvent(@NotNull SelfieCaptureButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieClickEvent(a.a(), SelfieCaptureButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureStateEvent(@NotNull SelfieCaptureStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieCaptureStateEvent(a.a(), SelfieCaptureStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseCaptureEvent(@NotNull SelfiePoseEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseEvent(a.a(), SelfiePoseEventData.copy$default(data, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfiePoseDetect(@NotNull SelfiePoseDetectEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseDetectEvent(a.a(), SelfiePoseDetectEventData.copy$default(data, null, null, 0.0f, 0.0f, 0.0f, this.metadataProvider.collect(), 31, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logUiStepButtonEvent(@NotNull UiStepButtonType type, @Nullable String buttonName, @Nullable String stepName, boolean force) {
        type.getClass();
        logEvent(new TrackingEvent.InquiryUiStepButtonEvent(a.a(), new UiStepButtonEventData(type, buttonName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoErrorEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String errorName, @Nullable String errorReason, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoErrorEvent(a.a(), new VideoErrorEventData(stepName, null, videoCaptureMethod, errorName, errorReason, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStartEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable Integer attempt, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStartEvent(a.a(), new VideoStartEventData(stepName, null, videoCaptureMethod, attempt, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopEvent(@NotNull String stepName, @Nullable String videoCaptureMethod, @Nullable String assetId, @Nullable Integer elapsedTime, @Nullable Integer chunksLength, @Nullable Double blobSize, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopEvent(a.a(), new VideoStopEventData(stepName, null, videoCaptureMethod, assetId, elapsedTime, chunksLength, blobSize, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopRequestEvent(@NotNull String stepName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopRequestEvent(a.a(), new VideoStopRequestEventData(stepName, null, null, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logWebRtcIceCompleteEvent(@Nullable String stepName, @Nullable Integer numCandidates, boolean force) {
        logEvent(new TrackingEvent.InquiryVideoIceCompleteEvent(a.a(), new VideoIceCompleteEventData(stepName, null, null, numCandidates, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setIsEnabled(boolean enabled) {
        if (this.isEnabled == enabled) {
            return;
        }
        this.isEnabled = enabled;
        if (this.isEnabled) {
            return;
        }
        this.cachedPublicKeyResponse = null;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setSessionToken(@NotNull String sessionToken) {
        sessionToken.getClass();
        this.sessionToken = sessionToken;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setTrackingEventsUrl(@Nullable String trackingEventsUrl) {
        if (trackingEventsUrl != null) {
            this.trackingEventsUrl = trackingEventsUrl;
        }
    }
}
