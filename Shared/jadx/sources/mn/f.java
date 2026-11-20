package mn;

import java.util.Set;
import on.b0;

/* loaded from: classes3.dex */
public class f implements qn.a {

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new f();
        }

        @Override // qn.b
        public Set<Character> b() {
            Set<Character> a10;
            a10 = c.a(new Object[]{'`'});
            return a10;
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i b = cVar.b();
        qn.h o8 = b.o();
        int g10 = b.g('`');
        qn.h o10 = b.o();
        while (b.b('`') > 0) {
            qn.h o11 = b.o();
            if (b.g('`') == g10) {
                on.d dVar = new on.d();
                String replace = b.d(o10, o11).c().replace('\n', ' ');
                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && tn.d.c(replace)) {
                    replace = replace.substring(1, replace.length() - 1);
                }
                dVar.p(replace);
                return qn.g.b(dVar, b.o());
            }
        }
        return qn.g.b(new b0(b.d(o8, o10).c()), o10);
    }
}
