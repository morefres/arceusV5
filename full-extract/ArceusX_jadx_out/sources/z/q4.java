package z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import g0.m;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final y f37386a;
    public final android.view.d0<Integer> b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37388d;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f37391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37392h;

    /* renamed from: i, reason: collision with root package name */
    public c.a<Void> f37393i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37394j;

    /* renamed from: k, reason: collision with root package name */
    public final y.c f37395k;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f37387c = new AtomicInteger(-1);

    /* renamed from: e, reason: collision with root package name */
    public final Object f37389e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f37390f = false;

    public q4(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37386a = yVar;
        this.f37391g = executor;
        boolean b = b(c0Var);
        this.f37388d = b;
        this.b = new android.view.d0<>(-1);
        y.c cVar = new y.c() { // from class: z.p4
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return q4.a(q4.this, totalCaptureResult);
            }
        };
        this.f37395k = cVar;
        if (b) {
            yVar.B(cVar);
        }
    }

    public static /* synthetic */ boolean a(q4 q4Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (q4Var.f37393i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == q4Var.f37394j) {
                    q4Var.f37393i.c(null);
                    q4Var.f37393i = null;
                }
            }
            return false;
        }
        if (Build.VERSION.SDK_INT >= 35 && q4Var.f37394j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            q4Var.e(q4Var.b, num.intValue());
        }
        return false;
    }

    public static boolean b(a0.c0 c0Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) c0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public android.view.a0<Integer> c() {
        return this.b;
    }

    public void d(boolean z10) {
        if (this.f37392h == z10) {
            return;
        }
        this.f37392h = z10;
        if (z10) {
            return;
        }
        if (this.f37394j) {
            this.f37394j = false;
            this.f37386a.E(false);
            e(this.b, -1);
        }
        c.a<Void> aVar = this.f37393i;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f37393i = null;
        }
    }

    public final void e(android.view.d0<Integer> d0Var, int i10) {
        if (this.f37387c.getAndSet(i10) != i10) {
            if (p0.z.d()) {
                d0Var.o(Integer.valueOf(i10));
            } else {
                d0Var.m(Integer.valueOf(i10));
            }
        }
    }

    public void f(boolean z10) {
        synchronized (this.f37389e) {
            try {
                this.f37390f = z10;
                if (z10) {
                    if (this.f37394j) {
                        this.f37394j = false;
                        this.f37386a.E(false);
                        e(this.b, -1);
                        c.a<Void> aVar = this.f37393i;
                        if (aVar != null) {
                            aVar.f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f37393i = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
