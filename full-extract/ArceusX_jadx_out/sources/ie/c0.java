package ie;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c0<T> extends m0<Iterable<T>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f20827a;

    public c0(Comparator<? super T> comparator) {
        this.f20827a = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f20827a.equals(((c0) obj).f20827a);
        }
        return false;
    }

    @Override // ie.m0, java.util.Comparator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.f20827a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    public int hashCode() {
        return this.f20827a.hashCode() ^ 2075626741;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f20827a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
        sb2.append(valueOf);
        sb2.append(".lexicographical()");
        return sb2.toString();
    }
}
