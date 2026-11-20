package d2;

import c2.d;
import c2.e;
import d2.f;
import d2.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static int[] f14301k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14302a;

        static {
            int[] iArr = new int[p.b.values().length];
            f14302a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14302a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14302a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(c2.e eVar) {
        super(eVar);
        this.f14331h.f14282e = f.a.LEFT;
        this.f14332i.f14282e = f.a.RIGHT;
        this.f14329f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // d2.p, d2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(d2.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.l.a(d2.d):void");
    }

    @Override // d2.p
    public void d() {
        c2.e K;
        c2.e K2;
        c2.e eVar = this.b;
        if (eVar.f4491a) {
            this.f14328e.d(eVar.W());
        }
        if (this.f14328e.f14287j) {
            e.b bVar = this.f14327d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (K = this.b.K()) != null && (K.A() == e.b.FIXED || K.A() == bVar2)) {
                b(this.f14331h, K.f4498e.f14331h, this.b.O.f());
                b(this.f14332i, K.f4498e.f14332i, -this.b.Q.f());
                return;
            }
        } else {
            e.b A = this.b.A();
            this.f14327d = A;
            if (A != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (A == bVar3 && (K2 = this.b.K()) != null && (K2.A() == e.b.FIXED || K2.A() == bVar3)) {
                    int W = (K2.W() - this.b.O.f()) - this.b.Q.f();
                    b(this.f14331h, K2.f4498e.f14331h, this.b.O.f());
                    b(this.f14332i, K2.f4498e.f14332i, -this.b.Q.f());
                    this.f14328e.d(W);
                    return;
                }
                if (this.f14327d == e.b.FIXED) {
                    this.f14328e.d(this.b.W());
                }
            }
        }
        g gVar = this.f14328e;
        if (gVar.f14287j) {
            c2.e eVar2 = this.b;
            if (eVar2.f4491a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[0];
                c2.d dVar2 = dVar.f4478f;
                if (dVar2 != null && dVarArr[1].f4478f != null) {
                    if (eVar2.i0()) {
                        this.f14331h.f14283f = this.b.W[0].f();
                        this.f14332i.f14283f = -this.b.W[1].f();
                        return;
                    }
                    f h10 = h(this.b.W[0]);
                    if (h10 != null) {
                        b(this.f14331h, h10, this.b.W[0].f());
                    }
                    f h11 = h(this.b.W[1]);
                    if (h11 != null) {
                        b(this.f14332i, h11, -this.b.W[1].f());
                    }
                    this.f14331h.b = true;
                    this.f14332i.b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f14331h, h12, this.b.W[0].f());
                        b(this.f14332i, this.f14331h, this.f14328e.f14284g);
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[1];
                if (dVar3.f4478f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f14332i, h13, -this.b.W[1].f());
                        b(this.f14331h, this.f14332i, -this.f14328e.f14284g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(d.a.CENTER).f4478f != null) {
                    return;
                }
                b(this.f14331h, this.b.K().f4498e.f14331h, this.b.X());
                b(this.f14332i, this.f14331h, this.f14328e.f14284g);
                return;
            }
        }
        if (this.f14327d == e.b.MATCH_CONSTRAINT) {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4534w;
            if (i10 == 2) {
                c2.e K3 = eVar3.K();
                if (K3 != null) {
                    g gVar2 = K3.f4500f.f14328e;
                    this.f14328e.f14289l.add(gVar2);
                    gVar2.f14288k.add(this.f14328e);
                    g gVar3 = this.f14328e;
                    gVar3.b = true;
                    gVar3.f14288k.add(this.f14331h);
                    this.f14328e.f14288k.add(this.f14332i);
                }
            } else if (i10 == 3) {
                if (eVar3.f4536x == 3) {
                    this.f14331h.f14279a = this;
                    this.f14332i.f14279a = this;
                    n nVar = eVar3.f4500f;
                    nVar.f14331h.f14279a = this;
                    nVar.f14332i.f14279a = this;
                    gVar.f14279a = this;
                    if (eVar3.k0()) {
                        this.f14328e.f14289l.add(this.b.f4500f.f14328e);
                        this.b.f4500f.f14328e.f14288k.add(this.f14328e);
                        n nVar2 = this.b.f4500f;
                        nVar2.f14328e.f14279a = this;
                        this.f14328e.f14289l.add(nVar2.f14331h);
                        this.f14328e.f14289l.add(this.b.f4500f.f14332i);
                        this.b.f4500f.f14331h.f14288k.add(this.f14328e);
                        this.b.f4500f.f14332i.f14288k.add(this.f14328e);
                    } else if (this.b.i0()) {
                        this.b.f4500f.f14328e.f14289l.add(this.f14328e);
                        this.f14328e.f14288k.add(this.b.f4500f.f14328e);
                    } else {
                        this.b.f4500f.f14328e.f14289l.add(this.f14328e);
                    }
                } else {
                    g gVar4 = eVar3.f4500f.f14328e;
                    gVar.f14289l.add(gVar4);
                    gVar4.f14288k.add(this.f14328e);
                    this.b.f4500f.f14331h.f14288k.add(this.f14328e);
                    this.b.f4500f.f14332i.f14288k.add(this.f14328e);
                    g gVar5 = this.f14328e;
                    gVar5.b = true;
                    gVar5.f14288k.add(this.f14331h);
                    this.f14328e.f14288k.add(this.f14332i);
                    this.f14331h.f14289l.add(this.f14328e);
                    this.f14332i.f14289l.add(this.f14328e);
                }
            }
        }
        c2.e eVar4 = this.b;
        c2.d[] dVarArr2 = eVar4.W;
        c2.d dVar4 = dVarArr2[0];
        c2.d dVar5 = dVar4.f4478f;
        if (dVar5 != null && dVarArr2[1].f4478f != null) {
            if (eVar4.i0()) {
                this.f14331h.f14283f = this.b.W[0].f();
                this.f14332i.f14283f = -this.b.W[1].f();
                return;
            }
            f h14 = h(this.b.W[0]);
            f h15 = h(this.b.W[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f14333j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h16 = h(dVar4);
            if (h16 != null) {
                b(this.f14331h, h16, this.b.W[0].f());
                c(this.f14332i, this.f14331h, 1, this.f14328e);
                return;
            }
            return;
        }
        c2.d dVar6 = dVarArr2[1];
        if (dVar6.f4478f != null) {
            f h17 = h(dVar6);
            if (h17 != null) {
                b(this.f14332i, h17, -this.b.W[1].f());
                c(this.f14331h, this.f14332i, -1, this.f14328e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof c2.i) || eVar4.K() == null) {
            return;
        }
        b(this.f14331h, this.b.K().f4498e.f14331h, this.b.X());
        c(this.f14332i, this.f14331h, 1, this.f14328e);
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f14331h;
        if (fVar.f14287j) {
            this.b.n1(fVar.f14284g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14326c = null;
        this.f14331h.c();
        this.f14332i.c();
        this.f14328e.c();
        this.f14330g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f14327d != e.b.MATCH_CONSTRAINT || this.b.f4534w == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f14330g = false;
        this.f14331h.c();
        this.f14331h.f14287j = false;
        this.f14332i.c();
        this.f14332i.f14287j = false;
        this.f14328e.f14287j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
