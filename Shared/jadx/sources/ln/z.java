package ln;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class z extends rn.a {

    /* renamed from: a, reason: collision with root package name */
    public final on.w f23657a = new on.w();
    public final w b = new w();

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        this.b.h(iVar);
    }

    @Override // rn.a, rn.d
    public void c(pn.b bVar) {
        pn.j e10 = this.b.e();
        if (e10.f()) {
            return;
        }
        bVar.a(e10, this.f23657a);
    }

    @Override // rn.a, rn.d
    public void d(on.y yVar) {
        this.b.a(yVar);
    }

    @Override // rn.a, rn.d
    public boolean e() {
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23657a;
    }

    @Override // rn.a, rn.d
    public void h() {
        Iterator<on.p> it = this.b.d().iterator();
        while (it.hasNext()) {
            this.f23657a.j(it.next());
        }
        if (this.b.e().f()) {
            this.f23657a.n();
        } else {
            this.f23657a.l(this.b.f());
        }
    }

    @Override // rn.a, rn.d
    public List<on.e<?>> i() {
        List<on.e<?>> a10;
        on.e eVar = new on.e(on.p.class);
        for (on.p pVar : this.b.d()) {
            eVar.d(pVar.q(), pVar);
        }
        a10 = j.a(new Object[]{eVar});
        return a10;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        return !hVar.a() ? rn.c.b(hVar.getIndex()) : rn.c.d();
    }

    public pn.j k() {
        return this.b.e();
    }

    public List<on.y> l(int i10) {
        return this.b.j(i10);
    }
}
