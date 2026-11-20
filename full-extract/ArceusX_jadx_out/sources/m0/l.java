package m0;

import android.graphics.Bitmap;
import java.util.Objects;

/* loaded from: classes.dex */
public class l implements x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> {

    /* renamed from: a, reason: collision with root package name */
    public final x0.y f23977a;

    public l(x0.y yVar) {
        this.f23977a = yVar;
    }

    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<Bitmap> apply(x0.b0<Bitmap> b0Var) {
        androidx.camera.core.d a10 = this.f23977a.c(new x0.v(new z0(b0Var), 1)).a();
        Objects.requireNonNull(a10);
        Bitmap d10 = w0.b.d(a10.F1(), a10.getWidth(), a10.getHeight());
        p0.g d11 = b0Var.d();
        Objects.requireNonNull(d11);
        return x0.b0.j(d10, d11, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
