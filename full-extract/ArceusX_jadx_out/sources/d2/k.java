package d2;

import d2.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k extends p {
    public k(c2.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f14331h.f14288k.add(fVar);
        fVar.f14289l.add(this.f14331h);
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        c2.a aVar = (c2.a) this.b;
        int w12 = aVar.w1();
        Iterator<f> it = this.f14331h.f14289l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f14284g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (w12 == 0 || w12 == 2) {
            this.f14331h.d(i11 + aVar.x1());
        } else {
            this.f14331h.d(i10 + aVar.x1());
        }
    }

    @Override // d2.p
    public void d() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            this.f14331h.b = true;
            c2.a aVar = (c2.a) eVar;
            int w12 = aVar.w1();
            boolean v12 = aVar.v1();
            int i10 = 0;
            if (w12 == 0) {
                this.f14331h.f14282e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    c2.e eVar2 = aVar.L0[i10];
                    if (v12 || eVar2.V() != 8) {
                        f fVar = eVar2.f4498e.f14331h;
                        fVar.f14288k.add(this.f14331h);
                        this.f14331h.f14289l.add(fVar);
                    }
                    i10++;
                }
                q(this.b.f4498e.f14331h);
                q(this.b.f4498e.f14332i);
                return;
            }
            if (w12 == 1) {
                this.f14331h.f14282e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    c2.e eVar3 = aVar.L0[i10];
                    if (v12 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f4498e.f14332i;
                        fVar2.f14288k.add(this.f14331h);
                        this.f14331h.f14289l.add(fVar2);
                    }
                    i10++;
                }
                q(this.b.f4498e.f14331h);
                q(this.b.f4498e.f14332i);
                return;
            }
            if (w12 == 2) {
                this.f14331h.f14282e = f.a.TOP;
                while (i10 < aVar.M0) {
                    c2.e eVar4 = aVar.L0[i10];
                    if (v12 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f4500f.f14331h;
                        fVar3.f14288k.add(this.f14331h);
                        this.f14331h.f14289l.add(fVar3);
                    }
                    i10++;
                }
                q(this.b.f4500f.f14331h);
                q(this.b.f4500f.f14332i);
                return;
            }
            if (w12 != 3) {
                return;
            }
            this.f14331h.f14282e = f.a.BOTTOM;
            while (i10 < aVar.M0) {
                c2.e eVar5 = aVar.L0[i10];
                if (v12 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f4500f.f14332i;
                    fVar4.f14288k.add(this.f14331h);
                    this.f14331h.f14289l.add(fVar4);
                }
                i10++;
            }
            q(this.b.f4500f.f14331h);
            q(this.b.f4500f.f14332i);
        }
    }

    @Override // d2.p
    public void e() {
        c2.e eVar = this.b;
        if (eVar instanceof c2.a) {
            int w12 = ((c2.a) eVar).w1();
            if (w12 == 0 || w12 == 1) {
                this.b.n1(this.f14331h.f14284g);
            } else {
                this.b.o1(this.f14331h.f14284g);
            }
        }
    }

    @Override // d2.p
    public void f() {
        this.f14326c = null;
        this.f14331h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }
}
