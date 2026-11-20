package n9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f25996a = new Object();
    public static boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static String f25997c;

    /* renamed from: d, reason: collision with root package name */
    public static int f25998d;

    public static int a(Context context) {
        b(context);
        return f25998d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (f25996a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    bundle = w9.c.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f25997c = bundle.getString("com.google.app.id");
                f25998d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
