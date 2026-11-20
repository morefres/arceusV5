package q7;

import java.util.ArrayList;
import java.util.Collections;
import n7.s;
import r7.c;

/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29582a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", rl.d.f30696a);
    public static final c.a b = c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [m7.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static n7.s a(r7.c cVar, f7.i iVar) {
        ?? r15;
        ArrayList arrayList = new ArrayList();
        String str = null;
        s.a aVar = null;
        s.b bVar = null;
        m7.b bVar2 = null;
        m7.a aVar2 = null;
        m7.b bVar3 = null;
        String str2 = null;
        float f10 = 0.0f;
        boolean z10 = false;
        m7.d dVar = null;
        while (cVar.f()) {
            switch (cVar.r(f29582a)) {
                case 0:
                    str = cVar.m();
                    break;
                case 1:
                    aVar2 = d.c(cVar, iVar);
                    break;
                case 2:
                    bVar3 = d.e(cVar, iVar);
                    break;
                case 3:
                    dVar = d.h(cVar, iVar);
                    break;
                case 4:
                    aVar = s.a.values()[cVar.j() - 1];
                    break;
                case 5:
                    bVar = s.b.values()[cVar.j() - 1];
                    break;
                case 6:
                    f10 = (float) cVar.h();
                    break;
                case 7:
                    z10 = cVar.g();
                    break;
                case 8:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String str3 = str2;
                        r15 = str3;
                        while (cVar.f()) {
                            int r8 = cVar.r(b);
                            if (r8 == 0) {
                                str3 = cVar.m();
                            } else if (r8 != 1) {
                                cVar.s();
                                cVar.u();
                            } else {
                                r15 = d.e(cVar, iVar);
                            }
                            r15 = r15;
                        }
                        cVar.e();
                        str3.getClass();
                        switch (str3) {
                            case "d":
                            case "g":
                                iVar.u(true);
                                arrayList.add(r15);
                                break;
                            case "o":
                                bVar2 = r15;
                                break;
                        }
                        str2 = null;
                    }
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((m7.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.u();
                    continue;
            }
            str2 = null;
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        if (aVar == null) {
            aVar = s.a.BUTT;
        }
        if (bVar == null) {
            bVar = s.b.MITER;
        }
        return new n7.s(str, bVar2, arrayList, aVar2, dVar, bVar3, aVar, bVar, f10, z10);
    }
}
