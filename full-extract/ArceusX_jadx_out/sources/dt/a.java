package dt;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a<K, V, V2> implements d<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, i<V>> f15390a;

    /* renamed from: dt.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0292a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, i<V>> f15391a;

        public AbstractC0292a(int i10) {
            this.f15391a = b.c(i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC0292a<K, V, V2> a(K k10, i<V> iVar) {
            this.f15391a.put(h.c(k10, "key"), (i) h.c(iVar, "provider"));
            return this;
        }
    }

    public a(Map<K, i<V>> map) {
        this.f15390a = Collections.unmodifiableMap(map);
    }

    public final Map<K, i<V>> a() {
        return this.f15390a;
    }
}
