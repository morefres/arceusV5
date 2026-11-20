package hj;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.PrivateMessageReceivedNotificationReceiver;
import kj.PrivateMessageNotification;
import rg.q0;

/* loaded from: classes2.dex */
public class l extends b<PrivateMessageNotification> {
    @Override // hj.b
    public String k(int i10) {
        return i10 == 2 ? "private_message_received" : "private_message_received_cleared";
    }

    @Override // hj.b
    public Class<?> l() {
        return PrivateMessageReceivedNotificationReceiver.class;
    }

    @Override // hj.b
    public String n(Context context) {
        return this.f19437a.i() == 1 ? String.format(context.getResources().getString(q0.U0), m().getAuthorUserName()) : String.format(context.getResources().getString(q0.R0), String.valueOf(this.f19437a.i()));
    }

    @Override // hj.b
    public int o() {
        return 2;
    }

    @Override // hj.b
    public String q() {
        return "PrivateMessageReceived";
    }

    @Override // hj.b
    public long r() {
        return ((PrivateMessageNotification) this.f19437a.b(r0.i() - 1)).getAuthorUserId();
    }

    @Override // kj.v.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean b(PrivateMessageNotification privateMessageNotification, PrivateMessageNotification privateMessageNotification2) {
        return privateMessageNotification.getMessageId() == privateMessageNotification2.getMessageId();
    }

    @Override // hj.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, PrivateMessageNotification privateMessageNotification) {
        if (this.f19437a.i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "PrivateMessageReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_CONVERSATION_ID", privateMessageNotification.getMessageId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    @Override // hj.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, PrivateMessageNotification privateMessageNotification) {
        return intent;
    }
}
