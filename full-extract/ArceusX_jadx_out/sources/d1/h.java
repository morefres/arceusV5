package d1;

import android.view.InterfaceC0703r;
import android.view.f0;
import android.view.l;
import android.view.s;
import g0.g2;
import g0.r1;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s0.f;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f14245f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static h f14246g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14247a = new Object();
    public final Map<a, c> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<b, Set<a>> f14248c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<s> f14249d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public h0.a f14250e;

    public static abstract class a {
        public static a a(s sVar, g0.s sVar2) {
            return new d1.a(System.identityHashCode(sVar), sVar2);
        }

        public abstract g0.s b();

        public abstract int c();
    }

    public static class b implements InterfaceC0703r {

        /* renamed from: a, reason: collision with root package name */
        public final h f14251a;
        public final s b;

        public b(s sVar, h hVar) {
            this.b = sVar;
            this.f14251a = hVar;
        }

        public s a() {
            return this.b;
        }

        @f0(l.a.ON_DESTROY)
        public void onDestroy(s sVar) {
            this.f14251a.p(sVar);
        }

        @f0(l.a.ON_START)
        public void onStart(s sVar) {
            this.f14251a.j(sVar);
        }

        @f0(l.a.ON_STOP)
        public void onStop(s sVar) {
            this.f14251a.k(sVar);
        }
    }

    public static h c() {
        h hVar;
        synchronized (f14245f) {
            try {
                if (f14246g == null) {
                    f14246g = new h();
                }
                hVar = f14246g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public void a(c cVar, g2 g2Var, h0.a aVar) {
        synchronized (this.f14247a) {
            try {
                x2.g.a(!g2Var.k().isEmpty());
                this.f14250e = aVar;
                s t8 = cVar.t();
                b e10 = e(t8);
                if (e10 == null) {
                    return;
                }
                Set<a> set = this.f14248c.get(e10);
                h0.a aVar2 = this.f14250e;
                if (aVar2 == null || aVar2.e() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) x2.g.g(this.b.get(it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.u().isEmpty()) {
                            if (cVar2.w() || g2Var.m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.z();
                        }
                    }
                }
                try {
                    cVar.n(g2Var);
                    if (t8.a().getState().b(l.b.f2629d)) {
                        j(t8);
                    }
                } catch (f.a e11) {
                    throw new IllegalArgumentException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c b(s sVar, s0.f fVar) {
        synchronized (this.f14247a) {
            try {
                x2.g.b(this.b.get(a.a(sVar, fVar.J())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(sVar, fVar);
                if (fVar.O().isEmpty()) {
                    cVar.x();
                }
                if (sVar.a().getState() == l.b.f2627a) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c d(s sVar, g0.s sVar2) {
        c cVar;
        synchronized (this.f14247a) {
            cVar = this.b.get(a.a(sVar, sVar2));
        }
        return cVar;
    }

    public final b e(s sVar) {
        synchronized (this.f14247a) {
            try {
                for (b bVar : this.f14248c.keySet()) {
                    if (sVar.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Collection<c> f() {
        Collection<c> unmodifiableCollection;
        synchronized (this.f14247a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return unmodifiableCollection;
    }

    public final boolean g(s sVar) {
        synchronized (this.f14247a) {
            try {
                b e10 = e(sVar);
                if (e10 == null) {
                    return false;
                }
                Iterator<a> it = this.f14248c.get(e10).iterator();
                while (it.hasNext()) {
                    if (!((c) x2.g.g(this.b.get(it.next()))).u().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(c cVar) {
        synchronized (this.f14247a) {
            try {
                s t8 = cVar.t();
                a a10 = a.a(t8, cVar.s().J());
                b e10 = e(t8);
                Set<a> hashSet = e10 != null ? this.f14248c.get(e10) : new HashSet<>();
                hashSet.add(a10);
                this.b.put(a10, cVar);
                if (e10 == null) {
                    b bVar = new b(t8, this);
                    this.f14248c.put(bVar, hashSet);
                    t8.a().a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(Set<a> set) {
        synchronized (this.f14247a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.b.containsKey(aVar)) {
                    o(this.b.get(aVar));
                }
            }
        }
    }

    public void j(s sVar) {
        synchronized (this.f14247a) {
            try {
                if (g(sVar)) {
                    if (this.f14249d.isEmpty()) {
                        this.f14249d.push(sVar);
                    } else {
                        h0.a aVar = this.f14250e;
                        if (aVar == null || aVar.e() != 2) {
                            s peek = this.f14249d.peek();
                            if (!sVar.equals(peek)) {
                                l(peek);
                                this.f14249d.remove(sVar);
                                this.f14249d.push(sVar);
                            }
                        }
                    }
                    q(sVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(s sVar) {
        synchronized (this.f14247a) {
            try {
                this.f14249d.remove(sVar);
                l(sVar);
                if (!this.f14249d.isEmpty()) {
                    q(this.f14249d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(s sVar) {
        synchronized (this.f14247a) {
            try {
                b e10 = e(sVar);
                if (e10 == null) {
                    return;
                }
                Iterator<a> it = this.f14248c.get(e10).iterator();
                while (it.hasNext()) {
                    ((c) x2.g.g(this.b.get(it.next()))).x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(g2 g2Var, Set<a> set) {
        synchronized (this.f14247a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.b.containsKey(aVar)) {
                    c cVar = this.b.get(aVar);
                    boolean isEmpty = cVar.u().isEmpty();
                    cVar.y(g2Var);
                    if (!isEmpty && cVar.u().isEmpty()) {
                        k(cVar.t());
                    }
                } else {
                    r1.l("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                }
            }
        }
    }

    public void n(Set<a> set) {
        synchronized (this.f14247a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                c cVar = this.b.get(it.next());
                if (cVar != null) {
                    cVar.z();
                    k(cVar.t());
                }
            }
        }
    }

    public final void o(c cVar) {
        synchronized (this.f14247a) {
            try {
                s t8 = cVar.t();
                a a10 = a.a(t8, cVar.s().J());
                this.b.remove(a10);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f14248c.keySet()) {
                    if (t8.equals(bVar.a())) {
                        Set<a> set = this.f14248c.get(bVar);
                        set.remove(a10);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    p((s) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(s sVar) {
        synchronized (this.f14247a) {
            try {
                b e10 = e(sVar);
                if (e10 == null) {
                    return;
                }
                k(sVar);
                Iterator<a> it = this.f14248c.get(e10).iterator();
                while (it.hasNext()) {
                    this.b.remove(it.next());
                }
                this.f14248c.remove(e10);
                e10.a().a().d(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(s sVar) {
        synchronized (this.f14247a) {
            try {
                Iterator<a> it = this.f14248c.get(e(sVar)).iterator();
                while (it.hasNext()) {
                    c cVar = this.b.get(it.next());
                    if (!((c) x2.g.g(cVar)).u().isEmpty()) {
                        cVar.A();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
