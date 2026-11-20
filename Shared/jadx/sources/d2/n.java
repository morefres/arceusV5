package d2;

import c2.d;
import c2.e;
import d2.f;
import d2.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f14310k;

    /* renamed from: l, reason: collision with root package name */
    public g f14311l;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14312a;

        static {
            int[] iArr = new int[p.b.values().length];
            f14312a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14312a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14312a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(c2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f14310k = fVar;
        this.f14311l = null;
        this.f14331h.f14282e = f.a.TOP;
        this.f14332i.f14282e = f.a.BOTTOM;
        fVar.f14282e = f.a.BASELINE;
        this.f14329f = 1;
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        float f10;
        float v5;
        float f11;
        int i10;
        int i11 = a.f14312a[this.f14333j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            c2.e eVar = this.b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f14328e;
        if (gVar.f14280c && !gVar.f14287j && this.f14327d == e.b.MATCH_CONSTRAINT) {
            c2.e eVar2 = this.b;
            int i12 = eVar2.f4536x;
            if (i12 == 2) {
                c2.e K = eVar2.K();
                if (K != null) {
                    if (K.f4500f.f14328e.f14287j) {
                        this.f14328e.d((int) ((r7.f14284g * this.b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f4498e.f14328e.f14287j) {
                int w5 = eVar2.w();
                if (w5 == -1) {
                    c2.e eVar3 = this.b;
                    f10 = eVar3.f4498e.f14328e.f14284g;
                    v5 = eVar3.v();
                } else if (w5 == 0) {
                    f11 = r7.f4498e.f14328e.f14284g * this.b.v();
                    i10 = (int) (f11 + 0.5f);
                    this.f14328e.d(i10);
                } else if (w5 != 1) {
                    i10 = 0;
                    this.f14328e.d(i10);
                } else {
                    c2.e eVar4 = this.b;
                    f10 = eVar4.f4498e.f14328e.f14284g;
                    v5 = eVar4.v();
                }
                f11 = f10 / v5;
                i10 = (int) (f11 + 0.5f);
                this.f14328e.d(i10);
            }
        }
        f fVar = this.f14331h;
        if (fVar.f14280c) {
            f fVar2 = this.f14332i;
            if (fVar2.f14280c) {
                if (fVar.f14287j && fVar2.f14287j && this.f14328e.f14287j) {
                    return;
                }
                if (!this.f14328e.f14287j && this.f14327d == e.b.MATCH_CONSTRAINT) {
                    c2.e eVar5 = this.b;
                    if (eVar5.f4534w == 0 && !eVar5.k0()) {
                        f fVar3 = this.f14331h.f14289l.get(0);
                        f fVar4 = this.f14332i.f14289l.get(0);
                        int i13 = fVar3.f14284g;
                        f fVar5 = this.f14331h;
                        int i14 = i13 + fVar5.f14283f;
                        int i15 = fVar4.f14284g + this.f14332i.f14283f;
                        fVar5.d(i14);
                        this.f14332i.d(i15);
                        this.f14328e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f14328e.f14287j && this.f14327d == e.b.MATCH_CONSTRAINT && this.f14325a == 1 && this.f14331h.f14289l.size() > 0 && this.f14332i.f14289l.size() > 0) {
                    f fVar6 = this.f14331h.f14289l.get(0);
                    int i16 = (this.f14332i.f14289l.get(0).f14284g + this.f14332i.f14283f) - (fVar6.f14284g + this.f14331h.f14283f);
                    g gVar2 = this.f14328e;
                    int i17 = gVar2.f14298m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f14328e.f14287j && this.f14331h.f14289l.size() > 0 && this.f14332i.f14289l.size() > 0) {
                    f fVar7 = this.f14331h.f14289l.get(0);
                    f fVar8 = this.f14332i.f14289l.get(0);
                    int i18 = fVar7.f14284g + this.f14331h.f14283f;
                    int i19 = fVar8.f14284g + this.f14332i.f14283f;
                    float R = this.b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f14284g;
                        i19 = fVar8.f14284g;
                        R = 0.5f;
                    }
                    this.f14331h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f14328e.f14284g) * R)));
                    this.f14332i.d(this.f14331h.f14284g + this.f14328e.f14284g);
                }
            }
        }
    }

    @Override // d2.p
    public void d() {
        c2.e K;
        c2.e K2;
        c2.e eVar = this.b;
        if (eVar.f4491a) {
            this.f14328e.d(eVar.x());
        }
        if (!this.f14328e.f14287j) {
            this.f14327d = this.b.T();
            if (this.b.Z()) {
                this.f14311l = new d2.a(this);
            }
            e.b bVar = this.f14327d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (K2 = this.b.K()) != null && K2.T() == e.b.FIXED) {
                    int x10 = (K2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.f14331h, K2.f4500f.f14331h, this.b.P.f());
                    b(this.f14332i, K2.f4500f.f14332i, -this.b.R.f());
                    this.f14328e.d(x10);
                    return;
                }
                if (this.f14327d == e.b.FIXED) {
                    this.f14328e.d(this.b.x());
                }
            }
        } else if (this.f14327d == e.b.MATCH_PARENT && (K = this.b.K()) != null && K.T() == e.b.FIXED) {
            b(this.f14331h, K.f4500f.f14331h, this.b.P.f());
            b(this.f14332i, K.f4500f.f14332i, -this.b.R.f());
            return;
        }
        g gVar = this.f14328e;
        boolean z10 = gVar.f14287j;
        if (z10) {
            c2.e eVar2 = this.b;
            if (eVar2.f4491a) {
                c2.d[] dVarArr = eVar2.W;
                c2.d dVar = dVarArr[2];
                c2.d dVar2 = dVar.f4478f;
                if (dVar2 != null && dVarArr[3].f4478f != null) {
                    if (eVar2.k0()) {
                        this.f14331h.f14283f = this.b.W[2].f();
                        this.f14332i.f14283f = -this.b.W[3].f();
                    } else {
                        f h10 = h(this.b.W[2]);
                        if (h10 != null) {
                            b(this.f14331h, h10, this.b.W[2].f());
                        }
                        f h11 = h(this.b.W[3]);
                        if (h11 != null) {
                            b(this.f14332i, h11, -this.b.W[3].f());
                        }
                        this.f14331h.b = true;
                        this.f14332i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.f14310k, this.f14331h, this.b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f14331h, h12, this.b.W[2].f());
                        b(this.f14332i, this.f14331h, this.f14328e.f14284g);
                        if (this.b.Z()) {
                            b(this.f14310k, this.f14331h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                c2.d dVar3 = dVarArr[3];
                if (dVar3.f4478f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f14332i, h13, -this.b.W[3].f());
                        b(this.f14331h, this.f14332i, -this.f14328e.f14284g);
                    }
                    if (this.b.Z()) {
                        b(this.f14310k, this.f14331h, this.b.p());
                        return;
                    }
                    return;
                }
                c2.d dVar4 = dVarArr[4];
                if (dVar4.f4478f != null) {
                    f h14 = h(dVar4);
                    if (h14 != null) {
                        b(this.f14310k, h14, 0);
                        b(this.f14331h, this.f14310k, -this.b.p());
                        b(this.f14332i, this.f14331h, this.f14328e.f14284g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c2.i) || eVar2.K() == null || this.b.o(d.a.CENTER).f4478f != null) {
                    return;
                }
                b(this.f14331h, this.b.K().f4500f.f14331h, this.b.Y());
                b(this.f14332i, this.f14331h, this.f14328e.f14284g);
                if (this.b.Z()) {
                    b(this.f14310k, this.f14331h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f14327d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            c2.e eVar3 = this.b;
            int i10 = eVar3.f4536x;
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
            } else if (i10 == 3 && !eVar3.k0()) {
                c2.e eVar4 = this.b;
                if (eVar4.f4534w != 3) {
                    g gVar4 = eVar4.f4498e.f14328e;
                    this.f14328e.f14289l.add(gVar4);
                    gVar4.f14288k.add(this.f14328e);
                    g gVar5 = this.f14328e;
                    gVar5.b = true;
                    gVar5.f14288k.add(this.f14331h);
                    this.f14328e.f14288k.add(this.f14332i);
                }
            }
        }
        c2.e eVar5 = this.b;
        c2.d[] dVarArr2 = eVar5.W;
        c2.d dVar5 = dVarArr2[2];
        c2.d dVar6 = dVar5.f4478f;
        if (dVar6 != null && dVarArr2[3].f4478f != null) {
            if (eVar5.k0()) {
                this.f14331h.f14283f = this.b.W[2].f();
                this.f14332i.f14283f = -this.b.W[3].f();
            } else {
                f h15 = h(this.b.W[2]);
                f h16 = h(this.b.W[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f14333j = p.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.f14310k, this.f14331h, 1, this.f14311l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f14331h, h17, this.b.W[2].f());
                c(this.f14332i, this.f14331h, 1, this.f14328e);
                if (this.b.Z()) {
                    c(this.f14310k, this.f14331h, 1, this.f14311l);
                }
                e.b bVar2 = this.f14327d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    l lVar = this.b.f4498e;
                    if (lVar.f14327d == bVar3) {
                        lVar.f14328e.f14288k.add(this.f14328e);
                        this.f14328e.f14289l.add(this.b.f4498e.f14328e);
                        this.f14328e.f14279a = this;
                    }
                }
            }
        } else {
            c2.d dVar7 = dVarArr2[3];
            if (dVar7.f4478f != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f14332i, h18, -this.b.W[3].f());
                    c(this.f14331h, this.f14332i, -1, this.f14328e);
                    if (this.b.Z()) {
                        c(this.f14310k, this.f14331h, 1, this.f14311l);
                    }
                }
            } else {
                c2.d dVar8 = dVarArr2[4];
                if (dVar8.f4478f != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f14310k, h19, 0);
                        c(this.f14331h, this.f14310k, -1, this.f14311l);
                        c(this.f14332i, this.f14331h, 1, this.f14328e);
                    }
                } else if (!(eVar5 instanceof c2.i) && eVar5.K() != null) {
                    b(this.f14331h, this.b.K().f4500f.f14331h, this.b.Y());
                    c(this.f14332i, this.f14331h, 1, this.f14328e);
                    if (this.b.Z()) {
                        c(this.f14310k, this.f14331h, 1, this.f14311l);
                    }
                    e.b bVar4 = this.f14327d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        l lVar2 = this.b.f4498e;
                        if (lVar2.f14327d == bVar5) {
                            lVar2.f14328e.f14288k.add(this.f14328e);
                            this.f14328e.f14289l.add(this.b.f4498e.f14328e);
                            this.f14328e.f14279a = this;
                        }
                    }
                }
            }
        }
        if (this.f14328e.f14289l.size() == 0) {
            this.f14328e.f14280c = true;
        }
    }

    @Override // d2.p
    public void e() {
        f fVar = this.f14331h;
        if (fVar.f14287j) {
            this.b.o1(fVar.f14284g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14326c = null;
        this.f14331h.c();
        this.f14332i.c();
        this.f14310k.c();
        this.f14328e.c();
        this.f14330g = false;
    }

    @Override // d2.p
    public boolean m() {
        return this.f14327d != e.b.MATCH_CONSTRAINT || this.b.f4536x == 0;
    }

    public void q() {
        this.f14330g = false;
        this.f14331h.c();
        this.f14331h.f14287j = false;
        this.f14332i.c();
        this.f14332i.f14287j = false;
        this.f14310k.c();
        this.f14310k.f14287j = false;
        this.f14328e.f14287j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
