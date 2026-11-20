package a0;

import a0.g;
import a0.l0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public class j0 extends i0 {
    public j0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static j0 e(CameraDevice cameraDevice, Handler handler) {
        return new j0(cameraDevice, new l0.a(handler));
    }

    @Override // a0.d0.a
    public void a(b0.o oVar) {
        l0.c(this.f35a, oVar);
        g.c cVar = new g.c(oVar.a(), oVar.e());
        List<b0.i> c10 = oVar.c();
        Handler handler = ((l0.a) x2.g.g((l0.a) this.b)).f36a;
        b0.h b = oVar.b();
        try {
            if (b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b.a();
                x2.g.g(inputConfiguration);
                this.f35a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, b0.o.h(c10), cVar, handler);
            } else if (oVar.d() == 1) {
                this.f35a.createConstrainedHighSpeedCaptureSession(l0.d(c10), cVar, handler);
            } else {
                this.f35a.createCaptureSessionByOutputConfigurations(b0.o.h(c10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
