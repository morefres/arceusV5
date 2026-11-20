package qn;

import java.util.List;
import on.y;
import pn.j;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final List<pn.i> f29966a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f29967c;

    /* renamed from: d, reason: collision with root package name */
    public pn.i f29968d = pn.i.c("", null);

    /* renamed from: e, reason: collision with root package name */
    public int f29969e = 0;

    public i(List<pn.i> list, int i10, int i11) {
        this.f29966a = list;
        this.b = i10;
        this.f29967c = i11;
        if (list.isEmpty()) {
            return;
        }
        a(i10, i11);
        p(list.get(i10));
    }

    public static i k(j jVar) {
        return new i(jVar.d(), 0, 0);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f29966a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f29966a.size());
        }
        pn.i iVar = this.f29966a.get(i10);
        if (i11 < 0 || i11 > iVar.a().length()) {
            throw new IllegalArgumentException("Index " + i11 + " out of range, line length: " + iVar.a().length());
        }
    }

    public int b(char c10) {
        int i10 = 0;
        while (true) {
            char l10 = l();
            if (l10 == 0) {
                return -1;
            }
            if (l10 == c10) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public int c(tn.c cVar) {
        int i10 = 0;
        while (true) {
            char l10 = l();
            if (l10 == 0) {
                return -1;
            }
            if (cVar.a(l10)) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public j d(h hVar, h hVar2) {
        int i10 = hVar.f29965a;
        if (i10 == hVar2.f29965a) {
            pn.i iVar = this.f29966a.get(i10);
            CharSequence subSequence = iVar.a().subSequence(hVar.b, hVar2.b);
            y b = iVar.b();
            return j.h(pn.i.c(subSequence, b != null ? b.g(hVar.b, hVar2.b) : null));
        }
        j b10 = j.b();
        pn.i iVar2 = this.f29966a.get(hVar.f29965a);
        b10.a(iVar2.d(hVar.b, iVar2.a().length()));
        int i11 = hVar.f29965a;
        while (true) {
            i11++;
            int i12 = hVar2.f29965a;
            if (i11 >= i12) {
                b10.a(this.f29966a.get(i12).d(0, hVar2.b));
                return b10;
            }
            b10.a(this.f29966a.get(i11));
        }
    }

    public boolean e() {
        return this.f29967c < this.f29969e || this.b < this.f29966a.size() - 1;
    }

    public int f(tn.c cVar) {
        int i10 = 0;
        while (cVar.a(l())) {
            i10++;
            h();
        }
        return i10;
    }

    public int g(char c10) {
        int i10 = 0;
        while (l() == c10) {
            i10++;
            h();
        }
        return i10;
    }

    public void h() {
        int i10 = this.f29967c + 1;
        this.f29967c = i10;
        if (i10 > this.f29969e) {
            int i11 = this.b + 1;
            this.b = i11;
            if (i11 < this.f29966a.size()) {
                p(this.f29966a.get(this.b));
            } else {
                p(pn.i.c("", null));
            }
            this.f29967c = 0;
        }
    }

    public boolean i(char c10) {
        if (l() != c10) {
            return false;
        }
        h();
        return true;
    }

    public boolean j(String str) {
        int i10 = this.f29967c;
        if (i10 >= this.f29969e || i10 + str.length() > this.f29969e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f29968d.a().charAt(this.f29967c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f29967c += str.length();
        return true;
    }

    public char l() {
        return this.f29967c < this.f29969e ? this.f29968d.a().charAt(this.f29967c) : this.b < this.f29966a.size() + (-1) ? '\n' : (char) 0;
    }

    public int m() {
        if (this.f29967c >= this.f29969e) {
            return this.b < this.f29966a.size() + (-1) ? 10 : 0;
        }
        char charAt = this.f29968d.a().charAt(this.f29967c);
        if (!Character.isHighSurrogate(charAt) || this.f29967c + 1 >= this.f29969e) {
            return charAt;
        }
        char charAt2 = this.f29968d.a().charAt(this.f29967c + 1);
        return Character.isLowSurrogate(charAt2) ? Character.toCodePoint(charAt, charAt2) : charAt;
    }

    public int n() {
        int i10 = this.f29967c;
        if (i10 <= 0) {
            return this.b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char charAt = this.f29968d.a().charAt(i11);
        if (Character.isLowSurrogate(charAt) && i11 > 0) {
            char charAt2 = this.f29968d.a().charAt(i10 - 2);
            if (Character.isHighSurrogate(charAt2)) {
                return Character.toCodePoint(charAt2, charAt);
            }
        }
        return charAt;
    }

    public h o() {
        return new h(this.b, this.f29967c);
    }

    public final void p(pn.i iVar) {
        this.f29968d = iVar;
        this.f29969e = iVar.a().length();
    }

    public void q(h hVar) {
        a(hVar.f29965a, hVar.b);
        int i10 = hVar.f29965a;
        this.b = i10;
        this.f29967c = hVar.b;
        p(this.f29966a.get(i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r() {
        /*
            r3 = this;
            r0 = 0
        L1:
            char r1 = r3.l()
            r2 = 32
            if (r1 == r2) goto Ld
            switch(r1) {
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto Ld;
                case 12: goto Ld;
                case 13: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r0
        Ld:
            int r0 = r0 + 1
            r3.h()
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.i.r():int");
    }
}
