package mn;

import java.util.Set;
import on.b0;

/* loaded from: classes3.dex */
public class i implements qn.a {

    /* renamed from: a, reason: collision with root package name */
    public static final tn.a f24634a = tn.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();
    public static final tn.a b = tn.a.b().d('0', '9').b();

    /* renamed from: c, reason: collision with root package name */
    public static final tn.a f24635c;

    /* renamed from: d, reason: collision with root package name */
    public static final tn.a f24636d;

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new i();
        }

        @Override // qn.b
        public Set<Character> b() {
            Set<Character> a10;
            a10 = c.a(new Object[]{'&'});
            return a10;
        }
    }

    static {
        tn.a b10 = tn.a.b().d('A', 'Z').d('a', 'z').b();
        f24635c = b10;
        f24636d = b10.c().d('0', '9').b();
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i b10 = cVar.b();
        qn.h o8 = b10.o();
        b10.h();
        char l10 = b10.l();
        if (l10 == '#') {
            b10.h();
            if (b10.i('x') || b10.i('X')) {
                int f10 = b10.f(f24634a);
                if (1 <= f10 && f10 <= 6 && b10.i(';')) {
                    return b(b10, o8);
                }
            } else {
                int f11 = b10.f(b);
                if (1 <= f11 && f11 <= 7 && b10.i(';')) {
                    return b(b10, o8);
                }
            }
        } else if (f24635c.a(l10)) {
            b10.f(f24636d);
            if (b10.i(';')) {
                return b(b10, o8);
            }
        }
        return qn.g.a();
    }

    public final qn.g b(qn.i iVar, qn.h hVar) {
        return qn.g.b(new b0(nn.d.a(iVar.d(hVar, iVar.o()).c())), iVar.o());
    }
}
