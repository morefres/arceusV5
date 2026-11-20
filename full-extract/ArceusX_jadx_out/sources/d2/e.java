package d2;

import c2.e;
import d2.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public c2.f f14271a;

    /* renamed from: d, reason: collision with root package name */
    public c2.f f14273d;
    public boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14272c = true;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<p> f14274e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<m> f14275f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public b.InterfaceC0278b f14276g = null;

    /* renamed from: h, reason: collision with root package name */
    public b.a f14277h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<m> f14278i = new ArrayList<>();

    public e(c2.f fVar) {
        this.f14271a = fVar;
        this.f14273d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f14281d;
        if (pVar.f14326c == null) {
            c2.f fVar4 = this.f14271a;
            if (pVar == fVar4.f4498e || pVar == fVar4.f4500f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f14326c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f14331h.f14288k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f14332i.f14288k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f14310k.f14288k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f14331h.f14289l) {
                if (fVar6 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f14332i.f14289l) {
                if (fVar7 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f14310k.f14289l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    public final boolean b(c2.f fVar) {
        e.b bVar;
        int i10;
        e.b bVar2;
        float f10;
        float f11;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        ArrayList<c2.e> arrayList = fVar.L0;
        int size = arrayList.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            e.b[] bVarArr = eVar2.Z;
            e.b bVar6 = bVarArr[c10 == true ? 1 : 0];
            e.b bVar7 = bVarArr[1];
            if (eVar2.V() == 8) {
                eVar2.f4491a = true;
            } else {
                if (eVar2.B < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar2.f4534w = 2;
                }
                if (eVar2.E < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    eVar2.f4536x = 2;
                }
                if (eVar2.v() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        eVar2.f4534w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar2.f4536x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar2.f4534w == 0) {
                            eVar2.f4534w = 3;
                        }
                        if (eVar2.f4536x == 0) {
                            eVar2.f4536x = 3;
                        }
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar2.f4534w == 1 && (eVar2.O.f4478f == null || eVar2.Q.f4478f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar2.f4536x == 1 && (eVar2.P.f4478f == null || eVar2.R.f4478f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                l lVar = eVar2.f4498e;
                lVar.f14327d = bVar6;
                int i12 = eVar2.f4534w;
                lVar.f14325a = i12;
                n nVar = eVar2.f4500f;
                nVar.f14327d = bVar7;
                int i13 = eVar2.f4536x;
                nVar.f14325a = i13;
                e.b bVar10 = e.b.MATCH_PARENT;
                char c11 = c10 == true ? 1 : 0;
                if ((bVar6 == bVar10 || bVar6 == e.b.FIXED || bVar6 == e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == e.b.FIXED || bVar7 == e.b.WRAP_CONTENT)) {
                    e.b bVar11 = bVar7;
                    e.b bVar12 = bVar6;
                    int W = eVar2.W();
                    if (bVar12 == bVar10) {
                        W = (fVar.W() - eVar2.O.f4479g) - eVar2.Q.f4479g;
                        bVar12 = e.b.FIXED;
                    }
                    int i14 = W;
                    int x10 = eVar2.x();
                    if (bVar11 == bVar10) {
                        x10 = (fVar.x() - eVar2.P.f4479g) - eVar2.R.f4479g;
                        bVar11 = e.b.FIXED;
                    }
                    l(eVar2, bVar12, i14, bVar11, x10);
                    eVar2.f4498e.f14328e.d(eVar2.W());
                    eVar2.f4500f.f14328e.d(eVar2.x());
                    eVar2.f4491a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f11 = 0.5f;
                        e.b bVar13 = e.b.WRAP_CONTENT;
                        f10 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar2, bVar13, 0, bVar13, 0);
                            }
                            int x11 = eVar2.x();
                            int i15 = (int) ((x11 * eVar2.f4497d0) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            l(eVar2, bVar14, i15, bVar14, x11);
                            eVar2.f4498e.f14328e.d(eVar2.W());
                            eVar2.f4500f.f14328e.d(eVar2.x());
                            eVar2.f4491a = true;
                        } else if (i12 == 1) {
                            l(eVar2, bVar13, 0, bVar7, 0);
                            eVar2.f4498e.f14328e.f14298m = eVar2.W();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i12 == 2) {
                                e.b bVar15 = fVar.Z[c11];
                                e.b bVar16 = e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar2, bVar16, (int) ((eVar2.B * fVar.W()) + 0.5f), bVar, eVar2.x());
                                    eVar2.f4498e.f14328e.d(eVar2.W());
                                    eVar2.f4500f.f14328e.d(eVar2.x());
                                    eVar2.f4491a = true;
                                }
                            } else {
                                c2.d[] dVarArr = eVar2.W;
                                if (dVarArr[c11].f4478f == null || dVarArr[1].f4478f == null) {
                                    l(eVar2, bVar13, 0, bVar, 0);
                                    eVar2.f4498e.f14328e.d(eVar2.W());
                                    eVar2.f4500f.f14328e.d(eVar2.x());
                                    eVar2.f4491a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        bVar2 = bVar9;
                        f10 = 1.0f;
                        f11 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar6 != (bVar4 = e.b.WRAP_CONTENT) && bVar6 != e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i13 == i10) {
                        if (bVar6 == bVar4) {
                            l(eVar2, bVar4, 0, bVar4, 0);
                        }
                        int W2 = eVar2.W();
                        float f12 = eVar2.f4497d0;
                        if (eVar2.w() == -1) {
                            f12 = f10 / f12;
                        }
                        e.b bVar17 = e.b.FIXED;
                        l(eVar2, bVar17, W2, bVar17, (int) ((W2 * f12) + f11));
                        eVar2.f4498e.f14328e.d(eVar2.W());
                        eVar2.f4500f.f14328e.d(eVar2.x());
                        eVar2.f4491a = true;
                    } else if (i13 == 1) {
                        l(eVar2, bVar6, 0, bVar4, 0);
                        eVar2.f4500f.f14328e.f14298m = eVar2.x();
                    } else {
                        bVar3 = bVar6;
                        if (i13 == 2) {
                            e.b bVar18 = fVar.Z[1];
                            bVar5 = bVar;
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                l(eVar2, bVar3, eVar2.W(), bVar19, (int) ((eVar2.E * fVar.x()) + f11));
                                eVar2.f4498e.f14328e.d(eVar2.W());
                                eVar2.f4500f.f14328e.d(eVar2.x());
                                eVar2.f4491a = true;
                            }
                            bVar = bVar5;
                        } else {
                            bVar5 = bVar;
                            c2.d[] dVarArr2 = eVar2.W;
                            if (dVarArr2[2].f4478f == null || dVarArr2[i10].f4478f == null) {
                                l(eVar2, bVar4, 0, bVar5, 0);
                                eVar2.f4498e.f14328e.d(eVar2.W());
                                eVar2.f4500f.f14328e.d(eVar2.x());
                                eVar2.f4491a = true;
                            }
                            bVar = bVar5;
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i12 == 1 || i13 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            l(eVar2, bVar20, 0, bVar20, 0);
                            eVar2.f4498e.f14328e.f14298m = eVar2.W();
                            eVar2.f4500f.f14328e.f14298m = eVar2.x();
                        } else if (i13 == 2 && i12 == 2) {
                            e.b[] bVarArr2 = fVar.Z;
                            e.b bVar21 = bVarArr2[c11];
                            e.b bVar22 = e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                l(eVar2, bVar22, (int) ((eVar2.B * fVar.W()) + f11), bVar22, (int) ((eVar2.E * fVar.x()) + f11));
                                eVar2.f4498e.f14328e.d(eVar2.W());
                                eVar2.f4500f.f14328e.d(eVar2.x());
                                eVar2.f4491a = true;
                            }
                        }
                    }
                }
                c10 = c11;
            }
        }
        return c10 == true ? 1 : 0;
    }

    public void c() {
        d(this.f14274e);
        this.f14278i.clear();
        m.f14303h = 0;
        i(this.f14271a.f4498e, 0, this.f14278i);
        i(this.f14271a.f4500f, 1, this.f14278i);
        this.b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f14273d.f4498e.f();
        this.f14273d.f4500f.f();
        arrayList.add(this.f14273d.f4498e);
        arrayList.add(this.f14273d.f4500f);
        ArrayList<c2.e> arrayList2 = this.f14273d.L0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList2.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            if (eVar2 instanceof c2.h) {
                arrayList.add(new j(eVar2));
            } else {
                if (eVar2.i0()) {
                    if (eVar2.f4494c == null) {
                        eVar2.f4494c = new c(eVar2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f4494c);
                } else {
                    arrayList.add(eVar2.f4498e);
                }
                if (eVar2.k0()) {
                    if (eVar2.f4496d == null) {
                        eVar2.f4496d = new c(eVar2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.f4496d);
                } else {
                    arrayList.add(eVar2.f4500f);
                }
                if (eVar2 instanceof c2.j) {
                    arrayList.add(new k(eVar2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            p pVar = arrayList.get(i12);
            i12++;
            pVar.f();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            p pVar2 = arrayList.get(i10);
            i10++;
            p pVar3 = pVar2;
            if (pVar3.b != this.f14273d) {
                pVar3.d();
            }
        }
    }

    public final int e(c2.f fVar, int i10) {
        int size = this.f14278i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f14278i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.b || this.f14272c) {
            ArrayList<c2.e> arrayList = this.f14271a.L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                c2.e eVar = arrayList.get(i10);
                i10++;
                c2.e eVar2 = eVar;
                eVar2.n();
                eVar2.f4491a = false;
                eVar2.f4498e.r();
                eVar2.f4500f.q();
            }
            this.f14271a.n();
            c2.f fVar = this.f14271a;
            fVar.f4491a = false;
            fVar.f4498e.r();
            this.f14271a.f4500f.q();
            this.f14272c = false;
        }
        if (b(this.f14273d)) {
            return false;
        }
        this.f14271a.n1(0);
        this.f14271a.o1(0);
        e.b u8 = this.f14271a.u(0);
        e.b u10 = this.f14271a.u(1);
        if (this.b) {
            c();
        }
        int X = this.f14271a.X();
        int Y = this.f14271a.Y();
        this.f14271a.f4498e.f14331h.d(X);
        this.f14271a.f4500f.f14331h.d(Y);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u8 == bVar || u10 == bVar) {
            if (z10) {
                ArrayList<p> arrayList2 = this.f14274e;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    p pVar = arrayList2.get(i11);
                    i11++;
                    if (!pVar.m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && u8 == e.b.WRAP_CONTENT) {
                this.f14271a.Q0(e.b.FIXED);
                c2.f fVar2 = this.f14271a;
                fVar2.l1(e(fVar2, 0));
                c2.f fVar3 = this.f14271a;
                fVar3.f4498e.f14328e.d(fVar3.W());
            }
            if (z10 && u10 == e.b.WRAP_CONTENT) {
                this.f14271a.h1(e.b.FIXED);
                c2.f fVar4 = this.f14271a;
                fVar4.M0(e(fVar4, 1));
                c2.f fVar5 = this.f14271a;
                fVar5.f4500f.f14328e.d(fVar5.x());
            }
        }
        c2.f fVar6 = this.f14271a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W = fVar6.W() + X;
            this.f14271a.f4498e.f14332i.d(W);
            this.f14271a.f4498e.f14328e.d(W - X);
            m();
            c2.f fVar7 = this.f14271a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x10 = fVar7.x() + Y;
                this.f14271a.f4500f.f14332i.d(x10);
                this.f14271a.f4500f.f14328e.d(x10 - Y);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<p> arrayList3 = this.f14274e;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            p pVar2 = arrayList3.get(i12);
            i12++;
            p pVar3 = pVar2;
            if (pVar3.b != this.f14271a || pVar3.f14330g) {
                pVar3.e();
            }
        }
        ArrayList<p> arrayList4 = this.f14274e;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                z12 = true;
                break;
            }
            p pVar4 = arrayList4.get(i13);
            i13++;
            p pVar5 = pVar4;
            if (z11 || pVar5.b != this.f14271a) {
                if (!pVar5.f14331h.f14287j) {
                    break;
                }
                if (!pVar5.f14332i.f14287j) {
                    if (!(pVar5 instanceof j)) {
                        break;
                    }
                }
                if (!pVar5.f14328e.f14287j && !(pVar5 instanceof c) && !(pVar5 instanceof j)) {
                    break;
                }
            }
        }
        this.f14271a.Q0(u8);
        this.f14271a.h1(u10);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.b) {
            ArrayList<c2.e> arrayList = this.f14271a.L0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                c2.e eVar = arrayList.get(i10);
                i10++;
                c2.e eVar2 = eVar;
                eVar2.n();
                eVar2.f4491a = false;
                l lVar = eVar2.f4498e;
                lVar.f14328e.f14287j = false;
                lVar.f14330g = false;
                lVar.r();
                n nVar = eVar2.f4500f;
                nVar.f14328e.f14287j = false;
                nVar.f14330g = false;
                nVar.q();
            }
            this.f14271a.n();
            c2.f fVar = this.f14271a;
            fVar.f4491a = false;
            l lVar2 = fVar.f4498e;
            lVar2.f14328e.f14287j = false;
            lVar2.f14330g = false;
            lVar2.r();
            n nVar2 = this.f14271a.f4500f;
            nVar2.f14328e.f14287j = false;
            nVar2.f14330g = false;
            nVar2.q();
            c();
        }
        if (b(this.f14273d)) {
            return false;
        }
        this.f14271a.n1(0);
        this.f14271a.o1(0);
        this.f14271a.f4498e.f14331h.d(0);
        this.f14271a.f4500f.f14331h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b u8 = this.f14271a.u(0);
        e.b u10 = this.f14271a.u(1);
        int X = this.f14271a.X();
        int Y = this.f14271a.Y();
        if (z10 && (u8 == (bVar = e.b.WRAP_CONTENT) || u10 == bVar)) {
            ArrayList<p> arrayList = this.f14274e;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                p pVar = arrayList.get(i11);
                i11++;
                p pVar2 = pVar;
                if (pVar2.f14329f == i10 && !pVar2.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && u8 == e.b.WRAP_CONTENT) {
                    this.f14271a.Q0(e.b.FIXED);
                    c2.f fVar = this.f14271a;
                    fVar.l1(e(fVar, 0));
                    c2.f fVar2 = this.f14271a;
                    fVar2.f4498e.f14328e.d(fVar2.W());
                }
            } else if (z10 && u10 == e.b.WRAP_CONTENT) {
                this.f14271a.h1(e.b.FIXED);
                c2.f fVar3 = this.f14271a;
                fVar3.M0(e(fVar3, 1));
                c2.f fVar4 = this.f14271a;
                fVar4.f4500f.f14328e.d(fVar4.x());
            }
        }
        if (i10 == 0) {
            c2.f fVar5 = this.f14271a;
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int W = fVar5.W() + X;
                this.f14271a.f4498e.f14332i.d(W);
                this.f14271a.f4498e.f14328e.d(W - X);
                z11 = true;
            }
            z11 = false;
        } else {
            c2.f fVar6 = this.f14271a;
            e.b bVar3 = fVar6.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int x10 = fVar6.x() + Y;
                this.f14271a.f4500f.f14332i.d(x10);
                this.f14271a.f4500f.f14328e.d(x10 - Y);
                z11 = true;
            }
            z11 = false;
        }
        m();
        ArrayList<p> arrayList2 = this.f14274e;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            p pVar3 = arrayList2.get(i12);
            i12++;
            p pVar4 = pVar3;
            if (pVar4.f14329f == i10 && (pVar4.b != this.f14271a || pVar4.f14330g)) {
                pVar4.e();
            }
        }
        ArrayList<p> arrayList3 = this.f14274e;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                z12 = true;
                break;
            }
            p pVar5 = arrayList3.get(i13);
            i13++;
            p pVar6 = pVar5;
            if (pVar6.f14329f == i10 && (z11 || pVar6.b != this.f14271a)) {
                if (!pVar6.f14331h.f14287j) {
                    break;
                }
                if (!pVar6.f14332i.f14287j) {
                    break;
                }
                if (!(pVar6 instanceof c) && !pVar6.f14328e.f14287j) {
                    break;
                }
            }
        }
        this.f14271a.Q0(u8);
        this.f14271a.h1(u10);
        return z12;
    }

    public final void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f14331h.f14288k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f14332i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f14331h, i10, 0, pVar.f14332i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f14332i.f14288k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f14331h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f14332i, i10, 1, pVar.f14331h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f14310k.f14288k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.f14272c = true;
    }

    public final void l(c2.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f14277h;
        aVar.f14260a = bVar;
        aVar.b = bVar2;
        aVar.f14261c = i10;
        aVar.f14262d = i11;
        this.f14276g.b(eVar, aVar);
        eVar.l1(this.f14277h.f14263e);
        eVar.M0(this.f14277h.f14264f);
        eVar.L0(this.f14277h.f14266h);
        eVar.B0(this.f14277h.f14265g);
    }

    public void m() {
        g gVar;
        ArrayList<c2.e> arrayList = this.f14271a.L0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayList.get(i10);
            i10++;
            c2.e eVar2 = eVar;
            if (!eVar2.f4491a) {
                e.b[] bVarArr = eVar2.Z;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i11 = eVar2.f4534w;
                int i12 = eVar2.f4536x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i11 == 1);
                boolean z11 = bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i12 == 1);
                g gVar2 = eVar2.f4498e.f14328e;
                boolean z12 = gVar2.f14287j;
                g gVar3 = eVar2.f4500f.f14328e;
                boolean z13 = gVar3.f14287j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar2, bVar4, gVar2.f14284g, bVar4, gVar3.f14284g);
                    eVar2.f4491a = true;
                } else if (z12 && z11) {
                    l(eVar2, e.b.FIXED, gVar2.f14284g, bVar3, gVar3.f14284g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar2.f4500f.f14328e.f14298m = eVar2.x();
                    } else {
                        eVar2.f4500f.f14328e.d(eVar2.x());
                        eVar2.f4491a = true;
                    }
                } else if (z13 && z10) {
                    l(eVar2, bVar3, gVar2.f14284g, e.b.FIXED, gVar3.f14284g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar2.f4498e.f14328e.f14298m = eVar2.W();
                    } else {
                        eVar2.f4498e.f14328e.d(eVar2.W());
                        eVar2.f4491a = true;
                    }
                }
                if (eVar2.f4491a && (gVar = eVar2.f4500f.f14311l) != null) {
                    gVar.d(eVar2.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0278b interfaceC0278b) {
        this.f14276g = interfaceC0278b;
    }
}
