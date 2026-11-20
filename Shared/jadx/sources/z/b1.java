package z;

import n0.l1;

/* loaded from: classes.dex */
public class b1 implements l1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f37056a = new b1();

    @Override // n0.l1.b
    public void a(n0.i4<?> i4Var, l1.a aVar) {
        n0.l1 s8 = i4Var.s(null);
        n0.n1 i02 = n0.c3.i0();
        int k10 = n0.l1.b().k();
        if (s8 != null) {
            k10 = s8.k();
            aVar.a(s8.c());
            i02 = s8.g();
        }
        aVar.s(i02);
        y.a aVar2 = new y.a(i4Var);
        aVar.v(aVar2.j0(k10));
        aVar.c(c3.e(aVar2.m0(a1.c())));
        aVar.e(aVar2.i0());
    }
}
