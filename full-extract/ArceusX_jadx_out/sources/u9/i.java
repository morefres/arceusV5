package u9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import com.google.android.apps.common.proguard.SideEffectFree;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f32650a;
    public static Boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f32651c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f32652d;

    @SideEffectFree
    public static boolean a(@NonNull Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = j9.h.f21609a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean c(@NonNull Context context) {
        return e(context.getPackageManager());
    }

    @TargetApi(MotionEventCompat.AXIS_SCROLL)
    public static boolean d(@NonNull Context context) {
        if (c(context) && !m.f()) {
            return true;
        }
        if (f(context)) {
            return !m.g() || m.j();
        }
        return false;
    }

    @SideEffectFree
    public static boolean e(@NonNull PackageManager packageManager) {
        if (f32650a == null) {
            f32650a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f32650a.booleanValue();
    }

    public static boolean f(@NonNull Context context) {
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean g(@NonNull Context context) {
        if (f32651c == null) {
            f32651c = Boolean.valueOf(m.g() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f32651c.booleanValue();
    }

    @SideEffectFree
    public static boolean h(@NonNull PackageManager packageManager) {
        if (f32652d == null) {
            boolean z10 = false;
            if (m.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f32652d = Boolean.valueOf(z10);
        }
        return f32652d.booleanValue();
    }
}
