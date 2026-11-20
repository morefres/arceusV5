package rg;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.engine.jni.NativeReportingInterface;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f30590a;

    public static void A() {
        ug.j.q().s();
    }

    public static List<NameValuePair> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    public static void b(Context context, String str) {
        ug.j.q().c(str, rh.h.a().f4() ? ek.t.c(context) : -1L);
    }

    public static void c(String str, String str2, String str3, String str4) {
        ug.j.q().d(str, str2, str3, str4);
    }

    public static void d(String str, String str2) {
        ug.j.q().e(str, str2);
    }

    public static void e(String str, String str2, String str3) {
        ug.j.q().f(str, str2, str3);
    }

    public static void f(String str, String str2, String str3) {
        ug.j.q().g(str, str2, str3);
    }

    public static void g(String str, String str2, int i10, int i11) {
        ug.j.q().h(str, str2, i10, i11);
    }

    public static void h(String str, String str2) {
        i(str, str2, null);
    }

    public static void i(String str, String str2, List<NameValuePair> list) {
        ug.j.q().i(str, str2, list);
    }

    public static void j(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Payload.TYPE, str2));
        i(str, "logout", arrayList);
    }

    public static void k(String str) {
        ug.m.c("androidNotificationsSettings", str, new ArrayList(hj.r.l()), false);
    }

    public static void l(String str, boolean z10) {
        ug.j.q().j(str, z10);
    }

    public static void m(String str, String str2, String str3, String str4) {
        List<NameValuePair> a10 = a(str, str2, str3);
        a10.add(new NameValuePair("notificationUrl", str4));
        i("pushNotificationAction", "deepLink", a10);
        A();
    }

    public static void n(String str, String str2, nj.f fVar, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Title.type, fVar.getTitle()));
        arrayList.add(new NameValuePair("badge", Integer.toString(fVar.f())));
        if (fVar.v() != null) {
            RichPushNotificationMedia v5 = fVar.v();
            arrayList.add(new NameValuePair("primaryIcon", v5.getPrimaryImage() != null ? v5.getPrimaryImage().toString() : null));
            arrayList.add(new NameValuePair("secondaryIcon", v5.getSecondaryImage() != null ? v5.getSecondaryImage().toString() : null));
        }
        arrayList.add(new NameValuePair("notificationType", fVar.c()));
        arrayList.add(new NameValuePair("notificationId", fVar.getId()));
        arrayList.add(new NameValuePair("version", fVar.o()));
        arrayList.add(new NameValuePair("groupId", fVar.getGroupId()));
        arrayList.add(new NameValuePair("channelId", fVar.s()));
        arrayList.add(new NameValuePair("recipient", Long.toString(dk.c.c().j())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("extraParams", map != null ? new JSONObject(map).toString() : null));
        arrayList.addAll(fVar.b());
        arrayList.addAll(hj.r.l());
        ug.m.c(str2, str, arrayList, false);
    }

    public static void o(nj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionPrimaryImageAttachment", fVar, map);
    }

    public static void p(nj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionSecondaryImageAttachment", fVar, map);
    }

    public static void q(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, List<NameValuePair> list) {
        List<NameValuePair> a10 = a(str3, str4, str7);
        a10.add(new NameValuePair("actionTaken", str5));
        a10.add(new NameValuePair("clientState", str6));
        a10.add(new NameValuePair("openedClient", z10 ? "true" : "false"));
        a10.add(new NameValuePair("platformType", str2));
        a10.addAll(list);
        a10.addAll(hj.r.l());
        ArrayList arrayList = new ArrayList(a10);
        for (Map.Entry<String, String> entry : NativeReportingInterface.getPushNotificationSessionInfo(str).entrySet()) {
            arrayList.add(new NameValuePair(entry.getKey(), entry.getValue()));
        }
        NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, a10);
        ug.m.c("pushNotificationInteractedV2", str, arrayList, false);
    }

    public static void r(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, List<NameValuePair> list) {
        q(str, str2, str3, str4, null, str5, z10, str6, str7, list);
    }

    public static void s(String str, String str2, String str3) {
        t(str, str2, null, null, str3, "0", new ArrayList());
    }

    public static void t(String str, String str2, String str3, String str4, String str5, String str6, List<NameValuePair> list) {
        List<NameValuePair> a10 = a(str3, str4, str6);
        a10.add(new NameValuePair("clientState", str5));
        a10.add(new NameValuePair("platformType", str2));
        a10.addAll(list);
        a10.addAll(hj.r.l());
        if (rh.h.a().V5()) {
            return;
        }
        ug.m.c("pushNotificationReceived", str, a10, false);
        if (!rh.h.a().x2() || str4 == null) {
            return;
        }
        ug.q.a(str4);
    }

    public static void u(String str, nj.f fVar, Map<String, String> map) {
        n(str, "pushNotificationReceivedExtension", fVar, map);
    }

    public static void v(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f30590a) == null || !str2.equalsIgnoreCase(str)) {
            ek.q.b("rbx.eventstream", "fireScreenLoaded() " + str);
            f30590a = str;
            ug.j.q().k(str);
        }
    }

    public static void w(String str, String str2) {
        ug.j.q().l(str, str2);
        A();
    }

    public static void x(String str, String str2) {
        ug.j.q().m(str, str2);
        A();
    }

    public static void y(String str) {
        ug.j.q().n(str);
    }

    public static void z() {
        ug.j.q().o();
    }
}
