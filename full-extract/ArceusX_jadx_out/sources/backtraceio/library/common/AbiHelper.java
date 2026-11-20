package backtraceio.library.common;

import android.os.Build;

/* loaded from: classes.dex */
public class AbiHelper {
    public static String getCurrentAbi() {
        return Build.SUPPORTED_ABIS[0];
    }
}
