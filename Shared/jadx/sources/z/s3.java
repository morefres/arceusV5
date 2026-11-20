package z;

import android.hardware.camera2.CaptureRequest;
import g0.m;
import java.util.concurrent.Executor;
import n0.n1;
import y.a;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final y f37423a;
    public final t3 b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37424c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37425d = false;

    /* renamed from: e, reason: collision with root package name */
    public c.a<Integer> f37426e;

    /* renamed from: f, reason: collision with root package name */
    public y.c f37427f;

    public s3(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37423a = yVar;
        this.b = new t3(c0Var, 0);
        this.f37424c = executor;
    }

    public final void a() {
        c.a<Integer> aVar = this.f37426e;
        if (aVar != null) {
            aVar.f(new m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f37426e = null;
        }
        y.c cVar = this.f37427f;
        if (cVar != null) {
            this.f37423a.g0(cVar);
            this.f37427f = null;
        }
    }

    public void b(boolean z10) {
        if (z10 == this.f37425d) {
            return;
        }
        this.f37425d = z10;
        if (z10) {
            return;
        }
        this.b.b(0);
        a();
    }

    public void c(a.C0666a c0666a) {
        c0666a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.b.a()), n1.c.REQUIRED);
    }
}
