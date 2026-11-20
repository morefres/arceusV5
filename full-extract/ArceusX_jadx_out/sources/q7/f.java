package q7;

import android.graphics.PointF;
import r7.c;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29561a = c.a.a("nm", "p", "s", "hd", rl.d.f30696a);

    public static n7.b a(r7.c cVar, f7.i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        m7.o<PointF, PointF> oVar = null;
        m7.f fVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29561a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                oVar = a.b(cVar, iVar);
            } else if (r8 == 2) {
                fVar = d.i(cVar, iVar);
            } else if (r8 == 3) {
                z11 = cVar.g();
            } else if (r8 != 4) {
                cVar.s();
                cVar.u();
            } else {
                z10 = cVar.j() == 3;
            }
        }
        return new n7.b(str, oVar, fVar, z10, z11);
    }
}
