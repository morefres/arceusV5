package ln;

/* loaded from: classes3.dex */
public class y extends rn.a {

    /* renamed from: a, reason: collision with root package name */
    public final on.r f23655a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23656c;

    public y(int i10, int i11) {
        on.r rVar = new on.r();
        this.f23655a = rVar;
        this.b = i11;
        rVar.q(Integer.valueOf(i10));
        rVar.p(Integer.valueOf(i11));
    }

    @Override // rn.a, rn.d
    public boolean b() {
        return true;
    }

    @Override // rn.a, rn.d
    public boolean f(on.a aVar) {
        if (!this.f23656c) {
            return true;
        }
        on.a g10 = this.f23655a.g();
        if (!(g10 instanceof on.q)) {
            return true;
        }
        ((on.q) g10).q(false);
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23655a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (!hVar.a()) {
            return hVar.d() >= this.b ? rn.c.a(hVar.c() + this.b) : rn.c.d();
        }
        if (this.f23655a.d() == null) {
            return rn.c.d();
        }
        on.a g10 = hVar.f().g();
        this.f23656c = (g10 instanceof on.w) || (g10 instanceof on.r);
        return rn.c.b(hVar.e());
    }
}
