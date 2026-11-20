package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public List<j1<K, V>.d> f8524a;
    public Map<K, V> b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8525c;

    /* renamed from: d, reason: collision with root package name */
    public volatile j1<K, V>.f f8526d;

    /* renamed from: e, reason: collision with root package name */
    public Map<K, V> f8527e;

    /* renamed from: f, reason: collision with root package name */
    public volatile j1<K, V>.c f8528f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> k10 = k(i10);
                    if (((u.b) k10.getKey()).f()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((u.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    public class c extends j1<K, V>.f {
        public c() {
            super(j1.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }

        public /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry<K, V>, Comparable<j1<K, V>.d> {

        /* renamed from: a, reason: collision with root package name */
        public final K f8531a;
        public V b;

        public d(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(j1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f8531a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f8531a, entry.getKey()) && b(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f8531a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.b;
            return hashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            j1.this.g();
            V v10 = this.b;
            this.b = v5;
            return v10;
        }

        public String toString() {
            return this.f8531a + "=" + this.b;
        }

        public d(K k10, V v5) {
            this.f8531a = k10;
            this.b = v5;
        }
    }

    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.s(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j1.this.size();
        }

        public /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ j1(a aVar) {
        this();
    }

    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f8524a.isEmpty()) {
            this.f8524a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f8526d == null) {
            this.f8526d = new f(this, null);
        }
        return this.f8526d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != j1Var.l()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!k(i10).equals(j1Var.k(i10))) {
                return false;
            }
        }
        if (l10 != size) {
            return this.b.equals(j1Var.b);
        }
        return true;
    }

    public final int f(K k10) {
        int i10;
        int size = this.f8524a.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo(this.f8524a.get(i11).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = k10.compareTo(this.f8524a.get(i13).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void g() {
        if (this.f8525c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f8524a.get(f10).getValue() : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f8524a.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.b.hashCode() : i10;
    }

    public Set<Map.Entry<K, V>> i() {
        if (this.f8528f == null) {
            this.f8528f = new c(this, null);
        }
        return this.f8528f;
    }

    public final void j() {
        g();
        if (!this.f8524a.isEmpty() || (this.f8524a instanceof ArrayList)) {
            return;
        }
        this.f8524a = new ArrayList(16);
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f8524a.get(i10);
    }

    public int l() {
        return this.f8524a.size();
    }

    public int m() {
        return this.b.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public final SortedMap<K, V> o() {
        g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.f8527e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public boolean p() {
        return this.f8525c;
    }

    public void q() {
        if (this.f8525c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.b);
        this.f8527e = this.f8527e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8527e);
        this.f8525c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) t(f10);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    public V s(K k10, V v5) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f8524a.get(f10).setValue(v5);
        }
        j();
        int i10 = -(f10 + 1);
        if (i10 >= 16) {
            return o().put(k10, v5);
        }
        if (this.f8524a.size() == 16) {
            j1<K, V>.d remove = this.f8524a.remove(15);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f8524a.add(i10, new d(k10, v5));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8524a.size() + this.b.size();
    }

    public final V t(int i10) {
        g();
        V value = this.f8524a.remove(i10).getValue();
        if (!this.b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f8524a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f8529a;
        public Iterator<Map.Entry<K, V>> b;

        public b() {
            this.f8529a = j1.this.f8524a.size();
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.b == null) {
                this.b = j1.this.f8527e.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = j1.this.f8524a;
            int i10 = this.f8529a - 1;
            this.f8529a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f8529a;
            return (i10 > 0 && i10 <= j1.this.f8524a.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f8533a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f8534c;

        public e() {
            this.f8533a = -1;
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.f8534c == null) {
                this.f8534c = j1.this.b.entrySet().iterator();
            }
            return this.f8534c;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.b = true;
            int i10 = this.f8533a + 1;
            this.f8533a = i10;
            return i10 < j1.this.f8524a.size() ? (Map.Entry) j1.this.f8524a.get(this.f8533a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8533a + 1 < j1.this.f8524a.size() || (!j1.this.b.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            j1.this.g();
            if (this.f8533a >= j1.this.f8524a.size()) {
                b().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f8533a;
            this.f8533a = i10 - 1;
            j1Var.t(i10);
        }

        public /* synthetic */ e(j1 j1Var, a aVar) {
            this();
        }
    }

    public j1() {
        this.f8524a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.b = map;
        this.f8527e = map;
    }
}
