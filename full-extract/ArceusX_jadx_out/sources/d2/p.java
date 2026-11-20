package d2;

import c2.d;
import c2.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f14325a;
    public c2.e b;

    /* renamed from: c, reason: collision with root package name */
    public m f14326c;

    /* renamed from: d, reason: collision with root package name */
    public e.b f14327d;

    /* renamed from: e, reason: collision with root package name */
    public g f14328e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f14329f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14330g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f14331h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f14332i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public b f14333j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14334a;

        static {
            int[] iArr = new int[d.a.values().length];
            f14334a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14334a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14334a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14334a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14334a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(c2.e eVar) {
        this.b = eVar;
    }

    @Override // d2.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f14289l.add(fVar2);
        fVar.f14283f = i10;
        fVar2.f14288k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f14289l.add(fVar2);
        fVar.f14289l.add(this.f14328e);
        fVar.f14285h = i10;
        fVar.f14286i = gVar;
        fVar2.f14288k.add(fVar);
        gVar.f14288k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            c2.e eVar = this.b;
            int i12 = eVar.A;
            int max = Math.max(eVar.f4540z, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max != i10) {
                return max;
            }
        } else {
            c2.e eVar2 = this.b;
            int i13 = eVar2.D;
            int max2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                max2 = Math.min(i13, i10);
            }
            if (max2 != i10) {
                return max2;
            }
        }
        return i10;
    }

    public final f h(c2.d dVar) {
        c2.d dVar2 = dVar.f4478f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4476d;
        int i10 = a.f14334a[dVar2.f4477e.ordinal()];
        if (i10 == 1) {
            return eVar.f4498e.f14331h;
        }
        if (i10 == 2) {
            return eVar.f4498e.f14332i;
        }
        if (i10 == 3) {
            return eVar.f4500f.f14331h;
        }
        if (i10 == 4) {
            return eVar.f4500f.f14310k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f4500f.f14332i;
    }

    public final f i(c2.d dVar, int i10) {
        c2.d dVar2 = dVar.f4478f;
        if (dVar2 == null) {
            return null;
        }
        c2.e eVar = dVar2.f4476d;
        p pVar = i10 == 0 ? eVar.f4498e : eVar.f4500f;
        int i11 = a.f14334a[dVar2.f4477e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f14332i;
        }
        return pVar.f14331h;
    }

    public long j() {
        if (this.f14328e.f14287j) {
            return r0.f14284g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f14330g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f14325a;
        if (i12 == 0) {
            this.f14328e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f14328e.d(Math.min(g(this.f14328e.f14298m, i10), i11));
            return;
        }
        if (i12 == 2) {
            c2.e K = this.b.K();
            if (K != null) {
                if ((i10 == 0 ? K.f4498e : K.f4500f).f14328e.f14287j) {
                    this.f14328e.d(g((int) ((r9.f14284g * (i10 == 0 ? this.b.B : this.b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        c2.e eVar = this.b;
        p pVar = eVar.f4498e;
        e.b bVar = pVar.f14327d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f14325a == 3) {
            n nVar = eVar.f4500f;
            if (nVar.f14327d == bVar2 && nVar.f14325a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f4500f;
        }
        if (pVar.f14328e.f14287j) {
            float v5 = eVar.v();
            this.f14328e.d(i10 == 1 ? (int) ((pVar.f14328e.f14284g / v5) + 0.5f) : (int) ((v5 * pVar.f14328e.f14284g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, c2.d dVar2, c2.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f14287j && h11.f14287j) {
            int f10 = h10.f14284g + dVar2.f();
            int f11 = h11.f14284g - dVar3.f();
            int i11 = f11 - f10;
            if (!this.f14328e.f14287j && this.f14327d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f14328e;
            if (gVar.f14287j) {
                if (gVar.f14284g == i11) {
                    this.f14331h.d(f10);
                    this.f14332i.d(f11);
                    return;
                }
                float y10 = i10 == 0 ? this.b.y() : this.b.R();
                if (h10 == h11) {
                    f10 = h10.f14284g;
                    f11 = h11.f14284g;
                    y10 = 0.5f;
                }
                this.f14331h.d((int) (f10 + 0.5f + (((f11 - f10) - this.f14328e.f14284g) * y10)));
                this.f14332i.d(this.f14331h.f14284g + this.f14328e.f14284g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
