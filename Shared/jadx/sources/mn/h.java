package mn;

import on.a0;
import on.b0;
import on.s;
import on.t;
import on.z;

/* loaded from: classes3.dex */
public abstract class h implements sn.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f24633a;

    public h(char c10) {
        this.f24633a = c10;
    }

    @Override // sn.a
    public char a() {
        return this.f24633a;
    }

    @Override // sn.a
    public int b() {
        return 1;
    }

    @Override // sn.a
    public char c() {
        return this.f24633a;
    }

    @Override // sn.a
    public int d(sn.b bVar, sn.b bVar2) {
        s gVar;
        if ((bVar.c() || bVar2.g()) && bVar2.f() % 3 != 0 && (bVar.f() + bVar2.f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            gVar = new on.g(String.valueOf(this.f24633a));
            i10 = 1;
        } else {
            gVar = new a0(String.valueOf(this.f24633a) + this.f24633a);
        }
        z c10 = z.c();
        c10.b(bVar.a(i10));
        b0 d10 = bVar.d();
        for (s sVar : t.a(d10, bVar2.b())) {
            gVar.c(sVar);
            c10.a(sVar.h());
        }
        c10.b(bVar2.e(i10));
        gVar.l(c10.d());
        d10.i(gVar);
        return i10;
    }
}
