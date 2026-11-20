package q7;

import n7.j;
import r7.c;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29603a = c.a.a("nm", "mm", "hd");

    public static n7.j a(r7.c cVar) {
        String str = null;
        boolean z10 = false;
        j.a aVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29603a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                aVar = j.a.b(cVar.j());
            } else if (r8 != 2) {
                cVar.s();
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        return new n7.j(str, aVar, z10);
    }
}
