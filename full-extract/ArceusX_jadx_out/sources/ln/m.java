package ln;

/* loaded from: classes3.dex */
public class m extends rn.a {

    /* renamed from: a, reason: collision with root package name */
    public final on.j f23605a;
    public final pn.j b;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            m m10;
            if (hVar.d() >= nn.f.f27215a) {
                return rn.f.c();
            }
            pn.i b = hVar.b();
            int e10 = hVar.e();
            if (b.a().charAt(e10) == '#' && (m10 = m.m(b.d(e10, b.a().length()))) != null) {
                return rn.f.d(m10).b(b.a().length());
            }
            int n10 = m.n(b.a(), e10);
            if (n10 > 0) {
                pn.j b10 = gVar.b();
                if (!b10.f()) {
                    return rn.f.d(new m(n10, b10)).b(b.a().length()).e(b10.d().size());
                }
            }
            return rn.f.c();
        }
    }

    public m(int i10, pn.j jVar) {
        on.j jVar2 = new on.j();
        this.f23605a = jVar2;
        jVar2.q(i10);
        this.b = jVar;
    }

    public static m m(pn.i iVar) {
        qn.i k10 = qn.i.k(pn.j.h(iVar));
        int g10 = k10.g('#');
        if (g10 == 0 || g10 > 6) {
            return null;
        }
        if (!k10.e()) {
            return new m(g10, pn.j.b());
        }
        char l10 = k10.l();
        if (l10 != ' ' && l10 != '\t') {
            return null;
        }
        k10.r();
        qn.h o8 = k10.o();
        qn.h hVar = o8;
        loop0: while (true) {
            boolean z10 = true;
            while (k10.e()) {
                char l11 = k10.l();
                if (l11 == '\t' || l11 == ' ') {
                    k10.h();
                } else {
                    if (l11 != '#') {
                        k10.h();
                        hVar = k10.o();
                    } else if (z10) {
                        k10.g('#');
                        int r8 = k10.r();
                        if (k10.e()) {
                            hVar = k10.o();
                        }
                        if (r8 > 0) {
                            break;
                        }
                    } else {
                        k10.h();
                        hVar = k10.o();
                    }
                    z10 = false;
                }
            }
            break loop0;
        }
        pn.j d10 = k10.d(o8, hVar);
        return d10.c().isEmpty() ? new m(g10, pn.j.b()) : new m(g10, d10);
    }

    public static int n(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        return charAt != '-' ? (charAt == '=' && o(charSequence, i10 + 1, '=')) ? 1 : 0 : o(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    public static boolean o(CharSequence charSequence, int i10, char c10) {
        return tn.d.k(charSequence, tn.d.i(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // rn.a, rn.d
    public void c(pn.b bVar) {
        bVar.a(this.b, this.f23605a);
    }

    @Override // rn.d
    public on.a g() {
        return this.f23605a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        return rn.c.d();
    }
}
