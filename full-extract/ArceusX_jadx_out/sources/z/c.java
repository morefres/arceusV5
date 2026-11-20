package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import g0.m;
import n0.n1;
import y.a;
import y1.c;
import z.g6;

/* loaded from: classes.dex */
public final class c implements g6.b {

    /* renamed from: a, reason: collision with root package name */
    public final a0.c0 f37061a;
    public final Range<Float> b;

    /* renamed from: d, reason: collision with root package name */
    public c.a<Void> f37063d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37065f;

    /* renamed from: c, reason: collision with root package name */
    public float f37062c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f37064e = 1.0f;

    public c(a0.c0 c0Var) {
        CameraCharacteristics.Key key;
        this.f37065f = false;
        this.f37061a = c0Var;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.b = (Range) c0Var.a(key);
        this.f37065f = c0Var.i();
    }

    @Override // z.g6.b
    public void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f10;
        if (this.f37063d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f10 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f10 = (Float) request.get(key);
            }
            if (f10 == null) {
                return;
            }
            if (this.f37064e == f10.floatValue()) {
                this.f37063d.c(null);
                this.f37063d = null;
            }
        }
    }

    @Override // z.g6.b
    public float b() {
        return this.b.getLower().floatValue();
    }

    @Override // z.g6.b
    public void c() {
        this.f37062c = 1.0f;
        c.a<Void> aVar = this.f37063d;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f37063d = null;
        }
    }

    @Override // z.g6.b
    public float d() {
        return this.b.getUpper().floatValue();
    }

    @Override // z.g6.b
    public void e(float f10, c.a<Void> aVar) {
        this.f37062c = f10;
        c.a<Void> aVar2 = this.f37063d;
        if (aVar2 != null) {
            aVar2.f(new m.a("There is a new zoomRatio being set"));
        }
        this.f37064e = this.f37062c;
        this.f37063d = aVar;
    }

    @Override // z.g6.b
    public Rect f() {
        return (Rect) x2.g.g((Rect) this.f37061a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // z.g6.b
    public void g(a.C0666a c0666a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f37062c);
        n1.c cVar = n1.c.REQUIRED;
        c0666a.g(key, valueOf, cVar);
        if (this.f37065f) {
            b0.b.a(c0666a, cVar);
        }
    }
}
