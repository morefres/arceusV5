package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import g0.m;
import n0.n1;
import y.a;
import y1.c;
import z.g6;

/* loaded from: classes.dex */
public final class p3 implements g6.b {

    /* renamed from: a, reason: collision with root package name */
    public final a0.c0 f37362a;

    /* renamed from: c, reason: collision with root package name */
    public c.a<Void> f37363c;
    public Rect b = null;

    /* renamed from: d, reason: collision with root package name */
    public Rect f37364d = null;

    public p3(a0.c0 c0Var) {
        this.f37362a = c0Var;
    }

    public static Rect h(Rect rect, float f10) {
        float width = rect.width() / f10;
        float height = rect.height() / f10;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // z.g6.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f37363c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f37364d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f37363c.c(null);
            this.f37363c = null;
            this.f37364d = null;
        }
    }

    @Override // z.g6.b
    public float b() {
        return 1.0f;
    }

    @Override // z.g6.b
    public void c() {
        this.f37364d = null;
        this.b = null;
        c.a<Void> aVar = this.f37363c;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f37363c = null;
        }
    }

    @Override // z.g6.b
    public float d() {
        Float f10 = (Float) this.f37362a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < b() ? b() : f10.floatValue();
    }

    @Override // z.g6.b
    public void e(float f10, c.a<Void> aVar) {
        this.b = h(i(), f10);
        c.a<Void> aVar2 = this.f37363c;
        if (aVar2 != null) {
            aVar2.f(new m.a("There is a new zoomRatio being set"));
        }
        this.f37364d = this.b;
        this.f37363c = aVar;
    }

    @Override // z.g6.b
    public Rect f() {
        Rect rect = this.b;
        return rect != null ? rect : i();
    }

    @Override // z.g6.b
    public void g(a.C0666a c0666a) {
        Rect rect = this.b;
        if (rect != null) {
            c0666a.g(CaptureRequest.SCALER_CROP_REGION, rect, n1.c.REQUIRED);
        }
    }

    public final Rect i() {
        return (Rect) x2.g.g((Rect) this.f37362a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
