package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class s0 extends j0 implements Set {
    public transient n0 b;

    public static int g(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static s0 k() {
        return c1.f7064i;
    }

    public static s0 m(int i10, Object... objArr) {
        if (i10 == 0) {
            return c1.f7064i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new e1(obj);
        }
        int g10 = g(i10);
        Object[] objArr2 = new Object[g10];
        int i11 = g10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            v0.a(obj2, i14);
            int hashCode = obj2.hashCode();
            int a10 = g0.a(hashCode);
            while (true) {
                int i15 = a10 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a10++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e1(obj4);
        }
        if (g(i13) < g10 / 2) {
            return m(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new c1(objArr, i12, objArr2, i11, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public n0 d() {
        n0 n0Var = this.b;
        if (n0Var != null) {
            return n0Var;
        }
        n0 h10 = h();
        this.b = h10;
        return h10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s0) && l() && ((s0) obj).l() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public n0 h() {
        Object[] array = toArray();
        g1 g1Var = n0.b;
        return n0.h(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d1.a(this);
    }

    public boolean l() {
        return false;
    }
}
