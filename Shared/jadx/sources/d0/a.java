package d0;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import n0.k3;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14195a;
    public final boolean b;

    public a(k3 k3Var) {
        this.f14195a = k3Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = c0.e.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f14195a || this.b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
