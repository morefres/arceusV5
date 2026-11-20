package z1;

import java.util.ArrayList;
import z1.d;
import z1.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f37671e;

    /* renamed from: a, reason: collision with root package name */
    public i f37668a = null;
    public float b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37669c = false;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<i> f37670d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f37672f = false;

    public interface a {
        float a(i iVar);

        i b(int i10);

        void c(i iVar, float f10);

        void clear();

        void d();

        float e(b bVar, boolean z10);

        void f(i iVar, float f10, boolean z10);

        boolean g(i iVar);

        int h();

        float i(int i10);

        float j(i iVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f37716g) {
            return;
        }
        this.b += iVar.f37715f * this.f37671e.a(iVar);
        this.f37671e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (d.f37678u && this.f37671e.h() == 0) {
            this.f37672f = true;
            dVar.b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.b += bVar.b * this.f37671e.e(bVar, z10);
        if (z10) {
            bVar.f37668a.d(this);
        }
        if (d.f37678u && this.f37668a != null && this.f37671e.h() == 0) {
            this.f37672f = true;
            dVar.b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f37723n) {
            return;
        }
        float a10 = this.f37671e.a(iVar);
        this.b += iVar.f37725p * a10;
        this.f37671e.j(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        this.f37671e.f(dVar.f37696o.f37675d[iVar.f37724o], a10, z10);
        if (d.f37678u && this.f37671e.h() == 0) {
            this.f37672f = true;
            dVar.b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f37689h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int h10 = this.f37671e.h();
            for (int i10 = 0; i10 < h10; i10++) {
                i b = this.f37671e.b(i10);
                if (b.f37713d != -1 || b.f37716g || b.f37723n) {
                    this.f37670d.add(b);
                }
            }
            int size = this.f37670d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f37670d.get(i11);
                    if (iVar.f37716g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f37723n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f37689h[iVar.f37713d], true);
                    }
                }
                this.f37670d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f37678u && this.f37668a != null && this.f37671e.h() == 0) {
            this.f37672f = true;
            dVar.b = true;
        }
    }

    @Override // z1.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // z1.d.a
    public void b(i iVar) {
        int i10 = iVar.f37714e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f37671e.c(iVar, f10);
    }

    @Override // z1.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f37668a = null;
            this.f37671e.clear();
            for (int i10 = 0; i10 < bVar.f37671e.h(); i10++) {
                this.f37671e.f(bVar.f37671e.b(i10), bVar.f37671e.i(i10), true);
            }
        }
    }

    @Override // z1.d.a
    public void clear() {
        this.f37671e.clear();
        this.f37668a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f37671e.c(dVar.o(i10, "ep"), 1.0f);
        this.f37671e.c(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f37671e.c(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f37671e.h() == 0) {
            this.f37672f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        boolean u8;
        boolean u10;
        int h10 = this.f37671e.h();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < h10; i10++) {
            float i11 = this.f37671e.i(i10);
            i b = this.f37671e.b(i10);
            if (b.f37719j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u10 = u(b, dVar);
                } else if (f10 > i11) {
                    u10 = u(b, dVar);
                } else if (!z10 && u(b, dVar)) {
                    f10 = i11;
                    iVar = b;
                    z10 = true;
                }
                z10 = u10;
                f10 = i11;
                iVar = b;
            } else if (iVar == null && i11 < 0.0f) {
                if (iVar2 == null) {
                    u8 = u(b, dVar);
                } else if (f11 > i11) {
                    u8 = u(b, dVar);
                } else if (!z11 && u(b, dVar)) {
                    f11 = i11;
                    iVar2 = b;
                    z11 = true;
                }
                z11 = u8;
                f11 = i11;
                iVar2 = b;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // z1.d.a
    public i getKey() {
        return this.f37668a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar4, 1.0f);
            this.f37671e.c(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            this.f37671e.c(iVar3, -1.0f);
            this.f37671e.c(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f37671e.c(iVar, -1.0f);
                this.f37671e.c(iVar2, 1.0f);
                this.b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f37671e.c(iVar4, -1.0f);
                this.f37671e.c(iVar3, 1.0f);
                this.b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f37671e.c(iVar, f11 * 1.0f);
            this.f37671e.c(iVar2, f11 * (-1.0f));
            this.f37671e.c(iVar3, (-1.0f) * f10);
            this.f37671e.c(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f37668a = iVar;
        float f10 = i10;
        iVar.f37715f = f10;
        this.b = f10;
        this.f37672f = true;
        return this;
    }

    @Override // z1.d.a
    public boolean isEmpty() {
        return this.f37668a == null && this.b == 0.0f && this.f37671e.h() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f37671e.c(iVar, -1.0f);
        this.f37671e.c(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f37671e.c(iVar, -1.0f);
        this.f37671e.c(iVar2, 1.0f);
        this.f37671e.c(iVar3, f10);
        this.f37671e.c(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            this.f37671e.c(iVar4, 1.0f);
            this.f37671e.c(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f37671e.c(iVar3, 1.0f);
            this.f37671e.c(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f37671e.c(iVar, 1.0f);
        this.f37671e.c(iVar2, -1.0f);
        this.f37671e.c(iVar4, f13);
        this.f37671e.c(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.b = i10 * (-1);
            this.f37671e.c(iVar, 1.0f);
            return this;
        }
        this.b = i10;
        this.f37671e.c(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            return this;
        }
        this.f37671e.c(iVar, -1.0f);
        this.f37671e.c(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            this.f37671e.c(iVar3, -1.0f);
            return this;
        }
        this.f37671e.c(iVar, -1.0f);
        this.f37671e.c(iVar2, 1.0f);
        this.f37671e.c(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.b = i10;
        }
        if (z10) {
            this.f37671e.c(iVar, 1.0f);
            this.f37671e.c(iVar2, -1.0f);
            this.f37671e.c(iVar3, 1.0f);
            return this;
        }
        this.f37671e.c(iVar, -1.0f);
        this.f37671e.c(iVar2, 1.0f);
        this.f37671e.c(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f37671e.c(iVar3, 0.5f);
        this.f37671e.c(iVar4, 0.5f);
        this.f37671e.c(iVar, -0.5f);
        this.f37671e.c(iVar2, -0.5f);
        this.b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.b;
        if (f10 < 0.0f) {
            this.b = f10 * (-1.0f);
            this.f37671e.d();
        }
    }

    public boolean s() {
        i iVar = this.f37668a;
        if (iVar != null) {
            return iVar.f37719j == i.a.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f37671e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public final boolean u(i iVar, d dVar) {
        return iVar.f37722m <= 1;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public final i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int h10 = this.f37671e.h();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < h10; i10++) {
            float i11 = this.f37671e.i(i10);
            if (i11 < 0.0f) {
                i b = this.f37671e.b(i10);
                if ((zArr == null || !zArr[b.f37712c]) && b != iVar && (((aVar = b.f37719j) == i.a.SLACK || aVar == i.a.ERROR) && i11 < f10)) {
                    f10 = i11;
                    iVar2 = b;
                }
            }
        }
        return iVar2;
    }

    public void x(i iVar) {
        i iVar2 = this.f37668a;
        if (iVar2 != null) {
            this.f37671e.c(iVar2, -1.0f);
            this.f37668a.f37713d = -1;
            this.f37668a = null;
        }
        float j10 = this.f37671e.j(iVar, true) * (-1.0f);
        this.f37668a = iVar;
        if (j10 == 1.0f) {
            return;
        }
        this.b /= j10;
        this.f37671e.k(j10);
    }

    public void y() {
        this.f37668a = null;
        this.f37671e.clear();
        this.b = 0.0f;
        this.f37672f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f37671e = new z1.a(this, cVar);
    }
}
