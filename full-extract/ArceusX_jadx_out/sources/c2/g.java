package c2;

import c2.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: x1, reason: collision with root package name */
    public e[] f4586x1;

    /* renamed from: a1, reason: collision with root package name */
    public int f4563a1 = -1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4564b1 = -1;

    /* renamed from: c1, reason: collision with root package name */
    public int f4565c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    public int f4566d1 = -1;

    /* renamed from: e1, reason: collision with root package name */
    public int f4567e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    public int f4568f1 = -1;

    /* renamed from: g1, reason: collision with root package name */
    public float f4569g1 = 0.5f;

    /* renamed from: h1, reason: collision with root package name */
    public float f4570h1 = 0.5f;

    /* renamed from: i1, reason: collision with root package name */
    public float f4571i1 = 0.5f;

    /* renamed from: j1, reason: collision with root package name */
    public float f4572j1 = 0.5f;

    /* renamed from: k1, reason: collision with root package name */
    public float f4573k1 = 0.5f;

    /* renamed from: l1, reason: collision with root package name */
    public float f4574l1 = 0.5f;

    /* renamed from: m1, reason: collision with root package name */
    public int f4575m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    public int f4576n1 = 0;

    /* renamed from: o1, reason: collision with root package name */
    public int f4577o1 = 2;

    /* renamed from: p1, reason: collision with root package name */
    public int f4578p1 = 2;

    /* renamed from: q1, reason: collision with root package name */
    public int f4579q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    public int f4580r1 = -1;

    /* renamed from: s1, reason: collision with root package name */
    public int f4581s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    public ArrayList<a> f4582t1 = new ArrayList<>();

    /* renamed from: u1, reason: collision with root package name */
    public e[] f4583u1 = null;

    /* renamed from: v1, reason: collision with root package name */
    public e[] f4584v1 = null;

    /* renamed from: w1, reason: collision with root package name */
    public int[] f4585w1 = null;

    /* renamed from: y1, reason: collision with root package name */
    public int f4587y1 = 0;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4588a;

        /* renamed from: d, reason: collision with root package name */
        public d f4590d;

        /* renamed from: e, reason: collision with root package name */
        public d f4591e;

        /* renamed from: f, reason: collision with root package name */
        public d f4592f;

        /* renamed from: g, reason: collision with root package name */
        public d f4593g;

        /* renamed from: h, reason: collision with root package name */
        public int f4594h;

        /* renamed from: i, reason: collision with root package name */
        public int f4595i;

        /* renamed from: j, reason: collision with root package name */
        public int f4596j;

        /* renamed from: k, reason: collision with root package name */
        public int f4597k;

        /* renamed from: q, reason: collision with root package name */
        public int f4603q;
        public e b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f4589c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f4598l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f4599m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f4600n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f4601o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f4602p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f4594h = 0;
            this.f4595i = 0;
            this.f4596j = 0;
            this.f4597k = 0;
            this.f4603q = 0;
            this.f4588a = i10;
            this.f4590d = dVar;
            this.f4591e = dVar2;
            this.f4592f = dVar3;
            this.f4593g = dVar4;
            this.f4594h = g.this.A1();
            this.f4595i = g.this.C1();
            this.f4596j = g.this.B1();
            this.f4597k = g.this.z1();
            this.f4603q = i11;
        }

        public void b(e eVar) {
            if (this.f4588a == 0) {
                int m22 = g.this.m2(eVar, this.f4603q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f4602p++;
                    m22 = 0;
                }
                this.f4598l += m22 + (eVar.V() != 8 ? g.this.f4575m1 : 0);
                int l22 = g.this.l2(eVar, this.f4603q);
                if (this.b == null || this.f4589c < l22) {
                    this.b = eVar;
                    this.f4589c = l22;
                    this.f4599m = l22;
                }
            } else {
                int m23 = g.this.m2(eVar, this.f4603q);
                int l23 = g.this.l2(eVar, this.f4603q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f4602p++;
                    l23 = 0;
                }
                this.f4599m += l23 + (eVar.V() != 8 ? g.this.f4576n1 : 0);
                if (this.b == null || this.f4589c < m23) {
                    this.b = eVar;
                    this.f4589c = m23;
                    this.f4598l = m23;
                }
            }
            this.f4601o++;
        }

        public void c() {
            this.f4589c = 0;
            this.b = null;
            this.f4598l = 0;
            this.f4599m = 0;
            this.f4600n = 0;
            this.f4601o = 0;
            this.f4602p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f4601o;
            for (int i13 = 0; i13 < i12 && this.f4600n + i13 < g.this.f4587y1; i13++) {
                e eVar2 = g.this.f4586x1[this.f4600n + i13];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i12 == 0 || this.b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f4600n + i17 >= g.this.f4587y1) {
                    break;
                }
                e eVar3 = g.this.f4586x1[this.f4600n + i17];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar4 = null;
            if (this.f4588a != 0) {
                e eVar5 = this.b;
                eVar5.O0(g.this.f4563a1);
                int i18 = this.f4594h;
                if (i10 > 0) {
                    i18 += g.this.f4575m1;
                }
                if (z10) {
                    eVar5.Q.a(this.f4592f, i18);
                    if (z11) {
                        eVar5.O.a(this.f4590d, this.f4596j);
                    }
                    if (i10 > 0) {
                        this.f4592f.f4476d.O.a(eVar5.Q, 0);
                    }
                } else {
                    eVar5.O.a(this.f4590d, i18);
                    if (z11) {
                        eVar5.Q.a(this.f4592f, this.f4596j);
                    }
                    if (i10 > 0) {
                        this.f4590d.f4476d.Q.a(eVar5.O, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f4600n + i19 < g.this.f4587y1; i19++) {
                    e eVar6 = g.this.f4586x1[this.f4600n + i19];
                    if (eVar6 != null) {
                        if (i19 == 0) {
                            eVar6.k(eVar6.P, this.f4591e, this.f4595i);
                            int i20 = g.this.f4564b1;
                            float f12 = g.this.f4570h1;
                            if (this.f4600n == 0 && g.this.f4566d1 != -1) {
                                i20 = g.this.f4566d1;
                                f12 = g.this.f4572j1;
                            } else if (z11 && g.this.f4568f1 != -1) {
                                i20 = g.this.f4568f1;
                                f12 = g.this.f4574l1;
                            }
                            eVar6.f1(i20);
                            eVar6.e1(f12);
                        }
                        if (i19 == i12 - 1) {
                            eVar6.k(eVar6.R, this.f4593g, this.f4597k);
                        }
                        if (eVar4 != null) {
                            eVar6.P.a(eVar4.R, g.this.f4576n1);
                            if (i19 == i14) {
                                eVar6.P.u(this.f4595i);
                            }
                            eVar4.R.a(eVar6.P, 0);
                            if (i19 == i15 + 1) {
                                eVar4.R.u(this.f4597k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z10) {
                                int i21 = g.this.f4577o1;
                                if (i21 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i21 == 1) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i21 == 2) {
                                    eVar6.O.a(eVar5.O, 0);
                                    eVar6.Q.a(eVar5.Q, 0);
                                }
                            } else {
                                int i22 = g.this.f4577o1;
                                if (i22 == 0) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i22 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        eVar6.O.a(this.f4590d, this.f4594h);
                                        eVar6.Q.a(this.f4592f, this.f4596j);
                                    } else {
                                        eVar6.O.a(eVar5.O, 0);
                                        eVar6.Q.a(eVar5.Q, 0);
                                    }
                                }
                                eVar4 = eVar6;
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.b;
            eVar7.f1(g.this.f4564b1);
            int i23 = this.f4595i;
            if (i10 > 0) {
                i23 += g.this.f4576n1;
            }
            eVar7.P.a(this.f4591e, i23);
            if (z11) {
                eVar7.R.a(this.f4593g, this.f4597k);
            }
            if (i10 > 0) {
                this.f4591e.f4476d.R.a(eVar7.P, 0);
            }
            char c11 = 3;
            if (g.this.f4578p1 == 3 && !eVar7.Z()) {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f4600n + i25 >= g.this.f4587y1) {
                        break;
                    }
                    eVar = g.this.f4586x1[this.f4600n + i25];
                    if (eVar.Z()) {
                        break;
                    }
                }
            }
            eVar = eVar7;
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f4600n + i27 >= g.this.f4587y1) {
                    return;
                }
                e eVar8 = g.this.f4586x1[this.f4600n + i27];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        eVar8.k(eVar8.O, this.f4590d, this.f4594h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = g.this.f4563a1;
                        float f13 = g.this.f4569g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f4600n == 0 && g.this.f4565c1 != -1) {
                            i28 = g.this.f4565c1;
                            if (z10) {
                                f11 = g.this.f4571i1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = g.this.f4571i1;
                                f13 = f10;
                            }
                        } else if (z11 && g.this.f4567e1 != -1) {
                            i28 = g.this.f4567e1;
                            if (z10) {
                                f11 = g.this.f4573k1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = g.this.f4573k1;
                                f13 = f10;
                            }
                        }
                        eVar8.O0(i28);
                        eVar8.N0(f13);
                    }
                    if (i26 == i12 - 1) {
                        eVar8.k(eVar8.Q, this.f4592f, this.f4596j);
                    }
                    if (eVar4 != null) {
                        eVar8.O.a(eVar4.Q, g.this.f4575m1);
                        if (i26 == i14) {
                            eVar8.O.u(this.f4594h);
                        }
                        eVar4.Q.a(eVar8.O, 0);
                        if (i26 == i15 + 1) {
                            eVar4.Q.u(this.f4596j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f4578p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.S.a(eVar.S, 0);
                        } else {
                            int i29 = g.this.f4578p1;
                            if (i29 == 0) {
                                eVar8.P.a(eVar7.P, 0);
                            } else if (i29 == i11) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (z12) {
                                eVar8.P.a(this.f4591e, this.f4595i);
                                eVar8.R.a(this.f4593g, this.f4597k);
                            } else {
                                eVar8.P.a(eVar7.P, 0);
                                eVar8.R.a(eVar7.R, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f4588a == 1 ? this.f4599m - g.this.f4576n1 : this.f4599m;
        }

        public int f() {
            return this.f4588a == 0 ? this.f4598l - g.this.f4575m1 : this.f4598l;
        }

        public void g(int i10) {
            int i11 = this.f4602p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f4601o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f4600n + i14 < g.this.f4587y1; i14++) {
                e eVar = g.this.f4586x1[this.f4600n + i14];
                if (this.f4588a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f4534w == 0) {
                        g.this.E1(eVar, e.b.FIXED, i13, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f4536x == 0) {
                    int i15 = i13;
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public final void h() {
            this.f4598l = 0;
            this.f4599m = 0;
            this.b = null;
            this.f4589c = 0;
            int i10 = this.f4601o;
            for (int i11 = 0; i11 < i10 && this.f4600n + i11 < g.this.f4587y1; i11++) {
                e eVar = g.this.f4586x1[this.f4600n + i11];
                if (this.f4588a == 0) {
                    int W = eVar.W();
                    int i12 = g.this.f4575m1;
                    if (eVar.V() == 8) {
                        i12 = 0;
                    }
                    this.f4598l += W + i12;
                    int l22 = g.this.l2(eVar, this.f4603q);
                    if (this.b == null || this.f4589c < l22) {
                        this.b = eVar;
                        this.f4589c = l22;
                        this.f4599m = l22;
                    }
                } else {
                    int m22 = g.this.m2(eVar, this.f4603q);
                    int l23 = g.this.l2(eVar, this.f4603q);
                    int i13 = g.this.f4576n1;
                    if (eVar.V() == 8) {
                        i13 = 0;
                    }
                    this.f4599m += l23 + i13;
                    if (this.b == null || this.f4589c < m22) {
                        this.b = eVar;
                        this.f4589c = m22;
                        this.f4598l = m22;
                    }
                }
            }
        }

        public void i(int i10) {
            this.f4600n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f4588a = i10;
            this.f4590d = dVar;
            this.f4591e = dVar2;
            this.f4592f = dVar3;
            this.f4593g = dVar4;
            this.f4594h = i11;
            this.f4595i = i12;
            this.f4596j = i13;
            this.f4597k = i14;
            this.f4603q = i15;
        }
    }

    public void A2(int i10) {
        this.f4567e1 = i10;
    }

    public void B2(float f10) {
        this.f4574l1 = f10;
    }

    public void C2(int i10) {
        this.f4568f1 = i10;
    }

    @Override // c2.l
    public void D1(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.M0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int A1 = A1();
        int B1 = B1();
        int C1 = C1();
        int z12 = z1();
        int[] iArr = new int[2];
        int i15 = (i11 - A1) - B1;
        int i16 = this.f4581s1;
        if (i16 == 1) {
            i15 = (i13 - C1) - z12;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f4563a1 == -1) {
                this.f4563a1 = 0;
            }
            if (this.f4564b1 == -1) {
                this.f4564b1 = 0;
            }
        } else {
            if (this.f4563a1 == -1) {
                this.f4563a1 = 0;
            }
            if (this.f4564b1 == -1) {
                this.f4564b1 = 0;
            }
        }
        e[] eVarArr2 = this.L0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.M0;
            if (i18 >= i14) {
                break;
            }
            if (this.L0[i18].V() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.M0) {
                e eVar = this.L0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.V() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f4586x1 = eVarArr;
        this.f4587y1 = i21;
        int i22 = this.f4579q1;
        if (i22 == 0) {
            q2(eVarArr, i21, this.f4581s1, i17, iArr);
        } else if (i22 == 1) {
            o2(eVarArr, i21, this.f4581s1, i17, iArr);
        } else if (i22 == 2) {
            n2(eVarArr, i21, this.f4581s1, i17, iArr);
        } else if (i22 == 3) {
            p2(eVarArr, i21, this.f4581s1, i17, iArr);
        }
        int i23 = iArr[0] + A1 + B1;
        int i24 = iArr[1] + C1 + z12;
        if (i10 == 1073741824) {
            i23 = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            i23 = Math.min(i23, i11);
        } else if (i10 != 0) {
            i23 = 0;
        }
        if (i12 == 1073741824) {
            i24 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            i24 = Math.min(i24, i13);
        } else if (i12 != 0) {
            i24 = 0;
        }
        I1(i23, i24);
        l1(i23);
        M0(i24);
        H1(this.M0 > 0);
    }

    public void D2(int i10) {
        this.f4580r1 = i10;
    }

    public void E2(int i10) {
        this.f4581s1 = i10;
    }

    public void F2(int i10) {
        this.f4578p1 = i10;
    }

    public void G2(float f10) {
        this.f4570h1 = f10;
    }

    public void H2(int i10) {
        this.f4576n1 = i10;
    }

    public void I2(int i10) {
        this.f4564b1 = i10;
    }

    public void J2(int i10) {
        this.f4579q1 = i10;
    }

    @Override // c2.e
    public void g(z1.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).R1();
        int i10 = this.f4579q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f4582t1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f4582t1.get(i11).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f4582t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f4582t1.get(i12).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f4582t1.size() > 0) {
            this.f4582t1.get(0).d(z11, 0, true);
        }
        H1(false);
    }

    public final void k2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f4585w1 == null || this.f4584v1 == null || this.f4583u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f4587y1; i11++) {
            this.f4586x1[i11].u0();
        }
        int[] iArr = this.f4585w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f4569g1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f4569g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f4584v1[i10];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i14 == 0) {
                    eVar3.k(eVar3.O, this.O, A1());
                    eVar3.O0(this.f4563a1);
                    eVar3.N0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.k(eVar3.Q, this.Q, B1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.O, eVar2.Q, this.f4575m1);
                    eVar2.k(eVar2.Q, eVar3.O, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f4583u1[i15];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i15 == 0) {
                    eVar4.k(eVar4.P, this.P, C1());
                    eVar4.f1(this.f4564b1);
                    eVar4.e1(this.f4570h1);
                }
                if (i15 == i13 - 1) {
                    eVar4.k(eVar4.R, this.R, z1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.P, eVar2.R, this.f4576n1);
                    eVar2.k(eVar2.R, eVar4.P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f4581s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f4586x1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.V() != 8) {
                    e eVar5 = this.f4584v1[i16];
                    e eVar6 = this.f4583u1[i17];
                    if (eVar != eVar5) {
                        eVar.k(eVar.O, eVar5.O, 0);
                        eVar.k(eVar.Q, eVar5.Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.P, eVar6.P, 0);
                        eVar.k(eVar.R, eVar6.R, 0);
                    }
                }
            }
        }
    }

    public final int l2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f4536x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * i10);
                if (i12 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.x();
            }
            if (i11 == 3) {
                return (int) ((eVar2.W() * eVar2.f4497d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    public final int m2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f4534w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * i10);
                if (i12 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.W();
            }
            if (i11 == 3) {
                return (int) ((eVar2.x() * eVar2.f4497d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n2(c2.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g.n2(c2.e[], int, int, int, int[]):void");
    }

    public final void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f4582t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f4582t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int m22 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f4575m1 + i17) + m22 > i16) && aVar.b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f4580r1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i18);
                    gVar2.f4582t1.add(aVar);
                } else if (i18 > 0) {
                    i17 += gVar2.f4575m1 + m22;
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = m22;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int l22 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f4576n1 + i20) + l22 > i16) && aVar.b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f4580r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f4582t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f4576n1 + l22;
                        aVar.b(eVar2);
                        i21++;
                        i16 = i12;
                        i13 = i22;
                        gVar2 = gVar;
                    }
                }
                i20 = l22;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f4582t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int A1 = gVar3.A1();
        int C1 = gVar3.C1();
        int B1 = gVar3.B1();
        int z12 = gVar3.z1();
        e.b A = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = A == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z13) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = gVar3.f4582t1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int i24 = z12;
        int i25 = 0;
        int i26 = B1;
        int i27 = C1;
        int i28 = A1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i29 = 0;
        for (int i30 = 0; i30 < size; i30++) {
            a aVar3 = gVar3.f4582t1.get(i30);
            if (i11 == 0) {
                if (i30 < size - 1) {
                    dVar7 = gVar3.f4582t1.get(i30 + 1).b.P;
                    i24 = 0;
                } else {
                    dVar7 = gVar3.R;
                    i24 = gVar3.z1();
                }
                d dVar10 = aVar3.b.R;
                int i31 = i29;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i28, i27, i26, i24, i12);
                int max = Math.max(i25, aVar3.f());
                int e10 = aVar3.e() + i31;
                if (i30 > 0) {
                    e10 += gVar3.f4576n1;
                }
                i29 = e10;
                i25 = max;
                dVar9 = dVar10;
                i27 = 0;
            } else {
                int i32 = i25;
                int i33 = i29;
                if (i30 < size - 1) {
                    dVar = gVar3.f4582t1.get(i30 + 1).b.O;
                    i26 = 0;
                } else {
                    dVar = gVar3.Q;
                    i26 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i28, i27, i26, i24, i12);
                int f10 = aVar3.f() + i32;
                int max2 = Math.max(i33, aVar3.e());
                if (i30 > 0) {
                    f10 += gVar3.f4575m1;
                }
                int i34 = f10;
                i29 = max2;
                i25 = i34;
                i28 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i25;
        iArr[1] = i29;
    }

    public final void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        boolean z10;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f4582t1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
        gVar2.f4582t1.add(aVar);
        boolean z11 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int m22 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z12 = (i18 == i16 || (gVar2.f4575m1 + i18) + m22 > i16) && aVar.b != null;
                if (!z12 && i19 > 0 && (i15 = gVar2.f4580r1) > 0 && i17 > i15) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    aVar.i(i19);
                    gVar2.f4582t1.add(aVar);
                    i17 = 1;
                } else if (i19 > 0) {
                    i18 += gVar2.f4575m1 + m22;
                    aVar.b(eVar);
                    i19++;
                    i13 = i20;
                }
                i18 = m22;
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int l22 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z13 = (i22 == i16 || (gVar2.f4576n1 + i22) + l22 > i16) && aVar.b != null;
                if (!z13 && i23 > 0 && (i14 = gVar2.f4580r1) > 0 && i21 > i14) {
                    z13 = true;
                }
                if (z13) {
                    aVar = gVar2.new a(i11, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.f4582t1.add(aVar);
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f4576n1 + l22;
                        aVar.b(eVar2);
                        i23++;
                        i16 = i12;
                        i13 = i24;
                        gVar2 = gVar;
                    }
                }
                i22 = l22;
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f4582t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int A1 = gVar3.A1();
        int C1 = gVar3.C1();
        int B1 = gVar3.B1();
        int z14 = gVar3.z1();
        e.b A = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z15 = A == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z15) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = gVar3.f4582t1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int i26 = z14;
        int i27 = 0;
        int i28 = 0;
        int i29 = B1;
        int i30 = C1;
        int i31 = A1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i32 = 0;
        while (i28 < size) {
            a aVar3 = gVar3.f4582t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = gVar3.f4582t1.get(i28 + 1).b.P;
                    i26 = 0;
                } else {
                    dVar7 = gVar3.R;
                    i26 = gVar3.z1();
                }
                d dVar10 = aVar3.b.R;
                z10 = z11;
                int i33 = i27;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i31, i30, i29, i26, i12);
                int max = Math.max(i32, aVar3.f());
                int e10 = aVar3.e() + i33;
                if (i28 > 0) {
                    e10 += gVar3.f4576n1;
                }
                i27 = e10;
                i32 = max;
                dVar6 = dVar10;
                i30 = 0;
            } else {
                int i34 = i27;
                z10 = z11;
                int i35 = i32;
                if (i28 < size - 1) {
                    dVar = gVar3.f4582t1.get(i28 + 1).b.O;
                    i29 = 0;
                } else {
                    dVar = gVar3.Q;
                    i29 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i31, i30, i29, i26, i12);
                int f10 = aVar3.f() + i35;
                int max2 = Math.max(i34, aVar3.e());
                if (i28 > 0) {
                    f10 += gVar3.f4575m1;
                }
                int i36 = f10;
                i27 = max2;
                i32 = i36;
                i31 = 0;
                dVar9 = dVar11;
            }
            i28++;
            z11 = z10;
        }
        iArr[0] = i32;
        iArr[z11 ? 1 : 0] = i27;
    }

    public final void q2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f4582t1.size() == 0) {
            aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
            this.f4582t1.add(aVar);
        } else {
            a aVar2 = this.f4582t1.get(0);
            aVar2.c();
            aVar2.j(i11, this.O, this.P, this.Q, this.R, A1(), C1(), B1(), z1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void r2(float f10) {
        this.f4571i1 = f10;
    }

    public void s2(int i10) {
        this.f4565c1 = i10;
    }

    public void t2(float f10) {
        this.f4572j1 = f10;
    }

    public void u2(int i10) {
        this.f4566d1 = i10;
    }

    public void v2(int i10) {
        this.f4577o1 = i10;
    }

    public void w2(float f10) {
        this.f4569g1 = f10;
    }

    public void x2(int i10) {
        this.f4575m1 = i10;
    }

    public void y2(int i10) {
        this.f4563a1 = i10;
    }

    public void z2(float f10) {
        this.f4573k1 = f10;
    }
}
