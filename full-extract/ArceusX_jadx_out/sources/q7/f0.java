package q7;

import r7.c;

/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29562a = c.a.a("nm", "r", "hd");

    public static n7.n a(r7.c cVar, f7.i iVar) {
        boolean z10 = false;
        String str = null;
        m7.b bVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29562a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                bVar = d.f(cVar, iVar, true);
            } else if (r8 != 2) {
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        if (z10) {
            return null;
        }
        return new n7.n(str, bVar);
    }
}
