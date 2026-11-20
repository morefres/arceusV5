package com.roblox.client.pushnotification.ossettingsreporting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.datastructures.NameValuePair;
import gt.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.o;
import kotlin.collections.p0;
import kotlin.collections.q;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import org.jetbrains.annotations.NotNull;
import rg.a1;
import ti.h;
import ug.r;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R(\u0010\u001a\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationOSSettingsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", ve.a.f33391e, "(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;", "", "Ljava/util/Set;", "expectedActions", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", j6.b.f21518e, "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "getNotificationWorkerScheduler$NativeShell_googleProdRelease", "()Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "setNotificationWorkerScheduler$NativeShell_googleProdRelease", "(Lcom/roblox/client/pushnotification/ossettingsreporting/b;)V", "getNotificationWorkerScheduler$NativeShell_googleProdRelease$annotations", "notificationWorkerScheduler", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationOSSettingsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<String> expectedActions = q0.g("android.app.action.APP_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public b notificationWorkerScheduler = new c();

    public final List<String> a(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 452039370) {
                if (hashCode == 806551504) {
                    if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED") && (stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID")) != null) {
                        return r.f32827a.b(context, stringExtra);
                    }
                    return null;
                }
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED") && (stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID")) != null) {
                    return o.d(stringExtra2);
                }
                return null;
            }
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                return o.d("notifications_enabled");
            }
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (CollectionsKt.W(this.expectedActions, intent.getAction())) {
            a1.g0(context);
            List<String> a10 = a(context, intent);
            if (a10 == null) {
                return;
            }
            List<NameValuePair> l10 = hj.r.l();
            Intrinsics.checkNotNullExpressionValue(l10, "getNotificationSettings(...)");
            List<NameValuePair> list = l10;
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.c(j0.f(q.u(list, 10)), 16));
            for (NameValuePair nameValuePair : list) {
                Pair a11 = s.a(nameValuePair.getName(), nameValuePair.getValue());
                linkedHashMap.put(a11.c(), a11.d());
            }
            long g10 = h.e().g();
            if (g10 == -1) {
                ek.q.b("NotificationOSSettingsBroadcastReceiver", "No valid user ID found.");
                return;
            }
            Set b = p0.b();
            Iterator<E> it = nj.a.b().iterator();
            while (it.hasNext()) {
                b.add(((nj.a) it.next()).getId());
            }
            Iterator<E> it2 = nj.b.c().iterator();
            while (it2.hasNext()) {
                b.add(((nj.b) it2.next()).getId());
            }
            b.add("notifications_enabled");
            b.add("post_notifications_permission_granted");
            Set a12 = p0.a(b);
            List<String> list2 = a10;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (a12.contains((String) it3.next())) {
                        b bVar = this.notificationWorkerScheduler;
                        String mDeviceId = a1.f30261t;
                        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
                        bVar.a(context, linkedHashMap, a10, mDeviceId, g10);
                        return;
                    }
                }
            }
            ek.q.b("NotificationOSSettingsBroadcastReceiver", "No relevant channel changes detected.");
        }
    }
}
