package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import n0.t3;

/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* renamed from: a, reason: collision with root package name */
    public final Range<Integer> f1166a;

    public AeFpsRangeLegacyQuirk(c0 c0Var) {
        this.f1166a = i((Range[]) c0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean h(c0 c0Var) {
        Integer num = (Integer) c0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public Range<Integer> a() {
        Range<Integer> range = this.f1166a;
        return range != null ? range : t3.f25564a;
    }

    public final Range<Integer> g(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    public final Range<Integer> i(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> g10 = g(range2);
                if (g10.getUpper().intValue() == 30 && (range == null || g10.getLower().intValue() < range.getLower().intValue())) {
                    range = g10;
                }
            }
        }
        return range;
    }
}
