package ie;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class j<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient Object f20851a;
    public transient int[] b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f20852c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f20853d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f20854e;

    public class a implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f20855a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f20856c = -1;

        public a() {
            this.f20855a = j.this.f20853d;
            this.b = j.this.l();
        }

        public final void b() {
            if (j.this.f20853d != this.f20855a) {
                throw new ConcurrentModificationException();
            }
        }

        public void d() {
            this.f20855a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.b;
            this.f20856c = i10;
            E e10 = (E) j.this.i(i10);
            this.b = j.this.m(this.b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            g.c(this.f20856c >= 0);
            d();
            j jVar = j.this;
            jVar.remove(jVar.i(this.f20856c));
            this.b = j.this.c(this.b, this.f20856c);
            this.f20856c = -1;
        }
    }

    public j() {
        u(3);
    }

    public static <E> j<E> f() {
        return new j<>();
    }

    public final Object[] A() {
        Object[] objArr = this.f20852c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] B() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object C() {
        Object obj = this.f20851a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void D(int i10) {
        this.b = Arrays.copyOf(B(), i10);
        this.f20852c = Arrays.copyOf(A(), i10);
    }

    public final void E(int i10) {
        int min;
        int length = B().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        D(min);
    }

    public final int F(int i10, int i11, int i12, int i13) {
        Object a10 = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(a10, i12 & i14, i13 + 1);
        }
        Object C = C();
        int[] B = B();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = k.h(C, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = B[i16];
                int b = k.b(i17, i10) | i15;
                int i18 = b & i14;
                int h11 = k.h(a10, i18);
                k.i(a10, i18, h10);
                B[i16] = k.d(b, h11, i14);
                h10 = k.c(i17, i10);
            }
        }
        this.f20851a = a10;
        I(i14);
        return i14;
    }

    public final void G(int i10, E e10) {
        A()[i10] = e10;
    }

    public final void H(int i10, int i11) {
        B()[i10] = i11;
    }

    public final void I(int i10) {
        this.f20853d = k.d(this.f20853d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (z()) {
            d();
        }
        Set<E> h10 = h();
        if (h10 != null) {
            return h10.add(e10);
        }
        int[] B = B();
        Object[] A = A();
        int i10 = this.f20854e;
        int i11 = i10 + 1;
        int c10 = p.c(e10);
        int p8 = p();
        int i12 = c10 & p8;
        int h11 = k.h(C(), i12);
        if (h11 != 0) {
            int b = k.b(c10, p8);
            int i13 = 0;
            while (true) {
                int i14 = h11 - 1;
                int i15 = B[i14];
                if (k.b(i15, p8) == b && he.j.a(e10, A[i14])) {
                    return false;
                }
                int c11 = k.c(i15, p8);
                i13++;
                if (c11 != 0) {
                    h11 = c11;
                } else {
                    if (i13 >= 9) {
                        return e().add(e10);
                    }
                    if (i11 > p8) {
                        p8 = F(p8, k.e(p8), c10, i10);
                    } else {
                        B[i14] = k.d(i15, i11, p8);
                    }
                }
            }
        } else if (i11 > p8) {
            p8 = F(p8, k.e(p8), c10, i10);
        } else {
            k.i(C(), i12, i11);
        }
        E(i11);
        v(i10, e10, c10, p8);
        this.f20854e = i11;
        t();
        return true;
    }

    public int c(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (z()) {
            return;
        }
        t();
        Set<E> h10 = h();
        if (h10 != null) {
            this.f20853d = me.a.a(size(), 3, 1073741823);
            h10.clear();
            this.f20851a = null;
            this.f20854e = 0;
            return;
        }
        Arrays.fill(A(), 0, this.f20854e, (Object) null);
        k.g(C());
        Arrays.fill(B(), 0, this.f20854e, 0);
        this.f20854e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (z()) {
            return false;
        }
        Set<E> h10 = h();
        if (h10 != null) {
            return h10.contains(obj);
        }
        int c10 = p.c(obj);
        int p8 = p();
        int h11 = k.h(C(), c10 & p8);
        if (h11 == 0) {
            return false;
        }
        int b = k.b(c10, p8);
        do {
            int i10 = h11 - 1;
            int k10 = k(i10);
            if (k.b(k10, p8) == b && he.j.a(obj, i(i10))) {
                return true;
            }
            h11 = k.c(k10, p8);
        } while (h11 != 0);
        return false;
    }

    public int d() {
        he.n.s(z(), "Arrays already allocated");
        int i10 = this.f20853d;
        int j10 = k.j(i10);
        this.f20851a = k.a(j10);
        I(j10 - 1);
        this.b = new int[i10];
        this.f20852c = new Object[i10];
        return i10;
    }

    public Set<E> e() {
        Set<E> g10 = g(p() + 1);
        int l10 = l();
        while (l10 >= 0) {
            g10.add(i(l10));
            l10 = m(l10);
        }
        this.f20851a = g10;
        this.b = null;
        this.f20852c = null;
        t();
        return g10;
    }

    public final Set<E> g(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public Set<E> h() {
        Object obj = this.f20851a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final E i(int i10) {
        return (E) A()[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> h10 = h();
        return h10 != null ? h10.iterator() : new a();
    }

    public final int k(int i10) {
        return B()[i10];
    }

    public int l() {
        return isEmpty() ? -1 : 0;
    }

    public int m(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20854e) {
            return i11;
        }
        return -1;
    }

    public final int p() {
        return (1 << (this.f20853d & 31)) - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (z()) {
            return false;
        }
        Set<E> h10 = h();
        if (h10 != null) {
            return h10.remove(obj);
        }
        int p8 = p();
        int f10 = k.f(obj, null, p8, C(), B(), A(), null);
        if (f10 == -1) {
            return false;
        }
        y(f10, p8);
        this.f20854e--;
        t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> h10 = h();
        return h10 != null ? h10.size() : this.f20854e;
    }

    public void t() {
        this.f20853d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (z()) {
            return new Object[0];
        }
        Set<E> h10 = h();
        return h10 != null ? h10.toArray() : Arrays.copyOf(A(), this.f20854e);
    }

    public void u(int i10) {
        he.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f20853d = me.a.a(i10, 1, 1073741823);
    }

    public void v(int i10, E e10, int i11, int i12) {
        H(i10, k.d(i11, 0, i12));
        G(i10, e10);
    }

    public void y(int i10, int i11) {
        Object C = C();
        int[] B = B();
        Object[] A = A();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            A[i10] = null;
            B[i10] = 0;
            return;
        }
        Object obj = A[i12];
        A[i10] = obj;
        A[i12] = null;
        B[i10] = B[i12];
        B[i12] = 0;
        int c10 = p.c(obj) & i11;
        int h10 = k.h(C, c10);
        if (h10 == size) {
            k.i(C, c10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = h10 - 1;
            int i14 = B[i13];
            int c11 = k.c(i14, i11);
            if (c11 == size) {
                B[i13] = k.d(i14, i10 + 1, i11);
                return;
            }
            h10 = c11;
        }
    }

    public boolean z() {
        return this.f20851a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (z()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> h10 = h();
        if (h10 != null) {
            return (T[]) h10.toArray(tArr);
        }
        return (T[]) l0.e(A(), 0, this.f20854e, tArr);
    }
}
