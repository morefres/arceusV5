package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import n0.g3;

/* loaded from: classes.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements g3 {
    public static boolean g() {
        return Build.VERSION.SDK_INT < 34;
    }
}
