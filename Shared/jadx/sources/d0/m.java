package d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f14206a;
    public final ExtraSupportedOutputSizeQuirk b = (ExtraSupportedOutputSizeQuirk) c0.e.b(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: c, reason: collision with root package name */
    public final e f14207c;

    public m(String str) {
        this.f14206a = str;
        this.f14207c = new e(str);
    }

    public final void a(List<Size> list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] g10 = extraSupportedOutputSizeQuirk.g(i10);
        if (g10.length > 0) {
            list.addAll(Arrays.asList(g10));
        }
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            r1.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void c(List<Size> list, int i10) {
        List<Size> a10 = this.f14207c.a(i10);
        if (a10.isEmpty()) {
            return;
        }
        list.removeAll(a10);
    }
}
