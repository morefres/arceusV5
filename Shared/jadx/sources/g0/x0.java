package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import g0.u0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import n0.j2;
import y1.c;

/* loaded from: classes.dex */
public abstract class x0 implements j2.a {

    /* renamed from: a, reason: collision with root package name */
    public u0.a f18054a;
    public volatile int b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f18055c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f18057e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f18058f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f18059g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f18060h;

    /* renamed from: i, reason: collision with root package name */
    public ImageWriter f18061i;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f18066n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f18067o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f18068p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f18069q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f18070r;

    /* renamed from: s, reason: collision with root package name */
    public ByteBuffer f18071s;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f18056d = 1;

    /* renamed from: j, reason: collision with root package name */
    public Rect f18062j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public Rect f18063k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    public Matrix f18064l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    public Matrix f18065m = new Matrix();

    /* renamed from: t, reason: collision with root package name */
    public final Object f18072t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public boolean f18073u = true;

    public static /* synthetic */ void b(x0 x0Var, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, u0.a aVar, c.a aVar2) {
        if (!x0Var.f18073u) {
            aVar2.f(new u2.m("ImageAnalysis is detached"));
            return;
        }
        h2 h2Var = new h2(dVar2, o1.f(dVar.I2().c(), dVar.I2().getTimestamp(), x0Var.f18057e ? 0 : x0Var.b, matrix, dVar.I2().b()));
        if (!rect.isEmpty()) {
            h2Var.K0(rect);
        }
        aVar.k(h2Var);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final x0 x0Var, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final u0.a aVar, final c.a aVar2) {
        x0Var.getClass();
        executor.execute(new Runnable() { // from class: g0.w0
            @Override // java.lang.Runnable
            public final void run() {
                x0.b(x0.this, dVar, matrix, dVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static androidx.camera.core.f h(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new androidx.camera.core.f(n1.a(i15, i10, i13, i14));
    }

    public static Matrix j(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), p0.a0.f28194a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(p0.a0.c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    public static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // n0.j2.a
    public void a(n0.j2 j2Var) {
        try {
            androidx.camera.core.d d10 = d(j2Var);
            if (d10 != null) {
                l(d10);
            }
        } catch (IllegalStateException e10) {
            r1.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    public abstract androidx.camera.core.d d(n0.j2 j2Var);

    public ne.x<Void> e(final androidx.camera.core.d dVar) {
        Object obj;
        final Executor executor;
        final u0.a aVar;
        boolean z10;
        androidx.camera.core.f fVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        androidx.camera.core.d o8;
        androidx.camera.core.d dVar2;
        int i10 = this.f18057e ? this.b : 0;
        Object obj2 = this.f18072t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f18059g;
                    aVar = this.f18054a;
                    z10 = this.f18057e && i10 != this.f18055c;
                    if (z10) {
                        n(dVar, i10);
                    }
                    try {
                        try {
                            if (!this.f18057e) {
                                if (this.f18056d == 3) {
                                }
                                fVar = this.f18060h;
                                imageWriter = this.f18061i;
                                byteBuffer = this.f18066n;
                                byteBuffer2 = this.f18067o;
                                byteBuffer3 = this.f18068p;
                                byteBuffer4 = this.f18069q;
                                byteBuffer5 = this.f18070r;
                                byteBuffer6 = this.f18071s;
                            }
                            imageWriter = this.f18061i;
                            byteBuffer = this.f18066n;
                            byteBuffer2 = this.f18067o;
                            byteBuffer3 = this.f18068p;
                            byteBuffer4 = this.f18069q;
                            byteBuffer5 = this.f18070r;
                            byteBuffer6 = this.f18071s;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                        fVar = this.f18060h;
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                    g(dVar);
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f18073u) {
            return r0.n.n(new u2.m("No analyzer or executor currently set."));
        }
        if (fVar != null) {
            if (this.f18056d == 2) {
                o8 = ImageProcessingUtil.g(dVar, fVar, byteBuffer, i10, this.f18058f);
            } else {
                if (this.f18056d == 1) {
                    if (this.f18058f) {
                        ImageProcessingUtil.c(dVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        o8 = ImageProcessingUtil.n(dVar, fVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                dVar2 = null;
            }
            dVar2 = o8;
        } else {
            if (this.f18056d == 3) {
                if (this.f18058f) {
                    ImageProcessingUtil.c(dVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    o8 = ImageProcessingUtil.o(dVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    dVar2 = o8;
                }
            }
            dVar2 = null;
        }
        boolean z11 = dVar2 == null;
        final androidx.camera.core.d dVar3 = z11 ? dVar : dVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f18072t) {
            if (z10 && !z11) {
                try {
                    m(dVar.getWidth(), dVar.getHeight(), dVar3.getWidth(), dVar3.getHeight());
                } finally {
                }
            }
            this.f18055c = i10;
            rect.set(this.f18063k);
            matrix.set(this.f18065m);
        }
        return y1.c.a(new c.InterfaceC0669c() { // from class: g0.v0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar2) {
                return x0.c(x0.this, executor, dVar, matrix, dVar3, rect, aVar, aVar2);
            }
        });
    }

    public abstract void f();

    public final void g(androidx.camera.core.d dVar) {
        if (this.f18056d != 1 && this.f18056d != 3) {
            if (this.f18056d == 2 && this.f18066n == null) {
                this.f18066n = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f18067o == null) {
            this.f18067o = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
        }
        this.f18067o.position(0);
        if (this.f18068p == null) {
            this.f18068p = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f18068p.position(0);
        if (this.f18069q == null) {
            this.f18069q = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f18069q.position(0);
        if (this.f18056d == 3) {
            if (this.f18070r == null) {
                this.f18070r = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
            }
            this.f18070r.position(0);
            if (this.f18071s == null) {
                this.f18071s = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 2);
            }
            this.f18071s.position(0);
        }
    }

    public void i() {
        this.f18073u = false;
        f();
    }

    public abstract void l(androidx.camera.core.d dVar);

    public final void m(int i10, int i11, int i12, int i13) {
        Matrix j10 = j(i10, i11, i12, i13, this.b);
        this.f18063k = k(this.f18062j, j10);
        this.f18065m.setConcat(this.f18064l, j10);
    }

    public final void n(androidx.camera.core.d dVar, int i10) {
        androidx.camera.core.f fVar = this.f18060h;
        if (fVar == null) {
            return;
        }
        fVar.j();
        this.f18060h = h(dVar.getWidth(), dVar.getHeight(), i10, this.f18060h.c(), this.f18060h.e());
        if (this.f18056d == 1) {
            ImageWriter imageWriter = this.f18061i;
            if (imageWriter != null) {
                t0.a.a(imageWriter);
            }
            this.f18061i = t0.a.c(this.f18060h.getSurface(), this.f18060h.e());
        }
    }

    public void o(Executor executor, u0.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f18072t) {
            this.f18054a = aVar;
            this.f18059g = executor;
        }
    }

    public void p(boolean z10) {
        this.f18058f = z10;
    }

    public void q(int i10) {
        this.f18056d = i10;
    }

    public void r(boolean z10) {
        this.f18057e = z10;
    }

    public void s(androidx.camera.core.f fVar) {
        synchronized (this.f18072t) {
            this.f18060h = fVar;
        }
    }

    public void t(int i10) {
        this.b = i10;
    }

    public void u(Matrix matrix) {
        synchronized (this.f18072t) {
            this.f18064l = matrix;
            this.f18065m = new Matrix(this.f18064l);
        }
    }

    public void v(Rect rect) {
        synchronized (this.f18072t) {
            this.f18062j = rect;
            this.f18063k = new Rect(this.f18062j);
        }
    }
}
