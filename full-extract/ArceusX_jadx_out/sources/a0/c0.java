package a0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c0 {
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4c;

    /* renamed from: a, reason: collision with root package name */
    public final Map<CameraCharacteristics.Key<?>, Object> f3a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public u0 f5d = null;

    public interface a {
        CameraCharacteristics a();

        <T> T b(CameraCharacteristics.Key<T> key);
    }

    public c0(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new x(cameraCharacteristics);
        } else {
            this.b = new y(cameraCharacteristics);
        }
        this.f4c = str;
    }

    public static c0 k(CameraCharacteristics cameraCharacteristics, String str) {
        return new c0(cameraCharacteristics, str);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (g(key)) {
            return (T) this.b.b(key);
        }
        synchronized (this) {
            try {
                T t8 = (T) this.f3a.get(key);
                if (t8 != null) {
                    return t8;
                }
                T t10 = (T) this.b.b(key);
                if (t10 != null) {
                    this.f3a.put(key, t10);
                }
                return t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String b() {
        return this.f4c;
    }

    public int c() {
        Integer num;
        CameraCharacteristics.Key key;
        if (!f() || Build.VERSION.SDK_INT < 35) {
            num = null;
        } else {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            num = (Integer) a(key);
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public int d() {
        Integer num;
        CameraCharacteristics.Key key;
        if (!f() || Build.VERSION.SDK_INT < 35) {
            num = null;
        } else {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
            num = (Integer) a(key);
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public u0 e() {
        if (this.f5d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f5d = u0.i(streamConfigurationMap, new d0.m(this.f4c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f5d;
    }

    public final boolean f() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    public final boolean g(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public boolean h() {
        return f() && Build.VERSION.SDK_INT >= 35 && d() > 1;
    }

    public boolean i() {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 34) {
            a aVar = this.b;
            key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) aVar.b(key);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public CameraCharacteristics j() {
        return this.b.a();
    }
}
