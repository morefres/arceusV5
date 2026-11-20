package ie;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class s<K, V> extends c<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final K f20894a;
    public final V b;

    public s(K k10, V v5) {
        this.f20894a = k10;
        this.b = v5;
    }

    @Override // ie.c, java.util.Map.Entry
    public final K getKey() {
        return this.f20894a;
    }

    @Override // ie.c, java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v5) {
        throw new UnsupportedOperationException();
    }
}
