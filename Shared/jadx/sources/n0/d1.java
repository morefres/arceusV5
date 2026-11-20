package n0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y1.c;

/* loaded from: classes.dex */
public class d1 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25331a = new Object();
    public final Map<String, p0> b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Set<p0> f25332c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public ne.x<Void> f25333d;

    /* renamed from: e, reason: collision with root package name */
    public c.a<Void> f25334e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f25335f;

    public static /* synthetic */ void i(d1 d1Var, p0 p0Var) {
        synchronized (d1Var.f25331a) {
            try {
                d1Var.f25332c.remove(p0Var);
                if (d1Var.f25332c.isEmpty()) {
                    x2.g.g(d1Var.f25334e);
                    d1Var.f25334e.c(null);
                    d1Var.f25334e = null;
                    d1Var.f25333d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object j(d1 d1Var, c.a aVar) {
        synchronized (d1Var.f25331a) {
            d1Var.f25334e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // n0.l2
    public void f(List<String> list) {
        HashSet<String> hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.f25331a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                hashMap.put(str, this.f25335f.b(str));
            }
            synchronized (this.f25331a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (p0) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p0 p0Var = (p0) obj;
                        if (p0Var != null) {
                            p0Var.p();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.x e10) {
            throw new i1("Failed to create CameraInternal", e10);
        }
    }

    public ne.x<Void> k() {
        synchronized (this.f25331a) {
            try {
                if (this.b.isEmpty()) {
                    ne.x<Void> xVar = this.f25333d;
                    if (xVar == null) {
                        xVar = r0.n.p(null);
                    }
                    return xVar;
                }
                ne.x<Void> xVar2 = this.f25333d;
                if (xVar2 == null) {
                    xVar2 = y1.c.a(new c.InterfaceC0669c() { // from class: n0.b1
                        @Override // y1.c.InterfaceC0669c
                        public final Object a(c.a aVar) {
                            return d1.j(d1.this, aVar);
                        }
                    });
                    this.f25333d = xVar2;
                }
                this.f25332c.addAll(this.b.values());
                for (final p0 p0Var : this.b.values()) {
                    p0Var.a().a(new Runnable() { // from class: n0.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d1.i(d1.this, p0Var);
                        }
                    }, q0.c.b());
                }
                this.b.clear();
                return xVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p0 l(String str) {
        p0 p0Var;
        synchronized (this.f25331a) {
            try {
                p0Var = this.b.get(str);
                if (p0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0Var;
    }

    public LinkedHashSet<p0> m() {
        LinkedHashSet<p0> linkedHashSet;
        synchronized (this.f25331a) {
            linkedHashSet = new LinkedHashSet<>(this.b.values());
        }
        return linkedHashSet;
    }

    public void n(n0 n0Var) {
        this.f25335f = n0Var;
        synchronized (this.f25331a) {
            try {
                for (String str : n0Var.d()) {
                    g0.r1.a("CameraRepository", "Added camera: " + str);
                    p0 put = this.b.put(str, n0Var.b(str));
                    if (put != null) {
                        put.a();
                    }
                }
            } catch (g0.x e10) {
                throw new g0.p1(e10);
            }
        }
    }
}
