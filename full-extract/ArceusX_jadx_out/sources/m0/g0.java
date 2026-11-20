package m0;

import androidx.camera.core.ImageProcessingUtil;
import g0.n1;
import java.util.Objects;

/* loaded from: classes.dex */
public class g0 implements x0.a0<x0.b0<byte[]>, x0.b0<androidx.camera.core.d>> {
    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0.b0<androidx.camera.core.d> apply(x0.b0<byte[]> b0Var) {
        androidx.camera.core.f fVar = new androidx.camera.core.f(n1.a(b0Var.h().getWidth(), b0Var.h().getHeight(), 256, 2));
        androidx.camera.core.d e10 = ImageProcessingUtil.e(fVar, b0Var.c());
        fVar.j();
        Objects.requireNonNull(e10);
        p0.g d10 = b0Var.d();
        Objects.requireNonNull(d10);
        return x0.b0.k(e10, d10, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
