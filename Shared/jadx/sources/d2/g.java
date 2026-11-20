package d2;

import d2.f;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f14298m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f14282e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f14282e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // d2.f
    public void d(int i10) {
        if (this.f14287j) {
            return;
        }
        this.f14287j = true;
        this.f14284g = i10;
        for (d dVar : this.f14288k) {
            dVar.a(dVar);
        }
    }
}
