package d0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14217a;

    public v() {
        this.f14217a = ((StillCaptureFlashStopRepeatingQuirk) c0.e.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public boolean a(List<CaptureRequest> list, boolean z10) {
        if (this.f14217a && z10) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
