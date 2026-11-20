package ug;

import android.net.Uri;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.roblox.client.datastructures.NameValuePair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;
import ju.d2;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tu.a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u00031-/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0082@¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>¨\u0006@"}, d2 = {"Lug/p;", "", "Lju/p0;", "eventUploadScope", "Lkh/a;", "analyticEventDao", "Lug/p$c;", "eventUploader", "Lug/p$b;", "config", "<init>", "(Lju/p0;Lkh/a;Lug/p$c;Lug/p$b;)V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "q", "(Z)V", "p", "(Ljava/lang/String;)Ljava/lang/String;", "serializedEvent", "serializedParams", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "j", "(Lkh/a;ZLmt/b;)Ljava/lang/Object;", "Llh/a;", "k", "()Ljava/util/List;", "events", "", "batchSize", "o", "(Ljava/util/List;IZ)Z", "n", "(Lkh/a;Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "l", "(Ljava/util/List;)Ljava/lang/String;", ve.a.f33391e, "Lju/p0;", j6.b.f21518e, "Lkh/a;", "c", "Lug/p$c;", rl.d.f30696a, "Lug/p$b;", "Ljava/util/concurrent/LinkedBlockingQueue;", "e", "Ljava/util/concurrent/LinkedBlockingQueue;", "eventsQueue", "Ljava/text/SimpleDateFormat;", "f", "Ljava/text/SimpleDateFormat;", "localTimeFormat", "Ltu/a;", "Ltu/a;", "uploadMutex", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 eventUploadScope;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final kh.a analyticEventDao;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c eventUploader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Config config;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AnalyticEvent> eventsQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SimpleDateFormat localTimeFormat;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.a uploadMutex;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lug/p$a;", "", "<init>", "()V", "Llh/a;", "", ve.a.f33391e, "(Llh/a;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ug.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull AnalyticEvent analyticEvent) {
            Intrinsics.checkNotNullParameter(analyticEvent, "<this>");
            Integer retryAttemptCount = analyticEvent.getRetryAttemptCount();
            if (retryAttemptCount != null) {
                int intValue = retryAttemptCount.intValue();
                StringBuilder sb2 = new StringBuilder();
                String eventName = analyticEvent.getEventName();
                if (eventName != null) {
                    sb2.append("evt=" + eventName + "Retry");
                }
                String eventContext = analyticEvent.getEventContext();
                if (eventContext != null) {
                    sb2.append("&ctx=" + eventContext);
                }
                String serializedParams = analyticEvent.getSerializedParams();
                if (serializedParams != null) {
                    sb2.append("&" + serializedParams);
                }
                sb2.append("&retryAttemptCount=" + intValue);
                String sb3 = sb2.toString();
                if (sb3 != null) {
                    return sb3;
                }
            }
            return analyticEvent.getSerializedEvent();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lug/p$b;", "", "", "batchUrl", "", "batchSize", "jsonContentType", "deviceId", "advertisingId", "", "enableExperimentMonitoring", "useGsonForEventUpload", "deleteRoomDBEventsOnClientError", "updateRetryAttemptCountBeforeUpload", "useUrlEncodedStringForEventUpload", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "c", j6.b.f21518e, "I", "g", rl.d.f30696a, "e", "f", "Z", "()Z", "i", "h", "j", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ug.p$b, reason: from toString */
    public static final /* data */ class Config {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String batchUrl;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final int batchSize;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String jsonContentType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String deviceId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String advertisingId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean enableExperimentMonitoring;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean useGsonForEventUpload;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean deleteRoomDBEventsOnClientError;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean updateRetryAttemptCountBeforeUpload;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean useUrlEncodedStringForEventUpload;

        public Config(@NotNull String batchUrl, int i10, @NotNull String jsonContentType, @NotNull String deviceId, @Nullable String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            Intrinsics.checkNotNullParameter(batchUrl, "batchUrl");
            Intrinsics.checkNotNullParameter(jsonContentType, "jsonContentType");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.batchUrl = batchUrl;
            this.batchSize = i10;
            this.jsonContentType = jsonContentType;
            this.deviceId = deviceId;
            this.advertisingId = str;
            this.enableExperimentMonitoring = z10;
            this.useGsonForEventUpload = z11;
            this.deleteRoomDBEventsOnClientError = z12;
            this.updateRetryAttemptCountBeforeUpload = z13;
            this.useUrlEncodedStringForEventUpload = z14;
        }

        @Nullable
        /* renamed from: a, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: b, reason: from getter */
        public final int getBatchSize() {
            return this.batchSize;
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final String getBatchUrl() {
            return this.batchUrl;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDeleteRoomDBEventsOnClientError() {
            return this.deleteRoomDBEventsOnClientError;
        }

        @NotNull
        /* renamed from: e, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.c(this.batchUrl, config.batchUrl) && this.batchSize == config.batchSize && Intrinsics.c(this.jsonContentType, config.jsonContentType) && Intrinsics.c(this.deviceId, config.deviceId) && Intrinsics.c(this.advertisingId, config.advertisingId) && this.enableExperimentMonitoring == config.enableExperimentMonitoring && this.useGsonForEventUpload == config.useGsonForEventUpload && this.deleteRoomDBEventsOnClientError == config.deleteRoomDBEventsOnClientError && this.updateRetryAttemptCountBeforeUpload == config.updateRetryAttemptCountBeforeUpload && this.useUrlEncodedStringForEventUpload == config.useUrlEncodedStringForEventUpload;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getEnableExperimentMonitoring() {
            return this.enableExperimentMonitoring;
        }

        @NotNull
        /* renamed from: g, reason: from getter */
        public final String getJsonContentType() {
            return this.jsonContentType;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getUpdateRetryAttemptCountBeforeUpload() {
            return this.updateRetryAttemptCountBeforeUpload;
        }

        public int hashCode() {
            int hashCode = ((((((this.batchUrl.hashCode() * 31) + Integer.hashCode(this.batchSize)) * 31) + this.jsonContentType.hashCode()) * 31) + this.deviceId.hashCode()) * 31;
            String str = this.advertisingId;
            return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableExperimentMonitoring)) * 31) + Boolean.hashCode(this.useGsonForEventUpload)) * 31) + Boolean.hashCode(this.deleteRoomDBEventsOnClientError)) * 31) + Boolean.hashCode(this.updateRetryAttemptCountBeforeUpload)) * 31) + Boolean.hashCode(this.useUrlEncodedStringForEventUpload);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getUseGsonForEventUpload() {
            return this.useGsonForEventUpload;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getUseUrlEncodedStringForEventUpload() {
            return this.useUrlEncodedStringForEventUpload;
        }

        @NotNull
        public String toString() {
            return "Config(batchUrl=" + this.batchUrl + ", batchSize=" + this.batchSize + ", jsonContentType=" + this.jsonContentType + ", deviceId=" + this.deviceId + ", advertisingId=" + this.advertisingId + ", enableExperimentMonitoring=" + this.enableExperimentMonitoring + ", useGsonForEventUpload=" + this.useGsonForEventUpload + ", deleteRoomDBEventsOnClientError=" + this.deleteRoomDBEventsOnClientError + ", updateRetryAttemptCountBeforeUpload=" + this.updateRetryAttemptCountBeforeUpload + ", useUrlEncodedStringForEventUpload=" + this.useUrlEncodedStringForEventUpload + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lug/p$c;", "", "", "url", "body", "contentType", "Lci/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "counterName", "", ve.a.f33391e, "(Ljava/lang/String;)V", "", "value", j6.b.f21518e, "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(@NotNull String counterName);

        void b(@NotNull String counterName, long value);

        @Nullable
        Object c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull mt.b<? super ci.j> bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.analytics.EventUploadWorker$addEvent$1$1", f = "EventUploadWorker.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ p A;
        public final /* synthetic */ boolean B;

        /* renamed from: t, reason: collision with root package name */
        public Object f32793t;

        /* renamed from: u, reason: collision with root package name */
        public int f32794u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f32795v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f32796w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f32797x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f32798y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ kh.a f32799z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, kh.a aVar, p pVar, boolean z10, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f32795v = str;
            this.f32796w = str2;
            this.f32797x = str3;
            this.f32798y = str4;
            this.f32799z = aVar;
            this.A = pVar;
            this.B = z10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f32795v, this.f32796w, this.f32797x, this.f32798y, this.f32799z, this.A, this.B, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            AnalyticEvent analyticEvent;
            Object e10 = nt.c.e();
            int i10 = this.f32794u;
            if (i10 == 0) {
                gt.o.b(obj);
                AnalyticEvent analyticEvent2 = new AnalyticEvent(0, this.f32795v, this.f32796w, this.f32797x, this.f32798y, null, 32, null);
                this.f32793t = analyticEvent2;
                this.f32794u = 1;
                obj = this.f32799z.k(new AnalyticEvent[]{analyticEvent2}, this);
                if (obj == e10) {
                    return e10;
                }
                analyticEvent = analyticEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                analyticEvent = (AnalyticEvent) this.f32793t;
                gt.o.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ot.b.c(ek.q.h("EventUploadJob", "Added event " + this.f32795v + " to database."));
            } else {
                ek.q.h("EventUploadJob", "Failed to add event " + this.f32795v + " to database. Adding it to in-memory queue.");
                ot.b.a(this.A.eventsQueue.add(analyticEvent));
            }
            this.A.q(this.B);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {ModuleDescriptor.MODULE_VERSION, 160, 161, 168}, m = "doUpload", v = 1)
    public static final class e extends ot.d {
        public int B;

        /* renamed from: t, reason: collision with root package name */
        public Object f32800t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32801u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f32802v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f32803w;

        /* renamed from: x, reason: collision with root package name */
        public int f32804x;

        /* renamed from: y, reason: collision with root package name */
        public int f32805y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f32806z;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32806z = obj;
            this.B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.j(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {210, 217, 225, 230, 237, 244, 251}, m = "sendUploadRequest", v = 1)
    public static final class f extends ot.d {
        public Object A;
        public Object B;
        public Object C;
        public boolean D;
        public int E;
        public int F;
        public int G;
        public /* synthetic */ Object H;
        public int J;

        /* renamed from: t, reason: collision with root package name */
        public Object f32807t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32808u;

        /* renamed from: v, reason: collision with root package name */
        public Object f32809v;

        /* renamed from: w, reason: collision with root package name */
        public Object f32810w;

        /* renamed from: x, reason: collision with root package name */
        public Object f32811x;

        /* renamed from: y, reason: collision with root package name */
        public Object f32812y;

        /* renamed from: z, reason: collision with root package name */
        public Object f32813z;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.H = obj;
            this.J |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.this.n(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.analytics.EventUploadWorker$uploadEvents$1$1", f = "EventUploadWorker.kt", l = {144}, m = "invokeSuspend", v = 1)
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: t, reason: collision with root package name */
        public Object f32814t;

        /* renamed from: u, reason: collision with root package name */
        public Object f32815u;

        /* renamed from: v, reason: collision with root package name */
        public int f32816v;

        /* renamed from: w, reason: collision with root package name */
        public int f32817w;

        /* renamed from: x, reason: collision with root package name */
        public int f32818x;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ kh.a f32820z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kh.a aVar, boolean z10, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f32820z = aVar;
            this.A = z10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return p.this.new g(this.f32820z, this.A, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            tu.a aVar;
            Object e10 = nt.c.e();
            int i10 = this.f32818x;
            if (i10 == 0) {
                gt.o.b(obj);
                p pVar = p.this;
                tu.a aVar2 = pVar.uploadMutex;
                p pVar2 = p.this;
                kh.a aVar3 = this.f32820z;
                boolean z10 = this.A;
                if (a.C0589a.b(aVar2, null, 1, null)) {
                    try {
                        this.f32814t = ot.l.a(pVar);
                        this.f32815u = aVar2;
                        this.f32816v = 0;
                        this.f32817w = 0;
                        this.f32818x = 1;
                        if (pVar2.j(aVar3, z10, this) == e10) {
                            return e10;
                        }
                        aVar = aVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        a.C0589a.c(aVar, null, 1, null);
                        throw th;
                    }
                }
                return Unit.f22894a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (tu.a) this.f32815u;
            try {
                gt.o.b(obj);
            } catch (Throwable th3) {
                th = th3;
                a.C0589a.c(aVar, null, 1, null);
                throw th;
            }
            a.C0589a.c(aVar, null, 1, null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public p(@NotNull p0 eventUploadScope, @Nullable kh.a aVar, @NotNull c eventUploader, @NotNull Config config) {
        Intrinsics.checkNotNullParameter(eventUploadScope, "eventUploadScope");
        Intrinsics.checkNotNullParameter(eventUploader, "eventUploader");
        Intrinsics.checkNotNullParameter(config, "config");
        this.eventUploadScope = eventUploadScope;
        this.analyticEventDao = aVar;
        this.eventUploader = eventUploader;
        this.config = config;
        this.eventsQueue = new LinkedBlockingQueue<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        this.localTimeFormat = simpleDateFormat;
        this.uploadMutex = tu.g.b(false, 1, null);
    }

    public static final CharSequence i(p pVar, NameValuePair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!pVar.config.getUseUrlEncodedStringForEventUpload()) {
            return it.getName() + "=" + it.getValue();
        }
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String p8 = pVar.p(name);
        String value = it.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return p8 + "=" + pVar.p(value);
    }

    public static final CharSequence m(AnalyticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\"" + INSTANCE.a(it) + "\"";
    }

    public final void g(String serializedEvent, String evt, String ctx, String serializedParams, boolean waitForFullBatch) {
        d2 d10;
        kh.a aVar = this.analyticEventDao;
        if (aVar != null) {
            d10 = ju.k.d(this.eventUploadScope, null, null, new d(serializedEvent, evt, ctx, serializedParams, aVar, this, waitForFullBatch, null), 3, null);
            if (d10 != null) {
                return;
            }
        }
        ek.q.e("EventUploadJob", "Failed to add " + serializedEvent + ". Database is not available");
    }

    public final void h(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        String format = this.localTimeFormat.format(new Date());
        String deviceId = this.config.getDeviceId();
        String str = ("lt=" + format + "&mdid=" + deviceId + "&idfv=" + deviceId + "&idfa=" + this.config.getAdvertisingId()) + "&" + CollectionsKt.m0(params, "&", null, null, 0, null, new Function1() { // from class: ug.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence i10;
                i10 = p.i(p.this, (NameValuePair) obj);
                return i10;
            }
        }, 30, null);
        g("evt=" + evt + "&ctx=" + ctx + "&" + str, evt, ctx, str, waitForFullBatch);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        if (o(r14, r12, r13) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015c, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0109 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kh.a r12, boolean r13, mt.b<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.p.j(kh.a, boolean, mt.b):java.lang.Object");
    }

    public final List<AnalyticEvent> k() {
        if (this.eventsQueue.isEmpty()) {
            return kotlin.collections.p.k();
        }
        ArrayList arrayList = new ArrayList();
        this.eventsQueue.drainTo(arrayList);
        return arrayList;
    }

    public final String l(List<AnalyticEvent> events) {
        if (!this.config.getUseGsonForEventUpload()) {
            return CollectionsKt.m0(events, ",", "[", "]", 0, null, new Function1() { // from class: ug.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence m10;
                    m10 = p.m((AnalyticEvent) obj);
                    return m10;
                }
            }, 24, null);
        }
        List<AnalyticEvent> list = events;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.a((AnalyticEvent) it.next()));
        }
        return ek.n.c(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c1, code lost:
    
        if (r1.j(r10, r4) == r5) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0473 -> B:25:0x0477). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kh.a r28, java.util.List<lh.AnalyticEvent> r29, mt.b<? super java.lang.Boolean> r30) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.p.n(kh.a, java.util.List, mt.b):java.lang.Object");
    }

    public final boolean o(List<AnalyticEvent> events, int batchSize, boolean waitForFullBatch) {
        boolean z10 = events.size() >= batchSize || !(waitForFullBatch || events.isEmpty());
        ek.q.h("EventUploadJob", "Should upload events " + z10 + ", events count " + events.size() + ", batch size " + batchSize + ", waitForFullBatch " + waitForFullBatch);
        return z10;
    }

    public final String p(String str) {
        String encode = Uri.encode(str);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return encode;
    }

    public final void q(boolean waitForFullBatch) {
        d2 d10;
        kh.a aVar = this.analyticEventDao;
        if (aVar != null) {
            d10 = ju.k.d(this.eventUploadScope, null, null, new g(aVar, waitForFullBatch, null), 3, null);
            if (d10 != null) {
                return;
            }
        }
        ek.q.e("EventUploadJob", "Failed to upload events. Database is not available");
    }
}
