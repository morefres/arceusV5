package ln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ln.b0;
import ln.c;
import ln.l;
import ln.m;
import ln.n;
import ln.p;
import ln.x;
import on.c0;

/* loaded from: classes3.dex */
public class k implements rn.h {

    /* renamed from: v, reason: collision with root package name */
    public static final Set<Class<? extends on.a>> f23577v;

    /* renamed from: w, reason: collision with root package name */
    public static final Map<Class<? extends on.a>, rn.e> f23578w;

    /* renamed from: a, reason: collision with root package name */
    public pn.i f23579a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23582e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23586i;

    /* renamed from: j, reason: collision with root package name */
    public final List<rn.e> f23587j;

    /* renamed from: k, reason: collision with root package name */
    public final pn.d f23588k;

    /* renamed from: l, reason: collision with root package name */
    public final List<qn.b> f23589l;

    /* renamed from: m, reason: collision with root package name */
    public final List<sn.a> f23590m;

    /* renamed from: n, reason: collision with root package name */
    public final List<qn.e> f23591n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<Character> f23592o;

    /* renamed from: p, reason: collision with root package name */
    public final pn.a f23593p;

    /* renamed from: q, reason: collision with root package name */
    public final int f23594q;

    /* renamed from: r, reason: collision with root package name */
    public final h f23595r;
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f23580c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f23581d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f23583f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f23584g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f23585h = 0;

    /* renamed from: s, reason: collision with root package name */
    public final f f23596s = new f();

    /* renamed from: t, reason: collision with root package name */
    public final List<b> f23597t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final List<rn.d> f23598u = new ArrayList();

    public static class a implements rn.g {

        /* renamed from: a, reason: collision with root package name */
        public final rn.d f23599a;

        public a(rn.d dVar) {
            this.f23599a = dVar;
        }

        @Override // rn.g
        public rn.d a() {
            return this.f23599a;
        }

        @Override // rn.g
        public pn.j b() {
            rn.d dVar = this.f23599a;
            return dVar instanceof z ? ((z) dVar).k() : pn.j.b();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final rn.d f23600a;
        public int b;

        public b(rn.d dVar, int i10) {
            this.f23600a = dVar;
            this.b = i10;
        }
    }

    static {
        List a10;
        a10 = j.a(new Object[]{on.b.class, on.j.class, on.h.class, on.k.class, c0.class, on.q.class, on.n.class});
        f23577v = new LinkedHashSet(a10);
        HashMap hashMap = new HashMap();
        hashMap.put(on.b.class, new c.a());
        hashMap.put(on.j.class, new m.a());
        hashMap.put(on.h.class, new l.a());
        hashMap.put(on.k.class, new n.a());
        hashMap.put(c0.class, new b0.a());
        hashMap.put(on.q.class, new x.a());
        hashMap.put(on.n.class, new p.a());
        f23578w = Collections.unmodifiableMap(hashMap);
    }

    public k(List<rn.e> list, pn.d dVar, List<qn.b> list2, List<sn.a> list3, List<qn.e> list4, Set<Character> set, pn.a aVar, int i10) {
        this.f23587j = list;
        this.f23588k = dVar;
        this.f23589l = list2;
        this.f23590m = list3;
        this.f23591n = list4;
        this.f23592o = set;
        this.f23593p = aVar;
        this.f23594q = i10;
        h hVar = new h();
        this.f23595r = hVar;
        g(new b(hVar, 0));
    }

