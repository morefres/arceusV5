package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;
import m0.u0;
import n0.e0;

/* loaded from: classes.dex */
public final class l0 implements x0.a0<u0.b, x0.b0<androidx.camera.core.d>> {
    public static x0.b0<androidx.camera.core.d> b(v0 v0Var, p0.g gVar, androidx.camera.core.d dVar) {
        return x0.b0.k(dVar, gVar, v0Var.b(), v0Var.f(), v0Var.h(), d(dVar));
    }

    public static x0.b0<androidx.camera.core.d> c(v0 v0Var, p0.g gVar, androidx.camera.core.d dVar) {
        Size size = new Size(dVar.getWidth(), dVar.getHeight());
        int f10 = v0Var.f() - gVar.s();
        Size e10 = e(f10, size);
        Matrix d10 = p0.a0.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, e10.getWidth(), e10.getHeight()), f10);
        return x0.b0.l(dVar, gVar, e10, f(v0Var.b(), d10), gVar.s(), g(v0Var.h(), d10), d(dVar));
    }

    public static n0.e0 d(androidx.camera.core.d dVar) {
        return dVar.I2() instanceof s0.c ? ((s0.c) dVar.I2()).f() : e0.a.k();
    }

    public static Size e(int i10, Size size) {
        return p0.a0.i(p0.a0.w(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<androidx.camera.core.d> apply(u0.b bVar) {
        p0.g j10;
        androidx.camera.core.d a10 = bVar.a();
        v0 b = bVar.b();
        if (w0.b.j(a10.getFormat())) {
            try {
                j10 = p0.g.j(a10);
                a10.F1()[0].k().rewind();
            } catch (IOException e10) {
                throw new g0.h1(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            j10 = null;
        }
        if (!d0.f23938g.b(a10)) {
            return b(b, j10, a10);
        }
        x2.g.h(j10, "JPEG image must have exif.");
        return c(b, j10, a10);
    }
}
