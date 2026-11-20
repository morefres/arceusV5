package w0;

import g0.i1;
import n0.a0;
import n0.c0;
import n0.e0;
import n0.f0;
import n0.y;
import w0.c;

/* loaded from: classes.dex */
public final class f extends a<androidx.camera.core.d> {
    public f(int i10, c.a<androidx.camera.core.d> aVar) {
        super(i10, aVar);
    }

    @Override // w0.a, w0.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(androidx.camera.core.d dVar) {
        if (d(dVar.I2())) {
            super.b(dVar);
        } else {
            this.f33607d.a(dVar);
        }
    }

    public final boolean d(i1 i1Var) {
        e0 a10 = f0.a(i1Var);
        if (a10 == null) {
            return false;
        }
        return (a10.g() == a0.LOCKED_FOCUSED || a10.g() == a0.PASSIVE_FOCUSED) && a10.j() == y.CONVERGED && a10.h() == c0.CONVERGED;
    }
}
