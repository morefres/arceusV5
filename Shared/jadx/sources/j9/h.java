package j9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.roblox.client.personasdk.BuildConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.q0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f21609a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21610c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21611d;

    @Deprecated
    public static final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f21612e = new AtomicBoolean();

    @Deprecated
    public static void a(@NonNull Context context, int i10) {
        int h10 = d.f().h(context, i10);
        if (h10 != 0) {
            Intent b10 = d.f().b(context, h10, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(h10).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(h10);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (b10 != null) {
                throw new f(h10, "Google Play Services not available", b10);
            }
            throw new e(h10);
        }
    }

    @Deprecated
    public static int b(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @NonNull
    @Deprecated
    public static String c(int i10) {
        return ConnectionResult.B3(i10);
    }

    public static Resources d(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(@NonNull Context context) {
        try {
            if (!f21611d) {
                try {
                    PackageInfo e10 = w9.c.a(context).e("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    i.a(context);
                    if (e10 == null || i.d(e10, false) || !i.d(e10, true)) {
                        f21610c = false;
                    } else {
                        f21610c = true;
                    }
                    f21611d = true;
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e11);
                    f21611d = true;
                }
            }
            return f21610c || !u9.i.b();
        } catch (Throwable th2) {
            f21611d = true;
            throw th2;
        }
    }

    @Deprecated
    public static int f(@NonNull Context context, int i10) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(j.f21618a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f21612e.get()) {
            int a10 = q0.a(context);
            if (a10 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a10 != f21609a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a10);
            }
        }
        boolean z10 = (u9.i.d(context) || u9.i.g(context)) ? false : true;
        n9.m.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo(BuildConfig.STORE_PACKAGE, Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            i.a(context);
            if (i.d(packageInfo2, true)) {
                if (z10) {
                    n9.m.l(packageInfo);
                    if (!i.d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (u9.r.a(packageInfo2.versionCode) >= u9.r.a(i10)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i11 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i10);
                    sb2.append(" but found ");
                    sb2.append(i11);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                }
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            } else {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean g(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(@NonNull Context context) {
        Object systemService = context.getSystemService("user");
        n9.m.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    public static boolean j(@NonNull Context context, int i10, @NonNull String str) {
        return u9.p.b(context, i10, str);
    }

    public static boolean k(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
