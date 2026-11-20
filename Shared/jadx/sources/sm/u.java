package sm;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f31512i = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f31513a;
    public g<K, V>[] b;

    /* renamed from: c, reason: collision with root package name */
    public final g<K, V> f31514c;

    /* renamed from: d, reason: collision with root package name */
    public int f31515d;

    /* renamed from: e, reason: collision with root package name */
    public int f31516e;

    /* renamed from: f, reason: collision with root package name */
    public int f31517f;

    /* renamed from: g, reason: collision with root package name */
    public u<K, V>.d f31518g;

    /* renamed from: h, reason: collision with root package name */
    public u<K, V>.e f31519h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f31520a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f31521c;

        /* renamed from: d, reason: collision with root package name */
        public int f31522d;

        public void a(g<K, V> gVar) {
            gVar.f31532c = null;
            gVar.f31531a = null;
            gVar.b = null;
            gVar.f31538i = 1;
            int i10 = this.b;
            if (i10 > 0) {
                int i11 = this.f31522d;
                if ((i11 & 1) == 0) {
                    this.f31522d = i11 + 1;
                    this.b = i10 - 1;
                    this.f31521c++;
                }
            }
            gVar.f31531a = this.f31520a;
            this.f31520a = gVar;
            int i12 = this.f31522d;
            int i13 = i12 + 1;
            this.f31522d = i13;
            int i14 = this.b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f31522d = i12 + 2;
                this.b = i14 - 1;
                this.f31521c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f31522d & i16) != i16) {
                    return;
                }
                int i17 = this.f31521c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f31520a;
                    g<K, V> gVar3 = gVar2.f31531a;
                    g<K, V> gVar4 = gVar3.f31531a;
                    gVar3.f31531a = gVar4.f31531a;
                    this.f31520a = gVar3;
                    gVar3.b = gVar4;
                    gVar3.f31532c = gVar2;
                    gVar3.f31538i = gVar2.f31538i + 1;
                    gVar4.f31531a = gVar3;
                    gVar2.f31531a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f31520a;
                    g<K, V> gVar6 = gVar5.f31531a;
                    this.f31520a = gVar6;
                    gVar6.f31532c = gVar5;
                    gVar6.f31538i = gVar5.f31538i + 1;
                    gVar5.f31531a = gVar6;
                    this.f31521c = 0;
                } else if (i17 == 2) {
                    this.f31521c = 0;
                }
                i15 *= 2;
            }
        }

        public void b(int i10) {
            this.b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f31522d = 0;
            this.f31521c = 0;
            this.f31520a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f31520a;
            if (gVar.f31531a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f31523a;

        public g<K, V> a() {
            g<K, V> gVar = this.f31523a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f31531a;
            gVar.f31531a = null;
            g<K, V> gVar3 = gVar.f31532c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f31523a = gVar4;
                    return gVar;
                }
                gVar2.f31531a = gVar4;
                gVar3 = gVar2.b;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f31531a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.f31523a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends u<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && u.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> e10;
            if (!(obj instanceof Map.Entry) || (e10 = u.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            u.this.i(e10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f31515d;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends u<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f31535f;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return u.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f31515d;
        }
    }

    public abstract class f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f31528a;
        public g<K, V> b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f31529c;

        public f() {
            this.f31528a = u.this.f31514c.f31533d;
            this.f31529c = u.this.f31516e;
        }

        public final g<K, V> b() {
            g<K, V> gVar = this.f31528a;
            u uVar = u.this;
            if (gVar == uVar.f31514c) {
                throw new NoSuchElementException();
            }
            if (uVar.f31516e != this.f31529c) {
                throw new ConcurrentModificationException();
            }
            this.f31528a = gVar.f31533d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f31528a != u.this.f31514c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            u.this.i(gVar, true);
            this.b = null;
            this.f31529c = u.this.f31516e;
        }
    }

    public u() {
        this(null);
    }

    public static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> a10 = cVar.a();
                    if (a10 == null) {
                        break;
                    }
                    if ((a10.f31536g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a11 = cVar.a();
                    if (a11 == null) {
                        break;
                    }
                    if ((a11.f31536g & length) == 0) {
                        bVar.a(a11);
                    } else {
                        bVar2.a(a11);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    public static int n(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public final void a() {
        g<K, V>[] b10 = b(this.b);
        this.b = b10;
        this.f31517f = (b10.length / 2) + (b10.length / 4);
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.b, (Object) null);
        this.f31515d = 0;
        this.f31516e++;
        g<K, V> gVar = this.f31514c;
        g<K, V> gVar2 = gVar.f31533d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f31533d;
            gVar2.f31534e = null;
            gVar2.f31533d = null;
            gVar2 = gVar3;
        }
        gVar.f31534e = gVar;
        gVar.f31533d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    public g<K, V> d(K k10, boolean z10) {
        int i10;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f31513a;
        g<K, V>[] gVarArr = this.b;
        int n10 = n(k10.hashCode());
        int length = (gVarArr.length - 1) & n10;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f31512i ? (Comparable) k10 : null;
            while (true) {
                i10 = comparable != null ? comparable.compareTo(gVar2.f31535f) : comparator.compare(k10, gVar2.f31535f);
                if (i10 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i10 < 0 ? gVar2.b : gVar2.f31532c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i10 = 0;
        }
        int i11 = i10;
        if (!z10) {
            return null;
        }
        g<K, V> gVar4 = this.f31514c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, n10, gVar4, gVar4.f31534e);
            if (i11 < 0) {
                gVar5.b = gVar;
            } else {
                gVar5.f31532c = gVar;
            }
            g(gVar5, true);
        } else {
            if (comparator == f31512i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, n10, gVar4, gVar4.f31534e);
            gVarArr[length] = gVar;
        }
        int i12 = this.f31515d;
        this.f31515d = i12 + 1;
        if (i12 > this.f31517f) {
            a();
        }
        this.f31516e++;
        return gVar;
    }

    public g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> f10 = f(entry.getKey());
        if (f10 == null || !c(f10.f31537h, entry.getValue())) {
            return null;
        }
        return f10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        u<K, V>.d dVar = this.f31518g;
        if (dVar != null) {
            return dVar;
        }
        u<K, V>.d dVar2 = new d();
        this.f31518g = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.b;
            g<K, V> gVar3 = gVar.f31532c;
            int i10 = gVar2 != null ? gVar2.f31538i : 0;
            int i11 = gVar3 != null ? gVar3.f31538i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.b;
                g<K, V> gVar5 = gVar3.f31532c;
                int i13 = (gVar4 != null ? gVar4.f31538i : 0) - (gVar5 != null ? gVar5.f31538i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m(gVar3);
                }
                l(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.b;
                g<K, V> gVar7 = gVar2.f31532c;
                int i14 = (gVar6 != null ? gVar6.f31538i : 0) - (gVar7 != null ? gVar7.f31538i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    l(gVar2);
                }
                m(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f31538i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f31538i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f31531a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> f10 = f(obj);
        if (f10 != null) {
            return f10.f31537h;
        }
        return null;
    }

    public void i(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f31534e;
            gVar2.f31533d = gVar.f31533d;
            gVar.f31533d.f31534e = gVar2;
            gVar.f31534e = null;
            gVar.f31533d = null;
        }
        g<K, V> gVar3 = gVar.b;
        g<K, V> gVar4 = gVar.f31532c;
        g<K, V> gVar5 = gVar.f31531a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                k(gVar, gVar3);
                gVar.b = null;
            } else if (gVar4 != null) {
                k(gVar, gVar4);
                gVar.f31532c = null;
            } else {
                k(gVar, null);
            }
            g(gVar5, false);
            this.f31515d--;
            this.f31516e++;
            return;
        }
        g<K, V> b10 = gVar3.f31538i > gVar4.f31538i ? gVar3.b() : gVar4.a();
        i(b10, false);
        g<K, V> gVar6 = gVar.b;
        if (gVar6 != null) {
            i10 = gVar6.f31538i;
            b10.b = gVar6;
            gVar6.f31531a = b10;
            gVar.b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f31532c;
        if (gVar7 != null) {
            i11 = gVar7.f31538i;
            b10.f31532c = gVar7;
            gVar7.f31531a = b10;
            gVar.f31532c = null;
        }
        b10.f31538i = Math.max(i10, i11) + 1;
        k(gVar, b10);
    }

    public g<K, V> j(Object obj) {
        g<K, V> f10 = f(obj);
        if (f10 != null) {
            i(f10, true);
        }
        return f10;
    }

    public final void k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f31531a;
        gVar.f31531a = null;
        if (gVar2 != null) {
            gVar2.f31531a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f31536g;
            this.b[i10 & (r0.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.f31532c = gVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        u<K, V>.e eVar = this.f31519h;
        if (eVar != null) {
            return eVar;
        }
        u<K, V>.e eVar2 = new e();
        this.f31519h = eVar2;
        return eVar2;
    }

    public final void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f31532c;
        g<K, V> gVar4 = gVar3.b;
        g<K, V> gVar5 = gVar3.f31532c;
        gVar.f31532c = gVar4;
        if (gVar4 != null) {
            gVar4.f31531a = gVar;
        }
        k(gVar, gVar3);
        gVar3.b = gVar;
        gVar.f31531a = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.f31538i : 0, gVar4 != null ? gVar4.f31538i : 0) + 1;
        gVar.f31538i = max;
        gVar3.f31538i = Math.max(max, gVar5 != null ? gVar5.f31538i : 0) + 1;
    }

    public final void m(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f31532c;
        g<K, V> gVar4 = gVar2.b;
        g<K, V> gVar5 = gVar2.f31532c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.f31531a = gVar;
        }
        k(gVar, gVar2);
        gVar2.f31532c = gVar;
        gVar.f31531a = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.f31538i : 0, gVar5 != null ? gVar5.f31538i : 0) + 1;
        gVar.f31538i = max;
        gVar2.f31538i = Math.max(max, gVar4 != null ? gVar4.f31538i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> d10 = d(k10, true);
        V v10 = d10.f31537h;
        d10.f31537h = v5;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> j10 = j(obj);
        if (j10 != null) {
            return j10.f31537h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31515d;
    }

    public u(Comparator<? super K> comparator) {
        this.f31515d = 0;
        this.f31516e = 0;
        this.f31513a = comparator == null ? f31512i : comparator;
        this.f31514c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.b = gVarArr;
        this.f31517f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f31531a;
        public g<K, V> b;

        /* renamed from: c, reason: collision with root package name */
        public g<K, V> f31532c;

        /* renamed from: d, reason: collision with root package name */
        public g<K, V> f31533d;

        /* renamed from: e, reason: collision with root package name */
        public g<K, V> f31534e;

        /* renamed from: f, reason: collision with root package name */
        public final K f31535f;

        /* renamed from: g, reason: collision with root package name */
        public final int f31536g;

        /* renamed from: h, reason: collision with root package name */
        public V f31537h;

        /* renamed from: i, reason: collision with root package name */
        public int f31538i;

        public g() {
            this.f31535f = null;
            this.f31536g = -1;
            this.f31534e = this;
            this.f31533d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.b; gVar2 != null; gVar2 = gVar2.b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f31532c; gVar2 != null; gVar2 = gVar2.f31532c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f31535f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v5 = this.f31537h;
                    if (v5 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v5.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f31535f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f31537h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f31535f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.f31537h;
            return hashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            V v10 = this.f31537h;
            this.f31537h = v5;
            return v10;
        }

        public String toString() {
            return this.f31535f + "=" + this.f31537h;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f31531a = gVar;
            this.f31535f = k10;
            this.f31536g = i10;
            this.f31538i = 1;
            this.f31533d = gVar2;
            this.f31534e = gVar3;
            gVar3.f31533d = this;
            gVar2.f31534e = this;
        }
    }
}
