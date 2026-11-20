package x0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import g0.j2;
import g0.r1;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import y1.c;

/* loaded from: classes.dex */
public final class q0 implements j2 {
    public final Surface b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34954d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f34955e;

    /* renamed from: f, reason: collision with root package name */
    public final j2.a f34956f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.a f34957g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f34958h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f34959i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f34960j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f34961k;

    /* renamed from: l, reason: collision with root package name */
    public x2.a<j2.b> f34962l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f34963m;

    /* renamed from: p, reason: collision with root package name */
    public final ne.x<Void> f34966p;

    /* renamed from: q, reason: collision with root package name */
    public c.a<Void> f34967q;

    /* renamed from: r, reason: collision with root package name */
    public Matrix f34968r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f34952a = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f34964n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34965o = false;

    public q0(Surface surface, int i10, int i11, Size size, j2.a aVar, j2.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f34958h = fArr;
        float[] fArr2 = new float[16];
        this.f34959i = fArr2;
        float[] fArr3 = new float[16];
        this.f34960j = fArr3;
        float[] fArr4 = new float[16];
        this.f34961k = fArr4;
        this.b = surface;
        this.f34953c = i10;
        this.f34954d = i11;
        this.f34955e = size;
        this.f34956f = aVar;
        this.f34957g = aVar2;
        this.f34968r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f34966p = y1.c.a(new c.InterfaceC0669c() { // from class: x0.o0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar3) {
                return q0.a(q0.this, aVar3);
            }
        });
    }

    public static /* synthetic */ Object a(q0 q0Var, c.a aVar) {
        q0Var.f34967q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void b(q0 q0Var, AtomicReference atomicReference) {
        q0Var.getClass();
        ((x2.a) atomicReference.get()).accept(j2.b.c(0, q0Var));
    }

    public static void c(float[] fArr, float[] fArr2, j2.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        p0.t.d(fArr, 0.5f);
        p0.t.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix e10 = p0.a0.e(p0.a0.t(aVar.c()), p0.a0.t(p0.a0.q(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        e10.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        d(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public static void d(float[] fArr, n0.p0 p0Var) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        p0.t.d(fArr, 0.5f);
        if (p0Var != null) {
            x2.g.j(p0Var.q(), "Camera has no transform.");
            p0.t.c(fArr, p0Var.d().d(), 0.5f, 0.5f);
            if (p0Var.l()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // g0.j2
    public void L1(float[] fArr, float[] fArr2) {
        S(fArr, fArr2, true);
    }

    @Override // g0.j2
    public void S(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f34958h : this.f34959i, 0);
    }

    @Override // g0.j2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f34952a) {
            try {
                if (!this.f34965o) {
                    this.f34965o = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34967q.c(null);
    }

    public ne.x<Void> e() {
        return this.f34966p;
    }

    public void f() {
        Executor executor;
        x2.a<j2.b> aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f34952a) {
            try {
                if (this.f34963m != null && (aVar = this.f34962l) != null) {
                    if (!this.f34965o) {
                        atomicReference.set(aVar);
                        executor = this.f34963m;
                        this.f34964n = false;
                    }
                    executor = null;
                }
                this.f34964n = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: x0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.b(q0.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                r1.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // g0.j2
    public int getFormat() {
        return this.f34954d;
    }

    @Override // g0.j2
    public Size i() {
        return this.f34955e;
    }

    @Override // g0.j2
    public Surface p2(Executor executor, x2.a<j2.b> aVar) {
        boolean z10;
        synchronized (this.f34952a) {
            this.f34963m = executor;
            this.f34962l = aVar;
            z10 = this.f34964n;
        }
        if (z10) {
            f();
        }
        return this.b;
    }
}
