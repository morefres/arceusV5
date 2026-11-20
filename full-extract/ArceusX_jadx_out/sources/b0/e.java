package b0;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import g0.k0;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f3624a;

    public interface a {
        DynamicRangeProfiles a();

        Set<k0> c();

        Set<k0> d(k0 k0Var);
    }

    public e(a aVar) {
        this.f3624a = aVar;
    }

    public static e a(c0 c0Var) {
        e eVar;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            eVar = e(y.f.a(c0Var.a(key)));
        } else {
            eVar = null;
        }
        return eVar == null ? g.f3626a : eVar;
    }

    public static e e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        x2.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new e(new f(dynamicRangeProfiles));
    }

    public Set<k0> b(k0 k0Var) {
        return this.f3624a.d(k0Var);
    }

    public Set<k0> c() {
        return this.f3624a.c();
    }

    public DynamicRangeProfiles d() {
        x2.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f3624a.a();
    }
}
