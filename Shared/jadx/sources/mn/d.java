package mn;

import java.util.Set;
import java.util.regex.Pattern;
import on.b0;
import on.o;

/* loaded from: classes3.dex */
public class d implements qn.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24631a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new d();
        }

        @Override // qn.b
        public Set<Character> b() {
            Set<Character> a10;
            a10 = c.a(new Object[]{'<'});
            return a10;
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        String str;
        qn.i b10 = cVar.b();
        b10.h();
        qn.h o8 = b10.o();
        if (b10.b('>') > 0) {
            pn.j d10 = b10.d(o8, b10.o());
            String c10 = d10.c();
            b10.h();
            if (f24631a.matcher(c10).matches()) {
                str = c10;
            } else if (b.matcher(c10).matches()) {
                str = "mailto:" + c10;
            } else {
                str = null;
            }
            if (str != null) {
                o oVar = new o(str, null);
                b0 b0Var = new b0(c10);
                b0Var.l(d10.e());
                oVar.c(b0Var);
                return qn.g.b(oVar, b10.o());
            }
        }
        return qn.g.a();
    }
}
