package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import n0.g3;

/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f1178a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"));

    public static boolean g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        String str;
        Set<String> set = f1178a;
        String str2 = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str2.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str3 = Build.HARDWARE;
        if (str3.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        return "itel".equalsIgnoreCase(Build.BRAND) && str3.toLowerCase(locale).startsWith("sp");
    }

    public static boolean i() {
        return h() || g();
    }
}
