package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class p6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f7252a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Map f7253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7254d;

    /* renamed from: e, reason: collision with root package name */
    public volatile n6 f7255e;

    /* renamed from: f, reason: collision with root package name */
    public Map f7256f;

    public /* synthetic */ p6(o6 o6Var) {
        Map map = Collections.EMPTY_MAP;
        this.f7253c = map;
        this.f7256f = map;
    }

    public void a() {
        if (this.f7254d) {
            return;
        }
        this.f7253c = this.f7253c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7253c);
        this.f7256f = this.f7256f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7256f);
        this.f7254d = true;
    }

    public final int c() {
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p();
        if (this.b != 0) {
            this.f7252a = null;
            this.b = 0;
        }
        if (this.f7253c.isEmpty()) {
            return;
        }
        this.f7253c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f7253c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f7253c.isEmpty() ? Collections.EMPTY_SET : this.f7253c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7255e == null) {
            this.f7255e = new n6(this, null);
        }
        return this.f7255e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return super.equals(obj);
        }
        p6 p6Var = (p6) obj;
        int size = size();
        if (size != p6Var.size()) {
            return false;
        }
        int i10 = this.b;
        if (i10 != p6Var.b) {
            return entrySet().equals(p6Var.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(p6Var.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f7253c.equals(p6Var.f7253c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        p();
        int m10 = m(comparable);
        if (m10 >= 0) {
            return ((k6) this.f7252a[m10]).setValue(obj);
        }
        p();
        if (this.f7252a == null) {
            this.f7252a = new Object[16];
        }
        int i10 = -(m10 + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.b == 16) {
            k6 k6Var = (k6) this.f7252a[15];
            this.b = 15;
            o().put(k6Var.a(), k6Var.getValue());
        }
        Object[] objArr = this.f7252a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f7252a[i10] = new k6(this, comparable, obj);
        this.b++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.b) {
            return (k6) this.f7252a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m10 = m(comparable);
        return m10 >= 0 ? ((k6) this.f7252a[m10]).getValue() : this.f7253c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.f7252a[i12].hashCode();
        }
        return this.f7253c.size() > 0 ? i11 + this.f7253c.hashCode() : i11;
    }

    public final boolean k() {
        return this.f7254d;
    }

    public final int m(Comparable comparable) {
        int i10 = this.b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((k6) this.f7252a[i11]).a());
            if (compareTo > 0) {
                return -(i10 + 1);
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((k6) this.f7252a[i13]).a());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    public final Object n(int i10) {
        p();
        Object value = ((k6) this.f7252a[i10]).getValue();
        Object[] objArr = this.f7252a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.b - i10) - 1);
        this.b--;
        if (!this.f7253c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f7252a;
            int i11 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new k6(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return value;
    }

    public final SortedMap o() {
        p();
        if (this.f7253c.isEmpty() && !(this.f7253c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7253c = treeMap;
            this.f7256f = treeMap.descendingMap();
        }
        return (SortedMap) this.f7253c;
    }

    public final void p() {
        if (this.f7254d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int m10 = m(comparable);
        if (m10 >= 0) {
            return n(m10);
        }
        if (this.f7253c.isEmpty()) {
            return null;
        }
        return this.f7253c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.f7253c.size();
    }
}
