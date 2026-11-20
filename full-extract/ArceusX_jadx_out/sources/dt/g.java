package dt;

import dt.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g<K, V> extends dt.a<K, V, V> {
    public static final i<Map<Object, Object>> b = e.a(Collections.EMPTY_MAP);

    public static final class b<K, V> extends a.AbstractC0292a<K, V, V> {
        public g<K, V> b() {
            return new g<>(this.f15391a);
        }

        public b<K, V> c(K k10, i<V> iVar) {
            super.a(k10, iVar);
            return this;
        }

        public b(int i10) {
            super(i10);
        }
    }

    public static <K, V> b<K, V> b(int i10) {
        return new b<>(i10);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap c10 = dt.b.c(a().size());
        for (Map.Entry<K, i<V>> entry : a().entrySet()) {
            c10.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(c10);
    }

    public g(Map<K, i<V>> map) {
        super(map);
    }
}
