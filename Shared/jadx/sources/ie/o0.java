package ie;

import ie.q0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0<K, V> extends q<K, V> {

    /* renamed from: j, reason: collision with root package name */
    public static final o0<Object, Object> f20861j = new o0<>();

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f20862e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f20863f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f20864g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f20865h;

    /* renamed from: i, reason: collision with root package name */
    public final transient o0<V, K> f20866i;

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this.f20862e = null;
        this.f20863f = new Object[0];
        this.f20864g = 0;
        this.f20865h = 0;
        this.f20866i = this;
    }

    @Override // ie.u
    public w<Map.Entry<K, V>> d() {
        return new q0.a(this, this.f20863f, this.f20864g, this.f20865h);
    }

    @Override // ie.u
    public w<K> e() {
        return new q0.b(this, new q0.c(this.f20863f, this.f20864g, this.f20865h));
    }

    @Override // ie.u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) q0.u(this.f20862e, this.f20863f, this.f20865h, this.f20864g, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // ie.q
    public q<V, K> r() {
        return this.f20866i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f20865h;
    }

    public o0(Object[] objArr, int i10) {
        this.f20863f = objArr;
        this.f20865h = i10;
        this.f20864g = 0;
        int h10 = i10 >= 2 ? w.h(i10) : 0;
        this.f20862e = q0.t(objArr, i10, h10, 0);
        this.f20866i = new o0<>(q0.t(objArr, i10, h10, 1), objArr, i10, this);
    }

    public o0(Object obj, Object[] objArr, int i10, o0<V, K> o0Var) {
        this.f20862e = obj;
        this.f20863f = objArr;
        this.f20864g = 1;
        this.f20865h = i10;
        this.f20866i = o0Var;
    }
}
