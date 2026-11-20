package s;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public c<K, V> f30806a;
    public c<K, V> b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f30807c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public int f30808d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f30811d;
        }

        @Override // s.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f30810c;
        }
    }

    /* renamed from: s.b$b, reason: collision with other inner class name */
    public static class C0546b<K, V> extends e<K, V> {
        public C0546b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f30810c;
        }

        @Override // s.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f30811d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final K f30809a;

        @NonNull
        public final V b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f30810c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f30811d;

        public c(@NonNull K k10, @NonNull V v5) {
            this.f30809a = k10;
            this.b = v5;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30809a.equals(cVar.f30809a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f30809a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f30809a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f30809a + "=" + this.b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f30812a;
        public boolean b = true;

        public d() {
        }

        @Override // s.b.f
        public void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f30812a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f30811d;
                this.f30812a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.b) {
                this.b = false;
                this.f30812a = b.this.f30806a;
            } else {
                c<K, V> cVar = this.f30812a;
                this.f30812a = cVar != null ? cVar.f30810c : null;
            }
            return this.f30812a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b) {
                return b.this.f30806a != null;
            }
            c<K, V> cVar = this.f30812a;
            return (cVar == null || cVar.f30810c == null) ? false : true;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f30814a;
        public c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f30814a = cVar2;
            this.b = cVar;
        }

        @Override // s.b.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.f30814a == cVar && cVar == this.b) {
                this.b = null;
                this.f30814a = null;
            }
            c<K, V> cVar2 = this.f30814a;
            if (cVar2 == cVar) {
                this.f30814a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = f();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = f();
            return cVar;
        }

        public final c<K, V> f() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.f30814a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f30806a;
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f30806a;
        while (cVar != null && !cVar.f30809a.equals(k10)) {
            cVar = cVar.f30810c;
        }
        return cVar;
    }

    @NonNull
    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f30807c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.b;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0546b c0546b = new C0546b(this.b, this.f30806a);
        this.f30807c.put(c0546b, Boolean.FALSE);
        return c0546b;
    }

    public c<K, V> e(@NonNull K k10, @NonNull V v5) {
        c<K, V> cVar = new c<>(k10, v5);
        this.f30808d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.f30806a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.f30810c = cVar;
        cVar.f30811d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V f(@NonNull K k10, @NonNull V v5) {
        c<K, V> b = b(k10);
        if (b != null) {
            return b.b;
        }
        e(k10, v5);
        return null;
    }

    public V g(@NonNull K k10) {
        c<K, V> b = b(k10);
        if (b == null) {
            return null;
        }
        this.f30808d--;
        if (!this.f30807c.isEmpty()) {
            Iterator<f<K, V>> it = this.f30807c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(b);
            }
        }
        c<K, V> cVar = b.f30811d;
        if (cVar != null) {
            cVar.f30810c = b.f30810c;
        } else {
            this.f30806a = b.f30810c;
        }
        c<K, V> cVar2 = b.f30810c;
        if (cVar2 != null) {
            cVar2.f30811d = cVar;
        } else {
            this.b = cVar;
        }
        b.f30810c = null;
        b.f30811d = null;
        return b.b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f30806a, this.b);
        this.f30807c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f30808d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
