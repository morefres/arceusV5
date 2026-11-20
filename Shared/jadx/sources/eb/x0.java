package eb;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class x0 extends s1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f15941a;

    public x0(Comparator comparator) {
        comparator.getClass();
        this.f15941a = comparator;
    }

    @Override // eb.s1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15941a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f15941a.equals(((x0) obj).f15941a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15941a.hashCode();
    }

    public final String toString() {
        return this.f15941a.toString();
    }
}
