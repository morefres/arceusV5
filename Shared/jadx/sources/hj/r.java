package hj;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.backgroundjob.PushNotificationSettingsWorker;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import hj.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj.PushNotificationTokenRetrieved;
import kj.RegisterDeviceResponse;
import kj.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rg.a1;
import rg.t0;
import x5.p0;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public Bundle f19464a;
    public d b = new a();

    public class a implements d {
        public a() {
        }

        @Override // hj.r.d
        public void a(RegisterDeviceResponse registerDeviceResponse, Context context) {
            if (context == null || registerDeviceResponse.getPlatform() == null || r.this.q(context) == null) {
                return;
            }
            r.this.H(context, registerDeviceResponse.getPlatform(), new x(), r.this.q(context).b());
            if (a1.q0()) {
                return;
            }
            r.this.D(context);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final r f19466a = new r();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a(RegisterDeviceResponse registerDeviceResponse, Context context);
    }

    public static void E(Context context) {
        if (a1.q0()) {
            return;
        }
        PushNotificationSettingsWorker.INSTANCE.b(p0.h(context));
    }

    public static /* synthetic */ Unit a(d dVar, Context context, RegisterDeviceResponse registerDeviceResponse) {
        dVar.a(registerDeviceResponse, context);
        return Unit.f22894a;
    }

    public static /* synthetic */ Unit b() {
        ev.c.d().j(new oh.h("PushNotificationRegistrationFailed"));
        return Unit.f22894a;
    }

    public static void f(Context context, nj.b bVar) {
        k2.n f10 = k2.n.f(context);
        NotificationChannel notificationChannel = new NotificationChannel(bVar.getId(), context.getApplicationContext().getApplicationContext().getString(bVar.getNameId()), bVar.getImportance());
        if (rh.h.a().t0()) {
            if (bVar.getGroup() != null) {
                notificationChannel.setGroup(bVar.getGroup().getId());
            }
            if (bVar.getDescription() != null) {
                notificationChannel.setDescription(context.getApplicationContext().getString(bVar.getDescription().intValue()));
            }
        }
        if (!bVar.getUseDefaultChannelAttributes()) {
            notificationChannel.setSound(bVar.getRingtoneUri(), bVar.getRingtoneAttributes());
            notificationChannel.setVibrationPattern(bVar.getVibrationPattern());
        }
        f10.c(notificationChannel);
    }

    public static r k() {
        return b.f19466a;
    }

    @NonNull
    public static List<NameValuePair> l() {
        ArrayList arrayList = new ArrayList();
        Context f10 = RobloxApplication.f();
        if (f10 != null) {
            HashMap hashMap = new HashMap(ug.r.a(f10));
            hashMap.put("channel_settings", ug.r.d(f10));
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    public void A(Context context, boolean z10, s sVar) {
        if (sVar != null) {
            sVar.d(context, z10);
        }
    }

    public void B(Context context, boolean z10, jj.a aVar, x xVar, d dVar, c cVar) {
        if (!z10) {
            aVar.a(cVar);
            return;
        }
        s q10 = q(context);
        if (q10 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z(context, true);
            return;
        }
        String c10 = q10.c();
        String m10 = m(null, context, xVar, c10);
        if (m10 == null || c10 == null) {
            return;
        }
        F(context, m10, null, true, aVar, dVar);
    }

    public String C(Context context, nj.f fVar) {
        nj.b bVar;
        PayloadNotificationChannel l10;
        if (rh.h.a().R0() && (l10 = fVar.l()) != null) {
            try {
                return mj.b.d(context, l10);
            } catch (RuntimeException e10) {
                ek.q.f("rbx.push", "Failed to register payload notification channel", e10);
            }
        }
        k2.n f10 = k2.n.f(context);
        String s8 = fVar.s();
        String g10 = mj.b.g(f10.k(), s8);
        if (g10 != null) {
            f10.e(s8);
            return g10;
        }
        if (f10.h(s8) != null) {
            return s8;
        }
        Iterator<E> it = nj.b.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (nj.b) it.next();
            if (bVar.getId().equals(s8)) {
                break;
            }
        }
        if (bVar == null) {
            return rh.h.a().t0() ? nj.b.A.getId() : fVar.m();
        }
        f(context, bVar);
        return bVar.getId();
    }

    public final void D(Context context) {
        PushNotificationSettingsWorker.INSTANCE.b(p0.h(context));
    }

    public void F(final Context context, String str, String str2, boolean z10, jj.a aVar, final d dVar) {
        if (aVar == null || str == null || dVar == null) {
            return;
        }
        aVar.f(str, str2, z10, new Function1() { // from class: hj.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.a(r.d.this, context, (RegisterDeviceResponse) obj);
            }
        }, new Function0() { // from class: hj.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b();
            }
        });
    }

    public void G(Bundle bundle) {
        this.f19464a = bundle;
    }

    public void H(Context context, String str, x xVar, String str2) {
        if (str2 == null || xVar == null) {
            return;
        }
        ek.q.b("rbx.push", str2 + " " + str);
        xVar.g(context, str2, str);
    }

    public final void g(Context context, nj.b bVar) {
        k2.n.f(context).e(bVar.getId());
    }

    public final void h(Context context) {
        k2.n f10 = k2.n.f(context);
        Iterator<String> it = j().iterator();
        while (it.hasNext()) {
            f10.e(it.next());
        }
    }

    public Bundle i() {
        Bundle bundle = this.f19464a;
        if (bundle != null) {
            this.f19464a = null;
        }
        return bundle;
    }

    public final List<String> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("channel_games");
        if (a1.q0()) {
            arrayList.add("channel_calls");
        }
        return arrayList;
    }

    public final String m(String str, Context context, x xVar, String str2) {
        if (xVar == null || str2 == null) {
            return null;
        }
        String a10 = xVar.a(context, str2);
        if (a10 == null || !a10.equals(str)) {
            return a10;
        }
        return null;
    }

    public String n(Context context) {
        s q10 = q(context);
        if (q10 != null) {
            return q10.b();
        }
        return null;
    }

    public h0 o(Context context) {
        s q10 = q(context);
        return q10 != null ? q10.a() : h0.f22695a;
    }

    public String p(Context context, String str, x xVar, String str2) {
        String m10 = m(str, context, xVar, str2);
        H(context, str, xVar, str2);
        return m10;
    }

    public final s q(Context context) {
        return t.g().h(context);
    }

    public String r(Context context) {
        s q10 = q(context);
        if (q10 != null) {
            return q10.c();
        }
        return null;
    }

    public void s(final Context context) {
        Context context2;
        x xVar = new x();
        boolean a10 = k2.n.f(context).a();
        ek.q.h("rbx.push", "AndroidNotifState: " + a10);
        if (xVar.e(context, "AndroidNotifStatePrefKey") && a10 == xVar.b(context, "AndroidNotifStatePrefKey")) {
            context2 = context;
        } else {
            ek.q.h("rbx.push", "Different value. Reporting new state: " + a10);
            xVar.f(context, "AndroidNotifStatePrefKey", a10);
            t0.l("osSettings", a10);
            context2 = context;
            B(context2, a10, new jj.a(), xVar, this.b, new c() { // from class: hj.q
                @Override // hj.r.c
                public final void a() {
                    PushNotificationSettingsWorker.INSTANCE.a(p0.h(context));
                }
            });
        }
        E(context2);
    }

    public boolean t(@NonNull Bundle bundle) {
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE", "");
        String string2 = bundle.getString("EXTRA_NOTIFICATION_VERSION", "");
        String string3 = bundle.getString("EXTRA_NOTIFICATION_ID", "");
        if (string2.isEmpty()) {
            return false;
        }
        ek.q.b("rbx.push", "... Will handle this Push bundle using Linking protocol.");
        String string4 = bundle.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", "");
        if (rh.h.a().d1()) {
            im.f.F().h(string4, "android_push_notification", false);
        } else {
            im.f.F().f(string4, "android_push_notification", false);
        }
        im.f.F().k(string4);
        t0.m(string, string3, string2, string4);
        return true;
    }

    public boolean u() {
        return this.f19464a != null;
    }

    public final void v(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        for (nj.c cVar : nj.c.b()) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(cVar.getId(), context.getApplicationContext().getString(cVar.getNameId())));
        }
    }

    public final void w(Context context) {
        k2.n f10 = k2.n.f(context);
        for (nj.a aVar : nj.a.b()) {
            if (f10.h(aVar.getId()) == null) {
                f10.c(new NotificationChannel(aVar.getId(), context.getString(aVar.getNameId()), aVar.getImportance()));
            }
        }
    }

    public void x(Context context) {
        if (rh.h.a().t0()) {
            v(context);
        } else {
            w(context);
        }
        k2.n f10 = k2.n.f(context);
        List<NotificationChannel> k10 = f10.k();
        for (nj.b bVar : nj.b.c()) {
            if (mj.b.g(k10, bVar.getId()) != null) {
                f10.e(bVar.getId());
            } else if (bVar.getIsFlagEnabled()) {
                f(context, bVar);
            } else {
                g(context, bVar);
            }
        }
        h(context);
    }

    public void y(Context context, PushNotificationTokenRetrieved pushNotificationTokenRetrieved) {
        ek.q.b("rbx.push", pushNotificationTokenRetrieved.getToken());
        x xVar = new x();
        s q10 = q(context);
        if (q10 != null) {
            String c10 = q10.c();
            String token = pushNotificationTokenRetrieved.getToken();
            F(context, token, p(context, token, xVar, c10), pushNotificationTokenRetrieved.getIsAuthorizePushForUser(), new jj.a(), this.b);
        }
    }

    public void z(Context context, boolean z10) {
        if (context != null) {
            A(context, z10, q(context));
        }
    }
}
