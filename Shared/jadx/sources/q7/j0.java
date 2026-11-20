package q7;

import java.util.ArrayList;
import r7.c;

/* loaded from: classes3.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29573a = c.a.a("nm", "hd", "it");

    public static n7.q a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.f()) {
            int r8 = cVar.r(f29573a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                z10 = cVar.g();
            } else if (r8 != 2) {
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    n7.c a10 = h.a(cVar, iVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.d();
            }
        }
        return new n7.q(str, arrayList, z10);
    }
}
