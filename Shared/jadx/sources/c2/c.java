package c2;

import c2.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public e f4453a;
    public e b;

    /* renamed from: c, reason: collision with root package name */
    public e f4454c;

    /* renamed from: d, reason: collision with root package name */
    public e f4455d;

    /* renamed from: e, reason: collision with root package name */
    public e f4456e;

    /* renamed from: f, reason: collision with root package name */
    public e f4457f;

    /* renamed from: g, reason: collision with root package name */
    public e f4458g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<e> f4459h;

    /* renamed from: i, reason: collision with root package name */
    public int f4460i;

    /* renamed from: j, reason: collision with root package name */
    public int f4461j;

    /* renamed from: k, reason: collision with root package name */
    public float f4462k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f4463l;

    /* renamed from: m, reason: collision with root package name */
    public int f4464m;

    /* renamed from: n, reason: collision with root package name */
    public int f4465n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4466o;

    /* renamed from: p, reason: collision with root package name */
    public int f4467p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4468q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4469r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4470s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4471t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4472u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4473v;

    public c(e eVar, int i10, boolean z10) {
        this.f4453a = eVar;
        this.f4467p = i10;
        this.f4468q = z10;
    }

    public static boolean c(e eVar, int i10) {
        if (eVar.V() == 8 || eVar.Z[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f4538y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f4473v) {
            b();
        }
        this.f4473v = true;
    }

    public final void b() {
        int i10 = this.f4467p * 2;
        e eVar = this.f4453a;
        this.f4466o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f4460i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f4467p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.V() != 8) {
                this.f4463l++;
                e.b u8 = eVar.u(this.f4467p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u8 != bVar) {
                    this.f4464m += eVar.E(this.f4467p);
                }
                int f10 = this.f4464m + eVar.W[i10].f();
                this.f4464m = f10;
                int i12 = i10 + 1;
                this.f4464m = f10 + eVar.W[i12].f();
                int f11 = this.f4465n + eVar.W[i10].f();
                this.f4465n = f11;
                this.f4465n = f11 + eVar.W[i12].f();
                if (this.b == null) {
                    this.b = eVar;
                }
                this.f4455d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f4467p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f4538y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f4461j++;
                        float f12 = eVar.D0[i13];
                        if (f12 > 0.0f) {
                            this.f4462k += f12;
                        }
                        if (c(eVar, i13)) {
                            if (f12 < 0.0f) {
                                this.f4469r = true;
                            } else {
                                this.f4470s = true;
                            }
                            if (this.f4459h == null) {
                                this.f4459h = new ArrayList<>();
                            }
                            this.f4459h.add(eVar);
                        }
                        if (this.f4457f == null) {
                            this.f4457f = eVar;
                        }
                        e eVar4 = this.f4458g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f4467p] = eVar;
                        }
                        this.f4458g = eVar;
                    }
                    if (this.f4467p == 0) {
                        if (eVar.f4534w != 0) {
                            this.f4466o = false;
                        } else if (eVar.f4540z != 0 || eVar.A != 0) {
                            this.f4466o = false;
                        }
                    } else if (eVar.f4536x != 0) {
                        this.f4466o = false;
                    } else if (eVar.C != 0 || eVar.D != 0) {
                        this.f4466o = false;
                    }
                    if (eVar.f4497d0 != 0.0f) {
                        this.f4466o = false;
                        this.f4472u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f4467p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f4478f;
            if (dVar != null) {
                e eVar5 = dVar.f4476d;
                d dVar2 = eVar5.W[i10].f4478f;
                if (dVar2 != null && dVar2.f4476d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.b;
        if (eVar6 != null) {
            this.f4464m -= eVar6.W[i10].f();
        }
        e eVar7 = this.f4455d;
        if (eVar7 != null) {
            this.f4464m -= eVar7.W[i10 + 1].f();
        }
        this.f4454c = eVar;
        if (this.f4467p == 0 && this.f4468q) {
            this.f4456e = eVar;
        } else {
            this.f4456e = this.f4453a;
        }
        this.f4471t = this.f4470s && this.f4469r;
    }
}
