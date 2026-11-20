package q7;

import r7.c;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29559a = c.a.a("ef");
    public static final c.a b = c.a.a("ty", "v");

    public static n7.a a(r7.c cVar, f7.i iVar) {
        cVar.c();
        n7.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.f()) {
                int r8 = cVar.r(b);
                if (r8 != 0) {
                    if (r8 != 1) {
                        cVar.s();
                        cVar.u();
                    } else if (z10) {
                        aVar = new n7.a(d.e(cVar, iVar));
                    } else {
                        cVar.u();
                    }
                } else if (cVar.j() == 0) {
                    z10 = true;
                }
            }
            cVar.e();
            return aVar;
        }
    }

    public static n7.a b(r7.c cVar, f7.i iVar) {
        n7.a aVar = null;
        while (cVar.f()) {
            if (cVar.r(f29559a) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    n7.a a10 = a(cVar, iVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.d();
            }
        }
        return aVar;
    }
}
