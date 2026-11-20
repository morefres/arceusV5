package m0;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import g0.n1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a0 implements x0.a0<x0.b0<androidx.camera.core.d>, Bitmap> {
    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(x0.b0<androidx.camera.core.d> b0Var) {
        androidx.camera.core.f fVar;
        Bitmap m10;
        androidx.camera.core.f fVar2 = null;
        try {
            try {
                int e10 = b0Var.e();
                if (e10 == 35) {
                    androidx.camera.core.d c10 = b0Var.c();
                    boolean z10 = b0Var.f() % 180 != 0;
                    fVar = new androidx.camera.core.f(n1.a(z10 ? c10.getHeight() : c10.getWidth(), z10 ? c10.getWidth() : c10.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.d g10 = ImageProcessingUtil.g(c10, fVar, ByteBuffer.allocateDirect(c10.getWidth() * c10.getHeight() * 4), b0Var.f(), false);
                        c10.close();
                        if (g10 == null) {
                            throw new g0.h1(0, "Can't covert YUV to RGB", null);
                        }
                        m10 = w0.b.b(g10);
                        g10.close();
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        throw new g0.h1(0, "Can't convert " + (b0Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        fVar2 = fVar;
                        if (fVar2 != null) {
                            fVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (e10 != 256 && e10 != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b0Var.e());
                    }
                    androidx.camera.core.d c11 = b0Var.c();
                    Bitmap b = w0.b.b(c11);
                    c11.close();
                    fVar = null;
                    m10 = w0.b.m(b, b0Var.f());
                }
                if (fVar != null) {
                    fVar.close();
                }
                return m10;
            } catch (UnsupportedOperationException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
