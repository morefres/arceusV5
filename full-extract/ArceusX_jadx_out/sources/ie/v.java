package ie;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class v<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient u<K, ? extends r<V>> f20916a;
    public final transient int b;

    public class a extends y0<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends r<V>>> f20917a;
        public K b = null;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<V> f20918c = b0.c();

        public a() {
            this.f20917a = v.this.f20916a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f20918c.hasNext()) {
                Map.Entry<K, ? extends r<V>> next = this.f20917a.next();
                this.b = next.getKey();
                this.f20918c = next.getValue().iterator();
            }
            K k10 = this.b;
            Objects.requireNonNull(k10);
            return f0.b(k10, this.f20918c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20918c.hasNext() || this.f20917a.hasNext();
        }
    }

    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, Collection<V>> f20920a = n0.d();
        public Comparator<? super K> b;

        /* renamed from: c, reason: collision with root package name */
        public Comparator<? super V> f20921c;

        public Collection<V> a() {
            throw null;
        }

        public b<K, V> b(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                String valueOf = String.valueOf(a0.c(iterable));
                throw new NullPointerException(valueOf.length() != 0 ? "null key in entry: null=".concat(valueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f20920a.get(k10);
            if (collection != null) {
                for (V v5 : iterable) {
                    g.a(k10, v5);
                    collection.add(v5);
                }
            } else {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> a10 = a();
                    while (it.hasNext()) {
                        V next = it.next();
                        g.a(k10, next);
                        a10.add(next);
                    }
                    this.f20920a.put(k10, a10);
                    return this;
                }
            }
            return this;
        }
    }

    public v(u<K, ? extends r<V>> uVar, int i10) {
        this.f20916a = uVar;
        this.b = i10;
    }

    @Override // ie.d
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // ie.d, ie.g0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> a() {
        return this.f20916a;
    }

    public y0<Map.Entry<K, V>> d() {
        return new a();
    }

    public int e() {
        return this.b;
    }

    @Override // ie.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ie.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // ie.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
