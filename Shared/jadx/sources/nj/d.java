package nj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ek.m;
import ek.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.l0;
import rh.h;

/* loaded from: classes2.dex */
public class d implements f {
    public boolean A;
    public List<NameValuePair> B;
    public RichPushNotificationMedia C;
    public List<NotificationAction> D;

    /* renamed from: a, reason: collision with root package name */
    public String f27175a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f27176c;

    /* renamed from: d, reason: collision with root package name */
    public String f27177d;

    /* renamed from: e, reason: collision with root package name */
    public String f27178e;

    /* renamed from: f, reason: collision with root package name */
    public String f27179f;

    /* renamed from: g, reason: collision with root package name */
    public String f27180g;

    /* renamed from: h, reason: collision with root package name */
    public String f27181h;

    /* renamed from: i, reason: collision with root package name */
    public int f27182i;

    /* renamed from: j, reason: collision with root package name */
    public String f27183j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27184k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public long f27185l;

    /* renamed from: m, reason: collision with root package name */
    public String f27186m;

    /* renamed from: n, reason: collision with root package name */
    public String f27187n;

    /* renamed from: o, reason: collision with root package name */
    public String f27188o;

    /* renamed from: p, reason: collision with root package name */
    public String f27189p;

    /* renamed from: q, reason: collision with root package name */
    public PayloadNotificationChannel f27190q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27191r;

    /* renamed from: s, reason: collision with root package name */
    public String f27192s;

    /* renamed from: t, reason: collision with root package name */
    public int f27193t;

    /* renamed from: u, reason: collision with root package name */
    public String f27194u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27195v;

    /* renamed from: w, reason: collision with root package name */
    public final Map<String, f> f27196w;

    /* renamed from: x, reason: collision with root package name */
    public e f27197x;

    /* renamed from: y, reason: collision with root package name */
    public long f27198y;

    /* renamed from: z, reason: collision with root package name */
    public String f27199z;

