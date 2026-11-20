package hj;

import android.content.Context;
import kj.PushExpiryMessageNotification;
import kj.PushNotificationMetadata;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class e {
    public void a(Context context, j jVar, String str) {
        if (jVar != null) {
            jVar.a(context, str);
        }
    }

    public void b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        PushExpiryMessageNotification c10 = c(pushNotificationMetadata);
        if (c10 != null) {
            String f10 = f(c10);
            String e10 = e(c10);
            if (f10 == null || e10 == null) {
                return;
            }
            a(context, d(f10), e10);
        }
    }

    public PushExpiryMessageNotification c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushExpiryMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final j d(String str) {
        return u.c().d(str);
    }

    public final String e(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationId();
        }
        return null;
    }

    public final String f(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationType();
        }
        return null;
    }
}
