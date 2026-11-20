package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.j2;
import n0.o3;
import w0.c;

/* loaded from: classes.dex */
public final class m6 implements i6 {

    /* renamed from: a, reason: collision with root package name */
    public final a0.c0 f37316a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final w0.f f37317c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37318d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37319e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37320f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37321g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f37322h;

    /* renamed from: i, reason: collision with root package name */
    public n0.u1 f37323i;

    /* renamed from: j, reason: collision with root package name */
    public b f37324j;

    public class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f37325a;

        public a(b bVar) {
            this.f37325a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f37325a.d(t0.a.c(inputSurface, 1));
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public ImageWriter f37326a;
        public final AtomicBoolean b = new AtomicBoolean(true);

        /* renamed from: c, reason: collision with root package name */
        public final Executor f37327c;

        public b(Executor executor) {
            this.f37327c = executor;
        }

        public void b() {
            this.b.set(false);
        }

        public boolean c(final androidx.camera.core.d dVar) {
            ImageWriter imageWriter;
            Image p8 = dVar.p();
            if (this.b.get() && (imageWriter = this.f37326a) != null && p8 != null) {
                try {
                    t0.a.d(imageWriter, p8);
                    t0.a.e(this.f37326a, new ImageWriter.OnImageReleasedListener() { // from class: z.n6
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            androidx.camera.core.d.this.close();
                        }
                    }, this.f37327c);
                    return true;
                } catch (IllegalStateException e10) {
                    g0.r1.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.b.get()) {
                if (this.f37326a != null) {
                    g0.r1.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f37326a.close();
                }
                this.f37326a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f37326a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public m6(a0.c0 c0Var, Executor executor) {
        this.f37320f = false;
        this.f37321g = false;
        this.f37316a = c0Var;
        this.b = executor;
        this.f37320f = o6.a(c0Var, 4);
        this.f37321g = c0.e.b(ZslDisablerQuirk.class) != null;
        this.f37317c = new w0.f(3, new c.a() { // from class: z.l6
            @Override // w0.c.a
            public final void a(Object obj) {
                ((androidx.camera.core.d) obj).close();
            }
        });
    }

    public static /* synthetic */ void i(m6 m6Var, n0.j2 j2Var) {
        m6Var.getClass();
        try {
            androidx.camera.core.d b10 = j2Var.b();
            if (b10 != null) {
                m6Var.f37317c.b(b10);
            }
        } catch (IllegalStateException e10) {
            g0.r1.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public static /* synthetic */ void j(androidx.camera.core.f fVar, b bVar) {
        fVar.j();
        bVar.e();
    }

    @Override // z.i6
    public void a(o3.b bVar) {
        k();
        if (this.f37318d) {
            bVar.B(1);
            return;
        }
        if (this.f37321g) {
            bVar.B(1);
            return;
        }
        Map<Integer, Size> m10 = m(this.f37316a);
        if (!this.f37320f || m10.isEmpty() || !m10.containsKey(34) || !n(this.f37316a, 34)) {
            bVar.B(1);
            return;
        }
        Size size = m10.get(34);
        androidx.camera.core.e eVar = new androidx.camera.core.e(size.getWidth(), size.getHeight(), 34, 9);
        final androidx.camera.core.f fVar = new androidx.camera.core.f(eVar);
        Surface surface = fVar.getSurface();
        Objects.requireNonNull(surface);
        n0.k2 k2Var = new n0.k2(surface, new Size(fVar.getWidth(), fVar.getHeight()), 34);
        final b bVar2 = new b(this.b);
        this.f37322h = fVar;
        this.f37323i = k2Var;
        this.f37324j = bVar2;
        fVar.f(new j2.a() { // from class: z.j6
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var) {
                m6.i(m6.this, j2Var);
            }
        }, q0.c.d());
        k2Var.k().a(new Runnable() { // from class: z.k6
            @Override // java.lang.Runnable
            public final void run() {
                m6.j(androidx.camera.core.f.this, bVar2);
            }
        }, this.b);
        bVar.l(k2Var);
        bVar.e(eVar.m());
        bVar.k(new a(bVar2));
        bVar.x(new InputConfiguration(fVar.getWidth(), fVar.getHeight(), fVar.c()));
    }

    @Override // z.i6
    public void b() {
        k();
    }

    @Override // z.i6
    public boolean c() {
        return this.f37318d;
    }

    @Override // z.i6
    public void d(boolean z10) {
        this.f37319e = z10;
    }

    @Override // z.i6
    public void e(boolean z10) {
        if (this.f37318d != z10 && z10) {
            l();
        }
        this.f37318d = z10;
    }

    @Override // z.i6
    public androidx.camera.core.d f() {
        try {
            return this.f37317c.a();
        } catch (NoSuchElementException unused) {
            g0.r1.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // z.i6
    public boolean g(androidx.camera.core.d dVar) {
        b bVar = this.f37324j;
        if (bVar != null) {
            return bVar.c(dVar);
        }
        return false;
    }

    @Override // z.i6
    public boolean h() {
        return this.f37319e;
    }

    public final void k() {
        androidx.camera.core.f fVar = this.f37322h;
        if (fVar != null) {
            fVar.d();
            this.f37322h = null;
        }
        b bVar = this.f37324j;
        if (bVar != null) {
            bVar.b();
            this.f37324j = null;
        }
        l();
        n0.u1 u1Var = this.f37323i;
        if (u1Var != null) {
            u1Var.d();
            this.f37323i = null;
        }
    }

    public final void l() {
        w0.f fVar = this.f37317c;
        while (!fVar.isEmpty()) {
            fVar.a().close();
        }
    }

    public final Map<Integer, Size> m(a0.c0 c0Var) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            g0.r1.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new p0.e(true));
                hashMap.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return hashMap;
    }

    public final boolean n(a0.c0 c0Var, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }
}
