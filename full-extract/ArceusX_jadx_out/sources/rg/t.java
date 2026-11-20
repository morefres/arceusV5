package rg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.roblox.engine.jni.NativeSettingsInterface;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static String f30589a;

    public static String a(Context context) {
        if (f30589a == null) {
            d(context);
        }
        return f30589a;
    }

    public static String b(Context context) {
        c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    public static void c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String r8 = kk.c.p().r();
            if (TextUtils.isEmpty(r8)) {
                str = "";
            } else {
                str = r8 + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, a(context));
        }
    }

    public static void d(Context context) {
        f30589a = a1.U(context).getString("dev_rpc_ip_port_override", "");
    }

    public static void e(Context context, String str) {
        if (str == null) {
            str = "";
        }
        f30589a = str;
        SharedPreferences.Editor edit = a1.U(context).edit();
        edit.putString("dev_rpc_ip_port_override", str);
        edit.apply();
        c(context);
    }
}
