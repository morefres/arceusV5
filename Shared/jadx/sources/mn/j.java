package mn;

import java.util.Set;

/* loaded from: classes3.dex */
public class j implements qn.a {

    /* renamed from: a, reason: collision with root package name */
    public static final tn.a f24637a;
    public static final tn.a b;

    /* renamed from: c, reason: collision with root package name */
    public static final tn.a f24638c;

    /* renamed from: d, reason: collision with root package name */
    public static final tn.a f24639d;

    /* renamed from: e, reason: collision with root package name */
    public static final tn.a f24640e;

    /* renamed from: f, reason: collision with root package name */
    public static final tn.a f24641f;

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new j();
        }

        @Override // qn.b
        public Set<Character> b() {
            Set<Character> a10;
            a10 = c.a(new Object[]{'<'});
            return a10;
        }
    }

    static {
        tn.a b10 = tn.a.b().d('A', 'Z').d('a', 'z').b();
        f24637a = b10;
        b = b10;
        f24638c = b10.c().d('0', '9').c('-').b();
        tn.a b11 = b10.c().c('_').c(':').b();
        f24639d = b11;
        f24640e = b11.c().d('0', '9').c('.').c('-').b();
        f24641f = tn.a.b().c(' ').c('\t').c('\n').c((char) 11).c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').b();
    }

    public static qn.g b(qn.h hVar, qn.i iVar) {
        String c10 = iVar.d(hVar, iVar.o()).c();
        on.l lVar = new on.l();
        lVar.o(c10);
        return qn.g.b(lVar, iVar.o());
    }

    public static boolean c(qn.i iVar) {
        iVar.h();
        if (!iVar.j("CDATA[")) {
            return false;
        }
        while (iVar.b(']') >= 0) {
            if (iVar.j("]]>")) {
                return true;
            }
            iVar.h();
        }
        return false;
    }

    public static boolean d(qn.i iVar) {
        iVar.h();
        if (iVar.f(b) < 1) {
            return false;
        }
        iVar.f(f24638c);
        iVar.r();
        return iVar.i('>');
    }

    public static boolean e(qn.i iVar) {
        iVar.h();
        if (!iVar.i('-')) {
            return false;
        }
        if (iVar.i('>') || iVar.j("->")) {
            return true;
        }
        while (iVar.b('-') >= 0) {
            if (iVar.j("-->")) {
                return true;
            }
            iVar.h();
        }
        return false;
    }

    public static boolean f(qn.i iVar) {
        iVar.f(f24637a);
        if (iVar.r() <= 0 || iVar.b('>') < 0) {
            return false;
        }
        iVar.h();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r4.i('=') == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r4.r();
        r0 = r4.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0 != '\'') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r4.b('\'') >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r4.r() < 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r0 != '\"') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r4.r() >= 1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r4.b('\"') >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r4.c(mn.j.f24641f) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        r4.i('/');
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        return r4.i('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4.f(mn.j.f24639d) < 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r4.f(mn.j.f24640e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r4.r() < 1) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:3:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(qn.i r4) {
        /*
            r4.h()
            tn.a r0 = mn.j.f24638c
            r4.f(r0)
            int r0 = r4.r()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L12
        L10:
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L6e
            tn.a r0 = mn.j.f24639d
            int r0 = r4.f(r0)
            if (r0 < r2) goto L6e
            tn.a r0 = mn.j.f24640e
            r4.f(r0)
            int r0 = r4.r()
            if (r0 < r2) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r3 = 61
            boolean r3 = r4.i(r3)
            if (r3 == 0) goto L13
            r4.r()
            char r0 = r4.l()
            r3 = 39
            if (r0 != r3) goto L4c
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L48
            return r1
        L48:
            r4.h()
            goto L67
        L4c:
            r3 = 34
            if (r0 != r3) goto L5e
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L5a
            return r1
        L5a:
            r4.h()
            goto L67
        L5e:
            tn.a r0 = mn.j.f24641f
            int r0 = r4.c(r0)
            if (r0 > 0) goto L67
            return r1
        L67:
            int r0 = r4.r()
            if (r0 < r2) goto L12
            goto L10
        L6e:
            r0 = 47
            r4.i(r0)
            r0 = 62
            boolean r4 = r4.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.j.g(qn.i):boolean");
    }

    public static boolean h(qn.i iVar) {
        iVar.h();
        while (iVar.b('?') > 0) {
            iVar.h();
            if (iVar.i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i b10 = cVar.b();
        qn.h o8 = b10.o();
        b10.h();
        char l10 = b10.l();
        if (b.a(l10)) {
            if (g(b10)) {
                return b(o8, b10);
            }
        } else if (l10 == '/') {
            if (d(b10)) {
                return b(o8, b10);
            }
        } else if (l10 == '?') {
            if (h(b10)) {
                return b(o8, b10);
            }
        } else if (l10 == '!') {
            b10.h();
            char l11 = b10.l();
            if (l11 == '-') {
                if (e(b10)) {
                    return b(o8, b10);
                }
            } else if (l11 == '[') {
                if (c(b10)) {
                    return b(o8, b10);
                }
            } else if (f24637a.a(l11) && f(b10)) {
                return b(o8, b10);
            }
        }
        return qn.g.a();
    }
}
