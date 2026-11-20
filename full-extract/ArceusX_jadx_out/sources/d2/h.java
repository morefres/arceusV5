package d2;

import c2.d;
import c2.e;
import d2.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static b.a f14299a = new b.a();
    public static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14300c = 0;

    public static boolean a(int i10, c2.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A = eVar.A();
        e.b T = eVar.T();
        c2.f fVar = eVar.K() != null ? (c2.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = A == bVar5 || eVar.n0() || A == e.b.WRAP_CONTENT || (A == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f4534w == 0 && eVar.f4497d0 == 0.0f && eVar.a0(0)) || (A == bVar2 && eVar.f4534w == 1 && eVar.d0(0, eVar.W()));
        boolean z11 = T == bVar5 || eVar.o0() || T == e.b.WRAP_CONTENT || (T == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f4536x == 0 && eVar.f4497d0 == 0.0f && eVar.a0(1)) || (T == bVar && eVar.f4536x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f4497d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, c2.e eVar, b.InterfaceC0278b interfaceC0278b, boolean z10) {
        c2.d dVar;
        c2.d dVar2;
        boolean z11;
        c2.d dVar3;
        c2.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z12 = true;
        b++;
        if (!(eVar instanceof c2.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                c2.f.U1(i11, eVar, interfaceC0278b, new b.a(), b.a.f14257k);
            }
        }
        c2.d o8 = eVar.o(d.a.LEFT);
        c2.d o10 = eVar.o(d.a.RIGHT);
        int e10 = o8.e();
        int e11 = o10.e();
        if (o8.d() != null && o8.n()) {
            Iterator<c2.d> it = o8.d().iterator();
            while (it.hasNext()) {
                c2.d next = it.next();
                c2.e eVar2 = next.f4476d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.m0() && a10) {
                    z11 = z12;
                    c2.f.U1(i12, eVar2, interfaceC0278b, new b.a(), b.a.f14257k);
                } else {
                    z11 = z12;
                }
                boolean z13 = ((next == eVar2.O && (dVar4 = eVar2.Q.f4478f) != null && dVar4.n()) || (next == eVar2.Q && (dVar3 = eVar2.O.f4478f) != null && dVar3.n())) ? z11 : false;
                e.b A = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (A != bVar || a10) {
                    if (!eVar2.m0()) {
                        c2.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f4478f == null) {
                            int f10 = dVar5.f() + e10;
                            eVar2.G0(f10, eVar2.W() + f10);
                            b(i12, eVar2, interfaceC0278b, z10);
                        } else {
                            c2.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f4478f == null) {
                                int f11 = e10 - dVar6.f();
                                eVar2.G0(f11 - eVar2.W(), f11);
                                b(i12, eVar2, interfaceC0278b, z10);
                            } else if (z13 && !eVar2.i0()) {
                                d(i12, interfaceC0278b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.A >= 0 && eVar2.f4540z >= 0 && ((eVar2.V() == 8 || (eVar2.f4534w == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z13 && !eVar2.i0())) {
                    e(i12, eVar, interfaceC0278b, eVar2, z10);
                }
                z12 = z11;
            }
        }
        boolean z14 = z12;
        if (eVar instanceof c2.h) {
            return;
        }
        if (o10.d() != null && o10.n()) {
            Iterator<c2.d> it2 = o10.d().iterator();
            while (it2.hasNext()) {
                c2.d next2 = it2.next();
                c2.e eVar3 = next2.f4476d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.m0() && a11) {
                    c2.f.U1(i13, eVar3, interfaceC0278b, new b.a(), b.a.f14257k);
                }
                boolean z15 = ((next2 == eVar3.O && (dVar2 = eVar3.Q.f4478f) != null && dVar2.n()) || (next2 == eVar3.Q && (dVar = eVar3.O.f4478f) != null && dVar.n())) ? z14 : false;
                e.b A2 = eVar3.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (A2 != bVar2 || a11) {
                    if (!eVar3.m0()) {
                        c2.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f4478f == null) {
                            int f12 = dVar7.f() + e11;
                            eVar3.G0(f12, eVar3.W() + f12);
                            b(i13, eVar3, interfaceC0278b, z10);
                        } else {
                            c2.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f4478f == null) {
                                int f13 = e11 - dVar8.f();
                                eVar3.G0(f13 - eVar3.W(), f13);
                                b(i13, eVar3, interfaceC0278b, z10);
                            } else if (z15 && !eVar3.i0()) {
                                d(i13, interfaceC0278b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.A >= 0 && eVar3.f4540z >= 0 && (eVar3.V() == 8 || (eVar3.f4534w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z15 && !eVar3.i0()) {
                        e(i13, eVar, interfaceC0278b, eVar3, z10);
                    }
                }
            }
        }
        eVar.q0();
    }

    public static void c(int i10, c2.a aVar, b.InterfaceC0278b interfaceC0278b, int i11, boolean z10) {
        if (aVar.u1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0278b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0278b);
            }
        }
    }

    public static void d(int i10, b.InterfaceC0278b interfaceC0278b, c2.e eVar, boolean z10) {
        float y10 = eVar.y();
        int e10 = eVar.O.f4478f.e();
        int e11 = eVar.Q.f4478f.e();
        int f10 = eVar.O.f() + e10;
        int f11 = e11 - eVar.Q.f();
        if (e10 == e11) {
            y10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int W = eVar.W();
        int i11 = (e11 - e10) - W;
        if (e10 > e11) {
            i11 = (e10 - e11) - W;
        }
        int i12 = ((int) (i11 > 0 ? (y10 * i11) + 0.5f : y10 * i11)) + e10;
        int i13 = i12 + W;
        if (e10 > e11) {
            i13 = i12 - W;
        }
        eVar.G0(i12, i13);
        b(i10 + 1, eVar, interfaceC0278b, z10);
    }

    public static void e(int i10, c2.e eVar, b.InterfaceC0278b interfaceC0278b, c2.e eVar2, boolean z10) {
        float y10 = eVar2.y();
        int e10 = eVar2.O.f4478f.e() + eVar2.O.f();
        int e11 = eVar2.Q.f4478f.e() - eVar2.Q.f();
        if (e11 >= e10) {
            int W = eVar2.W();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f4534w;
                if (i11 == 2) {
                    W = (int) (eVar2.y() * 0.5f * (eVar instanceof c2.f ? eVar.W() : eVar.K().W()));
                } else if (i11 == 0) {
                    W = e11 - e10;
                }
                W = Math.max(eVar2.f4540z, W);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    W = Math.min(i12, W);
                }
            }
            int i13 = e10 + ((int) ((y10 * ((e11 - e10) - W)) + 0.5f));
            eVar2.G0(i13, W + i13);
            b(i10 + 1, eVar2, interfaceC0278b, z10);
        }
    }

    public static void f(int i10, b.InterfaceC0278b interfaceC0278b, c2.e eVar) {
        float R = eVar.R();
        int e10 = eVar.P.f4478f.e();
        int e11 = eVar.R.f4478f.e();
        int f10 = eVar.P.f() + e10;
        int f11 = e11 - eVar.R.f();
        if (e10 == e11) {
            R = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int x10 = eVar.x();
        int i11 = (e11 - e10) - x10;
        if (e10 > e11) {
            i11 = (e10 - e11) - x10;
        }
        int i12 = (int) (i11 > 0 ? (R * i11) + 0.5f : R * i11);
        int i13 = e10 + i12;
        int i14 = i13 + x10;
        if (e10 > e11) {
            i13 = e10 - i12;
            i14 = i13 - x10;
        }
        eVar.J0(i13, i14);
        i(i10 + 1, eVar, interfaceC0278b);
    }

    public static void g(int i10, c2.e eVar, b.InterfaceC0278b interfaceC0278b, c2.e eVar2) {
        float R = eVar2.R();
        int e10 = eVar2.P.f4478f.e() + eVar2.P.f();
        int e11 = eVar2.R.f4478f.e() - eVar2.R.f();
        if (e11 >= e10) {
            int x10 = eVar2.x();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f4536x;
                if (i11 == 2) {
                    x10 = (int) (R * 0.5f * (eVar instanceof c2.f ? eVar.x() : eVar.K().x()));
                } else if (i11 == 0) {
                    x10 = e11 - e10;
                }
                x10 = Math.max(eVar2.C, x10);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    x10 = Math.min(i12, x10);
                }
            }
            int i13 = e10 + ((int) ((R * ((e11 - e10) - x10)) + 0.5f));
            eVar2.J0(i13, x10 + i13);
            i(i10 + 1, eVar2, interfaceC0278b);
        }
    }

    public static void h(c2.f fVar, b.InterfaceC0278b interfaceC0278b) {
        e.b A = fVar.A();
        e.b T = fVar.T();
        b = 0;
        f14300c = 0;
        fVar.v0();
        ArrayList<c2.e> s12 = fVar.s1();
        int size = s12.size();
        for (int i10 = 0; i10 < size; i10++) {
            s12.get(i10).v0();
        }
        boolean R1 = fVar.R1();
        if (A == e.b.FIXED) {
            fVar.G0(0, fVar.W());
        } else {
            fVar.H0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            c2.e eVar = s12.get(i11);
            if (eVar instanceof c2.h) {
                c2.h hVar = (c2.h) eVar;
                if (hVar.t1() == 1) {
                    if (hVar.u1() != -1) {
                        hVar.x1(hVar.u1());
                    } else if (hVar.v1() != -1 && fVar.n0()) {
                        hVar.x1(fVar.W() - hVar.v1());
                    } else if (fVar.n0()) {
                        hVar.x1((int) ((hVar.w1() * fVar.W()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof c2.a) && ((c2.a) eVar).y1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                c2.e eVar2 = s12.get(i12);
                if (eVar2 instanceof c2.h) {
                    c2.h hVar2 = (c2.h) eVar2;
                    if (hVar2.t1() == 1) {
                        b(0, hVar2, interfaceC0278b, R1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0278b, R1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                c2.e eVar3 = s12.get(i13);
                if (eVar3 instanceof c2.a) {
                    c2.a aVar = (c2.a) eVar3;
                    if (aVar.y1() == 0) {
                        c(0, aVar, interfaceC0278b, 0, R1);
                    }
                }
            }
        }
        if (T == e.b.FIXED) {
            fVar.J0(0, fVar.x());
        } else {
            fVar.I0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            c2.e eVar4 = s12.get(i14);
            if (eVar4 instanceof c2.h) {
                c2.h hVar3 = (c2.h) eVar4;
                if (hVar3.t1() == 0) {
                    if (hVar3.u1() != -1) {
                        hVar3.x1(hVar3.u1());
                    } else if (hVar3.v1() != -1 && fVar.o0()) {
                        hVar3.x1(fVar.x() - hVar3.v1());
                    } else if (fVar.o0()) {
                        hVar3.x1((int) ((hVar3.w1() * fVar.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof c2.a) && ((c2.a) eVar4).y1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                c2.e eVar5 = s12.get(i15);
                if (eVar5 instanceof c2.h) {
                    c2.h hVar4 = (c2.h) eVar5;
                    if (hVar4.t1() == 0) {
                        i(1, hVar4, interfaceC0278b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0278b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                c2.e eVar6 = s12.get(i16);
                if (eVar6 instanceof c2.a) {
                    c2.a aVar2 = (c2.a) eVar6;
                    if (aVar2.y1() == 1) {
                        c(0, aVar2, interfaceC0278b, 1, R1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            c2.e eVar7 = s12.get(i17);
            if (eVar7.m0() && a(0, eVar7)) {
                c2.f.U1(0, eVar7, interfaceC0278b, f14299a, b.a.f14257k);
                if (!(eVar7 instanceof c2.h)) {
                    b(0, eVar7, interfaceC0278b, R1);
                    i(0, eVar7, interfaceC0278b);
                } else if (((c2.h) eVar7).t1() == 0) {
                    i(0, eVar7, interfaceC0278b);
                } else {
                    b(0, eVar7, interfaceC0278b, R1);
                }
            }
        }
    }

    public static void i(int i10, c2.e eVar, b.InterfaceC0278b interfaceC0278b) {
        c2.d dVar;
        c2.d dVar2;
        c2.d dVar3;
        c2.d dVar4;
        if (eVar.p0()) {
            return;
        }
        boolean z10 = true;
        f14300c++;
        if (!(eVar instanceof c2.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                c2.f.U1(i11, eVar, interfaceC0278b, new b.a(), b.a.f14257k);
            }
        }
        c2.d o8 = eVar.o(d.a.TOP);
        c2.d o10 = eVar.o(d.a.BOTTOM);
        int e10 = o8.e();
        int e11 = o10.e();
        if (o8.d() != null && o8.n()) {
            Iterator<c2.d> it = o8.d().iterator();
            while (it.hasNext()) {
                c2.d next = it.next();
                c2.e eVar2 = next.f4476d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.m0() && a10) {
                    c2.f.U1(i12, eVar2, interfaceC0278b, new b.a(), b.a.f14257k);
                }
                boolean z11 = ((next == eVar2.P && (dVar4 = eVar2.R.f4478f) != null && dVar4.n()) || (next == eVar2.R && (dVar3 = eVar2.P.f4478f) != null && dVar3.n())) ? z10 : false;
                e.b T = eVar2.T();
                boolean z12 = z10;
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (T != bVar || a10) {
                    if (!eVar2.m0()) {
                        c2.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f4478f == null) {
                            int f10 = dVar5.f() + e10;
                            eVar2.J0(f10, eVar2.x() + f10);
                            i(i12, eVar2, interfaceC0278b);
                        } else {
                            c2.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f4478f == null) {
                                int f11 = e10 - dVar6.f();
                                eVar2.J0(f11 - eVar2.x(), f11);
                                i(i12, eVar2, interfaceC0278b);
                            } else if (z11 && !eVar2.k0()) {
                                f(i12, interfaceC0278b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.V() == 8 || (eVar2.f4536x == 0 && eVar2.v() == 0.0f)) && !eVar2.k0() && !eVar2.l0() && z11 && !eVar2.k0())) {
                    g(i12, eVar, interfaceC0278b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof c2.h) {
            return;
        }
        if (o10.d() != null && o10.n()) {
            Iterator<c2.d> it2 = o10.d().iterator();
            while (it2.hasNext()) {
                c2.d next2 = it2.next();
                c2.e eVar3 = next2.f4476d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.m0() && a11) {
                    c2.f.U1(i13, eVar3, interfaceC0278b, new b.a(), b.a.f14257k);
                }
                boolean z14 = ((next2 == eVar3.P && (dVar2 = eVar3.R.f4478f) != null && dVar2.n()) || (next2 == eVar3.R && (dVar = eVar3.P.f4478f) != null && dVar.n())) ? z13 : false;
                e.b T2 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (T2 != bVar2 || a11) {
                    if (!eVar3.m0()) {
                        c2.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f4478f == null) {
                            int f12 = dVar7.f() + e11;
                            eVar3.J0(f12, eVar3.x() + f12);
                            i(i13, eVar3, interfaceC0278b);
                        } else {
                            c2.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f4478f == null) {
                                int f13 = e11 - dVar8.f();
                                eVar3.J0(f13 - eVar3.x(), f13);
                                i(i13, eVar3, interfaceC0278b);
                            } else if (z14 && !eVar3.k0()) {
                                f(i13, interfaceC0278b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.V() == 8 || (eVar3.f4536x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z14 && !eVar3.k0()) {
                        g(i13, eVar, interfaceC0278b, eVar3);
                    }
                }
            }
        }
        c2.d o11 = eVar.o(d.a.BASELINE);
        if (o11.d() != null && o11.n()) {
            int e12 = o11.e();
            Iterator<c2.d> it3 = o11.d().iterator();
            while (it3.hasNext()) {
                c2.d next3 = it3.next();
                c2.e eVar4 = next3.f4476d;
                int i14 = i10 + 1;
                boolean a12 = a(i14, eVar4);
                if (eVar4.m0() && a12) {
                    c2.f.U1(i14, eVar4, interfaceC0278b, new b.a(), b.a.f14257k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || a12) {
                    if (!eVar4.m0() && next3 == eVar4.S) {
                        eVar4.F0(next3.f() + e12);
                        i(i14, eVar4, interfaceC0278b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
