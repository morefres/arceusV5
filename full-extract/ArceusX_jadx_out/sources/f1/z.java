package f1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class z {
    public static final Map<x, Range<Integer>> b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<Integer, Rational> f16627c;

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, List<Size>> f16628a = new HashMap();

    public static abstract class a {
        public static a c(x xVar, int i10) {
            return new i(xVar, i10);
        }

        public abstract int a();

        public abstract x b();
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(x.f16614d, Range.create(2160, 4319));
        hashMap.put(x.f16613c, Range.create(1080, 1439));
        hashMap.put(x.b, Range.create(720, 1079));
        hashMap.put(x.f16612a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f16627c = hashMap2;
        hashMap2.put(0, p0.a.f28189a);
        hashMap2.put(1, p0.a.f28190c);
    }

    public z(List<Size> list, Map<x, Size> map) {
        for (x xVar : b.keySet()) {
            this.f16628a.put(a.c(xVar, -1), new ArrayList());
            Iterator<Integer> it = f16627c.keySet().iterator();
            while (it.hasNext()) {
                this.f16628a.put(a.c(xVar, it.next().intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i10, Size size, Size size2) {
        return Math.abs(w0.d.c(size) - i10) - Math.abs(w0.d.c(size2) - i10);
    }

    public static Integer d(Size size) {
        for (Map.Entry<Integer, Rational> entry : f16627c.entrySet()) {
            if (p0.a.b(size, entry.getValue(), w0.d.b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static x e(Size size) {
        for (Map.Entry<x, Range<Integer>> entry : b.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void b(Map<x, Size> map) {
        for (Map.Entry<x, Size> entry : map.entrySet()) {
            List<Size> f10 = f(entry.getKey(), -1);
            Objects.requireNonNull(f10);
            f10.add(entry.getValue());
        }
    }

    public final void c(List<Size> list) {
        Integer d10;
        for (Size size : list) {
            x e10 = e(size);
            if (e10 != null && (d10 = d(size)) != null) {
                List<Size> f10 = f(e10, d10.intValue());
                Objects.requireNonNull(f10);
                f10.add(size);
            }
        }
    }

    public final List<Size> f(x xVar, int i10) {
        return this.f16628a.get(a.c(xVar, i10));
    }

    public List<Size> g(x xVar, int i10) {
        List<Size> f10 = f(xVar, i10);
        return f10 != null ? new ArrayList(f10) : new ArrayList(0);
    }

    public final void h(Map<x, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.f16628a.entrySet()) {
            Size size = map.get(entry.getKey().b());
            if (size != null) {
                final int c10 = w0.d.c(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: f1.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return z.a(c10, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
