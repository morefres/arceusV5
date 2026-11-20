package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f17985c = new a().b(0).a();

    /* renamed from: d, reason: collision with root package name */
    public static final v f17986d = new a().b(1).a();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<r> f17987a;
    public final String b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet<r> f17988a = new LinkedHashSet<>();
        public String b;

        public v a() {
            return new v(this.f17988a, this.b);
        }

        public a b(int i10) {
            x2.g.j(i10 != -1, "The specified lens facing is invalid.");
            this.f17988a.add(new n0.m2(i10));
            return this;
        }
    }

    public v(LinkedHashSet<r> linkedHashSet, String str) {
        this.f17987a = linkedHashSet;
        this.b = str;
    }

    public LinkedHashSet<n0.p0> a(LinkedHashSet<n0.p0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.p0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        List<t> b = b(arrayList);
        LinkedHashSet<n0.p0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<n0.p0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            n0.p0 next = it2.next();
            if (b.contains(next.d())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<t> b(List<t> list) {
        List<t> arrayList = new ArrayList<>(list);
        Iterator<r> it = this.f17987a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<r> c() {
        return this.f17987a;
    }

    public Integer d() {
        Iterator<r> it = this.f17987a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            r next = it.next();
            if (next instanceof n0.m2) {
                Integer valueOf = Integer.valueOf(((n0.m2) next).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final String e(Set<n0.p0> set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cams:");
        sb2.append(set.size());
        Iterator<n0.p0> it = set.iterator();
        while (it.hasNext()) {
            n0.o0 k10 = it.next().k();
            sb2.append(String.format(" Id:%s  Lens:%s", k10.e(), Integer.valueOf(k10.i())));
        }
        return sb2.toString();
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("PhyId:%s  Filters:%s", this.b, Integer.valueOf(this.f17987a.size())));
        Iterator<r> it = this.f17987a.iterator();
        while (it.hasNext()) {
            r next = it.next();
            sb2.append(" Id:");
            sb2.append(next.a());
            if (next instanceof n0.m2) {
                sb2.append(" LensFilter:");
                sb2.append(((n0.m2) next).c());
            }
        }
        return sb2.toString();
    }

    public n0.p0 g(LinkedHashSet<n0.p0> linkedHashSet) {
        Iterator<n0.p0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }
}
