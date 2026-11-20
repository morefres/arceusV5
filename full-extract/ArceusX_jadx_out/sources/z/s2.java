package z;

import android.util.Size;
import n0.o3;

/* loaded from: classes.dex */
public final class s2 implements o3.e {

    /* renamed from: a, reason: collision with root package name */
    public static final s2 f37422a = new s2();

    @Override // n0.o3.e
    public void a(Size size, n0.i4<?> i4Var, o3.b bVar) {
        n0.o3 j10 = i4Var.j(null);
        n0.n1 i02 = n0.c3.i0();
        int q10 = n0.o3.b().q();
        if (j10 != null) {
            q10 = j10.q();
            bVar.b(j10.c());
            bVar.d(j10.m());
            bVar.c(j10.k());
            i02 = j10.g();
        }
        bVar.w(i02);
        if (i4Var instanceof n0.f3) {
            d0.o.b(size, bVar);
        }
        y.a aVar = new y.a(i4Var);
        bVar.B(aVar.j0(q10));
        bVar.f(aVar.k0(w2.b()));
        bVar.k(aVar.n0(v2.b()));
        bVar.e(c3.e(aVar.m0(a1.c())));
        bVar.C(i4Var.x());
        bVar.z(i4Var.E());
        n0.x2 k02 = n0.x2.k0();
        k02.G(y.a.W, aVar.l0(null));
        k02.G(y.a.R, Long.valueOf(aVar.o0(-1L)));
        bVar.g(k02);
        bVar.g(aVar.i0());
    }
}
