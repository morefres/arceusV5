package m0;

import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import n0.k3;
import w0.b;

/* loaded from: classes.dex */
public final class b0 implements x0.a0<a, x0.b0<byte[]>> {

    /* renamed from: a, reason: collision with root package name */
    public final v0.d f23932a;

    public static abstract class a {
        public static a c(x0.b0<androidx.camera.core.d> b0Var, int i10) {
            return new d(b0Var, i10);
        }

        public abstract int a();

        public abstract x0.b0<androidx.camera.core.d> b();
    }

    public b0(k3 k3Var) {
        this.f23932a = new v0.d(k3Var);
    }

    public static p0.g b(byte[] bArr) {
        try {
            return p0.g.k(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new g0.h1(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<byte[]> apply(a aVar) {
        x0.b0<byte[]> d10;
        try {
            int e10 = aVar.b().e();
            if (e10 != 35) {
                if (e10 != 256 && e10 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + e10);
                }
                d10 = c(aVar, e10);
            } else {
                d10 = d(aVar);
            }
            aVar.b().c().close();
            return d10;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }

    public final x0.b0<byte[]> c(a aVar, int i10) {
        x0.b0<androidx.camera.core.d> b = aVar.b();
        byte[] a10 = this.f23932a.a(b.c());
        p0.g d10 = b.d();
        Objects.requireNonNull(d10);
        return x0.b0.m(a10, d10, i10, b.h(), b.b(), b.f(), b.g(), b.a());
    }

    public final x0.b0<byte[]> d(a aVar) {
        x0.b0<androidx.camera.core.d> b = aVar.b();
        androidx.camera.core.d c10 = b.c();
        Rect b10 = b.b();
        try {
            byte[] n10 = w0.b.n(c10, b10, aVar.a(), b.f());
            return x0.b0.m(n10, b(n10), 256, new Size(b10.width(), b10.height()), new Rect(0, 0, b10.width(), b10.height()), b.f(), p0.a0.v(b.g(), b10), b.a());
        } catch (b.a e10) {
            throw new g0.h1(1, "Failed to encode the image to JPEG.", e10);
        }
    }
}
