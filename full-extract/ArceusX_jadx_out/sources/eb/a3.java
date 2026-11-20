package eb;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15769a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String concat = a3.class.getName().concat("$UnsafeComparator");
        f15769a = concat;
        try {
            Object[] enumConstants = Class.forName(concat).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = z2.INSTANCE;
        }
        b = comparator;
    }
}
