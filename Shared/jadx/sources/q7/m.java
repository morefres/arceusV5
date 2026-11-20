package q7;

import java.util.ArrayList;
import r7.c;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29583a = c.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final c.a b = c.a.a("shapes");

    public static l7.d a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c10 = 0;
        double d11 = 0.0d;
        while (cVar.f()) {
            int r8 = cVar.r(f29583a);
            if (r8 == 0) {
                c10 = cVar.m().charAt(0);
            } else if (r8 == 1) {
                d11 = cVar.h();
            } else if (r8 == 2) {
                d10 = cVar.h();
            } else if (r8 == 3) {
                str = cVar.m();
            } else if (r8 == 4) {
                str2 = cVar.m();
            } else if (r8 != 5) {
                cVar.s();
                cVar.u();
            } else {
                cVar.c();
                while (cVar.f()) {
                    if (cVar.r(b) != 0) {
                        cVar.s();
                        cVar.u();
                    } else {
                        cVar.b();
                        while (cVar.f()) {
                            arrayList.add((n7.q) h.a(cVar, iVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new l7.d(arrayList, c10, d11, d10, str, str2);
    }
}