    public static List<rn.e> m(List<rn.e> list, Set<Class<? extends on.a>> set) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<Class<? extends on.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f23578w.get(it.next()));
        }
        return arrayList;
    }

    public static Set<Class<? extends on.a>> t() {
        return f23577v;
    }

    public static String x(String str) {
        return str.indexOf(0) == -1 ? str : str.replace((char) 0, (char) 65533);
    }

    public final void A(String str, int i10) {
        this.b++;
        this.f23580c = 0;
        this.f23581d = 0;
        this.f23582e = false;
        String x10 = x(str);
        this.f23579a = pn.i.c(x10, this.f23593p != pn.a.NONE ? on.y.e(this.b, 0, i10, x10.length()) : null);
    }

    public final void B(int i10) {
        int i11;
        int i12 = this.f23584g;
        if (i10 >= i12) {
            this.f23580c = this.f23583f;
            this.f23581d = i12;
        }
        int length = this.f23579a.a().length();
        while (true) {
            i11 = this.f23581d;
            if (i11 >= i10 || this.f23580c == length) {
                break;
            } else {
                l();
            }
        }
        if (i11 <= i10) {
            this.f23582e = false;
            return;
        }
        this.f23580c--;
        this.f23581d = i10;
        this.f23582e = true;
    }

    public final void C(int i10) {
        int i11 = this.f23583f;
        if (i10 >= i11) {
            this.f23580c = i11;
            this.f23581d = this.f23584g;
        }
        int length = this.f23579a.a().length();
        while (true) {
            int i12 = this.f23580c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                l();
            }
        }
        this.f23582e = false;
    }

    @Override // rn.h
    public boolean a() {
        return this.f23586i;
    }

    @Override // rn.h
    public pn.i b() {
        return this.f23579a;
    }

    @Override // rn.h
    public int c() {
        return this.f23581d;
    }

    @Override // rn.h
    public int d() {
        return this.f23585h;
    }

    @Override // rn.h
    public int e() {
        return this.f23583f;
    }

    @Override // rn.h
    public rn.d f() {
        return this.f23597t.get(r0.size() - 1).f23600a;
    }

    public final void g(b bVar) {
        this.f23597t.add(bVar);
    }

    @Override // rn.h
    public int getIndex() {
        return this.f23580c;
    }

    public final void h(b bVar) {
        while (!f().f(bVar.f23600a.g())) {
            n(1);
        }
        f().g().c(bVar.f23600a.g());
        g(bVar);
    }

    public final void i(rn.d dVar) {
        Iterator<on.e<?>> it = dVar.i().iterator();
        while (it.hasNext()) {
            this.f23596s.a(it.next());
        }
    }

    public final void j() {
        CharSequence a10;
        if (this.f23582e) {
            CharSequence subSequence = this.f23579a.a().subSequence(this.f23580c + 1, this.f23579a.a().length());
            int a11 = nn.f.a(this.f23581d);
            StringBuilder sb2 = new StringBuilder(subSequence.length() + a11);
            for (int i10 = 0; i10 < a11; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence);
            a10 = sb2.toString();
        } else {
            a10 = this.f23580c == 0 ? this.f23579a.a() : this.f23579a.a().subSequence(this.f23580c, this.f23579a.a().length());
        }
        f().a(pn.i.c(a10, (this.f23593p != pn.a.BLOCKS_AND_INLINES || this.f23580c >= this.f23579a.b().c()) ? null : this.f23579a.b().f(this.f23580c)));
        k();
    }

    public final void k() {
        if (this.f23593p != pn.a.NONE) {
            for (int i10 = 1; i10 < this.f23597t.size(); i10++) {
                b bVar = this.f23597t.get(i10);
                int min = Math.min(bVar.b, this.f23580c);
                if (this.f23579a.a().length() - min != 0) {
                    bVar.f23600a.d(this.f23579a.b().f(min));
                }
            }
        }
    }

    public final void l() {
        char charAt = this.f23579a.a().charAt(this.f23580c);
        this.f23580c++;
        if (charAt != '\t') {
            this.f23581d++;
        } else {
            int i10 = this.f23581d;
            this.f23581d = i10 + nn.f.a(i10);
        }
    }

    public final void n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            rn.d dVar = o().f23600a;
            p(dVar);
            this.f23598u.add(dVar);
        }
    }

    public final b o() {
        return this.f23597t.remove(r0.size() - 1);
    }

    public final void p(rn.d dVar) {
        i(dVar);
        dVar.h();
    }

    public final on.f q() {
        n(this.f23597t.size());
        y();
        return this.f23595r.g();
    }

    public final d r(rn.d dVar) {
        if (this.f23597t.size() > this.f23594q) {
            return null;
        }
        a aVar = new a(dVar);
        Iterator<rn.e> it = this.f23587j.iterator();
        while (it.hasNext()) {
            rn.f a10 = it.next().a(this, aVar);
            if (a10 instanceof d) {
                return (d) a10;
            }
        }
        return null;
    }

    public final void s() {
        int i10 = this.f23580c;
        int i11 = this.f23581d;
        this.f23586i = true;
        int length = this.f23579a.a().length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f23579a.a().charAt(i10);
            if (charAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (charAt != ' ') {
                this.f23586i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f23583f = i10;
        this.f23584g = i11;
        this.f23585h = i11 - this.f23581d;
    }

    public on.f u(String str) {
        int i10 = 0;
        while (true) {
            int b10 = tn.d.b(str, i10);
            if (b10 == -1) {
                break;
            }
            v(str.substring(i10, b10), i10);
            i10 = b10 + 1;
            if (i10 < str.length() && str.charAt(b10) == '\r' && str.charAt(i10) == '\n') {
                i10 = b10 + 2;
            }
        }
        if (!str.isEmpty() && (i10 == 0 || i10 < str.length())) {
            v(str.substring(i10), i10);
        }
        return q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x013c, code lost:
    
        C(r10.f23583f);
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.k.v(java.lang.String, int):void");
    }

    public final List<on.y> w(rn.d dVar) {
        o();
        dVar.h();
        dVar.g().n();
        return dVar.g().h();
    }

    public final void y() {
        pn.b a10 = this.f23588k.a(new q(this.f23589l, this.f23590m, this.f23591n, this.f23592o, this.f23596s));
        Iterator<rn.d> it = this.f23598u.iterator();
        while (it.hasNext()) {
            it.next().c(a10);
        }
    }

    public final List<on.y> z(int i10, z zVar) {
        List<on.y> l10 = zVar.l(i10);
        n(1);
        return l10;
    }
}
