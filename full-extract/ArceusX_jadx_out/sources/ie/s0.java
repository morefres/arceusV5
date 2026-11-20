package ie;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class s0<E> extends y<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final s0<Comparable> f20895f = new s0<>(t.z(), m0.c());

    /* renamed from: e, reason: collision with root package name */
    public final transient t<E> f20896e;

    public s0(t<E> tVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f20896e = tVar;
    }

    @Override // ie.y
    public y<E> D() {
        Comparator reverseOrder = Collections.reverseOrder(this.f20925c);
        return isEmpty() ? y.F(reverseOrder) : new s0(this.f20896e.F(), reverseOrder);
    }

    @Override // ie.y
    public y<E> I(E e10, boolean z10) {
        return S(0, T(e10, z10));
    }

    @Override // ie.y
    public y<E> L(E e10, boolean z10, E e11, boolean z11) {
        return O(e10, z10).I(e11, z11);
    }

    @Override // ie.y
    public y<E> O(E e10, boolean z10) {
        return S(V(e10, z10), size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public y0<E> descendingIterator() {
        return this.f20896e.F().iterator();
    }

    public s0<E> S(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new s0<>(this.f20896e.subList(i10, i11), this.f20925c) : y.F(this.f20925c);
    }

    public int T(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f20896e, he.n.l(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public int V(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f20896e, he.n.l(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final int W(Object obj) {
        return Collections.binarySearch(this.f20896e, obj, X());
    }

    public Comparator<Object> X() {
        return this.f20925c;
    }

    @Override // ie.w, ie.r
    public t<E> a() {
        return this.f20896e;
    }

    @Override // ie.r
    public int b(Object[] objArr, int i10) {
        return this.f20896e.b(objArr, i10);
    }

    @Override // ie.r
    public Object[] c() {
        return this.f20896e.c();
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        int V = V(e10, true);
        if (V == size()) {
            return null;
        }
        return this.f20896e.get(V);
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (W(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof i0) {
            collection = ((i0) collection).N1();
        }
        if (!w0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        y0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int P = P(next2, next);
                if (P < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (P == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (P > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // ie.r
    public int d() {
        return this.f20896e.d();
    }

    @Override // ie.r
    public int e() {
        return this.f20896e.e();
    }

    @Override // ie.w, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!w0.b(this.f20925c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            y0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || P(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // ie.r
    public boolean f() {
        return this.f20896e.f();
    }

    @Override // java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f20896e.get(0);
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        int T = T(e10, true) - 1;
        if (T == -1) {
            return null;
        }
        return this.f20896e.get(T);
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public y0<E> iterator() {
        return this.f20896e.iterator();
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        int V = V(e10, false);
        if (V == size()) {
            return null;
        }
        return this.f20896e.get(V);
    }

    @Override // java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f20896e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        int T = T(e10, false) - 1;
        if (T == -1) {
            return null;
        }
        return this.f20896e.get(T);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f20896e.size();
    }
}
