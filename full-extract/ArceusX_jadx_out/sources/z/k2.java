package z;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import f0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.n1;

/* loaded from: classes.dex */
public class k2 {

    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(n0.l1 l1Var, CaptureRequest.Builder builder) {
        Range<Integer> e10 = l1Var.e();
        if (!e10.equals(n0.t3.f25564a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, e10);
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + e10);
    }

    public static void b(CaptureRequest.Builder builder, n0.n1 n1Var) {
        f0.l c10 = l.a.d(n1Var).c();
        for (n1.a<?> aVar : c10.b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, c10.e(aVar));
            } catch (IllegalArgumentException unused) {
                g0.r1.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i10, d0.y yVar) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : yVar.a(i10).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    public static void d(n0.l1 l1Var, CaptureRequest.Builder builder) {
        Integer h10 = h(l1Var);
        if (h10 != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, h10);
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + h10);
    }

    public static CaptureRequest e(n0.l1 l1Var, CameraDevice cameraDevice, Map<n0.u1, Surface> map, boolean z10, d0.y yVar) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> g10 = g(l1Var.i(), map);
        if (g10.isEmpty()) {
            return null;
        }
        n0.e0 d10 = l1Var.d();
        if (l1Var.k() == 5 && d10 != null && (d10.e() instanceof TotalCaptureResult)) {
            g0.r1.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) d10.e());
        } else {
            g0.r1.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (l1Var.k() == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(l1Var.k());
            }
        }
        c(createCaptureRequest, l1Var.k(), yVar);
        a(l1Var, createCaptureRequest);
        d(l1Var, createCaptureRequest);
        n0.n1 g11 = l1Var.g();
        n1.a<Integer> aVar = n0.l1.f25431i;
        if (g11.a(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) l1Var.g().e(aVar));
        }
        n0.n1 g12 = l1Var.g();
        n1.a<Integer> aVar2 = n0.l1.f25432j;
        if (g12.a(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l1Var.g().e(aVar2)).byteValue()));
        }
        b(createCaptureRequest, l1Var.g());
        Iterator<Surface> it = g10.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(l1Var.j());
        return createCaptureRequest.build();
    }

    public static CaptureRequest f(n0.l1 l1Var, CameraDevice cameraDevice, d0.y yVar) {
        if (cameraDevice == null) {
            return null;
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "template type = " + l1Var.k());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(l1Var.k());
        c(createCaptureRequest, l1Var.k(), yVar);
        a(l1Var, createCaptureRequest);
        b(createCaptureRequest, l1Var.g());
        return createCaptureRequest.build();
    }

    public static List<Surface> g(List<n0.u1> list, Map<n0.u1, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.u1> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    public static Integer h(n0.l1 l1Var) {
        if (l1Var.h() == 1 || l1Var.l() == 1) {
            return 0;
        }
        if (l1Var.h() == 2) {
            return 2;
        }
        return l1Var.l() == 2 ? 1 : null;
    }
}
