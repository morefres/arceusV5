package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Bundle f8825a;

    public h0(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f8825a = new Bundle(bundle);
    }

    public static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    public static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p8 = p(str);
        return "1".equals(p8) || Boolean.parseBoolean(p8);
    }

    public Integer b(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p8));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return new JSONArray(p8);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p8 + ", falling back to default");
            return null;
        }
    }

    public int[] e() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(c10.optString(0));
            iArr[1] = c10.optInt(1);
            iArr[2] = c10.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c10 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p8 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p8)) {
            p8 = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        return Uri.parse(p8);
    }

    public Object[] g(String str) {
        JSONArray c10 = c(str + "_loc_args");
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h10 = h(str2);
        if (TextUtils.isEmpty(h10)) {
            return null;
        }
        int identifier = resources.getIdentifier(h10, InquiryField.StringField.TYPE, str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g10 = g(str2);
        if (g10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g10);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g10) + " Default value will be used.", e10);
            return null;
        }
    }

    public Long j(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p8));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into a long");
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    public Integer l() {
        Integer b = b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    public Integer m() {
        Integer b = b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p8 = p(str2);
        return !TextUtils.isEmpty(p8) ? p8 : i(resources, str, str2);
    }

    public String o() {
        String p8 = p("gcm.n.sound2");
        return TextUtils.isEmpty(p8) ? p("gcm.n.sound") : p8;
    }

    public String p(String str) {
        return this.f8825a.getString(w(str));
    }

    public long[] q() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = c10.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = c10.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Integer r() {
        Integer b = b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    public final String w(String str) {
        if (!this.f8825a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v5 = v(str);
            if (this.f8825a.containsKey(v5)) {
                return v5;
            }
        }
        return str;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f8825a);
        for (String str : this.f8825a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f8825a);
        for (String str : this.f8825a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
