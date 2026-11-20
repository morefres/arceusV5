package hj;

import android.content.Context;
import kj.PushCategoryExpireMessageNotification;
import kj.PushNotificationMetadata;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class d {
    public final long a(String str) {
        return ek.g.a(str);
    }

    public void b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        long a10;
        PushCategoryExpireMessageNotification c10 = c(pushNotificationMetadata);
        if (c10 != null) {
            String g10 = g(c10);
            String f10 = f(c10);
            if (f10 == null || g10 == null) {
                return;
            }
            a10 = a(f10);
            switch (g10) {
                case "FriendRequestAccepted":
                case "PrivateMessageReceived":
                case "FriendRequestReceived":
                    h(e(g10), context, a10);
                    break;
                case "ChatNewMessage":
                    h(d(c10.getCategory()), context, a10);
                    break;
            }
        }
    }

    public PushCategoryExpireMessageNotification c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushCategoryExpireMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final j d(String str) {
        return u.c().b(str);
    }

    public final j e(String str) {
        return u.c().d(str);
    }

    public final String f(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedUpToDate();
        }
        return null;
    }

    public final String g(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedNotificationType();
        }
        return null;
    }

    public void h(j jVar, Context context, long j10) {
        if (jVar != null) {
            jVar.d(context, j10);
        }
    }
}
