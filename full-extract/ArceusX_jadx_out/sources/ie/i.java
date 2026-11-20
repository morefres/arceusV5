package ie;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class i<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f20831j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f20832a;
    public transient int[] b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f20833c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f20834d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f20835e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f20836f;

    /* renamed from: g, reason: collision with root package name */
    public transient Set<K> f20837g;

    /* renamed from: h, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f20838h;

    /* renamed from: i, reason: collision with root package name */
    public transient Collection<V> f20839i;

    public class a extends i<K, V>.e<K> {
        public a() {
            super(i.this, null);
        }

        @Override // ie.i.e
        public K d(int i10) {
            return (K) i.this.I(i10);
        }
    }

    public class b extends i<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(i.this, null);
        }

        @Override // ie.i.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> d(int i10) {
            return new g(i10);
        }
    }

    public class c extends i<K, V>.e<V> {
        public c() {
            super(i.this, null);
        }

        @Override // ie.i.e
        public V d(int i10) {
            return (V) i.this.Y(i10);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> y10 = i.this.y();
            if (y10 != null) {
                return y10.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int F = i.this.F(entry.getKey());
                if (F != -1 && he.j.a(i.this.Y(F), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return i.this.A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int D;
            int f10;
            Map<K, V> y10 = i.this.y();
            if (y10 != null) {
                return y10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (i.this.L() || (f10 = k.f(entry.getKey(), entry.getValue(), (D = i.this.D()), i.this.P(), i.this.N(), i.this.O(), i.this.Q())) == -1) {
                return false;
            }
            i.this.K(f10, D);
            i.e(i.this);
            i.this.E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size();
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return i.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> y10 = i.this.y();
            return y10 != null ? y10.keySet().remove(obj) : i.this.M(obj) != i.f20831j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size();
        }
    }

    public final class g extends ie.c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f20848a;
        public int b;

        public g(int i10) {
            this.f20848a = (K) i.this.I(i10);
            this.b = i10;
        }

        public final void a() {
            int i10 = this.b;
            if (i10 == -1 || i10 >= i.this.size() || !he.j.a(this.f20848a, i.this.I(this.b))) {
                this.b = i.this.F(this.f20848a);
            }
        }

        @Override // ie.c, java.util.Map.Entry
        public K getKey() {
            return this.f20848a;
        }

        @Override // ie.c, java.util.Map.Entry
        public V getValue() {
            Map<K, V> y10 = i.this.y();
            if (y10 != null) {
                return (V) k0.a(y10.get(this.f20848a));
            }
            a();
            int i10 = this.b;
            return i10 == -1 ? (V) k0.b() : (V) i.this.Y(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            Map<K, V> y10 = i.this.y();
            if (y10 != null) {
                return (V) k0.a(y10.put(this.f20848a, v5));
            }
            a();
            int i10 = this.b;
            if (i10 == -1) {
                i.this.put(this.f20848a, v5);
                return (V) k0.b();
            }
            V v10 = (V) i.this.Y(i10);
            i.this.X(this.b, v5);
            return v10;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return i.this.Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return i.this.size();
        }
    }

    public i() {
        G(3);
    }

    public static /* synthetic */ int e(i iVar) {
        int i10 = iVar.f20836f;
        iVar.f20836f = i10 - 1;
        return i10;
    }

    public static <K, V> i<K, V> s() {
        return new i<>();
    }

    public Iterator<Map.Entry<K, V>> A() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.entrySet().iterator() : new b();
    }

    public int B() {
        return isEmpty() ? -1 : 0;
    }

    public int C(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20836f) {
            return i11;
        }
        return -1;
    }

    public final int D() {
        return (1 << (this.f20835e & 31)) - 1;
    }

    public void E() {
        this.f20835e += 32;
    }

    public final int F(Object obj) {
        if (L()) {
            return -1;
        }
        int c10 = p.c(obj);
        int D = D();
        int h10 = k.h(P(), c10 & D);
        if (h10 == 0) {
            return -1;
        }
        int b10 = k.b(c10, D);
        do {
            int i10 = h10 - 1;
            int z10 = z(i10);
            if (k.b(z10, D) == b10 && he.j.a(obj, I(i10))) {
                return i10;
            }
            h10 = k.c(z10, D);
        } while (h10 != 0);
        return -1;
    }

    public void G(int i10) {
        he.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f20835e = me.a.a(i10, 1, 1073741823);
    }

    public void H(int i10, K k10, V v5, int i11, int i12) {
        U(i10, k.d(i11, 0, i12));
        W(i10, k10);
        X(i10, v5);
    }

    public final K I(int i10) {
        return (K) O()[i10];
    }

    public Iterator<K> J() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.keySet().iterator() : new a();
    }

    public void K(int i10, int i11) {
        Object P = P();
        int[] N = N();
        Object[] O = O();
        Object[] Q = Q();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            O[i10] = null;
            Q[i10] = null;
            N[i10] = 0;
            return;
        }
        Object obj = O[i12];
        O[i10] = obj;
        Q[i10] = Q[i12];
        O[i12] = null;
        Q[i12] = null;
        N[i10] = N[i12];
        N[i12] = 0;
        int c10 = p.c(obj) & i11;
        int h10 = k.h(P, c10);
        if (h10 == size) {
            k.i(P, c10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = h10 - 1;
            int i14 = N[i13];
            int c11 = k.c(i14, i11);
            if (c11 == size) {
                N[i13] = k.d(i14, i10 + 1, i11);
                return;
            }
            h10 = c11;
        }
    }

    public boolean L() {
        return this.f20832a == null;
    }

    public final Object M(Object obj) {
        int D;
        int f10;
        if (!L() && (f10 = k.f(obj, null, (D = D()), P(), N(), O(), null)) != -1) {
            V Y = Y(f10);
            K(f10, D);
            this.f20836f--;
            E();
            return Y;
        }
        return f20831j;
    }

    public final int[] N() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] O() {
        Object[] objArr = this.f20833c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object P() {
        Object obj = this.f20832a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] Q() {
        Object[] objArr = this.f20834d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void R(int i10) {
        this.b = Arrays.copyOf(N(), i10);
        this.f20833c = Arrays.copyOf(O(), i10);
        this.f20834d = Arrays.copyOf(Q(), i10);
    }

    public final void S(int i10) {
        int min;
        int length = N().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        R(min);
    }

    public final int T(int i10, int i11, int i12, int i13) {
        Object a10 = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(a10, i12 & i14, i13 + 1);
        }
        Object P = P();
        int[] N = N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = k.h(P, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = N[i16];
                int b10 = k.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = k.h(a10, i18);
                k.i(a10, i18, h10);
                N[i16] = k.d(b10, h11, i14);
                h10 = k.c(i17, i10);
            }
        }
        this.f20832a = a10;
        V(i14);
        return i14;
    }

    public final void U(int i10, int i11) {
        N()[i10] = i11;
    }

    public final void V(int i10) {
        this.f20835e = k.d(this.f20835e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void W(int i10, K k10) {
        O()[i10] = k10;
    }

    public final void X(int i10, V v5) {
        Q()[i10] = v5;
    }

    public final V Y(int i10) {
        return (V) Q()[i10];
    }

    public Iterator<V> Z() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        E();
        Map<K, V> y10 = y();
        if (y10 != null) {
            this.f20835e = me.a.a(size(), 3, 1073741823);
            y10.clear();
            this.f20832a = null;
            this.f20836f = 0;
            return;
        }
        Arrays.fill(O(), 0, this.f20836f, (Object) null);
        Arrays.fill(Q(), 0, this.f20836f, (Object) null);
        k.g(P());
        Arrays.fill(N(), 0, this.f20836f, 0);
        this.f20836f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> y10 = y();
        return y10 != null ? y10.containsKey(obj) : F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f20836f; i10++) {
            if (he.j.a(obj, Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20838h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> t8 = t();
        this.f20838h = t8;
        return t8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.get(obj);
        }
        int F = F(obj);
        if (F == -1) {
            return null;
        }
        o(F);
        return Y(F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20837g;
        if (set != null) {
            return set;
        }
        Set<K> w5 = w();
        this.f20837g = w5;
        return w5;
    }

    public void o(int i10) {
    }

    public int p(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        if (L()) {
            q();
        }
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.put(k10, v5);
        }
        int[] N = N();
        Object[] O = O();
        Object[] Q = Q();
        int i10 = this.f20836f;
        int i11 = i10 + 1;
        int c10 = p.c(k10);
        int D = D();
        int i12 = c10 & D;
        int h10 = k.h(P(), i12);
        if (h10 != 0) {
            int b10 = k.b(c10, D);
            int i13 = 0;
            while (true) {
                int i14 = h10 - 1;
                int i15 = N[i14];
                if (k.b(i15, D) == b10 && he.j.a(k10, O[i14])) {
                    V v10 = (V) Q[i14];
                    Q[i14] = v5;
                    o(i14);
                    return v10;
                }
                int c11 = k.c(i15, D);
                i13++;
                if (c11 != 0) {
                    k10 = k10;
                    v5 = v5;
                    h10 = c11;
                } else {
                    if (i13 >= 9) {
                        return r().put(k10, v5);
                    }
                    if (i11 > D) {
                        D = T(D, k.e(D), c10, i10);
                    } else {
                        N[i14] = k.d(i15, i11, D);
                    }
                }
            }
        } else if (i11 > D) {
            D = T(D, k.e(D), c10, i10);
        } else {
            k.i(P(), i12, i11);
        }
        int i16 = D;
        S(i11);
        H(i10, k10, v5, c10, i16);
        this.f20836f = i11;
        E();
        return null;
    }

    public int q() {
        he.n.s(L(), "Arrays already allocated");
        int i10 = this.f20835e;
        int j10 = k.j(i10);
        this.f20832a = k.a(j10);
        V(j10 - 1);
        this.b = new int[i10];
        this.f20833c = new Object[i10];
        this.f20834d = new Object[i10];
        return i10;
    }

    public Map<K, V> r() {
        Map<K, V> u8 = u(D() + 1);
        int B = B();
        while (B >= 0) {
            u8.put(I(B), Y(B));
            B = C(B);
        }
        this.f20832a = u8;
        this.b = null;
        this.f20833c = null;
        this.f20834d = null;
        E();
        return u8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.remove(obj);
        }
        V v5 = (V) M(obj);
        if (v5 == f20831j) {
            return null;
        }
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.size() : this.f20836f;
    }

    public Set<Map.Entry<K, V>> t() {
        return new d();
    }

    public Map<K, V> u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f20839i;
        if (collection != null) {
            return collection;
        }
        Collection<V> x10 = x();
        this.f20839i = x10;
        return x10;
    }

    public Set<K> w() {
        return new f();
    }

    public Collection<V> x() {
        return new h();
    }

    public Map<K, V> y() {
        Object obj = this.f20832a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int z(int i10) {
        return N()[i10];
    }

    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f20844a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f20845c;

        public e() {
            this.f20844a = i.this.f20835e;
            this.b = i.this.B();
            this.f20845c = -1;
        }

        public final void b() {
            if (i.this.f20835e != this.f20844a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T d(int i10);

        public void e() {
            this.f20844a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.b;
            this.f20845c = i10;
            T d10 = d(i10);
            this.b = i.this.C(this.b);
            return d10;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            ie.g.c(this.f20845c >= 0);
            e();
            i iVar = i.this;
            iVar.remove(iVar.I(this.f20845c));
            this.b = i.this.p(this.b, this.f20845c);
            this.f20845c = -1;
        }

        public /* synthetic */ e(i iVar, a aVar) {
            this();
        }
    }
}
