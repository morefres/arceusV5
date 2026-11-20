package eb;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f15948c;

    public z1(Object obj) {
        obj.getClass();
        this.f15948c = obj;
    }

    @Override // eb.z0
    public final int a(Object[] objArr, int i10) {
        objArr[0] = this.f15948c;
        return 1;
    }

    @Override // eb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15948c.equals(obj);
    }

    @Override // eb.h1, eb.z0
    public final c2 d() {
        return new n1(this.f15948c);
    }

    @Override // eb.h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15948c.hashCode();
    }

    @Override // eb.h1
    public final e1 i() {
        return e1.k(this.f15948c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new n1(this.f15948c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15948c.toString() + "]";
    }
}