    public d(Map<String, String> map) {
        String str;
        this.C = RichPushNotificationMedia.INSTANCE.b();
        this.D = Collections.EMPTY_LIST;
        this.f27175a = map.get("version");
        this.b = map.get("notificationType");
        this.f27176c = map.get("notificationId");
        this.f27177d = map.get("body");
        this.f27178e = map.get(Title.type);
        this.f27179f = map.get("iconUrl");
        this.f27180g = map.get("tag");
        this.f27181h = map.get("sound");
        this.f27182i = m.a(map.get("badge"), 1);
        this.f27183j = map.get("linkOnInteraction");
        this.f27188o = map.get("importanceChannel");
        this.f27189p = map.get("channelId");
        if (h.a().R0() && (str = map.get("channel")) != null) {
            this.f27190q = PayloadNotificationChannel.fromJson(str);
        }
        this.f27192s = map.get("groupId");
        if (h.a().t0()) {
            this.f27191r = Boolean.parseBoolean(map.get("doNotDisturbEnabled"));
        }
        this.f27193t = m.a(map.get("visibility"), 1);
        this.B = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith("ClientEventField.")) {
                this.B.add(new NameValuePair(str2, map.get(str2)));
            }
        }
        this.f27194u = map.get("notificationTypeData");
        this.f27195v = "CallReceived".equals(this.b);
        if (a1.q0()) {
            this.f27196w = new HashMap();
        } else {
            this.f27196w = G(map.get("states"));
        }
        try {
            Map<String, String> F = F(map.get("parameters"));
            if (F.containsKey("IsChatReplyEnabled")) {
                this.f27184k = Boolean.parseBoolean(F.get("IsChatReplyEnabled"));
            }
            if (F.containsKey("ConversationId")) {
                if (h.a().v2()) {
                    this.f27186m = F.get("ConversationId");
                } else {
                    this.f27185l = Long.parseLong(F.get("ConversationId"));
                }
            }
            if (F.containsKey("MessageId")) {
                this.f27187n = F.get("MessageId");
            }
        } catch (Exception unused) {
            this.f27184k = false;
            q.h("PushNotification", "Could not build notification reply payload");
        }
        try {
            if (map.containsKey("media")) {
                this.C = RichPushNotificationMedia.INSTANCE.a(map.get("media"));
            }
        } catch (Exception e10) {
            q.h("PushNotification", "Could not build rich push notification data from payload. Exception: " + e10);
        }
        String str3 = map.get("actions");
        if (str3 != null) {
            this.D = NotificationAction.getListFromJson(str3);
        }
        try {
            this.f27197x = e.valueOf(map.get("thumbnailType"));
            this.f27198y = Long.parseLong(map.get("thumbnailId"));
            this.f27199z = map.get("thumbnailDefaultUrl");
        } catch (Exception e11) {
            this.f27197x = e.none;
            this.f27198y = 0L;
            q.h("PushNotification", "Could not build thumbnail data from payload. Exception : " + e11);
        }
        try {
            Map<String, String> F2 = F(map.get("parameters"));
            if (F2.containsKey("IsForegroundDisabled")) {
                this.A = Boolean.parseBoolean(F2.get("IsForegroundDisabled"));
            } else {
                this.A = false;
            }
        } catch (Exception unused2) {
            this.A = false;
            q.h("PushNotification", "Could not build notification isForegroundPushDisabled payload");
        }
    }

    @Override // nj.f
    public String A() {
        return this.f27187n;
    }

    @Override // nj.f
    public String B() {
        return this.f27199z;
    }

    @Override // nj.f
    public long C() {
        return this.f27198y;
    }

    public String D() {
        return this.f27188o;
    }

    public String E() {
        return this.f27183j;
    }

    public final Map<String, String> F(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e10) {
                q.f("PushNotification", "Push notification param parse exception.", e10);
            }
        }
        return hashMap;
    }

    public final Map<String, f> G(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    HashMap hashMap2 = new HashMap();
                    String next = keys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        String string = jSONObject2.getString(next2);
                        if (!"notificationId".equals(next2) && !"tag".equals(next2) && !"notificationType".equals(next2)) {
                            hashMap2.put(next2, string);
                        }
                        string = String.format("%s-%s", string, next);
                        hashMap2.put(next2, string);
                    }
                    hashMap.put(next, new d(hashMap2));
                }
            } catch (JSONException e10) {
                q.f("PushNotification", "Push notification states parse exception.", e10);
            }
        }
        return hashMap;
    }

    @Override // nj.f
    public String a() {
        return this.f27180g;
    }

    @Override // nj.f
    public List<NameValuePair> b() {
        return this.B;
    }

    @Override // nj.f
    public String c() {
        return this.b;
    }

    @Override // nj.f
    public int d() {
        if (TextUtils.isEmpty(this.f27187n)) {
            return 3;
        }
        return this.f27187n.hashCode();
    }

    @Override // nj.f
    public boolean e() {
        return this.f27195v;
    }

    @Override // nj.f
    public int f() {
        return this.f27182i;
    }

    @Override // nj.f
    public PendingIntent g(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        if (h.a().t2()) {
            intent.setData(new Uri.Builder().scheme("roblox").authority("push").appendPath(String.valueOf(d())).appendQueryParameter("notificationId", getId() == null ? "" : getId()).appendQueryParameter("messageId", A() == null ? "" : A()).appendQueryParameter("link", E() != null ? E() : "").build());
        }
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", E());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getActivity(context, d(), intent, 301989888);
    }

    @Override // nj.f
    public String getBody() {
        return this.f27177d;
    }

    @Override // nj.f
    public String getGroupId() {
        return this.f27192s;
    }

    @Override // nj.f
    public String getId() {
        return this.f27176c;
    }

    @Override // nj.f
    public String getTitle() {
        return this.f27178e;
    }

    @Override // nj.f
    public int getVisibility() {
        return this.f27193t;
    }

    @Override // nj.f
    public Bundle h() {
        Bundle bundle = new Bundle();
        for (NameValuePair nameValuePair : this.B) {
            bundle.putString(nameValuePair.getName(), nameValuePair.getValue());
        }
        return bundle;
    }

    @Override // nj.f
    public int i(Context context) {
        String str = this.f27179f;
        if (str == null) {
            return l0.f30335j;
        }
        str.getClass();
        return l0.f30335j;
    }

    @Override // nj.f
    public boolean j() {
        return this.f27184k;
    }

    @Override // nj.f
    public boolean k() {
        return this.A;
    }

    @Override // nj.f
    public PayloadNotificationChannel l() {
        return this.f27190q;
    }

    @Override // nj.f
    public String m() {
        return "CallReceived".equals(this.b) ? "channel_calls" : D();
    }

    @Override // nj.f
    public PendingIntent n(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", E());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getBroadcast(context, d(), intent, 301989888);
    }

    @Override // nj.f
    public String o() {
        return this.f27175a;
    }

    @Override // nj.f
    @Deprecated
    public long p() {
        return this.f27185l;
    }

    @Override // nj.f
    public e q() {
        return this.f27197x;
    }

    @Override // nj.f
    public String r() {
        return this.f27194u;
    }

    @Override // nj.f
    public String s() {
        return this.f27189p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // nj.f
    public int t() {
        char c10;
        String str = this.f27188o;
        if (str == null) {
            return 0;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -850397647:
                if (str.equals("channel_medium")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -609273347:
                if (str.equals("channel_urgent")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -468778798:
                if (str.equals("channel_minimum")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
        }
        return 0;
    }

    @Override // nj.f
    public List<NotificationAction> u() {
        return this.D;
    }

    @Override // nj.f
    public RichPushNotificationMedia v() {
        return this.C;
    }

    @Override // nj.f
    public boolean w() {
        return this.f27191r;
    }

    @Override // nj.f
    public Uri x(Context context) {
        if (TextUtils.isEmpty(this.f27181h)) {
            return e() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f27181h.getClass();
        return null;
    }

    @Override // nj.f
    public Map<String, f> y() {
        return this.f27196w;
    }

    @Override // nj.f
    public String z() {
        return this.f27186m;
    }
}
