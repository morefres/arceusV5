package d2;

/* loaded from: classes.dex */
public class j extends p {
    public j(c2.e eVar) {
        super(eVar);
        eVar.f4498e.f();
        eVar.f4500f.f();
        this.f14329f = ((c2.h) eVar).t1();
    }

    @Override // d2.p, d2.d
    public void a(d dVar) {
        f fVar = this.f14331h;
        if (fVar.f14280c && !fVar.f14287j) {
            this.f14331h.d((int) ((fVar.f14289l.get(0).f14284g * ((c2.h) this.b).w1()) + 0.5f));
        }
    }

    @Override // d2.p
    public void d() {
        c2.h hVar = (c2.h) this.b;
        int u12 = hVar.u1();
        int v12 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (u12 != -1) {
                this.f14331h.f14289l.add(this.b.f4492a0.f4498e.f14331h);
                this.b.f4492a0.f4498e.f14331h.f14288k.add(this.f14331h);
                this.f14331h.f14283f = u12;
            } else if (v12 != -1) {
                this.f14331h.f14289l.add(this.b.f4492a0.f4498e.f14332i);
                this.b.f4492a0.f4498e.f14332i.f14288k.add(this.f14331h);
                this.f14331h.f14283f = -v12;
            } else {
                f fVar = this.f14331h;
                fVar.b = true;
                fVar.f14289l.add(this.b.f4492a0.f4498e.f14332i);
                this.b.f4492a0.f4498e.f14332i.f14288k.add(this.f14331h);
            }
            q(this.b.f4498e.f14331h);
            q(this.b.f4498e.f14332i);
            return;
        }
        if (u12 != -1) {
            this.f14331h.f14289l.add(this.b.f4492a0.f4500f.f14331h);
            this.b.f4492a0.f4500f.f14331h.f14288k.add(this.f14331h);
            this.f14331h.f14283f = u12;
        } else if (v12 != -1) {
            this.f14331h.f14289l.add(this.b.f4492a0.f4500f.f14332i);
            this.b.f4492a0.f4500f.f14332i.f14288k.add(this.f14331h);
            this.f14331h.f14283f = -v12;
        } else {
            f fVar2 = this.f14331h;
            fVar2.b = true;
            fVar2.f14289l.add(this.b.f4492a0.f4500f.f14332i);
            this.b.f4492a0.f4500f.f14332i.f14288k.add(this.f14331h);
        }
        q(this.b.f4500f.f14331h);
        q(this.b.f4500f.f14332i);
    }

    @Override // d2.p
    public void e() {
        if (((c2.h) this.b).t1() == 1) {
            this.b.n1(this.f14331h.f14284g);
        } else {
            this.b.o1(this.f14331h.f14284g);
        }
    }

    @Override // d2.p
    public void f() {
        this.f14331h.c();
    }

    @Override // d2.p
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f14331h.f14288k.add(fVar);
        fVar.f14289l.add(this.f14331h);
    }
}
