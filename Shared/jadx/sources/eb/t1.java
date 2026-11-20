package eb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t1 extends e1 {

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f15916e = new t1(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f15917c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15918d;

    public t1(Object[] objArr, int i10) {
        this.f15917c = objArr;
        this.f15918d = i10;
    }

    @Override // eb.e1, eb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f15917c, 0, objArr, 0, this.f15918d);
        return this.f15918d;
    }

    @Override // eb.z0
    public final int b() {
        return this.f15918d;
    }

    @Override // eb.z0
    public final int c() {
        return 0;
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f15917c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f15918d, "index");
        Object obj = this.f15917c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15918d;
    }
}
