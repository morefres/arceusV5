package dt;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, V> f15395a;

    public f(int i10) {
        this.f15395a = b.c(i10);
    }

    public static <K, V> f<K, V> b(int i10) {
        return new f<>(i10);
    }

    public Map<K, V> a() {
        return this.f15395a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f15395a);
    }

    public f<K, V> c(K k10, V v5) {
        this.f15395a.put(k10, v5);
        return this;
    }
}
