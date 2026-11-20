package q7;

import android.graphics.PointF;
import r7.c;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29558a = c.a.a("nm", "p", "s", "r", "hd");

    public static n7.l a(r7.c cVar, f7.i iVar) {
        String str = null;
        m7.o<PointF, PointF> oVar = null;
        m7.f fVar = null;
        m7.b bVar = null;
        boolean z10 = false;
        while (cVar.f()) {
            int r8 = cVar.r(f29558a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                oVar = a.b(cVar, iVar);
            } else if (r8 == 2) {
                fVar = d.i(cVar, iVar);
            } else if (r8 == 3) {
                bVar = d.e(cVar, iVar);
            } else if (r8 != 4) {
                cVar.u();
            } else {
                z10 = cVar.g();
            }
        }
        return new n7.l(str, oVar, fVar, bVar, z10);
    }
}
