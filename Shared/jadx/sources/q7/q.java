package q7;

import java.util.ArrayList;
import java.util.Collections;
import n7.s;
import r7.c;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29588a = c.a.a("nm", "g", "o", zl.t.f38095d, "s", "e", "w", "lc", "lj", "ml", "hd", rl.d.f30696a);
    public static final c.a b = c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29589c = c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    public static n7.f a(r7.c cVar, f7.i iVar) {
        m7.d dVar;
        ArrayList arrayList = new ArrayList();
        n7.g gVar = null;
        String str = null;
        m7.c cVar2 = null;
        m7.f fVar = null;
        m7.f fVar2 = null;
        m7.b bVar = null;
        s.a aVar = null;
        s.b bVar2 = null;
        m7.b bVar3 = null;
        float f10 = 0.0f;
        boolean z10 = false;
        m7.d dVar2 = null;
        while (cVar.f()) {
            n7.g gVar2 = gVar;
            switch (cVar.r(f29588a)) {
                case 0:
                    str = cVar.m();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVar2;
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
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 2:
                    dVar2 = d.h(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVar2;
                    gVar = cVar.j() == 1 ? n7.g.LINEAR : n7.g.RADIAL;
                    dVar2 = dVar;
                    break;
                case 4:
                    fVar = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 5:
                    fVar2 = d.i(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 6:
                    bVar = d.e(cVar, iVar);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVar2;
                    aVar = s.a.values()[cVar.j() - 1];
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 8:
                    dVar = dVar2;
                    bVar2 = s.b.values()[cVar.j() - 1];
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 9:
                    dVar = dVar2;
                    f10 = (float) cVar.h();
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                case 10:
                    z10 = cVar.g();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String str2 = null;
                        m7.b bVar4 = null;
                        while (cVar.f()) {
                            int r10 = cVar.r(f29589c);
                            if (r10 != 0) {
                                m7.d dVar3 = dVar2;
                                if (r10 != 1) {
                                    cVar.s();
                                    cVar.u();
                                } else {
                                    bVar4 = d.e(cVar, iVar);
                                }
                                dVar2 = dVar3;
                            } else {
                                str2 = cVar.m();
                            }
                        }
                        m7.d dVar4 = dVar2;
                        cVar.e();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else if (str2.equals(rl.d.f30696a) || str2.equals("g")) {
                            iVar.u(true);
                            arrayList.add(bVar4);
                            dVar2 = dVar4;
                        }
                        dVar2 = dVar4;
                    }
                    dVar = dVar2;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((m7.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVar2 = dVar;
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    gVar = gVar2;
                    break;
            }
        }
        m7.d dVar5 = dVar2;
        return new n7.f(str, gVar, cVar2, dVar5 == null ? new m7.d(Collections.singletonList(new t7.a(100))) : dVar5, fVar, fVar2, bVar, aVar, bVar2, f10, arrayList, bVar3, z10);
    }
}
