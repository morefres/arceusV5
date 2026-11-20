package q7;

import r7.c;

/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static c.a f29580a = c.a.a("nm", "ind", "ks", "hd");

    public static n7.r a(r7.c cVar, f7.i iVar) {
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        m7.h hVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29580a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                i10 = cVar.j();
            } else if (r8 == 2) {
                hVar = d.k(cVar, iVar);
            } else if (r8 != 3) {
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        return new n7.r(str, i10, hVar, z10);
    }
}
