package c2;

import c2.e;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean[] f4606a = new boolean[3];

    public static void a(f fVar, z1.d dVar, e eVar) {
        eVar.f4528t = -1;
        eVar.f4530u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f4479g;
            int W = fVar.W() - eVar.Q.f4479g;
            d dVar2 = eVar.O;
            dVar2.f4481i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f4481i = dVar.q(dVar3);
            dVar.f(eVar.O.f4481i, i10);
            dVar.f(eVar.Q.f4481i, W);
            eVar.f4528t = 2;
            eVar.P0(i10, W);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f4479g;
        int x10 = fVar.x() - eVar.R.f4479g;
        d dVar4 = eVar.P;
        dVar4.f4481i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f4481i = dVar.q(dVar5);
        dVar.f(eVar.P.f4481i, i11);
        dVar.f(eVar.R.f4481i, x10);
        if (eVar.f4513l0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.S;
            dVar6.f4481i = dVar.q(dVar6);
            dVar.f(eVar.S.f4481i, eVar.f4513l0 + i11);
        }
        eVar.f4530u = 2;
        eVar.g1(i11, x10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
