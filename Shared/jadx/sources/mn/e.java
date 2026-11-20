package mn;

import java.util.Set;
import java.util.regex.Pattern;
import on.b0;

/* loaded from: classes3.dex */
public class e implements qn.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24632a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new e();
        }

        @Override // qn.b
        public Set<Character> b() {
            Set<Character> a10;
            a10 = c.a(new Object[]{'\\'});
            return a10;
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i b = cVar.b();
        b.h();
        char l10 = b.l();
        if (l10 == '\n') {
            b.h();
            return qn.g.b(new on.i(), b.o());
        }
        if (!f24632a.matcher(String.valueOf(l10)).matches()) {
            return qn.g.b(new b0("\\"), b.o());
        }
        b.h();
        return qn.g.b(new b0(String.valueOf(l10)), b.o());
    }
}
