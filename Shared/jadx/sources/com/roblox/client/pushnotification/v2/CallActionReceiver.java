package com.roblox.client.pushnotification.v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j6.b;
import k2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.a;
import vl.g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/pushnotification/v2/CallActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallActionReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/roblox/client/pushnotification/v2/CallActionReceiver$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "callId", "notificationTag", "", "notificationRequestCode", "Landroid/content/Intent;", b.f21518e, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;", "c", "action", a.f33391e, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;", "ACTION_REJECT_CALL", "Ljava/lang/String;", "ACTION_SUPPRESS_CALL", "EXTRA_CALL_ID", "EXTRA_NOTIFICATION_TAG", "EXTRA_NOTIFICATION_REQUEST_CODE", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.pushnotification.v2.CallActionReceiver$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String action, String callId, String notificationTag, int notificationRequestCode) {
            Intent putExtra = new Intent(context, (Class<?>) CallActionReceiver.class).setAction(action).putExtra("EXTRA_CALL_ID", callId).putExtra("EXTRA_NOTIFICATION_TAG", notificationTag).putExtra("EXTRA_NOTIFICATION_REQUEST_CODE", notificationRequestCode);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        @NotNull
        public final Intent b(@NotNull Context context, @NotNull String callId, @NotNull String notificationTag, int notificationRequestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(notificationTag, "notificationTag");
            return a(context, "com.roblox.client.pushnotification.v2.ACTION_REJECT_CALL", callId, notificationTag, notificationRequestCode);
        }

        @NotNull
        public final Intent c(@NotNull Context context, @NotNull String callId, @NotNull String notificationTag, int notificationRequestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(notificationTag, "notificationTag");
            return a(context, "com.roblox.client.pushnotification.v2.ACTION_SUPPRESS_CALL", callId, notificationTag, notificationRequestCode);
        }

        public Companion() {
        }
    }

    @NotNull
    public static final Intent a(@NotNull Context context, @NotNull String str, @NotNull String str2, int i10) {
        return INSTANCE.b(context, str, str2, i10);
    }

    @NotNull
    public static final Intent b(@NotNull Context context, @NotNull String str, @NotNull String str2, int i10) {
        return INSTANCE.c(context, str, str2, i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("EXTRA_CALL_ID");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 739857104) {
                if (hashCode != 757560570 || !action.equals("com.roblox.client.pushnotification.v2.ACTION_SUPPRESS_CALL")) {
                    return;
                } else {
                    g.x().y(stringExtra);
                }
            } else if (!action.equals("com.roblox.client.pushnotification.v2.ACTION_REJECT_CALL")) {
                return;
            } else {
                g.x().v(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("EXTRA_NOTIFICATION_TAG");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                return;
            }
            n.f(context).b(stringExtra2, intent.getIntExtra("EXTRA_NOTIFICATION_REQUEST_CODE", 0));
        }
    }
}
