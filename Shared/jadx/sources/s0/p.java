package s0;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.i2;
import n0.i4;
import n0.o0;
import p0.a;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f30865a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f30866c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30867d;

    public p(o0 o0Var, Rational rational) {
        this.f30865a = o0Var.d();
        this.b = o0Var.i();
        this.f30866c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f30867d = z10;
    }

    public static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : o.k(list)) {
            if (p0.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i10, int i11, int i12) {
        int a10 = p0.c.a(p0.c.b(i10), i12, 1 == i11);
        return a10 == 90 || a10 == 270;
    }

    public final Rational c(i2 i2Var, List<Size> list) {
        if (i2Var.A()) {
            return o.n(i2Var.C(), this.f30867d);
        }
        Size d10 = d(i2Var);
        if (d10 != null) {
            return b(d10, list);
        }
        return null;
    }

    public final Size d(i2 i2Var) {
        return a(i2Var.V(null), i2Var.J(0), this.b, this.f30865a);
    }

    public List<Size> f(List<Size> list, i4<?> i4Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new p0.e(true));
        ArrayList arrayList2 = new ArrayList();
        i2 i2Var = (i2) i4Var;
        Size i10 = i2Var.i(null);
        int i11 = 0;
        Size size = (Size) arrayList.get(0);
        if (i10 == null || w0.d.c(size) < w0.d.c(i10)) {
            i10 = size;
        }
        Size d10 = d(i2Var);
        Size size2 = w0.d.f33613c;
        int c10 = w0.d.c(size2);
        if (w0.d.c(i10) < c10) {
            size2 = w0.d.f33612a;
        } else if (d10 != null && w0.d.c(d10) < c10) {
            size2 = d10;
        }
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj = arrayList.get(i12);
            i12++;
            Size size4 = (Size) obj;
            if (w0.d.c(size4) <= w0.d.c(i10) && w0.d.c(size4) >= w0.d.c(size2) && !arrayList2.contains(size4)) {
                arrayList2.add(size4);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + i10 + "\ninitial size list: " + arrayList);
        }
        Rational c11 = c(i2Var, arrayList2);
        if (d10 == null) {
            d10 = i2Var.R(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (c11 == null) {
            arrayList3.addAll(arrayList2);
            if (d10 != null) {
                o.q(arrayList3, d10, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> o8 = o.o(arrayList2);
            if (d10 != null) {
                Iterator<Rational> it = o8.keySet().iterator();
                while (it.hasNext()) {
                    o.q(o8.get(it.next()), d10, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(o8.keySet());
            Collections.sort(arrayList4, new a.C0498a(c11, this.f30866c));
            int size5 = arrayList4.size();
            while (i11 < size5) {
                Object obj2 = arrayList4.get(i11);
                i11++;
                for (Size size6 : o8.get((Rational) obj2)) {
                    if (!arrayList3.contains(size6)) {
                        arrayList3.add(size6);
                    }
                }
            }
        }
        return arrayList3;
    }
}
