package q7;

import android.graphics.Path;
import java.util.Collections;
import r7.c;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29587a = c.a.a("nm", "g", "o", zl.t.f38095d, "s", "e", "r", "hd");
    public static final c.a b = c.a.a("p", "k");

    public static n7.e a(r7.c cVar, f7.i iVar) {
        m7.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        n7.g gVar = null;
        m7.c cVar2 = null;
        m7.f fVar = null;
        m7.f fVar2 = null;
        boolean z10 = false;
        while (cVar.f()) {
            switch (cVar.r(f29587a)) {
                case 0:
                    str = cVar.m();
                    break;
                case 1:
                    cVar.c();
                    int i10 = -1;
                    while (cVar.f()) {
                        int r8 = cVar.r(b);
                        if (r8 == 0) {
                            i10 = cVar.j();
                        } else if (r8 != 1) {
                            cVar.s();
                            cVar.u();
                        } else {
                            cVar2 = d.g(cVar, iVar, i10);
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.j() == 1 ? n7.g.LINEAR : n7.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, iVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        return new n7.e(str, gVar, fillType, cVar2, dVar, fVar, fVar2, null, null, z10);
    }
}
