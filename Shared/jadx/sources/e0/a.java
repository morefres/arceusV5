package e0;

import a0.f;
import a0.p0;
import f0.h;
import g0.p1;
import g0.r1;
import g0.t;
import h0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n0.i1;
import z.x2;

/* loaded from: classes.dex */
public class a implements h0.a {
    public final p0 b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15484a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f15486d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Set<Set<String>> f15487e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public List<t> f15488f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f15489g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final List<a.InterfaceC0338a> f15485c = new ArrayList();

    public a(p0 p0Var) {
        this.b = p0Var;
        try {
            f(Arrays.asList(p0Var.d()));
        } catch (f | i1 e10) {
            r1.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e10);
        }
    }

    @Override // h0.a
    public void c(a.InterfaceC0338a interfaceC0338a) {
        synchronized (this.f15484a) {
            this.f15485c.add(interfaceC0338a);
        }
    }

    @Override // h0.a
    public String d(String str) {
        synchronized (this.f15484a) {
            try {
                if (!this.f15486d.containsKey(str)) {
                    return null;
                }
                List<String> list = this.f15486d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator<t> it = this.f15488f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(h.a(it.next()).c())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h0.a
    public int e() {
        int i10;
        synchronized (this.f15484a) {
            i10 = this.f15489g;
        }
        return i10;
    }

    @Override // n0.l2
    public void f(List<String> list) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.b.e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (x2.a(this.b, str) && x2.a(this.b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!hashMap.containsKey(str)) {
                                    hashMap.put(str, new ArrayList());
                                }
                                ((List) hashMap.get(str)).add(str2);
                                if (!hashMap.containsKey(str2)) {
                                    hashMap.put(str2, new ArrayList());
                                }
                                ((List) hashMap.get(str2)).add(str);
                            }
                        } catch (p1 unused) {
                            r1.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f15484a) {
                this.f15486d = hashMap;
                this.f15487e = hashSet;
                r1.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f15486d);
            }
        } catch (f e10) {
            throw new i1("Failed to retrieve concurrent camera id info.", e10);
        }
    }

    @Override // h0.a
    public void h(int i10) {
        synchronized (this.f15484a) {
            try {
                int i11 = this.f15489g;
                if (i10 == i11) {
                    return;
                }
                this.f15489g = i10;
                ArrayList arrayList = new ArrayList(this.f15485c);
                if (i11 == 2 && i10 != 2) {
                    this.f15488f.clear();
                }
                i(arrayList, i11, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(List<a.InterfaceC0338a> list, int i10, int i11) {
        Iterator<a.InterfaceC0338a> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(i10, i11);
        }
    }

    @Override // h0.a
    public void shutdown() {
        synchronized (this.f15484a) {
            this.f15485c.clear();
            this.f15486d.clear();
            this.f15488f.clear();
            this.f15487e.clear();
            this.f15489g = 0;
        }
    }
}
