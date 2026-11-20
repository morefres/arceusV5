package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f2013a = B();
    public static final n1<?, ?> b = C();

    /* renamed from: c, reason: collision with root package name */
    public static final n1<?, ?> f2014c = new p1();

    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, z.c cVar, UB ub, n1<UT, UB> n1Var) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!cVar.a(intValue)) {
                    ub = (UB) J(obj, i10, intValue, ub, n1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int intValue2 = num.intValue();
            if (cVar.a(intValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) J(obj, i10, intValue2, ub, n1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }

    public static Class<?> B() {
        if (c1.f1963d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static n1<?, ?> C() {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (n1) D.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> D() {
        if (c1.f1963d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t8, T t10) {
        t<FT> c10 = pVar.c(t10);
        if (c10.n()) {
            return;
        }
        pVar.d(t8).v(c10);
    }

    public static <T> void F(m0 m0Var, T t8, T t10, long j10) {
        q1.O(t8, j10, m0Var.a(q1.z(t8, j10), q1.z(t10, j10)));
    }

    public static <T, UT, UB> void G(n1<UT, UB> n1Var, T t8, T t10) {
        n1Var.p(t8, n1Var.k(n1Var.g(t8), n1Var.g(t10)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && !c1.f1963d && (cls2 = f2013a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB J(Object obj, int i10, int i11, UB ub, n1<UT, UB> n1Var) {
        if (ub == null) {
            ub = n1Var.f(obj);
        }
        n1Var.e(ub, i10, i11);
        return ub;
    }

    public static n1<?, ?> K() {
        return b;
    }

    public static n1<?, ?> L() {
        return f2014c;
    }

    public static void M(int i10, List<Boolean> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.A(i10, list, z10);
    }

    public static void N(int i10, List<g> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.I(i10, list);
    }

    public static void O(int i10, List<Double> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.G(i10, list, z10);
    }

    public static void P(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.n(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.j(i10, list, z10);
    }

    public static void R(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.y(i10, list, z10);
    }

    public static void S(int i10, List<Float> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.a(i10, list, z10);
    }

    public static void T(int i10, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.J(i10, list, g1Var);
    }

    public static void U(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.g(i10, list, z10);
    }

    public static void V(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.F(i10, list, z10);
    }

    public static void W(int i10, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.O(i10, list, g1Var);
    }

    public static void X(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.z(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.q(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.D(i10, list, z10);
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size) : size * j.d(i10, true);
    }

    public static void a0(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.l(i10, list, z10);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<String> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.d(i10, list);
    }

    public static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * j.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += j.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.k(i10, list, z10);
    }

    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? j.U(i10) + j.C(e10) : e10 + (size * j.U(i10));
    }

    public static void d0(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.r(i10, list, z10);
    }

    public static int e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.l(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        y yVar = (y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.l(yVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 4) : size * j.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 8) : size * j.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<r0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += j.s(i10, list.get(i12), g1Var);
        }
        return i11;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? j.U(i10) + j.C(l10) : l10 + (size * j.U(i10));
    }

    public static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.w(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        y yVar = (y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.w(yVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? j.U(i10) + j.C(n10) : n10 + (list.size() * j.U(i10));
    }

    public static int n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.y(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        i0 i0Var = (i0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.y(i0Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof d0 ? j.A(i10, (d0) obj) : j.F(i10, (r0) obj, g1Var);
    }

    public static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = j.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U += obj instanceof d0 ? j.B((d0) obj) : j.H((r0) obj, g1Var);
        }
        return U;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r8 = r(list);
        return z10 ? j.U(i10) + j.C(r8) : r8 + (size * j.U(i10));
    }

    public static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.P(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        y yVar = (y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.P(yVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t8 = t(list);
        return z10 ? j.U(i10) + j.C(t8) : t8 + (size * j.U(i10));
    }

    public static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.R(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        i0 i0Var = (i0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.R(i0Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = j.U(i10) * size;
        if (!(list instanceof e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                U += obj instanceof g ? j.h((g) obj) : j.T((String) obj);
                i11++;
            }
            return U;
        }
        e0 e0Var = (e0) list;
        while (i11 < size) {
            Object q10 = e0Var.q(i11);
            U += q10 instanceof g ? j.h((g) q10) : j.T((String) q10);
            i11++;
        }
        return U;
    }

    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w5 = w(list);
        return z10 ? j.U(i10) + j.C(w5) : w5 + (size * j.U(i10));
    }

    public static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.W(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        y yVar = (y) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.W(yVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? j.U(i10) + j.C(y10) : y10 + (size * j.U(i10));
    }

    public static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += j.Y(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        i0 i0Var = (i0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += j.Y(i0Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, z.b<?> bVar, UB ub, n1<UT, UB> n1Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (bVar.a(intValue) == null) {
                    ub = (UB) J(obj, i10, intValue, ub, n1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int intValue2 = num.intValue();
            if (bVar.a(intValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) J(obj, i10, intValue2, ub, n1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }
}
