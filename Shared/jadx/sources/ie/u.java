package ie;

import ie.r;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class u<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f20906d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    public transient w<Map.Entry<K, V>> f20907a;
    public transient w<K> b;

    /* renamed from: c, reason: collision with root package name */
    public transient r<V> f20908c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Comparator<? super V> f20909a;
        public Object[] b;

        /* renamed from: c, reason: collision with root package name */
        public int f20910c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20911d;

        /* renamed from: e, reason: collision with root package name */
        public C0364a f20912e;

        /* renamed from: ie.u$a$a, reason: collision with other inner class name */
        public static final class C0364a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f20913a;
            public final Object b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f20914c;

            public C0364a(Object obj, Object obj2, Object obj3) {
                this.f20913a = obj;
                this.b = obj2;
                this.f20914c = obj3;
            }

            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f20913a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.f20913a);
                String valueOf4 = String.valueOf(this.f20914c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        public static <V> void j(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, m0.a(comparator).e(f0.e()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public u<K, V> a() {
            return c();
        }

        public final u<K, V> b(boolean z10) {
            Object[] objArr;
            C0364a c0364a;
            C0364a c0364a2;
            if (z10 && (c0364a2 = this.f20912e) != null) {
                throw c0364a2.a();
            }
            int i10 = this.f20910c;
            if (this.f20909a == null) {
                objArr = this.b;
            } else {
                if (this.f20911d) {
                    this.b = Arrays.copyOf(this.b, i10 * 2);
                }
                objArr = this.b;
                if (!z10) {
                    objArr = e(objArr, this.f20910c);
                    if (objArr.length < this.b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                j(objArr, i10, this.f20909a);
            }
            this.f20911d = true;
            q0 r8 = q0.r(i10, objArr, this);
            if (!z10 || (c0364a = this.f20912e) == null) {
                return r8;
            }
            throw c0364a.a();
        }

        public u<K, V> c() {
            return b(true);
        }

        public final void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.b;
            if (i11 > objArr.length) {
                this.b = Arrays.copyOf(objArr, r.b.c(objArr.length, i11));
                this.f20911d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public a<K, V> f(K k10, V v5) {
            d(this.f20910c + 1);
            g.a(k10, v5);
            Object[] objArr = this.b;
            int i10 = this.f20910c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v5;
            this.f20910c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f20910c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public a<K, V> i(Map<? extends K, ? extends V> map) {
            return h(map.entrySet());
        }

        public a(int i10) {
            this.b = new Object[i10 * 2];
            this.f20910c = 0;
            this.f20911d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> a<K, V> b(int i10) {
        g.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> u<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> u<K, V> j() {
        return (u<K, V>) q0.f20870h;
    }

    public static <K, V> u<K, V> k(K k10, V v5) {
        g.a(k10, v5);
        return q0.q(1, new Object[]{k10, v5});
    }

    public static <K, V> u<K, V> l(K k10, V v5, K k11, V v10, K k12, V v11) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        return q0.q(3, new Object[]{k10, v5, k11, v10, k12, v11});
    }

    public static <K, V> u<K, V> m(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        g.a(k13, v12);
        return q0.q(4, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12});
    }

    public static <K, V> u<K, V> n(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        g.a(k13, v12);
        g.a(k14, v13);
        return q0.q(5, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12, k14, v13});
    }

    @SafeVarargs
    public static <K, V> u<K, V> o(Map.Entry<? extends K, ? extends V>... entryArr) {
        return c(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract w<Map.Entry<K, V>> d();

    public abstract w<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return f0.a(this, obj);
    }

    public abstract r<V> f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f20907a;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> d10 = d();
        this.f20907a = d10;
        return d10;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v5) {
        V v10 = get(obj);
        return v10 != null ? v10 : v5;
    }

    @Override // java.util.Map
    public int hashCode() {
        return t0.b(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.b;
        if (wVar != null) {
            return wVar;
        }
        w<K> e10 = e();
        this.b = e10;
        return e10;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public r<V> values() {
        r<V> rVar = this.f20908c;
        if (rVar != null) {
            return rVar;
        }
        r<V> f10 = f();
        this.f20908c = f10;
        return f10;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return f0.d(this);
    }
}
