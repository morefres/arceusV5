package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.concurrent.atomic.AtomicInteger;
import k2.k;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f8802a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final k.f f8803a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8804c;

        public a(k.f fVar, String str, int i10) {
            this.f8803a = fVar;
            this.b = str;
            this.f8804c = i10;
        }
    }

    public static PendingIntent a(Context context, h0 h0Var, String str, PackageManager packageManager) {
        Intent f10 = f(str, h0Var, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(h0Var.y());
        if (q(h0Var)) {
            f10.putExtra("gcm.n.analytics_data", h0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, h0 h0Var) {
        if (q(h0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(h0Var.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, h0 h0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        k.f fVar = new k.f(context2, str);
        String n10 = h0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            fVar.l(n10);
        }
        String n11 = h0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            fVar.k(n11);
            fVar.B(new k.d().h(n11));
        }
        fVar.z(m(packageManager, resources, packageName, h0Var.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, h0Var, resources);
        if (n12 != null) {
            fVar.A(n12);
        }
        fVar.j(a(context, h0Var, packageName, packageManager));
        PendingIntent b = b(context, context2, h0Var);
        if (b != null) {
            fVar.n(b);
        }
        Integer h10 = h(context2, h0Var.p("gcm.n.color"), bundle);
        if (h10 != null) {
            fVar.h(h10.intValue());
        }
        fVar.f(!h0Var.a("gcm.n.sticky"));
        fVar.u(h0Var.a("gcm.n.local_only"));
        String p8 = h0Var.p("gcm.n.ticker");
        if (p8 != null) {
            fVar.C(p8);
        }
        Integer m10 = h0Var.m();
        if (m10 != null) {
            fVar.x(m10.intValue());
        }
        Integer r8 = h0Var.r();
        if (r8 != null) {
            fVar.F(r8.intValue());
        }
        Integer l10 = h0Var.l();
        if (l10 != null) {
            fVar.v(l10.intValue());
        }
        Long j10 = h0Var.j("gcm.n.event_time");
        if (j10 != null) {
            fVar.y(true);
            fVar.G(j10.longValue());
        }
        long[] q10 = h0Var.q();
        if (q10 != null) {
            fVar.E(q10);
        }
        int[] e10 = h0Var.e();
        if (e10 != null) {
            fVar.t(e10[0], e10[1], e10[2]);
        }
        fVar.m(i(h0Var));
        return new a(fVar, o(h0Var), 0);
    }

    public static a e(Context context, h0 h0Var) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, h0Var, k(context, h0Var.k(), j10), j10);
    }

    public static Intent f(String str, h0 h0Var, PackageManager packageManager) {
        String p8 = h0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p8)) {
            Intent intent = new Intent(p8);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = h0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f8802a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(l2.b.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(h0 h0Var) {
        boolean a10 = h0Var.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (h0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | 2;
        }
        return h0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(MotionEventCompat.AXIS_SCROLL)
    public static String k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", InquiryField.StringField.TYPE, context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i10) {
        return i10 | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    public static Uri n(String str, h0 h0Var, Resources resources) {
        String o8 = h0Var.o();
        if (TextUtils.isEmpty(o8)) {
            return null;
        }
        if ("default".equals(o8) || resources.getIdentifier(o8, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o8);
    }

    public static String o(h0 h0Var) {
        String p8 = h0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p8)) {
            return p8;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(MotionEventCompat.AXIS_SCROLL)
    public static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean q(@NonNull h0 h0Var) {
        return h0Var.a("google.c.a.e");
    }
}
