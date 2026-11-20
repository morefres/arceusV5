package pn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ln.k;
import ln.q;
import ln.u;
import on.s;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<rn.e> f28696a;
    public final List<qn.b> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<sn.a> f28697c;

    /* renamed from: d, reason: collision with root package name */
    public final List<qn.e> f28698d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<Character> f28699e;

    /* renamed from: f, reason: collision with root package name */
    public final d f28700f;

    /* renamed from: g, reason: collision with root package name */
    public final List<h> f28701g;

    /* renamed from: h, reason: collision with root package name */
    public final pn.a f28702h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28703i;

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        public d f28710h;

        /* renamed from: a, reason: collision with root package name */
        public final List<rn.e> f28704a = new ArrayList();
        public final List<qn.b> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List<sn.a> f28705c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List<qn.e> f28706d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final List<h> f28707e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final Set<Character> f28708f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        public Set<Class<? extends on.a>> f28709g = k.t();

        /* renamed from: i, reason: collision with root package name */
        public pn.a f28711i = pn.a.NONE;

        /* renamed from: j, reason: collision with root package name */
        public int f28712j = Integer.MAX_VALUE;

        public f k() {
            return new f(this);
        }

        public final d l() {
            d dVar = this.f28710h;
            return dVar != null ? dVar : new d() { // from class: pn.e
                @Override // pn.d
                public final b a(c cVar) {
                    return new u(cVar);
                }
            };
        }
    }

    public final k a() {
        return new k(this.f28696a, this.f28700f, this.b, this.f28697c, this.f28698d, this.f28699e, this.f28702h, this.f28703i);
    }

    public s b(String str) {
        Objects.requireNonNull(str, "input must not be null");
        return c(a().u(str));
    }

    public final s c(s sVar) {
        Iterator<h> it = this.f28701g.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public f(a aVar) {
        this.f28696a = k.m(aVar.f28704a, aVar.f28709g);
        d l10 = aVar.l();
        this.f28700f = l10;
        this.f28701g = aVar.f28707e;
        List<qn.b> list = aVar.b;
        this.b = list;
        List<sn.a> list2 = aVar.f28705c;
        this.f28697c = list2;
        List<qn.e> list3 = aVar.f28706d;
        this.f28698d = list3;
        Set<Character> set = aVar.f28708f;
        this.f28699e = set;
        this.f28702h = aVar.f28711i;
        this.f28703i = aVar.f28712j;
        l10.a(new q(list, list2, list3, set, new ln.f()));
    }
}
