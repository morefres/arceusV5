package ie;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class l<T> extends m0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<T> f20859a;

    public l(Comparator<T> comparator) {
        this.f20859a = (Comparator) he.n.l(comparator);
    }

    @Override // ie.m0, java.util.Comparator
    public int compare(T t8, T t10) {
        return this.f20859a.compare(t8, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f20859a.equals(((l) obj).f20859a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20859a.hashCode();
    }

    public String toString() {
        return this.f20859a.toString();
    }
}
