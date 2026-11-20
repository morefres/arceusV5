package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import n0.SurfaceConfig;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f14204a;

    public k() {
        this((ExtraCroppingQuirk) c0.e.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size g10;
        ExtraCroppingQuirk extraCroppingQuirk = this.f14204a;
        return (extraCroppingQuirk == null || (g10 = extraCroppingQuirk.g(SurfaceConfig.d.f25632a)) == null || g10.getWidth() * g10.getHeight() <= size.getWidth() * size.getHeight()) ? size : g10;
    }

    public k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f14204a = extraCroppingQuirk;
    }
}
