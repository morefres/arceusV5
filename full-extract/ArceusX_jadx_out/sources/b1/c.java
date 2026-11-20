package b1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.i2;
import n0.i4;
import n0.o0;
import n0.p0;
import n0.w2;
import p0.a0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    public static final double f3643h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    public final Size f3644a;
    public final Rational b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f3645c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<i4<?>> f3646d;

    /* renamed from: e, reason: collision with root package name */
    public final s0.o f3647e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f3648f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<i4<?>, List<Size>> f3649g;

    public static class a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        public final Rational f3650a;
        public final boolean b;

        public a(Rational rational, boolean z10) {
            this.f3650a = rational;
            this.b = z10;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float c10 = c.c(rational, this.f3650a);
            float c11 = c.c(rational2, this.f3650a);
            return this.b ? Float.compare(c11, c10) : Float.compare(c10, c11);
        }
    }

    public c(p0 p0Var, Set<i4<?>> set) {
        this(a0.m(p0Var.k().h()), p0Var.k(), set);
    }

    public static boolean A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    public static List<Size> E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    public static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    public static void M(List<Size> list) {
        Collections.sort(list, new p0.e(true));
    }

    public static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static Rational O(Size size) {
        Rational rational = p0.a.f28189a;
        if (p0.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = p0.a.f28190c;
        return p0.a.a(size, rational2) ? rational2 : N(size);
    }

    public static float c(Rational rational, Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    public static List<Size> e(List<Size> list) {
        Rational rational;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                if (p0.a.a(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = N(size);
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        return arrayList;
    }

    public static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (p0.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f3643h ? p0.a.f28190c : p0.a.f28189a;
    }

    public static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational N = N(size);
        if (rational.floatValue() == N.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > N.floatValue()) {
                float f10 = width;
                float floatValue = f10 / rational.floatValue();
                float f11 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, floatValue + f11);
            } else {
                float f12 = height;
                float floatValue2 = rational.floatValue() * f12;
                float f13 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, floatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    public static Rational n(Rational rational) {
        Rational rational2 = p0.a.f28189a;
        if (rational.equals(rational2)) {
            return p0.a.f28190c;
        }
        if (rational.equals(p0.a.f28190c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    public static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> E = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : E) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static Rational u(Size size) {
        Rational h10 = h(size);
        r1.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + h10 + ".");
        return h10;
    }

    public static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    public static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static boolean z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Rational rational, Size size) {
        if (this.b.equals(rational) || p0.a.a(size, rational)) {
            return false;
        }
        return b(this.b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    public final boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    public final boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!p0.a.a(it.next(), this.f3645c)) {
                return true;
            }
        }
        return false;
    }

    public final List<Size> G(List<Size> list, boolean z10) {
        Map<Rational, List<Size>> x10 = x(list);
        ArrayList arrayList = new ArrayList(x10.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Rational rational = (Rational) obj;
            if (!rational.equals(p0.a.f28190c) && !rational.equals(p0.a.f28189a)) {
                List<Size> list2 = x10.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    public final List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f3645c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            r1.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        r1.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    public final List<Size> I(Rational rational, List<Size> list, boolean z10) {
        List<Size> g10 = g(rational, list);
        M(g10);
        HashSet hashSet = new HashSet(g10);
        Iterator<i4<?>> it = this.f3646d.iterator();
        while (it.hasNext()) {
            List<Size> v5 = v(it.next());
            if (!z10) {
                v5 = d(rational, v5);
            }
            if (v5.isEmpty()) {
                return new ArrayList();
            }
            g10 = f(v5, g10);
            hashSet.retainAll(p(v5, g10));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : g10) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final boolean J() {
        boolean z10;
        a1.c q10;
        Iterator<i4<?>> it = this.f3646d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            i4<?> next = it.next();
            if (!next.d0(false) && (next instanceof i2) && (q10 = ((i2) next).q(null)) != null) {
                z10 = true;
                if (q10.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    public final boolean K() {
        if (this.f3646d.isEmpty()) {
            return false;
        }
        Iterator<i4<?>> it = this.f3646d.iterator();
        while (it.hasNext()) {
            Iterator<Size> it2 = v(it.next()).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it2.hasNext()) {
                boolean a10 = p0.a.a(it2.next(), this.f3645c);
                if (a10) {
                    z10 = true;
                }
                if (z11 && a10) {
                    return false;
                }
                if (!a10) {
                    z11 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void L(List<Rational> list) {
        Collections.sort(list, new a(N(this.f3644a), true));
    }

    public final boolean b(float f10, float f11, float f12) {
        if (f10 != f11 && f11 != f12) {
            if (f10 > f11) {
                return f11 < f12;
            }
            if (f11 > f12) {
                return true;
            }
        }
        return false;
    }

    public final List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final List<Size> i() {
        return this.f3648f.j(34);
    }

    public final List<Size> j() {
        return this.f3648f.m(34);
    }

    public final Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<i4<?>> it = this.f3646d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    public List<Size> o(w2 w2Var) {
        List<Size> j10 = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(j10);
            arrayList.addAll(i());
            j10 = arrayList;
        }
        List list = (List) w2Var.h(i2.f25394t, null);
        if (list != null) {
            j10 = w(list);
        }
        return H(j10);
    }

    public Size q(Size size, i4<?> i4Var) {
        List<Size> v5 = v(i4Var);
        for (Size size2 : v5) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : v5) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    public PreferredChildSize r(i4<?> i4Var, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (a0.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        PreferredChildSize t8 = t(rect, i4Var, z10);
        return z11 ? new PreferredChildSize(F(t8.getCropRectBeforeScaling()), a0.o(t8.getChildSizeToScale()), t8.getOriginalSelectedChildSize()) : t8;
    }

    public Pair<Size, Size> s(Size size, i4<?> i4Var) {
        for (Size size2 : v(i4Var)) {
            Size m10 = a0.m(m(size2, size));
            if (!y(m10, size)) {
                return Pair.create(size2, m10);
            }
        }
        return Pair.create(size, size);
    }

    public final PreferredChildSize t(Rect rect, i4<?> i4Var, boolean z10) {
        Size q10;
        Size size;
        if (z10) {
            Pair<Size, Size> s8 = s(a0.m(rect), i4Var);
            q10 = (Size) s8.first;
            size = (Size) s8.second;
        } else {
            Size m10 = a0.m(rect);
            q10 = q(m10, i4Var);
            rect = m(m10, q10);
            size = q10;
        }
        return new PreferredChildSize(rect, size, q10);
    }

    public final List<Size> v(i4<?> i4Var) {
        if (!this.f3646d.contains(i4Var)) {
            throw new IllegalArgumentException("Invalid child config: " + i4Var);
        }
        if (this.f3649g.containsKey(i4Var)) {
            List<Size> list = this.f3649g.get(i4Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> e10 = e(this.f3647e.m(i4Var));
        this.f3649g.put(i4Var, e10);
        return e10;
    }

    public final Map<Rational, List<Size>> x(List<Size> list) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = p0.a.f28189a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = p0.a.f28190c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        list2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    Rational rational3 = (Rational) obj;
                    if (p0.a.a(size, rational3)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational N = N(size);
                    arrayList.add(N);
                    hashMap.put(N, list2);
                }
                list2.add(size);
            }
        }
        return hashMap;
    }

    public c(Size size, o0 o0Var, Set<i4<?>> set) {
        this(size, o0Var, set, new s0.o(o0Var, size));
    }

    public c(Size size, o0 o0Var, Set<i4<?>> set, s0.o oVar) {
        this.f3649g = new HashMap();
        this.f3644a = size;
        Rational u8 = u(size);
        this.b = u8;
        this.f3645c = n(u8);
        this.f3648f = o0Var;
        this.f3646d = set;
        this.f3647e = oVar;
    }
}
