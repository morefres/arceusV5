package db;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f14494e = new k(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f14495c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14496d;

    public k(Object[] objArr, int i10) {
        this.f14495c = objArr;
        this.f14496d = i10;
    }

    @Override // db.d
    public final Object[] a() {
        return this.f14495c;
    }

    @Override // db.d
    public final int b() {
        return 0;
    }

    @Override // db.d
    public final int c() {
        return this.f14496d;
    }

    @Override // db.i, db.d
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f14495c;
        int i11 = this.f14496d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f14496d, "index");
        Object obj = this.f14495c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14496d;
    }
}
