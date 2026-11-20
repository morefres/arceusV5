package hj;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class x {
    public String a(Context context, String str) {
        return c(context).getString(str, null);
    }

    public boolean b(Context context, String str) {
        return c(context).getBoolean(str, false);
    }

    public final SharedPreferences c(Context context) {
        return ek.z.a(context, "NotificationPreferences");
    }

    public final SharedPreferences.Editor d(Context context) {
        return c(context).edit();
    }

    public boolean e(Context context, String str) {
        return c(context).contains(str);
    }

    public void f(Context context, String str, boolean z10) {
        SharedPreferences.Editor d10 = d(context);
        d10.putBoolean(str, z10);
        d10.commit();
    }

    public void g(Context context, String str, String str2) {
        SharedPreferences.Editor d10 = d(context);
        d10.putString(str, str2);
        d10.commit();
    }
}
