package ie;

import ie.u;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class q<K, V> extends u<K, V> implements Map {

    public static final class a<K, V> extends u.a<K, V> {
        @Override // ie.u.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public q<K, V> a() {
            return c();
        }

        @Override // ie.u.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public q<K, V> c() {
            int i10 = this.f20910c;
            if (i10 == 0) {
                return q.s();
            }
            if (this.f20909a != null) {
                if (this.f20911d) {
                    this.b = Arrays.copyOf(this.b, i10 * 2);
                }
                u.a.j(this.b, this.f20910c, this.f20909a);
            }
            this.f20911d = true;
            return new o0(this.b, this.f20910c);
        }

        @Override // ie.u.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k10, V v5) {
            super.f(k10, v5);
            return this;
        }

        @Override // ie.u.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // ie.u.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.h(iterable);
            return this;
        }

        @Override // ie.u.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Map<? extends K, ? extends V> map) {
            super.i(map);
            return this;
        }
    }

    public static <K, V> q<K, V> s() {
        return o0.f20861j;
    }

    @Override // ie.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final w<V> f() {
        throw new AssertionError("should never be called");
    }

    public abstract q<V, K> r();

    @Override // ie.u, java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public w<V> values() {
        return r().keySet();
    }
}
