package q7;

import android.graphics.PointF;
import n7.k;
import r7.c;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29557a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", rl.d.f30696a);

    public static n7.k a(r7.c cVar, f7.i iVar, int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 3;
        String str = null;
        k.a aVar = null;
        m7.b bVar = null;
        m7.o<PointF, PointF> oVar = null;
        m7.b bVar2 = null;
        m7.b bVar3 = null;
        m7.b bVar4 = null;
        m7.b bVar5 = null;
        m7.b bVar6 = null;
        while (cVar.f()) {
            switch (cVar.r(f29557a)) {
                case 0:
                    str = cVar.m();
                    break;
                case 1:
                    aVar = k.a.b(cVar.j());
                    break;
                case 2:
                    bVar = d.f(cVar, iVar, false);
                    break;
                case 3:
                    oVar = a.b(cVar, iVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, iVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, iVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, iVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, iVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, iVar, false);
                    break;
                case 9:
                    z10 = cVar.g();
                    break;
                case 10:
                    if (cVar.j() != 3) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        return new n7.k(str, aVar, bVar, oVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10, z11);
    }
}
