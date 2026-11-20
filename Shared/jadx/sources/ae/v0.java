package ae;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import be.q1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f467c = new q1("SplitInstallInfoProvider");

    /* renamed from: a, reason: collision with root package name */
    public final Context f468a;
    public final String b;

    public v0(Context context, String str) {
        this.f468a = context;
        this.b = str;
    }

    public static String b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean e(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : h(packageInfo)) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final Set h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f467c.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f467c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f467c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        t0 a10 = u0.a();
        if (a10 != null) {
            hashSet.addAll(a10.zza());
        }
        return hashSet;
    }

    public final n0 a(Bundle bundle) {
        if (bundle == null) {
            f467c.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundle.getInt("com.android.vending.splits");
        if (i10 == 0) {
            f467c.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            n0 a10 = e0.a(this.f468a.getResources().getXml(i10), new l0());
            if (a10 == null) {
                f467c.e("Can't parse languages metadata.", new Object[0]);
            }
            return a10;
        } catch (Resources.NotFoundException unused) {
            f467c.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set c() {
        PackageInfo g10 = g();
        return (g10 == null || g10.applicationInfo == null) ? new HashSet() : f(g10);
    }

    public final Set d() {
        ApplicationInfo applicationInfo;
        PackageInfo g10 = g();
        HashSet hashSet = null;
        if (g10 != null && (applicationInfo = g10.applicationInfo) != null) {
            n0 a10 = a(applicationInfo.metaData);
            if (a10 == null) {
                return null;
            }
            hashSet = new HashSet();
            Set h10 = h(g10);
            h10.add("");
            Set f10 = f(g10);
            f10.add("");
            for (Map.Entry entry : a10.a(f10).entrySet()) {
                if (h10.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public final PackageInfo g() {
        try {
            return this.f468a.getPackageManager().getPackageInfo(this.b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f467c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public v0(Context context) {
        this.f468a = context;
        this.b = context.getPackageName();
    }
}
