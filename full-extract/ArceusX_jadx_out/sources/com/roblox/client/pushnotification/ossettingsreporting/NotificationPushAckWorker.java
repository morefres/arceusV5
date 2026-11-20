package com.roblox.client.pushnotification.ossettingsreporting;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker;
import ek.q;
import gt.s;
import gu.l;
import iv.m;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import x5.d;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0003\u0011\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "", "e", j6.b.f21518e, "(Ljava/lang/Throwable;)Landroidx/work/c$a;", ve.a.f33391e, "Landroidx/work/WorkerParameters;", "NotificationPushAckParams", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationPushAckWorker extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters workerParams;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\t\u0010\nR#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011*\u0004\b\u000f\u0010\nR#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0014\u0010\u0011*\u0004\b\u0013\u0010\nR#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0017\u0010\u0011*\u0004\b\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001a\u0010\f*\u0004\b\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001d\u0010\f*\u0004\b\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b \u0010\f*\u0004\b\u001f\u0010\nR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;", "", "data", "", "", "<init>", "(Ljava/util/Map;)V", "delegate", "deviceId", "getDeviceId$delegate", "(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;", "getDeviceId", "()Ljava/lang/String;", "channelNames", "", "getChannelNames$delegate", "getChannelNames", "()[Ljava/lang/String;", "channelEnabledValues", "getChannelEnabledValues$delegate", "getChannelEnabledValues", "changedChannels", "getChangedChannels$delegate", "getChangedChannels", "notificationId", "getNotificationId$delegate", "getNotificationId", "metadata", "getMetadata$delegate", "getMetadata", "notificationType", "getNotificationType$delegate", "getNotificationType", "userId", "", "getUserId", "()Ljava/lang/Long;", "receivedTime", "getReceivedTime", "priority", "", "getPriority", "()Ljava/lang/Integer;", "originalPriority", "getOriginalPriority", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotificationPushAckParams {
        static final /* synthetic */ l<Object>[] $$delegatedProperties = {d0.g(new u(NotificationPushAckParams.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "channelNames", "getChannelNames()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "channelEnabledValues", "getChannelEnabledValues()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "changedChannels", "getChangedChannels()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "notificationId", "getNotificationId()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "metadata", "getMetadata()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "notificationType", "getNotificationType()Ljava/lang/String;", 0))};

        @NotNull
        private final Map<String, Object> delegate;

        public NotificationPushAckParams(@NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.delegate = i0.b(data, new Function1() { // from class: com.roblox.client.pushnotification.ossettingsreporting.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object delegate$lambda$0;
                    delegate$lambda$0 = NotificationPushAckWorker.NotificationPushAckParams.delegate$lambda$0((String) obj);
                    return delegate$lambda$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object delegate$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }

        @Nullable
        public final String[] getChangedChannels() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[3].getName());
        }

        @Nullable
        public final String[] getChannelEnabledValues() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[2].getName());
        }

        @Nullable
        public final String[] getChannelNames() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[1].getName());
        }

        @Nullable
        public final String getDeviceId() {
            return (String) i0.a(this.delegate, $$delegatedProperties[0].getName());
        }

        @Nullable
        public final String getMetadata() {
            return (String) i0.a(this.delegate, $$delegatedProperties[5].getName());
        }

        @Nullable
        public final String getNotificationId() {
            return (String) i0.a(this.delegate, $$delegatedProperties[4].getName());
        }

        @Nullable
        public final String getNotificationType() {
            return (String) i0.a(this.delegate, $$delegatedProperties[6].getName());
        }

        @Nullable
        public final Integer getOriginalPriority() {
            Object obj = this.delegate.get("originalPriority");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            return null;
        }

        @Nullable
        public final Integer getPriority() {
            Object obj = this.delegate.get("priority");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            return null;
        }

        @Nullable
        public final Long getReceivedTime() {
            Object obj = this.delegate.get("receivedTime");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }

        @Nullable
        public final Long getUserId() {
            Object obj = this.delegate.get("userId");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "input", "", j6.b.f21518e, "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", ve.a.f33391e, "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V", "", "MAX_RETRY_COUNT", "I", "", "SETTINGS_CHANGE_WORK_NAME", "Ljava/lang/String;", "ACK_CALL_WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context appContext, @NotNull b.NotificationAckInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            q.h("NotificationOSSettingChangeReportingWorker", "Scheduling Push Ack Work");
            z b = new z.a(NotificationPushAckWorker.class).k(new d.a().b(x.b).a()).o(input.a()).b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("NotificationPushAckWorkUniqueWork", j.f35288d, b);
        }

        public final void b(@NotNull Context appContext, @NotNull b.SettingChangeInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            q.h("NotificationOSSettingChangeReportingWorker", "Scheduling OS Notification Setting Change Reporting Work");
            z b = new z.a(NotificationPushAckWorker.class).k(new d.a().b(x.b).a()).o(input.a()).b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("NotificationOSSettingChangeReportingWorkerUniqueWork", j.f35286a, b);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "receivedTime", "notificationId", "metadataString", "notificationType", "", "priority", "originalPriority", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/work/b;", ve.a.f33391e, "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", j6.b.f21518e, "J", "getReceivedTime", "()J", "c", "getNotificationId", rl.d.f30696a, "getMetadataString", "e", "getNotificationType", "f", "I", "getPriority", "g", "getOriginalPriority", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$a, reason: from toString */
        public static final /* data */ class NotificationAckInput extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            public final long receivedTime;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String notificationId;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String metadataString;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String notificationType;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            public final int priority;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            public final int originalPriority;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotificationAckInput(@NotNull String deviceId, long j10, @NotNull String notificationId, @Nullable String str, @Nullable String str2, int i10, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                Intrinsics.checkNotNullParameter(notificationId, "notificationId");
                this.deviceId = deviceId;
                this.receivedTime = j10;
                this.notificationId = notificationId;
                this.metadataString = str;
                this.notificationType = str2;
                this.priority = i10;
                this.originalPriority = i11;
            }

            @NotNull
            public androidx.work.b a() {
                Pair[] pairArr = {s.a("deviceId", this.deviceId), s.a("receivedTime", Long.valueOf(this.receivedTime)), s.a("notificationId", this.notificationId), s.a("metadata", this.metadataString), s.a("notificationType", this.notificationType), s.a("priority", Integer.valueOf(this.priority)), s.a("originalPriority", Integer.valueOf(this.originalPriority))};
                b.a aVar = new b.a();
                for (int i10 = 0; i10 < 7; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                return aVar.a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationAckInput)) {
                    return false;
                }
                NotificationAckInput notificationAckInput = (NotificationAckInput) other;
                return Intrinsics.c(this.deviceId, notificationAckInput.deviceId) && this.receivedTime == notificationAckInput.receivedTime && Intrinsics.c(this.notificationId, notificationAckInput.notificationId) && Intrinsics.c(this.metadataString, notificationAckInput.metadataString) && Intrinsics.c(this.notificationType, notificationAckInput.notificationType) && this.priority == notificationAckInput.priority && this.originalPriority == notificationAckInput.originalPriority;
            }

            public int hashCode() {
                int hashCode = ((((this.deviceId.hashCode() * 31) + Long.hashCode(this.receivedTime)) * 31) + this.notificationId.hashCode()) * 31;
                String str = this.metadataString;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.notificationType;
                return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.priority)) * 31) + Integer.hashCode(this.originalPriority);
            }

            @NotNull
            public String toString() {
                return "NotificationAckInput(deviceId=" + this.deviceId + ", receivedTime=" + this.receivedTime + ", notificationId=" + this.notificationId + ", metadataString=" + this.metadataString + ", notificationType=" + this.notificationType + ", priority=" + this.priority + ", originalPriority=" + this.originalPriority + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "userId", "", "channels", "", "changedChannels", "<init>", "(Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V", "Landroidx/work/b;", ve.a.f33391e, "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", j6.b.f21518e, "J", "getUserId", "()J", "c", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", rl.d.f30696a, "Ljava/util/List;", "getChangedChannels", "()Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class SettingChangeInput extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* renamed from: b, reason: from kotlin metadata and from toString */
            public final long userId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> channels;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> changedChannels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SettingChangeInput(@NotNull String deviceId, long j10, @NotNull Map<String, String> channels, @NotNull List<String> changedChannels) {
                super(null);
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                Intrinsics.checkNotNullParameter(channels, "channels");
                Intrinsics.checkNotNullParameter(changedChannels, "changedChannels");
                this.deviceId = deviceId;
                this.userId = j10;
                this.channels = channels;
                this.changedChannels = changedChannels;
            }

            @NotNull
            public androidx.work.b a() {
                Pair[] pairArr = {s.a("deviceId", this.deviceId), s.a("userId", Long.valueOf(this.userId)), s.a("channelNames", this.channels.keySet().toArray(new String[0])), s.a("channelEnabledValues", this.channels.values().toArray(new String[0])), s.a("changedChannels", this.changedChannels.toArray(new String[0]))};
                b.a aVar = new b.a();
                for (int i10 = 0; i10 < 5; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                return aVar.a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingChangeInput)) {
                    return false;
                }
                SettingChangeInput settingChangeInput = (SettingChangeInput) other;
                return Intrinsics.c(this.deviceId, settingChangeInput.deviceId) && this.userId == settingChangeInput.userId && Intrinsics.c(this.channels, settingChangeInput.channels) && Intrinsics.c(this.changedChannels, settingChangeInput.changedChannels);
            }

            public int hashCode() {
                return (((((this.deviceId.hashCode() * 31) + Long.hashCode(this.userId)) * 31) + this.channels.hashCode()) * 31) + this.changedChannels.hashCode();
            }

            @NotNull
            public String toString() {
                return "SettingChangeInput(deviceId=" + this.deviceId + ", userId=" + this.userId + ", channels=" + this.channels + ", changedChannels=" + this.changedChannels + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker", f = "NotificationPushAckWorker.kt", l = {74}, m = "doWork", v = 1)
    public static final class c extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public Object f9358t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9359u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9360v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9361w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9362x;

        /* renamed from: y, reason: collision with root package name */
        public int f9363y;

        /* renamed from: z, reason: collision with root package name */
        public int f9364z;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return NotificationPushAckWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPushAckWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
    }

    public final c.a b(Throwable e10) {
        if (!(e10 instanceof m)) {
            if (e10 instanceof IOException) {
                c.a c10 = c.a.c();
                Intrinsics.checkNotNullExpressionValue(c10, "retry(...)");
                return c10;
            }
            c.a a10 = c.a.a();
            Intrinsics.checkNotNullExpressionValue(a10, "failure(...)");
            return a10;
        }
        int a11 = ((m) e10).a();
        if ((500 > a11 || a11 >= 600) && a11 != 429) {
            c.a a12 = c.a.a();
            Intrinsics.checkNotNull(a12);
            return a12;
        }
        c.a c11 = c.a.c();
        Intrinsics.checkNotNull(c11);
        return c11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:31|32))(2:33|(2:35|36)(2:37|(2:39|40)(11:41|(1:43)(1:61)|44|45|(3:47|(1:49)(1:59)|(6:51|52|(1:54)|55|56|(1:58)))|60|52|(0)|55|56|(0))))|12|13|(3:15|(1:17)(2:19|(1:21)(1:22))|18)|23|(2:25|26)(2:28|29)))|64|6|7|(0)(0)|12|13|(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
    
        r2 = gt.n.INSTANCE;
        r0 = gt.n.b(gt.o.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker.doWork(mt.b):java.lang.Object");
    }
}
