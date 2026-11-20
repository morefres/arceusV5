package q7;

import java.util.Collections;
import r7.c;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29553a = c.a.a("s", ve.a.f33391e);
    public static final c.a b = c.a.a("s", "e", "o", "r");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29554c = c.a.a("fc", "sc", "sw", zl.t.f38095d, "o");

    public static m7.k a(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.m mVar = null;
        m7.l lVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29553a);
            if (r8 == 0) {
                lVar = b(cVar, iVar);
            } else if (r8 != 1) {
                cVar.s();
                cVar.u();
            } else {
                mVar = c(cVar, iVar);
            }
        }
        cVar.e();
        return new m7.k(mVar, lVar);
    }

    public static m7.l b(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.d dVar = null;
        m7.d dVar2 = null;
        m7.d dVar3 = null;
        n7.u uVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(b);
            if (r8 == 0) {
                dVar = d.h(cVar, iVar);
            } else if (r8 == 1) {
                dVar2 = d.h(cVar, iVar);
            } else if (r8 == 2) {
                dVar3 = d.h(cVar, iVar);
            } else if (r8 != 3) {
                cVar.s();
                cVar.u();
            } else {
                int j10 = cVar.j();
                if (j10 == 1 || j10 == 2) {
                    uVar = j10 == 1 ? n7.u.PERCENT : n7.u.INDEX;
                } else {
                    iVar.a("Unsupported text range units: " + j10);
                    uVar = n7.u.INDEX;
                }
            }
        }
        cVar.e();
        if (dVar == null && dVar2 != null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(0)));
        }
        return new m7.l(dVar, dVar2, dVar3, uVar);
    }

    public static m7.m c(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.a aVar = null;
        m7.a aVar2 = null;
        m7.b bVar = null;
        m7.b bVar2 = null;
        m7.d dVar = null;
        while (cVar.f()) {
            int r8 = cVar.r(f29554c);
            if (r8 == 0) {
                aVar = d.c(cVar, iVar);
            } else if (r8 == 1) {
                aVar2 = d.c(cVar, iVar);
            } else if (r8 == 2) {
                bVar = d.e(cVar, iVar);
            } else if (r8 == 3) {
                bVar2 = d.e(cVar, iVar);
            } else if (r8 != 4) {
                cVar.s();
                cVar.u();
            } else {
                dVar = d.h(cVar, iVar);
            }
        }
        cVar.e();
        return new m7.m(aVar, aVar2, bVar, bVar2, dVar);
    }
}
