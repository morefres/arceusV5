package q7;

import android.graphics.Path;
import java.util.Collections;
import r7.c;

/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29568a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static n7.p a(r7.c cVar, f7.i iVar) {
        m7.d dVar = null;
        String str = null;
        m7.a aVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (cVar.f()) {
            int r8 = cVar.r(f29568a);
            if (r8 == 0) {
                str = cVar.m();
            } else if (r8 == 1) {
                aVar = d.c(cVar, iVar);
            } else if (r8 == 2) {
                dVar = d.h(cVar, iVar);
            } else if (r8 == 3) {
                z10 = cVar.g();
            } else if (r8 == 4) {
                i10 = cVar.j();
            } else if (r8 != 5) {
                cVar.s();
                cVar.u();
            } else {
                z11 = cVar.g();
            }
        }
        if (dVar == null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(100)));
        }
        return new n7.p(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z11);
    }
}
