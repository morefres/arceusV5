package y0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import g0.i0;
import g0.j2;
import g0.k0;
import g0.r1;
import java.util.Map;
import x0.c0;
import x0.z;
import z0.d;

/* loaded from: classes.dex */
public final class c extends z {

    /* renamed from: n, reason: collision with root package name */
    public int f36196n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f36197o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f36198p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f36199q;

    public c(i0 i0Var, i0 i0Var2) {
        this.f36198p = i0Var;
        this.f36199q = i0Var2;
    }

    public static float[] u(Size size, Size size2, i0 i0Var) {
        float[] l10 = z0.d.l();
        float[] l11 = z0.d.l();
        float[] l12 = z0.d.l();
        Matrix.scaleM(l10, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (i0Var.c().f35015a.floatValue() != 0.0f || i0Var.c().b.floatValue() != 0.0f) {
            Matrix.translateM(l11, 0, i0Var.b().f35015a.floatValue() / i0Var.c().f35015a.floatValue(), i0Var.b().b.floatValue() / i0Var.c().b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(l12, 0, l10, 0, l11, 0);
        return l12;
    }

    @Override // x0.z
    public z0.e h(k0 k0Var, Map<d.e, c0> map) {
        z0.e h10 = super.h(k0Var, map);
        this.f36196n = z0.d.p();
        this.f36197o = z0.d.p();
        return h10;
    }

    @Override // x0.z
    public void k() {
        super.k();
        this.f36196n = -1;
        this.f36197o = -1;
    }

    public int t(boolean z10) {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        return z10 ? this.f36196n : this.f36197o;
    }

    public void v(long j10, Surface surface, j2 j2Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        z0.g f10 = f(surface);
        if (f10 == z0.d.f37647l) {
            f10 = c(surface);
            if (f10 == null) {
                return;
            } else {
                this.b.put(surface, f10);
            }
        }
        z0.g gVar = f10;
        if (surface != this.f35007i) {
            i(gVar.a());
            this.f35007i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, j2Var, surfaceTexture, this.f36198p, this.f36196n, true);
        w(gVar, j2Var, surfaceTexture2, this.f36199q, this.f36197o, false);
        EGLExt.eglPresentationTimeANDROID(this.f35002d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f35002d, gVar.a())) {
            return;
        }
        r1.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public final void w(z0.g gVar, j2 j2Var, SurfaceTexture surfaceTexture, i0 i0Var, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        j2Var.S(fArr2, fArr, z10);
        d.f fVar = (d.f) x2.g.g(this.f35009k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * i0Var.c().f35015a.floatValue()), (int) (gVar.b() * i0Var.c().b.floatValue())), new Size(gVar.c(), gVar.b()), i0Var));
        fVar.d(i0Var.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
