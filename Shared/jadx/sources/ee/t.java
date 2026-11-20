package ee;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class t extends p implements Set {
    public transient s b;

    public static t g() {
        return v.f16005f;
    }

    public final s e() {
        s sVar = this.b;
        if (sVar != null) {
            return sVar;
        }
        s f10 = f();
        this.b = f10;
        return f10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            ((t) obj).h();
            if (obj.hashCode() != 0) {
                return false;
            }
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

    public abstract s f();

    public abstract boolean h();
}
