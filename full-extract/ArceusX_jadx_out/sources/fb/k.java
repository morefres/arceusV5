package fb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f17109c = new k();

    /* renamed from: a, reason: collision with root package name */
    public boolean f17110a;
    public boolean b;

    public final boolean a(Activity activity) {
        Bundle bundle;
        boolean z10;
        Bundle bundle2;
        ApplicationInfo c10;
        if (this.b) {
            return this.f17110a;
        }
        ActivityInfo activityInfo = null;
        try {
            c10 = w9.c.a(activity).c(activity.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (c10 != null) {
            bundle = c10.metaData;
            z10 = false;
            if (bundle != null && bundle.getString("com.epicgames.unreal.GameActivity.EngineVersion", "").startsWith("5.")) {
                try {
                    activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                    z10 = Objects.equals(bundle2.getString("android.app.lib_name", ""), "Unreal");
                }
            }
            this.f17110a = z10;
            this.b = true;
            return z10;
        }
        bundle = null;
        z10 = false;
        if (bundle != null) {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
            if (activityInfo != null) {
                z10 = Objects.equals(bundle2.getString("android.app.lib_name", ""), "Unreal");
            }
        }
        this.f17110a = z10;
        this.b = true;
        return z10;
    }
}
