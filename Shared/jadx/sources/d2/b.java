package d2;

import c2.d;
import c2.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<c2.e> f14255a = new ArrayList<>();
    public a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public c2.f f14256c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f14257k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f14258l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f14259m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f14260a;
        public e.b b;

        /* renamed from: c, reason: collision with root package name */
        public int f14261c;

        /* renamed from: d, reason: collision with root package name */
        public int f14262d;

        /* renamed from: e, reason: collision with root package name */
        public int f14263e;

        /* renamed from: f, reason: collision with root package name */
        public int f14264f;

        /* renamed from: g, reason: collision with root package name */
        public int f14265g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f14266h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f14267i;

        /* renamed from: j, reason: collision with root package name */
        public int f14268j;
    }

    /* renamed from: d2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0278b {
        void a();

        void b(c2.e eVar, a aVar);
    }

    public b(c2.f fVar) {
        this.f14256c = fVar;
    }

    public final boolean a(InterfaceC0278b interfaceC0278b, c2.e eVar, int i10) {
        this.b.f14260a = eVar.A();
        this.b.b = eVar.T();
        this.b.f14261c = eVar.W();
        this.b.f14262d = eVar.x();
        a aVar = this.b;
        aVar.f14267i = false;
        aVar.f14268j = i10;
        e.b bVar = aVar.f14260a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.b == bVar2;
        boolean z12 = z10 && eVar.f4497d0 > 0.0f;
        boolean z13 = z11 && eVar.f4497d0 > 0.0f;
        if (z12 && eVar.f4538y[0] == 4) {
            aVar.f14260a = e.b.FIXED;
        }
        if (z13 && eVar.f4538y[1] == 4) {
            aVar.b = e.b.FIXED;
        }
        interfaceC0278b.b(eVar, aVar);
        eVar.l1(this.b.f14263e);
        eVar.M0(this.b.f14264f);
        eVar.L0(this.b.f14266h);
        eVar.B0(this.b.f14265g);
        a aVar2 = this.b;
        aVar2.f14268j = a.f14257k;
        return aVar2.f14267i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.f4497d0 <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(c2.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<c2.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.V1(r1)
            d2.b$b r2 = r13.K1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<c2.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            c2.e r5 = (c2.e) r5
            boolean r6 = r5 instanceof c2.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof c2.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            d2.l r6 = r5.f4498e
            if (r6 == 0) goto L47
            d2.n r7 = r5.f4500f
            if (r7 == 0) goto L47
            d2.g r6 = r6.f14328e
            boolean r6 = r6.f14287j
            if (r6 == 0) goto L47
            d2.g r6 = r7.f14328e
            boolean r6 = r6.f14287j
            if (r6 == 0) goto L47
            goto La0
        L47:
            c2.e$b r6 = r5.u(r3)
            r7 = 1
            c2.e$b r8 = r5.u(r7)
            c2.e$b r9 = c2.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f4534w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f4536x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.V1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof c2.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f4534w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f4536x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f4497d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = d2.b.a.f14257k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.b.b(c2.f):void");
    }

    public final void c(c2.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int I = fVar.I();
        int H = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i11);
        fVar.M0(i12);
        fVar.b1(I);
        fVar.a1(H);
        this.f14256c.Z1(i10);
        this.f14256c.t1();
    }

    public long d(c2.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        boolean z12;
        b bVar = this;
        InterfaceC0278b K1 = fVar.K1();
        int size = fVar.L0.size();
        int W = fVar.W();
        int x10 = fVar.x();
        boolean b = c2.k.b(i10, 128);
        boolean z13 = b || c2.k.b(i10, 64);
        if (z13) {
            for (int i24 = 0; i24 < size; i24++) {
                c2.e eVar = fVar.L0.get(i24);
                e.b A = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (A == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.i0() && z14) || ((eVar.k0() && z14) || (eVar instanceof c2.l) || eVar.i0() || eVar.k0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = z1.d.f37676s;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b);
        int i25 = 2;
        if (z16) {
            int min = Math.min(fVar.G(), i14);
            int min2 = Math.min(fVar.F(), i16);
            if (i13 == 1073741824 && fVar.W() != min) {
                fVar.l1(min);
                fVar.O1();
            }
            if (i15 == 1073741824 && fVar.x() != min2) {
                fVar.M0(min2);
                fVar.O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.G1(b);
                i19 = 2;
            } else {
                boolean H1 = fVar.H1(b);
                if (i13 == 1073741824) {
                    H1 &= fVar.I1(b, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.I1(b, 1) & H1;
                    i19++;
                } else {
                    z10 = H1;
                }
            }
            if (z10) {
                fVar.q1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int L1 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f14255a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, W, x10);
            i20 = W;
            i21 = x10;
        } else {
            i20 = W;
            i21 = x10;
        }
        if (size2 > 0) {
            e.b A2 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = A2 == bVar3;
            boolean z18 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.f14256c.I());
            int max2 = Math.max(fVar.x(), bVar.f14256c.H());
            int i26 = 0;
            boolean z19 = false;
            while (i26 < size2) {
                c2.e eVar2 = bVar.f14255a.get(i26);
                if (eVar2 instanceof c2.l) {
                    int W2 = eVar2.W();
                    int x11 = eVar2.x();
                    i23 = i20;
                    boolean a10 = bVar.a(K1, eVar2, a.f14258l) | z19;
                    int W3 = eVar2.W();
                    int x12 = eVar2.x();
                    if (W3 != W2) {
                        eVar2.l1(W3);
                        if (z17 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.a.RIGHT).f());
                        }
                        z12 = true;
                    } else {
                        z12 = a10;
                    }
                    if (x12 != x11) {
                        eVar2.M0(x12);
                        if (z18 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((c2.l) eVar2).G1();
                } else {
                    i23 = i20;
                }
                i26++;
                i20 = i23;
                i25 = 2;
            }
            int i27 = i20;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    c2.e eVar3 = bVar.f14255a.get(i30);
                    if (((eVar3 instanceof c2.i) && !(eVar3 instanceof c2.l)) || (eVar3 instanceof c2.h) || eVar3.V() == 8 || ((z16 && eVar3.f4498e.f14328e.f14287j && eVar3.f4500f.f14328e.f14287j) || (eVar3 instanceof c2.l))) {
                        z11 = z16;
                        i22 = size2;
                    } else {
                        int W4 = eVar3.W();
                        int x13 = eVar3.x();
                        z11 = z16;
                        int p8 = eVar3.p();
                        int i31 = a.f14258l;
                        i22 = size2;
                        if (i29 == 1) {
                            i31 = a.f14259m;
                        }
                        boolean a11 = bVar.a(K1, eVar3, i31) | z19;
                        int W5 = eVar3.W();
                        int x14 = eVar3.x();
                        if (W5 != W4) {
                            eVar3.l1(W5);
                            if (z17 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.a.RIGHT).f());
                            }
                            a11 = true;
                        }
                        if (x14 != x13) {
                            eVar3.M0(x14);
                            if (z18 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            a11 = true;
                        }
                        z19 = (!eVar3.Z() || p8 == eVar3.p()) ? a11 : true;
                    }
                    i30++;
                    bVar = this;
                    size2 = i22;
                    z16 = z11;
                }
                boolean z20 = z16;
                int i32 = size2;
                if (!z19) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, i27, i21);
                bVar = this;
                size2 = i32;
                z16 = z20;
                i28 = 2;
                z19 = false;
            }
        }
        fVar.Y1(L1);
        return 0L;
    }

    public void e(c2.f fVar) {
        this.f14255a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.e eVar = fVar.L0.get(i10);
            e.b A = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A == bVar || eVar.T() == bVar) {
                this.f14255a.add(eVar);
            }
        }
        fVar.O1();
    }
}
