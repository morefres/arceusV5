package eg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import l2.b;
import vf.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16017a;
    public final SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    public final c f16018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16019d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f16017a = a10;
        this.b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16018c = cVar;
        this.f16019d = c();
    }

    public static Context a(Context context) {
        return b.b(context);
    }

    public synchronized boolean b() {
        return this.f16019d;
    }

    public final boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f16017a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f16017a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
