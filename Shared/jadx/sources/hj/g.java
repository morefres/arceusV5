package hj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import k2.k;
import kj.FriendRequestReceivedNotification;
import rg.l0;
import rg.q0;

/* loaded from: classes2.dex */
public class g extends b<FriendRequestReceivedNotification> {
    public final PendingIntent A(FriendRequestReceivedNotification friendRequestReceivedNotification, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FriendRequestReceivedNotificationReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", friendRequestReceivedNotification.getUserId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", friendRequestReceivedNotification.getNotificationId());
        return PendingIntent.getBroadcast(context, 0, intent, 301989888);
    }

    @Override // hj.b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, FriendRequestReceivedNotification friendRequestReceivedNotification) {
        if (this.f19437a.i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", friendRequestReceivedNotification.getUserId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    @Override // hj.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, FriendRequestReceivedNotification friendRequestReceivedNotification) {
        return intent;
    }

    @Override // hj.b
    public String k(int i10) {
        return i10 == 2 ? "friend_request_received" : "friend_request_received_cleared";
    }

    @Override // hj.b
    public Class<?> l() {
        return FriendRequestReceivedNotificationReceiver.class;
    }

    @Override // hj.b
    public String n(Context context) {
        if (this.f19437a.i() == 1) {
            String string = context.getResources().getString(q0.f30446a1);
            kj.v<T> vVar = this.f19437a;
            return String.format(string, y((FriendRequestReceivedNotification) vVar.b(vVar.i() - 1)));
        }
        if (this.f19437a.i() == 2) {
            String string2 = context.getResources().getString(q0.Z0);
            kj.v<T> vVar2 = this.f19437a;
            String y10 = y((FriendRequestReceivedNotification) vVar2.b(vVar2.i() - 1));
            kj.v<T> vVar3 = this.f19437a;
            return String.format(string2, y10, y((FriendRequestReceivedNotification) vVar3.b(vVar3.i() - 2)));
        }
        if (this.f19437a.i() == 3) {
            String string3 = context.getResources().getString(q0.X0);
            kj.v<T> vVar4 = this.f19437a;
            String y11 = y((FriendRequestReceivedNotification) vVar4.b(vVar4.i() - 1));
            kj.v<T> vVar5 = this.f19437a;
            return String.format(string3, y11, y((FriendRequestReceivedNotification) vVar5.b(vVar5.i() - 2)));
        }
        if (this.f19437a.i() <= 3) {
            return null;
        }
        String string4 = context.getResources().getString(q0.Q0);
        kj.v<T> vVar6 = this.f19437a;
        String y12 = y((FriendRequestReceivedNotification) vVar6.b(vVar6.i() - 1));
        kj.v<T> vVar7 = this.f19437a;
        return String.format(string4, y12, y((FriendRequestReceivedNotification) vVar7.b(vVar7.i() - 2)));
    }

    @Override // hj.b
    public int o() {
        return 0;
    }

    @Override // hj.b
    public String q() {
        return "FriendRequestReceived";
    }

    @Override // hj.b
    public long r() {
        return ((FriendRequestReceivedNotification) this.f19437a.b(0)).getUserId();
    }

    @Override // hj.b
    public void w(Context context, k.f fVar) {
        if (this.f19437a.e()) {
            return;
        }
        if (this.f19437a.i() == 1) {
            x(context, fVar, (FriendRequestReceivedNotification) this.f19437a.b(0));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, fVar.c());
    }

    public final k.f x(Context context, k.f fVar, FriendRequestReceivedNotification friendRequestReceivedNotification) {
        fVar.a(l0.f30327a, context.getString(q0.J0), A(friendRequestReceivedNotification, context, "friend_request_received_accepted"));
        fVar.a(l0.f30334i, context.getString(q0.K0), A(friendRequestReceivedNotification, context, "friend_request_received_ignored"));
        return fVar;
    }

    public final String y(FriendRequestReceivedNotification friendRequestReceivedNotification) {
        return friendRequestReceivedNotification.getUsername();
    }

    @Override // kj.v.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean b(FriendRequestReceivedNotification friendRequestReceivedNotification, FriendRequestReceivedNotification friendRequestReceivedNotification2) {
        return friendRequestReceivedNotification.getUserId() == friendRequestReceivedNotification2.getUserId();
    }
}
