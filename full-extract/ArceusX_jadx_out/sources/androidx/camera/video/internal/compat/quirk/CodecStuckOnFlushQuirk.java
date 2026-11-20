package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements g3 {
    public static boolean g() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        return g();
    }

    public boolean h(String str) {
        return "video/mp4v-es".equals(str);
    }
}
