package eb;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class s1 implements Comparator {
    public s1 a() {
        return new x1(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
