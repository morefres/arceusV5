package p0;

import a1.c;

/* loaded from: classes.dex */
public class w {
    public static a1.c a(a1.c cVar, a1.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        c.a b = c.a.b(cVar);
        if (cVar2.b() != null) {
            b.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            b.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            b.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            b.c(cVar2.a());
        }
        return b.a();
    }
}
