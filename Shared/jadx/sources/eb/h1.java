package eb;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h1 extends z0 implements Set {
    public transient e1 b;

    public static h1 f(int i10, Object... objArr) {
        if (i10 == 0) {
            return u1.f15923i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new z1(obj);
        }
        int h10 = h(i10);
        Object[] objArr2 = new Object[h10];
        int i11 = h10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            r1.a(obj2, i14);
            int hashCode = obj2.hashCode();
            int a10 = y0.a(hashCode);
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
            return new z1(obj4);
        }
        if (h(i13) < h10 / 2) {
            return f(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new u1(objArr, i12, objArr2, i11, i13);
    }

    public static int h(int i10) {
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

    public static h1 l() {
        return u1.f15923i;
    }

    public static h1 m(Object obj) {
        return new z1("FIDO");
    }

    public static h1 p(Object obj, Object obj2) {
        return f(2, obj, obj2);
    }

    @Override // eb.z0
    public abstract c2 d();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h1) && g() && ((h1) obj).g() && hashCode() != obj.hashCode()) {
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

    public boolean g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y1.a(this);
    }

    public e1 i() {
        e1 e1Var = this.b;
        if (e1Var != null) {
            return e1Var;
        }
        e1 k10 = k();
        this.b = k10;
        return k10;
    }

    public e1 k() {
        Object[] array = toArray();
        d2 d2Var = e1.b;
        return e1.h(array, array.length);
    }
}
