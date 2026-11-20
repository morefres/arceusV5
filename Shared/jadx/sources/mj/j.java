package mj;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.pushnotification.actions.NotificationActionBroadcastReceiver;
import com.roblox.client.pushnotification.v2.CallActionReceiver;
import com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.richpushnotifications.Options;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ek.q;
import hj.b0;
import hj.r;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import k2.k;
import k2.r;
import k2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.j0;
import rg.l0;
import rg.q0;
import rg.t0;
import vl.g;
import yj.e0;
import yj.k0;

/* loaded from: classes2.dex */
public class j implements c {

    public class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24569a;
        public final /* synthetic */ k.f b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nj.f f24570c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0 f24571d;

        public a(Context context, k.f fVar, nj.f fVar2, k0 k0Var) {
            this.f24569a = context;
            this.b = fVar;
            this.f24570c = fVar2;
            this.f24571d = k0Var;
        }

        @Override // yj.e0
        public void a() {
            j.this.q(this.f24569a, this.b, this.f24570c);
            this.f24571d.R(this);
        }

        @Override // yj.e0
        public void b() {
            this.f24571d.R(this);
        }
    }

    public class b implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24573a;
        public final /* synthetic */ Context b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f24574c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f24575d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Notification f24576e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f24577f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ nj.f f24578g;

        public b(String str, Context context, String str2, int i10, Notification notification, boolean z10, nj.f fVar) {
            this.f24573a = str;
            this.b = context;
            this.f24574c = str2;
            this.f24575d = i10;
            this.f24576e = notification;
            this.f24577f = z10;
            this.f24578g = fVar;
        }

        @Override // vl.g.a
        public void B(String str, boolean z10) {
            if (this.f24573a.equals(str) && z10) {
                k2.n.f(this.b).m(this.f24574c, this.f24575d, this.f24576e);
            }
        }

        @Override // vl.g.a
        public void U(String str) {
            if (this.f24573a.equals(str)) {
                k2.n.f(this.b).b(this.f24574c, this.f24575d);
                vl.g.x().w(this);
            }
        }

        @Override // vl.g.a
        public void m0(String str) {
            if (this.f24573a.equals(str)) {
                k2.n.f(this.b).b(this.f24574c, this.f24575d);
                vl.g.x().w(this);
            }
        }

        @Override // vl.g.a
        public void o(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // vl.g.a
        public void p(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // vl.g.a
        public void u(String str, String str2) {
            if (this.f24573a.equals(str)) {
                k2.n f10 = k2.n.f(this.b);
                f10.b(this.f24574c, this.f24575d);
                nj.f fVar = this.f24578g.y().get("Miss".equals(str2) ? "missed" : (!"Suppress".equals(str2) || this.f24577f) ? null : "voice not enabled");
                if (fVar != null && f10.a()) {
                    f10.m(fVar.a(), fVar.d(), j.this.k(this.b, fVar).c());
                }
                vl.g.x().w(this);
            }
        }
    }

    public static /* synthetic */ Unit b(nj.f fVar, Throwable th2) {
        Map a10;
        a10 = rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())});
        t0.o(fVar, a10);
        return Unit.f22894a;
    }

    public static /* synthetic */ Unit c(nj.f fVar, Throwable th2) {
        Map a10;
        a10 = rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())});
        t0.p(fVar, a10);
        return Unit.f22894a;
    }

    public static /* synthetic */ Unit e(k.c cVar, nj.f fVar, Bitmap bitmap) {
        Map a10;
        cVar.i(bitmap);
        a10 = rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")});
        t0.p(fVar, a10);
        return Unit.f22894a;
    }

    public static /* synthetic */ Unit f(RichPushNotificationMedia richPushNotificationMedia, k.c cVar, k.f fVar, nj.f fVar2, Bitmap bitmap) {
        Map a10;
        Options options = richPushNotificationMedia.getOptions();
        if (options != null && options.getHidePrimaryImageInExpandedView()) {
            cVar.h(null);
        }
        fVar.s(bitmap);
        a10 = rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")});
        t0.o(fVar2, a10);
        return Unit.f22894a;
    }

    @NonNull
    public static Intent m(Context context, nj.f fVar, NotificationAction notificationAction) {
        Intent intent = new Intent(context, (Class<?>) NotificationActionBroadcastReceiver.class);
        intent.setData(Uri.parse("roblox://action/" + fVar.a() + "/" + notificationAction.getId()));
        intent.putExtra("extra-action-id", notificationAction.getId());
        intent.putExtra("extra-action-url", notificationAction.getPostUrl());
        intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        intent.putExtra("extra-notification-request-code", fVar.d());
        intent.putExtra("extra-notification-tag", fVar.a());
        intent.putExtra("extra-notification-group-id", fVar.getGroupId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return intent;
    }

    @NonNull
    public static Intent n(Context context, nj.f fVar, NotificationAction notificationAction) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(notificationAction.getDeeplink()));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", notificationAction.getDeeplink());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        intent.putExtra("extra-notification-tag", fVar.a());
        intent.putExtra("extra-notification-request-code", fVar.d());
        intent.putExtra("extra-notification-group-id", fVar.getGroupId());
        if (notificationAction.getPostUrl() != null) {
            intent.putExtra("extra-action-id", notificationAction.getId());
            intent.putExtra("extra-action-url", notificationAction.getPostUrl());
            intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        }
        return intent;
    }

    @Override // mj.c
    public void a(final Context context, final nj.f fVar) {
        if (context == null || fVar == null) {
            return;
        }
        if (rh.h.a().N4() && "Heartbeat".equals(fVar.c())) {
            return;
        }
        if (!rh.h.a().t0() || u(context, fVar)) {
            final k.f k10 = k(context, fVar);
            if (!a1.q0() && "CallReceived".equals(fVar.c())) {
                if (com.roblox.client.startup.a.m()) {
                    q(context, k10, fVar);
                    return;
                }
                k0 s8 = k0.s(context.getApplicationContext());
                s8.K(new a(context, k10, fVar, s8));
                s8.O();
                return;
            }
            final RichPushNotificationMedia v5 = fVar.v();
            if (v5 != null) {
                oj.b.f27891a.c(context, v5.getPrimaryImage(), v5.getSecondaryImage(), 5000L, new Function1() { // from class: mj.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit r8;
                        r8 = j.this.r(v5, k10, fVar, context, (oj.a) obj);
                        return r8;
                    }
                });
                return;
            }
            Consumer<Bitmap> consumer = new Consumer() { // from class: mj.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j.this.s(k10, context, fVar, (Bitmap) obj);
                }
            };
            if (fVar.q() == nj.e.user) {
                b0.f19438a.c(context, fVar.C(), consumer);
            } else {
                b0.f19438a.b(context, fVar.B(), consumer);
            }
        }
    }

    public final void j(Context context, nj.f fVar, k.f fVar2) {
        for (NotificationAction notificationAction : fVar.u()) {
            int hash = Objects.hash(Integer.valueOf(fVar.d()), notificationAction.getId());
            boolean isEmpty = TextUtils.isEmpty(notificationAction.getDeeplink());
            boolean z10 = !isEmpty;
            k.a.C0391a c0391a = new k.a.C0391a(0, notificationAction.getLabel(), !isEmpty ? PendingIntent.getActivity(context, hash, n(context, fVar, notificationAction), 201326592) : PendingIntent.getBroadcast(context, hash, m(context, fVar, notificationAction), 201326592));
            c0391a.e(notificationAction.getRequireUnlock());
            c0391a.f(z10);
            fVar2.b(c0391a.b());
        }
    }

    public final k.f k(Context context, nj.f fVar) {
        k.f fVar2 = new k.f(context, o(context, fVar));
        fVar2.j(fVar.g(context));
        fVar2.n(fVar.n(context));
        fVar2.x(fVar.t());
        fVar2.F(fVar.getVisibility());
        fVar2.z(fVar.i(context));
        fVar2.l(fVar.getTitle());
        fVar2.k(fVar.getBody());
        fVar2.f(true);
        fVar2.v(fVar.f());
        fVar2.A(fVar.x(context));
        fVar2.w(fVar.e());
        j(context, fVar, fVar2);
        fVar2.q(fVar.getGroupId());
        if (fVar.j()) {
            String string = context.getString(q0.L0);
            fVar2.b(new k.a.C0391a(l0.b, string, p(context, fVar)).a(new t.d("key_reply_message").b(string).a()).d(true).b());
        }
        fVar2.B(new k.d().h(fVar.getBody()));
        return fVar2;
    }

    public final Intent l(Context context, nj.f fVar, long j10, String str, String str2, String str3) {
        String format = str2 != null ? String.format(Locale.ROOT, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s", Long.valueOf(j10), str2, str3) : str != null ? String.format(Locale.ROOT, "roblox://placeId=%d&gameInstanceId=%s&callId=%s", Long.valueOf(j10), str, str3) : String.format(Locale.ROOT, "roblox://placeId=%d&callId=%s", Long.valueOf(j10), str3);
        Intent intent = new Intent("push_notification_action");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(format));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", format);
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return intent;
    }

    public final String o(Context context, nj.f fVar) {
        return (rh.h.a().t0() && fVar.w()) ? nj.b.f27156x.getId() : r.k().C(context, fVar);
    }

    public final PendingIntent p(Context context, nj.f fVar) {
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        if (rh.h.a().v2()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", fVar.z());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", fVar.p());
        }
        intent.putExtra("tag", fVar.a());
        intent.putExtra("EXTRA_MESSAGE_ID", fVar.A());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", fVar.getTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return PendingIntent.getBroadcast(context, fVar.d(), intent, 301989888);
    }

    public final void q(Context context, k.f fVar, nj.f fVar2) {
        Intent intent;
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        int i11;
        PendingIntent pendingIntent;
        Context context2;
        String str5;
        String str6;
        long j11;
        Intent b10;
        PendingIntent broadcast;
        if (!rh.h.a().b4()) {
            q.h("Sendr1PushNotificationHandler", "EnableAndroidCallPushNotification=false, dropping incoming call push.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(fVar2.r());
            String string = jSONObject.getString("CallId");
            String string2 = jSONObject.getString("InstanceId");
            String string3 = jSONObject.getString("ReservedServerAccessCode");
            long j12 = jSONObject.getLong("CallerId");
            String string4 = jSONObject.getString("CallerCombinedName");
            long j13 = jSONObject.getLong("CalleeId");
            String string5 = jSONObject.getString("CalleeCombinedName");
            long j14 = jSONObject.getLong("PlaceId");
            long j15 = jSONObject.getLong("CreatedUtc");
            boolean z10 = jSONObject.getBoolean("IsCalleeMicEnabled");
            String a10 = fVar2.a();
            int d10 = fVar2.d();
            Intent a11 = CallActionReceiver.a(context, string, a10, d10);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, d10, a11, 201326592);
            if (z10) {
                intent = a11;
                j10 = j12;
                str4 = a10;
                i11 = 201326592;
                pendingIntent = broadcast2;
                i10 = d10;
                context2 = context;
                b10 = l(context2, fVar2, j14, string2, string3, string);
                str2 = string2;
                str3 = string3;
                str5 = string;
                str = string5;
                str6 = string4;
                j11 = j14;
                broadcast = PendingIntent.getActivity(context2, i10, b10, 201326592);
            } else {
                intent = a11;
                j10 = j12;
                str = string5;
                str2 = string2;
                str3 = string3;
                str4 = a10;
                i10 = d10;
                i11 = 201326592;
                pendingIntent = broadcast2;
                context2 = context;
                str5 = string;
                str6 = string4;
                j11 = j14;
                b10 = CallActionReceiver.b(context2, str5, str4, i10);
                broadcast = PendingIntent.getBroadcast(context2, i10, b10, 201326592);
            }
            PendingIntent pendingIntent2 = broadcast;
            long j16 = j10;
            Intent intent2 = b10;
            Context context3 = context2;
            String str7 = str6;
            PendingIntent activity = PendingIntent.getActivity(context3, i10, IncomingCallActivity.H1(context3, intent2, intent, j16, str6, z10), i11);
            fVar.B(k.g.h(new r.c().e(str7).a(), pendingIntent, pendingIntent2).o(context3.getResources().getColor(j0.f30305c)).p(context3.getResources().getColor(j0.f30306d)));
            fVar.j(activity);
            fVar.p(activity, true);
            fVar.E(hj.n.b);
            Notification c10 = fVar.c();
            if (fVar2.e()) {
                c10.flags |= 36;
            }
            vl.g.x().g(new b(str4, context, str4, i10, c10, z10, fVar2));
            vl.g.x().u(str5, j16, str7, j13, str, j11, str2, str3, j15, z10, fVar2.getId());
        } catch (JSONException e10) {
            q.f("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e10);
        }
    }

    public final /* synthetic */ Unit r(final RichPushNotificationMedia richPushNotificationMedia, final k.f fVar, final nj.f fVar2, Context context, oj.a aVar) {
        final k.c cVar = new k.c();
        aVar.b(new Function1() { // from class: mj.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.f(RichPushNotificationMedia.this, cVar, fVar, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: mj.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.b(nj.f.this, (Throwable) obj);
            }
        });
        aVar.a(new Function1() { // from class: mj.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e(k.c.this, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: mj.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.c(nj.f.this, (Throwable) obj);
            }
        });
        fVar.B(cVar);
        k2.n.f(context).m(fVar2.a(), fVar2.d(), fVar.c());
        t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
        return Unit.f22894a;
    }

    public final /* synthetic */ void s(k.f fVar, Context context, nj.f fVar2, Bitmap bitmap) {
        if (bitmap != null) {
            fVar.s(bitmap);
        }
        k2.n.f(context).m(fVar2.a(), fVar2.d(), fVar.c());
        t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
    }

    public final void t(Context context, String str, String str2, nj.f fVar) {
        NotificationManager notificationManager;
        StatusBarNotification[] activeNotifications;
        if (TextUtils.isEmpty(str) || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) {
            return;
        }
        k.h hVar = new k.h();
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && str.equals(k2.k.b(notification)) && !k2.k.c(notification) && (i10 = i10 + 1) <= 2) {
                CharSequence charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE);
                hVar.h(charSequence != null ? charSequence.toString() : "");
            }
        }
        k2.n f10 = k2.n.f(context);
        String str3 = "summary_" + str;
        if (i10 < 1) {
            f10.b(str3, 0);
            return;
        }
        String string = context.getString(q0.T0, String.valueOf(i10));
        String string2 = context.getString(q0.S0, String.valueOf(i10));
        hVar.i(string);
        f10.m(str3, 0, new k.f(context, str2).z(fVar.i(context)).l(string).k(string2).q(str).r(true).B(hVar).c());
    }

    public final boolean u(Context context, nj.f fVar) {
        if (!fVar.w()) {
            return true;
        }
        NotificationChannel h10 = k2.n.f(context).h(hj.r.k().C(context, fVar));
        return h10 == null || h10.getImportance() > 0;
    }
}
