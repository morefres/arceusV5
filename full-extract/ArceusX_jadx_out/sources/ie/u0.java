package ie;

/* loaded from: classes2.dex */
public final class u0<E> extends w<E> {

    /* renamed from: c, reason: collision with root package name */
    public final transient E f20915c;

    public u0(E e10) {
        this.f20915c = (E) he.n.l(e10);
    }

    @Override // ie.w, ie.r
    public t<E> a() {
        return t.A(this.f20915c);
    }

    @Override // ie.r
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f20915c;
        return i10 + 1;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f20915c.equals(obj);
    }

    @Override // ie.r
    public boolean f() {
        return false;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public y0<E> iterator() {
        return b0.e(this.f20915c);
    }

    @Override // ie.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20915c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f20915c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
