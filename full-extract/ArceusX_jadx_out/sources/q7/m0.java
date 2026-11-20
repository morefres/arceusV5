package q7;

import n7.t;
import r7.c;

/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29584a = c.a.a("s", "e", "o", "nm", "m", "hd");

    public static n7.t a(r7.c cVar, f7.i iVar) {
        String str = null;
        t.a aVar = null;
        m7.b bVar = null;
        m7.b bVar2 = null;
        m7.b bVar3 = null;
        boolean z10 = false;
        while (cVar.f()) {
            int r8 = cVar.r(f29584a);
            if (r8 == 0) {
                bVar = d.f(cVar, iVar, false);
            } else if (r8 == 1) {
                bVar2 = d.f(cVar, iVar, false);
            } else if (r8 == 2) {
                bVar3 = d.f(cVar, iVar, false);
            } else if (r8 == 3) {
                str = cVar.m();
            } else if (r8 == 4) {
                aVar = t.a.b(cVar.j());
            } else if (r8 != 5) {
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        return new n7.t(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
