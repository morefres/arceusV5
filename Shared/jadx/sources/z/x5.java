package z;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import g0.m;
import java.util.Objects;
import java.util.concurrent.Executor;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public final y f37535a;
    public final android.view.d0<Integer> b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.d0<Integer> f37536c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37537d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37538e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37539f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37540g;

    /* renamed from: h, reason: collision with root package name */
    public int f37541h;

    /* renamed from: i, reason: collision with root package name */
    public int f37542i;

    /* renamed from: j, reason: collision with root package name */
    public c.a<Void> f37543j;

    /* renamed from: k, reason: collision with root package name */
    public c.a<Void> f37544k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37545l;

    public x5(y yVar, a0.c0 c0Var, Executor executor) {
        this.f37535a = yVar;
        this.f37538e = executor;
        Objects.requireNonNull(c0Var);
        boolean a10 = d0.g.a(new d1(c0Var));
        this.f37537d = a10;
        boolean h10 = c0Var.h();
        this.f37540g = h10;
        int c10 = (a10 && h10) ? c0Var.c() : 0;
        this.f37541h = c10;
        this.f37542i = c10;
        this.b = new android.view.d0<>(0);
        this.f37536c = new android.view.d0<>(Integer.valueOf(this.f37541h));
        yVar.B(new y.c() { // from class: z.w5
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return x5.b(x5.this, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ boolean b(x5 x5Var, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (x5Var.f37544k != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num2 != null && num2.intValue() == 2) == x5Var.f37545l) {
                x5Var.f37544k.c(null);
                x5Var.f37544k = null;
            }
        }
        if (x5Var.f37540g && Build.VERSION.SDK_INT >= 35 && x5Var.f37543j != null && (num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STRENGTH_LEVEL)) != null && num.intValue() == x5Var.f37542i) {
            x5Var.f37543j.c(null);
            x5Var.f37543j = null;
        }
        return false;
    }

    public static /* synthetic */ Object c(final x5 x5Var, final int i10, boolean z10, final c.a aVar) {
        x5Var.f37538e.execute(new Runnable() { // from class: z.u5
            @Override // java.lang.Runnable
            public final void run() {
                x5.this.e(aVar, i10);
            }
        });
        return "enableTorch: " + z10;
    }

    public ne.x<Void> d(final boolean z10) {
        if (!this.f37537d) {
            g0.r1.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return r0.n.n(new IllegalStateException("No flash unit"));
        }
        k(z10 ? 1 : 0);
        final int i10 = z10 ? 1 : 0;
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.v5
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return x5.c(x5.this, i10, z10, aVar);
            }
        });
    }

    public void e(c.a<Void> aVar, int i10) {
        if (!this.f37537d) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f37539f) {
            k(0);
            if (aVar != null) {
                aVar.f(new m.a("Camera is not active."));
                return;
            }
            return;
        }
        if (this.f37535a.b0()) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("Torch can not be enabled when low-light boost is on!"));
                return;
            }
            return;
        }
        this.f37545l = i10 != 0;
        this.f37535a.F(i10);
        k(i10);
        c.a<Void> aVar2 = this.f37544k;
        if (aVar2 != null) {
            aVar2.f(new m.a("There is a new enableTorch being set"));
        }
        this.f37544k = aVar;
    }

    public void f() {
        if (this.f37545l) {
            this.f37545l = false;
            k(0);
        }
    }

    public android.view.a0<Integer> g() {
        return this.b;
    }

    public android.view.a0<Integer> h() {
        return this.f37536c;
    }

    public void i(boolean z10) {
        if (this.f37539f == z10) {
            return;
        }
        this.f37539f = z10;
        if (z10) {
            return;
        }
        if (this.f37545l) {
            this.f37545l = false;
            this.f37542i = this.f37541h;
            this.f37535a.F(0);
            k(0);
            j(this.f37536c, Integer.valueOf(this.f37541h));
        }
        c.a<Void> aVar = this.f37544k;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f37544k = null;
        }
        c.a<Void> aVar2 = this.f37543j;
        if (aVar2 != null) {
            aVar2.f(new m.a("Camera is not active."));
            this.f37543j = null;
        }
    }

    public final <T> void j(android.view.d0<T> d0Var, T t8) {
        if (p0.z.d()) {
            d0Var.o(t8);
        } else {
            d0Var.m(t8);
        }
    }

    public final void k(int i10) {
        j(this.b, Integer.valueOf(i10 != 1 ? 0 : 1));
    }
}
