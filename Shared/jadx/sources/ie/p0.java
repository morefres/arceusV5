package ie;

import java.util.Objects;

/* loaded from: classes2.dex */
public class p0<E> extends t<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final t<Object> f20867e = new p0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f20868c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20869d;

    public p0(Object[] objArr, int i10) {
        this.f20868c = objArr;
        this.f20869d = i10;
    }

    @Override // ie.t, ie.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f20868c, 0, objArr, i10, this.f20869d);
        return i10 + this.f20869d;
    }

    @Override // ie.r
    public Object[] c() {
        return this.f20868c;
    }

    @Override // ie.r
    public int d() {
        return this.f20869d;
    }

    @Override // ie.r
    public int e() {
        return 0;
    }

    @Override // ie.r
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        he.n.j(i10, this.f20869d);
        E e10 = (E) this.f20868c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20869d;
    }
}
