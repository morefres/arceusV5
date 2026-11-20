package z;

import n0.l1;
import y.a;

/* loaded from: classes.dex */
public final class n4 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n4 f37332c = new n4(new d0.j());
    public final d0.j b;

    public n4(d0.j jVar) {
        this.b = jVar;
    }

    @Override // z.b1, n0.l1.b
    public void a(n0.i4<?> i4Var, l1.a aVar) {
        super.a(i4Var, aVar);
        if (!(i4Var instanceof n0.g2)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        n0.g2 g2Var = (n0.g2) i4Var;
        a.C0666a c0666a = new a.C0666a();
        if (g2Var.p0()) {
            this.b.a(g2Var.i0(), c0666a);
        }
        aVar.e(c0666a.b());
    }
}
