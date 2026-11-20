package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.SurfaceConfig;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f14215a;

    public t() {
        this((ExtraCroppingQuirk) c0.e.b(ExtraCroppingQuirk.class));
    }

    public List<Size> a(SurfaceConfig.d dVar, List<Size> list) {
        Size g10;
        ExtraCroppingQuirk extraCroppingQuirk = this.f14215a;
        if (extraCroppingQuirk == null || (g10 = extraCroppingQuirk.g(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(g10);
        for (Size size : list) {
            if (!size.equals(g10)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f14215a = extraCroppingQuirk;
    }
}
