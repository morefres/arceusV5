package c2;

import androidx.core.view.InputDeviceCompat;
import c2.e;
import d2.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends m {
    public int O0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public d2.b M0 = new d2.b(this);
    public d2.e N0 = new d2.e(this);
    public b.InterfaceC0278b P0 = null;
    public boolean Q0 = false;
    public z1.d R0 = new z1.d();
    public int W0 = 0;
    public int X0 = 0;
    public c[] Y0 = new c[4];
    public c[] Z0 = new c[4];

    /* renamed from: a1, reason: collision with root package name */
    public boolean f4547a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f4548b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f4549c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    public int f4550d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public int f4551e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    public int f4552f1 = InputDeviceCompat.SOURCE_KEYBOARD;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f4553g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f4554h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f4555i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    public int f4556j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    public WeakReference<d> f4557k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    public WeakReference<d> f4558l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    public WeakReference<d> f4559m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    public WeakReference<d> f4560n1 = null;

    /* renamed from: o1, reason: collision with root package name */
    public HashSet<e> f4561o1 = new HashSet<>();

    /* renamed from: p1, reason: collision with root package name */
    public b.a f4562p1 = new b.a();

    public static boolean U1(int i10, e eVar, b.InterfaceC0278b interfaceC0278b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0278b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f14263e = 0;
            aVar.f14264f = 0;
            return false;
        }
        aVar.f14260a = eVar.A();
        aVar.b = eVar.T();
        aVar.f14261c = eVar.W();
        aVar.f14262d = eVar.x();
        aVar.f14267i = false;
        aVar.f14268j = i11;
        e.b bVar = aVar.f14260a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.b == bVar2;
        boolean z12 = z10 && eVar.f4497d0 > 0.0f;
        boolean z13 = z11 && eVar.f4497d0 > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f4534w == 0 && !z12) {
            aVar.f14260a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f4536x == 0) {
                aVar.f14260a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f4536x == 0 && !z13) {
            aVar.b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f4534w == 0) {
                aVar.b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f14260a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f4538y[0] == 4) {
                aVar.f14260a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f14262d;
                } else {
                    aVar.f14260a = e.b.WRAP_CONTENT;
                    interfaceC0278b.b(eVar, aVar);
                    i13 = aVar.f14264f;
                }
                aVar.f14260a = bVar4;
                aVar.f14261c = (int) (eVar.v() * i13);
            }
        }
        if (z13) {
            if (eVar.f4538y[1] == 4) {
                aVar.b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f14260a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f14261c;
                } else {
                    aVar.b = e.b.WRAP_CONTENT;
                    interfaceC0278b.b(eVar, aVar);
                    i12 = aVar.f14263e;
                }
                aVar.b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f14262d = (int) (i12 / eVar.v());
                } else {
                    aVar.f14262d = (int) (eVar.v() * i12);
                }
            }
        }
        interfaceC0278b.b(eVar, aVar);
        eVar.l1(aVar.f14263e);
        eVar.M0(aVar.f14264f);
        eVar.L0(aVar.f14266h);
        eVar.B0(aVar.f14265g);
        aVar.f14268j = b.a.f14257k;
        return aVar.f14267i;
    }

    public void A1(d dVar) {
        WeakReference<d> weakReference = this.f4558l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4558l1.get().e()) {
            this.f4558l1 = new WeakReference<>(dVar);
        }
    }

    public final void B1(d dVar, z1.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    public final void C1(d dVar, z1.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    public final void D1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, R1());
        this.X0++;
    }

    public void E1(d dVar) {
        WeakReference<d> weakReference = this.f4559m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4559m1.get().e()) {
            this.f4559m1 = new WeakReference<>(dVar);
        }
    }

    public void F1(d dVar) {
        WeakReference<d> weakReference = this.f4557k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4557k1.get().e()) {
            this.f4557k1 = new WeakReference<>(dVar);
        }
    }

    public boolean G1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean H1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean I1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public void J1(z1.e eVar) {
        this.R0.v(eVar);
    }

    public b.InterfaceC0278b K1() {
        return this.P0;
    }

    public int L1() {
        return this.f4552f1;
    }

    public z1.d M1() {
        return this.R0;
    }

    public boolean N1() {
        return false;
    }

    @Override // c2.e
    public void O(StringBuilder sb2) {
        sb2.append(this.f4518o + ":{\n");
        sb2.append("  actualWidth:" + this.f4493b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f4495c0);
        sb2.append("\n");
        ArrayList<e> s12 = s1();
        int size = s12.size();
        int i10 = 0;
        while (i10 < size) {
            e eVar = s12.get(i10);
            i10++;
            eVar.O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void O1() {
        this.N0.j();
    }

    public void P1() {
        this.N0.k();
    }

    public boolean Q1() {
        return this.f4555i1;
    }

    public boolean R1() {
        return this.Q0;
    }

    public boolean S1() {
        return this.f4554h1;
    }

    public long T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.S0 = i17;
        this.T0 = i18;
        return this.M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean V1(int i10) {
        return (this.f4552f1 & i10) == i10;
    }

    public final void W1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    public void X1(b.InterfaceC0278b interfaceC0278b) {
        this.P0 = interfaceC0278b;
        this.N0.n(interfaceC0278b);
    }

    public void Y1(int i10) {
        this.f4552f1 = i10;
        z1.d.f37676s = V1(512);
    }

    public void Z1(int i10) {
        this.O0 = i10;
    }

    public void a2(boolean z10) {
        this.Q0 = z10;
    }

    public boolean b2(z1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean V1 = V1(64);
        r1(dVar, V1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.r1(dVar, V1);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c2() {
        this.M0.e(this);
    }

    @Override // c2.e
    public void q1(boolean z10, boolean z11) {
        super.q1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).q1(z10, z11);
        }
    }

    @Override // c2.m, c2.e
    public void t0() {
        this.R0.E();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f4553g1 = false;
        super.t0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // c2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t1() {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f.t1():void");
    }

    public void w1(e eVar, int i10) {
        if (i10 == 0) {
            y1(eVar);
        } else if (i10 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(z1.d dVar) {
        f fVar;
        z1.d dVar2;
        boolean V1 = V1(64);
        g(dVar, V1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).z1();
                }
            }
        }
        this.f4561o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f4561o1.add(eVar3);
                } else {
                    eVar3.g(dVar, V1);
                }
            }
        }
        while (this.f4561o1.size() > 0) {
            int size2 = this.f4561o1.size();
            Iterator<e> it = this.f4561o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.w1(this.f4561o1)) {
                    lVar.g(dVar, V1);
                    this.f4561o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f4561o1.size()) {
                Iterator<e> it2 = this.f4561o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, V1);
                }
                this.f4561o1.clear();
            }
        }
        if (z1.d.f37676s) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, dVar2, next);
                next.g(dVar2, V1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = fVar.L0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.h1(e.b.FIXED);
                    }
                    eVar5.g(dVar2, V1);
                    if (bVar == bVar3) {
                        eVar5.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar2, V1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public final void y1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, R1());
        this.W0++;
    }

    public void z1(d dVar) {
        WeakReference<d> weakReference = this.f4560n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4560n1.get().e()) {
            this.f4560n1 = new WeakReference<>(dVar);
        }
    }
}
