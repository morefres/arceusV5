package q7;

import android.graphics.PointF;
import java.util.ArrayList;
import r7.c;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29551a = c.a.a("k", "x", "y");

    public static m7.e a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.f()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new t7.a(s.e(cVar, s7.m.e())));
        }
        return new m7.e(arrayList);
    }

    public static m7.o<PointF, PointF> b(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.e eVar = null;
        m7.b bVar = null;
        boolean z10 = false;
        m7.b bVar2 = null;
        while (cVar.o() != c.b.END_OBJECT) {
            int r8 = cVar.r(f29551a);
            if (r8 == 0) {
                eVar = a(cVar, iVar);
            } else if (r8 != 1) {
                if (r8 != 2) {
                    cVar.s();
                    cVar.u();
                } else if (cVar.o() == c.b.STRING) {
                    cVar.u();
                    z10 = true;
                } else {
                    bVar = d.e(cVar, iVar);
                }
            } else if (cVar.o() == c.b.STRING) {
                cVar.u();
                z10 = true;
            } else {
                bVar2 = d.e(cVar, iVar);
            }
        }
        cVar.e();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new m7.i(bVar2, bVar);
    }
}
