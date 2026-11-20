package s0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.i2;
import n0.i4;
import n0.o0;
import p0.a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f30861a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30862c;

    /* renamed from: d, reason: collision with root package name */
    public final Rational f30863d;

    /* renamed from: e, reason: collision with root package name */
    public final p f30864e;

    public o(o0 o0Var, Size size) {
        this.f30861a = o0Var;
        this.b = o0Var.d();
        this.f30862c = o0Var.i();
        Rational h10 = size != null ? h(size) : i(o0Var);
        this.f30863d = h10;
        this.f30864e = new p(o0Var, h10);
    }

    public static LinkedHashMap<Rational, List<Size>> a(List<Size> list, a1.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    public static LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, a1.a aVar, Rational rational) {
        int i10 = 0;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational n10 = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational n11 = n(aVar.b(), z10);
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Rational rational2 = (Rational) obj;
                if (!rational2.equals(n11)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2, new a.C0498a(n10, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            Rational rational3 = (Rational) obj2;
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    public static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int c10 = w0.d.c(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (w0.d.c(size2) <= c10) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static List<Size> e(List<Size> list, a1.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        List<Size> a10 = bVar.a(new ArrayList(list), p0.c.a(p0.c.b(i10), i11, i12 == 1));
        if (list.containsAll(a10)) {
            return a10;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, a1.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    public static void g(List<Size> list, a1.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int b = dVar.b();
        if (dVar.equals(a1.d.f77c)) {
            return;
        }
        Size a10 = dVar.a();
        if (b == 0) {
            s(list, a10);
            return;
        }
        if (b == 1) {
            q(list, a10, true);
            return;
        }
        if (b == 2) {
            q(list, a10, false);
        } else if (b == 3) {
            r(list, a10, true);
        } else {
            if (b != 4) {
                return;
            }
            r(list, a10, false);
        }
    }

    public static List<Rational> k(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p0.a.f28189a);
        arrayList.add(p0.a.f28190c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (p0.a.a(size, (Rational) obj)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational n(int i10, boolean z10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z10 ? p0.a.f28189a : p0.a.b;
        }
        if (i10 == 1) {
            return z10 ? p0.a.f28190c : p0.a.f28191d;
        }
        r1.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        return null;
    }

    public static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap hashMap = new HashMap();
        Iterator<Rational> it = k(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : hashMap.keySet()) {
                if (p0.a.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static List<Size> p(a1.c cVar, List<Size> list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap<Rational, List<Size>> a10 = a(list, cVar.b(), rational);
        if (size != null) {
            d(a10, size);
        }
        f(a10, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = a10.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    public static void q(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void r(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void s(List<Size> list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public final List<Size> c(List<Size> list, a1.c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f30861a.j(i10));
        Collections.sort(arrayList, new p0.e(true));
        return arrayList;
    }

    public final Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Rational i(o0 o0Var) {
        List<Size> m10 = o0Var.m(256);
        if (m10.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(m10, new p0.e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List<Size> j(List<Pair<Integer, Size[]>> list, int i10) {
        List<Size> l10 = l(list, i10);
        if (l10 == null) {
            l10 = this.f30861a.m(i10);
        }
        ArrayList arrayList = new ArrayList(l10);
        Collections.sort(arrayList, new p0.e(true));
        if (arrayList.isEmpty()) {
            r1.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    public final List<Size> l(List<Pair<Integer, Size[]>> list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public List<Size> m(i4<?> i4Var) {
        i2 i2Var = (i2) i4Var;
        List<Size> N = i2Var.N(null);
        if (N != null) {
            return N;
        }
        a1.c q10 = i2Var.q(null);
        List<Size> j10 = j(i2Var.l(null), i4Var.p());
        if (q10 == null) {
            return this.f30864e.f(j10, i4Var);
        }
        Size i10 = ((i2) i4Var).i(null);
        int J = i2Var.J(0);
        if (!i4Var.d0(false)) {
            j10 = c(j10, q10, i4Var.p());
        }
        List<Size> list = j10;
        r1.a("SupportedOutputSizesCollector", "useCaseConfig = " + i4Var + ", candidateSizes = " + list);
        return p(i2Var.m(), list, i10, J, this.f30863d, this.b, this.f30862c);
    }
}
