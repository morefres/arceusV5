package m0;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import g0.f1;
import g0.r1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.b0;
import m0.f0;
import m0.k;
import m0.u0;
import m0.y;
import n0.k3;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23995a;
    public final x0.y b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraCharacteristics f23996c;

    /* renamed from: d, reason: collision with root package name */
    public y f23997d;

    /* renamed from: e, reason: collision with root package name */
    public a f23998e;

    /* renamed from: f, reason: collision with root package name */
    public x0.a0<b, x0.b0<androidx.camera.core.d>> f23999f;

    /* renamed from: g, reason: collision with root package name */
    public x0.a0<b0.a, x0.b0<byte[]>> f24000g;

    /* renamed from: h, reason: collision with root package name */
    public x0.a0<k.b, x0.b0<byte[]>> f24001h;

    /* renamed from: i, reason: collision with root package name */
    public x0.a0<f0.a, f1.i> f24002i;

    /* renamed from: j, reason: collision with root package name */
    public x0.a0<x0.b0<byte[]>, x0.b0<Bitmap>> f24003j;

    /* renamed from: k, reason: collision with root package name */
    public x0.a0<x0.b0<androidx.camera.core.d>, androidx.camera.core.d> f24004k;

    /* renamed from: l, reason: collision with root package name */
    public x0.a0<x0.b0<byte[]>, x0.b0<androidx.camera.core.d>> f24005l;

    /* renamed from: m, reason: collision with root package name */
    public x0.a0<x0.b0<androidx.camera.core.d>, Bitmap> f24006m;

    /* renamed from: n, reason: collision with root package name */
    public x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> f24007n;

    /* renamed from: o, reason: collision with root package name */
    public final k3 f24008o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24009p;

    public static abstract class a {
        public static a e(int i10, List<Integer> list) {
            return new g(new x0.u(), new x0.u(), i10, list);
        }

        public abstract x0.u<b> a();

        public abstract int b();

        public abstract List<Integer> c();

        public abstract x0.u<b> d();
    }

    public static abstract class b {
        public static b c(v0 v0Var, androidx.camera.core.d dVar) {
            return new h(v0Var, dVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract v0 b();
    }

    public u0(Executor executor, CameraCharacteristics cameraCharacteristics, x0.y yVar) {
        this(executor, cameraCharacteristics, yVar, u0.b.c());
    }

    public static /* synthetic */ void b(final u0 u0Var, final b bVar) {
        u0Var.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            u0Var.f23995a.execute(new Runnable() { // from class: m0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.this.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final u0 u0Var, final b bVar) {
        u0Var.getClass();
        if (!bVar.b().l()) {
            u0Var.f23995a.execute(new Runnable() { // from class: m0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.this.m(bVar);
                }
            });
        } else {
            r1.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    public final x0.b0<byte[]> i(x0.b0<byte[]> b0Var, int i10) {
        x2.g.i(w0.b.j(b0Var.e()));
        x0.b0<Bitmap> apply = this.f24003j.apply(b0Var);
        x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> a0Var = this.f24007n;
        if (a0Var != null) {
            apply = a0Var.apply(apply);
        }
        return this.f24001h.apply(k.b.c(apply, i10));
    }

    public androidx.camera.core.d j(b bVar) {
        v0 b10 = bVar.b();
        x0.b0<androidx.camera.core.d> apply = this.f23999f.apply(bVar);
        List<Integer> c10 = this.f23998e.c();
        x2.g.a(!c10.isEmpty());
        int intValue = c10.get(0).intValue();
        if ((apply.e() == 35 || this.f24007n != null || this.f24009p) && intValue == 256) {
            x0.b0<byte[]> apply2 = this.f24000g.apply(b0.a.c(apply, b10.c()));
            if (this.f24007n != null) {
                apply2 = i(apply2, b10.c());
            }
            apply = this.f24005l.apply(apply2);
        }
        androidx.camera.core.d apply3 = this.f24004k.apply(apply);
        if (c10.size() > 1) {
            b10.k().u(apply3.getFormat(), true);
        }
        return apply3;
    }

    public void k(b bVar) {
        final v0 b10 = bVar.b();
        try {
            boolean z10 = true;
            if (this.f23998e.c().size() <= 1) {
                z10 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.d j10 = j(bVar);
                q0.c.e().execute(new Runnable() { // from class: m0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0.this.q(j10);
                    }
                });
                return;
            }
            final f1.i l10 = l(bVar);
            if (z10 && !b10.k().s()) {
                return;
            }
            q0.c.e().execute(new Runnable() { // from class: m0.r0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.this.r(l10);
                }
            });
        } catch (g0.h1 e10) {
            q(b10, e10);
        } catch (OutOfMemoryError e11) {
            q(b10, new g0.h1(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            q(b10, new g0.h1(0, "Processing failed.", e12));
        }
    }

    public f1.i l(b bVar) {
        List<Integer> c10 = this.f23998e.c();
        x2.g.a(!c10.isEmpty());
        boolean z10 = false;
        Integer num = c10.get(0);
        int intValue = num.intValue();
        x2.g.b(w0.b.j(intValue) || w0.b.k(intValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        v0 b10 = bVar.b();
        x2.g.b(b10.d() != null, "OutputFileOptions cannot be empty");
        x0.b0<androidx.camera.core.d> apply = this.f23999f.apply(bVar);
        if (c10.size() <= 1) {
            if (intValue != 32) {
                f1.h d10 = b10.d();
                Objects.requireNonNull(d10);
                return o(apply, d10, b10.c());
            }
            f1.h d11 = b10.d();
            Objects.requireNonNull(d11);
            return p(apply, d11);
        }
        if (b10.d() != null && b10.g() != null) {
            z10 = true;
        }
        x2.g.b(z10, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (apply.e() != 32) {
            f1.h g10 = b10.g();
            Objects.requireNonNull(g10);
            f1.i o8 = o(apply, g10, b10.c());
            b10.k().u(256, true);
            return o8;
        }
        f1.h d12 = b10.d();
        Objects.requireNonNull(d12);
        f1.i p8 = p(apply, d12);
        b10.k().u(32, true);
        return p8;
    }

    public void m(b bVar) {
        boolean z10;
        final v0 b10 = bVar.b();
        try {
            x0.b0<androidx.camera.core.d> apply = this.f23999f.apply(bVar);
            int e10 = apply.e();
            if (e10 != 35 && e10 != 256 && e10 != 4101) {
                z10 = false;
                x2.g.b(z10, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(e10)));
                final Bitmap apply2 = this.f24006m.apply(apply);
                q0.c.e().execute(new Runnable() { // from class: m0.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0.this.t(apply2);
                    }
                });
            }
            z10 = true;
            x2.g.b(z10, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(e10)));
            final Bitmap apply22 = this.f24006m.apply(apply);
            q0.c.e().execute(new Runnable() { // from class: m0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.this.t(apply22);
                }
            });
        } catch (Exception e11) {
            bVar.a().close();
            r1.d("ProcessingNode", "process postview input packet failed.", e11);
        }
    }

    public void n() {
    }

    public final f1.i o(x0.b0<androidx.camera.core.d> b0Var, f1.h hVar, int i10) {
        x0.b0<byte[]> apply = this.f24000g.apply(b0.a.c(b0Var, i10));
        if (apply.i() || this.f24007n != null) {
            apply = i(apply, i10);
        }
        x0.a0<f0.a, f1.i> a0Var = this.f24002i;
        Objects.requireNonNull(hVar);
        return a0Var.apply(f0.a.c(apply, hVar));
    }

    public final f1.i p(x0.b0<androidx.camera.core.d> b0Var, f1.h hVar) {
        if (this.f23997d == null) {
            if (this.f23996c == null) {
                throw new g0.h1(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (b0Var.a().e() == null) {
                throw new g0.h1(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.f23996c;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult e10 = b0Var.a().e();
            Objects.requireNonNull(e10);
            this.f23997d = new y(cameraCharacteristics, e10);
        }
        y yVar = this.f23997d;
        androidx.camera.core.d c10 = b0Var.c();
        int f10 = b0Var.f();
        Objects.requireNonNull(hVar);
        return yVar.apply(y.a.d(c10, f10, hVar));
    }

    public final void q(final v0 v0Var, final g0.h1 h1Var) {
        q0.c.e().execute(new Runnable() { // from class: m0.t0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.u(h1Var);
            }
        });
    }

    public Void r(a aVar) {
        this.f23998e = aVar;
        aVar.a().a(new x2.a() { // from class: m0.m0
            @Override // x2.a
            public final void accept(Object obj) {
                u0.b(u0.this, (u0.b) obj);
            }
        });
        aVar.d().a(new x2.a() { // from class: m0.n0
            @Override // x2.a
            public final void accept(Object obj) {
                u0.d(u0.this, (u0.b) obj);
            }
        });
        this.f23999f = new l0();
        this.f24000g = new b0(this.f24008o);
        this.f24003j = new e0();
        this.f24001h = new k();
        this.f24002i = new f0();
        this.f24004k = new h0();
        this.f24006m = new a0();
        if (aVar.b() == 35 || this.b != null || this.f24009p) {
            this.f24005l = new g0();
        }
        x0.y yVar = this.b;
        if (yVar == null) {
            return null;
        }
        this.f24007n = new l(yVar);
        return null;
    }

    public u0(Executor executor, CameraCharacteristics cameraCharacteristics, x0.y yVar, k3 k3Var) {
        if (u0.b.b(LowMemoryQuirk.class) != null) {
            this.f23995a = q0.c.g(executor);
        } else {
            this.f23995a = executor;
        }
        this.b = yVar;
        this.f23996c = cameraCharacteristics;
        this.f24008o = k3Var;
        this.f24009p = k3Var.a(IncorrectJpegMetadataQuirk.class);
    }
}
