package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final SmallDisplaySizeQuirk f14198a = (SmallDisplaySizeQuirk) c0.e.b(SmallDisplaySizeQuirk.class);

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f14198a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.g();
        }
        return null;
    }
}
