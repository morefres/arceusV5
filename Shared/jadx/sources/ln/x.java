package ln;

import java.util.Objects;

/* loaded from: classes3.dex */
public class x extends rn.a {

    /* renamed from: a, reason: collision with root package name */
    public final on.q f23651a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public int f23652c;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            b o8;
            rn.d a10 = gVar.a();
            if (hVar.d() < nn.f.f27215a && (o8 = x.o(hVar.b().a(), hVar.e(), hVar.c() + hVar.d(), !gVar.b().f())) != null) {
                int i10 = o8.b;
                y yVar = new y(hVar.d(), i10 - hVar.c());
                if ((a10 instanceof x) && x.n((on.q) a10.g(), o8.f23653a)) {
                    return rn.f.d(yVar).a(i10);
                }
                x xVar = new x(o8.f23653a);
                o8.f23653a.q(true);
                return rn.f.d(xVar, yVar).a(i10);
            }
            return rn.f.c();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final on.q f23653a;
        public final int b;

        public b(on.q qVar, int i10) {
            this.f23653a = qVar;
            this.b = i10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final on.q f23654a;
        public final int b;

        public c(on.q qVar, int i10) {
            this.f23654a = qVar;
            this.b = i10;
        }
    }

    public x(on.q qVar) {
        this.f23651a = qVar;
    }

    public static boolean m(CharSequence charSequence, int i10) {
        char charAt;
        return i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\t' || charAt == ' ';
    }

    public static boolean n(on.q qVar, on.q qVar2) {
        if ((qVar instanceof on.c) && (qVar2 instanceof on.c)) {
            return Objects.equals(((on.c) qVar).r(), ((on.c) qVar2).r());
        }
        if ((qVar instanceof on.v) && (qVar2 instanceof on.v)) {
            return Objects.equals(((on.v) qVar).r(), ((on.v) qVar2).r());
        }
        return false;
    }

    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c p8 = p(charSequence, i10);
        if (p8 == null) {
            return null;
        }
        on.q qVar = p8.f23654a;
        int i12 = p8.b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int i14 = i13;
        while (true) {
            if (i12 >= length) {
                z11 = false;
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z11 = true;
                    break;
                }
                i14++;
            } else {
                i14 += nn.f.a(i14);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof on.v) && ((on.v) qVar).s().intValue() != 1) || !z11)) {
            return null;
        }
        if (!z11 || i14 - i13 > nn.f.f27215a) {
            i14 = i13 + 1;
        }
        return new b(qVar, i14);
    }

    public static c p(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return q(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!m(charSequence, i11)) {
            return null;
        }
        on.c cVar = new on.c();
        cVar.s(String.valueOf(charAt));
        return new c(cVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ln.x.c q(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            r3 = 0
            if (r2 >= r0) goto L53
            char r4 = r6.charAt(r2)
            r5 = 41
            if (r4 == r5) goto L23
            r5 = 46
            if (r4 == r5) goto L23
            switch(r4) {
                case 48: goto L19;
                case 49: goto L19;
                case 50: goto L19;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                default: goto L18;
            }
        L18:
            return r3
        L19:
            int r1 = r1 + 1
            r4 = 9
            if (r1 <= r4) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            r0 = 1
            if (r1 < r0) goto L53
            int r0 = r2 + 1
            boolean r1 = m(r6, r0)
            if (r1 == 0) goto L53
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            on.v r7 = new on.v
            r7.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.v(r6)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            r7.u(r6)
            ln.x$c r6 = new ln.x$c
            r6.<init>(r7, r0)
            return r6
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.x.q(java.lang.CharSequence, int):ln.x$c");
    }

    @Override // rn.a, rn.d
    public boolean b() {
        return true;
    }

    @Override // rn.a, rn.d
    public boolean f(on.a aVar) {
        if (!(aVar instanceof on.r)) {
            return false;
        }
        if (this.b && this.f23652c == 1) {
            this.f23651a.q(false);
            this.b = false;
        }
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23651a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (hVar.a()) {
            this.b = true;
            this.f23652c = 0;
        } else if (this.b) {
            this.f23652c++;
        }
        return rn.c.b(hVar.getIndex());
    }
}
