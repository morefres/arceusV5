package q7;

import r7.c;

/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29560a = c.a.a("nm", "c", "o", "tr", "hd");

    public static n7.m a(r7.c cVar, f7.i iVar) {
        String str = null;
        m7.b bVar = null;
        m7.b bVar2 = null;
        m7.n nVar = null;
        boolean z10 = false;
        while (cVar.f()) {
            int r8 = cVar.r(f29560a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                bVar = d.f(cVar, iVar, false);
            } else if (r8 == 2) {
                bVar2 = d.f(cVar, iVar, false);
            } else if (r8 == 3) {
                nVar = c.g(cVar, iVar);
            } else if (r8 != 4) {
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        return new n7.m(str, bVar, bVar2, nVar, z10);
    }
}
