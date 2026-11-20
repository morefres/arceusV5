package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class hd extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f6523a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Map f6524c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6525d;

    /* renamed from: e, reason: collision with root package name */
    public volatile gd f6526e;

    /* renamed from: f, reason: collision with root package name */
    public Map f6527f;

    public /* synthetic */ hd(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f6524c = map;
        this.f6527f = map;
    }

    public void a() {
        if (this.f6525d) {
            return;
        }
        this.f6524c = this.f6524c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6524c);
        this.f6527f = this.f6527f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6527f);
        this.f6525d = true;
    }

    public final boolean b() {
        return this.f6525d;
    }

    public final int c() {
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.b != 0) {
            this.f6523a = null;
            this.b = 0;
        }
        if (this.f6524c.isEmpty()) {
            return;
        }
        this.f6524c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f6524c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.b) {
            return (ed) this.f6523a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f6524c.isEmpty() ? Collections.EMPTY_SET : this.f6524c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6526e == null) {
            this.f6526e = new gd(this, null);
        }
        return this.f6526e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return super.equals(obj);
        }
        hd hdVar = (hd) obj;
        int size = size();
        if (size != hdVar.size()) {
            return false;
        }
        int i10 = this.b;
        if (i10 != hdVar.b) {
            return entrySet().equals(hdVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(hdVar.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f6524c.equals(hdVar.f6524c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int n10 = n(comparable);
        if (n10 >= 0) {
            return ((ed) this.f6523a[n10]).setValue(obj);
        }
        i();
        if (this.f6523a == null) {
            this.f6523a = new Object[16];
        }
        int i10 = -(n10 + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.b == 16) {
            ed edVar = (ed) this.f6523a[15];
            this.b = 15;
            p().put(edVar.a(), edVar.getValue());
        }
        Object[] objArr = this.f6523a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f6523a[i10] = new ed(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int n10 = n(comparable);
        return n10 >= 0 ? ((ed) this.f6523a[n10]).getValue() : this.f6524c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.f6523a[i12].hashCode();
        }
        return this.f6524c.size() > 0 ? i11 + this.f6524c.hashCode() : i11;
    }

    public final /* synthetic */ Object[] j() {
        return this.f6523a;
    }

    public final /* synthetic */ int k() {
        return this.b;
    }

    public final /* synthetic */ Map l() {
        return this.f6524c;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        i();
        Object value = ((ed) this.f6523a[i10]).getValue();
        Object[] objArr = this.f6523a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.b - i10) - 1);
        this.b--;
        if (!this.f6524c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f6523a;
            int i11 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new ed(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return value;
    }

    public final int n(Comparable comparable) {
        int i10 = this.b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((ed) this.f6523a[i11]).a());
            if (compareTo > 0) {
                return -(i10 + 1);
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((ed) this.f6523a[i13]).a());
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

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i() {
        if (this.f6525d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap p() {
        i();
        if (this.f6524c.isEmpty() && !(this.f6524c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6524c = treeMap;
            this.f6527f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6524c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int n10 = n(comparable);
        if (n10 >= 0) {
            return g(n10);
        }
        if (this.f6524c.isEmpty()) {
            return null;
        }
        return this.f6524c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.f6524c.size();
    }
}
