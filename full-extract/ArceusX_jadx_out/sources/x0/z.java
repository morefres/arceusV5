package x0;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import g0.r1;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import z0.d;
import z0.e;

/* loaded from: classes.dex */
public class z {

    /* renamed from: c, reason: collision with root package name */
    public Thread f35001c;

    /* renamed from: g, reason: collision with root package name */
    public EGLConfig f35005g;

    /* renamed from: i, reason: collision with root package name */
    public Surface f35007i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f35000a = new AtomicBoolean(false);
    public final Map<Surface, z0.g> b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f35002d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f35003e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    public int[] f35004f = z0.d.f37637a;

    /* renamed from: h, reason: collision with root package name */
    public EGLSurface f35006h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    public Map<d.e, d.f> f35008j = Collections.EMPTY_MAP;

    /* renamed from: k, reason: collision with root package name */
    public d.f f35009k = null;

    /* renamed from: l, reason: collision with root package name */
    public d.e f35010l = d.e.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    public int f35011m = -1;

    public final void a(int i10) {
        GLES20.glActiveTexture(33984);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        z0.d.g("glBindTexture");
    }

    public final void b(g0.k0 k0Var, e.a aVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f35002d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f35002d, iArr, 0, iArr, 1)) {
            this.f35002d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = k0Var.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f35002d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, k0Var.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, k0Var.d() ? 64 : 4, 12610, k0Var.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f35002d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, k0Var.d() ? 3 : 2, 12344}, 0);
        z0.d.f("eglCreateContext");
        this.f35005g = eGLConfig;
        this.f35003e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f35002d, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public z0.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f35002d;
            EGLConfig eGLConfig = this.f35005g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface q10 = z0.d.q(eGLDisplay, eGLConfig, surface, this.f35004f);
            Size x10 = z0.d.x(this.f35002d, q10);
            return z0.g.d(q10, x10.getWidth(), x10.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            r1.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f35002d;
        EGLConfig eGLConfig = this.f35005g;
        Objects.requireNonNull(eGLConfig);
        this.f35006h = z0.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    public final x2.c<String, String> e(g0.k0 k0Var) {
        z0.d.i(this.f35000a, false);
        try {
            b(k0Var, null);
            d();
            i(this.f35006h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f35002d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new x2.c<>(glGetString, eglQueryString);
        } catch (IllegalStateException e10) {
            r1.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new x2.c<>("", "");
        } finally {
            l();
        }
    }

    public z0.g f(Surface surface) {
        x2.g.j(this.b.containsKey(surface), "The surface is not registered.");
        z0.g gVar = this.b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        return this.f35011m;
    }

    public z0.e h(g0.k0 k0Var, Map<d.e, c0> map) {
        z0.d.i(this.f35000a, false);
        e.a a10 = z0.e.a();
        try {
            if (k0Var.d()) {
                x2.c<String, String> e10 = e(k0Var);
                String str = (String) x2.g.g(e10.f35015a);
                String str2 = (String) x2.g.g(e10.b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    r1.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    k0Var = g0.k0.f17922d;
                }
                this.f35004f = z0.d.k(str2, k0Var);
                a10.d(str);
                a10.b(str2);
            }
            b(k0Var, a10);
            d();
            i(this.f35006h);
            a10.e(z0.d.w());
            this.f35008j = z0.d.o(k0Var, map);
            int p8 = z0.d.p();
            this.f35011m = p8;
            s(p8);
            this.f35001c = Thread.currentThread();
            this.f35000a.set(true);
            return a10.a();
        } catch (IllegalArgumentException e11) {
            e = e11;
            l();
            throw e;
        } catch (IllegalStateException e12) {
            e = e12;
            l();
            throw e;
        }
    }

    public void i(EGLSurface eGLSurface) {
        x2.g.g(this.f35002d);
        x2.g.g(this.f35003e);
        if (!EGL14.eglMakeCurrent(this.f35002d, eGLSurface, eGLSurface, this.f35003e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        if (this.b.containsKey(surface)) {
            return;
        }
        this.b.put(surface, z0.d.f37647l);
    }

    public void k() {
        if (this.f35000a.getAndSet(false)) {
            z0.d.h(this.f35001c);
            l();
        }
    }

    public final void l() {
        Iterator<d.f> it = this.f35008j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f35008j = Collections.EMPTY_MAP;
        this.f35009k = null;
        if (!Objects.equals(this.f35002d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f35002d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (z0.g gVar : this.b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f35002d, gVar.a())) {
                    z0.d.e("eglDestroySurface");
                }
            }
            this.b.clear();
            if (!Objects.equals(this.f35006h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f35002d, this.f35006h);
                this.f35006h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f35003e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f35002d, this.f35003e);
                this.f35003e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f35002d);
            this.f35002d = EGL14.EGL_NO_DISPLAY;
        }
        this.f35005g = null;
        this.f35011m = -1;
        this.f35010l = d.e.UNKNOWN;
        this.f35007i = null;
        this.f35001c = null;
    }

    public void m(Surface surface, boolean z10) {
        if (this.f35007i == surface) {
            this.f35007i = null;
            i(this.f35006h);
        }
        z0.g remove = z10 ? this.b.remove(surface) : this.b.put(surface, z0.d.f37647l);
        if (remove == null || remove == z0.d.f37647l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f35002d, remove.a());
        } catch (RuntimeException e10) {
            r1.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
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
        if (surface != this.f35007i) {
            i(f10.a());
            this.f35007i = surface;
            GLES20.glViewport(0, 0, f10.c(), f10.b());
            GLES20.glScissor(0, 0, f10.c(), f10.b());
        }
        d.f fVar = (d.f) x2.g.g(this.f35009k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f35002d, f10.a(), j10);
        if (EGL14.eglSwapBuffers(this.f35002d, f10.a())) {
            return;
        }
        r1.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        if (this.f35010l != eVar) {
            this.f35010l = eVar;
            s(this.f35011m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.j(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public final void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        x2.g.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        x2.g.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int u8 = z0.d.u();
        GLES20.glActiveTexture(33985);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, u8);
        z0.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        z0.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int t8 = z0.d.t();
        GLES20.glBindFramebuffer(36160, t8);
        z0.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, u8, 0);
        z0.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f35011m);
        z0.d.g("glBindTexture");
        this.f35007i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) x2.g.g(this.f35009k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        z0.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        z0.d.s(u8);
        z0.d.r(t8);
        a(this.f35011m);
    }

    public void r(Surface surface) {
        z0.d.i(this.f35000a, true);
        z0.d.h(this.f35001c);
        m(surface, true);
    }

    public void s(int i10) {
        d.f fVar = this.f35008j.get(this.f35010l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f35010l);
        }
        if (this.f35009k != fVar) {
            this.f35009k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f35010l + ": " + this.f35009k);
        }
        a(i10);
    }
}
