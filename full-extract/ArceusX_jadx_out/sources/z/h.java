package z;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;
import p0.i;

/* loaded from: classes.dex */
public class h implements n0.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.z3 f37201a;
    public final CaptureResult b;

    public h(n0.z3 z3Var, CaptureResult captureResult) {
        this.f37201a = z3Var;
        this.b = captureResult;
    }

    @Override // n0.e0
    public void a(i.b bVar) {
        super.a(bVar);
        try {
            Integer num = (Integer) this.b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            g0.r1.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num2 = (Integer) this.b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) this.b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) this.b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            i.c cVar = i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // n0.e0
    public n0.d0 b() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return n0.d0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return n0.d0.NONE;
        }
        if (intValue == 2) {
            return n0.d0.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return n0.d0.FIRED;
        }
        g0.r1.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return n0.d0.UNKNOWN;
    }

    @Override // n0.e0
    public n0.z3 c() {
        return this.f37201a;
    }

    @Override // n0.e0
    public n0.b0 d() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return n0.b0.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return n0.b0.UNKNOWN;
    }

    @Override // n0.e0
    public CaptureResult e() {
        return this.b;
    }

    @Override // n0.e0
    public n0.x f() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return n0.x.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return n0.x.OFF;
        }
        if (intValue == 1) {
            return n0.x.ON;
        }
        if (intValue == 2) {
            return n0.x.ON_AUTO_FLASH;
        }
        if (intValue == 3) {
            return n0.x.ON_ALWAYS_FLASH;
        }
        if (intValue == 4) {
            return n0.x.ON_AUTO_FLASH_REDEYE;
        }
        if (intValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return n0.x.ON_EXTERNAL_FLASH;
        }
        return n0.x.UNKNOWN;
    }

    @Override // n0.e0
    public n0.a0 g() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return n0.a0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                g0.r1.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return n0.a0.UNKNOWN;
    }

    @Override // n0.e0
    public long getTimestamp() {
        Long l10 = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // n0.e0
    public n0.c0 h() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return n0.c0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return n0.c0.INACTIVE;
        }
        if (intValue == 1) {
            return n0.c0.METERING;
        }
        if (intValue == 2) {
            return n0.c0.CONVERGED;
        }
        if (intValue == 3) {
            return n0.c0.LOCKED;
        }
        g0.r1.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return n0.c0.UNKNOWN;
    }

    @Override // n0.e0
    public n0.z i() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return n0.z.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return n0.z.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return n0.z.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                g0.r1.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return n0.z.UNKNOWN;
            }
        }
        return n0.z.OFF;
    }

    @Override // n0.e0
    public n0.y j() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return n0.y.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return n0.y.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return n0.y.CONVERGED;
            }
            if (intValue == 3) {
                return n0.y.LOCKED;
            }
            if (intValue == 4) {
                return n0.y.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                g0.r1.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return n0.y.UNKNOWN;
            }
        }
        return n0.y.SEARCHING;
    }

    public h(CaptureResult captureResult) {
        this(n0.z3.b(), captureResult);
    }
}
