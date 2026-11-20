package we;

import af.j0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j0<P> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<ef.a, List<c<P>>> f34240a;
    public final List<c<P>> b;

    /* renamed from: c, reason: collision with root package name */
    public final c<P> f34241c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<P> f34242d;

    /* renamed from: e, reason: collision with root package name */
    public final r f34243e;

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<P> f34244a;
        public Map<ef.a, List<c<P>>> b;

        /* renamed from: c, reason: collision with root package name */
        public final List<c<P>> f34245c;

        /* renamed from: d, reason: collision with root package name */
        public c<P> f34246d;

        /* renamed from: e, reason: collision with root package name */
        public r f34247e;

        public final b<P> a(P p8, pe.l lVar, j0.c cVar, boolean z10) {
            if (this.b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (p8 == null) {
                throw new NullPointerException("`fullPrimitive` must not be null");
            }
            if (cVar.h0() != af.g0.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(p8, ef.a.a(pe.f.a(cVar)), cVar.h0(), cVar.g0(), cVar.f0(), cVar.e0().f0(), lVar);
            j0.j(cVar2, this.b, this.f34245c);
            if (!z10) {
                return this;
            }
            if (this.f34246d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f34246d = cVar2;
            return this;
        }

        public b<P> b(P p8, pe.l lVar, j0.c cVar) {
            return a(p8, lVar, cVar, false);
        }

        public b<P> c(P p8, pe.l lVar, j0.c cVar) {
            return a(p8, lVar, cVar, true);
        }

        public j0<P> d() {
            Map<ef.a, List<c<P>>> map = this.b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            j0<P> j0Var = new j0<>(map, this.f34245c, this.f34246d, this.f34247e, this.f34244a);
            this.b = null;
            return j0Var;
        }

        public b<P> e(r rVar) {
            if (this.b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f34247e = rVar;
            return this;
        }

        public b(Class<P> cls) {
            this.b = new HashMap();
            this.f34245c = new ArrayList();
            this.f34244a = cls;
            this.f34247e = r.b;
        }
    }

    public static final class c<P> {

        /* renamed from: a, reason: collision with root package name */
        public final P f34248a;
        public final ef.a b;

        /* renamed from: c, reason: collision with root package name */
        public final af.g0 f34249c;

        /* renamed from: d, reason: collision with root package name */
        public final af.p0 f34250d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34251e;

        /* renamed from: f, reason: collision with root package name */
        public final String f34252f;

        /* renamed from: g, reason: collision with root package name */
        public final pe.l f34253g;

        public P b() {
            return this.f34248a;
        }

        public int c() {
            return this.f34251e;
        }

        public String d() {
            return this.f34252f;
        }

        public final ef.a e() {
            return this.b;
        }

        public af.p0 f() {
            return this.f34250d;
        }

        public af.g0 g() {
            return this.f34249c;
        }

        public c(P p8, ef.a aVar, af.g0 g0Var, af.p0 p0Var, int i10, String str, pe.l lVar) {
            this.f34248a = p8;
            this.b = aVar;
            this.f34249c = g0Var;
            this.f34250d = p0Var;
            this.f34251e = i10;
            this.f34252f = str;
            this.f34253g = lVar;
        }
    }

    public static <P> b<P> i(Class<P> cls) {
        return new b<>(cls);
    }

    public static <P> void j(c<P> cVar, Map<ef.a, List<c<P>>> map, List<c<P>> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        List<c<P>> put = map.put(cVar.e(), Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar);
            map.put(cVar.e(), Collections.unmodifiableList(arrayList2));
        }
        list.add(cVar);
    }

    public Collection<List<c<P>>> b() {
        return this.f34240a.values();
    }

    public r c() {
        return this.f34243e;
    }

    public c<P> d() {
        return this.f34241c;
    }

    public List<c<P>> e(byte[] bArr) {
        List<c<P>> list = this.f34240a.get(ef.a.a(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class<P> f() {
        return this.f34242d;
    }

    public List<c<P>> g() {
        return e(pe.f.f28591a);
    }

    public boolean h() {
        return !this.f34243e.b().isEmpty();
    }

    public j0(Map<ef.a, List<c<P>>> map, List<c<P>> list, c<P> cVar, r rVar, Class<P> cls) {
        this.f34240a = map;
        this.b = list;
        this.f34241c = cVar;
        this.f34242d = cls;
        this.f34243e = rVar;
    }
}
