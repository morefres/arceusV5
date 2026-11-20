package ln;

/* loaded from: classes3.dex */
public class l extends rn.a {

    /* renamed from: a, reason: collision with root package name */
    public final on.h f23601a;
    public final char b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23602c;

    /* renamed from: d, reason: collision with root package name */
    public String f23603d;

    /* renamed from: e, reason: collision with root package name */
    public StringBuilder f23604e;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            int d10 = hVar.d();
            if (d10 >= nn.f.f27215a) {
                return rn.f.c();
            }
            int e10 = hVar.e();
            l m10 = l.m(hVar.b().a(), e10, d10);
            return m10 != null ? rn.f.d(m10).b(e10 + m10.f23601a.t().intValue()) : rn.f.c();
        }
    }

    public l(char c10, int i10, int i11) {
        on.h hVar = new on.h();
        this.f23601a = hVar;
        this.f23604e = new StringBuilder();
        this.b = c10;
        this.f23602c = i10;
        hVar.v(String.valueOf(c10));
        hVar.z(Integer.valueOf(i10));
        hVar.w(i11);
    }

    public static l m(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char charAt = charSequence.charAt(i14);
            if (charAt == '`') {
                i12++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i13++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (tn.d.a('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new l('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new l('~', i13, i11);
    }

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        if (this.f23603d == null) {
            this.f23603d = iVar.a().toString();
        } else {
            this.f23604e.append(iVar.a());
            this.f23604e.append('\n');
        }
    }

    @Override // rn.d
    public on.a g() {
        return this.f23601a;
    }

    @Override // rn.a, rn.d
    public void h() {
        this.f23601a.x(nn.c.e(this.f23603d.trim()));
        this.f23601a.y(this.f23604e.toString());
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        int e10 = hVar.e();
        int index = hVar.getIndex();
        CharSequence a10 = hVar.b().a();
        if (hVar.d() < nn.f.f27215a && e10 < a10.length() && n(a10, e10)) {
            return rn.c.c();
        }
        int length = a10.length();
        for (int q10 = this.f23601a.q(); q10 > 0 && index < length && a10.charAt(index) == ' '; q10--) {
            index++;
        }
        return rn.c.b(index);
    }

    public final boolean n(CharSequence charSequence, int i10) {
        int i11 = tn.d.i(this.b, charSequence, i10, charSequence.length()) - i10;
        if (i11 < this.f23602c || tn.d.k(charSequence, i10 + i11, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.f23601a.u(Integer.valueOf(i11));
        return true;
    }
}
