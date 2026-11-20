package mj;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import gt.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lmj/b;", "", "<init>", "()V", "", "Landroid/app/NotificationChannel;", "channels", "", "logicalId", "g", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "descriptor", rl.d.f30696a, "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;", "Lk2/n;", "notificationManager", "e", "(Lk2/n;Ljava/lang/String;)Ljava/util/List;", "installed", "f", "(Ljava/lang/String;Ljava/util/List;)Landroid/app/NotificationChannel;", "", "keepVersion", "", "c", "(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V", "registeredChannelId", "importance", j6.b.f21518e, "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;Ljava/lang/String;I)V", "h", "channel", ve.a.f33391e, "(Landroid/app/NotificationChannel;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f24555a = new b();

    @NotNull
    public static final String d(@NotNull Context context, @NotNull PayloadNotificationChannel descriptor) {
        Integer num;
        int intValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String id2 = descriptor.getId();
        Integer version = descriptor.getVersion();
        if (id2 == null || id2.length() == 0 || version == null) {
            return id2 == null ? "" : id2;
        }
        k2.n f10 = k2.n.f(context);
        Intrinsics.checkNotNullExpressionValue(f10, "from(...)");
        b bVar = f24555a;
        List<NotificationChannel> e10 = bVar.e(f10, id2);
        NotificationChannel f11 = bVar.f(id2, e10);
        if (f11 != null) {
            PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
            String id3 = f11.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            num = companion.c(id2, id3);
        } else {
            num = null;
        }
        if (f11 != null && num != null && num.intValue() >= version.intValue()) {
            bVar.c(f10, id2, e10, num.intValue());
            String id4 = f11.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getId(...)");
            return id4;
        }
        if (f11 == null || f11.getImportance() != 0) {
            Integer androidImportance = descriptor.getAndroidImportance();
            intValue = androidImportance != null ? androidImportance.intValue() : 3;
        } else {
            intValue = 0;
        }
        String a10 = PayloadNotificationChannel.INSTANCE.a(id2, version.intValue());
        bVar.b(context, descriptor, a10, intValue);
        bVar.c(f10, id2, e10, version.intValue());
        return a10;
    }

    @Nullable
    public static final String g(@NotNull List<NotificationChannel> channels, @Nullable String logicalId) {
        Object next;
        Intrinsics.checkNotNullParameter(channels, "channels");
        if (logicalId != null && logicalId.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : channels) {
                PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
                String id2 = notificationChannel.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                Integer c10 = companion.c(logicalId, id2);
                Pair a10 = (c10 == null || c10.intValue() < 1) ? null : s.a(c10, notificationChannel.getId());
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Pair) next).c()).intValue();
                    do {
                        Object next2 = it.next();
                        int intValue2 = ((Number) ((Pair) next2).c()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                return (String) pair.d();
            }
        }
        return null;
    }

    public final void a(NotificationChannel channel, PayloadNotificationChannel descriptor) {
        String str;
        String sound = descriptor.getSound();
        if (sound != null) {
            str = sound.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (Intrinsics.c(str, PayloadNotificationChannel.SOUND_NONE) || Intrinsics.c(str, "")) {
            channel.setSound(null, null);
        }
        Boolean vibration = descriptor.getVibration();
        if (vibration != null) {
            boolean booleanValue = vibration.booleanValue();
            channel.enableVibration(booleanValue);
            if (!booleanValue) {
                channel.setVibrationPattern(null);
            }
        }
        Boolean badge = descriptor.getBadge();
        if (badge != null) {
            channel.setShowBadge(badge.booleanValue());
        }
    }

    public final void b(Context context, PayloadNotificationChannel descriptor, String registeredChannelId, int importance) {
        NotificationChannel notificationChannel = new NotificationChannel(registeredChannelId, descriptor.getName(), importance);
        String description = descriptor.getDescription();
        if (description != null && description.length() != 0) {
            notificationChannel.setDescription(descriptor.getDescription());
        }
        String h10 = h(context, descriptor);
        if (h10 != null) {
            notificationChannel.setGroup(h10);
        }
        a(notificationChannel, descriptor);
        k2.n.f(context).c(notificationChannel);
    }

    public final void c(k2.n notificationManager, String logicalId, List<NotificationChannel> installed, int keepVersion) {
        for (NotificationChannel notificationChannel : installed) {
            PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
            String id2 = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            Integer c10 = companion.c(logicalId, id2);
            if (c10 != null && c10.intValue() < keepVersion) {
                notificationManager.e(notificationChannel.getId());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r3.c(r8, r4) != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.app.NotificationChannel> e(k2.n r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.List r7 = r7.k()
            java.lang.String r0 = "getNotificationChannels(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r7.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            r2 = 0
            if (r1 == 0) goto L35
            com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel$a r3 = com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel.INSTANCE
            java.lang.String r4 = r1.getId()
            java.lang.String r5 = "getId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.Integer r3 = r3.c(r8, r4)
            if (r3 == 0) goto L35
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 == 0) goto L14
            r0.add(r1)
            goto L14
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.b.e(k2.n, java.lang.String):java.util.List");
    }

    public final NotificationChannel f(String logicalId, List<NotificationChannel> installed) {
        Object obj;
        Iterator<T> it = installed.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
                String id2 = ((NotificationChannel) next).getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                Integer c10 = companion.c(logicalId, id2);
                int intValue = c10 != null ? c10.intValue() : 0;
                do {
                    Object next2 = it.next();
                    PayloadNotificationChannel.Companion companion2 = PayloadNotificationChannel.INSTANCE;
                    String id3 = ((NotificationChannel) next2).getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                    Integer c11 = companion2.c(logicalId, id3);
                    int intValue2 = c11 != null ? c11.intValue() : 0;
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (NotificationChannel) obj;
    }

    public final String h(Context context, PayloadNotificationChannel descriptor) {
        String groupId = descriptor.getGroupId();
        if (groupId != null && groupId.length() != 0) {
            k2.n f10 = k2.n.f(context);
            Intrinsics.checkNotNullExpressionValue(f10, "from(...)");
            if (f10.i(groupId) != null) {
                return groupId;
            }
            String groupName = descriptor.getGroupName();
            if (groupName != null && groupName.length() != 0) {
                f10.d(new NotificationChannelGroup(groupId, groupName));
                return groupId;
            }
        }
        return null;
    }
}
