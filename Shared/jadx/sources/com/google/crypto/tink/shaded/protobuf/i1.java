package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f8517a = B();
    public static final n1<?, ?> b = C();

    /* renamed from: c, reason: collision with root package name */
    public static final n1<?, ?> f8518c = new p1();

    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, a0.e eVar, UB ub, n1<UT, UB> n1Var) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!eVar.a(intValue)) {
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
            if (eVar.a(intValue2)) {
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
        if (c1.f8462d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
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
        if (c1.f8462d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t8, T t10) {
        u<FT> c10 = qVar.c(t10);
        if (c10.m()) {
            return;
        }
        qVar.d(t8).u(c10);
    }

    public static <T> void F(n0 n0Var, T t8, T t10, long j10) {
        q1.R(t8, j10, n0Var.a(q1.C(t8, j10), q1.C(t10, j10)));
    }

    public static <T, UT, UB> void G(n1<UT, UB> n1Var, T t8, T t10) {
        n1Var.p(t8, n1Var.k(n1Var.g(t8), n1Var.g(t10)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && !c1.f8462d && (cls2 = f8517a) != null && !cls2.isAssignableFrom(cls)) {
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
        return f8518c;
    }

    public static void M(int i10, List<Boolean> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.A(i10, list, z10);
    }

    public static void N(int i10, List<h> list, t1 t1Var) {
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
        t1Var.O(i10, list, g1Var);
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
        t1Var.L(i10, list, g1Var);
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
        return z10 ? k.U(i10) + k.C(size) : size * k.d(i10, true);
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

    public static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * k.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += k.h(list.get(i11));
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
        return z10 ? k.U(i10) + k.C(e10) : e10 + (size * k.U(i10));
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
        if (!(list instanceof z)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.l(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        z zVar = (z) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.l(zVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 4) : size * k.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 8) : size * k.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<s0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.s(i10, list.get(i12), g1Var);
        }
        return i11;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? k.U(i10) + k.C(l10) : l10 + (size * k.U(i10));
    }

    public static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.w(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        z zVar = (z) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.w(zVar.h(i10));
            i10++;
        }
        return i12;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? k.U(i10) + k.C(n10) : n10 + (list.size() * k.U(i10));
    }

    public static int n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.y(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        j0 j0Var = (j0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.y(j0Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof e0 ? k.A(i10, (e0) obj) : k.F(i10, (s0) obj, g1Var);
    }

    public static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = k.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U += obj instanceof e0 ? k.B((e0) obj) : k.H((s0) obj, g1Var);
        }
        return U;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r8 = r(list);
        return z10 ? k.U(i10) + k.C(r8) : r8 + (size * k.U(i10));
    }

    public static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.P(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        z zVar = (z) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.P(zVar.h(i10));
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
        return z10 ? k.U(i10) + k.C(t8) : t8 + (size * k.U(i10));
    }

    public static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.R(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        j0 j0Var = (j0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.R(j0Var.h(i10));
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
        int U = k.U(i10) * size;
        if (!(list instanceof f0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                U += obj instanceof h ? k.h((h) obj) : k.T((String) obj);
                i11++;
            }
            return U;
        }
        f0 f0Var = (f0) list;
        while (i11 < size) {
            Object q10 = f0Var.q(i11);
            U += q10 instanceof h ? k.h((h) q10) : k.T((String) q10);
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
        return z10 ? k.U(i10) + k.C(w5) : w5 + (size * k.U(i10));
    }

    public static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.W(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        z zVar = (z) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.W(zVar.h(i10));
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
        return z10 ? k.U(i10) + k.C(y10) : y10 + (size * k.U(i10));
    }

    public static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += k.Y(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        j0 j0Var = (j0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += k.Y(j0Var.h(i10));
            i10++;
        }
        return i12;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, a0.d<?> dVar, UB ub, n1<UT, UB> n1Var) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (dVar.a(intValue) == null) {
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
            if (dVar.a(intValue2) != null) {
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
