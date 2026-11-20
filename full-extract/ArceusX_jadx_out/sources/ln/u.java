package ln;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import mn.d;
import mn.e;
import mn.f;
import mn.i;
import mn.j;
import mn.k;

/* loaded from: classes3.dex */
public class u implements pn.b, qn.c {

    /* renamed from: a, reason: collision with root package name */
    public final pn.c f23615a;
    public final List<qn.b> b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Character, sn.a> f23616c;

    /* renamed from: d, reason: collision with root package name */
    public final List<qn.e> f23617d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f23618e;

    /* renamed from: f, reason: collision with root package name */
    public final BitSet f23619f;

    /* renamed from: g, reason: collision with root package name */
    public Map<Character, List<qn.a>> f23620g;

    /* renamed from: h, reason: collision with root package name */
    public qn.i f23621h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23622i;

    /* renamed from: j, reason: collision with root package name */
    public int f23623j;

    /* renamed from: k, reason: collision with root package name */
    public g f23624k;

    /* renamed from: l, reason: collision with root package name */
    public e f23625l;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23626a;

        static {
            int[] iArr = new int[k.a.values().length];
            f23626a = iArr;
            try {
                iArr[k.a.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23626a[k.a.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<on.b0> f23627a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23628c;

        public b(List<on.b0> list, boolean z10, boolean z11) {
            this.f23627a = list;
            this.f23628c = z10;
            this.b = z11;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f23629a;
        public final String b;

        public c(String str, String str2) {
            this.f23629a = str;
            this.b = str2;
        }
    }

    public static class d implements qn.d {

        /* renamed from: a, reason: collision with root package name */
        public final on.b0 f23630a;
        public final on.b0 b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23631c;

        /* renamed from: d, reason: collision with root package name */
        public final String f23632d;

        /* renamed from: e, reason: collision with root package name */
        public final String f23633e;

        /* renamed from: f, reason: collision with root package name */
        public final String f23634f;

        /* renamed from: g, reason: collision with root package name */
        public final qn.h f23635g;

        @Override // qn.d
        public on.b0 a() {
            return this.f23630a;
        }

        @Override // qn.d
        public String b() {
            return this.f23634f;
        }

        @Override // qn.d
        public String c() {
            return this.f23632d;
        }

        @Override // qn.d
        public String d() {
            return this.f23631c;
        }

        @Override // qn.d
        public String e() {
            return this.f23633e;
        }

        public d(on.b0 b0Var, on.b0 b0Var2, String str, String str2, String str3, String str4, qn.h hVar) {
            this.f23630a = b0Var;
            this.b = b0Var2;
            this.f23631c = str;
            this.f23632d = str2;
            this.f23633e = str3;
            this.f23634f = str4;
            this.f23635g = hVar;
        }
    }

    public u(pn.c cVar) {
        this.f23615a = cVar;
        List<qn.b> h10 = h(cVar.e());
        this.b = h10;
        Map<Character, sn.a> g10 = g(cVar.c());
        this.f23616c = g10;
        this.f23617d = j(cVar.b());
        BitSet i10 = i(cVar.d());
        this.f23619f = i10;
        this.f23618e = k(i10, g10.keySet(), h10);
    }

    public static String A(qn.i iVar) {
        qn.h o8 = iVar.o();
        if (!nn.e.e(iVar)) {
            return null;
        }
        String c10 = iVar.d(o8, iVar.o()).c();
        return nn.c.e(c10.substring(1, c10.length() - 1));
    }

    public static /* synthetic */ List c(Character ch2) {
        return new ArrayList();
    }

    public static void e(char c10, sn.a aVar, Map<Character, sn.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void f(Iterable<sn.a> iterable, Map<Character, sn.a> map) {
        a0 a0Var;
        for (sn.a aVar : iterable) {
            char c10 = aVar.c();
            char a10 = aVar.a();
            if (c10 == a10) {
                sn.a aVar2 = map.get(Character.valueOf(c10));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    e(c10, aVar, map);
                } else {
                    if (aVar2 instanceof a0) {
                        a0Var = (a0) aVar2;
                    } else {
                        a0 a0Var2 = new a0(c10);
                        a0Var2.e(aVar2);
                        a0Var = a0Var2;
                    }
                    a0Var.e(aVar);
                    map.put(Character.valueOf(c10), a0Var);
                }
            } else {
                e(c10, aVar, map);
                e(a10, aVar, map);
            }
        }
    }

    public static Map<Character, sn.a> g(List<sn.a> list) {
        List a10;
        HashMap hashMap = new HashMap();
        a10 = j.a(new Object[]{new mn.a(), new mn.m()});
        f(a10, hashMap);
        f(list, hashMap);
        return hashMap;
    }

    public static BitSet i(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        bitSet.set(33);
        return bitSet;
    }

    public static BitSet k(BitSet bitSet, Set<Character> set, List<qn.b> list) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet2.set(it.next().charValue());
        }
        Iterator<qn.b> it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator<Character> it3 = it2.next().b().iterator();
            while (it3.hasNext()) {
                bitSet2.set(it3.next().charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        return bitSet2;
    }

    public static c t(qn.i iVar) {
        String str;
        if (!iVar.i('(')) {
            return null;
        }
        iVar.r();
        String v5 = v(iVar);
        if (v5 == null) {
            return null;
        }
        if (iVar.r() >= 1) {
            str = A(iVar);
            iVar.r();
        } else {
            str = null;
        }
        if (iVar.i(')')) {
            return new c(v5, str);
        }
        return null;
    }

    public static String v(qn.i iVar) {
        String c10;
        char l10 = iVar.l();
        qn.h o8 = iVar.o();
        if (!nn.e.b(iVar)) {
            return null;
        }
        if (l10 == '<') {
            String c11 = iVar.d(o8, iVar.o()).c();
            c10 = c11.substring(1, c11.length() - 1);
        } else {
            c10 = iVar.d(o8, iVar.o()).c();
        }
        return nn.c.e(c10);
    }

    public static String x(qn.i iVar) {
        if (!iVar.i('[')) {
            return null;
        }
        qn.h o8 = iVar.o();
        if (!nn.e.d(iVar)) {
            return null;
        }
        qn.h o10 = iVar.o();
        if (!iVar.i(']')) {
            return null;
        }
        String c10 = iVar.d(o8, o10).c();
        if (c10.length() > 999) {
            return null;
        }
        return c10;
    }

    public final on.s B() {
        qn.h o8 = this.f23621h.o();
        this.f23621h.h();
        qn.h o10 = this.f23621h.o();
        on.b0 M = M(this.f23621h.d(o8, o10));
        d(e.a(M, o8, o10, this.f23625l, this.f23624k));
        return M;
    }

    public final on.s C() {
        char l10;
        qn.h o8 = this.f23621h.o();
        this.f23621h.h();
        while (true) {
            l10 = this.f23621h.l();
            if (l10 == 0 || this.f23618e.get(l10)) {
                break;
            }
            this.f23621h.h();
        }
        qn.i iVar = this.f23621h;
        pn.j d10 = iVar.d(o8, iVar.o());
        String c10 = d10.c();
        if (l10 == '\n') {
            int j10 = tn.d.j(' ', c10, c10.length() - 1, 0) + 1;
            this.f23623j = c10.length() - j10;
            c10 = c10.substring(0, j10);
        } else if (l10 == 0) {
            c10 = c10.substring(0, tn.d.l(c10, c10.length() - 1, 0) + 1);
        }
        on.b0 b0Var = new on.b0(c10);
        b0Var.l(d10.e());
        return b0Var;
    }

    public final void D(g gVar) {
        boolean z10;
        HashMap hashMap = new HashMap();
        g gVar2 = this.f23624k;
        while (gVar2 != null) {
            g gVar3 = gVar2.f23574f;
            if (gVar3 == gVar) {
                break;
            } else {
                gVar2 = gVar3;
            }
        }
        while (gVar2 != null) {
            char c10 = gVar2.b;
            sn.a aVar = this.f23616c.get(Character.valueOf(c10));
            if (!gVar2.c() || aVar == null) {
                gVar2 = gVar2.f23575g;
            } else {
                char c11 = aVar.c();
                g gVar4 = gVar2.f23574f;
                int i10 = 0;
                boolean z11 = false;
                while (gVar4 != null && gVar4 != gVar && gVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (gVar4.g() && gVar4.b == c11) {
                        i10 = aVar.d(gVar4, gVar2);
                        if (i10 > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    gVar4 = gVar4.f23574f;
                }
                z10 = false;
                if (z10) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        List<on.b0> list = gVar4.f23570a;
                        list.remove(list.size() - 1).n();
                    }
                    for (int i12 = 0; i12 < i10; i12++) {
                        gVar2.f23570a.remove(0).n();
                    }
                    H(gVar4, gVar2);
                    if (gVar4.length() == 0) {
                        F(gVar4);
                    }
                    if (gVar2.length() == 0) {
                        g gVar5 = gVar2.f23575g;
                        F(gVar2);
                        gVar2 = gVar5;
                    }
                } else {
                    if (!z11) {
                        hashMap.put(Character.valueOf(c10), gVar2.f23574f);
                        if (!gVar2.g()) {
                            G(gVar2);
                        }
                    }
                    gVar2 = gVar2.f23575g;
                }
            }
        }
        while (true) {
            g gVar6 = this.f23624k;
            if (gVar6 == null || gVar6 == gVar) {
                return;
            } else {
                G(gVar6);
            }
        }
    }

    public final void E(g gVar) {
        g gVar2 = gVar.f23574f;
        if (gVar2 != null) {
            gVar2.f23575g = gVar.f23575g;
        }
        g gVar3 = gVar.f23575g;
        if (gVar3 == null) {
            this.f23624k = gVar2;
        } else {
            gVar3.f23574f = gVar2;
        }
    }

    public final void F(g gVar) {
        E(gVar);
    }

    public final void G(g gVar) {
        E(gVar);
    }

    public final void H(g gVar, g gVar2) {
        g gVar3 = gVar2.f23574f;
        while (gVar3 != null && gVar3 != gVar) {
            g gVar4 = gVar3.f23574f;
            G(gVar3);
            gVar3 = gVar4;
        }
    }

    public final void I() {
        this.f23625l = this.f23625l.f23565f;
    }

    public final on.s J(e eVar, on.s sVar, boolean z10) {
        on.b0 b0Var;
        qn.h hVar;
        while (true) {
            g gVar = this.f23624k;
            if (gVar == null || gVar == eVar.f23566g) {
                break;
            }
            G(gVar);
        }
        if (this.f23622i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f23563d;
            }
            qn.i iVar = this.f23621h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        I();
        if (!z10 || (b0Var = eVar.f23561a) == null) {
            b0Var = eVar.f23562c;
        }
        while (b0Var != null) {
            on.s f10 = b0Var.f();
            b0Var.n();
            b0Var = f10;
        }
        if (eVar.f23561a != null && z10) {
            return sVar;
        }
        m();
        return sVar;
    }

    public void K(pn.j jVar) {
        this.f23621h = qn.i.k(jVar);
        this.f23622i = !jVar.e().isEmpty();
        this.f23623j = 0;
        this.f23624k = null;
        this.f23625l = null;
        this.f23620g = l();
    }

    public final b L(sn.a aVar, char c10) {
        boolean z10;
        int n10 = this.f23621h.n();
        qn.h o8 = this.f23621h.o();
        if (this.f23621h.g(c10) < aVar.b()) {
            this.f23621h.q(o8);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f23621h.q(o8);
        while (this.f23621h.i(c10)) {
            qn.i iVar = this.f23621h;
            arrayList.add(M(iVar.d(o8, iVar.o())));
            o8 = this.f23621h.o();
        }
        int m10 = this.f23621h.m();
        boolean z11 = n10 == 0 || tn.d.f(n10);
        boolean z12 = n10 == 0 || tn.d.h(n10);
        boolean z13 = m10 == 0 || tn.d.f(m10);
        boolean z14 = m10 == 0 || tn.d.h(m10);
        boolean z15 = !z14 && (!z13 || z12 || z11);
        boolean z16 = !z12 && (!z11 || z14 || z13);
        if (c10 == '_') {
            z10 = z15 && (!z16 || z11);
            if (!z16 || (z15 && !z13)) {
                r3 = false;
            }
        } else {
            boolean z17 = z15 && c10 == aVar.c();
            r3 = z16 && c10 == aVar.a();
            z10 = z17;
        }
        return new b(arrayList, z10, r3);
    }

    public final on.b0 M(pn.j jVar) {
        on.b0 b0Var = new on.b0(jVar.c());
        b0Var.l(jVar.e());
        return b0Var;
    }

    public final on.s N(e eVar, on.s sVar, boolean z10) {
        on.b0 b0Var;
        qn.h hVar;
        on.s f10 = eVar.f23562c.f();
        while (f10 != null) {
            on.s f11 = f10.f();
            sVar.c(f10);
            f10 = f11;
        }
        if (this.f23622i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f23563d;
            }
            qn.i iVar = this.f23621h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        D(eVar.f23566g);
        n(sVar);
        if (z10 && (b0Var = eVar.f23561a) != null) {
            b0Var.n();
        }
        eVar.f23562c.n();
        I();
        if (eVar.f23561a == null) {
            m();
        }
        return sVar;
    }

    @Override // pn.b
    public void a(pn.j jVar, on.s sVar) {
        K(jVar);
        while (true) {
            List<? extends on.s> s8 = s();
            if (s8 == null) {
                D(null);
                n(sVar);
                return;
            } else {
                Iterator<? extends on.s> it = s8.iterator();
                while (it.hasNext()) {
                    sVar.c(it.next());
                }
            }
        }
    }

    @Override // qn.c
    public qn.i b() {
        return this.f23621h;
    }

    public final void d(e eVar) {
        e eVar2 = this.f23625l;
        if (eVar2 != null) {
            eVar2.f23568i = true;
        }
        this.f23625l = eVar;
    }

    public final List<qn.b> h(List<qn.b> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new e.a());
        arrayList.add(new f.a());
        arrayList.add(new i.a());
        arrayList.add(new d.a());
        arrayList.add(new j.a());
        return arrayList;
    }

    public final List<qn.e> j(List<qn.e> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new mn.g());
        return arrayList;
    }

    public final Map<Character, List<qn.a>> l() {
        HashMap hashMap = new HashMap();
        for (qn.b bVar : this.b) {
            qn.a a10 = bVar.a();
            Iterator<Character> it = bVar.b().iterator();
            while (it.hasNext()) {
                ((List) hashMap.computeIfAbsent(it.next(), new Function() { // from class: ln.t
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return u.c((Character) obj);
                    }
                })).add(a10);
            }
        }
        return hashMap;
    }

    public final void m() {
        for (e eVar = this.f23625l; eVar != null; eVar = eVar.f23565f) {
            if (eVar.f23561a == null) {
                eVar.f23567h = false;
            }
        }
    }

    public final void n(on.s sVar) {
        if (sVar.d() == null) {
            return;
        }
        p(sVar.d(), sVar.e());
    }

    public final void o(on.b0 b0Var, on.b0 b0Var2, int i10) {
        on.z zVar;
        if (b0Var == null || b0Var2 == null || b0Var == b0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(b0Var.o());
        if (this.f23622i) {
            zVar = new on.z();
            zVar.a(b0Var.h());
        } else {
            zVar = null;
        }
        on.s f10 = b0Var.f();
        on.s f11 = b0Var2.f();
        while (f10 != f11) {
            sb2.append(((on.b0) f10).o());
            if (zVar != null) {
                zVar.a(f10.h());
            }
            on.s f12 = f10.f();
            f10.n();
            f10 = f12;
        }
        b0Var.p(sb2.toString());
        if (zVar != null) {
            b0Var.l(zVar.d());
        }
    }

    public final void p(on.s sVar, on.s sVar2) {
        on.b0 b0Var = null;
        on.b0 b0Var2 = null;
        int i10 = 0;
        while (sVar != null) {
            if (sVar instanceof on.b0) {
                b0Var2 = (on.b0) sVar;
                if (b0Var == null) {
                    b0Var = b0Var2;
                }
                i10 += b0Var2.o().length();
            } else {
                o(b0Var, b0Var2, i10);
                n(sVar);
                b0Var = null;
                b0Var2 = null;
                i10 = 0;
            }
            if (sVar == sVar2) {
                break;
            } else {
                sVar = sVar.f();
            }
        }
        o(b0Var, b0Var2, i10);
    }

    public final on.s q() {
        qn.h o8 = this.f23621h.o();
        this.f23621h.h();
        qn.h o10 = this.f23621h.o();
        e eVar = this.f23625l;
        if (eVar == null) {
            return M(this.f23621h.d(o8, o10));
        }
        if (!eVar.f23567h) {
            I();
            return M(this.f23621h.d(o8, o10));
        }
        on.s z10 = z(eVar, o8);
        if (z10 != null) {
            return z10;
        }
        this.f23621h.q(o10);
        I();
        return M(this.f23621h.d(o8, o10));
    }

    public final List<? extends on.s> r(sn.a aVar, char c10) {
        b L = L(aVar, c10);
        if (L == null) {
            return null;
        }
        List<on.b0> list = L.f23627a;
        g gVar = new g(list, c10, L.f23628c, L.b, this.f23624k);
        this.f23624k = gVar;
        g gVar2 = gVar.f23574f;
        if (gVar2 != null) {
            gVar2.f23575g = gVar;
        }
        return list;
    }

    public final List<? extends on.s> s() {
        List<? extends on.s> a10;
        List<? extends on.s> a11;
        List<? extends on.s> a12;
        List<? extends on.s> a13;
        List<? extends on.s> r8;
        List<? extends on.s> a14;
        List<? extends on.s> a15;
        char l10 = this.f23621h.l();
        if (l10 == 0) {
            return null;
        }
        if (l10 == '\n') {
            a10 = j.a(new Object[]{u()});
            return a10;
        }
        if (l10 == '[') {
            a11 = j.a(new Object[]{B()});
            return a11;
        }
        if (l10 == ']') {
            a12 = j.a(new Object[]{q()});
            return a12;
        }
        if (this.f23619f.get(l10)) {
            qn.h o8 = this.f23621h.o();
            List<? extends on.s> y10 = y();
            if (y10 != null) {
                return y10;
            }
            this.f23621h.q(o8);
        }
        if (!this.f23618e.get(l10)) {
            a15 = j.a(new Object[]{C()});
            return a15;
        }
        List<qn.a> list = this.f23620g.get(Character.valueOf(l10));
        if (list != null) {
            qn.h o10 = this.f23621h.o();
            Iterator<qn.a> it = list.iterator();
            while (it.hasNext()) {
                qn.g a16 = it.next().a(this);
                if (a16 instanceof mn.l) {
                    mn.l lVar = (mn.l) a16;
                    on.s c10 = lVar.c();
                    this.f23621h.q(lVar.d());
                    if (this.f23622i && c10.h().isEmpty()) {
                        qn.i iVar = this.f23621h;
                        c10.l(iVar.d(o10, iVar.o()).e());
                    }
                    a14 = j.a(new Object[]{c10});
                    return a14;
                }
                this.f23621h.q(o10);
            }
        }
        sn.a aVar = this.f23616c.get(Character.valueOf(l10));
        if (aVar != null && (r8 = r(aVar, l10)) != null) {
            return r8;
        }
        a13 = j.a(new Object[]{C()});
        return a13;
    }

    public final on.s u() {
        this.f23621h.h();
        boolean z10 = this.f23623j >= 2;
        this.f23623j = 0;
        return z10 ? new on.i() : new on.x();
    }

    public final qn.d w(e eVar, qn.h hVar) {
        qn.h o8 = this.f23621h.o();
        c t8 = t(this.f23621h);
        if (t8 != null) {
            return new d(eVar.f23561a, eVar.f23562c, this.f23621h.d(eVar.f23564e, hVar).c(), null, t8.f23629a, t8.b, o8);
        }
        this.f23621h.q(o8);
        String x10 = x(this.f23621h);
        if (x10 == null) {
            this.f23621h.q(o8);
        }
        boolean z10 = x10 == null || x10.isEmpty();
        if (eVar.f23568i && z10 && eVar.f23561a == null) {
            return null;
        }
        return new d(eVar.f23561a, eVar.f23562c, this.f23621h.d(eVar.f23564e, hVar).c(), x10, null, null, o8);
    }

    public final List<? extends on.s> y() {
        List<? extends on.s> a10;
        qn.h o8 = this.f23621h.o();
        this.f23621h.h();
        qn.h o10 = this.f23621h.o();
        if (!this.f23621h.i('[')) {
            return null;
        }
        qn.h o11 = this.f23621h.o();
        on.b0 M = M(this.f23621h.d(o8, o10));
        on.b0 M2 = M(this.f23621h.d(o10, o11));
        d(e.b(M, o8, M2, o10, o11, this.f23625l, this.f23624k));
        a10 = j.a(new Object[]{M, M2});
        return a10;
    }

    public final on.s z(e eVar, qn.h hVar) {
        qn.d w5 = w(eVar, hVar);
        if (w5 == null) {
            return null;
        }
        qn.h o8 = this.f23621h.o();
        Iterator<qn.e> it = this.f23617d.iterator();
        while (it.hasNext()) {
            qn.f a10 = it.next().a(w5, this.f23621h, this.f23615a);
            if (a10 instanceof mn.k) {
                mn.k kVar = (mn.k) a10;
                on.s d10 = kVar.d();
                qn.h e10 = kVar.e();
                boolean g10 = kVar.g();
                int i10 = a.f23626a[kVar.f().ordinal()];
                if (i10 == 1) {
                    this.f23621h.q(e10);
                    return N(eVar, d10, g10);
                }
                if (i10 == 2) {
                    this.f23621h.q(e10);
                    return J(eVar, d10, g10);
                }
            } else {
                this.f23621h.q(o8);
            }
        }
        return null;
    }
}
