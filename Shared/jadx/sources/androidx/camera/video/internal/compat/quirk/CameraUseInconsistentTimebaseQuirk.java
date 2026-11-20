package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import n0.g3;

/* loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f1243a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final Set<String> b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* renamed from: c, reason: collision with root package name */
    public static final Set<String> f1244c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean g() {
        return f1244c.contains(Build.MODEL.toLowerCase());
    }

    public static boolean h() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f1243a.contains(Build.HARDWARE.toLowerCase());
    }

    public static boolean i() {
        return j() || h() || g();
    }

    public static boolean j() {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Set<String> set = b;
        str = Build.SOC_MODEL;
        return set.contains(str.toLowerCase());
    }
}
