package rg;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.roblox.client.RobloxWebActivity;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.engine.jni.NativeGLInterface;
import org.json.JSONObject;
import yj.q2;

/* loaded from: classes2.dex */
public class q {
    public static Intent a(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", ek.f.c(str));
        intent.putExtra("TITLE_EXTRA", str2);
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", z10);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", z11);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", z12);
        return intent;
    }

    public static void b(JSONObject jSONObject, Activity activity) {
        uh.k0 a10;
        JSONObject a11 = q2.a(jSONObject);
        if (a11 != null) {
            long optLong = a11.optLong(PinShortcutHandler.EXTRA_PLACE_ID);
            long optLong2 = a11.optLong("userId");
            long optLong3 = a11.optLong("conversationId");
            String optString = a11.optString("gameInstanceId");
            String optString2 = a11.optString("reservedServerAccessCode");
            String optString3 = a11.optString("callId");
            String optString4 = a11.optString("referralPage");
            String optString5 = a11.optString("accessCode");
            String optString6 = a11.optString("linkCode");
            String optString7 = a11.optString("launchData");
            long optLong4 = rh.h.a().Z2() ? a11.optLong("referredByPlayerId") : 0L;
            String optString8 = a11.optString("eventId");
            String optString9 = a11.optString("gameJoinContext");
            String optString10 = a11.optString("joinAttemptId");
            String optString11 = a11.optString("joinAttemptOrigin");
            String optString12 = a11.optString("isoContext");
            String optString13 = rh.h.a().A3() ? a11.optString("gameIdToExclude") : "";
            if (optLong > 0 && optLong3 > 0) {
                a10 = uh.k0.b(Long.valueOf(optLong), Long.valueOf(optLong3), optString4, optString10, optString11);
            } else if (optLong > 0 || optLong2 > 0) {
                Long valueOf = optLong == 0 ? null : Long.valueOf(optLong);
                Long valueOf2 = optLong2 == 0 ? null : Long.valueOf(optLong2);
                if (TextUtils.isEmpty(optString5)) {
                    optString5 = null;
                }
                if (TextUtils.isEmpty(optString6)) {
                    optString6 = null;
                }
                String str = TextUtils.isEmpty(optString) ? null : optString;
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = null;
                }
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = null;
                }
                a10 = uh.k0.a(valueOf, valueOf2, optString5, optString6, str, optString2, optString3, null, optString4, optString7, optString9, optString8, optString10, optString11, optString12, Long.valueOf(optLong4), optString13);
            } else {
                a10 = null;
            }
            if (a10 != null) {
                j(a10, activity);
                ti.g.b().j(activity);
            }
        }
    }

    public static void c(uh.k0 k0Var, Activity activity) {
        int myPid = Process.myPid();
        boolean isDebuggerConnected = Debug.isDebuggerConnected();
        if (k0Var != null) {
            long p8 = k0Var.p();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Launching PlaceId:");
            sb2.append(p8);
            sb2.append(" Pid:");
            sb2.append(myPid);
            sb2.append(" Debugger:");
            sb2.append(isDebuggerConnected ? "attached" : PayloadNotificationChannel.SOUND_NONE);
            ek.q.h("ActivityUtils", sb2.toString());
        }
        y.h().f().q(activity, k0Var, 20104);
    }

    public static void d(Activity activity, String str, boolean z10) {
        activity.startActivity(a(activity, str, activity.getString(q0.f30509w), true, z10, true));
        activity.overridePendingTransition(g0.b, R.anim.fade_out);
    }

    public static void e(Activity activity, String str, int i10, boolean z10, boolean z11) {
        h(activity, str, activity.getString(i10), z10, z11);
    }

    public static void f(Activity activity, String str, String str2) {
        i(activity, str, str2, false, false, false);
    }

    public static void g(Activity activity, String str, String str2, String str3) {
        Intent a10 = a(activity, str, str2, true, true, true);
        if (str3 != null) {
            a10.putExtra("SEARCH_PARAMS", str3);
        }
        k(activity, a10, true);
    }

    public static void h(Activity activity, String str, String str2, boolean z10, boolean z11) {
        i(activity, str, str2, z10, z11, false);
    }

    public static void i(Activity activity, String str, String str2, boolean z10, boolean z11, boolean z12) {
        k(activity, a(activity, str, str2, z10, z11, z12), z10);
    }

    public static void j(uh.k0 k0Var, Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        a1.f30263v = true;
        ek.q.b("GameLaunch", "startLaunchGame: activity=" + activity);
        c(k0Var, activity);
    }

    public static void k(Activity activity, Intent intent, boolean z10) {
        activity.startActivityForResult(intent, 20110);
        if (z10 || NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overridePendingTransition(g0.b, R.anim.fade_out);
        }
    }
}
