package eb;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u1 extends h1 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f15922h;

    /* renamed from: i, reason: collision with root package name */
    public static final u1 f15923i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f15924c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15925d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f15926e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f15927f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f15928g;

    static {
        Object[] objArr = new Object[0];
        f15922h = objArr;
        f15923i = new u1(objArr, 0, objArr, 0, 0);
    }

    public u1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f15924c = objArr;
        this.f15925d = i10;
        this.f15926e = objArr2;
        this.f15927f = i11;
        this.f15928g = i12;
    }

    @Override // eb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f15924c, 0, objArr, 0, this.f15928g);
        return this.f15928g;
    }

    @Override // eb.z0
    public final int b() {
        return this.f15928g;
    }

    @Override // eb.z0
    public final int c() {
        return 0;
    }

    @Override // eb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15926e;
            if (objArr.length != 0) {
                int a10 = y0.a(obj.hashCode());
                while (true) {
                    int i10 = a10 & this.f15927f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // eb.h1, eb.z0
    public final c2 d() {
        return i().listIterator(0);
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f15924c;
    }

    @Override // eb.h1
    public final boolean g() {
        return true;
    }

    @Override // eb.h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15925d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // eb.h1
    public final e1 k() {
        return e1.h(this.f15924c, this.f15928g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15928g;
    }
}
