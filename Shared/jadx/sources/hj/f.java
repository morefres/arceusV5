package hj;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import kj.FriendRequestAcceptedNotification;
import rg.q0;

/* loaded from: classes2.dex */
public class f extends b<FriendRequestAcceptedNotification> {
    @Override // hj.b
    public String k(int i10) {
        return i10 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override // hj.b
    public Class<?> l() {
        return FriendRequestAcceptedNotificationReceiver.class;
    }

    @Override // hj.b
    public String n(Context context) {
        String str;
        kj.v<T> vVar = this.f19437a;
        String username = ((FriendRequestAcceptedNotification) vVar.b(vVar.i() - 1)).getUsername();
        if (this.f19437a.i() > 1) {
            kj.v<T> vVar2 = this.f19437a;
            str = ((FriendRequestAcceptedNotification) vVar2.b(vVar2.i() - 2)).getUsername();
        } else {
            str = "";
        }
        if (this.f19437a.i() == 1) {
            return String.format(context.getResources().getString(q0.V0), username);
        }
        if (this.f19437a.i() == 2) {
            return String.format(context.getResources().getString(q0.Y0), username, str);
        }
        if (this.f19437a.i() == 3) {
            return String.format(context.getResources().getString(q0.W0), username, str);
        }
        if (this.f19437a.i() > 3) {
            return String.format(context.getResources().getString(q0.P0), username, str);
        }
        return null;
    }

    @Override // hj.b
    public int o() {
        return 1;
    }

    @Override // hj.b
    public String q() {
        return "FriendRequestAccepted";
    }

    @Override // hj.b
    public long r() {
        return ((FriendRequestAcceptedNotification) this.f19437a.b(0)).getUserId();
    }

    @Override // kj.v.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean b(FriendRequestAcceptedNotification friendRequestAcceptedNotification, FriendRequestAcceptedNotification friendRequestAcceptedNotification2) {
        return friendRequestAcceptedNotification.getUserId() == friendRequestAcceptedNotification2.getUserId();
    }

    @Override // hj.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, FriendRequestAcceptedNotification friendRequestAcceptedNotification) {
        if (this.f19437a.i() <= 1) {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", friendRequestAcceptedNotification.getUserId());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        return intent;
    }

    @Override // hj.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, FriendRequestAcceptedNotification friendRequestAcceptedNotification) {
        return intent;
    }
}
