package fb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o1 extends n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f17123e = new o1(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f17124c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f17125d;

    public o1(Object[] objArr, int i10) {
        this.f17124c = objArr;
        this.f17125d = i10;
    }

    @Override // fb.i1
    public final Object[] a() {
        return this.f17124c;
    }

    @Override // fb.i1
    public final int b() {
        return 0;
    }

    @Override // fb.i1
    public final int c() {
        return this.f17125d;
    }

    @Override // fb.n1, fb.i1
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f17124c;
        int i11 = this.f17125d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z0.a(i10, this.f17125d, "index");
        Object obj = this.f17124c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17125d;
    }
}
